package com.moovit.database.sqlite;

import java.util.Arrays;
import p177n1.C5802d;
import p269u2.C6683d;
import p358af.C13437d;

public abstract class SQLiteProgram extends SQLiteClosable implements C6683d {
    private static final String[] EMPTY_STRING_ARRAY = new String[0];
    private final Object[] mBindArgs;
    private final String[] mColumnNames;
    private final SQLiteDatabase mDatabase;
    private final int mNumParameters;
    private final boolean mReadOnly;
    private final String mSql;

    public SQLiteProgram(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, C5802d dVar) {
        this.mDatabase = sQLiteDatabase;
        String trim = str.trim();
        this.mSql = trim;
        int sqlStatementType = SQLiteStatementType.getSqlStatementType(trim);
        if (sqlStatementType == 4 || sqlStatementType == 5 || sqlStatementType == 6) {
            this.mReadOnly = false;
            this.mColumnNames = EMPTY_STRING_ARRAY;
            this.mNumParameters = 0;
        } else {
            boolean z = sqlStatementType != 1 ? false : true;
            SQLiteStatementInfo sQLiteStatementInfo = new SQLiteStatementInfo();
            sQLiteDatabase.getThreadSession().prepare(trim, sQLiteDatabase.getThreadDefaultConnectionFlags(z), dVar, sQLiteStatementInfo);
            this.mReadOnly = sQLiteStatementInfo.readOnly;
            this.mColumnNames = sQLiteStatementInfo.columnNames;
            this.mNumParameters = sQLiteStatementInfo.numParameters;
        }
        if (objArr == null || objArr.length <= this.mNumParameters) {
            int i = this.mNumParameters;
            if (i != 0) {
                Object[] objArr2 = new Object[i];
                this.mBindArgs = objArr2;
                if (objArr != null) {
                    System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
                    return;
                }
                return;
            }
            this.mBindArgs = null;
            return;
        }
        StringBuilder k = C13555b.m33972k("Too many bind arguments.  ");
        k.append(objArr.length);
        k.append(" arguments were provided but the statement needs ");
        throw new IllegalArgumentException(C13437d.m33707l(k, this.mNumParameters, " arguments."));
    }

    private void bind(int i, Object obj) {
        if (i < 1 || i > this.mNumParameters) {
            throw new IllegalArgumentException(C13437d.m33707l(C25541a.m63887r("Cannot bind argument at index ", i, " because the index is out of range.  The statement has "), this.mNumParameters, " parameters."));
        }
        this.mBindArgs[i - 1] = obj;
    }

    public void bindAllArgsAsStrings(String[] strArr) {
        if (strArr != null) {
            for (int length = strArr.length; length != 0; length--) {
                bindString(length, strArr[length - 1]);
            }
        }
    }

    public void bindBlob(int i, byte[] bArr) {
        if (bArr != null) {
            bind(i, bArr);
            return;
        }
        throw new IllegalArgumentException(C25541a.m63878h("the bind value at index ", i, " is null"));
    }

    public void bindDouble(int i, double d) {
        bind(i, Double.valueOf(d));
    }

    public void bindLong(int i, long j) {
        bind(i, Long.valueOf(j));
    }

    public void bindNull(int i) {
        bind(i, (Object) null);
    }

    public void bindObject(int i, Object obj) {
        if (obj == null) {
            bindNull(i);
        } else if ((obj instanceof Double) || (obj instanceof Float)) {
            bindDouble(i, ((Number) obj).doubleValue());
        } else if (obj instanceof Number) {
            bindLong(i, ((Number) obj).longValue());
        } else if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                bindLong(i, 1);
            } else {
                bindLong(i, 0);
            }
        } else if (obj instanceof byte[]) {
            bindBlob(i, (byte[]) obj);
        } else {
            bindString(i, obj.toString());
        }
    }

    public void bindString(int i, String str) {
        if (str != null) {
            bind(i, str);
            return;
        }
        throw new IllegalArgumentException(C25541a.m63878h("the bind value at index ", i, " is null"));
    }

    public void clearBindings() {
        Object[] objArr = this.mBindArgs;
        if (objArr != null) {
            Arrays.fill(objArr, (Object) null);
        }
    }

    public final Object[] getBindArgs() {
        return this.mBindArgs;
    }

    /* access modifiers changed from: package-private */
    public final String[] getColumnNames() {
        return this.mColumnNames;
    }

    public final int getConnectionFlags() {
        return this.mDatabase.getThreadDefaultConnectionFlags(this.mReadOnly);
    }

    public final SQLiteDatabase getDatabase() {
        return this.mDatabase;
    }

    public final SQLiteSession getSession() {
        return this.mDatabase.getThreadSession();
    }

    /* access modifiers changed from: package-private */
    public final String getSql() {
        return this.mSql;
    }

    public void onAllReferencesReleased() {
        clearBindings();
    }

    public final void onCorruption() {
        this.mDatabase.onCorruption();
    }
}
