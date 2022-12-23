package com.google.android.gms.internal.p986firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhh */
public final class zzhh extends zzhw {
    private final zzhm zza;
    private final zzpy zzb;
    private final Integer zzc;

    private zzhh(zzhm zzhm, zzpy zzpy, Integer num) {
        this.zza = zzhm;
        this.zzb = zzpy;
        this.zzc = num;
    }

    public static zzhh zzb(zzhm zzhm, zzpy zzpy, Integer num) throws GeneralSecurityException {
        if (zzpy.zza() != 32) {
            throw new GeneralSecurityException("Invalid key size");
        } else if (zzhm.zzd() && num == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with format with ID requirement");
        } else if (zzhm.zzd() || num == null) {
            return new zzhh(zzhm, zzpy, num);
        } else {
            throw new GeneralSecurityException("Cannot create key with ID requirement with format without ID requirement");
        }
    }

    public final /* synthetic */ zzbn zza() {
        return this.zza;
    }

    public final /* synthetic */ zzhx zzc() {
        return this.zza;
    }

    public final zzpx zzd() {
        zzhm zzhm = this.zza;
        if (zzhm.zzb() == zzhl.zzd) {
            return zzpx.zzb(new byte[0]);
        }
        if (zzhm.zzb() == zzhl.zzc || zzhm.zzb() == zzhl.zzb) {
            return zzpx.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
        }
        if (zzhm.zzb() == zzhl.zza) {
            return zzpx.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
        }
        throw new IllegalStateException("Unknown AesCmacParameters.Variant: ".concat(zzhm.zzb().toString()));
    }
}
