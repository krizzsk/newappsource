package cg0;

import ag0.C20989e;
import com.appboy.Constants;
import com.appboy.models.outgoing.FacebookUser;
import eh0.C23306d;
import eh0.C23311g;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kh0.C23787c;
import kh0.C23789e;
import kh0.C23792h;
import kotlin.reflect.jvm.internal.impl.descriptors.C23903e;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import lf0.C24225a;
import lf0.C24236l;
import lh0.C24264f;
import lh0.C24274i0;
import lh0.C24312z;
import mh0.C24378d;
import ug0.C25069e;
import zf0.C25430b;
import zf0.C25432c;
import zf0.C25435d0;
import zf0.C25442g;
import zf0.C25448i0;
import zf0.C25455m;
import zf0.C25478n;
import zf0.C25481p;
import zf0.C25491z;

/* renamed from: cg0.q */
public final class C21188q extends C21179k {

    /* renamed from: i */
    public final C24264f f53102i;

    /* renamed from: j */
    public final C21189a f53103j;

    /* renamed from: k */
    public final C23789e<Set<C25069e>> f53104k;

    /* renamed from: l */
    public final C20989e f53105l;

    /* renamed from: cg0.q$a */
    public class C21189a extends C23311g {

        /* renamed from: b */
        public final C23787c<C25069e, Collection<? extends C23903e>> f53106b;

        /* renamed from: c */
        public final C23787c<C25069e, Collection<? extends C25491z>> f53107c;

        /* renamed from: d */
        public final C23789e<Collection<C25442g>> f53108d;

        /* renamed from: e */
        public final /* synthetic */ C21188q f53109e;

        /* renamed from: cg0.q$a$a */
        public class C21190a implements C24236l<C25069e, Collection<? extends C23903e>> {
            public C21190a() {
            }

            public final Object invoke(Object obj) {
                C25069e eVar = (C25069e) obj;
                C21189a aVar = C21189a.this;
                if (eVar != null) {
                    return aVar.mo53535j(aVar.mo53534i().mo53531b(eVar, NoLookupLocation.FOR_NON_TRACKED_SCOPE), eVar);
                }
                aVar.getClass();
                C21189a.m49726h(8);
                throw null;
            }
        }

        /* renamed from: cg0.q$a$b */
        public class C21191b implements C24236l<C25069e, Collection<? extends C25491z>> {
            public C21191b() {
            }

            public final Object invoke(Object obj) {
                C25069e eVar = (C25069e) obj;
                C21189a aVar = C21189a.this;
                if (eVar != null) {
                    return aVar.mo53535j(aVar.mo53534i().mo53532c(eVar, NoLookupLocation.FOR_NON_TRACKED_SCOPE), eVar);
                }
                aVar.getClass();
                C21189a.m49726h(4);
                throw null;
            }
        }

        /* renamed from: cg0.q$a$c */
        public class C21192c implements C24225a<Collection<C25442g>> {
            public C21192c() {
            }

            public final Object invoke() {
                C21189a aVar = C21189a.this;
                aVar.getClass();
                HashSet hashSet = new HashSet();
                for (C25069e eVar : (Set) aVar.f53109e.f53104k.invoke()) {
                    NoLookupLocation noLookupLocation = NoLookupLocation.FOR_NON_TRACKED_SCOPE;
                    hashSet.addAll(aVar.mo53531b(eVar, noLookupLocation));
                    hashSet.addAll(aVar.mo53532c(eVar, noLookupLocation));
                }
                return hashSet;
            }
        }

        public C21189a(C21188q qVar, C23792h hVar) {
            if (hVar != null) {
                this.f53109e = qVar;
                this.f53106b = hVar.mo59020e(new C21190a());
                this.f53107c = hVar.mo59020e(new C21191b());
                this.f53108d = hVar.mo59019d(new C21192c());
                return;
            }
            m49726h(0);
            throw null;
        }

