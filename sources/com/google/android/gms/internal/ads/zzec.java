package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

final class zzec implements zzdg {
    private static final List zza = new ArrayList(50);
    private final Handler zzb;

    public zzec(Handler handler) {
        this.zzb = handler;
    }

    public static /* bridge */ /* synthetic */ void zzk(zzeb zzeb) {
        List list = zza;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(zzeb);
            }
        }
    }

    private static zzeb zzl() {
        zzeb zzeb;
        List list = zza;
        synchronized (list) {
            if (list.isEmpty()) {
                zzeb = new zzeb((zzea) null);
            } else {
                zzeb = (zzeb) list.remove(list.size() - 1);
            }
        }
        return zzeb;
    }

    public final zzdf zza(int i) {
        zzeb zzl = zzl();
        zzl.zzb(this.zzb.obtainMessage(i), this);
        return zzl;
    }

    public final zzdf zzb(int i, Object obj) {
        zzeb zzl = zzl();
        zzl.zzb(this.zzb.obtainMessage(i, obj), this);
        return zzl;
    }

    public final zzdf zzc(int i, int i2, int i3) {
        zzeb zzl = zzl();
        zzl.zzb(this.zzb.obtainMessage(1, i2, i3), this);
        return zzl;
    }

    public final void zzd(Object obj) {
        this.zzb.removeCallbacksAndMessages((Object) null);
    }

    public final void zze(int i) {
        this.zzb.removeMessages(2);
    }

    public final boolean zzf(int i) {
        return this.zzb.hasMessages(0);
    }

    public final boolean zzg(Runnable runnable) {
        return this.zzb.post(runnable);
    }

    public final boolean zzh(int i) {
        return this.zzb.sendEmptyMessage(i);
    }

    public final boolean zzi(int i, long j) {
        return this.zzb.sendEmptyMessageAtTime(2, j);
    }

    public final boolean zzj(zzdf zzdf) {
        return ((zzeb) zzdf).zzc(this.zzb);
    }
}
