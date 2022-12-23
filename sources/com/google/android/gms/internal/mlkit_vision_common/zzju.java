package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.common.internal.Preconditions;

public final class zzju {
    private final zzha zza;
    private zzil zzb = new zzil();

    private zzju(zzha zzha, int i) {
        this.zza = zzha;
        zzkg.zza();
    }

    public static zzju zzc(zzha zzha) {
        return new zzju(zzha, 0);
    }

    public final String zza() {
        zzin zzc = this.zza.zzf().zzc();
        if (zzc == null || zzg.zzb(zzc.zzk())) {
            return "NA";
        }
        return (String) Preconditions.checkNotNull(zzc.zzk());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|9|10|11|12|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0059 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] zzb(int r9, boolean r10) {
        /*
            r8 = this;
            com.google.android.gms.internal.mlkit_vision_common.zzil r10 = r8.zzb
            r0 = r9 ^ 1
            r1 = 1
            if (r1 == r0) goto L_0x0009
            r0 = 0
            goto L_0x000a
        L_0x0009:
            r0 = 1
        L_0x000a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r10.zzf(r0)
            com.google.android.gms.internal.mlkit_vision_common.zzil r10 = r8.zzb
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r10.zze(r0)
            com.google.android.gms.internal.mlkit_vision_common.zzha r10 = r8.zza
            com.google.android.gms.internal.mlkit_vision_common.zzil r0 = r8.zzb
            com.google.android.gms.internal.mlkit_vision_common.zzin r0 = r0.zzm()
            r10.zze(r0)
            com.google.android.gms.internal.mlkit_vision_common.zzkg.zza()     // Catch:{ UnsupportedEncodingException -> 0x007d }
            if (r9 != 0) goto L_0x0064
            com.google.android.gms.internal.mlkit_vision_common.zzha r9 = r8.zza     // Catch:{ UnsupportedEncodingException -> 0x007d }
            com.google.android.gms.internal.mlkit_vision_common.zzhc r9 = r9.zzf()     // Catch:{ UnsupportedEncodingException -> 0x007d }
            ue.e r10 = new ue.e     // Catch:{ UnsupportedEncodingException -> 0x007d }
            r10.<init>()     // Catch:{ UnsupportedEncodingException -> 0x007d }
            te.a r0 = com.google.android.gms.internal.mlkit_vision_common.zzfo.zza     // Catch:{ UnsupportedEncodingException -> 0x007d }
            r0.configure(r10)     // Catch:{ UnsupportedEncodingException -> 0x007d }
            r10.f50526d = r1     // Catch:{ UnsupportedEncodingException -> 0x007d }
            java.io.StringWriter r0 = new java.io.StringWriter     // Catch:{ UnsupportedEncodingException -> 0x007d }
            r0.<init>()     // Catch:{ UnsupportedEncodingException -> 0x007d }
            ue.f r1 = new ue.f     // Catch:{ IOException -> 0x0059 }
            java.util.HashMap r4 = r10.f50523a     // Catch:{ IOException -> 0x0059 }
            java.util.HashMap r5 = r10.f50524b     // Catch:{ IOException -> 0x0059 }
            ue.a r6 = r10.f50525c     // Catch:{ IOException -> 0x0059 }
            boolean r7 = r10.f50526d     // Catch:{ IOException -> 0x0059 }
            r2 = r1
            r3 = r0
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ IOException -> 0x0059 }
            r1.mo52176a(r9)     // Catch:{ IOException -> 0x0059 }
            r1.mo52178c()     // Catch:{ IOException -> 0x0059 }
            android.util.JsonWriter r9 = r1.f50529b     // Catch:{ IOException -> 0x0059 }
            r9.flush()     // Catch:{ IOException -> 0x0059 }
        L_0x0059:
            java.lang.String r9 = r0.toString()     // Catch:{ UnsupportedEncodingException -> 0x007d }
            java.lang.String r10 = "utf-8"
            byte[] r9 = r9.getBytes(r10)     // Catch:{ UnsupportedEncodingException -> 0x007d }
            return r9
        L_0x0064:
            com.google.android.gms.internal.mlkit_vision_common.zzha r9 = r8.zza     // Catch:{ UnsupportedEncodingException -> 0x007d }
            com.google.android.gms.internal.mlkit_vision_common.zzhc r9 = r9.zzf()     // Catch:{ UnsupportedEncodingException -> 0x007d }
            com.google.android.gms.internal.mlkit_vision_common.zzal r10 = new com.google.android.gms.internal.mlkit_vision_common.zzal     // Catch:{ UnsupportedEncodingException -> 0x007d }
            r10.<init>()     // Catch:{ UnsupportedEncodingException -> 0x007d }
            te.a r0 = com.google.android.gms.internal.mlkit_vision_common.zzfo.zza     // Catch:{ UnsupportedEncodingException -> 0x007d }
            r0.configure(r10)     // Catch:{ UnsupportedEncodingException -> 0x007d }
            com.google.android.gms.internal.mlkit_vision_common.zzam r10 = r10.zza()     // Catch:{ UnsupportedEncodingException -> 0x007d }
            byte[] r9 = r10.zza(r9)     // Catch:{ UnsupportedEncodingException -> 0x007d }
            return r9
        L_0x007d:
            r9 = move-exception
            java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Failed to covert logging to UTF-8 byte array"
            r10.<init>(r0, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_common.zzju.zzb(int, boolean):byte[]");
    }

    public final zzju zzd(zzgz zzgz) {
        this.zza.zzc(zzgz);
        return this;
    }

    public final zzju zze(zzil zzil) {
        this.zzb = zzil;
        return this;
    }
}
