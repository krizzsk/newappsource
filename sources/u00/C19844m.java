package u00;

import android.content.Context;
import android.database.Cursor;
import com.moovit.database.DatabaseHelper;
import com.moovit.database.DbEntityRef;
import com.moovit.database.StatementHelper;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.database.sqlite.SQLiteStatement;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitAgency;
import com.moovit.transit.TransitType;
import com.moovit.util.HasServerIdMap;
import java.util.Collection;
import java.util.HashSet;
import p389bl.C13641g;
import p898wr.C20400b;
import u00.C19806a;

/* renamed from: u00.m */
public final class C19844m extends C19806a {

    /* renamed from: c */
    public static final StatementHelper f50434c = StatementHelper.newInsertHelper("agencies", 5, "metro_id", "revision", "agency_id", "agency_name", "agency_transit_type_id", "agency_image_data");

    /* renamed from: d */
    public static final StatementHelper f50435d = StatementHelper.newDeleteHelper("agencies", "metro_id", "revision");

    /* renamed from: b */
    public final HasServerIdMap<TransitAgency> f50436b = new HasServerIdMap<>();

    /* renamed from: u00.m$a */
    public static class C19845a extends C19806a.C19807a {

        /* renamed from: d */
        public final Collection<TransitAgency> f50437d;

        public C19845a(Context context, ServerId serverId, long j, Collection<TransitAgency> collection) {
            super(context, serverId, j);
            this.f50437d = collection;
        }

        /* renamed from: a */
        public final void mo52111a(Context context, ServerId serverId, long j, SQLiteDatabase sQLiteDatabase) {
            int i = serverId.f15142b;
            SQLiteStatement prepare = C19844m.f50434c.prepare(sQLiteDatabase);
            for (TransitAgency next : this.f50437d) {
                StatementHelper statementHelper = C19844m.f50434c;
                statementHelper.bindValue(prepare, "metro_id", (long) i);
                statementHelper.bindValue(prepare, "revision", j);
                statementHelper.bindValue(prepare, "agency_id", (long) next.f23672b.f15142b);
                statementHelper.bindValue(prepare, "agency_name", next.f23673c);
                statementHelper.bindValue(prepare, "agency_transit_type_id", (long) next.f23674d.getServerId().f15142b);
                Image image = next.f23675e;
                if (image != null) {
                    statementHelper.bindValue(prepare, "agency_image_data", C13641g.m34110B(image, C16019d.m40803a().f41718d));
                } else {
                    statementHelper.bindNullValue(prepare, "agency_image_data");
                }
                prepare.executeInsert();
            }
        }
    }

    public C19844m(C20400b bVar) {
        super(bVar);
    }

    /* renamed from: j */
    public static HashSet m47320j(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("agency_id");
        int columnIndex2 = cursor.getColumnIndex("agency_name");
        int columnIndex3 = cursor.getColumnIndex("agency_transit_type_id");
        int columnIndex4 = cursor.getColumnIndex("agency_image_data");
        HashSet hashSet = new HashSet(cursor.getCount());
        while (cursor.moveToNext()) {
            ServerId serverId = new ServerId(cursor.getInt(columnIndex));
            String string = cursor.getString(columnIndex2);
            DbEntityRef<TransitType> newTransitTypeRef = DbEntityRef.newTransitTypeRef(new ServerId(cursor.getInt(columnIndex3)));
            Image image = null;
            byte[] blob = cursor.getBlob(columnIndex4);
            if (blob != null) {
                image = (Image) C13641g.m34120h(blob, C16019d.m40803a().f41718d);
            }
            hashSet.add(new TransitAgency(serverId, string, newTransitTypeRef, image));
        }
        return hashSet;
    }

    /* renamed from: a */
    public final void mo6588a(Context context) {
        SQLiteDatabase writableDatabase = DatabaseHelper.get(context).getWritableDatabase();
        ServerId d = mo52107d();
        long f = mo52109f();
        StatementHelper statementHelper = f50435d;
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
    public final synchronized void mo52145h(android.content.Context r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            monitor-enter(r1)     // Catch:{ all -> 0x0011 }
            com.moovit.util.HasServerIdMap<com.moovit.transit.TransitAgency> r0 = r1.f50436b     // Catch:{ all -> 0x0015 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0015 }
            r0 = r0 ^ 1
            monitor-exit(r1)     // Catch:{ all -> 0x0011 }
            if (r0 != 0) goto L_0x0013
            r1.mo52146i(r2)     // Catch:{ all -> 0x0011 }
            goto L_0x0013
        L_0x0011:
            r2 = move-exception
            goto L_0x0018
        L_0x0013:
            monitor-exit(r1)
            return
        L_0x0015:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0011 }
            throw r2     // Catch:{ all -> 0x0011 }
        L_0x0018:
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: u00.C19844m.mo52145h(android.content.Context):void");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: i */
    public final synchronized void mo52146i(android.content.Context r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.moovit.database.DatabaseHelper r5 = com.moovit.database.DatabaseHelper.get(r5)     // Catch:{ all -> 0x003c }
            com.moovit.database.sqlite.SQLiteDatabase r5 = r5.getReadableDatabase()     // Catch:{ all -> 0x003c }
            java.lang.String r0 = "SELECT agency_id,agency_name,agency_transit_type_id,agency_image_data FROM agencies WHERE metro_id = ? AND revision = ?"
            r1 = 2
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x003c }
            r2 = 0
            java.lang.String r3 = r4.mo52108e()     // Catch:{ all -> 0x003c }
            r1[r2] = r3     // Catch:{ all -> 0x003c }
            r2 = 1
            java.lang.String r3 = r4.mo52110g()     // Catch:{ all -> 0x003c }
            r1[r2] = r3     // Catch:{ all -> 0x003c }
            java.lang.String[] r1 = com.moovit.database.DatabaseUtils.createSelectionArgs((java.lang.String[]) r1)     // Catch:{ all -> 0x003c }
            android.database.Cursor r5 = r5.rawQuery(r0, r1)     // Catch:{ all -> 0x003c }
            java.util.HashSet r0 = m47320j(r5)     // Catch:{ all -> 0x003c }
            r5.close()     // Catch:{ all -> 0x003c }
            monitor-enter(r4)     // Catch:{ all -> 0x003c }
            com.moovit.util.HasServerIdMap<com.moovit.transit.TransitAgency> r5 = r4.f50436b     // Catch:{ all -> 0x0039 }
            r5.clear()     // Catch:{ all -> 0x0039 }
            com.moovit.util.HasServerIdMap<com.moovit.transit.TransitAgency> r5 = r4.f50436b     // Catch:{ all -> 0x0039 }
            r5.mo24548c(r0)     // Catch:{ all -> 0x0039 }
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            monitor-exit(r4)
            return
        L_0x0039:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            throw r5     // Catch:{ all -> 0x003c }
        L_0x003c:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u00.C19844m.mo52146i(android.content.Context):void");
    }
}
