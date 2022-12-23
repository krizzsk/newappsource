package hh0;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility;
import mf0.C24362h;
import zf0.C25453l;
import zf0.C25455m;

/* renamed from: hh0.t */
public final class C23514t {

    /* renamed from: hh0.t$a */
    public /* synthetic */ class C23515a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f59365a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f59366b;

        static {
            int[] iArr = new int[ProtoBuf$MemberKind.values().length];
            iArr[ProtoBuf$MemberKind.DECLARATION.ordinal()] = 1;
            iArr[ProtoBuf$MemberKind.FAKE_OVERRIDE.ordinal()] = 2;
            iArr[ProtoBuf$MemberKind.DELEGATION.ordinal()] = 3;
            iArr[ProtoBuf$MemberKind.SYNTHESIZED.ordinal()] = 4;
            f59365a = iArr;
            int[] iArr2 = new int[CallableMemberDescriptor.Kind.values().length];
            iArr2[CallableMemberDescriptor.Kind.DECLARATION.ordinal()] = 1;
            iArr2[CallableMemberDescriptor.Kind.FAKE_OVERRIDE.ordinal()] = 2;
            iArr2[CallableMemberDescriptor.Kind.DELEGATION.ordinal()] = 3;
            iArr2[CallableMemberDescriptor.Kind.SYNTHESIZED.ordinal()] = 4;
            int[] iArr3 = new int[ProtoBuf$Visibility.values().length];
            iArr3[ProtoBuf$Visibility.INTERNAL.ordinal()] = 1;
            iArr3[ProtoBuf$Visibility.PRIVATE.ordinal()] = 2;
            iArr3[ProtoBuf$Visibility.PRIVATE_TO_THIS.ordinal()] = 3;
            iArr3[ProtoBuf$Visibility.PROTECTED.ordinal()] = 4;
            iArr3[ProtoBuf$Visibility.PUBLIC.ordinal()] = 5;
            iArr3[ProtoBuf$Visibility.LOCAL.ordinal()] = 6;
            f59366b = iArr3;
        }
    }

    /* renamed from: a */
    public static final C25453l m57640a(ProtoBuf$Visibility protoBuf$Visibility) {
        int i;
        if (protoBuf$Visibility == null) {
            i = -1;
        } else {
            i = C23515a.f59366b[protoBuf$Visibility.ordinal()];
        }
        switch (i) {
            case 1:
                C25455m.C25462g gVar = C25455m.f63743d;
                C24362h.m61210e(gVar, "INTERNAL");
                return gVar;
            case 2:
                C25455m.C25459d dVar = C25455m.f63740a;
                C24362h.m61210e(dVar, "PRIVATE");
                return dVar;
            case 3:
                C25455m.C25460e eVar = C25455m.f63741b;
                C24362h.m61210e(eVar, "PRIVATE_TO_THIS");
                return eVar;
            case 4:
                C25455m.C25461f fVar = C25455m.f63742c;
                C24362h.m61210e(fVar, "PROTECTED");
                return fVar;
            case 5:
                C25455m.C25463h hVar = C25455m.f63744e;
                C24362h.m61210e(hVar, "PUBLIC");
                return hVar;
            case 6:
                C25455m.C25464i iVar = C25455m.f63745f;
                C24362h.m61210e(iVar, "LOCAL");
                return iVar;
            default:
                C25455m.C25459d dVar2 = C25455m.f63740a;
                C24362h.m61210e(dVar2, "PRIVATE");
                return dVar2;
        }
    }

    /* renamed from: b */
    public static final CallableMemberDescriptor.Kind m57641b(ProtoBuf$MemberKind protoBuf$MemberKind) {
        int i;
        if (protoBuf$MemberKind == null) {
            i = -1;
        } else {
            i = C23515a.f59365a[protoBuf$MemberKind.ordinal()];
        }
        if (i == 1) {
            return CallableMemberDescriptor.Kind.DECLARATION;
        }
        if (i == 2) {
            return CallableMemberDescriptor.Kind.FAKE_OVERRIDE;
        }
        if (i == 3) {
            return CallableMemberDescriptor.Kind.DELEGATION;
        }
        if (i != 4) {
            return CallableMemberDescriptor.Kind.DECLARATION;
        }
        return CallableMemberDescriptor.Kind.SYNTHESIZED;
    }
}
