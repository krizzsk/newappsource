package p122i7;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.lifecycle.C1044w;
import androidx.recyclerview.widget.RecyclerView;
import c00.C13717b;
import c70.C13751d;
import ce0.C21100e;
import com.cubic.umo.auth.activity.AuthActivity;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.app.tod.bookingflow.TodBookingOrderViewModel;
import com.moovit.app.tod.center.TodRidesCenterActivity;
import com.moovit.commons.utils.UiUtils;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.payment.gateway.PaymentGateway;
import com.moovit.payment.gateway.PaymentGatewayFragment;
import com.moovit.payment.gateway.PaymentGatewayInstructions;
import com.tranzmate.R;
import com.usebutton.sdk.internal.api.AppActionRequest;
import h60.C17327j1;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import k00.C17988b;
import mf0.C24362h;
import p009a8.C0114n;
import p122i7.C5298b;
import p501fw.C17108g;
import p555ie.C17589h;
import p613kq.C18115b;
import p923xs.C20569e;
import p923xs.C20571f;
import p946ys.C20764e;
import p949yv.C20772a;
import p977zz.C20961r;
import p977zz.C20963s;
import p977zz.C20975x0;
import w50.C20283g;
import y50.C20703a;
import z00.C20795a;
import z70.C13337m;
import zendesk.support.SimpleArticle;

