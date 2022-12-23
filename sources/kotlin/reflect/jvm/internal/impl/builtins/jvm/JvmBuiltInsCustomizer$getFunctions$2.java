package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.Collection;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.C23903e;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import lf0.C24236l;
import mf0.C24362h;
import ug0.C25069e;

final class JvmBuiltInsCustomizer$getFunctions$2 extends Lambda implements C24236l<MemberScope, Collection<? extends C23903e>> {
    public final /* synthetic */ C25069e $name;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JvmBuiltInsCustomizer$getFunctions$2(C25069e eVar) {
        super(1);
        this.$name = eVar;
    }

    public final Object invoke(Object obj) {
        MemberScope memberScope = (MemberScope) obj;
        C24362h.m61211f(memberScope, "it");
        return memberScope.mo53531b(this.$name, NoLookupLocation.FROM_BUILTINS);
    }
}
