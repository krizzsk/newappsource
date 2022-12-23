package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;

final class zzdt extends BroadcastReceiver {
    public final /* synthetic */ zzdw zza;

    public /* synthetic */ zzdt(zzdw zzdw, zzds zzds) {
        this.zza = zzdw;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r10, android.content.Intent r11) {
        /*
            r9 = this;
            java.lang.String r11 = "connectivity"
            java.lang.Object r11 = r10.getSystemService(r11)
            android.net.ConnectivityManager r11 = (android.net.ConnectivityManager) r11
            r0 = 2
            r1 = 9
            r2 = 6
            r3 = 4
            r4 = 29
            r5 = 1
            r6 = 0
            r7 = 5
            if (r11 != 0) goto L_0x0016
        L_0x0014:
            r0 = 0
            goto L_0x0052
        L_0x0016:
            android.net.NetworkInfo r11 = r11.getActiveNetworkInfo()     // Catch:{ SecurityException -> 0x0050 }
            if (r11 == 0) goto L_0x004e
            boolean r8 = r11.isConnected()
            if (r8 != 0) goto L_0x0023
            goto L_0x004e
        L_0x0023:
            int r8 = r11.getType()
            if (r8 == 0) goto L_0x003a
            if (r8 == r5) goto L_0x0052
            if (r8 == r3) goto L_0x003a
            if (r8 == r7) goto L_0x003a
            if (r8 == r2) goto L_0x0038
            if (r8 == r1) goto L_0x0036
            r0 = 8
            goto L_0x0052
        L_0x0036:
            r0 = 7
            goto L_0x0052
        L_0x0038:
            r0 = 5
            goto L_0x0052
        L_0x003a:
            int r11 = r11.getSubtype()
            switch(r11) {
                case 1: goto L_0x004c;
                case 2: goto L_0x004c;
                case 3: goto L_0x004a;
                case 4: goto L_0x004a;
                case 5: goto L_0x004a;
                case 6: goto L_0x004a;
                case 7: goto L_0x004a;
                case 8: goto L_0x004a;
                case 9: goto L_0x004a;
                case 10: goto L_0x004a;
                case 11: goto L_0x004a;
                case 12: goto L_0x004a;
                case 13: goto L_0x0038;
                case 14: goto L_0x004a;
                case 15: goto L_0x004a;
                case 16: goto L_0x0041;
                case 17: goto L_0x004a;
                case 18: goto L_0x0052;
                case 19: goto L_0x0041;
                case 20: goto L_0x0043;
                default: goto L_0x0041;
            }
        L_0x0041:
            r0 = 6
            goto L_0x0052
        L_0x0043:
            int r11 = com.google.android.gms.internal.ads.zzeg.zza
            if (r11 < r4) goto L_0x0014
            r0 = 9
            goto L_0x0052
        L_0x004a:
            r0 = 4
            goto L_0x0052
        L_0x004c:
            r0 = 3
            goto L_0x0052
        L_0x004e:
            r0 = 1
            goto L_0x0052
        L_0x0050:
            goto L_0x0014
        L_0x0052:
            int r11 = com.google.android.gms.internal.ads.zzeg.zza
            if (r11 < r4) goto L_0x007f
            com.google.android.gms.internal.ads.zzdr.zza()
            if (r0 != r7) goto L_0x007f
            java.lang.String r0 = "phone"
            java.lang.Object r10 = r10.getSystemService(r0)     // Catch:{ RuntimeException -> 0x0080 }
            android.telephony.TelephonyManager r10 = (android.telephony.TelephonyManager) r10     // Catch:{ RuntimeException -> 0x0080 }
            r10.getClass()
            com.google.android.gms.internal.ads.zzdv r0 = new com.google.android.gms.internal.ads.zzdv     // Catch:{ RuntimeException -> 0x0080 }
            com.google.android.gms.internal.ads.zzdw r1 = r9.zza     // Catch:{ RuntimeException -> 0x0080 }
            r2 = 0
            r0.<init>(r1, r2)     // Catch:{ RuntimeException -> 0x0080 }
            r1 = 31
            if (r11 >= r1) goto L_0x0076
            r10.listen(r0, r5)     // Catch:{ RuntimeException -> 0x0080 }
            goto L_0x007b
        L_0x0076:
            r11 = 1048576(0x100000, float:1.469368E-39)
            r10.listen(r0, r11)     // Catch:{ RuntimeException -> 0x0080 }
        L_0x007b:
            r10.listen(r0, r6)     // Catch:{ RuntimeException -> 0x0080 }
            return
        L_0x007f:
            r7 = r0
        L_0x0080:
            com.google.android.gms.internal.ads.zzdw r10 = r9.zza
            com.google.android.gms.internal.ads.zzdw.zzc(r10, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdt.onReceive(android.content.Context, android.content.Intent):void");
    }
}
