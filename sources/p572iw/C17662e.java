package p572iw;

import android.view.View;

/* renamed from: iw.e */
public final /* synthetic */ class C17662e implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f45390b;

    /* renamed from: c */
    public final /* synthetic */ Object f45391c;

    public /* synthetic */ C17662e(Object obj, int i) {
        this.f45390b = i;
        this.f45391c = obj;
    }

    /* JADX WARNING: type inference failed for: r3v18, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r3v19, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r3v20, types: [java.lang.String] */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:72|73|74|75|(1:77)|78|(1:80)|81|82|83) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:82:0x03ba */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r22) {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            int r2 = r1.f45390b
            r3 = 0
            r4 = 0
            r5 = 1
            java.lang.String r6 = "ok_clicked"
            java.lang.String r7 = "this$0"
            r8 = 2
            switch(r2) {
                case 0: goto L_0x04d2;
                case 1: goto L_0x04a4;
                case 2: goto L_0x049a;
                case 3: goto L_0x0457;
                case 4: goto L_0x042e;
                case 5: goto L_0x02a6;
                case 6: goto L_0x0243;
                case 7: goto L_0x0239;
                case 8: goto L_0x01b9;
                case 9: goto L_0x017e;
                case 10: goto L_0x015c;
                case 11: goto L_0x014e;
                case 12: goto L_0x0112;
                case 13: goto L_0x00e9;
                case 14: goto L_0x00b5;
                case 15: goto L_0x0075;
                case 16: goto L_0x003a;
                case 17: goto L_0x0025;
                case 18: goto L_0x0013;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x051a
        L_0x0013:
            java.lang.Object r0 = r1.f45391c
            com.umo.ads.o.zzc r0 = (com.umo.ads.p348o.zzc) r0
            mf0.C24362h.m61211f(r0, r7)
            android.os.Handler r2 = wb0.C13233c.f32843b
            gc0.d r3 = new gc0.d
            r3.<init>(r0, r5)
            r2.post(r3)
            return
        L_0x0025:
            java.lang.Object r0 = r1.f45391c
            gc0.b r0 = (gc0.C12724b) r0
            mf0.C24362h.m61211f(r0, r7)
            android.widget.ImageView r2 = r0.f31435l
            if (r2 != 0) goto L_0x0031
            goto L_0x0036
        L_0x0031:
            r3 = 8
            r2.setVisibility(r3)
        L_0x0036:
            r0.mo39533n()
            return
        L_0x003a:
            java.lang.Object r0 = r1.f45391c
            com.moovit.ticketing.purchase.itinerary.a r0 = (com.moovit.ticketing.purchase.itinerary.C7707a) r0
            com.moovit.ticketing.purchase.itinerary.a$a r2 = com.moovit.ticketing.purchase.itinerary.C7707a.f23404s
            r0.getClass()
            hq.b$a r2 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r3 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r2.<init>(r3)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r5 = "change_filters"
            r2.mo49939g(r3, r5)
            hq.b r2 = r2.mo49933a()
            r0.mo46797j2(r2)
            A r0 = r0.f40822c
            com.moovit.ticketing.purchase.PurchaseTicketActivity r0 = (com.moovit.ticketing.purchase.PurchaseTicketActivity) r0
            if (r0 == 0) goto L_0x0074
            androidx.fragment.app.FragmentManager r0 = r0.getSupportFragmentManager()
            int r2 = r0.mo3926D()
            if (r2 != 0) goto L_0x0069
            goto L_0x0074
        L_0x0069:
            androidx.fragment.app.FragmentManager$j r2 = r0.mo3925C(r4)
            int r2 = r2.getId()
            r0.mo3937R(r2, r4)
        L_0x0074:
            return
        L_0x0075:
            java.lang.Object r0 = r1.f45391c
            com.moovit.search.SearchLocationMapActivity r0 = (com.moovit.search.SearchLocationMapActivity) r0
            int r2 = com.moovit.search.SearchLocationMapActivity.f23138p0
            r0.getClass()
            hq.b$a r2 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r3 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r2.<init>(r3)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            r2.mo49939g(r3, r6)
            hq.b r2 = r2.mo49933a()
            r0.mo44545v2(r2)
            com.moovit.search.SearchLocationMapActivity$c r2 = r0.f23145n0
            com.moovit.commons.view.pager.ViewPager r3 = r0.f23142Z
            int r3 = r3.getCurrentLogicalItem()
            java.util.List<com.moovit.search.SearchLocationMapActivity$b> r2 = r2.f23150a
            java.lang.Object r2 = r2.get(r3)
            com.moovit.search.SearchLocationMapActivity$b r2 = (com.moovit.search.SearchLocationMapActivity.C7602b) r2
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            com.moovit.transit.LocationDescriptor r2 = r2.f23148b
            java.lang.String r4 = "selected_location_extra"
            r3.putExtra(r4, r2)
            r2 = -1
            r0.setResult(r2, r3)
            r0.finish()
            return
        L_0x00b5:
            java.lang.Object r2 = r1.f45391c
            a70.b r2 = (a70.C13396b) r2
            int r4 = a70.C13396b.f33246q
            r2.getClass()
            hq.b$a r4 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r5 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r4.<init>(r5)
            com.moovit.analytics.AnalyticsAttributeKey r5 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r6 = "view_wallet_center_clicked"
            r4.mo49939g(r5, r6)
            hq.b r4 = r4.mo49933a()
            r2.mo46797j2(r4)
            android.content.Context r0 = r22.getContext()
            int r4 = com.moovit.payment.wallet.center.WalletActivity.f42881l0
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<com.moovit.payment.wallet.center.WalletActivity> r5 = com.moovit.payment.wallet.center.WalletActivity.class
            r4.<init>(r0, r5)
            java.lang.String r0 = "tab"
            r4.putExtra(r0, r3)
            r2.startActivity(r4)
            return
        L_0x00e9:
            java.lang.Object r0 = r1.f45391c
            t60.f r0 = (t60.C19637f) r0
            int r2 = t60.C19637f.f49826h
            r0.getClass()
            hq.b$a r2 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r3 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r2.<init>(r3)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            r2.mo49939g(r3, r6)
            hq.b r2 = r2.mo49933a()
            r0.mo22564R1(r2)
            java.lang.Class<t60.f$a> r2 = t60.C19637f.C19638a.class
            s9.b r3 = new s9.b
            r4 = 14
            r3.<init>(r4)
            r0.mo46753L1(r2, r3)
            return
        L_0x0112:
            java.lang.Object r0 = r1.f45391c
            t60.a r0 = (t60.C19630a) r0
            int r2 = t60.C19630a.f49807u
            r0.getClass()
            hq.b$a r2 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r3 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r2.<init>(r3)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r4 = "certifications_upload"
            r2.mo49939g(r3, r4)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.ID
            com.moovit.payment.registration.steps.profile.PaymentProfile r4 = r0.f49808n
            com.moovit.network.model.ServerId r4 = r4.f42828b
            r2.mo49937e(r3, r4)
            hq.b r2 = r2.mo49933a()
            r0.mo46797j2(r2)
            androidx.fragment.app.FragmentManager r2 = r0.getChildFragmentManager()
            java.util.ArrayList r2 = w40.C25765g.m64314b(r2)
            java.lang.Class<t60.a$a> r3 = t60.C19630a.C19631a.class
            x.l0 r4 = new x.l0
            r5 = 17
            r4.<init>(r2, r5)
            r0.mo46786U1(r3, r4)
            return
        L_0x014e:
            java.lang.Object r0 = r1.f45391c
            r60.e r0 = (r60.C19234e) r0
            com.moovit.design.view.PinCodeView r2 = r0.f48846D
            java.lang.String r2 = r2.getPinCode()
            r0.mo51654n2(r2, r4)
            return
        L_0x015c:
            java.lang.Object r0 = r1.f45391c
            q60.b r0 = (q60.C19088b) r0
            int r2 = q60.C19088b.f48519z
            r0.getClass()
            hq.b$a r2 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r3 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r2.<init>(r3)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r5 = "update_pango_credit_card_clicked"
            r2.mo49939g(r3, r5)
            hq.b r2 = r2.mo49933a()
            r0.mo46797j2(r2)
            r0.mo51521n2(r4)
            return
        L_0x017e:
            java.lang.Object r0 = r1.f45391c
            n60.a r0 = (n60.C18527a) r0
            int r2 = n60.C18527a.f47157A
            r0.getClass()
            hq.b$a r2 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r3 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r2.<init>(r3)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r4 = "resend_code"
            r2.mo49939g(r3, r4)
            hq.b r2 = r2.mo49933a()
            r0.mo46797j2(r2)
            h60.i0 r2 = new h60.i0
            c70.e r3 = r0.mo46783R1()
            java.lang.String r4 = r0.f47160p
            java.lang.String r6 = r0.f47161q
            r2.<init>(r3, r4, r6)
            java.lang.String r3 = r2.mo49833O()
            com.moovit.request.RequestOptions r4 = r0.mo46777L1()
            r4.f42909f = r5
            n60.a$a r5 = r0.f47158n
            r0.mo46793f2(r3, r2, r4, r5)
            return
        L_0x01b9:
            java.lang.Object r0 = r1.f45391c
            l60.a r0 = (l60.C18176a) r0
            b00.a r2 = r0.f46420t
            if (r2 == 0) goto L_0x01c2
            goto L_0x0238
        L_0x01c2:
            com.moovit.payment.registration.PaymentRegistrationInfo r2 = r0.mo50499o2()
            com.moovit.view.address.AddressInputView r3 = r0.f46419s
            com.moovit.view.address.Address r3 = r3.mo24775s(r5, r5)
            r2.f42757o = r3
            java.lang.String r6 = "address"
            if (r3 != 0) goto L_0x01eb
            hq.b$a r2 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r3 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r2.<init>(r3)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            r2.mo49939g(r3, r6)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.SUCCESS
            r2.mo49941i(r3, r4)
            hq.b r2 = r2.mo49933a()
            r0.mo46797j2(r2)
            goto L_0x0238
        L_0x01eb:
            hq.b$a r3 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r4 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r3.<init>(r4)
            com.moovit.analytics.AnalyticsAttributeKey r4 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            r3.mo49939g(r4, r6)
            com.moovit.analytics.AnalyticsAttributeKey r4 = com.moovit.analytics.AnalyticsAttributeKey.SUCCESS
            r3.mo49941i(r4, r5)
            hq.b r3 = r3.mo49933a()
            r0.mo46797j2(r3)
            r0.mo50507x2()
            h60.x0 r3 = new h60.x0
            c70.e r4 = r0.mo46783R1()
            com.moovit.view.address.Address r2 = r2.f42757o
            r3.<init>(r4, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class<h60.x0> r4 = h60.C17369x0.class
            java.lang.String r6 = "_"
            p379.C13715c.m34249o(r4, r2, r6)
            RO r4 = r3.f33922v
            int r4 = p583jk.C17884p.m44335F(r4)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.moovit.request.RequestOptions r4 = r0.mo46777L1()
            r4.f42909f = r5
            l60.a$a r5 = r0.f46418r
            b00.a r2 = r0.mo46793f2(r2, r3, r4, r5)
            r0.f46420t = r2
        L_0x0238:
            return
        L_0x0239:
            java.lang.Object r0 = r1.f45391c
            com.moovit.payment.account.paymentmethod.PaymentAccountPaymentMethodsFragment$a r0 = (com.moovit.payment.account.paymentmethod.PaymentAccountPaymentMethodsFragment.C25685a) r0
            com.moovit.payment.account.paymentmethod.PaymentAccountPaymentMethodsFragment r0 = com.moovit.payment.account.paymentmethod.PaymentAccountPaymentMethodsFragment.this
            com.moovit.payment.account.paymentmethod.PaymentAccountPaymentMethodsFragment.m64193m2(r0)
            return
        L_0x0243:
            java.lang.Object r2 = r1.f45391c
            com.moovit.micromobility.integration.MicroMobilityIntegrationView r2 = (com.moovit.micromobility.integration.MicroMobilityIntegrationView) r2
            int r4 = com.moovit.micromobility.integration.MicroMobilityIntegrationView.f14885g
            r2.getClass()
            int r4 = l30.C5597z.view_tag_param1
            java.lang.Object r4 = r0.getTag(r4)
            com.moovit.micromobility.MicroMobilityIntegrationItem r4 = (com.moovit.micromobility.MicroMobilityIntegrationItem) r4
            int r6 = l30.C5597z.view_tag_param2
            java.lang.Object r0 = r0.getTag(r6)
            com.moovit.micromobility.MicroMobilityIntegrationFlow r0 = (com.moovit.micromobility.MicroMobilityIntegrationFlow) r0
            com.moovit.micromobility.integration.MicroMobilityIntegrationView$c r6 = r2.f14890f
            if (r6 == 0) goto L_0x02a5
            if (r4 == 0) goto L_0x02a5
            if (r0 == 0) goto L_0x02a5
            z20.a$a r6 = new z20.a$a
            java.lang.String r7 = "purchase_intent"
            r6.<init>(r7)
            java.lang.String r7 = "micro_mobility"
            java.lang.String r9 = "feature"
            r6.mo52934b(r7, r9)
            int[] r7 = x20.C20447a.f51789b
            int r9 = r0.ordinal()
            r7 = r7[r9]
            if (r7 == r5) goto L_0x0288
            if (r7 == r8) goto L_0x0285
            r5 = 3
            if (r7 == r5) goto L_0x0282
            goto L_0x028a
        L_0x0282:
            java.lang.String r3 = "unlock"
            goto L_0x028a
        L_0x0285:
            java.lang.String r3 = "reserve"
            goto L_0x028a
        L_0x0288:
            java.lang.String r3 = "open_app"
        L_0x028a:
            java.lang.String r5 = "type"
            r6.mo52934b(r3, r5)
            java.lang.String r3 = r4.f14812b
            java.lang.String r5 = "provider_id"
            r6.mo52934b(r3, r5)
            java.lang.String r3 = r4.f14813c
            java.lang.String r5 = "item_id"
            r6.mo52934b(r3, r5)
            r6.mo52935c()
            com.moovit.micromobility.integration.MicroMobilityIntegrationView$c r2 = r2.f14890f
            r2.mo19495m(r4, r0)
        L_0x02a5:
            return
        L_0x02a6:
            java.lang.Object r0 = r1.f45391c
            r2 = r0
            com.moovit.app.useraccount.providers.facebook.FacebookConnectProviderFragment r2 = (com.moovit.app.useraccount.providers.facebook.FacebookConnectProviderFragment) r2
            java.lang.String[] r0 = com.moovit.app.useraccount.providers.facebook.FacebookConnectProviderFragment.f40648f
            r2.mo50584J1()
            com.facebook.login.m r5 = com.facebook.login.C2483m.m6517a()
            java.lang.String[] r0 = r2.f40650d
            if (r0 != 0) goto L_0x02ba
            java.lang.String[] r0 = com.moovit.app.useraccount.providers.facebook.FacebookConnectProviderFragment.f40648f
        L_0x02ba:
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.lang.String r6 = "permissions"
            mf0.C24362h.m61211f(r0, r6)
            java.util.Iterator r7 = r0.iterator()
        L_0x02c7:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x02ea
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            com.facebook.login.m$a r9 = com.facebook.login.C2483m.f8876f
            boolean r9 = com.facebook.login.C2483m.C2484a.m6520a(r8)
            if (r9 != 0) goto L_0x02dc
            goto L_0x02c7
        L_0x02dc:
            com.facebook.FacebookException r0 = new com.facebook.FacebookException
            java.lang.String r2 = "Cannot pass a publish or manage permission ("
            java.lang.String r3 = ") to a request for read authorization"
            java.lang.String r2 = p358af.C13437d.m33706k(r2, r8, r3)
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x02ea:
            com.facebook.login.h r7 = new com.facebook.login.h
            r7.<init>(r0)
            com.facebook.login.CodeChallengeMethod r0 = com.facebook.login.CodeChallengeMethod.S256
            java.lang.String r8 = r7.f8861c     // Catch:{ FacebookException -> 0x02f8 }
            java.lang.String r8 = com.facebook.login.C2488p.m6522a(r8, r0)     // Catch:{ FacebookException -> 0x02f8 }
            goto L_0x02fc
        L_0x02f8:
            com.facebook.login.CodeChallengeMethod r0 = com.facebook.login.CodeChallengeMethod.PLAIN
            java.lang.String r8 = r7.f8861c
        L_0x02fc:
            r20 = r0
            r19 = r8
            com.facebook.login.LoginClient$Request r8 = new com.facebook.login.LoginClient$Request
            com.facebook.login.LoginBehavior r10 = r5.f8879a
            java.util.Set<java.lang.String> r0 = r7.f8859a
            java.util.Set r11 = kotlin.collections.C23825c.m58503O0(r0)
            com.facebook.login.DefaultAudience r12 = r5.f8880b
            java.lang.String r13 = r5.f8882d
            java.lang.String r14 = p009a8.C0115o.m211b()
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r15 = r0.toString()
            java.lang.String r0 = "randomUUID().toString()"
            mf0.C24362h.m61210e(r15, r0)
            com.facebook.login.LoginTargetApp r0 = r5.f8883e
            java.lang.String r9 = r7.f8860b
            java.lang.String r7 = r7.f8861c
            r17 = r9
            r9 = r8
            r16 = r0
            r18 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            java.util.Date r0 = com.facebook.AccessToken.f8348m
            boolean r0 = com.facebook.AccessToken.C2266c.m6111c()
            r8.f8803g = r0
            r8.f8807k = r3
            r8.f8808l = r4
            r8.f8810n = r4
            r8.f8811o = r4
            androidx.fragment.app.FragmentActivity r3 = r2.getActivity()
            com.facebook.login.m$b r0 = com.facebook.login.C2483m.C2485b.f8884a
            com.facebook.login.j r7 = r0.mo12703a(r3)
            if (r7 == 0) goto L_0x03c4
            boolean r0 = r8.f8810n
            if (r0 == 0) goto L_0x0352
            java.lang.String r0 = "foa_mobile_login_start"
            goto L_0x0354
        L_0x0352:
            java.lang.String r0 = "fb_mobile_login_start"
        L_0x0354:
            boolean r9 = p262t8.C6606a.m15601b(r7)
            if (r9 == 0) goto L_0x035b
            goto L_0x03c4
        L_0x035b:
            java.util.concurrent.ScheduledExecutorService r9 = com.facebook.login.C2479j.f8869d     // Catch:{ all -> 0x03c0 }
            java.lang.String r9 = r8.f8802f     // Catch:{ all -> 0x03c0 }
            android.os.Bundle r9 = com.facebook.login.C2479j.C2480a.m6514a(r9)     // Catch:{ all -> 0x03c0 }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x03ba }
            r10.<init>()     // Catch:{ JSONException -> 0x03ba }
            java.lang.String r11 = "login_behavior"
            com.facebook.login.LoginBehavior r12 = r8.f8798b     // Catch:{ JSONException -> 0x03ba }
            java.lang.String r12 = r12.toString()     // Catch:{ JSONException -> 0x03ba }
            r10.put(r11, r12)     // Catch:{ JSONException -> 0x03ba }
            java.lang.String r11 = "request_code"
            com.facebook.internal.CallbackManagerImpl$RequestCodeOffset r12 = com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.Login     // Catch:{ JSONException -> 0x03ba }
            int r12 = r12.toRequestCode()     // Catch:{ JSONException -> 0x03ba }
            r10.put(r11, r12)     // Catch:{ JSONException -> 0x03ba }
            java.lang.String r11 = ","
            java.util.Set<java.lang.String> r12 = r8.f8799c     // Catch:{ JSONException -> 0x03ba }
            java.lang.String r11 = android.text.TextUtils.join(r11, r12)     // Catch:{ JSONException -> 0x03ba }
            r10.put(r6, r11)     // Catch:{ JSONException -> 0x03ba }
            java.lang.String r6 = "default_audience"
            com.facebook.login.DefaultAudience r11 = r8.f8800d     // Catch:{ JSONException -> 0x03ba }
            java.lang.String r11 = r11.toString()     // Catch:{ JSONException -> 0x03ba }
            r10.put(r6, r11)     // Catch:{ JSONException -> 0x03ba }
            java.lang.String r6 = "isReauthorize"
            boolean r11 = r8.f8803g     // Catch:{ JSONException -> 0x03ba }
            r10.put(r6, r11)     // Catch:{ JSONException -> 0x03ba }
            java.lang.String r6 = r7.f8872c     // Catch:{ JSONException -> 0x03ba }
            if (r6 == 0) goto L_0x03a4
            java.lang.String r11 = "facebookVersion"
            r10.put(r11, r6)     // Catch:{ JSONException -> 0x03ba }
        L_0x03a4:
            com.facebook.login.LoginTargetApp r6 = r8.f8809m     // Catch:{ JSONException -> 0x03ba }
            if (r6 == 0) goto L_0x03b1
            java.lang.String r11 = "target_app"
            java.lang.String r6 = r6.toString()     // Catch:{ JSONException -> 0x03ba }
            r10.put(r11, r6)     // Catch:{ JSONException -> 0x03ba }
        L_0x03b1:
            java.lang.String r6 = "6_extras"
            java.lang.String r10 = r10.toString()     // Catch:{ JSONException -> 0x03ba }
            r9.putString(r6, r10)     // Catch:{ JSONException -> 0x03ba }
        L_0x03ba:
            com.facebook.appevents.p r6 = r7.f8871b     // Catch:{ all -> 0x03c0 }
            r6.mo12509a(r9, r0)     // Catch:{ all -> 0x03c0 }
            goto L_0x03c4
        L_0x03c0:
            r0 = move-exception
            p262t8.C6606a.m15600a(r7, r0)
        L_0x03c4:
            com.facebook.internal.CallbackManagerImpl$b r0 = com.facebook.internal.CallbackManagerImpl.f8585b
            com.facebook.internal.CallbackManagerImpl$RequestCodeOffset r6 = com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.Login
            int r7 = r6.toRequestCode()
            com.facebook.login.l r9 = new com.facebook.login.l
            r9.<init>(r5)
            r0.mo12523a(r7, r9)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            android.content.Context r5 = p009a8.C0115o.m210a()
            java.lang.Class<com.facebook.FacebookActivity> r7 = com.facebook.FacebookActivity.class
            r0.setClass(r5, r7)
            com.facebook.login.LoginBehavior r5 = r8.f8798b
            java.lang.String r5 = r5.toString()
            r0.setAction(r5)
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r7 = "request"
            r5.putParcelable(r7, r8)
            java.lang.String r7 = "com.facebook.LoginFragment:Request"
            r0.putExtra(r7, r5)
            android.content.Context r5 = p009a8.C0115o.m210a()
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            android.content.pm.ResolveInfo r5 = r5.resolveActivity(r0, r4)
            if (r5 == 0) goto L_0x040a
            r5 = 1
            goto L_0x040b
        L_0x040a:
            r5 = 0
        L_0x040b:
            if (r5 != 0) goto L_0x040e
            goto L_0x0418
        L_0x040e:
            int r5 = r6.toRequestCode()     // Catch:{ ActivityNotFoundException -> 0x0417 }
            r2.startActivityForResult(r0, r5)     // Catch:{ ActivityNotFoundException -> 0x0417 }
            r4 = 1
            goto L_0x0418
        L_0x0417:
        L_0x0418:
            if (r4 == 0) goto L_0x041b
            return
        L_0x041b:
            com.facebook.FacebookException r0 = new com.facebook.FacebookException
            java.lang.String r2 = "Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest."
            r0.<init>((java.lang.String) r2)
            r12 = 0
            com.facebook.login.LoginClient$Result$Code r9 = com.facebook.login.LoginClient.Result.Code.ERROR
            r10 = 0
            r2 = r8
            r8 = r3
            r11 = r0
            r13 = r2
            com.facebook.login.C2483m.m6518b(r8, r9, r10, r11, r12, r13)
            throw r0
        L_0x042e:
            java.lang.Object r0 = r1.f45391c
            com.moovit.app.tripplanner.c r0 = (com.moovit.app.tripplanner.C15584c) r0
            int r2 = com.moovit.app.tripplanner.C15584c.f40541o
            r0.getClass()
            hq.b r2 = new hq.b
            com.moovit.analytics.AnalyticsEventKey r4 = com.moovit.analytics.AnalyticsEventKey.SEARCH_ROUTES_CLICKED
            r2.<init>(r4)
            r0.mo46797j2(r2)
            android.animation.AnimatorSet r2 = r0.f40542n
            if (r2 == 0) goto L_0x044a
            r2.end()
            r0.f40542n = r3
        L_0x044a:
            java.lang.Class<com.moovit.app.tripplanner.c$a> r2 = com.moovit.app.tripplanner.C15584c.C15585a.class
            com.facebook.appevents.l r3 = new com.facebook.appevents.l
            r4 = 12
            r3.<init>(r4)
            r0.mo46786U1(r2, r3)
            return
        L_0x0457:
            java.lang.Object r2 = r1.f45391c
            com.moovit.app.tod.bottomsheet.stateviews.TodAutonomousRideWaitingAtPickupView r2 = (com.moovit.app.tod.bottomsheet.stateviews.TodAutonomousRideWaitingAtPickupView) r2
            int r4 = com.moovit.app.tod.bottomsheet.stateviews.TodAutonomousRideWaitingAtPickupView.f40162r
            r2.getClass()
            java.lang.Object r0 = r22.getTag()
            com.moovit.app.tod.model.TodRideVehicleAction r0 = (com.moovit.app.tod.model.TodRideVehicleAction) r0
            if (r0 == 0) goto L_0x0499
            com.airbnb.lottie.LottieAnimationView r4 = r2.f40165f
            com.moovit.app.tod.model.TodRide r5 = r2.getCurrentRide()
            if (r5 != 0) goto L_0x0471
            goto L_0x0496
        L_0x0471:
            int[] r6 = com.moovit.app.tod.bottomsheet.stateviews.TodAutonomousRideWaitingAtPickupView.C15481b.f40178a
            int r7 = r0.ordinal()
            r6 = r6[r7]
            r7 = 1
            if (r6 == r7) goto L_0x0482
            if (r6 == r8) goto L_0x047f
            goto L_0x0484
        L_0x047f:
            com.moovit.app.animation.LocalAnimation r3 = com.moovit.app.animation.LocalAnimation.CAR_FLASH
            goto L_0x0484
        L_0x0482:
            com.moovit.app.animation.LocalAnimation r3 = com.moovit.app.animation.LocalAnimation.CAR_BEEP
        L_0x0484:
            if (r3 == 0) goto L_0x0496
            com.moovit.app.animation.AnimationPlayer r5 = r5.f40280r
            ar.a r6 = p370ar.C13506a.f33421c
            r5.mo44768c(r4, r3, r6)
            com.moovit.app.tod.bottomsheet.stateviews.TodAutonomousRideWaitingAtPickupView$a r3 = r2.f40176q
            com.airbnb.lottie.l r4 = r4.f6419f
            h5.d r4 = r4.f6483d
            r4.addListener(r3)
        L_0x0496:
            p379.C13555b.m33964c(r2, r0)
        L_0x0499:
            return
        L_0x049a:
            java.lang.Object r0 = r1.f45391c
            ax.f r0 = (p376ax.C13544f) r0
            int r2 = p376ax.C13544f.f33477u
            r0.mo40431y2()
            return
        L_0x04a4:
            java.lang.Object r0 = r1.f45391c
            xw.a r0 = (p927xw.C20632a) r0
            int r2 = p927xw.C20632a.f52163h
            r0.getClass()
            hq.b$a r2 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r3 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r2.<init>(r3)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r4 = "cancel_clicked"
            r2.mo49939g(r3, r4)
            hq.b r2 = r2.mo49933a()
            r0.mo22564R1(r2)
            java.lang.Class<com.moovit.app.tod.order.TodOrderActivity> r2 = com.moovit.app.tod.order.TodOrderActivity.class
            com.facebook.appevents.l r3 = new com.facebook.appevents.l
            r4 = 11
            r3.<init>(r4)
            r0.mo46753L1(r2, r3)
            r0.dismissAllowingStateLoss()
            return
        L_0x04d2:
            java.lang.Object r2 = r1.f45391c
            iw.f r2 = (p572iw.C17663f) r2
            int r3 = p572iw.C17663f.f45392x
            android.content.Context r3 = r2.requireContext()
            java.lang.String r4 = "CONFIGURATION"
            java.lang.Object r4 = r2.mo46776J1(r4)
            q00.a r4 = (q00.C19047a) r4
            vr.a$i r5 = p874vr.C20199a.f51257S0
            java.lang.Object r4 = r4.mo51505b(r5)
            java.util.List r4 = (java.util.List) r4
            iw.a r5 = new iw.a
            r5.<init>(r3, r4)
            com.moovit.view.dialogs.DropDownListPopup r4 = new com.moovit.view.dialogs.DropDownListPopup
            r4.<init>(r3)
            r4.setAdapter(r5)
            r3 = 1
            r4.setModal(r3)
            r4.setAnchorView(r0)
            bv.a r0 = new bv.a
            r0.<init>(r2, r4, r3)
            r4.setOnItemClickListener(r0)
            r4.show()
            hq.b$a r0 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r3 = com.moovit.analytics.AnalyticsEventKey.EDIT_TIME_CLICKED
            r0.<init>(r3)
            hq.b r0 = r0.mo49933a()
            r2.mo46797j2(r0)
            return
        L_0x051a:
            java.lang.Object r0 = r1.f45391c
            kc0.i r0 = (kc0.C12844i) r0
            int r2 = kc0.C12844i.f31735I
            mf0.C24362h.m61211f(r0, r7)
            r0.mo39691j()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p572iw.C17662e.onClick(android.view.View):void");
    }
}
