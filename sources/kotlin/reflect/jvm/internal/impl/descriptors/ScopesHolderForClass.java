package kotlin.reflect.jvm.internal.impl.descriptors;

import kh0.C23789e;
import kh0.C23792h;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import lf0.C24236l;
import mf0.C24362h;
import mf0.C24365j;
import mh0.C24378d;
import p845um.C19958a;
import sf0.C24866j;
import zf0.C25432c;

public final class ScopesHolderForClass<T extends MemberScope> {

    /* renamed from: e */
    public static final C23890a f60430e = new C23890a();

    /* renamed from: f */
    public static final /* synthetic */ C24866j<Object>[] f60431f = {C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(ScopesHolderForClass.class), "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* renamed from: a */
    public final C25432c f60432a;

    /* renamed from: b */
    public final C24236l<C24378d, T> f60433b;

    /* renamed from: c */
    public final C24378d f60434c;

    /* renamed from: d */
    public final C23789e f60435d;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass$a */
    public static final class C23890a {
        /* renamed from: a */
        public static ScopesHolderForClass m58766a(C24236l lVar, C25432c cVar, C23792h hVar, C24378d dVar) {
            C24362h.m61211f(cVar, "classDescriptor");
            C24362h.m61211f(hVar, "storageManager");
            C24362h.m61211f(dVar, "kotlinTypeRefinerForOwnerModule");
            return new ScopesHolderForClass(cVar, hVar, lVar, dVar);
        }
    }

    public ScopesHolderForClass(C25432c cVar, C23792h hVar, C24236l lVar, C24378d dVar) {
        this.f60432a = cVar;
        this.f60433b = lVar;
        this.f60434c = dVar;
        this.f60435d = hVar.mo59019d(new ScopesHolderForClass$scopeForOwnerModule$2(this));
    }

    /* renamed from: a */
    public final T mo59417a(C24378d dVar) {
        C24362h.m61211f(dVar, "kotlinTypeRefiner");
        dVar.mo60524w(DescriptorUtilsKt.m60289j(this.f60432a));
        return (MemberScope) C19958a.m47435j(this.f60435d, f60431f[0]);
    }
}
