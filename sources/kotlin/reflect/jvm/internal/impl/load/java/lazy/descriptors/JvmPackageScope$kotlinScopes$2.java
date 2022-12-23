package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import jh0.C23732f;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import lf0.C24225a;
import p584jl.C17885a;
import p845um.C19958a;
import qg0.C24757k;

public final class JvmPackageScope$kotlinScopes$2 extends Lambda implements C24225a<MemberScope[]> {
    public final /* synthetic */ JvmPackageScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JvmPackageScope$kotlinScopes$2(JvmPackageScope jvmPackageScope) {
        super(0);
        this.this$0 = jvmPackageScope;
    }

    public final Object invoke() {
        Collection<C24757k> values = ((Map) C19958a.m47435j(this.this$0.f60624c.f60667j, LazyJavaPackageFragment.f60664n[0])).values();
        JvmPackageScope jvmPackageScope = this.this$0;
        ArrayList arrayList = new ArrayList();
        for (C24757k a : values) {
            C23732f a2 = jvmPackageScope.f60623b.f60080a.f60058d.mo59583a(jvmPackageScope.f60624c, a);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        Object[] array = C17885a.m44440h0(arrayList).toArray(new MemberScope[0]);
        if (array != null) {
            return (MemberScope[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
}
