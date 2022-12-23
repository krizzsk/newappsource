package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Set;
import p241s0.C6304d;

@VisibleForTesting
final class zzfx extends zzju implements zzgk {
    private final ListenerHolder zza;
    private final Set zzb = new C6304d();
    private final Set zzc = new C6304d();

    public zzfx(ListenerHolder listenerHolder) {
        this.zza = (ListenerHolder) Preconditions.checkNotNull(listenerHolder);
    }

    public final void zzb(zzkq zzkq) {
        this.zza.notifyListener(new zzfu(this, zzkq));
    }

    public final synchronized void zzc(zzks zzks) {
        this.zzb.add(zzks.zzb());
        this.zza.notifyListener(new zzfr(this, zzks));
    }

    public final synchronized void zzd(zzky zzky) {
        this.zzb.remove(zzky.zzb());
        Status zzp = zzgy.zzF(zzky.zza());
        if (zzp.isSuccess()) {
            this.zzc.add(zzky.zzb());
        }
        this.zza.notifyListener(new zzfs(this, zzky, zzp));
    }

    public final synchronized void zze(zzla zzla) {
        this.zzc.remove(zzla.zza());
        this.zza.notifyListener(new zzft(this, zzla));
    }

    public final synchronized void zzf() {
        for (String zzfv : this.zzb) {
            this.zza.notifyListener(new zzfv(this, zzfv));
        }
        this.zzb.clear();
        for (String zzfw : this.zzc) {
            this.zza.notifyListener(new zzfw(this, zzfw));
        }
        this.zzc.clear();
    }
}
