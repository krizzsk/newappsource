package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzbb;
import com.google.android.gms.common.util.VisibleForTesting;

public final class zzbsz {
    @VisibleForTesting
    public static final zzbb zza = new zzbsx();
    @VisibleForTesting
    public static final zzbb zzb = new zzbsy();
    private final zzbsl zzc;

    public zzbsz(Context context, zzcfo zzcfo, String str, zzfhs zzfhs) {
        this.zzc = new zzbsl(context, zzcfo, str, zza, zzb, zzfhs);
    }

    public final zzbsp zza(String str, zzbss zzbss, zzbsr zzbsr) {
        return new zzbtd(this.zzc, str, zzbss, zzbsr);
    }

    public final zzbti zzb() {
        return new zzbti(this.zzc);
    }
}
