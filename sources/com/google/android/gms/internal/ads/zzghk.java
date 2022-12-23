package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

public final class zzghk implements zzfwl {
    private static final byte[] zza = new byte[0];
    private final zzghn zzb;
    private final String zzc;
    private final byte[] zzd;
    private final zzghi zze;
    private final int zzf;

    public zzghk(ECPublicKey eCPublicKey, byte[] bArr, String str, int i, zzghi zzghi) throws GeneralSecurityException {
        zzgho.zzc(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.zzb = new zzghn(eCPublicKey);
        this.zzd = bArr;
        this.zzc = str;
        this.zzf = i;
        this.zze = zzghi;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzghm zza2 = this.zzb.zza(this.zzc, this.zzd, bArr2, this.zze.zza(), this.zzf);
        byte[] zza3 = this.zze.zzb(zza2.zzb()).zza(bArr, zza);
        byte[] zza4 = zza2.zza();
        return ByteBuffer.allocate(zza4.length + zza3.length).put(zza4).put(zza3).array();
    }
}
