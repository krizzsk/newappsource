package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import lf0.C24236l;
import mf0.C24362h;
import ug0.C25069e;
import zf0.C25491z;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope$computeNonDeclaredProperties$propertiesFromSupertypes$1 */
final class C23938xd2f8c9a5 extends Lambda implements C24236l<MemberScope, Collection<? extends C25491z>> {
    public final /* synthetic */ C25069e $name;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23938xd2f8c9a5(C25069e eVar) {
        super(1);
        this.$name = eVar;
    }

    public final Object invoke(Object obj) {
        MemberScope memberScope = (MemberScope) obj;
        C24362h.m61211f(memberScope, "it");
        return memberScope.mo53532c(this.$name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
    }
}
