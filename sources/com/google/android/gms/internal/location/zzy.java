package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.IStatusCallback;

final class zzy extends IStatusCallback.Stub {
    private final BaseImplementation.ResultHolder zza;

    public zzy(BaseImplementation.ResultHolder resultHolder) {
        this.zza = resultHolder;
    }

    public final void onResult(Status status) {
        this.zza.setResult(status);
    }
}
