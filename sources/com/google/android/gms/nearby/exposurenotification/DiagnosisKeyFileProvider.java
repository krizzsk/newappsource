package com.google.android.gms.nearby.exposurenotification;

import com.google.android.gms.internal.nearby.zzsq;
import java.io.File;
import java.util.List;

public class DiagnosisKeyFileProvider {
    private int zza = 0;
    private final List zzb;

    public DiagnosisKeyFileProvider(List<File> list) {
        this.zzb = zzsq.zzk(list);
    }

    public final File zza() {
        int i = this.zza + 1;
        this.zza = i;
        return (File) this.zzb.get(i - 1);
    }

    public final boolean zzb() {
        return this.zzb.size() > this.zza;
    }
}
