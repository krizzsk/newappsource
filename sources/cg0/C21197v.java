package cg0;

import ag0.C20989e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import lh0.C24264f;
import lh0.C24274i0;
import lh0.C24287o0;
import lh0.C24299r0;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24361g;
import mf0.C24362h;
import mh0.C24378d;
import ug0.C25069e;
import xg0.C25260c;
import zf0.C25430b;
import zf0.C25432c;
import zf0.C25433c0;
import zf0.C25435d0;
import zf0.C25442g;
import zf0.C25445h;
import zf0.C25447i;
import zf0.C25448i0;
import zf0.C25478n;
import zf0.C25481p;

/* renamed from: cg0.v */
public final class C21197v extends C21198w {

    /* renamed from: b */
    public final C21198w f53118b;

    /* renamed from: c */
    public final TypeSubstitutor f53119c;

    /* renamed from: d */
    public TypeSubstitutor f53120d;

    /* renamed from: e */
    public ArrayList f53121e;

    /* renamed from: f */
    public ArrayList f53122f;

    /* renamed from: g */
    public C24264f f53123g;

    public C21197v(C21198w wVar, TypeSubstitutor typeSubstitutor) {
        this.f53118b = wVar;
        this.f53119c = typeSubstitutor;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c1 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00de A[ADDED_TO_REGION] */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void m49740W(int r15) {
        /*
            r0 = 22
            r1 = 13
            r2 = 10
            r3 = 8
            r4 = 6
            r5 = 5
            r6 = 3
            r7 = 2
            if (r15 == r7) goto L_0x001f
            if (r15 == r6) goto L_0x001f
            if (r15 == r5) goto L_0x001f
            if (r15 == r4) goto L_0x001f
            if (r15 == r3) goto L_0x001f
            if (r15 == r2) goto L_0x001f
            if (r15 == r1) goto L_0x001f
            if (r15 == r0) goto L_0x001f
            java.lang.String r8 = "@NotNull method %s.%s must not return null"
            goto L_0x0021
        L_0x001f:
            java.lang.String r8 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
        L_0x0021:
            if (r15 == r7) goto L_0x0033
            if (r15 == r6) goto L_0x0033
            if (r15 == r5) goto L_0x0033
            if (r15 == r4) goto L_0x0033
            if (r15 == r3) goto L_0x0033
            if (r15 == r2) goto L_0x0033
            if (r15 == r1) goto L_0x0033
            if (r15 == r0) goto L_0x0033
            r9 = 2
            goto L_0x0034
        L_0x0033:
            r9 = 3
        L_0x0034:
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.String r10 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor"
            r11 = 0
            if (r15 == r7) goto L_0x005b
            if (r15 == r6) goto L_0x0056
            if (r15 == r5) goto L_0x0051
            if (r15 == r4) goto L_0x0056
            if (r15 == r3) goto L_0x005b
            if (r15 == r2) goto L_0x0051
            if (r15 == r1) goto L_0x0056
            if (r15 == r0) goto L_0x004c
            r9[r11] = r10
            goto L_0x005f
        L_0x004c:
            java.lang.String r12 = "substitutor"
            r9[r11] = r12
            goto L_0x005f
        L_0x0051:
            java.lang.String r12 = "typeSubstitution"
            r9[r11] = r12
            goto L_0x005f
        L_0x0056:
            java.lang.String r12 = "kotlinTypeRefiner"
            r9[r11] = r12
            goto L_0x005f
        L_0x005b:
            java.lang.String r12 = "typeArguments"
            r9[r11] = r12
        L_0x005f:
            java.lang.String r11 = "substitute"
            java.lang.String r12 = "getUnsubstitutedMemberScope"
            java.lang.String r13 = "getMemberScope"
            r14 = 1
            switch(r15) {
                case 2: goto L_0x00bd;
                case 3: goto L_0x00bd;
                case 4: goto L_0x00ba;
                case 5: goto L_0x00bd;
                case 6: goto L_0x00bd;
                case 7: goto L_0x00ba;
                case 8: goto L_0x00bd;
                case 9: goto L_0x00ba;
                case 10: goto L_0x00bd;
                case 11: goto L_0x00ba;
                case 12: goto L_0x00b7;
                case 13: goto L_0x00bd;
                case 14: goto L_0x00b7;
                case 15: goto L_0x00b2;
                case 16: goto L_0x00ad;
                case 17: goto L_0x00a8;
                case 18: goto L_0x00a3;
                case 19: goto L_0x009e;
                case 20: goto L_0x0099;
                case 21: goto L_0x0094;
                case 22: goto L_0x00bd;
                case 23: goto L_0x0091;
                case 24: goto L_0x008c;
                case 25: goto L_0x0087;
                case 26: goto L_0x0082;
                case 27: goto L_0x007d;
                case 28: goto L_0x0078;
                case 29: goto L_0x0073;
                case 30: goto L_0x006e;
                default: goto L_0x0069;
            }
        L_0x0069:
            java.lang.String r10 = "getTypeConstructor"
            r9[r14] = r10
            goto L_0x00bf
        L_0x006e:
            java.lang.String r10 = "getSealedSubclasses"
            r9[r14] = r10
            goto L_0x00bf
        L_0x0073:
            java.lang.String r10 = "getDeclaredTypeParameters"
            r9[r14] = r10
            goto L_0x00bf
        L_0x0078:
            java.lang.String r10 = "getSource"
            r9[r14] = r10
            goto L_0x00bf
        L_0x007d:
            java.lang.String r10 = "getUnsubstitutedInnerClassesScope"
            r9[r14] = r10
            goto L_0x00bf
        L_0x0082:
            java.lang.String r10 = "getVisibility"
            r9[r14] = r10
            goto L_0x00bf
        L_0x0087:
            java.lang.String r10 = "getModality"
            r9[r14] = r10
            goto L_0x00bf
        L_0x008c:
            java.lang.String r10 = "getKind"
            r9[r14] = r10
            goto L_0x00bf
        L_0x0091:
            r9[r14] = r11
            goto L_0x00bf
        L_0x0094:
            java.lang.String r10 = "getContainingDeclaration"
            r9[r14] = r10
            goto L_0x00bf
        L_0x0099:
            java.lang.String r10 = "getOriginal"
            r9[r14] = r10
            goto L_0x00bf
        L_0x009e:
            java.lang.String r10 = "getName"
            r9[r14] = r10
            goto L_0x00bf
        L_0x00a3:
            java.lang.String r10 = "getAnnotations"
            r9[r14] = r10
            goto L_0x00bf
        L_0x00a8:
            java.lang.String r10 = "getConstructors"
            r9[r14] = r10
            goto L_0x00bf
        L_0x00ad:
            java.lang.String r10 = "getDefaultType"
            r9[r14] = r10
            goto L_0x00bf
        L_0x00b2:
            java.lang.String r10 = "getStaticScope"
            r9[r14] = r10
            goto L_0x00bf
        L_0x00b7:
            r9[r14] = r12
            goto L_0x00bf
        L_0x00ba:
            r9[r14] = r13
            goto L_0x00bf
        L_0x00bd:
            r9[r14] = r10
        L_0x00bf:
            if (r15 == r7) goto L_0x00d6
            if (r15 == r6) goto L_0x00d6
            if (r15 == r5) goto L_0x00d6
            if (r15 == r4) goto L_0x00d6
            if (r15 == r3) goto L_0x00d6
            if (r15 == r2) goto L_0x00d6
            if (r15 == r1) goto L_0x00d3
            if (r15 == r0) goto L_0x00d0
            goto L_0x00d8
        L_0x00d0:
            r9[r7] = r11
            goto L_0x00d8
        L_0x00d3:
            r9[r7] = r12
            goto L_0x00d8
        L_0x00d6:
            r9[r7] = r13
        L_0x00d8:
            java.lang.String r8 = java.lang.String.format(r8, r9)
            if (r15 == r7) goto L_0x00f2
            if (r15 == r6) goto L_0x00f2
            if (r15 == r5) goto L_0x00f2
            if (r15 == r4) goto L_0x00f2
            if (r15 == r3) goto L_0x00f2
            if (r15 == r2) goto L_0x00f2
            if (r15 == r1) goto L_0x00f2
            if (r15 == r0) goto L_0x00f2
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            r15.<init>(r8)
            goto L_0x00f7
        L_0x00f2:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            r15.<init>(r8)
        L_0x00f7:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: cg0.C21197v.m49740W(int):void");
    }

    /* renamed from: A */
    public final MemberScope mo53403A(C24287o0 o0Var, C24378d dVar) {
        if (o0Var == null) {
            m49740W(5);
            throw null;
        } else if (dVar != null) {
            MemberScope A = this.f53118b.mo53403A(o0Var, dVar);
            if (!this.f53119c.mo60249h()) {
                return new SubstitutingScope(A, mo53537l0());
            }
            if (A != null) {
                return A;
            }
            m49740W(7);
            throw null;
        } else {
            m49740W(6);
            throw null;
        }
    }

    /* renamed from: B */
    public final Collection<C25432c> mo53504B() {
        Collection<C25432c> B = this.f53118b.mo53504B();
        if (B != null) {
            return B;
        }
        m49740W(30);
        throw null;
    }

    /* renamed from: B0 */
    public final <R, D> R mo53398B0(C25447i<R, D> iVar, D d) {
        return iVar.mo60155f(this, d);
    }

    /* renamed from: C */
    public final MemberScope mo53505C(C24378d dVar) {
        if (dVar != null) {
            MemberScope C = this.f53118b.mo53505C(dVar);
            if (!this.f53119c.mo60249h()) {
                return new SubstitutingScope(C, mo53537l0());
            }
            if (C != null) {
                return C;
            }
            m49740W(14);
            throw null;
        }
        m49740W(13);
        throw null;
    }

    /* renamed from: E */
    public final boolean mo53506E() {
        return this.f53118b.mo53506E();
    }

    /* renamed from: H */
    public final C25430b mo53507H() {
        return this.f53118b.mo53507H();
    }

    /* renamed from: M0 */
    public final C25433c0 mo53404M0() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: X */
    public final MemberScope mo53405X() {
        MemberScope X = this.f53118b.mo53405X();
        if (X != null) {
            return X;
        }
        m49740W(27);
        throw null;
    }

    /* renamed from: Z */
    public final MemberScope mo53406Z() {
        MemberScope C = mo53505C(DescriptorUtilsKt.m60288i(C25260c.m63387d(this.f53118b)));
        if (C != null) {
            return C;
        }
        m49740W(12);
        throw null;
    }

    /* renamed from: a */
    public final C25432c mo53407a() {
        C25432c a = this.f53118b.mo53407a();
        if (a != null) {
            return a;
        }
        m49740W(20);
        throw null;
    }

    /* renamed from: a0 */
    public final boolean mo53427a0() {
        return this.f53118b.mo53427a0();
    }

    /* renamed from: b */
    public final C25442g mo53399b() {
        C25442g b = this.f53118b.mo53399b();
        if (b != null) {
            return b;
        }
        m49740W(21);
        throw null;
    }

    /* renamed from: c */
    public final C25445h mo53408c(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            m49740W(22);
            throw null;
        } else if (typeSubstitutor.mo60249h()) {
            return this;
        } else {
            return new C21197v(this, TypeSubstitutor.m60495f(typeSubstitutor.mo60248g(), mo53537l0().mo60248g()));
        }
    }

    /* renamed from: c0 */
    public final boolean mo53428c0() {
        return this.f53118b.mo53428c0();
    }

    /* renamed from: d0 */
    public final boolean mo53509d0() {
        return this.f53118b.mo53509d0();
    }

    /* renamed from: e */
    public final C25435d0 mo53400e() {
        return C25435d0.f63736a;
    }

    /* renamed from: g */
    public final C25478n mo53429g() {
        C25478n g = this.f53118b.mo53429g();
        if (g != null) {
            return g;
        }
        m49740W(26);
        throw null;
    }

    public final C20989e getAnnotations() {
        C20989e annotations = this.f53118b.getAnnotations();
        if (annotations != null) {
            return annotations;
        }
        m49740W(18);
        throw null;
    }

    public final C25069e getName() {
        C25069e name = this.f53118b.getName();
        if (name != null) {
            return name;
        }
        m49740W(19);
        throw null;
    }

    /* renamed from: h0 */
    public final boolean mo53510h0() {
        return this.f53118b.mo53510h0();
    }

    /* renamed from: j */
    public final C24274i0 mo53481j() {
        C24274i0 j = this.f53118b.mo53481j();
        if (!this.f53119c.mo60249h()) {
            if (this.f53123g == null) {
                TypeSubstitutor l0 = mo53537l0();
                Collection<C24307v> n = j.mo53459n();
                ArrayList arrayList = new ArrayList(n.size());
                for (C24307v k : n) {
                    arrayList.add(l0.mo60251k(k, Variance.INVARIANT));
                }
                this.f53123g = new C24264f(this, this.f53121e, arrayList, LockBasedStorageManager.f61310e);
            }
            C24264f fVar = this.f53123g;
            if (fVar != null) {
                return fVar;
            }
            m49740W(1);
            throw null;
        } else if (j != null) {
            return j;
        } else {
            m49740W(0);
            throw null;
        }
    }

    /* renamed from: k */
    public final Collection<C25430b> mo53511k() {
        Collection<C25430b> k = this.f53118b.mo53511k();
        ArrayList arrayList = new ArrayList(k.size());
        for (C25430b next : k) {
            arrayList.add(((C25430b) next.mo53474u().mo59435n(next.mo53407a()).mo59433l(next.mo53436s()).mo59436o(next.mo53429g()).mo59438q(next.mo53433p()).mo59427f().build()).mo53408c(mo53537l0()));
        }
        return arrayList;
    }

    /* renamed from: l0 */
    public final TypeSubstitutor mo53537l0() {
        if (this.f53120d == null) {
            if (this.f53119c.mo60249h()) {
                this.f53120d = this.f53119c;
            } else {
                List<C25448i0> parameters = this.f53118b.mo53481j().getParameters();
                this.f53121e = new ArrayList(parameters.size());
                this.f53120d = C24361g.m61174m0(parameters, this.f53119c.mo60248g(), this, this.f53121e);
                ArrayList arrayList = this.f53121e;
                C24362h.m61211f(arrayList, "<this>");
                ArrayList arrayList2 = new ArrayList();
                for (Object next : arrayList) {
                    if (Boolean.valueOf(!((C25448i0) next).mo53478T()).booleanValue()) {
                        arrayList2.add(next);
                    }
                }
                this.f53122f = arrayList2;
            }
        }
        return this.f53120d;
    }

    /* renamed from: n0 */
    public final MemberScope mo53411n0(C24287o0 o0Var) {
        if (o0Var != null) {
            MemberScope A = mo53403A(o0Var, DescriptorUtilsKt.m60288i(C25260c.m63387d(this)));
            if (A != null) {
                return A;
            }
            m49740W(11);
            throw null;
        }
        m49740W(10);
        throw null;
    }

    /* renamed from: o0 */
    public final boolean mo53512o0() {
        return this.f53118b.mo53512o0();
    }

    /* renamed from: p */
    public final ClassKind mo53513p() {
        ClassKind p = this.f53118b.mo53513p();
        if (p != null) {
            return p;
        }
        m49740W(24);
        throw null;
    }

    /* renamed from: p0 */
    public final boolean mo53434p0() {
        return this.f53118b.mo53434p0();
    }

    /* renamed from: q */
    public final C24312z mo53412q() {
        return KotlinTypeFactory.m60479h(C24299r0.m60973e(mo53481j().getParameters()), getAnnotations(), mo53406Z(), mo53481j(), false);
    }

    /* renamed from: r */
    public final List<C25448i0> mo53514r() {
        mo53537l0();
        ArrayList arrayList = this.f53122f;
        if (arrayList != null) {
            return arrayList;
        }
        m49740W(29);
        throw null;
    }

    /* renamed from: r0 */
    public final MemberScope mo53515r0() {
        MemberScope r0 = this.f53118b.mo53515r0();
        if (r0 != null) {
            return r0;
        }
        m49740W(15);
        throw null;
    }

    /* renamed from: s */
    public final Modality mo53436s() {
        Modality s = this.f53118b.mo53436s();
        if (s != null) {
            return s;
        }
        m49740W(25);
        throw null;
    }

    /* renamed from: s0 */
    public final C25432c mo53516s0() {
        return this.f53118b.mo53516s0();
    }

    /* renamed from: v */
    public final C25481p<C24312z> mo53518v() {
        C25481p<C24312z> v = this.f53118b.mo53518v();
        if (v == null) {
            return null;
        }
        C25069e eVar = v.f63768a;
        C24312z zVar = (C24312z) mo53518v().f63769b;
        if (zVar != null && !this.f53119c.mo60249h()) {
            zVar = (C24312z) mo53537l0().mo60251k(zVar, Variance.INVARIANT);
        }
        return new C25481p<>(eVar, zVar);
    }

    /* renamed from: w */
    public final boolean mo53519w() {
        return this.f53118b.mo53519w();
    }

    /* renamed from: z */
    public final boolean mo53520z() {
        return this.f53118b.mo53520z();
    }
}
