package p20;

import a20.C13387a;
import ce0.C21100e;
import com.appboy.models.outgoing.FacebookUser;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.image.model.Image;
import p762qz.C19206b;

/* renamed from: p20.g */
public abstract class C18880g implements C19206b, C13387a {

    /* renamed from: b */
    public final LatLonE6 f48054b;

    /* renamed from: c */
    public final Image f48055c;

    /* renamed from: d */
    public final Image f48056d;

    /* renamed from: e */
    public final int f48057e;

    public C18880g(LatLonE6 latLonE6, Image image, Image image2, int i) {
        C21100e.m49373x(latLonE6, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        this.f48054b = latLonE6;
        C21100e.m49373x(image, "image");
        this.f48055c = image;
        this.f48056d = image2;
        this.f48057e = i;
    }

    public final Image getImage() {
        return this.f48055c;
    }

    public final LatLonE6 getLocation() {
        return this.f48054b;
    }
}
