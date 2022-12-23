package jh0;

import ag0.C20986c;
import ag0.C20989e;
import java.util.Iterator;
import java.util.List;
import kh0.C23789e;
import kh0.C23792h;
import kotlin.jvm.internal.PropertyReference1Impl;
import lf0.C24225a;
import mf0.C24362h;
import mf0.C24365j;
import p845um.C19958a;
import sf0.C24866j;
import ug0.C25066c;

/* renamed from: jh0.a */
public class C23727a implements C20989e {

    /* renamed from: c */
    public static final /* synthetic */ C24866j<Object>[] f59931c = {C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(C23727a.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* renamed from: b */
    public final C23789e f59932b;

    public C23727a(C23792h hVar, C24225a<? extends List<? extends C20986c>> aVar) {
        C24362h.m61211f(hVar, "storageManager");
        this.f59932b = hVar.mo59019d(aVar);
    }

    /* renamed from: b1 */
    public final boolean mo53070b1(C25066c cVar) {
        return C20989e.C20992b.m49150b(this, cVar);
    }

    /* renamed from: c */
    public final C20986c mo53071c(C25066c cVar) {
        return C20989e.C20992b.m49149a(this, cVar);
    }

    public boolean isEmpty() {
        return ((List) C19958a.m47435j(this.f59932b, f59931c[0])).isEmpty();
    }

    public final Iterator<C20986c> iterator() {
        return ((List) C19958a.m47435j(this.f59932b, f59931c[0])).iterator();
    }
}
