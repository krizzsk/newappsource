package yf0;

import cg0.C21171g0;
import cg0.C21173h0;
import cg0.C21181l;
import java.util.List;
import kh0.C23792h;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;
import mf0.C24362h;
import p583jk.C17875h;
import ug0.C25069e;
import zf0.C25433c0;
import zf0.C25435d0;
import zf0.C25455m;

/* renamed from: yf0.a */
public final class C25293a extends GivenFunctionsMemberScope {

    /* renamed from: e */
    public static final C25069e f63580e = C25069e.m62820i("clone");

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25293a(C23792h hVar, C21181l lVar) {
        super(hVar, lVar);
        C24362h.m61211f(hVar, "storageManager");
    }

    /* renamed from: h */
    public final List<C23900c> mo60183h() {
        C21173h0 X0 = C21173h0.m49581X0(this.f61211b, f63580e, CallableMemberDescriptor.Kind.DECLARATION, C25435d0.f63736a);
        C25433c0 M0 = this.f61211b.mo53404M0();
        EmptyList emptyList = EmptyList.f60173b;
        X0.mo53468Q0((C21171g0) null, M0, emptyList, emptyList, DescriptorUtilsKt.m60284e(this.f61211b).mo59383f(), Modality.OPEN, C25455m.f63742c);
        return C17875h.m44280D(X0);
    }
}
