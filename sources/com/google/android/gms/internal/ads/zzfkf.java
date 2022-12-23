package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

public abstract class zzfkf extends AsyncTask {
    private zzfkg zza;
    public final zzfjx zzd;

    public zzfkf(zzfjx zzfjx, byte[] bArr) {
        this.zzd = zzfjx;
    }

    /* renamed from: zza */
    public void onPostExecute(String str) {
        zzfkg zzfkg = this.zza;
        if (zzfkg != null) {
            zzfkg.zza(this);
        }
    }

    public final void zzb(zzfkg zzfkg) {
        this.zza = zzfkg;
    }
}
