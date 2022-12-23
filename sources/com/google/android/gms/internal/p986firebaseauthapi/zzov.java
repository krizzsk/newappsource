package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzov */
public final class zzov implements zzau {
    private static final byte[] zza = new byte[0];
    private final ECPrivateKey zzb;
    private final zzox zzc;
    private final String zzd;
    private final byte[] zze;
    private final zzou zzf;
    private final int zzg;

    public zzov(ECPrivateKey eCPrivateKey, byte[] bArr, String str, int i, zzou zzou) throws GeneralSecurityException {
        this.zzb = eCPrivateKey;
        this.zzc = new zzox(eCPrivateKey);
        this.zze = bArr;
        this.zzd = str;
        this.zzg = i;
        this.zzf = zzou;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] zza(byte[] r10, byte[] r11) throws java.security.GeneralSecurityException {
        /*
            r9 = this;
            java.security.interfaces.ECPrivateKey r11 = r9.zzb
            java.security.spec.ECParameterSpec r11 = r11.getParams()
            java.security.spec.EllipticCurve r11 = r11.getCurve()
            int r0 = r9.zzg
            int r11 = com.google.android.gms.internal.p986firebaseauthapi.zzoz.zza(r11)
            int r0 = r0 + -1
            if (r0 == 0) goto L_0x001a
            r1 = 2
            if (r0 == r1) goto L_0x0018
            goto L_0x001b
        L_0x0018:
            int r11 = r11 + r11
            goto L_0x001d
        L_0x001a:
            int r11 = r11 + r11
        L_0x001b:
            int r11 = r11 + 1
        L_0x001d:
            int r0 = r10.length
            if (r0 < r11) goto L_0x0049
            r1 = 0
            byte[] r3 = java.util.Arrays.copyOfRange(r10, r1, r11)
            com.google.android.gms.internal.firebase-auth-api.zzox r2 = r9.zzc
            java.lang.String r4 = r9.zzd
            byte[] r5 = r9.zze
            com.google.android.gms.internal.firebase-auth-api.zzou r1 = r9.zzf
            int r7 = r1.zza()
            int r8 = r9.zzg
            r6 = 0
            byte[] r1 = r2.zza(r3, r4, r5, r6, r7, r8)
            com.google.android.gms.internal.firebase-auth-api.zzou r2 = r9.zzf
            com.google.android.gms.internal.firebase-auth-api.zzfk r1 = r2.zzb(r1)
            byte[] r10 = java.util.Arrays.copyOfRange(r10, r11, r0)
            byte[] r11 = zza
            byte[] r10 = r1.zza(r10, r11)
            return r10
        L_0x0049:
            java.security.GeneralSecurityException r10 = new java.security.GeneralSecurityException
            java.lang.String r11 = "ciphertext too short"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p986firebaseauthapi.zzov.zza(byte[], byte[]):byte[]");
    }
}
