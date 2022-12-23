package p613kq;

import com.google.android.gms.tasks.OnSuccessListener;

/* renamed from: kq.a */
public final /* synthetic */ class C18114a implements OnSuccessListener {

    /* renamed from: b */
    public final /* synthetic */ int f46313b;

    /* renamed from: c */
    public final /* synthetic */ Object f46314c;

    public /* synthetic */ C18114a(Object obj, int i) {
        this.f46313b = i;
        this.f46314c = obj;
    }

    /* JADX WARNING: type inference failed for: r3v11, types: [com.moovit.ticketing.wallet.UserWalletTab] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSuccess(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.f46313b
            r1 = 1
            r2 = 0
            r3 = 0
            switch(r0) {
                case 0: goto L_0x0291;
                case 1: goto L_0x0285;
                case 2: goto L_0x0277;
                case 3: goto L_0x0268;
                case 4: goto L_0x025a;
                case 5: goto L_0x020a;
                case 6: goto L_0x0184;
                case 7: goto L_0x017a;
                case 8: goto L_0x0159;
                case 9: goto L_0x00fb;
                case 10: goto L_0x00ef;
                case 11: goto L_0x008e;
                case 12: goto L_0x0084;
                case 13: goto L_0x0032;
                case 14: goto L_0x001e;
                case 15: goto L_0x000a;
                default: goto L_0x0008;
            }
        L_0x0008:
            goto L_0x02a5
        L_0x000a:
            java.lang.Object r0 = r9.f46314c
            r90.c r0 = (r90.C13052c) r0
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10
            if (r10 == 0) goto L_0x0018
            android.widget.ImageView r0 = r0.f32285t
            r0.setImageBitmap(r10)
            goto L_0x001d
        L_0x0018:
            int r10 = r90.C13052c.f32280u
            r0.getClass()
        L_0x001d:
            return
        L_0x001e:
            java.lang.Object r0 = r9.f46314c
            k90.b r0 = (k90.C12820b) r0
            k90.a r10 = (k90.C12819a) r10
            r0.f31694t = r10
            boolean r10 = r0.isResumed()
            if (r10 == 0) goto L_0x0031
            k90.a r10 = r0.f31694t
            r0.mo39648m2(r10)
        L_0x0031:
            return
        L_0x0032:
            java.lang.Object r0 = r9.f46314c
            com.moovit.ticketing.ticket.e r0 = (com.moovit.ticketing.ticket.C7758e) r0
            java.util.List r10 = (java.util.List) r10
            int r1 = com.moovit.ticketing.ticket.C7758e.f23537u
            r0.getClass()
            boolean r1 = c00.C13717b.m34258e(r10)
            if (r1 == 0) goto L_0x0070
            androidx.recyclerview.widget.RecyclerView r10 = r0.f23541q
            android.content.Context r1 = r10.getContext()
            java.lang.String r2 = "context"
            ce0.C21100e.m49373x(r1, r2)
            int r2 = r0.f23544t
            android.graphics.drawable.Drawable r2 = k00.C17988b.m44611b(r2, r1)
            int r4 = r0.f23542r
            if (r4 != 0) goto L_0x005a
            r4 = r3
            goto L_0x005e
        L_0x005a:
            java.lang.CharSequence r4 = r1.getText(r4)
        L_0x005e:
            int r0 = r0.f23543s
            if (r0 != 0) goto L_0x0063
            goto L_0x0067
        L_0x0063:
            java.lang.CharSequence r3 = r1.getText(r0)
        L_0x0067:
            z00.a r0 = new z00.a
            r0.<init>(r2, r4, r3)
            r10.setAdapter(r0)
            goto L_0x0083
        L_0x0070:
            com.moovit.ticketing.ticket.e$b r1 = r0.f23539o
            r1.getClass()
            java.lang.String r2 = "tickets"
            ce0.C21100e.m49373x(r10, r2)
            r1.f23547h = r10
            androidx.recyclerview.widget.RecyclerView r10 = r0.f23541q
            com.moovit.ticketing.ticket.e$b r0 = r0.f23539o
            r10.mo4627l0(r0)
        L_0x0083:
            return
        L_0x0084:
            java.lang.Object r0 = r9.f46314c
            q50.b r0 = (q50.C19080b) r0
            q50.b$a r10 = (q50.C19080b.C19081a) r10
            r0.mo51513n2(r10)
            return
        L_0x008e:
            java.lang.Object r0 = r9.f46314c
            com.moovit.payment.account.settings.PaymentAccountSettingsActivity r0 = (com.moovit.payment.account.settings.PaymentAccountSettingsActivity) r0
            com.moovit.payment.account.model.PaymentAccount r10 = (com.moovit.payment.account.model.PaymentAccount) r10
            int r3 = com.moovit.payment.account.settings.PaymentAccountSettingsActivity.f64114l0
            if (r10 != 0) goto L_0x009c
            r0.finish()
            goto L_0x00ee
        L_0x009c:
            r0.getClass()
            com.moovit.payment.account.settings.PaymentAccountSettings r10 = r10.f64020i
            java.lang.Boolean r10 = r10.f64113b
            int r3 = v40.C25750e.marketing_consent
            android.view.View r3 = r0.findViewById(r3)
            com.moovit.design.view.list.ListItemView r3 = (com.moovit.design.view.list.ListItemView) r3
            r0.f64116X = r3
            if (r10 != 0) goto L_0x00b5
            r10 = 8
            r3.setVisibility(r10)
            goto L_0x00d2
        L_0x00b5:
            int r4 = v40.C25750e.view_tag_param1
            r3.setTag(r4, r10)
            com.moovit.design.view.list.ListItemView r3 = r0.f64116X
            boolean r10 = r10.booleanValue()
            r3.setChecked(r10)
            com.moovit.design.view.list.ListItemView r10 = r0.f64116X
            qs.d r3 = new qs.d
            r3.<init>(r0, r1)
            r10.setOnCheckedChangeListener(r3)
            com.moovit.design.view.list.ListItemView r10 = r0.f64116X
            r10.setVisibility(r2)
        L_0x00d2:
            int r10 = v40.C25750e.save_button
            android.view.View r10 = r0.findViewById(r10)
            android.widget.Button r10 = (android.widget.Button) r10
            r0.f64117Y = r10
            rw.b r1 = new rw.b
            r2 = 13
            r1.<init>(r0, r2)
            r10.setOnClickListener(r1)
            int r10 = v40.C25750e.progress_bar
            android.view.View r10 = r0.findViewById(r10)
            r0.f64118Z = r10
        L_0x00ee:
            return
        L_0x00ef:
            java.lang.Object r0 = r9.f46314c
            com.moovit.payment.account.external.ExternalPaymentAccountsFragment r0 = (com.moovit.payment.account.external.ExternalPaymentAccountsFragment) r0
            com.moovit.payment.account.model.PaymentAccount r10 = (com.moovit.payment.account.model.PaymentAccount) r10
            s0.b r1 = com.moovit.payment.account.external.ExternalPaymentAccountsFragment.f63974r
            r0.mo83453n2(r10)
            return
        L_0x00fb:
            java.lang.Object r0 = r9.f46314c
            com.moovit.micromobility.damage.MicroMobilityReportedDamagesActivity r0 = (com.moovit.micromobility.damage.MicroMobilityReportedDamagesActivity) r0
            java.util.List r10 = (java.util.List) r10
            int r1 = com.moovit.micromobility.damage.MicroMobilityReportedDamagesActivity.f14863l0
            r0.getClass()
            hq.b$a r1 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r2 = com.moovit.analytics.AnalyticsEventKey.CONTENT_SHOWN
            r1.<init>(r2)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r4 = "micro_mobility_reported_damages"
            r1.mo49939g(r2, r4)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.NUMBER_OF_RESULTS
            int r4 = r10.size()
            r1.mo49935c(r2, r4)
            hq.b r1 = r1.mo49933a()
            r0.mo44545v2(r1)
            boolean r1 = c00.C13717b.m34258e(r10)
            if (r1 == 0) goto L_0x014e
            androidx.recyclerview.widget.RecyclerView r10 = r0.f14867Z
            int r1 = l30.C5596y.img_micro_mobility_car
            android.graphics.drawable.Drawable r1 = k00.C17988b.m44611b(r1, r0)
            int r2 = l30.C5570c0.micro_mobility_report_damage_empty_title
            if (r2 != 0) goto L_0x0138
            r2 = r3
            goto L_0x013c
        L_0x0138:
            java.lang.CharSequence r2 = r0.getText(r2)
        L_0x013c:
            int r4 = l30.C5570c0.micro_mobility_report_damage_empty_message
            if (r4 != 0) goto L_0x0141
            goto L_0x0145
        L_0x0141:
            java.lang.CharSequence r3 = r0.getText(r4)
        L_0x0145:
            z00.a r0 = new z00.a
            r0.<init>(r1, r2, r3)
            r10.setAdapter(r0)
            goto L_0x0158
        L_0x014e:
            androidx.recyclerview.widget.RecyclerView r0 = r0.f14867Z
            com.moovit.micromobility.damage.MicroMobilityReportedDamagesActivity$a r1 = new com.moovit.micromobility.damage.MicroMobilityReportedDamagesActivity$a
            r1.<init>(r10)
            r0.setAdapter(r1)
        L_0x0158:
            return
        L_0x0159:
            java.lang.Object r0 = r9.f46314c
            dy.e r0 = (p455dy.C16753e) r0
            com.moovit.transit.TransitStop r10 = (com.moovit.transit.TransitStop) r10
            r0.getClass()
            if (r10 == 0) goto L_0x0169
            com.moovit.transit.LocationDescriptor r10 = com.moovit.transit.LocationDescriptor.m17769c(r10)
            goto L_0x016a
        L_0x0169:
            r10 = r3
        L_0x016a:
            if (r10 == 0) goto L_0x0179
            com.moovit.app.useraccount.manager.favorites.LocationFavorite r4 = r0.mo49439m(r10)
            if (r4 == 0) goto L_0x0173
            goto L_0x0174
        L_0x0173:
            r1 = 0
        L_0x0174:
            if (r1 != 0) goto L_0x0179
            r0.mo49433g(r10, r3)
        L_0x0179:
            return
        L_0x017a:
            java.lang.Object r0 = r9.f46314c
            com.moovit.app.subscription.MoovitSubscriptionsManager r0 = (com.moovit.app.subscription.MoovitSubscriptionsManager) r0
            com.moovit.app.subscription.MoovitSubscriptionsManager$d r10 = (com.moovit.app.subscription.MoovitSubscriptionsManager.C15361d) r10
            com.moovit.app.subscription.MoovitSubscriptionsManager.m39314a(r0, r10)
            return
        L_0x0184:
            java.lang.Object r0 = r9.f46314c
            com.moovit.app.mot.qr.b r0 = (com.moovit.app.mot.p417qr.C15176b) r0
            java.util.List r10 = (java.util.List) r10
            int r1 = com.moovit.app.mot.p417qr.C15176b.f39092p
            A r1 = r0.f40822c
            if (r1 != 0) goto L_0x0192
            goto L_0x0209
        L_0x0192:
            boolean r2 = c00.C13717b.m34258e(r10)
            if (r2 == 0) goto L_0x019c
            r1.finish()
            goto L_0x0209
        L_0x019c:
            r0.f39094o = r10
            java.lang.Object r1 = c00.C13717b.m34256c(r10)
            com.moovit.app.mot.model.MotActivation r1 = (com.moovit.app.mot.model.MotActivation) r1
            com.moovit.app.mot.model.MotActivationStationInfo r1 = r1.f38997n
            if (r1 == 0) goto L_0x01ad
            com.moovit.transit.TransitStop r1 = r1.mo45574b()
            goto L_0x01ae
        L_0x01ad:
            r1 = r3
        L_0x01ae:
            if (r1 == 0) goto L_0x01b3
            java.lang.String r1 = r1.f23731c
            goto L_0x01b4
        L_0x01b3:
            r1 = r3
        L_0x01b4:
            com.moovit.app.mot.qr.StationQrCodeCardView r2 = r0.f39093n
            r2.setStationName(r1)
            vs.e r1 = new vs.e
            r2 = 2
            r1.<init>(r2)
            java.util.ArrayList r1 = c00.C13720d.m34273c(r10, r3, r1)
            com.moovit.app.mot.qr.StationQrCodeCardView r2 = r0.f39093n
            r2.setQrCodes(r1)
            java.lang.Object r1 = c00.C13717b.m34256c(r10)
            com.moovit.app.mot.model.MotActivation r1 = (com.moovit.app.mot.model.MotActivation) r1
            hq.b$a r2 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r3 = com.moovit.analytics.AnalyticsEventKey.CONTENT_SHOWN
            r2.<init>(r3)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r4 = "mot_activation_qr_viewer_station_exit_impression"
            r2.mo49939g(r3, r4)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.ID
            com.moovit.network.model.ServerId r4 = r1.f38985b
            r2.mo49943k(r3, r4)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.COUNT
            int r10 = r10.size()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r2.mo49944l(r3, r10)
            com.moovit.analytics.AnalyticsAttributeKey r10 = com.moovit.analytics.AnalyticsAttributeKey.AGENCY_ID
            com.moovit.network.model.ServerId r3 = r1.mo45526d()
            r2.mo49943k(r10, r3)
            com.moovit.analytics.AnalyticsAttributeKey r10 = com.moovit.analytics.AnalyticsAttributeKey.AGENCY_NAME
            java.lang.String r1 = r1.mo45529f()
            r2.mo49945m(r10, r1)
            hq.b r10 = r2.mo49933a()
            r0.mo46797j2(r10)
        L_0x0209:
            return
        L_0x020a:
            java.lang.Object r0 = r9.f46314c
            su.g r0 = (p805su.C19548g) r0
            java.util.List r10 = (java.util.List) r10
            int r1 = p805su.C19548g.f49674o
            r0.getClass()
            boolean r1 = c00.C13717b.m34258e(r10)
            if (r1 == 0) goto L_0x021f
            r0.mo51905p2()
            goto L_0x0259
        L_0x021f:
            android.content.res.Resources r1 = r0.getResources()
            androidx.recyclerview.widget.RecyclerView r2 = r0.f49675n
            su.g$a r3 = new su.g$a
            r3.<init>(r10)
            r2.setAdapter(r3)
            androidx.recyclerview.widget.RecyclerView r10 = r0.f49675n
            r2 = 1098907648(0x41800000, float:16.0)
            int r3 = com.moovit.commons.utils.UiUtils.m40245d(r1, r2)
            o00.g r3 = o00.C18670g.m45652e(r3)
            r4 = -1
            r10.mo4593g(r3, r4)
            androidx.recyclerview.widget.RecyclerView r10 = r0.f49675n
            r3 = 1090519040(0x41000000, float:8.0)
            int r3 = com.moovit.commons.utils.UiUtils.m40245d(r1, r3)
            o00.b r3 = o00.C18665b.m45644e(r3)
            r10.mo4593g(r3, r4)
            androidx.recyclerview.widget.RecyclerView r10 = r0.f49675n
            int r0 = com.moovit.commons.utils.UiUtils.m40245d(r1, r2)
            o00.f r0 = o00.C18669f.m45651e(r0)
            r10.mo4593g(r0, r4)
        L_0x0259:
            return
        L_0x025a:
            java.lang.Object r0 = r9.f46314c
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r10 = (java.lang.String) r10
            int r1 = com.moovit.app.map.DocklessVehicleBottomSheetDialog.f38877w
            if (r10 == 0) goto L_0x0267
            r0.setText(r10)
        L_0x0267:
            return
        L_0x0268:
            java.lang.Object r0 = r9.f46314c
            com.moovit.design.view.list.ListItemView r0 = (com.moovit.design.view.list.ListItemView) r0
            com.moovit.app.wondo.tickets.model.WondoCampaign r10 = (com.moovit.app.wondo.tickets.model.WondoCampaign) r10
            int r1 = com.moovit.app.general.more.DrawerFragment.f38045t
            r1 = 2131364675(0x7f0a0b43, float:1.8349194E38)
            r0.setTag(r1, r10)
            return
        L_0x0277:
            java.lang.Object r0 = r9.f46314c
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.lang.Void r10 = (java.lang.Void) r10
            f00.g$a r10 = com.moovit.app.ads.MobileAdsFenceReceiver.f37450a
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r10.mo49545d(r0, r1)
            return
        L_0x0285:
            java.lang.Object r0 = r9.f46314c
            pq.l r0 = (p732pq.C18951l) r0
            com.moovit.payment.account.model.PaymentAccount r10 = (com.moovit.payment.account.model.PaymentAccount) r10
            int r1 = p732pq.C18951l.f48251v
            r0.mo51467C2(r10)
            return
        L_0x0291:
            java.lang.Object r0 = r9.f46314c
            kq.c r0 = (p613kq.C18116c) r0
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r1 = r0.f40824e
            if (r1 == 0) goto L_0x02a4
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r10 = r1.equals(r10)
            r0.mo50552n2(r10)
        L_0x02a4:
            return
        L_0x02a5:
            java.lang.Object r0 = r9.f46314c
            s90.f r0 = (s90.C13078f) r0
            zz.i0 r10 = (p977zz.C20944i0) r10
            java.util.HashSet r1 = s90.C13078f.f32353s
            boolean r1 = r0.isAdded()
            if (r1 == 0) goto L_0x031e
            S r1 = r10.f52693b
            java.util.List r1 = (java.util.List) r1
            r0.f32358r = r1
            android.os.Bundle r4 = r0.getArguments()
            if (r4 == 0) goto L_0x02c7
            java.lang.String r3 = "initialTab"
            android.os.Parcelable r3 = r4.getParcelable(r3)
            com.moovit.ticketing.wallet.UserWalletTab r3 = (com.moovit.ticketing.wallet.UserWalletTab) r3
        L_0x02c7:
            if (r3 == 0) goto L_0x02d2
            int r3 = r1.indexOf(r3)
            int r3 = java.lang.Math.max(r2, r3)
            goto L_0x02d3
        L_0x02d2:
            r3 = 0
        L_0x02d3:
            com.moovit.commons.view.pager.ViewPager r4 = r0.f32357q
            n00.b r5 = new n00.b
            s90.i r6 = new s90.i
            android.content.Context r7 = r0.requireContext()
            androidx.fragment.app.FragmentManager r8 = r0.getChildFragmentManager()
            r6.<init>(r7, r8, r1)
            com.moovit.commons.view.pager.ViewPager r1 = r0.f32357q
            r5.<init>((androidx.viewpager.widget.PagerAdapter) r6, (com.moovit.commons.view.pager.ViewPager) r1)
            r4.setAdapter(r5)
            com.moovit.commons.view.pager.ViewPager r1 = r0.f32357q
            r1.setCurrentLogicalItem(r3)
            com.moovit.commons.view.pager.ViewPager r1 = r0.f32357q
            s90.f$a r3 = r0.f32354n
            r1.addOnPageChangeListener(r3)
            com.google.android.material.tabs.TabLayout r1 = r0.f32356p
            com.moovit.commons.view.pager.ViewPager r3 = r0.f32357q
            r1.setupWithViewPager(r3)
        L_0x02ff:
            com.google.android.material.tabs.TabLayout r1 = r0.f32356p
            int r1 = r1.getTabCount()
            if (r2 >= r1) goto L_0x0317
            com.google.android.material.tabs.TabLayout r1 = r0.f32356p
            com.google.android.material.tabs.TabLayout$g r1 = r1.mo42295g(r2)
            if (r1 == 0) goto L_0x0314
            int r3 = m80.C12870f.wdg_tab_layout_with_icon
            r1.mo42362a(r3)
        L_0x0314:
            int r2 = r2 + 1
            goto L_0x02ff
        L_0x0317:
            F r10 = r10.f52692a
            s90.d r10 = (s90.C13076d) r10
            r0.mo39947n2(r10)
        L_0x031e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p613kq.C18114a.onSuccess(java.lang.Object):void");
    }
}
