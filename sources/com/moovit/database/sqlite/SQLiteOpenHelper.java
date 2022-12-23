package com.moovit.database.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import com.moovit.database.DatabaseErrorHandler;
import com.moovit.database.sqlite.SQLiteDatabase;
import p098g9.C4851d;
import p098g9.C4853f;
import p269u2.C6679c;

public abstract class SQLiteOpenHelper implements C6679c {
    private static final boolean DEBUG_STRICT_READONLY = false;
    /* access modifiers changed from: private */
    public static final String TAG = "SQLiteOpenHelper";
    private final Context mContext;
    private SQLiteDatabase mDatabase;
    private boolean mEnableWriteAheadLogging;
    private final DatabaseErrorHandler mErrorHandler;
    private final SQLiteDatabase.CursorFactory mFactory;
    private boolean mIsInitializing;
    private final String mName;
    private final int mNewVersion;

    static {
        Class<SQLiteOpenHelper> cls = SQLiteOpenHelper.class;
    }

    public SQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        this(context, str, cursorFactory, i, (DatabaseErrorHandler) null);
    }

    private SQLiteDatabase getDatabaseLocked(boolean z) {
        SQLiteDatabase openDatabase;
        int i;
        SQLiteDatabase sQLiteDatabase = this.mDatabase;
        if (sQLiteDatabase != null) {
            if (!sQLiteDatabase.isOpen()) {
                this.mDatabase = null;
            } else if (!z || !this.mDatabase.isReadOnly()) {
                return this.mDatabase;
            }
        }
        if (!this.mIsInitializing) {
            SQLiteDatabase sQLiteDatabase2 = this.mDatabase;
            try {
                this.mIsInitializing = true;
                if (sQLiteDatabase2 == null) {
                    String str = this.mName;
                    if (str == null) {
                        openDatabase = SQLiteDatabase.create((SQLiteDatabase.CursorFactory) null);
                    } else {
                        String path = this.mContext.getDatabasePath(str).getPath();
                        if (this.mEnableWriteAheadLogging) {
                            i = SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
                        } else {
                            i = 0;
                        }
                        openDatabase = SQLiteDatabase.openDatabase(createConfiguration(path, i | 6), this.mFactory, this.mErrorHandler);
                    }
                    sQLiteDatabase2 = openDatabase;
                } else if (sQLiteDatabase2.isReadOnly()) {
                    sQLiteDatabase2.reopenReadWrite();
                }
            } catch (SQLiteException e) {
                if (!z) {
                    openDatabase = SQLiteDatabase.openDatabase(createConfiguration(this.mContext.getDatabasePath(this.mName).getPath(), 1), this.mFactory, this.mErrorHandler);
                } else {
                    throw e;
                }
            } catch (Throwable th) {
                this.mIsInitializing = false;
                if (!(sQLiteDatabase2 == null || sQLiteDatabase2 == this.mDatabase)) {
                    sQLiteDatabase2.close();
                }
                throw th;
            }
            onConfigure(sQLiteDatabase2);
            int version = sQLiteDatabase2.getVersion();
            if (version != this.mNewVersion) {
                if (!sQLiteDatabase2.isReadOnly()) {
                    sQLiteDatabase2.beginTransaction();
                    if (version == 0) {
                        onCreate(sQLiteDatabase2);
                    } else {
                        int i2 = this.mNewVersion;
                        if (version > i2) {
                            onDowngrade(sQLiteDatabase2, version, i2);
                        } else {
                            onUpgrade(sQLiteDatabase2, version, i2);
                        }
                    }
                    sQLiteDatabase2.setVersion(this.mNewVersion);
                    sQLiteDatabase2.setTransactionSuccessful();
                    sQLiteDatabase2.endTransaction();
                } else {
                    throw new SQLiteException("Can't upgrade read-only database from version " + sQLiteDatabase2.getVersion() + " to " + this.mNewVersion + ": " + this.mName);
                }
            }
            onOpen(sQLiteDatabase2);
            boolean isReadOnly = sQLiteDatabase2.isReadOnly();
            this.mDatabase = sQLiteDatabase2;
            this.mIsInitializing = false;
            return sQLiteDatabase2;
        }
        throw new IllegalStateException("getDatabase called recursively");
    }

    private static void loadNativeLibrary(Context context) {
        C158541 r0 = new C4851d() {
            public void log(String str) {
                String unused = SQLiteOpenHelper.TAG;
            }
        };
        C4853f fVar = new C4853f();
        fVar.f16281d = r0;
        if (context != null) {
            fVar.mo20339c("Beginning load of %s...", "sqlite3x");
            fVar.mo20338b(context, "sqlite3x", (String) null);
            return;
        }
        throw new IllegalArgumentException("Given context is null");
    }

    public synchronized void close() {
        if (!this.mIsInitializing) {
            SQLiteDatabase sQLiteDatabase = this.mDatabase;
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                this.mDatabase.close();
                this.mDatabase = null;
            }
        } else {
            throw new IllegalStateException("Closed during initialization");
        }
    }

    public SQLiteDatabaseConfiguration createConfiguration(String str, int i) {
        return new SQLiteDatabaseConfiguration(str, i);
    }

    public String getDatabaseName() {
        return this.mName;
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
    }

    public abstract void onCreate(SQLiteDatabase sQLiteDatabase);

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        throw new SQLiteException(C13715c.m34244j("Can't downgrade database from version ", i, " to ", i2));
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
    }

    public abstract void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2);

    public void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this) {
            if (this.mEnableWriteAheadLogging != z) {
                SQLiteDatabase sQLiteDatabase = this.mDatabase;
                if (sQLiteDatabase != null && sQLiteDatabase.isOpen() && !this.mDatabase.isReadOnly()) {
                    if (z) {
                        this.mDatabase.enableWriteAheadLogging();
                    } else {
                        this.mDatabase.disableWriteAheadLogging();
                    }
                }
                this.mEnableWriteAheadLogging = z;
            }
        }
    }

    public SQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i, DatabaseErrorHandler databaseErrorHandler) {
        if (i >= 1) {
            this.mContext = context;
            this.mName = str;
            this.mFactory = cursorFactory;
            this.mNewVersion = i;
            this.mErrorHandler = databaseErrorHandler;
            loadNativeLibrary(context);
            return;
        }
        throw new IllegalArgumentException(C16759e.m42349e("Version must be >= 1, was ", i));
    }

    public SQLiteDatabase getReadableDatabase() {
        SQLiteDatabase databaseLocked;
        synchronized (this) {
            databaseLocked = getDatabaseLocked(false);
        }
        return databaseLocked;
    }

    public SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase databaseLocked;
        synchronized (this) {
            databaseLocked = getDatabaseLocked(true);
        }
        return databaseLocked;
    }
}
