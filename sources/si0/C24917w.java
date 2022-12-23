package si0;

import com.appboy.support.ValidationUtils;
import java.nio.ByteBuffer;
import mf0.C24362h;
import okio.ByteString;

/* renamed from: si0.w */
public final class C24917w implements C24901h {

    /* renamed from: b */
    public final C24898f f62984b = new C24898f();

    /* renamed from: c */
    public boolean f62985c;

    /* renamed from: d */
    public final C24887a0 f62986d;

    public C24917w(C24887a0 a0Var) {
        this.f62986d = a0Var;
    }

    /* renamed from: D */
    public final C24898f mo61377D() {
        return this.f62984b;
    }

    /* renamed from: E */
    public final C24895d0 mo60537E() {
        return this.f62986d.mo60537E();
    }

    /* renamed from: E1 */
    public final C24901h mo61378E1(long j) {
        if (!this.f62985c) {
            this.f62984b.mo61399X(j);
            mo61382M();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: G1 */
    public final C24901h mo61379G1(int i, int i2, String str) {
        C24362h.m61211f(str, "string");
        if (!this.f62985c) {
            this.f62984b.mo61403b0(i, i2, str);
            mo61382M();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: M */
    public final C24901h mo61382M() {
        if (!this.f62985c) {
            long r = this.f62984b.mo61418r();
            if (r > 0) {
                this.f62986d.mo58998P(this.f62984b, r);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: O0 */
    public final C24901h mo61386O0(long j) {
        if (!this.f62985c) {
            this.f62984b.mo61397W(j);
            mo61382M();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: P */
    public final void mo58998P(C24898f fVar, long j) {
        C24362h.m61211f(fVar, "source");
        if (!this.f62985c) {
            this.f62984b.mo58998P(fVar, j);
            mo61382M();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: Q */
    public final C24901h mo61387Q(String str) {
        C24362h.m61211f(str, "string");
        if (!this.f62985c) {
            this.f62984b.mo61404c0(str);
            mo61382M();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: R1 */
    public final C24901h mo61390R1(ByteString byteString) {
        C24362h.m61211f(byteString, "byteString");
        if (!this.f62985c) {
            this.f62984b.mo61393U(byteString);
            mo61382M();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: U1 */
    public final C24901h mo61394U1(int i, int i2, byte[] bArr) {
        C24362h.m61211f(bArr, "source");
        if (!this.f62985c) {
            this.f62984b.mo61392T(i, i2, bArr);
            mo61382M();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final void close() {
        if (!this.f62985c) {
            Throwable th = null;
            try {
                C24898f fVar = this.f62984b;
                long j = fVar.f62947c;
                if (j > 0) {
                    this.f62986d.mo58998P(fVar, j);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f62986d.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f62985c = true;
            if (th != null) {
                throw th;
            }
        }
    }

    /* renamed from: e */
    public final C24901h mo61458e() {
        if (!this.f62985c) {
            C24898f fVar = this.f62984b;
            long j = fVar.f62947c;
            if (j > 0) {
                this.f62986d.mo58998P(fVar, j);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: f */
    public final void mo61459f(int i) {
        if (!this.f62985c) {
            this.f62984b.mo61400Y(((i & ValidationUtils.APPBOY_STRING_MAX_LENGTH) << 24) | ((-16777216 & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8));
            mo61382M();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final void flush() {
        if (!this.f62985c) {
            C24898f fVar = this.f62984b;
            long j = fVar.f62947c;
            if (j > 0) {
                this.f62986d.mo58998P(fVar, j);
            }
            this.f62986d.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final C24898f getBuffer() {
        return this.f62984b;
    }

    public final boolean isOpen() {
        return !this.f62985c;
    }

    /* renamed from: q1 */
    public final long mo61417q1(C24893c0 c0Var) {
        C24362h.m61211f(c0Var, "source");
        long j = 0;
        while (true) {
            long m = c0Var.mo53601m(this.f62984b, (long) 8192);
            if (m == -1) {
                return j;
            }
            j += m;
            mo61382M();
        }
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("buffer(");
        k.append(this.f62986d);
        k.append(')');
        return k.toString();
    }

    public final int write(ByteBuffer byteBuffer) {
        C24362h.m61211f(byteBuffer, "source");
        if (!this.f62985c) {
            int write = this.f62984b.write(byteBuffer);
            mo61382M();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final C24901h writeByte(int i) {
        if (!this.f62985c) {
            this.f62984b.mo61395V(i);
            mo61382M();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final C24901h writeInt(int i) {
        if (!this.f62985c) {
            this.f62984b.mo61400Y(i);
            mo61382M();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final C24901h writeShort(int i) {
        if (!this.f62985c) {
            this.f62984b.mo61401Z(i);
            mo61382M();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final C24901h write(byte[] bArr) {
        C24362h.m61211f(bArr, "source");
        if (!this.f62985c) {
            C24898f fVar = this.f62984b;
            fVar.getClass();
            fVar.mo61392T(0, bArr.length, bArr);
            mo61382M();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }
}
