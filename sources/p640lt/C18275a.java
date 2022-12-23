package p640lt;

import com.moovit.app.home.dashboard.suggestions.station.StopSuggestionFragment;
import com.moovit.app.home.lines.favorites.FavoriteLinesFragment;
import com.moovit.app.mot.purchase.model.MotQrCodeTrip;
import java.util.Comparator;
import lf0.C24240p;
import mf0.C24362h;

/* renamed from: lt.a */
public final /* synthetic */ class C18275a implements Comparator {

    /* renamed from: b */
    public final /* synthetic */ int f46606b;

    /* renamed from: c */
    public final /* synthetic */ Object f46607c;

    public /* synthetic */ C18275a(Object obj, int i) {
        this.f46606b = i;
        this.f46607c = obj;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.f46606b) {
            case 0:
                int i = FavoriteLinesFragment.f38373E;
                return ((Comparator) this.f46607c).compare(((FavoriteLinesFragment.C15003h) obj).mo45212a().f52458c, ((FavoriteLinesFragment.C15003h) obj2).mo45212a().f52458c);
            case 1:
                return ((Comparator) this.f46607c).compare(((MotQrCodeTrip) obj).f39072b, ((MotQrCodeTrip) obj2).f39072b);
            default:
                C24240p pVar = (C24240p) this.f46607c;
                int i2 = StopSuggestionFragment.f38338s;
                C24362h.m61211f(pVar, "$tmp0");
                return ((Number) pVar.invoke(obj, obj2)).intValue();
        }
    }
}
