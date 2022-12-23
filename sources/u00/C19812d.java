package u00;

import android.content.Context;
import android.content.res.Configuration;
import android.database.Cursor;
import ce0.C21100e;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.moovit.MoovitApplication;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.database.DatabaseHelper;
import com.moovit.database.DatabaseJobQueue;
import com.moovit.database.DatabaseUtils;
import com.moovit.database.StatementHelper;
import com.moovit.database.Tables$CustomPOISearchFts;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.database.sqlite.SQLiteStatement;
import com.moovit.image.C16019d;
import com.moovit.image.C16028g;
import com.moovit.image.model.Image;
import com.moovit.network.model.ServerId;
import com.moovit.transit.LocationDescriptor;
import com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams;
import com.tranzmate.moovit.protocol.search.MVPOISearchItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import p001a0.C0017h;
import p389bl.C13641g;
import p898wr.C20400b;
import p977zz.C20943i;
import p977zz.C20975x0;
import s00.C19393f;
import u00.C19806a;
import x00.C20440a;

/* renamed from: u00.d */
public final class C19812d extends C19806a {

    /* renamed from: b */
    public static final String f50349b;

    /* renamed from: c */
    public static final StatementHelper f50350c = StatementHelper.newInsertHelper("custom_poi_data", 5, "metro_id", "revision", "poi_data_id", "poi_data_image", "poi_data_title", "poi_data_subtitle", "poi_data_lat", "poi_data_lon");

    /* renamed from: d */
    public static final StatementHelper f50351d = StatementHelper.newDeleteHelper("custom_poi_data", "metro_id", "revision");

    /* renamed from: e */
    public static StatementHelper f50352e = new StatementHelper("DELETE FROM custom_poi_fts WHERE rowid IN (SELECT rowid FROM custom_poi_data WHERE custom_poi_data.metro_id = ? AND custom_poi_data.revision = ?)", StatementHelper.EMPTY_COLUMNS, new String[]{"metro_id", "revision"});

    /* renamed from: u00.d$a */
    public static class C19813a extends C19806a.C19807a {

        /* renamed from: d */
        public final List<MVPOISearchItem> f50353d;

        public C19813a(Context context, ServerId serverId, long j, List<MVPOISearchItem> list) {
            super(context, serverId, j);
            C21100e.m49373x(list, "mvPoiSearchItems");
            this.f50353d = list;
        }

        /* renamed from: a */
        public final void mo52111a(Context context, ServerId serverId, long j, SQLiteDatabase sQLiteDatabase) {
            int i = serverId.f15142b;
            SQLiteStatement prepare = C19812d.f50350c.prepare(sQLiteDatabase);
            for (MVPOISearchItem next : this.f50353d) {
                StatementHelper statementHelper = C19812d.f50350c;
                statementHelper.bindValue(prepare, "metro_id", (long) i);
                statementHelper.bindValue(prepare, "revision", j);
                statementHelper.bindValue(prepare, "poi_data_id", (long) next.siteId);
                MVImageReferenceWithParams mVImageReferenceWithParams = next.image;
                if (mVImageReferenceWithParams != null) {
                    statementHelper.bindValue(prepare, "poi_data_image", C13641g.m34110B(C16028g.m40829g(mVImageReferenceWithParams), C16019d.m40803a().f41718d));
                } else {
                    statementHelper.bindNullValue(prepare, "poi_data_image");
                }
                String str = next.title;
                if (str != null) {
                    statementHelper.bindValue(prepare, "poi_data_title", str);
                } else {
                    statementHelper.bindNullValue(prepare, "poi_data_title");
                }
                String str2 = next.subtitle;
                if (str2 != null) {
                    statementHelper.bindValue(prepare, "poi_data_subtitle", str2);
                } else {
                    statementHelper.bindNullValue(prepare, "poi_data_subtitle");
                }
                statementHelper.bindValue(prepare, "poi_data_lat", (long) next.location.latitude);
                statementHelper.bindValue(prepare, "poi_data_lon", (long) next.location.longitude);
                prepare.executeInsert();
            }
        }
    }

    /* renamed from: u00.d$b */
    public static class C19814b extends C19806a.C19807a {
        public C19814b(Context context, ServerId serverId, long j) {
            super(context, serverId, j);
        }

