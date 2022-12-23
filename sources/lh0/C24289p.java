package lh0;

import ag0.C20989e;
import cg0.C21164d0;
import cg0.C21171g0;
import cg0.C21181l;
import com.appboy.Constants;
import com.appboy.models.InAppMessageBase;
import com.appboy.models.outgoing.FacebookUser;
import eh0.C23306d;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.C23865a;
import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import lf0.C24236l;
import mh0.C24378d;
import nh0.C24503a;
import p001a0.C0017h;
import p358af.C13437d;
import p502fx.C17119d;
import ug0.C25066c;
import ug0.C25069e;
import zf0.C25432c;
import zf0.C25433c0;
import zf0.C25435d0;
import zf0.C25437e;
import zf0.C25442g;
import zf0.C25445h;
import zf0.C25447i;
import zf0.C25448i0;
import zf0.C25455m;
import zf0.C25485t;
import zf0.C25489x;
import zf0.C25491z;

/* renamed from: lh0.p */
public final class C24289p {

    /* renamed from: a */
    public static final C24290a f61585a = new C24290a();

    /* renamed from: b */
    public static final C24291b f61586b;

    /* renamed from: c */
    public static final C24286o f61587c = m60914d("<LOOP IN SUPERTYPES>");

    /* renamed from: d */
    public static final Set<C25491z> f61588d;

    /* renamed from: lh0.p$a */
    public static class C24290a implements C25485t {
        /* renamed from: A */
        public static /* synthetic */ void m60919A(int i) {
            String str;
            int i2;
            Throwable th;
            if (!(i == 1 || i == 4 || i == 5 || i == 6 || i == 13 || i == 14)) {
                switch (i) {
                    case 8:
                    case 9:
                    case 10:
                        break;
                    default:
                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break;
                }
            }
            str = "@NotNull method %s.%s must not return null";
            if (!(i == 1 || i == 4 || i == 5 || i == 6 || i == 13 || i == 14)) {
                switch (i) {
                    case 8:
                    case 9:
                    case 10:
                        break;
                    default:
                        i2 = 3;
                        break;
                }
            }
            i2 = 2;
            Object[] objArr = new Object[i2];
            switch (i) {
                case 1:
                case 4:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 13:
                case 14:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$1";
                    break;
                case 2:
                case 7:
                    objArr[0] = "fqName";
                    break;
                case 3:
                    objArr[0] = "nameFilter";
                    break;
                case 11:
                    objArr[0] = "visitor";
                    break;
                case 12:
                    objArr[0] = "targetModule";
                    break;
                default:
                    objArr[0] = "capability";
                    break;
            }
            if (i == 1) {
                objArr[1] = "getAnnotations";
            } else if (i == 4) {
                objArr[1] = "getSubPackagesOf";
            } else if (i == 5) {
                objArr[1] = "getName";
            } else if (i == 6) {
                objArr[1] = "getStableName";
            } else if (i == 13) {
                objArr[1] = "getOriginal";
            } else if (i != 14) {
                switch (i) {
                    case 8:
                        objArr[1] = "getAllDependencyModules";
                        break;
                    case 9:
                        objArr[1] = "getExpectedByModules";
                        break;
                    case 10:
                        objArr[1] = "getAllExpectedByModules";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$1";
                        break;
                }
            } else {
                objArr[1] = "getBuiltIns";
            }
            switch (i) {
                case 1:
                case 4:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 13:
                case 14:
                    break;
                case 2:
                case 3:
                    objArr[2] = "getSubPackagesOf";
                    break;
                case 7:
                    objArr[2] = "getPackage";
                    break;
                case 11:
                    objArr[2] = "accept";
                    break;
                case 12:
                    objArr[2] = "shouldSeeInternalsOf";
                    break;
                default:
                    objArr[2] = "getCapability";
                    break;
            }
            String format = String.format(str, objArr);
            if (!(i == 1 || i == 4 || i == 5 || i == 6 || i == 13 || i == 14)) {
                switch (i) {
                    case 8:
                    case 9:
                    case 10:
                        break;
                    default:
                        th = new IllegalArgumentException(format);
                        break;
                }
            }
            th = new IllegalStateException(format);
            throw th;
        }

        /* renamed from: B0 */
        public final <R, D> R mo53398B0(C25447i<R, D> iVar, D d) {
            return null;
        }

        /* renamed from: D */
        public final boolean mo59454D(C25485t tVar) {
            if (tVar != null) {
                return false;
            }
            m60919A(12);
            throw null;
        }

