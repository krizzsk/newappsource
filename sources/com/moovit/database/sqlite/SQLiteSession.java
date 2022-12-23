package com.moovit.database.sqlite;

import android.annotation.SuppressLint;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.ParcelFileDescriptor;
import com.moovit.database.CursorWindow;
import p177n1.C5802d;

@SuppressLint({"Assert"})
public final class SQLiteSession {
    private SQLiteConnection mConnection;
    private int mConnectionFlags;
    private final SQLiteConnectionPool mConnectionPool;
    private int mConnectionUseCount;
    private Transaction mTransactionPool;
    private Transaction mTransactionStack;

    public static final class Transaction {
        public boolean mChildFailed;
        public SQLiteTransactionListener mListener;
        public boolean mMarkedSuccessful;
        public int mMode;
        public Transaction mParent;

        private Transaction() {
        }
    }

    public SQLiteSession(SQLiteConnectionPool sQLiteConnectionPool) {
        if (sQLiteConnectionPool != null) {
            this.mConnectionPool = sQLiteConnectionPool;
            return;
        }
        throw new IllegalArgumentException("connectionPool must not be null");
    }

    private void acquireConnection(String str, int i, C5802d dVar) {
        if (this.mConnection == null) {
            this.mConnection = this.mConnectionPool.acquireConnection(str, i, dVar);
            this.mConnectionFlags = i;
        }
        this.mConnectionUseCount++;
    }

    private void beginTransactionUnchecked(int i, SQLiteTransactionListener sQLiteTransactionListener, int i2, C5802d dVar) {
        if (dVar != null) {
            dVar.mo21673c();
        }
        if (this.mTransactionStack == null) {
            acquireConnection((String) null, i2, dVar);
        }
        try {
            if (this.mTransactionStack == null) {
                if (i == 1) {
                    this.mConnection.execute("BEGIN IMMEDIATE;", (Object[]) null, dVar);
                } else if (i != 2) {
                    this.mConnection.execute("BEGIN;", (Object[]) null, dVar);
                } else {
                    this.mConnection.execute("BEGIN EXCLUSIVE;", (Object[]) null, dVar);
                }
            }
            if (sQLiteTransactionListener != null) {
                sQLiteTransactionListener.onBegin();
            }
            Transaction obtainTransaction = obtainTransaction(i, sQLiteTransactionListener);
            obtainTransaction.mParent = this.mTransactionStack;
            this.mTransactionStack = obtainTransaction;
        } catch (RuntimeException e) {
            if (this.mTransactionStack == null) {
                this.mConnection.execute("ROLLBACK;", (Object[]) null, dVar);
            }
            throw e;
        } catch (Throwable th) {
            if (this.mTransactionStack == null) {
                releaseConnection();
            }
            throw th;
        }
    }

    private void endTransactionUnchecked(C5802d dVar, boolean z) {
        boolean z2;
        RuntimeException e;
        if (dVar != null) {
            dVar.mo21673c();
        }
        Transaction transaction = this.mTransactionStack;
        boolean z3 = false;
        if ((transaction.mMarkedSuccessful || z) && !transaction.mChildFailed) {
            z2 = true;
        } else {
            z2 = false;
        }
        SQLiteTransactionListener sQLiteTransactionListener = transaction.mListener;
        if (sQLiteTransactionListener != null) {
            if (z2) {
                try {
                    sQLiteTransactionListener.onCommit();
                } catch (RuntimeException e2) {
                    e = e2;
                }
            } else {
                sQLiteTransactionListener.onRollback();
            }
        }
        z3 = z2;
        e = null;
        this.mTransactionStack = transaction.mParent;
        recycleTransaction(transaction);
        Transaction transaction2 = this.mTransactionStack;
        if (transaction2 == null) {
            if (z3) {
                try {
                    this.mConnection.execute("COMMIT;", (Object[]) null, dVar);
                } catch (Throwable th) {
                    releaseConnection();
                    throw th;
                }
            } else {
                this.mConnection.execute("ROLLBACK;", (Object[]) null, dVar);
            }
            releaseConnection();
        } else if (!z3) {
            transaction2.mChildFailed = true;
        }
        if (e != null) {
            throw e;
        }
    }

