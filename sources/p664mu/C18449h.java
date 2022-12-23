package p664mu;

import android.view.LayoutInflater;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.perf.metrics.Trace;
import com.moovit.payment.account.model.PaymentAccount;

/* renamed from: mu.h */
public final /* synthetic */ class C18449h implements OnSuccessListener {

    /* renamed from: b */
    public final /* synthetic */ C18451j f47029b;

    /* renamed from: c */
    public final /* synthetic */ Trace f47030c;

    /* renamed from: d */
    public final /* synthetic */ PaymentAccount f47031d;

    /* renamed from: e */
    public final /* synthetic */ LayoutInflater f47032e;

    public /* synthetic */ C18449h(C18451j jVar, Trace trace, PaymentAccount paymentAccount, LayoutInflater layoutInflater) {
        this.f47029b = jVar;
        this.f47030c = trace;
        this.f47031d = paymentAccount;
        this.f47032e = layoutInflater;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSuccess(java.lang.Object r15) {
        /*
            r14 = this;
            mu.j r0 = r14.f47029b
            com.google.firebase.perf.metrics.Trace r1 = r14.f47030c
            com.moovit.payment.account.model.PaymentAccount r2 = r14.f47031d
            android.view.LayoutInflater r3 = r14.f47032e
            java.util.List r15 = (java.util.List) r15
            int r4 = p664mu.C18451j.f47036q
            r0.getClass()
            java.lang.String r4 = "type"
            java.lang.String r5 = "mot_state_buy_ticket"
            r1.putAttribute(r4, r5)
            r1.stop()
            sz.r r1 = w40.C25765g.f64279a
            r1 = 0
            if (r2 != 0) goto L_0x001f
            goto L_0x0034
        L_0x001f:
            java.util.List<com.moovit.payment.account.model.PaymentAccountProfile> r2 = r2.f64017f
            boolean r4 = c00.C13717b.m34258e(r2)
            if (r4 != 0) goto L_0x0034
            rb.j r4 = new rb.j
            r6 = 4
            r4.<init>(r6)
            java.lang.Object r2 = java.util.Collections.max(r2, r4)
            com.moovit.payment.account.model.PaymentAccountProfile r2 = (com.moovit.payment.account.model.PaymentAccountProfile) r2
            goto L_0x0035
        L_0x0034:
            r2 = r1
        L_0x0035:
            if (r2 == 0) goto L_0x003a
            com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus r4 = r2.f64035d
            goto L_0x003b
        L_0x003a:
            r4 = r1
        L_0x003b:
            hq.b$a r6 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r7 = com.moovit.analytics.AnalyticsEventKey.CONTENT_SHOWN
            r6.<init>(r7)
            com.moovit.analytics.AnalyticsAttributeKey r7 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            r6.mo49939g(r7, r5)
            com.moovit.analytics.AnalyticsAttributeKey r5 = com.moovit.analytics.AnalyticsAttributeKey.STATUS
            java.lang.String r4 = p379.C13555b.m33980t(r4)
            r6.mo49939g(r5, r4)
            hq.b r4 = r6.mo49933a()
            r0.mo46797j2(r4)
            com.moovit.design.view.list.ListItemView r4 = r0.f47038o
            r5 = 2131364674(0x7f0a0b42, float:1.8349192E38)
            java.lang.Object r4 = r4.getTag(r5)
            boolean r4 = p977zz.C20975x0.m49118e(r15, r4)
            r6 = 2131364675(0x7f0a0b43, float:1.8349194E38)
            if (r4 == 0) goto L_0x0077
            com.moovit.design.view.list.ListItemView r4 = r0.f47038o
            java.lang.Object r4 = r4.getTag(r6)
            boolean r4 = p977zz.C20975x0.m49118e(r2, r4)
            if (r4 == 0) goto L_0x0077
            goto L_0x015f
        L_0x0077:
            android.view.ViewGroup r4 = r0.f47039p
            int r4 = r4.getChildCount()
            r7 = 2
            r8 = 1
            if (r4 <= r7) goto L_0x008b
            android.view.ViewGroup r4 = r0.f47039p
            int r9 = r4.getChildCount()
            int r9 = r9 - r7
            r4.removeViews(r8, r9)
        L_0x008b:
            com.moovit.design.view.list.ListItemView r4 = r0.f47038o
            r4.setTag(r5, r15)
            com.moovit.design.view.list.ListItemView r4 = r0.f47038o
            r4.setTag(r6, r2)
            boolean r4 = c00.C13717b.m34258e(r15)
            r5 = 0
            if (r4 == 0) goto L_0x009e
            goto L_0x011e
        L_0x009e:
            java.lang.Object r4 = c00.C13717b.m34256c(r15)
            com.moovit.app.mot.model.MotActivation r4 = (com.moovit.app.mot.model.MotActivation) r4
            r6 = 2131559031(0x7f0d0277, float:1.8743395E38)
            android.view.ViewGroup r9 = r0.f47039p
            android.view.View r6 = r3.inflate(r6, r9, r5)
            com.moovit.design.view.list.ListItemView r6 = (com.moovit.design.view.list.ListItemView) r6
            com.moovit.image.model.Image r9 = r4.mo45525c()
            r6.setIcon((com.moovit.image.model.Image) r9)
            java.lang.String r9 = r4.f38986c
            r6.setTitle((java.lang.CharSequence) r9)
            android.content.res.Resources r9 = r0.getResources()
            java.lang.Object r10 = c00.C13717b.m34256c(r15)
            com.moovit.app.mot.model.MotActivation r10 = (com.moovit.app.mot.model.MotActivation) r10
            com.moovit.app.mot.model.MotActivation$ActivationType r11 = r10.f38994k
            com.moovit.app.mot.model.MotActivation$ActivationType r12 = com.moovit.app.mot.model.MotActivation.ActivationType.DEPARTURE
            boolean r12 = r11.equals(r12)
            r13 = 2131888036(0x7f1207a4, float:1.9410696E38)
            if (r12 == 0) goto L_0x00d7
            java.lang.CharSequence r15 = r9.getText(r13)
            goto L_0x010d
        L_0x00d7:
            com.moovit.app.mot.model.MotActivation$ActivationType r12 = com.moovit.app.mot.model.MotActivation.ActivationType.ENTRANCE_ONLY
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x00e4
            java.lang.CharSequence r15 = r9.getText(r13)
            goto L_0x010d
        L_0x00e4:
            com.moovit.app.mot.model.MotActivationStationInfo r10 = r10.f38997n
            if (r10 == 0) goto L_0x00ec
            com.moovit.transit.TransitStop r1 = r10.mo45574b()
        L_0x00ec:
            if (r1 != 0) goto L_0x00f6
            r15 = 2131888038(0x7f1207a6, float:1.94107E38)
            java.lang.CharSequence r15 = r9.getText(r15)
            goto L_0x010d
        L_0x00f6:
            r1 = 2131755031(0x7f100017, float:1.914093E38)
            int r10 = r15.size()
            java.lang.Object[] r11 = new java.lang.Object[r8]
            int r15 = r15.size()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r11[r5] = r15
            java.lang.String r15 = r9.getQuantityString(r1, r10, r11)
        L_0x010d:
            r6.setSubtitle((java.lang.CharSequence) r15)
            x5.c r15 = new x5.c
            r1 = 3
            r15.<init>(r1, r0, r4)
            r6.setOnClickListener(r15)
            android.view.ViewGroup r15 = r0.f47039p
            r15.addView(r6, r8)
        L_0x011e:
            java.lang.String r15 = "CONFIGURATION"
            java.lang.Object r15 = r0.mo46776J1(r15)
            q00.a r15 = (q00.C19047a) r15
            vr.a$t r1 = p874vr.C20199a.f51243E0
            java.lang.Object r15 = r15.mo51505b(r1)
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 != 0) goto L_0x0135
            goto L_0x015f
        L_0x0135:
            if (r2 == 0) goto L_0x015f
            com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus r15 = r2.f64035d
            com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus r1 = com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus.PENDING
            boolean r15 = r15.isAtLeast(r1)
            if (r15 != 0) goto L_0x0142
            goto L_0x015f
        L_0x0142:
            r15 = 2131559028(0x7f0d0274, float:1.8743388E38)
            android.view.ViewGroup r1 = r0.f47039p
            android.view.View r15 = r3.inflate(r15, r1, r5)
            android.widget.TextView r15 = (android.widget.TextView) r15
            com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus r1 = r2.f64035d
            w40.C25765g.m64315c(r15, r1)
            x5.b r1 = new x5.b
            r1.<init>(r7, r0, r2)
            r15.setOnClickListener(r1)
            android.view.ViewGroup r0 = r0.f47039p
            r0.addView(r15, r8)
        L_0x015f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p664mu.C18449h.onSuccess(java.lang.Object):void");
    }
}
