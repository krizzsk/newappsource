package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.C3230l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.k */
public final class C3177k {

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.k$a */
    public static final class C3178a {
        public C3178a(String str, String[] strArr, int i) {
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.k$b */
    public static final class C3179b {

        /* renamed from: a */
        public final boolean f11277a;

        public C3179b(boolean z, int i, int i2, int i3) {
            this.f11277a = z;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.k$c */
    public static final class C3180c {

        /* renamed from: a */
        public final int f11278a;

        /* renamed from: b */
        public final long f11279b;

        /* renamed from: c */
        public final int f11280c;

        /* renamed from: d */
        public final int f11281d;

        /* renamed from: e */
        public final int f11282e;

        /* renamed from: f */
        public final byte[] f11283f;

        public C3180c(long j, int i, long j2, int i2, int i3, int i4, int i5, int i6, boolean z, byte[] bArr) {
            this.f11278a = i;
            this.f11279b = j2;
            this.f11280c = i3;
            this.f11281d = i5;
            this.f11282e = i6;
            this.f11283f = bArr;
        }
    }

    /* renamed from: a */
    public static int m8003a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    /* renamed from: a */
    public static boolean m8004a(int i, C3393k kVar, boolean z) throws C3230l {
        if (kVar.mo14537a() < 7) {
            if (z) {
                return false;
            }
            StringBuilder k = C13555b.m33972k("too short header: ");
            k.append(kVar.mo14537a());
            throw new C3230l(k.toString());
        } else if (kVar.mo14557l() != i) {
            if (z) {
                return false;
            }
            StringBuilder k2 = C13555b.m33972k("expected header type ");
            k2.append(Integer.toHexString(i));
            throw new C3230l(k2.toString());
        } else if (kVar.mo14557l() == 118 && kVar.mo14557l() == 111 && kVar.mo14557l() == 114 && kVar.mo14557l() == 98 && kVar.mo14557l() == 105 && kVar.mo14557l() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw new C3230l("expected characters 'vorbis'");
        }
    }
}
