package p471eq;

import android.view.View;

/* renamed from: eq.a */
public final /* synthetic */ class C16850a implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f43845b;

    /* renamed from: c */
    public final /* synthetic */ Object f43846c;

    public /* synthetic */ C16850a(Object obj, int i) {
        this.f43845b = i;
        this.f43846c = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: com.moovit.commons.utils.Color} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: com.moovit.app.tod.shuttle.model.TodShuttleTrip} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v21, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v42 */
    /* JADX WARNING: type inference failed for: r2v43 */
    /* JADX WARNING: type inference failed for: r2v44 */
    /* JADX WARNING: type inference failed for: r2v45 */
    /* JADX WARNING: type inference failed for: r2v46 */
    /* JADX WARNING: type inference failed for: r2v47 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r13) {
        /*
            r12 = this;
            int r0 = r12.f43845b
            java.lang.String r1 = "rideId"
            r2 = 0
            r3 = -1
            r4 = 4
            r5 = 1
            r6 = 0
            r7 = 7
            r8 = 2
            r9 = 9
            switch(r0) {
                case 0: goto L_0x0525;
                case 1: goto L_0x04f3;
                case 2: goto L_0x04b3;
                case 3: goto L_0x049b;
                case 4: goto L_0x0441;
                case 5: goto L_0x042e;
                case 6: goto L_0x0426;
                case 7: goto L_0x041e;
                case 8: goto L_0x0416;
                case 9: goto L_0x03ed;
                case 10: goto L_0x03b4;
                case 11: goto L_0x03aa;
                case 12: goto L_0x0396;
                case 13: goto L_0x038a;
                case 14: goto L_0x0380;
                case 15: goto L_0x0357;
                case 16: goto L_0x034b;
                case 17: goto L_0x02ef;
                case 18: goto L_0x02db;
                case 19: goto L_0x0283;
                case 20: goto L_0x025f;
                case 21: goto L_0x020b;
                case 22: goto L_0x0179;
                case 23: goto L_0x011d;
                case 24: goto L_0x0108;
                case 25: goto L_0x00c4;
                case 26: goto L_0x0065;
                case 27: goto L_0x0034;
                case 28: goto L_0x0012;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x052d
        L_0x0012:
            java.lang.Object r13 = r12.f43846c
            com.moovit.app.wondo.consent.WondoConsentActivity r13 = (com.moovit.app.wondo.consent.WondoConsentActivity) r13
            int r0 = com.moovit.app.wondo.consent.WondoConsentActivity.f40676U
            r13.getClass()
            hq.b$a r0 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r0.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r2 = "skip_clicked"
            r0.mo49939g(r1, r2)
            hq.b r0 = r0.mo49933a()
            r13.mo44545v2(r0)
            r13.mo46672y2(r6)
            return
        L_0x0034:
            java.lang.Object r13 = r12.f43846c
            com.moovit.app.useraccount.profile.UserAvatarFragment r13 = (com.moovit.app.useraccount.profile.UserAvatarFragment) r13
            int r0 = com.moovit.app.useraccount.profile.UserAvatarFragment.f40636u
            r13.getClass()
            hq.b$a r0 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r0.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r2 = "avatar_clicked"
            r0.mo49939g(r1, r2)
            hq.b r0 = r0.mo49933a()
            r13.mo46797j2(r0)
            android.content.Context r0 = r13.requireContext()
            int r1 = com.moovit.app.general.userprofile.avatars.AvatarsActivity.f38098X
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<com.moovit.app.general.userprofile.avatars.AvatarsActivity> r2 = com.moovit.app.general.userprofile.avatars.AvatarsActivity.class
            r1.<init>(r0, r2)
            r0 = 2547(0x9f3, float:3.569E-42)
            r13.startActivityForResult(r1, r0)
            return
        L_0x0065:
            java.lang.Object r13 = r12.f43846c
            lx.i r13 = (p644lx.C18294i) r13
            androidx.recyclerview.widget.RecyclerView r0 = r13.f46650s
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
            boolean r1 = r0 instanceof p644lx.C18294i.C18295a
            if (r1 != 0) goto L_0x0074
            goto L_0x00c3
        L_0x0074:
            lx.i$a r0 = (p644lx.C18294i.C18295a) r0
            int r1 = r0.f46655i
            if (r1 == r3) goto L_0x0083
            java.util.List<com.moovit.app.tod.shuttle.model.TodShuttleTrip> r0 = r0.f46654h
            java.lang.Object r0 = r0.get(r1)
            r2 = r0
            com.moovit.app.tod.shuttle.model.TodShuttleTrip r2 = (com.moovit.app.tod.shuttle.model.TodShuttleTrip) r2
        L_0x0083:
            if (r2 != 0) goto L_0x0086
            goto L_0x00c3
        L_0x0086:
            com.moovit.app.tod.shuttle.booking.TodShuttleBookingState r0 = r13.mo50675n2()
            com.moovit.app.tod.shuttle.model.TodZone r1 = r13.f46649r
            java.util.List<com.moovit.app.tod.shuttle.model.TodZoneDaySchedule> r1 = r1.f40449d
            com.moovit.design.view.TextPicker r4 = r13.f46651t
            int r4 = r4.getDisplayedTextIndex()
            java.lang.Object r1 = r1.get(r4)
            com.moovit.app.tod.shuttle.model.TodZoneDaySchedule r1 = (com.moovit.app.tod.shuttle.model.TodZoneDaySchedule) r1
            long r4 = r1.f40451b
            r0.f40400c = r4
            r0.f40401d = r2
            r0.f40402e = r3
            r0.f40403f = r3
            hq.b$a r0 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r0.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r3 = "continue_clicked"
            r0.mo49939g(r1, r3)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TRIP_ID
            java.lang.String r2 = r2.f40431b
            r0.mo49939g(r1, r2)
            hq.b r0 = r0.mo49933a()
            r13.mo46797j2(r0)
            r13.mo50678q2()
        L_0x00c3:
            return
        L_0x00c4:
            java.lang.Object r13 = r12.f43846c
            com.moovit.app.tod.center.rides.TodRideDetailsActivity r13 = (com.moovit.app.tod.center.rides.TodRideDetailsActivity) r13
            int r0 = com.moovit.app.tod.center.rides.TodRideDetailsActivity.f40215X
            r13.getClass()
            hq.b$a r0 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r2 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r0.<init>(r2)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r3 = "rating_promotion_clicked"
            r0.mo49939g(r2, r3)
            hq.b r0 = r0.mo49933a()
            r13.mo44545v2(r0)
            androidx.fragment.app.FragmentManager r0 = r13.getSupportFragmentManager()
            java.lang.String r2 = com.moovit.app.tod.TodRideRatingDialogFragment.f40018q
            androidx.fragment.app.Fragment r3 = r0.mo3923A(r2)
            if (r3 == 0) goto L_0x00ef
            goto L_0x0107
        L_0x00ef:
            java.lang.String r13 = r13.f40216U
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            ce0.C21100e.m49373x(r13, r1)
            r3.putString(r1, r13)
            com.moovit.app.tod.TodRideRatingDialogFragment r13 = new com.moovit.app.tod.TodRideRatingDialogFragment
            r13.<init>()
            r13.setArguments(r3)
            r13.show((androidx.fragment.app.FragmentManager) r0, (java.lang.String) r2)
        L_0x0107:
            return
        L_0x0108:
            java.lang.Object r0 = r12.f43846c
            com.moovit.app.tod.bottomsheet.stateviews.TodAutonomousRideWaitingAtPickupView r0 = (com.moovit.app.tod.bottomsheet.stateviews.TodAutonomousRideWaitingAtPickupView) r0
            int r1 = com.moovit.app.tod.bottomsheet.stateviews.TodAutonomousRideWaitingAtPickupView.f40162r
            r0.getClass()
            java.lang.Object r13 = r13.getTag()
            fx.b r13 = (p502fx.C17117b) r13
            if (r13 == 0) goto L_0x011c
            p379.C13555b.m33963b(r0, r13)
        L_0x011c:
            return
        L_0x011d:
            java.lang.Object r13 = r12.f43846c
            xw.n r13 = (p927xw.C20647n) r13
            java.lang.String r0 = p927xw.C20647n.f52214k
            java.util.List<android.view.View> r0 = r13.f52217j
            jq.b r1 = new jq.b
            r3 = 6
            r1.<init>(r3)
            java.lang.Object r0 = c00.C13723g.m34286g(r0, r1)
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x013a
            java.lang.Object r0 = r0.getTag()
            r2 = r0
            com.moovit.commons.utils.Color r2 = (com.moovit.commons.utils.Color) r2
        L_0x013a:
            hq.b$a r0 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r0.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r3 = "tod_color_bar_color_selected"
            r0.mo49939g(r1, r3)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TOD_COLOR_ARGB
            if (r2 == 0) goto L_0x014f
            int r3 = r2.f41007b
            goto L_0x0155
        L_0x014f:
            com.moovit.app.tod.model.TodRideVehicleColorBar r3 = r13.f52215h
            com.moovit.commons.utils.Color r3 = r3.f40314b
            int r3 = r3.f41007b
        L_0x0155:
            r0.mo49935c(r1, r3)
            hq.b r0 = r0.mo49933a()
            r13.mo22564R1(r0)
            com.moovit.app.tod.model.TodRideVehicleColorBar r0 = r13.f52215h
            com.moovit.commons.utils.Color r0 = r0.f40314b
            if (r2 == 0) goto L_0x0175
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0175
            java.lang.Class<bx.a> r0 = p400bx.C13705a.class
            d0.v r1 = new d0.v
            r1.<init>(r2, r9)
            r13.mo46753L1(r0, r1)
        L_0x0175:
            r13.dismissAllowingStateLoss()
            return
        L_0x0179:
            java.lang.Object r0 = r12.f43846c
            qw.a r0 = (p759qw.C19195a) r0
            int r1 = p759qw.C19195a.f48800j
            r0.getClass()
            java.lang.Object r13 = r13.getTag()
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            android.content.Context r1 = r0.getContext()
            if (r1 != 0) goto L_0x0194
            goto L_0x020a
        L_0x0194:
            com.moovit.app.surveys.view.abs.LocalSurveyType r2 = r0.mo51494V1()
            com.moovit.app.surveys.answer.SurveyQuestionAnswer r3 = new com.moovit.app.surveys.answer.SurveyQuestionAnswer
            com.moovit.network.model.ServerId r6 = r2.getNodeId()
            com.moovit.network.model.ServerId r2 = r2.getQuestionId()
            sz.r r7 = p595jw.C17948a.f46011a
            r7 = 3
            if (r13 == r5) goto L_0x01d5
            if (r13 == r8) goto L_0x01ce
            if (r13 == r7) goto L_0x01c8
            if (r13 == r4) goto L_0x01c2
            r4 = 5
            if (r13 != r4) goto L_0x01b6
            com.moovit.network.model.ServerId r8 = new com.moovit.network.model.ServerId
            r8.<init>(r4)
            goto L_0x01da
        L_0x01b6:
            com.moovit.commons.utils.ApplicationBugException r0 = new com.moovit.commons.utils.ApplicationBugException
            java.lang.String r1 = "Unknown rating, did you forget to implement a case for: "
            java.lang.String r13 = p379.C16759e.m42349e(r1, r13)
            r0.<init>((java.lang.String) r13)
            throw r0
        L_0x01c2:
            com.moovit.network.model.ServerId r8 = new com.moovit.network.model.ServerId
            r8.<init>(r4)
            goto L_0x01da
        L_0x01c8:
            com.moovit.network.model.ServerId r8 = new com.moovit.network.model.ServerId
            r8.<init>(r7)
            goto L_0x01da
        L_0x01ce:
            com.moovit.network.model.ServerId r4 = new com.moovit.network.model.ServerId
            r4.<init>(r8)
            r8 = r4
            goto L_0x01da
        L_0x01d5:
            com.moovit.network.model.ServerId r8 = new com.moovit.network.model.ServerId
            r8.<init>(r5)
        L_0x01da:
            java.lang.String r4 = java.lang.String.valueOf(r13)
            r3.<init>(r6, r2, r8, r4)
            kw.a r2 = new kw.a
            java.lang.String r4 = r0.f48802i
            com.moovit.app.surveys.answer.SurveyQuestionnaireAnswer r6 = new com.moovit.app.surveys.answer.SurveyQuestionnaireAnswer
            com.moovit.app.surveys.data.Survey$Id r8 = r0.f48801h
            long r9 = java.lang.System.currentTimeMillis()
            com.moovit.app.surveys.answer.SurveyEndReason r11 = com.moovit.app.surveys.answer.SurveyEndReason.FINISHED
            r6.<init>(r8, r9, r11)
            java.util.List r3 = java.util.Collections.singletonList(r3)
            r2.<init>(r4, r6, r3)
            com.moovit.app.surveys.SurveyManager r1 = com.moovit.app.surveys.SurveyManager.m39375d(r1)
            r1.mo45976g(r2)
            if (r13 > r7) goto L_0x0203
            goto L_0x0204
        L_0x0203:
            r5 = 0
        L_0x0204:
            r0.mo51614W1(r5)
            r0.dismiss()
        L_0x020a:
            return
        L_0x020b:
            java.lang.Object r0 = r12.f43846c
            com.moovit.app.stopdetail.f r0 = (com.moovit.app.stopdetail.C15356f) r0
            java.lang.String r1 = com.moovit.app.stopdetail.C15356f.f39753h
            r0.getClass()
            java.lang.Object r13 = r13.getTag()
            java.lang.Integer r13 = (java.lang.Integer) r13
            if (r13 == 0) goto L_0x025e
            int r13 = r13.intValue()
            android.os.Bundle r1 = r0.mo46752K1()
            java.lang.String r3 = "stop_id"
            android.os.Parcelable r1 = r1.getParcelable(r3)
            com.moovit.network.model.ServerId r1 = (com.moovit.network.model.ServerId) r1
            if (r1 != 0) goto L_0x022f
            goto L_0x025e
        L_0x022f:
            r3 = 2131362570(0x7f0a030a, float:1.8344924E38)
            if (r13 != r3) goto L_0x0237
            com.moovit.util.time.CongestionLevel r2 = com.moovit.util.time.CongestionLevel.EMPTY
            goto L_0x024e
        L_0x0237:
            r3 = 2131362572(0x7f0a030c, float:1.8344928E38)
            if (r13 != r3) goto L_0x023f
            com.moovit.util.time.CongestionLevel r2 = com.moovit.util.time.CongestionLevel.LOW
            goto L_0x024e
        L_0x023f:
            r3 = 2131362571(0x7f0a030b, float:1.8344926E38)
            if (r13 != r3) goto L_0x0247
            com.moovit.util.time.CongestionLevel r2 = com.moovit.util.time.CongestionLevel.HIGH
            goto L_0x024e
        L_0x0247:
            r3 = 2131362573(0x7f0a030d, float:1.834493E38)
            if (r13 != r3) goto L_0x024e
            com.moovit.util.time.CongestionLevel r2 = com.moovit.util.time.CongestionLevel.PACKED
        L_0x024e:
            if (r2 != 0) goto L_0x0251
            goto L_0x025e
        L_0x0251:
            java.lang.Class<com.moovit.app.stopdetail.f$a> r13 = com.moovit.app.stopdetail.C15356f.C15357a.class
            d0.c0 r3 = new d0.c0
            r3.<init>(r4, r1, r2)
            r0.mo46753L1(r13, r3)
            r0.dismissAllowingStateLoss()
        L_0x025e:
            return
        L_0x025f:
            java.lang.Object r13 = r12.f43846c
            com.moovit.app.stoparrivals.StopArrivalsActivity r13 = (com.moovit.app.stoparrivals.StopArrivalsActivity) r13
            int r0 = com.moovit.app.stoparrivals.StopArrivalsActivity.f39603q0
            java.lang.String r0 = "this$0"
            mf0.C24362h.m61211f(r13, r0)
            hq.b$a r0 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r0.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r2 = "close_clicked"
            r0.mo49939g(r1, r2)
            hq.b r0 = r0.mo49933a()
            r13.mo44545v2(r0)
            r13.finish()
            return
        L_0x0283:
            java.lang.Object r13 = r12.f43846c
            rv.q r13 = (p782rv.C19366q) r13
            int r0 = p782rv.C19366q.f49273u
            r13.getClass()
            hq.b$a r0 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r0.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r3 = "settings_continue_clicked"
            r0.mo49939g(r1, r3)
            hq.b r0 = r0.mo49933a()
            r13.mo46797j2(r0)
            com.google.android.material.button.MaterialButtonToggleGroup r0 = r13.f49276p
            int r0 = r0.getCheckedButtonId()
            r1 = 2131363337(0x7f0a0609, float:1.834648E38)
            if (r0 != r1) goto L_0x02ae
            r0 = 1
            goto L_0x02af
        L_0x02ae:
            r0 = 0
        L_0x02af:
            com.google.android.material.button.MaterialButtonToggleGroup r1 = r13.f49278r
            int r1 = r1.getCheckedButtonId()
            r3 = 2131363332(0x7f0a0604, float:1.834647E38)
            if (r1 != r3) goto L_0x02bc
            r1 = 1
            goto L_0x02bd
        L_0x02bc:
            r1 = 0
        L_0x02bd:
            py.b r3 = new py.b
            A r4 = r13.f40822c
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r3.<init>(r4, r2, r0, r1)
            A r0 = r13.f40822c
            iq.b r0 = p567iq.C17635b.m43779f(r0)
            com.google.android.play.core.assetpacks.z0 r0 = r0.f50172b
            r0.mo42913b(r3, r5)
            r13.mo51745p2(r6)
            return
        L_0x02db:
            java.lang.Object r13 = r12.f43846c
            com.moovit.app.ridesharing.registration.RideSharingProfileActivity r13 = (com.moovit.app.ridesharing.registration.RideSharingProfileActivity) r13
            int r0 = com.moovit.app.ridesharing.registration.RideSharingProfileActivity.f39360Y
            r13.getClass()
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.moovit.app.ridesharing.registration.RideSharingProfileUpdateActivity> r1 = com.moovit.app.ridesharing.registration.RideSharingProfileUpdateActivity.class
            r0.<init>(r13, r1)
            r13.startActivity(r0)
            return
        L_0x02ef:
            java.lang.Object r13 = r12.f43846c
            com.moovit.app.ridesharing.a r13 = (com.moovit.app.ridesharing.C15241a) r13
            com.moovit.ridesharing.model.EventRequest r0 = r13.f39314l
            com.moovit.ridesharing.model.EventRequest$Key r0 = r0.f42959i
            com.moovit.util.CurrencyAmount r1 = r13.f39317o
            android.widget.ProgressBar r3 = r13.f39315m
            r3.setVisibility(r6)
            android.view.View r3 = r13.f39316n
            r3.setVisibility(r4)
            b00.a r3 = r13.f39313k
            if (r3 == 0) goto L_0x030c
            r3.cancel(r5)
            r13.f39313k = r2
        L_0x030c:
            android.content.Context r2 = r13.getContext()
            c70.i r2 = c70.C13756i.m34349a(r2)
            pv.i r3 = new pv.i
            c70.e r4 = r2.mo40679b()
            r3.<init>(r4, r0, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<pv.i> r1 = p737pv.C19018i.class
            java.lang.String r4 = "#"
            p379.C13715c.m34249o(r1, r0, r4)
            com.moovit.ridesharing.model.EventRequest$Key r1 = r3.f48379w
            r0.append(r1)
            java.lang.String r1 = ","
            r0.append(r1)
            com.moovit.util.CurrencyAmount r1 = r3.f48380x
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.moovit.request.RequestOptions r1 = r2.mo40680c()
            r1.f42909f = r5
            com.moovit.app.ridesharing.a$b r4 = r13.f39311i
            b00.a r0 = r2.mo40684g(r0, r3, r1, r4)
            r13.f39313k = r0
            return
        L_0x034b:
            java.lang.Object r13 = r12.f43846c
            com.moovit.app.mot.qr.StationQrCodeCardView r13 = (com.moovit.app.mot.p417qr.StationQrCodeCardView) r13
            com.moovit.app.mot.qr.StationQrCodeCardView$b r13 = r13.f39084w
            if (r13 == 0) goto L_0x0356
            r13.mo45631j1()
        L_0x0356:
            return
        L_0x0357:
            java.lang.Object r0 = r12.f43846c
            com.moovit.app.lineschedule.LineScheduleActivity r0 = (com.moovit.app.lineschedule.LineScheduleActivity) r0
            int r1 = com.moovit.app.lineschedule.LineScheduleActivity.f38859w0
            java.lang.String r1 = "choose_stop_clicked"
            r0.mo44547w2(r1)
            hu.f r1 = r0.f38874v0
            if (r1 == 0) goto L_0x037f
            android.content.Context r13 = r13.getContext()
            hu.f r1 = r0.f38874v0
            java.util.List<com.moovit.transit.TransitStop> r2 = r1.f45054f
            com.moovit.network.model.ServerId r3 = r0.f38865m0
            com.moovit.transit.TransitLineGroup r1 = r1.f45049a
            com.moovit.app.itinerary.a r13 = com.moovit.app.itinerary.C15035a.m38061V1(r13, r2, r3, r1)
            androidx.fragment.app.FragmentManager r0 = r0.getSupportFragmentManager()
            java.lang.String r1 = "SELECTION_STATION_FRAGMENT"
            r13.show((androidx.fragment.app.FragmentManager) r0, (java.lang.String) r1)
        L_0x037f:
            return
        L_0x0380:
            java.lang.Object r13 = r12.f43846c
            com.moovit.app.itinerary.ItineraryStepsBaseActivity$d r13 = (com.moovit.app.itinerary.ItineraryStepsBaseActivity.C15030d) r13
            com.moovit.app.itinerary.ItineraryStepsBaseActivity r13 = com.moovit.app.itinerary.ItineraryStepsBaseActivity.this
            r13.mo45277C2()
            return
        L_0x038a:
            java.lang.Object r13 = r12.f43846c
            com.moovit.app.itinerary.ItineraryActivity r13 = (com.moovit.app.itinerary.ItineraryActivity) r13
            int r0 = com.moovit.app.itinerary.ItineraryActivity.f38474B0
            java.lang.String r0 = "return_trip_reminder_footer_clicked"
            r13.mo45268C2(r0)
            return
        L_0x0396:
            java.lang.Object r13 = r12.f43846c
            com.moovit.app.intro.onboarding.OnboardingFragment r13 = (com.moovit.app.intro.onboarding.OnboardingFragment) r13
            int r0 = com.moovit.app.intro.onboarding.OnboardingFragment.f38460s
            r13.getClass()
            java.lang.Class<com.moovit.app.intro.onboarding.OnboardingFragment$b> r0 = com.moovit.app.intro.onboarding.OnboardingFragment.C15023b.class
            br.f r1 = new br.f
            r1.<init>(r7)
            r13.mo46786U1(r0, r1)
            return
        L_0x03aa:
            java.lang.Object r13 = r12.f43846c
            st.e r13 = (p804st.C19530e) r13
            int r0 = p804st.C19530e.f49634v
            r13.mo51891n2()
            return
        L_0x03b4:
            java.lang.Object r0 = r12.f43846c
            nt.l r0 = (p687nt.C18604l) r0
            int r1 = p687nt.C18604l.f47374T
            r0.getClass()
            hq.b$a r1 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r3 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r1.<init>(r3)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r4 = "location_search_clicked"
            r1.mo49939g(r3, r4)
            hq.b r1 = r1.mo49933a()
            r0.mo46797j2(r1)
            android.content.Context r13 = r13.getContext()
            com.moovit.app.search.AppSearchLocationCallback r1 = new com.moovit.app.search.AppSearchLocationCallback
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 1
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.String r3 = "nearby"
            android.content.Intent r13 = com.moovit.search.SearchLocationActivity.m17347y2(r13, r1, r3, r2)
            r1 = 4333(0x10ed, float:6.072E-42)
            r0.startActivityForResult(r13, r1)
            return
        L_0x03ed:
            java.lang.Object r13 = r12.f43846c
            nt.b r13 = (p687nt.C18589b) r13
            int r0 = p687nt.C18589b.f47322n
            r13.getClass()
            hq.b r0 = new hq.b
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.SET_AS_DESTINATION_CLICKED
            r0.<init>(r1)
            r13.mo22564R1(r0)
            com.moovit.design.view.list.ImageOrTextSubtitleListItemView r0 = r13.f47324i
            java.lang.Object r0 = r0.getTag()
            com.moovit.transit.LocationDescriptor r0 = (com.moovit.transit.LocationDescriptor) r0
            java.lang.Class<nt.b$a> r1 = p687nt.C18589b.C18590a.class
            x.l0 r2 = new x.l0
            r2.<init>(r0, r7)
            r13.mo46753L1(r1, r2)
            r13.dismissAllowingStateLoss()
            return
        L_0x0416:
            java.lang.Object r13 = r12.f43846c
            com.moovit.app.home.dashboard.FavoriteLocationEditorActivity r13 = (com.moovit.app.home.dashboard.FavoriteLocationEditorActivity) r13
            com.moovit.app.home.dashboard.FavoriteLocationEditorActivity.m37666y2(r13)
            return
        L_0x041e:
            java.lang.Object r0 = r12.f43846c
            com.moovit.app.home.dashboard.e r0 = (com.moovit.app.home.dashboard.C14936e) r0
            com.moovit.app.home.dashboard.C14936e.m37727p2(r0, r13)
            return
        L_0x0426:
            java.lang.Object r0 = r12.f43846c
            com.moovit.app.general.SpreadTheLoveActivity r0 = (com.moovit.app.general.SpreadTheLoveActivity) r0
            com.moovit.app.general.SpreadTheLoveActivity.m37518y2(r0, r13)
            return
        L_0x042e:
            java.lang.Object r13 = r12.f43846c
            com.moovit.app.gcm.popup.rate.b r13 = (com.moovit.app.gcm.popup.rate.C14885b) r13
            com.moovit.app.gcm.popup.rate.RateUsCompletePresentationType r0 = r13.f38036h
            java.lang.Runnable r0 = r0.getAction(r13)
            if (r0 == 0) goto L_0x043d
            r0.run()
        L_0x043d:
            r13.dismiss()
            return
        L_0x0441:
            java.lang.Object r13 = r12.f43846c
            rr.a r13 = (p778rr.C19316a) r13
            android.widget.EditText r0 = r13.f49160h
            android.text.Editable r0 = r0.getText()
            boolean r2 = p977zz.C20964s0.m49090h(r0)
            if (r2 == 0) goto L_0x0452
            goto L_0x048f
        L_0x0452:
            android.os.Bundle r2 = r13.getArguments()
            android.os.Parcelable r1 = r2.getParcelable(r1)
            com.moovit.network.model.ServerId r1 = (com.moovit.network.model.ServerId) r1
            if (r1 == 0) goto L_0x0493
            rr.c r2 = new rr.c
            android.content.Context r3 = r13.getContext()
            java.lang.String r0 = r0.toString()
            r2.<init>(r3, r1, r0)
            android.widget.EditText r0 = r13.f49160h
            android.content.Context r0 = r0.getContext()
            iq.b r0 = p567iq.C17635b.m43779f(r0)
            com.google.android.play.core.assetpacks.z0 r0 = r0.f50172b
            r0.mo42913b(r2, r5)
            hq.b$a r0 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r0.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r2 = "carpool_booking_survey_clicked"
            r0.mo49939g(r1, r2)
            hq.b r0 = r0.mo49933a()
            r13.mo22564R1(r0)
        L_0x048f:
            r13.dismissAllowingStateLoss()
            return
        L_0x0493:
            com.moovit.commons.utils.ApplicationBugException r13 = new com.moovit.commons.utils.ApplicationBugException
            java.lang.String r0 = "Did you use CarpoolBookingSuggestionSurveyDialog.newInstance(...)?"
            r13.<init>((java.lang.String) r0)
            throw r13
        L_0x049b:
            java.lang.Object r13 = r12.f43846c
            com.moovit.app.carpool.center.CarpoolCenterActivity r13 = (com.moovit.app.carpool.center.CarpoolCenterActivity) r13
            int r0 = com.moovit.app.carpool.center.CarpoolCenterActivity.f37683p0
            java.lang.String r0 = "carpool_fastbook_ride_clicked"
            r13.mo44547w2(r0)
            int[] r0 = com.moovit.app.carpool.fastbooking.CarpoolBookRideRequestActivity.f37721F0
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.moovit.app.carpool.fastbooking.CarpoolBookRideRequestActivity> r1 = com.moovit.app.carpool.fastbooking.CarpoolBookRideRequestActivity.class
            r0.<init>(r13, r1)
            r13.startActivity(r0)
            return
        L_0x04b3:
            java.lang.Object r0 = r12.f43846c
            com.moovit.app.carpool.BaseCarpoolItinerariesActivity$a r0 = (com.moovit.app.carpool.BaseCarpoolItinerariesActivity.C14780a) r0
            r0.getClass()
            java.lang.Object r13 = r13.getTag()
            com.moovit.app.carpool.BaseCarpoolItinerariesActivity$b r13 = (com.moovit.app.carpool.BaseCarpoolItinerariesActivity.C14781b) r13
            int r1 = r13.getAdapterPosition()
            if (r1 != r3) goto L_0x04c7
            goto L_0x04f2
        L_0x04c7:
            com.moovit.app.carpool.BaseCarpoolItinerariesActivity r2 = com.moovit.app.carpool.BaseCarpoolItinerariesActivity.this
            java.util.ArrayList<com.moovit.itinerary.model.Itinerary> r2 = r2.f37614Z
            java.lang.Object r2 = r2.get(r1)
            com.moovit.itinerary.model.Itinerary r2 = (com.moovit.itinerary.model.Itinerary) r2
            int r13 = r13.getItemViewType()
            if (r13 == r8) goto L_0x04e5
            com.moovit.app.carpool.BaseCarpoolItinerariesActivity r13 = com.moovit.app.carpool.BaseCarpoolItinerariesActivity.this
            xt.p r0 = r13.f37611U
            com.moovit.itinerary.model.leg.Leg r0 = r0.mo52791j(r2)
            com.moovit.itinerary.model.leg.CarpoolLeg r0 = (com.moovit.itinerary.model.leg.CarpoolLeg) r0
            r13.mo44810A2(r2, r0, r1)
            goto L_0x04f2
        L_0x04e5:
            com.moovit.app.carpool.BaseCarpoolItinerariesActivity r13 = com.moovit.app.carpool.BaseCarpoolItinerariesActivity.this
            xt.b r0 = r13.f37612X
            com.moovit.itinerary.model.leg.Leg r0 = r0.mo52791j(r2)
            com.moovit.itinerary.model.leg.CarpoolLeg r0 = (com.moovit.itinerary.model.leg.CarpoolLeg) r0
            r13.mo44810A2(r2, r0, r1)
        L_0x04f2:
            return
        L_0x04f3:
            java.lang.Object r0 = r12.f43846c
            com.moovit.app.ads.y r0 = (com.moovit.app.ads.C14764y) r0
            int r1 = com.moovit.app.ads.C14764y.f37582n
            r0.getClass()
            hq.b$a r1 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r2 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r1.<init>(r2)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r3 = "subscriptions_promo_cell_dismiss_clicked"
            r1.mo49939g(r2, r3)
            hq.b r1 = r1.mo49933a()
            r0.mo46797j2(r1)
            com.moovit.app.tracking.TrackingCondition r1 = com.moovit.app.tracking.TrackingCondition.SUBSCRIPTIONS_PROMO
            android.content.Context r13 = r13.getContext()
            r1.mark(r13)
            java.lang.Class<com.moovit.app.ads.y$a> r13 = com.moovit.app.ads.C14764y.C14765a.class
            com.facebook.appevents.l r1 = new com.facebook.appevents.l
            r1.<init>(r9)
            r0.mo46786U1(r13, r1)
            return
        L_0x0525:
            java.lang.Object r13 = r12.f43846c
            eq.b r13 = (p471eq.C16851b) r13
            r13.mo49515j()
            return
        L_0x052d:
            java.lang.Object r13 = r12.f43846c
            com.moovit.app.wondo.tickets.rewards.WondoRewardDetailsActivity r13 = (com.moovit.app.wondo.tickets.rewards.WondoRewardDetailsActivity) r13
            int r0 = com.moovit.app.wondo.tickets.rewards.WondoRewardDetailsActivity.f40769Z
            java.lang.String r0 = r13.mo46738y2()
            if (r0 != 0) goto L_0x053a
            goto L_0x058d
        L_0x053a:
            hq.b$a r1 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r3 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r1.<init>(r3)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r4 = "wondo_reward_redeem_clicked"
            r1.mo49939g(r3, r4)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.SELECTED_ID
            r1.mo49939g(r3, r0)
            hq.b r1 = r1.mo49933a()
            r13.mo44545v2(r1)
            r13.mo44543u2(r2)
            vy.g r1 = new vy.g
            c70.e r2 = r13.mo44548x1()
            com.moovit.app.wondo.tickets.model.WondoReward r3 = r13.f40772Y
            com.moovit.network.model.ServerId r3 = r3.f40735b
            r1.<init>(r2, r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<vy.g> r2 = p881vy.C20253g.class
            java.lang.String r3 = "_"
            p379.C13715c.m34249o(r2, r0, r3)
            com.moovit.network.model.ServerId r2 = r1.f51358w
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r1.f51359x
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.moovit.request.RequestOptions r2 = new com.moovit.request.RequestOptions
            r2.<init>()
            r2.f42909f = r5
            com.moovit.app.wondo.tickets.rewards.WondoRewardDetailsActivity$a r3 = r13.f40770U
            r13.mo44527k2(r0, r1, r2, r3)
        L_0x058d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p471eq.C16850a.onClick(android.view.View):void");
    }
}
