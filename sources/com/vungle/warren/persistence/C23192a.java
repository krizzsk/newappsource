package com.vungle.warren.persistence;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Environment;
import android.text.TextUtils;
import ce0.C21105j;
import ce0.C21120u;
import com.usebutton.sdk.internal.util.DiskLruCache;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.persistence.DatabaseHelper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import od0.C24543a;
import od0.C24544b;
import od0.C24545c;
import od0.C24547d;
import od0.C24554e;
import od0.C24555f;
import od0.C24557h;
import od0.C24558i;
import od0.C24559j;
import od0.C24560k;
import od0.C24566m;
import od0.C24567n;
import od0.C24568o;
import od0.C24570p;
import od0.C24573q;
import od0.C24574r;
import od0.C24575s;
import od0.C24576t;
import td0.C24931b;
import td0.C24932c;
import td0.C24935e;
import td0.C24946p;

/* renamed from: com.vungle.warren.persistence.a */
public final class C23192a {

    /* renamed from: f */
    public static final /* synthetic */ int f58873f = 0;

    /* renamed from: a */
    public DatabaseHelper f58874a;

    /* renamed from: b */
    public final C21120u f58875b;

    /* renamed from: c */
    public final ExecutorService f58876c;

    /* renamed from: d */
    public final C24932c f58877d;

    /* renamed from: e */
    public HashMap f58878e = new HashMap();

    /* renamed from: com.vungle.warren.persistence.a$a */
    public class C23193a implements Callable<List<C24545c>> {

        /* renamed from: b */
        public final /* synthetic */ String f58879b;

        /* renamed from: c */
        public final /* synthetic */ String f58880c;

        public C23193a(String str, String str2) {
            this.f58879b = str;
            this.f58880c = str2;
        }

        public final Object call() throws Exception {
            String[] strArr;
            C23192a aVar = C23192a.this;
            String str = this.f58879b;
            String str2 = this.f58880c;
            aVar.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("placement_id = ? AND ");
            sb.append("(state = ? OR ");
            sb.append("state = ?) AND ");
            sb.append("expire_time > ?");
            if (str2 != null) {
                sb.append(" AND item_id = ?");
                strArr = new String[]{str, String.valueOf(1), String.valueOf(0), String.valueOf(System.currentTimeMillis() / 1000), str2};
            } else {
                strArr = new String[]{str, String.valueOf(1), String.valueOf(0), String.valueOf(System.currentTimeMillis() / 1000)};
            }
            String sb2 = sb.toString();
            C24547d dVar = (C24547d) aVar.f58878e.get(C24545c.class);
            ArrayList arrayList = new ArrayList();
            Cursor query = aVar.f58874a.mo58264e().query("advertisement", (String[]) null, sb2, strArr, (String) null, (String) null, "state DESC", (String) null);
            if (query != null) {
                while (dVar != null) {
                    try {
                        if (!query.moveToNext()) {
                            break;
                        }
                        ContentValues contentValues = new ContentValues();
                        DatabaseUtils.cursorRowToContentValues(query, contentValues);
                        arrayList.add(dVar.mo60803c(contentValues));
                    } catch (Exception e) {
                        VungleLogger.m57029b("findValidAdvertisementsForPlacementFromDB", e.toString());
                        arrayList = new ArrayList();
                    } catch (Throwable th) {
                        query.close();
                        throw th;
                    }
                }
                query.close();
            }
            return arrayList;
        }
    }

    /* renamed from: com.vungle.warren.persistence.a$b */
    public class C23194b implements Callable<List<T>> {

        /* renamed from: b */
        public final /* synthetic */ Class f58882b;

        public C23194b(Class cls) {
            this.f58882b = cls;
        }

        public final Object call() throws Exception {
            return C23192a.this.mo58285t(this.f58882b);
        }
    }

    /* renamed from: com.vungle.warren.persistence.a$c */
    public class C23195c implements Callable<List<C24543a>> {

