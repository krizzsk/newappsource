package p297w5;

import android.view.View;

/* renamed from: w5.a */
public final /* synthetic */ class C6994a implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f21764b;

    /* renamed from: c */
    public final /* synthetic */ Object f21765c;

    public /* synthetic */ C6994a(Object obj, int i) {
        this.f21764b = i;
        this.f21765c = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v76, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v48, resolved type: com.moovit.transit.TransitStop} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [int] */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r1v53, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v54, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v55, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v56, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v57, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v58, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: type inference failed for: r3v22 */
    /* JADX WARNING: type inference failed for: r3v24 */
    /* JADX WARNING: type inference failed for: r3v26 */
    /* JADX WARNING: type inference failed for: r3v28 */
    /* JADX WARNING: type inference failed for: r3v30 */
    /* JADX WARNING: type inference failed for: r3v33 */
    /* JADX WARNING: type inference failed for: r3v36 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0223, code lost:
        if (r0.equals("P1M") == false) goto L_0x0225;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r12) {
        /*
            r11 = this;
            int r0 = r11.f21764b
            r1 = 0
            r2 = 4
            r3 = 0
            r4 = -1
            r5 = 1
            switch(r0) {
                case 0: goto L_0x061f;
                case 1: goto L_0x05cb;
                case 2: goto L_0x05c3;
                case 3: goto L_0x05b9;
                case 4: goto L_0x05af;
                case 5: goto L_0x05a7;
                case 6: goto L_0x0567;
                case 7: goto L_0x0539;
                case 8: goto L_0x04d7;
                case 9: goto L_0x04a8;
                case 10: goto L_0x047e;
                case 11: goto L_0x0463;
                case 12: goto L_0x0434;
                case 13: goto L_0x0428;
                case 14: goto L_0x03de;
                case 15: goto L_0x03a6;
                case 16: goto L_0x036a;
                case 17: goto L_0x030a;
                case 18: goto L_0x02e8;
                case 19: goto L_0x0282;
                case 20: goto L_0x0264;
                case 21: goto L_0x025a;
                case 22: goto L_0x016a;
                case 23: goto L_0x0137;
                case 24: goto L_0x012f;
                case 25: goto L_0x00d9;
                case 26: goto L_0x00ca;
                case 27: goto L_0x0076;
                case 28: goto L_0x000c;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x0627
        L_0x000c:
            java.lang.Object r12 = r11.f21765c
            com.moovit.app.tod.order.TodOrderActivity r12 = (com.moovit.app.tod.order.TodOrderActivity) r12
            int r0 = com.moovit.app.tod.order.TodOrderActivity.f40331D0
            r12.getClass()
            hq.b$a r0 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r2 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r0.<init>(r2)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r3 = "change_ride_options_clicked"
            r0.mo49939g(r2, r3)
            hq.b r0 = r0.mo49933a()
            r12.mo44545v2(r0)
            boolean r0 = r12.f37313z
            if (r0 == 0) goto L_0x0075
            com.moovit.app.taxi.providers.TaxiOrderConfig r0 = r12.mo46392B2()
            com.moovit.app.tod.model.TodOrderConfig r2 = r12.mo46394C2()
            java.lang.String r3 = "todOrderConfig"
            if (r0 == 0) goto L_0x005b
            java.util.Map<com.moovit.network.model.ServerId, java.lang.Integer> r4 = r2.f40256b
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x005b
            int r4 = p550hx.C17512b.f45080l
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r4.putParcelable(r3, r2)
            java.lang.String r2 = "taxiOrderConfig"
            r4.putParcelable(r2, r0)
            hx.b r0 = new hx.b
            r0.<init>()
            r0.setArguments(r4)
            goto L_0x006e
        L_0x005b:
            int r0 = p550hx.C17513c.f45083k
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r0.putParcelable(r3, r2)
            hx.c r2 = new hx.c
            r2.<init>()
            r2.setArguments(r0)
            r0 = r2
        L_0x006e:
            androidx.fragment.app.FragmentManager r12 = r12.getSupportFragmentManager()
            r0.show((androidx.fragment.app.FragmentManager) r12, (java.lang.String) r1)
        L_0x0075:
            return
        L_0x0076:
            java.lang.Object r12 = r11.f21765c
            com.moovit.app.tod.center.subscriptions.TodWeeklySubscriptionDetailsFragment r12 = (com.moovit.app.tod.center.subscriptions.TodWeeklySubscriptionDetailsFragment) r12
            int r0 = com.moovit.app.tod.center.subscriptions.TodWeeklySubscriptionDetailsFragment.f40230u
            java.lang.String r0 = "this$0"
            mf0.C24362h.m61211f(r12, r0)
            androidx.fragment.app.FragmentManager r0 = r12.getChildFragmentManager()
            java.lang.String r1 = "cancel_recurring_order_dialog_fragment_tag"
            androidx.fragment.app.Fragment r0 = r0.mo3923A(r1)
            if (r0 == 0) goto L_0x008f
            goto L_0x00c9
        L_0x008f:
            com.moovit.design.dialog.AlertDialogFragment$a r0 = new com.moovit.design.dialog.AlertDialogFragment$a
            android.content.Context r2 = r12.requireContext()
            r0.<init>((android.content.Context) r2)
            com.moovit.design.dialog.AlertDialogFragment$a r0 = r0.mo47682k(r1)
            r2 = 2131231716(0x7f0803e4, float:1.807952E38)
            r0.mo47676e(r2, r3)
            r2 = 2131889210(0x7f120c3a, float:1.9413077E38)
            com.moovit.design.dialog.AlertDialogFragment$a r0 = r0.mo47683l(r2)
            r2 = 2131889209(0x7f120c39, float:1.9413075E38)
            com.moovit.design.dialog.AlertDialogFragment$a r0 = r0.mo47678g(r2)
            r2 = 2131886193(0x7f120071, float:1.9406958E38)
            com.moovit.design.dialog.AlertDialogFragment$a r0 = r0.mo47681j(r2)
            r2 = 2131886157(0x7f12004d, float:1.9406885E38)
            com.moovit.design.dialog.AlertDialogFragment$a r0 = r0.mo47680i(r2)
            com.moovit.design.dialog.AlertDialogFragment r0 = r0.mo47673b()
            androidx.fragment.app.FragmentManager r12 = r12.getChildFragmentManager()
            r0.show((androidx.fragment.app.FragmentManager) r12, (java.lang.String) r1)
        L_0x00c9:
            return
        L_0x00ca:
            java.lang.Object r12 = r11.f21765c
            com.moovit.app.tod.bottomsheet.stateviews.TodAutonomousRideWaitingAtPickupView r12 = (com.moovit.app.tod.bottomsheet.stateviews.TodAutonomousRideWaitingAtPickupView) r12
            int r0 = com.moovit.app.tod.bottomsheet.stateviews.TodAutonomousRideWaitingAtPickupView.f40162r
            r12.getClass()
            com.moovit.app.tod.model.TodRideVehicleAction r0 = com.moovit.app.tod.model.TodRideVehicleAction.COLOR_BAR
            p379.C13555b.m33964c(r12, r0)
            return
        L_0x00d9:
            java.lang.Object r12 = r11.f21765c
            ax.d r12 = (p376ax.C13542d) r12
            int r0 = p376ax.C13542d.f33471r
            com.moovit.app.tod.bookingflow.TodBookingOrderViewModel r0 = r12.mo40436p2()
            androidx.lifecycle.t r0 = r0.f40081m
            java.lang.Object r0 = r0.getValue()
            com.moovit.app.tod.order.TodOrderActivity$TodOrderInfo r0 = (com.moovit.app.tod.order.TodOrderActivity.TodOrderInfo) r0
            if (r0 != 0) goto L_0x00ee
            goto L_0x012e
        L_0x00ee:
            com.moovit.tripplanner.TripPlannerTime r1 = r0.f40355d
            if (r1 == 0) goto L_0x00f8
            boolean r1 = r1.mo24489d()
            if (r1 == 0) goto L_0x00f9
        L_0x00f8:
            r3 = 1
        L_0x00f9:
            hq.b$a r1 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r2 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r1.<init>(r2)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r4 = "tod_order_find_a_ride_clicked"
            r1.mo49939g(r2, r4)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.DEPART_NOW
            r1.mo49941i(r2, r3)
            hq.b r1 = r1.mo49933a()
            r12.mo46797j2(r1)
            android.content.Context r1 = r12.requireContext()
            int r2 = com.moovit.app.tod.order.TodOrderActivity.f40331D0
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<com.moovit.app.tod.order.TodOrderActivity> r3 = com.moovit.app.tod.order.TodOrderActivity.class
            r2.<init>(r1, r3)
            java.lang.String r1 = "orderInfo"
            r2.putExtra(r1, r0)
            java.lang.String r0 = "fromTodBookingOrderFlow"
            r2.putExtra(r0, r5)
            r12.startActivity(r2)
        L_0x012e:
            return
        L_0x012f:
            java.lang.Object r0 = r11.f21765c
            com.moovit.app.tod.b r0 = (com.moovit.app.tod.C15462b) r0
            com.moovit.app.tod.C15462b.m39579m2(r0, r12)
            return
        L_0x0137:
            java.lang.Object r12 = r11.f21765c
            qw.a r12 = (p759qw.C19195a) r12
            int r0 = p759qw.C19195a.f48800j
            android.content.Context r0 = r12.getContext()
            if (r0 != 0) goto L_0x0144
            goto L_0x0169
        L_0x0144:
            kw.a r1 = new kw.a
            java.lang.String r2 = r12.f48802i
            com.moovit.app.surveys.answer.SurveyQuestionnaireAnswer r4 = new com.moovit.app.surveys.answer.SurveyQuestionnaireAnswer
            com.moovit.app.surveys.data.Survey$Id r5 = r12.f48801h
            long r6 = java.lang.System.currentTimeMillis()
            com.moovit.app.surveys.answer.SurveyEndReason r8 = com.moovit.app.surveys.answer.SurveyEndReason.NOT_RELEVANT
            r4.<init>(r5, r6, r8)
            java.util.List r5 = java.util.Collections.emptyList()
            r1.<init>(r2, r4, r5)
            com.moovit.app.surveys.SurveyManager r0 = com.moovit.app.surveys.SurveyManager.m39375d(r0)
            r0.mo45976g(r1)
            r12.mo51614W1(r3)
            r12.dismiss()
        L_0x0169:
            return
        L_0x016a:
            java.lang.Object r12 = r11.f21765c
            fw.k r12 = (p501fw.C17113k) r12
            java.math.BigDecimal r0 = p501fw.C17113k.f44286p
            android.view.View r0 = r12.getView()
            if (r0 != 0) goto L_0x0178
            goto L_0x0259
        L_0x0178:
            r4 = 2131363953(0x7f0a0871, float:1.834773E38)
            android.view.View r0 = r0.findViewById(r4)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
            boolean r4 = r0 instanceof p501fw.C17113k.C17114a
            if (r4 != 0) goto L_0x018b
            goto L_0x0259
        L_0x018b:
            fw.k$a r0 = (p501fw.C17113k.C17114a) r0
            java.util.List<com.moovit.app.subscription.model.SubscriptionDetails> r4 = r0.f44290h
            int r6 = r0.f44293k
            java.lang.Object r4 = r4.get(r6)
            com.moovit.app.subscription.model.SubscriptionDetails r4 = (com.moovit.app.subscription.model.SubscriptionDetails) r4
            com.moovit.app.subscription.model.SubscriptionDetails r0 = r0.f44292j
            boolean r0 = r0.equals(r4)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            zz.i0 r6 = new zz.i0
            r6.<init>(r4, r0)
            hq.b$a r7 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r8 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r7.<init>(r8)
            com.moovit.analytics.AnalyticsAttributeKey r8 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r9 = "subscribe_button_click"
            r7.mo49939g(r8, r9)
            com.moovit.analytics.AnalyticsAttributeKey r8 = com.moovit.analytics.AnalyticsAttributeKey.POPULAR
            r7.mo49938f(r8, r0)
            com.moovit.analytics.AnalyticsAttributeKey r0 = com.moovit.analytics.AnalyticsAttributeKey.ID
            r8 = r4
            com.moovit.app.subscription.model.SubscriptionDetails r8 = (com.moovit.app.subscription.model.SubscriptionDetails) r8
            java.lang.String r8 = r4.f39788b
            r7.mo49939g(r0, r8)
            hq.b r0 = r7.mo49933a()
            r12.mo46797j2(r0)
            r0 = r4
            com.moovit.app.subscription.model.SubscriptionDetails r0 = (com.moovit.app.subscription.model.SubscriptionDetails) r0
            com.moovit.app.subscription.model.SubscriptionPeriod r0 = r4.f39792f
            z20.a$a r4 = new z20.a$a
            java.lang.String r7 = "subscription_purchase_tap"
            r4.<init>(r7)
            java.lang.String r0 = r0.f39796b
            r0.getClass()
            int r7 = r0.hashCode()
            r8 = 5
            r9 = 3
            r10 = 2
            switch(r7) {
                case 78476: goto L_0x021d;
                case 78486: goto L_0x0212;
                case 78488: goto L_0x0207;
                case 78538: goto L_0x01fc;
                case 78579: goto L_0x01f1;
                case 78631: goto L_0x01e6;
                default: goto L_0x01e5;
            }
        L_0x01e5:
            goto L_0x0225
        L_0x01e6:
            java.lang.String r3 = "P6M"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x01ef
            goto L_0x0225
        L_0x01ef:
            r3 = 5
            goto L_0x0226
        L_0x01f1:
            java.lang.String r3 = "P4W"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x01fa
            goto L_0x0225
        L_0x01fa:
            r3 = 4
            goto L_0x0226
        L_0x01fc:
            java.lang.String r3 = "P3M"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0205
            goto L_0x0225
        L_0x0205:
            r3 = 3
            goto L_0x0226
        L_0x0207:
            java.lang.String r3 = "P1Y"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0210
            goto L_0x0225
        L_0x0210:
            r3 = 2
            goto L_0x0226
        L_0x0212:
            java.lang.String r3 = "P1W"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x021b
            goto L_0x0225
        L_0x021b:
            r3 = 1
            goto L_0x0226
        L_0x021d:
            java.lang.String r7 = "P1M"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x0226
        L_0x0225:
            r3 = -1
        L_0x0226:
            if (r3 == 0) goto L_0x0244
            if (r3 == r5) goto L_0x0240
            if (r3 == r10) goto L_0x023d
            if (r3 == r9) goto L_0x023a
            if (r3 == r2) goto L_0x0236
            if (r3 == r8) goto L_0x0233
            goto L_0x0246
        L_0x0233:
            java.lang.String r1 = "monthly-6"
            goto L_0x0246
        L_0x0236:
            java.lang.String r1 = "weekly-4"
            goto L_0x0246
        L_0x023a:
            java.lang.String r1 = "monthly-3"
            goto L_0x0246
        L_0x023d:
            java.lang.String r1 = "annual-1"
            goto L_0x0246
        L_0x0240:
            java.lang.String r1 = "weekly-1"
            goto L_0x0246
        L_0x0244:
            java.lang.String r1 = "monthly-1"
        L_0x0246:
            java.lang.String r0 = "plan_type"
            r4.mo52934b(r1, r0)
            r4.mo52935c()
            java.lang.Class<com.moovit.app.subscription.SubscriptionsActivity> r0 = com.moovit.app.subscription.SubscriptionsActivity.class
            b0.m r1 = new b0.m
            r2 = 6
            r1.<init>(r6, r2)
            r12.mo46786U1(r0, r1)
        L_0x0259:
            return
        L_0x025a:
            java.lang.Object r12 = r11.f21765c
            rv.j r12 = (p782rv.C19351j) r12
            int r0 = p782rv.C19351j.f49235u
            r12.mo51760r2()
            return
        L_0x0264:
            java.lang.Object r0 = r11.f21765c
            su.f$a r0 = (p805su.C19544f.C19545a) r0
            r0.getClass()
            java.lang.Object r12 = r12.getTag()
            ja0.f r12 = (ja0.C12797f) r12
            if (r12 == 0) goto L_0x0281
            int r1 = r12.getAdapterPosition()
            if (r1 != r4) goto L_0x027a
            goto L_0x0281
        L_0x027a:
            int r12 = r12.getAdapterPosition()
            r0.mo51904j(r12, r5)
        L_0x0281:
            return
        L_0x0282:
            java.lang.Object r12 = r11.f21765c
            qu.i r12 = (p757qu.C19188i) r12
            qu.i$c r0 = r12.f48791p
            T r0 = r0.f47543g
            qu.i$b r0 = (p757qu.C19188i.C19190b) r0
            int r2 = r0.f48795i
            if (r2 != r4) goto L_0x0291
            goto L_0x0298
        L_0x0291:
            java.lang.Object r0 = r0.mo39636j(r2)
            r1 = r0
            com.moovit.transit.TransitStop r1 = (com.moovit.transit.TransitStop) r1
        L_0x0298:
            if (r1 != 0) goto L_0x029b
            goto L_0x02e7
        L_0x029b:
            hq.b$a r0 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r2 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r0.<init>(r2)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r3 = "mot_out_of_radius_stations_continue_clicked"
            r0.mo49939g(r2, r3)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.STOP_ID
            com.moovit.network.model.ServerId r3 = r1.f23730b
            r0.mo49937e(r2, r3)
            hq.b r0 = r0.mo49933a()
            r12.mo46797j2(r0)
            A r12 = r12.f40822c
            com.moovit.app.mot.purchase.MotStationExitActivationActivity r12 = (com.moovit.app.mot.purchase.MotStationExitActivationActivity) r12
            androidx.fragment.app.FragmentManager r12 = r12.getSupportFragmentManager()
            androidx.fragment.app.a r12 = p001a0.C0017h.m54K(r12, r12)
            r0 = 2131363000(0x7f0a04b8, float:1.8345796E38)
            com.moovit.commons.geo.LatLonE6 r1 = r1.f23732d
            int r2 = p757qu.C19185h.f48779u
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "manualLocation"
            r2.putParcelable(r3, r1)
            qu.h r1 = new qu.h
            r1.<init>()
            r1.setArguments(r2)
            java.lang.String r2 = "manual_exit"
            r12.mo4111f(r0, r1, r2)
            r12.mo4110c(r2)
            r12.mo4040d()
        L_0x02e7:
            return
        L_0x02e8:
            java.lang.Object r12 = r11.f21765c
            qu.c r12 = (p757qu.C19180c) r12
            int r0 = p757qu.C19180c.f48766i
            r12.getClass()
            hq.b$a r0 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r0.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r2 = "mot_exit_station_explanation_cancel_clicked"
            r0.mo49939g(r1, r2)
            hq.b r0 = r0.mo49933a()
            r12.mo22564R1(r0)
            r12.dismissAllowingStateLoss()
            return
        L_0x030a:
            java.lang.Object r0 = r11.f21765c
            mu.m$a r0 = (p664mu.C18457m.C18458a) r0
            r0.getClass()
            java.lang.Object r12 = r12.getTag()
            ja0.f r12 = (ja0.C12797f) r12
            int r12 = r12.getAdapterPosition()
            if (r12 != r4) goto L_0x031e
            goto L_0x0369
        L_0x031e:
            java.util.List<com.moovit.transit.TransitType> r1 = r0.f47046g
            java.lang.Object r12 = r1.get(r12)
            com.moovit.transit.TransitType r12 = (com.moovit.transit.TransitType) r12
            mu.m r0 = p664mu.C18457m.this
            int r1 = p664mu.C18457m.f47044i
            r0.getClass()
            hq.b$a r1 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r2 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r1.<init>(r2)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r4 = "mot_transit_type_clicked"
            r1.mo49939g(r2, r4)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.ID
            com.moovit.network.model.ServerId r4 = r12.f23757b
            r1.mo49937e(r2, r4)
            hq.b r1 = r1.mo49933a()
            r0.mo22564R1(r1)
            A r1 = r0.f40792c
            com.moovit.transit.TransitType$VehicleType r12 = r12.f23760e
            mu.f r2 = p664mu.C18443f.m45298d()
            com.google.android.gms.tasks.Task r2 = r2.mo50888b()
            mu.n r4 = new mu.n
            r4.<init>(r3, r1, r12)
            com.google.android.gms.tasks.Task r2 = r2.addOnSuccessListener((android.app.Activity) r1, r4)
            mu.o r3 = new mu.o
            r3.<init>(r1, r12)
            r2.addOnFailureListener((android.app.Activity) r1, (com.google.android.gms.tasks.OnFailureListener) r3)
            r0.dismissAllowingStateLoss()
        L_0x0369:
            return
        L_0x036a:
            java.lang.Object r0 = r11.f21765c
            com.moovit.app.linedetail.ui.LineDetailMapFragment r0 = (com.moovit.app.linedetail.p416ui.LineDetailMapFragment) r0
            int r1 = com.moovit.app.linedetail.p416ui.LineDetailMapFragment.f38746Y0
            r0.getClass()
            java.lang.Object r12 = r12.getTag()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            r12 = r12 ^ r5
            hq.b$a r1 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r2 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r1.<init>(r2)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r3 = "zoom_out_in_clicked"
            r1.mo49939g(r2, r3)
            hq.b r1 = r1.mo49933a()
            r0.mo46797j2(r1)
            if (r12 == 0) goto L_0x039e
            com.moovit.commons.geo.BoxE6 r12 = r0.f38754Q0
            if (r12 == 0) goto L_0x03a5
            r0.mo45431w3(r12)
            goto L_0x03a5
        L_0x039e:
            com.moovit.transit.TransitStop r12 = r0.f38755R0
            if (r12 == 0) goto L_0x03a5
            r0.mo45432x3(r12)
        L_0x03a5:
            return
        L_0x03a6:
            java.lang.Object r12 = r11.f21765c
            com.moovit.app.linedetail.ui.LineDetailActivity r12 = (com.moovit.app.linedetail.p416ui.LineDetailActivity) r12
            int r0 = com.moovit.app.linedetail.p416ui.LineDetailActivity.f38727y0
            r12.getClass()
            hq.b$a r0 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r2 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r0.<init>(r2)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r4 = "new_routes_snackbar_clicked"
            r0.mo49939g(r2, r4)
            hq.b r0 = r0.mo49933a()
            r12.mo44545v2(r0)
            android.app.TaskStackBuilder r0 = android.app.TaskStackBuilder.create(r12)
            com.moovit.app.home.tab.HomeTab r2 = com.moovit.app.home.tab.HomeTab.DASHBOARD
            android.content.Intent r2 = com.moovit.app.home.HomeActivity.m37644y2(r12, r1, r2, r3)
            android.app.TaskStackBuilder r0 = r0.addNextIntent(r2)
            android.content.Intent r12 = com.moovit.app.suggestedroutes.SuggestRoutesActivity.m39325M2(r12, r1, r3)
            android.app.TaskStackBuilder r12 = r0.addNextIntent(r12)
            r12.startActivities()
            return
        L_0x03de:
            java.lang.Object r0 = r11.f21765c
            xt.e r0 = (p924xt.C20590e) r0
            java.util.HashSet r1 = p924xt.C20590e.f52076l
            r0.getClass()
            r1 = 2131364674(0x7f0a0b42, float:1.8349192E38)
            java.lang.Object r1 = r12.getTag(r1)
            xt.g r1 = (p924xt.C20596g) r1
            r2 = 2131364675(0x7f0a0b43, float:1.8349194E38)
            java.lang.Object r2 = r12.getTag(r2)
            xt.f r2 = (p924xt.C20595f) r2
            r3 = 2131364676(0x7f0a0b44, float:1.8349196E38)
            java.lang.Object r12 = r12.getTag(r3)
            xt.d r12 = (p924xt.C20589d) r12
            if (r1 == 0) goto L_0x0427
            if (r2 == 0) goto L_0x0427
            xt.y r3 = r2.f52088b
            if (r3 == 0) goto L_0x040e
            r0.mo52795D(r1)
            goto L_0x0427
        L_0x040e:
            com.moovit.itinerary.TripPlanTodBanner r1 = r2.f52090d
            if (r1 == 0) goto L_0x0416
            r0.mo52796E(r1)
            goto L_0x0427
        L_0x0416:
            com.moovit.itinerary.TripPlanFlexTimeBanner r1 = r2.f52091e
            if (r1 == 0) goto L_0x041e
            r0.mo52793B(r1)
            goto L_0x0427
        L_0x041e:
            if (r12 == 0) goto L_0x0427
            com.moovit.itinerary.model.Itinerary r1 = r2.f52087a
            if (r1 == 0) goto L_0x0427
            r0.mo52794C(r12, r1)
        L_0x0427:
            return
        L_0x0428:
            java.lang.Object r12 = r11.f21765c
            com.moovit.app.itinerary.ItineraryActivity r12 = (com.moovit.app.itinerary.ItineraryActivity) r12
            int r0 = com.moovit.app.itinerary.ItineraryActivity.f38474B0
            java.lang.String r0 = "return_trip_reminder_header_clicked"
            r12.mo45268C2(r0)
            return
        L_0x0434:
            java.lang.Object r0 = r11.f21765c
            st.b r0 = (p804st.C19526b) r0
            int r1 = p804st.C19526b.f49630n
            r0.getClass()
            java.lang.Object r12 = r12.getTag()
            java.lang.String r12 = (java.lang.String) r12
            if (r12 != 0) goto L_0x0446
            goto L_0x0462
        L_0x0446:
            A r0 = r0.f40822c
            com.moovit.app.intro.login.FirstTimeLoginActivity r0 = (com.moovit.app.intro.login.FirstTimeLoginActivity) r0
            if (r0 == 0) goto L_0x0462
            com.moovit.location.a r1 = com.moovit.location.C16202a.get(r0)
            boolean r3 = r1.hasLocationPermissions()
            if (r3 == 0) goto L_0x045a
            r0.mo45255B2(r12)
            goto L_0x0462
        L_0x045a:
            c0.d r3 = new c0.d
            r3.<init>(r2, r0, r12)
            r1.requestLocationPermissions((com.moovit.MoovitActivity) r0, (com.moovit.location.C16202a.C16205c<com.moovit.MoovitActivity>) r3)
        L_0x0462:
            return
        L_0x0463:
            java.lang.Object r12 = r11.f21765c
            com.moovit.app.intro.UserCreationFailureActivity r12 = (com.moovit.app.intro.UserCreationFailureActivity) r12
            int r0 = com.moovit.app.intro.UserCreationFailureActivity.f38450X
            r12.getClass()
            int r0 = com.moovit.app.metro.selection.SelectMetroActivity.f38970p0
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.moovit.app.metro.selection.SelectMetroActivity> r1 = com.moovit.app.metro.selection.SelectMetroActivity.class
            r0.<init>(r12, r1)
            r1 = 1042(0x412, float:1.46E-42)
            r12.startActivityForResult(r0, r1)
            r12.mo45251A2()
            return
        L_0x047e:
            java.lang.Object r12 = r11.f21765c
            nt.b r12 = (p687nt.C18589b) r12
            int r0 = p687nt.C18589b.f47322n
            r12.getClass()
            hq.b r0 = new hq.b
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.SET_AS_ORIGIN_CLICKED
            r0.<init>(r1)
            r12.mo22564R1(r0)
            com.moovit.design.view.list.ImageOrTextSubtitleListItemView r0 = r12.f47324i
            java.lang.Object r0 = r0.getTag()
            com.moovit.transit.LocationDescriptor r0 = (com.moovit.transit.LocationDescriptor) r0
            java.lang.Class<nt.b$a> r1 = p687nt.C18589b.C18590a.class
            d0.k0 r2 = new d0.k0
            r3 = 7
            r2.<init>(r0, r3)
            r12.mo46753L1(r1, r2)
            r12.dismissAllowingStateLoss()
            return
        L_0x04a8:
            java.lang.Object r0 = r11.f21765c
            com.moovit.app.home.dashboard.e r0 = (com.moovit.app.home.dashboard.C14936e) r0
            int r1 = com.moovit.app.home.dashboard.C14936e.f38205p
            r0.getClass()
            hq.b$a r1 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r2 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r1.<init>(r2)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r3 = "change_metro_clicked"
            r1.mo49939g(r2, r3)
            hq.b r1 = r1.mo49933a()
            r0.mo46797j2(r1)
            android.content.Context r12 = r12.getContext()
            int r1 = com.moovit.app.metro.selection.ChangeMetroActivity.f38958p0
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<com.moovit.app.metro.selection.ChangeMetroActivity> r2 = com.moovit.app.metro.selection.ChangeMetroActivity.class
            r1.<init>(r12, r2)
            r0.startActivity(r1)
            return
        L_0x04d7:
            java.lang.Object r0 = r11.f21765c
            xs.g r0 = (p923xs.C20573g) r0
            r0.getClass()
            java.lang.Object r12 = r12.getTag()
            ys.a r12 = (p946ys.C20760a) r12
            if (r12 != 0) goto L_0x04e7
            goto L_0x0538
        L_0x04e7:
            xs.g$b r0 = r0.f52047k
            if (r0 == 0) goto L_0x0538
            xs.i r0 = (p923xs.C20577i) r0
            hq.b$a r1 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r2 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r1.<init>(r2)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r3 = "help_center_article_clicked"
            r1.mo49939g(r2, r3)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.ID
            java.lang.Long r3 = r12.mo52895a()
            r1.mo49938f(r2, r3)
            hq.b r1 = r1.mo49933a()
            r0.mo46797j2(r1)
            A r1 = r0.f40822c
            com.moovit.app.help.helpcenter.HelpCenterActivity r1 = (com.moovit.app.help.helpcenter.HelpCenterActivity) r1
            java.lang.Long r12 = r12.mo52895a()
            long r2 = r12.longValue()
            java.lang.String r12 = r0.f52056r
            r1.getClass()
            android.content.UriMatcher r0 = p923xs.C20568d.f52024u
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r4 = "articleId"
            r0.putLong(r4, r2)
            java.lang.String r2 = "ownerSectionName"
            r0.putString(r2, r12)
            xs.d r12 = new xs.d
            r12.<init>()
            r12.setArguments(r0)
            r1.mo45063z2(r12, r5)
        L_0x0538:
            return
        L_0x0539:
            java.lang.Object r12 = r11.f21765c
            qs.g r12 = (p755qs.C19170g) r12
            int r0 = p755qs.C19170g.f48751j
            android.content.Context r0 = r12.requireContext()
            com.google.firebase.analytics.FirebaseAnalytics r2 = com.google.firebase.analytics.FirebaseAnalytics.getInstance(r0)
            java.lang.String r3 = "privacy_update_dialog_continue_click"
            r2.mo43247a(r1, r3)
            hq.b$a r1 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r2 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r1.<init>(r2)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r3 = "continue_clicked"
            r1.mo49939g(r2, r3)
            hq.b r1 = r1.mo49933a()
            r12.mo22564R1(r1)
            java.lang.String r1 = "PRIVACY_AGREED_BY_CTA_CLICK"
            r12.mo51599S1(r0, r1)
            return
        L_0x0567:
            java.lang.Object r12 = r11.f21765c
            com.moovit.app.general.settings.notifications.NotificationSettingsActivity r12 = (com.moovit.app.general.settings.notifications.NotificationSettingsActivity) r12
            int r0 = com.moovit.app.general.settings.notifications.NotificationSettingsActivity.f38057n0
            r12.getClass()
            hq.b$a r0 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r0.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r2 = "change_delivery_schedule_clicked"
            r0.mo49939g(r1, r2)
            hq.b r0 = r0.mo49933a()
            r12.mo44545v2(r0)
            ps.e r0 = r12.f38058U
            com.moovit.app.general.settings.notifications.UserDeliverySchedule r0 = r0.mo51489c()
            ps.c r1 = new ps.c
            r1.<init>()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "deliverScheduleExtra"
            r2.putSerializable(r3, r0)
            r1.setArguments(r2)
            androidx.fragment.app.FragmentManager r12 = r12.getSupportFragmentManager()
            java.lang.String r0 = "deliveryScheduleDialogTag"
            r1.show((androidx.fragment.app.FragmentManager) r12, (java.lang.String) r0)
            return
        L_0x05a7:
            java.lang.Object r0 = r11.f21765c
            com.moovit.app.general.SpreadTheLoveActivity r0 = (com.moovit.app.general.SpreadTheLoveActivity) r0
            com.moovit.app.general.SpreadTheLoveActivity.m37518y2(r0, r12)
            return
        L_0x05af:
            java.lang.Object r12 = r11.f21765c
            com.moovit.app.carpool.fastbooking.b r12 = (com.moovit.app.carpool.fastbooking.C14810b) r12
            int r0 = com.moovit.app.carpool.fastbooking.C14810b.f37770o
            r12.dismiss()
            return
        L_0x05b9:
            java.lang.Object r12 = r11.f21765c
            com.moovit.app.carpool.center.CarpoolCenterActivity r12 = (com.moovit.app.carpool.center.CarpoolCenterActivity) r12
            int r0 = com.moovit.app.carpool.center.CarpoolCenterActivity.f37683p0
            r12.mo44847B2()
            return
        L_0x05c3:
            java.lang.Object r12 = r11.f21765c
            zz.e r12 = (p977zz.C20935e) r12
            r12.invoke(r1)
            return
        L_0x05cb:
            java.lang.Object r12 = r11.f21765c
            com.google.android.exoplayer2.ui.StyledPlayerControlView$a r12 = (com.google.android.exoplayer2.p052ui.StyledPlayerControlView.C4009a) r12
            com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = com.google.android.exoplayer2.p052ui.StyledPlayerControlView.this
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector r0 = r0.f14297E0
            if (r0 == 0) goto L_0x0605
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r0 = r0.mo16302d()
            r0.getClass()
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$c r1 = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector$c
            r1.<init>((com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters) r0)
        L_0x05e1:
            java.util.List<java.lang.Integer> r0 = r12.f14385g
            int r0 = r0.size()
            if (r3 >= r0) goto L_0x05fb
            java.util.List<java.lang.Integer> r0 = r12.f14385g
            java.lang.Object r0 = r0.get(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1.mo16321b(r0)
            int r3 = r3 + 1
            goto L_0x05e1
        L_0x05fb:
            com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = com.google.android.exoplayer2.p052ui.StyledPlayerControlView.this
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector r0 = r0.f14297E0
            r0.getClass()
            r0.mo16303i(r1)
        L_0x0605:
            com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = com.google.android.exoplayer2.p052ui.StyledPlayerControlView.this
            com.google.android.exoplayer2.ui.StyledPlayerControlView$g r1 = r0.f14362z0
            android.content.res.Resources r0 = r0.getResources()
            int r2 = com.google.android.exoplayer2.p052ui.C4044m.exo_track_selection_auto
            java.lang.String r0 = r0.getString(r2)
            java.lang.String[] r1 = r1.f14374h
            r1[r5] = r0
            com.google.android.exoplayer2.ui.StyledPlayerControlView r12 = com.google.android.exoplayer2.p052ui.StyledPlayerControlView.this
            android.widget.PopupWindow r12 = r12.f14291B0
            r12.dismiss()
            return
        L_0x061f:
            java.lang.Object r0 = r11.f21765c
            com.appboy.ui.inappmessage.views.AppboyInAppMessageFullView r0 = (com.appboy.p044ui.inappmessage.views.AppboyInAppMessageFullView) r0
            r0.lambda$resetMessageMargins$0(r12)
            return
        L_0x0627:
            java.lang.Object r12 = r11.f21765c
            com.moovit.app.useraccount.profile.UserAvatarFragment r12 = (com.moovit.app.useraccount.profile.UserAvatarFragment) r12
            int r0 = com.moovit.app.useraccount.profile.UserAvatarFragment.f40636u
            r12.getClass()
            hq.b$a r0 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r0.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r2 = "moovit_points_clicked"
            r0.mo49939g(r1, r2)
            hq.b r0 = r0.mo49933a()
            r12.mo46797j2(r0)
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r12.requireContext()
            java.lang.Class<com.moovit.app.general.userprofile.levels.TrophiesActivity> r2 = com.moovit.app.general.userprofile.levels.TrophiesActivity.class
            r0.<init>(r1, r2)
            r12.startActivity(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p297w5.C6994a.onClick(android.view.View):void");
    }
}
