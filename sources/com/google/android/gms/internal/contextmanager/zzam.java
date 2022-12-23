package com.google.android.gms.internal.contextmanager;

import com.google.android.gms.awareness.SnapshotApi;
import com.google.android.gms.awareness.snapshot.BeaconStateResult;
import com.google.android.gms.awareness.snapshot.DetectedActivityResult;
import com.google.android.gms.awareness.snapshot.HeadphoneStateResult;
import com.google.android.gms.awareness.snapshot.LocationResult;
import com.google.android.gms.awareness.snapshot.TimeIntervalsResult;
import com.google.android.gms.awareness.state.BeaconState;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public final class zzam implements SnapshotApi {
    private final PendingResult<BeaconStateResult> zza(GoogleApiClient googleApiClient, ArrayList<zzo> arrayList) {
        return new zzak(this, googleApiClient.enqueue(new zzab(googleApiClient, 10003, arrayList)));
    }

    public final PendingResult<BeaconStateResult> getBeaconState(GoogleApiClient googleApiClient, Collection<BeaconState.TypeFilter> collection) {
        Preconditions.checkNotNull(collection, "beaconTypes cannot be null");
        Preconditions.checkArgument(collection.size() > 0, "beaconTypes must not be empty");
        ArrayList arrayList = new ArrayList();
        Iterator<BeaconState.TypeFilter> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((zzo) it.next());
        }
        return zza(googleApiClient, arrayList);
    }

    public final PendingResult<DetectedActivityResult> getDetectedActivity(GoogleApiClient googleApiClient) {
        return new zzae(this, googleApiClient.enqueue(new zzal(googleApiClient, 10002)));
    }

    public final PendingResult<HeadphoneStateResult> getHeadphoneState(GoogleApiClient googleApiClient) {
        return new zzag(this, googleApiClient.enqueue(new zzal(googleApiClient, 10004)));
    }

    public final PendingResult<LocationResult> getLocation(GoogleApiClient googleApiClient) {
        return new zzai(this, googleApiClient.enqueue(new zzal(googleApiClient, 10005)));
    }

    public final PendingResult<TimeIntervalsResult> getTimeIntervals(GoogleApiClient googleApiClient) {
        return new zzac(this, googleApiClient.enqueue(new zzal(googleApiClient, 10008)));
    }

    public final PendingResult<BeaconStateResult> getBeaconState(GoogleApiClient googleApiClient, BeaconState.TypeFilter... typeFilterArr) {
        Preconditions.checkNotNull(typeFilterArr, "beaconTypes cannot be null");
        Preconditions.checkArgument(r0 > 0, "beaconTypes must not be empty");
        ArrayList arrayList = new ArrayList();
        for (zzo add : typeFilterArr) {
            arrayList.add(add);
        }
        return zza(googleApiClient, arrayList);
    }
}
