package com.moovit.app.tod.center.subscriptions;

import android.content.Context;
import android.widget.TextView;
import bf0.C21050d;
import com.moovit.app.tod.model.TodSubscriptionJourneyInfo;
import com.moovit.app.tod.model.TodSubscriptionOrderInfo;
import com.moovit.app.tod.model.TodSubscriptionShuttleInfo;
import com.moovit.app.tod.model.TodWeeklyShuttleSubscription;
import com.moovit.app.tod.shuttle.C15536a;
import com.moovit.design.view.list.ListItemView;
import com.moovit.util.time.C7925b;
import com.moovit.util.time.DayTime;
import com.tranzmate.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;
import p977zz.C20964s0;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"Lcom/moovit/app/tod/model/TodWeeklyShuttleSubscription;", "it", "Lbf0/d;", "invoke", "(Lcom/moovit/app/tod/model/TodWeeklyShuttleSubscription;)V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
public final class TodWeeklySubscriptionDetailsFragment$onViewCreated$1 extends Lambda implements C24236l<TodWeeklyShuttleSubscription, C21050d> {
    public final /* synthetic */ TodWeeklySubscriptionDetailsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TodWeeklySubscriptionDetailsFragment$onViewCreated$1(TodWeeklySubscriptionDetailsFragment todWeeklySubscriptionDetailsFragment) {
        super(1);
        this.this$0 = todWeeklySubscriptionDetailsFragment;
    }

    public final Object invoke(Object obj) {
        Long l;
        TextView textView;
        TodWeeklyShuttleSubscription todWeeklyShuttleSubscription = (TodWeeklyShuttleSubscription) obj;
        TodWeeklySubscriptionDetailsFragment todWeeklySubscriptionDetailsFragment = this.this$0;
        int i = TodWeeklySubscriptionDetailsFragment.f40230u;
        if (todWeeklyShuttleSubscription != null) {
            Context requireContext = todWeeklySubscriptionDetailsFragment.requireContext();
            C24362h.m61210e(requireContext, "requireContext()");
            TodSubscriptionShuttleInfo todSubscriptionShuttleInfo = todWeeklyShuttleSubscription.f40330e;
            TodSubscriptionJourneyInfo todSubscriptionJourneyInfo = todSubscriptionShuttleInfo.f40326f;
            CharSequence charSequence = todSubscriptionShuttleInfo.f40323c;
            DayTime dayTime = todSubscriptionJourneyInfo.f40317c;
            if (dayTime != null) {
                l = Long.valueOf(dayTime.mo24593b());
            } else {
                l = null;
            }
            TextView textView2 = todWeeklySubscriptionDetailsFragment.f40232o;
            if (textView2 != null) {
                if (l != null) {
                    charSequence = C20964s0.m49097o(todWeeklySubscriptionDetailsFragment.getString(R.string.string_list_delimiter_dot), charSequence, todWeeklySubscriptionDetailsFragment.getString(R.string.tod_recurring_order_shuttle_time, C7925b.m18024l(requireContext, l.longValue())));
                    textView = textView2;
                } else {
                    textView = textView2;
                }
                textView.setText(charSequence);
                String f = todSubscriptionJourneyInfo.f40316b.mo24313f();
                ListItemView listItemView = todWeeklySubscriptionDetailsFragment.f40233p;
                if (listItemView != null) {
                    listItemView.setSubtitle((CharSequence) f);
                    String f2 = todSubscriptionJourneyInfo.f40318d.mo24313f();
                    ListItemView listItemView2 = todWeeklySubscriptionDetailsFragment.f40234q;
                    if (listItemView2 != null) {
                        listItemView2.setSubtitle((CharSequence) f2);
                        String b = C15536a.m39719b(requireContext, todWeeklyShuttleSubscription);
                        ListItemView listItemView3 = todWeeklySubscriptionDetailsFragment.f40235r;
                        if (listItemView3 != null) {
                            listItemView3.setSubtitle((CharSequence) b);
                            TodSubscriptionOrderInfo todSubscriptionOrderInfo = todSubscriptionShuttleInfo.f40327g;
                            String valueOf = String.valueOf(todSubscriptionOrderInfo.f40320b);
                            ListItemView listItemView4 = todWeeklySubscriptionDetailsFragment.f40236s;
                            if (listItemView4 != null) {
                                listItemView4.setAccessoryText((CharSequence) valueOf);
                                String currencyAmount = todSubscriptionOrderInfo.f40321c.toString();
                                C24362h.m61210e(currencyAmount, "orderInfo.price.toString()");
                                ListItemView listItemView5 = todWeeklySubscriptionDetailsFragment.f40237t;
                                if (listItemView5 != null) {
                                    listItemView5.setAccessoryText((CharSequence) currencyAmount);
                                } else {
                                    C24362h.m61217l("rideFareView");
                                    throw null;
                                }
                            } else {
                                C24362h.m61217l("passengersView");
                                throw null;
                            }
                        } else {
                            C24362h.m61217l("subscriptionView");
                            throw null;
                        }
                    } else {
                        C24362h.m61217l("dropOffView");
                        throw null;
                    }
                } else {
                    C24362h.m61217l("pickupView");
                    throw null;
                }
            } else {
                C24362h.m61217l("orderDetailsView");
                throw null;
            }
        } else {
            todWeeklySubscriptionDetailsFragment.getClass();
        }
        return C21050d.f52856a;
    }
}
