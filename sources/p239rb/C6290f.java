package p239rb;

import com.moovit.app.home.dashboard.C14926b;
import com.moovit.carpool.CarpoolRideRequest;
import java.util.Comparator;
import p239rb.C6291g;
import p977zz.C20975x0;

/* renamed from: rb.f */
public final /* synthetic */ class C6290f implements Comparator {

    /* renamed from: b */
    public final /* synthetic */ int f19899b;

    public /* synthetic */ C6290f(int i) {
        this.f19899b = i;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.f19899b) {
            case 0:
                return Integer.compare(((C6291g.C6292a) obj).f19905a.f19908b, ((C6291g.C6292a) obj2).f19905a.f19908b);
            default:
                C14926b.C14927a aVar = C14926b.f38185s;
                return C20975x0.m49115b(((CarpoolRideRequest) obj).f40931e, ((CarpoolRideRequest) obj2).f40931e);
        }
    }
}
