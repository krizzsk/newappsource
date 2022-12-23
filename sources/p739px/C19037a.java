package p739px;

import android.view.View;

/* renamed from: px.a */
public final /* synthetic */ class C19037a implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f48411b;

    /* renamed from: c */
    public final /* synthetic */ Object f48412c;

    public /* synthetic */ C19037a(Object obj, int i) {
        this.f48411b = i;
        this.f48412c = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: com.moovit.micromobility.purchase.step.filter.MicroMobilityPurchaseFilter} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v27, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r2v50 */
    /* JADX WARNING: type inference failed for: r2v51 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r11) {
        /*
            r10 = this;
            int r0 = r10.f48411b
            r1 = 0
            r2 = 0
            r3 = 1
            java.lang.String r4 = "this$0"
            java.lang.String r5 = "continue_clicked"
            switch(r0) {
                case 0: goto L_0x04f8;
                case 1: goto L_0x04ec;
                case 2: goto L_0x04cc;
                case 3: goto L_0x04c4;
                case 4: goto L_0x0432;
                case 5: goto L_0x03e3;
                case 6: goto L_0x035a;
                case 7: goto L_0x034e;
                case 8: goto L_0x02b4;
                case 9: goto L_0x02aa;
                case 10: goto L_0x0265;
                case 11: goto L_0x0233;
                case 12: goto L_0x0229;
                case 13: goto L_0x01e7;
                case 14: goto L_0x017d;
                case 15: goto L_0x012d;
                case 16: goto L_0x00f3;
                case 17: goto L_0x00c9;
                case 18: goto L_0x0067;
                case 19: goto L_0x005c;
                case 20: goto L_0x000e;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0556
        L_0x000e:
            java.lang.Object r11 = r10.f48412c
            kc0.b r11 = (kc0.C12836b) r11
            int r0 = kc0.C12836b.f31706o
            mf0.C24362h.m61211f(r11, r4)
            kc0.b$a r0 = r11.f31708e
            if (r0 != 0) goto L_0x001c
            goto L_0x005b
        L_0x001c:
            java.lang.String r11 = r11.f31707d
            hc0.a r0 = (hc0.C12751a) r0
            java.lang.String r1 = "spotId"
            mf0.C24362h.m61211f(r11, r1)
            ch.qos.logback.classic.Logger r1 = ac0.C7557a.f23040a
            boolean r3 = nc0.C12954d.m32800c(r11)
            if (r3 == 0) goto L_0x0032
            java.lang.String r3 = p584jl.C17885a.m44403H0(r11)
            goto L_0x0034
        L_0x0032:
            java.lang.String r3 = ""
        L_0x0034:
            java.lang.String r4 = "HTML_AD: onHtmlAdDismissed"
            java.lang.String r3 = mf0.C24362h.m61216k(r3, r4)
            r1.mo6666c(r3)
            boolean r1 = r0.mo39548f()
            if (r1 == 0) goto L_0x004c
            vb0.c r0 = r0.f31500e
            if (r0 != 0) goto L_0x0048
            goto L_0x005b
        L_0x0048:
            r0.zzu(r11)
            goto L_0x005b
        L_0x004c:
            com.umo.ads.u.zzk r1 = com.umo.ads.p350u.zzk.BROADCAST_ACTION_INTERSTITIAL_DISMISS
            r0.mo39545c(r1, r2)
            hc0.a$a r0 = r0.f31498c
            if (r0 != 0) goto L_0x0056
            goto L_0x005b
        L_0x0056:
            com.cubic.umo.ad.playback.ui.activities.AKInterstitialAdActivity r0 = (com.cubic.umo.p045ad.playback.p046ui.activities.AKInterstitialAdActivity) r0
            r0.mo11140b1(r11)
        L_0x005b:
            return
        L_0x005c:
            java.lang.Object r11 = r10.f48412c
            com.umo.ads.o.zzc r11 = (com.umo.ads.p348o.zzc) r11
            mf0.C24362h.m61211f(r11, r4)
            r11.mo35799G()
            return
        L_0x0067:
            java.lang.Object r11 = r10.f48412c
            ga0.d r11 = (ga0.C12699d) r11
            int r0 = ga0.C12699d.f31352C
            android.app.Dialog r0 = r11.getDialog()
            if (r0 != 0) goto L_0x0074
            goto L_0x00c8
        L_0x0074:
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            r4 = 13
            r2.set(r4, r1)
            r4 = 14
            r2.set(r4, r1)
            android.widget.TimePicker r4 = r11.f31356u
            r5 = 11
            int r5 = r2.get(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.setCurrentHour(r5)
            android.widget.TimePicker r4 = r11.f31356u
            r5 = 12
            int r2 = r2.get(r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.setCurrentMinute(r2)
            int r2 = p824tp.C19740r.day_picker
            android.view.View r0 = r0.findViewById(r2)
            boolean r2 = r0 instanceof com.moovit.design.view.TextPicker
            if (r2 == 0) goto L_0x00b4
            com.moovit.design.view.TextPicker r0 = (com.moovit.design.view.TextPicker) r0
            int r2 = r11.mo39479Y1()
            r0.setDisplayedTextIndex(r2)
            goto L_0x00c1
        L_0x00b4:
            boolean r2 = r0 instanceof com.moovit.view.pickers.WheelView
            if (r2 == 0) goto L_0x00c1
            com.moovit.view.pickers.WheelView r0 = (com.moovit.view.pickers.WheelView) r0
            int r2 = r11.mo39479Y1()
            r0.mo24857f(r2, r3)
        L_0x00c1:
            r11.f31361z = r3
            android.widget.Button r11 = r11.f31357v
            r11.setEnabled(r1)
        L_0x00c8:
            return
        L_0x00c9:
            java.lang.Object r0 = r10.f48412c
            com.moovit.ticketing.ticket.g r0 = (com.moovit.ticketing.ticket.C7762g) r0
            int r1 = com.moovit.ticketing.ticket.C7762g.f23551y
            r0.getClass()
            hq.b$a r1 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r2 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r1.<init>(r2)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r3 = "view_tickets_center_clicked"
            r1.mo49939g(r2, r3)
            hq.b r1 = r1.mo49933a()
            r0.mo46797j2(r1)
            android.content.Context r11 = r11.getContext()
            android.content.Intent r11 = com.moovit.ticketing.wallet.UserWalletActivity.m17744y2(r11)
            r0.startActivity(r11)
            return
        L_0x00f3:
            java.lang.Object r11 = r10.f48412c
            f90.g r11 = (f90.C12647g) r11
            com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueOtherAmount r0 = r11.f31264i
            com.moovit.util.CurrencyAmount r0 = r0.f23439b
            java.lang.String r0 = r0.f23844b
            java.math.BigDecimal r2 = new java.math.BigDecimal
            com.google.android.material.textfield.TextInputLayout r3 = r11.f31266k
            android.widget.EditText r3 = r3.getEditText()
            android.text.Editable r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            com.moovit.util.CurrencyAmount r3 = new com.moovit.util.CurrencyAmount
            r3.<init>(r0, r2)
            com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueAmount r0 = new com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueAmount
            com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueOtherAmount r2 = r11.f31264i
            java.lang.String r4 = r2.f23441d
            java.lang.String r2 = r2.f23442e
            r0.<init>(r3, r4, r2, r1)
            java.lang.Class<f90.d> r1 = f90.C12642d.class
            c0.d r2 = new c0.d
            r3 = 8
            r2.<init>(r3, r11, r0)
            r11.mo46753L1(r1, r2)
            return
        L_0x012d:
            java.lang.Object r0 = r10.f48412c
            e90.b$b r0 = (e90.C12618b.C12620b) r0
            r0.getClass()
            java.lang.Object r11 = r11.getTag()
            com.moovit.ticketing.purchase.station.PurchaseStation r11 = (com.moovit.ticketing.purchase.station.PurchaseStation) r11
            if (r11 == 0) goto L_0x017c
            e90.b r0 = e90.C12618b.this
            int r1 = e90.C12618b.f31181w
            Step r1 = r0.f32728o
            com.moovit.ticketing.purchase.station.PurchaseStationSelectionStep r1 = (com.moovit.ticketing.purchase.station.PurchaseStationSelectionStep) r1
            com.moovit.ticketing.purchase.station.PurchaseStationSelectionStepResult r2 = new com.moovit.ticketing.purchase.station.PurchaseStationSelectionStepResult
            java.lang.String r3 = r1.f23246b
            java.lang.String r4 = r1.f23423e
            java.lang.String r5 = r11.f23419b
            r2.<init>(r3, r4, r5)
            hq.b$a r3 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r4 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r3.<init>(r4)
            com.moovit.analytics.AnalyticsAttributeKey r4 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r5 = "item_selected"
            r3.mo49939g(r4, r5)
            com.moovit.analytics.AnalyticsAttributeKey r4 = com.moovit.analytics.AnalyticsAttributeKey.SELECTED_ID
            java.lang.String r5 = r2.f23428d
            r3.mo49939g(r4, r5)
            com.moovit.analytics.AnalyticsAttributeKey r4 = com.moovit.analytics.AnalyticsAttributeKey.SELECTED_CAPTION
            java.lang.String r11 = r11.f23420c
            r3.mo49939g(r4, r11)
            com.moovit.analytics.AnalyticsAttributeKey r11 = com.moovit.analytics.AnalyticsAttributeKey.SELECTED_TYPE
            java.lang.String r1 = r1.f23247c
            r3.mo49939g(r11, r1)
            hq.b r11 = r3.mo49933a()
            r0.mo46797j2(r11)
            r0.mo40058n2(r2)
        L_0x017c:
            return
        L_0x017d:
            java.lang.Object r11 = r10.f48412c
            v60.a r11 = (v60.C20102a) r11
            int r0 = v60.C20102a.f51015r
            r11.getClass()
            hq.b$a r0 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r0.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r4 = "send_sms_clicked"
            r0.mo49939g(r1, r4)
            hq.b r0 = r0.mo49933a()
            r11.mo46797j2(r0)
            w40.d r0 = w40.C25761d.m64299a()
            f00.g$b r1 = w40.C25761d.f64267d
            android.content.SharedPreferences r4 = r0.mo83589d()
            java.lang.Object r1 = r1.mo19759a(r4)
            com.moovit.payment.registration.AccountAuthType r1 = (com.moovit.payment.registration.AccountAuthType) r1
            java.lang.String r0 = r0.mo83588c()
            com.moovit.payment.registration.PaymentRegistrationInfo r4 = r11.mo50499o2()
            r4.f42745c = r1
            r4.f42746d = r2
            com.moovit.payment.registration.AccountAuthType r5 = com.moovit.payment.registration.AccountAuthType.PHONE
            if (r1 != r5) goto L_0x01c7
            android.content.Context r1 = r11.requireContext()
            com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.NATIONAL
            java.lang.String r0 = ba0.C7568e.m17311a(r1, r0, r5)
            r4.f42750h = r0
        L_0x01c7:
            h60.z r0 = new h60.z
            c70.e r1 = r11.mo46783R1()
            com.moovit.payment.registration.PaymentRegistrationInstructions r4 = r11.mo50500p2()
            java.lang.String r4 = r4.f42758b
            r0.<init>(r1, r4)
            java.lang.String r1 = r0.mo49839O()
            com.moovit.request.RequestOptions r4 = r11.mo46777L1()
            r4.f42909f = r3
            r11.mo46793f2(r1, r0, r4, r2)
            r11.mo50504u2(r2)
            return
        L_0x01e7:
            java.lang.Object r11 = r10.f48412c
            t60.c r11 = (t60.C19633c) r11
            int r0 = t60.C19633c.f49816t
            r11.getClass()
            hq.b$a r0 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r2 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r0.<init>(r2)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r4 = "take_photo_clicked"
            r0.mo49939g(r2, r4)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.ID
            com.moovit.payment.registration.steps.profile.certificate.ProfileCertificationPhotoSpec r4 = r11.f49817p
            java.lang.String r4 = r4.f42853b
            r0.mo49939g(r2, r4)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.STATUS
            com.moovit.payment.registration.steps.profile.certificate.ProfileCertificationPhotoSpec r4 = r11.f49817p
            com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus r4 = r4.f42854c
            r0.mo49938f(r2, r4)
            hq.b r0 = r0.mo49933a()
            r11.mo46797j2(r0)
            com.moovit.payment.registration.steps.profile.certificate.ProfileCertificationPhotoSpec r0 = r11.f49817p
            java.lang.String r0 = r0.f42853b
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>(r3)
            java.lang.String r4 = "certificate_id"
            r2.putString(r4, r0)
            r11.mo48181u2(r3, r1, r2)
            return
        L_0x0229:
            java.lang.Object r11 = r10.f48412c
            k60.c r11 = (k60.C18002c) r11
            int r0 = k60.C18002c.f46095y
            r11.mo50510y2()
            return
        L_0x0233:
            java.lang.Object r11 = r10.f48412c
            com.moovit.payment.confirmation.summary.PaymentSummaryFragment r11 = (com.moovit.payment.confirmation.summary.PaymentSummaryFragment) r11
            int r0 = com.moovit.payment.confirmation.summary.PaymentSummaryFragment.f42621s
            com.moovit.design.dialog.AlertDialogFragment$a r0 = new com.moovit.design.dialog.AlertDialogFragment$a
            android.content.Context r3 = r11.requireContext()
            r0.<init>((android.content.Context) r3)
            int r3 = v40.C25749d.img_information_sign
            r0.mo47676e(r3, r1)
            int r1 = v40.C25754i.payment_sum_total_disclaimer
            com.moovit.design.dialog.AlertDialogFragment$a r0 = r0.mo47678g(r1)
            int r1 = v40.C25754i.got_it
            if (r1 != 0) goto L_0x0252
            goto L_0x0258
        L_0x0252:
            android.content.res.Resources r2 = r0.f41327a
            java.lang.CharSequence r2 = r2.getText(r1)
        L_0x0258:
            java.lang.String r1 = "neutralButton"
            r0.mo47672a(r2, r1)
            com.moovit.design.dialog.AlertDialogFragment r0 = r0.mo47673b()
            r11.mo46795h2(r0)
            return
        L_0x0265:
            java.lang.Object r11 = r10.f48412c
            g50.b r11 = (g50.C25728b) r11
            int r0 = g50.C25728b.f64159n
            r11.getClass()
            hq.b$a r0 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r0.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            r0.mo49939g(r1, r5)
            hq.b r0 = r0.mo49933a()
            r11.mo46797j2(r0)
            android.os.Bundle r0 = r11.mo46782Q1()
            java.lang.String r1 = "profile"
            android.os.Parcelable r0 = r0.getParcelable(r1)
            com.moovit.payment.registration.steps.profile.PaymentProfile r0 = (com.moovit.payment.registration.steps.profile.PaymentProfile) r0
            if (r0 == 0) goto L_0x02a9
            A r11 = r11.f40822c
            com.moovit.payment.account.profile.PaymentAccountAddProfileActivity r11 = (com.moovit.payment.account.profile.PaymentAccountAddProfileActivity) r11
            r11.getClass()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r2.putParcelable(r1, r0)
            g50.a r0 = new g50.a
            r0.<init>()
            r0.setArguments(r2)
            r11.mo83550z2(r0, r3)
        L_0x02a9:
            return
        L_0x02aa:
            java.lang.Object r11 = r10.f48412c
            com.moovit.payment.account.deposit.DepositActivity r11 = (com.moovit.payment.account.deposit.DepositActivity) r11
            int r0 = com.moovit.payment.account.deposit.DepositActivity.f63947m0
            r11.mo83441s0()
            return
        L_0x02b4:
            java.lang.Object r0 = r10.f48412c
            com.moovit.micromobility.purchase.step.filter.a r0 = (com.moovit.micromobility.purchase.step.filter.C4173a) r0
            com.moovit.micromobility.purchase.step.filter.a$b r1 = r0.f14957p
            int r3 = r1.f14963k
            r4 = -1
            if (r3 == r4) goto L_0x02c6
            java.lang.Object r1 = r1.mo39636j(r3)
            r2 = r1
            com.moovit.micromobility.purchase.step.filter.MicroMobilityPurchaseFilter r2 = (com.moovit.micromobility.purchase.step.filter.MicroMobilityPurchaseFilter) r2
        L_0x02c6:
            if (r2 != 0) goto L_0x02ca
            goto L_0x034d
        L_0x02ca:
            hq.b$a r1 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r3 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r1.<init>(r3)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            r1.mo49939g(r3, r5)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.SELECTED_ID
            java.lang.String r4 = r2.f14951b
            r1.mo49939g(r3, r4)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.SELECTED_CAPTION
            java.lang.String r4 = r2.f14953d
            r1.mo49939g(r3, r4)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.SELECTED_TYPE
            Step r4 = r0.f20766o
            com.moovit.micromobility.purchase.step.filter.MicroMobilityFilterSelectionStep r4 = (com.moovit.micromobility.purchase.step.filter.MicroMobilityFilterSelectionStep) r4
            java.lang.String r4 = r4.f14921c
            r1.mo49939g(r3, r4)
            hq.b r1 = r1.mo49933a()
            r0.mo46797j2(r1)
            Step r1 = r0.f20766o
            com.moovit.micromobility.purchase.step.filter.MicroMobilityFilterSelectionStep r1 = (com.moovit.micromobility.purchase.step.filter.MicroMobilityFilterSelectionStep) r1
            com.moovit.micromobility.purchase.step.filter.MicroMobilityFilterSelectionStepResult r3 = new com.moovit.micromobility.purchase.step.filter.MicroMobilityFilterSelectionStepResult
            java.lang.String r4 = r1.f14920b
            java.lang.String r1 = r1.f14941e
            java.lang.String r5 = r2.f14951b
            r3.<init>(r4, r1, r5)
            com.moovit.micromobility.MicroMobilityConfirmationInfo r1 = r2.f14955f
            if (r1 == 0) goto L_0x034a
            com.moovit.design.dialog.AlertDialogFragment$a r2 = new com.moovit.design.dialog.AlertDialogFragment$a
            android.content.Context r11 = r11.getContext()
            r2.<init>((android.content.Context) r11)
            java.lang.String r11 = "filter_confirmation"
            com.moovit.design.dialog.AlertDialogFragment$a r2 = r2.mo47682k(r11)
            com.moovit.image.model.Image r4 = r1.f14806b
            r2.mo47677f(r4)
            java.lang.String r4 = r1.f14807c
            com.moovit.design.dialog.AlertDialogFragment$a r2 = r2.mo47684m(r4)
            java.lang.String r4 = r1.f14808d
            com.moovit.design.dialog.AlertDialogFragment$a r2 = r2.mo47679h(r4)
            java.lang.String r4 = r1.f14809e
            java.lang.String r5 = "positiveButton"
            r2.mo47672a(r4, r5)
            java.lang.String r1 = r1.f14810f
            java.lang.String r4 = "negativeButton"
            r2.mo47672a(r1, r4)
            android.os.Bundle r1 = r2.f41328b
            java.lang.String r4 = "result"
            r1.putParcelable(r4, r3)
            com.moovit.design.dialog.AlertDialogFragment r1 = r2.mo47673b()
            androidx.fragment.app.FragmentManager r0 = r0.getChildFragmentManager()
            r1.show((androidx.fragment.app.FragmentManager) r0, (java.lang.String) r11)
            goto L_0x034d
        L_0x034a:
            r0.mo22864m2(r3)
        L_0x034d:
            return
        L_0x034e:
            java.lang.Object r11 = r10.f48412c
            com.moovit.micromobility.external.CycleCenterReservationActivity r11 = (com.moovit.micromobility.external.CycleCenterReservationActivity) r11
            zz.l0<java.lang.Integer> r0 = com.moovit.micromobility.external.CycleCenterReservationActivity.f14868w0
            java.lang.String r0 = "start_time_dialog_fragment_tag"
            r11.mo19481A2(r0)
            return
        L_0x035a:
            java.lang.Object r11 = r10.f48412c
            com.moovit.micromobility.damage.MicroMobilityReportDamageActivity r11 = (com.moovit.micromobility.damage.MicroMobilityReportDamageActivity) r11
            android.widget.EditText r0 = r11.f14861Y
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = p977zz.C20964s0.m49082C(r0)
            int r1 = l30.C5597z.gallery
            androidx.fragment.app.Fragment r1 = r11.mo44529n1(r1)
            com.moovit.gallery.EmbeddedGalleryFragment r1 = (com.moovit.gallery.EmbeddedGalleryFragment) r1
            java.util.ArrayList<com.moovit.gallery.EmbeddedGalleryImage> r1 = r1.f41477q
            boolean r4 = p977zz.C20964s0.m49092j(r0)
            if (r4 != 0) goto L_0x03e2
            boolean r4 = c00.C13717b.m34258e(r1)
            if (r4 != 0) goto L_0x03e2
            hq.b$a r4 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r5 = com.moovit.analytics.AnalyticsEventKey.REPORT_SEND_CLICKED
            r4.<init>(r5)
            com.moovit.analytics.AnalyticsAttributeKey r5 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r6 = "send_report_clicked"
            r4.mo49939g(r5, r6)
            com.moovit.analytics.AnalyticsAttributeKey r5 = com.moovit.analytics.AnalyticsAttributeKey.COUNT
            int r6 = r1.size()
            r4.mo49935c(r5, r6)
            hq.b r4 = r4.mo49933a()
            r11.mo44545v2(r4)
            r11.mo44543u2(r2)
            l30.i r4 = l30.C5577i.m13786a()
            java.lang.String r5 = r11.f14859U
            java.lang.String r6 = r11.f14860X
            com.facebook.appevents.l r7 = new com.facebook.appevents.l
            r8 = 15
            r7.<init>(r8)
            java.util.ArrayList r1 = c00.C13720d.m34273c(r1, r2, r7)
            java.util.concurrent.ExecutorService r2 = com.moovit.MoovitExecutors.COMPUTATION
            l30.c r7 = new l30.c
            r7.<init>(r4, r3)
            com.google.android.gms.tasks.Task r4 = com.google.android.gms.tasks.Tasks.call(r2, r7)
            ca.p r7 = new ca.p
            r7.<init>(r5, r6, r0, r1)
            com.google.android.gms.tasks.Task r0 = r4.onSuccessTask(r2, r7)
            uu.f r1 = new uu.f
            r2 = 4
            r1.<init>(r11, r2)
            com.google.android.gms.tasks.Task r0 = r0.addOnSuccessListener(r1)
            l30.t r1 = new l30.t
            r1.<init>(r11, r3)
            com.google.android.gms.tasks.Task r0 = r0.addOnFailureListener(r1)
            s3.v r1 = new s3.v
            r2 = 5
            r1.<init>(r11, r2)
            r0.addOnCompleteListener(r1)
        L_0x03e2:
            return
        L_0x03e3:
            java.lang.Object r11 = r10.f48412c
            com.moovit.map.MapFragment r11 = (com.moovit.map.MapFragment) r11
            boolean r0 = r11.f42381t0
            if (r0 != 0) goto L_0x03ec
            goto L_0x0431
        L_0x03ec:
            com.moovit.map.MapFragment$MapFollowMode r0 = r11.f42356O
            com.moovit.map.MapFragment$MapFollowMode r2 = com.moovit.map.MapFragment.MapFollowMode.BOTH
            if (r0 != r2) goto L_0x03fd
            boolean r2 = r11.f42339C0
            if (r2 != 0) goto L_0x03fd
            com.moovit.map.MapFragment$MapFollowMode r0 = r11.mo48619P2(r0)
            r11.mo48641l3(r0, r1)
        L_0x03fd:
            com.moovit.map.j r0 = r11.f42368n
            float r0 = r0.mo48818z()
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
        L_0x040a:
            r2 = 1135869952(0x43b40000, float:360.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0412
            float r0 = r0 - r2
            goto L_0x040a
        L_0x0412:
            r4 = 1127481344(0x43340000, float:180.0)
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x041a
            float r0 = r2 - r0
        L_0x041a:
            r4 = 4636737291354636288(0x4059000000000000, double:100.0)
            r6 = 4635329916471083008(0x4054000000000000, double:80.0)
            double r8 = (double) r0
            double r8 = java.lang.Math.log(r8)
            double r8 = r8 * r6
            double r8 = r8 + r4
            int r0 = (int) r8
            android.view.animation.AccelerateDecelerateInterpolator r2 = j00.C17685d.f45437b
            com.moovit.map.a$e r4 = new com.moovit.map.a$e
            r4.<init>(r1, r0, r2)
            r11.mo48607C2(r4, r3)
        L_0x0431:
            return
        L_0x0432:
            java.lang.Object r0 = r10.f48412c
            o10.f r0 = (o10.C18690f) r0
            r0.getClass()
            java.lang.Object r11 = r11.getTag()
            ja0.f r11 = (ja0.C12797f) r11
            android.content.Context r1 = r11.mo39638e()
            int r11 = r11.getAdapterPosition()
            com.moovit.home.stops.search.SearchStopItem r2 = r0.mo51059m(r11)
            boolean r4 = r0.mo51060n(r11)
            o10.c$a r0 = (o10.C18684c.C18685a) r0
            o10.d r1 = o10.C18688d.m45685f(r1)
            r1.mo51499b()
            mz.d<T> r5 = r1.f48438c
            com.moovit.network.model.ServerId r6 = r2.getServerId()
            r5.mo40645c(r6)
            r1.mo51498a()
            o10.c r0 = o10.C18684c.this
            boolean r1 = r0.f40824e
            if (r1 == 0) goto L_0x04c3
            int r1 = o10.C18684c.f47563u
            hq.b$a r1 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r5 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r1.<init>(r5)
            com.moovit.analytics.AnalyticsAttributeKey r5 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            android.os.Bundle r6 = r0.mo46782Q1()
            java.lang.String r7 = "isSearchEnabled"
            boolean r3 = r6.getBoolean(r7, r3)
            if (r3 == 0) goto L_0x0484
            java.lang.String r3 = "search_stop_item_clicked"
            goto L_0x0486
        L_0x0484:
            java.lang.String r3 = "stop_item_clicked"
        L_0x0486:
            r1.mo49939g(r5, r3)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.TRANSIT_TYPE
            com.moovit.transit.TransitType r5 = r0.f47569s
            java.lang.String r5 = p001a0.C0016g.m15E(r5)
            r1.mo49939g(r3, r5)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.IS_RECENT
            r1.mo49941i(r3, r4)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.SELECTED_ID
            com.moovit.network.model.ServerId r5 = r2.getServerId()
            r1.mo49937e(r3, r5)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.SELECTED_INDEX
            r1.mo49935c(r3, r11)
            com.moovit.analytics.AnalyticsAttributeKey r11 = com.moovit.analytics.AnalyticsAttributeKey.NUMBER_OF_RESULTS
            o10.c$a r3 = r0.f47564n
            int r3 = r3.getItemCount()
            r1.mo49935c(r11, r3)
            hq.b r11 = r1.mo49933a()
            r0.mo46797j2(r11)
            java.lang.Class<o10.a> r11 = o10.C18682a.class
            o10.b r1 = new o10.b
            r1.<init>(r0, r2, r4)
            r0.mo46786U1(r11, r1)
        L_0x04c3:
            return
        L_0x04c4:
            java.lang.Object r11 = r10.f48412c
            z00.a r11 = (z00.C20795a) r11
            r11.getClass()
            return
        L_0x04cc:
            java.lang.Object r11 = r10.f48412c
            com.moovit.design.dialog.b r11 = (com.moovit.design.dialog.C15859b) r11
            int r0 = com.moovit.design.dialog.C15859b.f41329l
            com.moovit.design.dialog.b$b r0 = r11.mo47685H1()
            if (r0 == 0) goto L_0x04e8
            java.lang.String r1 = r11.f41330b
            int r2 = r11.mo47686I1()
            java.util.Calendar r3 = r11.f41333e
            r4 = 2
            int r3 = r3.get(r4)
            r0.mo24112v(r2, r3, r1)
        L_0x04e8:
            r11.dismiss()
            return
        L_0x04ec:
            java.lang.Object r11 = r10.f48412c
            com.moovit.app.wondo.tickets.codes.WondoCodesActivity$a r11 = (com.moovit.app.wondo.tickets.codes.WondoCodesActivity.C15646a) r11
            com.moovit.app.wondo.tickets.codes.WondoCodesActivity r11 = com.moovit.app.wondo.tickets.codes.WondoCodesActivity.this
            java.lang.String r0 = "wondo_codes_empty_state_purchase_button_clicked"
            r11.mo46675z2(r0)
            return
        L_0x04f8:
            java.lang.Object r11 = r10.f48412c
            px.c r11 = (p739px.C19039c) r11
            com.moovit.app.tod.model.TodRideVehicleAC r0 = new com.moovit.app.tod.model.TodRideVehicleAC
            com.google.android.material.floatingactionbutton.FloatingActionButton r1 = r11.f48418j
            boolean r1 = r1.isActivated()
            com.google.android.material.slider.Slider r2 = r11.f48421m
            float r2 = r2.getValue()
            int r2 = (int) r2
            com.google.android.material.slider.Slider r3 = r11.f48424p
            float r3 = r3.getValue()
            r0.<init>(r2, r3, r1)
            hq.b$a r1 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r2 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r1.<init>(r2)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r3 = "tod_ac_settings_selected"
            r1.mo49939g(r2, r3)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.TOD_AC_FAN
            int r3 = r0.f40310c
            r1.mo49935c(r2, r3)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.TOD_AC_TEMP
            float r3 = r0.f40311d
            r1.mo49934b(r2, r3)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.TOD_AC_ENABLED
            boolean r3 = r0.f40309b
            r1.mo49941i(r2, r3)
            hq.b r1 = r1.mo49933a()
            r11.mo22564R1(r1)
            com.moovit.app.tod.model.TodRideVehicleAC r1 = r11.f48416h
            boolean r1 = p977zz.C20975x0.m49118e(r1, r0)
            if (r1 != 0) goto L_0x0552
            java.lang.Class<bx.a> r1 = p400bx.C13705a.class
            d0.a0 r2 = new d0.a0
            r3 = 9
            r2.<init>(r0, r3)
            r11.mo46753L1(r1, r2)
        L_0x0552:
            r11.dismissAllowingStateLoss()
            return
        L_0x0556:
            java.lang.Object r0 = r10.f48412c
            com.veriff.sdk.views.camera.ui.b r0 = (com.veriff.sdk.views.camera.p978ui.C22912b) r0
            r0.m56540a((android.view.View) r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p739px.C19037a.onClick(android.view.View):void");
    }
}
