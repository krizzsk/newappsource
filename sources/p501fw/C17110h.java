package p501fw;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.C1044w;
import androidx.recyclerview.widget.RecyclerView;
import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import c70.C13751d;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitApplication;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.subscription.C15364b;
import com.moovit.app.subscription.MoovitSubscriptionsManager;
import com.moovit.app.subscription.model.SubscriptionDetails;
import com.moovit.app.tod.TodRideActivity;
import com.moovit.app.tod.bookingflow.TodBookingOrderViewModel;
import com.moovit.design.view.list.ListItemView;
import com.moovit.payment.gateway.PaymentGatewayInfo;
import com.moovit.request.RequestOptions;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.CurrencyAmount;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import f90.C12640b;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p066e0.C4454r0;
import p376ax.C13546h;
import p501fw.C17113k;
import p543hq.C17474b;
import p596jx.C17968p;
import p672ne.C18540b;
import p927xw.C20646m;
import p977zz.C20961r;
import p977zz.C20963s;
import w50.C20283g;
import y50.C20703a;

/* renamed from: fw.h */
public final /* synthetic */ class C17110h implements C1044w {

    /* renamed from: a */
    public final /* synthetic */ int f44282a;

    /* renamed from: b */
    public final /* synthetic */ Object f44283b;

    public /* synthetic */ C17110h(Object obj, int i) {
        this.f44282a = i;
        this.f44283b = obj;
    }

    public final void onChanged(Object obj) {
        CurrencyAmount currencyAmount;
        String str;
        boolean z = true;
        String str2 = null;
        switch (this.f44282a) {
            case 0:
                C17113k kVar = (C17113k) this.f44283b;
                C20961r rVar = (C20961r) obj;
                BigDecimal bigDecimal = C17113k.f44286p;
                View view = kVar.getView();
                if (view != null && kVar.mo46775H1()) {
                    RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
                    if (!rVar.f52711a || C13717b.m34258e((Collection) rVar.f52712b)) {
                        recyclerView.setAdapter(C13751d.m34340a(rVar.f52713c, recyclerView.getContext()));
                        kVar.f44288o.setVisibility(8);
                        return;
                    }
                    recyclerView.setAdapter(new C17113k.C17114a((List) rVar.f52712b));
                    kVar.f44288o.setVisibility(0);
                    kVar.mo49696m2();
                    List<SubscriptionDetails> list = (List) rVar.f52712b;
                    if (!C13717b.m34258e(list)) {
                        StringBuilder sb = new StringBuilder();
                        for (SubscriptionDetails subscriptionDetails : list) {
                            sb.append(subscriptionDetails.f39788b);
                            sb.append(" ,");
                            sb.append(subscriptionDetails.f39792f);
                            sb.append(" ,");
                            sb.append(subscriptionDetails.f39789c);
                            sb.append(" ,");
                        }
                        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.SUBSCRIPTIONS_OFFERS);
                        aVar.mo49939g(AnalyticsAttributeKey.QUERY_STRING, sb.toString());
                        kVar.mo46797j2(aVar.mo49933a());
                        return;
                    }
                    return;
                }
                return;
            case 1:
                C15364b bVar = (C15364b) this.f44283b;
                MoovitSubscriptionsManager.C15361d dVar = (MoovitSubscriptionsManager.C15361d) obj;
                if (dVar != null) {
                    bVar.getClass();
                    if (!dVar.f39772c.isEmpty()) {
                        ArrayList<O> c = C13720d.m34273c(dVar.f39772c, (C13722f) null, new C4454r0(6));
                        MoovitSubscriptionsManager c2 = MoovitSubscriptionsManager.m39315c((MoovitApplication) bVar.f3907b);
                        c2.getClass();
                        ExecutorService executorService = MoovitExecutors.COMPUTATION;
                        Tasks.call(executorService, new C17103b(c2, 0)).onSuccessTask(executorService, new C18540b(1, c2, c)).addOnCompleteListener((Executor) executorService, new C20963s(bVar.f39783e));
                        return;
                    }
                }
                bVar.f39783e.setValue(new C20961r(Collections.emptyList()));
                return;
            case 2:
                TodRideActivity todRideActivity = (TodRideActivity) this.f44283b;
                int i = TodRideActivity.f39996t0;
                todRideActivity.mo44540t2(R.string.tod_passenger_ride_change_destination_checking_message);
                C17968p pVar = new C17968p(todRideActivity.mo44548x1(), todRideActivity.f40003n0, (LocationDescriptor) obj);
                StringBuilder sb2 = new StringBuilder();
                C13715c.m34249o(C17968p.class, sb2, "_");
                sb2.append(pVar.f46050x.mo24310d());
                sb2.append("_");
                sb2.append(pVar.f46049w);
                String sb3 = sb2.toString();
                RequestOptions c3 = todRideActivity.f37293B.mo40680c();
                c3.f42909f = true;
                todRideActivity.mo44527k2(sb3, pVar, c3, new C20646m(todRideActivity));
                return;
            case 3:
                TodBookingOrderViewModel todBookingOrderViewModel = (TodBookingOrderViewModel) this.f44283b;
                todBookingOrderViewModel.mo46215d(todBookingOrderViewModel.f40072d.getValue(), (LocationDescriptor) obj);
                return;
            case 4:
                C13546h hVar = (C13546h) this.f44283b;
                TodBookingOrderViewModel.OrderInformation orderInformation = (TodBookingOrderViewModel.OrderInformation) obj;
                if (orderInformation != null) {
                    ListItemView listItemView = hVar.f33485s;
                    Context context = listItemView.getContext();
                    long j = orderInformation.f40084d;
                    if (j != -1) {
                        z = false;
                    }
                    if (z) {
                        str = context.getString(R.string.time_picker_leave_now);
                    } else {
                        str = C7925b.m18018f(context, j, false);
                    }
                    listItemView.setTitle((CharSequence) str);
                    return;
                }
                int i2 = C13546h.f33483w;
                hVar.getClass();
                return;
            case 5:
                C20283g gVar = (C20283g) this.f44283b;
                gVar.mo52457i((PaymentGatewayInfo) obj, gVar.f51434h.getValue(), gVar.f51436j.getValue(), gVar.f51435i.getValue());
                return;
            default:
                C12640b bVar2 = (C12640b) this.f44283b;
                C20703a aVar2 = (C20703a) obj;
                if (aVar2 != null) {
                    int i3 = C12640b.f31237s;
                    bVar2.getClass();
                    currencyAmount = aVar2.f52282f;
                } else {
                    currencyAmount = null;
                }
                ListItemView listItemView2 = bVar2.f31240r;
                if (currencyAmount != null) {
                    str2 = currencyAmount.toString();
                }
                listItemView2.setAccessoryText((CharSequence) str2);
                return;
        }
    }
}