    private boolean executeSpecial(String str, Object[] objArr, int i, C5802d dVar) {
        if (dVar != null) {
            dVar.mo21673c();
        }
        int sqlStatementType = SQLiteStatementType.getSqlStatementType(str);
        if (sqlStatementType == 4) {
            beginTransaction(2, (SQLiteTransactionListener) null, i, dVar);
            return true;
        } else if (sqlStatementType == 5) {
            setTransactionSuccessful();
            endTransaction(dVar);
            return true;
        } else if (sqlStatementType != 6) {
            return false;
        } else {
            endTransaction(dVar);
            return true;
        }
    }

    private Transaction obtainTransaction(int i, SQLiteTransactionListener sQLiteTransactionListener) {
        Transaction transaction = this.mTransactionPool;
        if (transaction != null) {
            this.mTransactionPool = transaction.mParent;
            transaction.mParent = null;
            transaction.mMarkedSuccessful = false;
            transaction.mChildFailed = false;
        } else {
            transaction = new Transaction();
        }
        transaction.mMode = i;
        transaction.mListener = sQLiteTransactionListener;
        return transaction;
    }

    private void recycleTransaction(Transaction transaction) {
        transaction.mParent = this.mTransactionPool;
        transaction.mListener = null;
        this.mTransactionPool = transaction;
    }

    private void releaseConnection() {
        int i = this.mConnectionUseCount - 1;
        this.mConnectionUseCount = i;
        if (i == 0) {
            try {
                this.mConnectionPool.releaseConnection(this.mConnection);
            } finally {
                this.mConnection = null;
            }
        }
    }

    private void throwIfNestedTransaction() {
        if (hasNestedTransaction()) {
            throw new IllegalStateException("Cannot perform this operation because a nested transaction is in progress.");
        }
    }

    private void throwIfNoTransaction() {
        if (this.mTransactionStack == null) {
            throw new IllegalStateException("Cannot perform this operation because there is no current transaction.");
        }
    }

    private void throwIfTransactionMarkedSuccessful() {
        Transaction transaction = this.mTransactionStack;
        if (transaction != null && transaction.mMarkedSuccessful) {
            throw new IllegalStateException("Cannot perform this operation because the transaction has already been marked successful.  The only thing you can do now is call endTransaction().");
        }
    }

    private boolean yieldTransactionUnchecked(long j, C5802d dVar) {
        if (dVar != null) {
            dVar.mo21673c();
        }
        if (!this.mConnectionPool.shouldYieldConnection(this.mConnection, this.mConnectionFlags)) {
            return false;
        }
        Transaction transaction = this.mTransactionStack;
        int i = transaction.mMode;
        SQLiteTransactionListener sQLiteTransactionListener = transaction.mListener;
        int i2 = this.mConnectionFlags;
        endTransactionUnchecked(dVar, true);
        if (j > 0) {
            try {
                Thread.sleep(j);
            } catch (InterruptedException unused) {
            }
        }
        beginTransactionUnchecked(i, sQLiteTransactionListener, i2, dVar);
        return true;
    }

    public void beginTransaction(int i, SQLiteTransactionListener sQLiteTransactionListener, int i2, C5802d dVar) {
        throwIfTransactionMarkedSuccessful();
        beginTransactionUnchecked(i, sQLiteTransactionListener, i2, dVar);
    }

    public void endTransaction(C5802d dVar) {
        throwIfNoTransaction();
        endTransactionUnchecked(dVar, false);
    }

