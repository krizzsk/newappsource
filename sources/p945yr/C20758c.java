package p945yr;

import android.content.Context;
import android.database.Cursor;
import ce0.C21100e;
import com.moovit.commons.utils.Color;
import com.moovit.database.DatabaseHelper;
import com.moovit.database.DatabaseUtils;
import com.moovit.database.StatementHelper;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.database.sqlite.SQLiteStatement;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.network.model.ServerId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p389bl.C13641g;
import p875vs.C20222a;
import p977zz.C20964s0;
import s00.C19391d;
import u00.C19806a;

/* renamed from: yr.c */
public final class C20758c extends C19806a {

    /* renamed from: c */
    public static final StatementHelper f52372c = StatementHelper.newUpdateHelper("web_pages", 5, new String[]{"metro_id", "revision", "web_page_id"}, "web_page_type", "web_page_new_index", "web_page_name", "web_page_url", "web_page_embedded", "web_page_version", "web_page_image_data", "web_page_bg_color");

    /* renamed from: d */
    public static final StatementHelper f52373d = StatementHelper.newInsertHelper("web_pages", "metro_id", "revision", "web_page_id", "web_page_type", "web_page_new_index", "web_page_name", "web_page_url", "web_page_embedded", "web_page_version", "web_page_image_data", "web_page_bg_color", "web_page_shown_version");

    /* renamed from: e */
    public static final StatementHelper f52374e = StatementHelper.newDeleteHelper("web_pages", "metro_id", "revision");

    /* renamed from: b */
    public volatile List<C20222a> f52375b = null;

    /* renamed from: yr.c$a */
    public static class C20759a extends C19806a.C19807a {

        /* renamed from: d */
        public final List<C20222a> f52376d;

        public C20759a(Context context, ServerId serverId, long j, List<C20222a> list) {
            super(context, serverId, j);
            C21100e.m49373x(list, "webPages");
            this.f52376d = list;
        }

