package com.moovit.database.sqlite;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.database.sqlite.SQLiteBindOrColumnIndexOutOfRangeException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.util.Printer;
import com.appboy.support.StringUtils;
import com.appboy.support.ValidationUtils;
import com.moovit.database.sqlite.SQLiteDebug;
import com.usebutton.sdk.internal.util.DiskLruCache;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.regex.Pattern;
import p001a0.C0016g;
import p177n1.C5802d;
import p241s0.C6306f;
import p358af.C13437d;

public final class SQLiteConnection implements C5802d.C5803a {
    /* access modifiers changed from: private */
    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    private static final String[] EMPTY_STRING_ARRAY = new String[0];
    private static final Pattern TRIM_SQL_PATTERN = Pattern.compile("[\\s]*\\n+[\\s]*");
    private int mCancellationSignalAttachCount;
    private final CloseGuard mCloseGuard;
    private final SQLiteDatabaseConfiguration mConfiguration;
    private final int mConnectionId;
    private long mConnectionPtr;
    private final boolean mIsPrimaryConnection;
    private final boolean mIsReadOnlyConnection;
    private boolean mOnlyAllowReadOnlyOperations;
    private final SQLiteConnectionPool mPool;
    private final PreparedStatementCache mPreparedStatementCache;
    private PreparedStatement mPreparedStatementPool;
    private final OperationLog mRecentOperations = new OperationLog();

    public static final class Operation {
        @SuppressLint({"SimpleDateFormat"})
        private static final SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        public ArrayList<Object> mBindArgs;
        public int mCookie;
        public long mEndTime;
        public Exception mException;
        public boolean mFinished;
        public String mKind;
        public String mSql;
        public long mStartTime;

        private Operation() {
        }

        /* access modifiers changed from: private */
        public String getFormattedStartTime() {
            return sDateFormat.format(new Date(this.mStartTime));
        }

        private String getStatus() {
            if (!this.mFinished) {
                return "running";
            }
            if (this.mException != null) {
                return "failed";
            }
            return "succeeded";
        }

        public void describe(StringBuilder sb, boolean z) {
            ArrayList<Object> arrayList;
            sb.append(this.mKind);
            if (this.mFinished) {
                sb.append(" took ");
                sb.append(this.mEndTime - this.mStartTime);
                sb.append("ms");
            } else {
                sb.append(" started ");
                sb.append(System.currentTimeMillis() - this.mStartTime);
                sb.append("ms ago");
            }
            sb.append(" - ");
            sb.append(getStatus());
            if (this.mSql != null) {
                sb.append(", sql=\"");
                sb.append(SQLiteConnection.trimSqlForDisplay(this.mSql));
                sb.append("\"");
            }
            if (!(!z || (arrayList = this.mBindArgs) == null || arrayList.size() == 0)) {
                sb.append(", bindArgs=[");
                int size = this.mBindArgs.size();
                for (int i = 0; i < size; i++) {
                    Object obj = this.mBindArgs.get(i);
                    if (i != 0) {
                        sb.append(", ");
                    }
                    if (obj == null) {
                        sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
                    } else if (obj instanceof byte[]) {
                        sb.append("<byte[]>");
                    } else if (obj instanceof String) {
                        sb.append("\"");
                        sb.append((String) obj);
                        sb.append("\"");
                    } else {
                        sb.append(obj);
                    }
                }
                sb.append("]");
            }
            if (this.mException != null) {
                sb.append(", exception=\"");
                sb.append(this.mException.getMessage());
                sb.append("\"");
            }
        }
    }

    public static final class OperationLog {
        private int mGeneration;
        private int mIndex;
        private final Operation[] mOperations;

        private OperationLog() {
            this.mOperations = new Operation[20];
        }

        private boolean endOperationDeferLogLocked(int i) {
            Operation operationLocked = getOperationLocked(i);
            if (operationLocked != null) {
                operationLocked.mEndTime = System.currentTimeMillis();
                operationLocked.mFinished = true;
            }
            return false;
        }

        private Operation getOperationLocked(int i) {
            Operation operation = this.mOperations[i & ValidationUtils.APPBOY_STRING_MAX_LENGTH];
            if (operation.mCookie == i) {
                return operation;
            }
            return null;
        }

        private void logOperationLocked(int i, String str) {
            Operation operationLocked = getOperationLocked(i);
            if (operationLocked != null) {
                StringBuilder sb = new StringBuilder();
                operationLocked.describe(sb, false);
                if (str != null) {
                    sb.append(", ");
                    sb.append(str);
                }
            }
        }

        private int newOperationCookieLocked(int i) {
            int i2 = this.mGeneration;
            this.mGeneration = i2 + 1;
            return i | (i2 << 8);
        }

        public int beginOperation(String str, String str2, Object[] objArr) {
            int newOperationCookieLocked;
            synchronized (this.mOperations) {
                int i = (this.mIndex + 1) % 20;
                Operation operation = this.mOperations[i];
                if (operation == null) {
                    operation = new Operation();
                    this.mOperations[i] = operation;
                } else {
                    operation.mFinished = false;
                    operation.mException = null;
                    ArrayList<Object> arrayList = operation.mBindArgs;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                }
                operation.mStartTime = System.currentTimeMillis();
                operation.mKind = str;
                operation.mSql = str2;
                if (objArr != null) {
                    ArrayList<Object> arrayList2 = operation.mBindArgs;
                    if (arrayList2 == null) {
                        operation.mBindArgs = new ArrayList<>();
                    } else {
                        arrayList2.clear();
                    }
                    for (Object obj : objArr) {
                        if (obj == null || !(obj instanceof byte[])) {
                            operation.mBindArgs.add(obj);
                        } else {
                            operation.mBindArgs.add(SQLiteConnection.EMPTY_BYTE_ARRAY);
                        }
                    }
                }
                newOperationCookieLocked = newOperationCookieLocked(i);
                operation.mCookie = newOperationCookieLocked;
                this.mIndex = i;
            }
            return newOperationCookieLocked;
        }

