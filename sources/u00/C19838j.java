package u00;

import android.content.Context;
import android.database.Cursor;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.database.DatabaseHelper;
import com.moovit.database.DatabaseUtils;
import com.moovit.database.DbEntityRef;
import com.moovit.database.StatementHelper;
import com.moovit.database.Tables$StopSearchFts;
import com.moovit.database.Tokenizer;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.database.sqlite.SQLiteStatement;
import com.moovit.home.stops.search.SearchStopItem;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import p001a0.C0016g;
import p001a0.C0017h;
import p389bl.C13641g;
import p898wr.C20400b;
import p977zz.C20930c;
import p977zz.C20964s0;
import p977zz.C20975x0;
import s00.C19391d;
import s00.C19393f;
import u00.C19806a;

/* renamed from: u00.j */
public final class C19838j extends C19806a {

    /* renamed from: b */
    public static final String f50421b;

    /* renamed from: c */
    public static StatementHelper f50422c = new StatementHelper("DELETE FROM stop_search_fts WHERE rowid IN (SELECT rowid FROM stops WHERE stops.metro_id = ? AND stops.revision = ?)", StatementHelper.EMPTY_COLUMNS, new String[]{"metro_id", "revision"});

    /* renamed from: u00.j$a */
    public class C19839a extends C19806a.C19807a {
        public C19839a(Context context, ServerId serverId, long j) {
            super(context, serverId, j);
        }

        /* renamed from: a */
        public final void mo52111a(Context context, ServerId serverId, long j, SQLiteDatabase sQLiteDatabase) {
            List<TransitType> unmodifiableList;
            C19855r i = ((C19391d) C19838j.this.f49320a).mo51807i();
            synchronized (i) {
                i.mo52154h(context);
                unmodifiableList = Collections.unmodifiableList(i.f50474b);
            }
            String str = C19838j.f50421b;
            Object[] objArr = new Object[1];
            StringBuilder t = C0016g.m36t("CASE ", "stop_main_transit_type_id");
            for (TransitType transitType : unmodifiableList) {
                t.append(" WHEN ");
                t.append(transitType.f23757b.f15142b);
                t.append(" THEN ");
                t.append('\'');
                t.append(context.getString(transitType.f23758c));
                t.append('\'');
            }
            t.append(" END");
            objArr[0] = t.toString();
            String str2 = C20964s0.f52718a;
            sQLiteDatabase.execSQL(String.format((Locale) null, str, objArr), DatabaseUtils.createSelectionArgs(C19838j.this.mo52108e(), C19838j.this.mo52110g()));
            String optimize = Tables$StopSearchFts.optimize();
            if (optimize != null) {
                sQLiteDatabase.execSQL(optimize);
            }
        }
    }

    static {
        StringBuilder k = C13555b.m33972k("INSERT ");
        k.append(DatabaseUtils.getConflictAlgorithm(5));
        k.append(" INTO ");
        k.append("stop_search_fts");
        k.append('(');
        k.append("rowid");
        C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "transit_types", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "content");
        C0017h.m61R(k, ") SELECT ", "rowid", ", %s, CASE WHEN ", "stop_code");
        C0017h.m61R(k, " IS NULL THEN ", "stop_name", " ELSE ", "stop_name");
        C0017h.m61R(k, " || ' ' || ", "stop_code", " END FROM ", "stops");
        C0017h.m61R(k, " WHERE ", "metro_id", " = ? AND ", "revision");
        k.append(" = ?;");
        f50421b = k.toString();
        StatementHelper.newInsertHelper("stop_search_fts", 5, "rowid", "transit_types", "content");
    }

    public C19838j(C20400b bVar) {
        super(bVar);
    }

    /* renamed from: h */
    public static String m47304h(Context context, String str, TransitType transitType) {
        String str2 = Tokenizer.tokenPrefixQuery(str);
        if (transitType == null) {
            return str2;
        }
        StringBuilder k = C13555b.m33972k("transit_types:");
        k.append(context.getString(transitType.f23758c));
        k.append(" ");
        k.append(str2);
        return k.toString();
    }

    /* renamed from: j */
    public static SearchStopItem m47305j(Cursor cursor, int i, int i2, int i3, int i4) {
        Image image;
        ServerId serverId = new ServerId(cursor.getInt(i));
        String string = cursor.getString(i2);
        String string2 = cursor.getString(i3);
        byte[] blob = cursor.getBlob(i4);
        if (blob != null) {
            image = (Image) C13641g.m34120h(blob, C16019d.m40803a().f41718d);
        } else {
            image = null;
        }
        return new SearchStopItem(DbEntityRef.newTransitStopRef(serverId), string, string2, image);
    }

    /* renamed from: a */
    public final void mo6588a(Context context) {
        SQLiteDatabase writableDatabase = DatabaseHelper.get(context).getWritableDatabase();
        ServerId d = mo52107d();
        long f = mo52109f();
        SQLiteStatement prepare = f50422c.prepare(writableDatabase);
        f50422c.bindWhereArg(prepare, "metro_id", d);
        f50422c.bindWhereArg(prepare, "revision", f);
        prepare.executeUpdateDelete();
        Objects.toString(d);
    }

    /* renamed from: i */
    public final boolean mo52139i(Context context, SQLiteDatabase sQLiteDatabase) {
        C19393f fVar = C19393f.f49325q;
        if (!Boolean.TRUE.equals(fVar.f49336j.mo52326c(sQLiteDatabase, mo52107d(), mo52109f()))) {
            return false;
        }
        return C20975x0.m49118e(C20930c.m49020b(context), (Locale) fVar.f49333g.mo52326c(sQLiteDatabase, mo52107d(), mo52109f()));
    }

    /* renamed from: k */
    public final List mo52140k(Context context, SQLiteDatabase sQLiteDatabase, String str, LatLonE6 latLonE6) {
        String str2;
        String h = m47304h(context, str, (TransitType) null);
        if (C20964s0.m49090h(h)) {
            return Collections.emptyList();
        }
        if (latLonE6 == null) {
            str2 = String.format(Locale.ENGLISH, "SELECT stop_id FROM stops WHERE metro_id = ? AND revision = ? AND rowid IN (SELECT rowid FROM stop_search_fts WHERE stop_search_fts MATCH ?) ORDER BY stop_name ASC LIMIT %s;", new Object[]{String.valueOf(4)});
        } else {
            str2 = String.format(Locale.ENGLISH, "SELECT stop_id,((%s - stop_lat) * (%s - stop_lat)) + ((%s - stop_lon) * (%s - stop_lon)) as distance FROM stops WHERE metro_id = ? AND revision = ? AND rowid IN (SELECT rowid FROM stop_search_fts WHERE stop_search_fts MATCH ?) ORDER BY  distance, stop_name ASC LIMIT %s;", new Object[]{Integer.valueOf(latLonE6.f40980b), Integer.valueOf(latLonE6.f40980b), Integer.valueOf(latLonE6.f40981c), Integer.valueOf(latLonE6.f40981c), String.valueOf(4)});
        }
        Cursor rawQuery = sQLiteDatabase.rawQuery(str2, DatabaseUtils.createSelectionArgs(mo52108e(), mo52110g(), h));
        try {
            int columnIndex = rawQuery.getColumnIndex("stop_id");
            ArrayList arrayList = new ArrayList(rawQuery.getCount());
            while (rawQuery.moveToNext()) {
                arrayList.add(new ServerId(rawQuery.getInt(columnIndex)));
            }
            rawQuery.close();
            return arrayList;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
