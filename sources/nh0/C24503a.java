package nh0;

import ag0.C20989e;
import cg0.C21173h0;
import com.usebutton.sdk.internal.models.Configuration;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.C23894a;
import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import kotlin.reflect.jvm.internal.impl.descriptors.C23903e;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C23907b;
import lh0.C24287o0;
import lh0.C24289p;
import lh0.C24307v;
import ug0.C25069e;
import zf0.C25430b;
import zf0.C25433c0;
import zf0.C25435d0;
import zf0.C25442g;
import zf0.C25452k0;
import zf0.C25453l;
import zf0.C25478n;

/* renamed from: nh0.a */
public final class C24503a extends C21173h0 {

    /* renamed from: nh0.a$a */
    public class C24504a implements C23900c.C23901a<C23903e> {
        public C24504a() {
        }

        /* renamed from: s */
        public static /* synthetic */ void m61616s(int i) {
            String str;
            int i2;
            Throwable th;
            int i3 = i;
            if (!(i3 == 1 || i3 == 3 || i3 == 5 || i3 == 10 || i3 == 12 || i3 == 14 || i3 == 16 || i3 == 18 || i3 == 30 || i3 == 7 || i3 == 8)) {
                switch (i3) {
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        break;
                    default:
                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break;
                }
            }
            str = "@NotNull method %s.%s must not return null";
            if (!(i3 == 1 || i3 == 3 || i3 == 5 || i3 == 10 || i3 == 12 || i3 == 14 || i3 == 16 || i3 == 18 || i3 == 30 || i3 == 7 || i3 == 8)) {
                switch (i3) {
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        break;
                    default:
                        i2 = 3;
                        break;
                }
            }
            i2 = 2;
            Object[] objArr = new Object[i2];
            switch (i3) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                case 14:
                case 16:
                case 18:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 30:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/types/error/ErrorSimpleFunctionDescriptorImpl$1";
                    break;
                case 2:
                    objArr[0] = "modality";
                    break;
                case 4:
                    objArr[0] = "visibility";
                    break;
                case 6:
                    objArr[0] = "kind";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case 11:
                case 17:
                    objArr[0] = Configuration.KEY_PARAMETERS;
                    break;
                case 13:
                    objArr[0] = "substitution";
                    break;
                case 15:
                    objArr[0] = "userDataKey";
                    break;
                case 19:
                    objArr[0] = "type";
                    break;
                case 29:
                    objArr[0] = "additionalAnnotations";
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i3 == 1) {
                objArr[1] = "setOwner";
            } else if (i3 == 3) {
                objArr[1] = "setModality";
            } else if (i3 == 5) {
                objArr[1] = "setVisibility";
            } else if (i3 == 10) {
                objArr[1] = "setName";
            } else if (i3 == 12) {
                objArr[1] = "setValueParameters";
            } else if (i3 == 14) {
                objArr[1] = "setSubstitution";
            } else if (i3 == 16) {
                objArr[1] = "putUserData";
            } else if (i3 == 18) {
                objArr[1] = "setTypeParameters";
            } else if (i3 == 30) {
                objArr[1] = "setAdditionalAnnotations";
            } else if (i3 == 7) {
                objArr[1] = "setKind";
            } else if (i3 != 8) {
                switch (i3) {
                    case 20:
                        objArr[1] = "setReturnType";
                        break;
                    case 21:
                        objArr[1] = "setExtensionReceiverParameter";
                        break;
                    case 22:
                        objArr[1] = "setDispatchReceiverParameter";
                        break;
                    case 23:
                        objArr[1] = "setOriginal";
                        break;
                    case 24:
                        objArr[1] = "setSignatureChange";
                        break;
                    case 25:
                        objArr[1] = "setPreserveSourceElement";
                        break;
                    case 26:
                        objArr[1] = "setDropOriginalInContainingParts";
                        break;
                    case 27:
                        objArr[1] = "setHiddenToOvercomeSignatureClash";
                        break;
                    case 28:
                        objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/error/ErrorSimpleFunctionDescriptorImpl$1";
                        break;
                }
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i3) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                case 14:
                case 16:
                case 18:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 30:
                    break;
                case 2:
                    objArr[2] = "setModality";
                    break;
                case 4:
                    objArr[2] = "setVisibility";
                    break;
                case 6:
                    objArr[2] = "setKind";
                    break;
                case 9:
                    objArr[2] = "setName";
                    break;
                case 11:
                    objArr[2] = "setValueParameters";
                    break;
                case 13:
                    objArr[2] = "setSubstitution";
                    break;
                case 15:
                    objArr[2] = "putUserData";
                    break;
                case 17:
                    objArr[2] = "setTypeParameters";
                    break;
                case 19:
                    objArr[2] = "setReturnType";
                    break;
                case 29:
                    objArr[2] = "setAdditionalAnnotations";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String format = String.format(str, objArr);
            if (!(i3 == 1 || i3 == 3 || i3 == 5 || i3 == 10 || i3 == 12 || i3 == 14 || i3 == 16 || i3 == 18 || i3 == 30 || i3 == 7 || i3 == 8)) {
                switch (i3) {
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
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
        public final C23900c.C23901a mo59421a(EmptyList emptyList) {
            if (emptyList != null) {
                return this;
            }
            m61616s(17);
            throw null;
        }

        /* renamed from: b */
        public final C23900c.C23901a<C23903e> mo59422b(List<C25452k0> list) {
            if (list != null) {
                return this;
            }
            m61616s(11);
            throw null;
        }

        public final C23900c build() {
            return C24503a.this;
        }

        /* renamed from: c */
        public final C23900c.C23901a mo59424c(Boolean bool) {
            return this;
        }

        /* renamed from: d */
        public final C23900c.C23901a<C23903e> mo59425d(C25433c0 c0Var) {
            return this;
        }

        /* renamed from: e */
        public final C23900c.C23901a<C23903e> mo59426e() {
            return this;
        }

        /* renamed from: f */
        public final C23900c.C23901a mo59427f() {
            return this;
        }

        /* renamed from: g */
        public final C23900c.C23901a<C23903e> mo59428g() {
            return this;
        }

        /* renamed from: h */
        public final C23900c.C23901a<C23903e> mo59429h(C24307v vVar) {
            if (vVar != null) {
                return this;
            }
            m61616s(19);
            throw null;
        }

        /* renamed from: i */
        public final C23900c.C23901a<C23903e> mo59430i(C20989e eVar) {
            if (eVar != null) {
                return this;
            }
            m61616s(29);
            throw null;
        }

        /* renamed from: j */
        public final C23900c.C23901a<C23903e> mo59431j(C25442g gVar) {
            if (gVar != null) {
                return this;
            }
            m61616s(0);
            throw null;
        }

        /* renamed from: k */
        public final C23900c.C23901a<C23903e> mo59432k(C24287o0 o0Var) {
            if (o0Var != null) {
                return this;
            }
            m61616s(13);
            throw null;
        }

        /* renamed from: l */
        public final C23900c.C23901a<C23903e> mo59433l(Modality modality) {
            if (modality != null) {
                return this;
            }
            m61616s(2);
            throw null;
        }

        /* renamed from: m */
        public final C23900c.C23901a<C23903e> mo59434m() {
            return this;
        }

        /* renamed from: n */
        public final C23900c.C23901a mo59435n(C25430b bVar) {
            return this;
        }

        /* renamed from: o */
        public final C23900c.C23901a<C23903e> mo59436o(C25478n nVar) {
            if (nVar != null) {
                return this;
            }
            m61616s(4);
            throw null;
        }

        /* renamed from: p */
        public final C23900c.C23901a<C23903e> mo59437p(C25069e eVar) {
            if (eVar != null) {
                return this;
            }
            m61616s(9);
            throw null;
        }

        /* renamed from: q */
        public final C23900c.C23901a<C23903e> mo59438q(CallableMemberDescriptor.Kind kind) {
            if (kind != null) {
                return this;
            }
            m61616s(6);
            throw null;
        }

        /* renamed from: r */
        public final C23900c.C23901a<C23903e> mo59439r() {
            return this;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24503a(C24289p.C24291b bVar, C24289p.C24292c cVar) {
        super(bVar, (C23903e) null, C20989e.C20990a.f52739a, C25069e.m62822k("<ERROR FUNCTION>"), CallableMemberDescriptor.Kind.DECLARATION, C25435d0.f63736a);
        if (bVar == null) {
            m61607A(0);
            throw null;
        } else if (cVar != null) {
        } else {
            m61607A(1);
            throw null;
        }
    }

    /* renamed from: A */
    public static /* synthetic */ void m61607A(int i) {
        String str = (i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 6 || i == 7) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "ownerScope";
                break;
            case 2:
                objArr[0] = "newOwner";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "annotations";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/error/ErrorSimpleFunctionDescriptorImpl";
                break;
            case 8:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 6) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/error/ErrorSimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = Configuration.KEY_COPY;
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 6:
            case 7:
                break;
            case 8:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 6 || i == 7) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: I0 */
    public final void mo53416I0(Collection<? extends CallableMemberDescriptor> collection) {
        if (collection == null) {
            m61607A(8);
            throw null;
        }
    }

    /* renamed from: L0 */
    public final CallableMemberDescriptor mo53420L0(C25442g gVar, Modality modality, C25453l lVar, CallableMemberDescriptor.Kind kind) {
        return this;
    }

    /* renamed from: N0 */
    public final C23907b mo53467N0(CallableMemberDescriptor.Kind kind, C25442g gVar, C23900c cVar, C25435d0 d0Var, C20989e eVar, C25069e eVar2) {
        if (gVar == null) {
            m61607A(2);
            throw null;
        } else if (kind == null) {
            m61607A(3);
            throw null;
        } else if (eVar != null) {
            return this;
        } else {
            m61607A(4);
            throw null;
        }
    }

    /* renamed from: V */
    public final boolean mo53424V() {
        return false;
    }

    /* renamed from: W0 */
    public final C23903e mo53469W0(C25442g gVar, Modality modality, C25453l lVar, CallableMemberDescriptor.Kind kind) {
        return this;
    }

    /* renamed from: l0 */
    public final C23900c mo53473l0(C25442g gVar, Modality modality, C25453l lVar, CallableMemberDescriptor.Kind kind) {
        return this;
    }

    /* renamed from: u */
    public final C23900c.C23901a<? extends C23903e> mo53474u() {
        return new C24504a();
    }

    /* renamed from: y0 */
    public final <V> V mo53439y0(C23894a.C23895a<V> aVar) {
        return null;
    }
}
