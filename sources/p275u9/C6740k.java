package p275u9;

import android.content.Context;
import java.util.concurrent.Executor;
import p011aa.C0139c;
import p011aa.C0142f;
import p011aa.C0143g;
import p028ba.C1516j;
import p028ba.C1518l;
import p041ca.C1814c0;
import p041ca.C1819g;
import p041ca.C1835u;
import p041ca.C1838v;
import p275u9.C6745o;
import p288v9.C6881h;
import p288v9.C6884j;
import p313x9.C7179a;
import p313x9.C7181c;
import ye0.C25292a;

/* renamed from: u9.k */
public final class C6740k extends C6757x {

    /* renamed from: b */
    public C25292a<Executor> f20869b = C7179a.m16790a(C6745o.C6746a.f20876a);

    /* renamed from: c */
    public C7181c f20870c;

    /* renamed from: d */
    public C25292a f20871d;

    /* renamed from: e */
    public C25292a<C1835u> f20872e;

    /* renamed from: f */
    public C25292a<C6756w> f20873f;

    public C6740k(Context context) {
        if (context != null) {
            C7181c cVar = new C7181c(context);
            this.f20870c = cVar;
            this.f20871d = C7179a.m16790a(new C6884j(cVar, new C6881h(cVar)));
            C7181c cVar2 = this.f20870c;
            C25292a<C1835u> a = C7179a.m16790a(new C1838v(new C1814c0(cVar2), new C1819g(cVar2)));
            this.f20872e = a;
            C0142f fVar = new C0142f();
            C7181c cVar3 = this.f20870c;
            C0143g gVar = new C0143g(cVar3, a, fVar);
            C25292a<Executor> aVar = this.f20869b;
            C25292a aVar2 = this.f20871d;
            this.f20873f = C7179a.m16790a(new C6758y(new C0139c(aVar, aVar2, gVar, a, a), new C1516j(cVar3, aVar2, a, gVar, aVar, a, a), new C1518l(aVar, a, gVar, a)));
            return;
        }
        throw new NullPointerException("instance cannot be null");
    }
}
