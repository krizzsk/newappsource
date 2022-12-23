package u00;

import android.content.Context;
import android.database.Cursor;
import c00.C13717b;
import c70.C13749c;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.google.android.gms.nearby.messages.Strategy;
import com.moovit.commons.utils.Color;
import com.moovit.database.DatabaseHelper;
import com.moovit.database.DatabaseUtils;
import com.moovit.database.StatementHelper;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.database.sqlite.SQLiteStatement;
import com.moovit.image.C16019d;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitLineGroup;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import p001a0.C0017h;
import p389bl.C13641g;
import p693nz.C18659h;
import p834tz.C19794a;
import p898wr.C20400b;
import p977zz.C20952m0;
import p977zz.C20964s0;
import u00.C19806a;

/* renamed from: u00.o */
public final class C19848o extends C19806a {

    /* renamed from: d */
    public static final StatementHelper f50443d = StatementHelper.newInsertHelper("line_groups", 5, "metro_id", "revision", "line_group_id", "line_group_type", "agency_id", "line_number", "primary_caption", "secondary_caption", "line_color", "image_ref_set_data", "inner_image_ids_data");

    /* renamed from: e */
    public static final StatementHelper f50444e = StatementHelper.newDeleteHelper("line_groups", "metro_id", "revision");

    /* renamed from: f */
    public static final StatementHelper f50445f = StatementHelper.newInsertHelper("lines", 5, "metro_id", "revision", "line_id", "line_group_id", "line_group_order_index", "line_origin", "line_destination", "line_long_name", "line_direction_name");

    /* renamed from: g */
    public static final StatementHelper f50446g = StatementHelper.newDeleteHelper("lines", "metro_id", "revision");

    /* renamed from: h */
    public static final String f50447h;

    /* renamed from: i */
    public static final String f50448i;

    /* renamed from: b */
    public final C18659h<ServerId, TransitLineGroup> f50449b = new C18659h<>(100);

    /* renamed from: c */
    public final C18659h<ServerId, ServerId> f50450c = new C18659h<>(Strategy.TTL_SECONDS_DEFAULT);

    /* renamed from: u00.o$a */
    public class C19849a extends C19806a.C19807a {

        /* renamed from: d */
        public final Collection<TransitLineGroup> f50451d;

        public C19849a(Context context, ServerId serverId, long j, HashSet hashSet) {
            super(context, serverId, j);
            this.f50451d = hashSet;
        }

