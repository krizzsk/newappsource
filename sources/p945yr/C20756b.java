package p945yr;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import ce0.C21100e;
import com.moovit.database.DatabaseHelper;
import com.moovit.database.DatabaseUtils;
import com.moovit.database.StatementHelper;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.database.sqlite.SQLiteStatement;
import com.moovit.network.model.ServerId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p779rs.C19324a;
import p977zz.C20964s0;
import s00.C19391d;
import u00.C19806a;

/* renamed from: yr.b */
public final class C20756b extends C19806a {

    /* renamed from: c */
    public static final StatementHelper f52367c = StatementHelper.newUpdateHelper("transportation_maps", 5, new String[]{"metro_id", "revision", "transportation_map_id"}, "transportation_map_order_index", "transportation_map_name", "transportation_map_url", "transportation_map_version");

    /* renamed from: d */
    public static final StatementHelper f52368d = StatementHelper.newInsertHelper("transportation_maps", "metro_id", "revision", "transportation_map_id", "transportation_map_order_index", "transportation_map_name", "transportation_map_url", "transportation_map_version", "transportation_map_download_id", "transportation_map_download_version");

    /* renamed from: e */
    public static final StatementHelper f52369e = StatementHelper.newDeleteHelper("transportation_maps", "metro_id", "revision");

    /* renamed from: b */
    public volatile List<C19324a> f52370b = null;

    /* renamed from: yr.b$a */
    public static class C20757a extends C19806a.C19807a {

        /* renamed from: d */
        public final List<C19324a> f52371d;

        public C20757a(Context context, ServerId serverId, long j, List<C19324a> list) {
            super(context, serverId, j);
            C21100e.m49373x(list, "maps");
            this.f52371d = list;
        }

