package com.google.android.gms.awareness.snapshot;

import android.location.Location;
import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.internal.Preconditions;

public class LocationResponse extends Response<LocationResult> {
    public Location getLocation() {
        return (Location) Preconditions.checkNotNull(((LocationResult) getResult()).getLocation());
    }
}
