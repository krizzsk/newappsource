package com.moovit.payment.account.personalinfo;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import f10.C16932c;
import java.util.Collections;
import java.util.Set;
import p783rw.C19370b;
import q00.C19047a;
import v40.C25750e;
import v40.C25751f;
import w40.C25761d;

public class PaymentAccountPersonalInfoFragment extends C15682c<MoovitActivity> {

    /* renamed from: r */
    public static final /* synthetic */ int f64090r = 0;

    /* renamed from: n */
    public final C25700a f64091n = new C25700a();

    /* renamed from: o */
    public View f64092o;

    /* renamed from: p */
    public TextView f64093p;

    /* renamed from: q */
    public TextView f64094q;

    /* renamed from: com.moovit.payment.account.personalinfo.PaymentAccountPersonalInfoFragment$a */
    public class C25700a extends BroadcastReceiver {
        public C25700a() {
        }

        public final void onReceive(Context context, Intent intent) {
            PaymentAccountPersonalInfoFragment paymentAccountPersonalInfoFragment = PaymentAccountPersonalInfoFragment.this;
            int i = PaymentAccountPersonalInfoFragment.f64090r;
            paymentAccountPersonalInfoFragment.mo83547m2();
        }
    }

    public PaymentAccountPersonalInfoFragment() {
        super(MoovitActivity.class);
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return Collections.singleton("CONFIGURATION");
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        mo83547m2();
    }

    /* renamed from: m2 */
    public final void mo83547m2() {
        if (this.f40824e && mo46775H1()) {
            C25761d.m64299a().mo83587b(false).addOnCompleteListener((Activity) requireActivity(), new C16932c(1, this, (C19047a) mo46776J1("CONFIGURATION")));
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C25751f.payment_account_personal_info_fragment, viewGroup, false);
        this.f64092o = inflate.findViewById(C25750e.card_view);
        this.f64093p = (TextView) inflate.findViewById(C25750e.account_name);
        this.f64094q = (TextView) inflate.findViewById(C25750e.account_email);
        inflate.findViewById(C25750e.show_details_view).setOnClickListener(new C19370b(this, 12));
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        C25761d.m64300h(requireContext(), this.f64091n);
        mo83547m2();
    }

    public final void onStop() {
        super.onStop();
        C25761d.m64301k(requireContext(), this.f64091n);
    }
}
