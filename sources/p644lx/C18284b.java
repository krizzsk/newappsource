package p644lx;

import android.view.View;

/* renamed from: lx.b */
public final /* synthetic */ class C18284b implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f46618b;

    /* renamed from: c */
    public final /* synthetic */ Object f46619c;

    public /* synthetic */ C18284b(Object obj, int i) {
        this.f46618b = i;
        this.f46619c = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.moovit.network.model.ServerId} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.moovit.payment.account.actions.model.SelectionOption} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v42 */
    /* JADX WARNING: type inference failed for: r3v43 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r9) {
        /*
            r8 = this;
            int r0 = r8.f46618b
            r1 = -1
            r2 = 1
            r3 = 0
            java.lang.String r4 = "this$0"
            r5 = 0
            java.lang.String r6 = "continue_clicked"
            switch(r0) {
                case 0: goto L_0x04b3;
                case 1: goto L_0x049c;
                case 2: goto L_0x0487;
                case 3: goto L_0x047b;
                case 4: goto L_0x045d;
                case 5: goto L_0x041e;
                case 6: goto L_0x03f6;
                case 7: goto L_0x034e;
                case 8: goto L_0x02f3;
                case 9: goto L_0x02bf;
                case 10: goto L_0x02a6;
                case 11: goto L_0x0226;
                case 12: goto L_0x01c7;
                case 13: goto L_0x01a5;
                case 14: goto L_0x0194;
                case 15: goto L_0x0176;
                case 16: goto L_0x00fd;
                case 17: goto L_0x00c8;
                case 18: goto L_0x0086;
                case 19: goto L_0x0078;
                case 20: goto L_0x0021;
                case 21: goto L_0x000f;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x052e
        L_0x000f:
            java.lang.Object r9 = r8.f46619c
            com.umo.ads.o.zzc r9 = (com.umo.ads.p348o.zzc) r9
            mf0.C24362h.m61211f(r9, r4)
            android.os.Handler r0 = wb0.C13233c.f32843b
            gc0.d r1 = new gc0.d
            r1.<init>(r9, r2)
            r0.post(r1)
            return
        L_0x0021:
            java.lang.Object r9 = r8.f46619c
            ga0.m r9 = (ga0.C12713m) r9
            android.widget.ListView r0 = r9.f31391h
            int r0 = r0.getCheckedItemPosition()
            android.widget.ListView r1 = r9.f31391h
            android.widget.ListAdapter r1 = r1.getAdapter()
            ga0.m$b r1 = (ga0.C12713m.C12715b) r1
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            hq.b$a r2 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r3 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r2.<init>(r3)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r4 = "popup_string_picker_picked"
            r2.mo49939g(r3, r4)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.STRING_PICKER_SELECTED_ITEM
            r2.mo49935c(r3, r0)
            hq.b r2 = r2.mo49933a()
            r9.mo22564R1(r2)
            android.widget.ListView r2 = r9.f31391h
            android.widget.ListAdapter r2 = r2.getAdapter()
            int r2 = r2.getCount()
            androidx.fragment.app.Fragment r3 = r9.getTargetFragment()
            boolean r4 = r3 instanceof ga0.C12713m.C12714a
            if (r4 == 0) goto L_0x006a
            ga0.m$a r3 = (ga0.C12713m.C12714a) r3
            r3.mo39511d(r0, r2, r1)
        L_0x006a:
            androidx.fragment.app.FragmentActivity r9 = r9.getActivity()
            boolean r3 = r9 instanceof ga0.C12713m.C12714a
            if (r3 == 0) goto L_0x0077
            ga0.m$a r9 = (ga0.C12713m.C12714a) r9
            r9.mo39511d(r0, r2, r1)
        L_0x0077:
            return
        L_0x0078:
            java.lang.Object r9 = r8.f46619c
            com.moovit.view.PromotionBannerView r9 = (com.moovit.view.PromotionBannerView) r9
            int r0 = com.moovit.view.PromotionBannerView.f23956n
            com.moovit.view.PromotionBannerView$a r9 = r9.f23968m
            if (r9 == 0) goto L_0x0085
            r9.mo24258b()
        L_0x0085:
            return
        L_0x0086:
            java.lang.Object r0 = r8.f46619c
            k90.b r0 = (k90.C12820b) r0
            int r1 = k90.C12820b.f31687v
            java.lang.String r1 = "CONFIGURATION"
            boolean r2 = r0.mo46785T1(r1)
            if (r2 != 0) goto L_0x0095
            goto L_0x00c7
        L_0x0095:
            hq.b$a r2 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r3 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r2.<init>(r3)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r4 = "payment_account_login_clicked"
            r2.mo49939g(r3, r4)
            hq.b r2 = r2.mo49933a()
            r0.mo46797j2(r2)
            java.lang.Object r1 = r0.mo46776J1(r1)
            q00.a r1 = (q00.C19047a) r1
            r00.h r2 = v50.C20101a.f51007T
            java.lang.Object r1 = r1.mo51505b(r2)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x00c7
            android.content.Context r9 = r9.getContext()
            com.moovit.payment.registration.PaymentRegistrationType r2 = com.moovit.payment.registration.PaymentRegistrationType.REGISTRATION
            android.content.Intent r9 = com.moovit.payment.registration.PaymentRegistrationActivity.m41717A2(r9, r2, r1)
            r0.startActivity(r9)
        L_0x00c7:
            return
        L_0x00c8:
            java.lang.Object r0 = r8.f46619c
            com.moovit.ticketing.ticket.e$b r0 = (com.moovit.ticketing.ticket.C7758e.C7760b) r0
            r0.getClass()
            java.lang.Object r1 = r9.getTag()
            com.moovit.ticketing.ticket.Ticket r1 = (com.moovit.ticketing.ticket.Ticket) r1
            if (r1 != 0) goto L_0x00d8
            goto L_0x00fc
        L_0x00d8:
            com.moovit.ticketing.ticket.e r2 = com.moovit.ticketing.ticket.C7758e.this
            hq.b r3 = m80.C12875k.m32662b(r1)
            r2.mo46797j2(r3)
            com.moovit.ticketing.ticket.e r0 = com.moovit.ticketing.ticket.C7758e.this
            android.content.Context r9 = r9.getContext()
            com.moovit.ticketing.ticket.TicketId r2 = r1.f23473b
            int r3 = com.moovit.ticketing.ticket.TicketDetailsActivity.f23504m0
            java.lang.Class<com.moovit.ticketing.ticket.TicketDetailsActivity> r3 = com.moovit.ticketing.ticket.TicketDetailsActivity.class
            java.util.List r2 = java.util.Collections.singletonList(r2)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            android.content.Intent r9 = com.moovit.ticketing.activation.BaseTicketActivationActivity.m17425z2(r9, r3, r2, r1)
            r0.startActivity(r9)
        L_0x00fc:
            return
        L_0x00fd:
            java.lang.Object r9 = r8.f46619c
            f90.d r9 = (f90.C12642d) r9
            int r0 = f90.C12642d.f31246v
            A r0 = r9.f40822c
            com.moovit.ticketing.purchase.PurchaseTicketActivity r0 = (com.moovit.ticketing.purchase.PurchaseTicketActivity) r0
            androidx.recyclerview.widget.RecyclerView r1 = r9.f31248q
            androidx.recyclerview.widget.RecyclerView$Adapter r1 = r1.getAdapter()
            f90.d$a r1 = (f90.C12642d.C12643a) r1
            if (r0 == 0) goto L_0x0175
            if (r1 != 0) goto L_0x0114
            goto L_0x0175
        L_0x0114:
            Step r0 = r9.f32728o
            com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueSelectionStep r0 = (com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueSelectionStep) r0
            java.util.List<com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueAmount> r2 = r1.f31254h
            int r1 = r1.f31257k
            java.lang.Object r1 = r2.get(r1)
            com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueAmount r1 = (com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueAmount) r1
            hq.b$a r2 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r3 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r2.<init>(r3)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            r2.mo49939g(r3, r6)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.PROVIDER
            com.moovit.network.model.ServerId r4 = r0.f23445f
            r2.mo49937e(r3, r4)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.ID
            java.lang.String r4 = r0.f23446g
            r2.mo49939g(r3, r4)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.CURRENCY_CODE
            com.moovit.util.CurrencyAmount r4 = r1.f23430b
            java.lang.String r4 = r4.f23844b
            r2.mo49939g(r3, r4)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.BALANCE
            com.moovit.util.CurrencyAmount r4 = r1.f23430b
            long r4 = p001a0.C0016g.m19b(r4)
            r2.mo49936d(r3, r4)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.SELECTED_TYPE
            java.lang.String r0 = r0.f23247c
            r2.mo49939g(r3, r0)
            hq.b r0 = r2.mo49933a()
            r9.mo46797j2(r0)
            A r0 = r9.f40822c
            com.moovit.ticketing.purchase.PurchaseTicketActivity r0 = (com.moovit.ticketing.purchase.PurchaseTicketActivity) r0
            if (r0 != 0) goto L_0x0165
            goto L_0x0175
        L_0x0165:
            Step r0 = r9.f32728o
            com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueSelectionStep r0 = (com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueSelectionStep) r0
            com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueSelectionStepResult r2 = new com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueSelectionStepResult
            java.lang.String r0 = r0.f23246b
            com.moovit.util.CurrencyAmount r1 = r1.f23430b
            r2.<init>(r0, r1)
            r9.mo40058n2(r2)
        L_0x0175:
            return
        L_0x0176:
            java.lang.Object r9 = r8.f46619c
            a90.c r9 = (a90.C7520c) r9
            int r0 = a90.C7520c.f22991t
            java.lang.String r0 = "view_tickets_center_clicked"
            r9.mo46798k2(r0)
            A r0 = r9.f40822c
            com.moovit.ticketing.purchase.PurchaseTicketActivity r0 = (com.moovit.ticketing.purchase.PurchaseTicketActivity) r0
            r0.finish()
            android.content.Context r0 = r9.requireContext()
            android.content.Intent r0 = com.moovit.ticketing.wallet.UserWalletActivity.m17744y2(r0)
            r9.startActivity(r0)
            return
        L_0x0194:
            java.lang.Object r0 = r8.f46619c
            w80.b r0 = (w80.C13220b) r0
            r0.getClass()
            java.lang.Object r9 = r9.getTag()
            if (r9 == 0) goto L_0x01a4
            r0.mo23786C(r9)
        L_0x01a4:
            return
        L_0x01a5:
            java.lang.Object r9 = r8.f46619c
            com.moovit.ticketing.activation.b r9 = (com.moovit.ticketing.activation.C7634b) r9
            int r0 = com.moovit.ticketing.activation.C7634b.f23238h
            r9.getClass()
            hq.b$a r0 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r0.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r2 = "confirmation_dialog_dismiss"
            r0.mo49939g(r1, r2)
            hq.b r0 = r0.mo49933a()
            r9.mo22564R1(r0)
            r9.dismissAllowingStateLoss()
            return
        L_0x01c7:
            java.lang.Object r9 = r8.f46619c
            r60.e r9 = (r60.C19234e) r9
            java.util.regex.Pattern r0 = r60.C19234e.f48842G
            r9.getClass()
            hq.b$a r0 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r0.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r3 = "resend_code"
            r0.mo49939g(r1, r3)
            hq.b r0 = r0.mo49933a()
            r9.mo46797j2(r0)
            java.lang.String r0 = r9.f48857v
            if (r0 == 0) goto L_0x01ea
            r5 = 1
        L_0x01ea:
            if (r5 == 0) goto L_0x020b
            h60.h1 r0 = new h60.h1
            c70.e r1 = r9.mo46783R1()
            java.lang.String r3 = r9.f48854s
            java.lang.String r4 = r9.f48855t
            java.lang.String r5 = r9.f48856u
            r0.<init>(r1, r3, r4, r5)
            java.lang.String r1 = r0.mo49832O()
            com.moovit.request.RequestOptions r3 = r9.mo46777L1()
            r3.f42909f = r2
            r60.e$a r2 = r9.f48849n
            r9.mo46793f2(r1, r0, r3, r2)
            goto L_0x0225
        L_0x020b:
            h60.z r0 = new h60.z
            c70.e r1 = r9.mo46783R1()
            java.lang.String r3 = r9.f48854s
            r0.<init>(r1, r3)
            java.lang.String r1 = r0.mo49839O()
            com.moovit.request.RequestOptions r3 = r9.mo46777L1()
            r3.f42909f = r2
            r60.e$b r2 = r9.f48850o
            r9.mo46793f2(r1, r0, r3, r2)
        L_0x0225:
            return
        L_0x0226:
            java.lang.Object r9 = r8.f46619c
            q60.b r9 = (q60.C19088b) r9
            android.widget.RadioButton r0 = r9.f48526t
            boolean r0 = r0.isChecked()
            hq.b$a r1 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r3 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r1.<init>(r3)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            r1.mo49939g(r3, r6)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.SELECTED_TYPE
            if (r0 == 0) goto L_0x0243
            java.lang.String r4 = "pango_card"
            goto L_0x0245
        L_0x0243:
            java.lang.String r4 = "credit_card"
        L_0x0245:
            r1.mo49939g(r3, r4)
            hq.b r1 = r1.mo49933a()
            r9.mo46797j2(r1)
            if (r0 == 0) goto L_0x028a
            r9.mo46796i2()
            h60.m1 r0 = new h60.m1
            c70.e r1 = r9.mo46783R1()
            java.lang.String r3 = r9.f48523q
            android.widget.EditText r4 = r9.f48527u
            android.text.Editable r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            r0.<init>(r1, r3, r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class<h60.h1> r3 = h60.C17321h1.class
            java.lang.String r4 = "_"
            p379.C13715c.m34249o(r3, r1, r4)
            java.lang.String r3 = r0.f44723w
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.moovit.request.RequestOptions r3 = r9.mo46777L1()
            r3.f42909f = r2
            q60.b$a r2 = r9.f48520n
            r9.mo46793f2(r1, r0, r3, r2)
            goto L_0x029d
        L_0x028a:
            com.moovit.design.view.list.ListItemView r0 = r9.f48530x
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L_0x029e
            java.lang.Class<q60.b$c> r0 = q60.C19088b.C19091c.class
            a8.k r1 = new a8.k
            r2 = 6
            r1.<init>(r2)
            r9.mo46786U1(r0, r1)
        L_0x029d:
            return
        L_0x029e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Either Pango button or change credit card button must be checked."
            r9.<init>(r0)
            throw r9
        L_0x02a6:
            java.lang.Object r9 = r8.f46619c
            com.moovit.payment.gateway.a r9 = (com.moovit.payment.gateway.C16328a) r9
            int r0 = com.moovit.payment.gateway.C16328a.f42681h
            r9.getClass()
            java.lang.Class<com.moovit.payment.gateway.PaymentGatewayFragment> r0 = com.moovit.payment.gateway.PaymentGatewayFragment.class
            i0.c r1 = new i0.c
            r2 = 19
            r1.<init>(r2)
            r9.mo46753L1(r0, r1)
            r9.dismissAllowingStateLoss()
            return
        L_0x02bf:
            java.lang.Object r9 = r8.f46619c
            com.moovit.payment.account.profile.PaymentAccountEditProfileActivity r9 = (com.moovit.payment.account.profile.PaymentAccountEditProfileActivity) r9
            int r0 = com.moovit.payment.account.profile.PaymentAccountEditProfileActivity.f64099l0
            r9.getClass()
            hq.b$a r0 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r0.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r2 = "delete_profile_clicked"
            r0.mo49939g(r1, r2)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.ID
            com.moovit.network.model.ServerId r2 = r9.f64102Y
            r0.mo49937e(r1, r2)
            hq.b r0 = r0.mo49933a()
            r9.mo44545v2(r0)
            androidx.fragment.app.FragmentManager r9 = r9.getSupportFragmentManager()
            com.moovit.payment.account.profile.a r0 = new com.moovit.payment.account.profile.a
            r0.<init>()
            java.lang.String r1 = "PaymentAccountDeleteProfileDialogFragment"
            r0.show((androidx.fragment.app.FragmentManager) r9, (java.lang.String) r1)
            return
        L_0x02f3:
            java.lang.Object r9 = r8.f46619c
            com.moovit.payment.account.deposit.DepositActivity r9 = (com.moovit.payment.account.deposit.DepositActivity) r9
            com.moovit.payment.account.deposit.a r0 = r9.f63949X
            androidx.lifecycle.t<java.util.List<com.moovit.payment.account.paymentmethod.PaymentMethod>> r0 = r0.f63966f
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            boolean r1 = c00.C13717b.m34258e(r0)
            if (r1 == 0) goto L_0x0308
            goto L_0x034d
        L_0x0308:
            hq.b$a r1 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r2 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r1.<init>(r2)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r3 = "payment_account_change_payment_method_clicked"
            r1.mo49939g(r2, r3)
            hq.b r1 = r1.mo49933a()
            r9.mo44545v2(r1)
            com.moovit.payment.account.deposit.a r1 = r9.f63949X
            androidx.lifecycle.t<com.moovit.payment.account.paymentmethod.PaymentMethod> r1 = r1.f63969i
            java.lang.Object r1 = r1.getValue()
            com.moovit.payment.account.paymentmethod.PaymentMethod r1 = (com.moovit.payment.account.paymentmethod.PaymentMethod) r1
            int r2 = com.moovit.payment.account.paymentmethod.C25692a.f64059i
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.util.ArrayList r0 = c00.C13717b.m34264k(r0)
            java.lang.String r3 = "paymentMethods"
            r2.putParcelableArrayList(r3, r0)
            java.lang.String r0 = "selectedPaymentMethod"
            r2.putParcelable(r0, r1)
            com.moovit.payment.account.paymentmethod.a r0 = new com.moovit.payment.account.paymentmethod.a
            r0.<init>()
            r0.setArguments(r2)
            androidx.fragment.app.FragmentManager r9 = r9.getSupportFragmentManager()
            java.lang.String r1 = "actions"
            r0.show((androidx.fragment.app.FragmentManager) r9, (java.lang.String) r1)
        L_0x034d:
            return
        L_0x034e:
            java.lang.Object r9 = r8.f46619c
            com.moovit.payment.account.actions.AccountActionSelectionStepFragment r9 = (com.moovit.payment.account.actions.AccountActionSelectionStepFragment) r9
            int r0 = com.moovit.payment.account.actions.AccountActionSelectionStepFragment.f63858q
            mf0.C24362h.m61211f(r9, r4)
            com.moovit.payment.account.actions.AccountActionSelectionStepFragment$OptionsAdapter r0 = r9.f63859n
            if (r0 == 0) goto L_0x03f5
            int r2 = r0.f63863i
            if (r2 == r1) goto L_0x0366
            java.lang.Object r0 = r0.mo39636j(r2)
            r3 = r0
            com.moovit.payment.account.actions.model.SelectionOption r3 = (com.moovit.payment.account.actions.model.SelectionOption) r3
        L_0x0366:
            if (r3 != 0) goto L_0x036a
            goto L_0x03f5
        L_0x036a:
            hq.b$a r0 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r0.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            r0.mo49939g(r1, r6)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.SELECTED_ID
            java.lang.String r2 = r3.f63918b
            r0.mo49939g(r1, r2)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.SELECTED_CAPTION
            java.lang.String r2 = r3.f63920d
            r0.mo49939g(r1, r2)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.SELECTED_TYPE
            com.moovit.payment.account.actions.model.OptionSelectionStep r2 = r9.mo83341p2()
            java.lang.String r2 = r2.f63894c
            r0.mo49939g(r1, r2)
            hq.b r0 = r0.mo49933a()
            r9.mo46797j2(r0)
            com.moovit.payment.account.actions.model.OptionSelectionStepResult r0 = new com.moovit.payment.account.actions.model.OptionSelectionStepResult
            com.moovit.payment.account.actions.model.OptionSelectionStep r1 = r9.mo83341p2()
            java.lang.String r1 = r1.f63893b
            com.moovit.payment.account.actions.model.OptionSelectionStep r2 = r9.mo83341p2()
            java.lang.String r2 = r2.f63894c
            com.moovit.payment.account.actions.model.OptionSelectionStep r4 = r9.mo83341p2()
            java.lang.String r4 = r4.f63895d
            java.lang.String r5 = r3.f63918b
            r0.<init>(r1, r2, r4, r5)
            com.moovit.payment.account.actions.model.OptionConfirmation r1 = r3.f63922f
            if (r1 == 0) goto L_0x03f2
            com.moovit.design.dialog.AlertDialogFragment$a r2 = new com.moovit.design.dialog.AlertDialogFragment$a
            A r3 = r9.f40822c
            r2.<init>((android.content.Context) r3)
            java.lang.String r3 = "option_confirmation"
            com.moovit.design.dialog.AlertDialogFragment$a r2 = r2.mo47682k(r3)
            com.moovit.image.model.Image r4 = r1.f63888b
            r2.mo47677f(r4)
            java.lang.String r4 = r1.f63889c
            com.moovit.design.dialog.AlertDialogFragment$a r2 = r2.mo47684m(r4)
            java.lang.String r4 = r1.f63890d
            com.moovit.design.dialog.AlertDialogFragment$a r2 = r2.mo47679h(r4)
            java.lang.String r4 = r1.f63891e
            java.lang.String r5 = "positiveButton"
            r2.mo47672a(r4, r5)
            java.lang.String r1 = r1.f63892f
            java.lang.String r4 = "negativeButton"
            r2.mo47672a(r1, r4)
            android.os.Bundle r1 = r2.f41328b
            java.lang.String r4 = "result"
            r1.putParcelable(r4, r0)
            com.moovit.design.dialog.AlertDialogFragment r0 = r2.mo47673b()
            androidx.fragment.app.FragmentManager r9 = r9.getChildFragmentManager()
            r0.show((androidx.fragment.app.FragmentManager) r9, (java.lang.String) r3)
            goto L_0x03f5
        L_0x03f2:
            r9.mo83596o2(r0)
        L_0x03f5:
            return
        L_0x03f6:
            java.lang.Object r9 = r8.f46619c
            v30.a r9 = (v30.C6855a) r9
            int r0 = v30.C6855a.f21206q
            java.lang.String r0 = "change_clicked"
            r9.mo46798k2(r0)
            A r9 = r9.f40822c
            com.moovit.micromobility.purchase.MicroMobilityPurchaseActivity r9 = (com.moovit.micromobility.purchase.MicroMobilityPurchaseActivity) r9
            if (r9 == 0) goto L_0x041d
            androidx.fragment.app.FragmentManager r9 = r9.getSupportFragmentManager()
            int r0 = r9.mo3926D()
            if (r0 != 0) goto L_0x0412
            goto L_0x041d
        L_0x0412:
            androidx.fragment.app.FragmentManager$j r0 = r9.mo3925C(r5)
            int r0 = r0.getId()
            r9.mo3937R(r0, r5)
        L_0x041d:
            return
        L_0x041e:
            java.lang.Object r9 = r8.f46619c
            m30.e r9 = (m30.C5682e) r9
            android.widget.RatingBar r0 = r9.f18468i
            float r0 = r0.getRating()
            double r0 = (double) r0
            double r0 = java.lang.Math.floor(r0)
            int r0 = (int) r0
            hq.b$a r1 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r2 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r1.<init>(r2)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r3 = "submit_rating_clicked"
            r1.mo49939g(r2, r3)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.ID
            com.moovit.network.model.ServerId r3 = r9.f18467h
            r1.mo49937e(r2, r3)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.RATING
            r1.mo49935c(r2, r0)
            hq.b r1 = r1.mo49933a()
            r9.mo22564R1(r1)
            java.lang.Class<m30.b> r1 = m30.C5679b.class
            d0.q r2 = new d0.q
            r2.<init>(r0)
            r9.mo46753L1(r1, r2)
            r9.dismissAllowingStateLoss()
            return
        L_0x045d:
            java.lang.Object r9 = r8.f46619c
            com.moovit.design.view.TextPicker r9 = (com.moovit.design.view.TextPicker) r9
            android.widget.ViewAnimator r0 = r9.f41391b
            android.view.animation.Animation r1 = r9.f41396g
            r0.setInAnimation(r1)
            android.widget.ViewAnimator r0 = r9.f41391b
            android.view.animation.Animation r1 = r9.f41397h
            r0.setOutAnimation(r1)
            android.widget.ViewAnimator r0 = r9.f41391b
            r0.showNext()
            r9.mo47771b()
            r9.mo47770a()
            return
        L_0x047b:
            java.lang.Object r9 = r8.f46619c
            com.moovit.app.wondo.tickets.rewards.WondoRewardsActivity$a r9 = (com.moovit.app.wondo.tickets.rewards.WondoRewardsActivity.C15672a) r9
            com.moovit.app.wondo.tickets.rewards.WondoRewardsActivity r9 = com.moovit.app.wondo.tickets.rewards.WondoRewardsActivity.this
            java.lang.String r0 = "wondo_rewards_empty_state_purchase_button_clicked"
            r9.mo46739y2(r0)
            return
        L_0x0487:
            java.lang.Object r9 = r8.f46619c
            ly.a r9 = (p645ly.C18298a) r9
            int r0 = p645ly.C18298a.f46661d
            r9.mo50584J1()
            com.google.android.gms.auth.api.signin.GoogleSignInClient r0 = r9.f46662c
            android.content.Intent r0 = r0.getSignInIntent()
            r1 = 8568(0x2178, float:1.2006E-41)
            r9.startActivityForResult(r0, r1)
            return
        L_0x049c:
            java.lang.Object r0 = r8.f46619c
            sx.h r0 = (p808sx.C19572h) r0
            int r1 = p808sx.C19572h.f49749k
            r0.getClass()
            boolean r0 = r9.isSelected()
            r0 = r0 ^ r2
            r9.setSelected(r0)
            com.moovit.design.view.list.ListItemView r9 = (com.moovit.design.view.list.ListItemView) r9
            p808sx.C19572h.m46953T1(r9)
            return
        L_0x04b3:
            java.lang.Object r9 = r8.f46619c
            lx.f r9 = (p644lx.C18289f) r9
            lx.f$b r0 = r9.f46632x
            T r0 = r0.f47543g
            lx.f$a r0 = (p644lx.C18289f.C18290a) r0
            int r2 = r0.f46640m
            int r4 = r0.f46641n
            java.util.List<com.moovit.app.tod.shuttle.model.TodShuttleStop> r5 = r0.f46634g
            int r5 = r5.size()
            if (r4 == r5) goto L_0x04cc
            int r4 = r0.f46641n
            goto L_0x04cd
        L_0x04cc:
            r4 = -1
        L_0x04cd:
            com.moovit.app.tod.shuttle.booking.TodShuttleBookingState r5 = r9.mo50675n2()
            r5.f40402e = r2
            r5.f40403f = r4
            int r5 = r0.f46640m
            if (r5 == r1) goto L_0x04e2
            java.util.List<com.moovit.app.tod.shuttle.model.TodShuttleStop> r1 = r0.f46634g
            java.lang.Object r1 = r1.get(r5)
            com.moovit.app.tod.shuttle.model.TodShuttleStop r1 = (com.moovit.app.tod.shuttle.model.TodShuttleStop) r1
            goto L_0x04e3
        L_0x04e2:
            r1 = r3
        L_0x04e3:
            int r5 = r0.f46641n
            java.util.List<com.moovit.app.tod.shuttle.model.TodShuttleStop> r7 = r0.f46634g
            int r7 = r7.size()
            if (r5 == r7) goto L_0x04f8
            java.util.List<com.moovit.app.tod.shuttle.model.TodShuttleStop> r5 = r0.f46634g
            int r0 = r0.f46641n
            java.lang.Object r0 = r5.get(r0)
            com.moovit.app.tod.shuttle.model.TodShuttleStop r0 = (com.moovit.app.tod.shuttle.model.TodShuttleStop) r0
            goto L_0x04f9
        L_0x04f8:
            r0 = r3
        L_0x04f9:
            hq.b$a r5 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r7 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r5.<init>(r7)
            com.moovit.analytics.AnalyticsAttributeKey r7 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            r5.mo49939g(r7, r6)
            com.moovit.analytics.AnalyticsAttributeKey r6 = com.moovit.analytics.AnalyticsAttributeKey.FROM_STOP
            if (r1 == 0) goto L_0x050c
            com.moovit.network.model.ServerId r1 = r1.f40427b
            goto L_0x050d
        L_0x050c:
            r1 = r3
        L_0x050d:
            r5.mo49937e(r6, r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TO_STOP
            if (r0 == 0) goto L_0x0516
            com.moovit.network.model.ServerId r3 = r0.f40427b
        L_0x0516:
            r5.mo49937e(r1, r3)
            com.moovit.analytics.AnalyticsAttributeKey r0 = com.moovit.analytics.AnalyticsAttributeKey.ORIGIN_INDEX
            r5.mo49935c(r0, r2)
            com.moovit.analytics.AnalyticsAttributeKey r0 = com.moovit.analytics.AnalyticsAttributeKey.DESTINATION_INDEX
            r5.mo49935c(r0, r4)
            hq.b r0 = r5.mo49933a()
            r9.mo46797j2(r0)
            r9.mo50678q2()
            return
        L_0x052e:
            java.lang.Object r0 = r8.f46619c
            com.veriff.sdk.views.camera.ui.b r0 = (com.veriff.sdk.views.camera.p978ui.C22912b) r0
            r0.m56545d(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p644lx.C18284b.onClick(android.view.View):void");
    }
}
