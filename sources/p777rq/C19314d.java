package p777rq;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import androidx.lifecycle.C1040t;
import androidx.lifecycle.C1044w;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.share.ShareEntityLink;
import com.moovit.app.stoparrivals.StopArrivalsActivity;
import com.moovit.design.dialog.AlertDialogFragment;
import com.moovit.payment.gateway.PaymentGateway;
import com.moovit.payment.gateway.PaymentGatewayInstructions;
import com.moovit.request.UserRequestError;
import com.tranzmate.R;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import lf0.C24236l;
import mf0.C24362h;
import p304x.C7029b1;
import p376ax.C13546h;
import p543hq.C17474b;
import p946ys.C20763d;
import p977zz.C20927a0;
import p977zz.C20961r;
import w50.C20283g;
import y50.C20703a;

/* renamed from: rq.d */
public final /* synthetic */ class C19314d implements C1044w {

    /* renamed from: a */
    public final /* synthetic */ int f49155a;

    /* renamed from: b */
    public final /* synthetic */ Object f49156b;

    public /* synthetic */ C19314d(Object obj, int i) {
        this.f49155a = i;
        this.f49156b = obj;
    }

    public final void onChanged(Object obj) {
        String str;
        String str2;
        switch (this.f49155a) {
            case 0:
                C19315e eVar = (C19315e) this.f49156b;
                C20961r rVar = (C20961r) obj;
                if (rVar == null) {
                    eVar.mo50561w2(true);
                    return;
                }
                eVar.getClass();
                if (!rVar.f52711a || rVar.f52712b == null) {
                    eVar.mo50553o2();
                    Exception exc = rVar.f52713c;
                    Context context = eVar.getContext();
                    if (context != null) {
                        boolean z = exc instanceof UserRequestError;
                        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.SHARED_ENTITY_ERROR_SHOWN);
                        AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.TYPE;
                        if (z) {
                            str = "shared_entity_unavailable";
                        } else {
                            str = "network_error";
                        }
                        aVar.mo49939g(analyticsAttributeKey, str);
                        eVar.mo46797j2(aVar.mo49933a());
                        if (z) {
                            str2 = ((UserRequestError) exc).mo49161c();
                        } else {
                            str2 = eVar.getString(R.string.network_unavailable_error);
                        }
                        Toast.makeText(context, str2, 0).show();
                        return;
                    }
                    return;
                }
                eVar.f49158s.postDelayed(new C7029b1(eVar, 6), 1000);
                ShareEntityLink shareEntityLink = (ShareEntityLink) rVar.f52712b;
                C20927a0.m49017l(eVar.requireContext(), Intent.createChooser(C20927a0.m49012g(shareEntityLink.f39585c, shareEntityLink.f39584b), eVar.getString(R.string.tripplan_itinerary_share_directions_title)));
                return;
            case 1:
                C24236l lVar = (C24236l) this.f49156b;
                int i = StopArrivalsActivity.f39603q0;
                C24362h.m61211f(lVar, "$tmp0");
                lVar.invoke(obj);
                return;
            case 2:
                C13546h hVar = (C13546h) this.f49156b;
                int i2 = C13546h.f33483w;
                hVar.getClass();
                if (((Boolean) obj).booleanValue() && !hVar.f33488v) {
                    hVar.f33488v = true;
                    C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
                    aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "tod_service_area_popup_alert_impression");
                    hVar.mo46797j2(aVar2.mo49933a());
                    AlertDialogFragment.C15856a aVar3 = new AlertDialogFragment.C15856a(hVar.requireContext());
                    aVar3.mo47676e(R.drawable.img_tod_multiple_service_areas, true);
                    aVar3.mo47683l(R.string.tod_order_map_selection_multi_areas_popup_title).mo47678g(R.string.tod_order_map_selection_multi_areas_popup_message).mo47681j(R.string.tod_order_map_selection_multi_areas_popup_action).mo47673b().show(hVar.getChildFragmentManager(), (String) null);
                    return;
                }
                return;
            default:
                C20283g gVar = (C20283g) this.f49156b;
                C20703a aVar4 = (C20703a) obj;
                if (aVar4 == null) {
                    gVar.f51439m.setValue(null);
                    return;
                }
                BigDecimal bigDecimal = C20283g.f51427r;
                PaymentGatewayInstructions paymentGatewayInstructions = aVar4.f52278b;
                Task call = Tasks.call(MoovitExecutors.COMPUTATION, new C20283g.C20285b(gVar.f3907b, paymentGatewayInstructions.f42678c, gVar.f51438l.getValue()));
                Executor executor = MoovitExecutors.MAIN_THREAD;
                C1040t<List<PaymentGateway>> tVar = gVar.f51439m;
                Objects.requireNonNull(tVar);
                call.addOnSuccessListener(executor, new C20763d(tVar, 5));
                return;
        }
    }
}
