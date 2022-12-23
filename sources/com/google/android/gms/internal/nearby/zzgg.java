package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Set;
import p241s0.C6304d;

@VisibleForTesting
final class zzgg extends zzkb {
    private final ListenerHolder zza;
    private final Set zzb = new C6304d();

    public zzgg(ListenerHolder listenerHolder) {
        this.zza = (ListenerHolder) Preconditions.checkNotNull(listenerHolder);
    }

    /* access modifiers changed from: private */
    public static boolean zzg(zzle zzle) {
        if (zzle.zza() == null || (zzle.zzb() != null && !"__UNRECOGNIZED_BLUETOOTH_DEVICE__".equals(zzle.zzb()))) {
            return false;
        }
        return true;
    }

    public final synchronized void zzb(zzlc zzlc) {
        this.zza.notifyListener(new zzgc(this, zzlc));
    }

    public final synchronized void zzc(zzle zzle) {
        if (!zzg(zzle)) {
            this.zzb.add(zzle.zzb());
        }
        this.zza.notifyListener(new zzgd(this, zzle));
    }

    public final synchronized void zzd(zzlg zzlg) {
        this.zzb.remove(zzlg.zza());
        this.zza.notifyListener(new zzge(this, zzlg));
    }

    public final synchronized void zze() {
        for (String zzgf : this.zzb) {
            this.zza.notifyListener(new zzgf(this, zzgf));
        }
        this.zzb.clear();
    }
}
