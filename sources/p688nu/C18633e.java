package p688nu;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.moovit.C15682c;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.mot.center.MotActivationCenterActivity;
import com.moovit.app.mot.model.MotActivation;
import com.moovit.design.view.AlertMessageView;
import com.tranzmate.R;
import ja0.C12793c;
import java.util.Collections;
import java.util.Set;
import o00.C18665b;
import o00.C18671h;
import p130j2.C5367a;
import p259t5.C6593c;
import p543hq.C17474b;
import p664mu.C18443f;
import p688nu.C18627a;
import w40.C25761d;

/* renamed from: nu.e */
public class C18633e extends C15682c<MotActivationCenterActivity> implements C18627a.C18629b {

    /* renamed from: r */
    public static final /* synthetic */ int f47485r = 0;

    /* renamed from: n */
    public final C18671h f47486n = new C18671h(R.layout.mot_current_activations_empty_state);

    /* renamed from: o */
    public final C18634a f47487o = new C18634a(R.layout.general_error_view);

    /* renamed from: p */
    public final C18635b f47488p = new C18635b();

    /* renamed from: q */
    public RecyclerView f47489q;

    /* renamed from: nu.e$a */
    public class C18634a extends C18671h {
        public C18634a(int... iArr) {
            super(iArr);
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            RecyclerView.C1119a0 onCreateViewHolder = super.onCreateViewHolder(viewGroup, i);
            ((AlertMessageView) onCreateViewHolder.itemView).setNegativeButtonClickListener(new C6593c(this, 18));
            return onCreateViewHolder;
        }
    }

    /* renamed from: nu.e$b */
    public class C18635b extends BroadcastReceiver {
        public C18635b() {
        }

        public final void onReceive(Context context, Intent intent) {
            C18633e eVar = C18633e.this;
            int i = C18633e.f47485r;
            eVar.mo51016m2();
        }
    }

    public C18633e() {
        super(MotActivationCenterActivity.class);
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return Collections.singleton("METRO_CONTEXT");
    }

    /* renamed from: Q0 */
    public final void mo51015Q0(MotActivation motActivation) {
        ((MotActivationCenterActivity) this.f40822c).mo45523y2(motActivation);
    }

    /* renamed from: m2 */
    public final void mo51016m2() {
        this.f47489q.mo4627l0(new C12793c());
        C18443f.m45298d().mo50889c().addOnCompleteListener(new C18632d(this, 0));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.mot_current_activations_fragment, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recycler_view);
        this.f47489q = recyclerView;
        Context context = recyclerView.getContext();
        this.f47489q.setLayoutManager(new LinearLayoutManager(context));
        this.f47489q.mo4593g(new C18665b(context, R.drawable.divider_horizontal), -1);
        View findViewById = inflate.findViewById(R.id.new_ride_view);
        C25761d.m64299a().mo83587b(false).addOnSuccessListener(new C18630b(0, this, findViewById)).addOnFailureListener(new C18631c(findViewById, 0));
        return inflate;
    }

    public final void onResume() {
        super.onResume();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, AppMeasurementSdk.ConditionalUserProperty.ACTIVE);
        mo46797j2(aVar.mo49933a());
    }

    public final void onStart() {
        super.onStart();
        Context requireContext = requireContext();
        C18635b bVar = this.f47488p;
        C18443f fVar = C18443f.f47013e;
        C5367a.m13473a(requireContext).mo21146b(bVar, new IntentFilter("com.moovit.app.mot.action.updated"));
        mo51016m2();
    }

    public final void onStop() {
        super.onStop();
        Context requireContext = requireContext();
        C18635b bVar = this.f47488p;
        C18443f fVar = C18443f.f47013e;
        C5367a.m13473a(requireContext).mo21148d(bVar);
    }
}
