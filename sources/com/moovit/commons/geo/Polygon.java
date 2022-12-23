package com.moovit.commons.geo;

import android.os.Parcelable;
import java.util.List;
import p762qz.C19205a;

public interface Polygon extends C19205a, Parcelable, Iterable<LatLonE6> {
    List<LatLonE6> getPoints();

    /* renamed from: h */
    boolean mo46935h(LatLonE6 latLonE6);
}