        /* renamed from: E0 */
        public final List<C25485t> mo59455E0() {
            EmptyList emptyList = EmptyList.f60173b;
            if (emptyList != null) {
                return emptyList;
            }
            m60919A(9);
            throw null;
        }

        /* renamed from: K */
        public final <T> T mo59456K(C17119d dVar) {
            if (dVar != null) {
                return null;
            }
            m60919A(0);
            throw null;
        }

        /* renamed from: a */
        public final C25442g mo53407a() {
            return this;
        }

        /* renamed from: b */
        public final C25442g mo53399b() {
            return null;
        }

        public final C20989e getAnnotations() {
            return C20989e.C20990a.f52739a;
        }

        public final C25069e getName() {
            return C25069e.m62822k("<ERROR MODULE>");
        }

        /* renamed from: k0 */
        public final C25489x mo59458k0(C25066c cVar) {
            if (cVar == null) {
                m60919A(7);
                throw null;
            }
            throw new IllegalStateException("Should not be called!");
        }

        /* renamed from: m */
        public final C23867c mo59460m() {
            C23865a aVar = C23865a.f60307f;
            if (aVar != null) {
                return aVar;
            }
            m60919A(14);
            throw null;
        }

        /* renamed from: n */
        public final Collection<C25066c> mo59461n(C25066c cVar, C24236l<? super C25069e, Boolean> lVar) {
            if (cVar == null) {
                m60919A(2);
                throw null;
            } else if (lVar != null) {
                EmptyList emptyList = EmptyList.f60173b;
                if (emptyList != null) {
                    return emptyList;
                }
                m60919A(4);
                throw null;
            } else {
                m60919A(3);
                throw null;
            }
        }
    }

