package p40;

import android.content.Context;
import android.util.SparseArray;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.database.DatabaseUtils;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.database.sqlite.SQLiteStatement;
import com.moovit.image.C16019d;
import com.moovit.image.C16028g;
import com.moovit.image.model.Image;
import com.moovit.image.model.ImageSet;
import com.moovit.map.items.C16284b;
import com.moovit.network.model.ServerId;
import com.moovit.transit.C7841a;
import com.moovit.transit.TransitStopPathway;
import com.tranzmate.moovit.protocol.gtfs.MVPathwayType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import l40.C5605d;
import p001a0.C0017h;
import p389bl.C13641g;
import p810sz.C19576b;
import s00.C19393f;
import v00.C20062a;

/* renamed from: p40.o */
public final class C6088o extends C6071e {

    /* renamed from: p40.o$a */
    public static class C6089a extends C5605d.C5614i {

        /* renamed from: a */
        public final SQLiteStatement f19340a;

        /* renamed from: b */
        public final SQLiteStatement f19341b;

        /* renamed from: c */
        public final SparseArray<Image> f19342c = new SparseArray<>();

        /* renamed from: d */
        public final ArrayList<TransitStopPathway> f19343d = new ArrayList<>(25);

        /* renamed from: e */
        public final C19576b<TransitStopPathway> f19344e = new C19576b<>(TransitStopPathway.f23746f, true);

        /* renamed from: f */
        public final ByteArrayOutputStream f19345f = new ByteArrayOutputStream(512);

        /* renamed from: g */
        public int f19346g = 0;

        public C6089a(SQLiteDatabase sQLiteDatabase, int i, long j) {
            SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
            long j2 = j;
            StringBuilder k = C13555b.m33972k("INSERT ");
            k.append(DatabaseUtils.getConflictAlgorithm(4));
            k.append(" INTO ");
            k.append("stops");
            k.append('(');
            k.append("metro_id");
            C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "revision", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "stop_id");
            C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "stop_name", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "stop_lat");
            C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "stop_lon", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "stop_code");
            C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "stop_image_data", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "stop_map_images_data");
            C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "stop_pathways_data", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "stop_main_transit_type_id");
            k.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append("stop_amenities");
            k.append(") VALUES (?,?,?,?,?,?,?,?,?,?,?,?);");
            SQLiteStatement compileStatement = sQLiteDatabase2.compileStatement(k.toString());
            this.f19340a = compileStatement;
            StringBuilder k2 = C13555b.m33972k("INSERT ");
            k2.append(DatabaseUtils.getConflictAlgorithm(4));
            k2.append(" INTO ");
            k2.append("stops_lines");
            k2.append('(');
            k2.append("metro_id");
            C0017h.m61R(k2, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "revision", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "stop_id");
            C0017h.m61R(k2, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "line_id", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "platform_name");
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k2.append("line_order_index");
            k2.append(") VALUES (?,?,?,?,?,?);");
            SQLiteStatement compileStatement2 = sQLiteDatabase2.compileStatement(k2.toString());
            this.f19341b = compileStatement2;
            long j3 = (long) i;
            compileStatement.bindLong(1, j3);
            compileStatement.bindLong(2, j2);
            compileStatement2.bindLong(1, j3);
            compileStatement2.bindLong(2, j2);
        }

        /* renamed from: a */
        public final void mo21460a(String str, int i, int i2, int i3, int i4, int i5, String str2) {
            long j = (long) i;
            this.f19340a.bindLong(3, j);
            this.f19340a.bindString(4, str2);
            this.f19340a.bindLong(5, (long) i3);
            this.f19340a.bindLong(6, (long) i4);
            if (str != null) {
                this.f19340a.bindString(7, str);
            } else {
                this.f19340a.bindNull(7);
            }
            this.f19340a.bindLong(11, (long) i2);
            this.f19340a.bindLong(12, (long) i5);
            this.f19341b.bindLong(3, j);
        }

        /* renamed from: b */
        public final void mo21461b() {
            C16284b.m41532r(this.f19342c);
            this.f19340a.bindBlob(9, C13641g.m34111C(new ImageSet(this.f19342c, false), C16019d.m40803a().f41719e, this.f19345f));
        }

        /* renamed from: c */
        public final void mo21462c() {
            this.f19340a.bindBlob(10, C13641g.m34111C(this.f19343d, this.f19344e, this.f19345f));
            this.f19340a.executeInsert();
        }

        /* renamed from: d */
        public final void mo21463d() {
        }

        /* renamed from: e */
        public final void mo21464e(String[] strArr, int i, int i2) {
            this.f19342c.put(i, C16028g.m40832j(i2, strArr));
        }

        /* renamed from: f */
        public final void mo21465f() {
            this.f19342c.clear();
        }

        /* renamed from: g */
        public final void mo21466g() {
            this.f19343d.clear();
        }

        /* renamed from: h */
        public final void mo21467h(String str, int i, int i2, int i3, int i4) {
            this.f19343d.add(new TransitStopPathway(new ServerId(i), C7841a.m17869g(MVPathwayType.findByValue(i2)), str, new LatLonE6(i3, i4)));
        }

        /* renamed from: i */
        public final void mo21468i(int i) {
            this.f19341b.bindLong(4, (long) i);
            SQLiteStatement sQLiteStatement = this.f19341b;
            int i2 = this.f19346g;
            this.f19346g = i2 + 1;
            sQLiteStatement.bindLong(6, (long) i2);
            this.f19341b.executeInsert();
        }

        /* renamed from: j */
        public final void mo21469j() {
            this.f19346g = 0;
        }

        /* renamed from: k */
        public final void mo21470k(String str) {
            if (str == null) {
                this.f19341b.bindNull(5);
            } else {
                this.f19341b.bindString(5, str);
            }
        }

        /* renamed from: l */
        public final void mo21471l(int i, String[] strArr) {
            Image j = C16028g.m40832j(i, strArr);
            if (j != null) {
                this.f19340a.bindBlob(8, C13641g.m34111C(j, C16019d.m40803a().f41718d, this.f19345f));
                return;
            }
            this.f19340a.bindNull(8);
        }

        /* renamed from: m */
        public final void mo21472m(int i) {
        }
    }

    public C6088o() {
        super(4);
    }

    /* renamed from: b */
    public final HashSet mo20294b(Context context) {
        HashSet b = super.mo20294b(context);
        b.add("GTFS_REMOTE_IMAGES_PARSER_LOADER");
        b.add("GTFS_LINE_GROUPS_PARSER_LOADER");
        return b;
    }

    /* renamed from: q */
    public final C20062a mo22056q(C19393f fVar) {
        return fVar.f49336j;
    }

    /* renamed from: s */
    public final void mo22057s(Context context, ServerId serverId, long j, SQLiteDatabase sQLiteDatabase, C5605d dVar) throws IOException {
        dVar.mo21437e(new C6089a(sQLiteDatabase, serverId.f15142b, j));
    }
}
