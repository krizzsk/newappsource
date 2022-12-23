package u00;

import android.content.Context;
import android.database.Cursor;
import c70.C13749c;
import com.moovit.database.DatabaseHelper;
import com.moovit.database.DatabaseUtils;
import com.moovit.database.StatementHelper;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.database.sqlite.SQLiteStatement;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitType;
import com.moovit.util.HasServerIdMap;
import java.util.ArrayList;
import java.util.List;
import p389bl.C13641g;
import p898wr.C20400b;
import u00.C19806a;

/* renamed from: u00.r */
public final class C19855r extends C19806a {

    /* renamed from: d */
    public static final StatementHelper f50472d = StatementHelper.newInsertHelper("transit_types", 5, "metro_id", "revision", "transit_type_order_index", "transit_type_id", "transit_type_name_external_text_id", "transit_type_image_data", "transit_type_vehicle_type", "transit_type_view_type");

    /* renamed from: e */
    public static final StatementHelper f50473e = StatementHelper.newDeleteHelper("transit_types", "metro_id", "revision");

    /* renamed from: b */
    public final ArrayList f50474b = new ArrayList();

    /* renamed from: c */
    public final HasServerIdMap<TransitType> f50475c = new HasServerIdMap<>();

    /* renamed from: u00.r$a */
    public static class C19856a extends C19806a.C19807a {

        /* renamed from: d */
        public final List<TransitType> f50476d;

        public C19856a(Context context, ServerId serverId, long j, List<TransitType> list) {
            super(context, serverId, j);
            this.f50476d = list;
        }

        /* renamed from: a */
        public final void mo52111a(Context context, ServerId serverId, long j, SQLiteDatabase sQLiteDatabase) {
            int i = serverId.f15142b;
            SQLiteStatement prepare = C19855r.f50472d.prepare(sQLiteDatabase);
            int i2 = 0;
            for (TransitType next : this.f50476d) {
                int i3 = i2 + 1;
                StatementHelper statementHelper = C19855r.f50472d;
                statementHelper.bindValue(prepare, "metro_id", (long) i);
                statementHelper.bindValue(prepare, "revision", j);
                statementHelper.bindValue(prepare, "transit_type_order_index", (long) i2);
                statementHelper.bindValue(prepare, "transit_type_id", (long) next.f23757b.f15142b);
                statementHelper.bindValue(prepare, "transit_type_name_external_text_id", (long) C13749c.f33838a.mo53029c(next.f23758c).intValue());
                statementHelper.bindValue(prepare, "transit_type_image_data", C13641g.m34110B(next.f23759d, C16019d.m40803a().f41718d));
                statementHelper.bindValue(prepare, "transit_type_vehicle_type", (long) TransitType.VehicleType.CODER.mo51917b(next.f23760e));
                statementHelper.bindValue(prepare, "transit_type_view_type", (long) TransitType.ViewType.CODER.mo51917b(next.f23761f));
                prepare.executeInsert();
                i2 = i3;
            }
        }
    }

    public C19855r(C20400b bVar) {
        super(bVar);
    }

    /* renamed from: j */
    public static ArrayList m47344j(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("transit_type_id");
        int columnIndex2 = cursor.getColumnIndex("transit_type_name_external_text_id");
        int columnIndex3 = cursor.getColumnIndex("transit_type_image_data");
        int columnIndex4 = cursor.getColumnIndex("transit_type_vehicle_type");
        int columnIndex5 = cursor.getColumnIndex("transit_type_view_type");
        ArrayList arrayList = new ArrayList(cursor.getCount());
        while (cursor.moveToNext()) {
            arrayList.add(new TransitType(new ServerId(cursor.getInt(columnIndex)), C13749c.f33838a.mo53030d(Integer.valueOf(cursor.getInt(columnIndex2))), (Image) C13641g.m34120h(cursor.getBlob(columnIndex3), C16019d.m40803a().f41718d), TransitType.VehicleType.CODER.mo51916a(cursor.getShort(columnIndex4)), TransitType.ViewType.CODER.mo51916a(cursor.getShort(columnIndex5))));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo6588a(Context context) {
        SQLiteDatabase writableDatabase = DatabaseHelper.get(context).getWritableDatabase();
        ServerId d = mo52107d();
        long f = mo52109f();
        StatementHelper statementHelper = f50473e;
        SQLiteStatement prepare = statementHelper.prepare(writableDatabase);
        statementHelper.bindWhereArg(prepare, "metro_id", d);
        statementHelper.bindWhereArg(prepare, "revision", f);
        prepare.executeUpdateDelete();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: h */
    public final synchronized void mo52154h(android.content.Context r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            monitor-enter(r1)     // Catch:{ all -> 0x0015 }
            java.util.ArrayList r0 = r1.f50474b     // Catch:{ all -> 0x0012 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0012 }
            r0 = r0 ^ 1
            monitor-exit(r1)     // Catch:{ all -> 0x0015 }
            if (r0 != 0) goto L_0x0010
            r1.mo52155i(r2)     // Catch:{ all -> 0x0015 }
        L_0x0010:
            monitor-exit(r1)
            return
        L_0x0012:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0015 }
            throw r2     // Catch:{ all -> 0x0015 }
        L_0x0015:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: u00.C19855r.mo52154h(android.content.Context):void");
    }

    /* renamed from: i */
    public final synchronized void mo52155i(Context context) {
        Cursor rawQuery = DatabaseHelper.get(context).getReadableDatabase().rawQuery("SELECT transit_type_id,transit_type_name_external_text_id,transit_type_image_data,transit_type_vehicle_type,transit_type_view_type FROM transit_types WHERE metro_id = ? AND revision = ? ORDER BY transit_type_order_index ASC", DatabaseUtils.createSelectionArgs(mo52108e(), mo52110g()));
        ArrayList j = m47344j(rawQuery);
        rawQuery.close();
        mo52156k(j);
    }

    /* renamed from: k */
    public final synchronized void mo52156k(List<TransitType> list) {
        this.f50474b.clear();
        this.f50475c.clear();
        this.f50474b.addAll(list);
        this.f50475c.mo24548c(list);
    }
}
