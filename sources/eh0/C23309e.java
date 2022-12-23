package eh0;

import bf0.C21050d;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;
import lf0.C24236l;
import mf0.C24362h;
import xg0.C25263f;
import zf0.C25442g;

/* renamed from: eh0.e */
public final class C23309e extends C25263f {

    /* renamed from: b */
    public final /* synthetic */ ArrayList<C25442g> f59109b;

    /* renamed from: c */
    public final /* synthetic */ GivenFunctionsMemberScope f59110c;

    public C23309e(ArrayList<C25442g> arrayList, GivenFunctionsMemberScope givenFunctionsMemberScope) {
        this.f59109b = arrayList;
        this.f59110c = givenFunctionsMemberScope;
    }

    /* renamed from: l */
    public final void mo320l(CallableMemberDescriptor callableMemberDescriptor) {
        C24362h.m61211f(callableMemberDescriptor, "fakeOverride");
        OverridingUtil.m60251r(callableMemberDescriptor, (C24236l<CallableMemberDescriptor, C21050d>) null);
        this.f59109b.add(callableMemberDescriptor);
    }

    /* renamed from: p */
    public final void mo53536p(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
        C24362h.m61211f(callableMemberDescriptor, "fromSuper");
        C24362h.m61211f(callableMemberDescriptor2, "fromCurrent");
        StringBuilder k = C13555b.m33972k("Conflict in scope of ");
        k.append(this.f59110c.f61211b);
        k.append(": ");
        k.append(callableMemberDescriptor);
        k.append(" vs ");
        k.append(callableMemberDescriptor2);
        throw new IllegalStateException(k.toString().toString());
    }
}
