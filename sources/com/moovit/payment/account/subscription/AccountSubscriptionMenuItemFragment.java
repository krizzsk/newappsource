package com.moovit.payment.account.subscription;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.design.view.list.ListItemView;
import ff0.C23349c;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import mf0.C24362h;
import p584jl.C17885a;
import v40.C25750e;
import v40.C25751f;
import w40.C25761d;
import wh0.C25177g;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo59060d2 = {"Lcom/moovit/payment/account/subscription/AccountSubscriptionMenuItemFragment;", "Lcom/moovit/c;", "Lcom/moovit/MoovitActivity;", "<init>", "()V", "Payment_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class AccountSubscriptionMenuItemFragment extends C15682c<MoovitActivity> {

    /* renamed from: p */
    public static final /* synthetic */ int f64124p = 0;

    /* renamed from: n */
    public final C25714xf4300167 f64125n = new C25714xf4300167(this);

    /* renamed from: o */
    public ListItemView f64126o;

    public AccountSubscriptionMenuItemFragment() {
        super(MoovitActivity.class);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C24362h.m61211f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C25751f.account_subscription_menu_item_fragment, viewGroup, false);
        C24362h.m61210e(inflate, "inflater.inflate(R.layou…agment, container, false)");
        View findViewById = inflate.findViewById(C25750e.menu_item);
        C24362h.m61210e(findViewById, "view.findViewById(R.id.menu_item)");
        this.f64126o = (ListItemView) findViewById;
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        C25761d.m64300h(requireContext(), this.f64125n);
        C25177g.m63218b(C17885a.m44426W(this), (CoroutineContext) null, new AccountSubscriptionMenuItemFragment$updateUi$1(this, (C23349c<? super AccountSubscriptionMenuItemFragment$updateUi$1>) null), 3);
    }

    public final void onStop() {
        super.onStop();
        C25761d.m64301k(requireContext(), this.f64125n);
    }
}
