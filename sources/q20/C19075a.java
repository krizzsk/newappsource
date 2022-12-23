package q20;

import android.os.Parcelable;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.image.model.Image;
import p20.C18880g;

/* renamed from: q20.a */
public final class C19075a<M extends Parcelable> extends C18880g {

    /* renamed from: f */
    public final Class<M> f48496f;

    /* renamed from: g */
    public final M f48497g;

    public C19075a(LatLonE6 latLonE6, Image image, Image image2, Class<M> cls, M m) {
        this(latLonE6, image, image2, 1, cls, m);
    }

    /* renamed from: a */
    public final boolean mo51510a(Class<? extends Parcelable> cls) {
        return this.f48496f == cls;
    }

    public C19075a(LatLonE6 latLonE6, Image image, Image image2, int i, Class<M> cls, M m) {
        super(latLonE6, image, image2, i);
        this.f48496f = cls;
        this.f48497g = m;
    }
}
