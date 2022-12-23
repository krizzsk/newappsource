package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

final class zzakh implements zzajw {
    public final /* synthetic */ Context zza;
    private File zzb = null;

    public zzakh(Context context) {
        this.zza = context;
    }

    public final File zza() {
        if (this.zzb == null) {
            this.zzb = new File(this.zza.getCacheDir(), "volley");
        }
        return this.zzb;
    }
}
