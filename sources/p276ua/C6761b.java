package p276ua;

import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import p173ma.C5732e;
import p173ma.C5740l;
import p173ma.C5742m;
import p173ma.C5743n;
import p173ma.C5744o;
import p173ma.C5750t;
import p276ua.C6768h;
import p277ub.C6774a0;
import p277ub.C6803r;
import p583jk.C17875h;

/* renamed from: ua.b */
public final class C6761b extends C6768h {

    /* renamed from: n */
    public C5744o f20911n;

    /* renamed from: o */
    public C6762a f20912o;

    /* renamed from: ua.b$a */
    public static final class C6762a implements C6766f {

        /* renamed from: a */
        public C5744o f20913a;

        /* renamed from: b */
        public C5744o.C5745a f20914b;

        /* renamed from: c */
        public long f20915c = -1;

        /* renamed from: d */
        public long f20916d = -1;

        public C6762a(C5744o oVar, C5744o.C5745a aVar) {
            this.f20913a = oVar;
            this.f20914b = aVar;
        }

        /* renamed from: a */
        public final C5750t mo22931a() {
            boolean z;
            if (this.f20915c != -1) {
                z = true;
            } else {
                z = false;
            }
            C17875h.m44304o(z);
            return new C5743n(this.f20913a, this.f20915c);
        }

        /* renamed from: b */
        public final long mo22932b(C5732e eVar) {
            long j = this.f20916d;
            if (j < 0) {
                return -1;
            }
            long j2 = -(j + 2);
            this.f20916d = -1;
            return j2;
        }

        /* renamed from: c */
        public final void mo22933c(long j) {
            long[] jArr = this.f20914b.f18614a;
            this.f20916d = jArr[C6774a0.m15945e(jArr, j, true)];
        }
    }

    /* renamed from: b */
    public final long mo22934b(C6803r rVar) {
        boolean z;
        byte[] bArr = rVar.f21038a;
        if (bArr[0] == -1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return -1;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            rVar.mo22981A(4);
            rVar.mo23003v();
        }
        int b = C5740l.m14136b(i, rVar);
        rVar.mo23007z(0);
        return (long) b;
    }

    /* renamed from: c */
    public final boolean mo22935c(C6803r rVar, long j, C6768h.C6769a aVar) {
        boolean z;
        C6803r rVar2 = rVar;
        C6768h.C6769a aVar2 = aVar;
        byte[] bArr = rVar2.f21038a;
        C5744o oVar = this.f20911n;
        if (oVar == null) {
            C5744o oVar2 = new C5744o(bArr, 17);
            this.f20911n = oVar2;
            aVar2.f20947a = oVar2.mo21598d(Arrays.copyOfRange(bArr, 9, rVar2.f21040c), (Metadata) null);
            return true;
        }
        byte b = bArr[0];
        if ((b & Byte.MAX_VALUE) == 3) {
            C5744o.C5745a a = C5742m.m14137a(rVar);
            C5744o oVar3 = new C5744o(oVar.f18602a, oVar.f18603b, oVar.f18604c, oVar.f18605d, oVar.f18606e, oVar.f18608g, oVar.f18609h, oVar.f18611j, a, oVar.f18613l);
            this.f20911n = oVar3;
            this.f20912o = new C6762a(oVar3, a);
            return true;
        }
        if (b == -1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return true;
        }
        C6762a aVar3 = this.f20912o;
        if (aVar3 != null) {
            aVar3.f20915c = j;
            aVar2.f20948b = aVar3;
        }
        aVar2.f20947a.getClass();
        return false;
    }

    /* renamed from: d */
    public final void mo22936d(boolean z) {
        super.mo22936d(z);
        if (z) {
            this.f20911n = null;
            this.f20912o = null;
        }
    }
}
