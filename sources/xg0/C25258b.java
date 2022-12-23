package xg0;

import ag0.C20989e;
import cg0.C21167e0;
import cg0.C21169f0;
import cg0.C21171g0;
import cg0.C21173h0;
import cg0.C21177j;
import fh0.C23383a;
import fh0.C23385c;
import java.util.Collections;
import kotlin.reflect.jvm.internal.impl.builtins.C23872e;
import kotlin.reflect.jvm.internal.impl.descriptors.C23894a;
import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C23910d;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import lh0.C24307v;
import ug0.C25069e;
import zf0.C25429a0;
import zf0.C25431b0;
import zf0.C25432c;
import zf0.C25433c0;
import zf0.C25435d0;
import zf0.C25442g;
import zf0.C25452k0;
import zf0.C25455m;
import zf0.C25478n;
import zf0.C25491z;

/* renamed from: xg0.b */
public final class C25258b {

    /* renamed from: xg0.b$a */
    public static class C25259a extends C21177j {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C25259a(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor r8) {
            /*
                r7 = this;
                zf0.d0$a r6 = zf0.C25435d0.f63736a
                r2 = 0
                ag0.e$a$a r3 = ag0.C20989e.C20990a.f52739a
                r4 = 1
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r5 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION
                r0 = r7
                r1 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6)
                java.util.List r0 = java.util.Collections.emptyList()
                int r1 = xg0.C25260c.f63536a
                kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r1 = r8.f61266l
                kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r2 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_CLASS
                r3 = 0
                if (r1 == r2) goto L_0x004e
                boolean r1 = r1.isSingleton()
                if (r1 == 0) goto L_0x0021
                goto L_0x004e
            L_0x0021:
                boolean r1 = xg0.C25260c.m63400q(r8)
                if (r1 == 0) goto L_0x0032
                zf0.m$d r8 = zf0.C25455m.f63740a
                if (r8 == 0) goto L_0x002c
                goto L_0x0052
            L_0x002c:
                r8 = 51
                xg0.C25260c.m63384a(r8)
                throw r3
            L_0x0032:
                boolean r8 = xg0.C25260c.m63394k(r8)
                if (r8 == 0) goto L_0x0043
                zf0.m$h r8 = zf0.C25455m.f63750k
                if (r8 == 0) goto L_0x003d
                goto L_0x0052
            L_0x003d:
                r8 = 52
                xg0.C25260c.m63384a(r8)
                throw r3
            L_0x0043:
                zf0.m$h r8 = zf0.C25455m.f63744e
                if (r8 == 0) goto L_0x0048
                goto L_0x0052
            L_0x0048:
                r8 = 53
                xg0.C25260c.m63384a(r8)
                throw r3
            L_0x004e:
                zf0.m$d r8 = zf0.C25455m.f63740a
                if (r8 == 0) goto L_0x0056
            L_0x0052:
                r7.mo53497Y0(r0, r8)
                return
            L_0x0056:
                r8 = 49
                xg0.C25260c.m63384a(r8)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: xg0.C25258b.C25259a.<init>(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor):void");
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m63375a(int i) {
        String str = (i == 12 || i == 23 || i == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 12 || i == 23 || i == 25) ? 2 : 3)];
        switch (i) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 30:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
                objArr[0] = "enumClass";
                break;
            case 26:
            case 27:
            case 28:
                objArr[0] = "descriptor";
                break;
            case 29:
                objArr[0] = "owner";
                break;
            default:
                objArr[0] = "propertyDescriptor";
                break;
        }
        if (i == 12) {
            objArr[1] = "createSetter";
        } else if (i == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 27:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 28:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 29:
            case 30:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 12 || i == 23 || i == 25) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    public static C21167e0 m63376b(C25491z zVar, C20989e eVar) {
        return m63381g(zVar, eVar, true, zVar.mo53400e());
    }

    /* renamed from: c */
    public static C21169f0 m63377c(C25491z zVar, C20989e eVar) {
        C20989e.C20990a.C20991a aVar = C20989e.C20990a.f52739a;
        C25435d0 e = zVar.mo53400e();
        if (e != null) {
            return m63382h(zVar, eVar, aVar, true, zVar.mo53429g(), e);
        }
        m63375a(6);
        throw null;
    }

