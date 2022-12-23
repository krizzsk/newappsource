package g30;

import android.content.Context;
import c30.C1775e;
import c70.C13752e;
import com.google.firebase.perf.metrics.Trace;
import com.moovit.commons.appdata.AppDataPartLoadFailedException;
import com.moovit.commons.request.ServerException;
import com.moovit.database.DatabaseHelper;
import com.moovit.database.DatabaseJobQueue;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.network.model.ServerId;
import g30.C4784n;
import java.io.IOException;
import java.util.HashSet;
import p401bz.C13711e;
import p435de.C16596f;
import p532hf.C17427b;
import p626lf.C18200a;
import p646lz.C18299a;
import p824tp.C19728f;
import p824tp.C19731i;
import p929xy.C20663f;
import p929xy.C20664g;
import p977zz.C20935e;
import q00.C19047a;
import q00.C19053d;
import s00.C19391d;
import s00.C19393f;
import u00.C19824g;
import v00.C20062a;

/* renamed from: g30.f */
public final class C4773f extends C20663f<C19728f> {

    /* renamed from: g30.f$a */
    public static class C4774a extends DatabaseJobQueue.Job {

        /* renamed from: b */
        public final C4784n.C4786b f16124b;

        public C4774a(Context context, C4784n.C4786b bVar) {
            super(context);
            this.f16124b = bVar;
        }

        /* renamed from: a */
        public final void mo20297a(SQLiteDatabase sQLiteDatabase, C20062a aVar, C4784n.C4785a aVar2, C20935e eVar) {
            boolean z;
            try {
                String str = aVar2.f16157a;
                C4784n.C4786b bVar = this.f16124b;
                ServerId serverId = bVar.f16160a;
                long j = bVar.f16161b;
                long j2 = bVar.f16162c;
                int length = aVar2.f16158b.length;
                eVar.invoke(aVar2.f16158b);
                Boolean bool = Boolean.TRUE;
                if (!bool.equals((Boolean) aVar.mo52326c(sQLiteDatabase, serverId, j)) || !aVar2.f16159c) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    C4784n.C4786b bVar2 = this.f16124b;
                    aVar.mo52327f(sQLiteDatabase, bVar2.f16160a, bVar2.f16162c, bool);
                }
                C4784n.C4786b bVar3 = this.f16124b;
                ServerId serverId2 = bVar3.f16160a;
                long j3 = bVar3.f16162c;
                int length2 = aVar2.f16158b.length;
            } catch (Exception e) {
                String str2 = aVar2.f16157a;
                C16596f a = C16596f.m42113a();
                StringBuilder k = C13555b.m33972k("Unable to migrate ");
                k.append(aVar2.f16157a);
                a.mo49364c(new IOException(k.toString(), e));
            }
        }

