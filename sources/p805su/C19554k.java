package p805su;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c70.C13752e;
import ce0.C21100e;
import com.google.android.exoplayer2.p052ui.C4051q;
import com.google.android.exoplayer2.p052ui.C4052r;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.app.mot.model.MotActivationPrice;
import com.moovit.app.mot.purchase.model.MotQrCodeActivationFare;
import com.moovit.app.mot.purchase.model.MotQrCodeScanResult;
import com.moovit.app.mot.purchase.model.MotQrCodeStationFare;
import com.moovit.commons.view.FormatTextView;
import com.moovit.design.view.list.ListItemView;
import com.moovit.l10n.C16181a;
import com.moovit.l10n.LinePresentationType;
import com.moovit.transit.TransitLine;
import com.moovit.util.DistanceUtils;
import com.moovit.util.time.C7925b;
import com.moovit.view.PriceView;
import com.tranzmate.R;
import g20.C17161i;
import ja0.C12793c;
import ja0.C12797f;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import p041ca.C1829o;
import p112ha.C5182f0;
import p496fr.C17064a;
import p781ru.C19330c;
import p824tp.C19728f;
import p829tu.C19778i;
import q00.C19047a;

/* renamed from: su.k */
public class C19554k extends C19539a {

    /* renamed from: n */
    public static final /* synthetic */ int f49700n = 0;

    /* renamed from: su.k$a */
    public class C19555a extends RecyclerView.Adapter<C12797f> {

        /* renamed from: g */
        public final C17161i<C16181a.C16184c, TransitLine> f49701g;

        /* renamed from: h */
        public final List<C19330c> f49702h;

        public C19555a(C19728f fVar, List<C19330c> list) {
            this.f49701g = fVar.mo52082b(LinePresentationType.STOP_DETAIL);
            C21100e.m49373x(list, "suggestions");
            this.f49702h = list;
        }

        public final int getItemCount() {
            return this.f49702h.size() + 1;
        }

        public final int getItemViewType(int i) {
            return i == 0 ? R.layout.mot_qr_code_activation_suggestions_header_list_item : R.layout.mot_qr_code_activation_suggestions_list_item;
        }

        public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
            TransitLine transitLine;
            MotQrCodeActivationFare motQrCodeActivationFare;
            C12797f fVar = (C12797f) a0Var;
            if (fVar.getItemViewType() != R.layout.mot_qr_code_activation_suggestions_header_list_item) {
                Context e = fVar.mo39638e();
                C19330c cVar = this.f49702h.get(i - 1);
                ListItemView listItemView = (ListItemView) fVar.mo39639f(R.id.line);
                C17161i<C16181a.C16184c, TransitLine> iVar = this.f49701g;
                MotQrCodeStationFare motQrCodeStationFare = cVar.f49186b;
                if (motQrCodeStationFare != null) {
                    transitLine = motQrCodeStationFare.f39068b;
                } else {
                    transitLine = cVar.f49187c.f49183a;
                }
                C16181a.m41233b(iVar, listItemView, transitLine);
                View f = fVar.mo39639f(R.id.destination_group);
                MotQrCodeStationFare motQrCodeStationFare2 = cVar.f49186b;
                if (motQrCodeStationFare2 != null) {
                    ((TextView) fVar.mo39639f(R.id.destination)).setText(motQrCodeStationFare2.f39069c.f23731c);
                    f.setVisibility(0);
                } else {
                    f.setVisibility(8);
                }
                MotQrCodeStationFare motQrCodeStationFare3 = cVar.f49186b;
                if (motQrCodeStationFare3 != null) {
                    motQrCodeActivationFare = motQrCodeStationFare3.f39071e;
                } else {
                    motQrCodeActivationFare = cVar.f49187c.f49184b;
                }
                String a = DistanceUtils.m17934a((int) DistanceUtils.m17936c(e, (float) motQrCodeActivationFare.f39055b.f39017c), e);
                ((TextView) fVar.mo39639f(R.id.distance)).setText(C19554k.this.getString(R.string.payment_mot_cost_distance, a));
                MotActivationPrice motActivationPrice = motQrCodeActivationFare.f39056c.f39014c;
                ((PriceView) fVar.mo39639f(R.id.price_view)).mo24682a(motActivationPrice.f39005b, motActivationPrice.f39006c, (String) null);
                ((FormatTextView) fVar.mo39639f(R.id.time)).setArguments(C7925b.m18016d(e, cVar.f49185a.f47010c));
                fVar.itemView.setOnClickListener(new C17064a(5, this, cVar));
            }
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            View e = C13715c.m34239e(viewGroup, i, viewGroup, false);
            C12797f fVar = new C12797f(e);
            e.setTag(fVar);
            return fVar;
        }
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return C16530d.m42016i(2, "METRO_CONTEXT", "CONFIGURATION");
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        recyclerView.setAdapter(new C12793c());
        MotQrCodeScanResult n2 = mo51896n2();
        C13752e R1 = mo46783R1();
        C19728f fVar = (C19728f) mo46776J1("METRO_CONTEXT");
        C19047a aVar = (C19047a) mo46776J1("CONFIGURATION");
        Task call = Tasks.call(MoovitExecutors.f37327IO, new C19778i(R1, aVar, n2.f39065e));
        ExecutorService executorService = MoovitExecutors.COMPUTATION;
        call.onSuccessTask(executorService, new C1829o(2, R1, fVar, n2)).onSuccessTask(executorService, new C5182f0(1, this, n2)).onSuccessTask(executorService, new C19553j(R1, fVar, aVar, n2)).addOnSuccessListener((Activity) requireActivity(), new C19552i(0, this, (C19728f) mo46776J1("METRO_CONTEXT"), recyclerView)).addOnFailureListener((Activity) requireActivity(), (OnFailureListener) new C19543e(this, 1));
    }

    /* renamed from: m2 */
    public final int mo51895m2() {
        return R.string.payment_mot_activation_suggestion_title;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.mot_qr_code_activation_suggestions_selection_fragment, viewGroup, false);
        ((Button) inflate.findViewById(R.id.action_select_route)).setOnClickListener(new C4051q(this, 21));
        ((Button) inflate.findViewById(R.id.action_select_fare)).setOnClickListener(new C4052r(this, 14));
        return inflate;
    }
}
