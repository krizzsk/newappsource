package cg0;

import bf0.C21050d;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import lf0.C24236l;
import xg0.C25263f;

/* renamed from: cg0.r */
public final class C21193r extends C25263f {

    /* renamed from: b */
    public final /* synthetic */ Set f53113b;

    public C21193r(LinkedHashSet linkedHashSet) {
        this.f53113b = linkedHashSet;
    }

    /* renamed from: q */
    public static /* synthetic */ void m49735q(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "fromSuper";
        } else if (i != 2) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "fromCurrent";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
        if (i == 1 || i == 2) {
            objArr[2] = "conflict";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: l */
    public final void mo320l(CallableMemberDescriptor callableMemberDescriptor) {
        if (callableMemberDescriptor != null) {
            OverridingUtil.m60251r(callableMemberDescriptor, (C24236l<CallableMemberDescriptor, C21050d>) null);
            this.f53113b.add(callableMemberDescriptor);
            return;
        }
        m49735q(0);
        throw null;
    }

    /* renamed from: p */
    public final void mo53536p(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
        if (callableMemberDescriptor == null) {
            m49735q(1);
            throw null;
        } else if (callableMemberDescriptor2 == null) {
            m49735q(2);
            throw null;
        }
    }
}
