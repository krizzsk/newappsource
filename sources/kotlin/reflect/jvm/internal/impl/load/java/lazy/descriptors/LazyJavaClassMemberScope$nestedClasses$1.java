package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import cg0.C21179k;
import cg0.C21188q;
import hg0.C23465g;
import java.util.Map;
import java.util.Set;
import kg0.C23780d;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C23912a;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import lf0.C24236l;
import mf0.C24362h;
import og0.C24599n;
import p389bl.C13637c;
import ug0.C25065b;
import ug0.C25069e;
import zf0.C25432c;

public final class LazyJavaClassMemberScope$nestedClasses$1 extends Lambda implements C24236l<C25069e, C21179k> {

    /* renamed from: $c */
    public final /* synthetic */ C23780d f60663$c;
    public final /* synthetic */ LazyJavaClassMemberScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope$nestedClasses$1(LazyJavaClassMemberScope lazyJavaClassMemberScope, C23780d dVar) {
        super(1);
        this.this$0 = lazyJavaClassMemberScope;
        this.f60663$c = dVar;
    }

    public final Object invoke(Object obj) {
        C25069e eVar = (C25069e) obj;
        C24362h.m61211f(eVar, "name");
        if (!((Set) this.this$0.f60658r.invoke()).contains(eVar)) {
            C24599n nVar = (C24599n) ((Map) this.this$0.f60659s.invoke()).get(eVar);
            if (nVar == null) {
                return null;
            }
            LockBasedStorageManager.C24145h d = this.f60663$c.f60080a.f60055a.mo59019d(new LazyJavaClassMemberScope$nestedClasses$1$enumMemberNames$1(this.this$0));
            C23780d dVar = this.f60663$c;
            return C21188q.m49704N0(dVar.f60080a.f60055a, this.this$0.f60654n, eVar, d, C13637c.m34049D(dVar, nVar), this.f60663$c.f60080a.f60064j.mo58430a(nVar));
        }
        C23465g gVar = this.f60663$c.f60080a.f60056b;
        C25065b f = DescriptorUtilsKt.m60285f(this.this$0.f60654n);
        C24362h.m61208c(f);
        C23912a c = gVar.mo58417c(new C23465g.C23466a(f.mo61571d(eVar), this.this$0.f60655o, 2));
        if (c == null) {
            return null;
        }
        C23780d dVar2 = this.f60663$c;
        LazyJavaClassDescriptor lazyJavaClassDescriptor = new LazyJavaClassDescriptor(dVar2, this.this$0.f60654n, c, (C25432c) null);
        dVar2.f60080a.f60073s.mo58581a(lazyJavaClassDescriptor);
        return lazyJavaClassDescriptor;
    }
}
