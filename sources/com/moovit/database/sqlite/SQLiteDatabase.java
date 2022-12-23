package com.moovit.database.sqlite;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.EventLog;
import android.util.Printer;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.moovit.database.DatabaseErrorHandler;
import com.moovit.database.DefaultDatabaseErrorHandler;
import com.moovit.database.sqlite.SQLiteDebug;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import p001a0.C0016g;
import p177n1.C5802d;
import p269u2.C6678b;
import p269u2.C6684e;
import p358af.C13437d;

@SuppressLint({"ShiftFlags"})
public final class SQLiteDatabase extends SQLiteClosable implements C6678b {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int CONFLICT_ABORT = 2;
    public static final int CONFLICT_FAIL = 3;
    public static final int CONFLICT_IGNORE = 4;
    public static final int CONFLICT_NONE = 0;
    public static final int CONFLICT_REPLACE = 5;
    public static final int CONFLICT_ROLLBACK = 1;
    private static final String[] CONFLICT_VALUES = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final int CREATE_IF_NECESSARY = 6;
    public static final int ENABLE_WRITE_AHEAD_LOGGING = 536870912;
    private static final int EVENT_DB_CORRUPT = 75004;
    public static final int MAX_SQL_CACHE_SIZE = 100;
    public static final int OPEN_CREATE = 4;
    public static final int OPEN_FULLMUTEX = 65536;
    public static final int OPEN_NOMUTEX = 32768;
    public static final int OPEN_PRIVATECACHE = 262144;
    public static final int OPEN_READONLY = 1;
    public static final int OPEN_READWRITE = 2;
    public static final int OPEN_SHAREDCACHE = 131072;
    public static final int OPEN_URI = 64;
    private static final String TAG = "SQLiteDatabase";
    private static final WeakHashMap<SQLiteDatabase, Object> sActiveDatabases = new WeakHashMap<>();
    private final CloseGuard mCloseGuardLocked = CloseGuard.get();
    private final SQLiteDatabaseConfiguration mConfigurationLocked;
    private SQLiteConnectionPool mConnectionPoolLocked;
    private final CursorFactory mCursorFactory;
    private final DatabaseErrorHandler mErrorHandler;
    private final Object mLock = new Object();
    private final ThreadLocal<SQLiteSession> mThreadSession = new ThreadLocal<SQLiteSession>() {
        public SQLiteSession initialValue() {
            return SQLiteDatabase.this.createSession();
        }
    };

