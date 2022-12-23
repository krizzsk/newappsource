package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import java.util.concurrent.Executor;

public final class zzak implements zzg {
    private final Application zza;
    private final zzam zzb;
    private final Executor zzc;

    public zzak(Application application, zzam zzam, Executor executor) {
        this.zza = application;
        this.zzb = zzam;
        this.zzc = executor;
    }

    public final Executor zza() {
        return this.zzc;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzb(java.lang.String r8, org.json.JSONObject r9) {
        /*
            r7 = this;
            int r0 = r8.hashCode()
            r1 = 94746189(0x5a5b64d, float:1.5583492E-35)
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x001b
            r1 = 113399775(0x6c257df, float:7.3103804E-35)
            if (r0 == r1) goto L_0x0011
            goto L_0x0025
        L_0x0011:
            java.lang.String r0 = "write"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0025
            r8 = 0
            goto L_0x0026
        L_0x001b:
            java.lang.String r0 = "clear"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0025
            r8 = 1
            goto L_0x0026
        L_0x0025:
            r8 = -1
        L_0x0026:
            if (r8 == 0) goto L_0x0070
            if (r8 == r3) goto L_0x002b
            return r2
        L_0x002b:
            java.lang.String r8 = "keys"
            org.json.JSONArray r8 = r9.optJSONArray(r8)
            if (r8 == 0) goto L_0x005c
            int r0 = r8.length()
            if (r0 != 0) goto L_0x003a
            goto L_0x005c
        L_0x003a:
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            int r0 = r8.length()
        L_0x0043:
            if (r2 >= r0) goto L_0x0056
            java.lang.String r1 = r8.optString(r2)
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 == 0) goto L_0x0050
            goto L_0x0053
        L_0x0050:
            r9.add(r1)
        L_0x0053:
            int r2 = r2 + 1
            goto L_0x0043
        L_0x0056:
            android.app.Application r8 = r7.zza
            com.google.android.gms.internal.consent_sdk.zzca.zzb(r8, r9)
            goto L_0x006f
        L_0x005c:
            java.lang.String r8 = r9.toString()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r9 = r8.length()
            if (r9 == 0) goto L_0x006f
            java.lang.String r9 = "Action[clear]: wrong args."
            r9.concat(r8)
        L_0x006f:
            return r3
        L_0x0070:
            com.google.android.gms.internal.consent_sdk.zzbz r8 = new com.google.android.gms.internal.consent_sdk.zzbz
            android.app.Application r0 = r7.zza
            r8.<init>(r0)
            java.util.Iterator r0 = r9.keys()
        L_0x007b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00c3
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r9.opt(r1)
            java.lang.String r4 = java.lang.String.valueOf(r2)
            java.lang.String r5 = java.lang.String.valueOf(r1)
            int r5 = r5.length()
            int r4 = r4.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r5 = r5 + 23
            int r5 = r5 + r4
            r6.<init>(r5)
            boolean r2 = r8.zzc(r1, r2)
            if (r2 == 0) goto L_0x00b3
            com.google.android.gms.internal.consent_sdk.zzam r2 = r7.zzb
            java.util.Set r2 = r2.zzc()
            r2.add(r1)
            goto L_0x007b
        L_0x00b3:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r1.length()
            if (r2 == 0) goto L_0x007b
            java.lang.String r2 = "Failed writing key: "
            r2.concat(r1)
            goto L_0x007b
        L_0x00c3:
            com.google.android.gms.internal.consent_sdk.zzam r9 = r7.zzb
            r9.zze()
            r8.zzb()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.zzak.zzb(java.lang.String, org.json.JSONObject):boolean");
    }
}