    /* renamed from: d */
    public static C21173h0 m63378d(C25432c cVar) {
        if (cVar != null) {
            C20989e.C20990a.C20991a aVar = C20989e.C20990a.f52739a;
            C21173h0 X0 = C21173h0.m49581X0(cVar, C23872e.f60323b, CallableMemberDescriptor.Kind.SYNTHESIZED, cVar.mo53400e());
            return X0.mo53468Q0((C21171g0) null, (C25433c0) null, Collections.emptyList(), Collections.singletonList(new C23910d(X0, (C25452k0) null, 0, aVar, C25069e.m62820i("value"), DescriptorUtilsKt.m60284e(cVar).mo59397v(), false, false, false, (C24307v) null, cVar.mo53400e())), cVar.mo53412q(), Modality.FINAL, C25455m.f63744e);
        }
        m63375a(24);
        throw null;
    }

    /* renamed from: e */
    public static C21173h0 m63379e(C25432c cVar) {
        if (cVar != null) {
            return C21173h0.m49581X0(cVar, C23872e.f60322a, CallableMemberDescriptor.Kind.SYNTHESIZED, cVar.mo53400e()).mo53468Q0((C21171g0) null, (C25433c0) null, Collections.emptyList(), Collections.emptyList(), DescriptorUtilsKt.m60284e(cVar).mo59386i(cVar.mo53412q(), Variance.INVARIANT), Modality.FINAL, C25455m.f63744e);
        }
        m63375a(22);
        throw null;
    }

    /* renamed from: f */
    public static C21171g0 m63380f(C23894a aVar, C24307v vVar, C20989e eVar) {
        if (aVar == null) {
            m63375a(29);
            throw null;
        } else if (vVar == null) {
            return null;
        } else {
            return new C21171g0(aVar, new C23383a(aVar, vVar, (C23385c) null), eVar);
        }
    }

    /* renamed from: g */
    public static C21167e0 m63381g(C25491z zVar, C20989e eVar, boolean z, C25435d0 d0Var) {
        if (eVar == null) {
            m63375a(18);
            throw null;
        } else if (d0Var != null) {
            return new C21167e0(zVar, eVar, zVar.mo53436s(), zVar.mo53429g(), z, false, false, CallableMemberDescriptor.Kind.DECLARATION, (C25429a0) null, d0Var);
        } else {
            m63375a(19);
            throw null;
        }
    }

    /* renamed from: h */
    public static C21169f0 m63382h(C25491z zVar, C20989e eVar, C20989e eVar2, boolean z, C25478n nVar, C25435d0 d0Var) {
        C20989e eVar3 = eVar2;
        if (eVar == null) {
            m63375a(8);
            throw null;
        } else if (eVar3 == null) {
            m63375a(9);
            throw null;
        } else if (nVar == null) {
            m63375a(10);
            throw null;
        } else if (d0Var != null) {
            C21169f0 f0Var = new C21169f0(zVar, eVar, zVar.mo53436s(), nVar, z, false, false, CallableMemberDescriptor.Kind.DECLARATION, (C25431b0) null, d0Var);
            f0Var.f53064n = C21169f0.m49566O0(f0Var, zVar.getType(), eVar2);
            return f0Var;
        } else {
            m63375a(11);
            throw null;
        }
    }

    /* renamed from: i */
    public static boolean m63383i(C23900c cVar) {
        if (cVar.mo53433p() == CallableMemberDescriptor.Kind.SYNTHESIZED) {
            C25442g b = cVar.mo53399b();
            int i = C25260c.f63536a;
            if (C25260c.m63397n(b, ClassKind.ENUM_CLASS)) {
                return true;
            }
        }
        return false;
    }
}
