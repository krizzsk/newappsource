package p437dg;

import com.google.gson.Gson;
import p359ag.C13458o;
import p359ag.C13459p;
import p509gg.C17189a;

/* renamed from: dg.q */
public final class C16661q implements C13459p {

    /* renamed from: b */
    public final /* synthetic */ Class f43351b;

    /* renamed from: c */
    public final /* synthetic */ C13458o f43352c;

    public C16661q(Class cls, C13458o oVar) {
        this.f43351b = cls;
        this.f43352c = oVar;
    }

    /* renamed from: a */
    public final <T> C13458o<T> mo40360a(Gson gson, C17189a<T> aVar) {
        if (aVar.f44431a == this.f43351b) {
            return this.f43352c;
        }
        return null;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Factory[type=");
        C13715c.m34249o(this.f43351b, k, ",adapter=");
        k.append(this.f43352c);
        k.append("]");
        return k.toString();
    }
}
