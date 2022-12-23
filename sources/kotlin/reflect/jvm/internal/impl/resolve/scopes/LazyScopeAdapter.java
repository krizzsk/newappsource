package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import eh0.C23300a;
import kh0.C23789e;
import kh0.C23792h;
import lf0.C24225a;
import mf0.C24362h;

public final class LazyScopeAdapter extends C23300a {

    /* renamed from: b */
    public final C23789e<MemberScope> f61213b;

    public LazyScopeAdapter(C23792h hVar, C24225a<? extends MemberScope> aVar) {
        C24362h.m61211f(hVar, "storageManager");
        this.f61213b = hVar.mo59019d(new LazyScopeAdapter$lazyScope$1(aVar));
    }

    /* renamed from: i */
    public final MemberScope mo58435i() {
        return (MemberScope) this.f61213b.invoke();
    }
}
