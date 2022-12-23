package com.fyber.inneractive.sdk.player.exoplayer2.source.chunk;

import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3321e;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3370v;
import java.util.Objects;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.b */
public final class C3278b {
    /* renamed from: a */
    public static boolean m8283a(C3321e eVar, int i, Exception exc, long j) {
        if (!m8284a(exc)) {
            return false;
        }
        boolean a = eVar.mo14440a(i, j);
        int i2 = ((C3370v) exc).f12063a;
        if (a) {
            Objects.toString(eVar.mo14439a(i));
        } else {
            Objects.toString(eVar.mo14439a(i));
        }
        return a;
    }

    /* renamed from: a */
    public static boolean m8284a(Exception exc) {
        if (!(exc instanceof C3370v)) {
            return false;
        }
        int i = ((C3370v) exc).f12063a;
        if (i == 404 || i == 410) {
            return true;
        }
        return false;
    }
}
