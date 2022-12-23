package p664mu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c00.C13723g;
import ce0.C21100e;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.utils.UiUtils;
import com.moovit.transit.TransitType;
import com.tranzmate.R;
import ja0.C12797f;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import k00.C17992e;
import o00.C18665b;
import o00.C18669f;
import o00.C18670g;
import p039c7.C1800c;
import p297w5.C6994a;
import p451du.C16721r;
import p543hq.C17474b;
import p583jk.C17884p;
import p824tp.C19728f;
import p874vr.C20199a;
import q00.C19047a;
import y10.C20690e;

/* renamed from: mu.m */
public class C18457m extends C15676b<MoovitActivity> {

    /* renamed from: i */
    public static final /* synthetic */ int f47044i = 0;

    /* renamed from: h */
    public RecyclerView f47045h;

    /* renamed from: mu.m$a */
    public class C18458a extends RecyclerView.Adapter<C12797f> {

        /* renamed from: g */
        public final List<TransitType> f47046g;

        /* renamed from: h */
        public final C6994a f47047h = new C6994a(this, 17);

        public C18458a(ArrayList arrayList) {
            C21100e.m49373x(arrayList, "transitTypes");
            this.f47046g = arrayList;
        }

        public final int getItemCount() {
            return this.f47046g.size();
        }

        public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
            C12797f fVar = (C12797f) a0Var;
            fVar.itemView.setOnClickListener(this.f47047h);
            TransitType transitType = this.f47046g.get(i);
            TextView textView = (TextView) fVar.mo39639f(R.id.item_title);
            C17884p.m44354Y(textView).mo51642v(transitType.f23759d).mo51628o0(transitType.f23759d).mo10848R(new C20690e(textView, UiUtils.Edge.TOP));
            textView.setText(transitType.mo24433b(fVar.mo39638e()));
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            C12797f fVar = new C12797f(C13715c.m34239e(viewGroup, R.layout.transit_type_bottom_dialog_item, viewGroup, false));
            fVar.itemView.setTag(fVar);
            return fVar;
        }
    }

    public C18457m() {
        super(MoovitActivity.class);
        setStyle(0, 2131952793);
    }

    /* renamed from: I1 */
    public final Set<String> mo22562I1() {
        return C16530d.m42016i(2, "CONFIGURATION", "METRO_CONTEXT");
    }

    /* renamed from: O1 */
    public final void mo22563O1(View view) {
        this.f47045h.setAdapter(new C18458a(C13723g.m34282c(((C19728f) mo46750H1("METRO_CONTEXT")).f50165a.mo20299a(), new C16721r((List) ((C19047a) mo46750H1("CONFIGURATION")).mo51505b(C20199a.f51244F0), 3))));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.transit_type_bottom_dialog, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recycler_view);
        this.f47045h = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f40792c, 0, false));
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.screen_edge);
        this.f47045h.mo4593g(C18669f.m45651e(dimensionPixelSize), -1);
        this.f47045h.mo4593g(C18670g.m45652e(dimensionPixelSize), -1);
        this.f47045h.mo4593g(new C18665b(new C17992e(this.f40792c, R.dimen.half_screen_edge, R.dimen.half_screen_edge)), -1);
        inflate.findViewById(R.id.cancel_action).setOnClickListener(new C1800c(this, 16));
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "mot_transit_type_dialog_impression");
        mo22564R1(aVar.mo49933a());
    }
}
