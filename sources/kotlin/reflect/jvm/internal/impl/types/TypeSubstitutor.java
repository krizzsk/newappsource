package kotlin.reflect.jvm.internal.impl.types;

import ag0.C20989e;
import ag0.C20994g;
import ce0.C21100e;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C23816b;
import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import kotlin.reflect.jvm.internal.impl.builtins.C23872e;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt;
import lh0.C24253a;
import lh0.C24269h;
import lh0.C24274i0;
import lh0.C24278k0;
import lh0.C24281l0;
import lh0.C24282m;
import lh0.C24285n0;
import lh0.C24287o0;
import lh0.C24289p;
import lh0.C24297q0;
import lh0.C24298r;
import lh0.C24299r0;
import lh0.C24302s0;
import lh0.C24305u;
import lh0.C24306u0;
import lh0.C24307v;
import lh0.C24311y;
import lh0.C24312z;
import mf0.C24361g;
import mf0.C24362h;
import p389bl.C13637c;
import p584jl.C17885a;
import p845um.C19958a;
import yg0.C25302b;
import zf0.C25448i0;

public final class TypeSubstitutor {

    /* renamed from: b */
    public static final TypeSubstitutor f61353b = m60494e(C24287o0.f61584a);

    /* renamed from: a */
    public final C24287o0 f61354a;

    public static final class SubstitutionException extends Exception {
        public SubstitutionException() {
            super("Out-projection in in-position");
        }
    }

