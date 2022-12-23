package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import ag0.C20989e;
import cg0.C21171g0;
import cg0.C21173h0;
import java.util.ArrayList;
import jg0.C23720a;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.descriptors.C23894a;
import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import kotlin.reflect.jvm.internal.impl.descriptors.C23903e;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C23907b;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import lh0.C24307v;
import ng0.C24501a;
import p389bl.C13637c;
import ug0.C25069e;
import xg0.C25258b;
import zf0.C25435d0;
import zf0.C25442g;
import zf0.C25452k0;

public final class JavaMethodDescriptor extends C21173h0 implements C23720a {

    /* renamed from: G */
    public static final C23927a f60601G = new C23927a();

    /* renamed from: H */
    public static final C23928b f60602H = new C23928b();

    /* renamed from: E */
    public ParameterNamesStatus f60603E;

    /* renamed from: F */
    public final boolean f60604F;

    public enum ParameterNamesStatus {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);
        
        public final boolean isStable;
        public final boolean isSynthesized;

        private ParameterNamesStatus(boolean z, boolean z2) {
            this.isStable = z;
            this.isSynthesized = z2;
        }

        public static ParameterNamesStatus get(boolean z, boolean z2) {
            ParameterNamesStatus parameterNamesStatus = z ? z2 ? STABLE_SYNTHESIZED : STABLE_DECLARED : z2 ? NON_STABLE_SYNTHESIZED : NON_STABLE_DECLARED;
            if (parameterNamesStatus == null) {
                $$$reportNull$$$0(0);
            }
            return parameterNamesStatus;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor$a */
    public static class C23927a implements C23894a.C23895a<C25452k0> {
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor$b */
    public static class C23928b implements C23894a.C23895a<Boolean> {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JavaMethodDescriptor(C25442g gVar, C23903e eVar, C20989e eVar2, C25069e eVar3, CallableMemberDescriptor.Kind kind, C25435d0 d0Var, boolean z) {
        super(gVar, eVar, eVar2, eVar3, kind, d0Var);
        if (gVar == null) {
            m59001A(0);
            throw null;
        } else if (eVar2 == null) {
            m59001A(1);
            throw null;
        } else if (eVar3 == null) {
            m59001A(2);
            throw null;
        } else if (kind == null) {
            m59001A(3);
            throw null;
        } else if (d0Var != null) {
            this.f60603E = null;
            this.f60604F = z;
        } else {
            m59001A(4);
            throw null;
        }
    }

    /* renamed from: A */
    public static /* synthetic */ void m59001A(int i) {
        String str = (i == 12 || i == 17 || i == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 12 || i == 17 || i == 20) ? 2 : 3)];
        switch (i) {
            case 1:
            case 6:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 14:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 16:
                objArr[0] = "source";
                break;
            case 9:
                objArr[0] = "typeParameters";
                break;
            case 10:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
                objArr[0] = "visibility";
                break;
            case 12:
            case 17:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 18:
                objArr[0] = "enhancedValueParametersData";
                break;
            case 19:
                objArr[0] = "enhancedReturnType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 12) {
            objArr[1] = "initialize";
        } else if (i == 17) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
                objArr[2] = "initialize";
                break;
            case 12:
            case 17:
            case 20:
                break;
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 18:
            case 19:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 12 || i == 17 || i == 20) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b1 */
    public static JavaMethodDescriptor m59002b1(C25442g gVar, LazyJavaAnnotations lazyJavaAnnotations, C25069e eVar, C24501a aVar, boolean z) {
        if (gVar == null) {
            m59001A(5);
            throw null;
        } else if (eVar == null) {
            m59001A(7);
            throw null;
        } else if (aVar != null) {
            return new JavaMethodDescriptor(gVar, (C23903e) null, lazyJavaAnnotations, eVar, CallableMemberDescriptor.Kind.DECLARATION, aVar, z);
        } else {
            m59001A(8);
            throw null;
        }
    }

    /* renamed from: A0 */
    public final C23720a mo58951A0(C24307v vVar, ArrayList arrayList, C24307v vVar2, Pair pair) {
        C21171g0 g0Var;
        if (vVar2 != null) {
            ArrayList q = C13637c.m34074q(arrayList, mo53442h(), this);
            if (vVar == null) {
                g0Var = null;
            } else {
                g0Var = C25258b.m63380f(this, vVar, C20989e.C20990a.f52739a);
            }
            C23907b.C23908a aVar = (C23907b.C23908a) mo53474u();
            aVar.f60497g = q;
            aVar.mo59429h(vVar2);
            aVar.f60498h = g0Var;
            aVar.f60505o = true;
            aVar.f60504n = true;
            JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) aVar.build();
            if (pair != null) {
                javaMethodDescriptor.mo59452S0((C23894a.C23895a) pair.mo59068c(), pair.mo59069d());
            }
            if (javaMethodDescriptor != null) {
                return javaMethodDescriptor;
            }
            m59001A(20);
            throw null;
        }
        m59001A(19);
        throw null;
    }

