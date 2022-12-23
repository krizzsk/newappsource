package p398bv;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.moovit.app.offline.tripplanner.OfflineTripPlannerOptions;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.offline.GtfsConfiguration;
import com.moovit.tripplanner.TripPlannerLocations;
import com.moovit.tripplanner.TripPlannerOptions;
import com.tranzmate.R;
import ja0.C12793c;
import java.util.HashSet;
import java.util.Set;
import l40.C5599a;
import l40.C5617e;
import l40.C5619g;
import l40.C5620h;
import l40.C5621i;
import p104h2.C5037a;
import p117i2.C5260b;
import p372at.C13516c;
import p824tp.C19728f;
import p824tp.C19731i;
import p924xt.C20598h;
import s00.C19391d;

/* renamed from: bv.c */
public class C13693c extends C20598h<OfflineTripPlannerOptions> implements C5037a.C5038a<C5621i.C5623b> {

    /* renamed from: C */
    public static final /* synthetic */ int f33752C = 0;

    /* renamed from: A */
    public C5621i.C5623b f33753A = null;

    /* renamed from: B */
    public C5619g f33754B = null;

    /* renamed from: bv.c$a */
    public class C13694a {
        public C13694a(C13693c cVar, C5621i.C5623b bVar, C13516c cVar2) {
        }
    }

    /* renamed from: G2 */
    public final void mo40554G2() {
        if (this.f33753A != null) {
            C5619g gVar = this.f33754B;
            if (gVar != null) {
                gVar.cancel(true);
                this.f33754B = null;
            }
            mo40558y2();
            RecyclerView recyclerView = this.f52100r;
            if (recyclerView != null) {
                recyclerView.mo4568Z(this.f52106x);
                this.f52100r.mo4568Z(this.f52107y);
                this.f52100r.mo4627l0(new C12793c());
            }
            C5621i.C5623b bVar = this.f33753A;
            if (bVar.f18367d != null) {
                this.f33753A = null;
                A a = this.f40822c;
                long b = bVar.f18365b.mo24487b();
                C5619g gVar2 = new C5619g(bVar.f18367d, bVar.f18364a, bVar.f18365b);
                this.f33754B = gVar2;
                gVar2.execute(new C5599a.C5600a[]{new C5620h(a, bVar.f18367d, b, new C13694a(this, bVar, (C13516c) mo46776J1("HISTORY")))});
            } else if (mo46775H1() && this.f33753A != null) {
                getLoaderManager().mo20760b(this);
            }
        }
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        HashSet hashSet = new HashSet(3);
        hashSet.add("METRO_CONTEXT");
        hashSet.add("GTFS_CONFIGURATION");
        hashSet.add("HISTORY");
        hashSet.add("LATEST_ITINERARY_CONTROLLER");
        return hashSet;
    }

    /* renamed from: V1 */
    public final void mo40555V1() {
        super.mo40555V1();
        mo40554G2();
    }

    /* renamed from: o2 */
    public final void mo40556o2(TripPlannerLocations tripPlannerLocations, TripPlannerOptions tripPlannerOptions) {
        this.f33753A = new C5621i.C5623b(tripPlannerLocations, ((OfflineTripPlannerOptions) tripPlannerOptions).f39163b);
        mo40554G2();
    }

    public final C5260b<C5621i.C5623b> onCreateLoader(int i, Bundle bundle) {
        C19731i a = C19731i.m47197a(getContext());
        a.getClass();
        C19391d c = a.mo52085c(((C19728f) mo46776J1("METRO_CONTEXT")).f50165a);
        return new C5621i(getContext(), (GtfsConfiguration) mo46776J1("GTFS_CONFIGURATION"), c, this.f33753A);
    }

    public final void onLoadFinished(C5260b bVar, Object obj) {
        C5621i.C5623b bVar2 = (C5621i.C5623b) obj;
        if (bVar2 == null || bVar2.f18367d == null) {
            mo52806E2(R.string.response_read_error_message, R.drawable.img_empty_error);
            return;
        }
        this.f33753A = bVar2;
        mo40554G2();
    }

    public final void onLoaderReset(C5260b<C5621i.C5623b> bVar) {
        C5619g gVar = this.f33754B;
        C5621i.C5623b bVar2 = null;
        if (gVar != null) {
            gVar.cancel(true);
            this.f33754B = null;
        }
        C5621i.C5623b bVar3 = this.f33753A;
        if (bVar3 != null) {
            bVar2 = new C5621i.C5623b(bVar3.f18364a, bVar3.f18365b);
        }
        this.f33753A = bVar2;
    }

    /* renamed from: u2 */
    public final void mo40557u2(Itinerary itinerary) {
        mo52804B2(itinerary);
        mo50125v2(itinerary);
    }

    /* renamed from: y2 */
    public final void mo40558y2() {
        super.mo40558y2();
        mo52810z2(C5617e.m13872a(getContext()));
    }
}
