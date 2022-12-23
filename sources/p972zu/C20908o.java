package p972zu;

import android.content.Context;
import com.moovit.app.taxi.providers.TaxiProvider;
import com.moovit.app.taxi.providers.TaxiProvidersManager;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.WaitToTaxiLeg;
import com.moovit.navigation.C4231d;
import com.moovit.navigation.Navigable;
import com.moovit.navigation.event.NavigationProgressEvent;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import e20.C16769e;
import java.util.concurrent.TimeUnit;

/* renamed from: zu.o */
public final class C20908o extends C20894a<WaitToTaxiLeg> {
    public C20908o(Context context, Navigable navigable, WaitToTaxiLeg waitToTaxiLeg, NavigationProgressEvent navigationProgressEvent, C4231d<?> dVar, C16769e.C16772c cVar) {
        super(context, navigable, waitToTaxiLeg, navigationProgressEvent, dVar, cVar);
    }

    /* renamed from: l */
    public final int mo52992l(boolean z) {
        return z ? R.drawable.notification_center_wait : R.drawable.notification_center_wait_disable;
    }

    /* renamed from: m */
    public final String mo52993m(Leg leg, NavigationProgressEvent navigationProgressEvent) {
        int i = ((WaitToTaxiLeg) leg).f42127g;
        if (i < 0) {
            i = 0;
        }
        return C7925b.f23937d.mo24602b(this.f52646b, (long) ((int) TimeUnit.SECONDS.toMinutes((long) i))).toString();
    }

    /* renamed from: p */
    public final CharSequence mo52996p(Leg leg) {
        TaxiProvider taxiProvider;
        String str;
        WaitToTaxiLeg waitToTaxiLeg = (WaitToTaxiLeg) leg;
        Context context = this.f52646b;
        TaxiProvidersManager b = TaxiProvidersManager.m39496b(context.getApplicationContext());
        if (b != null) {
            taxiProvider = b.mo46163c(waitToTaxiLeg.f42122b);
        } else {
            taxiProvider = null;
        }
        if (taxiProvider == null) {
            str = context.getString(R.string.taxi_title);
        } else {
            str = taxiProvider.f39977l.f39988b;
        }
        return context.getString(R.string.tripplan_itinerary_minimized_wait, new Object[]{str});
    }
}
