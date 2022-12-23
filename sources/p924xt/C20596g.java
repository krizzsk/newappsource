package p924xt;

import c00.C13722f;
import c00.C13723g;
import ce0.C21100e;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.ItinerarySection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o00.C18676l;
import p977zz.C20975x0;

/* renamed from: xt.g */
public final class C20596g extends C18676l.C18678b<C20595f> {

    /* renamed from: d */
    public final ItinerarySection f52093d;

    /* renamed from: e */
    public final C20595f f52094e;

    /* renamed from: f */
    public final C20597a f52095f = new C20597a(this);

    /* renamed from: xt.g$a */
    public static class C20597a implements C13722f<C20595f> {

        /* renamed from: b */
        public final C20596g f52096b;

        public C20597a(C20596g gVar) {
            C21100e.m49373x(gVar, "adapterSection");
            this.f52096b = gVar;
        }

        /* renamed from: a */
        public final boolean mo19661o(C20595f fVar) {
            Itinerary itinerary;
            C20596g gVar = this.f52096b;
            if (gVar.f52093d.f41919h && (itinerary = fVar.f52087a) != null) {
                String str = itinerary.f41895c.f41903e;
                Iterator it = gVar.iterator();
                while (it.hasNext()) {
                    Itinerary itinerary2 = ((C20595f) it.next()).f52087a;
                    if (itinerary2 != null && C20975x0.m49118e(itinerary2.f41895c.f41903e, str)) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public C20596g(ItinerarySection itinerarySection, List<C20595f> list, C20595f fVar) {
        super(itinerarySection.f41916e, list);
        this.f52093d = itinerarySection;
        this.f52094e = fVar;
    }

    public final void add(int i, Object obj) {
        C20595f fVar = (C20595f) obj;
        if (this.f52095f.mo19661o(fVar)) {
            super.add(i, fVar);
        }
    }

    public final boolean addAll(int i, Collection<? extends C20595f> collection) {
        return super.addAll(i, C13723g.m34282c(collection, this.f52095f));
    }

    /* renamed from: d */
    public final boolean add(C20595f fVar) {
        return this.f52095f.mo19661o(fVar) && super.add(fVar);
    }

    /* renamed from: e */
    public final int mo40089e() {
        int min = Math.min(size(), this.f52093d.f41917f);
        int i = 0;
        if (this.f52094e != null && mo52801s() > this.f52093d.f41917f) {
            i = 1;
        }
        return i + min;
    }

    public final Object getItem(int i) {
        boolean z = false;
        if (this.f52094e != null && mo52801s() > this.f52093d.f41917f) {
            z = true;
        }
        if (!z || i != mo40089e() - 1) {
            return (C20595f) get(i);
        }
        return this.f52094e;
    }

    /* renamed from: s */
    public final int mo52801s() {
        return Math.max(size(), this.f52093d.f41918g);
    }

    public final boolean addAll(Collection<? extends C20595f> collection) {
        return super.addAll(C13723g.m34282c(collection, this.f52095f));
    }
}