    public void execute(String str, Object[] objArr, int i, C5802d dVar) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        } else if (!executeSpecial(str, objArr, i, dVar)) {
            acquireConnection(str, i, dVar);
            try {
                this.mConnection.execute(str, objArr, dVar);
            } finally {
                releaseConnection();
            }
        }
    }

    public ParcelFileDescriptor executeForBlobFileDescriptor(String str, Object[] objArr, int i, C5802d dVar) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        } else if (executeSpecial(str, objArr, i, dVar)) {
            return null;
        } else {
            acquireConnection(str, i, dVar);
            try {
                return this.mConnection.executeForBlobFileDescriptor(str, objArr, dVar);
            } finally {
                releaseConnection();
            }
        }
    }

    public int executeForChangedRowCount(String str, Object[] objArr, int i, C5802d dVar) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        } else if (executeSpecial(str, objArr, i, dVar)) {
            return 0;
        } else {
            acquireConnection(str, i, dVar);
            try {
                return this.mConnection.executeForChangedRowCount(str, objArr, dVar);
            } finally {
                releaseConnection();
            }
        }
    }

    public int executeForCursorWindow(String str, Object[] objArr, CursorWindow cursorWindow, int i, int i2, boolean z, int i3, C5802d dVar) {
        int i4 = i3;
        C5802d dVar2 = dVar;
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        } else if (cursorWindow != null) {
            Object[] objArr2 = objArr;
            if (executeSpecial(str, objArr, i4, dVar2)) {
                cursorWindow.clear();
                return 0;
            }
            acquireConnection(str, i4, dVar2);
            try {
                return this.mConnection.executeForCursorWindow(str, objArr, cursorWindow, i, i2, z, dVar);
            } finally {
                releaseConnection();
            }
        } else {
            throw new IllegalArgumentException("window must not be null.");
        }
    }

    public long executeForLastInsertedRowId(String str, Object[] objArr, int i, C5802d dVar) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        } else if (executeSpecial(str, objArr, i, dVar)) {
            return 0;
        } else {
            acquireConnection(str, i, dVar);
            try {
                return this.mConnection.executeForLastInsertedRowId(str, objArr, dVar);
            } finally {
                releaseConnection();
            }
        }
    }

    public long executeForLong(String str, Object[] objArr, int i, C5802d dVar) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        } else if (executeSpecial(str, objArr, i, dVar)) {
            return 0;
        } else {
            acquireConnection(str, i, dVar);
            try {
                return this.mConnection.executeForLong(str, objArr, dVar);
            } finally {
                releaseConnection();
            }
        }
    }

    public String executeForString(String str, Object[] objArr, int i, C5802d dVar) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        } else if (executeSpecial(str, objArr, i, dVar)) {
            return null;
        } else {
            acquireConnection(str, i, dVar);
            try {
                return this.mConnection.executeForString(str, objArr, dVar);
            } finally {
                releaseConnection();
            }
        }
    }

    public boolean hasConnection() {
        return this.mConnection != null;
    }

    public boolean hasNestedTransaction() {
        Transaction transaction = this.mTransactionStack;
        return (transaction == null || transaction.mParent == null) ? false : true;
    }

    public boolean hasTransaction() {
        return this.mTransactionStack != null;
    }

    public void prepare(String str, int i, C5802d dVar, SQLiteStatementInfo sQLiteStatementInfo) {
        if (str != null) {
            if (dVar != null) {
                dVar.mo21673c();
            }
            acquireConnection(str, i, dVar);
            try {
                this.mConnection.prepare(str, sQLiteStatementInfo);
            } finally {
                releaseConnection();
            }
        } else {
            throw new IllegalArgumentException("sql must not be null.");
        }
    }

    public void setTransactionSuccessful() {
        throwIfNoTransaction();
        throwIfTransactionMarkedSuccessful();
        this.mTransactionStack.mMarkedSuccessful = true;
    }

    public boolean yieldTransaction(long j, boolean z, C5802d dVar) {
        if (z) {
            throwIfNoTransaction();
            throwIfTransactionMarkedSuccessful();
            throwIfNestedTransaction();
        } else {
            Transaction transaction = this.mTransactionStack;
            if (transaction == null || transaction.mMarkedSuccessful || transaction.mParent != null) {
                return false;
            }
        }
        if (this.mTransactionStack.mChildFailed) {
            return false;
        }
        return yieldTransactionUnchecked(j, dVar);
    }
}
