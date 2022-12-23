package y90;

import ce0.C21100e;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

/* renamed from: y90.f */
public final class C13272f {

    /* renamed from: f */
    public static final C13273a f32924f = new C13273a();

    /* renamed from: a */
    public final String f32925a;

    /* renamed from: b */
    public final int f32926b;

    /* renamed from: c */
    public final ServerId f32927c;

    /* renamed from: d */
    public final String f32928d;

    /* renamed from: e */
    public final ServerId f32929e;

    /* renamed from: y90.f$a */
    public class C13273a extends C19619s<C13272f> {
        public C13273a() {
            super(2, C13272f.class);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i >= 0 && i <= 2;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            String str;
            int i2;
            ServerId serverId;
            String p = pVar.mo51947p();
            ServerId serverId2 = new ServerId(pVar.mo51924l());
            if (i >= 1) {
                str = pVar.mo51947p();
            } else {
                str = "5.11.1.326";
            }
            String str2 = str;
            if (i >= 1) {
                i2 = pVar.mo51924l();
            } else {
                i2 = Math.abs(p.hashCode() % 100);
            }
            int i3 = i2;
            if (i >= 2) {
                serverId = new ServerId(pVar.mo51924l());
            } else {
                serverId = serverId2;
            }
            return new C13272f(p, i3, serverId2, str2, serverId);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            C13272f fVar = (C13272f) obj;
            qVar.mo51954p(fVar.f32925a);
            qVar.mo51939l(fVar.f32927c.f15142b);
            qVar.mo51954p(fVar.f32928d);
            qVar.mo51939l(fVar.f32926b);
            qVar.mo51939l(fVar.f32929e.f15142b);
        }
    }

    public C13272f(String str, int i, ServerId serverId, String str2, ServerId serverId2) {
        C21100e.m49373x(str, "userId");
        this.f32925a = str;
        this.f32926b = i;
        C21100e.m49373x(serverId, "metroId");
        this.f32927c = serverId;
        C21100e.m49373x(str2, "installVersion");
        this.f32928d = str2;
        C21100e.m49373x(serverId2, "installMetroId");
        this.f32929e = serverId2;
    }
}
