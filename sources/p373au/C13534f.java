package p373au;

import com.moovit.app.itinerary.view.NextArrivalsView;
import com.moovit.transit.LocationDescriptor;
import com.moovit.transit.Schedule;
import java.util.Comparator;
import java.util.Map;
import p977zz.C20944i0;
import p977zz.C20975x0;

/* renamed from: au.f */
public final /* synthetic */ class C13534f implements Comparator {

    /* renamed from: b */
    public final /* synthetic */ int f33455b;

    /* renamed from: c */
    public final /* synthetic */ Object f33456c;

    public /* synthetic */ C13534f(Object obj, int i) {
        this.f33455b = i;
        this.f33456c = obj;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.f33455b) {
            case 0:
                int i = NextArrivalsView.f38657g;
                return ((Comparator) this.f33456c).compare((Schedule) ((C20944i0) obj).f52693b, (Schedule) ((C20944i0) obj2).f52693b);
            default:
                Map map = (Map) this.f33456c;
                return C20975x0.m49116c((Integer) map.get((LocationDescriptor) obj), (Integer) map.get((LocationDescriptor) obj2));
        }
    }
}
