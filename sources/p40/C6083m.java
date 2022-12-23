package p40;

import a20.C13388b;
import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import c00.C13719c;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.moovit.database.DatabaseUtils;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.database.sqlite.SQLiteStatement;
import com.moovit.image.C16019d;
import com.moovit.image.C16028g;
import com.moovit.image.model.ImageRef;
import com.moovit.network.model.ServerId;
import com.moovit.transit.C7841a;
import com.tranzmate.moovit.protocol.gtfs.MVLineGroupSummaryType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashSet;
import l40.C5605d;
import p001a0.C0017h;
import p241s0.C6302b;
import p389bl.C13641g;
import p834tz.C19794a;
import s00.C19393f;
import v00.C20062a;

/* renamed from: p40.m */
public final class C6083m extends C6071e {

    /* renamed from: p40.m$a */
    public static class C6084a extends C5605d.C5608c {

        /* renamed from: a */
        public final SQLiteStatement f19330a;

        /* renamed from: b */
        public final SQLiteStatement f19331b;

        /* renamed from: c */
        public final SparseArray<ImageRef> f19332c = new SparseArray<>(25);

        /* renamed from: d */
        public final SparseIntArray f19333d = new SparseIntArray(25);

        /* renamed from: e */
        public final C6302b f19334e = new C6302b(25);

        /* renamed from: f */
        public final ByteArrayOutputStream f19335f = new ByteArrayOutputStream(512);

        public C6084a(SQLiteDatabase sQLiteDatabase, int i, long j) {
            StringBuilder k = C13555b.m33972k("INSERT ");
            k.append(DatabaseUtils.getConflictAlgorithm(4));
            k.append(" INTO ");
            k.append("line_groups");
            k.append('(');
            k.append("metro_id");
            C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "revision", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "line_group_id");
            C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "line_group_type", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "agency_id");
            C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "line_number", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "primary_caption");
            C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "secondary_caption", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "line_color");
            C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "image_ref_set_data", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "inner_image_ids_data");
            k.append(") VALUES (?,?,?,?,?,?,?,?,?,?,?);");
            SQLiteStatement compileStatement = sQLiteDatabase.compileStatement(k.toString());
            this.f19330a = compileStatement;
            StringBuilder k2 = C13555b.m33972k("INSERT ");
            k2.append(DatabaseUtils.getConflictAlgorithm(4));
            k2.append(" INTO ");
            k2.append("lines");
            k2.append('(');
            k2.append("metro_id");
            C0017h.m61R(k2, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "revision", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "line_id");
            C0017h.m61R(k2, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "line_group_id", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "line_group_order_index");
            C0017h.m61R(k2, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "line_origin", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "line_destination");
            C0017h.m61R(k2, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "line_long_name", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "line_direction_name");
            k2.append(") VALUES (?,?,?,?,?,?,?,?,?);");
            SQLiteStatement compileStatement2 = sQLiteDatabase.compileStatement(k2.toString());
            this.f19331b = compileStatement2;
            long j2 = (long) i;
            compileStatement.bindLong(1, j2);
            compileStatement.bindLong(2, j);
            compileStatement2.bindLong(1, j2);
            compileStatement2.bindLong(2, j);
        }

        /* renamed from: a */
        public final void mo21442a() {
        }

        /* renamed from: b */
        public final void mo21443b() {
            this.f19330a.bindBlob(10, C13641g.m34111C(new C13388b(this.f19332c, false), C16019d.m40803a().f41721g, this.f19335f));
        }

        /* renamed from: c */
        public final void mo21444c() {
            this.f19330a.bindBlob(11, C13641g.m34111C(this.f19333d, C19794a.f50325c, this.f19335f));
        }

        /* renamed from: d */
        public final void mo21445d() {
        }

        /* renamed from: e */
        public final void mo21446e(int i, int i2) {
            this.f19332c.put(i, C16028g.m40826d(Integer.valueOf(i2)));
        }

        /* renamed from: f */
        public final void mo21447f() {
            this.f19332c.clear();
        }

        /* renamed from: g */
        public final void mo21448g(int i, int i2) {
            this.f19333d.put(i, i2);
        }

        /* renamed from: h */
        public final void mo21449h() {
            this.f19333d.clear();
        }

        /* renamed from: i */
        public final void mo21450i(int i, int i2, int i3, String str, String str2, String str3, byte b) {
            this.f19331b.bindLong(3, (long) i2);
            this.f19331b.bindLong(4, (long) i);
            this.f19331b.bindLong(5, (long) i3);
            if (str != null) {
                this.f19331b.bindString(6, str);
            } else {
                this.f19331b.bindNull(6);
            }
            this.f19331b.bindString(7, str2);
            if (str3 != null) {
                this.f19331b.bindString(8, str3);
            } else {
                this.f19331b.bindNull(8);
            }
            String str4 = (String) this.f19334e.getOrDefault(Byte.valueOf(b), null);
            if (str4 != null) {
                this.f19331b.bindString(9, str4);
            } else {
                this.f19331b.bindNull(9);
            }
            this.f19331b.executeInsert();
        }

        /* renamed from: j */
        public final void mo21451j(int i, String str, int i2, int i3, String str2, String str3, int i4) {
            this.f19330a.bindLong(3, (long) i);
            SQLiteStatement sQLiteStatement = this.f19330a;
            MVLineGroupSummaryType findByValue = MVLineGroupSummaryType.findByValue(i4);
            C13719c cVar = C7841a.f23766a;
            int i5 = 1;
            if (C7841a.C7842a.f23773e[findByValue.ordinal()] == 1) {
                i5 = 2;
            }
            sQLiteStatement.bindLong(4, (long) i5);
            this.f19330a.bindLong(5, (long) i2);
            this.f19330a.bindString(6, str);
            if (str2 != null) {
                this.f19330a.bindString(7, str2);
            } else {
                this.f19330a.bindNull(7);
            }
            if (str3 != null) {
                this.f19330a.bindString(8, str3);
            } else {
                this.f19330a.bindNull(8);
            }
            if (i3 != 0) {
                this.f19330a.bindLong(9, (long) i3);
            } else {
                this.f19330a.bindNull(9);
            }
        }

        /* renamed from: k */
        public final void mo21452k() {
            this.f19330a.executeInsert();
        }

        /* renamed from: l */
        public final void mo21453l(byte b, String str) {
            this.f19334e.put(Byte.valueOf(b), str);
        }

        /* renamed from: m */
        public final void mo21454m() {
            this.f19334e.clear();
        }
    }

    public C6083m() {
        super(2);
    }

    /* renamed from: b */
    public final HashSet mo20294b(Context context) {
        HashSet b = super.mo20294b(context);
        b.add("GTFS_REMOTE_IMAGES_PARSER_LOADER");
        return b;
    }

    /* renamed from: q */
    public final C20062a mo22056q(C19393f fVar) {
        return fVar.f49335i;
    }

    /* renamed from: s */
    public final void mo22057s(Context context, ServerId serverId, long j, SQLiteDatabase sQLiteDatabase, C5605d dVar) throws IOException {
        dVar.mo21434b(new C6084a(sQLiteDatabase, serverId.f15142b, j));
    }
}