    public enum VarianceConflictType {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor$a */
    public static /* synthetic */ class C24161a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f61355a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor$VarianceConflictType[] r0 = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.VarianceConflictType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f61355a = r0
                kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor$VarianceConflictType r1 = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.VarianceConflictType.OUT_IN_IN_POSITION     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f61355a     // Catch:{ NoSuchFieldError -> 0x001d }
                kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor$VarianceConflictType r1 = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.VarianceConflictType.IN_IN_OUT_POSITION     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f61355a     // Catch:{ NoSuchFieldError -> 0x0028 }
                kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor$VarianceConflictType r1 = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.VarianceConflictType.NO_CONFLICT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.C24161a.<clinit>():void");
        }
    }

    public TypeSubstitutor(C24287o0 o0Var) {
        if (o0Var != null) {
            this.f61354a = o0Var;
        } else {
            m60490a(7);
            throw null;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m60490a(int i) {
        String str;
        int i2;
        Throwable th;
        if (!(i == 1 || i == 2 || i == 8 || i == 34 || i == 37)) {
            switch (i) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                            }
                    }
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i == 1 || i == 2 || i == 8 || i == 34 || i == 37)) {
            switch (i) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            i2 = 3;
                                            break;
                                    }
                            }
                    }
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            case 3:
                objArr[0] = "first";
                break;
            case 4:
                objArr[0] = "second";
                break;
            case 5:
                objArr[0] = "substitutionContext";
                break;
            case 6:
                objArr[0] = AppActionRequest.KEY_CONTEXT;
                break;
            case 9:
            case 14:
                objArr[0] = "type";
                break;
            case 10:
            case 15:
                objArr[0] = "howThisTypeIsUsed";
                break;
            case 16:
            case 17:
            case 36:
                objArr[0] = "typeProjection";
                break;
            case 18:
            case 28:
                objArr[0] = "originalProjection";
                break;
            case 26:
                objArr[0] = "originalType";
                break;
            case 27:
                objArr[0] = "substituted";
                break;
            case 33:
                objArr[0] = "annotations";
                break;
            case 35:
            case 38:
                objArr[0] = "typeParameterVariance";
                break;
            case 39:
                objArr[0] = "projectionKind";
                break;
            default:
                objArr[0] = "substitution";
                break;
        }
        if (i == 1) {
            objArr[1] = "replaceWithNonApproximatingSubstitution";
        } else if (i == 2) {
            objArr[1] = "replaceWithContravariantApproximatingSubstitution";
        } else if (i == 8) {
            objArr[1] = "getSubstitution";
        } else if (i != 34) {
            if (i != 37) {
                switch (i) {
                    case 11:
                    case 12:
                    case 13:
                        objArr[1] = "safeSubstitute";
                        break;
                    default:
                        switch (i) {
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                                objArr[1] = "unsafeSubstitute";
                                break;
                            default:
                                switch (i) {
                                    case 29:
                                    case 30:
                                    case 31:
                                    case 32:
                                        objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                        break;
                                    default:
                                        switch (i) {
                                            case 40:
                                            case 41:
                                            case 42:
                                                break;
                                            default:
                                                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                                break;
                                        }
                                }
                        }
                }
            }
            objArr[1] = "combine";
        } else {
            objArr[1] = "filterOutUnsafeVariance";
        }
        switch (i) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                break;
            case 3:
            case 4:
                objArr[2] = "createChainedSubstitutor";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            case 9:
            case 10:
                objArr[2] = "safeSubstitute";
                break;
            case 14:
            case 15:
            case 16:
                objArr[2] = "substitute";
                break;
            case 17:
                objArr[2] = "substituteWithoutApproximation";
                break;
            case 18:
                objArr[2] = "unsafeSubstitute";
                break;
            case 26:
            case 27:
            case 28:
                objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                break;
            case 33:
                objArr[2] = "filterOutUnsafeVariance";
                break;
            case 35:
            case 36:
            case 38:
            case 39:
                objArr[2] = "combine";
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i == 1 || i == 2 || i == 8 || i == 34 || i == 37)) {
            switch (i) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            th = new IllegalArgumentException(format);
                                            break;
                                    }
                            }
                    }
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    /* renamed from: b */
    public static Variance m60491b(Variance variance, Variance variance2) {
        if (variance == null) {
            m60490a(38);
            throw null;
        } else if (variance2 != null) {
            Variance variance3 = Variance.INVARIANT;
            if (variance == variance3) {
                if (variance2 != null) {
                    return variance2;
                }
                m60490a(40);
                throw null;
            } else if (variance2 == variance3) {
                if (variance != null) {
                    return variance;
                }
                m60490a(41);
                throw null;
            } else if (variance != variance2) {
                throw new AssertionError("Variance conflict: type parameter variance '" + variance + "' and " + "projection kind '" + variance2 + "' cannot be combined");
            } else if (variance2 != null) {
                return variance2;
            } else {
                m60490a(42);
                throw null;
            }
        } else {
            m60490a(39);
            throw null;
        }
    }

    /* renamed from: c */
    public static VarianceConflictType m60492c(Variance variance, Variance variance2) {
        Variance variance3 = Variance.IN_VARIANCE;
        if (variance == variance3 && variance2 == Variance.OUT_VARIANCE) {
            return VarianceConflictType.OUT_IN_IN_POSITION;
        }
        if (variance == Variance.OUT_VARIANCE && variance2 == variance3) {
            return VarianceConflictType.IN_IN_OUT_POSITION;
        }
        return VarianceConflictType.NO_CONFLICT;
    }

    /* renamed from: d */
    public static TypeSubstitutor m60493d(C24307v vVar) {
        if (vVar != null) {
            return m60494e(C24278k0.f61571b.mo60438b(vVar.mo60411O0(), vVar.mo60410N0()));
        }
        m60490a(6);
        throw null;
    }

    /* renamed from: e */
    public static TypeSubstitutor m60494e(C24287o0 o0Var) {
        if (o0Var != null) {
            return new TypeSubstitutor(o0Var);
        }
        m60490a(0);
        throw null;
    }

    /* renamed from: f */
    public static TypeSubstitutor m60495f(C24287o0 o0Var, C24287o0 o0Var2) {
        if (o0Var == null) {
            m60490a(3);
            throw null;
        } else if (o0Var2 != null) {
            int i = C24282m.f61573d;
            if (o0Var.mo60435e()) {
                o0Var = o0Var2;
            } else if (!o0Var2.mo60435e()) {
                o0Var = new C24282m(o0Var, o0Var2);
            }
            return m60494e(o0Var);
        } else {
            m60490a(4);
            throw null;
        }
    }

    /* renamed from: j */
    public static String m60496j(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (!C24361g.m61156Z(th)) {
                return "[Exception while computing toString(): " + th + "]";
            }
            throw th;
        }
    }

    /* renamed from: g */
    public final C24287o0 mo60248g() {
        C24287o0 o0Var = this.f61354a;
        if (o0Var != null) {
            return o0Var;
        }
        m60490a(8);
        throw null;
    }

    /* renamed from: h */
    public final boolean mo60249h() {
        return this.f61354a.mo60435e();
    }

    /* renamed from: i */
    public final C24307v mo60250i(C24307v vVar, Variance variance) {
        if (vVar == null) {
            m60490a(9);
            throw null;
        } else if (variance == null) {
            m60490a(10);
            throw null;
        } else if (mo60249h()) {
            return vVar;
        } else {
            try {
                C24307v type = mo60252l(new C24285n0(vVar, variance), (C25448i0) null, 0).getType();
                if (type != null) {
                    return type;
                }
                m60490a(12);
                throw null;
            } catch (SubstitutionException e) {
                return C24289p.m60914d(e.getMessage());
            }
        }
    }

    /* renamed from: k */
    public final C24307v mo60251k(C24307v vVar, Variance variance) {
        if (vVar == null) {
            m60490a(14);
            throw null;
        } else if (variance != null) {
            C24281l0 n0Var = new C24285n0(mo60248g().mo60436f(vVar, variance), variance);
            if (!mo60249h()) {
                try {
                    n0Var = mo60252l(n0Var, (C25448i0) null, 0);
                } catch (SubstitutionException unused) {
                    n0Var = null;
                }
            }
            if (this.f61354a.mo60433a() || this.f61354a.mo60439b()) {
                n0Var = CapturedTypeApproximationKt.m60531b(n0Var, this.f61354a.mo60439b());
            }
            if (n0Var == null) {
                return null;
            }
            return n0Var.getType();
        } else {
            m60490a(15);
            throw null;
        }
    }

    /* renamed from: l */
    public final C24281l0 mo60252l(C24281l0 l0Var, C25448i0 i0Var, int i) throws SubstitutionException {
        C24253a aVar;
        C24312z zVar;
        Variance variance;
        TypeSubstitutor typeSubstitutor;
        C24269h hVar;
        C24307v vVar;
        C24269h hVar2;
        boolean z;
        C24307v vVar2 = null;
        if (l0Var != null) {
            C24287o0 o0Var = this.f61354a;
            if (i > 100) {
                StringBuilder k = C13555b.m33972k("Recursion too deep. Most likely infinite loop while substituting ");
                k.append(m60496j(l0Var));
                k.append("; substitution: ");
                k.append(m60496j(o0Var));
                throw new IllegalStateException(k.toString());
            } else if (l0Var.mo60240a()) {
                return l0Var;
            } else {
                C24307v type = l0Var.getType();
                if (type instanceof C24302s0) {
                    C24302s0 s0Var = (C24302s0) type;
                    C24306u0 W = s0Var.mo60413W();
                    C24307v l0 = s0Var.mo60415l0();
                    C24281l0 l = mo60252l(new C24285n0(W, l0Var.mo60241b()), i0Var, i + 1);
                    if (l.mo60240a()) {
                        return l;
                    }
                    C24307v k2 = mo60251k(l0, l0Var.mo60241b());
                    C24306u0 R0 = l.getType().mo60450R0();
                    if (k2 instanceof C24302s0) {
                        k2 = ((C24302s0) k2).mo60415l0();
                    }
                    return new C24285n0(C17885a.m44395D0(R0, k2), l.mo60241b());
                } else if (C24361g.m61151U(type) || (type.mo60450R0() instanceof C24311y)) {
                    return l0Var;
                } else {
                    C24281l0 d = this.f61354a.mo59555d(type);
                    if (d == null) {
                        d = null;
                    } else if (type.getAnnotations().mo53070b1(C23872e.C23873a.f60386x)) {
                        C24274i0 O0 = d.getType().mo60411O0();
                        if (O0 instanceof NewCapturedTypeConstructor) {
                            C24281l0 l0Var2 = ((NewCapturedTypeConstructor) O0).f61360a;
                            Variance b = l0Var2.mo60241b();
                            VarianceConflictType c = m60492c(l0Var.mo60241b(), b);
                            VarianceConflictType varianceConflictType = VarianceConflictType.OUT_IN_IN_POSITION;
                            if (c == varianceConflictType) {
                                d = new C24285n0(l0Var2.getType());
                            } else if (i0Var != null && m60492c(i0Var.mo53482l(), b) == varianceConflictType) {
                                d = new C24285n0(l0Var2.getType());
                            }
                        }
                    }
                    Variance b2 = l0Var.mo60241b();
                    if (d == null && C21100e.m49356o0(type)) {
                        C24306u0 R02 = type.mo60450R0();
                        if (R02 instanceof C24269h) {
                            hVar2 = (C24269h) R02;
                        } else {
                            hVar2 = null;
                        }
                        if (hVar2 == null) {
                            z = false;
                        } else {
                            z = hVar2.mo60427A();
                        }
                        if (!z) {
                            C24298r rVar = (C24298r) type.mo60450R0();
                            int i2 = i + 1;
                            C24281l0 l2 = mo60252l(new C24285n0(rVar.f61594c, b2), i0Var, i2);
                            C24281l0 l3 = mo60252l(new C24285n0(rVar.f61595d, b2), i0Var, i2);
                            Variance b3 = l2.mo60241b();
                            if (l2.getType() == rVar.f61594c && l3.getType() == rVar.f61595d) {
                                return l0Var;
                            }
                            return new C24285n0(KotlinTypeFactory.m60474c(C24361g.m61170k(l2.getType()), C24361g.m61170k(l3.getType())), b3);
                        }
                    }
                    if (C23867c.m58675F(type) || C13637c.m34082y(type)) {
                        return l0Var;
                    }
                    if (d != null) {
                        VarianceConflictType c2 = m60492c(b2, d.mo60241b());
                        if (!(type.mo60411O0() instanceof C25302b)) {
                            int i3 = C24161a.f61355a[c2.ordinal()];
                            if (i3 == 1) {
                                throw new SubstitutionException();
                            } else if (i3 == 2) {
                                return new C24285n0(type.mo60411O0().mo53458m().mo59393p(), Variance.OUT_VARIANCE);
                            }
                        }
                        C24306u0 R03 = type.mo60450R0();
                        if (R03 instanceof C24269h) {
                            hVar = (C24269h) R03;
                        } else {
                            hVar = null;
                        }
                        if (hVar == null || !hVar.mo60427A()) {
                            hVar = null;
                        }
                        if (d.mo60240a()) {
                            return d;
                        }
                        if (hVar != null) {
                            vVar = hVar.mo60428C(d.getType());
                        } else {
                            vVar = C24299r0.m60979k(d.getType(), type.mo60412P0());
                        }
                        if (!type.getAnnotations().isEmpty()) {
                            C20989e c3 = this.f61354a.mo60434c(type.getAnnotations());
                            if (c3 != null) {
                                if (c3.mo53070b1(C23872e.C23873a.f60386x)) {
                                    c3 = new C20994g(c3, new C24297q0());
                                }
                                vVar = TypeUtilsKt.m60526k(vVar, new CompositeAnnotations((List<? extends C20989e>) C23816b.m58452h1(new C20989e[]{vVar.getAnnotations(), c3})));
                            } else {
                                m60490a(33);
                                throw null;
                            }
                        }
                        if (c2 == VarianceConflictType.NO_CONFLICT) {
                            b2 = m60491b(b2, d.mo60241b());
                        }
                        return new C24285n0(vVar, b2);
                    }
                    C24307v type2 = l0Var.getType();
                    Variance b4 = l0Var.mo60241b();
                    if (type2.mo60411O0().mo53460o() instanceof C25448i0) {
                        return l0Var;
                    }
                    C24306u0 R04 = type2.mo60450R0();
                    if (R04 instanceof C24253a) {
                        aVar = (C24253a) R04;
                    } else {
                        aVar = null;
                    }
                    if (aVar == null) {
                        zVar = null;
                    } else {
                        zVar = aVar.f61537d;
                    }
                    if (zVar != null) {
                        C24287o0 o0Var2 = this.f61354a;
                        if (!(o0Var2 instanceof C24305u) || !o0Var2.mo60439b()) {
                            typeSubstitutor = this;
                        } else {
                            C24305u uVar = (C24305u) this.f61354a;
                            typeSubstitutor = new TypeSubstitutor(new C24305u(uVar.f61604b, uVar.f61605c, false));
                        }
                        vVar2 = typeSubstitutor.mo60251k(zVar, Variance.INVARIANT);
                    }
                    List<C25448i0> parameters = type2.mo60411O0().getParameters();
                    List<C24281l0> N0 = type2.mo60410N0();
                    ArrayList arrayList = new ArrayList(parameters.size());
                    boolean z2 = false;
                    for (int i4 = 0; i4 < parameters.size(); i4++) {
                        C25448i0 i0Var2 = parameters.get(i4);
                        C24281l0 l0Var3 = N0.get(i4);
                        C24281l0 l4 = mo60252l(l0Var3, i0Var2, i + 1);
                        int i5 = C24161a.f61355a[m60492c(i0Var2.mo53482l(), l4.mo60241b()).ordinal()];
                        if (i5 == 1 || i5 == 2) {
                            l4 = C24299r0.m60981m(i0Var2);
                        } else if (i5 == 3 && i0Var2.mo53482l() != (variance = Variance.INVARIANT) && !l4.mo60240a()) {
                            l4 = new C24285n0(l4.getType(), variance);
                        }
                        if (l4 != l0Var3) {
                            z2 = true;
                        }
                        arrayList.add(l4);
                    }
                    if (z2) {
                        N0 = arrayList;
                    }
                    C20989e c4 = this.f61354a.mo60434c(type2.getAnnotations());
                    C24362h.m61211f(N0, "newArguments");
                    C24362h.m61211f(c4, "newAnnotations");
                    C24307v j0 = C24361g.m61169j0(type2, N0, c4, 4);
                    if ((j0 instanceof C24312z) && (vVar2 instanceof C24312z)) {
                        j0 = C19958a.m47446v((C24312z) j0, (C24312z) vVar2);
                    }
                    return new C24285n0(j0, b4);
                }
            }
        } else {
            m60490a(18);
            throw null;
        }
    }
}
