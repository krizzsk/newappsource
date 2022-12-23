package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import ag0.C20989e;
import cg0.C21163d;
import cg0.C21171g0;
import cg0.C21186o;
import com.usebutton.sdk.internal.models.Configuration;
import fh0.C23383a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C23825c;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.C23894a;
import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import lf0.C24225a;
import lh0.C24287o0;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24361g;
import p626lf.C18201b;
import ug0.C25069e;
import zf0.C25430b;
import zf0.C25433c0;
import zf0.C25435d0;
import zf0.C25442g;
import zf0.C25447i;
import zf0.C25448i0;
import zf0.C25452k0;
import zf0.C25453l;
import zf0.C25455m;
import zf0.C25478n;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.b */
public abstract class C23907b extends C21186o implements C23900c {

    /* renamed from: A */
    public final C23900c f60466A;

    /* renamed from: B */
    public final CallableMemberDescriptor.Kind f60467B;

    /* renamed from: C */
    public C23900c f60468C;

    /* renamed from: D */
    public Map<C23894a.C23895a<?>, Object> f60469D;

    /* renamed from: f */
    public List<C25448i0> f60470f;

    /* renamed from: g */
    public List<C25452k0> f60471g;

    /* renamed from: h */
    public C24307v f60472h;

    /* renamed from: i */
    public C25433c0 f60473i;

    /* renamed from: j */
    public C25433c0 f60474j;

    /* renamed from: k */
    public Modality f60475k;

    /* renamed from: l */
    public C25478n f60476l;

    /* renamed from: m */
    public boolean f60477m;

    /* renamed from: n */
    public boolean f60478n;

    /* renamed from: o */
    public boolean f60479o;

    /* renamed from: p */
    public boolean f60480p;

    /* renamed from: q */
    public boolean f60481q;

    /* renamed from: r */
    public boolean f60482r;

    /* renamed from: s */
    public boolean f60483s;

    /* renamed from: t */
    public boolean f60484t;

    /* renamed from: u */
    public boolean f60485u;

    /* renamed from: v */
    public boolean f60486v;

    /* renamed from: w */
    public boolean f60487w;

    /* renamed from: x */
    public boolean f60488x;

    /* renamed from: y */
    public Collection<? extends C23900c> f60489y;

    /* renamed from: z */
    public volatile C24225a<Collection<C23900c>> f60490z;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.b$a */
    public class C23908a implements C23900c.C23901a<C23900c> {

        /* renamed from: a */
        public C24287o0 f60491a;

        /* renamed from: b */
        public C25442g f60492b;

        /* renamed from: c */
        public Modality f60493c;

        /* renamed from: d */
        public C25478n f60494d;

        /* renamed from: e */
        public C23900c f60495e;

        /* renamed from: f */
        public CallableMemberDescriptor.Kind f60496f;

        /* renamed from: g */
        public List<C25452k0> f60497g;

        /* renamed from: h */
        public C25433c0 f60498h;

        /* renamed from: i */
        public C25433c0 f60499i;

        /* renamed from: j */
        public C24307v f60500j;

        /* renamed from: k */
        public C25069e f60501k;

        /* renamed from: l */
        public boolean f60502l;

        /* renamed from: m */
        public boolean f60503m;

        /* renamed from: n */
        public boolean f60504n;

        /* renamed from: o */
        public boolean f60505o;

        /* renamed from: p */
        public boolean f60506p;

        /* renamed from: q */
        public List<C25448i0> f60507q;

        /* renamed from: r */
        public C20989e f60508r;

        /* renamed from: s */
        public boolean f60509s;

        /* renamed from: t */
        public LinkedHashMap f60510t;

        /* renamed from: u */
        public Boolean f60511u;

        /* renamed from: v */
        public boolean f60512v;

        /* renamed from: w */
        public final /* synthetic */ C23907b f60513w;

