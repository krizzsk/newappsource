package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

final class zzant implements zzfmn {
    public final /* synthetic */ zzfkn zza;

    public zzant(zzanv zzanv, zzfkn zzfkn) {
        this.zza = zzfkn;
    }

    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
