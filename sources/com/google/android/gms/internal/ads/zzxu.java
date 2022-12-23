package com.google.android.gms.internal.ads;

import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import com.google.android.gms.safetynet.SafetyNetStatusCodes;

public final class zzxu {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, SafetyNetStatusCodes.SAFE_BROWSING_UNSUPPORTED_THREAT_TYPES, 11025, ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED, 7350};
    private static final int[] zzc = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static zzxt zza(byte[] bArr) throws zzbp {
        return zzb(new zzdx(bArr, bArr.length), false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a6, code lost:
        if (r11 != 3) goto L_0x00c6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzxt zzb(com.google.android.gms.internal.ads.zzdx r11, boolean r12) throws com.google.android.gms.internal.ads.zzbp {
        /*
            int r0 = zzc(r11)
            int r1 = zzd(r11)
            r2 = 4
            int r3 = r11.zzc(r2)
            java.lang.String r4 = "mp4a.40."
            java.lang.String r4 = p379.C16759e.m42349e(r4, r0)
            r5 = 22
            r6 = 5
            if (r0 == r6) goto L_0x001c
            r6 = 29
            if (r0 != r6) goto L_0x002a
        L_0x001c:
            int r1 = zzd(r11)
            int r0 = zzc(r11)
            if (r0 != r5) goto L_0x002a
            int r3 = r11.zzc(r2)
        L_0x002a:
            if (r12 == 0) goto L_0x00c6
            r12 = 17
            r6 = 6
            r7 = 1
            r8 = 2
            r9 = 3
            if (r0 == r7) goto L_0x005a
            if (r0 == r8) goto L_0x005a
            if (r0 == r9) goto L_0x005a
            if (r0 == r2) goto L_0x005a
            if (r0 == r6) goto L_0x005a
            r2 = 7
            if (r0 == r2) goto L_0x005a
            if (r0 == r12) goto L_0x005a
            switch(r0) {
                case 19: goto L_0x005a;
                case 20: goto L_0x005a;
                case 21: goto L_0x005a;
                case 22: goto L_0x005a;
                case 23: goto L_0x005a;
                default: goto L_0x0044;
            }
        L_0x0044:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Unsupported audio object type: "
            r11.append(r12)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            com.google.android.gms.internal.ads.zzbp r11 = com.google.android.gms.internal.ads.zzbp.zzc(r11)
            throw r11
        L_0x005a:
            r11.zzl()
            boolean r2 = r11.zzl()
            if (r2 == 0) goto L_0x0068
            r2 = 14
            r11.zzj(r2)
        L_0x0068:
            boolean r2 = r11.zzl()
            if (r3 == 0) goto L_0x00c0
            r10 = 20
            if (r0 == r6) goto L_0x007b
            if (r0 != r10) goto L_0x0079
            r0 = 20
            r6 = 20
            goto L_0x007c
        L_0x0079:
            r6 = r0
            goto L_0x007f
        L_0x007b:
            r6 = r0
        L_0x007c:
            r11.zzj(r9)
        L_0x007f:
            if (r2 == 0) goto L_0x009c
            if (r0 != r5) goto L_0x0089
            r0 = 16
            r11.zzj(r0)
            goto L_0x008a
        L_0x0089:
            r5 = r0
        L_0x008a:
            if (r5 == r12) goto L_0x0096
            r12 = 19
            if (r5 == r12) goto L_0x0096
            if (r5 == r10) goto L_0x0096
            r12 = 23
            if (r5 != r12) goto L_0x0099
        L_0x0096:
            r11.zzj(r9)
        L_0x0099:
            r11.zzj(r7)
        L_0x009c:
            switch(r6) {
                case 17: goto L_0x00a0;
                case 18: goto L_0x009f;
                case 19: goto L_0x00a0;
                case 20: goto L_0x00a0;
                case 21: goto L_0x00a0;
                case 22: goto L_0x00a0;
                case 23: goto L_0x00a0;
                default: goto L_0x009f;
            }
        L_0x009f:
            goto L_0x00c6
        L_0x00a0:
            int r11 = r11.zzc(r8)
            if (r11 == r8) goto L_0x00a9
            if (r11 == r9) goto L_0x00aa
            goto L_0x00c6
        L_0x00a9:
            r9 = r11
        L_0x00aa:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Unsupported epConfig: "
            r11.append(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            com.google.android.gms.internal.ads.zzbp r11 = com.google.android.gms.internal.ads.zzbp.zzc(r11)
            throw r11
        L_0x00c0:
            java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException
            r11.<init>()
            throw r11
        L_0x00c6:
            int[] r11 = zzc
            r11 = r11[r3]
            r12 = -1
            r0 = 0
            if (r11 == r12) goto L_0x00d4
            com.google.android.gms.internal.ads.zzxt r12 = new com.google.android.gms.internal.ads.zzxt
            r12.<init>(r1, r11, r4, r0)
            return r12
        L_0x00d4:
            com.google.android.gms.internal.ads.zzbp r11 = com.google.android.gms.internal.ads.zzbp.zza(r0, r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxu.zzb(com.google.android.gms.internal.ads.zzdx, boolean):com.google.android.gms.internal.ads.zzxt");
    }

    private static int zzc(zzdx zzdx) {
        int zzc2 = zzdx.zzc(5);
        if (zzc2 == 31) {
            return zzdx.zzc(6) + 32;
        }
        return zzc2;
    }

    private static int zzd(zzdx zzdx) throws zzbp {
        int zzc2 = zzdx.zzc(4);
        if (zzc2 == 15) {
            return zzdx.zzc(24);
        }
        if (zzc2 < 13) {
            return zzb[zzc2];
        }
        throw zzbp.zza((String) null, (Throwable) null);
    }
}
