package com.moovit.app.tod.center.subscriptions;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.lifecycle.C1021l0;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.design.view.list.ListItemView;
import com.tranzmate.R;
import ff0.C23349c;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import mf0.C24362h;
import mf0.C24365j;
import p297w5.C6994a;
import p474et.C16877i;
import p474et.C16878j;
import p583jk.C17875h;
import p609km.C18097c;
import p669mz.C18490f;
import wh0.C25177g;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo59060d2 = {"Lcom/moovit/app/tod/center/subscriptions/TodWeeklySubscriptionDetailsFragment;", "Lcom/moovit/c;", "Lcom/moovit/MoovitActivity;", "<init>", "()V", "App_moovitWorldRelease"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class TodWeeklySubscriptionDetailsFragment extends C15682c<MoovitActivity> {

    /* renamed from: u */
    public static final /* synthetic */ int f40230u = 0;

    /* renamed from: n */
    public final C1021l0 f40231n = C18097c.m44768b(this, C24365j.m61219a(TodSubscriptionDetailsViewModel.class), new C15499xc8ebf061(this), new C15500xc8ebf062(this), new C15501xc8ebf063(this));

    /* renamed from: o */
    public TextView f40232o;

    /* renamed from: p */
    public ListItemView f40233p;

    /* renamed from: q */
    public ListItemView f40234q;

    /* renamed from: r */
    public ListItemView f40235r;

    /* renamed from: s */
    public ListItemView f40236s;

    /* renamed from: t */
    public ListItemView f40237t;

    public TodWeeklySubscriptionDetailsFragment() {
        super(MoovitActivity.class);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C24362h.m61211f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.tod_weekly_subscription_details_fragment, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C24362h.m61211f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.order_details);
        C24362h.m61210e(findViewById, "view.findViewById(R.id.order_details)");
        this.f40232o = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.pickup);
        C24362h.m61210e(findViewById2, "view.findViewById(R.id.pickup)");
        this.f40233p = (ListItemView) findViewById2;
        View findViewById3 = view.findViewById(R.id.drop_off);
        C24362h.m61210e(findViewById3, "view.findViewById(R.id.drop_off)");
        this.f40234q = (ListItemView) findViewById3;
        View findViewById4 = view.findViewById(R.id.subscription);
        C24362h.m61210e(findViewById4, "view.findViewById(R.id.subscription)");
        this.f40235r = (ListItemView) findViewById4;
        View findViewById5 = view.findViewById(R.id.passengers);
        C24362h.m61210e(findViewById5, "view.findViewById(R.id.passengers)");
        this.f40236s = (ListItemView) findViewById5;
        View findViewById6 = view.findViewById(R.id.ride_fare);
        C24362h.m61210e(findViewById6, "view.findViewById(R.id.ride_fare)");
        this.f40237t = (ListItemView) findViewById6;
        View findViewById7 = view.findViewById(R.id.cancel_button);
        C24362h.m61210e(findViewById7, "view.findViewById(R.id.cancel_button)");
        ((Button) findViewById7).setOnClickListener(new C6994a(this, 27));
        ((TodSubscriptionDetailsViewModel) this.f40231n.getValue()).f40225f.observe(getViewLifecycleOwner(), new C16877i(new TodWeeklySubscriptionDetailsFragment$onViewCreated$1(this), 3));
    }

    /* renamed from: t0 */
    public final boolean mo19430t0(String str, int i, Bundle bundle) {
        C24362h.m61211f(bundle, "args");
        if (C24362h.m61206a("cancel_recurring_order_dialog_fragment_tag", str)) {
            if (i == -1) {
                mo46796i2();
                TodSubscriptionDetailsViewModel todSubscriptionDetailsViewModel = (TodSubscriptionDetailsViewModel) this.f40231n.getValue();
                todSubscriptionDetailsViewModel.getClass();
                C18490f fVar = new C18490f();
                String value = todSubscriptionDetailsViewModel.f40223d.getValue();
                if (value != null) {
                    C25177g.m63218b(C17875h.m44315z(todSubscriptionDetailsViewModel), (CoroutineContext) null, new TodSubscriptionDetailsViewModel$cancelSubscription$1(todSubscriptionDetailsViewModel, value, fVar, (C23349c<? super TodSubscriptionDetailsViewModel$cancelSubscription$1>) null), 3);
                }
                fVar.observe(getViewLifecycleOwner(), new C16878j(new C15502xfe5f9a56(this), 2));
            }
            return true;
        }
        super.mo19430t0(str, i, bundle);
        return true;
    }
}
