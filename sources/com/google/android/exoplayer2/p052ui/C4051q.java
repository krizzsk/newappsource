package com.google.android.exoplayer2.p052ui;

import android.view.View;

/* renamed from: com.google.android.exoplayer2.ui.q */
public final /* synthetic */ class C4051q implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f14500b;

    /* renamed from: c */
    public final /* synthetic */ Object f14501c;

    public /* synthetic */ C4051q(Object obj, int i) {
        this.f14500b = i;
        this.f14501c = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v119, resolved type: com.moovit.ridesharing.model.EventBookingOption} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v117, types: [android.content.Intent] */
    /* JADX WARNING: type inference failed for: r3v133 */
    /* JADX WARNING: type inference failed for: r3v134 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0466  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0480  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r22) {
        /*
            r21 = this;
            r0 = r21
            int r1 = r0.f14500b
            java.lang.String r2 = "USER_CONTEXT"
            r3 = 0
            r4 = 0
            r5 = 1
            r6 = -1
            java.lang.String r7 = "user_context"
            r8 = 2
            switch(r1) {
                case 0: goto L_0x066d;
                case 1: goto L_0x0663;
                case 2: goto L_0x0659;
                case 3: goto L_0x061a;
                case 4: goto L_0x05d3;
                case 5: goto L_0x05a7;
                case 6: goto L_0x059d;
                case 7: goto L_0x0581;
                case 8: goto L_0x0541;
                case 9: goto L_0x03a2;
                case 10: goto L_0x0380;
                case 11: goto L_0x0376;
                case 12: goto L_0x0347;
                case 13: goto L_0x02f6;
                case 14: goto L_0x02cb;
                case 15: goto L_0x02a7;
                case 16: goto L_0x029d;
                case 17: goto L_0x0277;
                case 18: goto L_0x0232;
                case 19: goto L_0x01f4;
                case 20: goto L_0x01ce;
                case 21: goto L_0x019d;
                case 22: goto L_0x0155;
                case 23: goto L_0x013e;
                case 24: goto L_0x011c;
                case 25: goto L_0x007a;
                case 26: goto L_0x004b;
                case 27: goto L_0x0041;
                case 28: goto L_0x0015;
                default: goto L_0x0011;
            }
        L_0x0011:
            r2 = r22
            goto L_0x0675
        L_0x0015:
            java.lang.Object r1 = r0.f14501c
            com.moovit.app.search.locations.a r1 = (com.moovit.app.search.locations.C15284a) r1
            com.moovit.network.model.ServerId r2 = com.moovit.app.search.locations.C15284a.f39471U
            r1.getClass()
            hq.b$a r2 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r4 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r2.<init>(r4)
            com.moovit.analytics.AnalyticsAttributeKey r4 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r5 = "choose_map_footer_clicked"
            r2.mo49939g(r4, r5)
            hq.b r2 = r2.mo49933a()
            r1.mo46797j2(r2)
            android.content.Context r2 = r1.getContext()
            android.content.Intent r2 = com.moovit.location.mappicker.MapLocationPickerActivity.m41309A2(r2, r3)
            r3 = 1781(0x6f5, float:2.496E-42)
            r1.startActivityForResult(r2, r3)
            return
        L_0x0041:
            java.lang.Object r1 = r0.f14501c
            rv.n r1 = (p782rv.C19363n) r1
            int r2 = p782rv.C19363n.f49268p
            r1.mo51772r2()
            return
        L_0x004b:
            java.lang.Object r1 = r0.f14501c
            ov.h r1 = (p713ov.C18841h) r1
            androidx.recyclerview.widget.RecyclerView r2 = r1.f47973q
            if (r2 != 0) goto L_0x0054
            goto L_0x0063
        L_0x0054:
            androidx.recyclerview.widget.RecyclerView$Adapter r2 = r2.getAdapter()
            boolean r4 = r2 instanceof p713ov.C18841h.C18843b
            if (r4 != 0) goto L_0x005d
            goto L_0x0063
        L_0x005d:
            ov.h$b r2 = (p713ov.C18841h.C18843b) r2
            com.moovit.ridesharing.model.EventBookingOption r3 = r2.mo51330z()
        L_0x0063:
            com.moovit.app.ridesharing.booking.EventBookingCart r2 = r1.mo51315o2()
            boolean r4 = r1.mo51327s2()
            if (r4 == 0) goto L_0x0072
            com.moovit.app.ridesharing.booking.EventBookingTicket r2 = r2.f39346e
            r2.f39359d = r3
            goto L_0x0076
        L_0x0072:
            com.moovit.app.ridesharing.booking.EventBookingTicket r2 = r2.f39347f
            r2.f39359d = r3
        L_0x0076:
            r1.mo51317q2()
            return
        L_0x007a:
            java.lang.Object r1 = r0.f14501c
            com.moovit.app.ridesharing.EventDetailActivity r1 = (com.moovit.app.ridesharing.EventDetailActivity) r1
            com.moovit.ridesharing.model.EventRequest r2 = r1.f39270l0
            if (r2 != 0) goto L_0x0084
            goto L_0x011b
        L_0x0084:
            java.lang.Object r6 = r1.getSystemService(r7)     // Catch:{ Exception -> 0x0114 }
            tp.a0 r6 = (p824tp.C19722a0) r6     // Catch:{ Exception -> 0x0114 }
            java.lang.String r7 = "user_profile_manager_service"
            java.lang.Object r7 = r1.getSystemService(r7)     // Catch:{ Exception -> 0x0114 }
            gy.e r7 = (p527gy.C17261e) r7     // Catch:{ Exception -> 0x0114 }
            gy.d r7 = r7.mo49805e()     // Catch:{ Exception -> 0x0114 }
            java.lang.String r7 = r7.mo49804a()     // Catch:{ Exception -> 0x0114 }
            com.moovit.ridesharing.model.EventInstance r2 = r2.f42953c     // Catch:{ Exception -> 0x0114 }
            com.moovit.ridesharing.model.Event r8 = r2.f42943b     // Catch:{ Exception -> 0x0114 }
            int r9 = r2.f42949h     // Catch:{ Exception -> 0x0114 }
            if (r9 != r5) goto L_0x00a5
            r9 = 1
            goto L_0x00a6
        L_0x00a5:
            r9 = 0
        L_0x00a6:
            com.moovit.network.model.ServerId r10 = r2.f42944c     // Catch:{ Exception -> 0x0114 }
            com.moovit.ridesharing.model.EventVehicleType r11 = r2.f42948g     // Catch:{ Exception -> 0x0114 }
            zz.i0 r12 = new zz.i0     // Catch:{ Exception -> 0x0114 }
            r12.<init>(r10, r11)     // Catch:{ Exception -> 0x0114 }
            com.moovit.app.ridesharing.booking.EventBookingParams r10 = new com.moovit.app.ridesharing.booking.EventBookingParams     // Catch:{ Exception -> 0x0114 }
            com.moovit.network.model.ServerId r14 = r8.f42911b     // Catch:{ Exception -> 0x0114 }
            r15 = 0
            com.moovit.network.model.ServerId r2 = r2.f42950i     // Catch:{ Exception -> 0x0114 }
            if (r9 == 0) goto L_0x00bb
            r17 = r12
            goto L_0x00bd
        L_0x00bb:
            r17 = r3
        L_0x00bd:
            if (r9 == 0) goto L_0x00c2
            r18 = r3
            goto L_0x00c4
        L_0x00c2:
            r18 = r12
        L_0x00c4:
            y90.f r6 = r6.f50160a     // Catch:{ Exception -> 0x0114 }
            java.lang.String r6 = r6.f32925a     // Catch:{ Exception -> 0x0114 }
            boolean r9 = p977zz.C20964s0.m49090h(r7)     // Catch:{ Exception -> 0x0114 }
            if (r9 == 0) goto L_0x00d1
            r20 = r3
            goto L_0x00d3
        L_0x00d1:
            r20 = r7
        L_0x00d3:
            r13 = r10
            r16 = r2
            r19 = r6
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x0114 }
            android.net.Uri r2 = com.moovit.app.ridesharing.booking.EventBookingParams.m39005d(r10)     // Catch:{ Exception -> 0x0114 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0114 }
            r6.<init>()     // Catch:{ Exception -> 0x0114 }
            r7 = 2131888665(0x7f120a19, float:1.9411972E38)
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0114 }
            java.lang.String r8 = r8.f42913d     // Catch:{ Exception -> 0x0114 }
            r5[r4] = r8     // Catch:{ Exception -> 0x0114 }
            java.lang.String r4 = r1.getString(r7, r5)     // Catch:{ Exception -> 0x0114 }
            r6.append(r4)     // Catch:{ Exception -> 0x0114 }
            java.lang.String r4 = p977zz.C20964s0.f52718a     // Catch:{ Exception -> 0x0114 }
            r6.append(r4)     // Catch:{ Exception -> 0x0114 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0114 }
            r6.append(r2)     // Catch:{ Exception -> 0x0114 }
            java.lang.String r2 = r6.toString()     // Catch:{ Exception -> 0x0114 }
            android.content.Intent r2 = p977zz.C20927a0.m49012g(r2, r3)     // Catch:{ Exception -> 0x0114 }
            r4 = 2131886175(0x7f12005f, float:1.9406921E38)
            java.lang.String r4 = r1.getString(r4)     // Catch:{ Exception -> 0x0114 }
            android.content.Intent r3 = android.content.Intent.createChooser(r2, r4)     // Catch:{ Exception -> 0x0114 }
            goto L_0x0115
        L_0x0114:
        L_0x0115:
            if (r3 != 0) goto L_0x0118
            goto L_0x011b
        L_0x0118:
            r1.startActivity(r3)
        L_0x011b:
            return
        L_0x011c:
            java.lang.Object r1 = r0.f14501c
            com.moovit.app.reports.list.ReportsListActivity r1 = (com.moovit.app.reports.list.ReportsListActivity) r1
            int r2 = com.moovit.app.reports.list.ReportsListActivity.f39183n0
            r1.getClass()
            hq.b$a r2 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r3 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r2.<init>(r3)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r4 = "add_service_report_clicked"
            r2.mo49939g(r3, r4)
            hq.b r2 = r2.mo49933a()
            r1.mo44545v2(r2)
            r1.mo45690B2()
            return
        L_0x013e:
            java.lang.Object r1 = r0.f14501c
            com.moovit.app.realtimehelp.RealTimeHelpActivity r1 = (com.moovit.app.realtimehelp.RealTimeHelpActivity) r1
            int r2 = com.moovit.app.realtimehelp.RealTimeHelpActivity.f39173U
            r1.getClass()
            hq.b r2 = new hq.b
            com.moovit.analytics.AnalyticsEventKey r3 = com.moovit.analytics.AnalyticsEventKey.RT_HELP_ACTIVITY_ACTION_CLICKED
            r2.<init>(r3)
            r1.mo44545v2(r2)
            r1.finish()
            return
        L_0x0155:
            java.lang.Object r1 = r0.f14501c
            com.moovit.app.navigation.MultiLegNavActivity r1 = (com.moovit.app.navigation.MultiLegNavActivity) r1
            int r2 = r1.f39110I0
            if (r2 != r6) goto L_0x015e
            goto L_0x019c
        L_0x015e:
            int r3 = r1.mo45291Q2(r2)
            boolean r4 = r1.mo45288N2()
            if (r4 == 0) goto L_0x016d
            if (r2 != 0) goto L_0x016d
            java.lang.String r3 = "start_step"
            goto L_0x0181
        L_0x016d:
            com.moovit.itinerary.model.Itinerary r4 = r1.f38499X
            java.util.List r4 = r4.mo48295u0()
            java.lang.Object r3 = r4.get(r3)
            com.moovit.itinerary.model.leg.Leg r3 = (com.moovit.itinerary.model.leg.Leg) r3
            int r3 = r3.getType()
            java.lang.String r3 = p001a0.C0016g.m20c(r3)
        L_0x0181:
            s0.b r4 = new s0.b
            r4.<init>((int) r8)
            com.moovit.analytics.AnalyticsAttributeKey r6 = com.moovit.analytics.AnalyticsAttributeKey.ITINERARY_STEP_TYPE
            r4.put(r6, r3)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.ITINERARY_STEP_INDEX
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r4.put(r3, r2)
            java.lang.String r2 = "active_ride_recenter_button_type"
            r1.mo45286L2(r2, r4)
            r1.mo45641a3(r5)
        L_0x019c:
            return
        L_0x019d:
            java.lang.Object r1 = r0.f14501c
            su.k r1 = (p805su.C19554k) r1
            int r2 = p805su.C19554k.f49700n
            r1.getClass()
            hq.b$a r2 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r3 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r2.<init>(r3)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r4 = "mot_suggestions_manual_route_selection_clicked"
            r2.mo49939g(r3, r4)
            hq.b r2 = r2.mo49933a()
            r1.mo46797j2(r2)
            A r1 = r1.f40822c
            com.moovit.app.mot.purchase.MotQrCodeActivationActivity r1 = (com.moovit.app.mot.purchase.MotQrCodeActivationActivity) r1
            r1.getClass()
            su.p r2 = new su.p
            r2.<init>()
            java.lang.String r3 = "trip"
            r1.mo45585z2(r2, r3, r5)
            return
        L_0x01ce:
            java.lang.Object r1 = r0.f14501c
            qu.h r1 = (p757qu.C19185h) r1
            int r2 = p757qu.C19185h.f48779u
            r1.getClass()
            hq.b$a r2 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r3 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r2.<init>(r3)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r4 = "cancel_clicked"
            r2.mo49939g(r3, r4)
            hq.b r2 = r2.mo49933a()
            r1.mo46797j2(r2)
            A r1 = r1.f40822c
            com.moovit.app.mot.purchase.MotStationExitActivationActivity r1 = (com.moovit.app.mot.purchase.MotStationExitActivationActivity) r1
            r1.finish()
            return
        L_0x01f4:
            java.lang.Object r1 = r0.f14501c
            com.moovit.app.mot.activation.MotActivationDetailsActivity r1 = (com.moovit.app.mot.activation.MotActivationDetailsActivity) r1
            com.moovit.app.mot.model.MotActivation r2 = r1.f38975U
            java.lang.String r2 = r2.f38992i
            boolean r2 = p977zz.C20964s0.m49090h(r2)
            if (r2 == 0) goto L_0x0203
            goto L_0x0231
        L_0x0203:
            hq.b$a r2 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r3 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r2.<init>(r3)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r4 = "mot_activation_details_show_qr_clicked"
            r2.mo49939g(r3, r4)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.ID
            com.moovit.app.mot.model.MotActivation r4 = r1.f38975U
            com.moovit.network.model.ServerId r4 = r4.f38985b
            r2.mo49937e(r3, r4)
            hq.b r2 = r2.mo49933a()
            r1.mo44545v2(r2)
            com.moovit.app.mot.model.MotActivation r2 = r1.f38975U
            java.lang.String r3 = r2.f38989f
            com.moovit.network.model.ServerId r2 = r2.f38985b
            android.content.Intent r2 = com.moovit.app.mot.p417qr.MotQrCodeViewerActivity.m38705y2(r1, r2, r3)
            r1.startActivity(r2)
            r1.finish()
        L_0x0231:
            return
        L_0x0232:
            java.lang.Object r1 = r0.f14501c
            com.moovit.app.itinerary.ItineraryActivity r1 = (com.moovit.app.itinerary.ItineraryActivity) r1
            int r2 = com.moovit.app.itinerary.ItineraryActivity.f38474B0
            com.moovit.itinerary.model.Itinerary r2 = r1.mo45266A2()
            com.moovit.app.itinerary.f r3 = r1.f38485q0
            r3.getClass()
            com.moovit.commons.geo.Polyline r3 = r2.mo48296w1()
            com.moovit.commons.geo.Polylon r3 = (com.moovit.commons.geo.Polylon) r3
            int r3 = r3.mo24338U0()
            if (r3 <= 0) goto L_0x024f
            r3 = 1
            goto L_0x0250
        L_0x024f:
            r3 = 0
        L_0x0250:
            if (r3 == 0) goto L_0x0276
            com.moovit.app.itinerary.c r3 = new com.moovit.app.itinerary.c
            r3.<init>(r1, r2)
            r2 = 2131363357(0x7f0a061d, float:1.834652E38)
            android.view.View r1 = r1.findViewById(r2)
            com.moovit.commons.view.list.FixedListView r1 = (com.moovit.commons.view.list.FixedListView) r1
            int[] r2 = new int[r5]
            r2[r4] = r4
            java.lang.String r4 = "scrollY"
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofInt(r1, r4, r2)
            r4 = 200(0xc8, double:9.9E-322)
            android.animation.ObjectAnimator r1 = r1.setDuration(r4)
            r1.addListener(r3)
            r1.start()
        L_0x0276:
            return
        L_0x0277:
            java.lang.Object r1 = r0.f14501c
            tt.h r1 = (p828tt.C19767h) r1
            int r2 = p828tt.C19767h.f50254p
            r1.getClass()
            hq.b$a r2 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r3 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r2.<init>(r3)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r4 = "onboarding_favorites_dismiss_clicked"
            r2.mo49939g(r3, r4)
            hq.b r2 = r2.mo49933a()
            r1.mo46797j2(r2)
            A r1 = r1.f40822c
            com.moovit.app.intro.onboarding.UserOnboardingActivity r1 = (com.moovit.app.intro.onboarding.UserOnboardingActivity) r1
            r1.mo45265y2()
            return
        L_0x029d:
            java.lang.Object r1 = r0.f14501c
            com.moovit.app.intro.login.FirstTimeLoginActivity r1 = (com.moovit.app.intro.login.FirstTimeLoginActivity) r1
            int r2 = com.moovit.app.intro.login.FirstTimeLoginActivity.f38456p0
            r1.recreate()
            return
        L_0x02a7:
            java.lang.Object r1 = r0.f14501c
            com.moovit.app.intro.UserCreationFailureActivity r1 = (com.moovit.app.intro.UserCreationFailureActivity) r1
            int r3 = com.moovit.app.intro.UserCreationFailureActivity.f38450X
            r1.getClass()
            hq.b r3 = new hq.b
            com.moovit.analytics.AnalyticsEventKey r4 = com.moovit.analytics.AnalyticsEventKey.USER_CREATION_RETRY_CLICKED
            r3.<init>(r4)
            r1.mo44545v2(r3)
            com.moovit.app.MoovitAppApplication r3 = com.moovit.app.MoovitAppApplication.m37038x()
            android.content.Intent r4 = r1.mo45252y2()
            lz.a r5 = r3.f37321e
            r5.mo50689b(r2)
            r3.mo44574v(r1, r4)
            return
        L_0x02cb:
            java.lang.Object r1 = r0.f14501c
            com.moovit.app.home.dashboard.suggestions.SuggestionsSectionFragment r1 = (com.moovit.app.home.dashboard.suggestions.SuggestionsSectionFragment) r1
            int r2 = com.moovit.app.home.dashboard.suggestions.SuggestionsSectionFragment.f38283w
            java.lang.String r2 = "this$0"
            mf0.C24362h.m61211f(r1, r2)
            com.moovit.app.home.dashboard.suggestions.SuggestionsSectionViewModel r2 = r1.mo45163m2()
            r2.mo45164c(r5)
            hq.b$a r2 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r3 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r2.<init>(r3)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r4 = "refresh_suggestions"
            r2.mo49939g(r3, r4)
            hq.b r2 = r2.mo49933a()
            r1.mo46797j2(r2)
            r1.f38288r = r5
            return
        L_0x02f6:
            java.lang.Object r1 = r0.f14501c
            com.moovit.app.home.dashboard.m r1 = (com.moovit.app.home.dashboard.C14949m) r1
            int r2 = com.moovit.app.home.dashboard.C14949m.f38257s
            r1.getClass()
            java.lang.Object r2 = r22.getTag()
            com.moovit.app.useraccount.manager.favorites.LocationFavorite r2 = (com.moovit.app.useraccount.manager.favorites.LocationFavorite) r2
            T r2 = r2.f52687b
            com.moovit.transit.LocationDescriptor r2 = (com.moovit.transit.LocationDescriptor) r2
            hq.b$a r4 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r5 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r4.<init>(r5)
            com.moovit.analytics.AnalyticsAttributeKey r5 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r6 = "location_stop_view"
            r4.mo49939g(r5, r6)
            com.moovit.analytics.AnalyticsAttributeKey r5 = com.moovit.analytics.AnalyticsAttributeKey.SELECTED_CAPTION
            java.lang.String r6 = r2.mo24313f()
            r4.mo49945m(r5, r6)
            com.moovit.analytics.AnalyticsAttributeKey r5 = com.moovit.analytics.AnalyticsAttributeKey.SELECTED_TYPE
            com.moovit.transit.LocationDescriptor$LocationType r6 = r2.f23647b
            java.lang.String r6 = p001a0.C0016g.m13C(r6)
            r4.mo49939g(r5, r6)
            com.moovit.analytics.AnalyticsAttributeKey r5 = com.moovit.analytics.AnalyticsAttributeKey.SELECTED_ID
            com.moovit.network.model.ServerId r6 = r2.f23649d
            r4.mo49943k(r5, r6)
            hq.b r4 = r4.mo49933a()
            r1.mo46797j2(r4)
            com.moovit.network.model.ServerId r2 = r2.f23649d
            android.content.Context r4 = r1.requireContext()
            android.content.Intent r2 = com.moovit.app.stopdetail.StopDetailActivity.m39207B2(r4, r2, r3, r3, r3)
            r1.startActivity(r2)
            return
        L_0x0347:
            java.lang.Object r1 = r0.f14501c
            com.moovit.app.home.dashboard.b r1 = (com.moovit.app.home.dashboard.C14926b) r1
            com.moovit.app.home.dashboard.b$a r2 = com.moovit.app.home.dashboard.C14926b.f38185s
            r1.getClass()
            hq.b$a r2 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r3 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r2.<init>(r3)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r4 = "fast_booking_cell_clicked"
            r2.mo49939g(r3, r4)
            hq.b r2 = r2.mo49933a()
            r1.mo46797j2(r2)
            android.content.Context r2 = r22.getContext()
            int[] r3 = com.moovit.app.carpool.fastbooking.CarpoolBookRideRequestActivity.f37721F0
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.moovit.app.carpool.fastbooking.CarpoolBookRideRequestActivity> r4 = com.moovit.app.carpool.fastbooking.CarpoolBookRideRequestActivity.class
            r3.<init>(r2, r4)
            r1.startActivity(r3)
            return
        L_0x0376:
            java.lang.Object r1 = r0.f14501c
            com.moovit.app.history.TripHistoryActivity r1 = (com.moovit.app.history.TripHistoryActivity) r1
            int r2 = com.moovit.app.history.TripHistoryActivity.f38127U
            r1.finish()
            return
        L_0x0380:
            java.lang.Object r1 = r0.f14501c
            xs.e r1 = (p923xs.C20569e) r1
            r1.getClass()
            java.lang.Object r2 = r22.getTag()
            ja0.f r2 = (ja0.C12797f) r2
            int r2 = r2.getAdapterPosition()
            if (r2 != r6) goto L_0x0394
            goto L_0x03a1
        L_0x0394:
            java.util.ArrayList<zendesk.support.SimpleArticle> r3 = r1.f52033h
            java.lang.Object r2 = r3.get(r2)
            zendesk.support.SimpleArticle r2 = (zendesk.support.SimpleArticle) r2
            xs.e$a r1 = r1.f52034i
            r1.mo52781n1(r2)
        L_0x03a1:
            return
        L_0x03a2:
            java.lang.Object r1 = r0.f14501c
            com.moovit.app.help.feedback.FeedbackFormActivity r1 = (com.moovit.app.help.feedback.FeedbackFormActivity) r1
            com.google.android.material.textfield.TextInputLayout r3 = r1.f38107l0
            r3.clearFocus()
            com.google.android.material.textfield.TextInputLayout r3 = r1.f38111p0
            r3.clearFocus()
            com.google.android.material.textfield.TextInputLayout r3 = r1.f38109n0
            r3.clearFocus()
            com.google.android.material.textfield.TextInputLayout r3 = r1.f38113r0
            r3.clearFocus()
            com.moovit.app.help.feedback.CategoryType r3 = r1.f38103U
            if (r3 == 0) goto L_0x0441
            com.moovit.app.help.feedback.FeedbackType r3 = r1.f38104X
            if (r3 != 0) goto L_0x03c4
            goto L_0x0441
        L_0x03c4:
            android.widget.EditText r3 = r1.f38108m0
            android.text.Editable r3 = r3.getText()
            boolean r3 = p977zz.C20964s0.m49094l(r3)
            if (r3 == 0) goto L_0x03d2
            r3 = 1
            goto L_0x03df
        L_0x03d2:
            com.google.android.material.textfield.TextInputLayout r3 = r1.f38107l0
            r6 = 2131887380(0x7f120514, float:1.9409365E38)
            java.lang.String r6 = r1.getString(r6)
            r3.setError(r6)
            r3 = 0
        L_0x03df:
            if (r3 != 0) goto L_0x03e8
            com.google.android.material.textfield.TextInputLayout r3 = r1.f38107l0
            r3.requestFocus()
            goto L_0x0461
        L_0x03e8:
            android.widget.EditText r3 = r1.f38110o0
            android.text.Editable r3 = r3.getText()
            boolean r3 = p977zz.C20964s0.m49093k(r3)
            if (r3 == 0) goto L_0x03f6
            r3 = 1
            goto L_0x0403
        L_0x03f6:
            com.google.android.material.textfield.TextInputLayout r3 = r1.f38109n0
            r6 = 2131887141(0x7f120425, float:1.940888E38)
            java.lang.String r6 = r1.getString(r6)
            r3.setError(r6)
            r3 = 0
        L_0x0403:
            if (r3 != 0) goto L_0x040b
            com.google.android.material.textfield.TextInputLayout r3 = r1.f38109n0
            r3.requestFocus()
            goto L_0x0461
        L_0x040b:
            android.widget.EditText r3 = r1.f38114s0
            android.text.Editable r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r3.trim()
            int r3 = r3.length()
            r6 = 5
            if (r3 < r6) goto L_0x0422
            r3 = 1
            goto L_0x0437
        L_0x0422:
            com.google.android.material.textfield.TextInputLayout r3 = r1.f38113r0
            r9 = 2131887419(0x7f12053b, float:1.9409445E38)
            java.lang.Object[] r10 = new java.lang.Object[r5]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r10[r4] = r6
            java.lang.String r6 = r1.getString(r9, r10)
            r3.setError(r6)
            r3 = 0
        L_0x0437:
            if (r3 != 0) goto L_0x043f
            com.google.android.material.textfield.TextInputLayout r3 = r1.f38113r0
            r3.requestFocus()
            goto L_0x0461
        L_0x043f:
            r3 = 1
            goto L_0x0462
        L_0x0441:
            com.moovit.design.view.list.ListItemView r3 = r1.f38106Z
            r6 = 2131887395(0x7f120523, float:1.9409396E38)
            r3.setSubtitle((int) r6)
            com.moovit.design.view.list.ListItemView r3 = r1.f38106Z
            r6 = 2130968976(0x7f040190, float:1.754662E38)
            r3.setSubtitleThemeTextColor(r6)
            r3 = 2131362943(0x7f0a047f, float:1.834568E38)
            android.view.View r3 = r1.findViewById(r3)
            com.moovit.design.view.list.ListItemView r6 = r1.f38106Z
            int r6 = r6.getTop()
            r3.scrollTo(r4, r6)
        L_0x0461:
            r3 = 0
        L_0x0462:
            java.lang.String r6 = "submit_clicked"
            if (r3 != 0) goto L_0x0480
            hq.b$a r2 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r3 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r2.<init>(r3)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            r2.mo49939g(r3, r6)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.IS_VALID
            r2.mo49941i(r3, r4)
            hq.b r2 = r2.mo49933a()
            r1.mo44545v2(r2)
            goto L_0x0540
        L_0x0480:
            hq.b$a r3 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r4 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r3.<init>(r4)
            com.moovit.analytics.AnalyticsAttributeKey r4 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            r3.mo49939g(r4, r6)
            com.moovit.analytics.AnalyticsAttributeKey r4 = com.moovit.analytics.AnalyticsAttributeKey.IS_VALID
            r3.mo49941i(r4, r5)
            hq.b r3 = r3.mo49933a()
            r1.mo44545v2(r3)
            r3 = 2131363022(0x7f0a04ce, float:1.8345841E38)
            androidx.fragment.app.Fragment r3 = r1.mo44529n1(r3)
            com.moovit.app.gallery.embedded.ZendeskGalleryFragment r3 = (com.moovit.app.gallery.embedded.ZendeskGalleryFragment) r3
            com.moovit.app.help.feedback.CategoryType r4 = r1.f38103U
            if (r4 == 0) goto L_0x0540
            com.moovit.app.help.feedback.FeedbackType r4 = r1.f38104X
            if (r4 == 0) goto L_0x0540
            if (r3 != 0) goto L_0x04ad
            goto L_0x0540
        L_0x04ad:
            android.widget.EditText r4 = r1.f38108m0
            android.text.Editable r4 = r4.getText()
            java.lang.String r13 = p977zz.C20964s0.m49082C(r4)
            android.widget.EditText r4 = r1.f38110o0
            android.text.Editable r4 = r4.getText()
            java.lang.String r14 = p977zz.C20964s0.m49082C(r4)
            android.widget.EditText r4 = r1.f38112q0
            android.text.Editable r4 = r4.getText()
            java.lang.String r17 = p977zz.C20964s0.m49082C(r4)
            android.widget.EditText r4 = r1.f38114s0
            android.text.Editable r4 = r4.getText()
            java.lang.String r18 = p977zz.C20964s0.m49082C(r4)
            java.lang.Object r4 = r1.getSystemService(r7)
            tp.a0 r4 = (p824tp.C19722a0) r4
            y90.f r4 = r4.f50160a
            java.lang.String r15 = r4.f32925a
            w40.d r4 = w40.C25761d.m64299a()
            java.lang.String r16 = r4.mo83588c()
            ws.j r4 = new ws.j
            java.lang.String r10 = r1.f38105Y
            com.moovit.app.help.feedback.CategoryType r11 = r1.f38103U
            com.moovit.app.help.feedback.FeedbackType r12 = r1.f38104X
            java.util.Map<com.moovit.gallery.EmbeddedGalleryImage, java.lang.String> r3 = r3.f38030s
            java.util.Collection r3 = r3.values()
            boolean r6 = r3 instanceof java.util.List
            if (r6 == 0) goto L_0x04fc
            java.util.List r3 = (java.util.List) r3
            goto L_0x0502
        L_0x04fc:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r3)
            r3 = r6
        L_0x0502:
            java.util.List r19 = java.util.Collections.unmodifiableList(r3)
            r9 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r1.mo45048C2(r5)
            java.lang.Object r2 = r1.mo44537r1(r2)
            tp.a0 r2 = (p824tp.C19722a0) r2
            java.lang.String r3 = "USER_ACCOUNT"
            java.lang.Object r3 = r1.mo44537r1(r3)
            com.moovit.app.useraccount.manager.UserAccountManager r3 = (com.moovit.app.useraccount.manager.UserAccountManager) r3
            java.lang.String r5 = "TRIP_PLANNER_CONFIGURATION"
            java.lang.Object r5 = r1.mo44537r1(r5)
            v90.a r5 = (v90.C13187a) r5
            java.util.concurrent.ExecutorService r6 = com.moovit.MoovitExecutors.f37327IO
            ws.b r7 = new ws.b
            r7.<init>(r1, r2, r3, r5)
            com.google.android.gms.tasks.Task r2 = com.google.android.gms.tasks.Tasks.call(r6, r7)
            d0.x0 r3 = new d0.x0
            r5 = 4
            r3.<init>(r5, r1, r4)
            com.google.android.gms.tasks.Task r2 = r2.onSuccessTask(r6, r3)
            s3.v r3 = new s3.v
            r3.<init>(r1, r8)
            r2.addOnCompleteListener((android.app.Activity) r1, r3)
        L_0x0540:
            return
        L_0x0541:
            java.lang.Object r1 = r0.f14501c
            com.moovit.app.general.settings.privacy.PrivacyUpdateActivity r1 = (com.moovit.app.general.settings.privacy.PrivacyUpdateActivity) r1
            int r2 = com.moovit.app.general.settings.privacy.PrivacyUpdateActivity.f38072X
            r1.getClass()
            com.google.firebase.analytics.FirebaseAnalytics r2 = com.google.firebase.analytics.FirebaseAnalytics.getInstance(r1)
            java.lang.String r4 = "privacy_update_screen_continue_click"
            r2.mo43247a(r3, r4)
            hq.b$a r2 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r3 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r2.<init>(r3)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r4 = "continue_clicked"
            r2.mo49939g(r3, r4)
            hq.b r2 = r2.mo49933a()
            r1.mo44545v2(r2)
            com.moovit.app.general.settings.privacy.a r2 = com.moovit.app.general.settings.privacy.C14894a.m37560b(r1)
            r2.mo45018h()
            android.content.Intent r2 = r1.f38073U
            r1.startActivity(r2)
            r1.finish()
            r2 = 2130772033(0x7f010041, float:1.7147173E38)
            r3 = 2130772034(0x7f010042, float:1.7147175E38)
            r1.overridePendingTransition(r2, r3)
            return
        L_0x0581:
            java.lang.Object r1 = r0.f14501c
            com.moovit.app.general.aboutandcontact.AboutAndContactActivity r1 = (com.moovit.app.general.aboutandcontact.AboutAndContactActivity) r1
            int r2 = com.moovit.app.general.aboutandcontact.AboutAndContactActivity.f38043U
            r2 = 2131889815(0x7f120e97, float:1.9414304E38)
            java.lang.String r2 = r1.getString(r2)
            r3 = 2131889814(0x7f120e96, float:1.9414302E38)
            java.lang.String r3 = r1.getString(r3)
            android.content.Intent r2 = com.moovit.web.WebViewActivity.m18168y2(r1, r2, r3)
            r1.startActivity(r2)
            return
        L_0x059d:
            java.lang.Object r1 = r0.f14501c
            com.moovit.app.general.SpreadTheLoveActivity r1 = (com.moovit.app.general.SpreadTheLoveActivity) r1
            r2 = r22
            com.moovit.app.general.SpreadTheLoveActivity.m37518y2(r1, r2)
            return
        L_0x05a7:
            java.lang.Object r1 = r0.f14501c
            com.moovit.app.carpool.ridedetails.d r1 = (com.moovit.app.carpool.ridedetails.C14838d) r1
            java.lang.String r2 = com.moovit.app.carpool.ridedetails.C14838d.f37890i
            r1.getClass()
            hq.b$a r2 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r3 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r2.<init>(r3)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r4 = "confirm_clicked"
            r2.mo49939g(r3, r4)
            hq.b r2 = r2.mo49933a()
            r1.mo22564R1(r2)
            java.lang.Class<com.moovit.app.carpool.ridedetails.d$a> r2 = com.moovit.app.carpool.ridedetails.C14838d.C14839a.class
            d0.a0 r3 = new d0.a0
            r3.<init>(r1, r8)
            r1.mo46753L1(r2, r3)
            r1.dismiss()
            return
        L_0x05d3:
            java.lang.Object r1 = r0.f14501c
            com.moovit.app.carpool.fastbooking.a r1 = (com.moovit.app.carpool.fastbooking.C14808a) r1
            int r2 = com.moovit.app.carpool.fastbooking.C14808a.f37756u
            r1.getClass()
            com.moovit.util.CurrencyAmount r2 = new com.moovit.util.CurrencyAmount
            com.moovit.util.CurrencyAmount r3 = r1.f37762m
            java.lang.String r3 = r3.f23844b
            long r4 = r1.f37764o
            java.math.BigDecimal r4 = java.math.BigDecimal.valueOf(r4)
            java.math.BigDecimal r4 = r4.movePointLeft(r8)
            r2.<init>(r3, r4)
            androidx.fragment.app.Fragment r3 = r1.getTargetFragment()
            boolean r4 = r3 instanceof com.moovit.app.carpool.fastbooking.C14810b.C14811a
            if (r4 == 0) goto L_0x05fc
            com.moovit.app.carpool.fastbooking.a$a r3 = (com.moovit.app.carpool.fastbooking.C14808a.C14809a) r3
            r3.mo44860l0(r2)
        L_0x05fc:
            androidx.fragment.app.Fragment r3 = r1.getParentFragment()
            boolean r4 = r3 instanceof com.moovit.app.carpool.fastbooking.C14810b.C14811a
            if (r4 == 0) goto L_0x0609
            com.moovit.app.carpool.fastbooking.a$a r3 = (com.moovit.app.carpool.fastbooking.C14808a.C14809a) r3
            r3.mo44860l0(r2)
        L_0x0609:
            androidx.fragment.app.FragmentActivity r3 = r1.getActivity()
            boolean r4 = r3 instanceof com.moovit.app.carpool.fastbooking.C14810b.C14811a
            if (r4 == 0) goto L_0x0616
            com.moovit.app.carpool.fastbooking.a$a r3 = (com.moovit.app.carpool.fastbooking.C14808a.C14809a) r3
            r3.mo44860l0(r2)
        L_0x0616:
            r1.dismiss()
            return
        L_0x061a:
            java.lang.Object r1 = r0.f14501c
            com.moovit.app.ataf.AtafTicketsActivity r1 = (com.moovit.app.ataf.AtafTicketsActivity) r1
            f00.g$a r2 = com.moovit.app.ataf.AtafTicketsActivity.f37610U
            r2 = 2131362729(0x7f0a03a9, float:1.8345247E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.CheckBox r2 = (android.widget.CheckBox) r2
            f00.g$a r3 = com.moovit.app.ataf.AtafTicketsActivity.f37610U
            java.lang.String r5 = "ataf_tickets"
            android.content.SharedPreferences r4 = r1.getSharedPreferences(r5, r4)
            boolean r2 = r2.isChecked()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r3.mo49545d(r4, r2)
            r2 = 2131886500(0x7f1201a4, float:1.940758E38)
            java.lang.String r2 = r1.getString(r2)
            java.util.List r2 = java.util.Collections.singletonList(r2)
            r3 = 2131886498(0x7f1201a2, float:1.9407577E38)
            java.lang.String r3 = r1.getString(r3)
            android.content.Intent r2 = p977zz.C20927a0.m49013h(r3, r2)
            r1.startActivity(r2)
            r1.finish()
            return
        L_0x0659:
            java.lang.Object r1 = r0.f14501c
            com.moovit.app.actions.notifydriver.NotifyDriverLineSelectionActivity r1 = (com.moovit.app.actions.notifydriver.NotifyDriverLineSelectionActivity) r1
            int r2 = com.moovit.app.actions.notifydriver.NotifyDriverLineSelectionActivity.f37425r0
            r1.finish()
            return
        L_0x0663:
            java.lang.Object r1 = r0.f14501c
            com.moovit.MoovitActivity r1 = (com.moovit.MoovitActivity) r1
            java.lang.String r2 = com.moovit.MoovitActivity.f37291T
            r1.recreate()
            return
        L_0x066d:
            java.lang.Object r1 = r0.f14501c
            com.google.android.exoplayer2.ui.StyledPlayerControlView r1 = (com.google.android.exoplayer2.p052ui.StyledPlayerControlView) r1
            com.google.android.exoplayer2.p052ui.StyledPlayerControlView.m10795a(r1)
            return
        L_0x0675:
            java.lang.Object r1 = r0.f14501c
            com.moovit.app.servicealerts.ServiceAlertFragment r1 = (com.moovit.app.servicealerts.ServiceAlertFragment) r1
            int r6 = com.moovit.app.servicealerts.ServiceAlertFragment.f39556x
            r1.getClass()
            java.lang.Object r2 = r22.getTag()
            zz.i0 r2 = (p977zz.C20944i0) r2
            F r6 = r2.f52692a
            com.moovit.network.model.ServerId r6 = (com.moovit.network.model.ServerId) r6
            S r2 = r2.f52693b
            com.moovit.servicealerts.LineServiceAlertDigest r2 = (com.moovit.servicealerts.LineServiceAlertDigest) r2
            java.util.List<java.lang.String> r7 = r2.f23187d
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L_0x0696
            goto L_0x0724
        L_0x0696:
            com.moovit.servicealerts.ServiceAlertAffectedLine r8 = r2.f23185b
            com.moovit.network.model.ServerId r8 = r8.f23206d
            j80.g r9 = r1.f39558o
            java.util.Map<com.moovit.network.model.ServerId, java.lang.String> r9 = r9.f31609e
            boolean r9 = r9.containsKey(r8)
            if (r8 == 0) goto L_0x06b6
            int r10 = r7.size()
            if (r10 > r5) goto L_0x06ac
            if (r9 == 0) goto L_0x06b6
        L_0x06ac:
            A r4 = r1.f40822c
            android.content.Intent r3 = com.moovit.app.reports.list.LinesReportsListActivity.m38851E2(r4, r3, r3, r8)
            r1.startActivity(r3)
            goto L_0x06fd
        L_0x06b6:
            if (r8 != 0) goto L_0x06ee
            int r3 = r7.size()
            if (r3 <= r5) goto L_0x06ee
            A r3 = r1.f40822c
            int r4 = com.moovit.app.servicealerts.LineServiceAlertSelectionActivity.f39551X
            com.moovit.servicealerts.ServiceAlertAffectedLine r4 = r2.f23185b
            java.util.List<java.lang.String> r5 = r2.f23187d
            android.content.Intent r7 = new android.content.Intent
            java.lang.Class<com.moovit.app.servicealerts.LineServiceAlertSelectionActivity> r8 = com.moovit.app.servicealerts.LineServiceAlertSelectionActivity.class
            r7.<init>(r3, r8)
            java.lang.String r3 = "transit_agency_id"
            r7.putExtra(r3, r6)
            java.lang.String r3 = "affected_line"
            r7.putExtra(r3, r4)
            boolean r3 = r5 instanceof java.util.ArrayList
            if (r3 == 0) goto L_0x06df
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            goto L_0x06e5
        L_0x06df:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r5)
            r5 = r3
        L_0x06e5:
            java.lang.String r3 = "alert_ids"
            r7.putExtra(r3, r5)
            r1.startActivity(r7)
            goto L_0x06fd
        L_0x06ee:
            A r3 = r1.f40822c
            java.lang.Object r4 = r7.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            android.content.Intent r3 = com.moovit.app.servicealerts.ServiceAlertDetailsActivity.m39148z2(r3, r8, r4)
            r1.startActivity(r3)
        L_0x06fd:
            hq.b$a r3 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r4 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r3.<init>(r4)
            com.moovit.analytics.AnalyticsAttributeKey r4 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r5 = "service_alert_clicked"
            r3.mo49939g(r4, r5)
            com.moovit.analytics.AnalyticsAttributeKey r4 = com.moovit.analytics.AnalyticsAttributeKey.SERVICE_ALERT_TYPE
            com.moovit.servicealerts.ServiceStatus r2 = r2.f23186c
            com.moovit.servicealerts.ServiceStatusCategory r2 = r2.f23213b
            java.lang.String r2 = p001a0.C0016g.m12B(r2)
            r3.mo49939g(r4, r2)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.TWITTER_SHOWN
            r3.mo49941i(r2, r9)
            hq.b r2 = r3.mo49933a()
            r1.mo46797j2(r2)
        L_0x0724:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p052ui.C4051q.onClick(android.view.View):void");
    }
}
