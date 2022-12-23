package com.google.android.gms.internal.contextmanager;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.TimeZone;
import p988j$.util.DesugarTimeZone;

public final class zzca {
    private static final TimeZone zza = DesugarTimeZone.getTimeZone("UTC");
    private final zzhz zzb;

    public zzca(zzhz zzhz) {
        this.zzb = (zzhz) Preconditions.checkNotNull(zzhz);
    }

    public static zzca zza(long j, long j2) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        TimeZone timeZone = zza;
        Preconditions.checkArgument(z);
        if (j2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2);
        if (j > j2) {
            z3 = false;
        }
        Preconditions.checkArgument(z3);
        return new zzca(zze(zzhy.ABSOLUTE_INTERVAL, timeZone, j, j2));
    }

    public static zzca zzb(int i, TimeZone timeZone, long j, long j2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = true;
        Preconditions.checkArgument(true);
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        if (j <= 86400000) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2);
        if (j2 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Preconditions.checkArgument(z3);
        if (j2 <= 86400000) {
            z4 = true;
        } else {
            z4 = false;
        }
        Preconditions.checkArgument(z4);
        if (j > j2) {
            z5 = false;
        }
        Preconditions.checkArgument(z5);
        zzhy zzb2 = zzhy.zzb(i);
        if (zzb2 == null) {
            zzb2 = zzhy.UNKNOWN_TIME_FENCE_TRIGGER_TYPE;
        }
        return new zzca(zze(zzb2, timeZone, j, j2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.contextmanager.zzca zzc(int r7, java.util.TimeZone r8, long r9, long r11) {
        /*
            r0 = 7
            r1 = 0
            r2 = 1
            if (r7 == r2) goto L_0x001a
            r3 = 2
            if (r7 == r3) goto L_0x001a
            r3 = 3
            if (r7 == r3) goto L_0x001a
            r3 = 4
            if (r7 == r3) goto L_0x001a
            r3 = 5
            if (r7 == r3) goto L_0x001a
            r3 = 6
            if (r7 == r3) goto L_0x001a
            if (r7 != r0) goto L_0x0018
            r7 = 7
            goto L_0x001a
        L_0x0018:
            r0 = 0
            goto L_0x001b
        L_0x001a:
            r0 = 1
        L_0x001b:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0)
            r3 = 0
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0026
            r0 = 1
            goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0)
            r5 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0033
            r0 = 1
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0)
            int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x003d
            r0 = 1
            goto L_0x003e
        L_0x003d:
            r0 = 0
        L_0x003e:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0)
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0047
            r0 = 1
            goto L_0x0048
        L_0x0047:
            r0 = 0
        L_0x0048:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0)
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x0050
            r1 = 1
        L_0x0050:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r1)
            switch(r7) {
                case 1: goto L_0x006b;
                case 2: goto L_0x0068;
                case 3: goto L_0x0065;
                case 4: goto L_0x0062;
                case 5: goto L_0x005f;
                case 6: goto L_0x005c;
                case 7: goto L_0x0059;
                default: goto L_0x0056;
            }
        L_0x0056:
            com.google.android.gms.internal.contextmanager.zzhy r7 = com.google.android.gms.internal.contextmanager.zzhy.UNKNOWN_TIME_FENCE_TRIGGER_TYPE
            goto L_0x006d
        L_0x0059:
            com.google.android.gms.internal.contextmanager.zzhy r7 = com.google.android.gms.internal.contextmanager.zzhy.SATURDAY_INTERVAL
            goto L_0x006d
        L_0x005c:
            com.google.android.gms.internal.contextmanager.zzhy r7 = com.google.android.gms.internal.contextmanager.zzhy.FRIDAY_INTERVAL
            goto L_0x006d
        L_0x005f:
            com.google.android.gms.internal.contextmanager.zzhy r7 = com.google.android.gms.internal.contextmanager.zzhy.THURSDAY_INTERVAL
            goto L_0x006d
        L_0x0062:
            com.google.android.gms.internal.contextmanager.zzhy r7 = com.google.android.gms.internal.contextmanager.zzhy.WEDNESDAY_INTERVAL
            goto L_0x006d
        L_0x0065:
            com.google.android.gms.internal.contextmanager.zzhy r7 = com.google.android.gms.internal.contextmanager.zzhy.TUESDAY_INTERVAL
            goto L_0x006d
        L_0x0068:
            com.google.android.gms.internal.contextmanager.zzhy r7 = com.google.android.gms.internal.contextmanager.zzhy.MONDAY_INTERVAL
            goto L_0x006d
        L_0x006b:
            com.google.android.gms.internal.contextmanager.zzhy r7 = com.google.android.gms.internal.contextmanager.zzhy.SUNDAY_INTERVAL
        L_0x006d:
            r0 = r7
            com.google.android.gms.internal.contextmanager.zzca r7 = new com.google.android.gms.internal.contextmanager.zzca
            r1 = r8
            r2 = r9
            r4 = r11
            com.google.android.gms.internal.contextmanager.zzhz r8 = zze(r0, r1, r2, r4)
            r7.<init>(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.contextmanager.zzca.zzc(int, java.util.TimeZone, long, long):com.google.android.gms.internal.contextmanager.zzca");
    }

    private static zzhz zze(zzhy zzhy, TimeZone timeZone, long j, long j2) {
        zzhv zza2 = zzhz.zza();
        zza2.zzd(zzhy);
        if (timeZone == null || TextUtils.isEmpty(timeZone.getID())) {
            zza2.zze(true);
        } else {
            zza2.zzc(timeZone.getID());
            zza2.zze(false);
        }
        zza2.zza(j);
        zza2.zzb(j2);
        return (zzhz) zza2.zzs();
    }

    public final zzhz zzd() {
        return this.zzb;
    }
}
