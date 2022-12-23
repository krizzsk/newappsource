package com.vungle.warren.persistence;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.ContextWrapper;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import ce0.C21105j;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.persistence.C23192a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public final class DatabaseHelper extends SQLiteOpenHelper {

    /* renamed from: c */
    public static final /* synthetic */ int f58871c = 0;

    /* renamed from: b */
    public final C23190a f58872b;

    public static class DBException extends Exception {
        public DBException(String str) {
            super(str);
        }
    }

    /* renamed from: com.vungle.warren.persistence.DatabaseHelper$a */
    public interface C23190a {
    }

    /* renamed from: com.vungle.warren.persistence.DatabaseHelper$b */
    public static class C23191b extends ContextWrapper {
        public C23191b(Context context) {
            super(context);
        }

        @SuppressLint({"NewApi"})
        public final File getDatabasePath(String str) {
            File databasePath = super.getDatabasePath(str);
            File file = new File(getApplicationContext().getNoBackupFilesDir(), str);
            try {
                C21105j.m49397b(new File(databasePath.getPath()));
                C21105j.m49397b(new File(databasePath.getPath() + "-journal"));
            } catch (IOException unused) {
                int i = DatabaseHelper.f58871c;
                VungleLogger.m57029b("DatabaseHelper", "Failed to delete old db/-journal");
            }
            return file;
        }

        public final SQLiteDatabase openOrCreateDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory) {
            String path = getDatabasePath(str).getPath();
            int i2 = 0;
            int i3 = ((i & 8) != 0 ? com.moovit.database.sqlite.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 0) | 268435456;
            if ((i & 16) != 0) {
                i2 = 16;
            }
            return SQLiteDatabase.openDatabase(path, cursorFactory, i3 | i2);
        }

        public final SQLiteDatabase openOrCreateDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
            String path = getDatabasePath(str).getPath();
            int i2 = 0;
            int i3 = ((i & 8) != 0 ? com.moovit.database.sqlite.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 0) | 268435456;
            if ((i & 16) != 0) {
                i2 = 16;
            }
            return SQLiteDatabase.openDatabase(path, cursorFactory, i3 | i2, databaseErrorHandler);
        }
    }

    static {
        Class<DatabaseHelper> cls = DatabaseHelper.class;
    }

    public DatabaseHelper(Context context, C23192a.C23208o oVar) {
        super(new C23191b(context.getApplicationContext()), "vungle_db", (SQLiteDatabase.CursorFactory) null, 11);
        this.f58872b = oVar;
    }

    /* renamed from: e */
    public final synchronized SQLiteDatabase mo58264e() {
        return getWritableDatabase();
    }

    public final synchronized void onCreate(SQLiteDatabase sQLiteDatabase) {
        ((C23192a.C23208o) this.f58872b).mo58304a(sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C23192a.C23208o oVar = (C23192a.C23208o) this.f58872b;
        oVar.getClass();
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM sqlite_master WHERE type='table'", (String[]) null);
        while (rawQuery != null && rawQuery.moveToNext()) {
            String string = rawQuery.getString(1);
            if (!string.equals("android_metadata") && !string.startsWith("sqlite_")) {
                arrayList.add(string);
            }
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + ((String) it.next()));
        }
        oVar.mo58304a(sQLiteDatabase);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        ((C23192a.C23208o) this.f58872b).getClass();
        if (i < 2) {
            sQLiteDatabase.execSQL("ALTER TABLE report ADD COLUMN status INTEGER DEFAULT 1");
        }
        if (i < 3) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS vision_data(_id INTEGER PRIMARY KEY AUTOINCREMENT, timestamp NUMERIC, creative TEXT, campaign TEXT, advertiser TEXT )");
            sQLiteDatabase.execSQL("ALTER TABLE report ADD COLUMN ad_size TEXT ");
            sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN tt_download NUMERIC DEFAULT -1");
            sQLiteDatabase.execSQL("ALTER TABLE placement ADD COLUMN ad_size TEXT ");
            sQLiteDatabase.execSQL("ALTER TABLE placement ADD COLUMN refresh_duration NUMERIC DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE placement ADD COLUMN supported_template_types NUMERIC DEFAULT 0");
        }
        if (i < 4) {
            sQLiteDatabase.execSQL("ALTER TABLE placement ADD COLUMN header_bidding SHORT ");
            sQLiteDatabase.execSQL("ALTER TABLE report ADD COLUMN header_bidding SHORT ");
        }
        if (i < 5) {
            sQLiteDatabase.execSQL("ALTER TABLE placement ADD COLUMN autocache_priority NUMERIC DEFAULT 2147483647");
            sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN asset_download_timestamp NUMERIC DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN asset_download_duration NUMERIC DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN ad_request_start_time NUMERIC DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE report ADD COLUMN init_timestamp NUMERIC DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE report ADD COLUMN asset_download_duration NUMERIC DEFAULT 0");
        }
        if (i < 6) {
            sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN column_enable_om_sdk NUMERIC DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN column_om_sdk_extra_vast TEXT ");
        }
        if (i < 7) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS analytic_url(_id INTEGER PRIMARY KEY AUTOINCREMENT,  item_id TEXT UNIQUE)");
        }
        if (i < 8) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS cache_bust(_id INTEGER PRIMARY KEY AUTOINCREMENT, item_id TEXT UNIQUE, id TEXT, time_window_end INTEGER, id_type INTEGER, event_ids TEXT, timestamp_processed INTEGER )");
            sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN column_request_timestamp NUMERIC DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE placement ADD COLUMN max_hb_cache NUMERIC DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE placement ADD COLUMN recommended_ad_size TEXT ");
        }
        if (i < 9) {
            sQLiteDatabase.execSQL("ALTER TABLE report ADD COLUMN play_remote_url SHORT DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN column_assets_fully_downloaded SHORT DEFAULT 0");
        }
        if (i < 10) {
            sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN column_click_coordinates_enabled SHORT DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN column_deep_link TEXT ");
            sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN column_notifications TEXT ");
        }
        if (i < 11) {
            sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN column_header_bidding SHORT DEFAULT 0");
        }
    }
}
