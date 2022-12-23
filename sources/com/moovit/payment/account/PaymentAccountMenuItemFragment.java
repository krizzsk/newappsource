package com.moovit.payment.account;

import a00.C13382a;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.tasks.OnFailureListener;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.moovit.payment.account.balance.BalancePaymentMethod;
import com.moovit.payment.account.bank.BankPaymentMethod;
import com.moovit.payment.account.creditcard.CreditCardPaymentMethod;
import com.moovit.payment.account.externalpayment.ExternalPaymentMethod;
import com.moovit.payment.account.model.PaymentAccountBadgeType;
import com.moovit.payment.account.paymentmethod.PaymentMethod;
import java.util.Collections;
import java.util.Set;
import p484ff.C16984m;
import p501fw.C17102a;
import p910xf.C20481j;
import p977zz.C20964s0;
import q00.C19047a;
import v40.C25749d;
import v40.C25750e;
import v40.C25751f;
import v50.C20101a;
import w40.C25761d;

public class PaymentAccountMenuItemFragment extends C15682c<MoovitActivity> {

    /* renamed from: r */
    public static final /* synthetic */ int f63832r = 0;

    /* renamed from: n */
    public final C25602a f63833n = new C25602a();

    /* renamed from: o */
    public final C25603b f63834o = new C25603b();

    /* renamed from: p */
    public TextView f63835p;

    /* renamed from: q */
    public ListItemView f63836q;

    /* renamed from: com.moovit.payment.account.PaymentAccountMenuItemFragment$a */
    public class C25602a extends BroadcastReceiver {
        public C25602a() {
        }

        public final void onReceive(Context context, Intent intent) {
            PaymentAccountMenuItemFragment paymentAccountMenuItemFragment = PaymentAccountMenuItemFragment.this;
            int i = PaymentAccountMenuItemFragment.f63832r;
            paymentAccountMenuItemFragment.mo83330o2();
        }
    }

    /* renamed from: com.moovit.payment.account.PaymentAccountMenuItemFragment$b */
    public class C25603b implements PaymentMethod.C25688a<Void, String> {
        /* renamed from: C1 */
        public final /* bridge */ /* synthetic */ Object mo48923C1(CreditCardPaymentMethod creditCardPaymentMethod, Object obj) {
            Void voidR = (Void) obj;
            return null;
        }

        /* renamed from: K0 */
        public final /* bridge */ /* synthetic */ Object mo48924K0(ExternalPaymentMethod externalPaymentMethod, Object obj) {
            Void voidR = (Void) obj;
            return null;
        }

        /* renamed from: u */
        public final Object mo48929u(BalancePaymentMethod balancePaymentMethod, Object obj) {
            Void voidR = (Void) obj;
            return balancePaymentMethod.f63926e.f63930d.toString();
        }

        /* renamed from: z0 */
        public final /* bridge */ /* synthetic */ Object mo48930z0(BankPaymentMethod bankPaymentMethod, Object obj) {
            Void voidR = (Void) obj;
            return null;
        }
    }

