package cg0;

import eh0.C23310f;
import kh0.C23789e;
import kh0.C23792h;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import lf0.C24225a;
import lh0.C24287o0;
import lh0.C24299r0;
import lh0.C24312z;
import mh0.C24378d;
import ug0.C25069e;
import xg0.C25260c;
import zf0.C25432c;
import zf0.C25433c0;
import zf0.C25437e;
import zf0.C25442g;
import zf0.C25447i;

/* renamed from: cg0.b */
public abstract class C21154b extends C21198w {

    /* renamed from: b */
    public final C25069e f53010b;

    /* renamed from: c */
    public final C23789e<C24312z> f53011c;

    /* renamed from: d */
    public final C23789e<MemberScope> f53012d;

    /* renamed from: e */
    public final C23789e<C25433c0> f53013e;

    /* renamed from: cg0.b$a */
    public class C21155a implements C24225a<C24312z> {
        public C21155a() {
        }

        public final Object invoke() {
            C21154b bVar = C21154b.this;
            return C24299r0.m60983o(bVar, bVar.mo53406Z(), new C21152a(this));
        }
    }

    /* renamed from: cg0.b$b */
    public class C21156b implements C24225a<MemberScope> {
        public C21156b() {
        }

        public final Object invoke() {
            return new C23310f(C21154b.this.mo53406Z());
        }
    }

    /* renamed from: cg0.b$c */
    public class C21157c implements C24225a<C25433c0> {
        public C21157c() {
        }

        public final Object invoke() {
            return new C21196u(C21154b.this);
        }
    }

    public C21154b(C23792h hVar, C25069e eVar) {
        if (hVar == null) {
            m49451W(0);
            throw null;
        } else if (eVar != null) {
            this.f53010b = eVar;
            this.f53011c = hVar.mo59019d(new C21155a());
            this.f53012d = hVar.mo59019d(new C21156b());
            this.f53013e = hVar.mo59019d(new C21157c());
        } else {
            m49451W(1);
            throw null;
        }
    }

    /* renamed from: W */
    public static /* synthetic */ void m49451W(int i) {
        int i2 = i;
        String str = (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5 || i2 == 8 || i2 == 11 || i2 == 13 || i2 == 15 || i2 == 16 || i2 == 18 || i2 == 19) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5 || i2 == 8 || i2 == 11 || i2 == 13 || i2 == 15 || i2 == 16 || i2 == 18 || i2 == 19) ? 2 : 3)];
        switch (i2) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 6:
            case 12:
                objArr[0] = "typeArguments";
                break;
            case 7:
            case 10:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 9:
            case 14:
                objArr[0] = "typeSubstitution";
                break;
            case 17:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i2 == 2) {
            objArr[1] = "getName";
        } else if (i2 == 3) {
            objArr[1] = "getOriginal";
        } else if (i2 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i2 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i2 == 8 || i2 == 11 || i2 == 13 || i2 == 15) {
            objArr[1] = "getMemberScope";
        } else if (i2 == 16) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i2 == 18) {
            objArr[1] = "substitute";
        } else if (i2 != 19) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i2) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 19:
                break;
            case 6:
            case 7:
            case 9:
            case 10:
            case 12:
            case 14:
                objArr[2] = "getMemberScope";
                break;
            case 17:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5 || i2 == 8 || i2 == 11 || i2 == 13 || i2 == 15 || i2 == 16 || i2 == 18 || i2 == 19) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: A */
    public MemberScope mo53403A(C24287o0 o0Var, C24378d dVar) {
        if (o0Var == null) {
            m49451W(9);
            throw null;
        } else if (dVar == null) {
            m49451W(10);
            throw null;
        } else if (o0Var.mo60435e()) {
            MemberScope C = mo53505C(dVar);
            if (C != null) {
                return C;
            }
            m49451W(11);
            throw null;
        } else {
            return new SubstitutingScope(mo53505C(dVar), TypeSubstitutor.m60494e(o0Var));
        }
    }

    /* renamed from: B0 */
    public final <R, D> R mo53398B0(C25447i<R, D> iVar, D d) {
        return iVar.mo60155f(this, d);
    }

    /* renamed from: M0 */
    public final C25433c0 mo53404M0() {
        C25433c0 c0Var = (C25433c0) this.f53013e.invoke();
        if (c0Var != null) {
            return c0Var;
        }
        m49451W(5);
        throw null;
    }

    /* renamed from: X */
    public MemberScope mo53405X() {
        MemberScope memberScope = (MemberScope) this.f53012d.invoke();
        if (memberScope != null) {
            return memberScope;
        }
        m49451W(4);
        throw null;
    }

    /* renamed from: Z */
    public MemberScope mo53406Z() {
        MemberScope C = mo53505C(DescriptorUtilsKt.m60288i(C25260c.m63387d(this)));
        if (C != null) {
            return C;
        }
        m49451W(16);
        throw null;
    }

    /* renamed from: a */
    public final C25432c mo53407a() {
        return this;
    }

    /* renamed from: a */
    public final C25437e m49458a() {
        return this;
    }

    /* renamed from: a */
    public final C25442g m49459a() {
        return this;
    }

    public final C25069e getName() {
        C25069e eVar = this.f53010b;
        if (eVar != null) {
            return eVar;
        }
        m49451W(2);
        throw null;
    }

    /* renamed from: l0 */
    public C25432c mo53408c(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            m49451W(17);
            throw null;
        } else if (typeSubstitutor.mo60249h()) {
            return this;
        } else {
            return new C21197v(this, typeSubstitutor);
        }
    }

    /* renamed from: n0 */
    public final MemberScope mo53411n0(C24287o0 o0Var) {
        if (o0Var != null) {
            MemberScope A = mo53403A(o0Var, DescriptorUtilsKt.m60288i(C25260c.m63387d(this)));
            if (A != null) {
                return A;
            }
            m49451W(15);
            throw null;
        }
        m49451W(14);
        throw null;
    }

    /* renamed from: q */
    public final C24312z mo53412q() {
        C24312z zVar = (C24312z) this.f53011c.invoke();
        if (zVar != null) {
            return zVar;
        }
        m49451W(19);
        throw null;
    }
}