        /* renamed from: a */
        public final void mo52111a(Context context, ServerId serverId, long j, SQLiteDatabase sQLiteDatabase) {
            long j2;
            long j3 = j;
            SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
            int i = serverId.f15142b;
            SQLiteStatement prepare = C20756b.f52367c.prepare(sQLiteDatabase2);
            SQLiteStatement prepare2 = C20756b.f52368d.prepare(sQLiteDatabase2);
            ArrayList arrayList = new ArrayList(this.f52371d.size());
            Iterator<C19324a> it = this.f52371d.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                C19324a next = it.next();
                arrayList.add(next.f49173a);
                StatementHelper statementHelper = C20756b.f52367c;
                long j4 = (long) i2;
                statementHelper.bindValue(prepare, "transportation_map_order_index", j4);
                Iterator<C19324a> it2 = it;
                statementHelper.bindValue(prepare, "transportation_map_name", next.f49174b);
                statementHelper.bindValue(prepare, "transportation_map_url", next.f49175c);
                ArrayList arrayList2 = arrayList;
                statementHelper.bindValue(prepare, "transportation_map_version", next.f49176d);
                long j5 = (long) i;
                int i3 = i;
                statementHelper.bindWhereArg(prepare, "metro_id", j5);
                int i4 = i2;
                statementHelper.bindWhereArg(prepare, "revision", j3);
                String str = "revision";
                statementHelper.bindWhereArg(prepare, "transportation_map_id", (long) next.f49173a.f15142b);
                if (prepare.executeUpdateDelete() == 0) {
                    StatementHelper statementHelper2 = C20756b.f52368d;
                    statementHelper2.bindValue(prepare2, "transportation_map_order_index", j4);
                    statementHelper2.bindValue(prepare2, "transportation_map_name", next.f49174b);
                    statementHelper2.bindValue(prepare2, "transportation_map_url", next.f49175c);
                    statementHelper2.bindValue(prepare2, "transportation_map_version", next.f49176d);
                    statementHelper2.bindValue(prepare2, "metro_id", j5);
                    j2 = j;
                    statementHelper2.bindValue(prepare2, str, j2);
                    statementHelper2.bindValue(prepare2, "transportation_map_id", (long) next.f49173a.f15142b);
                    statementHelper2.bindValue(prepare2, "transportation_map_download_id", -1);
                    statementHelper2.bindValue(prepare2, "transportation_map_download_version", -1);
                    prepare2.executeInsert();
                } else {
                    j2 = j;
                }
                i2 = i4 + 1;
                SQLiteDatabase sQLiteDatabase3 = sQLiteDatabase;
                j3 = j2;
                it = it2;
                arrayList = arrayList2;
                i = i3;
                ServerId serverId2 = serverId;
            }
            ArrayList arrayList3 = arrayList;
            String[] createSelectionArgs = DatabaseUtils.createSelectionArgs(serverId, j3, DatabaseUtils.idsToString(arrayList3));
            Object[] objArr = {DatabaseUtils.createInClausePlaceHolders(arrayList3.size())};
            String str2 = C20964s0.f52718a;
            sQLiteDatabase.execSQL(String.format((Locale) null, "DELETE FROM transportation_maps WHERE metro_id = ? AND revision = ? AND transportation_map_id NOT IN (%s)", objArr), createSelectionArgs);
        }
    }

    public C20756b(C19391d dVar) {
        super(dVar);
    }

    /* renamed from: i */
    public static ArrayList m48740i(Cursor cursor) {
        Cursor cursor2 = cursor;
        int columnIndex = cursor2.getColumnIndex("transportation_map_id");
        int columnIndex2 = cursor2.getColumnIndex("transportation_map_name");
        int columnIndex3 = cursor2.getColumnIndex("transportation_map_url");
        int columnIndex4 = cursor2.getColumnIndex("transportation_map_version");
        int columnIndex5 = cursor2.getColumnIndex("transportation_map_download_id");
        int columnIndex6 = cursor2.getColumnIndex("transportation_map_download_version");
        ArrayList arrayList = new ArrayList(cursor.getCount());
        while (cursor.moveToNext()) {
            arrayList.add(new C19324a(new ServerId(cursor2.getInt(columnIndex)), cursor2.getString(columnIndex2), cursor2.getString(columnIndex3), cursor2.getLong(columnIndex4), cursor2.getLong(columnIndex5), cursor2.getLong(columnIndex6)));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo6588a(Context context) {
        SQLiteDatabase writableDatabase = DatabaseHelper.get(context).getWritableDatabase();
        ServerId d = mo52107d();
        long f = mo52109f();
        StatementHelper statementHelper = f52369e;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: h */
    public final synchronized void mo52892h(android.content.Context r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.moovit.database.DatabaseHelper r5 = com.moovit.database.DatabaseHelper.get(r5)     // Catch:{ all -> 0x0038 }
            com.moovit.database.sqlite.SQLiteDatabase r5 = r5.getReadableDatabase()     // Catch:{ all -> 0x0038 }
            java.lang.String r0 = "SELECT transportation_map_id,transportation_map_name,transportation_map_url,transportation_map_version,transportation_map_download_id,transportation_map_download_version FROM transportation_maps WHERE metro_id = ? AND revision = ? ORDER BY transportation_map_order_index ASC"
            r1 = 2
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x0038 }
            r2 = 0
            java.lang.String r3 = r4.mo52108e()     // Catch:{ all -> 0x0038 }
            r1[r2] = r3     // Catch:{ all -> 0x0038 }
            r2 = 1
            java.lang.String r3 = r4.mo52110g()     // Catch:{ all -> 0x0038 }
            r1[r2] = r3     // Catch:{ all -> 0x0038 }
            java.lang.String[] r1 = com.moovit.database.DatabaseUtils.createSelectionArgs((java.lang.String[]) r1)     // Catch:{ all -> 0x0038 }
            android.database.Cursor r5 = r5.rawQuery(r0, r1)     // Catch:{ all -> 0x0038 }
            java.util.ArrayList r0 = m48740i(r5)     // Catch:{ all -> 0x0038 }
            r5.close()     // Catch:{ all -> 0x0038 }
            monitor-enter(r4)     // Catch:{ all -> 0x0038 }
            java.util.List r5 = java.util.Collections.unmodifiableList(r0)     // Catch:{ all -> 0x0035 }
            r4.f52370b = r5     // Catch:{ all -> 0x0035 }
            monitor-exit(r4)     // Catch:{ all -> 0x0038 }
            monitor-exit(r4)
            return
        L_0x0035:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0038 }
            throw r5     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p945yr.C20756b.mo52892h(android.content.Context):void");
    }

    /* renamed from: j */
    public final void mo52893j(Context context, C19324a aVar) {
        String createSelection = DatabaseUtils.createSelection("metro_id", "revision", "transportation_map_id");
        String[] createSelectionArgs = DatabaseUtils.createSelectionArgs(mo52108e(), mo52110g(), aVar.f49173a.mo19751c());
        ContentValues contentValues = new ContentValues();
        contentValues.put("transportation_map_download_id", Long.valueOf(aVar.f49177e));
        contentValues.put("transportation_map_download_version", Long.valueOf(aVar.f49178f));
        DatabaseHelper.get(context).getWritableDatabase().update("transportation_maps", contentValues, createSelection, createSelectionArgs);
    }
}
