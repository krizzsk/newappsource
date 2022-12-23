package com.moovit.database.sqlite;

import android.annotation.SuppressLint;
import android.os.SystemClock;
import android.util.Printer;
import androidx.core.p017os.OperationCanceledException;
import com.moovit.database.sqlite.SQLiteDebug;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.LockSupport;
import p177n1.C5802d;

public final class SQLiteConnectionPool implements Closeable {
    private final WeakHashMap<SQLiteConnection, AcquiredConnectionStatus> mAcquiredConnections = new WeakHashMap<>();
    private final ArrayList<SQLiteConnection> mAvailableNonPrimaryConnections = new ArrayList<>();
    private SQLiteConnection mAvailablePrimaryConnection;
    private final CloseGuard mCloseGuard = CloseGuard.get();
    private final SQLiteDatabaseConfiguration mConfiguration;
    private final AtomicBoolean mConnectionLeaked = new AtomicBoolean();
    private ConnectionWaiter mConnectionWaiterPool;
    private ConnectionWaiter mConnectionWaiterQueue;
    private boolean mIsOpen;
    /* access modifiers changed from: private */
    public final Object mLock = new Object();
    private int mMaxConnectionPoolSize;
    private int mNextConnectionId;

    public enum AcquiredConnectionStatus {
        NORMAL,
        RECONFIGURE,
        DISCARD
    }

    public static final class ConnectionWaiter {
        public SQLiteConnection mAssignedConnection;
        public int mConnectionFlags;
        public RuntimeException mException;
        public ConnectionWaiter mNext;
        public int mNonce;
        public int mPriority;
        public String mSql;
        public long mStartTime;
        public Thread mThread;
        public boolean mWantPrimaryConnection;

        private ConnectionWaiter() {
        }
    }

    static {
        Class<SQLiteConnectionPool> cls = SQLiteConnectionPool.class;
    }

    private SQLiteConnectionPool(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        this.mConfiguration = new SQLiteDatabaseConfiguration(sQLiteDatabaseConfiguration);
        setMaxConnectionPoolSizeLocked();
    }

    /* access modifiers changed from: private */
    public void cancelConnectionWaiterLocked(ConnectionWaiter connectionWaiter) {
        ConnectionWaiter connectionWaiter2;
        if (connectionWaiter.mAssignedConnection == null && connectionWaiter.mException == null) {
            ConnectionWaiter connectionWaiter3 = null;
            ConnectionWaiter connectionWaiter4 = this.mConnectionWaiterQueue;
            while (true) {
                ConnectionWaiter connectionWaiter5 = connectionWaiter4;
                connectionWaiter2 = connectionWaiter3;
                connectionWaiter3 = connectionWaiter5;
                if (connectionWaiter3 == connectionWaiter) {
                    break;
                }
                connectionWaiter4 = connectionWaiter3.mNext;
            }
            if (connectionWaiter2 != null) {
                connectionWaiter2.mNext = connectionWaiter.mNext;
            } else {
                this.mConnectionWaiterQueue = connectionWaiter.mNext;
            }
            connectionWaiter.mException = new OperationCanceledException();
            LockSupport.unpark(connectionWaiter.mThread);
            wakeConnectionWaitersLocked();
        }
    }

    private void closeAvailableConnectionsAndLogExceptionsLocked() {
        closeAvailableNonPrimaryConnectionsAndLogExceptionsLocked();
        SQLiteConnection sQLiteConnection = this.mAvailablePrimaryConnection;
        if (sQLiteConnection != null) {
            closeConnectionAndLogExceptionsLocked(sQLiteConnection);
            this.mAvailablePrimaryConnection = null;
        }
    }

    private void closeAvailableNonPrimaryConnectionsAndLogExceptionsLocked() {
        Iterator<SQLiteConnection> it = this.mAvailableNonPrimaryConnections.iterator();
        while (it.hasNext()) {
            closeConnectionAndLogExceptionsLocked(it.next());
        }
        this.mAvailableNonPrimaryConnections.clear();
    }

