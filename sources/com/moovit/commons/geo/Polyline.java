package com.moovit.commons.geo;

import android.os.Parcelable;
import java.util.List;
import p762qz.C19205a;

public interface Polyline extends C19205a, Parcelable, Iterable<LatLonE6> {
    /* renamed from: U0 */
    int mo24338U0();

    /* renamed from: Z0 */
    float mo24339Z0();

    List<LatLonE6> getPoints();

    /* renamed from: y */
    LatLonE6 mo24347y(int i);
}