        /* renamed from: a */
        public final void mo52111a(Context context, ServerId serverId, long j, SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(C19812d.f50349b, DatabaseUtils.createSelectionArgs(serverId.mo19751c(), Long.toString(j)));
            sQLiteDatabase.execSQL(Tables$CustomPOISearchFts.rebuild());
        }
    }

    static {
        StringBuilder k = C13555b.m33972k("INSERT ");
        k.append(DatabaseUtils.getConflictAlgorithm(5));
        k.append(" INTO ");
        k.append("custom_poi_fts");
        k.append('(');
        k.append("rowid");
        C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "poi_title", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "poi_subtitle");
        C0017h.m61R(k, ") SELECT ", "rowid", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "poi_data_title");
        C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "poi_data_subtitle", " FROM ", "custom_poi_data");
        C0017h.m61R(k, " WHERE ", "metro_id", " = ? AND ", "revision");
        k.append(" = ?;");
        f50349b = k.toString();
    }

    public C19812d(C20400b bVar) {
        super(bVar);
    }

    /* renamed from: h */
    public static ArrayList m47265h(Cursor cursor) {
        Image image;
        String str;
        List list;
        Cursor cursor2 = cursor;
        int columnIndex = cursor2.getColumnIndex("poi_data_id");
        int columnIndex2 = cursor2.getColumnIndex("poi_data_image");
        int columnIndex3 = cursor2.getColumnIndex("poi_data_title");
        int columnIndex4 = cursor2.getColumnIndex("poi_data_subtitle");
        int columnIndex5 = cursor2.getColumnIndex("poi_data_lat");
        int columnIndex6 = cursor2.getColumnIndex("poi_data_lon");
        ArrayList arrayList = new ArrayList(cursor.getCount());
        while (cursor.moveToNext()) {
            ServerId serverId = new ServerId(cursor2.getInt(columnIndex));
            if (!cursor2.isNull(columnIndex2)) {
                image = (Image) C13641g.m34120h(cursor2.getBlob(columnIndex2), C16019d.m40803a().f41718d);
            } else {
                image = null;
            }
            if (!cursor2.isNull(columnIndex3)) {
                str = cursor2.getString(columnIndex3);
            } else {
                str = null;
            }
            if (!cursor2.isNull(columnIndex4)) {
                list = Collections.singletonList(new C20440a((CharSequence) cursor2.getString(columnIndex4), (String) null));
            } else {
                list = null;
            }
            arrayList.add(new LocationDescriptor(LocationDescriptor.LocationType.POI, LocationDescriptor.SourceType.LOCATION_SEARCH, serverId, (String) null, str, list, new LatLonE6(cursor2.getInt(columnIndex5), cursor2.getInt(columnIndex6)), (LatLonE6) null, image, (Image) null));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo6588a(Context context) {
        SQLiteDatabase writableDatabase = DatabaseHelper.get(context).getWritableDatabase();
        ServerId d = mo52107d();
        long f = mo52109f();
        SQLiteStatement prepare = f50352e.prepare(writableDatabase);
        f50352e.bindWhereArg(prepare, "metro_id", d);
        f50352e.bindWhereArg(prepare, "revision", f);
        prepare.executeUpdateDelete();
        Objects.toString(d);
        StatementHelper statementHelper = f50351d;
        SQLiteStatement prepare2 = statementHelper.prepare(writableDatabase);
        statementHelper.bindWhereArg(prepare2, "metro_id", d);
        statementHelper.bindWhereArg(prepare2, "revision", f);
        prepare2.executeUpdateDelete();
        Objects.toString(d);
    }

    /* renamed from: b */
    public final void mo51798b(Configuration configuration) {
        MoovitApplication<?, ?, ?> moovitApplication = MoovitApplication.f37317k;
        if (!C20975x0.m49118e(C20943i.m49050c(configuration), (Locale) C19393f.f49325q.f49334h.mo52326c(DatabaseHelper.get(moovitApplication).getReadableDatabase(), mo52107d(), mo52109f()))) {
            DatabaseJobQueue.get().postJob(new C19814b(moovitApplication, mo52107d(), mo52109f()));
        }
    }
}
