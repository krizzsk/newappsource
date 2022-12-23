package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import java.lang.ref.WeakReference;
import p253t.C6516g;
import p253t.C6520j;

public final class zzgqj extends C6520j {
    private final WeakReference zza;

    public zzgqj(zzbiw zzbiw, byte[] bArr) {
        this.zza = new WeakReference(zzbiw);
    }

    public final void onCustomTabsServiceConnected(ComponentName componentName, C6516g gVar) {
        zzbiw zzbiw = (zzbiw) this.zza.get();
        if (zzbiw != null) {
            zzbiw.zzc(gVar);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        zzbiw zzbiw = (zzbiw) this.zza.get();
        if (zzbiw != null) {
            zzbiw.zzd();
        }
    }
}