    public interface CursorFactory {
        Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery);
    }

    @Deprecated
    public interface CustomFunction {
        String callback(String[] strArr);
    }

    public interface Function {

        public interface Args {
        }

        public interface Result {
        }

        void callback(Args args, Result result);
    }

    static {
        Class<SQLiteDatabase> cls = SQLiteDatabase.class;
    }

    private SQLiteDatabase(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        this.mCursorFactory = cursorFactory;
        this.mErrorHandler = databaseErrorHandler == null ? new DefaultDatabaseErrorHandler() : databaseErrorHandler;
        this.mConfigurationLocked = sQLiteDatabaseConfiguration;
    }

    private void collectDbStats(ArrayList<SQLiteDebug.DbStats> arrayList) {
        synchronized (this.mLock) {
            SQLiteConnectionPool sQLiteConnectionPool = this.mConnectionPoolLocked;
            if (sQLiteConnectionPool != null) {
                sQLiteConnectionPool.collectDbStats(arrayList);
            }
        }
    }

    public static SQLiteDatabase create(CursorFactory cursorFactory) {
        return openDatabase(":memory:", cursorFactory, 6);
    }

    public static boolean deleteDatabase(File file) {
        if (file != null) {
            boolean delete = file.delete() | new File(file.getPath() + "-journal").delete() | new File(file.getPath() + "-shm").delete() | new File(file.getPath() + "-wal").delete();
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                final String str = file.getName() + "-mj";
                for (File delete2 : parentFile.listFiles(new FileFilter() {
                    public boolean accept(File file) {
                        return file.getName().startsWith(str);
                    }
                })) {
                    delete |= delete2.delete();
                }
            }
            return delete;
        }
        throw new IllegalArgumentException("file must not be null");
    }

    private void dispose(boolean z) {
        SQLiteConnectionPool sQLiteConnectionPool;
        synchronized (this.mLock) {
            CloseGuard closeGuard = this.mCloseGuardLocked;
            if (closeGuard != null) {
                if (z) {
                    closeGuard.warnIfOpen();
                }
                this.mCloseGuardLocked.close();
            }
            sQLiteConnectionPool = this.mConnectionPoolLocked;
            this.mConnectionPoolLocked = null;
        }
        if (!z) {
            WeakHashMap<SQLiteDatabase, Object> weakHashMap = sActiveDatabases;
            synchronized (weakHashMap) {
                weakHashMap.remove(this);
            }
            if (sQLiteConnectionPool != null) {
                sQLiteConnectionPool.close();
            }
        }
    }

    private void dump(Printer printer, boolean z) {
        synchronized (this.mLock) {
            if (this.mConnectionPoolLocked != null) {
                printer.println("");
                this.mConnectionPoolLocked.dump(printer, z);
            }
        }
    }

    public static void dumpAll(Printer printer, boolean z) {
        Iterator<SQLiteDatabase> it = getActiveDatabases().iterator();
        while (it.hasNext()) {
            it.next().dump(printer, z);
        }
    }

    private static void ensureFile(String str) {
        File file = new File(str);
        if (!file.exists()) {
            try {
                if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
                    file.toString();
                }
                if (!file.createNewFile()) {
                    file.toString();
                }
            } catch (IOException unused) {
                file.toString();
            }
        }
    }

    private int executeSql(String str, Object[] objArr) throws SQLException {
        SQLiteStatement sQLiteStatement;
        acquireReference();
        try {
            sQLiteStatement = new SQLiteStatement(this, str, objArr);
            int executeUpdateDelete = sQLiteStatement.executeUpdateDelete();
            sQLiteStatement.close();
            releaseReference();
            return executeUpdateDelete;
        } catch (Throwable th) {
            releaseReference();
            throw th;
        }
    }

    public static String findEditTable(String str) {
        if (!TextUtils.isEmpty(str)) {
            int indexOf = str.indexOf(32);
            int indexOf2 = str.indexOf(44);
            if (indexOf > 0 && (indexOf < indexOf2 || indexOf2 < 0)) {
                return str.substring(0, indexOf);
            }
            if (indexOf2 <= 0) {
                return str;
            }
            if (indexOf2 < indexOf || indexOf < 0) {
                return str.substring(0, indexOf2);
            }
            return str;
        }
        throw new IllegalStateException("Invalid tables");
    }

    private static ArrayList<SQLiteDatabase> getActiveDatabases() {
        ArrayList<SQLiteDatabase> arrayList = new ArrayList<>();
        WeakHashMap<SQLiteDatabase, Object> weakHashMap = sActiveDatabases;
        synchronized (weakHashMap) {
            arrayList.addAll(weakHashMap.keySet());
        }
        return arrayList;
    }

    public static ArrayList<SQLiteDebug.DbStats> getDbStats() {
        ArrayList<SQLiteDebug.DbStats> arrayList = new ArrayList<>();
        Iterator<SQLiteDatabase> it = getActiveDatabases().iterator();
        while (it.hasNext()) {
            it.next().collectDbStats(arrayList);
        }
        return arrayList;
    }

    public static boolean hasCodec() {
        return SQLiteConnection.hasCodec();
    }

    private static boolean isMainThread() {
        Looper myLooper = Looper.myLooper();
        if (myLooper == null || myLooper != Looper.getMainLooper()) {
            return false;
        }
        return true;
    }

    private boolean isReadOnlyLocked() {
        return (this.mConfigurationLocked.openFlags & 1) == 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0019 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void open() {
        /*
            r2 = this;
            com.moovit.database.sqlite.SQLiteDatabaseConfiguration r0 = r2.mConfigurationLocked     // Catch:{ SQLiteException -> 0x0020 }
            boolean r0 = r0.isInMemoryDb()     // Catch:{ SQLiteException -> 0x0020 }
            if (r0 != 0) goto L_0x0015
            com.moovit.database.sqlite.SQLiteDatabaseConfiguration r0 = r2.mConfigurationLocked     // Catch:{ SQLiteException -> 0x0020 }
            int r1 = r0.openFlags     // Catch:{ SQLiteException -> 0x0020 }
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0015
            java.lang.String r0 = r0.path     // Catch:{ SQLiteException -> 0x0020 }
            ensureFile(r0)     // Catch:{ SQLiteException -> 0x0020 }
        L_0x0015:
            r2.openInner()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0019 }
            goto L_0x001f
        L_0x0019:
            r2.onCorruption()     // Catch:{ SQLiteException -> 0x0020 }
            r2.openInner()     // Catch:{ SQLiteException -> 0x0020 }
        L_0x001f:
            return
        L_0x0020:
            r0 = move-exception
            r2.getLabel()
            r2.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.database.sqlite.SQLiteDatabase.open():void");
    }

    public static SQLiteDatabase openDatabase(String str, CursorFactory cursorFactory, int i) {
        return openDatabase(str, cursorFactory, i, (DatabaseErrorHandler) null);
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 121 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void openInner() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            com.moovit.database.sqlite.SQLiteDatabaseConfiguration r1 = r3.mConfigurationLocked     // Catch:{ all -> 0x0021 }
            com.moovit.database.sqlite.SQLiteConnectionPool r1 = com.moovit.database.sqlite.SQLiteConnectionPool.open(r1)     // Catch:{ all -> 0x0021 }
            r3.mConnectionPoolLocked = r1     // Catch:{ all -> 0x0021 }
            com.moovit.database.sqlite.CloseGuard r1 = r3.mCloseGuardLocked     // Catch:{ all -> 0x0021 }
            java.lang.String r2 = "close"
            r1.open(r2)     // Catch:{ all -> 0x0021 }
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            java.util.WeakHashMap<com.moovit.database.sqlite.SQLiteDatabase, java.lang.Object> r1 = sActiveDatabases
            monitor-enter(r1)
            r0 = 0
            r1.put(r3, r0)     // Catch:{ all -> 0x001c }
            monitor-exit(r1)     // Catch:{ all -> 0x001c }
            return
        L_0x001c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001c }
            throw r0
        L_0x001f:
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            throw r1
        L_0x0021:
            r1 = move-exception
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.database.sqlite.SQLiteDatabase.openInner():void");
    }

    public static SQLiteDatabase openOrCreateDatabase(File file, CursorFactory cursorFactory) {
        return openOrCreateDatabase(file.getPath(), cursorFactory);
    }

    public static int releaseMemory() {
        return SQLiteGlobal.releaseMemory();
    }

    private void throwIfNotOpenLocked() {
        if (this.mConnectionPoolLocked == null) {
            throw new IllegalStateException(C0016g.m31o(C13555b.m33972k("The database '"), this.mConfigurationLocked.label, "' is not open."));
        }
    }

    private boolean yieldIfContendedHelper(boolean z, long j) {
        acquireReference();
        try {
            return getThreadSession().yieldTransaction(j, z, (C5802d) null);
        } finally {
            releaseReference();
        }
    }

    @Deprecated
    public void addCustomFunction(String str, int i, CustomFunction customFunction) {
        SQLiteCustomFunction sQLiteCustomFunction = new SQLiteCustomFunction(str, i, customFunction);
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            this.mConfigurationLocked.customFunctions.add(sQLiteCustomFunction);
            try {
                this.mConnectionPoolLocked.reconfigure(this.mConfigurationLocked);
            } catch (RuntimeException e) {
                this.mConfigurationLocked.customFunctions.remove(sQLiteCustomFunction);
                throw e;
            }
        }
    }

    public void addFunction(String str, int i, Function function) {
        addFunction(str, i, function, 0);
    }

    public void beginTransaction() {
        beginTransaction((SQLiteTransactionListener) null, 2);
    }

    public void beginTransactionDeferred() {
        beginTransaction((SQLiteTransactionListener) null, 0);
    }

    public void beginTransactionNonExclusive() {
        beginTransaction((SQLiteTransactionListener) null, 1);
    }

    public void beginTransactionWithListener(SQLiteTransactionListener sQLiteTransactionListener) {
        beginTransaction(sQLiteTransactionListener, 2);
    }

    public void beginTransactionWithListenerDeferred(SQLiteTransactionListener sQLiteTransactionListener) {
        beginTransaction(sQLiteTransactionListener, 0);
    }

    public void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener sQLiteTransactionListener) {
        beginTransaction(sQLiteTransactionListener, 1);
    }

    public ParcelFileDescriptor blobFileDescriptorForQuery(String str, String[] strArr) {
        SQLiteStatement compileStatement = compileStatement(str);
        try {
            return blobFileDescriptorForQuery(compileStatement, strArr);
        } finally {
            compileStatement.close();
        }
    }

    public SQLiteSession createSession() {
        SQLiteConnectionPool sQLiteConnectionPool;
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            sQLiteConnectionPool = this.mConnectionPoolLocked;
        }
        return new SQLiteSession(sQLiteConnectionPool);
    }

    public int delete(String str, String str2, String[] strArr) {
        SQLiteStatement sQLiteStatement;
        String str3;
        acquireReference();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("DELETE FROM ");
            sb.append(str);
            if (!TextUtils.isEmpty(str2)) {
                str3 = " WHERE " + str2;
            } else {
                str3 = "";
            }
            sb.append(str3);
            sQLiteStatement = new SQLiteStatement(this, sb.toString(), strArr);
            int executeUpdateDelete = sQLiteStatement.executeUpdateDelete();
            sQLiteStatement.close();
            releaseReference();
            return executeUpdateDelete;
        } catch (Throwable th) {
            releaseReference();
            throw th;
        }
    }

    public void disableWriteAheadLogging() {
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfigurationLocked;
            int i = sQLiteDatabaseConfiguration.openFlags;
            if ((i & ENABLE_WRITE_AHEAD_LOGGING) != 0) {
                sQLiteDatabaseConfiguration.openFlags = i & -536870913;
                try {
                    this.mConnectionPoolLocked.reconfigure(sQLiteDatabaseConfiguration);
                } catch (RuntimeException e) {
                    SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = this.mConfigurationLocked;
                    sQLiteDatabaseConfiguration2.openFlags = 536870912 | sQLiteDatabaseConfiguration2.openFlags;
                    throw e;
                }
            }
        }
    }

    public void enableLocalizedCollators() {
        this.mConnectionPoolLocked.enableLocalizedCollators();
    }

    public boolean enableWriteAheadLogging() {
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            if ((this.mConfigurationLocked.openFlags & ENABLE_WRITE_AHEAD_LOGGING) != 0) {
                return true;
            }
            if (isReadOnlyLocked()) {
                return false;
            }
            if (this.mConfigurationLocked.isInMemoryDb()) {
                return false;
            }
            SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfigurationLocked;
            sQLiteDatabaseConfiguration.openFlags = 536870912 | sQLiteDatabaseConfiguration.openFlags;
            try {
                this.mConnectionPoolLocked.reconfigure(sQLiteDatabaseConfiguration);
                return true;
            } catch (RuntimeException e) {
                this.mConfigurationLocked.openFlags &= -536870913;
                throw e;
            }
        }
    }

    public void endTransaction() {
        acquireReference();
        try {
            getThreadSession().endTransaction((C5802d) null);
        } finally {
            releaseReference();
        }
    }

    public void execPerConnectionSQL(String str, @SuppressLint({"ArrayReturn"}) Object[] objArr) {
        throw new UnsupportedOperationException();
    }

    public void execSQL(String str) throws SQLException {
        executeSql(str, (Object[]) null);
    }

    public void finalize() throws Throwable {
        try {
            dispose(true);
        } finally {
            super.finalize();
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.List<android.util.Pair<java.lang.String, java.lang.String>>, java.lang.Object[], android.database.Cursor] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r3 = rawQuery("pragma database_list;", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        if (r3.moveToNext() == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        r0.add(new android.util.Pair(r3.getString(1), r3.getString(2)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        releaseReference();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003a, code lost:
        if (r3 != 0) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0040, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0041, code lost:
        releaseReference();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0044, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<android.util.Pair<java.lang.String, java.lang.String>> getAttachedDbs() {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r1 = r5.mLock
            monitor-enter(r1)
            com.moovit.database.sqlite.SQLiteConnectionPool r2 = r5.mConnectionPoolLocked     // Catch:{ all -> 0x0045 }
            r3 = 0
            if (r2 != 0) goto L_0x000f
            monitor-exit(r1)     // Catch:{ all -> 0x0045 }
            return r3
        L_0x000f:
            r5.acquireReference()     // Catch:{ all -> 0x0045 }
            monitor-exit(r1)     // Catch:{ all -> 0x0045 }
            java.lang.String r1 = "pragma database_list;"
            android.database.Cursor r3 = r5.rawQuery(r1, r3)     // Catch:{ all -> 0x0039 }
        L_0x0019:
            boolean r1 = r3.moveToNext()     // Catch:{ all -> 0x0039 }
            if (r1 == 0) goto L_0x0032
            android.util.Pair r1 = new android.util.Pair     // Catch:{ all -> 0x0039 }
            r2 = 1
            java.lang.String r2 = r3.getString(r2)     // Catch:{ all -> 0x0039 }
            r4 = 2
            java.lang.String r4 = r3.getString(r4)     // Catch:{ all -> 0x0039 }
            r1.<init>(r2, r4)     // Catch:{ all -> 0x0039 }
            r0.add(r1)     // Catch:{ all -> 0x0039 }
            goto L_0x0019
        L_0x0032:
            r3.close()     // Catch:{ all -> 0x0040 }
            r5.releaseReference()
            return r0
        L_0x0039:
            r0 = move-exception
            if (r3 == 0) goto L_0x003f
            r3.close()     // Catch:{ all -> 0x0040 }
        L_0x003f:
            throw r0     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r0 = move-exception
            r5.releaseReference()
            throw r0
        L_0x0045:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0045 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.database.sqlite.SQLiteDatabase.getAttachedDbs():java.util.List");
    }

    public String getLabel() {
        String str;
        synchronized (this.mLock) {
            str = this.mConfigurationLocked.label;
        }
        return str;
    }

    public long getMaximumSize() {
        return getPageSize() * longForQuery("PRAGMA max_page_count;", (String[]) null);
    }

    public long getPageSize() {
        return longForQuery("PRAGMA page_size;", (String[]) null);
    }

    public final String getPath() {
        String str;
        synchronized (this.mLock) {
            str = this.mConfigurationLocked.path;
        }
        return str;
    }

    public int getThreadDefaultConnectionFlags(boolean z) {
        int i = z ? 1 : 2;
        return isMainThread() ? i | 4 : i;
    }

    public SQLiteSession getThreadSession() {
        return this.mThreadSession.get();
    }

    public int getVersion() {
        return Long.valueOf(longForQuery("PRAGMA user_version;", (String[]) null)).intValue();
    }

    public boolean inTransaction() {
        acquireReference();
        try {
            return getThreadSession().hasTransaction();
        } finally {
            releaseReference();
        }
    }

    public long insert(String str, String str2, ContentValues contentValues) {
        try {
            return insertWithOnConflict(str, str2, contentValues, 0);
        } catch (SQLException unused) {
            Objects.toString(contentValues);
            return -1;
        }
    }

    public long insertOrThrow(String str, String str2, ContentValues contentValues) throws SQLException {
        return insertWithOnConflict(str, str2, contentValues, 0);
    }

    public long insertWithOnConflict(String str, String str2, ContentValues contentValues, int i) {
        int i2;
        SQLiteStatement sQLiteStatement;
        String str3;
        String str4;
        acquireReference();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("INSERT");
            sb.append(CONFLICT_VALUES[i]);
            sb.append(" INTO ");
            sb.append(str);
            sb.append('(');
            Object[] objArr = null;
            if (contentValues == null || contentValues.size() <= 0) {
                i2 = 0;
            } else {
                i2 = contentValues.size();
            }
            if (i2 > 0) {
                objArr = new Object[i2];
                int i3 = 0;
                for (Map.Entry next : contentValues.valueSet()) {
                    if (i3 > 0) {
                        str4 = AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR;
                    } else {
                        str4 = "";
                    }
                    sb.append(str4);
                    sb.append((String) next.getKey());
                    objArr[i3] = next.getValue();
                    i3++;
                }
                sb.append(')');
                sb.append(" VALUES (");
                for (int i4 = 0; i4 < i2; i4++) {
                    if (i4 > 0) {
                        str3 = ",?";
                    } else {
                        str3 = "?";
                    }
                    sb.append(str3);
                }
            } else {
                sb.append(str2 + ") VALUES (NULL");
            }
            sb.append(')');
            sQLiteStatement = new SQLiteStatement(this, sb.toString(), objArr);
            long executeInsert = sQLiteStatement.executeInsert();
            sQLiteStatement.close();
            releaseReference();
            return executeInsert;
        } catch (Throwable th) {
            releaseReference();
            throw th;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008b, code lost:
        if (r2 != null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008d, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0090, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0096, code lost:
        releaseReference();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0099, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r0 = new java.util.ArrayList();
        r0.add(new android.util.Pair("main", getPath()));
        r0 = r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x002c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isDatabaseIntegrityOk() {
        /*
            r5 = this;
            r5.acquireReference()
            java.util.List r0 = r5.getAttachedDbs()     // Catch:{ SQLiteException -> 0x002c }
            if (r0 == 0) goto L_0x000a
            goto L_0x003f
        L_0x000a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ SQLiteException -> 0x002c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x002c }
            r1.<init>()     // Catch:{ SQLiteException -> 0x002c }
            java.lang.String r2 = "databaselist for: "
            r1.append(r2)     // Catch:{ SQLiteException -> 0x002c }
            java.lang.String r2 = r5.getPath()     // Catch:{ SQLiteException -> 0x002c }
            r1.append(r2)     // Catch:{ SQLiteException -> 0x002c }
            java.lang.String r2 = " couldn't be retrieved. probably because the database is closed"
            r1.append(r2)     // Catch:{ SQLiteException -> 0x002c }
            java.lang.String r1 = r1.toString()     // Catch:{ SQLiteException -> 0x002c }
            r0.<init>(r1)     // Catch:{ SQLiteException -> 0x002c }
            throw r0     // Catch:{ SQLiteException -> 0x002c }
        L_0x002a:
            r0 = move-exception
            goto L_0x0096
        L_0x002c:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x002a }
            r0.<init>()     // Catch:{ all -> 0x002a }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ all -> 0x002a }
            java.lang.String r2 = "main"
            java.lang.String r3 = r5.getPath()     // Catch:{ all -> 0x002a }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x002a }
            r0.add(r1)     // Catch:{ all -> 0x002a }
        L_0x003f:
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x002a }
        L_0x0043:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0091
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x002a }
            android.util.Pair r1 = (android.util.Pair) r1     // Catch:{ all -> 0x002a }
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x008a }
            r3.<init>()     // Catch:{ all -> 0x008a }
            java.lang.String r4 = "PRAGMA "
            r3.append(r4)     // Catch:{ all -> 0x008a }
            java.lang.Object r4 = r1.first     // Catch:{ all -> 0x008a }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x008a }
            r3.append(r4)     // Catch:{ all -> 0x008a }
            java.lang.String r4 = ".integrity_check(1);"
            r3.append(r4)     // Catch:{ all -> 0x008a }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x008a }
            com.moovit.database.sqlite.SQLiteStatement r2 = r5.compileStatement((java.lang.String) r3)     // Catch:{ all -> 0x008a }
            java.lang.String r3 = r2.simpleQueryForString()     // Catch:{ all -> 0x008a }
            java.lang.String r4 = "ok"
            boolean r3 = r3.equalsIgnoreCase(r4)     // Catch:{ all -> 0x008a }
            if (r3 != 0) goto L_0x0086
            java.lang.Object r0 = r1.second     // Catch:{ all -> 0x008a }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x008a }
            r0 = 0
            r2.close()     // Catch:{ all -> 0x002a }
            r5.releaseReference()
            return r0
        L_0x0086:
            r2.close()     // Catch:{ all -> 0x002a }
            goto L_0x0043
        L_0x008a:
            r0 = move-exception
            if (r2 == 0) goto L_0x0090
            r2.close()     // Catch:{ all -> 0x002a }
        L_0x0090:
            throw r0     // Catch:{ all -> 0x002a }
        L_0x0091:
            r5.releaseReference()
            r0 = 1
            return r0
        L_0x0096:
            r5.releaseReference()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.database.sqlite.SQLiteDatabase.isDatabaseIntegrityOk():boolean");
    }

    public boolean isDbLockedByCurrentThread() {
        acquireReference();
        try {
            return getThreadSession().hasConnection();
        } finally {
            releaseReference();
        }
    }

    public /* bridge */ /* synthetic */ boolean isExecPerConnectionSQLSupported() {
        return false;
    }

    public boolean isInMemoryDatabase() {
        boolean isInMemoryDb;
        synchronized (this.mLock) {
            isInMemoryDb = this.mConfigurationLocked.isInMemoryDb();
        }
        return isInMemoryDb;
    }

    public boolean isOpen() {
        boolean z;
        synchronized (this.mLock) {
            if (this.mConnectionPoolLocked != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public boolean isReadOnly() {
        boolean isReadOnlyLocked;
        synchronized (this.mLock) {
            isReadOnlyLocked = isReadOnlyLocked();
        }
        return isReadOnlyLocked;
    }

    public boolean isWriteAheadLoggingEnabled() {
        boolean z;
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            if ((this.mConfigurationLocked.openFlags & ENABLE_WRITE_AHEAD_LOGGING) != 0) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public long longForQuery(String str, String[] strArr) {
        SQLiteStatement compileStatement = compileStatement(str);
        try {
            return longForQuery(compileStatement, strArr);
        } finally {
            compileStatement.close();
        }
    }

    public boolean needUpgrade(int i) {
        return i > getVersion();
    }

    public void onAllReferencesReleased() {
        dispose(false);
    }

    public void onCorruption() {
        EventLog.writeEvent(EVENT_DB_CORRUPT, getLabel());
        this.mErrorHandler.onCorruption(this);
    }

    public Cursor query(boolean z, String str, String[] strArr, String str2, Object[] objArr, String str3, String str4, String str5, String str6) {
        return queryWithFactory((CursorFactory) null, z, str, strArr, str2, objArr, str3, str4, str5, str6, (C5802d) null);
    }

    public long queryNumEntries(String str) {
        return queryNumEntries(str, (String) null, (String[]) null);
    }

    public Cursor queryWithFactory(CursorFactory cursorFactory, boolean z, String str, String[] strArr, String str2, Object[] objArr, String str3, String str4, String str5, String str6) {
        return queryWithFactory(cursorFactory, z, str, strArr, str2, objArr, str3, str4, str5, str6, (C5802d) null);
    }

    public Cursor rawQuery(String str, Object[] objArr) {
        return rawQueryWithFactory((CursorFactory) null, str, objArr, (String) null, (C5802d) null);
    }

    public Cursor rawQueryWithFactory(CursorFactory cursorFactory, String str, Object[] objArr, String str2) {
        return rawQueryWithFactory(cursorFactory, str, objArr, str2, (C5802d) null);
    }

    public void reopenReadWrite() {
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            if (isReadOnlyLocked()) {
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfigurationLocked;
                int i = sQLiteDatabaseConfiguration.openFlags;
                sQLiteDatabaseConfiguration.openFlags = i & -2;
                try {
                    this.mConnectionPoolLocked.reconfigure(sQLiteDatabaseConfiguration);
                } catch (RuntimeException e) {
                    this.mConfigurationLocked.openFlags = i;
                    throw e;
                }
            }
        }
    }

    public long replace(String str, String str2, ContentValues contentValues) {
        try {
            return insertWithOnConflict(str, str2, contentValues, 5);
        } catch (SQLException unused) {
            Objects.toString(contentValues);
            return -1;
        }
    }

    public long replaceOrThrow(String str, String str2, ContentValues contentValues) throws SQLException {
        return insertWithOnConflict(str, str2, contentValues, 5);
    }

    public void setForeignKeyConstraintsEnabled(boolean z) {
        boolean z2;
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfigurationLocked;
            if (sQLiteDatabaseConfiguration.foreignKeyConstraintsEnabled != z) {
                sQLiteDatabaseConfiguration.foreignKeyConstraintsEnabled = z;
                try {
                    this.mConnectionPoolLocked.reconfigure(sQLiteDatabaseConfiguration);
                } catch (RuntimeException e) {
                    SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = this.mConfigurationLocked;
                    if (!z) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    sQLiteDatabaseConfiguration2.foreignKeyConstraintsEnabled = z2;
                    throw e;
                }
            }
        }
    }

    public void setLocale(Locale locale) {
        if (locale != null) {
            synchronized (this.mLock) {
                throwIfNotOpenLocked();
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfigurationLocked;
                Locale locale2 = sQLiteDatabaseConfiguration.locale;
                sQLiteDatabaseConfiguration.locale = locale;
                try {
                    this.mConnectionPoolLocked.reconfigure(sQLiteDatabaseConfiguration);
                } catch (RuntimeException e) {
                    this.mConfigurationLocked.locale = locale2;
                    throw e;
                }
            }
            return;
        }
        throw new IllegalArgumentException("locale must not be null.");
    }

    public void setMaxSqlCacheSize(int i) {
        if (i > 100 || i < 0) {
            throw new IllegalStateException("expected value between 0 and 100");
        }
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfigurationLocked;
            int i2 = sQLiteDatabaseConfiguration.maxSqlCacheSize;
            sQLiteDatabaseConfiguration.maxSqlCacheSize = i;
            try {
                this.mConnectionPoolLocked.reconfigure(sQLiteDatabaseConfiguration);
            } catch (RuntimeException e) {
                this.mConfigurationLocked.maxSqlCacheSize = i2;
                throw e;
            }
        }
    }

    public long setMaximumSize(long j) {
        long pageSize = getPageSize();
        long j2 = j / pageSize;
        if (j % pageSize != 0) {
            j2++;
        }
        return longForQuery("PRAGMA max_page_count = " + j2, (String[]) null) * pageSize;
    }

    public void setPageSize(long j) {
        execSQL("PRAGMA page_size = " + j);
    }

    public void setTransactionSuccessful() {
        acquireReference();
        try {
            getThreadSession().setTransactionSuccessful();
        } finally {
            releaseReference();
        }
    }

    public void setVersion(int i) {
        execSQL("PRAGMA user_version = " + i);
    }

    public String stringForQuery(String str, String[] strArr) {
        SQLiteStatement compileStatement = compileStatement(str);
        try {
            return stringForQuery(compileStatement, strArr);
        } finally {
            compileStatement.close();
        }
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("SQLiteDatabase: ");
        k.append(getPath());
        return k.toString();
    }

    public int update(String str, ContentValues contentValues, String str2, String[] strArr) {
        return updateWithOnConflict(str, contentValues, str2, strArr, 0);
    }

    public int updateWithOnConflict(String str, ContentValues contentValues, String str2, String[] strArr, int i) {
        int i2;
        SQLiteStatement sQLiteStatement;
        String str3;
        if (contentValues == null || contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        acquireReference();
        try {
            StringBuilder sb = new StringBuilder(120);
            sb.append("UPDATE ");
            sb.append(CONFLICT_VALUES[i]);
            sb.append(str);
            sb.append(" SET ");
            int size = contentValues.size();
            if (strArr == null) {
                i2 = size;
            } else {
                i2 = strArr.length + size;
            }
            Object[] objArr = new Object[i2];
            int i3 = 0;
            for (Map.Entry next : contentValues.valueSet()) {
                if (i3 > 0) {
                    str3 = AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR;
                } else {
                    str3 = "";
                }
                sb.append(str3);
                sb.append((String) next.getKey());
                objArr[i3] = next.getValue();
                sb.append("=?");
                i3++;
            }
            if (strArr != null) {
                for (int i4 = size; i4 < i2; i4++) {
                    objArr[i4] = strArr[i4 - size];
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                sb.append(" WHERE ");
                sb.append(str2);
            }
            sQLiteStatement = new SQLiteStatement(this, sb.toString(), objArr);
            int executeUpdateDelete = sQLiteStatement.executeUpdateDelete();
            sQLiteStatement.close();
            releaseReference();
            return executeUpdateDelete;
        } catch (Throwable th) {
            releaseReference();
            throw th;
        }
    }

    public void validateSql(String str, C5802d dVar) {
        getThreadSession().prepare(str, getThreadDefaultConnectionFlags(true), dVar, (SQLiteStatementInfo) null);
    }

    public boolean yieldIfContendedSafely() {
        return yieldIfContendedHelper(true, -1);
    }

    private void beginTransaction(SQLiteTransactionListener sQLiteTransactionListener, int i) {
        acquireReference();
        try {
            getThreadSession().beginTransaction(i, sQLiteTransactionListener, getThreadDefaultConnectionFlags(false), (C5802d) null);
        } finally {
            releaseReference();
        }
    }

    public static SQLiteDatabase openDatabase(String str, CursorFactory cursorFactory, int i, DatabaseErrorHandler databaseErrorHandler) {
        SQLiteDatabase sQLiteDatabase = new SQLiteDatabase(new SQLiteDatabaseConfiguration(str, i), cursorFactory, databaseErrorHandler);
        sQLiteDatabase.open();
        return sQLiteDatabase;
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, CursorFactory cursorFactory) {
        return openDatabase(str, cursorFactory, 6, (DatabaseErrorHandler) null);
    }

    public void addFunction(String str, int i, Function function, int i2) {
        SQLiteFunction sQLiteFunction = new SQLiteFunction(str, i, function, i2);
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            this.mConfigurationLocked.functions.add(sQLiteFunction);
            try {
                this.mConnectionPoolLocked.reconfigure(this.mConfigurationLocked);
            } catch (RuntimeException e) {
                this.mConfigurationLocked.functions.remove(sQLiteFunction);
                throw e;
            }
        }
    }

    public SQLiteStatement compileStatement(String str) throws SQLException {
        acquireReference();
        try {
            return new SQLiteStatement(this, str, (Object[]) null);
        } finally {
            releaseReference();
        }
    }

    public void execSQL(String str, Object[] objArr) throws SQLException {
        if (objArr != null) {
            executeSql(str, objArr);
            return;
        }
        throw new IllegalArgumentException("Empty bindArgs");
    }

    public Cursor query(boolean z, String str, String[] strArr, String str2, Object[] objArr, String str3, String str4, String str5, String str6, C5802d dVar) {
        return queryWithFactory((CursorFactory) null, z, str, strArr, str2, objArr, str3, str4, str5, str6, dVar);
    }

    public long queryNumEntries(String str, String str2) {
        return queryNumEntries(str, str2, (String[]) null);
    }

    public Cursor queryWithFactory(CursorFactory cursorFactory, boolean z, String str, String[] strArr, String str2, Object[] objArr, String str3, String str4, String str5, String str6, C5802d dVar) {
        acquireReference();
        try {
            return rawQueryWithFactory(cursorFactory, SQLiteQueryBuilder.buildQueryString(z, str, strArr, str2, str3, str4, str5, str6), objArr, findEditTable(str), dVar);
        } finally {
            releaseReference();
        }
    }

    public Cursor rawQuery(String str, Object[] objArr, C5802d dVar) {
        return rawQueryWithFactory((CursorFactory) null, str, objArr, (String) null, dVar);
    }

    public Cursor rawQueryWithFactory(CursorFactory cursorFactory, String str, Object[] objArr, String str2, C5802d dVar) {
        acquireReference();
        try {
            SQLiteDirectCursorDriver sQLiteDirectCursorDriver = new SQLiteDirectCursorDriver(this, str, str2, dVar);
            if (cursorFactory == null) {
                cursorFactory = this.mCursorFactory;
            }
            return sQLiteDirectCursorDriver.query(cursorFactory, objArr);
        } finally {
            releaseReference();
        }
    }

    public int update(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
        int i2;
        SQLiteStatement sQLiteStatement;
        if (contentValues == null || contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        acquireReference();
        try {
            StringBuilder sb = new StringBuilder(120);
            sb.append("UPDATE ");
            sb.append(CONFLICT_VALUES[i]);
            sb.append(str);
            sb.append(" SET ");
            int size = contentValues.size();
            if (objArr == null) {
                i2 = size;
            } else {
                i2 = objArr.length + size;
            }
            Object[] objArr2 = new Object[i2];
            int i3 = 0;
            for (Map.Entry next : contentValues.valueSet()) {
                sb.append(i3 > 0 ? AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR : "");
                sb.append((String) next.getKey());
                objArr2[i3] = next.getValue();
                sb.append("=?");
                i3++;
            }
            if (objArr != null) {
                for (int i4 = size; i4 < i2; i4++) {
                    objArr2[i4] = objArr[i4 - size];
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                sb.append(" WHERE ");
                sb.append(str2);
            }
            sQLiteStatement = new SQLiteStatement(this, sb.toString(), objArr2);
            int executeUpdateDelete = sQLiteStatement.executeUpdateDelete();
            sQLiteStatement.close();
            releaseReference();
            return executeUpdateDelete;
        } catch (Throwable th) {
            releaseReference();
            throw th;
        }
    }

    public boolean yieldIfContendedSafely(long j) {
        return yieldIfContendedHelper(true, j);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        return openDatabase(str, cursorFactory, 6, databaseErrorHandler);
    }

    public long insert(String str, int i, ContentValues contentValues) throws SQLException {
        return insertWithOnConflict(str, (String) null, contentValues, i);
    }

    public Cursor query(String str, String[] strArr, String str2, Object[] objArr, String str3, String str4, String str5) {
        return query(false, str, strArr, str2, objArr, str3, str4, str5, (String) null);
    }

    public long queryNumEntries(String str, String str2, String[] strArr) {
        return longForQuery(C13437d.m33706k("select count(*) from ", str, !TextUtils.isEmpty(str2) ? C25541a.m63881k(" where ", str2) : ""), strArr);
    }

    public Cursor query(String str, String[] strArr, String str2, Object[] objArr, String str3, String str4, String str5, String str6) {
        return query(false, str, strArr, str2, objArr, str3, str4, str5, str6);
    }

    public static ParcelFileDescriptor blobFileDescriptorForQuery(SQLiteStatement sQLiteStatement, String[] strArr) {
        sQLiteStatement.bindAllArgsAsStrings(strArr);
        return sQLiteStatement.simpleQueryForBlobFileDescriptor();
    }

    private static long longForQuery(SQLiteStatement sQLiteStatement, String[] strArr) {
        sQLiteStatement.bindAllArgsAsStrings(strArr);
        return sQLiteStatement.simpleQueryForLong();
    }

    public static SQLiteDatabase openDatabase(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        SQLiteDatabase sQLiteDatabase = new SQLiteDatabase(sQLiteDatabaseConfiguration, cursorFactory, databaseErrorHandler);
        sQLiteDatabase.open();
        return sQLiteDatabase;
    }

    public static String stringForQuery(SQLiteStatement sQLiteStatement, String[] strArr) {
        sQLiteStatement.bindAllArgsAsStrings(strArr);
        return sQLiteStatement.simpleQueryForString();
    }

    public Cursor query(String str) {
        return rawQueryWithFactory((CursorFactory) null, str, (Object[]) null, (String) null, (C5802d) null);
    }

    public Cursor query(String str, Object[] objArr) {
        return rawQueryWithFactory((CursorFactory) null, str, objArr, (String) null, (C5802d) null);
    }

    public Cursor query(C6684e eVar) {
        return query(eVar, (C5802d) null);
    }

    public Cursor query(C6684e eVar, CancellationSignal cancellationSignal) {
        final C5802d dVar = new C5802d();
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() {
            public void onCancel() {
                dVar.mo21671a();
            }
        });
        return query(eVar, dVar);
    }

    public int delete(String str, String str2, Object[] objArr) {
        SQLiteStatement sQLiteStatement;
        String str3;
        acquireReference();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("DELETE FROM ");
            sb.append(str);
            if (!TextUtils.isEmpty(str2)) {
                str3 = " WHERE " + str2;
            } else {
                str3 = "";
            }
            sb.append(str3);
            sQLiteStatement = new SQLiteStatement(this, sb.toString(), objArr);
            int executeUpdateDelete = sQLiteStatement.executeUpdateDelete();
            sQLiteStatement.close();
            releaseReference();
            return executeUpdateDelete;
        } catch (Throwable th) {
            releaseReference();
            throw th;
        }
    }

    public Cursor query(final C6684e eVar, C5802d dVar) {
        return rawQueryWithFactory(new CursorFactory() {
            public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                eVar.mo22145c(sQLiteQuery);
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, eVar.mo22147e(), new String[0], (String) null, dVar);
    }
}