    private void closeConnectionAndLogExceptionsLocked(SQLiteConnection sQLiteConnection) {
        try {
            sQLiteConnection.close();
        } catch (RuntimeException unused) {
            Objects.toString(sQLiteConnection);
        }
    }

    private void closeExcessConnectionsAndLogExceptionsLocked() {
        int size = this.mAvailableNonPrimaryConnections.size();
        while (true) {
            int i = size - 1;
            if (size > this.mMaxConnectionPoolSize - 1) {
                closeConnectionAndLogExceptionsLocked(this.mAvailableNonPrimaryConnections.remove(i));
                size = i;
            } else {
                return;
            }
        }
    }

    private void discardAcquiredConnectionsLocked() {
        markAcquiredConnectionsLocked(AcquiredConnectionStatus.DISCARD);
    }

    private void dispose(boolean z) {
        CloseGuard closeGuard = this.mCloseGuard;
        if (closeGuard != null) {
            if (z) {
                closeGuard.warnIfOpen();
            }
            this.mCloseGuard.close();
        }
        if (!z) {
            synchronized (this.mLock) {
                throwIfClosedLocked();
                this.mIsOpen = false;
                closeAvailableConnectionsAndLogExceptionsLocked();
                if (this.mAcquiredConnections.size() != 0) {
                    String str = this.mConfiguration.label;
                }
                wakeConnectionWaitersLocked();
            }
        }
    }

    private void finishAcquireConnectionLocked(SQLiteConnection sQLiteConnection, int i) {
        boolean z = true;
        if ((i & 1) == 0) {
            z = false;
        }
        try {
            sQLiteConnection.setOnlyAllowReadOnlyOperations(z);
            this.mAcquiredConnections.put(sQLiteConnection, AcquiredConnectionStatus.NORMAL);
        } catch (RuntimeException e) {
            Objects.toString(sQLiteConnection);
            closeConnectionAndLogExceptionsLocked(sQLiteConnection);
            throw e;
        }
    }

    private static int getPriority(int i) {
        return (i & 4) != 0 ? 1 : 0;
    }

    private boolean isSessionBlockingImportantConnectionWaitersLocked(boolean z, int i) {
        ConnectionWaiter connectionWaiter = this.mConnectionWaiterQueue;
        if (connectionWaiter == null) {
            return false;
        }
        int priority = getPriority(i);
        while (priority <= connectionWaiter.mPriority) {
            if (z || !connectionWaiter.mWantPrimaryConnection) {
                return true;
            }
            connectionWaiter = connectionWaiter.mNext;
            if (connectionWaiter == null) {
                return false;
            }
        }
        return false;
    }