        public final void work(Context context, SQLiteDatabase sQLiteDatabase) throws Exception {
            C19393f fVar = C19393f.f49325q;
            C19731i a = C19731i.m47197a(context);
            C4784n.C4786b bVar = this.f16124b;
            C19391d b = a.mo52084b(bVar.f16160a, bVar.f16162c);
            mo20297a(sQLiteDatabase, fVar.f49336j, this.f16124b.f16163d, new C4770c(this, b, sQLiteDatabase));
            mo20297a(sQLiteDatabase, fVar.f49335i, this.f16124b.f16164e, new C4771d(this, b, sQLiteDatabase));
            mo20297a(sQLiteDatabase, fVar.f49337k, this.f16124b.f16165f, new C4772e(this, b, sQLiteDatabase));
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: q */
    public static p824tp.C19728f m12097q(android.content.Context r29, com.moovit.network.model.ServerId r30, long r31) {
        /*
            r0 = r29
            tp.i r1 = p824tp.C19731i.m47197a(r29)
            r2 = r30
            r3 = r31
            s00.d r1 = r1.mo52084b(r2, r3)
            java.lang.Class<u00.g> r2 = u00.C19824g.class
            s00.b r1 = r1.mo51794a(r2)
            u00.g r1 = (u00.C19824g) r1
            r1.getClass()
            com.moovit.database.DatabaseHelper r2 = com.moovit.database.DatabaseHelper.get(r29)
            com.moovit.database.sqlite.SQLiteDatabase r2 = r2.getReadableDatabase()
            java.lang.String r3 = "SELECT metro_language,metro_name,metro_class,time_zone_id,bounds,default_location,templates_presentation_conf_data,templates_data,stops_category_report_data,lines_category_report_data,country_id,country_name,country_code,local_day_change_time FROM metro_info WHERE metro_id = ? AND revision = ?"
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.String r5 = r1.mo52108e()
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = r1.mo52110g()
            r7 = 1
            r4[r7] = r5
            java.lang.String[] r4 = com.moovit.database.DatabaseUtils.createSelectionArgs((java.lang.String[]) r4)
            android.database.Cursor r2 = r2.rawQuery(r3, r4)
            boolean r3 = r2.moveToFirst()
            r4 = 0
            if (r3 != 0) goto L_0x0049
            r2.close()
            r0 = r4
            goto L_0x018c
        L_0x0049:
            com.moovit.network.model.ServerId r9 = r1.mo52107d()
            long r10 = r1.mo52109f()
            java.lang.String r3 = "metro_language"
            int r3 = r2.getColumnIndex(r3)
            java.lang.String r12 = r2.getString(r3)
            java.lang.String r3 = "metro_name"
            int r3 = r2.getColumnIndex(r3)
            java.lang.String r13 = r2.getString(r3)
            java.lang.String r3 = "metro_class"
            int r3 = r2.getColumnIndex(r3)
            java.lang.String r14 = r2.getString(r3)
            java.lang.String r3 = "time_zone_id"
            int r3 = r2.getColumnIndex(r3)
            java.lang.String r3 = r2.getString(r3)
            java.util.TimeZone r15 = p988j$.util.DesugarTimeZone.getTimeZone(r3)
            java.lang.String r3 = "bounds"
            int r3 = r2.getColumnIndex(r3)
            byte[] r3 = r2.getBlob(r3)
            com.moovit.commons.geo.Polylon$c r5 = com.moovit.commons.geo.Polylon.f40985h
            java.lang.Object r3 = p389bl.C13641g.m34120h(r3, r5)
            r16 = r3
            com.moovit.commons.geo.Polygon r16 = (com.moovit.commons.geo.Polygon) r16
            java.lang.String r3 = "default_location"
            int r3 = r2.getColumnIndex(r3)
            byte[] r3 = r2.getBlob(r3)
            com.moovit.commons.geo.LatLonE6$c r5 = com.moovit.commons.geo.LatLonE6.f40979g
            java.lang.Object r3 = p389bl.C13641g.m34120h(r3, r5)
            r23 = r3
            com.moovit.commons.geo.LatLonE6 r23 = (com.moovit.commons.geo.LatLonE6) r23
            java.lang.String r3 = "templates_presentation_conf_data"
            int r3 = r2.getColumnIndex(r3)
            byte[] r3 = r2.getBlob(r3)
            g20.f$a r5 = g20.C17146f.f44382c
            sz.a r5 = p810sz.C19575a.m46957a(r5, r6)
            java.lang.Object r3 = p389bl.C13641g.m34120h(r3, r5)
            r19 = r3
            java.util.Collection r19 = (java.util.Collection) r19
            java.lang.String r3 = "templates_data"
            int r3 = r2.getColumnIndex(r3)
            byte[] r3 = r2.getBlob(r3)
            com.moovit.l10n.TemplateProtocol$g$a r5 = com.moovit.l10n.TemplateProtocol.C16179g.f42167h
            sz.a r5 = p810sz.C19575a.m46957a(r5, r6)
            java.lang.Object r3 = p389bl.C13641g.m34120h(r3, r5)
            r20 = r3
            java.util.Collection r20 = (java.util.Collection) r20
            java.lang.String r3 = "stops_category_report_data"
            int r3 = r2.getColumnIndex(r3)
            byte[] r3 = r2.getBlob(r3)
            sz.i<com.moovit.metro.ReportCategoryType> r5 = com.moovit.metro.ReportCategoryType.CODER
            sz.a r8 = p810sz.C19575a.m46957a(r5, r6)
            java.lang.Object r3 = p389bl.C13641g.m34120h(r3, r8)
            r22 = r3
            java.util.List r22 = (java.util.List) r22
            java.lang.String r3 = "lines_category_report_data"
            int r3 = r2.getColumnIndex(r3)
            byte[] r3 = r2.getBlob(r3)
            sz.a r5 = p810sz.C19575a.m46957a(r5, r6)
            java.lang.Object r3 = p389bl.C13641g.m34120h(r3, r5)
            r21 = r3
            java.util.List r21 = (java.util.List) r21
            D r3 = r1.f49320a
            s00.d r3 = (s00.C19391d) r3
            u00.r r3 = r3.mo51807i()
            monitor-enter(r3)
            r3.mo52154h(r0)     // Catch:{ all -> 0x01a2 }
            java.util.ArrayList r5 = r3.f50474b     // Catch:{ all -> 0x01a2 }
            java.util.List r17 = java.util.Collections.unmodifiableList(r5)     // Catch:{ all -> 0x01a2 }
            monitor-exit(r3)
            D r3 = r1.f49320a
            s00.d r3 = (s00.C19391d) r3
            u00.m r3 = r3.mo51801c()
            monitor-enter(r3)
            r3.mo52145h(r0)     // Catch:{ all -> 0x019f }
            com.moovit.util.HasServerIdMap<com.moovit.transit.TransitAgency> r5 = r3.f50436b     // Catch:{ all -> 0x019f }
            java.util.Collection r5 = r5.values()     // Catch:{ all -> 0x019f }
            java.util.Collection r18 = java.util.Collections.unmodifiableCollection(r5)     // Catch:{ all -> 0x019f }
            monitor-exit(r3)
            java.lang.String r3 = "country_id"
            int r3 = r2.getColumnIndex(r3)
            int r3 = r2.getInt(r3)
            com.moovit.network.model.ServerId r5 = new com.moovit.network.model.ServerId
            r5.<init>(r3)
            java.lang.String r3 = "country_name"
            int r3 = r2.getColumnIndex(r3)
            java.lang.String r25 = r2.getString(r3)
            java.lang.String r3 = "country_code"
            int r3 = r2.getColumnIndex(r3)
            java.lang.String r26 = r2.getString(r3)
            java.lang.String r3 = "local_day_change_time"
            int r3 = r2.getColumnIndex(r3)
            int r27 = r2.getInt(r3)
            D r1 = r1.f49320a
            s00.d r1 = (s00.C19391d) r1
            java.lang.Class<u00.b> r3 = u00.C19808b.class
            s00.b r1 = r1.mo51794a(r3)
            u00.b r1 = (u00.C19808b) r1
            monitor-enter(r1)
            monitor-enter(r1)     // Catch:{ all -> 0x0195 }
            monitor-enter(r1)     // Catch:{ all -> 0x019a }
            java.util.ArrayList r3 = r1.f50341b     // Catch:{ all -> 0x0197 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0197 }
            r3 = r3 ^ r7
            monitor-exit(r1)     // Catch:{ all -> 0x019a }
            if (r3 != 0) goto L_0x0179
            r1.mo52112h(r0)     // Catch:{ all -> 0x019a }
        L_0x0179:
            monitor-exit(r1)     // Catch:{ all -> 0x0195 }
            java.util.ArrayList r0 = r1.f50341b     // Catch:{ all -> 0x0195 }
            java.util.List r28 = java.util.Collections.unmodifiableList(r0)     // Catch:{ all -> 0x0195 }
            monitor-exit(r1)
            r2.close()
            g30.h r0 = new g30.h
            r8 = r0
            r24 = r5
            r8.<init>(r9, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
        L_0x018c:
            if (r0 != 0) goto L_0x018f
            goto L_0x0194
        L_0x018f:
            tp.f r4 = new tp.f
            r4.<init>(r0)
        L_0x0194:
            return r4
        L_0x0195:
            r0 = move-exception
            goto L_0x019d
        L_0x0197:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x019a }
            throw r0     // Catch:{ all -> 0x019a }
        L_0x019a:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0195 }
            throw r0     // Catch:{ all -> 0x0195 }
        L_0x019d:
            monitor-exit(r1)
            throw r0
        L_0x019f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x01a2:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g30.C4773f.m12097q(android.content.Context, com.moovit.network.model.ServerId, long):tp.f");
    }

    /* renamed from: r */
    public static C4776h m12098r(C13752e eVar, ServerId serverId, long j, boolean z) throws IOException, ServerException {
        Class<C1775e> cls = C1775e.class;
        Context context = eVar.f33852a;
        ((C1775e) C19731i.m47197a(context).f50175e.mo51794a(cls)).getClass();
        C4776h hVar = ((C4778j) new C4777i(eVar, serverId, j, C1775e.m5081d(context, serverId).mo49542a()).mo52626J()).f16145m;
        Context context2 = eVar.f33852a;
        ServerId serverId2 = hVar.f16126a;
        long j2 = hVar.f16127b;
        SQLiteDatabase writableDatabase = DatabaseHelper.get(context2).getWritableDatabase();
        writableDatabase.beginTransactionNonExclusive();
        try {
            C19393f fVar = C19393f.f49325q;
            fVar.getClass();
            C19393f.m46697g(writableDatabase, serverId2, j2);
            fVar.f49327a.mo52327f(writableDatabase, serverId2, j2, Boolean.TRUE);
            String str = hVar.f16128c;
            ((C1775e) C19731i.m47197a(context2).f50175e.mo51794a(cls)).getClass();
            if (str == null) {
                C1775e.m5081d(context2, serverId2).mo49543b();
            } else {
                C1775e.m5081d(context2, serverId2).mo49544c(str);
            }
            C19731i a = C19731i.m47197a(context2);
            a.getClass();
            ((C19824g) a.mo52084b(hVar.f16126a, hVar.f16127b).mo51794a(C19824g.class)).mo52129h(context2, hVar);
            if (z) {
                C19393f.m46691a(writableDatabase, serverId2);
                C19731i.m47197a(context2).f50172b.mo42913b(new C13711e(context2, serverId2, j2, System.currentTimeMillis()), false);
            }
            writableDatabase.setTransactionSuccessful();
            return hVar;
        } finally {
            writableDatabase.endTransaction();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00da  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static g30.C4776h m12099s(android.content.Context r18, com.moovit.network.model.ServerId r19, p646lz.C18299a r20, boolean r21, boolean r22, boolean r23) throws java.io.IOException, com.moovit.commons.request.ServerException {
        /*
            r7 = r18
            r8 = r19
            r9 = r20
            r0 = r23
            c70.e r1 = p929xy.C20664g.m48584i(r7, r9)
            com.moovit.database.DatabaseHelper r2 = com.moovit.database.DatabaseHelper.get(r18)
            com.moovit.database.sqlite.SQLiteDatabase r2 = r2.getReadableDatabase()
            s00.f r3 = s00.C19393f.f49325q
            r3.getClass()
            long r10 = s00.C19393f.m46693c(r2, r8)
            if (r0 == 0) goto L_0x0024
            long r2 = s00.C19393f.m46691a(r2, r8)
            goto L_0x0025
        L_0x0024:
            r2 = r10
        L_0x0025:
            tp.f r4 = m12097q(r7, r8, r2)
            if (r21 == 0) goto L_0x0067
            r5 = 0
            if (r4 != 0) goto L_0x002f
            goto L_0x0066
        L_0x002f:
            g30.h r6 = r4.f50165a
            java.lang.String r12 = r6.f16128c
            tp.i r13 = p824tp.C19731i.m47197a(r18)
            wr.a r13 = r13.f50175e
            java.lang.Class<c30.e> r14 = c30.C1775e.class
            s00.b r13 = r13.mo51794a(r14)
            c30.e r13 = (c30.C1775e) r13
            com.moovit.network.model.ServerId r14 = r6.f16126a
            r13.getClass()
            f00.f r13 = c30.C1775e.m5081d(r7, r14)
            java.lang.Object r13 = r13.mo49542a()
            java.lang.String r13 = (java.lang.String) r13
            boolean r12 = p977zz.C20975x0.m49118e(r12, r13)
            if (r12 == 0) goto L_0x0057
            goto L_0x0067
        L_0x0057:
            com.moovit.network.model.ServerId r4 = r6.f16126a
            long r12 = r6.f16127b
            ce0.C21100e.m49355o()
            s00.e r6 = new s00.e
            r6.<init>(r7, r4, r12)
            r6.run()
        L_0x0066:
            r4 = r5
        L_0x0067:
            if (r4 != 0) goto L_0x006f
            g30.h r1 = m12098r(r1, r8, r2, r0)
        L_0x006d:
            r12 = r1
            goto L_0x0090
        L_0x006f:
            if (r22 != 0) goto L_0x0074
            g30.h r1 = r4.f50165a
            goto L_0x006d
        L_0x0074:
            g30.o r5 = new g30.o
            r5.<init>(r8, r1)
            wz.g r5 = r5.mo52626J()
            g30.p r5 = (g30.C4788p) r5
            long r5 = r5.f16167m
            g30.h r4 = r4.f50165a
            long r12 = r4.f16127b
            int r14 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x008b
            r12 = r4
            goto L_0x0090
        L_0x008b:
            g30.h r1 = m12098r(r1, r8, r2, r0)
            goto L_0x006d
        L_0x0090:
            r1 = -1
            if (r12 == 0) goto L_0x0098
            long r3 = r12.f16127b
            r13 = r3
            goto L_0x0099
        L_0x0098:
            r13 = r1
        L_0x0099:
            if (r0 == 0) goto L_0x00e5
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00e5
            int r0 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x00e5
            tp.i r0 = p824tp.C19731i.m47197a(r18)
            com.google.android.play.core.assetpacks.z0 r15 = r0.f50172b
            bz.e r5 = new bz.e
            long r16 = java.lang.System.currentTimeMillis()
            r0 = r5
            r1 = r18
            r2 = r19
            r3 = r13
            r7 = r5
            r5 = r16
            r0.<init>(r1, r2, r3, r5)
            r0 = 0
            r15.mo42913b(r7, r0)
            java.lang.String r1 = "CONFIGURATION"
            java.lang.Object r1 = r9.mo50690c(r1)
            q00.a r1 = (q00.C19047a) r1
            if (r1 == 0) goto L_0x00d8
            r00.a r2 = q00.C19053d.f48459K
            java.lang.Object r1 = r1.mo51505b(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x00d8
            r0 = 1
        L_0x00d8:
            if (r0 == 0) goto L_0x00e5
            java.lang.String r1 = "metro_activation"
            r0 = r18
            r2 = r19
            r3 = r10
            r5 = r13
            m12100t(r0, r1, r2, r3, r5)
        L_0x00e5:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: g30.C4773f.m12099s(android.content.Context, com.moovit.network.model.ServerId, lz.a, boolean, boolean, boolean):g30.h");
    }

    /* renamed from: t */
    public static void m12100t(Context context, String str, ServerId serverId, long j, long j2) {
        boolean z;
        C16596f a = C16596f.m42113a();
        StringBuilder sb = new StringBuilder();
        sb.append("migration: m=");
        ServerId serverId2 = serverId;
        sb.append(serverId);
        sb.append(", f=");
        long j3 = j;
        sb.append(j);
        sb.append(", t=");
        sb.append(j2);
        a.mo49363b(sb.toString());
        C18200a aVar = C17427b.f44885g;
        Trace d = Trace.m36075d("migrate_sync_entities");
        d.start();
        String str2 = str;
        d.putAttribute("initiator", str);
        d.putAttribute("metroId", serverId.mo19751c());
        d.start();
        try {
            C4784n.C4786b bVar = ((C4784n) new C4783m(context, str, serverId, j, j2).mo52626J()).f16156f;
            if (bVar != null) {
                Context context2 = context;
                new C4774a(context, bVar).run();
            }
            z = true;
        } catch (Exception e) {
            C16596f.m42113a().mo49364c(new IOException("Unable to perform metro migration!", e));
            z = false;
        }
        d.putAttribute("isSuccess", String.valueOf(z));
        d.stop();
    }

    /* renamed from: b */
    public final HashSet mo20294b(Context context) {
        HashSet b = super.mo20294b(context);
        b.remove("METRO_CONTEXT");
        b.add("CONFIGURATION");
        b.add("GTFS_CONFIGURATION");
        return b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0065 A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0067  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo6591f(android.content.Context r10, p646lz.C18299a r11, java.lang.String r12) throws java.io.IOException, com.moovit.commons.appdata.AppDataPartLoadFailedException, com.moovit.commons.request.ServerException {
        /*
            r9 = this;
            com.moovit.MoovitApplication<?, ?, ?> r12 = com.moovit.MoovitApplication.f37317k
            boolean r4 = r12.f37320d
            java.lang.String r12 = "GTFS_CONFIGURATION"
            java.lang.Object r12 = r11.mo50690c(r12)
            com.moovit.offline.GtfsConfiguration r12 = (com.moovit.offline.GtfsConfiguration) r12
            boolean r0 = r12.mo19763c()
            if (r0 != 0) goto L_0x0013
            goto L_0x0042
        L_0x0013:
            com.moovit.network.model.ServerId r0 = p929xy.C20663f.m48573k(r11)
            com.moovit.database.DatabaseHelper r1 = com.moovit.database.DatabaseHelper.get(r10)
            com.moovit.database.sqlite.SQLiteDatabase r1 = r1.getReadableDatabase()
            s00.f r2 = s00.C19393f.f49325q
            r2.getClass()
            long r5 = s00.C19393f.m46693c(r1, r0)
            r7 = -1
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x002f
            goto L_0x0042
        L_0x002f:
            com.moovit.database.DatabaseHelper r1 = com.moovit.database.DatabaseHelper.get(r10)
            com.moovit.database.sqlite.SQLiteDatabase r1 = r1.getReadableDatabase()
            r2.getClass()
            long r1 = s00.C19393f.m46694d(r1, r0)
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x0045
        L_0x0042:
            r12 = 1
            r5 = 1
            goto L_0x0058
        L_0x0045:
            tp.i r3 = p824tp.C19731i.m47197a(r10)
            s00.d r0 = r3.mo52084b(r0, r1)
            u00.e r0 = r0.mo51802d()
            int r12 = r12.f15147b
            boolean r12 = r0.mo52120l(r12, r10)
            r5 = r12
        L_0x0058:
            com.moovit.network.model.ServerId r1 = p929xy.C20663f.m48573k(r11)
            r3 = 1
            r0 = r10
            r2 = r11
            g30.h r10 = m12099s(r0, r1, r2, r3, r4, r5)
            if (r10 != 0) goto L_0x0067
            r10 = 0
            goto L_0x006d
        L_0x0067:
            tp.f r11 = new tp.f
            r11.<init>(r10)
            r10 = r11
        L_0x006d:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: g30.C4773f.mo6591f(android.content.Context, lz.a, java.lang.String):java.lang.Object");
    }

    /* renamed from: m */
    public final boolean mo20295m(Context context, C18299a aVar, ServerId serverId, long j) {
        SQLiteDatabase readableDatabase = DatabaseHelper.get(context).getReadableDatabase();
        return Boolean.TRUE.equals(C19393f.f49325q.f49327a.mo52326c(readableDatabase, serverId, j));
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ Object mo6592n(Context context, C18299a aVar, ServerId serverId, long j) throws IOException, AppDataPartLoadFailedException, ServerException {
        return m12097q(context, serverId, j);
    }

    /* renamed from: o */
    public final Object mo6593o(C13752e eVar, C18299a aVar, ServerId serverId, long j) throws IOException, AppDataPartLoadFailedException, ServerException {
        return new C19728f(m12098r(eVar, serverId, j, false));
    }

    /* renamed from: p */
    public final Object mo20296p(Context context, C18299a aVar, ServerId serverId, long j) throws AppDataPartLoadFailedException, IOException, ServerException {
        boolean z = false;
        C4776h r = m12098r(C20664g.m48584i(context, aVar), serverId, j, false);
        C19728f fVar = new C19728f(r);
        C19047a aVar2 = (C19047a) aVar.mo50690c("CONFIGURATION");
        if (aVar2 != null && ((Boolean) aVar2.mo51505b(C19053d.f48459K)).booleanValue()) {
            z = true;
        }
        if (z) {
            SQLiteDatabase readableDatabase = DatabaseHelper.get(context).getReadableDatabase();
            C19393f.f49325q.getClass();
            long c = C19393f.m46693c(readableDatabase, serverId);
            long j2 = r.f16127b;
            if (c != j2) {
                m12100t(context, "metro_data_update", serverId, c, j2);
            }
        }
        return fVar;
    }
}
