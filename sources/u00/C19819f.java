package u00;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Point;
import ce0.C21100e;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.database.DatabaseHelper;
import com.moovit.database.DatabaseJobQueue;
import com.moovit.database.DatabaseUtils;
import com.moovit.database.StatementHelper;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.database.sqlite.SQLiteStatement;
import com.moovit.image.C16019d;
import com.moovit.image.model.ImageSet;
import com.moovit.map.items.MapItem;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import p389bl.C13641g;
import p693nz.C18659h;
import p810sz.C19575a;
import p810sz.C19576b;
import p810sz.C19577c;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;
import p898wr.C20400b;
import p977zz.C20944i0;
import s00.C19393f;
import u00.C19806a;

/* renamed from: u00.f */
public final class C19819f extends C19806a {

    /* renamed from: c */
    public static C19577c<MapItem.Type> f50361c;

    /* renamed from: d */
    public static C19575a<MapItem, ArrayList<MapItem>> f50362d;

    /* renamed from: e */
    public static C19576b<MapItem> f50363e = C19576b.m46958a(new C19823d());

    /* renamed from: f */
    public static final StatementHelper f50364f = StatementHelper.newInsertHelper("map_items", 5, "metro_id", "revision", "map_items_type", "map_items_tile_x", "map_items_tile_y", "map_items_data");

    /* renamed from: g */
    public static final StatementHelper f50365g = StatementHelper.newDeleteHelper("map_items", "metro_id", "revision");

    /* renamed from: b */
    public final C18659h<C20944i0<MapItem.Type, Point>, Collection<MapItem>> f50366b = new C18659h<>(100);

    /* renamed from: u00.f$a */
    public static /* synthetic */ class C19820a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f50367a;

