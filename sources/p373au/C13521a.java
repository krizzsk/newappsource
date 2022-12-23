package p373au;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.design.view.list.ListItemView;
import com.moovit.itinerary.model.leg.MultiTransitLinesLeg;
import com.moovit.itinerary.model.leg.TransitLineLeg;
import com.moovit.l10n.C16181a;
import com.moovit.l10n.LinePresentationType;
import com.moovit.transit.TransitLine;
import com.tranzmate.R;
import g20.C17161i;
import h60.C17327j1;
import ja0.C12797f;
import java.util.HashSet;
import java.util.List;
import p756qt.C19172a;
import p824tp.C19728f;

/* renamed from: au.a */
public class C13521a extends C15676b<MoovitActivity> {

    /* renamed from: j */
    public static final /* synthetic */ int f33438j = 0;

    /* renamed from: h */
    public MultiTransitLinesLeg f33439h;

    /* renamed from: i */
    public final C17327j1 f33440i = new C17327j1(this, 11);

    /* renamed from: au.a$a */
    public static class C13522a extends RecyclerView.Adapter<C12797f> {

        /* renamed from: g */
        public final List<TransitLineLeg> f33441g;

        /* renamed from: h */
        public final C17161i<C16181a.C16184c, TransitLine> f33442h;

        /* renamed from: i */
        public final C13524b f33443i;

        /* renamed from: j */
        public final C13523a f33444j = new C13523a();

        /* renamed from: au.a$a$a */
        public class C13523a implements View.OnClickListener {
            public C13523a() {
            }

            public final void onClick(View view) {
                int adapterPosition;
                if (C13522a.this.f33443i != null && (adapterPosition = ((C12797f) view.getTag()).getAdapterPosition()) != -1) {
                    TransitLineLeg transitLineLeg = C13522a.this.f33441g.get(adapterPosition);
                    C13521a aVar = (C13521a) ((C17327j1) C13522a.this.f33443i).f44716c;
                    int i = C13521a.f33438j;
                    aVar.getClass();
                    aVar.mo46753L1(C13525b.class, new C19172a(aVar, adapterPosition));
                    aVar.dismiss();
                }
            }
        }

        /* renamed from: au.a$a$b */
        public interface C13524b {
        }

        public C13522a(Context context, List list, C17327j1 j1Var) {
            C21100e.m49373x(list, "transitLegs");
            this.f33441g = list;
            HashSet hashSet = C19728f.f50164e;
            this.f33442h = ((C19728f) context.getSystemService("metro_context")).mo52082b(LinePresentationType.NEAR_ME);
            this.f33443i = j1Var;
        }

        public final int getItemCount() {
            return this.f33441g.size();
        }

        public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
            ListItemView listItemView = (ListItemView) ((C12797f) a0Var).itemView;
            listItemView.setOnClickListener(this.f33444j);
            C16181a.m41233b(this.f33442h, listItemView, this.f33441g.get(i).f42110d.get());
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            C12797f fVar = new C12797f(C13715c.m34239e(viewGroup, R.layout.choose_primary_transit_leg_item_layout, viewGroup, false));
            fVar.itemView.setTag(fVar);
            return fVar;
        }
    }

    /* renamed from: au.a$b */
    public interface C13525b {
        /* renamed from: m */
        void mo40416m(MultiTransitLinesLeg multiTransitLinesLeg, int i);
    }

    public C13521a() {
        super(MoovitActivity.class);
    }

    /* renamed from: Q1 */
    public final void mo40414Q1(Bundle bundle) {
        MultiTransitLinesLeg multiTransitLinesLeg = (MultiTransitLinesLeg) getArguments().getParcelable("multiTransitLinesLeg");
        if (multiTransitLinesLeg != null) {
            this.f33439h = multiTransitLinesLeg;
            return;
        }
        throw new IllegalStateException("Did you use newInstance(...)?");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.choose_primary_transit_leg_dialog_fragment, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(new C13522a(view.getContext(), this.f33439h.f42086b, this.f33440i));
    }
}
