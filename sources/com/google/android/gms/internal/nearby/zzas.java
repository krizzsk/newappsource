package com.google.android.gms.internal.nearby;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.util.List;

final class zzas extends IStatusCallback.Stub {
    public final /* synthetic */ List zza;
    public final /* synthetic */ TaskCompletionSource zzb;

    public zzas(zzax zzax, List list, TaskCompletionSource taskCompletionSource) {
        this.zza = list;
        this.zzb = taskCompletionSource;
    }

    public final void onResult(Status status) {
        for (ParcelFileDescriptor close : this.zza) {
            try {
                close.close();
            } catch (IOException unused) {
            }
        }
        TaskUtil.trySetResultOrApiException(status, null, this.zzb);
    }
}