        public String describeCurrentOperation() {
            synchronized (this.mOperations) {
                Operation operation = this.mOperations[this.mIndex];
                if (operation == null || operation.mFinished) {
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                operation.describe(sb, false);
                String sb2 = sb.toString();
                return sb2;
            }
        }

        public void dump(Printer printer, boolean z) {
            synchronized (this.mOperations) {
                printer.println("  Most recently executed operations:");
                int i = this.mIndex;
                Operation operation = this.mOperations[i];
                if (operation != null) {
                    int i2 = 0;
                    while (true) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("    ");
                        sb.append(i2);
                        sb.append(": [");
                        sb.append(operation.getFormattedStartTime());
                        sb.append("] ");
                        operation.describe(sb, z);
                        printer.println(sb.toString());
                        if (i > 0) {
                            i--;
                        } else {
                            i = 19;
                        }
                        i2++;
                        operation = this.mOperations[i];
                        if (operation != null) {
                            if (i2 >= 20) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    printer.println("    <none>");
                }
            }
        }

        public void endOperation(int i) {
            synchronized (this.mOperations) {
                if (endOperationDeferLogLocked(i)) {
                    logOperationLocked(i, (String) null);
                }
            }
        }

        public boolean endOperationDeferLog(int i) {
            boolean endOperationDeferLogLocked;
            synchronized (this.mOperations) {
                endOperationDeferLogLocked = endOperationDeferLogLocked(i);
            }
            return endOperationDeferLogLocked;
        }

        public void failOperation(int i, Exception exc) {
            synchronized (this.mOperations) {
                Operation operationLocked = getOperationLocked(i);
                if (operationLocked != null) {
                    operationLocked.mException = exc;
                }
            }
        }

        public void logOperation(int i, String str) {
            synchronized (this.mOperations) {
                logOperationLocked(i, str);
            }
        }
    }

    public static final class PreparedStatement {
        public boolean mInCache;
        public boolean mInUse;
        public int mNumParameters;
        public PreparedStatement mPoolNext;
        public boolean mReadOnly;
        public String mSql;
        public long mStatementPtr;
        public int mType;

        private PreparedStatement() {
        }
    }

    public final class PreparedStatementCache extends C6306f<String, PreparedStatement> {
        public PreparedStatementCache(int i) {
            super(i);
        }

        public void dump(Printer printer) {
            printer.println("  Prepared statement cache:");
            Map snapshot = snapshot();
            if (!snapshot.isEmpty()) {
                int i = 0;
                for (Map.Entry entry : snapshot.entrySet()) {
                    PreparedStatement preparedStatement = (PreparedStatement) entry.getValue();
                    if (preparedStatement.mInCache) {
                        StringBuilder r = C25541a.m63887r("    ", i, ": statementPtr=0x");
                        r.append(Long.toHexString(preparedStatement.mStatementPtr));
                        r.append(", numParameters=");
                        r.append(preparedStatement.mNumParameters);
                        r.append(", type=");
                        r.append(preparedStatement.mType);
                        r.append(", readOnly=");
                        r.append(preparedStatement.mReadOnly);
                        r.append(", sql=\"");
                        r.append(SQLiteConnection.trimSqlForDisplay((String) entry.getKey()));
                        r.append("\"");
                        printer.println(r.toString());
                    }
                    i++;
                }
                return;
            }
            printer.println("    <none>");
        }

        public void entryRemoved(boolean z, String str, PreparedStatement preparedStatement, PreparedStatement preparedStatement2) {
            preparedStatement.mInCache = false;
            if (!preparedStatement.mInUse) {
                SQLiteConnection.this.finalizePreparedStatement(preparedStatement);
            }
        }
    }

    private SQLiteConnection(SQLiteConnectionPool sQLiteConnectionPool, SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, int i, boolean z) {
        CloseGuard closeGuard = CloseGuard.get();
        this.mCloseGuard = closeGuard;
        this.mPool = sQLiteConnectionPool;
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = new SQLiteDatabaseConfiguration(sQLiteDatabaseConfiguration);
        this.mConfiguration = sQLiteDatabaseConfiguration2;
        this.mConnectionId = i;
        this.mIsPrimaryConnection = z;
        this.mIsReadOnlyConnection = (sQLiteDatabaseConfiguration.openFlags & 1) == 0 ? false : true;
        this.mPreparedStatementCache = new PreparedStatementCache(sQLiteDatabaseConfiguration2.maxSqlCacheSize);
        closeGuard.open("close");
    }

    private PreparedStatement acquirePreparedStatement(String str) {
        boolean z;
        PreparedStatement preparedStatement = (PreparedStatement) this.mPreparedStatementCache.get(str);
        if (preparedStatement == null) {
            z = false;
        } else if (!preparedStatement.mInUse) {
            return preparedStatement;
        } else {
            z = true;
        }
        long nativePrepareStatement = nativePrepareStatement(this.mConnectionPtr, str);
        try {
            int nativeGetParameterCount = nativeGetParameterCount(this.mConnectionPtr, nativePrepareStatement);
            int sqlStatementType = SQLiteStatementType.getSqlStatementType(str);
            PreparedStatement obtainPreparedStatement = obtainPreparedStatement(str, nativePrepareStatement, nativeGetParameterCount, sqlStatementType, nativeIsReadOnly(this.mConnectionPtr, nativePrepareStatement));
            if (!z && isCacheable(sqlStatementType)) {
                this.mPreparedStatementCache.put(str, obtainPreparedStatement);
                obtainPreparedStatement.mInCache = true;
            }
            obtainPreparedStatement.mInUse = true;
            return obtainPreparedStatement;
        } catch (RuntimeException e) {
            if (preparedStatement == null || !preparedStatement.mInCache) {
                nativeFinalizeStatement(this.mConnectionPtr, nativePrepareStatement);
            }
            throw e;
        }
    }

    private void applyBlockGuardPolicy(PreparedStatement preparedStatement) {
        if (!this.mConfiguration.isInMemoryDb() && SQLiteDebug.DEBUG_SQL_LOG && Looper.myLooper() == Looper.getMainLooper()) {
            boolean z = preparedStatement.mReadOnly;
        }
    }

    private void attachCancellationSignal(C5802d dVar) {
        if (dVar != null) {
            dVar.mo21673c();
            int i = this.mCancellationSignalAttachCount + 1;
            this.mCancellationSignalAttachCount = i;
            if (i == 1) {
                nativeResetCancel(this.mConnectionPtr, true);
                dVar.mo21672b(this);
            }
        }
    }

    private void bindArguments(PreparedStatement preparedStatement, Object[] objArr) {
        int i;
        long j;
        if (objArr != null) {
            i = objArr.length;
        } else {
            i = 0;
        }
        if (i != preparedStatement.mNumParameters) {
            StringBuilder k = C13555b.m33972k("Expected ");
            k.append(preparedStatement.mNumParameters);
            k.append(" bind arguments but ");
            k.append(i);
            k.append(" were provided.");
            throw new SQLiteBindOrColumnIndexOutOfRangeException(k.toString());
        } else if (i != 0) {
            long j2 = preparedStatement.mStatementPtr;
            for (int i2 = 0; i2 < i; i2++) {
                Boolean bool = objArr[i2];
                int typeOfObject = getTypeOfObject(bool);
                if (typeOfObject == 0) {
                    nativeBindNull(this.mConnectionPtr, j2, i2 + 1);
                } else if (typeOfObject == 1) {
                    nativeBindLong(this.mConnectionPtr, j2, i2 + 1, ((Number) bool).longValue());
                } else if (typeOfObject == 2) {
                    nativeBindDouble(this.mConnectionPtr, j2, i2 + 1, ((Number) bool).doubleValue());
                } else if (typeOfObject == 4) {
                    nativeBindBlob(this.mConnectionPtr, j2, i2 + 1, (byte[]) bool);
                } else if (bool instanceof Boolean) {
                    long j3 = this.mConnectionPtr;
                    int i3 = i2 + 1;
                    if (bool.booleanValue()) {
                        j = 1;
                    } else {
                        j = 0;
                    }
                    nativeBindLong(j3, j2, i3, j);
                } else {
                    nativeBindString(this.mConnectionPtr, j2, i2 + 1, bool.toString());
                }
            }
        }
    }

    private static String canonicalizeSyncMode(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case 48:
                if (str.equals("0")) {
                    c = 0;
                    break;
                }
                break;
            case 49:
                if (str.equals(DiskLruCache.VERSION_1)) {
                    c = 1;
                    break;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "OFF";
            case 1:
                return "NORMAL";
            case 2:
                return "FULL";
            default:
                return str;
        }
    }

    @SuppressLint({"Assert"})
    private void detachCancellationSignal(C5802d dVar) {
        if (dVar != null) {
            int i = this.mCancellationSignalAttachCount - 1;
            this.mCancellationSignalAttachCount = i;
            if (i == 0) {
                dVar.mo21672b((C5802d.C5803a) null);
                nativeResetCancel(this.mConnectionPtr, false);
            }
        }
    }

    private void dispose(boolean z) {
        CloseGuard closeGuard = this.mCloseGuard;
        if (closeGuard != null) {
            if (z) {
                closeGuard.warnIfOpen();
            }
            this.mCloseGuard.close();
        }
        if (this.mConnectionPtr != 0) {
            int beginOperation = this.mRecentOperations.beginOperation("close", (String) null, (Object[]) null);
            try {
                this.mPreparedStatementCache.evictAll();
                nativeClose(this.mConnectionPtr);
                this.mConnectionPtr = 0;
            } finally {
                this.mRecentOperations.endOperation(beginOperation);
            }
        }
    }

    /* access modifiers changed from: private */
    public void finalizePreparedStatement(PreparedStatement preparedStatement) {
        nativeFinalizeStatement(this.mConnectionPtr, preparedStatement.mStatementPtr);
        recyclePreparedStatement(preparedStatement);
    }

    private SQLiteDebug.DbStats getMainDbStatsUnsafe(int i, long j, long j2) {
        String str = this.mConfiguration.path;
        if (!this.mIsPrimaryConnection) {
            str = C13437d.m33707l(C0016g.m36t(str, " ("), this.mConnectionId, ")");
        }
        return new SQLiteDebug.DbStats(str, j, j2, i, this.mPreparedStatementCache.hitCount(), this.mPreparedStatementCache.missCount(), this.mPreparedStatementCache.size());
    }

    @TargetApi(11)
    private static int getTypeOfObject(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof byte[]) {
            return 4;
        }
        if ((obj instanceof Float) || (obj instanceof Double)) {
            return 2;
        }
        if ((obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
            return 1;
        }
        return 3;
    }

    public static boolean hasCodec() {
        return nativeHasCodec();
    }

    private static boolean isCacheable(int i) {
        return i == 2 || i == 1;
    }

    private static native void nativeBindBlob(long j, long j2, int i, byte[] bArr);

    private static native void nativeBindDouble(long j, long j2, int i, double d);

    private static native void nativeBindLong(long j, long j2, int i, long j3);

    private static native void nativeBindNull(long j, long j2, int i);

    private static native void nativeBindString(long j, long j2, int i, String str);

    private static native void nativeCancel(long j);

    private static native void nativeClose(long j);

    private static native void nativeExecute(long j, long j2);

    private static native int nativeExecuteForBlobFileDescriptor(long j, long j2);

    private static native int nativeExecuteForChangedRowCount(long j, long j2);

    private static native long nativeExecuteForCursorWindow(long j, long j2, long j3, int i, int i2, boolean z);

    private static native long nativeExecuteForLastInsertedRowId(long j, long j2);

    private static native long nativeExecuteForLong(long j, long j2);

    private static native String nativeExecuteForString(long j, long j2);

    private static native void nativeFinalizeStatement(long j, long j2);

    private static native int nativeGetColumnCount(long j, long j2);

    private static native String nativeGetColumnName(long j, long j2, int i);

    private static native int nativeGetDbLookaside(long j);

    private static native int nativeGetParameterCount(long j, long j2);

    private static native boolean nativeHasCodec();

    private static native boolean nativeIsReadOnly(long j, long j2);

    private static native void nativeLoadExtension(long j, String str, String str2);

    private static native long nativeOpen(String str, int i, String str2, boolean z, boolean z2);

    private static native long nativePrepareStatement(long j, String str);

    private static native void nativeRegisterCustomFunction(long j, SQLiteCustomFunction sQLiteCustomFunction);

    private static native void nativeRegisterFunction(long j, SQLiteFunction sQLiteFunction);

    private static native void nativeRegisterLocalizedCollators(long j, String str);

    private static native void nativeResetCancel(long j, boolean z);

    private static native void nativeResetStatementAndClearBindings(long j, long j2);

    private PreparedStatement obtainPreparedStatement(String str, long j, int i, int i2, boolean z) {
        PreparedStatement preparedStatement = this.mPreparedStatementPool;
        if (preparedStatement != null) {
            this.mPreparedStatementPool = preparedStatement.mPoolNext;
            preparedStatement.mPoolNext = null;
            preparedStatement.mInCache = false;
        } else {
            preparedStatement = new PreparedStatement();
        }
        preparedStatement.mSql = str;
        preparedStatement.mStatementPtr = j;
        preparedStatement.mNumParameters = i;
        preparedStatement.mType = i2;
        preparedStatement.mReadOnly = z;
        return preparedStatement;
    }

    public static SQLiteConnection open(SQLiteConnectionPool sQLiteConnectionPool, SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, int i, boolean z) {
        SQLiteConnection sQLiteConnection = new SQLiteConnection(sQLiteConnectionPool, sQLiteDatabaseConfiguration, i, z);
        try {
            sQLiteConnection.open();
            return sQLiteConnection;
        } catch (SQLiteException e) {
            sQLiteConnection.dispose(false);
            throw e;
        }
    }

    private void recyclePreparedStatement(PreparedStatement preparedStatement) {
        preparedStatement.mSql = null;
        preparedStatement.mPoolNext = this.mPreparedStatementPool;
        this.mPreparedStatementPool = preparedStatement;
    }

    private void releasePreparedStatement(PreparedStatement preparedStatement) {
        preparedStatement.mInUse = false;
        if (preparedStatement.mInCache) {
            try {
                nativeResetStatementAndClearBindings(this.mConnectionPtr, preparedStatement.mStatementPtr);
            } catch (SQLiteException unused) {
                this.mPreparedStatementCache.remove(preparedStatement.mSql);
            }
        } else {
            finalizePreparedStatement(preparedStatement);
        }
    }

    private void setAutoCheckpointInterval() {
        if (!this.mConfiguration.isInMemoryDb() && !this.mIsReadOnlyConnection) {
            long wALAutoCheckpoint = (long) SQLiteGlobal.getWALAutoCheckpoint();
            if (executeForLong("PRAGMA wal_autocheckpoint", (Object[]) null, (C5802d) null) != wALAutoCheckpoint) {
                executeForLong(C0016g.m29l("PRAGMA wal_autocheckpoint=", wALAutoCheckpoint), (Object[]) null, (C5802d) null);
            }
        }
    }

    private void setForeignKeyModeFromConfiguration() {
        long j;
        if (!this.mIsReadOnlyConnection) {
            if (this.mConfiguration.foreignKeyConstraintsEnabled) {
                j = 1;
            } else {
                j = 0;
            }
            if (executeForLong("PRAGMA foreign_keys", (Object[]) null, (C5802d) null) != j) {
                execute(C0016g.m29l("PRAGMA foreign_keys=", j), (Object[]) null, (C5802d) null);
            }
        }
    }

    private void setJournalMode(String str) {
        if (!executeForString("PRAGMA journal_mode", (Object[]) null, (C5802d) null).equalsIgnoreCase(str)) {
            try {
                if (executeForString("PRAGMA journal_mode=" + str, (Object[]) null, (C5802d) null).equalsIgnoreCase(str)) {
                    return;
                }
            } catch (SQLiteException e) {
                if (!(e instanceof SQLiteDatabaseLockedException)) {
                    throw e;
                }
            }
            String str2 = this.mConfiguration.label;
        }
    }

    private void setJournalSizeLimit() {
        if (!this.mConfiguration.isInMemoryDb() && !this.mIsReadOnlyConnection) {
            long journalSizeLimit = (long) SQLiteGlobal.getJournalSizeLimit();
            if (executeForLong("PRAGMA journal_size_limit", (Object[]) null, (C5802d) null) != journalSizeLimit) {
                executeForLong(C0016g.m29l("PRAGMA journal_size_limit=", journalSizeLimit), (Object[]) null, (C5802d) null);
            }
        }
    }

    private void setLocaleFromConfiguration() {
        String locale = this.mConfiguration.locale.toString();
        nativeRegisterLocalizedCollators(this.mConnectionPtr, locale);
        if (!this.mIsReadOnlyConnection) {
            try {
                execute("CREATE TABLE IF NOT EXISTS android_metadata (locale TEXT)", (Object[]) null, (C5802d) null);
                String executeForString = executeForString("SELECT locale FROM android_metadata UNION SELECT NULL ORDER BY locale DESC LIMIT 1", (Object[]) null, (C5802d) null);
                if (executeForString == null || !executeForString.equals(locale)) {
                    execute("BEGIN", (Object[]) null, (C5802d) null);
                    execute("DELETE FROM android_metadata", (Object[]) null, (C5802d) null);
                    execute("INSERT INTO android_metadata (locale) VALUES(?)", new Object[]{locale}, (C5802d) null);
                    execute("REINDEX LOCALIZED", (Object[]) null, (C5802d) null);
                    execute("COMMIT", (Object[]) null, (C5802d) null);
                }
            } catch (RuntimeException unused) {
                throw new SQLiteException(C13715c.m34246l(C13555b.m33972k("Failed to change locale for db '"), this.mConfiguration.label, "' to '", locale, "'."));
            } catch (Throwable th) {
                execute("ROLLBACK", (Object[]) null, (C5802d) null);
                throw th;
            }
        }
    }

    private void setPageSize() {
        if (!this.mConfiguration.isInMemoryDb() && !this.mIsReadOnlyConnection) {
            long defaultPageSize = (long) SQLiteGlobal.getDefaultPageSize();
            if (executeForLong("PRAGMA page_size", (Object[]) null, (C5802d) null) != defaultPageSize) {
                execute(C0016g.m29l("PRAGMA page_size=", defaultPageSize), (Object[]) null, (C5802d) null);
            }
        }
    }

    private void setSyncMode(String str) {
        if (!canonicalizeSyncMode(executeForString("PRAGMA synchronous", (Object[]) null, (C5802d) null)).equalsIgnoreCase(canonicalizeSyncMode(str))) {
            execute("PRAGMA synchronous=" + str, (Object[]) null, (C5802d) null);
        }
    }

    private void setWalModeFromConfiguration() {
        if (!this.mConfiguration.isInMemoryDb() && !this.mIsReadOnlyConnection) {
            if ((this.mConfiguration.openFlags & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0) {
                setJournalMode("WAL");
                setSyncMode(SQLiteGlobal.getWALSyncMode());
                return;
            }
            setJournalMode(SQLiteGlobal.getDefaultJournalMode());
            setSyncMode(SQLiteGlobal.getDefaultSyncMode());
        }
    }

    private void throwIfStatementForbidden(PreparedStatement preparedStatement) {
        if (this.mOnlyAllowReadOnlyOperations && !preparedStatement.mReadOnly) {
            throw new SQLiteException("Cannot execute this statement because it might modify the database but the connection is read-only.");
        }
    }

    /* access modifiers changed from: private */
    public static String trimSqlForDisplay(String str) {
        return TRIM_SQL_PATTERN.matcher(str).replaceAll(" ");
    }

    public void close() {
        dispose(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0081, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c9, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00cc, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043 A[Catch:{ SQLiteException -> 0x00cd, all -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009d A[Catch:{ SQLiteException -> 0x00cd, all -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c8 A[ExcHandler: all (r0v1 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:11:0x0038] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void collectDbStats(java.util.ArrayList<com.moovit.database.sqlite.SQLiteDebug.DbStats> r26) {
        /*
            r25 = this;
            r9 = r25
            r0 = r26
            java.lang.String r10 = "PRAGMA "
            long r1 = r9.mConnectionPtr
            int r2 = nativeGetDbLookaside(r1)
            r11 = 0
            r13 = 0
            java.lang.String r1 = "PRAGMA page_count;"
            long r3 = r9.executeForLong(r1, r13, r13)     // Catch:{ SQLiteException -> 0x001c }
            java.lang.String r1 = "PRAGMA page_size;"
            long r5 = r9.executeForLong(r1, r13, r13)     // Catch:{ SQLiteException -> 0x001d }
            goto L_0x001e
        L_0x001c:
            r3 = r11
        L_0x001d:
            r5 = r11
        L_0x001e:
            r1 = r25
            com.moovit.database.sqlite.SQLiteDebug$DbStats r1 = r1.getMainDbStatsUnsafe(r2, r3, r5)
            r0.add(r1)
            com.moovit.database.CursorWindow r14 = new com.moovit.database.CursorWindow
            java.lang.String r1 = "collectDbStats"
            r14.<init>(r1)
            java.lang.String r2 = "PRAGMA database_list;"
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r1 = r25
            r4 = r14
            r1.executeForCursorWindow(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x00cd, all -> 0x00c8 }
            r1 = 1
            r2 = 1
        L_0x003d:
            int r3 = r14.getNumRows()     // Catch:{ SQLiteException -> 0x00cd, all -> 0x00c8 }
            if (r2 >= r3) goto L_0x00cd
            java.lang.String r3 = r14.getString(r2, r1)     // Catch:{ SQLiteException -> 0x00cd, all -> 0x00c8 }
            r4 = 2
            java.lang.String r4 = r14.getString(r2, r4)     // Catch:{ SQLiteException -> 0x00cd, all -> 0x00c8 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0081, all -> 0x00c8 }
            r5.<init>()     // Catch:{ SQLiteException -> 0x0081, all -> 0x00c8 }
            r5.append(r10)     // Catch:{ SQLiteException -> 0x0081, all -> 0x00c8 }
            r5.append(r3)     // Catch:{ SQLiteException -> 0x0081, all -> 0x00c8 }
            java.lang.String r6 = ".page_count;"
            r5.append(r6)     // Catch:{ SQLiteException -> 0x0081, all -> 0x00c8 }
            java.lang.String r5 = r5.toString()     // Catch:{ SQLiteException -> 0x0081, all -> 0x00c8 }
            long r5 = r9.executeForLong(r5, r13, r13)     // Catch:{ SQLiteException -> 0x0081, all -> 0x00c8 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0082, all -> 0x00c8 }
            r7.<init>()     // Catch:{ SQLiteException -> 0x0082, all -> 0x00c8 }
            r7.append(r10)     // Catch:{ SQLiteException -> 0x0082, all -> 0x00c8 }
            r7.append(r3)     // Catch:{ SQLiteException -> 0x0082, all -> 0x00c8 }
            java.lang.String r8 = ".page_size;"
            r7.append(r8)     // Catch:{ SQLiteException -> 0x0082, all -> 0x00c8 }
            java.lang.String r7 = r7.toString()     // Catch:{ SQLiteException -> 0x0082, all -> 0x00c8 }
            long r7 = r9.executeForLong(r7, r13, r13)     // Catch:{ SQLiteException -> 0x0082, all -> 0x00c8 }
            r17 = r5
            r19 = r7
            goto L_0x0086
        L_0x0081:
            r5 = r11
        L_0x0082:
            r17 = r5
            r19 = r11
        L_0x0086:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00cd, all -> 0x00c8 }
            r5.<init>()     // Catch:{ SQLiteException -> 0x00cd, all -> 0x00c8 }
            java.lang.String r6 = "  (attached) "
            r5.append(r6)     // Catch:{ SQLiteException -> 0x00cd, all -> 0x00c8 }
            r5.append(r3)     // Catch:{ SQLiteException -> 0x00cd, all -> 0x00c8 }
            java.lang.String r3 = r5.toString()     // Catch:{ SQLiteException -> 0x00cd, all -> 0x00c8 }
            boolean r5 = r4.isEmpty()     // Catch:{ SQLiteException -> 0x00cd, all -> 0x00c8 }
            if (r5 != 0) goto L_0x00b1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00cd, all -> 0x00c8 }
            r5.<init>()     // Catch:{ SQLiteException -> 0x00cd, all -> 0x00c8 }
            r5.append(r3)     // Catch:{ SQLiteException -> 0x00cd, all -> 0x00c8 }
            java.lang.String r3 = ": "
            r5.append(r3)     // Catch:{ SQLiteException -> 0x00cd, all -> 0x00c8 }
            r5.append(r4)     // Catch:{ SQLiteException -> 0x00cd, all -> 0x00c8 }
            java.lang.String r3 = r5.toString()     // Catch:{ SQLiteException -> 0x00cd, all -> 0x00c8 }
        L_0x00b1:
            r16 = r3
            com.moovit.database.sqlite.SQLiteDebug$DbStats r3 = new com.moovit.database.sqlite.SQLiteDebug$DbStats     // Catch:{ SQLiteException -> 0x00cd, all -> 0x00c8 }
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r15 = r3
            r15.<init>(r16, r17, r19, r21, r22, r23, r24)     // Catch:{ SQLiteException -> 0x00cd, all -> 0x00c8 }
            r0.add(r3)     // Catch:{ SQLiteException -> 0x00cd, all -> 0x00c8 }
            int r2 = r2 + 1
            goto L_0x003d
        L_0x00c8:
            r0 = move-exception
            r14.close()
            throw r0
        L_0x00cd:
            r14.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.database.sqlite.SQLiteConnection.collectDbStats(java.util.ArrayList):void");
    }

    public void collectDbStatsUnsafe(ArrayList<SQLiteDebug.DbStats> arrayList) {
        arrayList.add(getMainDbStatsUnsafe(0, 0, 0));
    }

    public String describeCurrentOperationUnsafe() {
        return this.mRecentOperations.describeCurrentOperation();
    }

    public void dump(Printer printer, boolean z) {
        dumpUnsafe(printer, z);
    }

    public void dumpUnsafe(Printer printer, boolean z) {
        StringBuilder k = C13555b.m33972k("Connection #");
        k.append(this.mConnectionId);
        k.append(":");
        printer.println(k.toString());
        if (z) {
            StringBuilder k2 = C13555b.m33972k("  connectionPtr: 0x");
            k2.append(Long.toHexString(this.mConnectionPtr));
            printer.println(k2.toString());
        }
        StringBuilder k3 = C13555b.m33972k("  isPrimaryConnection: ");
        k3.append(this.mIsPrimaryConnection);
        printer.println(k3.toString());
        printer.println("  onlyAllowReadOnlyOperations: " + this.mOnlyAllowReadOnlyOperations);
        this.mRecentOperations.dump(printer, z);
        if (z) {
            this.mPreparedStatementCache.dump(printer);
        }
    }

    public void enableLocalizedCollators() {
        if (nativeHasCodec()) {
            setLocaleFromConfiguration();
        }
    }

    public void execute(String str, Object[] objArr, C5802d dVar) {
        if (str != null) {
            int beginOperation = this.mRecentOperations.beginOperation("execute", str, objArr);
            try {
                PreparedStatement acquirePreparedStatement = acquirePreparedStatement(str);
                try {
                    throwIfStatementForbidden(acquirePreparedStatement);
                    bindArguments(acquirePreparedStatement, objArr);
                    applyBlockGuardPolicy(acquirePreparedStatement);
                    attachCancellationSignal(dVar);
                    nativeExecute(this.mConnectionPtr, acquirePreparedStatement.mStatementPtr);
                    detachCancellationSignal(dVar);
                    releasePreparedStatement(acquirePreparedStatement);
                    this.mRecentOperations.endOperation(beginOperation);
                } catch (Throwable th) {
                    releasePreparedStatement(acquirePreparedStatement);
                    throw th;
                }
            } catch (RuntimeException e) {
                try {
                    this.mRecentOperations.failOperation(beginOperation, e);
                    throw e;
                } catch (Throwable th2) {
                    this.mRecentOperations.endOperation(beginOperation);
                    throw th2;
                }
            }
        } else {
            throw new IllegalArgumentException("sql must not be null.");
        }
    }

    public ParcelFileDescriptor executeForBlobFileDescriptor(String str, Object[] objArr, C5802d dVar) {
        ParcelFileDescriptor parcelFileDescriptor;
        if (str != null) {
            int beginOperation = this.mRecentOperations.beginOperation("executeForBlobFileDescriptor", str, objArr);
            try {
                PreparedStatement acquirePreparedStatement = acquirePreparedStatement(str);
                try {
                    throwIfStatementForbidden(acquirePreparedStatement);
                    bindArguments(acquirePreparedStatement, objArr);
                    applyBlockGuardPolicy(acquirePreparedStatement);
                    attachCancellationSignal(dVar);
                    int nativeExecuteForBlobFileDescriptor = nativeExecuteForBlobFileDescriptor(this.mConnectionPtr, acquirePreparedStatement.mStatementPtr);
                    if (nativeExecuteForBlobFileDescriptor >= 0) {
                        parcelFileDescriptor = ParcelFileDescriptor.adoptFd(nativeExecuteForBlobFileDescriptor);
                    } else {
                        parcelFileDescriptor = null;
                    }
                    detachCancellationSignal(dVar);
                    releasePreparedStatement(acquirePreparedStatement);
                    this.mRecentOperations.endOperation(beginOperation);
                    return parcelFileDescriptor;
                } catch (Throwable th) {
                    releasePreparedStatement(acquirePreparedStatement);
                    throw th;
                }
            } catch (RuntimeException e) {
                try {
                    this.mRecentOperations.failOperation(beginOperation, e);
                    throw e;
                } catch (Throwable th2) {
                    this.mRecentOperations.endOperation(beginOperation);
                    throw th2;
                }
            }
        } else {
            throw new IllegalArgumentException("sql must not be null.");
        }
    }

    public int executeForChangedRowCount(String str, Object[] objArr, C5802d dVar) {
        if (str != null) {
            int i = 0;
            int beginOperation = this.mRecentOperations.beginOperation("executeForChangedRowCount", str, objArr);
            try {
                PreparedStatement acquirePreparedStatement = acquirePreparedStatement(str);
                try {
                    throwIfStatementForbidden(acquirePreparedStatement);
                    bindArguments(acquirePreparedStatement, objArr);
                    applyBlockGuardPolicy(acquirePreparedStatement);
                    attachCancellationSignal(dVar);
                    i = nativeExecuteForChangedRowCount(this.mConnectionPtr, acquirePreparedStatement.mStatementPtr);
                    detachCancellationSignal(dVar);
                    releasePreparedStatement(acquirePreparedStatement);
                    if (this.mRecentOperations.endOperationDeferLog(beginOperation)) {
                        this.mRecentOperations.logOperation(beginOperation, C16759e.m42349e("changedRows=", i));
                    }
                    return i;
                } catch (Throwable th) {
                    releasePreparedStatement(acquirePreparedStatement);
                    throw th;
                }
            } catch (RuntimeException e) {
                try {
                    this.mRecentOperations.failOperation(beginOperation, e);
                    throw e;
                } catch (Throwable th2) {
                    if (this.mRecentOperations.endOperationDeferLog(beginOperation)) {
                        this.mRecentOperations.logOperation(beginOperation, C16759e.m42349e("changedRows=", i));
                    }
                    throw th2;
                }
            }
        } else {
            throw new IllegalArgumentException("sql must not be null.");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:78:0x017e A[Catch:{ all -> 0x01ab }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int executeForCursorWindow(java.lang.String r26, java.lang.Object[] r27, com.moovit.database.CursorWindow r28, int r29, int r30, boolean r31, p177n1.C5802d r32) {
        /*
            r25 = this;
            r1 = r25
            r0 = r26
            r2 = r27
            r3 = r28
            r13 = r29
            r14 = r32
            java.lang.String r15 = ", countedRows="
            java.lang.String r12 = ", filledRows="
            java.lang.String r11 = ", actualPos="
            java.lang.String r10 = "', startPos="
            java.lang.String r8 = "window='"
            if (r0 == 0) goto L_0x01b8
            if (r3 == 0) goto L_0x01b0
            r28.acquireReference()
            com.moovit.database.sqlite.SQLiteConnection$OperationLog r4 = r1.mRecentOperations     // Catch:{ all -> 0x01ab }
            java.lang.String r5 = "executeForCursorWindow"
            int r9 = r4.beginOperation(r5, r0, r2)     // Catch:{ all -> 0x01ab }
            r16 = -1
            com.moovit.database.sqlite.SQLiteConnection$PreparedStatement r6 = r25.acquirePreparedStatement(r26)     // Catch:{ RuntimeException -> 0x0160, all -> 0x0151 }
            r1.throwIfStatementForbidden(r6)     // Catch:{ all -> 0x013d }
            r1.bindArguments(r6, r2)     // Catch:{ all -> 0x013d }
            r1.applyBlockGuardPolicy(r6)     // Catch:{ all -> 0x013d }
            r1.attachCancellationSignal(r14)     // Catch:{ all -> 0x013d }
            long r4 = r1.mConnectionPtr     // Catch:{ all -> 0x0129 }
            r2 = r8
            long r7 = r6.mStatementPtr     // Catch:{ all -> 0x0119 }
            r18 = r9
            r17 = r10
            long r9 = r3.mWindowPtr     // Catch:{ all -> 0x010d }
            r26 = r2
            r2 = r6
            r6 = r7
            r13 = r26
            r19 = r15
            r15 = r18
            r8 = r9
            r20 = r17
            r10 = r29
            r21 = r11
            r11 = r30
            r22 = r12
            r12 = r31
            long r4 = nativeExecuteForCursorWindow(r4, r6, r8, r10, r11, r12)     // Catch:{ all -> 0x0100 }
            r0 = 32
            long r6 = r4 >> r0
            int r7 = (int) r6
            int r5 = (int) r4
            int r4 = r28.getNumRows()     // Catch:{ all -> 0x00f0 }
            r3.setStartPosition(r7)     // Catch:{ all -> 0x00e0 }
            r1.detachCancellationSignal(r14)     // Catch:{ all -> 0x00d0 }
            r1.releasePreparedStatement(r2)     // Catch:{ RuntimeException -> 0x00c0, all -> 0x00b2 }
            com.moovit.database.sqlite.SQLiteConnection$OperationLog r0 = r1.mRecentOperations     // Catch:{ all -> 0x01ab }
            boolean r0 = r0.endOperationDeferLog(r15)     // Catch:{ all -> 0x01ab }
            if (r0 == 0) goto L_0x00ae
            com.moovit.database.sqlite.SQLiteConnection$OperationLog r0 = r1.mRecentOperations     // Catch:{ all -> 0x01ab }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ab }
            r2.<init>()     // Catch:{ all -> 0x01ab }
            r2.append(r13)     // Catch:{ all -> 0x01ab }
            r2.append(r3)     // Catch:{ all -> 0x01ab }
            r6 = r20
            r2.append(r6)     // Catch:{ all -> 0x01ab }
            r8 = r29
            r2.append(r8)     // Catch:{ all -> 0x01ab }
            r9 = r21
            r2.append(r9)     // Catch:{ all -> 0x01ab }
            r2.append(r7)     // Catch:{ all -> 0x01ab }
            r10 = r22
            r2.append(r10)     // Catch:{ all -> 0x01ab }
            r2.append(r4)     // Catch:{ all -> 0x01ab }
            r11 = r19
            r2.append(r11)     // Catch:{ all -> 0x01ab }
            r2.append(r5)     // Catch:{ all -> 0x01ab }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01ab }
            r0.logOperation(r15, r2)     // Catch:{ all -> 0x01ab }
        L_0x00ae:
            r28.releaseReference()
            return r5
        L_0x00b2:
            r0 = move-exception
            r8 = r29
            r12 = r13
            r11 = r19
            r6 = r20
            r9 = r21
            r10 = r22
            goto L_0x0176
        L_0x00c0:
            r0 = move-exception
            r8 = r29
            r12 = r13
            r11 = r19
            r6 = r20
            r9 = r21
            r10 = r22
            r16 = r7
            goto L_0x016d
        L_0x00d0:
            r0 = move-exception
            r8 = r29
            r12 = r13
            r11 = r19
            r6 = r20
            r9 = r21
            r10 = r22
            r16 = r7
            goto L_0x014b
        L_0x00e0:
            r0 = move-exception
            r8 = r29
            r12 = r13
            r11 = r19
            r6 = r20
            r9 = r21
            r10 = r22
            r16 = r7
            goto L_0x0137
        L_0x00f0:
            r0 = move-exception
            r8 = r29
            r12 = r13
            r11 = r19
            r6 = r20
            r9 = r21
            r10 = r22
            r16 = r7
            r4 = -1
            goto L_0x0137
        L_0x0100:
            r0 = move-exception
            r8 = r29
            r12 = r13
            r11 = r19
            r6 = r20
            r9 = r21
            r10 = r22
            goto L_0x0135
        L_0x010d:
            r0 = move-exception
            r9 = r11
            r10 = r12
            r8 = r13
            r11 = r15
            r15 = r18
            r12 = r2
            r2 = r6
            r6 = r17
            goto L_0x0135
        L_0x0119:
            r0 = move-exception
            r8 = r13
            r23 = r12
            r12 = r2
            r2 = r6
            r6 = r10
            r10 = r23
            r24 = r15
            r15 = r9
            r9 = r11
            r11 = r24
            goto L_0x0135
        L_0x0129:
            r0 = move-exception
            r2 = r6
            r6 = r10
            r10 = r12
            r12 = r8
            r8 = r13
            r23 = r15
            r15 = r9
            r9 = r11
            r11 = r23
        L_0x0135:
            r4 = -1
            r5 = -1
        L_0x0137:
            r1.detachCancellationSignal(r14)     // Catch:{ all -> 0x013b }
            throw r0     // Catch:{ all -> 0x013b }
        L_0x013b:
            r0 = move-exception
            goto L_0x014b
        L_0x013d:
            r0 = move-exception
            r2 = r6
            r6 = r10
            r10 = r12
            r12 = r8
            r8 = r13
            r23 = r15
            r15 = r9
            r9 = r11
            r11 = r23
            r4 = -1
            r5 = -1
        L_0x014b:
            r1.releasePreparedStatement(r2)     // Catch:{ RuntimeException -> 0x014f }
            throw r0     // Catch:{ RuntimeException -> 0x014f }
        L_0x014f:
            r0 = move-exception
            goto L_0x016d
        L_0x0151:
            r0 = move-exception
            r6 = r10
            r10 = r12
            r12 = r8
            r8 = r13
            r23 = r15
            r15 = r9
            r9 = r11
            r11 = r23
            r4 = -1
            r5 = -1
            r7 = -1
            goto L_0x0176
        L_0x0160:
            r0 = move-exception
            r6 = r10
            r10 = r12
            r12 = r8
            r8 = r13
            r23 = r15
            r15 = r9
            r9 = r11
            r11 = r23
            r4 = -1
            r5 = -1
        L_0x016d:
            com.moovit.database.sqlite.SQLiteConnection$OperationLog r2 = r1.mRecentOperations     // Catch:{ all -> 0x0173 }
            r2.failOperation(r15, r0)     // Catch:{ all -> 0x0173 }
            throw r0     // Catch:{ all -> 0x0173 }
        L_0x0173:
            r0 = move-exception
            r7 = r16
        L_0x0176:
            com.moovit.database.sqlite.SQLiteConnection$OperationLog r2 = r1.mRecentOperations     // Catch:{ all -> 0x01ab }
            boolean r2 = r2.endOperationDeferLog(r15)     // Catch:{ all -> 0x01ab }
            if (r2 == 0) goto L_0x01aa
            com.moovit.database.sqlite.SQLiteConnection$OperationLog r2 = r1.mRecentOperations     // Catch:{ all -> 0x01ab }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ab }
            r13.<init>()     // Catch:{ all -> 0x01ab }
            r13.append(r12)     // Catch:{ all -> 0x01ab }
            r13.append(r3)     // Catch:{ all -> 0x01ab }
            r13.append(r6)     // Catch:{ all -> 0x01ab }
            r13.append(r8)     // Catch:{ all -> 0x01ab }
            r13.append(r9)     // Catch:{ all -> 0x01ab }
            r13.append(r7)     // Catch:{ all -> 0x01ab }
            r13.append(r10)     // Catch:{ all -> 0x01ab }
            r13.append(r4)     // Catch:{ all -> 0x01ab }
            r13.append(r11)     // Catch:{ all -> 0x01ab }
            r13.append(r5)     // Catch:{ all -> 0x01ab }
            java.lang.String r4 = r13.toString()     // Catch:{ all -> 0x01ab }
            r2.logOperation(r15, r4)     // Catch:{ all -> 0x01ab }
        L_0x01aa:
            throw r0     // Catch:{ all -> 0x01ab }
        L_0x01ab:
            r0 = move-exception
            r28.releaseReference()
            throw r0
        L_0x01b0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "window must not be null."
            r0.<init>(r2)
            throw r0
        L_0x01b8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "sql must not be null."
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.database.sqlite.SQLiteConnection.executeForCursorWindow(java.lang.String, java.lang.Object[], com.moovit.database.CursorWindow, int, int, boolean, n1.d):int");
    }

    public long executeForLastInsertedRowId(String str, Object[] objArr, C5802d dVar) {
        if (str != null) {
            int beginOperation = this.mRecentOperations.beginOperation("executeForLastInsertedRowId", str, objArr);
            try {
                PreparedStatement acquirePreparedStatement = acquirePreparedStatement(str);
                try {
                    throwIfStatementForbidden(acquirePreparedStatement);
                    bindArguments(acquirePreparedStatement, objArr);
                    applyBlockGuardPolicy(acquirePreparedStatement);
                    attachCancellationSignal(dVar);
                    long nativeExecuteForLastInsertedRowId = nativeExecuteForLastInsertedRowId(this.mConnectionPtr, acquirePreparedStatement.mStatementPtr);
                    detachCancellationSignal(dVar);
                    releasePreparedStatement(acquirePreparedStatement);
                    this.mRecentOperations.endOperation(beginOperation);
                    return nativeExecuteForLastInsertedRowId;
                } catch (Throwable th) {
                    releasePreparedStatement(acquirePreparedStatement);
                    throw th;
                }
            } catch (RuntimeException e) {
                try {
                    this.mRecentOperations.failOperation(beginOperation, e);
                    throw e;
                } catch (Throwable th2) {
                    this.mRecentOperations.endOperation(beginOperation);
                    throw th2;
                }
            }
        } else {
            throw new IllegalArgumentException("sql must not be null.");
        }
    }

    public long executeForLong(String str, Object[] objArr, C5802d dVar) {
        if (str != null) {
            int beginOperation = this.mRecentOperations.beginOperation("executeForLong", str, objArr);
            try {
                PreparedStatement acquirePreparedStatement = acquirePreparedStatement(str);
                try {
                    throwIfStatementForbidden(acquirePreparedStatement);
                    bindArguments(acquirePreparedStatement, objArr);
                    applyBlockGuardPolicy(acquirePreparedStatement);
                    attachCancellationSignal(dVar);
                    long nativeExecuteForLong = nativeExecuteForLong(this.mConnectionPtr, acquirePreparedStatement.mStatementPtr);
                    detachCancellationSignal(dVar);
                    releasePreparedStatement(acquirePreparedStatement);
                    this.mRecentOperations.endOperation(beginOperation);
                    return nativeExecuteForLong;
                } catch (Throwable th) {
                    releasePreparedStatement(acquirePreparedStatement);
                    throw th;
                }
            } catch (RuntimeException e) {
                try {
                    this.mRecentOperations.failOperation(beginOperation, e);
                    throw e;
                } catch (Throwable th2) {
                    this.mRecentOperations.endOperation(beginOperation);
                    throw th2;
                }
            }
        } else {
            throw new IllegalArgumentException("sql must not be null.");
        }
    }

    public String executeForString(String str, Object[] objArr, C5802d dVar) {
        if (str != null) {
            int beginOperation = this.mRecentOperations.beginOperation("executeForString", str, objArr);
            try {
                PreparedStatement acquirePreparedStatement = acquirePreparedStatement(str);
                try {
                    throwIfStatementForbidden(acquirePreparedStatement);
                    bindArguments(acquirePreparedStatement, objArr);
                    applyBlockGuardPolicy(acquirePreparedStatement);
                    attachCancellationSignal(dVar);
                    String nativeExecuteForString = nativeExecuteForString(this.mConnectionPtr, acquirePreparedStatement.mStatementPtr);
                    detachCancellationSignal(dVar);
                    releasePreparedStatement(acquirePreparedStatement);
                    this.mRecentOperations.endOperation(beginOperation);
                    return nativeExecuteForString;
                } catch (Throwable th) {
                    releasePreparedStatement(acquirePreparedStatement);
                    throw th;
                }
            } catch (RuntimeException e) {
                try {
                    this.mRecentOperations.failOperation(beginOperation, e);
                    throw e;
                } catch (Throwable th2) {
                    this.mRecentOperations.endOperation(beginOperation);
                    throw th2;
                }
            }
        } else {
            throw new IllegalArgumentException("sql must not be null.");
        }
    }

    public void finalize() throws Throwable {
        try {
            SQLiteConnectionPool sQLiteConnectionPool = this.mPool;
            if (!(sQLiteConnectionPool == null || this.mConnectionPtr == 0)) {
                sQLiteConnectionPool.onConnectionLeaked();
            }
            dispose(true);
        } finally {
            super.finalize();
        }
    }

    public boolean isPreparedStatementInCache(String str) {
        return this.mPreparedStatementCache.get(str) != null;
    }

    public boolean isPrimaryConnection() {
        return this.mIsPrimaryConnection;
    }

    public void onCancel() {
        nativeCancel(this.mConnectionPtr);
    }

    public void prepare(String str, SQLiteStatementInfo sQLiteStatementInfo) {
        PreparedStatement acquirePreparedStatement;
        if (str != null) {
            int beginOperation = this.mRecentOperations.beginOperation("prepare", str, (Object[]) null);
            try {
                acquirePreparedStatement = acquirePreparedStatement(str);
                if (sQLiteStatementInfo != null) {
                    sQLiteStatementInfo.numParameters = acquirePreparedStatement.mNumParameters;
                    sQLiteStatementInfo.readOnly = acquirePreparedStatement.mReadOnly;
                    int nativeGetColumnCount = nativeGetColumnCount(this.mConnectionPtr, acquirePreparedStatement.mStatementPtr);
                    if (nativeGetColumnCount == 0) {
                        sQLiteStatementInfo.columnNames = EMPTY_STRING_ARRAY;
                    } else {
                        sQLiteStatementInfo.columnNames = new String[nativeGetColumnCount];
                        for (int i = 0; i < nativeGetColumnCount; i++) {
                            sQLiteStatementInfo.columnNames[i] = nativeGetColumnName(this.mConnectionPtr, acquirePreparedStatement.mStatementPtr, i);
                        }
                    }
                }
                releasePreparedStatement(acquirePreparedStatement);
                this.mRecentOperations.endOperation(beginOperation);
            } catch (RuntimeException e) {
                try {
                    this.mRecentOperations.failOperation(beginOperation, e);
                    throw e;
                } catch (Throwable th) {
                    this.mRecentOperations.endOperation(beginOperation);
                    throw th;
                }
            } catch (Throwable th2) {
                releasePreparedStatement(acquirePreparedStatement);
                throw th2;
            }
        } else {
            throw new IllegalArgumentException("sql must not be null.");
        }
    }

    public void reconfigure(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        boolean z;
        boolean z2 = false;
        this.mOnlyAllowReadOnlyOperations = false;
        int size = sQLiteDatabaseConfiguration.customFunctions.size();
        for (int i = 0; i < size; i++) {
            SQLiteCustomFunction sQLiteCustomFunction = sQLiteDatabaseConfiguration.customFunctions.get(i);
            if (!this.mConfiguration.customFunctions.contains(sQLiteCustomFunction)) {
                nativeRegisterCustomFunction(this.mConnectionPtr, sQLiteCustomFunction);
            }
        }
        int size2 = sQLiteDatabaseConfiguration.functions.size();
        for (int i2 = 0; i2 < size2; i2++) {
            SQLiteFunction sQLiteFunction = sQLiteDatabaseConfiguration.functions.get(i2);
            if (!this.mConfiguration.functions.contains(sQLiteFunction)) {
                nativeRegisterFunction(this.mConnectionPtr, sQLiteFunction);
            }
        }
        boolean z3 = sQLiteDatabaseConfiguration.foreignKeyConstraintsEnabled;
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = this.mConfiguration;
        if (z3 != sQLiteDatabaseConfiguration2.foreignKeyConstraintsEnabled) {
            z = true;
        } else {
            z = false;
        }
        if (((sQLiteDatabaseConfiguration.openFlags ^ sQLiteDatabaseConfiguration2.openFlags) & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0) {
            z2 = true;
        }
        boolean z4 = !sQLiteDatabaseConfiguration.locale.equals(sQLiteDatabaseConfiguration2.locale);
        this.mConfiguration.updateParametersFrom(sQLiteDatabaseConfiguration);
        if (z) {
            setForeignKeyModeFromConfiguration();
        }
        if (z2) {
            setWalModeFromConfiguration();
        }
        if (z4) {
            setLocaleFromConfiguration();
        }
    }

    public void setOnlyAllowReadOnlyOperations(boolean z) {
        this.mOnlyAllowReadOnlyOperations = z;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("SQLiteConnection: ");
        k.append(this.mConfiguration.path);
        k.append(" (");
        return C13437d.m33707l(k, this.mConnectionId, ")");
    }

    private void open() {
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfiguration;
        this.mConnectionPtr = nativeOpen(sQLiteDatabaseConfiguration.path, sQLiteDatabaseConfiguration.openFlags & -536870913, sQLiteDatabaseConfiguration.label, SQLiteDebug.DEBUG_SQL_STATEMENTS, SQLiteDebug.DEBUG_SQL_TIME);
        setPageSize();
        setForeignKeyModeFromConfiguration();
        setJournalSizeLimit();
        setAutoCheckpointInterval();
        if (!nativeHasCodec()) {
            setWalModeFromConfiguration();
            setLocaleFromConfiguration();
        }
        int size = this.mConfiguration.customFunctions.size();
        for (int i = 0; i < size; i++) {
            nativeRegisterCustomFunction(this.mConnectionPtr, this.mConfiguration.customFunctions.get(i));
        }
        int size2 = this.mConfiguration.functions.size();
        for (int i2 = 0; i2 < size2; i2++) {
            nativeRegisterFunction(this.mConnectionPtr, this.mConfiguration.functions.get(i2));
        }
        for (SQLiteCustomExtension next : this.mConfiguration.customExtensions) {
            long j = this.mConnectionPtr;
            next.getClass();
            next.getClass();
            nativeLoadExtension(j, (String) null, (String) null);
        }
    }
}