        static {
            int[] iArr = new int[MapItem.Type.values().length];
            f50367a = iArr;
            try {
                iArr[MapItem.Type.STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: u00.f$b */
    public static class C19821b extends C19806a.C19807a {

        /* renamed from: d */
        public final MapItem.Type f50368d;

        /* renamed from: e */
        public final Point f50369e;

        /* renamed from: f */
        public final Collection<MapItem> f50370f;

        public C19821b(Context context, ServerId serverId, long j, MapItem.Type type, Point point, Collection<MapItem> collection) {
            super(context, serverId, j);
            C21100e.m49373x(type, "type");
            this.f50368d = type;
            C21100e.m49373x(point, "tile");
            this.f50369e = point;
            C21100e.m49373x(collection, "mapItems");
            this.f50370f = collection;
        }

        /* renamed from: a */
        public final void mo52111a(Context context, ServerId serverId, long j, SQLiteDatabase sQLiteDatabase) {
            StatementHelper statementHelper = C19819f.f50364f;
            SQLiteStatement prepare = statementHelper.prepare(sQLiteDatabase);
            statementHelper.bindValue(prepare, "metro_id", serverId);
            statementHelper.bindValue(prepare, "revision", j);
            statementHelper.bindValue(prepare, "map_items_type", (long) C19819f.f50361c.mo51917b(this.f50368d));
            statementHelper.bindValue(prepare, "map_items_tile_x", (long) this.f50369e.x);
            statementHelper.bindValue(prepare, "map_items_tile_y", (long) this.f50369e.y);
            statementHelper.bindValue(prepare, "map_items_data", C13641g.m34110B(this.f50370f, C19819f.f50363e));
            prepare.executeInsert();
        }
    }

    /* renamed from: u00.f$c */
    public static class C19822c extends C19620t<MapItem> {

        /* renamed from: v */
        public final MapItem.Type f50371v;

        public C19822c(MapItem.Type type) {
            super(MapItem.class);
            C21100e.m49373x(type, "mapItemType");
            this.f50371v = type;
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            pVar.getClass();
            return new MapItem(this.f50371v, new ServerId(pVar.mo51924l()), (LatLonE6) LatLonE6.f40979g.read(pVar), (ImageSet) C16019d.m40803a().f41719e.read(pVar));
        }
    }

    /* renamed from: u00.f$d */
    public static class C19823d extends C19621u<MapItem> {
        public C19823d() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            MapItem mapItem = (MapItem) obj;
            ServerId serverId = mapItem.f42550c;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            LatLonE6.f40978f.write(mapItem.f42551d, qVar);
            ImageSet imageSet = mapItem.f42552e;
            ImageSet.C16054b bVar = C16019d.m40803a().f41719e;
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(imageSet, qVar);
        }
    }

    static {
        MapItem.Type type = MapItem.Type.STOP;
        f50361c = new C19577c<>(MapItem.Type.class, type, null);
        f50362d = C19575a.m46957a(new C19822c(type), false);
    }

    public C19819f(C20400b bVar) {
        super(bVar);
    }

    /* renamed from: a */
    public final void mo6588a(Context context) {
        SQLiteDatabase writableDatabase = DatabaseHelper.get(context).getWritableDatabase();
        ServerId d = mo52107d();
        long f = mo52109f();
        StatementHelper statementHelper = f50365g;
        SQLiteStatement prepare = statementHelper.prepare(writableDatabase);
        statementHelper.bindWhereArg(prepare, "metro_id", d);
        statementHelper.bindWhereArg(prepare, "revision", f);
        prepare.executeUpdateDelete();
    }

    /* renamed from: h */
    public final Collection<MapItem> mo52127h(Context context, MapItem.Type type, Point point) {
        ArrayList arrayList;
        MapItem.Type type2 = type;
        Point point2 = point;
        C20944i0 i0Var = new C20944i0(type2, point2);
        Collection<MapItem> collection = this.f50366b.get(i0Var);
        if (collection != null) {
            return collection;
        }
        Cursor rawQuery = DatabaseHelper.get(context).getReadableDatabase().rawQuery("SELECT map_items_data FROM map_items WHERE metro_id = ? AND revision = ? AND map_items_type = ? AND map_items_tile_x = ? AND map_items_tile_y = ?;", DatabaseUtils.createSelectionArgs(mo52108e(), mo52110g(), Integer.toString(f50361c.mo51917b(type2)), Integer.toString(point2.x), Integer.toString(point2.y)));
        if (rawQuery.moveToFirst()) {
            byte[] blob = rawQuery.getBlob(rawQuery.getColumnIndex("map_items_data"));
            if (C19820a.f50367a[type.ordinal()] == 1) {
                arrayList = (Collection) C13641g.m34120h(blob, f50362d);
            } else {
                throw new IllegalArgumentException("Unknown map item type: " + type2);
            }
        } else {
            arrayList = null;
        }
        rawQuery.close();
        if (arrayList == null && MapItem.Type.STOP.equals(type2)) {
            if (Boolean.TRUE.equals(C19393f.f49325q.f49336j.mo52326c(DatabaseHelper.get(context).getReadableDatabase(), mo52107d(), mo52109f()))) {
                int i = point2.x;
                int i2 = point2.y;
                int i3 = i2 + 1;
                Cursor rawQuery2 = DatabaseHelper.get(context).getReadableDatabase().rawQuery("SELECT stop_id,stop_lat,stop_lon,stop_map_images_data FROM stops INDEXED BY stop_lat_lon_index WHERE metro_id = ? AND revision = ? AND stop_lat BETWEEN ? AND ? AND stop_lon BETWEEN ? AND ?;", DatabaseUtils.createSelectionArgs(mo52108e(), mo52110g(), Integer.toString(i2 * 10000), Integer.toString(i3 * 10000), Integer.toString(i * 10000), Integer.toString((i + 1) * 10000)));
                int columnIndex = rawQuery2.getColumnIndex("stop_id");
                int columnIndex2 = rawQuery2.getColumnIndex("stop_lat");
                int columnIndex3 = rawQuery2.getColumnIndex("stop_lon");
                int columnIndex4 = rawQuery2.getColumnIndex("stop_map_images_data");
                ArrayList arrayList2 = new ArrayList(rawQuery2.getCount());
                while (rawQuery2.moveToNext()) {
                    arrayList2.add(new MapItem(MapItem.Type.STOP, new ServerId(rawQuery2.getInt(columnIndex)), new LatLonE6(rawQuery2.getInt(columnIndex2), rawQuery2.getInt(columnIndex3)), (ImageSet) C13641g.m34120h(rawQuery2.getBlob(columnIndex4), C16019d.m40803a().f41719e)));
                }
                rawQuery2.close();
                arrayList = arrayList2;
            }
        }
        if (arrayList != null) {
            this.f50366b.put(i0Var, arrayList);
        }
        return arrayList;
    }

    /* renamed from: i */
    public final void mo52128i(Context context, MapItem.Type type, Point point, Collection<MapItem> collection) {
        this.f50366b.put(new C20944i0(type, point), collection);
        DatabaseJobQueue.get().postJob(new C19821b(context, mo52107d(), mo52109f(), type, point, collection));
    }
}
