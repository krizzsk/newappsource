package e70;

import ce0.C21100e;
import com.moovit.sdk.utils.ServerId;
import java.io.IOException;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

/* renamed from: e70.f */
public final class C4594f {

    /* renamed from: e */
    public static final C4595a f15785e = new C4595a();

    /* renamed from: a */
    public final String f15786a;

    /* renamed from: b */
    public final int f15787b;

    /* renamed from: c */
    public final ServerId f15788c;

    /* renamed from: d */
    public final String f15789d;

    /* renamed from: e70.f$a */
    public class C4595a extends C19619s<C4594f> {
        public C4595a() {
            super(1, C4594f.class);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i >= 0 && i <= 1;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            String str;
            int i2;
            String p = pVar.mo51947p();
            ServerId serverId = new ServerId(pVar.mo51924l());
            if (i >= 1) {
                str = pVar.mo51947p();
            } else {
                str = "5.11.1.326";
            }
            if (i >= 1) {
                i2 = pVar.mo51924l();
            } else {
                i2 = Math.abs(p.hashCode() % 100);
            }
            return new C4594f(p, i2, serverId, str);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            C4594f fVar = (C4594f) obj;
            qVar.mo51954p(fVar.f15786a);
            qVar.mo51939l(fVar.f15788c.f23119b);
            qVar.mo51954p(fVar.f15789d);
            qVar.mo51939l(fVar.f15787b);
        }
    }

    public C4594f(String str, int i, ServerId serverId, String str2) {
        C21100e.m49373x(str, "userId");
        this.f15786a = str;
        this.f15787b = i;
        this.f15788c = serverId;
        C21100e.m49373x(str2, "installVersion");
        this.f15789d = str2;
    }
}