    /* renamed from: lh0.p$b */
    public static class C24291b extends C21181l {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C24291b(ug0.C25069e r14) {
            /*
                r13 = this;
                lh0.p$a r1 = lh0.C24289p.f61585a
                kotlin.reflect.jvm.internal.impl.descriptors.Modality r3 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN
                kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r4 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.CLASS
                java.util.List r5 = java.util.Collections.emptyList()
                zf0.d0$a r12 = zf0.C25435d0.f63736a
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$a r6 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.f61310e
                r0 = r13
                r2 = r14
                r0.<init>(r1, r2, r3, r4, r5, r6)
                ag0.e$a$a r9 = ag0.C20989e.C20990a.f52739a
                r10 = 1
                cg0.j r14 = new cg0.j
                r8 = 0
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r11 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION
                r6 = r14
                r7 = r13
                r6.<init>(r7, r8, r9, r10, r11, r12)
                java.util.List r0 = java.util.Collections.emptyList()
                zf0.m$g r1 = zf0.C25455m.f63743d
                r14.mo53497Y0(r0, r1)
                ug0.e r0 = r13.getName()
                java.lang.String r0 = r0.mo61604f()
                kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r0 = lh0.C24289p.m60912b(r0)
                lh0.o r1 = new lh0.o
                java.lang.String r2 = "<ERROR>"
                lh0.q r2 = lh0.C24289p.m60916f(r2, r13)
                r1.<init>(r2, r0)
                r14.mo59453V0(r1)
                java.util.Set r1 = java.util.Collections.singleton(r14)
                r13.mo53508N0(r0, r1, r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lh0.C24289p.C24291b.<init>(ug0.e):void");
        }

        /* renamed from: W */
        public static /* synthetic */ void m60929W(int i) {
            String str = (i == 2 || i == 5 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 2 || i == 5 || i == 8) ? 2 : 3)];
            switch (i) {
                case 1:
                    objArr[0] = "substitutor";
                    break;
                case 2:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ErrorClassDescriptor";
                    break;
                case 3:
                    objArr[0] = "typeArguments";
                    break;
                case 4:
                case 7:
                    objArr[0] = "kotlinTypeRefiner";
                    break;
                case 6:
                    objArr[0] = "typeSubstitution";
                    break;
                default:
                    objArr[0] = "name";
                    break;
            }
            if (i == 2) {
                objArr[1] = "substitute";
            } else if (i == 5 || i == 8) {
                objArr[1] = "getMemberScope";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ErrorClassDescriptor";
            }
            switch (i) {
                case 1:
                    objArr[2] = "substitute";
                    break;
                case 2:
                case 5:
                case 8:
                    break;
                case 3:
                case 4:
                case 6:
                case 7:
                    objArr[2] = "getMemberScope";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            throw ((i == 2 || i == 5 || i == 8) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        /* renamed from: A */
        public final MemberScope mo53403A(C24287o0 o0Var, C24378d dVar) {
            if (o0Var == null) {
                m60929W(6);
                throw null;
            } else if (dVar != null) {
                StringBuilder k = C13555b.m33972k("Error scope for class ");
                k.append(getName());
                k.append(" with arguments: ");
                k.append(o0Var);
                return C24289p.m60912b(k.toString());
            } else {
                m60929W(7);
                throw null;
            }
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ C25445h mo53408c(TypeSubstitutor typeSubstitutor) {
            mo53410l0(typeSubstitutor);
            return this;
        }

        /* renamed from: l0 */
        public final C25432c mo53410l0(TypeSubstitutor typeSubstitutor) {
            if (typeSubstitutor != null) {
                return this;
            }
            m60929W(1);
            throw null;
        }

        public final String toString() {
            return getName().mo61604f();
        }
    }

    /* renamed from: lh0.p$c */
    public static class C24292c implements MemberScope {

        /* renamed from: b */
        public final String f61589b;

        public C24292c(String str) {
            if (str != null) {
                this.f61589b = str;
            } else {
                m60933h(0);
                throw null;
            }
        }

        /* renamed from: h */
        public static /* synthetic */ void m60933h(int i) {
            String str;
            int i2;
            Throwable th;
            if (!(i == 7 || i == 18)) {
                switch (i) {
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        break;
                    default:
                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break;
                }
            }
            str = "@NotNull method %s.%s must not return null";
            if (!(i == 7 || i == 18)) {
                switch (i) {
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        break;
                    default:
                        i2 = 3;
                        break;
                }
            }
            i2 = 2;
            Object[] objArr = new Object[i2];
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 8:
                case 14:
                case 19:
                    objArr[0] = "name";
                    break;
                case 2:
                case 4:
                case 6:
                case 9:
                case 15:
                    objArr[0] = FacebookUser.LOCATION_OUTER_OBJECT_KEY;
                    break;
                case 7:
                case 10:
                case 11:
                case 12:
                case 13:
                case 18:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ErrorScope";
                    break;
                case 16:
                    objArr[0] = "kindFilter";
                    break;
                case 17:
                    objArr[0] = "nameFilter";
                    break;
                case 20:
                    objArr[0] = Constants.APPBOY_PUSH_PRIORITY_KEY;
                    break;
                default:
                    objArr[0] = "debugMessage";
                    break;
            }
            if (i == 7) {
                objArr[1] = "getContributedVariables";
            } else if (i != 18) {
                switch (i) {
                    case 10:
                        objArr[1] = "getContributedFunctions";
                        break;
                    case 11:
                        objArr[1] = "getFunctionNames";
                        break;
                    case 12:
                        objArr[1] = "getVariableNames";
                        break;
                    case 13:
                        objArr[1] = "getClassifierNames";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ErrorScope";
                        break;
                }
            } else {
                objArr[1] = "getContributedDescriptors";
            }
            switch (i) {
                case 1:
                case 2:
                    objArr[2] = "getContributedClassifier";
                    break;
                case 3:
                case 4:
                    objArr[2] = "getContributedClassifierIncludeDeprecated";
                    break;
                case 5:
                case 6:
                    objArr[2] = "getContributedVariables";
                    break;
                case 7:
                case 10:
                case 11:
                case 12:
                case 13:
                case 18:
                    break;
                case 8:
                case 9:
                    objArr[2] = "getContributedFunctions";
                    break;
                case 14:
                case 15:
                    objArr[2] = "recordLookup";
                    break;
                case 16:
                case 17:
                    objArr[2] = "getContributedDescriptors";
                    break;
                case 19:
                    objArr[2] = "definitelyDoesNotContainName";
                    break;
                case 20:
                    objArr[2] = "printScopeStructure";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            if (!(i == 7 || i == 18)) {
                switch (i) {
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        break;
                    default:
                        th = new IllegalArgumentException(format);
                        break;
                }
            }
            th = new IllegalStateException(format);
            throw th;
        }

        /* renamed from: a */
        public final Set<C25069e> mo53530a() {
            Set<C25069e> emptySet = Collections.emptySet();
            if (emptySet != null) {
                return emptySet;
            }
            m60933h(11);
            throw null;
        }

        /* renamed from: b */
        public final Collection mo53531b(C25069e eVar, NoLookupLocation noLookupLocation) {
            if (eVar == null) {
                m60933h(8);
                throw null;
            } else if (noLookupLocation != null) {
                C24503a aVar = new C24503a(C24289p.f61586b, this);
                aVar.mo53468Q0((C21171g0) null, (C25433c0) null, Collections.emptyList(), Collections.emptyList(), C24289p.m60914d("<ERROR FUNCTION RETURN TYPE>"), Modality.OPEN, C25455m.f63744e);
                Set singleton = Collections.singleton(aVar);
                if (singleton != null) {
                    return singleton;
                }
                m60933h(10);
                throw null;
            } else {
                m60933h(9);
                throw null;
            }
        }

        /* renamed from: c */
        public final Collection mo53532c(C25069e eVar, NoLookupLocation noLookupLocation) {
            if (eVar == null) {
                m60933h(5);
                throw null;
            } else if (noLookupLocation != null) {
                Set<C25491z> set = C24289p.f61588d;
                if (set != null) {
                    return set;
                }
                m60933h(7);
                throw null;
            } else {
                m60933h(6);
                throw null;
            }
        }

        /* renamed from: d */
        public final Set<C25069e> mo53533d() {
            Set<C25069e> emptySet = Collections.emptySet();
            if (emptySet != null) {
                return emptySet;
            }
            m60933h(12);
            throw null;
        }

        /* renamed from: e */
        public final Collection<C25442g> mo53492e(C23306d dVar, C24236l<? super C25069e, Boolean> lVar) {
            if (dVar == null) {
                m60933h(16);
                throw null;
            } else if (lVar != null) {
                List emptyList = Collections.emptyList();
                if (emptyList != null) {
                    return emptyList;
                }
                m60933h(18);
                throw null;
            } else {
                m60933h(17);
                throw null;
            }
        }

        /* renamed from: f */
        public final Set<C25069e> mo53493f() {
            Set<C25069e> emptySet = Collections.emptySet();
            if (emptySet != null) {
                return emptySet;
            }
            m60933h(13);
            throw null;
        }

        /* renamed from: g */
        public final C25437e mo58433g(C25069e eVar, NoLookupLocation noLookupLocation) {
            if (eVar == null) {
                m60933h(1);
                throw null;
            } else if (noLookupLocation != null) {
                String f = eVar.mo61604f();
                if (f != null) {
                    return new C24291b(C25069e.m62822k("<ERROR CLASS: " + f + ">"));
                }
                C24289p.m60911a(1);
                throw null;
            } else {
                m60933h(2);
                throw null;
            }
        }

        public final String toString() {
            return C0017h.m57N(C13555b.m33972k("ErrorScope{"), this.f61589b, '}');
        }
    }

    /* renamed from: lh0.p$d */
    public static class C24293d implements MemberScope {

        /* renamed from: b */
        public final String f61590b;

        public C24293d(String str) {
            if (str != null) {
                this.f61590b = str;
            } else {
                m60941h(0);
                throw null;
            }
        }

        /* renamed from: h */
        public static /* synthetic */ void m60941h(int i) {
            Object[] objArr = new Object[3];
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 11:
                case 13:
                    objArr[0] = "name";
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                case 12:
                    objArr[0] = FacebookUser.LOCATION_OUTER_OBJECT_KEY;
                    break;
                case 9:
                    objArr[0] = "kindFilter";
                    break;
                case 10:
                    objArr[0] = "nameFilter";
                    break;
                case 14:
                    objArr[0] = Constants.APPBOY_PUSH_PRIORITY_KEY;
                    break;
                default:
                    objArr[0] = InAppMessageBase.MESSAGE;
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ThrowingScope";
            switch (i) {
                case 1:
                case 2:
                    objArr[2] = "getContributedClassifier";
                    break;
                case 3:
                case 4:
                    objArr[2] = "getContributedClassifierIncludeDeprecated";
                    break;
                case 5:
                case 6:
                    objArr[2] = "getContributedVariables";
                    break;
                case 7:
                case 8:
                    objArr[2] = "getContributedFunctions";
                    break;
                case 9:
                case 10:
                    objArr[2] = "getContributedDescriptors";
                    break;
                case 11:
                case 12:
                    objArr[2] = "recordLookup";
                    break;
                case 13:
                    objArr[2] = "definitelyDoesNotContainName";
                    break;
                case 14:
                    objArr[2] = "printScopeStructure";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public final Set<C25069e> mo53530a() {
            throw new IllegalStateException();
        }

        /* renamed from: b */
        public final Collection mo53531b(C25069e eVar, NoLookupLocation noLookupLocation) {
            if (eVar == null) {
                m60941h(7);
                throw null;
            } else if (noLookupLocation == null) {
                m60941h(8);
                throw null;
            } else {
                throw new IllegalStateException(this.f61590b + ", required name: " + eVar);
            }
        }

        /* renamed from: c */
        public final Collection mo53532c(C25069e eVar, NoLookupLocation noLookupLocation) {
            if (eVar == null) {
                m60941h(5);
                throw null;
            } else if (noLookupLocation == null) {
                m60941h(6);
                throw null;
            } else {
                throw new IllegalStateException(this.f61590b + ", required name: " + eVar);
            }
        }

        /* renamed from: d */
        public final Set<C25069e> mo53533d() {
            throw new IllegalStateException();
        }

        /* renamed from: e */
        public final Collection<C25442g> mo53492e(C23306d dVar, C24236l<? super C25069e, Boolean> lVar) {
            if (dVar == null) {
                m60941h(9);
                throw null;
            } else if (lVar == null) {
                m60941h(10);
                throw null;
            } else {
                throw new IllegalStateException(this.f61590b);
            }
        }

        /* renamed from: f */
        public final Set<C25069e> mo53493f() {
            throw new IllegalStateException();
        }

        /* renamed from: g */
        public final C25437e mo58433g(C25069e eVar, NoLookupLocation noLookupLocation) {
            if (eVar == null) {
                m60941h(1);
                throw null;
            } else if (noLookupLocation == null) {
                m60941h(2);
                throw null;
            } else {
                throw new IllegalStateException(this.f61590b + ", required name: " + eVar);
            }
        }

        public final String toString() {
            return C0017h.m57N(C13555b.m33972k("ThrowingScope{"), this.f61590b, '}');
        }
    }

    /* renamed from: lh0.p$e */
    public static class C24294e implements C24274i0 {
        /* renamed from: a */
        public static /* synthetic */ void m60949a(int i) {
            String str = (i == 1 || i == 2 || i == 3 || i == 4 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 1 || i == 2 || i == 3 || i == 4 || i == 6) ? 2 : 3)];
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 6:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$UninferredParameterTypeConstructor";
                    break;
                case 5:
                    objArr[0] = "kotlinTypeRefiner";
                    break;
                default:
                    objArr[0] = "descriptor";
                    break;
            }
            if (i == 1) {
                objArr[1] = "getTypeParameterDescriptor";
            } else if (i == 2) {
                objArr[1] = "getParameters";
            } else if (i == 3) {
                objArr[1] = "getSupertypes";
            } else if (i == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i != 6) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$UninferredParameterTypeConstructor";
            } else {
                objArr[1] = "refine";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 6:
                    break;
                case 5:
                    objArr[2] = "refine";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            throw ((i == 1 || i == 2 || i == 3 || i == 4 || i == 6) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        public final List<C25448i0> getParameters() {
            throw null;
        }

        /* renamed from: m */
        public final C23867c mo53458m() {
            DescriptorUtilsKt.m60284e((C25442g) null);
            throw null;
        }

        /* renamed from: n */
        public final Collection<C24307v> mo53459n() {
            throw null;
        }

        /* renamed from: o */
        public final C25437e mo53460o() {
            throw null;
        }

        /* renamed from: p */
        public final boolean mo53461p() {
            throw null;
        }
    }

    static {
        C24291b bVar = new C24291b(C25069e.m62822k("<ERROR CLASS>"));
        f61586b = bVar;
        C24286o d = m60914d("<ERROR PROPERTY TYPE>");
        C20989e.C20990a.C20991a aVar = C20989e.C20990a.f52739a;
        Modality modality = Modality.OPEN;
        C25455m.C25463h hVar = C25455m.f63744e;
        C25069e k = C25069e.m62822k("<ERROR PROPERTY>");
        CallableMemberDescriptor.Kind kind = CallableMemberDescriptor.Kind.DECLARATION;
        C25435d0.C25436a aVar2 = C25435d0.f63736a;
        if (modality == null) {
            C21164d0.m49513A(9);
            throw null;
        } else if (hVar == null) {
            C21164d0.m49513A(10);
            throw null;
        } else if (kind != null) {
            C21164d0 d0Var = r1;
            C21164d0 d0Var2 = new C21164d0(bVar, (C25491z) null, aVar, modality, hVar, true, k, kind, aVar2, false, false, false, false, false, false);
            C21164d0 d0Var3 = d0Var;
            d0Var3.mo53449Q0(d, Collections.emptyList(), (C25433c0) null, (C21171g0) null);
            f61588d = Collections.singleton(d0Var3);
        } else {
            C21164d0.m49513A(12);
            throw null;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m60911a(int i) {
        String str = (i == 4 || i == 6 || i == 19) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 4 || i == 6 || i == 19) ? 2 : 3)];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 7:
            case 11:
            case 15:
                objArr[0] = "debugMessage";
                break;
            case 4:
            case 6:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils";
                break;
            case 5:
                objArr[0] = "ownerScope";
                break;
            case 8:
            case 9:
            case 16:
            case 17:
                objArr[0] = "debugName";
                break;
            case 10:
                objArr[0] = "typeConstructor";
                break;
            case 12:
            case 14:
                objArr[0] = WidgetMessageParser.KEY_ARGUMENTS;
                break;
            case 13:
                objArr[0] = "presentableName";
                break;
            case 18:
                objArr[0] = "errorClass";
                break;
            case 20:
                objArr[0] = "typeParameterDescriptor";
                break;
            default:
                objArr[0] = "function";
                break;
        }
        if (i == 4) {
            objArr[1] = "createErrorProperty";
        } else if (i == 6) {
            objArr[1] = "createErrorFunction";
        } else if (i != 19) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils";
        } else {
            objArr[1] = "getErrorModule";
        }
        switch (i) {
            case 1:
                objArr[2] = "createErrorClass";
                break;
            case 2:
            case 3:
                objArr[2] = "createErrorScope";
                break;
            case 4:
            case 6:
            case 19:
                break;
            case 5:
                objArr[2] = "createErrorFunction";
                break;
            case 7:
                objArr[2] = "createErrorType";
                break;
            case 8:
                objArr[2] = "createErrorTypeWithCustomDebugName";
                break;
            case 9:
            case 10:
                objArr[2] = "createErrorTypeWithCustomConstructor";
                break;
            case 11:
            case 12:
                objArr[2] = "createErrorTypeWithArguments";
                break;
            case 13:
            case 14:
                objArr[2] = "createUnresolvedType";
                break;
            case 15:
                objArr[2] = "createErrorTypeConstructor";
                break;
            case 16:
            case 17:
            case 18:
                objArr[2] = "createErrorTypeConstructorWithCustomDebugName";
                break;
            case 20:
                objArr[2] = "createUninferredParameterType";
                break;
            default:
                objArr[2] = "containsErrorTypeInParameters";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 4 || i == 6 || i == 19) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    public static MemberScope m60912b(String str) {
        if (str != null) {
            return m60913c(str, false);
        }
        m60911a(2);
        throw null;
    }

    /* renamed from: c */
    public static MemberScope m60913c(String str, boolean z) {
        if (str == null) {
            m60911a(3);
            throw null;
        } else if (z) {
            return new C24293d(str);
        } else {
            return new C24292c(str);
        }
    }

    /* renamed from: d */
    public static C24286o m60914d(String str) {
        if (str != null) {
            return m60917g(str, Collections.emptyList());
        }
        m60911a(7);
        throw null;
    }

    /* renamed from: e */
    public static C24296q m60915e(String str) {
        if (str != null) {
            return m60916f(C13437d.m33706k("[ERROR : ", str, "]"), f61586b);
        }
        m60911a(15);
        throw null;
    }

    /* renamed from: f */
    public static C24296q m60916f(String str, C24291b bVar) {
        if (str == null) {
            m60911a(17);
            throw null;
        } else if (bVar != null) {
            return new C24296q(str, bVar);
        } else {
            m60911a(18);
            throw null;
        }
    }

    /* renamed from: g */
    public static C24286o m60917g(String str, List list) {
        if (str == null) {
            m60911a(11);
            throw null;
        } else if (list != null) {
            return new C24286o(m60915e(str), m60912b(str), list, false, 16);
        } else {
            m60911a(12);
            throw null;
        }
    }

    /* renamed from: h */
    public static boolean m60918h(C25442g gVar) {
        if (gVar == null) {
            return false;
        }
        if ((gVar instanceof C24291b) || (gVar.mo53399b() instanceof C24291b) || gVar == f61585a) {
            return true;
        }
        return false;
    }
}