        /* renamed from: h */
        public static /* synthetic */ void m49726h(int i) {
            String str;
            int i2;
            Throwable th;
            if (!(i == 3 || i == 7 || i == 9 || i == 12)) {
                switch (i) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break;
                }
            }
            str = "@NotNull method %s.%s must not return null";
            if (!(i == 3 || i == 7 || i == 9 || i == 12)) {
                switch (i) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
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
                case 8:
                case 10:
                    objArr[0] = "name";
                    break;
                case 2:
                case 6:
                    objArr[0] = FacebookUser.LOCATION_OUTER_OBJECT_KEY;
                    break;
                case 3:
                case 7:
                case 9:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                    break;
                case 11:
                    objArr[0] = "fromSupertypes";
                    break;
                case 13:
                    objArr[0] = "kindFilter";
                    break;
                case 14:
                    objArr[0] = "nameFilter";
                    break;
                case 20:
                    objArr[0] = Constants.APPBOY_PUSH_PRIORITY_KEY;
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i == 3) {
                objArr[1] = "getContributedVariables";
            } else if (i == 7) {
                objArr[1] = "getContributedFunctions";
            } else if (i == 9) {
                objArr[1] = "getSupertypeScope";
            } else if (i != 12) {
                switch (i) {
                    case 15:
                        objArr[1] = "getContributedDescriptors";
                        break;
                    case 16:
                        objArr[1] = "computeAllDeclarations";
                        break;
                    case 17:
                        objArr[1] = "getFunctionNames";
                        break;
                    case 18:
                        objArr[1] = "getClassifierNames";
                        break;
                    case 19:
                        objArr[1] = "getVariableNames";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                        break;
                }
            } else {
                objArr[1] = "resolveFakeOverrides";
            }
            switch (i) {
                case 1:
                case 2:
                    objArr[2] = "getContributedVariables";
                    break;
                case 3:
                case 7:
                case 9:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                case 4:
                    objArr[2] = "computeProperties";
                    break;
                case 5:
                case 6:
                    objArr[2] = "getContributedFunctions";
                    break;
                case 8:
                    objArr[2] = "computeFunctions";
                    break;
                case 10:
                case 11:
                    objArr[2] = "resolveFakeOverrides";
                    break;
                case 13:
                case 14:
                    objArr[2] = "getContributedDescriptors";
                    break;
                case 20:
                    objArr[2] = "printScopeStructure";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            if (!(i == 3 || i == 7 || i == 9 || i == 12)) {
                switch (i) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
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
            Set<C25069e> set = (Set) this.f53109e.f53104k.invoke();
            if (set != null) {
                return set;
            }
            m49726h(17);
            throw null;
        }

        /* renamed from: b */
        public final Collection mo53531b(C25069e eVar, NoLookupLocation noLookupLocation) {
            if (eVar == null) {
                m49726h(5);
                throw null;
            } else if (noLookupLocation != null) {
                Collection collection = (Collection) ((LockBasedStorageManager.C24148k) this.f53106b).invoke(eVar);
                if (collection != null) {
                    return collection;
                }
                m49726h(7);
                throw null;
            } else {
                m49726h(6);
                throw null;
            }
        }

        /* renamed from: c */
        public final Collection mo53532c(C25069e eVar, NoLookupLocation noLookupLocation) {
            if (eVar == null) {
                m49726h(1);
                throw null;
            } else if (noLookupLocation != null) {
                Collection collection = (Collection) ((LockBasedStorageManager.C24148k) this.f53107c).invoke(eVar);
                if (collection != null) {
                    return collection;
                }
                m49726h(3);
                throw null;
            } else {
                m49726h(2);
                throw null;
            }
        }

        /* renamed from: d */
        public final Set<C25069e> mo53533d() {
            Set<C25069e> set = (Set) this.f53109e.f53104k.invoke();
            if (set != null) {
                return set;
            }
            m49726h(19);
            throw null;
        }

        /* renamed from: e */
        public final Collection<C25442g> mo53492e(C23306d dVar, C24236l<? super C25069e, Boolean> lVar) {
            if (dVar == null) {
                m49726h(13);
                throw null;
            } else if (lVar != null) {
                Collection<C25442g> collection = (Collection) this.f53108d.invoke();
                if (collection != null) {
                    return collection;
                }
                m49726h(15);
                throw null;
            } else {
                m49726h(14);
                throw null;
            }
        }

        /* renamed from: f */
        public final Set<C25069e> mo53493f() {
            Set<C25069e> emptySet = Collections.emptySet();
            if (emptySet != null) {
                return emptySet;
            }
            m49726h(18);
            throw null;
        }

        /* renamed from: i */
        public final MemberScope mo53534i() {
            MemberScope o = ((AbstractTypeConstructor) this.f53109e.mo53481j()).mo53459n().iterator().next().mo59564o();
            if (o != null) {
                return o;
            }
            m49726h(9);
            throw null;
        }

        /* renamed from: j */
        public final LinkedHashSet mo53535j(Collection collection, C25069e eVar) {
            if (eVar == null) {
                m49726h(10);
                throw null;
            } else if (collection != null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                OverridingUtil.f61189d.mo60170h(eVar, collection, Collections.emptySet(), this.f53109e, new C21193r(linkedHashSet));
                return linkedHashSet;
            } else {
                m49726h(11);
                throw null;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21188q(C23792h hVar, C25432c cVar, C24312z zVar, C25069e eVar, C23789e eVar2, C20989e eVar3, C25435d0 d0Var) {
        super(hVar, cVar, eVar, d0Var);
        if (hVar == null) {
            m49705W(6);
            throw null;
        } else if (cVar == null) {
            m49705W(7);
            throw null;
        } else if (zVar == null) {
            m49705W(8);
            throw null;
        } else if (eVar == null) {
            m49705W(9);
            throw null;
        } else if (eVar2 == null) {
            m49705W(10);
            throw null;
        } else if (d0Var != null) {
            this.f53105l = eVar3;
            this.f53102i = new C24264f(this, Collections.emptyList(), Collections.singleton(zVar), hVar);
            this.f53103j = new C21189a(this, hVar);
            this.f53104k = eVar2;
        } else {
            m49705W(12);
            throw null;
        }
    }

    /* renamed from: N0 */
    public static C21188q m49704N0(C23792h hVar, C25432c cVar, C25069e eVar, C23789e<Set<C25069e>> eVar2, C20989e eVar3, C25435d0 d0Var) {
        if (hVar == null) {
            m49705W(0);
            throw null;
        } else if (cVar == null) {
            m49705W(1);
            throw null;
        } else if (eVar == null) {
            m49705W(2);
            throw null;
        } else if (eVar2 == null) {
            m49705W(3);
            throw null;
        } else if (d0Var != null) {
            return new C21188q(hVar, cVar, cVar.mo53412q(), eVar, eVar2, eVar3, d0Var);
        } else {
            m49705W(5);
            throw null;
        }
    }

    /* renamed from: W */
    public static /* synthetic */ void m49705W(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: B */
    public final Collection<C25432c> mo53504B() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        m49705W(23);
        throw null;
    }

    /* renamed from: C */
    public final MemberScope mo53505C(C24378d dVar) {
        if (dVar != null) {
            C21189a aVar = this.f53103j;
            if (aVar != null) {
                return aVar;
            }
            m49705W(14);
            throw null;
        }
        m49705W(13);
        throw null;
    }

    /* renamed from: E */
    public final boolean mo53506E() {
        return false;
    }

    /* renamed from: H */
    public final C25430b mo53507H() {
        return null;
    }

    /* renamed from: a0 */
    public final boolean mo53427a0() {
        return false;
    }

    /* renamed from: d0 */
    public final boolean mo53509d0() {
        return false;
    }

    /* renamed from: g */
    public final C25478n mo53429g() {
        C25455m.C25463h hVar = C25455m.f63744e;
        if (hVar != null) {
            return hVar;
        }
        m49705W(20);
        throw null;
    }

    public final C20989e getAnnotations() {
        C20989e eVar = this.f53105l;
        if (eVar != null) {
            return eVar;
        }
        m49705W(21);
        throw null;
    }

    /* renamed from: h0 */
    public final boolean mo53510h0() {
        return false;
    }

    /* renamed from: j */
    public final C24274i0 mo53481j() {
        C24264f fVar = this.f53102i;
        if (fVar != null) {
            return fVar;
        }
        m49705W(17);
        throw null;
    }

    /* renamed from: k */
    public final Collection<C25430b> mo53511k() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        m49705W(16);
        throw null;
    }

    /* renamed from: o0 */
    public final boolean mo53512o0() {
        return false;
    }

    /* renamed from: p */
    public final ClassKind mo53513p() {
        ClassKind classKind = ClassKind.ENUM_ENTRY;
        if (classKind != null) {
            return classKind;
        }
        m49705W(18);
        throw null;
    }

    /* renamed from: p0 */
    public final boolean mo53434p0() {
        return false;
    }

    /* renamed from: r */
    public final List<C25448i0> mo53514r() {
        List<C25448i0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        m49705W(22);
        throw null;
    }

    /* renamed from: r0 */
    public final MemberScope mo53515r0() {
        MemberScope.C24119a aVar = MemberScope.C24119a.f61217b;
        if (aVar != null) {
            return aVar;
        }
        m49705W(15);
        throw null;
    }

    /* renamed from: s */
    public final Modality mo53436s() {
        Modality modality = Modality.FINAL;
        if (modality != null) {
            return modality;
        }
        m49705W(19);
        throw null;
    }

    /* renamed from: s0 */
    public final C25432c mo53516s0() {
        return null;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("enum entry ");
        k.append(getName());
        return k.toString();
    }

    /* renamed from: v */
    public final C25481p<C24312z> mo53518v() {
        return null;
    }

    /* renamed from: w */
    public final boolean mo53519w() {
        return false;
    }

    /* renamed from: z */
    public final boolean mo53520z() {
        return false;
    }
}
