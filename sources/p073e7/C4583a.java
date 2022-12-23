package p073e7;

import android.view.View;

/* renamed from: e7.a */
public final /* synthetic */ class C4583a implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f15763b;

    /* renamed from: c */
    public final /* synthetic */ Object f15764c;

    public /* synthetic */ C4583a(Object obj, int i) {
        this.f15763b = i;
        this.f15764c = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v39, resolved type: com.moovit.ridesharing.model.EventBookingBucket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v41, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v40 */
    /* JADX WARNING: type inference failed for: r2v43 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r15) {
        /*
            r14 = this;
            int r0 = r14.f15763b
            r1 = 1
            r2 = 0
            r3 = 0
            java.lang.String r4 = "this$0"
            switch(r0) {
                case 0: goto L_0x05c7;
                case 1: goto L_0x05ba;
                case 2: goto L_0x0501;
                case 3: goto L_0x04f7;
                case 4: goto L_0x04c7;
                case 5: goto L_0x04b9;
                case 6: goto L_0x04af;
                case 7: goto L_0x0493;
                case 8: goto L_0x0406;
                case 9: goto L_0x03c9;
                case 10: goto L_0x036f;
                case 11: goto L_0x0367;
                case 12: goto L_0x034f;
                case 13: goto L_0x02df;
                case 14: goto L_0x02bd;
                case 15: goto L_0x02a2;
                case 16: goto L_0x0275;
                case 17: goto L_0x0236;
                case 18: goto L_0x0178;
                case 19: goto L_0x0148;
                case 20: goto L_0x011f;
                case 21: goto L_0x00e9;
                case 22: goto L_0x00df;
                case 23: goto L_0x00d5;
                case 24: goto L_0x0095;
                case 25: goto L_0x008a;
                case 26: goto L_0x0080;
                case 27: goto L_0x0024;
                case 28: goto L_0x000d;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x05e8
        L_0x000d:
            java.lang.Object r15 = r14.f15764c
            com.moovit.app.tod.center.TodAbstractCenterFragment r15 = (com.moovit.app.tod.center.TodAbstractCenterFragment) r15
            mf0.C24362h.m61211f(r15, r4)
            boolean r0 = r15.f40824e
            if (r0 == 0) goto L_0x0023
            androidx.lifecycle.l0 r15 = r15.f40195o
            java.lang.Object r15 = r15.getValue()
            com.moovit.app.tod.center.a r15 = (com.moovit.app.tod.center.C15489a) r15
            r15.mo46288b(r3)
        L_0x0023:
            return
        L_0x0024:
            java.lang.Object r0 = r14.f15764c
            iw.f r0 = (p572iw.C17663f) r0
            int r1 = p572iw.C17663f.f45392x
            r0.getClass()
            java.lang.Object r15 = r15.getTag()
            java.lang.Long r15 = (java.lang.Long) r15
            long r1 = r15.longValue()
            O r15 = r0.f40537p
            com.moovit.app.suggestedroutes.TripPlanOptions r15 = (com.moovit.app.suggestedroutes.TripPlanOptions) r15
            com.moovit.tripplanner.TripPlannerTime r15 = r15.f39803b
            long r3 = -r1
            com.moovit.tripplanner.TripPlannerTime r15 = r0.mo50112r2(r15, r3)
            if (r15 != 0) goto L_0x0045
            goto L_0x007f
        L_0x0045:
            hq.b$a r3 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r4 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r3.<init>(r4)
            com.moovit.analytics.AnalyticsAttributeKey r4 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r5 = "trip_plan_earlier_button_clicked"
            r3.mo49939g(r4, r5)
            com.moovit.analytics.AnalyticsAttributeKey r4 = com.moovit.analytics.AnalyticsAttributeKey.TRIP_PLAN_TIME_TYPE
            com.moovit.tripplanner.TripPlannerTime$Type r5 = r15.f23799b
            java.lang.String r5 = p001a0.C0016g.m16F(r5)
            r3.mo49939g(r4, r5)
            com.moovit.analytics.AnalyticsAttributeKey r4 = com.moovit.analytics.AnalyticsAttributeKey.TIME
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = r5.toMinutes(r1)
            r3.mo49936d(r4, r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.DATE
            long r4 = r15.mo24487b()
            r3.mo49936d(r1, r4)
            hq.b r1 = r3.mo49933a()
            r0.mo46797j2(r1)
            r1 = 300(0x12c, double:1.48E-321)
            r0.mo50114u2(r15, r1)
        L_0x007f:
            return
        L_0x0080:
            java.lang.Object r15 = r14.f15764c
            dw.l r15 = (p453dw.C16736l) r15
            int r0 = p453dw.C16736l.f43585h
            r15.dismissAllowingStateLoss()
            return
        L_0x008a:
            java.lang.Object r15 = r14.f15764c
            com.moovit.app.stoparrivals.StopArrivalsActivity$a r15 = (com.moovit.app.stoparrivals.StopArrivalsActivity.C15316a) r15
            mf0.C24362h.m61211f(r15, r4)
            r15.mo45869m()
            return
        L_0x0095:
            java.lang.Object r15 = r14.f15764c
            xv.k r15 = (p926xv.C20630k) r15
            int r0 = p926xv.C20630k.f52155o
            r15.getClass()
            hq.b$a r0 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r0.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r3 = "got_it"
            r0.mo49939g(r1, r3)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.SERVICE_ALERT_TYPE
            com.moovit.servicealerts.ServiceAlert r3 = r15.f52159k
            if (r3 == 0) goto L_0x00b7
            com.moovit.servicealerts.ServiceStatus r3 = r3.f23191c
            com.moovit.servicealerts.ServiceStatusCategory r3 = r3.f23213b
            goto L_0x00b8
        L_0x00b7:
            r3 = r2
        L_0x00b8:
            java.lang.String r3 = p001a0.C0016g.m12B(r3)
            r0.mo49945m(r1, r3)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.ALERT_ID
            com.moovit.servicealerts.ServiceAlert r3 = r15.f52159k
            if (r3 == 0) goto L_0x00c7
            java.lang.String r2 = r3.f23190b
        L_0x00c7:
            r0.mo49945m(r1, r2)
            hq.b r0 = r0.mo49933a()
            r15.mo22564R1(r0)
            r15.dismissAllowingStateLoss()
            return
        L_0x00d5:
            java.lang.Object r15 = r14.f15764c
            xv.c r15 = (p926xv.C20622c) r15
            int r0 = p926xv.C20622c.f52134i
            r15.dismiss()
            return
        L_0x00df:
            java.lang.Object r15 = r14.f15764c
            ov.j r15 = (p713ov.C18845j) r15
            int r0 = p713ov.C18845j.f47983r
            r15.mo51317q2()
            return
        L_0x00e9:
            java.lang.Object r15 = r14.f15764c
            ov.f r15 = (p713ov.C18837f) r15
            androidx.recyclerview.widget.RecyclerView r0 = r15.f47962q
            if (r0 != 0) goto L_0x00f2
            goto L_0x0110
        L_0x00f2:
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
            boolean r4 = r0 instanceof p713ov.C18837f.C18839b
            if (r4 != 0) goto L_0x00fb
            goto L_0x0110
        L_0x00fb:
            ov.f$b r0 = (p713ov.C18837f.C18839b) r0
            int r4 = r0.f47966h
            r5 = -1
            if (r4 == r5) goto L_0x0103
            goto L_0x0104
        L_0x0103:
            r1 = 0
        L_0x0104:
            if (r1 != 0) goto L_0x0107
            goto L_0x0110
        L_0x0107:
            java.util.List<com.moovit.ridesharing.model.EventBookingBucket> r0 = r0.f47965g
            java.lang.Object r0 = r0.get(r4)
            com.moovit.ridesharing.model.EventBookingBucket r0 = (com.moovit.ridesharing.model.EventBookingBucket) r0
            r2 = r0
        L_0x0110:
            if (r2 != 0) goto L_0x0113
            goto L_0x011e
        L_0x0113:
            com.moovit.app.ridesharing.booking.EventBookingCart r0 = r15.mo51315o2()
            r0.f39344c = r2
            r0.f39345d = r3
            r15.mo51317q2()
        L_0x011e:
            return
        L_0x011f:
            java.lang.Object r0 = r14.f15764c
            com.moovit.app.ridesharing.b r0 = (com.moovit.app.ridesharing.C15246b) r0
            int r1 = com.moovit.app.ridesharing.C15246b.f39321A
            r0.getClass()
            java.lang.Object r1 = r15.getTag()
            java.util.List r1 = (java.util.List) r1
            android.content.Context r15 = r15.getContext()
            int r2 = com.moovit.app.ridesharing.AllEventsActivity.f39262U
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<com.moovit.app.ridesharing.AllEventsActivity> r3 = com.moovit.app.ridesharing.AllEventsActivity.class
            r2.<init>(r15, r3)
            java.util.ArrayList r15 = c00.C13717b.m34264k(r1)
            java.lang.String r1 = "events"
            r2.putParcelableArrayListExtra(r1, r15)
            r0.startActivity(r2)
            return
        L_0x0148:
            java.lang.Object r15 = r14.f15764c
            su.p r15 = (p805su.C19560p) r15
            int r0 = p805su.C19560p.f49719q
            r15.getClass()
            hq.b$a r0 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r2 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r0.<init>(r2)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r3 = "mot_trip_manual_fare_selection_clicked"
            r0.mo49939g(r2, r3)
            hq.b r0 = r0.mo49933a()
            r15.mo46797j2(r0)
            A r15 = r15.f40822c
            com.moovit.app.mot.purchase.MotQrCodeActivationActivity r15 = (com.moovit.app.mot.purchase.MotQrCodeActivationActivity) r15
            r15.getClass()
            su.g r0 = new su.g
            r0.<init>()
            java.lang.String r2 = "manual_fare_selection"
            r15.mo45585z2(r0, r2, r1)
            return
        L_0x0178:
            java.lang.Object r15 = r14.f15764c
            su.h r15 = (p805su.C19550h) r15
            int r0 = p805su.C19550h.f49679y
            androidx.fragment.app.FragmentActivity r0 = r15.getActivity()
            if (r0 == 0) goto L_0x0235
            boolean r0 = r0.isFinishing()
            if (r0 == 0) goto L_0x018c
            goto L_0x0235
        L_0x018c:
            com.moovit.app.mot.purchase.model.MotQrCodeActivationFare r0 = r15.f49688v
            com.moovit.app.mot.model.MotActivationRegionFare r0 = r0.f39056c
            com.moovit.app.mot.model.MotActivationPrice r0 = r0.f39014c
            com.moovit.design.view.NumericStepperView r2 = r15.f49685s
            int r2 = r2.getCounter()
            com.moovit.util.CurrencyAmount r0 = r0.mo45548b(r2)
            hq.b$a r2 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r4 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r2.<init>(r4)
            com.moovit.analytics.AnalyticsAttributeKey r4 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r5 = "validate_clicked"
            r2.mo49939g(r4, r5)
            com.moovit.analytics.AnalyticsAttributeKey r4 = com.moovit.analytics.AnalyticsAttributeKey.ID
            com.moovit.app.mot.purchase.model.MotQrCodeActivationFare r5 = r15.f49688v
            com.moovit.app.mot.model.MotActivationRegionalFare r5 = r5.f39055b
            com.moovit.network.model.ServerId r5 = r5.f39016b
            r2.mo49937e(r4, r5)
            com.moovit.analytics.AnalyticsAttributeKey r4 = com.moovit.analytics.AnalyticsAttributeKey.ITEM_ID
            com.moovit.app.mot.purchase.model.MotQrCodeActivationFare r5 = r15.f49688v
            com.moovit.app.mot.model.MotActivationRegionFare r5 = r5.f39056c
            com.moovit.app.mot.model.MotActivationRegion r5 = r5.f39013b
            com.moovit.network.model.ServerId r5 = r5.f39009b
            r2.mo49937e(r4, r5)
            com.moovit.analytics.AnalyticsAttributeKey r4 = com.moovit.analytics.AnalyticsAttributeKey.COUNT
            com.moovit.design.view.NumericStepperView r5 = r15.f49685s
            int r5 = r5.getCounter()
            r2.mo49935c(r4, r5)
            com.moovit.analytics.AnalyticsAttributeKey r4 = com.moovit.analytics.AnalyticsAttributeKey.BALANCE
            long r5 = p001a0.C0016g.m19b(r0)
            r2.mo49936d(r4, r5)
            com.moovit.analytics.AnalyticsAttributeKey r4 = com.moovit.analytics.AnalyticsAttributeKey.CURRENCY_CODE
            java.lang.String r0 = r0.f23844b
            r2.mo49939g(r4, r0)
            hq.b r0 = r2.mo49933a()
            r15.mo46797j2(r0)
            b00.a r0 = r15.f49681o
            if (r0 != 0) goto L_0x022a
            boolean r0 = r15.mo46775H1()
            if (r0 != 0) goto L_0x01f0
            goto L_0x022a
        L_0x01f0:
            r15.mo46796i2()
            com.moovit.app.mot.purchase.model.MotQrCodeScanResult r0 = r15.mo51896n2()
            java.lang.String r2 = "METRO_CONTEXT"
            java.lang.Object r2 = r15.mo46776J1(r2)
            r6 = r2
            tp.f r6 = (p824tp.C19728f) r6
            com.moovit.request.RequestOptions r2 = r15.mo46777L1()
            r2.f42909f = r1
            pu.p r13 = new pu.p
            c70.e r5 = r15.mo46783R1()
            java.lang.String r7 = r15.f49687u
            com.moovit.commons.geo.LatLonE6 r8 = r0.f39065e
            com.moovit.app.mot.purchase.model.MotQrCodeActivationFare r9 = r15.f49688v
            com.moovit.design.view.NumericStepperView r0 = r15.f49685s
            int r10 = r0.getCounter()
            com.moovit.network.model.ServerId r11 = r15.f49689w
            com.moovit.network.model.ServerId r12 = r15.f49690x
            r4 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.String r0 = r13.f48363x
            su.h$a r4 = r15.f49680n
            b00.a r0 = r15.mo46793f2(r0, r13, r2, r4)
            r15.f49681o = r0
        L_0x022a:
            android.view.View r0 = r15.f49686t
            b00.a r15 = r15.f49681o
            if (r15 != 0) goto L_0x0231
            goto L_0x0232
        L_0x0231:
            r1 = 0
        L_0x0232:
            r0.setEnabled(r1)
        L_0x0235:
            return
        L_0x0236:
            java.lang.Object r0 = r14.f15764c
            su.f r0 = (p805su.C19544f) r0
            int r1 = p805su.C19544f.f49659s
            A r1 = r0.f40822c
            com.moovit.app.mot.purchase.MotQrCodeActivationActivity r1 = (com.moovit.app.mot.purchase.MotQrCodeActivationActivity) r1
            java.lang.Object r15 = r15.getTag()
            com.moovit.app.mot.purchase.model.MotQrCodeStationFare r15 = (com.moovit.app.mot.purchase.model.MotQrCodeStationFare) r15
            if (r1 == 0) goto L_0x0274
            if (r15 != 0) goto L_0x024b
            goto L_0x0274
        L_0x024b:
            java.lang.String r2 = "mot_dest_stop_confirm_clicked"
            r0.mo51903s2(r2, r15)
            mu.c r0 = p664mu.C18437c.f47002b
            com.moovit.transit.TransitLine r2 = r15.f39068b
            com.moovit.network.model.ServerId r2 = r2.f23687c
            com.moovit.transit.TransitStop r4 = r15.f39069c
            com.moovit.network.model.ServerId r4 = r4.f23730b
            r0.getClass()
            java.util.concurrent.ExecutorService r5 = com.moovit.MoovitExecutors.SINGLE
            mu.a r6 = new mu.a
            r6.<init>(r0, r1, r2, r4)
            com.google.android.gms.tasks.Tasks.call(r5, r6)
            com.moovit.app.mot.purchase.model.MotQrCodeActivationFare r0 = r15.f39071e
            com.moovit.transit.TransitLine r2 = r15.f39068b
            com.moovit.network.model.ServerId r2 = r2.f23687c
            com.moovit.transit.TransitStop r15 = r15.f39069c
            com.moovit.network.model.ServerId r15 = r15.f23730b
            r1.mo45584y2(r0, r2, r15, r3)
        L_0x0274:
            return
        L_0x0275:
            java.lang.Object r15 = r14.f15764c
            nu.f r15 = (p688nu.C18636f) r15
            int r0 = p688nu.C18636f.f47492s
            A r15 = r15.f40822c
            com.moovit.app.mot.center.MotActivationCenterActivity r15 = (com.moovit.app.mot.center.MotActivationCenterActivity) r15
            r15.getClass()
            hq.b$a r0 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r0.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r2 = "mot_show_bills_clicked"
            r0.mo49939g(r1, r2)
            hq.b r0 = r0.mo49933a()
            r15.mo44545v2(r0)
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.moovit.payment.invoices.PaymentAccountUpcomingPaymentActivity> r1 = com.moovit.payment.invoices.PaymentAccountUpcomingPaymentActivity.class
            r0.<init>(r15, r1)
            r15.startActivity(r0)
            return
        L_0x02a2:
            java.lang.Object r15 = r14.f15764c
            com.moovit.app.linedetail.ui.a r15 = (com.moovit.app.linedetail.p416ui.C15101a) r15
            com.moovit.app.realtimehelp.RealTimeHelpBannerView r0 = r15.f38837u
            r1 = 8
            r0.setVisibility(r1)
            A r0 = r15.f40822c
            com.moovit.app.realtimehelp.RealTimeHelpBannerView.m38837c(r0)
            hq.b r0 = new hq.b
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.RT_HELP_BANNER_DISMISS_CLICKED
            r0.<init>(r1)
            r15.mo46797j2(r0)
            return
        L_0x02bd:
            java.lang.Object r15 = r14.f15764c
            com.moovit.app.intro.onboarding.OnboardingLoginActivity r15 = (com.moovit.app.intro.onboarding.OnboardingLoginActivity) r15
            int r0 = com.moovit.app.intro.onboarding.OnboardingLoginActivity.f38468U
            r15.getClass()
            hq.b$a r0 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r0.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r2 = "cancel_clicked"
            r0.mo49939g(r1, r2)
            hq.b r0 = r0.mo49933a()
            r15.mo44545v2(r0)
            r15.mo45260y2()
            return
        L_0x02df:
            java.lang.Object r0 = r14.f15764c
            tt.b$a r0 = (p828tt.C19760b.C19761a) r0
            r0.getClass()
            com.google.android.material.card.MaterialCardView r15 = (com.google.android.material.card.MaterialCardView) r15
            r15.toggle()
            java.lang.Object r2 = r15.getTag()
            com.moovit.tripplanner.TripPlannerTransportType r2 = (com.moovit.tripplanner.TripPlannerTransportType) r2
            boolean r15 = r15.isChecked()
            if (r15 == 0) goto L_0x02ff
            tt.b r4 = p828tt.C19760b.this
            java.util.HashSet r4 = r4.f50241p
            r4.add(r2)
            goto L_0x0306
        L_0x02ff:
            tt.b r4 = p828tt.C19760b.this
            java.util.HashSet r4 = r4.f50241p
            r4.remove(r2)
        L_0x0306:
            tt.b r4 = p828tt.C19760b.this
            android.view.View r5 = r4.f50242q
            java.util.HashSet r4 = r4.f50241p
            int r4 = r4.size()
            tt.b r6 = p828tt.C19760b.this
            int r6 = r6.mo52090o2()
            if (r4 < r6) goto L_0x0319
            goto L_0x031a
        L_0x0319:
            r1 = 0
        L_0x031a:
            r5.setEnabled(r1)
            tt.b r1 = p828tt.C19760b.this
            hq.b$a r3 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r4 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r3.<init>(r4)
            com.moovit.analytics.AnalyticsAttributeKey r4 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r5 = "transport_type_clicked"
            r3.mo49939g(r4, r5)
            com.moovit.analytics.AnalyticsAttributeKey r4 = com.moovit.analytics.AnalyticsAttributeKey.ACTIVITY_NAME
            tt.b r0 = p828tt.C19760b.this
            java.lang.String r0 = r0.mo52089n2()
            r3.mo49939g(r4, r0)
            com.moovit.analytics.AnalyticsAttributeKey r0 = com.moovit.analytics.AnalyticsAttributeKey.ID
            int r2 = p001a0.C0017h.m51H(r2)
            r3.mo49935c(r0, r2)
            com.moovit.analytics.AnalyticsAttributeKey r0 = com.moovit.analytics.AnalyticsAttributeKey.IS_CHECKED
            r3.mo49941i(r0, r15)
            hq.b r15 = r3.mo49933a()
            r1.mo46797j2(r15)
            return
        L_0x034f:
            java.lang.Object r15 = r14.f15764c
            com.moovit.app.intro.UserCreationFailureActivity r15 = (com.moovit.app.intro.UserCreationFailureActivity) r15
            int r0 = com.moovit.app.intro.UserCreationFailureActivity.f38450X
            r15.mo45251A2()
            int r0 = com.moovit.app.metro.selection.SelectMetroActivity.f38970p0
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.moovit.app.metro.selection.SelectMetroActivity> r1 = com.moovit.app.metro.selection.SelectMetroActivity.class
            r0.<init>(r15, r1)
            r1 = 1042(0x412, float:1.46E-42)
            r15.startActivityForResult(r0, r1)
            return
        L_0x0367:
            java.lang.Object r0 = r14.f15764c
            com.moovit.app.home.lines.favorites.FavoriteLinesFragment$k r0 = (com.moovit.app.home.lines.favorites.FavoriteLinesFragment.C15006k) r0
            com.moovit.app.home.lines.favorites.FavoriteLinesFragment.C15006k.m37906z(r0, r15)
            return
        L_0x036f:
            java.lang.Object r0 = r14.f15764c
            kt.a r0 = (p616kt.C18127a) r0
            int r1 = p616kt.C18127a.f46342r
            r0.getClass()
            hq.b$a r1 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r3 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r1.<init>(r3)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r4 = "search_clicked"
            r1.mo49939g(r3, r4)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.TRANSIT_TYPE
            java.lang.String r4 = p001a0.C0016g.m15E(r2)
            r1.mo49939g(r3, r4)
            hq.b r1 = r1.mo49933a()
            r0.mo46797j2(r1)
            z20.a$a r1 = new z20.a$a
            java.lang.String r3 = "lines_search_tap"
            r1.<init>(r3)
            r1.mo52935c()
            android.content.Context r15 = r15.getContext()
            com.moovit.home.lines.search.EmptySearchLineViewFactory r1 = r0.mo48147e0()
            com.moovit.app.home.lines.LocationsEmptySearchLineViewFactory r1 = (com.moovit.app.home.lines.LocationsEmptySearchLineViewFactory) r1
            int r3 = com.moovit.home.lines.search.SearchLineActivity.f41621U
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.moovit.home.lines.search.SearchLineActivity> r4 = com.moovit.home.lines.search.SearchLineActivity.class
            r3.<init>(r15, r4)
            java.lang.String r15 = "transitType"
            r3.putExtra(r15, r2)
            java.lang.String r15 = "agency"
            r3.putExtra(r15, r2)
            java.lang.String r15 = "emptySearchLineViewFactory"
            r3.putExtra(r15, r1)
            r15 = 1159(0x487, float:1.624E-42)
            r0.startActivityForResult(r3, r15)
            return
        L_0x03c9:
            java.lang.Object r15 = r14.f15764c
            com.moovit.app.home.dashboard.k r15 = (com.moovit.app.home.dashboard.C14946k) r15
            int r0 = com.moovit.app.home.dashboard.C14946k.f38246t
            r15.getClass()
            hq.b$a r0 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r0.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r3 = "add_custom_clicked"
            r0.mo49939g(r1, r3)
            hq.b r0 = r0.mo49933a()
            r15.mo46797j2(r0)
            com.moovit.app.search.AppSearchLocationCallback r0 = new com.moovit.app.search.AppSearchLocationCallback
            r4 = 2131887841(0x7f1206e1, float:1.94103E38)
            r5 = 2131887154(0x7f120432, float:1.9408907E38)
            r6 = 1
            r7 = 1
            r8 = 0
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            android.content.Context r1 = r15.requireContext()
            java.lang.String r3 = "dashboard_favorites_section"
            android.content.Intent r0 = com.moovit.search.SearchLocationActivity.m17347y2(r1, r0, r3, r2)
            r1 = 1004(0x3ec, float:1.407E-42)
            r15.startActivityForResult(r0, r1)
            return
        L_0x0406:
            java.lang.Object r15 = r14.f15764c
            com.moovit.app.home.dashboard.f r15 = (com.moovit.app.home.dashboard.C14940f) r15
            dy.e r0 = r15.f38235x
            if (r0 != 0) goto L_0x0410
            goto L_0x0492
        L_0x0410:
            com.moovit.app.useraccount.manager.favorites.LocationFavorite r0 = r15.mo45116p2(r0)
            if (r0 == 0) goto L_0x048f
            T r0 = r0.f52687b
            com.moovit.transit.LocationDescriptor r0 = (com.moovit.transit.LocationDescriptor) r0
            hq.b$a r3 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r4 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r3.<init>(r4)
            com.moovit.analytics.AnalyticsAttributeKey r4 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r5 = r15.mo45118r2()
            r3.mo49939g(r4, r5)
            com.moovit.analytics.AnalyticsAttributeKey r4 = com.moovit.analytics.AnalyticsAttributeKey.SELECTED_CAPTION
            java.lang.String r5 = r0.mo24313f()
            r3.mo49945m(r4, r5)
            com.moovit.analytics.AnalyticsAttributeKey r4 = com.moovit.analytics.AnalyticsAttributeKey.SELECTED_TYPE
            com.moovit.transit.LocationDescriptor$LocationType r5 = r0.f23647b
            java.lang.String r5 = p001a0.C0016g.m13C(r5)
            r3.mo49939g(r4, r5)
            com.moovit.analytics.AnalyticsAttributeKey r4 = com.moovit.analytics.AnalyticsAttributeKey.SELECTED_ID
            com.moovit.network.model.ServerId r5 = r0.f23649d
            r3.mo49943k(r4, r5)
            com.moovit.analytics.AnalyticsAttributeKey r4 = com.moovit.analytics.AnalyticsAttributeKey.STATE
            java.lang.String r5 = r15.f38224E
            r3.mo49939g(r4, r5)
            java.lang.String r4 = r15.f38224E
            java.lang.String r5 = "public_transit"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0471
            com.moovit.analytics.AnalyticsAttributeKey r4 = com.moovit.analytics.AnalyticsAttributeKey.ITINERARY_GUID
            java.util.ArrayList r5 = r15.f38222C
            com.facebook.appevents.l r6 = new com.facebook.appevents.l
            r7 = 2
            r6.<init>(r7)
            java.util.ArrayList r2 = c00.C13720d.m34273c(r5, r2, r6)
            java.lang.String r5 = ","
            java.lang.CharSequence r2 = p977zz.C20964s0.m49098p(r5, r2)
            java.lang.String r2 = r2.toString()
            r3.mo49939g(r4, r2)
        L_0x0471:
            hq.b r2 = r3.mo49933a()
            r15.mo46797j2(r2)
            com.moovit.suggestedroutes.TripPlanParams$d r2 = new com.moovit.suggestedroutes.TripPlanParams$d
            r2.<init>()
            r2.f23791b = r0
            com.moovit.suggestedroutes.TripPlanParams r0 = r2.mo23958a()
            android.content.Context r2 = r15.requireContext()
            android.content.Intent r0 = com.moovit.app.suggestedroutes.SuggestRoutesActivity.m39325M2(r2, r0, r1)
            r15.startActivity(r0)
            goto L_0x0492
        L_0x048f:
            r15.mo45120u2(r2)
        L_0x0492:
            return
        L_0x0493:
            java.lang.Object r15 = r14.f15764c
            com.moovit.app.general.aboutandcontact.AboutAndContactActivity r15 = (com.moovit.app.general.aboutandcontact.AboutAndContactActivity) r15
            int r0 = com.moovit.app.general.aboutandcontact.AboutAndContactActivity.f38043U
            r0 = 2131888501(0x7f120975, float:1.941164E38)
            java.lang.String r0 = r15.getString(r0)
            r1 = 2131888496(0x7f120970, float:1.9411629E38)
            java.lang.String r1 = r15.getString(r1)
            android.content.Intent r0 = com.moovit.web.WebViewActivity.m18168y2(r15, r0, r1)
            r15.startActivity(r0)
            return
        L_0x04af:
            java.lang.Object r15 = r14.f15764c
            qr.a r15 = (p754qr.C19161a) r15
            java.lang.String r0 = p754qr.C19161a.f48741h
            r15.dismissAllowingStateLoss()
            return
        L_0x04b9:
            java.lang.Object r15 = r14.f15764c
            com.moovit.app.carpool.center.a r15 = (com.moovit.app.carpool.center.C14797a) r15
            com.moovit.app.carpool.center.a$b r15 = r15.f37694h
            if (r15 == 0) goto L_0x04c6
            com.moovit.app.carpool.center.CarpoolCenterActivity r15 = (com.moovit.app.carpool.center.CarpoolCenterActivity) r15
            r15.mo44846A2()
        L_0x04c6:
            return
        L_0x04c7:
            java.lang.Object r15 = r14.f15764c
            com.moovit.app.ads.consent.AdjustAdsPreferencesActivity r15 = (com.moovit.app.ads.consent.AdjustAdsPreferencesActivity) r15
            int r0 = com.moovit.app.ads.consent.AdjustAdsPreferencesActivity.f37501U
            r15.getClass()
            hq.b$a r0 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r2 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r0.<init>(r2)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r3 = "accept_clicked"
            r0.mo49939g(r2, r3)
            hq.b r0 = r0.mo49933a()
            r15.mo44545v2(r0)
            com.moovit.app.general.settings.privacy.a r0 = com.moovit.app.general.settings.privacy.C14894a.m37560b(r15)
            com.moovit.app.general.settings.privacy.a$a r0 = r0.mo45012a()
            r0.mo45022d(r1)
            r0.mo45019a()
            r15.finish()
            return
        L_0x04f7:
            java.lang.Object r15 = r14.f15764c
            to.a r15 = (p823to.C19718a) r15
            int r0 = p823to.C19718a.f50136n
            r15.dismiss()
            return
        L_0x0501:
            java.lang.Object r15 = r14.f15764c
            ro.d r15 = (p775ro.C19297d) r15
            int r0 = p775ro.C19297d.f49059N
            P r0 = r15.f45311c
            ro.j r0 = (p775ro.C19305j) r0
            boolean r0 = r0.mo51728h()
            if (r0 == 0) goto L_0x05a7
            P r0 = r15.f45311c
            ro.j r0 = (p775ro.C19305j) r0
            boolean r1 = r0.mo51728h()
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x052c
            wk.q r0 = r0.f49133x
            wk.a r0 = r0.f51608n
            if (r0 == 0) goto L_0x052c
            mn.b r0 = r0.f51506a
            if (r0 == 0) goto L_0x052c
            java.lang.String r0 = r0.f46929b
            if (r0 == 0) goto L_0x052c
            goto L_0x052d
        L_0x052c:
            r0 = r2
        L_0x052d:
            P r1 = r15.f45311c
            ro.j r1 = (p775ro.C19305j) r1
            boolean r4 = r1.mo51728h()
            if (r4 == 0) goto L_0x0546
            wk.q r1 = r1.f49133x
            wk.a r1 = r1.f51608n
            if (r1 == 0) goto L_0x0546
            mn.b r1 = r1.f51506a
            if (r1 == 0) goto L_0x0546
            java.lang.String r1 = r1.f46928a
            if (r1 == 0) goto L_0x0546
            goto L_0x0547
        L_0x0546:
            r1 = r2
        L_0x0547:
            P r4 = r15.f45311c
            ro.j r4 = (p775ro.C19305j) r4
            qn.i r5 = r4.mo51726f()
            if (r5 != 0) goto L_0x0552
            goto L_0x056b
        L_0x0552:
            boolean r6 = r5.f48738e
            if (r6 == 0) goto L_0x0563
            F r2 = r4.f45943a
            ro.d r2 = (p775ro.C19297d) r2
            android.content.res.Resources r2 = r2.getResources()
            java.lang.String r2 = p626lf.C18201b.m44920q(r5, r2)
            goto L_0x056b
        L_0x0563:
            boolean r6 = r5.f48739f
            if (r6 == 0) goto L_0x056b
            java.lang.String r2 = r4.mo51727g(r5)
        L_0x056b:
            ki.b r4 = r15.f45307b
            int r5 = p565io.C17625b.f45308d
            java.lang.String r5 = "justrideSDK"
            mf0.C24362h.m61211f(r4, r5)
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r4 = r4.mo50524c()
            java.lang.String r6 = "KEY_SDK_INSTANCE_IDENTIFIER"
            r5.putString(r6, r4)
            java.lang.String r4 = "KEY_DISCLAIMER_TITLE"
            r5.putString(r4, r0)
            java.lang.String r0 = "KEY_DISCLAIMER_BODY"
            r5.putString(r0, r1)
            java.lang.String r0 = "KEY_DISCLAIMER_WARNING"
            r5.putString(r0, r2)
            to.a r0 = new to.a
            r0.<init>()
            r0.setArguments(r5)
            r0.setTargetFragment(r15, r3)
            androidx.fragment.app.FragmentManager r15 = r15.getParentFragmentManager()
            java.lang.String r1 = "ticket_activation_disclaimer_dialog_fragment"
            r0.show((androidx.fragment.app.FragmentManager) r15, (java.lang.String) r1)
            goto L_0x05b9
        L_0x05a7:
            P r15 = r15.f45311c
            ro.j r15 = (p775ro.C19305j) r15
            al.a r0 = r15.f49114e
            ro.e r1 = new ro.e
            r1.<init>(r15)
            com.masabi.justride.sdk.platform.jobs.CallBackOn r2 = com.masabi.justride.sdk.platform.jobs.CallBackOn.MAIN_THREAD
            ro.g r15 = r15.f49130u
            r0.mo40390a(r1, r2, r15)
        L_0x05b9:
            return
        L_0x05ba:
            java.lang.Object r15 = r14.f15764c
            com.facebook.internal.j0 r15 = (com.facebook.internal.C2410j0) r15
            int r0 = com.facebook.internal.C2410j0.f8659n
            mf0.C24362h.m61211f(r15, r4)
            r15.cancel()
            return
        L_0x05c7:
            java.lang.Object r15 = r14.f15764c
            com.cubic.umo.ad.playback.ui.activities.AKBrowserActivity r15 = (com.cubic.umo.p045ad.playback.p046ui.activities.AKBrowserActivity) r15
            java.lang.ref.WeakReference<com.cubic.umo.ad.playback.ui.activities.AKBrowserActivity> r0 = com.cubic.umo.p045ad.playback.p046ui.activities.AKBrowserActivity.f7313G
            mf0.C24362h.m61211f(r15, r4)
            com.cubic.umo.ad.playback.ui.views.AKWebView r0 = r15.f7320x
            if (r0 != 0) goto L_0x05d5
            goto L_0x05dc
        L_0x05d5:
            boolean r0 = r0.canGoBack()
            if (r0 != r1) goto L_0x05dc
            goto L_0x05dd
        L_0x05dc:
            r1 = 0
        L_0x05dd:
            if (r1 == 0) goto L_0x05e7
            com.cubic.umo.ad.playback.ui.views.AKWebView r15 = r15.f7320x
            if (r15 != 0) goto L_0x05e4
            goto L_0x05e7
        L_0x05e4:
            r15.goBack()
        L_0x05e7:
            return
        L_0x05e8:
            java.lang.Object r15 = r14.f15764c
            hx.d r15 = (p550hx.C17514d) r15
            int r0 = p550hx.C17514d.f45085i
            r15.getClass()
            hq.b$a r0 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r0.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r2 = "close_clicked"
            r0.mo49939g(r1, r2)
            hq.b r0 = r0.mo49933a()
            r15.mo22564R1(r0)
            A r0 = r15.f40792c
            com.moovit.app.tod.order.TodOrderActivity r0 = (com.moovit.app.tod.order.TodOrderActivity) r0
            java.lang.String r1 = r15.f45086h
            r0.mo46398H2(r1)
            r15.dismissAllowingStateLoss()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p073e7.C4583a.onClick(android.view.View):void");
    }
}
