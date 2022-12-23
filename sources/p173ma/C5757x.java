package p173ma;

import com.google.android.exoplayer2.ParserException;
import p277ub.C6803r;

/* renamed from: ma.x */
public final class C5757x {

    /* renamed from: ma.x$a */
    public static final class C5758a {

        /* renamed from: a */
        public final String[] f18640a;

        public C5758a(String[] strArr) {
            this.f18640a = strArr;
        }
    }

    /* renamed from: ma.x$b */
    public static final class C5759b {

        /* renamed from: a */
        public final boolean f18641a;

        public C5759b(boolean z) {
            this.f18641a = z;
        }
    }

    /* renamed from: ma.x$c */
    public static final class C5760c {

        /* renamed from: a */
        public final int f18642a;

        /* renamed from: b */
        public final int f18643b;

        /* renamed from: c */
        public final int f18644c;

        /* renamed from: d */
        public final int f18645d;

        /* renamed from: e */
        public final int f18646e;

        /* renamed from: f */
        public final int f18647f;

        /* renamed from: g */
        public final byte[] f18648g;

        public C5760c(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr) {
            this.f18642a = i;
            this.f18643b = i2;
            this.f18644c = i3;
            this.f18645d = i4;
            this.f18646e = i5;
            this.f18647f = i6;
            this.f18648g = bArr;
        }
    }

    /* renamed from: a */
    public static C5758a m14168a(C6803r rVar, boolean z, boolean z2) throws ParserException {
        if (z) {
            m14169b(3, rVar, false);
        }
        rVar.mo22994m((int) rVar.mo22988g());
        long g = rVar.mo22988g();
        String[] strArr = new String[((int) g)];
        for (int i = 0; ((long) i) < g; i++) {
            strArr[i] = rVar.mo22994m((int) rVar.mo22988g());
        }
        if (!z2 || (rVar.mo22997p() & 1) != 0) {
            return new C5758a(strArr);
        }
        throw new ParserException("framing bit expected to be set");
    }

    /* renamed from: b */
    public static boolean m14169b(int i, C6803r rVar, boolean z) throws ParserException {
        String str;
        if (rVar.f21040c - rVar.f21039b < 7) {
            if (z) {
                return false;
            }
            throw new ParserException(C13715c.m34241g(29, "too short header: ", rVar.f21040c - rVar.f21039b));
        } else if (rVar.mo22997p() != i) {
            if (z) {
                return false;
            }
            String valueOf = String.valueOf(Integer.toHexString(i));
            if (valueOf.length() != 0) {
                str = "expected header type ".concat(valueOf);
            } else {
                str = new String("expected header type ");
            }
            throw new ParserException(str);
        } else if (rVar.mo22997p() == 118 && rVar.mo22997p() == 111 && rVar.mo22997p() == 114 && rVar.mo22997p() == 98 && rVar.mo22997p() == 105 && rVar.mo22997p() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw new ParserException("expected characters 'vorbis'");
        }
    }
}
