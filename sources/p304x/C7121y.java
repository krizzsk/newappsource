package p304x;

import androidx.lifecycle.C1044w;

/* renamed from: x.y */
public final /* synthetic */ class C7121y implements C1044w {

    /* renamed from: a */
    public final /* synthetic */ int f22131a;

    /* renamed from: b */
    public final /* synthetic */ Object f22132b;

    public /* synthetic */ C7121y(Object obj, int i) {
        this.f22131a = i;
        this.f22132b = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v8, types: [androidx.fragment.app.h0] */
    /* JADX WARNING: type inference failed for: r3v16, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v26 */
    /* JADX WARNING: type inference failed for: r3v27 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onChanged(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.f22131a
            r1 = 1
            r2 = 0
            r3 = 0
            switch(r0) {
                case 0: goto L_0x027e;
                case 1: goto L_0x01f2;
                case 2: goto L_0x015e;
                case 3: goto L_0x0125;
                case 4: goto L_0x0118;
                case 5: goto L_0x00fe;
                case 6: goto L_0x00ec;
                case 7: goto L_0x00de;
                case 8: goto L_0x000a;
                default: goto L_0x0008;
            }
        L_0x0008:
            goto L_0x0286
        L_0x000a:
            java.lang.Object r0 = r11.f22132b
            com.moovit.payment.confirmation.summary.PaymentSummaryFragment r0 = (com.moovit.payment.confirmation.summary.PaymentSummaryFragment) r0
            y50.a r12 = (y50.C20703a) r12
            r4 = 8
            if (r12 != 0) goto L_0x0020
            androidx.recyclerview.widget.RecyclerView r12 = r0.f42623o
            r12.setAdapter(r3)
            com.moovit.design.view.list.ListItemView r12 = r0.f42625q
            r12.setVisibility(r4)
            goto L_0x00dd
        L_0x0020:
            android.widget.Button r4 = r0.f42624p
            dw.o r5 = new dw.o
            r6 = 15
            r5.<init>(r0, r6)
            r4.setOnClickListener(r5)
            android.widget.Button r4 = r0.f42624p
            com.moovit.payment.confirmation.summary.PaymentSummarySecondaryAction r5 = com.moovit.payment.confirmation.summary.PaymentSummarySecondaryAction.ADD_VOUCHER
            java.util.List<com.moovit.payment.confirmation.summary.PaymentSummarySecondaryAction> r6 = r12.f52284h
            pq.i r7 = new pq.i
            r8 = 2
            r7.<init>(r5, r8)
            boolean r5 = c00.C13723g.m34280a(r6, r7)
            if (r5 == 0) goto L_0x0040
            r5 = 0
            goto L_0x0042
        L_0x0040:
            r5 = 8
        L_0x0042:
            r4.setVisibility(r5)
            android.content.Context r4 = r0.requireContext()
            com.moovit.util.CurrencyAmount r5 = r12.f52281e
            if (r5 == 0) goto L_0x004f
            r5 = 1
            goto L_0x0050
        L_0x004f:
            r5 = 0
        L_0x0050:
            java.util.List<y50.b> r6 = r12.f52280d
            boolean r6 = c00.C13717b.m34258e(r6)
            r6 = r6 ^ r1
            if (r5 == 0) goto L_0x007c
            if (r6 == 0) goto L_0x007c
            androidx.recyclerview.widget.ConcatAdapter r7 = new androidx.recyclerview.widget.ConcatAdapter
            androidx.recyclerview.widget.RecyclerView$Adapter[] r9 = new androidx.recyclerview.widget.RecyclerView.Adapter[r2]
            r7.<init>(r9)
            com.moovit.payment.confirmation.summary.PaymentSummaryFragment$b r9 = new com.moovit.payment.confirmation.summary.PaymentSummaryFragment$b
            com.moovit.util.CurrencyAmount r10 = r12.f52281e
            r9.<init>(r10)
            r7.mo4440j(r9)
            com.moovit.payment.confirmation.summary.PaymentSummaryFragment$a r9 = new com.moovit.payment.confirmation.summary.PaymentSummaryFragment$a
            java.util.List<y50.b> r10 = r12.f52280d
            r9.<init>(r4, r10)
            r7.mo4440j(r9)
            androidx.recyclerview.widget.RecyclerView r9 = r0.f42623o
            r9.setAdapter(r7)
            goto L_0x0090
        L_0x007c:
            if (r6 == 0) goto L_0x008b
            androidx.recyclerview.widget.RecyclerView r7 = r0.f42623o
            com.moovit.payment.confirmation.summary.PaymentSummaryFragment$a r9 = new com.moovit.payment.confirmation.summary.PaymentSummaryFragment$a
            java.util.List<y50.b> r10 = r12.f52280d
            r9.<init>(r4, r10)
            r7.setAdapter(r9)
            goto L_0x0090
        L_0x008b:
            androidx.recyclerview.widget.RecyclerView r7 = r0.f42623o
            r7.setAdapter(r3)
        L_0x0090:
            com.moovit.util.CurrencyAmount r12 = r12.f52282f
            if (r12 == 0) goto L_0x0098
            java.lang.String r3 = r12.toString()
        L_0x0098:
            android.text.SpannableStringBuilder r12 = new android.text.SpannableStringBuilder
            int r7 = v40.C25754i.payment_total_after_payments
            java.lang.String r7 = r0.getString(r7)
            r12.<init>(r7)
            int r7 = v40.C25749d.ic_alert_12
            int r9 = v40.C25748c.colorOnSurfaceEmphasisMedium
            android.graphics.drawable.Drawable r4 = k00.C17988b.m44612c(r4, r7, r9)
            if (r5 == 0) goto L_0x00be
            if (r6 == 0) goto L_0x00be
            if (r4 == 0) goto L_0x00be
            r7 = 32
            android.text.SpannableStringBuilder r7 = r12.append(r7)
            android.text.SpannableString r4 = p977zz.C20964s0.m49086d(r4, r8)
            r7.append(r4)
        L_0x00be:
            com.moovit.design.view.list.ListItemView r4 = r0.f42625q
            r4.setText((java.lang.CharSequence) r12)
            com.moovit.design.view.list.ListItemView r12 = r0.f42625q
            r12.setAccessoryText((java.lang.CharSequence) r3)
            com.moovit.design.view.list.ListItemView r12 = r0.f42625q
            if (r5 == 0) goto L_0x00cf
            if (r6 == 0) goto L_0x00cf
            goto L_0x00d0
        L_0x00cf:
            r1 = 0
        L_0x00d0:
            r12.setClickable(r1)
            com.moovit.design.view.list.ListItemView r12 = r0.f42625q
            if (r3 == 0) goto L_0x00d8
            goto L_0x00da
        L_0x00d8:
            r2 = 8
        L_0x00da:
            r12.setVisibility(r2)
        L_0x00dd:
            return
        L_0x00de:
            java.lang.Object r0 = r11.f22132b
            w50.g r0 = (w50.C20283g) r0
            com.moovit.commons.utils.LinkedText r12 = (com.moovit.commons.utils.LinkedText) r12
            androidx.lifecycle.v<java.lang.Boolean> r12 = r0.f51442p
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r12.setValue(r0)
            return
        L_0x00ec:
            java.lang.Object r0 = r11.f22132b
            com.moovit.payment.account.deposit.a r0 = (com.moovit.payment.account.deposit.C25643a) r0
            java.util.List r12 = (java.util.List) r12
            androidx.lifecycle.v<com.moovit.payment.account.paymentmethod.PaymentMethod> r1 = r0.f63968h
            java.lang.Object r1 = r1.getValue()
            com.moovit.payment.account.paymentmethod.PaymentMethod r1 = (com.moovit.payment.account.paymentmethod.PaymentMethod) r1
            r0.mo83450c(r12, r1)
            return
        L_0x00fe:
            java.lang.Object r0 = r11.f22132b
            com.moovit.payment.account.deposit.DepositActivity r0 = (com.moovit.payment.account.deposit.DepositActivity) r0
            com.moovit.util.CurrencyAmount r12 = (com.moovit.util.CurrencyAmount) r12
            android.widget.TextView r3 = r0.f63951Z
            int r4 = v40.C25754i.reservation_deposit_message
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r12 = r12.toString()
            r1[r2] = r12
            java.lang.String r12 = r0.getString(r4, r1)
            r3.setText(r12)
            return
        L_0x0118:
            java.lang.Object r0 = r11.f22132b
            lf0.l r0 = (lf0.C24236l) r0
            java.lang.String r1 = "$tmp0"
            mf0.C24362h.m61211f(r0, r1)
            r0.invoke(r12)
            return
        L_0x0125:
            java.lang.Object r0 = r11.f22132b
            ax.f r0 = (p376ax.C13544f) r0
            zz.r r12 = (p977zz.C20961r) r12
            int r1 = p376ax.C13544f.f33477u
            r0.getClass()
            if (r12 != 0) goto L_0x0133
            goto L_0x015d
        L_0x0133:
            boolean r1 = r12.f52711a
            if (r1 == 0) goto L_0x0158
            T r1 = r12.f52712b
            if (r1 != 0) goto L_0x013c
            goto L_0x0158
        L_0x013c:
            com.moovit.app.tod.bookingflow.model.TodBookingDropOffInformation r1 = (com.moovit.app.tod.bookingflow.model.TodBookingDropOffInformation) r1
            yw.f r12 = r0.mo40435o2()
            r12.getClass()
            java.util.List<com.moovit.app.tod.bookingflow.model.TodZoneShape> r2 = r1.f40087b
            r12.mo52911d(r2)
            java.util.List<com.moovit.transit.LocationDescriptor> r2 = r1.f40088c
            r3 = 2131231908(0x7f0804a4, float:1.807991E38)
            r12.mo52912e(r3, r2)
            java.lang.String r12 = r1.f40090e
            r0.mo40432z2(r12)
            goto L_0x015d
        L_0x0158:
            java.lang.Exception r12 = r12.f52713c
            r0.mo40437q2(r12)
        L_0x015d:
            return
        L_0x015e:
            java.lang.Object r0 = r11.f22132b
            com.moovit.app.tod.bookingflow.TodBookingOrderActivity r0 = (com.moovit.app.tod.bookingflow.TodBookingOrderActivity) r0
            com.moovit.app.tod.bookingflow.TodBookingOrderViewModel$OrderInformation r12 = (com.moovit.app.tod.bookingflow.TodBookingOrderViewModel.OrderInformation) r12
            int r4 = com.moovit.app.tod.bookingflow.TodBookingOrderActivity.f40067Z
            if (r12 != 0) goto L_0x016d
            r0.getClass()
            goto L_0x01f1
        L_0x016d:
            androidx.fragment.app.FragmentManager r4 = r0.getSupportFragmentManager()
            int r5 = r4.mo3926D()
            if (r5 <= 0) goto L_0x0186
            com.moovit.transit.LocationDescriptor r5 = r12.f40085e
            if (r5 != 0) goto L_0x0186
            androidx.fragment.app.FragmentManager$j r5 = r4.mo3925C(r2)
            int r5 = r5.getId()
            r4.mo3938S(r5)
        L_0x0186:
            java.lang.String r4 = "origin_step_"
            java.lang.StringBuilder r4 = p379.C13555b.m33972k(r4)
            java.lang.String r5 = r12.f40082b
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            androidx.fragment.app.Fragment r5 = r0.mo44534p1(r4)
            if (r5 != 0) goto L_0x01a4
            ax.h r5 = new ax.h
            r5.<init>()
            androidx.fragment.app.h0 r3 = r0.mo46212z2(r5, r4, r2, r3)
        L_0x01a4:
            java.lang.String r2 = "drop_off_step_"
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
            java.lang.String r4 = r12.f40082b
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.moovit.transit.LocationDescriptor r4 = r12.f40085e
            if (r4 == 0) goto L_0x01c6
            androidx.fragment.app.Fragment r4 = r0.mo44534p1(r2)
            if (r4 != 0) goto L_0x01c6
            ax.f r4 = new ax.f
            r4.<init>()
            androidx.fragment.app.h0 r3 = r0.mo46212z2(r4, r2, r1, r3)
        L_0x01c6:
            java.lang.String r2 = "confirmation_step_"
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
            java.lang.String r4 = r12.f40082b
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.moovit.transit.LocationDescriptor r4 = r12.f40085e
            if (r4 == 0) goto L_0x01ec
            com.moovit.transit.LocationDescriptor r12 = r12.f40086f
            if (r12 == 0) goto L_0x01ec
            androidx.fragment.app.Fragment r12 = r0.mo44534p1(r2)
            if (r12 != 0) goto L_0x01ec
            ax.d r12 = new ax.d
            r12.<init>()
            androidx.fragment.app.h0 r3 = r0.mo46212z2(r12, r2, r1, r3)
        L_0x01ec:
            if (r3 == 0) goto L_0x01f1
            r3.mo4040d()
        L_0x01f1:
            return
        L_0x01f2:
            java.lang.Object r0 = r11.f22132b
            com.moovit.app.subscription.SubscriptionsActivity r0 = (com.moovit.app.subscription.SubscriptionsActivity) r0
            zz.r r12 = (p977zz.C20961r) r12
            int r1 = com.moovit.app.subscription.SubscriptionsActivity.f39776Y
            r0.mo44506I1()
            boolean r1 = r12.f52711a
            if (r1 == 0) goto L_0x024d
            T r1 = r12.f52712b
            if (r1 != 0) goto L_0x0206
            goto L_0x024d
        L_0x0206:
            com.moovit.app.subscription.MoovitSubscriptionsManager$b r1 = (com.moovit.app.subscription.MoovitSubscriptionsManager.C15359b) r1
            boolean r12 = r1.f39766a
            if (r12 == 0) goto L_0x027d
            com.moovit.app.subscription.MoovitSubscriptionsManager$d r12 = r1.f39767b
            if (r12 == 0) goto L_0x027d
            java.util.List<gw.b> r12 = r12.f39772c
            boolean r12 = r12.isEmpty()
            if (r12 != 0) goto L_0x027d
            com.moovit.app.subscription.b r12 = r0.f39778X
            androidx.lifecycle.d0 r12 = r12.f39781c
            java.lang.String r1 = "active_subscription"
            java.lang.Object r12 = r12.mo4292b(r1)
            com.moovit.app.subscription.model.SubscriptionDetails r12 = (com.moovit.app.subscription.model.SubscriptionDetails) r12
            if (r12 == 0) goto L_0x0228
            java.lang.String r3 = r12.f39788b
        L_0x0228:
            hq.b$a r12 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.SUBSCRIPTION_RESULT
            r12.<init>(r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.SUCCESS
            java.lang.String r2 = "iap_transaction_state_purchased"
            r12.mo49939g(r1, r2)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.ID
            r12.mo49945m(r1, r3)
            hq.b r12 = r12.mo49933a()
            r0.mo44545v2(r12)
            z20.a$a r12 = new z20.a$a
            java.lang.String r0 = "subscription_purchased_se"
            r12.<init>(r0)
            r12.mo52935c()
            goto L_0x027d
        L_0x024d:
            hq.b$a r1 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r2 = com.moovit.analytics.AnalyticsEventKey.SUBSCRIPTION_RESULT
            r1.<init>(r2)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.SUCCESS
            java.lang.String r3 = "iap_transaction_state_failed"
            r1.mo49939g(r2, r3)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.ERROR_MESSAGE
            java.lang.Exception r3 = r12.f52713c
            if (r3 == 0) goto L_0x0266
            java.lang.String r3 = r3.getMessage()
            goto L_0x0268
        L_0x0266:
            java.lang.String r3 = ""
        L_0x0268:
            r1.mo49939g(r2, r3)
            hq.b r1 = r1.mo49933a()
            r0.mo44545v2(r1)
            java.lang.Exception r12 = r12.f52713c
            java.lang.String r1 = "error_dialog"
            com.moovit.design.dialog.AlertDialogFragment r12 = c70.C13751d.m34341b(r0, r1, r12)
            r0.mo44530n2(r12)
        L_0x027d:
            return
        L_0x027e:
            java.lang.Object r0 = r11.f22132b
            x.z$a r0 = (p304x.C7124z.C7125a) r0
            r0.setValue(r12)
            return
        L_0x0286:
            java.lang.Object r0 = r11.f22132b
            com.moovit.payment.gateway.PaymentGatewayFragment r0 = (com.moovit.payment.gateway.PaymentGatewayFragment) r0
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            com.moovit.design.view.list.ListItemView r0 = r0.f42668t
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r12 = r1.equals(r12)
            r0.setChecked(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p304x.C7121y.onChanged(java.lang.Object):void");
    }
}
