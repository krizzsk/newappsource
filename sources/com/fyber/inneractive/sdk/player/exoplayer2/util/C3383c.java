package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.util.Pair;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import com.google.android.gms.safetynet.SafetyNetStatusCodes;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.c */
public final class C3383c {

    /* renamed from: a */
    public static final byte[] f12090a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final int[] f12091b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, SafetyNetStatusCodes.SAFE_BROWSING_UNSUPPORTED_THREAT_TYPES, 11025, ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED, 7350};

    /* renamed from: c */
    public static final int[] f12092c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: a */
    public static Pair<Integer, Integer> m8512a(byte[] bArr) {
        C3392j jVar = new C3392j(bArr, bArr.length);
        int a = jVar.mo14532a(5);
        if (a == 31) {
            a = jVar.mo14532a(6) + 32;
        }
        int a2 = m8511a(jVar);
        int a3 = jVar.mo14532a(4);
        if (a == 5 || a == 29) {
            a2 = m8511a(jVar);
            int a4 = jVar.mo14532a(5);
            if (a4 == 31) {
                a4 = jVar.mo14532a(6) + 32;
            }
            if (a4 == 22) {
                a3 = jVar.mo14532a(4);
            }
        }
        int i = f12092c[a3];
        C3380a.m8505a(i != -1);
        return Pair.create(Integer.valueOf(a2), Integer.valueOf(i));
    }

    /* renamed from: a */
    public static int m8511a(C3392j jVar) {
        int a = jVar.mo14532a(4);
        if (a == 15) {
            return jVar.mo14532a(24);
        }
        C3380a.m8505a(a < 13);
        return f12091b[a];
    }
}
