package com.google.android.gms.internal.mlkit_vision_face;

import com.google.android.gms.common.internal.Preconditions;

public final class zzkp {
    private final zziq zza;
    private zzjx zzb = new zzjx();

    private zzkp(zziq zziq) {
        this.zza = zziq;
    }

    public static zzkp zzc(zziq zziq) {
        return new zzkp(zziq);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|9|10|11|12|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0059 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] zza(int r9, boolean r10) {
        /*
            r8 = this;
            com.google.android.gms.internal.mlkit_vision_face.zzjx r0 = r8.zzb
            r1 = 1
            if (r9 != 0) goto L_0x0007
            r2 = 1
            goto L_0x0008
        L_0x0007:
            r2 = 0
        L_0x0008:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.zzi(r2)
            com.google.android.gms.internal.mlkit_vision_face.zzjx r0 = r8.zzb
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r0.zzg(r10)
            com.google.android.gms.internal.mlkit_vision_face.zziq r10 = r8.zza
            com.google.android.gms.internal.mlkit_vision_face.zzjx r0 = r8.zzb
            com.google.android.gms.internal.mlkit_vision_face.zzjy r0 = r0.zzk()
            r10.zza(r0)
            com.google.android.gms.internal.mlkit_vision_face.zzlb.zza()     // Catch:{ UnsupportedEncodingException -> 0x007d }
            if (r9 != 0) goto L_0x0064
            com.google.android.gms.internal.mlkit_vision_face.zziq r9 = r8.zza     // Catch:{ UnsupportedEncodingException -> 0x007d }
            com.google.android.gms.internal.mlkit_vision_face.zzir r9 = r9.zzf()     // Catch:{ UnsupportedEncodingException -> 0x007d }
            ue.e r10 = new ue.e     // Catch:{ UnsupportedEncodingException -> 0x007d }
            r10.<init>()     // Catch:{ UnsupportedEncodingException -> 0x007d }
            te.a r0 = com.google.android.gms.internal.mlkit_vision_face.zzhb.zza     // Catch:{ UnsupportedEncodingException -> 0x007d }
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
            com.google.android.gms.internal.mlkit_vision_face.zziq r9 = r8.zza     // Catch:{ UnsupportedEncodingException -> 0x007d }
            com.google.android.gms.internal.mlkit_vision_face.zzir r9 = r9.zzf()     // Catch:{ UnsupportedEncodingException -> 0x007d }
            com.google.android.gms.internal.mlkit_vision_face.zzda r10 = new com.google.android.gms.internal.mlkit_vision_face.zzda     // Catch:{ UnsupportedEncodingException -> 0x007d }
            r10.<init>()     // Catch:{ UnsupportedEncodingException -> 0x007d }
            te.a r0 = com.google.android.gms.internal.mlkit_vision_face.zzhb.zza     // Catch:{ UnsupportedEncodingException -> 0x007d }
            r0.configure(r10)     // Catch:{ UnsupportedEncodingException -> 0x007d }
            com.google.android.gms.internal.mlkit_vision_face.zzdb r10 = r10.zza()     // Catch:{ UnsupportedEncodingException -> 0x007d }
            byte[] r9 = r10.zza(r9)     // Catch:{ UnsupportedEncodingException -> 0x007d }
            return r9
        L_0x007d:
            r9 = move-exception
            java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Failed to covert logging to UTF-8 byte array"
            r10.<init>(r0, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_face.zzkp.zza(int, boolean):byte[]");
    }

    public final String zzb() {
        zzjy zza2 = this.zza.zzf().zza();
        if (zza2 == null || zzab.zza(zza2.zzd())) {
            return "NA";
        }
        return (String) Preconditions.checkNotNull(zza2.zzd());
    }

    public final zzkp zzd(zzjx zzjx) {
        this.zzb = zzjx;
        return this;
    }

    public final zzkp zze(zzio zzio) {
        this.zza.zzb(zzio);
        return this;
    }
}
