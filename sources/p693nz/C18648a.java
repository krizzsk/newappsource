package p693nz;

import ce0.C21100e;
import java.io.IOException;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

/* renamed from: nz.a */
public final class C18648a {

    /* renamed from: c */
    public static final C18649a f47515c = new C18649a();

    /* renamed from: a */
    public final byte[] f47516a;

    /* renamed from: b */
    public final long f47517b;

    /* renamed from: nz.a$a */
    public class C18649a extends C19619s<C18648a> {
        public C18649a() {
            super(0, C18648a.class);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new C18648a(pVar.mo51925m(), pVar.mo51944d());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            C18648a aVar = (C18648a) obj;
            qVar.mo51940m(aVar.f47517b);
            qVar.mo51951e(aVar.f47516a);
        }
    }

    public C18648a(long j, byte[] bArr) {
        C21100e.m49373x(bArr, "data");
        this.f47516a = bArr;
        this.f47517b = j;
    }
}
