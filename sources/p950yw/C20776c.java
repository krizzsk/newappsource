package p950yw;

import a40.C0078a;
import aa0.C7530f;
import android.os.Parcelable;
import com.moovit.commons.geo.BoxE6;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.geo.Polyline;
import com.moovit.map.MapFragment;
import com.moovit.micromobility.ride.MicroMobilityRide;
import com.moovit.payment.confirmation.options.PaymentOptions;
import com.moovit.payment.confirmation.summary.PaymentSummaryInfo;
import java.util.concurrent.Callable;
import l30.C5585p;
import p693nz.C18659h;
import p977zz.C20944i0;
import w50.C20283g;

/* renamed from: yw.c */
public final /* synthetic */ class C20776c implements Callable {

    /* renamed from: b */
    public final /* synthetic */ int f52420b;

    /* renamed from: c */
    public final /* synthetic */ Parcelable f52421c;

    /* renamed from: d */
    public final /* synthetic */ Object f52422d;

    public /* synthetic */ C20776c(Parcelable parcelable, Parcelable parcelable2, int i) {
        this.f52420b = i;
        this.f52421c = parcelable;
        this.f52422d = parcelable2;
    }

    public /* synthetic */ C20776c(MicroMobilityRide microMobilityRide, LatLonE6 latLonE6) {
        this.f52420b = 1;
        this.f52422d = microMobilityRide;
        this.f52421c = latLonE6;
    }

    public final Object call() {
        BoxE6 boxE6;
        switch (this.f52420b) {
            case 0:
                return C7530f.m17268a((LatLonE6) this.f52421c, (LatLonE6) this.f52422d);
            case 1:
                MicroMobilityRide microMobilityRide = (MicroMobilityRide) this.f52422d;
                LatLonE6 latLonE6 = (LatLonE6) this.f52421c;
                C18659h<String, Polyline> hVar = C5585p.f18297h;
                C0078a aVar = microMobilityRide.f14992j;
                int i = C5585p.C5586a.f18309a[microMobilityRide.f14991i.f15007b.ordinal()];
                if (i != 1) {
                    if (!(i == 2 || i == 3)) {
                        if (i == 4) {
                            return new C20944i0(MapFragment.MapFollowMode.NONE, BoxE6.m40167g(aVar.f198c, aVar.f199d));
                        } else if (i != 7) {
                            return new C20944i0(MapFragment.MapFollowMode.NONE, BoxE6.m40167g(aVar.f198c));
                        }
                    }
                    return new C20944i0(MapFragment.MapFollowMode.BOTH, null);
                }
                MapFragment.MapFollowMode mapFollowMode = MapFragment.MapFollowMode.NONE;
                if (latLonE6 != null) {
                    boxE6 = BoxE6.m40167g(latLonE6, aVar.f198c);
                } else {
                    boxE6 = BoxE6.m40167g(aVar.f198c);
                }
                return new C20944i0(mapFollowMode, boxE6);
            default:
                return C20283g.m47845b((PaymentOptions) this.f52421c, (PaymentSummaryInfo) this.f52422d);
        }
    }
}
