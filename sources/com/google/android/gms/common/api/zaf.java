package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BasePendingResult;

final class zaf<R extends Result> extends BasePendingResult<R> {
    private final Result zae;

    public zaf(Result result) {
        super(Looper.getMainLooper());
        this.zae = result;
    }

    public final R createFailedResult(Status status) {
        if (status.getStatusCode() == this.zae.getStatus().getStatusCode()) {
            return this.zae;
        }
        throw new UnsupportedOperationException("Creating failed results is not supported");
    }
}
