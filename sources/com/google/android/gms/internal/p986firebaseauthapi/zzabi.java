package com.google.android.gms.internal.p986firebaseauthapi;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabi */
public abstract class zzabi {
    public static final /* synthetic */ int zzd = 0;
    private static volatile int zze = 100;
    public int zza;
    public final int zzb = zze;
    public zzabj zzc;

    public /* synthetic */ zzabi(zzabh zzabh) {
    }

    public static int zzs(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long zzt(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static zzabi zzu(byte[] bArr, int i, int i2, boolean z) {
        zzabg zzabg = new zzabg(bArr, 0, i2, z, (zzabf) null);
        try {
            zzabg.zzc(i2);
            return zzabg;
        } catch (zzacp e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract int zzb();

    public abstract int zzc(int i) throws zzacp;

    public abstract int zzf() throws IOException;

    public abstract zzabe zzj() throws IOException;

    public abstract String zzk() throws IOException;

    public abstract String zzl() throws IOException;

    public abstract void zzm(int i) throws zzacp;

    public abstract void zzn(int i);

    public abstract boolean zzp() throws IOException;

    public abstract boolean zzq() throws IOException;

    public abstract boolean zzr(int i) throws IOException;
}
