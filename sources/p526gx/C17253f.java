package p526gx;

import com.moovit.commons.geo.BoxE6;
import p502fx.C17122g;

/* renamed from: gx.f */
public final class C17253f {

    /* renamed from: a */
    public final C17252e f44590a;

    /* renamed from: b */
    public final int f44591b;

    /* renamed from: c */
    public final int f44592c;

    /* renamed from: d */
    public final C17122g f44593d;

    /* renamed from: e */
    public final BoxE6 f44594e;

    public C17253f(C17252e eVar, int i, int i2, C17122g gVar, BoxE6 boxE6) {
        this.f44590a = eVar;
        this.f44591b = i;
        this.f44592c = i2;
        this.f44593d = gVar;
        this.f44594e = boxE6;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TodRouteNavigationProgressEvent{navigable=");
        k.append(this.f44590a);
        k.append(", previousGeofenceIndex=");
        k.append(this.f44591b);
        k.append(", currentGeofenceIndex=");
        k.append(this.f44592c);
        k.append(", realTimeInfo=");
        k.append(this.f44593d);
        k.append(", viewPort=");
        k.append(this.f44594e);
        k.append('}');
        return k.toString();
    }
}
