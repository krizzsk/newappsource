package c40;

import ce0.C21100e;
import com.appboy.models.outgoing.FacebookUser;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.image.model.ImageSet;
import p583jk.C17884p;
import p977zz.C20975x0;

/* renamed from: c40.a */
public final class C1777a {

    /* renamed from: a */
    public final LatLonE6 f6246a;

    /* renamed from: b */
    public final ImageSet f6247b;

    public C1777a(LatLonE6 latLonE6, ImageSet imageSet) {
        C21100e.m49373x(latLonE6, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        this.f6246a = latLonE6;
        this.f6247b = imageSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777a)) {
            return false;
        }
        C1777a aVar = (C1777a) obj;
        if (!C20975x0.m49118e(this.f6246a, aVar.f6246a) || !C20975x0.m49118e(this.f6247b, aVar.f6247b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f6246a), C17884p.m44335F(this.f6247b));
    }
}