/* renamed from: i7.a */
public final /* synthetic */ class C5297a implements C1044w {

    /* renamed from: a */
    public final /* synthetic */ int f17479a;

    /* renamed from: b */
    public final /* synthetic */ Object f17480b;

    public /* synthetic */ C5297a(Object obj, int i) {
        this.f17479a = i;
        this.f17480b = obj;
    }

    public final void onChanged(Object obj) {
        Object obj2 = null;
        switch (this.f17479a) {
            case 0:
                AuthActivity authActivity = (AuthActivity) this.f17480b;
                C5298b bVar = (C5298b) obj;
                int i = AuthActivity.f7728C;
                C24362h.m61211f(authActivity, "this$0");
                if (bVar instanceof C5298b.C5300b) {
                    authActivity.mo11598d1();
                    Intent intent = new Intent();
                    intent.putExtra("cubicId", ((C5298b.C5300b) bVar).f17481a);
                    authActivity.setResult(-1, intent);
                    authActivity.sendBroadcast(new Intent("com.cubic.auth.ACCOUNTS_CHANGE"));
                    authActivity.finish();
                    return;
                } else if (bVar instanceof C5298b.C5299a) {
                    authActivity.mo11598d1();
                    authActivity.setResult(0);
                    authActivity.finish();
                    return;
                } else {
                    return;
                }
            case 1:
                C20571f fVar = (C20571f) this.f17480b;
                C20764e.C20765a aVar = (C20764e.C20765a) obj;
                int i2 = C20571f.f52035w;
                fVar.getClass();
                Map<AnalyticsAttributeKey, String> singletonMap = Collections.singletonMap(AnalyticsAttributeKey.ID, Long.toString(fVar.f52040r));
                if (aVar.f52402c != null) {
                    C13337m mVar = fVar.f52038p;
                    if (C20975x0.m49118e(mVar.f33107a, aVar.f52400a)) {
                        mVar.f33108b = -2;
                        mVar.f33109c = singletonMap;
                    }
                    RecyclerView recyclerView = fVar.f52044v;
                    Context requireContext = fVar.requireContext();
                    C21100e.m49373x(requireContext, AppActionRequest.KEY_CONTEXT);
                    recyclerView.mo4627l0(new C20795a(C17988b.m44611b(R.drawable.img_empty_error, requireContext), (CharSequence) null, requireContext.getText(R.string.response_read_error_message)));
                    return;
                }
                List<SimpleArticle> list = aVar.f52401b;
                if (C13717b.m34258e(list)) {
                    fVar.f52038p.mo40230e(aVar.f52400a, 0, singletonMap, (Set<String>) null);
                    fVar.f52044v.mo4627l0(fVar.f52036n);
                    return;
                }
                fVar.f52038p.mo40230e(aVar.f52400a, list.size(), singletonMap, (Set<String>) null);
                C20569e eVar = fVar.f52037o;
                eVar.f52033h.clear();
                eVar.f52033h.ensureCapacity(list.size());
                eVar.f52033h.addAll(list);
                eVar.notifyDataSetChanged();
                RecyclerView.Adapter adapter = fVar.f52044v.getAdapter();
                C20569e eVar2 = fVar.f52037o;
                if (adapter != eVar2) {
                    fVar.f52044v.mo4627l0(eVar2);
                    return;
                }
                return;
            case 2:
                C20772a aVar2 = (C20772a) this.f17480b;
                Itinerary itinerary = (Itinerary) obj;
                if (itinerary != null) {
                    aVar2.f52414d.setValue(null);
                    Task call = Tasks.call(MoovitExecutors.f37327IO, new C17589h(aVar2, 1));
                    ExecutorService executorService = MoovitExecutors.COMPUTATION;
                    call.onSuccessTask(executorService, new C17327j1(itinerary, 14)).onSuccessTask(executorService, new C0114n(14)).addOnCompleteListener((Executor) executorService, new C20963s(aVar2.f52414d)).addOnFailureListener((Executor) executorService, (OnFailureListener) new C18115b(aVar2, 3));
                    return;
                }
                aVar2.getClass();
                return;
            case 3:
                C17108g gVar = (C17108g) this.f17480b;
                C20961r rVar = (C20961r) obj;
                int i3 = C17108g.f44278o;
                View view = gVar.getView();
                if (view != null && gVar.mo46775H1()) {
                    RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.recycler_view);
                    if (!rVar.f52711a || C13717b.m34258e((Collection) rVar.f52712b)) {
                        recyclerView2.setAdapter(C13751d.m34340a(rVar.f52713c, recyclerView2.getContext()));
                        return;
                    }
                    recyclerView2.setAdapter(new C17108g.C17109a((List) rVar.f52712b));
                    return;
                }
                return;
            case 4:
                TodBookingOrderViewModel todBookingOrderViewModel = (TodBookingOrderViewModel) this.f17480b;
                todBookingOrderViewModel.mo46215d((C20961r) obj, todBookingOrderViewModel.f40073e.getValue());
                return;
            case 5:
                ((TodRidesCenterActivity) this.f17480b).f40202U.setRefreshing(Boolean.TRUE.equals((Boolean) obj));
                return;
            case 6:
                C20283g gVar2 = (C20283g) this.f17480b;
                String str = (String) obj;
                C20703a value = gVar2.f51437k.getValue();
                if (value != null) {
                    obj2 = value.f52279c;
                }
                if (!C20975x0.m49118e(obj2, str)) {
                    gVar2.mo52457i(gVar2.f51438l.getValue(), gVar2.f51434h.getValue(), gVar2.f51436j.getValue(), str);
                    return;
                }
                return;
            default:
                PaymentGatewayFragment paymentGatewayFragment = (PaymentGatewayFragment) this.f17480b;
                PaymentGateway paymentGateway = (PaymentGateway) obj;
                PaymentGatewayInstructions c = paymentGatewayFragment.f42664p.mo52452c();
                if (c != null) {
                    obj2 = c.f42680e;
                }
                if (obj2 != null || paymentGateway == null) {
                    paymentGatewayFragment.mo48927o2();
                    paymentGatewayFragment.f42666r.setVisibility(8);
                    UiUtils.m40238F(8, paymentGatewayFragment.f42666r, paymentGatewayFragment.f42665q);
                    return;
                }
                paymentGateway.mo48904F1(paymentGatewayFragment, paymentGatewayFragment.f42666r);
                return;
        }
    }
}
