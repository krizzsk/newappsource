package li0;

import hi0.C23529c0;
import hi0.C23534e;
import hi0.C23560s;
import hi0.C23571x;
import java.io.IOException;
import java.util.List;
import ki0.C23795c;
import ki0.C23803h;

/* renamed from: li0.f */
public final class C24319f implements C23560s.C23561a {

    /* renamed from: a */
    public final List<C23560s> f61614a;

    /* renamed from: b */
    public final C23803h f61615b;

    /* renamed from: c */
    public final C23795c f61616c;

    /* renamed from: d */
    public final int f61617d;

    /* renamed from: e */
    public final C23571x f61618e;

    /* renamed from: f */
    public final C23534e f61619f;

    /* renamed from: g */
    public final int f61620g;

    /* renamed from: h */
    public final int f61621h;

    /* renamed from: i */
    public final int f61622i;

    /* renamed from: j */
    public int f61623j;

    public C24319f(List<C23560s> list, C23803h hVar, C23795c cVar, int i, C23571x xVar, C23534e eVar, int i2, int i3, int i4) {
        this.f61614a = list;
        this.f61615b = hVar;
        this.f61616c = cVar;
        this.f61617d = i;
        this.f61618e = xVar;
        this.f61619f = eVar;
        this.f61620g = i2;
        this.f61621h = i3;
        this.f61622i = i4;
    }

    /* renamed from: a */
    public final C23529c0 mo60464a(C23571x xVar) throws IOException {
        return mo60465b(xVar, this.f61615b, this.f61616c);
    }

    /* renamed from: b */
    public final C23529c0 mo60465b(C23571x xVar, C23803h hVar, C23795c cVar) throws IOException {
        if (this.f61617d < this.f61614a.size()) {
            this.f61623j++;
            C23795c cVar2 = this.f61616c;
            if (cVar2 == null) {
                C23571x xVar2 = xVar;
            } else if (!cVar2.mo59026b().mo59044j(xVar.f59636a)) {
                StringBuilder k = C13555b.m33972k("network interceptor ");
                k.append(this.f61614a.get(this.f61617d - 1));
                k.append(" must retain the same host and port");
                throw new IllegalStateException(k.toString());
            }
            if (this.f61616c == null || this.f61623j <= 1) {
                List<C23560s> list = this.f61614a;
                int i = this.f61617d;
                C24319f fVar = new C24319f(list, hVar, cVar, i + 1, xVar, this.f61619f, this.f61620g, this.f61621h, this.f61622i);
                C23560s sVar = list.get(i);
                C23529c0 intercept = sVar.intercept(fVar);
                if (cVar != null && this.f61617d + 1 < this.f61614a.size() && fVar.f61623j != 1) {
                    throw new IllegalStateException("network interceptor " + sVar + " must call proceed() exactly once");
                } else if (intercept == null) {
                    throw new NullPointerException("interceptor " + sVar + " returned null");
                } else if (intercept.f59416h != null) {
                    return intercept;
                } else {
                    throw new IllegalStateException("interceptor " + sVar + " returned a response with no body");
                }
            } else {
                StringBuilder k2 = C13555b.m33972k("network interceptor ");
                k2.append(this.f61614a.get(this.f61617d - 1));
                k2.append(" must call proceed() exactly once");
                throw new IllegalStateException(k2.toString());
            }
        } else {
            throw new AssertionError();
        }
    }
}
