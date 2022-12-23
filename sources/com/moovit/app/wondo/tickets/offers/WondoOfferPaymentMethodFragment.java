package com.moovit.app.wondo.tickets.offers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.moovit.C15682c;
import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.commons.utils.UiUtils;
import com.tranzmate.R;
import java.util.Collections;
import java.util.Set;
import p527gy.C17261e;
import p597jy.C17979a;
import p977zz.C20964s0;

public class WondoOfferPaymentMethodFragment extends C15682c<WondoOfferDetailsActivity> {

    /* renamed from: r */
    public static final /* synthetic */ int f40751r = 0;

    /* renamed from: n */
    public final C15666a f40752n = new C15666a();

    /* renamed from: o */
    public TextView f40753o;

    /* renamed from: p */
    public TextView f40754p;

    /* renamed from: q */
    public String f40755q;

    /* renamed from: com.moovit.app.wondo.tickets.offers.WondoOfferPaymentMethodFragment$a */
    public class C15666a extends BroadcastReceiver {
        public C15666a() {
        }

        public final void onReceive(Context context, Intent intent) {
            String str;
            if (WondoOfferPaymentMethodFragment.this.getView() != null) {
                if (intent == null) {
                    str = null;
                } else {
                    str = intent.getAction();
                }
                if ("com.moovit.useraccount.manager.user_profile_update_success".equals(str)) {
                    WondoOfferPaymentMethodFragment wondoOfferPaymentMethodFragment = WondoOfferPaymentMethodFragment.this;
                    int i = WondoOfferPaymentMethodFragment.f40751r;
                    wondoOfferPaymentMethodFragment.mo46734m2();
                }
            }
        }
    }

    public WondoOfferPaymentMethodFragment() {
        super(WondoOfferDetailsActivity.class);
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return Collections.singleton("USER_ACCOUNT");
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        mo46734m2();
    }

    /* renamed from: m2 */
    public final void mo46734m2() {
        if (this.f40824e && mo46775H1()) {
            UiUtils.m40238F(8, this.f40753o, this.f40754p);
            ((UserAccountManager) mo46776J1("USER_ACCOUNT")).mo46575f().mo49805e().f44614m.getClass();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f40755q = bundle.getString("paymentCustomerToken");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.wondo_offer_payment_method_fragment, viewGroup, false);
        ProgressBar progressBar = (ProgressBar) inflate.findViewById(R.id.progress_bar);
        this.f40753o = (TextView) inflate.findViewById(R.id.label);
        TextView textView = (TextView) inflate.findViewById(R.id.change_button);
        this.f40754p = textView;
        textView.setOnClickListener(new C17979a(this, 1));
        TextView textView2 = this.f40754p;
        String str = C20964s0.f52718a;
        textView2.setPaintFlags(textView2.getPaintFlags() | 8);
        return inflate;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("paymentCustomerToken", this.f40755q);
    }

    public final void onStart() {
        super.onStart();
        mo46734m2();
        C17261e.m43266g(requireContext(), this.f40752n);
    }

    public final void onStop() {
        super.onStop();
        C17261e.m43267h(requireContext(), this.f40752n);
    }
}