        /* renamed from: a */
        public final void mo52111a(Context context, ServerId serverId, long j, SQLiteDatabase sQLiteDatabase) {
            C19849a aVar = this;
            long j2 = j;
            SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
            int i = C19848o.this.mo52107d().f15142b;
            SQLiteStatement prepare = C19848o.f50443d.prepare(sQLiteDatabase2);
            SQLiteStatement prepare2 = C19848o.f50445f.prepare(sQLiteDatabase2);
            Iterator<TransitLineGroup> it = aVar.f50451d.iterator();
            while (it.hasNext()) {
                TransitLineGroup next = it.next();
                ServerId serverId2 = next.f23694b;
                C19848o.this.f50449b.put(serverId2, next);
                StatementHelper statementHelper = C19848o.f50443d;
                long j3 = (long) i;
                statementHelper.bindValue(prepare, "metro_id", j3);
                statementHelper.bindValue(prepare, "revision", j2);
                int i2 = i;
                statementHelper.bindValue(prepare, "line_group_id", (long) next.f23694b.f15142b);
                Iterator<TransitLineGroup> it2 = it;
                statementHelper.bindValue(prepare, "line_group_type", (long) next.f23695c);
                statementHelper.bindValue(prepare, "agency_id", (long) next.f23696d.getServerId().f15142b);
                statementHelper.bindValue(prepare, "line_number", next.f23697e);
                String str = next.f23698f;
                if (str != null) {
                    statementHelper.bindValue(prepare, "primary_caption", str);
                } else {
                    statementHelper.bindNullValue(prepare, "primary_caption");
                }
                String str2 = next.f23699g;
                if (str2 != null) {
                    statementHelper.bindValue(prepare, "secondary_caption", str2);
                } else {
                    statementHelper.bindNullValue(prepare, "secondary_caption");
                }
                Color color = next.f23702j;
                if (color != null) {
                    C20952m0<Integer> m0Var = C13749c.f33838a;
                    statementHelper.bindValue(prepare, "line_color", (long) color.f41007b);
                } else {
                    statementHelper.bindNullValue(prepare, "line_color");
                }
                statementHelper.bindValue(prepare, "image_ref_set_data", C13641g.m34110B(next.f23704l, C16019d.m40803a().f41721g));
                statementHelper.bindValue(prepare, "inner_image_ids_data", C13641g.m34110B(next.f23705m, C19794a.f50325c));
                prepare.executeInsert();
                int i3 = next.f23694b.f15142b;
                int i4 = 0;
                Iterator<TransitLine> it3 = next.f23700h.iterator();
                while (it3.hasNext()) {
                    TransitLine next2 = it3.next();
                    C19848o.this.f50450c.put(next2.f23687c, serverId2);
                    int i5 = i4 + 1;
                    StatementHelper statementHelper2 = C19848o.f50445f;
                    statementHelper2.bindValue(prepare2, "metro_id", j3);
                    SQLiteStatement sQLiteStatement = prepare;
                    Iterator<TransitLine> it4 = it3;
                    statementHelper2.bindValue(prepare2, "revision", j);
                    statementHelper2.bindValue(prepare2, "line_id", (long) next2.f23687c.f15142b);
                    statementHelper2.bindValue(prepare2, "line_group_id", (long) i3);
                    statementHelper2.bindValue(prepare2, "line_group_order_index", (long) i4);
                    String str3 = next2.f23688d;
                    if (str3 != null) {
                        statementHelper2.bindValue(prepare2, "line_origin", str3);
                    } else {
                        statementHelper2.bindNullValue(prepare2, "line_origin");
                    }
                    statementHelper2.bindValue(prepare2, "line_destination", next2.f23689e);
                    String str4 = next2.f23690f;
                    if (str4 != null) {
                        statementHelper2.bindValue(prepare2, "line_long_name", str4);
                    } else {
                        statementHelper2.bindNullValue(prepare2, "line_long_name");
                    }
                    String str5 = next2.f23691g;
                    if (str5 != null) {
                        statementHelper2.bindValue(prepare2, "line_direction_name", str5);
                    } else {
                        statementHelper2.bindNullValue(prepare2, "line_direction_name");
                    }
                    prepare2.executeInsert();
                    aVar = this;
                    it3 = it4;
                    i4 = i5;
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
        k.append("line_groups");
        k.append(" (");
        k.append("metro_id");
        C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "revision", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "line_group_id");
        C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "line_group_type", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "agency_id");
        C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "line_number", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "primary_caption");
        C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "secondary_caption", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "line_color");
        C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "image_ref_set_data", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "inner_image_ids_data");
        C0017h.m61R(k, ") SELECT ", "metro_id", ",? ,", "line_group_id");
        C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "line_group_type", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "agency_id");
        C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "line_number", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "primary_caption");
        C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "secondary_caption", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "line_color");
        C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "image_ref_set_data", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "inner_image_ids_data");
        C0017h.m61R(k, " FROM ", "line_groups", " WHERE ", "metro_id");
        f50447h = C13715c.m34245k(k, " = ? AND ", "revision", " = ?");
        StringBuilder k2 = C13555b.m33972k("INSERT ");
        k2.append(DatabaseUtils.getConflictAlgorithm(4));
        k2.append(" INTO ");
        String str = "lines";
        k2.append(str);
        k2.append(" (");
        k2.append("metro_id");
        C0017h.m61R(k2, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "revision", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "line_id");
        C0017h.m61R(k2, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "line_group_id", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "line_group_order_index");
        C0017h.m61R(k2, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "line_origin", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "line_destination");
        C0017h.m61R(k2, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "line_long_name", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "line_direction_name");
        C0017h.m61R(k2, ") SELECT ", "metro_id", ",? ,", "line_id");
        C0017h.m61R(k2, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "line_group_id", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "line_group_order_index");
        C0017h.m61R(k2, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "line_origin", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "line_destination");
        C0017h.m61R(k2, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "line_long_name", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "line_direction_name");
        C0017h.m61R(k2, " FROM ", str, " WHERE ", "metro_id");
        f50448i = C13715c.m34245k(k2, " = ? AND ", "revision", " = ?");
    }

    public C19848o(C20400b bVar) {
        super(bVar);
    }

    /* renamed from: a */
    public final void mo6588a(Context context) {
        SQLiteDatabase writableDatabase = DatabaseHelper.get(context).getWritableDatabase();
        ServerId d = mo52107d();
        long f = mo52109f();
        StatementHelper statementHelper = f50446g;
        SQLiteStatement prepare = statementHelper.prepare(writableDatabase);
        statementHelper.bindWhereArg(prepare, "metro_id", d);
        statementHelper.bindWhereArg(prepare, "revision", f);
        prepare.executeUpdateDelete();
        StatementHelper statementHelper2 = f50444e;
        SQLiteStatement prepare2 = statementHelper2.prepare(writableDatabase);
        statementHelper2.bindWhereArg(prepare2, "metro_id", d);
        statementHelper2.bindWhereArg(prepare2, "revision", f);
        prepare2.executeUpdateDelete();
    }

    /* renamed from: c */
    public final void mo51799c() {
        this.f50449b.onLowMemory();
        this.f50450c.onLowMemory();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v3, resolved type: a20.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v3, resolved type: android.util.SparseIntArray} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Set mo52149h(android.content.Context r43, java.util.Set r44) {
        /*
            r42 = this;
            r0 = r42
            boolean r1 = r44.isEmpty()
            if (r1 == 0) goto L_0x000d
            java.util.Set r1 = java.util.Collections.emptySet()
            return r1
        L_0x000d:
            int r1 = r44.size()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>(r1)
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>(r1)
            java.util.Iterator r1 = r44.iterator()
        L_0x001f:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x003d
            java.lang.Object r4 = r1.next()
            com.moovit.network.model.ServerId r4 = (com.moovit.network.model.ServerId) r4
            nz.h<com.moovit.network.model.ServerId, com.moovit.transit.TransitLineGroup> r5 = r0.f50449b
            java.lang.Object r5 = r5.get(r4)
            com.moovit.transit.TransitLineGroup r5 = (com.moovit.transit.TransitLineGroup) r5
            if (r5 == 0) goto L_0x0039
            r2.add(r5)
            goto L_0x001f
        L_0x0039:
            r3.add(r4)
            goto L_0x001f
        L_0x003d:
            r2.size()
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L_0x0047
            return r2
        L_0x0047:
            com.moovit.database.DatabaseHelper r1 = com.moovit.database.DatabaseHelper.get(r43)
            com.moovit.database.sqlite.SQLiteDatabase r1 = r1.getReadableDatabase()
            java.util.List r4 = c00.C13717b.m34262i(r3)
            java.util.Iterator r4 = r4.iterator()
        L_0x0057:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0212
            java.lang.Object r5 = r4.next()
            java.util.Collection r5 = (java.util.Collection) r5
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r8 = 0
            int r9 = r5.size()
            java.lang.String r9 = com.moovit.database.DatabaseUtils.createInClausePlaceHolders(r9)
            r7[r8] = r9
            java.lang.String r8 = p977zz.C20964s0.f52718a
            r8 = 0
            java.lang.String r9 = "SELECT line_groups.line_group_id,line_group_type,agency_id,line_number,primary_caption,secondary_caption,line_color,image_ref_set_data,inner_image_ids_data,line_id,line_origin,line_destination,line_long_name,line_direction_name FROM line_groups JOIN lines WHERE line_groups.metro_id = ? AND line_groups.revision = ? AND line_groups.line_group_id IN (%s) AND lines.metro_id = line_groups.metro_id AND lines.revision = line_groups.revision AND lines.line_group_id = line_groups.line_group_id ORDER BY lines.line_group_id,lines.line_group_order_index ASC;"
            java.lang.String r7 = java.lang.String.format(r8, r9, r7)
            com.moovit.network.model.ServerId r9 = r42.mo52107d()
            long r10 = r42.mo52109f()
            java.util.ArrayList r5 = com.moovit.database.DatabaseUtils.idsToString(r5)
            java.lang.String[] r5 = com.moovit.database.DatabaseUtils.createSelectionArgs(r9, r10, r5)
            android.database.Cursor r5 = r1.rawQuery(r7, r5)
            java.lang.String r7 = "line_group_id"
            int r7 = r5.getColumnIndex(r7)
            java.lang.String r9 = "line_group_type"
            int r9 = r5.getColumnIndex(r9)
            java.lang.String r10 = "agency_id"
            int r10 = r5.getColumnIndex(r10)
            java.lang.String r11 = "line_number"
            int r11 = r5.getColumnIndex(r11)
            java.lang.String r12 = "primary_caption"
            int r12 = r5.getColumnIndex(r12)
            java.lang.String r13 = "secondary_caption"
            int r13 = r5.getColumnIndex(r13)
            java.lang.String r14 = "line_color"
            int r14 = r5.getColumnIndex(r14)
            java.lang.String r15 = "image_ref_set_data"
            int r15 = r5.getColumnIndex(r15)
            java.lang.String r6 = "inner_image_ids_data"
            int r6 = r5.getColumnIndex(r6)
            java.lang.String r8 = "line_id"
            int r8 = r5.getColumnIndex(r8)
            r16 = r1
            java.lang.String r1 = "line_origin"
            int r1 = r5.getColumnIndex(r1)
            r17 = r4
            java.lang.String r4 = "line_destination"
            int r4 = r5.getColumnIndex(r4)
            r18 = r3
            java.lang.String r3 = "line_long_name"
            int r3 = r5.getColumnIndex(r3)
            r19 = r3
            java.lang.String r3 = "line_direction_name"
            int r3 = r5.getColumnIndex(r3)
            r43 = r3
            r3 = 0
            r31 = 1
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
        L_0x00ff:
            boolean r20 = r5.moveToNext()
            if (r20 == 0) goto L_0x01e2
            r40 = r4
            int r4 = r5.getInt(r7)
            r41 = r7
            com.moovit.network.model.ServerId r7 = new com.moovit.network.model.ServerId
            r7.<init>(r4)
            if (r3 == 0) goto L_0x0141
            boolean r4 = r7.equals(r3)
            if (r4 != 0) goto L_0x0141
            com.moovit.transit.TransitLineGroup r4 = new com.moovit.transit.TransitLineGroup
            r20 = r4
            r21 = r3
            r22 = r31
            r23 = r32
            r24 = r33
            r25 = r34
            r26 = r35
            r27 = r36
            r28 = r37
            r29 = r38
            r30 = r39
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r20 = r7
            nz.h<com.moovit.network.model.ServerId, com.moovit.transit.TransitLineGroup> r7 = r0.f50449b
            r7.put(r3, r4)
            r2.add(r4)
            r3 = 0
            goto L_0x0143
        L_0x0141:
            r20 = r7
        L_0x0143:
            if (r3 != 0) goto L_0x019d
            int r3 = r5.getInt(r9)
            int r4 = r5.getInt(r10)
            com.moovit.network.model.ServerId r7 = new com.moovit.network.model.ServerId
            r7.<init>(r4)
            com.moovit.database.DbEntityRef r32 = com.moovit.database.DbEntityRef.newAgencyRef((com.moovit.network.model.ServerId) r7)
            java.lang.String r33 = r5.getString(r11)
            java.lang.String r34 = r5.getString(r12)
            java.lang.String r35 = r5.getString(r13)
            boolean r4 = r5.isNull(r14)
            if (r4 == 0) goto L_0x016b
            r37 = 0
            goto L_0x0176
        L_0x016b:
            com.moovit.commons.utils.Color r4 = new com.moovit.commons.utils.Color
            int r7 = r5.getInt(r14)
            r4.<init>(r7)
            r37 = r4
        L_0x0176:
            byte[] r4 = r5.getBlob(r15)
            com.moovit.image.d r7 = com.moovit.image.C16019d.m40803a()
            a20.b$a r7 = r7.f41721g
            java.lang.Object r4 = p389bl.C13641g.m34120h(r4, r7)
            r38 = r4
            a20.b r38 = (a20.C13388b) r38
            byte[] r4 = r5.getBlob(r6)
            tz.a$d r7 = p834tz.C19794a.f50325c
            java.lang.Object r4 = p389bl.C13641g.m34120h(r4, r7)
            r39 = r4
            android.util.SparseIntArray r39 = (android.util.SparseIntArray) r39
            java.util.ArrayList r36 = new java.util.ArrayList
            r36.<init>()
            r31 = r3
        L_0x019d:
            r3 = r36
            int r4 = r5.getInt(r8)
            com.moovit.network.model.ServerId r7 = new com.moovit.network.model.ServerId
            r7.<init>(r4)
            java.lang.String r23 = r5.getString(r1)
            r4 = r40
            java.lang.String r24 = r5.getString(r4)
            r27 = r1
            r1 = r19
            java.lang.String r25 = r5.getString(r1)
            r1 = r43
            java.lang.String r26 = r5.getString(r1)
            com.moovit.transit.TransitLine r1 = new com.moovit.transit.TransitLine
            r21 = r1
            r22 = r7
            r21.<init>(r22, r23, r24, r25, r26)
            nz.h<com.moovit.network.model.ServerId, com.moovit.network.model.ServerId> r4 = r0.f50450c
            r21 = r6
            r6 = r20
            r4.put(r7, r6)
            r3.add(r1)
            r36 = r3
            r3 = r6
            r6 = r21
            r1 = r27
            r4 = r40
            r7 = r41
            goto L_0x00ff
        L_0x01e2:
            if (r3 == 0) goto L_0x0207
            com.moovit.transit.TransitLineGroup r1 = new com.moovit.transit.TransitLineGroup
            r20 = r1
            r21 = r3
            r22 = r31
            r23 = r32
            r24 = r33
            r25 = r34
            r26 = r35
            r27 = r36
            r28 = r37
            r29 = r38
            r30 = r39
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            nz.h<com.moovit.network.model.ServerId, com.moovit.transit.TransitLineGroup> r4 = r0.f50449b
            r4.put(r3, r1)
            r2.add(r1)
        L_0x0207:
            r5.close()
            r1 = r16
            r4 = r17
            r3 = r18
            goto L_0x0057
        L_0x0212:
            r18 = r3
            r18.size()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: u00.C19848o.mo52149h(android.content.Context, java.util.Set):java.util.Set");
    }

    /* renamed from: i */
    public final Set<ServerId> mo52150i(Context context, Set<ServerId> set) {
        if (set.isEmpty()) {
            return Collections.emptySet();
        }
        int size = set.size();
        HashSet hashSet = new HashSet(size);
        HashSet hashSet2 = new HashSet(size);
        for (ServerId next : set) {
            ServerId serverId = this.f50450c.get(next);
            if (serverId != null) {
                hashSet.add(serverId);
            } else {
                hashSet2.add(next);
            }
        }
        hashSet.size();
        if (!hashSet2.isEmpty()) {
            SQLiteDatabase readableDatabase = DatabaseHelper.get(context).getReadableDatabase();
            for (Collection collection : C13717b.m34262i(hashSet2)) {
                Object[] objArr = {DatabaseUtils.createInClausePlaceHolders(collection.size())};
                String str = C20964s0.f52718a;
                Cursor rawQuery = readableDatabase.rawQuery(String.format((Locale) null, "SELECT lines.line_id,lines.line_group_id FROM lines WHERE lines.metro_id = ? AND lines.revision = ? AND lines.line_id IN (%s) GROUP BY lines.line_group_id", objArr), DatabaseUtils.createSelectionArgs(mo52107d(), mo52109f(), DatabaseUtils.idsToString(collection)));
                int columnIndex = rawQuery.getColumnIndex("line_id");
                int columnIndex2 = rawQuery.getColumnIndex("line_group_id");
                while (rawQuery.moveToNext()) {
                    ServerId serverId2 = new ServerId(rawQuery.getInt(columnIndex));
                    ServerId serverId3 = new ServerId(rawQuery.getInt(columnIndex2));
                    this.f50450c.put(serverId2, serverId3);
                    hashSet.add(serverId3);
                }
                rawQuery.close();
            }
            hashSet2.size();
        }
        return hashSet;
    }
}
