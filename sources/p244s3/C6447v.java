package p244s3;

import com.google.android.gms.tasks.OnCompleteListener;

/* renamed from: s3.v */
public final /* synthetic */ class C6447v implements OnCompleteListener {

    /* renamed from: b */
    public final /* synthetic */ int f20146b;

    /* renamed from: c */
    public final /* synthetic */ Object f20147c;

    public /* synthetic */ C6447v(Object obj, int i) {
        this.f20146b = i;
        this.f20147c = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0165 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onComplete(com.google.android.gms.tasks.Task r15) {
        /*
            r14 = this;
            int r0 = r14.f20146b
            r1 = 1
            r2 = 0
            r3 = 0
            switch(r0) {
                case 0: goto L_0x0278;
                case 1: goto L_0x026f;
                case 2: goto L_0x01fb;
                case 3: goto L_0x00ac;
                case 4: goto L_0x004a;
                case 5: goto L_0x0040;
                case 6: goto L_0x000a;
                default: goto L_0x0008;
            }
        L_0x0008:
            goto L_0x0280
        L_0x000a:
            java.lang.Object r0 = r14.f20147c
            android.content.Context r0 = (android.content.Context) r0
            boolean r1 = r15.isSuccessful()
            java.lang.String r2 = "FenceClientCommands"
            if (r1 == 0) goto L_0x0020
            com.moovit.sdk.profilers.ProfilerLog r15 = com.moovit.sdk.profilers.ProfilerLog.m41879c(r0)
            java.lang.String r0 = "queryFences-completed successfully"
            r15.mo49244b(r2, r0)
            goto L_0x003f
        L_0x0020:
            com.moovit.sdk.profilers.ProfilerLog r0 = com.moovit.sdk.profilers.ProfilerLog.m41879c(r0)
            java.lang.String r1 = "queryFences-failed with error "
            java.lang.StringBuilder r1 = p379.C13555b.m33972k(r1)
            java.lang.Exception r3 = r15.getException()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.mo49244b(r2, r1)
            java.lang.Exception r15 = r15.getException()
            java.util.Objects.toString(r15)
        L_0x003f:
            return
        L_0x0040:
            java.lang.Object r15 = r14.f20147c
            com.moovit.micromobility.damage.MicroMobilityReportDamageActivity r15 = (com.moovit.micromobility.damage.MicroMobilityReportDamageActivity) r15
            int r0 = com.moovit.micromobility.damage.MicroMobilityReportDamageActivity.f14858l0
            r15.mo44506I1()
            return
        L_0x004a:
            java.lang.Object r0 = r14.f20147c
            com.moovit.app.wondo.tickets.offers.WondoOffersActivity r0 = (com.moovit.app.wondo.tickets.offers.WondoOffersActivity) r0
            int r2 = com.moovit.app.wondo.tickets.offers.WondoOffersActivity.f40757Z
            r0.getClass()
            boolean r2 = r15.isSuccessful()
            if (r2 != 0) goto L_0x0061
            androidx.recyclerview.widget.RecyclerView r15 = r0.f40760Y
            com.moovit.app.wondo.tickets.offers.WondoOffersActivity$a r0 = r0.f40759X
            r15.mo4627l0(r0)
            goto L_0x00ab
        L_0x0061:
            java.lang.Object r15 = r15.getResult()
            zz.i0 r15 = (p977zz.C20944i0) r15
            if (r15 == 0) goto L_0x00a4
            F r2 = r15.f52692a
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = c00.C13717b.m34258e(r2)
            if (r2 == 0) goto L_0x0074
            goto L_0x00a4
        L_0x0074:
            F r2 = r15.f52692a
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = r2.size()
            int r5 = r5 + r1
            r4.<init>(r5)
            S r15 = r15.f52693b
            zz.i0 r15 = (p977zz.C20944i0) r15
            if (r15 == 0) goto L_0x0090
            com.moovit.app.wondo.tickets.offers.a$b r5 = new com.moovit.app.wondo.tickets.offers.a$b
            r5.<init>(r1, r3, r15)
            r4.add(r5)
        L_0x0090:
            hq.e r15 = new hq.e
            r1 = 7
            r15.<init>(r1)
            c00.C13720d.m34276f(r2, r3, r15, r4)
            com.moovit.app.wondo.tickets.offers.a r15 = new com.moovit.app.wondo.tickets.offers.a
            r15.<init>(r0, r4)
            androidx.recyclerview.widget.RecyclerView r0 = r0.f40760Y
            r0.mo4627l0(r15)
            goto L_0x00ab
        L_0x00a4:
            androidx.recyclerview.widget.RecyclerView r15 = r0.f40760Y
            o00.h r0 = r0.f40758U
            r15.mo4627l0(r0)
        L_0x00ab:
            return
        L_0x00ac:
            java.lang.Object r0 = r14.f20147c
            com.moovit.app.servicealerts.ServiceAlertFragment r0 = (com.moovit.app.servicealerts.ServiceAlertFragment) r0
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r4 = r0.f39563t
            if (r4 == 0) goto L_0x00b7
            r4.setRefreshing(r2)
        L_0x00b7:
            boolean r4 = r15.isSuccessful()
            if (r4 == 0) goto L_0x01e6
            java.lang.Object r4 = r15.getResult()
            if (r4 == 0) goto L_0x01e6
            java.lang.Object r15 = r15.getResult()
            j80.b r15 = (j80.C12773b) r15
            com.moovit.app.servicealerts.ServiceAlertFragment$ServiceAlertsUiConfig r4 = r0.f39565v
            tp.f r5 = r0.f39557n
            j80.g r6 = r0.f39558o
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            boolean r8 = r4.f39567b
            if (r8 == 0) goto L_0x00f7
            java.util.List<com.moovit.network.model.ServerId> r8 = r6.f31605a
            java.util.Map<com.moovit.network.model.ServerId, java.lang.String> r9 = r6.f31606b
            boolean r10 = r8.isEmpty()
            if (r10 == 0) goto L_0x00e3
            goto L_0x00f7
        L_0x00e3:
            java.util.Objects.requireNonNull(r9)
            xv.g r10 = new xv.g
            r10.<init>(r9, r2)
            java.util.ArrayList r2 = c00.C13720d.m34273c(r8, r3, r10)
            com.moovit.app.servicealerts.ServiceAlertFragment$f r8 = new com.moovit.app.servicealerts.ServiceAlertFragment$f
            r8.<init>(r2)
            r7.add(r8)
        L_0x00f7:
            boolean r2 = r4.f39568c
            if (r2 == 0) goto L_0x0144
            java.util.List<com.moovit.network.model.ServerId> r2 = r6.f31607c
            boolean r8 = r2.isEmpty()
            if (r8 == 0) goto L_0x0104
            goto L_0x0144
        L_0x0104:
            java.util.Map<com.moovit.network.model.ServerId, java.util.List<com.moovit.network.model.ServerId>> r8 = r6.f31608d
            java.util.Map<com.moovit.network.model.ServerId, java.lang.String> r9 = r6.f31609e
            java.util.Map<com.moovit.network.model.ServerId, com.moovit.home.lines.search.SearchLineItem> r10 = r6.f31610f
            java.util.Iterator r2 = r2.iterator()
        L_0x010e:
            boolean r11 = r2.hasNext()
            if (r11 == 0) goto L_0x0144
            java.lang.Object r11 = r2.next()
            com.moovit.network.model.ServerId r11 = (com.moovit.network.model.ServerId) r11
            com.moovit.util.ServerIdMap<com.moovit.transit.TransitAgency> r12 = r5.f50167c
            java.lang.Object r12 = r12.get(r11)
            com.moovit.transit.TransitAgency r12 = (com.moovit.transit.TransitAgency) r12
            java.lang.Object r11 = r8.get(r11)
            java.util.List r11 = (java.util.List) r11
            boolean r13 = c00.C13717b.m34258e(r11)
            if (r13 == 0) goto L_0x012f
            goto L_0x010e
        L_0x012f:
            java.util.Objects.requireNonNull(r10)
            xv.h r13 = new xv.h
            r13.<init>(r10)
            java.util.ArrayList r11 = c00.C13720d.m34273c(r11, r3, r13)
            com.moovit.app.servicealerts.ServiceAlertFragment$g r13 = new com.moovit.app.servicealerts.ServiceAlertFragment$g
            r13.<init>(r12, r11, r9)
            r7.add(r13)
            goto L_0x010e
        L_0x0144:
            boolean r2 = r4.f39569d
            if (r2 == 0) goto L_0x0159
            java.util.List<j80.c> r2 = r15.f31567c
            boolean r3 = c00.C13717b.m34258e(r2)
            if (r3 == 0) goto L_0x0151
            goto L_0x0159
        L_0x0151:
            com.moovit.app.servicealerts.ServiceAlertFragment$c r3 = new com.moovit.app.servicealerts.ServiceAlertFragment$c
            r3.<init>(r2)
            r7.add(r3)
        L_0x0159:
            java.util.List<com.moovit.network.model.ServerId> r2 = r15.f31568d
            boolean r3 = c00.C13717b.m34258e(r2)
            if (r3 != 0) goto L_0x01b8
            java.util.Iterator r2 = r2.iterator()
        L_0x0165:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01b8
            java.lang.Object r3 = r2.next()
            com.moovit.network.model.ServerId r3 = (com.moovit.network.model.ServerId) r3
            com.moovit.util.ServerIdMap<com.moovit.transit.TransitAgency> r8 = r5.f50167c
            java.lang.Object r8 = r8.get(r3)
            com.moovit.transit.TransitAgency r8 = (com.moovit.transit.TransitAgency) r8
            boolean r9 = r4.f39571f
            if (r9 == 0) goto L_0x019a
            java.util.Map<com.moovit.network.model.ServerId, java.util.List<com.moovit.servicealerts.LineServiceAlertDigest>> r9 = r15.f31569e
            java.lang.Object r9 = r9.get(r3)
            java.util.List r9 = (java.util.List) r9
            boolean r10 = c00.C13717b.m34258e(r9)
            if (r10 == 0) goto L_0x018c
            goto L_0x019a
        L_0x018c:
            com.moovit.app.servicealerts.ServiceAlertFragment$a r10 = new com.moovit.app.servicealerts.ServiceAlertFragment$a
            java.util.Map<com.moovit.network.model.ServerId, java.lang.String> r11 = r6.f31609e
            java.util.Map<com.moovit.network.model.ServerId, com.moovit.home.lines.search.SearchLineItem> r12 = r15.f31572h
            r10.<init>(r8, r9, r11, r12)
            r7.add(r10)
            r9 = 1
            goto L_0x019b
        L_0x019a:
            r9 = 0
        L_0x019b:
            boolean r10 = r4.f39570e
            if (r10 == 0) goto L_0x0165
            r9 = r9 ^ r1
            java.util.Map<com.moovit.network.model.ServerId, java.util.List<j80.c>> r10 = r15.f31570f
            java.lang.Object r3 = r10.get(r3)
            java.util.List r3 = (java.util.List) r3
            boolean r10 = c00.C13717b.m34258e(r3)
            if (r10 == 0) goto L_0x01af
            goto L_0x0165
        L_0x01af:
            com.moovit.app.servicealerts.ServiceAlertFragment$b r10 = new com.moovit.app.servicealerts.ServiceAlertFragment$b
            r10.<init>(r9, r8, r3)
            r7.add(r10)
            goto L_0x0165
        L_0x01b8:
            com.moovit.app.servicealerts.ServiceAlertFragment$d r15 = r0.f39566w
            r15.mo51055y(r7)
            com.moovit.app.servicealerts.ServiceAlertFragment$d r15 = r0.f39566w
            int r15 = r15.f47552g
            if (r15 != 0) goto L_0x01d6
            androidx.recyclerview.widget.RecyclerView r15 = r0.f39564u
            o00.h r0 = new o00.h
            int[] r1 = new int[r1]
            r2 = 2131559360(0x7f0d03c0, float:1.8744062E38)
            r3 = 0
            r1[r3] = r2
            r0.<init>(r1)
            r15.mo4627l0(r0)
            goto L_0x01fa
        L_0x01d6:
            androidx.recyclerview.widget.RecyclerView r15 = r0.f39564u
            androidx.recyclerview.widget.RecyclerView$Adapter r15 = r15.getAdapter()
            com.moovit.app.servicealerts.ServiceAlertFragment$d r1 = r0.f39566w
            if (r15 == r1) goto L_0x01fa
            androidx.recyclerview.widget.RecyclerView r15 = r0.f39564u
            r15.mo4627l0(r1)
            goto L_0x01fa
        L_0x01e6:
            androidx.recyclerview.widget.RecyclerView r15 = r0.f39564u
            if (r15 == 0) goto L_0x01fa
            o00.h r0 = new o00.h
            int[] r1 = new int[r1]
            r2 = 2131559294(0x7f0d037e, float:1.8743928E38)
            r3 = 0
            r1[r3] = r2
            r0.<init>(r1)
            r15.setAdapter(r0)
        L_0x01fa:
            return
        L_0x01fb:
            r0 = 0
            java.lang.Object r2 = r14.f20147c
            com.moovit.app.help.feedback.FeedbackFormActivity r2 = (com.moovit.app.help.feedback.FeedbackFormActivity) r2
            int r3 = com.moovit.app.help.feedback.FeedbackFormActivity.f38102u0
            r2.mo45048C2(r0)
            boolean r0 = r15.isSuccessful()
            if (r0 == 0) goto L_0x0219
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.Object r15 = r15.getResult()
            boolean r15 = r0.equals(r15)
            if (r15 == 0) goto L_0x0219
            r15 = 1
            goto L_0x021a
        L_0x0219:
            r15 = 0
        L_0x021a:
            java.lang.String r0 = "feedback_form_feedback_sent"
            if (r15 == 0) goto L_0x0244
            hq.b$a r15 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r3 = com.moovit.analytics.AnalyticsEventKey.TASK_COMPLETED
            r15.<init>(r3)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            r15.mo49939g(r3, r0)
            com.moovit.analytics.AnalyticsAttributeKey r0 = com.moovit.analytics.AnalyticsAttributeKey.SUCCESS
            r15.mo49941i(r0, r1)
            hq.b r15 = r15.mo49933a()
            r2.mo44545v2(r15)
            r15 = 2131887388(0x7f12051c, float:1.9409382E38)
            android.widget.Toast r15 = android.widget.Toast.makeText(r2, r15, r1)
            r15.show()
            r2.finish()
            goto L_0x026e
        L_0x0244:
            r15 = 2131362520(0x7f0a02d8, float:1.8344823E38)
            android.view.View r15 = r2.findViewById(r15)
            r1 = 2131887383(0x7f120517, float:1.9409372E38)
            r3 = 0
            com.google.android.material.snackbar.Snackbar r15 = com.google.android.material.snackbar.Snackbar.m35159l(r15, r1, r3)
            r15.mo42259p()
            hq.b$a r15 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.TASK_COMPLETED
            r15.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            r15.mo49939g(r1, r0)
            com.moovit.analytics.AnalyticsAttributeKey r0 = com.moovit.analytics.AnalyticsAttributeKey.SUCCESS
            r15.mo49941i(r0, r3)
            hq.b r15 = r15.mo49933a()
            r2.mo44545v2(r15)
        L_0x026e:
            return
        L_0x026f:
            r15 = 0
            java.lang.Object r0 = r14.f20147c
            java.util.concurrent.ScheduledFuture r0 = (java.util.concurrent.ScheduledFuture) r0
            r0.cancel(r15)
            return
        L_0x0278:
            java.lang.Object r0 = r14.f20147c
            bo.app.t1 r0 = (p030bo.app.C1693t1) r0
            r0.m4753a((com.google.android.gms.tasks.Task) r15)
            return
        L_0x0280:
            java.lang.Object r15 = r14.f20147c
            m80.v r15 = (m80.C12887v) r15
            java.util.concurrent.ThreadPoolExecutor r0 = m80.C12887v.f31893d
            r15.mo39737i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p244s3.C6447v.onComplete(com.google.android.gms.tasks.Task):void");
    }
}
