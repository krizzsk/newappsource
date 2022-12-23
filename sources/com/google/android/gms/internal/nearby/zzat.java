package com.google.android.gms.internal.nearby;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.nearby.exposurenotification.DiagnosisKeyFileProvider;
import java.io.FileNotFoundException;

final class zzat extends zzcu {
    public final /* synthetic */ DiagnosisKeyFileProvider zza;

    public zzat(zzax zzax, DiagnosisKeyFileProvider diagnosisKeyFileProvider) {
        this.zza = diagnosisKeyFileProvider;
    }

    public final ParcelFileDescriptor zzb() {
        try {
            return ParcelFileDescriptor.open(this.zza.zza(), 268435456);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public final boolean zzc() {
        return this.zza.zzb();
    }
}
