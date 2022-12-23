package p952yy;

import com.moovit.util.time.Time;

/* renamed from: yy.b */
public final class C20786b {

    /* renamed from: a */
    public Time f52447a = null;

    /* renamed from: b */
    public int f52448b = 5;

    /* renamed from: c */
    public boolean f52449c = true;

    /* renamed from: d */
    public boolean f52450d = false;

    /* renamed from: e */
    public boolean f52451e = false;

    /* renamed from: f */
    public boolean f52452f = false;

    /* renamed from: g */
    public boolean f52453g = false;

    /* renamed from: h */
    public boolean f52454h = false;

    /* renamed from: i */
    public boolean f52455i = false;

    public final String toString() {
        StringBuilder k = C13555b.m33972k("ArrivalsRequestConfiguration{time=");
        k.append(this.f52447a);
        k.append(", timeTypeMask=");
        k.append(Integer.toBinaryString(this.f52448b));
        k.append(", includeStaticArrivals=");
        k.append(this.f52449c);
        k.append(", interestedInLastArrivals=");
        k.append(this.f52450d);
        k.append(", includeOnlyLastArrivals=");
        k.append(this.f52451e);
        k.append(", resolvePatterns=");
        k.append(this.f52452f);
        k.append(", useFallbackResponses=");
        k.append(this.f52453g);
        k.append(", includeShapeSegments=");
        k.append(this.f52454h);
        k.append(", includeAllTrips=");
        return C13715c.m34247m(k, this.f52455i, '}');
    }
}
