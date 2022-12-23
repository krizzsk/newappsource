package com.google.android.gms.awareness;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.awareness.snapshot.BeaconStateResponse;
import com.google.android.gms.awareness.snapshot.DetectedActivityResponse;
import com.google.android.gms.awareness.snapshot.HeadphoneStateResponse;
import com.google.android.gms.awareness.snapshot.LocationResponse;
import com.google.android.gms.awareness.snapshot.TimeIntervalsResponse;
import com.google.android.gms.awareness.state.BeaconState;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.tasks.Task;
import java.util.Collection;

public class SnapshotClient extends GoogleApi<AwarenessOptions> {
    public SnapshotClient(Activity activity, AwarenessOptions awarenessOptions) {
        super(activity, Awareness.API, awarenessOptions, (StatusExceptionMapper) new ApiExceptionMapper());
        awarenessOptions.zzi(getContextAttributionTag());
    }

    public Task<BeaconStateResponse> getBeaconState(Collection<BeaconState.TypeFilter> collection) {
        return PendingResultUtil.toResponseTask(Awareness.SnapshotApi.getBeaconState(asGoogleApiClient(), collection), new BeaconStateResponse());
    }

    public Task<DetectedActivityResponse> getDetectedActivity() {
        return PendingResultUtil.toResponseTask(Awareness.SnapshotApi.getDetectedActivity(asGoogleApiClient()), new DetectedActivityResponse());
    }

    public Task<HeadphoneStateResponse> getHeadphoneState() {
        return PendingResultUtil.toResponseTask(Awareness.SnapshotApi.getHeadphoneState(asGoogleApiClient()), new HeadphoneStateResponse());
    }

    public Task<LocationResponse> getLocation() {
        return PendingResultUtil.toResponseTask(Awareness.SnapshotApi.getLocation(asGoogleApiClient()), new LocationResponse());
    }

    public Task<TimeIntervalsResponse> getTimeIntervals() {
        return PendingResultUtil.toResponseTask(Awareness.SnapshotApi.getTimeIntervals(asGoogleApiClient()), new TimeIntervalsResponse());
    }

    public SnapshotClient(Context context, AwarenessOptions awarenessOptions) {
        super(context, Awareness.API, awarenessOptions, (StatusExceptionMapper) new ApiExceptionMapper());
        awarenessOptions.zzi(getContextAttributionTag());
    }

    public Task<BeaconStateResponse> getBeaconState(BeaconState.TypeFilter... typeFilterArr) {
        return PendingResultUtil.toResponseTask(Awareness.SnapshotApi.getBeaconState(asGoogleApiClient(), typeFilterArr), new BeaconStateResponse());
    }
}
