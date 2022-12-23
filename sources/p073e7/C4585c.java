package p073e7;

import android.view.View;

/* renamed from: e7.c */
public final /* synthetic */ class C4585c implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f15767b;

    /* renamed from: c */
    public final /* synthetic */ Object f15768c;

    public /* synthetic */ C4585c(Object obj, int i) {
        this.f15767b = i;
        this.f15768c = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v7, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v37 */
    /* JADX WARNING: type inference failed for: r2v38 */
    /* JADX WARNING: type inference failed for: r2v39 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r10) {
        /*
            r9 = this;
            int r0 = r9.f15767b
            r1 = 0
            r2 = 0
            r3 = 1
            r4 = 4
            switch(r0) {
                case 0: goto L_0x0511;
                case 1: goto L_0x04fd;
                case 2: goto L_0x04b8;
                case 3: goto L_0x0469;
                case 4: goto L_0x045f;
                case 5: goto L_0x0455;
                case 6: goto L_0x044d;
                case 7: goto L_0x0431;
                case 8: goto L_0x0387;
                case 9: goto L_0x0372;
                case 10: goto L_0x02e0;
                case 11: goto L_0x02bf;
                case 12: goto L_0x02a9;
                case 13: goto L_0x026c;
                case 14: goto L_0x024a;
                case 15: goto L_0x023e;
                case 16: goto L_0x0208;
                case 17: goto L_0x01e6;
                case 18: goto L_0x019d;
                case 19: goto L_0x0183;
                case 20: goto L_0x0179;
                case 21: goto L_0x016f;
                case 22: goto L_0x0143;
                case 23: goto L_0x00b3;
                case 24: goto L_0x0098;
                case 25: goto L_0x0062;
                case 26: goto L_0x002a;
                case 27: goto L_0x0020;
                case 28: goto L_0x000b;
                default: goto L_0x0009;
            }
        L_0x0009:
            goto L_0x0539
        L_0x000b:
            java.lang.Object r0 = r9.f15768c
            com.moovit.app.tod.bottomsheet.stateviews.TodActiveRideRemoteScreenView r0 = (com.moovit.app.tod.bottomsheet.stateviews.TodActiveRideRemoteScreenView) r0
            int r1 = com.moovit.app.tod.bottomsheet.stateviews.TodActiveRideRemoteScreenView.f40118O
            r0.getClass()
            java.lang.Object r10 = r10.getTag()
            fx.b r10 = (p502fx.C17117b) r10
            if (r10 == 0) goto L_0x001f
            p379.C13555b.m33963b(r0, r10)
        L_0x001f:
            return
        L_0x0020:
            java.lang.Object r10 = r9.f15768c
            ax.h r10 = (p376ax.C13546h) r10
            int r0 = p376ax.C13546h.f33483w
            r10.mo40431y2()
            return
        L_0x002a:
            java.lang.Object r0 = r9.f15768c
            sw.a r0 = (p807sw.C19564a) r0
            int r1 = p807sw.C19564a.f49735h
            r0.getClass()
            java.lang.Object r10 = r10.getTag()
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L_0x005e
            hq.b$a r1 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r2 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r1.<init>(r2)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r3 = "download_taxi_clicked"
            r1.mo49939g(r2, r3)
            hq.b r1 = r1.mo49933a()
            r0.mo22564R1(r1)
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x005e }
            java.lang.String r2 = "android.intent.action.VIEW"
            android.net.Uri r10 = android.net.Uri.parse(r10)     // Catch:{ Exception -> 0x005e }
            r1.<init>(r2, r10)     // Catch:{ Exception -> 0x005e }
            r0.startActivity(r1)     // Catch:{ Exception -> 0x005e }
        L_0x005e:
            r0.dismissAllowingStateLoss()
            return
        L_0x0062:
            java.lang.Object r10 = r9.f15768c
            fw.l r10 = (p501fw.C17115l) r10
            int r0 = p501fw.C17115l.f44295h
            r10.getClass()
            hq.b$a r0 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r0.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r2 = "restore_subscription_button_click"
            r0.mo49939g(r1, r2)
            hq.b r0 = r0.mo49933a()
            r10.mo22564R1(r0)
            android.os.Bundle r0 = r10.mo46752K1()
            java.lang.String r1 = "purchaseDetails"
            java.util.ArrayList r0 = r0.getParcelableArrayList(r1)
            java.lang.Class<com.moovit.app.subscription.SubscriptionsActivity> r1 = com.moovit.app.subscription.SubscriptionsActivity.class
            k8.c r2 = new k8.c
            r2.<init>(r0)
            r10.mo46753L1(r1, r2)
            r10.dismissAllowingStateLoss()
            return
        L_0x0098:
            java.lang.Object r0 = r9.f15768c
            com.moovit.app.servicealerts.ServiceAlertFragment r0 = (com.moovit.app.servicealerts.ServiceAlertFragment) r0
            int r1 = com.moovit.app.servicealerts.ServiceAlertFragment.f39556x
            r0.getClass()
            java.lang.Object r10 = r10.getTag()
            j80.c r10 = (j80.C12774c) r10
            A r1 = r0.f40822c
            java.lang.String r10 = r10.f31573a
            android.content.Intent r10 = com.moovit.app.servicealerts.ServiceAlertDetailsActivity.m39148z2(r1, r2, r10)
            r0.startActivity(r10)
            return
        L_0x00b3:
            java.lang.Object r0 = r9.f15768c
            xv.c r0 = (p926xv.C20622c) r0
            int r4 = p926xv.C20622c.f52134i
            r0.getClass()
            java.lang.Object r4 = r10.getTag()
            com.moovit.servicealerts.LineServiceAlertDigest r4 = (com.moovit.servicealerts.LineServiceAlertDigest) r4
            if (r4 != 0) goto L_0x00c6
            goto L_0x0142
        L_0x00c6:
            android.content.Context r10 = r10.getContext()
            j80.g$a r5 = j80.C12786g.f31604g
            java.lang.String r5 = "twitter_service_alerts_feeds"
            java.lang.Object r5 = r10.getSystemService(r5)
            j80.g r5 = (j80.C12786g) r5
            java.util.List<java.lang.String> r6 = r4.f23187d
            com.moovit.servicealerts.ServiceAlertAffectedLine r7 = r4.f23185b
            com.moovit.network.model.ServerId r7 = r7.f23206d
            if (r5 == 0) goto L_0x00e9
            if (r7 == 0) goto L_0x00e9
            java.util.Map<com.moovit.network.model.ServerId, java.lang.String> r5 = r5.f31609e
            boolean r5 = r5.containsKey(r7)
            if (r5 == 0) goto L_0x00e9
            r5 = 1
            goto L_0x00ea
        L_0x00e9:
            r5 = 0
        L_0x00ea:
            if (r7 == 0) goto L_0x00fe
            int r8 = r6.size()
            if (r8 > r3) goto L_0x00f4
            if (r5 == 0) goto L_0x00fe
        L_0x00f4:
            android.content.Intent r10 = com.moovit.app.reports.list.LinesReportsListActivity.m38851E2(r10, r2, r2, r7)
            r0.startActivity(r10)
            java.lang.String r2 = "line_service_alerts"
            goto L_0x0113
        L_0x00fe:
            boolean r3 = r6.isEmpty()
            if (r3 != 0) goto L_0x0113
            java.lang.Object r1 = r6.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            android.content.Intent r10 = com.moovit.app.servicealerts.ServiceAlertDetailsActivity.m39148z2(r10, r7, r1)
            r0.startActivity(r10)
            java.lang.String r2 = "service_alert_details"
        L_0x0113:
            hq.b$a r10 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r10.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r3 = "service_alert_clicked"
            r10.mo49939g(r1, r3)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.ACTION
            r10.mo49945m(r1, r2)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.SERVICE_ALERT_TYPE
            com.moovit.servicealerts.ServiceStatus r2 = r4.f23186c
            com.moovit.servicealerts.ServiceStatusCategory r2 = r2.f23213b
            java.lang.String r2 = p001a0.C0016g.m12B(r2)
            r10.mo49939g(r1, r2)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TWITTER_SHOWN
            r10.mo49941i(r1, r5)
            hq.b r10 = r10.mo49933a()
            r0.mo22564R1(r10)
            r0.dismiss()
        L_0x0142:
            return
        L_0x0143:
            java.lang.Object r10 = r9.f15768c
            com.moovit.app.search.locations.a r10 = (com.moovit.app.search.locations.C15284a) r10
            com.moovit.network.model.ServerId r0 = com.moovit.app.search.locations.C15284a.f39471U
            r10.getClass()
            hq.b$a r0 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r0.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r3 = "choose_map_empty_clicked"
            r0.mo49939g(r1, r3)
            hq.b r0 = r0.mo49933a()
            r10.mo46797j2(r0)
            android.content.Context r0 = r10.requireContext()
            android.content.Intent r0 = com.moovit.location.mappicker.MapLocationPickerActivity.m41309A2(r0, r2)
            r1 = 1781(0x6f5, float:2.496E-42)
            r10.startActivityForResult(r0, r1)
            return
        L_0x016f:
            java.lang.Object r10 = r9.f15768c
            rv.n r10 = (p782rv.C19363n) r10
            int r0 = p782rv.C19363n.f49268p
            r10.mo51772r2()
            return
        L_0x0179:
            java.lang.Object r10 = r9.f15768c
            rv.g r10 = (p782rv.C19342g) r10
            int r0 = p782rv.C19342g.f49212A
            r10.mo51752r2()
            return
        L_0x0183:
            java.lang.Object r10 = r9.f15768c
            com.moovit.app.ridesharing.EventDetailActivity r10 = (com.moovit.app.ridesharing.EventDetailActivity) r10
            com.moovit.ridesharing.model.Event r0 = r10.f39268Y
            if (r0 != 0) goto L_0x018c
            goto L_0x019c
        L_0x018c:
            com.moovit.app.ridesharing.booking.EventBookingParams r0 = new com.moovit.app.ridesharing.booking.EventBookingParams
            com.moovit.ridesharing.model.Event r1 = r10.f39268Y
            com.moovit.network.model.ServerId r1 = r1.f42911b
            r0.<init>(r1, r2)
            android.content.Intent r0 = com.moovit.app.ridesharing.booking.EventBookingActivity.m38987y2(r10, r0)
            r10.startActivity(r0)
        L_0x019c:
            return
        L_0x019d:
            java.lang.Object r10 = r9.f15768c
            uu.e r10 = (p853uu.C19995e) r10
            com.moovit.util.qr.QrCodesPagerView r0 = r10.f50837n
            int r0 = r0.getCurrentItemPosition()
            java.util.List<com.moovit.app.mot.model.MotActivation> r1 = r10.f50838o
            java.lang.Object r0 = r1.get(r0)
            com.moovit.app.mot.model.MotActivation r0 = (com.moovit.app.mot.model.MotActivation) r0
            hq.b$a r1 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r2 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r1.<init>(r2)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r3 = "mot_activation_details_clicked"
            r1.mo49939g(r2, r3)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.ID
            com.moovit.network.model.ServerId r3 = r0.f38985b
            r1.mo49937e(r2, r3)
            hq.b r1 = r1.mo49933a()
            r10.mo46797j2(r1)
            A r1 = r10.f40822c
            int r2 = com.moovit.app.mot.activation.MotActivationDetailsActivity.f38974X
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<com.moovit.app.mot.activation.MotActivationDetailsActivity> r3 = com.moovit.app.mot.activation.MotActivationDetailsActivity.class
            r2.<init>(r1, r3)
            java.lang.String r1 = "activation"
            r2.putExtra(r1, r0)
            r10.startActivity(r2)
            A r10 = r10.f40822c
            com.moovit.app.MoovitAppActivity r10 = (com.moovit.app.MoovitAppActivity) r10
            r10.finish()
            return
        L_0x01e6:
            java.lang.Object r10 = r9.f15768c
            qu.a r10 = (p757qu.C19177a) r10
            int r0 = p757qu.C19177a.f48763h
            r10.getClass()
            hq.b$a r0 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r0.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r2 = "dismiss"
            r0.mo49939g(r1, r2)
            hq.b r0 = r0.mo49933a()
            r10.mo22564R1(r0)
            r10.dismissAllowingStateLoss()
            return
        L_0x0208:
            java.lang.Object r10 = r9.f15768c
            com.moovit.app.mot.activation.MotActivationDetailsActivity r10 = (com.moovit.app.mot.activation.MotActivationDetailsActivity) r10
            int r0 = com.moovit.app.mot.activation.MotActivationDetailsActivity.f38974X
            r10.getClass()
            hq.b$a r0 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r0.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r2 = "mot_activation_details_support_clicked"
            r0.mo49939g(r1, r2)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.ID
            com.moovit.app.mot.model.MotActivation r2 = r10.f38975U
            com.moovit.network.model.ServerId r2 = r2.f38985b
            r0.mo49937e(r1, r2)
            hq.b r0 = r0.mo49933a()
            r10.mo44545v2(r0)
            r0 = 2131888135(0x7f120807, float:1.9410897E38)
            java.lang.String r0 = r10.getString(r0)
            android.content.Intent r0 = p977zz.C20927a0.m49011f(r0)
            p977zz.C20927a0.m49017l(r10, r0)
            return
        L_0x023e:
            java.lang.Object r0 = r9.f15768c
            com.moovit.app.itinerary.view.leg.AbstractLegView r0 = (com.moovit.app.itinerary.view.leg.AbstractLegView) r0
            L r1 = r0.f38709z
            com.moovit.itinerary.model.leg.Leg r2 = r0.f38689A
            r0.mo45371D(r10, r1, r2)
            return
        L_0x024a:
            java.lang.Object r10 = r9.f15768c
            com.moovit.app.itinerary.ItineraryActivity r10 = (com.moovit.app.itinerary.ItineraryActivity) r10
            int r0 = com.moovit.app.itinerary.ItineraryActivity.f38474B0
            r10.getClass()
            hq.b$a r0 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r0.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r2 = "back_to_suggested_routes_clicked"
            r0.mo49939g(r1, r2)
            hq.b r0 = r0.mo49933a()
            r10.mo44545v2(r0)
            r10.mo45269D2()
            return
        L_0x026c:
            java.lang.Object r10 = r9.f15768c
            tt.h r10 = (p828tt.C19767h) r10
            int r0 = p828tt.C19767h.f50254p
            r10.getClass()
            hq.b$a r0 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r0.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r3 = "add_home_clicked"
            r0.mo49939g(r1, r3)
            hq.b r0 = r0.mo49933a()
            r10.mo46797j2(r0)
            androidx.activity.result.b<android.content.Intent> r0 = r10.f50256o
            com.moovit.app.search.AppSearchLocationCallback r1 = new com.moovit.app.search.AppSearchLocationCallback
            r4 = 2131887301(0x7f1204c5, float:1.9409205E38)
            r5 = 2131887154(0x7f120432, float:1.9408907E38)
            r6 = 1
            r7 = 1
            r8 = 0
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            android.content.Context r10 = r10.requireContext()
            java.lang.String r3 = "search_location_source_onboarding_favorite"
            android.content.Intent r10 = com.moovit.search.SearchLocationActivity.m17347y2(r10, r1, r3, r2)
            r0.mo772a(r10)
            return
        L_0x02a9:
            java.lang.Object r10 = r9.f15768c
            nt.l r10 = (p687nt.C18604l) r10
            com.moovit.app.taxi.providers.TaxiProvider r0 = r10.f47404y
            if (r0 != 0) goto L_0x02b2
            goto L_0x02be
        L_0x02b2:
            com.moovit.map.MapFragment r1 = r10.mo50993X()
            nt.j r2 = new nt.j
            r2.<init>((p687nt.C18604l) r10, (com.moovit.app.taxi.providers.TaxiProvider) r0, (com.moovit.map.MapFragment) r1)
            r1.mo48656t2(r2)
        L_0x02be:
            return
        L_0x02bf:
            java.lang.Object r10 = r9.f15768c
            nt.e r10 = (p687nt.C18595e) r10
            com.moovit.commons.view.behavior.MyBottomSheetBehavior<?> r0 = r10.f47352c
            r0.setState(r4)
            nt.l r10 = r10.f47350a
            hq.b$a r0 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r0.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r2 = "show_stations_clicked"
            r0.mo49939g(r1, r2)
            hq.b r0 = r0.mo49933a()
            r10.mo46797j2(r0)
            return
        L_0x02e0:
            java.lang.Object r0 = r9.f15768c
            kt.c r0 = (p616kt.C18136c) r0
            int r1 = p616kt.C18136c.f46354p
            com.moovit.commons.view.pager.ViewPager r1 = r0.f46355o
            androidx.viewpager.widget.PagerAdapter r1 = r1.getAdapter()
            n00.b r1 = (n00.C18492b) r1
            if (r1 != 0) goto L_0x02f2
            r1 = r2
            goto L_0x02f6
        L_0x02f2:
            androidx.viewpager.widget.PagerAdapter r1 = r1.f47097a
            kt.c$b r1 = (p616kt.C18136c.C18138b) r1
        L_0x02f6:
            if (r1 != 0) goto L_0x02fa
            r1 = r2
            goto L_0x0304
        L_0x02fa:
            com.moovit.commons.view.pager.ViewPager r3 = r0.f46355o
            int r3 = r3.getCurrentLogicalItem()
            com.moovit.transit.TransitType r1 = r1.mo50574b(r3)
        L_0x0304:
            java.lang.String r3 = "CONFIGURATION"
            boolean r4 = r0.mo46785T1(r3)
            if (r4 == 0) goto L_0x0313
            java.lang.Object r3 = r0.mo46776J1(r3)
            q00.a r3 = (q00.C19047a) r3
            goto L_0x0314
        L_0x0313:
            r3 = r2
        L_0x0314:
            if (r3 == 0) goto L_0x0329
            r00.a r4 = q00.C19053d.f48474m
            java.lang.Object r3 = r3.mo51505b(r4)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0329
            com.moovit.app.home.lines.LocationsPagerEmptySearchLineViewFactory r2 = new com.moovit.app.home.lines.LocationsPagerEmptySearchLineViewFactory
            r2.<init>()
        L_0x0329:
            android.content.Context r10 = r10.getContext()
            int r3 = com.moovit.home.lines.search.SearchLinePagerActivity.f41645Y
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.moovit.home.lines.search.SearchLinePagerActivity> r4 = com.moovit.home.lines.search.SearchLinePagerActivity.class
            r3.<init>(r10, r4)
            if (r1 == 0) goto L_0x033d
            java.lang.String r10 = "initialTransitType"
            r3.putExtra(r10, r1)
        L_0x033d:
            if (r2 == 0) goto L_0x0344
            java.lang.String r10 = "emptySearchLineViewFactory"
            r3.putExtra(r10, r2)
        L_0x0344:
            r10 = 1097(0x449, float:1.537E-42)
            r0.startActivityForResult(r3, r10)
            z20.a$a r10 = new z20.a$a
            java.lang.String r2 = "lines_search_tap"
            r10.<init>(r2)
            r10.mo52935c()
            hq.b$a r10 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r2 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r10.<init>(r2)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r3 = "search_clicked"
            r10.mo49939g(r2, r3)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.TRANSIT_TYPE
            java.lang.String r1 = p001a0.C0016g.m15E(r1)
            r10.mo49939g(r2, r1)
            hq.b r10 = r10.mo49933a()
            r0.mo46797j2(r10)
            return
        L_0x0372:
            java.lang.Object r0 = r9.f15768c
            com.moovit.app.home.dashboard.b r0 = (com.moovit.app.home.dashboard.C14926b) r0
            com.moovit.app.home.dashboard.b$a r1 = com.moovit.app.home.dashboard.C14926b.f38185s
            r0.getClass()
            android.content.Context r10 = r10.getContext()
            android.content.Intent r10 = com.moovit.app.carpool.center.CarpoolCenterActivity.m37255y2(r10)
            r0.startActivity(r10)
            return
        L_0x0387:
            java.lang.Object r10 = r9.f15768c
            com.moovit.app.history.TripHistoryActivity r10 = (com.moovit.app.history.TripHistoryActivity) r10
            int r0 = com.moovit.app.history.TripHistoryActivity.f38127U
            androidx.fragment.app.FragmentManager r0 = r10.getSupportFragmentManager()
            r1 = 2131364576(0x7f0a0ae0, float:1.8348993E38)
            androidx.fragment.app.Fragment r0 = r0.mo3983z(r1)
            com.moovit.app.history.HistoryItemResultsFragment r0 = (com.moovit.app.history.HistoryItemResultsFragment) r0
            if (r0 != 0) goto L_0x03ac
            de.f r10 = p435de.C16596f.m42113a()
            com.moovit.commons.utils.ApplicationBugException r0 = new com.moovit.commons.utils.ApplicationBugException
            java.lang.String r1 = "Results fragment is null."
            r0.<init>((java.lang.String) r1)
            r10.mo49364c(r0)
            goto L_0x0430
        L_0x03ac:
            com.moovit.app.tripplanner.TripPlannerResultsFragment$SearchParams<O> r0 = r0.f40516o
            if (r0 != 0) goto L_0x03bf
            de.f r10 = p435de.C16596f.m42113a()
            com.moovit.commons.utils.ApplicationBugException r0 = new com.moovit.commons.utils.ApplicationBugException
            java.lang.String r1 = "Latest search parameters are null."
            r0.<init>((java.lang.String) r1)
            r10.mo49364c(r0)
            goto L_0x0430
        L_0x03bf:
            java.lang.String r1 = "ui_configuration"
            java.lang.Object r1 = r10.getSystemService(r1)
            iq.d r1 = (p567iq.C17637d) r1
            int r1 = r1.f45349f
            if (r1 == r3) goto L_0x0416
            r4 = 2
            if (r1 == r4) goto L_0x03f2
            r2 = 3
            if (r1 == r2) goto L_0x03d3
            goto L_0x0430
        L_0x03d3:
            com.moovit.suggestedroutes.TripPlanParams$d r1 = new com.moovit.suggestedroutes.TripPlanParams$d
            r1.<init>()
            com.moovit.tripplanner.TripPlannerLocations r0 = r0.f40518c
            com.moovit.transit.LocationDescriptor r2 = r0.f23786b
            r1.f23790a = r2
            com.moovit.transit.LocationDescriptor r0 = r0.f23787c
            r1.f23791b = r0
            com.moovit.suggestedroutes.TripPlanParams r0 = r1.mo23958a()
            int r1 = com.moovit.app.offline.tripplanner.PartialOfflineTripPlannerActivity.f39167r0
            java.lang.Class<com.moovit.app.offline.tripplanner.PartialOfflineTripPlannerActivity> r1 = com.moovit.app.offline.tripplanner.PartialOfflineTripPlannerActivity.class
            android.content.Intent r0 = com.moovit.app.tripplanner.TripPlannerActivity.m39768z2(r10, r1, r0, r3)
            r10.startActivity(r0)
            goto L_0x0430
        L_0x03f2:
            com.moovit.app.offline.tripplanner.OfflineTripPlannerParams$d r1 = new com.moovit.app.offline.tripplanner.OfflineTripPlannerParams$d
            r1.<init>()
            com.moovit.tripplanner.TripPlannerLocations r0 = r0.f40518c
            com.moovit.transit.LocationDescriptor r4 = r0.f23786b
            r1.f23790a = r4
            com.moovit.transit.LocationDescriptor r0 = r0.f23787c
            r1.f23791b = r0
            com.moovit.app.offline.tripplanner.OfflineTripPlannerParams r0 = new com.moovit.app.offline.tripplanner.OfflineTripPlannerParams
            com.moovit.transit.LocationDescriptor r4 = r1.f23790a
            com.moovit.transit.LocationDescriptor r1 = r1.f23791b
            r0.<init>(r4, r1, r2)
            int r1 = com.moovit.app.offline.tripplanner.OfflineTripPlannerActivity.f39160r0
            java.lang.Class<com.moovit.app.offline.tripplanner.OfflineTripPlannerActivity> r1 = com.moovit.app.offline.tripplanner.OfflineTripPlannerActivity.class
            android.content.Intent r0 = com.moovit.app.tripplanner.TripPlannerActivity.m39768z2(r10, r1, r0, r3)
            r10.startActivity(r0)
            goto L_0x0430
        L_0x0416:
            com.moovit.suggestedroutes.TripPlanParams$d r1 = new com.moovit.suggestedroutes.TripPlanParams$d
            r1.<init>()
            com.moovit.tripplanner.TripPlannerLocations r0 = r0.f40518c
            com.moovit.transit.LocationDescriptor r2 = r0.f23786b
            r1.f23790a = r2
            com.moovit.transit.LocationDescriptor r0 = r0.f23787c
            r1.f23791b = r0
            com.moovit.suggestedroutes.TripPlanParams r0 = r1.mo23958a()
            android.content.Intent r0 = com.moovit.app.suggestedroutes.SuggestRoutesActivity.m39325M2(r10, r0, r3)
            r10.startActivity(r0)
        L_0x0430:
            return
        L_0x0431:
            java.lang.Object r10 = r9.f15768c
            com.moovit.app.general.aboutandcontact.AboutAndContactActivity r10 = (com.moovit.app.general.aboutandcontact.AboutAndContactActivity) r10
            int r0 = com.moovit.app.general.aboutandcontact.AboutAndContactActivity.f38043U
            r0 = 2131889832(0x7f120ea8, float:1.9414339E38)
            java.lang.String r0 = r10.getString(r0)
            r1 = 2131889831(0x7f120ea7, float:1.9414337E38)
            java.lang.String r1 = r10.getString(r1)
            android.content.Intent r0 = com.moovit.web.WebViewActivity.m18168y2(r10, r0, r1)
            r10.startActivity(r0)
            return
        L_0x044d:
            java.lang.Object r0 = r9.f15768c
            com.moovit.app.general.SpreadTheLoveActivity r0 = (com.moovit.app.general.SpreadTheLoveActivity) r0
            com.moovit.app.general.SpreadTheLoveActivity.m37518y2(r0, r10)
            return
        L_0x0455:
            java.lang.Object r10 = r9.f15768c
            com.moovit.app.gallery.GalleryActivity r10 = (com.moovit.app.gallery.GalleryActivity) r10
            int r0 = com.moovit.app.gallery.GalleryActivity.f38010Y
            r10.mo44974z2()
            return
        L_0x045f:
            java.lang.Object r10 = r9.f15768c
            com.moovit.app.carpool.payment.CarpoolAddCreditCardActivity r10 = (com.moovit.app.carpool.payment.CarpoolAddCreditCardActivity) r10
            int r0 = com.moovit.app.carpool.payment.CarpoolAddCreditCardActivity.f37786x0
            r10.mo44876z2()
            return
        L_0x0469:
            java.lang.Object r10 = r9.f15768c
            com.moovit.app.carpool.fastbooking.CarpoolRideRequestDetailsActivity r10 = (com.moovit.app.carpool.fastbooking.CarpoolRideRequestDetailsActivity) r10
            int r0 = com.moovit.app.carpool.fastbooking.CarpoolRideRequestDetailsActivity.f37749m0
            r10.getClass()
            jr.a r0 = new jr.a
            c70.e r2 = r10.mo44548x1()
            com.moovit.carpool.CarpoolRideRequest r5 = r10.f37750U
            com.moovit.network.model.ServerId r5 = r5.f40928b
            r0.<init>(r5, r2)
            com.moovit.request.RequestOptions r2 = new com.moovit.request.RequestOptions
            r2.<init>()
            r2.f42909f = r3
            java.lang.String r3 = "cancel_ride_request_"
            java.lang.StringBuilder r3 = p379.C13555b.m33972k(r3)
            com.moovit.carpool.CarpoolRideRequest r5 = r10.f37750U
            com.moovit.network.model.ServerId r5 = r5.f40928b
            int r5 = r5.f15142b
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.moovit.app.carpool.fastbooking.CarpoolRideRequestDetailsActivity$a r5 = r10.f37754l0
            r10.mo44527k2(r3, r0, r2, r5)
            r0 = 2131363874(0x7f0a0822, float:1.834757E38)
            android.view.View r0 = r10.findViewById(r0)
            r0.setVisibility(r1)
            r0 = 2131361862(0x7f0a0046, float:1.8343488E38)
            android.view.View r0 = r10.findViewById(r0)
            r0.setVisibility(r4)
            java.lang.String r0 = "cancel_request_clicked"
            r10.mo44547w2(r0)
            return
        L_0x04b8:
            java.lang.Object r10 = r9.f15768c
            com.moovit.app.ads.consent.PrivacyPersonalizedAdsConsentActivity r10 = (com.moovit.app.ads.consent.PrivacyPersonalizedAdsConsentActivity) r10
            int r0 = com.moovit.app.ads.consent.PrivacyPersonalizedAdsConsentActivity.f37502Z
            r10.getClass()
            hq.b$a r0 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r0.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r2 = "learn_more_clicked"
            r0.mo49939g(r1, r2)
            hq.b r0 = r0.mo49933a()
            r10.mo44545v2(r0)
            boolean r0 = r10.f37504X
            if (r0 == 0) goto L_0x04ef
            com.moovit.app.general.settings.privacy.a r0 = com.moovit.app.general.settings.privacy.C14894a.m37560b(r10)
            boolean r0 = r0.mo45017g()
            if (r0 != 0) goto L_0x04ef
            java.lang.String r0 = "PRIVACY_AGREED_BY_LEARN_MORE_BUTTON"
            r10.f37505Y = r0
            com.moovit.app.general.settings.privacy.a r0 = com.moovit.app.general.settings.privacy.C14894a.m37560b(r10)
            r0.mo45018h()
        L_0x04ef:
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.moovit.app.ads.consent.AdjustAdsPreferencesActivity> r1 = com.moovit.app.ads.consent.AdjustAdsPreferencesActivity.class
            r0.<init>(r10, r1)
            r10.startActivity(r0)
            r10.finish()
            return
        L_0x04fd:
            java.lang.Object r10 = r9.f15768c
            com.moovit.MoovitActivity r10 = (com.moovit.MoovitActivity) r10
            java.lang.String r0 = com.moovit.MoovitActivity.f37291T
            r10.getClass()
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.settings.SETTINGS"
            r0.<init>(r1)
            r10.startActivity(r0)
            return
        L_0x0511:
            java.lang.Object r10 = r9.f15768c
            com.cubic.umo.ad.playback.ui.activities.AKBrowserActivity r10 = (com.cubic.umo.p045ad.playback.p046ui.activities.AKBrowserActivity) r10
            java.lang.ref.WeakReference<com.cubic.umo.ad.playback.ui.activities.AKBrowserActivity> r0 = com.cubic.umo.p045ad.playback.p046ui.activities.AKBrowserActivity.f7313G
            java.lang.String r0 = "this$0"
            mf0.C24362h.m61211f(r10, r0)
            com.cubic.umo.ad.playback.ui.views.AKWebView r0 = r10.f7320x
            mf0.C24362h.m61208c(r0)
            r0.stopLoading()
            java.lang.String r1 = ""
            r0.loadUrl(r1)
            com.umo.ads.u.zzk r0 = com.umo.ads.p350u.zzk.BROADCAST_ACTION_BROWSER_DISMISS
            int r1 = com.umo.ads.p347l.zzd.f30827d
            java.lang.String r1 = r10.f7317D
            java.lang.String r0 = r0.zza
            com.umo.ads.p347l.zzd.C12091a.m32061a(r10, r1, r0, r2)
            r10.finish()
            return
        L_0x0539:
            java.lang.Object r0 = r9.f15768c
            com.moovit.app.tod.order.TodOrderActivity r0 = (com.moovit.app.tod.order.TodOrderActivity) r0
            int r1 = com.moovit.app.tod.order.TodOrderActivity.f40331D0
            r0.getClass()
            com.moovit.app.tod.view.TodOrderAssignmentListItemView r10 = (com.moovit.app.tod.view.TodOrderAssignmentListItemView) r10
            r0.mo46396F2(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p073e7.C4585c.onClick(android.view.View):void");
    }
}
