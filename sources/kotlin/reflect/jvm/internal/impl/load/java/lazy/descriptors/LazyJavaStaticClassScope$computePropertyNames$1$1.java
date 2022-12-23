package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import lf0.C24236l;
import mf0.C24362h;
import ug0.C25069e;

final class LazyJavaStaticClassScope$computePropertyNames$1$1 extends Lambda implements C24236l<MemberScope, Collection<? extends C25069e>> {

    /* renamed from: f */
    public static final LazyJavaStaticClassScope$computePropertyNames$1$1 f60705f = new LazyJavaStaticClassScope$computePropertyNames$1$1();

    public LazyJavaStaticClassScope$computePropertyNames$1$1() {
        super(1);
    }

    public final Object invoke(Object obj) {
        MemberScope memberScope = (MemberScope) obj;
        C24362h.m61211f(memberScope, "it");
        return memberScope.mo53533d();
    }
}
