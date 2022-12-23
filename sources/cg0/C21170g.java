package cg0;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;
import lf0.C24225a;

/* renamed from: cg0.g */
public final class C21170g implements C24225a<MemberScope> {

    /* renamed from: b */
    public final /* synthetic */ C21172h f53066b;

    public C21170g(C21172h hVar) {
        this.f53066b = hVar;
    }

    public final Object invoke() {
        StringBuilder k = C13555b.m33972k("Scope for type parameter ");
        k.append(this.f53066b.f53069b.mo61604f());
        return TypeIntersectionScope.C24120a.m60322a(k.toString(), this.f53066b.f53070c.getUpperBounds());
    }
}