        public C23908a(C23907b bVar, C24287o0 o0Var, C25442g gVar, Modality modality, C25478n nVar, CallableMemberDescriptor.Kind kind, List list, C25433c0 c0Var, C24307v vVar) {
            if (o0Var == null) {
                m58902s(0);
                throw null;
            } else if (gVar == null) {
                m58902s(1);
                throw null;
            } else if (modality == null) {
                m58902s(2);
                throw null;
            } else if (nVar == null) {
                m58902s(3);
                throw null;
            } else if (kind == null) {
                m58902s(4);
                throw null;
            } else if (list == null) {
                m58902s(5);
                throw null;
            } else if (vVar != null) {
                this.f60513w = bVar;
                this.f60495e = null;
                this.f60499i = bVar.f60474j;
                this.f60502l = true;
                this.f60503m = false;
                this.f60504n = false;
                this.f60505o = false;
                this.f60506p = bVar.f60484t;
                this.f60507q = null;
                this.f60508r = null;
                this.f60509s = bVar.f60485u;
                this.f60510t = new LinkedHashMap();
                this.f60511u = null;
                this.f60512v = false;
                this.f60491a = o0Var;
                this.f60492b = gVar;
                this.f60493c = modality;
                this.f60494d = nVar;
                this.f60496f = kind;
                this.f60497g = list;
                this.f60498h = c0Var;
                this.f60500j = vVar;
                this.f60501k = null;
            } else {
                m58902s(6);
                throw null;
            }
        }

