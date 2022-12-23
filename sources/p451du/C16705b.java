package p451du;

import com.google.android.gms.tasks.OnCompleteListener;

/* renamed from: du.b */
public final /* synthetic */ class C16705b implements OnCompleteListener {

    /* renamed from: b */
    public final /* synthetic */ int f43501b;

    /* renamed from: c */
    public final /* synthetic */ Object f43502c;

    public /* synthetic */ C16705b(Object obj, int i) {
        this.f43501b = i;
        this.f43502c = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v24, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v25, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v32, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v46, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.moovit.payment.clearance.tokenization.TokenizeStatus} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onComplete(com.google.android.gms.tasks.Task r14) {
        /*
            r13 = this;
            int r0 = r13.f43501b
            r1 = 1
            r2 = 0
            r3 = 0
            switch(r0) {
                case 0: goto L_0x01f9;
                case 1: goto L_0x01ef;
                case 2: goto L_0x01de;
                case 3: goto L_0x0178;
                case 4: goto L_0x0080;
                case 5: goto L_0x004a;
                case 6: goto L_0x0014;
                case 7: goto L_0x000a;
                default: goto L_0x0008;
            }
        L_0x0008:
            goto L_0x0217
        L_0x000a:
            java.lang.Object r14 = r13.f43502c
            m80.v r14 = (m80.C12887v) r14
            java.util.concurrent.ThreadPoolExecutor r0 = m80.C12887v.f31893d
            r14.mo39737i()
            return
        L_0x0014:
            java.lang.Object r0 = r13.f43502c
            android.content.Context r0 = (android.content.Context) r0
            boolean r1 = r14.isSuccessful()
            java.lang.String r2 = "FenceClientCommands"
            if (r1 == 0) goto L_0x002a
            com.moovit.sdk.profilers.ProfilerLog r14 = com.moovit.sdk.profilers.ProfilerLog.m41879c(r0)
            java.lang.String r0 = "updateFences-completed successfully"
            r14.mo49244b(r2, r0)
            goto L_0x0049
        L_0x002a:
            com.moovit.sdk.profilers.ProfilerLog r0 = com.moovit.sdk.profilers.ProfilerLog.m41879c(r0)
            java.lang.String r1 = "updateFences-failed with error "
            java.lang.StringBuilder r1 = p379.C13555b.m33972k(r1)
            java.lang.Exception r3 = r14.getException()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.mo49244b(r2, r1)
            java.lang.Exception r14 = r14.getException()
            java.util.Objects.toString(r14)
        L_0x0049:
            return
        L_0x004a:
            java.lang.Object r0 = r13.f43502c
            com.moovit.payment.clearance.tokenization.TokenizeStatusObserver$a r0 = (com.moovit.payment.clearance.tokenization.TokenizeStatusObserver.C16308a) r0
            r0.getClass()
            boolean r1 = r14.isSuccessful()
            if (r1 == 0) goto L_0x005e
            java.lang.Object r14 = r14.getResult()
            r2 = r14
            com.moovit.payment.clearance.tokenization.TokenizeStatus r2 = (com.moovit.payment.clearance.tokenization.TokenizeStatus) r2
        L_0x005e:
            if (r2 == 0) goto L_0x0067
            com.moovit.payment.clearance.tokenization.TokenizeStatusObserver r14 = com.moovit.payment.clearance.tokenization.TokenizeStatusObserver.this
            zz.e<com.moovit.payment.clearance.tokenization.TokenizeStatus> r14 = r14.f42617f
            r14.invoke(r2)
        L_0x0067:
            com.moovit.payment.clearance.tokenization.TokenizeStatusObserver r14 = com.moovit.payment.clearance.tokenization.TokenizeStatusObserver.this
            java.util.concurrent.atomic.AtomicBoolean r14 = r14.f42613b
            boolean r14 = r14.get()
            if (r14 != 0) goto L_0x0072
            goto L_0x007f
        L_0x0072:
            if (r2 == 0) goto L_0x0078
            com.moovit.payment.clearance.tokenization.TokenizeStatus r14 = com.moovit.payment.clearance.tokenization.TokenizeStatus.NOT_PROCESSED
            if (r2 != r14) goto L_0x007f
        L_0x0078:
            com.moovit.payment.clearance.tokenization.TokenizeStatusObserver r14 = com.moovit.payment.clearance.tokenization.TokenizeStatusObserver.this
            com.moovit.payment.clearance.tokenization.TokenizeStatusObserver$a r14 = r14.f42614c
            r14.mo23802c()
        L_0x007f:
            return
        L_0x0080:
            java.lang.Object r0 = r13.f43502c
            com.moovit.payment.account.personalinfo.PaymentAccountDetailsActivity r0 = (com.moovit.payment.account.personalinfo.PaymentAccountDetailsActivity) r0
            int r4 = com.moovit.payment.account.personalinfo.PaymentAccountDetailsActivity.f64070n0
            r0.mo44506I1()
            boolean r4 = r14.isSuccessful()
            if (r4 == 0) goto L_0x0096
            java.lang.Object r14 = r14.getResult()
            com.moovit.payment.account.model.PaymentAccount r14 = (com.moovit.payment.account.model.PaymentAccount) r14
            goto L_0x0097
        L_0x0096:
            r14 = r2
        L_0x0097:
            r0.f64071U = r14
            if (r14 != 0) goto L_0x00a9
            int r14 = v40.C25754i.general_error_title
            android.widget.Toast r14 = android.widget.Toast.makeText(r0, r14, r3)
            r14.show()
            r0.finish()
            goto L_0x0177
        L_0x00a9:
            java.lang.String r14 = "CONFIGURATION"
            java.lang.Object r14 = r0.mo44537r1(r14)
            q00.a r14 = (q00.C19047a) r14
            com.moovit.payment.account.model.PaymentAccount r4 = r0.f64071U
            com.moovit.payment.account.model.PersonalDetails r4 = r4.f64015d
            java.lang.String r14 = com.moovit.payment.account.model.PersonalDetails.m64189b(r14, r4)
            com.moovit.design.view.list.ListItemView r5 = r0.f64072X
            boolean r6 = p977zz.C20964s0.m49090h(r14)
            java.lang.String r7 = ""
            if (r6 == 0) goto L_0x00c4
            r14 = r7
        L_0x00c4:
            r5.setSubtitle((java.lang.CharSequence) r14)
            com.moovit.design.view.list.ListItemView r14 = r0.f64073Y
            java.lang.String r5 = r4.f64040d
            boolean r5 = p977zz.C20964s0.m49090h(r5)
            if (r5 == 0) goto L_0x00d3
            r5 = r7
            goto L_0x00d5
        L_0x00d3:
            java.lang.String r5 = r4.f64040d
        L_0x00d5:
            r14.setSubtitle((java.lang.CharSequence) r5)
            com.moovit.design.view.list.ListItemView r14 = r0.f64074Z
            android.widget.TextView r14 = r14.getSubtitleView()
            boolean r5 = com.moovit.commons.utils.C15780a.m40268a(r0)
            r5 = r5 ^ r1
            r6 = 6
            r8 = 5
            if (r5 == 0) goto L_0x00e9
            r9 = 5
            goto L_0x00ea
        L_0x00e9:
            r9 = 6
        L_0x00ea:
            if (r5 == 0) goto L_0x00f0
            r5 = 8388611(0x800003, float:1.1754948E-38)
            goto L_0x00f3
        L_0x00f0:
            r5 = 8388613(0x800005, float:1.175495E-38)
        L_0x00f3:
            r10 = 17
            boolean r10 = p977zz.C20943i.m49051d(r10)
            if (r10 == 0) goto L_0x00ff
            r14.setTextAlignment(r9)
            goto L_0x0102
        L_0x00ff:
            r14.setGravity(r5)
        L_0x0102:
            java.util.WeakHashMap<android.view.View, s1.p0> r5 = p242s1.C6333d0.f19990a
            p242s1.C6333d0.C6338e.m15069j(r14, r3)
            com.moovit.payment.account.model.PaymentAccount r5 = r0.f64071U
            com.moovit.payment.account.model.PersonalDetails r5 = r5.f64015d
            java.lang.String r5 = r5.f64041e
            if (r5 == 0) goto L_0x0116
            com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat r9 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.INTERNATIONAL
            java.lang.String r5 = ba0.C7568e.m17311a(r0, r5, r9)
            goto L_0x0117
        L_0x0116:
            r5 = r7
        L_0x0117:
            r14.setText(r5)
            com.moovit.design.view.list.ListItemView r14 = r0.f64075l0
            long r9 = r4.f64043g
            r11 = -1
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r5 != 0) goto L_0x0126
            r5 = r7
            goto L_0x012a
        L_0x0126:
            java.lang.String r5 = com.moovit.util.time.C7925b.m18022j(r0, r9)
        L_0x012a:
            r14.setSubtitle((java.lang.CharSequence) r5)
            com.moovit.view.address.Address r14 = r4.f64044h
            com.moovit.design.view.list.ListItemView r4 = r0.f64076m0
            if (r14 != 0) goto L_0x0134
            goto L_0x0174
        L_0x0134:
            java.lang.String r5 = p977zz.C20964s0.f52718a
            java.lang.CharSequence[] r6 = new java.lang.CharSequence[r6]
            java.lang.String r7 = r14.f24017b
            r6[r3] = r7
            java.lang.String r7 = r14.f24018c
            r6[r1] = r7
            java.lang.String r7 = r14.f24019d
            r9 = 2
            r6[r9] = r7
            r7 = 3
            java.lang.String r10 = r14.f24022g
            java.util.Locale r0 = p977zz.C20930c.m49020b(r0)
            java.util.Locale r11 = new java.util.Locale
            java.lang.String r0 = r0.getLanguage()
            r11.<init>(r0, r10)
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.String r9 = r11.getDisplayCountry()
            r0[r3] = r9
            r0[r1] = r10
            java.lang.String r1 = "%1$s (%2$s)"
            java.lang.String r0 = java.lang.String.format(r2, r1, r0)
            r6[r7] = r0
            r0 = 4
            java.lang.String r1 = r14.f24020e
            r6[r0] = r1
            java.lang.String r14 = r14.f24021f
            r6[r8] = r14
            java.lang.CharSequence r7 = p977zz.C20964s0.m49099q(r5, r6)
        L_0x0174:
            r4.setSubtitle((java.lang.CharSequence) r7)
        L_0x0177:
            return
        L_0x0178:
            java.lang.Object r0 = r13.f43502c
            com.moovit.payment.account.PaymentAccountActivity r0 = (com.moovit.payment.account.PaymentAccountActivity) r0
            int r4 = com.moovit.payment.account.PaymentAccountActivity.f63829X
            r0.mo44506I1()
            boolean r4 = r14.isSuccessful()
            if (r4 == 0) goto L_0x018e
            java.lang.Object r14 = r14.getResult()
            com.moovit.payment.account.model.PaymentAccount r14 = (com.moovit.payment.account.model.PaymentAccount) r14
            goto L_0x018f
        L_0x018e:
            r14 = r2
        L_0x018f:
            java.lang.String r4 = "payment_account_empty"
            if (r14 != 0) goto L_0x01a0
            int r14 = v40.C25750e.empty_account_view
            android.view.View r14 = r0.findViewById(r14)
            r14.setVisibility(r3)
            r0.mo83327y2(r2, r4)
            goto L_0x01dd
        L_0x01a0:
            com.moovit.payment.account.model.PersonalDetails r5 = r14.f64015d
            int r6 = com.moovit.payment.account.personalinfo.PaymentAccountPersonalInfoFragment.f64090r
            java.lang.String r6 = r5.f64038b
            boolean r6 = p977zz.C20964s0.m49090h(r6)
            if (r6 == 0) goto L_0x01bd
            java.lang.String r6 = r5.f64039c
            boolean r6 = p977zz.C20964s0.m49090h(r6)
            if (r6 == 0) goto L_0x01bd
            java.lang.String r5 = r5.f64040d
            boolean r5 = p977zz.C20964s0.m49090h(r5)
            if (r5 == 0) goto L_0x01bd
            goto L_0x01be
        L_0x01bd:
            r1 = 0
        L_0x01be:
            if (r1 == 0) goto L_0x01cd
            int r14 = v40.C25750e.empty_account_view
            android.view.View r14 = r0.findViewById(r14)
            r14.setVisibility(r3)
            r0.mo83327y2(r2, r4)
            goto L_0x01dd
        L_0x01cd:
            int r1 = v40.C25750e.empty_account_view
            android.view.View r1 = r0.findViewById(r1)
            r2 = 8
            r1.setVisibility(r2)
            java.lang.String r1 = "payment_account_regular"
            r0.mo83327y2(r14, r1)
        L_0x01dd:
            return
        L_0x01de:
            java.lang.Object r14 = r13.f43502c
            l30.i r14 = (l30.C5577i) r14
            l30.i r0 = l30.C5577i.f18275d
            r14.getClass()
            w40.d r14 = w40.C25761d.m64299a()
            r14.mo83591f()
            return
        L_0x01ef:
            java.lang.Object r14 = r13.f43502c
            android.content.BroadcastReceiver$PendingResult r14 = (android.content.BroadcastReceiver.PendingResult) r14
            int r0 = com.moovit.gcm.notification.GcmNotificationPublisher.f41527a
            r14.finish()
            return
        L_0x01f9:
            java.lang.Object r0 = r13.f43502c
            com.moovit.app.linedetail.ui.LineDetailActivity r0 = (com.moovit.app.linedetail.p416ui.LineDetailActivity) r0
            int r1 = com.moovit.app.linedetail.p416ui.LineDetailActivity.f38727y0
            r0.getClass()
            boolean r1 = r14.isSuccessful()
            if (r1 == 0) goto L_0x0212
            java.lang.Object r14 = r14.getResult()
            j80.d r14 = (j80.C12775d) r14
            r0.mo45408C2(r14)
            goto L_0x0216
        L_0x0212:
            com.moovit.network.model.ServerId r14 = r0.f38729X
            int r14 = r14.f15142b
        L_0x0216:
            return
        L_0x0217:
            java.lang.Object r14 = r13.f43502c
            com.moovit.ticketing.activation.BaseTicketActivationActivity r14 = (com.moovit.ticketing.activation.BaseTicketActivationActivity) r14
            int r0 = com.moovit.ticketing.activation.BaseTicketActivationActivity.f23235X
            r14.mo23972H2(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p451du.C16705b.onComplete(com.google.android.gms.tasks.Task):void");
    }
}
