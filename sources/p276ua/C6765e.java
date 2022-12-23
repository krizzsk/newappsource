package p276ua;

import com.appboy.support.ValidationUtils;
import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;
import java.io.IOException;
import p173ma.C5732e;
import p277ub.C6803r;
import p583jk.C17875h;

/* renamed from: ua.e */
public final class C6765e {

    /* renamed from: a */
    public int f20925a;

    /* renamed from: b */
    public long f20926b;

    /* renamed from: c */
    public int f20927c;

    /* renamed from: d */
    public int f20928d;

    /* renamed from: e */
    public int f20929e;

    /* renamed from: f */
    public final int[] f20930f = new int[ValidationUtils.APPBOY_STRING_MAX_LENGTH];

    /* renamed from: g */
    public final C6803r f20931g = new C6803r((int) ValidationUtils.APPBOY_STRING_MAX_LENGTH);

    /* renamed from: a */
    public final boolean mo22939a(C5732e eVar, boolean z) throws IOException {
        boolean z2;
        boolean z3;
        this.f20925a = 0;
        this.f20926b = 0;
        this.f20927c = 0;
        this.f20928d = 0;
        this.f20929e = 0;
        this.f20931g.mo23004w(27);
        try {
            z2 = eVar.mo21583j(0, 27, this.f20931g.f21038a, z);
        } catch (EOFException e) {
            if (z) {
                z2 = false;
            } else {
                throw e;
            }
        }
        if (!z2 || this.f20931g.mo22998q() != 1332176723) {
            return false;
        }
        if (this.f20931g.mo22997p() == 0) {
            this.f20925a = this.f20931g.mo22997p();
            C6803r rVar = this.f20931g;
            byte[] bArr = rVar.f21038a;
            int i = rVar.f21039b;
            int i2 = i + 1;
            int i3 = i2 + 1;
            int i4 = i3 + 1;
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            rVar.f21039b = i8 + 1;
            this.f20926b = (((long) bArr[i]) & 255) | ((((long) bArr[i2]) & 255) << 8) | ((((long) bArr[i3]) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24) | ((((long) bArr[i5]) & 255) << 32) | ((((long) bArr[i6]) & 255) << 40) | ((((long) bArr[i7]) & 255) << 48) | ((((long) bArr[i8]) & 255) << 56);
            rVar.mo22988g();
            this.f20931g.mo22988g();
            this.f20931g.mo22988g();
            int p = this.f20931g.mo22997p();
            this.f20927c = p;
            this.f20928d = p + 27;
            this.f20931g.mo23004w(p);
            try {
                z3 = eVar.mo21583j(0, this.f20927c, this.f20931g.f21038a, z);
            } catch (EOFException e2) {
                if (z) {
                    z3 = false;
                } else {
                    throw e2;
                }
            }
            if (!z3) {
                return false;
            }
            for (int i9 = 0; i9 < this.f20927c; i9++) {
                this.f20930f[i9] = this.f20931g.mo22997p();
                this.f20929e += this.f20930f[i9];
            }
            return true;
        } else if (z) {
            return false;
        } else {
            throw new ParserException("unsupported bit stream revision");
        }
    }

    /* renamed from: b */
    public final boolean mo22940b(C5732e eVar, long j) throws IOException {
        boolean z;
        int i;
        boolean z2;
        if (eVar.f18591d == eVar.mo21577f()) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44301k(z);
        this.f20931g.mo23004w(4);
        while (true) {
            i = (j > -1 ? 1 : (j == -1 ? 0 : -1));
            if (i != 0 && eVar.f18591d + 4 >= j) {
                break;
            }
            try {
                z2 = eVar.mo21583j(0, 4, this.f20931g.f21038a, true);
            } catch (EOFException unused) {
                z2 = false;
            }
            if (!z2) {
                break;
            }
            this.f20931g.mo23007z(0);
            if (this.f20931g.mo22998q() == 1332176723) {
                eVar.f18593f = 0;
                return true;
            }
            eVar.mo21582i(1);
        }
        do {
            if ((i != 0 && eVar.f18591d >= j) || eVar.mo21588o() == -1) {
                return false;
            }
            break;
        } while (eVar.mo21588o() == -1);
        return false;
    }
}