        /* renamed from: a */
        public final void mo52111a(Context context, ServerId serverId, long j, SQLiteDatabase sQLiteDatabase) {
            ServerId serverId2 = serverId;
            long j2 = j;
            SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
            int i = serverId2.f15142b;
            SQLiteStatement prepare = C20758c.f52372c.prepare(sQLiteDatabase2);
            SQLiteStatement prepare2 = C20758c.f52373d.prepare(sQLiteDatabase2);
            ArrayList arrayList = new ArrayList(this.f52376d.size());
            Iterator<C20222a> it = this.f52376d.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                C20222a next = it.next();
                arrayList.add(next.f51317a);
                StatementHelper statementHelper = C20758c.f52372c;
                C20758c.m48745h(statementHelper, prepare, next, i2);
                long j3 = (long) i;
                statementHelper.bindWhereArg(prepare, "metro_id", j3);
                statementHelper.bindWhereArg(prepare, "revision", j2);
                int i3 = i;
                Iterator<C20222a> it2 = it;
                statementHelper.bindWhereArg(prepare, "web_page_id", next.f51317a);
                if (prepare.executeUpdateDelete() == 0) {
                    StatementHelper statementHelper2 = C20758c.f52373d;
                    C20758c.m48745h(statementHelper2, prepare2, next, i2);
                    statementHelper2.bindValue(prepare2, "metro_id", j3);
                    statementHelper2.bindValue(prepare2, "revision", j2);
                    statementHelper2.bindValue(prepare2, "web_page_id", next.f51317a);
                    statementHelper2.bindValue(prepare2, "web_page_shown_version", -1);
                    prepare2.executeInsert();
                }
                i2++;
                i = i3;
                it = it2;
            }
            String[] createSelectionArgs = DatabaseUtils.createSelectionArgs(serverId2, j2, arrayList);
            Object[] objArr = {DatabaseUtils.createInClausePlaceHolders(arrayList.size())};
            String str = C20964s0.f52718a;
            sQLiteDatabase2.execSQL(String.format((Locale) null, "DELETE FROM web_pages WHERE metro_id = ? AND revision = ? AND web_page_id NOT IN (%s)", objArr), createSelectionArgs);
        }
    }

    public C20758c(C19391d dVar) {
        super(dVar);
    }

    /* renamed from: h */
    public static void m48745h(StatementHelper statementHelper, SQLiteStatement sQLiteStatement, C20222a aVar, int i) {
        statementHelper.bindValue(sQLiteStatement, "web_page_type", (long) aVar.f51318b);
        statementHelper.bindValue(sQLiteStatement, "web_page_new_index", (long) i);
        statementHelper.bindValue(sQLiteStatement, "web_page_name", aVar.f51319c);
        statementHelper.bindValue(sQLiteStatement, "web_page_url", aVar.f51320d);
        statementHelper.bindValue(sQLiteStatement, "web_page_embedded", aVar.f51323g);
        statementHelper.bindValue(sQLiteStatement, "web_page_version", aVar.f51324h);
        Image image = aVar.f51321e;
        if (image != null) {
            statementHelper.bindValue(sQLiteStatement, "web_page_image_data", C13641g.m34110B(image, C16019d.m40803a().f41718d));
        } else {
            statementHelper.bindNullValue(sQLiteStatement, "web_page_image_data");
        }
        Color color = aVar.f51322f;
        if (color != null) {
            statementHelper.bindValue(sQLiteStatement, "web_page_bg_color", (long) color.f41007b);
        } else {
            statementHelper.bindNullValue(sQLiteStatement, "web_page_bg_color");
        }
    }

    /* renamed from: j */
    public static ArrayList m48746j(Cursor cursor) {
        boolean z;
        Image image;
        int i;
        Color color;
        Cursor cursor2 = cursor;
        int columnIndex = cursor2.getColumnIndex("web_page_id");
        int columnIndex2 = cursor2.getColumnIndex("web_page_type");
        int columnIndex3 = cursor2.getColumnIndex("web_page_name");
        int columnIndex4 = cursor2.getColumnIndex("web_page_url");
        int columnIndex5 = cursor2.getColumnIndex("web_page_embedded");
        int columnIndex6 = cursor2.getColumnIndex("web_page_version");
        int columnIndex7 = cursor2.getColumnIndex("web_page_shown_version");
        int columnIndex8 = cursor2.getColumnIndex("web_page_image_data");
        int columnIndex9 = cursor2.getColumnIndex("web_page_bg_color");
        ArrayList arrayList = new ArrayList(cursor.getCount());
        while (cursor.moveToNext()) {
            String string = cursor2.getString(columnIndex);
            int i2 = cursor2.getInt(columnIndex2);
            String string2 = cursor2.getString(columnIndex3);
            String string3 = cursor2.getString(columnIndex4);
            if (cursor2.getInt(columnIndex5) == 1) {
                z = true;
            } else {
                z = false;
            }
            long j = cursor2.getLong(columnIndex6);
            long j2 = cursor2.getLong(columnIndex7);
            byte[] blob = cursor2.getBlob(columnIndex8);
            if (blob != null) {
                image = (Image) C13641g.m34120h(blob, C16019d.m40803a().f41718d);
            } else {
                image = null;
            }
            if (!cursor2.isNull(columnIndex9)) {
                i = columnIndex;
                color = new Color(cursor2.getInt(columnIndex9));
            } else {
                i = columnIndex;
                color = null;
            }
            arrayList.add(new C20222a(string, i2, string2, string3, image, color, z, j, j2));
            columnIndex = i;
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo6588a(Context context) {
        SQLiteDatabase writableDatabase = DatabaseHelper.get(context).getWritableDatabase();
        ServerId d = mo52107d();
        long f = mo52109f();
        StatementHelper statementHelper = f52374e;
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
    /* renamed from: i */
    public final synchronized void mo52894i(android.content.Context r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.moovit.database.DatabaseHelper r5 = com.moovit.database.DatabaseHelper.get(r5)     // Catch:{ all -> 0x0038 }
            com.moovit.database.sqlite.SQLiteDatabase r5 = r5.getReadableDatabase()     // Catch:{ all -> 0x0038 }
            java.lang.String r0 = "SELECT web_page_id,web_page_type,web_page_name,web_page_url,web_page_embedded,web_page_version,web_page_shown_version,web_page_image_data,web_page_bg_color FROM web_pages WHERE metro_id = ? AND revision = ? ORDER BY web_page_new_index ASC"
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
            java.util.ArrayList r0 = m48746j(r5)     // Catch:{ all -> 0x0038 }
            r5.close()     // Catch:{ all -> 0x0038 }
            monitor-enter(r4)     // Catch:{ all -> 0x0038 }
            java.util.List r5 = java.util.Collections.unmodifiableList(r0)     // Catch:{ all -> 0x0035 }
            r4.f52375b = r5     // Catch:{ all -> 0x0035 }
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
        throw new UnsupportedOperationException("Method not decompiled: p945yr.C20758c.mo52894i(android.content.Context):void");
    }
}