    /* renamed from: N0 */
    public final C23907b mo53467N0(CallableMemberDescriptor.Kind kind, C25442g gVar, C23900c cVar, C25435d0 d0Var, C20989e eVar, C25069e eVar2) {
        if (gVar == null) {
            m59001A(13);
            throw null;
        } else if (kind == null) {
            m59001A(14);
            throw null;
        } else if (eVar != null) {
            C23903e eVar3 = (C23903e) cVar;
            if (eVar2 == null) {
                eVar2 = getName();
            }
            JavaMethodDescriptor javaMethodDescriptor = new JavaMethodDescriptor(gVar, eVar3, eVar, eVar2, kind, d0Var, this.f60604F);
            ParameterNamesStatus parameterNamesStatus = this.f60603E;
            javaMethodDescriptor.mo59506c1(parameterNamesStatus.isStable, parameterNamesStatus.isSynthesized);
            return javaMethodDescriptor;
        } else {
            m59001A(15);
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        if (r3.f61388b.mo60283b(r4) == false) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0064 A[SYNTHETIC] */
    /* renamed from: a1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final cg0.C21173h0 mo53472a1(cg0.C21171g0 r2, zf0.C25433c0 r3, java.util.List r4, java.util.List r5, lh0.C24307v r6, kotlin.reflect.jvm.internal.impl.descriptors.Modality r7, zf0.C25478n r8, java.util.Map r9) {
        /*
            r1 = this;
            r0 = 0
            if (r4 == 0) goto L_0x00a0
            if (r5 == 0) goto L_0x009a
            if (r8 == 0) goto L_0x0094
            super.mo53472a1(r2, r3, r4, r5, r6, r7, r8, r9)
            kotlin.reflect.jvm.internal.impl.util.OperatorChecks r2 = kotlin.reflect.jvm.internal.impl.util.OperatorChecks.f61374b
            r2.getClass()
            java.util.List<kotlin.reflect.jvm.internal.impl.util.a> r2 = kotlin.reflect.jvm.internal.impl.util.OperatorChecks.f61375c
            java.util.Iterator r2 = r2.iterator()
        L_0x0015:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x008d
            java.lang.Object r3 = r2.next()
            kotlin.reflect.jvm.internal.impl.util.a r3 = (kotlin.reflect.jvm.internal.impl.util.C24173a) r3
            r3.getClass()
            ug0.e r4 = r3.f61387a
            r5 = 0
            if (r4 == 0) goto L_0x0036
            ug0.e r4 = r1.getName()
            ug0.e r6 = r3.f61387a
            boolean r4 = mf0.C24362h.m61206a(r4, r6)
            if (r4 != 0) goto L_0x0036
            goto L_0x005e
        L_0x0036:
            kotlin.text.Regex r4 = r3.f61388b
            if (r4 == 0) goto L_0x0050
            ug0.e r4 = r1.getName()
            java.lang.String r4 = r4.mo61604f()
            java.lang.String r6 = "functionDescriptor.name.asString()"
            mf0.C24362h.m61210e(r4, r6)
            kotlin.text.Regex r6 = r3.f61388b
            boolean r4 = r6.mo60283b(r4)
            if (r4 != 0) goto L_0x0050
            goto L_0x005e
        L_0x0050:
            java.util.Collection<ug0.e> r4 = r3.f61389c
            if (r4 == 0) goto L_0x0060
            ug0.e r6 = r1.getName()
            boolean r4 = r4.contains(r6)
            if (r4 != 0) goto L_0x0060
        L_0x005e:
            r4 = 0
            goto L_0x0061
        L_0x0060:
            r4 = 1
        L_0x0061:
            if (r4 != 0) goto L_0x0064
            goto L_0x0015
        L_0x0064:
            qh0.a[] r2 = r3.f61391e
            int r4 = r2.length
        L_0x0067:
            if (r5 >= r4) goto L_0x0079
            r6 = r2[r5]
            int r5 = r5 + 1
            java.lang.String r6 = r6.mo60274a(r1)
            if (r6 == 0) goto L_0x0067
            qh0.b$b r2 = new qh0.b$b
            r2.<init>(r6)
            goto L_0x008f
        L_0x0079:
            lf0.l<kotlin.reflect.jvm.internal.impl.descriptors.c, java.lang.String> r2 = r3.f61390d
            java.lang.Object r2 = r2.invoke(r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x008a
            qh0.b$b r3 = new qh0.b$b
            r3.<init>(r2)
            r2 = r3
            goto L_0x008f
        L_0x008a:
            qh0.b$c r2 = qh0.C24772b.C24775c.f62679b
            goto L_0x008f
        L_0x008d:
            qh0.b$a r2 = qh0.C24772b.C24773a.f62678b
        L_0x008f:
            boolean r2 = r2.f62677a
            r1.f60477m = r2
            return r1
        L_0x0094:
            r2 = 11
            m59001A(r2)
            throw r0
        L_0x009a:
            r2 = 10
            m59001A(r2)
            throw r0
        L_0x00a0:
            r2 = 9
            m59001A(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor.mo53472a1(cg0.g0, zf0.c0, java.util.List, java.util.List, lh0.v, kotlin.reflect.jvm.internal.impl.descriptors.Modality, zf0.n, java.util.Map):cg0.h0");
    }

    /* renamed from: c1 */
    public final void mo59506c1(boolean z, boolean z2) {
        this.f60603E = ParameterNamesStatus.get(z, z2);
    }

    /* renamed from: j0 */
    public final boolean mo53431j0() {
        return this.f60603E.isSynthesized;
    }
}
