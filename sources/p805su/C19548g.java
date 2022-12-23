package p805su;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.mot.model.MotActivationPrice;
import com.moovit.app.mot.model.MotActivationRegion;
import com.moovit.app.mot.model.MotActivationRegionFare;
import com.moovit.app.mot.model.MotActivationRegionalFare;
import com.moovit.app.mot.purchase.model.MotQrCodeActivationFare;
import com.moovit.app.mot.purchase.model.MotQrCodeScanResult;
import com.moovit.location.C16202a;
import com.moovit.marketing.MarketingEventImpressionBinder;
import com.moovit.util.DistanceUtils;
import com.moovit.view.PriceView;
import com.tranzmate.R;
import com.usebutton.sdk.internal.api.AppActionRequest;
import ja0.C12793c;
import ja0.C12797f;
import java.util.List;
import k00.C17988b;
import k00.C17992e;
import o00.C18669f;
import p259t5.C6593c;
import p543hq.C17474b;
import p613kq.C18114a;
import p613kq.C18115b;
import p829tu.C19770a;
import p858uz.C20061g;
import p977zz.C20964s0;
import z00.C20795a;
import z20.C20806a;

/* renamed from: su.g */
public class C19548g extends C19539a {

    /* renamed from: o */
    public static final /* synthetic */ int f49674o = 0;

    /* renamed from: n */
    public RecyclerView f49675n;

    /* renamed from: su.g$a */
    public class C19549a extends RecyclerView.Adapter<C12797f> {

        /* renamed from: g */
        public final C6593c f49676g = new C6593c(this, 19);

        /* renamed from: h */
        public final List<MotQrCodeActivationFare> f49677h;

        public C19549a(List<MotQrCodeActivationFare> list) {
            C21100e.m49373x(list, "activationFares");
            this.f49677h = list;
        }

        public final int getItemCount() {
            return this.f49677h.size();
        }

        public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
            C12797f fVar = (C12797f) a0Var;
            MotQrCodeActivationFare motQrCodeActivationFare = this.f49677h.get(i);
            MotActivationRegionalFare motActivationRegionalFare = motQrCodeActivationFare.f39055b;
            MotActivationRegionFare motActivationRegionFare = motQrCodeActivationFare.f39056c;
            MotActivationRegion motActivationRegion = motActivationRegionFare.f39013b;
            MotActivationPrice motActivationPrice = motActivationRegionFare.f39014c;
            fVar.itemView.setTag(motQrCodeActivationFare);
            fVar.mo39639f(R.id.color_tag).setBackgroundColor(motActivationRegionalFare.f39018d.f41007b);
            String a = DistanceUtils.m17934a((int) DistanceUtils.m17936c(C19548g.this.getContext(), (float) motActivationRegionalFare.f39017c), C19548g.this.getContext());
            String str = motActivationRegion.f39011d;
            TextView textView = (TextView) fVar.mo39639f(R.id.ticket_fare_view);
            if (C20964s0.m49090h(str)) {
                textView.setText(C19548g.this.getString(R.string.payment_mot_cost_distance, a));
            } else {
                textView.setText(C19548g.this.getString(R.string.payment_mot_cost_distance_to_region, a, str));
            }
            ((PriceView) fVar.mo39639f(R.id.price_view)).mo24682a(motActivationPrice.f39005b, motActivationPrice.f39006c, (String) null);
            fVar.itemView.setOnClickListener(this.f49676g);
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C12797f(C13715c.m34239e(viewGroup, R.layout.mot_qr_code_activation_fare_selection_list_item, viewGroup, false));
        }
    }

    /* renamed from: I1 */
    public final C20061g mo21526I1() {
        return C16202a.get(this.f40822c).getPermissionAwareHighAccuracyFrequentUpdates();
    }

    /* renamed from: m2 */
    public final int mo51895m2() {
        return R.string.payment_mot_cost_title;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        MarketingEventImpressionBinder.m41586a(this, new C20806a("fare_radius_view"));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.mot_qr_code_activation_fare_selection_fragment, viewGroup, false);
    }

    public final void onStart() {
        super.onStart();
        mo51897o2();
        MotQrCodeScanResult n2 = mo51896n2();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "fare_selection");
        aVar.mo49935c(AnalyticsAttributeKey.COUNT, n2.f39066f.size());
        mo46797j2(aVar.mo49933a());
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.f49675n = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        this.f49675n.mo4593g(new C18669f(new C17992e(view.getContext(), R.dimen.half_screen_edge, R.dimen.half_screen_edge)), -1);
        this.f49675n.setAdapter(new C12793c());
        Tasks.call(MoovitExecutors.COMPUTATION, new C19770a(mo51896n2())).addOnSuccessListener((Activity) requireActivity(), new C18114a(this, 5)).addOnFailureListener((Activity) requireActivity(), (OnFailureListener) new C18115b(this, 2));
    }

    /* renamed from: p2 */
    public final void mo51905p2() {
        RecyclerView recyclerView = this.f49675n;
        Context requireContext = requireContext();
        C21100e.m49373x(requireContext, AppActionRequest.KEY_CONTEXT);
        recyclerView.setAdapter(new C20795a(C17988b.m44611b(R.drawable.img_empty_error_sign, requireContext), (CharSequence) null, requireContext.getText(R.string.response_read_error_message)));
    }
}
