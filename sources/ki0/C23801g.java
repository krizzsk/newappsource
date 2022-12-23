package ki0;

import androidx.lifecycle.C1042u;
import hi0.C23518a;
import hi0.C23534e;
import hi0.C23539f0;
import hi0.C23550n;
import hi0.C23558r;
import ii0.C23610d;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ki0.g */
public final class C23801g {

    /* renamed from: a */
    public final C23518a f60139a;

    /* renamed from: b */
    public final C1042u f60140b;

    /* renamed from: c */
    public final C23550n f60141c;

    /* renamed from: d */
    public List<Proxy> f60142d = Collections.emptyList();

    /* renamed from: e */
    public int f60143e;

    /* renamed from: f */
    public List<InetSocketAddress> f60144f = Collections.emptyList();

    /* renamed from: g */
    public final ArrayList f60145g = new ArrayList();

    /* renamed from: ki0.g$a */
    public static final class C23802a {

        /* renamed from: a */
        public final List<C23539f0> f60146a;

        /* renamed from: b */
        public int f60147b = 0;

        public C23802a(ArrayList arrayList) {
            this.f60146a = arrayList;
        }
    }

    public C23801g(C23518a aVar, C1042u uVar, C23534e eVar, C23550n nVar) {
        List<Proxy> list;
        this.f60139a = aVar;
        this.f60140b = uVar;
        this.f60141c = nVar;
        C23558r rVar = aVar.f59369a;
        Proxy proxy = aVar.f59376h;
        if (proxy != null) {
            this.f60142d = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = aVar.f59375g.select(rVar.mo58704r());
            if (select == null || select.isEmpty()) {
                list = C23610d.m57805m(Proxy.NO_PROXY);
            } else {
                list = C23610d.m57804l(select);
            }
            this.f60142d = list;
        }
        this.f60143e = 0;
    }
}
