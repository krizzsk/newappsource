package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import com.appsflyer.share.Constants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kg0.C23780d;
import kg0.C23783g;
import kh0.C23788d;
import lg0.C24252d;
import mf0.C24362h;
import og0.C24609x;
import og0.C24610y;
import zf0.C25442g;
import zf0.C25448i0;

public final class LazyJavaTypeParameterResolver implements C23783g {

    /* renamed from: a */
    public final C23780d f60611a;

    /* renamed from: b */
    public final C25442g f60612b;

    /* renamed from: c */
    public final int f60613c;

    /* renamed from: d */
    public final LinkedHashMap f60614d;

    /* renamed from: e */
    public final C23788d<C24609x, C24252d> f60615e;

    public LazyJavaTypeParameterResolver(C23780d dVar, C25442g gVar, C24610y yVar, int i) {
        C24362h.m61211f(dVar, Constants.URL_CAMPAIGN);
        C24362h.m61211f(gVar, "containingDeclaration");
        C24362h.m61211f(yVar, "typeParameterOwner");
        this.f60611a = dVar;
        this.f60612b = gVar;
        this.f60613c = i;
        ArrayList<Object> typeParameters = yVar.getTypeParameters();
        C24362h.m61211f(typeParameters, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i2 = 0;
        for (Object put : typeParameters) {
            linkedHashMap.put(put, Integer.valueOf(i2));
            i2++;
        }
        this.f60614d = linkedHashMap;
        this.f60615e = this.f60611a.f60080a.f60055a.mo59016a(new LazyJavaTypeParameterResolver$resolve$1(this));
    }

    /* renamed from: a */
    public final C25448i0 mo59013a(C24609x xVar) {
        C24362h.m61211f(xVar, "javaTypeParameter");
        C24252d invoke = this.f60615e.invoke(xVar);
        if (invoke == null) {
            return this.f60611a.f60081b.mo59013a(xVar);
        }
        return invoke;
    }
}
