package p950yw;

import c00.C13723g;
import com.moovit.app.tod.bookingflow.model.FailureReason;
import com.moovit.app.tod.bookingflow.model.TodBookingDropOffInformation;
import com.moovit.app.tod.bookingflow.model.TodZoneShape;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.transit.LocationDescriptor;
import java.util.List;
import java.util.concurrent.Callable;
import p732pq.C18947h;

/* renamed from: yw.j */
public final /* synthetic */ class C20783j implements Callable {

    /* renamed from: b */
    public final /* synthetic */ TodBookingDropOffInformation f52442b;

    /* renamed from: c */
    public final /* synthetic */ LocationDescriptor f52443c;

    /* renamed from: d */
    public final /* synthetic */ LocationDescriptor f52444d;

    public /* synthetic */ C20783j(TodBookingDropOffInformation todBookingDropOffInformation, LocationDescriptor locationDescriptor, LocationDescriptor locationDescriptor2) {
        this.f52442b = todBookingDropOffInformation;
        this.f52443c = locationDescriptor;
        this.f52444d = locationDescriptor2;
    }

    public final Object call() {
        boolean z;
        TodBookingDropOffInformation todBookingDropOffInformation = this.f52442b;
        LocationDescriptor locationDescriptor = this.f52443c;
        LatLonE6 d = this.f52444d.mo24310d();
        List<TodZoneShape> list = todBookingDropOffInformation.f40087b;
        if (d == null || list.isEmpty()) {
            return FailureReason.NONE;
        }
        if (LatLonE6.m40174c(d, locationDescriptor) >= ((float) todBookingDropOffInformation.f40089d.f40101b)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return FailureReason.DISTANCE_TOO_CLOSE;
        }
        if (C13723g.m34280a(list, new C18947h(d, 2))) {
            return FailureReason.NONE;
        }
        return FailureReason.OUT_OF_AREA;
    }
}
