package com.moovit.payment.account.profile;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.design.view.list.ListItemView;
import java.util.Collections;
import java.util.Set;
import p687nt.C18588a;
import v40.C25750e;
import v40.C25751f;
import w40.C25761d;

public class PaymentAccountProfilesFragment extends C15682c<MoovitActivity> {

    /* renamed from: q */
    public static final /* synthetic */ int f64106q = 0;

    /* renamed from: n */
    public final C25704a f64107n = new C25704a();

    /* renamed from: o */
    public LinearLayout f64108o;

    /* renamed from: p */
    public ListItemView f64109p;

    /* renamed from: com.moovit.payment.account.profile.PaymentAccountProfilesFragment$a */
    public class C25704a extends BroadcastReceiver {
        public C25704a() {
        }

        public final void onReceive(Context context, Intent intent) {
            PaymentAccountProfilesFragment paymentAccountProfilesFragment = PaymentAccountProfilesFragment.this;
            int i = PaymentAccountProfilesFragment.f64106q;
            paymentAccountProfilesFragment.mo83554n2();
        }
    }

    public PaymentAccountProfilesFragment() {
        super(MoovitActivity.class);
    }

    /* renamed from: m2 */
    public static void m64262m2(LinearLayout linearLayout, int i) {
        int childCount = linearLayout.getChildCount();
        if (childCount != i) {
            if (childCount > i) {
                linearLayout.removeViews(i, childCount - i);
                return;
            }
            LayoutInflater from = LayoutInflater.from(linearLayout.getContext());
            while (childCount < i) {
                linearLayout.addView(from.inflate(C25751f.payment_account_profile_item, linearLayout, false));
                childCount++;
            }
        }
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return Collections.singleton("CONFIGURATION");
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        mo83554n2();
    }

    /* renamed from: n2 */
    public final void mo83554n2() {
        if (this.f40824e && mo46775H1()) {
            C25761d.m64299a().mo83587b(false).addOnCompleteListener((Activity) requireActivity(), new C18588a(this, 4));
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C25751f.payment_account_profiles_fragment, viewGroup, false);
        this.f64109p = (ListItemView) inflate.findViewById(C25750e.header);
        this.f64108o = (LinearLayout) inflate.findViewById(C25750e.profiles);
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        C25761d.m64300h(requireContext(), this.f64107n);
        mo83554n2();
    }

    public final void onStop() {
        super.onStop();
        C25761d.m64301k(requireContext(), this.f64107n);
    }
}
