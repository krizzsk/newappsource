package p757qu;

import aa0.C7527d;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.moovit.C15682c;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.mot.purchase.MotStationExitActivationActivity;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.moovit.transit.TransitStop;
import com.tranzmate.R;
import ja0.C12790a;
import ja0.C12797f;
import java.util.ArrayList;
import o00.C18665b;
import o00.C18668e;
import p297w5.C6994a;
import p394br.C13660f;
import p543hq.C17474b;
import p977zz.C20964s0;
import z70.C13337m;

/* renamed from: qu.i */
public class C19188i extends C15682c<MotStationExitActivationActivity> {

    /* renamed from: n */
    public final C19189a f48789n = new C19189a();

    /* renamed from: o */
    public final C13337m f48790o = new C13337m();

    /* renamed from: p */
    public C19192c f48791p;

    /* renamed from: q */
    public RecyclerView f48792q;

    /* renamed from: r */
    public Button f48793r;

    /* renamed from: qu.i$a */
    public class C19189a extends RecyclerView.C1142q {
        /* renamed from: a */
        public final void mo4913a(int i, RecyclerView recyclerView) {
            if (i == 1) {
                UiUtils.m40252k(recyclerView);
            }
        }
    }

    /* renamed from: qu.i$b */
    public class C19190b extends C12790a<TransitStop> {

        /* renamed from: h */
        public final C19191a f48794h = new C19191a();

        /* renamed from: i */
        public int f48795i;

        /* renamed from: qu.i$b$a */
        public class C19191a implements View.OnClickListener {
            public C19191a() {
            }

            public final void onClick(View view) {
                Integer num = (Integer) view.getTag(R.id.view_tag_param1);
                if (num != null) {
                    C19190b bVar = C19190b.this;
                    int i = bVar.f48795i;
                    bVar.f48795i = num.intValue();
                    if (i != -1) {
                        C19190b.this.notifyItemChanged(i);
                    }
                    C19190b bVar2 = C19190b.this;
                    bVar2.notifyItemChanged(bVar2.f48795i);
                    C19188i.this.f48793r.setEnabled(true);
                }
            }
        }

        public C19190b(ArrayList arrayList, int i) {
            super(arrayList);
            this.f48795i = i;
        }

        public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
            boolean z;
            TransitStop transitStop = (TransitStop) mo39636j(i);
            ListItemView listItemView = (ListItemView) ((C12797f) a0Var).itemView;
            listItemView.setTag(R.id.view_tag_param1, Integer.valueOf(i));
            if (this.f48795i == i) {
                z = true;
            } else {
                z = false;
            }
            listItemView.setChecked(z);
            listItemView.setTitle((CharSequence) transitStop.f23731c);
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            View e = C13715c.m34239e(viewGroup, R.layout.mot_station_exit_chooser_item, viewGroup, false);
            e.setOnClickListener(this.f48794h);
            return new C12797f(e);
        }
    }

    /* renamed from: qu.i$c */
    public class C19192c extends C18668e<C12797f, C19190b, C7527d<TransitStop>> {
        public C19192c(C19190b bVar) {
            super(bVar, new C7527d(new C13660f(1)));
        }

        /* renamed from: k */
        public final boolean mo45935k(RecyclerView.Adapter adapter, int i, Object obj) {
            C19190b bVar = (C19190b) adapter;
            C7527d dVar = (C7527d) obj;
            if (C20964s0.m49090h(dVar.f23007d)) {
                return true;
            }
            return dVar.mo19661o((TransitStop) bVar.mo39636j(i));
        }
    }

    public C19188i() {
        super(MotStationExitActivationActivity.class);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ArrayList parcelableArrayList = mo46782Q1().getParcelableArrayList("exitStations");
        if (parcelableArrayList != null) {
            String str = "";
            if (bundle != null) {
                str = bundle.getString("searchQuery", str);
            }
            int i = -1;
            if (bundle != null) {
                i = bundle.getInt("selectedPosition", -1);
            }
            C19192c cVar = new C19192c(new C19190b(parcelableArrayList, i));
            this.f48791p = cVar;
            ((C7527d) cVar.f47544h).mo23793a(str);
            this.f48790o.mo40231f(((C7527d) this.f48791p.f47544h).f23007d);
            return;
        }
        throw new ApplicationBugException("Did you use MotStationExitChooserFragment.newInstance(...)?");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.mot_station_exit_chooser_fragment, viewGroup, false);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("searchQuery", ((C7527d) this.f48791p.f47544h).f23007d);
        bundle.putInt("selectedPosition", ((C19190b) this.f48791p.f47543g).f48795i);
    }

    public final void onStart() {
        super.onStart();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "mot_out_of_radius_stations_impression");
        mo46797j2(aVar.mo49933a());
        this.f48790o.f33115i = true;
    }

    public final void onStop() {
        super.onStop();
        mo46797j2(this.f48790o.mo40228c());
    }

    public final void onViewCreated(View view, Bundle bundle) {
        TransitStop transitStop;
        boolean z;
        super.onViewCreated(view, bundle);
        ((SearchView) view.findViewById(R.id.search_view)).setOnQueryTextListener(new C19193j(this));
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.f48792q = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        RecyclerView recyclerView2 = this.f48792q;
        recyclerView2.mo4593g(new C18665b(recyclerView2.getContext(), R.drawable.divider_horizontal), -1);
        this.f48792q.setAdapter(this.f48791p);
        this.f48792q.mo4615h(this.f48790o);
        this.f48792q.mo4615h(this.f48789n);
        Button button = (Button) view.findViewById(R.id.continue_button);
        this.f48793r = button;
        C19190b bVar = (C19190b) this.f48791p.f47543g;
        int i = bVar.f48795i;
        if (i == -1) {
            transitStop = null;
        } else {
            transitStop = (TransitStop) bVar.mo39636j(i);
        }
        if (transitStop != null) {
            z = true;
        } else {
            z = false;
        }
        button.setEnabled(z);
        this.f48793r.setOnClickListener(new C6994a(this, 19));
    }
}
