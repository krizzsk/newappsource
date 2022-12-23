package v20;

import android.util.SparseArray;
import c00.C13720d;
import c00.C13722f;
import com.moovit.commons.geo.Polygon;
import java.util.ArrayList;
import java.util.List;
import o20.C18706l;
import o20.C18714t;
import oa0.C12968f;
import oa0.C12974i;
import p028ba.C1513g;
import pa0.C12998a;
import qa0.C13043a;
import v20.C20082a;
import za0.C13355b;
import za0.C13361f;

/* renamed from: v20.e */
public final class C20099e extends C20091b<C12968f, C13361f<? super C12968f>, C18714t> {
    public C20099e(C13043a aVar, C20082a aVar2) {
        super(C12968f.class, aVar, aVar2);
    }

    /* renamed from: h */
    public final C12974i mo52337h(C20082a aVar, C18706l lVar) {
        C18714t tVar = (C18714t) lVar;
        aVar.getClass();
        Object obj = tVar.f47612a;
        List<Polygon> list = tVar.f47626d;
        SparseArray c = C20082a.m47597c(tVar.f47614c);
        ArrayList<O> arrayList = null;
        ArrayList c2 = C13720d.m34273c((Polygon) tVar.f47613b, (C13722f) null, aVar.f50946b);
        if (list != null) {
            arrayList = C13720d.m34273c(list, (C13722f) null, new C1513g(aVar, 2));
        }
        return new C12968f(c2, arrayList, aVar.mo52332a(c, false), new C20082a.C20088f(obj, c));
    }

    /* renamed from: i */
    public final C12998a mo52338i(C13043a aVar) {
        return new C13355b(aVar);
    }
}
