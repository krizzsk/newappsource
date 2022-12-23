package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Task;

public final class zzfnx {
    public static zzfvj zza(Task task) {
        zzfnw zzfnw = new zzfnw(task);
        task.addOnCompleteListener(zzfvq.zzb(), new zzfnv(zzfnw));
        return zzfnw;
    }
}
