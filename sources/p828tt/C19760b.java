package p828tt;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c00.C13720d;
import c00.C13722f;
import c20.C13744a;
import ce0.C21100e;
import com.google.android.material.card.MaterialCardView;
import com.moovit.C15682c;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.intro.onboarding.OnboardingType;
import com.moovit.app.intro.onboarding.UserOnboardingActivity;
import com.moovit.tripplanner.TripPlannerTransportTypeInfo;
import com.tranzmate.R;
import ja0.C12797f;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p073e7.C4583a;
import p259t5.C6593c;
import p543hq.C17474b;
import p716oy.C18860a;

/* renamed from: tt.b */
public abstract class C19760b extends C15682c<UserOnboardingActivity> {

    /* renamed from: n */
    public boolean f50239n;

    /* renamed from: o */
    public HashSet f50240o;

    /* renamed from: p */
    public final HashSet f50241p = new HashSet();

    /* renamed from: q */
    public View f50242q;

    /* renamed from: tt.b$a */
    public class C19761a extends RecyclerView.Adapter<C12797f> {

        /* renamed from: g */
        public final List<TripPlannerTransportTypeInfo> f50243g;

        /* renamed from: h */
        public final int f50244h;

        public C19761a(List<TripPlannerTransportTypeInfo> list, int i) {
            C21100e.m49373x(list, "transportTypes");
            this.f50243g = list;
            C21100e.m49375y(1, Integer.MAX_VALUE, "cols", i);
            this.f50244h = i;
        }

        public final int getItemCount() {
            return this.f50243g.size();
        }

        public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
            C12797f fVar = (C12797f) a0Var;
            TripPlannerTransportTypeInfo tripPlannerTransportTypeInfo = this.f50243g.get(i);
            MaterialCardView materialCardView = (MaterialCardView) fVar.mo39639f(R.id.card_view);
            materialCardView.setTag(tripPlannerTransportTypeInfo.f23802b);
            C13744a.m34300b((ImageView) fVar.mo39639f(R.id.image), tripPlannerTransportTypeInfo.f23804d);
            ((TextView) fVar.mo39639f(R.id.text)).setText(tripPlannerTransportTypeInfo.f23803c);
            materialCardView.setChecked(C19760b.this.f50241p.contains(tripPlannerTransportTypeInfo.f23802b));
            if (this.f50244h > 1) {
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) materialCardView.getLayoutParams();
                layoutParams.f3011G = "H,1:1";
                materialCardView.setLayoutParams(layoutParams);
            }
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            View e = C13715c.m34239e(viewGroup, R.layout.transport_type_card_view, viewGroup, false);
            ((MaterialCardView) e.findViewById(R.id.card_view)).setOnClickListener(new C4583a(this, 13));
            return new C12797f(e);
        }
    }

    public C19760b() {
        super(UserOnboardingActivity.class);
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return C16530d.m42016i(2, "TRIP_PLANNER_CONFIGURATION", "ONBOARDING_CONFIGURATION");
    }

    /* renamed from: m2 */
    public abstract List<TripPlannerTransportTypeInfo> mo52088m2();

    /* renamed from: n2 */
    public abstract String mo52089n2();

    /* renamed from: o2 */
    public abstract int mo52090o2();

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.onboarding_transport_types_fragment, viewGroup, false);
    }

    public final void onStart() {
        super.onStart();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, mo52089n2());
        aVar.mo49935c(AnalyticsAttributeKey.NUMBER_OF_OPTIONS, this.f50240o.size());
        mo46797j2(aVar.mo49933a());
    }

    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        super.onViewCreated(view, bundle);
        int i = 1;
        if (C18860a.m45884a().f48026n == OnboardingType.OPT_OUT) {
            z = true;
        } else {
            z = false;
        }
        this.f50239n = z;
        ((TextView) mo46799l2(R.id.title)).setText(mo52092q2());
        ((TextView) mo46799l2(R.id.subtitle)).setText(mo52091p2());
        this.f50240o = C13720d.m34277g(mo52088m2(), (C13722f) null, new C19759a(0));
        if (this.f50241p.isEmpty() && this.f50239n) {
            this.f50241p.addAll(this.f50240o);
        }
        if (this.f50240o.size() > 3) {
            i = 2;
        }
        RecyclerView recyclerView = (RecyclerView) mo46799l2(R.id.recycler_view);
        recyclerView.setLayoutManager(new GridLayoutManager(requireContext(), i));
        recyclerView.setAdapter(new C19761a(mo52088m2(), i));
        mo52093r2();
    }

    /* renamed from: p2 */
    public abstract int mo52091p2();

    /* renamed from: q2 */
    public abstract int mo52092q2();

    /* renamed from: r2 */
    public void mo52093r2() {
        View l2 = mo46799l2(R.id.next_button);
        this.f50242q = l2;
        l2.setOnClickListener(new C6593c(this, 14));
        if (this.f50241p.size() < mo52090o2()) {
            this.f50242q.setEnabled(false);
        }
    }
}
