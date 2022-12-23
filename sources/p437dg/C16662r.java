package p437dg;

import com.google.gson.Gson;
import p359ag.C13458o;
import p359ag.C13459p;
import p509gg.C17189a;

/* renamed from: dg.r */
public final class C16662r implements C13459p {

    /* renamed from: b */
    public final /* synthetic */ Class f43353b;

    /* renamed from: c */
    public final /* synthetic */ Class f43354c;

    /* renamed from: d */
    public final /* synthetic */ C13458o f43355d;

    public C16662r(Class cls, Class cls2, C13458o oVar) {
        this.f43353b = cls;
        this.f43354c = cls2;
        this.f43355d = oVar;
    }

    /* renamed from: a */
    public final <T> C13458o<T> mo40360a(Gson gson, C17189a<T> aVar) {
        Class<? super T> cls = aVar.f44431a;
        if (cls == this.f43353b || cls == this.f43354c) {
            return this.f43355d;
        }
        return null;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Factory[type=");
        C13715c.m34249o(this.f43354c, k, "+");
        C13715c.m34249o(this.f43353b, k, ",adapter=");
        k.append(this.f43355d);
        k.append("]");
        return k.toString();
    }
}
