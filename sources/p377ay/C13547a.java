package p377ay;

import com.moovit.app.useraccount.providers.ConnectProvider;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

/* renamed from: ay.a */
public final class C13547a implements C13549b {

    /* renamed from: c */
    public static final C13548a f33489c = new C13548a();

    /* renamed from: a */
    public ServerId f33490a;

    /* renamed from: b */
    public ConnectProvider f33491b;

    /* renamed from: ay.a$a */
    public class C13548a extends C19619s<C13547a> {
        public C13548a() {
            super(0, C13547a.class);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            ServerId serverId;
            if (!pVar.mo51919b()) {
                serverId = null;
            } else {
                serverId = new ServerId(pVar.mo51924l());
            }
            return new C13547a(serverId, (ConnectProvider) pVar.mo51962q(ConnectProvider.CODER));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            C13547a aVar = (C13547a) obj;
            ServerId serverId = aVar.f33490a;
            if (serverId == null) {
                qVar.mo51934b(false);
            } else {
                qVar.mo51934b(true);
                qVar.mo51939l(serverId.f15142b);
            }
            qVar.mo51967q(aVar.f33491b, ConnectProvider.CODER);
        }
    }

    public C13547a(ServerId serverId, ConnectProvider connectProvider) {
        this.f33490a = serverId;
        this.f33491b = connectProvider;
    }

    public C13547a() {
    }
}
