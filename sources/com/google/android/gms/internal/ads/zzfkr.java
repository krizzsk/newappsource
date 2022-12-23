package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class zzfkr implements Continuation {
    public final /* synthetic */ zzaku zza;
    public final /* synthetic */ int zzb;

    public /* synthetic */ zzfkr(zzaku zzaku, int i) {
        this.zza = zzaku;
        this.zzb = i;
    }

    public final Object then(Task task) {
        zzaku zzaku = this.zza;
        int i = this.zzb;
        if (!task.isSuccessful()) {
            return Boolean.FALSE;
        }
        zzfmt zza2 = ((zzfmu) task.getResult()).zza(((zzaky) zzaku.zzaj()).zzau());
        zza2.zza(i);
        zza2.zzc();
        return Boolean.TRUE;
    }
}