    private void logConnectionPoolBusyLocked(long j, int i) {
        Thread currentThread = Thread.currentThread();
        String str = this.mConfiguration.label;
        currentThread.getId();
        currentThread.getName();
        Integer.toHexString(i);
        ArrayList arrayList = new ArrayList();
        if (!this.mAcquiredConnections.isEmpty()) {
            for (SQLiteConnection describeCurrentOperationUnsafe : this.mAcquiredConnections.keySet()) {
                String describeCurrentOperationUnsafe2 = describeCurrentOperationUnsafe.describeCurrentOperationUnsafe();
                if (describeCurrentOperationUnsafe2 != null) {
                    arrayList.add(describeCurrentOperationUnsafe2);
                }
            }
        }
        this.mAvailableNonPrimaryConnections.size();
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
            }
        }
    }

    private void markAcquiredConnectionsLocked(AcquiredConnectionStatus acquiredConnectionStatus) {
        if (!this.mAcquiredConnections.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.mAcquiredConnections.size());
            for (Map.Entry next : this.mAcquiredConnections.entrySet()) {
                AcquiredConnectionStatus acquiredConnectionStatus2 = (AcquiredConnectionStatus) next.getValue();
                if (!(acquiredConnectionStatus == acquiredConnectionStatus2 || acquiredConnectionStatus2 == AcquiredConnectionStatus.DISCARD)) {
                    arrayList.add((SQLiteConnection) next.getKey());
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.mAcquiredConnections.put((SQLiteConnection) it.next(), acquiredConnectionStatus);
            }
        }
    }

    private ConnectionWaiter obtainConnectionWaiterLocked(Thread thread, long j, int i, boolean z, String str, int i2) {
        ConnectionWaiter connectionWaiter = this.mConnectionWaiterPool;
        if (connectionWaiter != null) {
            this.mConnectionWaiterPool = connectionWaiter.mNext;
            connectionWaiter.mNext = null;
        } else {
            connectionWaiter = new ConnectionWaiter();
        }
        connectionWaiter.mThread = thread;
        connectionWaiter.mStartTime = j;
        connectionWaiter.mPriority = i;
        connectionWaiter.mWantPrimaryConnection = z;
        connectionWaiter.mSql = str;
        connectionWaiter.mConnectionFlags = i2;
        return connectionWaiter;
    }

    public static SQLiteConnectionPool open(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        if (sQLiteDatabaseConfiguration != null) {
            SQLiteConnectionPool sQLiteConnectionPool = new SQLiteConnectionPool(sQLiteDatabaseConfiguration);
            sQLiteConnectionPool.open();
            return sQLiteConnectionPool;
        }
        throw new IllegalArgumentException("configuration must not be null.");
    }

    private SQLiteConnection openConnectionLocked(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, boolean z) {
        int i = this.mNextConnectionId;
        this.mNextConnectionId = i + 1;
        return SQLiteConnection.open(this, sQLiteDatabaseConfiguration, i, z);
    }

    private void reconfigureAllConnectionsLocked() {
        SQLiteConnection sQLiteConnection = this.mAvailablePrimaryConnection;
        if (sQLiteConnection != null) {
            try {
                sQLiteConnection.reconfigure(this.mConfiguration);
            } catch (RuntimeException unused) {
                Objects.toString(this.mAvailablePrimaryConnection);
                closeConnectionAndLogExceptionsLocked(this.mAvailablePrimaryConnection);
                this.mAvailablePrimaryConnection = null;
            }
        }
        int size = this.mAvailableNonPrimaryConnections.size();
        int i = 0;
        while (i < size) {
            SQLiteConnection sQLiteConnection2 = this.mAvailableNonPrimaryConnections.get(i);
            try {
                sQLiteConnection2.reconfigure(this.mConfiguration);
            } catch (RuntimeException unused2) {
                Objects.toString(sQLiteConnection2);
                closeConnectionAndLogExceptionsLocked(sQLiteConnection2);
                this.mAvailableNonPrimaryConnections.remove(i);
                size--;
                i--;
            }
            i++;
        }
        markAcquiredConnectionsLocked(AcquiredConnectionStatus.RECONFIGURE);
    }

    private boolean recycleConnectionLocked(SQLiteConnection sQLiteConnection, AcquiredConnectionStatus acquiredConnectionStatus) {
        if (acquiredConnectionStatus == AcquiredConnectionStatus.RECONFIGURE) {
            try {
                sQLiteConnection.reconfigure(this.mConfiguration);
            } catch (RuntimeException unused) {
                Objects.toString(sQLiteConnection);
                acquiredConnectionStatus = AcquiredConnectionStatus.DISCARD;
            }
        }
        if (acquiredConnectionStatus != AcquiredConnectionStatus.DISCARD) {
            return true;
        }
        closeConnectionAndLogExceptionsLocked(sQLiteConnection);
        return false;
    }

    private void recycleConnectionWaiterLocked(ConnectionWaiter connectionWaiter) {
        connectionWaiter.mNext = this.mConnectionWaiterPool;
        connectionWaiter.mThread = null;
        connectionWaiter.mSql = null;
        connectionWaiter.mAssignedConnection = null;
        connectionWaiter.mException = null;
        connectionWaiter.mNonce++;
        this.mConnectionWaiterPool = connectionWaiter;
    }

    private void setMaxConnectionPoolSizeLocked() {
        if (SQLiteDatabase.hasCodec() || (this.mConfiguration.openFlags & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) == 0) {
            this.mMaxConnectionPoolSize = 1;
        } else {
            this.mMaxConnectionPoolSize = SQLiteGlobal.getWALConnectionPoolSize();
        }
    }

    private void throwIfClosedLocked() {
        if (!this.mIsOpen) {
            throw new IllegalStateException("Cannot perform this operation because the connection pool has been closed.");
        }
    }

    private SQLiteConnection tryAcquireNonPrimaryConnectionLocked(String str, int i) {
        int size = this.mAvailableNonPrimaryConnections.size();
        if (size > 1 && str != null) {
            for (int i2 = 0; i2 < size; i2++) {
                SQLiteConnection sQLiteConnection = this.mAvailableNonPrimaryConnections.get(i2);
                if (sQLiteConnection.isPreparedStatementInCache(str)) {
                    this.mAvailableNonPrimaryConnections.remove(i2);
                    finishAcquireConnectionLocked(sQLiteConnection, i);
                    return sQLiteConnection;
                }
            }
        }
        if (size > 0) {
            SQLiteConnection remove = this.mAvailableNonPrimaryConnections.remove(size - 1);
            finishAcquireConnectionLocked(remove, i);
            return remove;
        }
        int size2 = this.mAcquiredConnections.size();
        if (this.mAvailablePrimaryConnection != null) {
            size2++;
        }
        if (size2 >= this.mMaxConnectionPoolSize) {
            return null;
        }
        SQLiteConnection openConnectionLocked = openConnectionLocked(this.mConfiguration, false);
        finishAcquireConnectionLocked(openConnectionLocked, i);
        return openConnectionLocked;
    }

    private SQLiteConnection tryAcquirePrimaryConnectionLocked(int i) {
        SQLiteConnection sQLiteConnection = this.mAvailablePrimaryConnection;
        if (sQLiteConnection != null) {
            this.mAvailablePrimaryConnection = null;
            finishAcquireConnectionLocked(sQLiteConnection, i);
            return sQLiteConnection;
        }
        for (SQLiteConnection isPrimaryConnection : this.mAcquiredConnections.keySet()) {
            if (isPrimaryConnection.isPrimaryConnection()) {
                return null;
            }
        }
        SQLiteConnection openConnectionLocked = openConnectionLocked(this.mConfiguration, true);
        finishAcquireConnectionLocked(openConnectionLocked, i);
        return openConnectionLocked;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0062, code lost:
        if (r10 == null) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0064, code lost:
        r10.mo21672b(new com.moovit.database.sqlite.SQLiteConnectionPool.C158481(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r2 = r1.mStartTime + 30000;
        r6 = 30000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0078, code lost:
        if (r9.mConnectionLeaked.compareAndSet(true, false) == false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007a, code lost:
        r8 = r9.mLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007c, code lost:
        monitor-enter(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        wakeConnectionWaitersLocked();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0080, code lost:
        monitor-exit(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0085, code lost:
        java.util.concurrent.locks.LockSupport.parkNanos(r9, r6 * 1000000);
        java.lang.Thread.interrupted();
        r6 = r9.mLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0092, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        throwIfClosedLocked();
        r7 = r1.mAssignedConnection;
        r8 = r1.mException;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x009a, code lost:
        if (r7 != null) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x009c, code lost:
        if (r8 == null) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x009f, code lost:
        r7 = android.os.SystemClock.uptimeMillis();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00a5, code lost:
        if (r7 >= r2) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00a7, code lost:
        r7 = r7 - r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00a9, code lost:
        logConnectionPoolBusyLocked(r7 - r1.mStartTime, r0);
        r2 = r7 + 30000;
        r7 = 30000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00b3, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00b4, code lost:
        r6 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00b6, code lost:
        recycleConnectionWaiterLocked(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00b9, code lost:
        if (r7 == null) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00bb, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00bc, code lost:
        if (r10 == null) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00be, code lost:
        r10.mo21672b((p177n1.C5802d.C5803a) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00c1, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00c6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00c7, code lost:
        if (r10 != null) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00c9, code lost:
        r10.mo21672b((p177n1.C5802d.C5803a) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00cc, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.moovit.database.sqlite.SQLiteConnection waitForConnection(java.lang.String r19, int r20, p177n1.C5802d r21) {
        /*
            r18 = this;
            r9 = r18
            r0 = r20
            r10 = r21
            r1 = r0 & 2
            r11 = 1
            r12 = 0
            if (r1 == 0) goto L_0x000e
            r6 = 1
            goto L_0x000f
        L_0x000e:
            r6 = 0
        L_0x000f:
            java.lang.Object r13 = r9.mLock
            monitor-enter(r13)
            r18.throwIfClosedLocked()     // Catch:{ all -> 0x00cd }
            if (r10 == 0) goto L_0x001a
            r21.mo21673c()     // Catch:{ all -> 0x00cd }
        L_0x001a:
            r14 = 0
            if (r6 != 0) goto L_0x0022
            com.moovit.database.sqlite.SQLiteConnection r1 = r18.tryAcquireNonPrimaryConnectionLocked(r19, r20)     // Catch:{ all -> 0x00cd }
            goto L_0x0023
        L_0x0022:
            r1 = r14
        L_0x0023:
            if (r1 != 0) goto L_0x0029
            com.moovit.database.sqlite.SQLiteConnection r1 = r9.tryAcquirePrimaryConnectionLocked(r0)     // Catch:{ all -> 0x00cd }
        L_0x0029:
            if (r1 == 0) goto L_0x002d
            monitor-exit(r13)     // Catch:{ all -> 0x00cd }
            return r1
        L_0x002d:
            int r15 = getPriority(r20)     // Catch:{ all -> 0x00cd }
            long r3 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x00cd }
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00cd }
            r1 = r18
            r5 = r15
            r7 = r19
            r8 = r20
            com.moovit.database.sqlite.SQLiteConnectionPool$ConnectionWaiter r1 = r1.obtainConnectionWaiterLocked(r2, r3, r5, r6, r7, r8)     // Catch:{ all -> 0x00cd }
            com.moovit.database.sqlite.SQLiteConnectionPool$ConnectionWaiter r2 = r9.mConnectionWaiterQueue     // Catch:{ all -> 0x00cd }
            r3 = r14
        L_0x0047:
            if (r2 == 0) goto L_0x0058
            int r4 = r2.mPriority     // Catch:{ all -> 0x00cd }
            if (r15 <= r4) goto L_0x0050
            r1.mNext = r2     // Catch:{ all -> 0x00cd }
            goto L_0x0058
        L_0x0050:
            com.moovit.database.sqlite.SQLiteConnectionPool$ConnectionWaiter r3 = r2.mNext     // Catch:{ all -> 0x00cd }
            r17 = r3
            r3 = r2
            r2 = r17
            goto L_0x0047
        L_0x0058:
            if (r3 == 0) goto L_0x005d
            r3.mNext = r1     // Catch:{ all -> 0x00cd }
            goto L_0x005f
        L_0x005d:
            r9.mConnectionWaiterQueue = r1     // Catch:{ all -> 0x00cd }
        L_0x005f:
            int r2 = r1.mNonce     // Catch:{ all -> 0x00cd }
            monitor-exit(r13)     // Catch:{ all -> 0x00cd }
            if (r10 == 0) goto L_0x006c
            com.moovit.database.sqlite.SQLiteConnectionPool$1 r3 = new com.moovit.database.sqlite.SQLiteConnectionPool$1
            r3.<init>(r1, r2)
            r10.mo21672b(r3)
        L_0x006c:
            long r2 = r1.mStartTime     // Catch:{ all -> 0x00c6 }
            r4 = 30000(0x7530, double:1.4822E-319)
            long r2 = r2 + r4
            r6 = r4
        L_0x0072:
            java.util.concurrent.atomic.AtomicBoolean r8 = r9.mConnectionLeaked     // Catch:{ all -> 0x00c6 }
            boolean r8 = r8.compareAndSet(r11, r12)     // Catch:{ all -> 0x00c6 }
            if (r8 == 0) goto L_0x0085
            java.lang.Object r8 = r9.mLock     // Catch:{ all -> 0x00c6 }
            monitor-enter(r8)     // Catch:{ all -> 0x00c6 }
            r18.wakeConnectionWaitersLocked()     // Catch:{ all -> 0x0082 }
            monitor-exit(r8)     // Catch:{ all -> 0x0082 }
            goto L_0x0085
        L_0x0082:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0082 }
            throw r0     // Catch:{ all -> 0x00c6 }
        L_0x0085:
            r15 = 1000000(0xf4240, double:4.940656E-318)
            long r6 = r6 * r15
            java.util.concurrent.locks.LockSupport.parkNanos(r9, r6)     // Catch:{ all -> 0x00c6 }
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x00c6 }
            java.lang.Object r6 = r9.mLock     // Catch:{ all -> 0x00c6 }
            monitor-enter(r6)     // Catch:{ all -> 0x00c6 }
            r18.throwIfClosedLocked()     // Catch:{ all -> 0x00c3 }
            com.moovit.database.sqlite.SQLiteConnection r7 = r1.mAssignedConnection     // Catch:{ all -> 0x00c3 }
            java.lang.RuntimeException r8 = r1.mException     // Catch:{ all -> 0x00c3 }
            if (r7 != 0) goto L_0x00b6
            if (r8 == 0) goto L_0x009f
            goto L_0x00b6
        L_0x009f:
            long r7 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x00c3 }
            int r13 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r13 >= 0) goto L_0x00a9
            long r7 = r7 - r2
            goto L_0x00b3
        L_0x00a9:
            long r2 = r1.mStartTime     // Catch:{ all -> 0x00c3 }
            long r2 = r7 - r2
            r9.logConnectionPoolBusyLocked(r2, r0)     // Catch:{ all -> 0x00c3 }
            long r7 = r7 + r4
            r2 = r7
            r7 = r4
        L_0x00b3:
            monitor-exit(r6)     // Catch:{ all -> 0x00c3 }
            r6 = r7
            goto L_0x0072
        L_0x00b6:
            r9.recycleConnectionWaiterLocked(r1)     // Catch:{ all -> 0x00c3 }
            if (r7 == 0) goto L_0x00c2
            monitor-exit(r6)     // Catch:{ all -> 0x00c3 }
            if (r10 == 0) goto L_0x00c1
            r10.mo21672b(r14)
        L_0x00c1:
            return r7
        L_0x00c2:
            throw r8     // Catch:{ all -> 0x00c3 }
        L_0x00c3:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00c3 }
            throw r0     // Catch:{ all -> 0x00c6 }
        L_0x00c6:
            r0 = move-exception
            if (r10 == 0) goto L_0x00cc
            r10.mo21672b(r14)
        L_0x00cc:
            throw r0
        L_0x00cd:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x00cd }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.database.sqlite.SQLiteConnectionPool.waitForConnection(java.lang.String, int, n1.d):com.moovit.database.sqlite.SQLiteConnection");
    }

    private void wakeConnectionWaitersLocked() {
        SQLiteConnection sQLiteConnection;
        ConnectionWaiter connectionWaiter = this.mConnectionWaiterQueue;
        ConnectionWaiter connectionWaiter2 = null;
        boolean z = false;
        boolean z2 = false;
        while (connectionWaiter != null) {
            boolean z3 = true;
            if (this.mIsOpen) {
                try {
                    if (connectionWaiter.mWantPrimaryConnection || z) {
                        sQLiteConnection = null;
                    } else {
                        sQLiteConnection = tryAcquireNonPrimaryConnectionLocked(connectionWaiter.mSql, connectionWaiter.mConnectionFlags);
                        if (sQLiteConnection == null) {
                            z = true;
                        }
                    }
                    if (sQLiteConnection == null && !z2 && (sQLiteConnection = tryAcquirePrimaryConnectionLocked(connectionWaiter.mConnectionFlags)) == null) {
                        z2 = true;
                    }
                    if (sQLiteConnection != null) {
                        connectionWaiter.mAssignedConnection = sQLiteConnection;
                    } else if (!z || !z2) {
                        z3 = false;
                    } else {
                        return;
                    }
                } catch (RuntimeException e) {
                    connectionWaiter.mException = e;
                }
            }
            ConnectionWaiter connectionWaiter3 = connectionWaiter.mNext;
            if (z3) {
                if (connectionWaiter2 != null) {
                    connectionWaiter2.mNext = connectionWaiter3;
                } else {
                    this.mConnectionWaiterQueue = connectionWaiter3;
                }
                connectionWaiter.mNext = null;
                LockSupport.unpark(connectionWaiter.mThread);
            } else {
                connectionWaiter2 = connectionWaiter;
            }
            connectionWaiter = connectionWaiter3;
        }
    }

    public SQLiteConnection acquireConnection(String str, int i, C5802d dVar) {
        return waitForConnection(str, i, dVar);
    }

    public void close() {
        dispose(false);
    }

    public void collectDbStats(ArrayList<SQLiteDebug.DbStats> arrayList) {
        synchronized (this.mLock) {
            SQLiteConnection sQLiteConnection = this.mAvailablePrimaryConnection;
            if (sQLiteConnection != null) {
                sQLiteConnection.collectDbStats(arrayList);
            }
            Iterator<SQLiteConnection> it = this.mAvailableNonPrimaryConnections.iterator();
            while (it.hasNext()) {
                it.next().collectDbStats(arrayList);
            }
            for (SQLiteConnection collectDbStatsUnsafe : this.mAcquiredConnections.keySet()) {
                collectDbStatsUnsafe.collectDbStatsUnsafe(arrayList);
            }
        }
    }

    public void dump(Printer printer, boolean z) {
        synchronized (this.mLock) {
            printer.println("Connection pool for " + this.mConfiguration.path + ":");
            StringBuilder sb = new StringBuilder();
            sb.append("  Open: ");
            sb.append(this.mIsOpen);
            printer.println(sb.toString());
            printer.println("  Max connections: " + this.mMaxConnectionPoolSize);
            printer.println("  Available primary connection:");
            SQLiteConnection sQLiteConnection = this.mAvailablePrimaryConnection;
            if (sQLiteConnection != null) {
                sQLiteConnection.dump(printer, z);
            } else {
                printer.println("<none>");
            }
            printer.println("  Available non-primary connections:");
            if (!this.mAvailableNonPrimaryConnections.isEmpty()) {
                Iterator<SQLiteConnection> it = this.mAvailableNonPrimaryConnections.iterator();
                while (it.hasNext()) {
                    it.next().dump(printer, z);
                }
            } else {
                printer.println("<none>");
            }
            printer.println("  Acquired connections:");
            if (!this.mAcquiredConnections.isEmpty()) {
                for (Map.Entry next : this.mAcquiredConnections.entrySet()) {
                    ((SQLiteConnection) next.getKey()).dumpUnsafe(printer, z);
                    printer.println("  Status: " + next.getValue());
                }
            } else {
                printer.println("<none>");
            }
            printer.println("  Connection waiters:");
            if (this.mConnectionWaiterQueue != null) {
                int i = 0;
                long uptimeMillis = SystemClock.uptimeMillis();
                ConnectionWaiter connectionWaiter = this.mConnectionWaiterQueue;
                while (connectionWaiter != null) {
                    printer.println(i + ": waited for " + (((float) (uptimeMillis - connectionWaiter.mStartTime)) * 0.001f) + " ms - thread=" + connectionWaiter.mThread + ", priority=" + connectionWaiter.mPriority + ", sql='" + connectionWaiter.mSql + "'");
                    connectionWaiter = connectionWaiter.mNext;
                    i++;
                }
            } else {
                printer.println("<none>");
            }
        }
    }

    public void enableLocalizedCollators() {
        SQLiteConnection sQLiteConnection;
        synchronized (this.mLock) {
            if (!this.mAcquiredConnections.isEmpty() || (sQLiteConnection = this.mAvailablePrimaryConnection) == null) {
                throw new IllegalStateException("Cannot enable localized collators while database is in use");
            }
            sQLiteConnection.enableLocalizedCollators();
        }
    }

    public void finalize() throws Throwable {
        try {
            dispose(true);
        } finally {
            super.finalize();
        }
    }

    public void onConnectionLeaked() {
        String str = this.mConfiguration.label;
        this.mConnectionLeaked.set(true);
    }

    @SuppressLint({"Assert"})
    public void reconfigure(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        boolean z;
        if (sQLiteDatabaseConfiguration != null) {
            synchronized (this.mLock) {
                throwIfClosedLocked();
                boolean z2 = false;
                if (((sQLiteDatabaseConfiguration.openFlags ^ this.mConfiguration.openFlags) & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (this.mAcquiredConnections.isEmpty()) {
                        closeAvailableNonPrimaryConnectionsAndLogExceptionsLocked();
                    } else {
                        throw new IllegalStateException("Write Ahead Logging (WAL) mode cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first.");
                    }
                }
                if (sQLiteDatabaseConfiguration.foreignKeyConstraintsEnabled != this.mConfiguration.foreignKeyConstraintsEnabled) {
                    z2 = true;
                }
                if (z2) {
                    if (!this.mAcquiredConnections.isEmpty()) {
                        throw new IllegalStateException("Foreign Key Constraints cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first.");
                    }
                }
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = this.mConfiguration;
                if (sQLiteDatabaseConfiguration2.openFlags != sQLiteDatabaseConfiguration.openFlags) {
                    if (z) {
                        closeAvailableConnectionsAndLogExceptionsLocked();
                    }
                    SQLiteConnection openConnectionLocked = openConnectionLocked(sQLiteDatabaseConfiguration, true);
                    closeAvailableConnectionsAndLogExceptionsLocked();
                    discardAcquiredConnectionsLocked();
                    this.mAvailablePrimaryConnection = openConnectionLocked;
                    this.mConfiguration.updateParametersFrom(sQLiteDatabaseConfiguration);
                    setMaxConnectionPoolSizeLocked();
                } else {
                    sQLiteDatabaseConfiguration2.updateParametersFrom(sQLiteDatabaseConfiguration);
                    setMaxConnectionPoolSizeLocked();
                    closeExcessConnectionsAndLogExceptionsLocked();
                    reconfigureAllConnectionsLocked();
                }
                wakeConnectionWaitersLocked();
            }
            return;
        }
        throw new IllegalArgumentException("configuration must not be null.");
    }

    public void releaseConnection(SQLiteConnection sQLiteConnection) {
        synchronized (this.mLock) {
            AcquiredConnectionStatus remove = this.mAcquiredConnections.remove(sQLiteConnection);
            if (remove == null) {
                throw new IllegalStateException("Cannot perform this operation because the specified connection was not acquired from this pool or has already been released.");
            } else if (!this.mIsOpen) {
                closeConnectionAndLogExceptionsLocked(sQLiteConnection);
            } else if (sQLiteConnection.isPrimaryConnection()) {
                if (recycleConnectionLocked(sQLiteConnection, remove)) {
                    this.mAvailablePrimaryConnection = sQLiteConnection;
                }
                wakeConnectionWaitersLocked();
            } else if (this.mAvailableNonPrimaryConnections.size() >= this.mMaxConnectionPoolSize - 1) {
                closeConnectionAndLogExceptionsLocked(sQLiteConnection);
            } else {
                if (recycleConnectionLocked(sQLiteConnection, remove)) {
                    this.mAvailableNonPrimaryConnections.add(sQLiteConnection);
                }
                wakeConnectionWaitersLocked();
            }
        }
    }

    public boolean shouldYieldConnection(SQLiteConnection sQLiteConnection, int i) {
        synchronized (this.mLock) {
            if (!this.mAcquiredConnections.containsKey(sQLiteConnection)) {
                throw new IllegalStateException("Cannot perform this operation because the specified connection was not acquired from this pool or has already been released.");
            } else if (!this.mIsOpen) {
                return false;
            } else {
                boolean isSessionBlockingImportantConnectionWaitersLocked = isSessionBlockingImportantConnectionWaitersLocked(sQLiteConnection.isPrimaryConnection(), i);
                return isSessionBlockingImportantConnectionWaitersLocked;
            }
        }
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("SQLiteConnectionPool: ");
        k.append(this.mConfiguration.path);
        return k.toString();
    }

    private void open() {
        this.mAvailablePrimaryConnection = openConnectionLocked(this.mConfiguration, true);
        this.mIsOpen = true;
        this.mCloseGuard.open("close");
    }
}
