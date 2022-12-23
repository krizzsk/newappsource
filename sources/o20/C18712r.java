package o20;

import android.util.Property;
import ce0.C21100e;
import com.moovit.commons.geo.LatLonE6;

/* renamed from: o20.r */
public final class C18712r extends Property<Object, LatLonE6> {

    /* renamed from: a */
    public final C18711q f47624a;

    public C18712r(C18711q qVar) {
        super(LatLonE6.class, "markerLocation");
        C21100e.m49373x(qVar, "layer");
        this.f47624a = qVar;
    }

    public final Object get(Object obj) {
        return this.f47624a.mo51076e(obj);
    }

    public final void set(Object obj, Object obj2) {
        this.f47624a.mo51077g(obj, (LatLonE6) obj2);
    }
}
