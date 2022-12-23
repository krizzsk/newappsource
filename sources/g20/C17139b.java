package g20;

import com.moovit.network.model.ServerId;
import java.io.IOException;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

/* renamed from: g20.b */
public final class C17139b {

    /* renamed from: d */
    public static final C17140a f44371d = new C17140a();

    /* renamed from: a */
    public final ServerId f44372a;

    /* renamed from: b */
    public final byte f44373b;

    /* renamed from: c */
    public final ServerId f44374c;

    /* renamed from: g20.b$a */
    public class C17140a extends C19619s<C17139b> {
        public C17140a() {
            super(0, C17139b.class);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            pVar.getClass();
            return new C17139b(new ServerId(pVar.mo51924l()), pVar.mo51920c(), new ServerId(pVar.mo51924l()));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            C17139b bVar = (C17139b) obj;
            ServerId serverId = bVar.f44372a;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            qVar.mo51935c(bVar.f44373b);
            qVar.mo51939l(bVar.f44374c.f15142b);
        }
    }

    public C17139b(ServerId serverId, byte b, ServerId serverId2) {
        this.f44372a = serverId;
        this.f44373b = b;
        this.f44374c = serverId2;
    }
}
