package s00;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import c00.C13717b;
import ce0.C21100e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.moovit.database.DatabaseHelper;
import com.moovit.database.DatabaseUtils;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.network.model.ServerId;
import java.util.ArrayList;
import java.util.Iterator;
import p435de.C16596f;
import v00.C20062a;
import v00.C20063b;

/* renamed from: s00.f */
public final class C19393f {

    /* renamed from: q */
    public static final C19393f f49325q = new C19393f();

    /* renamed from: r */
    public static final Object f49326r = new Object();

    /* renamed from: a */
    public final C20062a f49327a;

    /* renamed from: b */
    public final C20062a f49328b;

    /* renamed from: c */
    public final C20062a f49329c;

    /* renamed from: d */
    public final C20062a f49330d;

    /* renamed from: e */
    public final C20062a f49331e;

    /* renamed from: f */
    public final C20063b f49332f = new C20063b("line_search_fts_locale");

    /* renamed from: g */
    public final C20063b f49333g = new C20063b("stop_search_fts_locale");

    /* renamed from: h */
    public final C20063b f49334h = new C20063b("custom_poi_search_fts_locale");

    /* renamed from: i */
    public final C20062a f49335i;

    /* renamed from: j */
    public final C20062a f49336j;

    /* renamed from: k */
    public final C20062a f49337k;

    /* renamed from: l */
    public final C20062a f49338l;

    /* renamed from: m */
    public final C20062a f49339m;

    /* renamed from: n */
    public final C20062a f49340n;

    /* renamed from: o */
    public final C20062a f49341o;

    /* renamed from: p */
    public final C20062a f49342p;

    public C19393f() {
        Boolean bool = Boolean.FALSE;
        this.f49327a = new C20062a("metro_info_data_loaded", bool);
        this.f49328b = new C20062a("line_search_data_loaded", bool);
        this.f49329c = new C20062a("custom_poi_search_data_loaded", bool);
        this.f49330d = new C20062a("stop_map_items_data_loaded", bool);
        this.f49331e = new C20062a("syncable_transit_line_group_ids_data_loaded", bool);
        this.f49335i = new C20062a("gtfs_line_groups", bool);
        this.f49336j = new C20062a("gtfs_stops", bool);
        this.f49337k = new C20062a("gtfs_patterns", bool);
        this.f49338l = new C20062a("gtfs_bicycle_stops", bool);
        this.f49339m = new C20062a("gtfs_shapes", bool);
        this.f49340n = new C20062a("gtfs_shapes", bool);
        this.f49341o = new C20062a("gtfs_frequencies", bool);
        this.f49342p = new C20062a("gtfs_remote_images", bool);
    }

    /* renamed from: a */
    public static long m46691a(SQLiteDatabase sQLiteDatabase, ServerId serverId) {
        long c = m46693c(sQLiteDatabase, serverId);
        long d = m46694d(sQLiteDatabase, serverId);
        if (c == d) {
            return c;
        }
        String createSelection = DatabaseUtils.createSelection("metro_id", "revision");
        String[] createSelectionArgs = DatabaseUtils.createSelectionArgs(serverId.mo19751c(), Long.toString(d));
        ContentValues contentValues = new ContentValues();
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.TRUE);
        sQLiteDatabase.update("revisions", contentValues, createSelection, createSelectionArgs);
        String[] createSelectionArgs2 = DatabaseUtils.createSelectionArgs(serverId.mo19751c(), Long.toString(c));
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.FALSE);
        sQLiteDatabase.update("revisions", contentValues2, createSelection, createSelectionArgs2);
        C16596f a = C16596f.m42113a();
        a.mo49363b("Metro id=" + serverId + ", unactivated revision=" + c + ", activated revision=" + d);
        return d;
    }

    /* renamed from: b */
    public static void m46692b(Context context) {
        C21100e.m49355o();
        synchronized (f49326r) {
            SQLiteDatabase readableDatabase = DatabaseHelper.get(context).getReadableDatabase();
            f49325q.getClass();
            Iterator it = m46695e(readableDatabase).iterator();
            while (it.hasNext()) {
                ServerId serverId = (ServerId) it.next();
                long c = m46693c(readableDatabase, serverId);
                if (c != -1) {
                    long d = m46694d(readableDatabase, serverId);
                    Iterator it2 = m46696f(readableDatabase, serverId).iterator();
                    while (it2.hasNext()) {
                        Long l = (Long) it2.next();
                        if (l.longValue() != c) {
                            if (l.longValue() != d) {
                                long longValue = l.longValue();
                                C21100e.m49355o();
                                new C19392e(context, serverId, longValue).run();
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public static long m46693c(SQLiteDatabase sQLiteDatabase, ServerId serverId) {
        long j;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT revision FROM revisions WHERE metro_id = ? AND active = 1 ORDER BY revision DESC LIMIT 1;", DatabaseUtils.createSelectionArgs(serverId.mo19751c()));
        if (rawQuery.moveToFirst()) {
            j = rawQuery.getLong(rawQuery.getColumnIndex("revision"));
        } else {
            j = -1;
        }
        rawQuery.close();
        return j;
    }

    /* renamed from: d */
    public static long m46694d(SQLiteDatabase sQLiteDatabase, ServerId serverId) {
        long j;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT revision FROM revisions WHERE metro_id = ? AND deprecated = 0 ORDER BY revision DESC LIMIT 1;", DatabaseUtils.createSelectionArgs(serverId.mo19751c()));
        if (rawQuery.moveToFirst()) {
            j = rawQuery.getLong(rawQuery.getColumnIndex("revision"));
        } else {
            j = -1;
        }
        rawQuery.close();
        return j;
    }

    /* renamed from: e */
    public static ArrayList m46695e(SQLiteDatabase sQLiteDatabase) {
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT metro_id FROM revisions GROUP BY metro_id", new String[0]);
        int columnIndex = rawQuery.getColumnIndex("metro_id");
        ArrayList arrayList = new ArrayList(rawQuery.getCount());
        while (rawQuery.moveToNext()) {
            arrayList.add(new ServerId(rawQuery.getInt(columnIndex)));
        }
        rawQuery.close();
        return arrayList;
    }

    /* renamed from: f */
    public static ArrayList m46696f(SQLiteDatabase sQLiteDatabase, ServerId serverId) {
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT revision FROM revisions WHERE metro_id = ? ORDER BY revision ASC;", DatabaseUtils.createSelectionArgs(serverId.mo19751c()));
        int columnIndex = rawQuery.getColumnIndex("revision");
        ArrayList arrayList = new ArrayList(rawQuery.getCount());
        while (rawQuery.moveToNext()) {
            arrayList.add(Long.valueOf(rawQuery.getLong(columnIndex)));
        }
        rawQuery.close();
        C13717b.m34269p(arrayList);
        return arrayList;
    }

    /* renamed from: g */
    public static void m46697g(SQLiteDatabase sQLiteDatabase, ServerId serverId, long j) {
        C16596f a = C16596f.m42113a();
        a.mo49363b("Insert new revision " + j + " for metro id " + serverId);
        ContentValues contentValues = new ContentValues();
        contentValues.put("metro_id", Integer.valueOf(serverId.f15142b));
        contentValues.put("revision", Long.valueOf(j));
        sQLiteDatabase.insertWithOnConflict("revisions", (String) null, contentValues, 4);
        sQLiteDatabase.execSQL("UPDATE revisions SET deprecated= CASE revision WHEN ? THEN 0 ELSE 1 END WHERE metro_id = ?;", DatabaseUtils.createSelectionArgs(Long.toString(j), serverId.mo19751c()));
    }
}