        /* renamed from: b */
        public final /* synthetic */ String f58884b;

        public C23195c(String str) {
            this.f58884b = str;
        }

        public final Object call() throws Exception {
            C23192a aVar = C23192a.this;
            String str = this.f58884b;
            aVar.getClass();
            return aVar.mo58276k(C24543a.class, aVar.f58874a.mo58264e().query("adAsset", (String[]) null, "ad_identifier = ? ", new String[]{str}, (String) null, (String) null, (String) null, (String) null));
        }
    }

    /* renamed from: com.vungle.warren.persistence.a$d */
    public class C23196d implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ Object f58886b;

        public C23196d(Object obj) {
            this.f58886b = obj;
        }

        public final Object call() throws Exception {
            C23192a.this.mo58275j(this.f58886b);
            return null;
        }
    }

    /* renamed from: com.vungle.warren.persistence.a$e */
    public class C23197e implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ String f58888b;

        public C23197e(String str) {
            this.f58888b = str;
        }

        public final Object call() throws Exception {
            C23192a.m57220b(C23192a.this, this.f58888b);
            return null;
        }
    }

    /* renamed from: com.vungle.warren.persistence.a$f */
    public class C23198f implements Callable<Collection<C24566m>> {
        public C23198f() {
        }

        public final Object call() throws Exception {
            List<C24566m> k;
            synchronized (C23192a.this) {
                k = C23192a.this.mo58276k(C24566m.class, C23192a.this.f58874a.mo58264e().query("placement", (String[]) null, "is_valid = ?", new String[]{DiskLruCache.VERSION_1}, (String) null, (String) null, (String) null, (String) null));
            }
            return k;
        }
    }

    /* renamed from: com.vungle.warren.persistence.a$g */
    public class C23199g implements Callable<File> {

        /* renamed from: b */
        public final /* synthetic */ String f58891b;

        public C23199g(String str) {
            this.f58891b = str;
        }

        public final Object call() throws Exception {
            return C23192a.this.f58877d.mo61489c(this.f58891b);
        }
    }

    /* renamed from: com.vungle.warren.persistence.a$h */
    public class C23200h implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ int f58893b;

        /* renamed from: c */
        public final /* synthetic */ C24545c f58894c;

        /* renamed from: d */
        public final /* synthetic */ String f58895d;

        public C23200h(int i, C24545c cVar, String str) {
            this.f58893b = i;
            this.f58894c = cVar;
            this.f58895d = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
            if (r2 != 5) goto L_0x003b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object call() throws java.lang.Exception {
            /*
                r5 = this;
                int r0 = com.vungle.warren.persistence.C23192a.f58873f
                od0.c r0 = r5.f58894c
                r0.getId()
                java.lang.String r0 = r5.f58895d
                od0.c r1 = r5.f58894c
                int r2 = r5.f58893b
                r1.f62192N = r2
                r3 = 0
                if (r2 == 0) goto L_0x0034
                r4 = 1
                if (r2 == r4) goto L_0x0034
                r4 = 2
                if (r2 == r4) goto L_0x002c
                r4 = 3
                if (r2 == r4) goto L_0x0022
                r4 = 4
                if (r2 == r4) goto L_0x0022
                r4 = 5
                if (r2 == r4) goto L_0x0034
                goto L_0x003b
            L_0x0022:
                com.vungle.warren.persistence.a r0 = com.vungle.warren.persistence.C23192a.this
                java.lang.String r1 = r1.getId()
                com.vungle.warren.persistence.C23192a.m57220b(r0, r1)
                goto L_0x003b
            L_0x002c:
                r1.f62193O = r3
                com.vungle.warren.persistence.a r0 = com.vungle.warren.persistence.C23192a.this
                com.vungle.warren.persistence.C23192a.m57223e(r0, r1)
                goto L_0x003b
            L_0x0034:
                r1.f62193O = r0
                com.vungle.warren.persistence.a r0 = com.vungle.warren.persistence.C23192a.this
                com.vungle.warren.persistence.C23192a.m57223e(r0, r1)
            L_0x003b:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.persistence.C23192a.C23200h.call():java.lang.Object");
        }
    }

    /* renamed from: com.vungle.warren.persistence.a$i */
    public class C23201i implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ Object f58897b;

        public C23201i(Object obj) {
            this.f58897b = obj;
        }

        public final Object call() throws Exception {
            C23192a.m57223e(C23192a.this, this.f58897b);
            return null;
        }
    }

    /* renamed from: com.vungle.warren.persistence.a$j */
    public class C23202j implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Object f58899b;

        /* renamed from: c */
        public final /* synthetic */ C23207n f58900c;

        /* renamed from: com.vungle.warren.persistence.a$j$a */
        public class C23203a implements Runnable {
            public C23203a() {
            }

            public final void run() {
                C23202j.this.f58900c.mo58121a();
            }
        }

        public C23202j(Object obj, C23207n nVar) {
            this.f58899b = obj;
            this.f58900c = nVar;
        }

        public final void run() {
            try {
                C23192a.m57223e(C23192a.this, this.f58899b);
                if (this.f58900c != null) {
                    C23192a.this.f58876c.execute(new C23203a());
                }
            } catch (DatabaseHelper.DBException e) {
                C23192a aVar = C23192a.this;
                C23207n nVar = this.f58900c;
                if (nVar != null) {
                    aVar.f58876c.execute(new C23213e(nVar, e));
                } else {
                    aVar.getClass();
                }
            }
        }
    }

    /* renamed from: com.vungle.warren.persistence.a$k */
    public class C23204k implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C23207n f58903b;

        public C23204k(C23207n nVar) {
            this.f58903b = nVar;
        }

        public final void run() {
            C23192a aVar = C23192a.this;
            C23207n nVar = this.f58903b;
            VungleException vungleException = new VungleException(39);
            if (nVar != null) {
                aVar.f58876c.execute(new C23213e(nVar, vungleException));
            } else {
                aVar.getClass();
            }
        }
    }

    /* renamed from: com.vungle.warren.persistence.a$l */
    public class C23205l implements Callable<C24545c> {

        /* renamed from: b */
        public final /* synthetic */ String f58905b;

        /* renamed from: c */
        public final /* synthetic */ String f58906c;

        public C23205l(String str, String str2) {
            this.f58905b = str;
            this.f58906c = str2;
        }

        public final Object call() throws Exception {
            String[] strArr;
            C23192a aVar = C23192a.this;
            String str = this.f58905b;
            String str2 = this.f58906c;
            aVar.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("placement_id = ? AND ");
            sb.append("(state = ? OR ");
            sb.append("state = ?) AND ");
            sb.append("expire_time > ?");
            if (str2 != null) {
                sb.append(" AND item_id = ?");
                strArr = new String[]{str, String.valueOf(1), String.valueOf(0), String.valueOf(System.currentTimeMillis() / 1000), str2};
            } else {
                strArr = new String[]{str, String.valueOf(1), String.valueOf(0), String.valueOf(System.currentTimeMillis() / 1000)};
            }
            String sb2 = sb.toString();
            Cursor query = aVar.f58874a.mo58264e().query("advertisement", (String[]) null, sb2, strArr, (String) null, (String) null, (String) null, DiskLruCache.VERSION_1);
            C24545c cVar = null;
            if (query != null) {
                try {
                    C24547d dVar = (C24547d) aVar.f58878e.get(C24545c.class);
                    if (dVar != null && query.moveToNext()) {
                        ContentValues contentValues = new ContentValues();
                        DatabaseUtils.cursorRowToContentValues(query, contentValues);
                        cVar = dVar.mo60803c(contentValues);
                    }
                } catch (Exception e) {
                    VungleLogger.m57029b("findValidAdvertisementForPlacementFromDB", e.toString());
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
                query.close();
            }
            return cVar;
        }
    }

    /* renamed from: com.vungle.warren.persistence.a$m */
    public interface C23206m<T> {
        /* renamed from: a */
        void mo58063a(T t);
    }

    /* renamed from: com.vungle.warren.persistence.a$n */
    public interface C23207n {
        /* renamed from: a */
        void mo58121a();

        void onError();
    }

    /* renamed from: com.vungle.warren.persistence.a$o */
    public static class C23208o implements DatabaseHelper.C23190a {

        /* renamed from: a */
        public final Context f58908a;

        public C23208o(Context context) {
            this.f58908a = context;
        }

        /* renamed from: a */
        public final void mo58304a(SQLiteDatabase sQLiteDatabase) {
            boolean z;
            this.f58908a.deleteDatabase("vungle");
            File externalFilesDir = this.f58908a.getExternalFilesDir((String) null);
            if (!Environment.getExternalStorageState().equals("mounted") || externalFilesDir == null) {
                z = false;
            } else {
                z = true;
            }
            if (z && externalFilesDir.exists()) {
                try {
                    C21105j.m49397b(new File(externalFilesDir, ".vungle"));
                } catch (IOException unused) {
                    int i = C23192a.f58873f;
                }
            }
            File filesDir = this.f58908a.getFilesDir();
            if (filesDir.exists()) {
                try {
                    C21105j.m49397b(new File(filesDir, "vungle"));
                } catch (IOException unused2) {
                    int i2 = C23192a.f58873f;
                }
            }
            try {
                C21105j.m49397b(new File(this.f58908a.getCacheDir() + File.separator + "downloads_vungle"));
            } catch (IOException unused3) {
                int i3 = C23192a.f58873f;
            }
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS advertisement(_id INTEGER PRIMARY KEY AUTOINCREMENT,  item_id TEXT UNIQUE, ad_config TEXT,ad_type INT, expire_time NUMERIC, delay NUMERIC, show_close_delay INT, show_close_incentivized INT, countdown INT, video_height INT, video_width INT, cta_overlay_enabled SHORT, cta_click_area NUMERIC, retry_count INT, requires_non_market_install SHORT, app_id TEXT, campaign TEXT, video_url TEXT, md5 TEXT, postroll_bundle_url TEXT, cta_destination_url TEXT, cta_url TEXT, ad_token TEXT, video_identifier TEXT, template_url TEXT, TEMPLATE_ID TEXT, TEMPLATE_TYPE TEXT, ad_market_id TEXT,bid_token TEXT,  checkpoints TEXT, template_settings TEXT, mraid_files TEXT, cacheable_assets TEXT, state INT, placement_id TEXT, tt_download NUMERIC,asset_download_timestamp NUMERIC,asset_download_duration NUMERIC,ad_request_start_time NUMERIC,column_enable_om_sdk SHORT,column_om_sdk_extra_vast TEXT,column_request_timestamp NUMERIC,column_click_coordinates_enabled SHORT,dynamic_events_and_urls TEXT, column_deep_link TEXT, column_notifications TEXT, column_assets_fully_downloaded SHORT, column_header_bidding SHORT)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS placement(_id INTEGER PRIMARY KEY AUTOINCREMENT, item_id TEXT UNIQUE, incentivized SHORT, auto_cached SHORT, is_valid SHORT, wakeup_time NUMERIC, header_bidding SHORT, refresh_duration NUMERIC, supported_template_types NUMERIC, ad_size TEXT, autocache_priority NUMERIC, max_hb_cache NUMERIC, recommended_ad_size TEXT)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS cookie(_id INTEGER PRIMARY KEY AUTOINCREMENT, item_id TEXT UNIQUE, bools TEXT, ints TEXT, longs TEXT, strings TEXT )");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS report(_id INTEGER PRIMARY KEY AUTOINCREMENT, item_id TEXT UNIQUE,appId TEXT, placementId TEXT, adToken TEXT, incentivized SHORT, header_bidding SHORT, adStartTime NUMERIC, url TEXT, ad_duration NUMERIC, tt_download NUMERIC, campaign TEXT, videoViewed NUMERIC, ad_type TEXT, template_id TEXT, was_CTAC_licked SHORT, clicked_through TEXT, errors TEXT, user_actions TEXT, user_id TEXT, ordinal INT, videoLength NUMERIC, status INT, ad_size TEXT, init_timestamp NUMERIC, asset_download_duration NUMERIC,play_remote_url SHORT )");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS adAsset ( _id INTEGER PRIMARY KEY AUTOINCREMENT, item_id TEXT UNIQUE, paren_id TEXT , ad_identifier TEXT NOT NULL, server_path TEXT, local_path TEXT NOT NULL, file_status SHORT, file_type SHORT, file_size INT, retry_count SHORT, retry_error SHORT, unique ( local_path, ad_identifier ));");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS vision_data(_id INTEGER PRIMARY KEY AUTOINCREMENT, timestamp NUMERIC, creative TEXT, campaign TEXT, advertiser TEXT )");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS analytic_url(_id INTEGER PRIMARY KEY AUTOINCREMENT,  item_id TEXT UNIQUE)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS cache_bust(_id INTEGER PRIMARY KEY AUTOINCREMENT, item_id TEXT UNIQUE, id TEXT, time_window_end INTEGER, id_type INTEGER, event_ids TEXT, timestamp_processed INTEGER )");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS session_data(_id INTEGER PRIMARY KEY AUTOINCREMENT, item_id TEXT UNIQUE,json_string TEXT, send_attempts INT)");
        }

        /* renamed from: b */
        public final void mo58305b(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS advertisement");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS cookie");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS placement");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS report");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS adAsset");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS vision_data");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS analytic_url");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS cache_bust");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS session_data");
        }
    }

    public C23192a(Context context, C24932c cVar, C21120u uVar, ExecutorService executorService) {
        Context applicationContext = context.getApplicationContext();
        this.f58875b = uVar;
        this.f58876c = executorService;
        this.f58874a = new DatabaseHelper(context, new C23208o(applicationContext));
        this.f58877d = cVar;
        this.f58878e.put(C24566m.class, new C24567n());
        this.f58878e.put(C24559j.class, new C24560k());
        this.f58878e.put(C24568o.class, new C24570p());
        this.f58878e.put(C24545c.class, new C24547d());
        this.f58878e.put(C24543a.class, new C24544b());
        this.f58878e.put(C24575s.class, new C24576t());
        this.f58878e.put(C24554e.class, new C24555f());
        this.f58878e.put(C24557h.class, new C24558i());
        this.f58878e.put(C24573q.class, new C24574r());
    }

    /* renamed from: a */
    public static Object m57219a(C23192a aVar, Class cls, String str) {
        C24931b bVar = (C24931b) aVar.f58878e.get(cls);
        Cursor query = aVar.f58874a.mo58264e().query(bVar.mo60802b(), (String[]) null, "item_id = ? ", new String[]{str}, (String) null, (String) null, (String) null, (String) null);
        Object obj = null;
        if (query != null) {
            try {
                if (query.moveToNext()) {
                    ContentValues contentValues = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(query, contentValues);
                    obj = bVar.mo60803c(contentValues);
                }
            } catch (Exception e) {
                VungleLogger.m57029b("loadModel", e.toString());
            } catch (Throwable th) {
                query.close();
                throw th;
            }
            query.close();
        }
        return obj;
    }

    /* renamed from: b */
    public static void m57220b(C23192a aVar, String str) throws DatabaseHelper.DBException {
        aVar.getClass();
        if (!TextUtils.isEmpty(str)) {
            String b = ((C24931b) aVar.f58878e.get(C24543a.class)).mo60802b();
            String[] strArr = {str};
            DatabaseHelper databaseHelper = aVar.f58874a;
            databaseHelper.getClass();
            try {
                databaseHelper.mo58264e().delete(b, "ad_identifier=?", strArr);
                aVar.mo58274i(C24545c.class, str);
                try {
                    aVar.f58877d.mo61490d(str);
                } catch (IOException unused) {
                }
            } catch (SQLException e) {
                throw new DatabaseHelper.DBException(e.getMessage());
            }
        }
    }

    /* renamed from: c */
    public static ArrayList m57221c(C23192a aVar) {
        String[] strArr = {DiskLruCache.VERSION_1};
        Cursor query = aVar.f58874a.mo58264e().query("placement", new String[]{"item_id"}, "is_valid = ?", strArr, (String) null, (String) null, (String) null, (String) null);
        ArrayList arrayList = new ArrayList();
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    arrayList.add(query.getString(query.getColumnIndex("item_id")));
                } catch (Exception e) {
                    VungleLogger.m57029b("loadValidPlacementIds", e.toString());
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            query.close();
        }
        return arrayList;
    }

    /* renamed from: d */
    public static ArrayList m57222d(C23192a aVar, String str) {
        aVar.getClass();
        String[] strArr = {str};
        ArrayList arrayList = new ArrayList();
        Cursor query = aVar.f58874a.mo58264e().query("advertisement", new String[]{"item_id"}, "placement_id=?", strArr, (String) null, (String) null, (String) null, (String) null);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    arrayList.add(query.getString(query.getColumnIndex("item_id")));
                } catch (Exception e) {
                    VungleLogger.m57029b("getAdsForPlacement", e.toString());
                    arrayList = new ArrayList();
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            query.close();
        }
        return arrayList;
    }

    /* renamed from: e */
    public static void m57223e(C23192a aVar, Object obj) throws DatabaseHelper.DBException {
        C24931b bVar = (C24931b) aVar.f58878e.get(obj.getClass());
        ContentValues a = bVar.mo60801a(obj);
        DatabaseHelper databaseHelper = aVar.f58874a;
        String b = bVar.mo60802b();
        databaseHelper.getClass();
        try {
            databaseHelper.mo58264e().insertWithOnConflict(b, (String) null, a, 5);
        } catch (SQLException e) {
            throw new DatabaseHelper.DBException(e.getMessage());
        }
    }

    /* renamed from: f */
    public final <T> void mo58271f(T t) throws DatabaseHelper.DBException {
        mo58287v(new C23196d(t));
    }

    /* renamed from: g */
    public final void mo58272g(String str) throws DatabaseHelper.DBException {
        mo58287v(new C23197e(str));
    }

    /* renamed from: h */
    public final <T> void mo58273h(Class<T> cls) {
        if (cls == C24545c.class) {
            for (C24545c id : mo58282q(C24545c.class).get()) {
                try {
                    mo58272g(id.getId());
                } catch (DatabaseHelper.DBException unused) {
                }
            }
            return;
        }
        for (T j : mo58282q(cls).get()) {
            try {
                mo58275j(j);
            } catch (DatabaseHelper.DBException unused2) {
            }
        }
    }

    /* renamed from: i */
    public final <T> void mo58274i(Class<T> cls, String str) throws DatabaseHelper.DBException {
        String b = ((C24931b) this.f58878e.get(cls)).mo60802b();
        String[] strArr = {str};
        DatabaseHelper databaseHelper = this.f58874a;
        databaseHelper.getClass();
        try {
            databaseHelper.mo58264e().delete(b, "item_id=?", strArr);
        } catch (SQLException e) {
            throw new DatabaseHelper.DBException(e.getMessage());
        }
    }

    /* renamed from: j */
    public final <T> void mo58275j(T t) throws DatabaseHelper.DBException {
        mo58274i(t.getClass(), ((C24931b) this.f58878e.get(t.getClass())).mo60801a(t).getAsString("item_id"));
    }

    /* renamed from: k */
    public final <T> List<T> mo58276k(Class<T> cls, Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        try {
            C24931b bVar = (C24931b) this.f58878e.get(cls);
            while (cursor.moveToNext()) {
                ContentValues contentValues = new ContentValues();
                DatabaseUtils.cursorRowToContentValues(cursor, contentValues);
                arrayList.add(bVar.mo60803c(contentValues));
            }
            return arrayList;
        } catch (Exception e) {
            VungleLogger.m57029b("extractModels", e.toString());
            return new ArrayList();
        } finally {
            cursor.close();
        }
    }

    /* renamed from: l */
    public final C24935e<C24545c> mo58277l(String str, String str2) {
        return new C24935e<>(this.f58875b.submit(new C23205l(str, str2)));
    }

    /* renamed from: m */
    public final C24935e<List<C24545c>> mo58278m(String str, String str2) {
        return new C24935e<>(this.f58875b.submit(new C23193a(str, str2)));
    }

    /* renamed from: n */
    public final C24935e<File> mo58279n(String str) {
        return new C24935e<>(this.f58875b.submit(new C23199g(str)));
    }

    /* renamed from: o */
    public final ArrayList mo58280o() {
        List<C24557h> t = mo58285t(C24557h.class);
        ArrayList arrayList = new ArrayList();
        for (C24557h next : t) {
            if (next.f62244e == 0) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: p */
    public final C24935e mo58281p(Class cls, String str) {
        return new C24935e(this.f58875b.submit(new C24946p(this, cls, str)));
    }

    /* renamed from: q */
    public final <T> C24935e<List<T>> mo58282q(Class<T> cls) {
        return new C24935e<>(this.f58875b.submit(new C23194b(cls)));
    }

    /* renamed from: r */
    public final List mo58283r(String str) {
        return mo58276k(C24543a.class, this.f58874a.mo58264e().query("adAsset", (String[]) null, "ad_identifier = ?  AND file_status = ? ", new String[]{str, String.valueOf(3)}, (String) null, (String) null, (String) null, (String) null));
    }

    /* renamed from: s */
    public final C24935e<List<C24543a>> mo58284s(String str) {
        return new C24935e<>(this.f58875b.submit(new C23195c(str)));
    }

    /* renamed from: t */
    public final <T> List<T> mo58285t(Class<T> cls) {
        C24931b bVar = (C24931b) this.f58878e.get(cls);
        if (bVar == null) {
            return Collections.EMPTY_LIST;
        }
        DatabaseHelper databaseHelper = this.f58874a;
        return mo58276k(cls, databaseHelper.mo58264e().query(bVar.mo60802b(), (String[]) null, (String) null, (String[]) null, (String) null, (String) null, (String) null, (String) null));
    }

    /* renamed from: u */
    public final C24935e<Collection<C24566m>> mo58286u() {
        return new C24935e<>(this.f58875b.submit(new C23198f()));
    }

    /* renamed from: v */
    public final void mo58287v(Callable<Void> callable) throws DatabaseHelper.DBException {
        try {
            this.f58875b.submit(callable).get();
        } catch (ExecutionException e) {
            if (e.getCause() instanceof DatabaseHelper.DBException) {
                throw ((DatabaseHelper.DBException) e.getCause());
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: w */
    public final <T> void mo58288w(T t) throws DatabaseHelper.DBException {
        mo58287v(new C23201i(t));
    }

    /* renamed from: x */
    public final <T> void mo58289x(T t, C23207n nVar, boolean z) {
        Future b = this.f58875b.mo53325b(new C23202j(t, nVar), new C23204k(nVar));
        if (z) {
            try {
                b.get();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (ExecutionException unused2) {
            }
        }
    }

    /* renamed from: y */
    public final void mo58290y(C24545c cVar, String str, int i) throws DatabaseHelper.DBException {
        mo58287v(new C23200h(i, cVar, str));
    }
}
