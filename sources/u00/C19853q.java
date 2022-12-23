package u00;

import android.content.Context;
import android.database.Cursor;
import c00.C13717b;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.utils.collections.CollectionHashMap;
import com.moovit.database.DatabaseHelper;
import com.moovit.database.DatabaseUtils;
import com.moovit.database.DbEntityRef;
import com.moovit.database.StatementHelper;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.database.sqlite.SQLiteStatement;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.image.model.ImageSet;
import com.moovit.network.model.ServerId;
import com.moovit.transit.Amenities;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitStop;
import com.moovit.transit.TransitStopPathway;
import com.moovit.transit.TransitStopPlatform;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p001a0.C0017h;
import p389bl.C13641g;
import p693nz.C18659h;
import p810sz.C19575a;
import p810sz.C19576b;
import p898wr.C20400b;
import p977zz.C20964s0;
import u00.C19806a;

/* renamed from: u00.q */
public final class C19853q extends C19806a {

    /* renamed from: c */
    public static final StatementHelper f50463c = StatementHelper.newInsertHelper("stops", 5, "metro_id", "revision", "stop_id", "stop_name", "stop_lat", "stop_lon", "stop_code", "stop_image_data", "stop_map_images_data", "stop_pathways_data", "stop_main_transit_type_id", "stop_amenities");

    /* renamed from: d */
    public static final StatementHelper f50464d = StatementHelper.newDeleteHelper("stops", "metro_id", "revision");

    /* renamed from: e */
    public static final StatementHelper f50465e = StatementHelper.newInsertHelper("stops_lines", 5, "metro_id", "revision", "stop_id", "line_id", "platform_name", "line_order_index");

    /* renamed from: f */
    public static final StatementHelper f50466f = StatementHelper.newDeleteHelper("stops_lines", "metro_id", "revision");

    /* renamed from: g */
    public static final String f50467g;

    /* renamed from: h */
    public static final String f50468h;

    /* renamed from: b */
    public final C18659h<ServerId, TransitStop> f50469b = new C18659h<>(200);

    /* renamed from: u00.q$a */
    public class C19854a extends C19806a.C19807a {

        /* renamed from: d */
        public final Collection<TransitStop> f50470d;

        public C19854a(Context context, ServerId serverId, long j, HashSet hashSet) {
            super(context, serverId, j);
            this.f50470d = hashSet;
        }

        /* renamed from: a */
        public final void mo52111a(Context context, ServerId serverId, long j, SQLiteDatabase sQLiteDatabase) {
            String str;
            C19854a aVar = this;
            long j2 = j;
            SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
            int i = serverId.f15142b;
            SQLiteStatement prepare = C19853q.f50463c.prepare(sQLiteDatabase2);
            SQLiteStatement prepare2 = C19853q.f50465e.prepare(sQLiteDatabase2);
            Iterator<TransitStop> it = aVar.f50470d.iterator();
            while (it.hasNext()) {
                TransitStop next = it.next();
                ServerId serverId2 = next.f23730b;
                C19853q.this.f50469b.put(serverId2, next);
                StatementHelper statementHelper = C19853q.f50463c;
                long j3 = (long) i;
                statementHelper.bindValue(prepare, "metro_id", j3);
                statementHelper.bindValue(prepare, "revision", j2);
                statementHelper.bindValue(prepare, "stop_id", (long) next.f23730b.f15142b);
                statementHelper.bindValue(prepare, "stop_name", next.f23731c);
                int i2 = i;
                statementHelper.bindValue(prepare, "stop_lat", (long) next.f23732d.f40980b);
                statementHelper.bindValue(prepare, "stop_lon", (long) next.f23732d.f40981c);
                String str2 = next.f23733e;
                if (str2 != null) {
                    statementHelper.bindValue(prepare, "stop_code", str2);
                } else {
                    statementHelper.bindNullValue(prepare, "stop_code");
                }
                Image image = next.f23734f;
                if (image != null) {
                    statementHelper.bindValue(prepare, "stop_image_data", C13641g.m34110B(image, C16019d.m40803a().f41718d));
                } else {
                    statementHelper.bindNullValue(prepare, "stop_image_data");
                }
                statementHelper.bindValue(prepare, "stop_map_images_data", C13641g.m34110B(next.f23738j, C16019d.m40803a().f41719e));
                Iterator<TransitStop> it2 = it;
                statementHelper.bindValue(prepare, "stop_pathways_data", C13641g.m34110B(next.f23739k, new C19576b(TransitStopPathway.f23746f, true)));
                statementHelper.bindValue(prepare, "stop_main_transit_type_id", next.f23744p.getServerId());
                statementHelper.bindValue(prepare, "stop_amenities", (long) next.f23745q.f23627b);
                prepare.executeInsert();
                int i3 = 0;
                for (DbEntityRef<TransitLine> serverId3 : next.f23735g) {
                    ServerId serverId4 = serverId3.getServerId();
                    TransitStopPlatform c = next.mo24411c(serverId4);
                    if (c != null) {
                        str = c.f23754b;
                    } else {
                        str = null;
                    }
                    int i4 = i3 + 1;
                    SQLiteStatement sQLiteStatement = prepare;
                    StatementHelper statementHelper2 = C19853q.f50465e;
                    statementHelper2.bindValue(prepare2, "metro_id", j3);
                    statementHelper2.bindValue(prepare2, "revision", j2);
                    statementHelper2.bindValue(prepare2, "stop_id", (long) serverId2.f15142b);
                    statementHelper2.bindValue(prepare2, "line_id", (long) serverId4.f15142b);
                    statementHelper2.bindValue(prepare2, "line_order_index", (long) i3);
                    if (str == null) {
                        statementHelper2.bindNullValue(prepare2, "platform_name");
                    } else {
                        statementHelper2.bindValue(prepare2, "platform_name", str);
                    }
                    prepare2.executeInsert();
                    j2 = j;
                    i3 = i4;
                    prepare = sQLiteStatement;
                }
                aVar = this;
                i = i2;
                it = it2;
                j2 = j;
            }
        }
    }

