package com.moovit.app.tod.center.subscriptions;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.moovit.app.tod.center.C15489a;
import com.moovit.app.tod.center.TodAbstractCenterFragment;
import com.moovit.app.tod.model.TodSubscription;
import com.moovit.app.tod.model.TodSubscriptionShuttleInfo;
import com.moovit.app.tod.model.TodWeeklyShuttleSubscription;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.design.view.list.ListItemView;
import com.moovit.util.time.C7925b;
import com.moovit.util.time.DayTime;
import com.tranzmate.R;
import ja0.C12790a;
import ja0.C12797f;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C23825c;
import mf0.C24361g;
import mf0.C24362h;
import p272u5.C6707b;
import p478ex.C16888a;
import p977zz.C20964s0;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo59060d2 = {"Lcom/moovit/app/tod/center/subscriptions/TodSubscriptionsCenterFragment;", "Lcom/moovit/app/tod/center/TodAbstractCenterFragment;", "<init>", "()V", "a", "App_moovitWorldRelease"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class TodSubscriptionsCenterFragment extends TodAbstractCenterFragment {

    /* renamed from: r */
    public static final /* synthetic */ int f40227r = 0;

    /* renamed from: q */
    public final C15497a f40228q = new C15497a();

    /* renamed from: com.moovit.app.tod.center.subscriptions.TodSubscriptionsCenterFragment$a */
    public static final class C15497a extends C12790a<TodSubscription> {

        /* renamed from: h */
        public final C6707b f40229h = new C6707b(1);

        public C15497a() {
            super(new ArrayList());
        }

        public final int getItemViewType(int i) {
            TodSubscription todSubscription = (TodSubscription) mo39636j(i);
            if (todSubscription instanceof TodWeeklyShuttleSubscription) {
                return R.layout.tod_recurring_order_item;
            }
            StringBuilder k = C13555b.m33972k("Unknown subscription type: ");
            k.append(todSubscription.getClass().getName());
            throw new ApplicationBugException(k.toString());
        }

        public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
            Long l;
            C12797f fVar = (C12797f) a0Var;
            C24362h.m61211f(fVar, "holder");
            TodSubscription todSubscription = (TodSubscription) mo39636j(i);
            if (todSubscription instanceof TodWeeklyShuttleSubscription) {
                TodWeeklyShuttleSubscription todWeeklyShuttleSubscription = (TodWeeklyShuttleSubscription) todSubscription;
                View view = fVar.itemView;
                C24362h.m61210e(view, "holder.getItemView()");
                ListItemView listItemView = (ListItemView) view;
                Context context = listItemView.getContext();
                listItemView.setTag(todWeeklyShuttleSubscription.f40328c);
                TodSubscriptionShuttleInfo todSubscriptionShuttleInfo = todWeeklyShuttleSubscription.f40330e;
                listItemView.setIcon(todSubscriptionShuttleInfo.f40325e);
                CharSequence charSequence = todSubscriptionShuttleInfo.f40323c;
                DayTime dayTime = todSubscriptionShuttleInfo.f40326f.f40317c;
                if (dayTime != null) {
                    l = Long.valueOf(dayTime.mo24593b());
                } else {
                    l = null;
                }
                if (l != null) {
                    charSequence = C20964s0.m49097o(context.getString(R.string.string_list_delimiter_dot), charSequence, context.getString(R.string.tod_recurring_order_shuttle_time, new Object[]{C7925b.m18024l(context, l.longValue())}));
                }
                listItemView.setTitle(charSequence);
                listItemView.setSubtitle((CharSequence) C23825c.m58520q0(todWeeklyShuttleSubscription.f40329d.f40238b, (String) null, (String) null, (String) null, new C15498x9f9af850(context), 31));
            }
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            C24362h.m61211f(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
            inflate.setOnClickListener(this.f40229h);
            return new C12797f(inflate);
        }
    }

    /* renamed from: n2 */
    public final int mo46281n2() {
        return R.string.tod_passenger_rides_center_recurring_orders_empty_message;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C24362h.m61211f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        C24361g.m61135E(((C15489a) this.f40195o.getValue()).f40213h).observe(getViewLifecycleOwner(), new C16888a(new TodSubscriptionsCenterFragment$onViewCreated$1(this), 0));
    }
}
