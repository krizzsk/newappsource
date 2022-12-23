package p688nu;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.moovit.C15682c;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.ads.C14737e;
import com.moovit.app.mot.center.MotActivationCenterActivity;
import com.moovit.app.mot.model.MotActivation;
import com.moovit.app.mot.protocol.GetMotUserActivationsRequest;
import com.moovit.design.view.AlertMessageView;
import com.tranzmate.R;
import ja0.C12793c;
import o00.C18665b;
import o00.C18671h;
import p073e7.C4583a;
import p073e7.C4584b;
import p130j2.C5367a;
import p250s9.C6489b;
import p543hq.C17474b;
import p664mu.C18443f;
import p688nu.C18627a;

/* renamed from: nu.f */
public class C18636f extends C15682c<MotActivationCenterActivity> implements C18627a.C18629b {

    /* renamed from: s */
    public static final /* synthetic */ int f47492s = 0;

    /* renamed from: n */
    public final C18671h f47493n = new C18671h(R.layout.mot_historical_activations_empty_state);

    /* renamed from: o */
    public final C18637a f47494o = new C18637a(R.layout.general_error_view);

    /* renamed from: p */
    public final C18638b f47495p = new C18638b();

    /* renamed from: q */
    public RecyclerView f47496q;

    /* renamed from: r */
    public Button f47497r;

    /* renamed from: nu.f$a */
    public class C18637a extends C18671h {
        public C18637a(int... iArr) {
            super(iArr);
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            RecyclerView.C1119a0 onCreateViewHolder = super.onCreateViewHolder(viewGroup, i);
            ((AlertMessageView) onCreateViewHolder.itemView).setNegativeButtonClickListener(new C4584b(this, 20));
            return onCreateViewHolder;
        }
    }

    /* renamed from: nu.f$b */
    public class C18638b extends BroadcastReceiver {
        public C18638b() {
        }

        public final void onReceive(Context context, Intent intent) {
            C18636f fVar = C18636f.this;
            int i = C18636f.f47492s;
            fVar.mo51018m2();
        }
    }

    public C18636f() {
        super(MotActivationCenterActivity.class);
    }

    /* renamed from: Q0 */
    public final void mo51015Q0(MotActivation motActivation) {
        ((MotActivationCenterActivity) this.f40822c).mo45523y2(motActivation);
    }

    /* renamed from: m2 */
    public final void mo51018m2() {
        this.f47496q.mo4627l0(new C12793c());
        C18443f.m45299e(GetMotUserActivationsRequest.Source.HISTORICAL, C18443f.m45298d().f47017c).onSuccessTask(MoovitExecutors.COMPUTATION, new C6489b(11)).addOnCompleteListener(new C14737e(this, 1));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.mot_historical_activations_fragment, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recycler_view);
        this.f47496q = recyclerView;
        Context context = recyclerView.getContext();
        this.f47496q.setLayoutManager(new LinearLayoutManager(context));
        this.f47496q.mo4593g(new C18665b(context, R.drawable.divider_horizontal), -1);
        Button button = (Button) inflate.findViewById(R.id.show_bills_view);
        this.f47497r = button;
        button.setOnClickListener(new C4583a(this, 16));
        return inflate;
    }

    public final void onResume() {
        super.onResume();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "history");
        mo46797j2(aVar.mo49933a());
    }

    public final void onStart() {
        super.onStart();
        Context requireContext = requireContext();
        C18638b bVar = this.f47495p;
        C18443f fVar = C18443f.f47013e;
        C5367a.m13473a(requireContext).mo21146b(bVar, new IntentFilter("com.moovit.app.mot.action.updated"));
        mo51018m2();
    }

    public final void onStop() {
        super.onStop();
        Context requireContext = requireContext();
        C18638b bVar = this.f47495p;
        C18443f fVar = C18443f.f47013e;
        C5367a.m13473a(requireContext).mo21148d(bVar);
    }
}
