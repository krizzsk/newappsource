package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import lf0.C24225a;
import rh0.C24819c;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.a */
public final class C23906a implements C24225a<Collection<C23900c>> {

    /* renamed from: b */
    public final /* synthetic */ TypeSubstitutor f60464b;

    /* renamed from: c */
    public final /* synthetic */ C23907b f60465c;

    public C23906a(C23907b bVar, TypeSubstitutor typeSubstitutor) {
        this.f60465c = bVar;
        this.f60464b = typeSubstitutor;
    }

    public final Object invoke() {
        C24819c cVar = new C24819c();
        for (C23900c c : this.f60465c.mo53440d()) {
            cVar.add(c.mo53408c(this.f60464b));
        }
        return cVar;
    }
}
