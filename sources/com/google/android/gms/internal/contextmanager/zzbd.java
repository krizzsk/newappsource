package com.google.android.gms.internal.contextmanager;

import com.google.android.gms.awareness.FenceApi;
import com.google.android.gms.awareness.fence.FenceQueryRequest;
import com.google.android.gms.awareness.fence.FenceQueryResult;
import com.google.android.gms.awareness.fence.FenceUpdateRequest;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

public final class zzbd implements FenceApi {
    public final PendingResult<FenceQueryResult> queryFences(GoogleApiClient googleApiClient, FenceQueryRequest fenceQueryRequest) {
        return googleApiClient.enqueue(new zzbc(this, googleApiClient, fenceQueryRequest));
    }

    public final PendingResult<Status> updateFences(GoogleApiClient googleApiClient, FenceUpdateRequest fenceUpdateRequest) {
        return googleApiClient.enqueue(new zzbb(this, googleApiClient, fenceUpdateRequest));
    }
}
