package bh0;

import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import lf0.C24236l;
import mf0.C24362h;
import rh0.C24814b;

/* renamed from: bh0.b */
public final class C21061b extends C24814b.C24815a<CallableMemberDescriptor, CallableMemberDescriptor> {

    /* renamed from: a */
    public final /* synthetic */ Ref$ObjectRef<CallableMemberDescriptor> f52863a;

    /* renamed from: b */
    public final /* synthetic */ C24236l<CallableMemberDescriptor, Boolean> f52864b;

    public C21061b(C24236l lVar, Ref$ObjectRef ref$ObjectRef) {
        this.f52863a = ref$ObjectRef;
        this.f52864b = lVar;
    }

    /* renamed from: a */
    public final Object mo53186a() {
        return (CallableMemberDescriptor) this.f52863a.element;
    }

    /* renamed from: b */
    public final void mo53187b(Object obj) {
        T t = (CallableMemberDescriptor) obj;
        C24362h.m61211f(t, "current");
        if (this.f52863a.element == null && this.f52864b.invoke(t).booleanValue()) {
            this.f52863a.element = t;
        }
    }

    /* renamed from: c */
    public final boolean mo53188c(Object obj) {
        C24362h.m61211f((CallableMemberDescriptor) obj, "current");
        if (this.f52863a.element == null) {
            return true;
        }
        return false;
    }
}
