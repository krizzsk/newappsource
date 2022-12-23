package com.google.android.gms.location.places;

import com.google.android.gms.common.api.DataBufferResponse;

@Deprecated
public class PlaceBufferResponse extends DataBufferResponse<Place, PlaceBuffer> {
    public CharSequence getAttributions() {
        return ((PlaceBuffer) getResult()).getAttributions();
    }
}
