package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

public final class zzcng {
    /* access modifiers changed from: private */
    public zzcfo zza;
    /* access modifiers changed from: private */
    public Context zzb;
    /* access modifiers changed from: private */
    public WeakReference zzc;

    public final zzcng zzc(Context context) {
        this.zzc = new WeakReference(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.zzb = context;
        return this;
    }

    public final zzcng zzd(zzcfo zzcfo) {
        this.zza = zzcfo;
        return this;
    }
}
