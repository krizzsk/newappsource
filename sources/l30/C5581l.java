package l30;

import aa0.C7530f;
import android.location.Location;
import android.os.Parcelable;
import com.moovit.commons.geo.LatLonE6;
import java.util.concurrent.Callable;
import l90.C12850a;
import l90.C12852c;
import p172m9.C5720b;
import w90.C13222b;

/* renamed from: l30.l */
public final /* synthetic */ class C5581l implements Callable {

    /* renamed from: b */
    public final /* synthetic */ int f18286b;

    /* renamed from: c */
    public final /* synthetic */ Object f18287c;

    /* renamed from: d */
    public final /* synthetic */ Parcelable f18288d;

    public /* synthetic */ C5581l(Object obj, Parcelable parcelable, int i) {
        this.f18286b = i;
        this.f18287c = obj;
        this.f18288d = parcelable;
    }

    public final Object call() {
        switch (this.f18286b) {
            case 0:
                return C7530f.m17268a((LatLonE6) this.f18287c, (LatLonE6) this.f18288d);
            default:
                C12852c cVar = (C12852c) this.f18287c;
                Location location = (Location) this.f18288d;
                C13222b bVar = cVar.f31782r;
                C12850a aVar = cVar.f31783s;
                long j = aVar.f31773c;
                String str = aVar.f31772b;
                if (location == null) {
                    return C5720b.m14060k((Double) null, (Double) null, j, bVar.f32797b, str);
                }
                bVar.getClass();
                return C5720b.m14060k(Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()), j, bVar.f32797b, str);
        }
    }
}