    /* renamed from: com.moovit.payment.account.PaymentAccountMenuItemFragment$c */
    public static /* synthetic */ class C25604c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f63838a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.moovit.payment.account.model.PaymentAccountBadgeType[] r0 = com.moovit.payment.account.model.PaymentAccountBadgeType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f63838a = r0
                com.moovit.payment.account.model.PaymentAccountBadgeType r1 = com.moovit.payment.account.model.PaymentAccountBadgeType.INFO     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f63838a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.payment.account.model.PaymentAccountBadgeType r1 = com.moovit.payment.account.model.PaymentAccountBadgeType.POSITIVE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f63838a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.payment.account.model.PaymentAccountBadgeType r1 = com.moovit.payment.account.model.PaymentAccountBadgeType.ALERT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f63838a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.payment.account.model.PaymentAccountBadgeType r1 = com.moovit.payment.account.model.PaymentAccountBadgeType.CRITICAL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.payment.account.PaymentAccountMenuItemFragment.C25604c.<clinit>():void");
        }
    }

    public PaymentAccountMenuItemFragment() {
        super(MoovitActivity.class);
    }

    /* renamed from: m2 */
    public static void m64002m2(ListItemView listItemView, PaymentAccountBadgeType paymentAccountBadgeType) {
        int i = C25604c.f63838a[paymentAccountBadgeType.ordinal()];
        if (i == 1) {
            listItemView.setAccessoryDrawable(C25749d.ic_service_info_16_info);
        } else if (i == 2) {
            listItemView.setAccessoryDrawable(C25749d.ic_service_regular_16_good);
        } else if (i == 3) {
            listItemView.setAccessoryDrawable(C25749d.ic_alert_pending_full_16_problem);
        } else if (i == 4) {
            listItemView.setAccessoryDrawable(C25749d.ic_alert_circ_16_critical);
        }
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return Collections.singleton("CONFIGURATION");
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        mo83330o2();
    }

    /* renamed from: n2 */
    public final void mo83329n2(int i, int i2, int i3, String str, boolean z, boolean z2) {
        int i4;
        this.f63836q.setTag(C25750e.view_tag_param1, str);
        this.f63836q.setTag(C25750e.view_tag_param2, Boolean.valueOf(z));
        this.f63836q.setTag(C25750e.view_tag_param3, Boolean.valueOf(z2));
        this.f63836q.setIcon(i);
        this.f63836q.setText(i2);
        this.f63836q.setOnClickListener(new C17102a(this, 15));
        this.f63836q.setVisibility(0);
        TextView textView = this.f63835p;
        if (C20964s0.m49092j(textView.getText())) {
            i4 = 8;
        } else {
            i4 = 0;
        }
        textView.setVisibility(i4);
        if (i3 != 0) {
            ListItemView listItemView = this.f63836q;
            C13382a.m33674j(listItemView, listItemView.getText(), getString(i3));
            return;
        }
        ListItemView listItemView2 = this.f63836q;
        listItemView2.setContentDescription(listItemView2.getText());
    }

    /* renamed from: o2 */
    public final void mo83330o2() {
        if (this.f40824e && mo46775H1()) {
            if (!((Boolean) ((C19047a) mo46776J1("CONFIGURATION")).mo51505b(C20101a.f51006S)).booleanValue()) {
                UiUtils.m40238F(8, this.f63835p, this.f63836q);
                return;
            }
            C25761d.m64299a().mo83587b(false).addOnSuccessListener((Activity) requireActivity(), new C16984m(this, 11)).addOnFailureListener((Activity) requireActivity(), (OnFailureListener) new C20481j(this, 5));
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C25751f.payment_account_fragment, viewGroup, false);
        this.f63835p = (TextView) inflate.findViewById(C25750e.title);
        this.f63836q = (ListItemView) inflate.findViewById(C25750e.payment_menu_item);
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        C25761d.m64300h(requireContext(), this.f63833n);
        mo83330o2();
    }

    public final void onStop() {
        super.onStop();
        C25761d.m64301k(requireContext(), this.f63833n);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: com.moovit.payment.account.paymentmethod.PaymentMethod} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0088 A[SYNTHETIC] */
    /* renamed from: p2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo83331p2(com.moovit.payment.account.model.PaymentAccount r10) {
        /*
            r9 = this;
            boolean r0 = r9.isAdded()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.String r0 = "CONFIGURATION"
            java.lang.Object r0 = r9.mo46776J1(r0)
            q00.a r0 = (q00.C19047a) r0
            r00.h r1 = v50.C20101a.f51007T
            java.lang.Object r0 = r0.mo51505b(r1)
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            r0 = 1
            com.moovit.payment.account.model.PaymentAccountContextStatus[] r1 = new com.moovit.payment.account.model.PaymentAccountContextStatus[r0]
            com.moovit.payment.account.model.PaymentAccountContextStatus r2 = com.moovit.payment.account.model.PaymentAccountContextStatus.DISCONNECTED
            r8 = 0
            r1[r8] = r2
            boolean r1 = com.moovit.payment.account.model.PaymentAccount.m64175c(r10, r5, r1)
            if (r1 == 0) goto L_0x0032
            int r2 = v40.C25749d.wdg_more_menu_img_reconnect_24
            int r3 = v40.C25754i.more_external_account_reconnect
            r4 = 0
            r6 = 0
            r7 = 1
            r1 = r9
            r1.mo83329n2(r2, r3, r4, r5, r6, r7)
            goto L_0x005d
        L_0x0032:
            w40.d r1 = w40.C25761d.m64299a()
            boolean r1 = r1.mo83590e()
            if (r1 == 0) goto L_0x0051
            int r2 = v40.C25749d.wdg_more_menu_img_payment_account_24
            int r3 = v40.C25754i.more_payment_account
            r4 = 0
            com.moovit.payment.account.model.PaymentAccountContextStatus[] r1 = new com.moovit.payment.account.model.PaymentAccountContextStatus[r0]
            com.moovit.payment.account.model.PaymentAccountContextStatus r6 = com.moovit.payment.account.model.PaymentAccountContextStatus.CONNECTED
            r1[r8] = r6
            boolean r6 = com.moovit.payment.account.model.PaymentAccount.m64175c(r10, r5, r1)
            r7 = 0
            r1 = r9
            r1.mo83329n2(r2, r3, r4, r5, r6, r7)
            goto L_0x005d
        L_0x0051:
            int r2 = v40.C25749d.wdg_more_menu_img_reconnect_24
            int r3 = v40.C25754i.more_payment_signup
            int r4 = v40.C25754i.voiceover_more_join_hint
            r6 = 0
            r7 = 0
            r1 = r9
            r1.mo83329n2(r2, r3, r4, r5, r6, r7)
        L_0x005d:
            com.moovit.design.view.list.ListItemView r1 = r9.f63836q
            r2 = 0
            if (r10 != 0) goto L_0x0067
            r1.setAccessoryView((android.view.View) r2)
            goto L_0x00d8
        L_0x0067:
            java.util.List<com.moovit.payment.account.model.PaymentAccountProfile> r3 = r10.f64017f
            java.util.Iterator r3 = r3.iterator()
        L_0x006d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0088
            java.lang.Object r4 = r3.next()
            com.moovit.payment.account.model.PaymentAccountProfile r4 = (com.moovit.payment.account.model.PaymentAccountProfile) r4
            com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus r4 = r4.f64035d
            com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus r5 = com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus.EXPIRED
            if (r4 == r5) goto L_0x00a0
            com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus r5 = com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus.NOT_VALID
            if (r4 == r5) goto L_0x00a0
            com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus r5 = com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus.NOT_UPLOADED
            if (r4 != r5) goto L_0x006d
            goto L_0x00a0
        L_0x0088:
            java.util.List<com.moovit.payment.account.model.PaymentAccountCertificatePreview> r3 = r10.f64018g
            java.util.Iterator r3 = r3.iterator()
        L_0x008e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00a1
            java.lang.Object r4 = r3.next()
            com.moovit.payment.account.model.PaymentAccountCertificatePreview r4 = (com.moovit.payment.account.model.PaymentAccountCertificatePreview) r4
            com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus r4 = r4.f64028g
            com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus r5 = com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus.NOT_VALID
            if (r4 != r5) goto L_0x008e
        L_0x00a0:
            r0 = 0
        L_0x00a1:
            if (r0 != 0) goto L_0x00a9
            com.moovit.payment.account.model.PaymentAccountBadgeType r10 = com.moovit.payment.account.model.PaymentAccountBadgeType.CRITICAL
            m64002m2(r1, r10)
            goto L_0x00d8
        L_0x00a9:
            com.moovit.payment.account.model.PaymentAccountBadgeType r0 = r10.f64019h
            if (r0 == 0) goto L_0x00b1
            m64002m2(r1, r0)
            goto L_0x00d8
        L_0x00b1:
            java.util.List<com.moovit.payment.account.paymentmethod.PaymentMethod> r0 = r10.f64016e
            tt.f r3 = new tt.f
            r4 = 3
            r3.<init>(r4)
            java.lang.Object r0 = c00.C13723g.m34286g(r0, r3)
            com.moovit.payment.account.paymentmethod.PaymentMethod r0 = (com.moovit.payment.account.paymentmethod.PaymentMethod) r0
            if (r0 != 0) goto L_0x00ca
            java.util.List<com.moovit.payment.account.paymentmethod.PaymentMethod> r10 = r10.f64016e
            java.lang.Object r10 = c00.C13717b.m34256c(r10)
            r0 = r10
            com.moovit.payment.account.paymentmethod.PaymentMethod r0 = (com.moovit.payment.account.paymentmethod.PaymentMethod) r0
        L_0x00ca:
            if (r0 == 0) goto L_0x00d5
            com.moovit.payment.account.PaymentAccountMenuItemFragment$b r10 = r9.f63834o
            java.lang.Object r10 = r0.mo83416b(r10, r2)
            r2 = r10
            java.lang.String r2 = (java.lang.String) r2
        L_0x00d5:
            r1.setAccessoryText((java.lang.CharSequence) r2)
        L_0x00d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.payment.account.PaymentAccountMenuItemFragment.mo83331p2(com.moovit.payment.account.model.PaymentAccount):void");
    }
}
