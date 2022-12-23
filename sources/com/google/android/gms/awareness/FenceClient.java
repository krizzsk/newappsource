package com.google.android.gms.awareness;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.awareness.fence.FenceQueryRequest;
import com.google.android.gms.awareness.fence.FenceQueryResponse;
import com.google.android.gms.awareness.fence.FenceUpdateRequest;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.tasks.Task;

public class FenceClient extends GoogleApi<AwarenessOptions> {
    public FenceClient(Activity activity, AwarenessOptions awarenessOptions) {
        super(activity, Awareness.API, awarenessOptions, (StatusExceptionMapper) new ApiExceptionMapper());
        awarenessOptions.zzi(getContextAttributionTag());
    }

    public Task<FenceQueryResponse> queryFences(FenceQueryRequest fenceQueryRequest) {
        return PendingResultUtil.toResponseTask(Awareness.FenceApi.queryFences(asGoogleApiClient(), fenceQueryRequest), new FenceQueryResponse());
    }

    public Task<Void> updateFences(FenceUpdateRequest fenceUpdateRequest) {
        return PendingResultUtil.toVoidTask(Awareness.FenceApi.updateFences(asGoogleApiClient(), fenceUpdateRequest));
    }

    public FenceClient(Context context, AwarenessOptions awarenessOptions) {
        super(context, Awareness.API, awarenessOptions, (StatusExceptionMapper) new ApiExceptionMapper());
        awarenessOptions.zzi(getContextAttributionTag());
    }
}
