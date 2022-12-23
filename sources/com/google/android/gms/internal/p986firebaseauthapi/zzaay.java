package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaay */
final class zzaay extends zzabb {
    private final int zzc;

    public zzaay(byte[] bArr, int i, int i2) {
        super(bArr);
        zzabe.zzl(0, i2, bArr.length);
        this.zzc = i2;
    }

    public final byte zza(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.zza[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(C16759e.m42349e("Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(C13715c.m34244j("Index > length: ", i, ", ", i2));
    }

    public final byte zzb(int i) {
        return this.zza[i];
    }

    public final int zzc() {
        return 0;
    }

    public final int zzd() {
        return this.zzc;
    }

    public final void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, 0, bArr, 0, i3);
    }
}
