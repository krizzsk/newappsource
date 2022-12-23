package com.google.android.gms.internal.p986firebaseauthapi;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaav */
final class zzaav extends zzaax {
    public final /* synthetic */ zzabe zza;
    private int zzb = 0;
    private final int zzc;

    public zzaav(zzabe zzabe) {
        this.zza = zzabe;
        this.zzc = zzabe.zzd();
    }

    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    public final byte zza() {
        int i = this.zzb;
        if (i < this.zzc) {
            this.zzb = i + 1;
            return this.zza.zzb(i);
        }
        throw new NoSuchElementException();
    }
}
