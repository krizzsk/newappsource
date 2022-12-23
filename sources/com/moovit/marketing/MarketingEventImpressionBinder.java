package com.moovit.marketing;

import androidx.lifecycle.C1025n;
import androidx.lifecycle.C1033p;
import androidx.lifecycle.Lifecycle;
import com.moovit.MoovitExecutors;
import java.util.IdentityHashMap;
import p316y.C7218m;
import z20.C20806a;

public class MarketingEventImpressionBinder implements C1025n {

    /* renamed from: c */
    public static final IdentityHashMap f42582c = new IdentityHashMap();

    /* renamed from: b */
    public final C20806a f42583b;

    public MarketingEventImpressionBinder(C20806a aVar) {
        this.f42583b = aVar;
    }

    /* renamed from: a */
    public static void m41586a(C1033p pVar, C20806a aVar) {
        IdentityHashMap identityHashMap = f42582c;
        MarketingEventImpressionBinder marketingEventImpressionBinder = (MarketingEventImpressionBinder) identityHashMap.get(pVar);
        if (marketingEventImpressionBinder == null || !marketingEventImpressionBinder.f42583b.equals(aVar)) {
            Lifecycle lifecycle = pVar.getLifecycle();
            if (marketingEventImpressionBinder != null) {
                lifecycle.mo4226c(marketingEventImpressionBinder);
            }
            MarketingEventImpressionBinder marketingEventImpressionBinder2 = new MarketingEventImpressionBinder(aVar);
            identityHashMap.put(pVar, marketingEventImpressionBinder2);
            lifecycle.mo4224a(marketingEventImpressionBinder2);
        }
    }

    /* renamed from: f */
    public final void mo740f(C1033p pVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_START) {
            MoovitExecutors.MAIN_THREAD.execute(new C7218m(8, this, pVar));
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            f42582c.remove(pVar);
        }
    }
}
