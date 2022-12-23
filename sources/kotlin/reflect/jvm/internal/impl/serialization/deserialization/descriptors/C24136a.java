package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import bf0.C21050d;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import lf0.C24236l;
import mf0.C24362h;
import xg0.C25263f;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.a */
public final class C24136a extends C25263f {

    /* renamed from: b */
    public final /* synthetic */ List<Object> f61308b;

    public C24136a(ArrayList arrayList) {
        this.f61308b = arrayList;
    }

    /* renamed from: l */
    public final void mo320l(CallableMemberDescriptor callableMemberDescriptor) {
        C24362h.m61211f(callableMemberDescriptor, "fakeOverride");
        OverridingUtil.m60251r(callableMemberDescriptor, (C24236l<CallableMemberDescriptor, C21050d>) null);
        this.f61308b.add(callableMemberDescriptor);
    }

    /* renamed from: p */
    public final void mo53536p(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
        C24362h.m61211f(callableMemberDescriptor, "fromSuper");
        C24362h.m61211f(callableMemberDescriptor2, "fromCurrent");
    }
}
