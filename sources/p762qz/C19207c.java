package p762qz;

import com.moovit.commons.geo.LatLonE6;

/* renamed from: qz.c */
public interface C19207c {

    /* renamed from: qz.c$a */
    public static class C19208a implements C19207c {
        /* renamed from: a */
        public final LatLonE6 mo51618a(float f, LatLonE6 latLonE6, LatLonE6 latLonE62) {
            double k = latLonE6.mo46922k();
            double o = latLonE6.mo46926o();
            double d = (double) f;
            return LatLonE6.m40176g(((latLonE62.mo46922k() - k) * d) + k, ((latLonE62.mo46926o() - o) * d) + o);
        }
    }

    /* renamed from: a */
    LatLonE6 mo51618a(float f, LatLonE6 latLonE6, LatLonE6 latLonE62);
}
