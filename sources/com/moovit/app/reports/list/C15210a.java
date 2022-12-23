package com.moovit.app.reports.list;

import ci0.C21211f;
import java.io.IOException;
import p567iq.C17635b;
import p594jv.C17932c;
import p594jv.C17933d;
import p594jv.C17938h;
import p906wz.C20431c;
import p906wz.C20436g;

/* renamed from: com.moovit.app.reports.list.a */
public final class C15210a extends C21211f {

    /* renamed from: b */
    public final /* synthetic */ String f39204b;

    /* renamed from: c */
    public final /* synthetic */ ReportsListActivity f39205c;

    public C15210a(ReportsListActivity reportsListActivity, String str) {
        this.f39205c = reportsListActivity;
        this.f39204b = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo313a(p906wz.C20431c r6, boolean r7) {
        /*
            r5 = this;
            jv.c r6 = (p594jv.C17932c) r6
            com.moovit.app.reports.list.ReportsListActivity r6 = r5.f39205c
            com.moovit.app.reports.list.ReportsListActivity<T>$e r6 = r6.f39184U
            java.lang.String r7 = r5.f39204b
            int r0 = com.moovit.app.reports.list.ReportsListActivity.C15206e.f39197y
            com.moovit.app.reports.list.ReportsListActivity$g r0 = r6.mo45702I()
            if (r7 == 0) goto L_0x0032
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto L_0x0017
            goto L_0x0032
        L_0x0017:
            java.util.List<hv.d> r1 = r0.f39202c
            java.util.Iterator r1 = r1.iterator()
        L_0x001d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0032
            java.lang.Object r2 = r1.next()
            hv.d r2 = (p548hv.C17502d) r2
            java.lang.String r3 = r2.f45066a
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x001d
            goto L_0x0033
        L_0x0032:
            r2 = 0
        L_0x0033:
            if (r2 != 0) goto L_0x0036
            goto L_0x0075
        L_0x0036:
            java.util.List<hv.d> r7 = r0.f39202c
            r7.remove(r2)
            com.moovit.app.reports.list.ReportsListActivity r7 = com.moovit.app.reports.list.ReportsListActivity.this
            com.moovit.commons.view.list.SectionedListView r1 = r7.f39187Z
            int r7 = r7.f39188l0
            r1.mo47264b(r7)
            int r7 = r0.mo45699e()
            if (r7 != 0) goto L_0x0061
            com.moovit.app.reports.list.ReportsListActivity r7 = com.moovit.app.reports.list.ReportsListActivity.this
            com.moovit.commons.view.list.SectionedListView r0 = r7.f39187Z
            int r1 = r7.f39188l0
            android.view.LayoutInflater r2 = r7.getLayoutInflater()
            com.moovit.commons.view.list.SectionedListView r7 = r7.f39187Z
            r3 = 2131558708(0x7f0d0134, float:1.874274E38)
            r4 = 0
            android.view.View r7 = r2.inflate(r3, r7, r4)
            r0.mo47261a(r1, r7)
        L_0x0061:
            com.moovit.app.reports.list.ReportsListActivity r7 = com.moovit.app.reports.list.ReportsListActivity.this
            android.view.View r7 = r7.mo45696z2()
            if (r7 == 0) goto L_0x0072
            com.moovit.app.reports.list.ReportsListActivity r0 = com.moovit.app.reports.list.ReportsListActivity.this
            com.moovit.commons.view.list.SectionedListView r1 = r0.f39187Z
            int r0 = r0.f39188l0
            r1.mo47261a(r0, r7)
        L_0x0072:
            r6.notifyDataSetChanged()
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.reports.list.C15210a.mo313a(wz.c, boolean):void");
    }

    /* renamed from: d */
    public final boolean mo316d(C20431c cVar, IOException iOException) {
        C17932c cVar2 = (C17932c) cVar;
        ReportsListActivity reportsListActivity = this.f39205c;
        String str = this.f39204b;
        int i = ReportsListActivity.f39183n0;
        reportsListActivity.getClass();
        C17635b.m43779f(reportsListActivity).f50172b.mo42913b(new C17938h(reportsListActivity, str), true);
        return true;
    }

    /* renamed from: i */
    public final boolean mo319i(C20431c cVar, IOException iOException) {
        C17932c cVar2 = (C17932c) cVar;
        ReportsListActivity reportsListActivity = this.f39205c;
        String str = this.f39204b;
        int i = ReportsListActivity.f39183n0;
        reportsListActivity.getClass();
        C17635b.m43779f(reportsListActivity).f50172b.mo42913b(new C17938h(reportsListActivity, str), true);
        return true;
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ void mo21408k(C20431c cVar, C20436g gVar) {
        C17932c cVar2 = (C17932c) cVar;
        C17933d dVar = (C17933d) gVar;
    }
}
