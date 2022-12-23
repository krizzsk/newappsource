package p484ff;

import com.google.android.gms.tasks.OnSuccessListener;

/* renamed from: ff.m */
public final /* synthetic */ class C16984m implements OnSuccessListener {

    /* renamed from: b */
    public final /* synthetic */ int f44088b;

    /* renamed from: c */
    public final /* synthetic */ Object f44089c;

    public /* synthetic */ C16984m(Object obj, int i) {
        this.f44088b = i;
        this.f44089c = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0188, code lost:
        if (r4 != 6) goto L_0x01ac;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x01b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSuccess(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.f44088b
            r1 = 0
            switch(r0) {
                case 0: goto L_0x026d;
                case 1: goto L_0x0265;
                case 2: goto L_0x0255;
                case 3: goto L_0x0240;
                case 4: goto L_0x0236;
                case 5: goto L_0x022a;
                case 6: goto L_0x021e;
                case 7: goto L_0x0201;
                case 8: goto L_0x01e2;
                case 9: goto L_0x01cd;
                case 10: goto L_0x001e;
                case 11: goto L_0x0012;
                case 12: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            goto L_0x0277
        L_0x0008:
            java.lang.Object r0 = r13.f44089c
            m60.a r0 = (m60.C18341a) r0
            com.moovit.payment.clearance.PaymentMethodToken r14 = (com.moovit.payment.clearance.PaymentMethodToken) r14
            r0.mo50797q2(r14)
            return
        L_0x0012:
            java.lang.Object r0 = r13.f44089c
            com.moovit.payment.account.PaymentAccountMenuItemFragment r0 = (com.moovit.payment.account.PaymentAccountMenuItemFragment) r0
            com.moovit.payment.account.model.PaymentAccount r14 = (com.moovit.payment.account.model.PaymentAccount) r14
            int r1 = com.moovit.payment.account.PaymentAccountMenuItemFragment.f63832r
            r0.mo83331p2(r14)
            return
        L_0x001e:
            java.lang.Object r0 = r13.f44089c
            com.moovit.micromobility.MicroMobilityRideActivity r0 = (com.moovit.micromobility.MicroMobilityRideActivity) r0
            com.moovit.micromobility.ride.MicroMobilityRide r14 = (com.moovit.micromobility.ride.MicroMobilityRide) r14
            int r2 = com.moovit.micromobility.MicroMobilityRideActivity.f14823n0
            r2 = 0
            r0.mo19417A2(r2)
            l30.p r3 = r0.f14828l0
            com.moovit.map.MapFragment r4 = r3.f18304c
            com.moovit.app.home.dashboard.i r5 = new com.moovit.app.home.dashboard.i
            r6 = 2
            r5.<init>(r6, r3, r14)
            r4.mo48656t2(r5)
            l30.p r3 = r0.f14828l0
            r3.mo21409a(r14)
            int[] r3 = com.moovit.micromobility.MicroMobilityRideActivity.C4129d.f14833a
            com.moovit.micromobility.ride.a r4 = r14.f14991i
            com.moovit.micromobility.ride.MicroMobilityRide$Status r4 = r4.f15007b
            int r4 = r4.ordinal()
            r3 = r3[r4]
            r4 = 8
            switch(r3) {
                case 1: goto L_0x00e1;
                case 2: goto L_0x00ac;
                case 3: goto L_0x0067;
                case 4: goto L_0x0067;
                case 5: goto L_0x004f;
                case 6: goto L_0x004f;
                case 7: goto L_0x004f;
                default: goto L_0x004d;
            }
        L_0x004d:
            goto L_0x013d
        L_0x004f:
            com.moovit.network.model.ServerId r1 = r14.f14986d
            int r3 = com.moovit.micromobility.MicroMobilityRideDetailsActivity.f14839Y
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.moovit.micromobility.MicroMobilityRideDetailsActivity> r4 = com.moovit.micromobility.MicroMobilityRideDetailsActivity.class
            r3.<init>(r0, r4)
            java.lang.String r4 = "rideId"
            r3.putExtra(r4, r1)
            r0.startActivity(r3)
            r0.finish()
            goto L_0x013d
        L_0x0067:
            int r3 = l30.C5597z.tool_bar
            android.view.View r3 = r0.findViewById(r3)
            androidx.appcompat.widget.Toolbar r3 = (androidx.appcompat.widget.Toolbar) r3
            int r5 = l30.C5570c0.micro_mobility_active_ride_title
            r3.setTitle((int) r5)
            a40.a r3 = r14.f14992j
            r0.mo19420D2(r3)
            int r3 = l30.C5597z.time
            android.view.View r3 = r0.findViewById(r3)
            com.moovit.design.view.list.ListItemView r3 = (com.moovit.design.view.list.ListItemView) r3
            int r5 = l30.C5596y.ic_clock_24_on_surface_emphasis_high
            r3.setIcon((int) r5)
            r3.setIconTopEndDecorationDrawable((android.graphics.drawable.Drawable) r2)
            int r5 = l30.C5570c0.duration_label
            r3.setTitle((int) r5)
            r3.setVisibility(r1)
            com.moovit.micromobility.MicroMobilityRideActivity$e r1 = new com.moovit.micromobility.MicroMobilityRideActivity$e
            r1.<init>(r3, r14)
            r0.mo19417A2(r1)
            int r1 = l30.C5597z.instructions
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setVisibility(r4)
            r0.mo19418B2(r14)
            r0.mo19419C2(r14)
            goto L_0x013d
        L_0x00ac:
            int r3 = l30.C5597z.tool_bar
            android.view.View r3 = r0.findViewById(r3)
            androidx.appcompat.widget.Toolbar r3 = (androidx.appcompat.widget.Toolbar) r3
            int r5 = l30.C5570c0.micro_mobility_pending_title
            r3.setTitle((int) r5)
            r0.mo19420D2(r2)
            int r3 = l30.C5597z.time
            android.view.View r3 = r0.findViewById(r3)
            com.moovit.design.view.list.ListItemView r3 = (com.moovit.design.view.list.ListItemView) r3
            r3.setVisibility(r4)
            r0.mo19417A2(r2)
            int r3 = l30.C5597z.instructions
            android.view.View r3 = r0.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            int r4 = l30.C5570c0.micro_mobility_pending_message
            r3.setText(r4)
            r3.setVisibility(r1)
            r0.mo19418B2(r14)
            r0.mo19419C2(r14)
            goto L_0x013d
        L_0x00e1:
            int r3 = l30.C5597z.tool_bar
            android.view.View r3 = r0.findViewById(r3)
            androidx.appcompat.widget.Toolbar r3 = (androidx.appcompat.widget.Toolbar) r3
            int r5 = l30.C5570c0.reservation_label
            r3.setTitle((int) r5)
            a40.a r3 = r14.f14992j
            r0.mo19420D2(r3)
            int r3 = l30.C5597z.time
            android.view.View r3 = r0.findViewById(r3)
            com.moovit.design.view.list.ListItemView r3 = (com.moovit.design.view.list.ListItemView) r3
            a40.a r5 = r14.f14992j
            long r7 = r5.f202g
            long r9 = r5.f203h
            r11 = -1
            int r5 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r5 == 0) goto L_0x0126
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r5 == 0) goto L_0x0126
            int r5 = l30.C5596y.ic_sand_clock_24_on_surface_emphasis_high
            r3.setIcon((int) r5)
            r3.setIconTopEndDecorationDrawable((android.graphics.drawable.Drawable) r2)
            java.lang.String r5 = com.moovit.util.time.C7925b.m18023k(r0, r7)
            r3.setTitle((java.lang.CharSequence) r5)
            r3.setVisibility(r1)
            com.moovit.micromobility.MicroMobilityRideActivity$f r1 = new com.moovit.micromobility.MicroMobilityRideActivity$f
            r1.<init>(r0, r3, r14)
            r0.mo19417A2(r1)
            goto L_0x012c
        L_0x0126:
            r3.setVisibility(r4)
            r0.mo19417A2(r2)
        L_0x012c:
            int r1 = l30.C5597z.instructions
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setVisibility(r4)
            r0.mo19418B2(r14)
            r0.mo19419C2(r14)
        L_0x013d:
            com.moovit.micromobility.ride.a r1 = r14.f14991i
            com.moovit.micromobility.ride.MicroMobilityRide$Status r1 = r1.f15007b
            hq.b$a r3 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r4 = com.moovit.analytics.AnalyticsEventKey.CONTENT_SHOWN
            r3.<init>(r4)
            com.moovit.analytics.AnalyticsAttributeKey r4 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r5 = "micro_mobility_ride_impression"
            r3.mo49939g(r4, r5)
            com.moovit.analytics.AnalyticsAttributeKey r4 = com.moovit.analytics.AnalyticsAttributeKey.ID
            com.moovit.network.model.ServerId r5 = r14.f14986d
            r3.mo49937e(r4, r5)
            com.moovit.analytics.AnalyticsAttributeKey r4 = com.moovit.analytics.AnalyticsAttributeKey.PROVIDER
            java.lang.String r5 = r14.f14984b
            r3.mo49939g(r4, r5)
            com.moovit.analytics.AnalyticsAttributeKey r4 = com.moovit.analytics.AnalyticsAttributeKey.ITEM_ID
            java.lang.String r5 = r14.f14985c
            r3.mo49939g(r4, r5)
            com.moovit.analytics.AnalyticsAttributeKey r4 = com.moovit.analytics.AnalyticsAttributeKey.VEHICLE_TYPE_ID
            com.moovit.network.model.ServerId r5 = r14.f14987e
            r3.mo49937e(r4, r5)
            com.moovit.analytics.AnalyticsAttributeKey r4 = com.moovit.analytics.AnalyticsAttributeKey.STATUS
            java.lang.String r1 = p379.C25541a.m63893x(r1)
            r3.mo49939g(r4, r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TIME
            com.moovit.micromobility.ride.a r4 = r14.f14991i
            com.moovit.micromobility.ride.MicroMobilityRide$Status r4 = r4.f15007b
            int[] r5 = o30.C5974a.f19119a
            int r4 = r4.ordinal()
            r4 = r5[r4]
            r5 = 1
            if (r4 == r5) goto L_0x0199
            if (r4 == r6) goto L_0x018b
            r5 = 6
            if (r4 == r5) goto L_0x0199
            goto L_0x01ac
        L_0x018b:
            a40.a r2 = r14.f14992j
            long r4 = r2.f203h
            long r6 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r6
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            goto L_0x01ac
        L_0x0199:
            r4 = 0
            long r6 = java.lang.System.currentTimeMillis()
            a40.a r2 = r14.f14992j
            long r8 = r2.f200e
            long r6 = r6 - r8
            long r4 = java.lang.Math.max(r4, r6)
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
        L_0x01ac:
            r3.mo49944l(r1, r2)
            com.moovit.micromobility.ride.a r14 = r14.f14991i
            com.moovit.util.CurrencyAmount r14 = r14.f15008c
            if (r14 == 0) goto L_0x01c5
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.BALANCE
            long r4 = p001a0.C0016g.m19b(r14)
            r3.mo49936d(r1, r4)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.CURRENCY_CODE
            java.lang.String r14 = r14.f23844b
            r3.mo49939g(r1, r14)
        L_0x01c5:
            hq.b r14 = r3.mo49933a()
            r0.mo44545v2(r14)
            return
        L_0x01cd:
            java.lang.Object r0 = r13.f44089c
            com.moovit.map.walking.MapWalkingDirectionsActivity r0 = (com.moovit.map.walking.MapWalkingDirectionsActivity) r0
            j20.d r14 = (j20.C17707d) r14
            int r1 = com.moovit.map.walking.MapWalkingDirectionsActivity.f42571p0
            r0.getClass()
            com.moovit.transit.LocationDescriptor r1 = r14.f45454e
            if (r1 == 0) goto L_0x01dd
            goto L_0x01df
        L_0x01dd:
            com.moovit.transit.LocationDescriptor r1 = r14.f45450a
        L_0x01df:
            r0.f42574Y = r1
            return
        L_0x01e2:
            java.lang.Object r0 = r13.f44089c
            com.moovit.map.MapFragment r0 = (com.moovit.map.MapFragment) r0
            com.moovit.location.a$a r14 = (com.moovit.location.C16202a.C16203a) r14
            if (r14 == 0) goto L_0x01fb
            r0.f42345F0 = r14
            android.view.View r14 = r0.getView()
            if (r14 == 0) goto L_0x0200
            com.moovit.map.MapFragment$MapFollowMode r14 = r0.f42356O
            r0.mo48657t3(r14)
            r0.mo48653r3()
            goto L_0x0200
        L_0x01fb:
            i0.c r14 = com.moovit.map.MapFragment.f42333I0
            r0.getClass()
        L_0x0200:
            return
        L_0x0201:
            java.lang.Object r14 = r13.f44089c
            com.moovit.app.wondo.tickets.offers.WondoOfferDetailsActivity r14 = (com.moovit.app.wondo.tickets.offers.WondoOfferDetailsActivity) r14
            int r0 = com.moovit.app.wondo.tickets.offers.WondoOfferDetailsActivity.f40747Y
            r0 = 2131363874(0x7f0a0822, float:1.834757E38)
            android.view.View r0 = r14.findViewById(r0)
            androidx.core.widget.ContentLoadingProgressBar r0 = (androidx.core.widget.ContentLoadingProgressBar) r0
            r0.mo3435a()
            r0 = 2131362232(0x7f0a01b8, float:1.8344239E38)
            android.view.View r14 = r14.findViewById(r0)
            r14.setVisibility(r1)
            return
        L_0x021e:
            java.lang.Object r0 = r13.f44089c
            com.moovit.app.tod.b r0 = (com.moovit.app.tod.C15462b) r0
            com.moovit.payment.account.model.PaymentAccount r14 = (com.moovit.payment.account.model.PaymentAccount) r14
            int r1 = com.moovit.app.tod.C15462b.f40053x
            r0.mo46206q2(r14)
            return
        L_0x022a:
            java.lang.Object r0 = r13.f44089c
            com.moovit.app.home.dashboard.w r0 = (com.moovit.app.home.dashboard.C14988w) r0
            com.moovit.payment.account.model.PaymentAccount r14 = (com.moovit.payment.account.model.PaymentAccount) r14
            int r1 = com.moovit.app.home.dashboard.C14988w.f38360o
            r0.mo45191n2(r14)
            return
        L_0x0236:
            java.lang.Object r0 = r13.f44089c
            com.moovit.design.view.list.ListItemView r0 = (com.moovit.design.view.list.ListItemView) r0
            com.moovit.app.wondo.tickets.model.WondoCampaign r14 = (com.moovit.app.wondo.tickets.model.WondoCampaign) r14
            r0.setTag(r14)
            return
        L_0x0240:
            java.lang.Object r0 = r13.f44089c
            com.moovit.app.ads.MobileAdsManager r0 = (com.moovit.app.ads.MobileAdsManager) r0
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            java.util.EnumSet<com.moovit.app.ads.AdSource> r1 = com.moovit.app.ads.MobileAdsManager.f37451p
            r0.getClass()
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x0254
            r0.mo44711m()
        L_0x0254:
            return
        L_0x0255:
            java.lang.Object r0 = r13.f44089c
            fq.d r0 = (p495fq.C17059d) r0
            com.moovit.location.a$a r14 = (com.moovit.location.C16202a.C16203a) r14
            r0.f44224f = r14
            boolean r14 = r0.mo49514i()
            r0.mo49522q(r14)
            return
        L_0x0265:
            java.lang.Object r0 = r13.f44089c
            com.google.android.gms.tasks.TaskCompletionSource r0 = (com.google.android.gms.tasks.TaskCompletionSource) r0
            r0.setResult(r14)
            return
        L_0x026d:
            java.lang.Object r0 = r13.f44089c
            com.google.firebase.messaging.FirebaseMessaging r0 = (com.google.firebase.messaging.FirebaseMessaging) r0
            ff.g0 r14 = (p484ff.C16973g0) r14
            r0.lambda$new$2(r14)
            return
        L_0x0277:
            java.lang.Object r0 = r13.f44089c
            v80.a r0 = (v80.C13183a) r0
            java.lang.String r14 = (java.lang.String) r14
            A r0 = r0.f40822c
            com.moovit.ticketing.purchase.PurchaseTicketActivity r0 = (com.moovit.ticketing.purchase.PurchaseTicketActivity) r0
            v80.d r1 = r0.f23251X
            androidx.lifecycle.d0 r1 = r1.f32739b
            java.lang.Object r1 = r1.mo4292b(r14)
            com.moovit.ticketing.purchase.PurchaseStep r1 = (com.moovit.ticketing.purchase.PurchaseStep) r1
            r1.mo24015b(r0, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p484ff.C16984m.onSuccess(java.lang.Object):void");
    }
}
