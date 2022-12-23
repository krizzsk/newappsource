package p304x;

import com.moovit.app.tod.bookingflow.TodBookingOrderViewModel;
import com.moovit.app.tod.model.TodWeeklyShuttleSubscription;
import mf0.C24362h;
import p227r.C6227a;
import p977zz.C20961r;

/* renamed from: x.m0 */
public final /* synthetic */ class C7074m0 implements C6227a {

    /* renamed from: b */
    public final /* synthetic */ int f21990b;

    public /* synthetic */ C7074m0(int i) {
        this.f21990b = i;
    }

    public final Object apply(Object obj) {
        Boolean bool;
        switch (this.f21990b) {
            case 0:
                Void voidR = (Void) obj;
                return Boolean.TRUE;
            case 1:
                return Long.valueOf(((TodBookingOrderViewModel.OrderInformation) obj).f40084d);
            default:
                C20961r rVar = (C20961r) obj;
                if (rVar != null) {
                    bool = Boolean.valueOf(rVar.f52711a);
                } else {
                    bool = null;
                }
                if (bool == null || !rVar.f52711a) {
                    return null;
                }
                T t = rVar.f52712b;
                if (!(t instanceof TodWeeklyShuttleSubscription)) {
                    return null;
                }
                C24362h.m61209d(t, "null cannot be cast to non-null type com.moovit.app.tod.model.TodWeeklyShuttleSubscription");
                return (TodWeeklyShuttleSubscription) t;
        }
    }
}
