package com.fyber.inneractive.sdk.player.exoplayer2;

import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;
import com.google.android.gms.location.places.Place;
import java.util.UUID;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.b */
public final class C3052b {

    /* renamed from: a */
    public static final int f10507a;

    /* renamed from: b */
    public static final UUID f10508b = new UUID(0, 0);

    static {
        int i;
        if (C3406u.f12148a < 23) {
            i = Place.TYPE_ROUTE;
        } else {
            i = 6396;
        }
        f10507a = i;
        new UUID(1186680826959645954L, -5988876978535335093L);
        new UUID(-1301668207276963122L, -6645017420763422227L);
        new UUID(-7348484286925749626L, -6083546864340672619L);
    }

    /* renamed from: a */
    public static long m7657a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return 1000 * j;
    }

    /* renamed from: b */
    public static long m7658b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j / 1000;
    }
}