        /* renamed from: s */
        public static /* synthetic */ void m58902s(int i) {
            String str;
            int i2;
            Throwable th;
            switch (i) {
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            switch (i) {
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
            Object[] objArr = new Object[i2];
            switch (i) {
                case 1:
                    objArr[0] = "newOwner";
                    break;
                case 2:
                    objArr[0] = "newModality";
                    break;
                case 3:
                    objArr[0] = "newVisibility";
                    break;
                case 4:
                case 13:
                    objArr[0] = "kind";
                    break;
                case 5:
                    objArr[0] = "newValueParameterDescriptors";
                    break;
                case 6:
                    objArr[0] = "newReturnType";
                    break;
                case 7:
                    objArr[0] = "owner";
                    break;
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 9:
                    objArr[0] = "modality";
                    break;
                case 11:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "name";
                    break;
                case 18:
                case 20:
                    objArr[0] = Configuration.KEY_PARAMETERS;
                    break;
                case 22:
                    objArr[0] = "type";
                    break;
                case 32:
                    objArr[0] = "additionalAnnotations";
                    break;
                case 36:
                    objArr[0] = "userDataKey";
                    break;
                default:
                    objArr[0] = "substitution";
                    break;
            }
            switch (i) {
                case 8:
                    objArr[1] = "setOwner";
                    break;
                case 10:
                    objArr[1] = "setModality";
                    break;
                case 12:
                    objArr[1] = "setVisibility";
                    break;
                case 14:
                    objArr[1] = "setKind";
                    break;
                case 15:
                    objArr[1] = "setCopyOverrides";
                    break;
                case 17:
                    objArr[1] = "setName";
                    break;
                case 19:
                    objArr[1] = "setValueParameters";
                    break;
                case 21:
                    objArr[1] = "setTypeParameters";
                    break;
                case 23:
                    objArr[1] = "setReturnType";
                    break;
                case 24:
                    objArr[1] = "setExtensionReceiverParameter";
                    break;
                case 25:
                    objArr[1] = "setDispatchReceiverParameter";
                    break;
                case 26:
                    objArr[1] = "setOriginal";
                    break;
                case 27:
                    objArr[1] = "setSignatureChange";
                    break;
                case 28:
                    objArr[1] = "setPreserveSourceElement";
                    break;
                case 29:
                    objArr[1] = "setDropOriginalInContainingParts";
                    break;
                case 30:
                    objArr[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                case 31:
                    objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                case 33:
                    objArr[1] = "setAdditionalAnnotations";
                    break;
                case 35:
                    objArr[1] = "setSubstitution";
                    break;
                case 37:
                    objArr[1] = "putUserData";
                    break;
                case 38:
                    objArr[1] = "getSubstitution";
                    break;
                case 39:
                    objArr[1] = "setJustForTypeSubstitution";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
            }
            switch (i) {
                case 7:
                    objArr[2] = "setOwner";
                    break;
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39:
                    break;
                case 9:
                    objArr[2] = "setModality";
                    break;
                case 11:
                    objArr[2] = "setVisibility";
                    break;
                case 13:
                    objArr[2] = "setKind";
                    break;
                case 16:
                    objArr[2] = "setName";
                    break;
                case 18:
                    objArr[2] = "setValueParameters";
                    break;
                case 20:
                    objArr[2] = "setTypeParameters";
                    break;
                case 22:
                    objArr[2] = "setReturnType";
                    break;
                case 32:
                    objArr[2] = "setAdditionalAnnotations";
                    break;
                case 34:
                    objArr[2] = "setSubstitution";
                    break;
                case 36:
                    objArr[2] = "putUserData";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            switch (i) {
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39:
                    th = new IllegalStateException(format);
                    break;
                default:
                    th = new IllegalArgumentException(format);
                    break;
            }
            throw th;
        }

        /* renamed from: a */
        public final C23900c.C23901a mo59421a(EmptyList emptyList) {
            if (emptyList != null) {
                this.f60507q = emptyList;
                return this;
            }
            m58902s(20);
            throw null;
        }

        /* renamed from: b */
        public final C23900c.C23901a mo59422b(List list) {
            if (list != null) {
                this.f60497g = list;
                return this;
            }
            m58902s(18);
            throw null;
        }

        public final C23900c build() {
            return this.f60513w.mo59450O0(this);
        }

        /* renamed from: c */
        public final C23900c.C23901a mo59424c(Boolean bool) {
            this.f60510t.put(JavaMethodDescriptor.f60602H, bool);
            return this;
        }

        /* renamed from: d */
        public final C23900c.C23901a mo59425d(C25433c0 c0Var) {
            this.f60499i = c0Var;
            return this;
        }

        /* renamed from: e */
        public final C23900c.C23901a mo59426e() {
            this.f60509s = true;
            return this;
        }

        /* renamed from: f */
        public final C23900c.C23901a mo59427f() {
            this.f60502l = false;
            return this;
        }

        /* renamed from: g */
        public final C23900c.C23901a mo59428g() {
            this.f60506p = true;
            return this;
        }

        /* renamed from: h */
        public final C23900c.C23901a mo59429h(C24307v vVar) {
            if (vVar != null) {
                this.f60500j = vVar;
                return this;
            }
            m58902s(22);
            throw null;
        }

        /* renamed from: i */
        public final C23900c.C23901a mo59430i(C20989e eVar) {
            if (eVar != null) {
                this.f60508r = eVar;
                return this;
            }
            m58902s(32);
            throw null;
        }

        /* renamed from: j */
        public final C23900c.C23901a mo59431j(C25442g gVar) {
            if (gVar != null) {
                this.f60492b = gVar;
                return this;
            }
            m58902s(7);
            throw null;
        }

        /* renamed from: k */
        public final C23900c.C23901a mo59432k(C24287o0 o0Var) {
            if (o0Var != null) {
                this.f60491a = o0Var;
                return this;
            }
            m58902s(34);
            throw null;
        }

        /* renamed from: l */
        public final C23900c.C23901a mo59433l(Modality modality) {
            if (modality != null) {
                this.f60493c = modality;
                return this;
            }
            m58902s(9);
            throw null;
        }

        /* renamed from: m */
        public final C23900c.C23901a mo59434m() {
            this.f60504n = true;
            return this;
        }

        /* renamed from: n */
        public final C23900c.C23901a mo59435n(C25430b bVar) {
            this.f60495e = bVar;
            return this;
        }

        /* renamed from: o */
        public final C23900c.C23901a mo59436o(C25478n nVar) {
            if (nVar != null) {
                this.f60494d = nVar;
                return this;
            }
            m58902s(11);
            throw null;
        }

        /* renamed from: p */
        public final C23900c.C23901a mo59437p(C25069e eVar) {
            if (eVar != null) {
                this.f60501k = eVar;
                return this;
            }
            m58902s(16);
            throw null;
        }

        /* renamed from: q */
        public final C23900c.C23901a mo59438q(CallableMemberDescriptor.Kind kind) {
            if (kind != null) {
                this.f60496f = kind;
                return this;
            }
            m58902s(13);
            throw null;
        }

        /* renamed from: r */
        public final C23900c.C23901a mo59439r() {
            this.f60503m = true;
            return this;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23907b(CallableMemberDescriptor.Kind kind, C25442g gVar, C23900c cVar, C25435d0 d0Var, C20989e eVar, C25069e eVar2) {
        super(gVar, eVar, eVar2, d0Var);
        if (gVar == null) {
            m58859A(0);
            throw null;
        } else if (eVar == null) {
            m58859A(1);
            throw null;
        } else if (eVar2 == null) {
            m58859A(2);
            throw null;
        } else if (kind == null) {
            m58859A(3);
            throw null;
        } else if (d0Var != null) {
            this.f60476l = C25455m.f63748i;
            this.f60477m = false;
            this.f60478n = false;
            this.f60479o = false;
            this.f60480p = false;
            this.f60481q = false;
            this.f60482r = false;
            this.f60483s = false;
            this.f60484t = false;
            this.f60485u = false;
            this.f60486v = false;
            this.f60487w = true;
            this.f60488x = false;
            this.f60489y = null;
            this.f60490z = null;
            this.f60468C = null;
            this.f60469D = null;
            this.f60466A = cVar == null ? this : cVar;
            this.f60467B = kind;
        } else {
            m58859A(4);
            throw null;
        }
    }

    /* renamed from: A */
    public static /* synthetic */ void m58859A(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 24:
            case 25:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 24:
            case 25:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "typeParameters";
                break;
            case 6:
            case 26:
            case 28:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 7:
            case 9:
                objArr[0] = "visibility";
                break;
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 24:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 10:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 11:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 15:
                objArr[0] = "overriddenDescriptors";
                break;
            case 20:
                objArr[0] = "originalSubstitutor";
                break;
            case 22:
            case 27:
            case 29:
                objArr[0] = "substitutor";
                break;
            case 23:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 8:
                objArr[1] = "initialize";
                break;
            case 12:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 13:
                objArr[1] = "getModality";
                break;
            case 14:
                objArr[1] = "getVisibility";
                break;
            case 16:
                objArr[1] = "getTypeParameters";
                break;
            case 17:
                objArr[1] = "getValueParameters";
                break;
            case 18:
                objArr[1] = "getOriginal";
                break;
            case 19:
                objArr[1] = "getKind";
                break;
            case 21:
                objArr[1] = "newCopyBuilder";
                break;
            case 24:
                objArr[1] = Configuration.KEY_COPY;
                break;
            case 25:
                objArr[1] = "getSourceToUseForCopy";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
                objArr[2] = "initialize";
                break;
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 24:
            case 25:
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 10:
                objArr[2] = "setReturnType";
                break;
            case 11:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 15:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 20:
                objArr[2] = "substitute";
                break;
            case 22:
                objArr[2] = "newCopyBuilder";
                break;
            case 23:
                objArr[2] = "doSubstitute";
                break;
            case 26:
            case 27:
            case 28:
            case 29:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 24:
            case 25:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r7v4, types: [kotlin.reflect.jvm.internal.impl.descriptors.impl.d$a] */
    /* JADX WARNING: type inference failed for: r7v5, types: [kotlin.reflect.jvm.internal.impl.descriptors.impl.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: P0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList m58860P0(kotlin.reflect.jvm.internal.impl.descriptors.C23900c r20, java.util.List r21, kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor r22, boolean r23, boolean r24, boolean[] r25) {
        /*
            r0 = r22
            r1 = 0
            if (r21 == 0) goto L_0x00b4
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r21.size()
            r2.<init>(r3)
            java.util.Iterator r3 = r21.iterator()
        L_0x0012:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00b3
            java.lang.Object r4 = r3.next()
            zf0.k0 r4 = (zf0.C25452k0) r4
            lh0.v r5 = r4.getType()
            kotlin.reflect.jvm.internal.impl.types.Variance r6 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE
            lh0.v r13 = r0.mo60251k(r5, r6)
            lh0.v r5 = r4.mo59467z0()
            if (r5 != 0) goto L_0x0030
            r6 = r1
            goto L_0x0034
        L_0x0030:
            lh0.v r6 = r0.mo60251k(r5, r6)
        L_0x0034:
            if (r13 != 0) goto L_0x0037
            return r1
        L_0x0037:
            lh0.v r7 = r4.getType()
            if (r13 != r7) goto L_0x003f
            if (r5 == r6) goto L_0x0045
        L_0x003f:
            if (r25 == 0) goto L_0x0045
            r5 = 0
            r7 = 1
            r25[r5] = r7
        L_0x0045:
            boolean r5 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.impl.C23910d.C23911a
            if (r5 == 0) goto L_0x005c
            r5 = r4
            kotlin.reflect.jvm.internal.impl.descriptors.impl.d$a r5 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.C23910d.C23911a) r5
            bf0.c r5 = r5.f60529m
            java.lang.Object r5 = r5.getValue()
            java.util.List r5 = (java.util.List) r5
            cg0.t r7 = new cg0.t
            r7.<init>(r5)
            r19 = r7
            goto L_0x005e
        L_0x005c:
            r19 = r1
        L_0x005e:
            if (r23 == 0) goto L_0x0062
            r9 = r1
            goto L_0x0063
        L_0x0062:
            r9 = r4
        L_0x0063:
            int r10 = r4.getIndex()
            ag0.e r11 = r4.getAnnotations()
            ug0.e r12 = r4.getName()
            boolean r14 = r4.mo59462F0()
            boolean r15 = r4.mo59466v0()
            boolean r16 = r4.mo59465u0()
            if (r24 == 0) goto L_0x0082
            zf0.d0 r4 = r4.mo53400e()
            goto L_0x0084
        L_0x0082:
            zf0.d0$a r4 = zf0.C25435d0.f63736a
        L_0x0084:
            java.lang.String r5 = "annotations"
            mf0.C24362h.m61211f(r11, r5)
            java.lang.String r5 = "name"
            mf0.C24362h.m61211f(r12, r5)
            java.lang.String r5 = "source"
            mf0.C24362h.m61211f(r4, r5)
            if (r19 != 0) goto L_0x00a2
            kotlin.reflect.jvm.internal.impl.descriptors.impl.d r5 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.d
            r7 = r5
            r8 = r20
            r17 = r6
            r18 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x00ae
        L_0x00a2:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.d$a r5 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.d$a
            r7 = r5
            r8 = r20
            r17 = r6
            r18 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x00ae:
            r2.add(r5)
            goto L_0x0012
        L_0x00b3:
            return r2
        L_0x00b4:
            r0 = 28
            m58859A(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.C23907b.m58860P0(kotlin.reflect.jvm.internal.impl.descriptors.c, java.util.List, kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor, boolean, boolean, boolean[]):java.util.ArrayList");
    }

    /* renamed from: B0 */
    public <R, D> R mo53398B0(C25447i<R, D> iVar, D d) {
        return iVar.mo60160k(this, d);
    }

    /* renamed from: G */
    public boolean mo53414G() {
        return this.f60481q;
    }

    /* renamed from: H0 */
    public final boolean mo53415H0() {
        return this.f60484t;
    }

    /* renamed from: I0 */
    public void mo53416I0(Collection<? extends CallableMemberDescriptor> collection) {
        if (collection != null) {
            this.f60489y = collection;
            Iterator<? extends CallableMemberDescriptor> it = collection.iterator();
            while (it.hasNext()) {
                if (((C23900c) it.next()).mo53418J0()) {
                    this.f60485u = true;
                    return;
                }
            }
            return;
        }
        m58859A(15);
        throw null;
    }

    /* renamed from: J0 */
    public final boolean mo53418J0() {
        return this.f60485u;
    }

    /* renamed from: K0 */
    public final boolean mo53419K0() {
        if (this.f60478n) {
            return true;
        }
        for (C23900c K0 : m58883a().mo53440d()) {
            if (K0.mo53419K0()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: N0 */
    public abstract C23907b mo53467N0(CallableMemberDescriptor.Kind kind, C25442g gVar, C23900c cVar, C25435d0 d0Var, C20989e eVar, C25069e eVar2);

    /* renamed from: O */
    public final C25433c0 mo53422O() {
        return this.f60474j;
    }

    /* renamed from: O0 */
    public C23907b mo59450O0(C23908a aVar) {
        C20989e eVar;
        C25435d0 d0Var;
        C21171g0 g0Var;
        C21163d dVar;
        C24307v k;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C23900c cVar;
        C23908a aVar2 = aVar;
        if (aVar2 != null) {
            boolean[] zArr = new boolean[1];
            if (aVar2.f60508r != null) {
                eVar = C18201b.m44914k(getAnnotations(), aVar2.f60508r);
            } else {
                eVar = getAnnotations();
            }
            C20989e eVar2 = eVar;
            C25442g gVar = aVar2.f60492b;
            C23900c cVar2 = aVar2.f60495e;
            CallableMemberDescriptor.Kind kind = aVar2.f60496f;
            C25069e eVar3 = aVar2.f60501k;
            if (aVar2.f60504n) {
                if (cVar2 != null) {
                    cVar = cVar2;
                } else {
                    cVar = m58883a();
                }
                d0Var = cVar.mo53400e();
            } else {
                d0Var = C25435d0.f63736a;
            }
            C25435d0 d0Var2 = d0Var;
            if (d0Var2 != null) {
                C23907b N0 = mo53467N0(kind, gVar, cVar2, d0Var2, eVar2, eVar3);
                List<C25448i0> list = aVar2.f60507q;
                if (list == null) {
                    list = getTypeParameters();
                }
                zArr[0] = zArr[0] | (!list.isEmpty());
                ArrayList arrayList = new ArrayList(list.size());
                TypeSubstitutor n0 = C24361g.m61176n0(list, aVar2.f60491a, N0, arrayList, zArr);
                if (n0 == null) {
                    return null;
                }
                C25433c0 c0Var = aVar2.f60498h;
                if (c0Var != null) {
                    C24307v k2 = n0.mo60251k(c0Var.getType(), Variance.IN_VARIANCE);
                    if (k2 == null) {
                        return null;
                    }
                    C21171g0 g0Var2 = new C21171g0(N0, new C23383a(N0, k2, aVar2.f60498h.getValue()), aVar2.f60498h.getAnnotations());
                    boolean z5 = zArr[0];
                    if (k2 != aVar2.f60498h.getType()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zArr[0] = z4 | z5;
                    g0Var = g0Var2;
                } else {
                    g0Var = null;
                }
                C25433c0 c0Var2 = aVar2.f60499i;
                if (c0Var2 != null) {
                    C21163d c = c0Var2.mo53408c(n0);
                    if (c == null) {
                        return null;
                    }
                    boolean z6 = zArr[0];
                    if (c != aVar2.f60499i) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    zArr[0] = z6 | z3;
                    dVar = c;
                } else {
                    dVar = null;
                }
                ArrayList P0 = m58860P0(N0, aVar2.f60497g, n0, aVar2.f60505o, aVar2.f60504n, zArr);
                if (P0 == null || (k = n0.mo60251k(aVar2.f60500j, Variance.OUT_VARIANCE)) == null) {
                    return null;
                }
                boolean z7 = zArr[0];
                if (k != aVar2.f60500j) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z8 = z7 | z;
                zArr[0] = z8;
                if (!z8 && aVar2.f60512v) {
                    return this;
                }
                TypeSubstitutor typeSubstitutor = n0;
                N0.mo53468Q0(g0Var, dVar, arrayList, P0, k, aVar2.f60493c, aVar2.f60494d);
                N0.f60477m = this.f60477m;
                N0.f60478n = this.f60478n;
                N0.f60479o = this.f60479o;
                N0.f60480p = this.f60480p;
                N0.f60481q = this.f60481q;
                N0.f60486v = this.f60486v;
                N0.f60482r = this.f60482r;
                N0.f60483s = this.f60483s;
                N0.mo58952T0(this.f60487w);
                N0.f60484t = aVar2.f60506p;
                N0.f60485u = aVar2.f60509s;
                Boolean bool = aVar2.f60511u;
                if (bool != null) {
                    z2 = bool.booleanValue();
                } else {
                    z2 = this.f60488x;
                }
                N0.mo58953U0(z2);
                if (!aVar2.f60510t.isEmpty() || this.f60469D != null) {
                    LinkedHashMap linkedHashMap = aVar2.f60510t;
                    Map<C23894a.C23895a<?>, Object> map = this.f60469D;
                    if (map != null) {
                        for (Map.Entry next : map.entrySet()) {
                            if (!linkedHashMap.containsKey(next.getKey())) {
                                linkedHashMap.put(next.getKey(), next.getValue());
                            }
                        }
                    }
                    if (linkedHashMap.size() == 1) {
                        N0.f60469D = Collections.singletonMap(linkedHashMap.keySet().iterator().next(), linkedHashMap.values().iterator().next());
                    } else {
                        N0.f60469D = linkedHashMap;
                    }
                }
                if (aVar2.f60503m || this.f60468C != null) {
                    C23900c cVar3 = this.f60468C;
                    if (cVar3 == null) {
                        cVar3 = this;
                    }
                    N0.f60468C = cVar3.mo53408c(typeSubstitutor);
                }
                if (aVar2.f60502l && !m58883a().mo53440d().isEmpty()) {
                    if (aVar2.f60491a.mo60435e()) {
                        C24225a<Collection<C23900c>> aVar3 = this.f60490z;
                        if (aVar3 != null) {
                            N0.f60490z = aVar3;
                        } else {
                            N0.mo53416I0(mo53440d());
                        }
                    } else {
                        N0.f60490z = new C23906a(this, typeSubstitutor);
                    }
                }
                return N0;
            }
            m58859A(25);
            throw null;
        }
        m58859A(23);
        throw null;
    }

    /* renamed from: Q0 */
    public void mo53468Q0(C21171g0 g0Var, C25433c0 c0Var, List list, List list2, C24307v vVar, Modality modality, C25478n nVar) {
        if (list == null) {
            m58859A(5);
            throw null;
        } else if (list2 == null) {
            m58859A(6);
            throw null;
        } else if (nVar != null) {
            this.f60470f = C23825c.m58499K0(list);
            this.f60471g = C23825c.m58499K0(list2);
            this.f60472h = vVar;
            this.f60475k = modality;
            this.f60476l = nVar;
            this.f60473i = g0Var;
            this.f60474j = c0Var;
            int i = 0;
            int i2 = 0;
            while (i2 < list.size()) {
                C25448i0 i0Var = (C25448i0) list.get(i2);
                if (i0Var.getIndex() == i2) {
                    i2++;
                } else {
                    throw new IllegalStateException(i0Var + " index is " + i0Var.getIndex() + " but position is " + i2);
                }
            }
            while (i < list2.size()) {
                C25452k0 k0Var = (C25452k0) list2.get(i);
                if (k0Var.getIndex() == i + 0) {
                    i++;
                } else {
                    throw new IllegalStateException(k0Var + "index is " + k0Var.getIndex() + " but position is " + i);
                }
            }
        } else {
            m58859A(7);
            throw null;
        }
    }

    /* renamed from: R */
    public final C25433c0 mo53423R() {
        return this.f60473i;
    }

    /* renamed from: R0 */
    public final C23908a mo59451R0(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor != null) {
            return new C23908a(this, typeSubstitutor.mo60248g(), mo53399b(), mo53436s(), mo53429g(), mo53433p(), mo53442h(), this.f60473i, mo53443i());
        }
        m58859A(22);
        throw null;
    }

    /* renamed from: S0 */
    public final <V> void mo59452S0(C23894a.C23895a<V> aVar, Object obj) {
        if (this.f60469D == null) {
            this.f60469D = new LinkedHashMap();
        }
        this.f60469D.put(aVar, obj);
    }

    /* renamed from: T0 */
    public void mo58952T0(boolean z) {
        this.f60487w = z;
    }

    /* renamed from: U0 */
    public void mo58953U0(boolean z) {
        this.f60488x = z;
    }

    /* renamed from: V */
    public boolean mo53424V() {
        return this.f60486v;
    }

    /* renamed from: V0 */
    public final void mo59453V0(C24312z zVar) {
        if (zVar != null) {
            this.f60472h = zVar;
        } else {
            m58859A(10);
            throw null;
        }
    }

    /* renamed from: a0 */
    public final boolean mo53427a0() {
        return this.f60483s;
    }

    /* renamed from: c0 */
    public boolean mo53428c0() {
        return this.f60479o;
    }

    /* renamed from: d */
    public Collection<? extends C23900c> mo53440d() {
        C24225a<Collection<C23900c>> aVar = this.f60490z;
        if (aVar != null) {
            this.f60489y = aVar.invoke();
            this.f60490z = null;
        }
        Collection<? extends C23900c> collection = this.f60489y;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection != null) {
            return collection;
        }
        m58859A(12);
        throw null;
    }

    /* renamed from: g */
    public final C25478n mo53429g() {
        C25478n nVar = this.f60476l;
        if (nVar != null) {
            return nVar;
        }
        m58859A(14);
        throw null;
    }

    public final List<C25448i0> getTypeParameters() {
        List<C25448i0> list = this.f60470f;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    /* renamed from: h */
    public final List<C25452k0> mo53442h() {
        List<C25452k0> list = this.f60471g;
        if (list != null) {
            return list;
        }
        m58859A(17);
        throw null;
    }

    /* renamed from: i */
    public C24307v mo53443i() {
        return this.f60472h;
    }

    /* renamed from: j0 */
    public boolean mo53431j0() {
        return this.f60488x;
    }

    /* renamed from: l0 */
    public C23900c mo53420L0(C25442g gVar, Modality modality, C25453l lVar, CallableMemberDescriptor.Kind kind) {
        C23900c build = mo53474u().mo59431j(gVar).mo59433l(modality).mo59436o(lVar).mo59438q(kind).mo59427f().build();
        if (build != null) {
            return build;
        }
        m58859A(24);
        throw null;
    }

    /* renamed from: p */
    public final CallableMemberDescriptor.Kind mo53433p() {
        CallableMemberDescriptor.Kind kind = this.f60467B;
        if (kind != null) {
            return kind;
        }
        m58859A(19);
        throw null;
    }

    /* renamed from: p0 */
    public final boolean mo53434p0() {
        return this.f60482r;
    }

    /* renamed from: q0 */
    public final boolean mo53435q0() {
        if (this.f60477m) {
            return true;
        }
        for (C23900c q0 : m58883a().mo53440d()) {
            if (q0.mo53435q0()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: s */
    public final Modality mo53436s() {
        Modality modality = this.f60475k;
        if (modality != null) {
            return modality;
        }
        m58859A(13);
        throw null;
    }

    /* renamed from: u */
    public C23900c.C23901a<? extends C23900c> mo53474u() {
        return mo59451R0(TypeSubstitutor.f61353b);
    }

    /* renamed from: w */
    public boolean mo53437w() {
        return this.f60480p;
    }

    /* renamed from: w0 */
    public final C23900c mo53438w0() {
        return this.f60468C;
    }

    /* renamed from: y0 */
    public <V> V mo53439y0(C23894a.C23895a<V> aVar) {
        Map map = this.f60469D;
        if (map == null) {
            return null;
        }
        return map.get(aVar);
    }

    /* renamed from: c */
    public C23900c m58886c(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            m58859A(20);
            throw null;
        } else if (typeSubstitutor.mo60249h()) {
            return this;
        } else {
            C23908a R0 = mo59451R0(typeSubstitutor);
            R0.f60495e = m58883a();
            R0.f60504n = true;
            R0.f60512v = true;
            return R0.build();
        }
    }

    /* renamed from: a */
    public C23900c m58882a() {
        C23900c cVar = this.f60466A;
        C23900c a = cVar == this ? this : cVar.mo53407a();
        if (a != null) {
            return a;
        }
        m58859A(18);
        throw null;
    }
}
