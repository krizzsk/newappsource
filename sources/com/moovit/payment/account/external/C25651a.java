package com.moovit.payment.account.external;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.C0207b;
import com.google.android.gms.tasks.OnFailureListener;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.design.view.list.ListItemView;
import com.moovit.payment.account.external.ExternalPaymentAccountHelper;
import com.moovit.payment.account.model.PaymentAccount;
import com.moovit.payment.account.model.PaymentAccountContextStatus;
import p065e.C4413c;
import p372at.C13515b;
import p373au.C13533e;
import p757qu.C19182e;
import p805su.C19543e;
import v40.C25749d;
import v40.C25750e;
import v40.C25751f;
import w40.C25761d;

/* renamed from: com.moovit.payment.account.external.a */
public class C25651a extends C15682c<MoovitActivity> {

    /* renamed from: s */
    public static final /* synthetic */ int f63987s = 0;

    /* renamed from: n */
    public final C0207b<Intent> f63988n = registerForActivityResult(new C4413c(), new C13533e(this, 12));

    /* renamed from: o */
    public final C25652a f63989o = new C25652a();

    /* renamed from: p */
    public String f63990p;

    /* renamed from: q */
    public ExternalPaymentAccountHelper f63991q;

    /* renamed from: r */
    public ListItemView f63992r;

    /* renamed from: com.moovit.payment.account.external.a$a */
    public class C25652a extends BroadcastReceiver {
        public C25652a() {
        }

        public final void onReceive(Context context, Intent intent) {
            C25651a aVar = C25651a.this;
            int i = C25651a.f63987s;
            aVar.mo83456m2();
        }
    }

    public C25651a() {
        super(MoovitActivity.class);
    }

    /* renamed from: m2 */
    public final void mo83456m2() {
        C25761d.m64299a().mo83587b(false).addOnSuccessListener((Activity) requireActivity(), new C13515b(this, 7)).addOnFailureListener((Activity) requireActivity(), (OnFailureListener) new C19543e(this, 4));
    }

    /* renamed from: n2 */
    public final void mo83457n2(PaymentAccount paymentAccount) {
        PaymentAccountContextStatus paymentAccountContextStatus;
        boolean z;
        int i;
        String str;
        Context context = getContext();
        if (context != null && getView() != null && this.f40824e) {
            if (paymentAccount != null) {
                paymentAccountContextStatus = paymentAccount.mo83495b(this.f63990p);
            } else {
                paymentAccountContextStatus = PaymentAccountContextStatus.DISCONNECTED;
            }
            if (paymentAccountContextStatus == null || !this.f63991q.mo44688M1(paymentAccountContextStatus)) {
                this.f63992r.setVisibility(8);
                return;
            }
            ExternalPaymentAccountHelper.C25647a u1 = this.f63991q.mo44695u1(context, paymentAccountContextStatus);
            if (u1.f63973b != null) {
                z = true;
            } else {
                z = false;
            }
            this.f63992r.setOnClickListener(new C19182e(1, this, u1, paymentAccountContextStatus));
            this.f63992r.setClickable(z);
            this.f63992r.setIcon(this.f63991q.getIconResId());
            this.f63992r.setTitle(this.f63991q.getNameResId());
            this.f63992r.setSubtitle(u1.f63972a);
            this.f63992r.setIconTopEndDecorationDrawable(this.f63991q.mo44691e(paymentAccountContextStatus));
            ListItemView listItemView = this.f63992r;
            if (z) {
                i = C25749d.ic_arrow_end_24_on_surface_emphasis_medium;
            } else {
                i = 0;
            }
            listItemView.setAccessoryDrawable(i);
            int i1 = this.f63991q.mo44694i1(paymentAccountContextStatus);
            ListItemView listItemView2 = this.f63992r;
            if (i1 != 0) {
                str = context.getString(i1);
            } else {
                str = null;
            }
            listItemView2.setContentDescription(str);
            this.f63992r.setVisibility(0);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle Q1 = mo46782Q1();
        this.f63990p = Q1.getString("paymentContext");
        ExternalPaymentAccountHelper externalPaymentAccountHelper = (ExternalPaymentAccountHelper) Q1.getParcelable("helper");
        this.f63991q = externalPaymentAccountHelper;
        if (this.f63990p == null || externalPaymentAccountHelper == null) {
            throw new ApplicationBugException("Did you use ExternalPaymentAccountFragment.newInstance(...)?");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C25751f.external_payment_account_fragment, viewGroup, false);
        this.f63992r = (ListItemView) inflate.findViewById(C25750e.item);
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        C25761d.m64300h(requireContext(), this.f63989o);
        mo83456m2();
    }

    public final void onStop() {
        super.onStop();
        C25761d.m64301k(requireContext(), this.f63989o);
    }
}
