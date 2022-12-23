package p437dg;

import com.google.gson.Gson;
import p359ag.C13458o;
import p359ag.C13459p;
import p437dg.C16626o;
import p509gg.C17189a;

/* renamed from: dg.s */
public final class C16663s implements C13459p {

    /* renamed from: b */
    public final /* synthetic */ Class f43356b;

    /* renamed from: c */
    public final /* synthetic */ Class f43357c;

    /* renamed from: d */
    public final /* synthetic */ C13458o f43358d;

    public C16663s(Class cls, Class cls2, C16626o.C16652s sVar) {
        this.f43356b = cls;
        this.f43357c = cls2;
        this.f43358d = sVar;
    }

    /* renamed from: a */
    public final <T> C13458o<T> mo40360a(Gson gson, C17189a<T> aVar) {
        Class<? super T> cls = aVar.f44431a;
        if (cls == this.f43356b || cls == this.f43357c) {
            return this.f43358d;
        }
        return null;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Factory[type=");
        C13715c.m34249o(this.f43356b, k, "+");
        C13715c.m34249o(this.f43357c, k, ",adapter=");
        k.append(this.f43358d);
        k.append("]");
        return k.toString();
    }
}
