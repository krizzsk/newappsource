package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhm */
public final class zzhm extends zzhx {
    private final int zza;
    private final zzhl zzb;

    private zzhm(int i, zzhl zzhl) {
        this.zza = i;
        this.zzb = zzhl;
    }

    public static zzhm zzc(int i, zzhl zzhl) throws GeneralSecurityException {
        if (i >= 10 && i <= 16) {
            return new zzhm(i, zzhl);
        }
        throw new GeneralSecurityException(C16759e.m42349e("Invalid tag size for AesCmacParameters: ", i));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhm)) {
            return false;
        }
        zzhm zzhm = (zzhm) obj;
        if (zzhm.zza() == zza() && zzhm.zzb == this.zzb) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), this.zzb});
    }

    public final String toString() {
        String zzhl = this.zzb.toString();
        int i = this.zza;
        return "AES-CMAC Parameters (variant: " + zzhl + ", " + i + "-byte tags)";
    }

    public final int zza() {
        zzhl zzhl = this.zzb;
        if (zzhl == zzhl.zzd) {
            return this.zza;
        }
        if (zzhl == zzhl.zza || zzhl == zzhl.zzb || zzhl == zzhl.zzc) {
            return this.zza + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzhl zzb() {
        return this.zzb;
    }

    public final boolean zzd() {
        return this.zzb != zzhl.zzd;
    }
}