    static {
        StringBuilder k = C13555b.m33972k("INSERT ");
        k.append(DatabaseUtils.getConflictAlgorithm(4));
        k.append(" INTO ");
        k.append("stops");
        k.append(" (");
        k.append("metro_id");
        C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "revision", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "stop_id");
        C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "stop_name", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "stop_code");
        C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "stop_lat", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "stop_lon");
        C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "stop_image_data", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "stop_map_images_data");
        C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "stop_pathways_data", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "stop_main_transit_type_id");
        C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "stop_amenities", ") SELECT ", "metro_id");
        C0017h.m61R(k, ",? ,", "stop_id", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "stop_name");
        C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "stop_code", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "stop_lat");
        C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "stop_lon", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "stop_image_data");
        C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "stop_map_images_data", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "stop_pathways_data");
        C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "stop_main_transit_type_id", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "stop_amenities");
        C0017h.m61R(k, " FROM ", "stops", " WHERE ", "metro_id");
        f50467g = C13715c.m34245k(k, " = ? AND ", "revision", " = ?");
        StringBuilder k2 = C13555b.m33972k("INSERT ");
        k2.append(DatabaseUtils.getConflictAlgorithm(4));
        k2.append(" INTO ");
        String str = "stops_lines";
        k2.append(str);
        k2.append(" (");
        k2.append("metro_id");
        C0017h.m61R(k2, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "revision", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "stop_id");
        C0017h.m61R(k2, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "line_id", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "platform_name");
        C0017h.m61R(k2, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "line_order_index", ") SELECT ", "metro_id");
        C0017h.m61R(k2, ",? ,", "stop_id", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "line_id");
        C0017h.m61R(k2, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "platform_name", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "line_order_index");
        C0017h.m61R(k2, " FROM ", str, " WHERE ", "metro_id");
        f50468h = C13715c.m34245k(k2, " = ? AND ", "revision", " = ?");
    }

    public C19853q(C20400b bVar) {
        super(bVar);
    }

    /* renamed from: a */
    public final void mo6588a(Context context) {
        SQLiteDatabase writableDatabase = DatabaseHelper.get(context).getWritableDatabase();
        ServerId d = mo52107d();
        long f = mo52109f();
        StatementHelper statementHelper = f50466f;
        SQLiteStatement prepare = statementHelper.prepare(writableDatabase);
        statementHelper.bindWhereArg(prepare, "metro_id", d);
        statementHelper.bindWhereArg(prepare, "revision", f);
        prepare.executeUpdateDelete();
        StatementHelper statementHelper2 = f50464d;
        SQLiteStatement prepare2 = statementHelper2.prepare(writableDatabase);
        statementHelper2.bindWhereArg(prepare2, "metro_id", d);
        statementHelper2.bindWhereArg(prepare2, "revision", f);
        prepare2.executeUpdateDelete();
    }

    /* renamed from: c */
    public final void mo51799c() {
        this.f50469b.onLowMemory();
    }

    /* renamed from: h */
    public final TransitStop mo52152h(Context context, ServerId serverId) {
        TransitStop transitStop = this.f50469b.get(serverId);
        if (transitStop != null) {
            return transitStop;
        }
        Set<TransitStop> i = mo52153i(context, Collections.singleton(serverId));
        if (i.isEmpty()) {
            return null;
        }
        return i.iterator().next();
    }

    /* renamed from: i */
    public final Set<TransitStop> mo52153i(Context context, Set<ServerId> set) {
        int i;
        Image image;
        int i2;
        if (set.isEmpty()) {
            return Collections.emptySet();
        }
        int size = set.size();
        HashSet hashSet = new HashSet(size);
        HashSet hashSet2 = new HashSet(size);
        for (ServerId next : set) {
            TransitStop transitStop = this.f50469b.get(next);
            if (transitStop != null) {
                hashSet.add(transitStop);
            } else {
                hashSet2.add(next);
            }
        }
        hashSet.size();
        if (hashSet2.isEmpty()) {
            return hashSet;
        }
        SQLiteDatabase readableDatabase = DatabaseHelper.get(context).getReadableDatabase();
        Iterator it = C13717b.m34262i(hashSet2).iterator();
        while (it.hasNext()) {
            Collection collection = (Collection) it.next();
            String[] createSelectionArgs = DatabaseUtils.createSelectionArgs(mo52107d(), mo52109f(), DatabaseUtils.idsToString(collection));
            String createInClausePlaceHolders = DatabaseUtils.createInClausePlaceHolders(collection.size());
            String str = C20964s0.f52718a;
            String format = String.format((Locale) null, "SELECT stop_id,stop_name,stop_code,stop_lat,stop_lon,stop_image_data,stop_map_images_data,stop_pathways_data,stop_main_transit_type_id,stop_amenities FROM stops WHERE metro_id = ? AND revision = ? AND stop_id IN (%s) ORDER BY stop_id ASC", new Object[]{createInClausePlaceHolders});
            String format2 = String.format((Locale) null, "SELECT stop_id,line_id,platform_name FROM stops_lines WHERE metro_id = ? AND revision = ? AND stop_id IN (%s) ORDER BY stop_id,line_order_index ASC", new Object[]{createInClausePlaceHolders});
            Cursor rawQuery = readableDatabase.rawQuery(format, createSelectionArgs);
            Cursor rawQuery2 = readableDatabase.rawQuery(format2, createSelectionArgs);
            int columnIndexOrThrow = rawQuery.getColumnIndexOrThrow("stop_id");
            int columnIndexOrThrow2 = rawQuery.getColumnIndexOrThrow("stop_name");
            int columnIndexOrThrow3 = rawQuery.getColumnIndexOrThrow("stop_code");
            int columnIndexOrThrow4 = rawQuery.getColumnIndexOrThrow("stop_lat");
            int columnIndexOrThrow5 = rawQuery.getColumnIndexOrThrow("stop_lon");
            int columnIndexOrThrow6 = rawQuery.getColumnIndexOrThrow("stop_image_data");
            int columnIndexOrThrow7 = rawQuery.getColumnIndexOrThrow("stop_map_images_data");
            int columnIndexOrThrow8 = rawQuery.getColumnIndexOrThrow("stop_pathways_data");
            SQLiteDatabase sQLiteDatabase = readableDatabase;
            int columnIndexOrThrow9 = rawQuery.getColumnIndexOrThrow("stop_main_transit_type_id");
            Iterator it2 = it;
            int columnIndexOrThrow10 = rawQuery.getColumnIndexOrThrow("stop_amenities");
            int columnIndexOrThrow11 = rawQuery2.getColumnIndexOrThrow("stop_id");
            HashSet hashSet3 = hashSet2;
            int columnIndexOrThrow12 = rawQuery2.getColumnIndexOrThrow("line_id");
            HashSet hashSet4 = hashSet;
            int columnIndexOrThrow13 = rawQuery2.getColumnIndexOrThrow("platform_name");
            boolean moveToFirst = rawQuery2.moveToFirst();
            while (rawQuery.moveToNext()) {
                int i3 = rawQuery.getInt(columnIndexOrThrow);
                int i4 = columnIndexOrThrow;
                ServerId serverId = new ServerId(i3);
                String string = rawQuery.getString(columnIndexOrThrow2);
                String string2 = rawQuery.getString(columnIndexOrThrow3);
                int i5 = columnIndexOrThrow2;
                byte[] blob = rawQuery.getBlob(columnIndexOrThrow6);
                if (blob != null) {
                    i = columnIndexOrThrow3;
                    image = (Image) C13641g.m34120h(blob, C16019d.m40803a().f41718d);
                } else {
                    i = columnIndexOrThrow3;
                    image = null;
                }
                int i6 = columnIndexOrThrow4;
                LatLonE6 latLonE6 = new LatLonE6(rawQuery.getInt(columnIndexOrThrow4), rawQuery.getInt(columnIndexOrThrow5));
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i7 = columnIndexOrThrow5;
                CollectionHashMap.ArrayListHashMap arrayListHashMap = new CollectionHashMap.ArrayListHashMap();
                while (true) {
                    if (!moveToFirst) {
                        i2 = columnIndexOrThrow6;
                        break;
                    }
                    i2 = columnIndexOrThrow6;
                    if (rawQuery2.getInt(columnIndexOrThrow11) != i3) {
                        break;
                    }
                    int i8 = i3;
                    DbEntityRef<TransitLine> newTransitLineRef = DbEntityRef.newTransitLineRef(new ServerId(rawQuery2.getInt(columnIndexOrThrow12)));
                    arrayList.add(newTransitLineRef);
                    if (!rawQuery2.isNull(columnIndexOrThrow13)) {
                        String string3 = rawQuery2.getString(columnIndexOrThrow13);
                        if (!arrayList2.contains(string3)) {
                            arrayList2.add(string3);
                        }
                        arrayListHashMap.mo47001a(string3, newTransitLineRef);
                    }
                    moveToFirst = rawQuery2.moveToNext();
                    i3 = i8;
                    columnIndexOrThrow6 = i2;
                }
                ImageSet imageSet = (ImageSet) C13641g.m34120h(rawQuery.getBlob(columnIndexOrThrow7), C16019d.m40803a().f41719e);
                int i9 = columnIndexOrThrow13;
                List list = (List) C13641g.m34120h(rawQuery.getBlob(columnIndexOrThrow8), C19575a.m46957a(TransitStopPathway.f23747g, true));
                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    String str2 = (String) it3.next();
                    arrayList3.add(new TransitStopPlatform(str2, (List) arrayListHashMap.get(str2)));
                    columnIndexOrThrow12 = columnIndexOrThrow12;
                }
                int i11 = columnIndexOrThrow12;
                ServerId serverId2 = serverId;
                LatLonE6 latLonE62 = latLonE6;
                ArrayList arrayList4 = arrayList;
                TransitStop transitStop2 = new TransitStop(serverId2, string, latLonE62, string2, image, arrayList4, Collections.emptyList(), imageSet, list, arrayList3, DbEntityRef.newTransitTypeRef(new ServerId(rawQuery.getInt(columnIndexOrThrow9))), new Amenities(rawQuery.getInt(columnIndexOrThrow10)));
                this.f50469b.put(serverId, transitStop2);
                hashSet4.add(transitStop2);
                columnIndexOrThrow = i4;
                columnIndexOrThrow2 = i5;
                columnIndexOrThrow3 = i;
                columnIndexOrThrow4 = i6;
                columnIndexOrThrow5 = i7;
                columnIndexOrThrow6 = i2;
                columnIndexOrThrow13 = i9;
                columnIndexOrThrow12 = i11;
            }
            rawQuery.close();
            rawQuery2.close();
            hashSet = hashSet4;
            readableDatabase = sQLiteDatabase;
            it = it2;
            hashSet2 = hashSet3;
        }
        HashSet hashSet5 = hashSet2;
        HashSet hashSet6 = hashSet;
        hashSet5.size();
        return hashSet6;
    }
}
