package v20;

import android.util.SparseArray;
import c00.C13720d;
import c00.C13722f;
import com.moovit.commons.geo.Polyline;
import o20.C18706l;
import o20.C18715u;
import oa0.C12961c;
import oa0.C12974i;
import pa0.C12998a;
import qa0.C13043a;
import v20.C20082a;
import za0.C13355b;
import za0.C13361f;

/* renamed from: v20.f */
public final class C20100f extends C20091b<C12961c, C13361f<? super C12961c>, C18715u> {
    public C20100f(C13043a aVar, C20082a aVar2) {
        super(C12961c.class, aVar, aVar2);
    }

    /* renamed from: h */
    public final C12974i mo52337h(C20082a aVar, C18706l lVar) {
        C18715u uVar = (C18715u) lVar;
        aVar.getClass();
        Object obj = uVar.f47612a;
        SparseArray c = C20082a.m47597c(uVar.f47614c);
        return new C12961c(C13720d.m34273c((Polyline) uVar.f47613b, (C13722f) null, aVar.f50946b), aVar.mo52332a(c, false), new C20082a.C20088f(obj, c));
    }

    /* renamed from: i */
    public final C12998a mo52338i(C13043a aVar) {
        return new C13355b(aVar);
    }
}
