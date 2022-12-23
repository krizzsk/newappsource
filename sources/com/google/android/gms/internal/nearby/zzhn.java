package com.google.android.gms.internal.nearby;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class zzhn implements OnCompleteListener {
    public final /* synthetic */ zzih zza;

    public /* synthetic */ zzhn(zzih zzih) {
        this.zza = zzih;
    }

    public final void onComplete(Task task) {
        this.zza.zzd(task);
    }
}
