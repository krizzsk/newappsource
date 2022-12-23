package xg0;

import com.appboy.models.outgoing.FacebookUser;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.descriptors.C23894a;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import lh0.C24274i0;
import lh0.C24289p;
import lh0.C24307v;
import ug0.C25066c;
import ug0.C25067d;
import ug0.C25071g;
import zf0.C25431b0;
import zf0.C25432c;
import zf0.C25437e;
import zf0.C25438e0;
import zf0.C25440f;
import zf0.C25442g;
import zf0.C25449j;
import zf0.C25451k;
import zf0.C25455m;
import zf0.C25485t;
import zf0.C25486u;
import zf0.C25489x;

/* renamed from: xg0.c */
public final class C25260c {

    /* renamed from: a */
    public static final /* synthetic */ int f63536a = 0;

    static {
        new C25066c("kotlin.jvm.JvmName");
    }

    /* renamed from: a */
    public static /* synthetic */ void m63384a(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 59:
            case 61:
            case 79:
            case 92:
            case 94:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 64:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = InneractiveMediationNameConsts.OTHER;
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 65:
            case 66:
            case 67:
            case 74:
            case 75:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = FacebookUser.LOCATION_OUTER_OBJECT_KEY;
                break;
            case 63:
                objArr[0] = "variable";
                break;
            case 68:
                objArr[0] = InneractiveMediationDefs.GENDER_FEMALE;
                break;
            case 70:
                objArr[0] = "current";
                break;
            case 71:
                objArr[0] = "result";
                break;
            case 72:
                objArr[0] = "memberDescriptor";
                break;
            case 76:
            case 77:
            case 78:
                objArr[0] = "annotated";
                break;
            case 82:
            case 84:
            case 87:
            case 89:
                objArr[0] = "scope";
                break;
            case 85:
            case 88:
            case 90:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 60:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 62:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 69:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 73:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 80:
            case 81:
                objArr[1] = "getContainingSourceFile";
                break;
            case 83:
                objArr[1] = "getAllDescriptors";
                break;
            case 86:
                objArr[1] = "getFunctionByName";
                break;
            case 91:
                objArr[1] = "getPropertyByName";
                break;
            case 93:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 59:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 61:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 63:
            case 64:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 65:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 66:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 67:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 68:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 70:
            case 71:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 72:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 74:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 75:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 76:
                objArr[2] = "getJvmName";
                break;
            case 77:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 78:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 79:
                objArr[2] = "getContainingSourceFile";
                break;
            case 82:
                objArr[2] = "getAllDescriptors";
                break;
            case 84:
            case 85:
                objArr[2] = "getFunctionByName";
                break;
            case 87:
            case 88:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 89:
            case 90:
                objArr[2] = "getPropertyByName";
                break;
            case 92:
                objArr[2] = "getDirectMember";
                break;
            case 94:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: b */
    public static void m63385b(C23894a aVar, LinkedHashSet linkedHashSet) {
        if (aVar == null) {
            m63384a(70);
            throw null;
        } else if (!linkedHashSet.contains(aVar)) {
            for (C23894a a : aVar.mo53407a().mo53440d()) {
                C23894a a2 = a.mo53407a();
                m63385b(a2, linkedHashSet);
                linkedHashSet.add(a2);
            }
        }
    }

    /* renamed from: c */
    public static C25432c m63386c(C24307v vVar) {
        if (vVar != null) {
            C24274i0 O0 = vVar.mo60411O0();
            if (O0 != null) {
                C25432c cVar = (C25432c) O0.mo53460o();
                if (cVar != null) {
                    return cVar;
                }
                m63384a(47);
                throw null;
            }
            m63384a(46);
            throw null;
        }
        m63384a(45);
        throw null;
    }

    /* renamed from: d */
    public static C25485t m63387d(C25442g gVar) {
        if (gVar != null) {
            C25485t e = m63388e(gVar);
            if (e != null) {
                return e;
            }
            m63384a(22);
            throw null;
        }
        m63384a(21);
        throw null;
    }

    /* renamed from: e */
    public static C25485t m63388e(C25442g gVar) {
        if (gVar != null) {
            while (gVar != null) {
                if (gVar instanceof C25485t) {
                    return (C25485t) gVar;
                }
                if (gVar instanceof C25489x) {
                    return ((C25489x) gVar).mo59441G0();
                }
                gVar = gVar.mo53399b();
            }
            return null;
        }
        m63384a(23);
        throw null;
    }

    /* renamed from: f */
    public static C25438e0 m63389f(C25442g gVar) {
        if (gVar != null) {
            if (gVar instanceof C25431b0) {
                gVar = ((C25431b0) gVar).mo53426Y();
            }
            if (!(gVar instanceof C25449j)) {
                return C25438e0.f63737a;
            }
            ((C25449j) gVar).mo53400e().mo58414b();
            return C25438e0.f63737a;
        }
        m63384a(79);
        throw null;
    }

    /* renamed from: g */
    public static C25067d m63390g(C25442g gVar) {
        if (gVar != null) {
            C25066c h = m63391h(gVar);
            if (h != null) {
                return h.mo61589i();
            }
            return m63390g(gVar.mo53399b()).mo61592c(gVar.getName());
        }
        m63384a(2);
        throw null;
    }

    /* renamed from: h */
    public static C25066c m63391h(C25442g gVar) {
        if (gVar == null) {
            m63384a(5);
            throw null;
        } else if ((gVar instanceof C25485t) || C24289p.m60918h(gVar)) {
            return C25066c.f63253c;
        } else {
            if (gVar instanceof C25489x) {
                return ((C25489x) gVar).mo59443f();
            }
            if (gVar instanceof C25486u) {
                return ((C25486u) gVar).mo53401f();
            }
            return null;
        }
    }

    /* renamed from: i */
    public static <D extends C25442g> D m63392i(D d, Class<D> cls, boolean z) {
        if (d == null) {
            return null;
        }
        if (z) {
            d = d.mo53399b();
        }
        while (d != null) {
            if (cls.isInstance(d)) {
                return d;
            }
            d = d.mo53399b();
        }
        return null;
    }

    /* renamed from: j */
    public static C25432c m63393j(C25432c cVar) {
        if (cVar != null) {
            for (C24307v c : cVar.mo53481j().mo53459n()) {
                C25432c c2 = m63386c(c);
                if (c2.mo53513p() != ClassKind.INTERFACE) {
                    return c2;
                }
            }
            return null;
        }
        m63384a(44);
        throw null;
    }

    /* renamed from: k */
    public static boolean m63394k(C25442g gVar) {
        if (!m63397n(gVar, ClassKind.CLASS) || !gVar.getName().equals(C25071g.f63266a)) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public static boolean m63395l(C25442g gVar) {
        return m63397n(gVar, ClassKind.OBJECT) && ((C25432c) gVar).mo53509d0();
    }

    /* renamed from: m */
    public static boolean m63396m(C25442g gVar) {
        if (gVar != null) {
            return m63397n(gVar, ClassKind.ENUM_ENTRY);
        }
        m63384a(36);
        throw null;
    }

    /* renamed from: n */
    public static boolean m63397n(C25442g gVar, ClassKind classKind) {
        if (classKind == null) {
            m63384a(37);
            throw null;
        } else if (!(gVar instanceof C25432c) || ((C25432c) gVar).mo53513p() != classKind) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: o */
    public static boolean m63398o(C25442g gVar) {
        if (gVar != null) {
            while (true) {
                boolean z = false;
                if (gVar == null) {
                    return false;
                }
                if (m63394k(gVar)) {
                    break;
                }
                if ((gVar instanceof C25451k) && ((C25451k) gVar).mo53429g() == C25455m.f63745f) {
                    z = true;
                }
                if (z) {
                    break;
                }
                gVar = gVar.mo53399b();
            }
            return true;
        }
        m63384a(1);
        throw null;
    }

    /* renamed from: p */
    public static boolean m63399p(C24307v vVar, C25432c cVar) {
        if (vVar == null) {
            m63384a(30);
            throw null;
        } else if (cVar != null) {
            C25437e o = vVar.mo60411O0().mo53460o();
            if (o == null) {
                return false;
            }
            C25442g a = o.mo53407a();
            if (!(a instanceof C25437e) || !cVar.mo53481j().equals(((C25437e) a).mo53481j())) {
                return false;
            }
            return true;
        } else {
            m63384a(31);
            throw null;
        }
    }

    /* renamed from: q */
    public static boolean m63400q(C25440f fVar) {
        return (m63397n(fVar, ClassKind.CLASS) || m63397n(fVar, ClassKind.INTERFACE)) && ((C25432c) fVar).mo53436s() == Modality.SEALED;
    }

    /* renamed from: r */
    public static boolean m63401r(C25432c cVar, C25432c cVar2) {
        return m63402s(cVar.mo53412q(), cVar2.mo53407a());
    }

    /* renamed from: s */
    public static boolean m63402s(C24307v vVar, C25432c cVar) {
        if (vVar == null) {
            m63384a(32);
            throw null;
        } else if (cVar == null) {
            m63384a(33);
            throw null;
        } else if (m63399p(vVar, cVar)) {
            return true;
        } else {
            for (C24307v s : vVar.mo60411O0().mo53459n()) {
                if (m63402s(s, cVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: t */
    public static boolean m63403t(C25442g gVar) {
        return gVar != null && (gVar.mo53399b() instanceof C25486u);
    }

    /* renamed from: u */
    public static <D extends CallableMemberDescriptor> D m63404u(D d) {
        if (d != null) {
            while (d.mo53433p() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                Collection d2 = d.mo53440d();
                if (!d2.isEmpty()) {
                    d = (CallableMemberDescriptor) d2.iterator().next();
                } else {
                    throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + d);
                }
            }
            return d;
        }
        m63384a(59);
        throw null;
    }

    /* renamed from: v */
    public static <D extends C25451k> D m63405v(D d) {
        if (d instanceof CallableMemberDescriptor) {
            return m63404u((CallableMemberDescriptor) d);
        }
        return d;
    }
}
