package kotlin.reflect.jvm.internal.impl.types.checker;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import je0.C23715f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import lh0.C24298r;
import lh0.C24306u0;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24362h;
import oh0.C24617f;
import p584jl.C17885a;

public abstract class KotlinTypePreparator extends C23715f {

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator$a */
    public static final class C24163a extends KotlinTypePreparator {

        /* renamed from: b */
        public static final C24163a f61359b = new C24163a();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: lh0.u0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: lh0.u0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: lh0.u0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: lh0.u0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: lh0.u0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: lh0.u0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: lh0.u0} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static lh0.C24312z m60505k(lh0.C24312z r16) {
        /*
            lh0.i0 r0 = r16.mo60411O0()
            boolean r1 = r0 instanceof yg0.C25303c
            r2 = 0
            r3 = 0
            r4 = 1
            r5 = 10
            if (r1 == 0) goto L_0x0083
            yg0.c r0 = (yg0.C25303c) r0
            lh0.l0 r1 = r0.f63608a
            kotlin.reflect.jvm.internal.impl.types.Variance r6 = r1.mo60241b()
            kotlin.reflect.jvm.internal.impl.types.Variance r7 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE
            if (r6 != r7) goto L_0x001a
            r3 = 1
        L_0x001a:
            if (r3 == 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r1 = r2
        L_0x001e:
            if (r1 != 0) goto L_0x0021
            goto L_0x0029
        L_0x0021:
            lh0.v r1 = r1.getType()
            lh0.u0 r2 = r1.mo60450R0()
        L_0x0029:
            r9 = r2
            kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor r1 = r0.f63609b
            if (r1 != 0) goto L_0x006b
            lh0.l0 r11 = r0.f63608a
            java.util.Collection r1 = r0.mo53459n()
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = cf0.C21136j.m49436X(r1, r5)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x0041:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0055
            java.lang.Object r3 = r1.next()
            lh0.v r3 = (lh0.C24307v) r3
            lh0.u0 r3 = r3.mo60450R0()
            r2.add(r3)
            goto L_0x0041
        L_0x0055:
            kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor r1 = new kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor
            r13 = 0
            java.lang.String r3 = "projection"
            mf0.C24362h.m61211f(r11, r3)
            kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor$1 r12 = new kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor$1
            r12.<init>(r2)
            r14 = 0
            r15 = 8
            r10 = r1
            r10.<init>(r11, r12, r13, r14, r15)
            r0.f63609b = r1
        L_0x006b:
            mh0.f r1 = new mh0.f
            kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus r7 = kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus.FOR_SUBTYPING
            kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor r8 = r0.f63609b
            mf0.C24362h.m61208c(r8)
            ag0.e r10 = r16.getAnnotations()
            boolean r11 = r16.mo60412P0()
            r12 = 32
            r6 = r1
            r6.<init>((kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus) r7, (kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor) r8, (lh0.C24306u0) r9, (ag0.C20989e) r10, (boolean) r11, (int) r12)
            return r1
        L_0x0083:
            boolean r1 = r0 instanceof zg0.C25506n
            if (r1 != 0) goto L_0x00e5
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor
            if (r1 == 0) goto L_0x00e4
            boolean r1 = r16.mo60412P0()
            if (r1 == 0) goto L_0x00e4
            kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor r0 = (kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor) r0
            java.util.LinkedHashSet<lh0.v> r1 = r0.f61334b
            java.util.ArrayList r6 = new java.util.ArrayList
            int r5 = cf0.C21136j.m49436X(r1, r5)
            r6.<init>(r5)
            java.util.Iterator r1 = r1.iterator()
        L_0x00a2:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x00bc
            java.lang.Object r3 = r1.next()
            lh0.v r3 = (lh0.C24307v) r3
            java.lang.String r5 = "<this>"
            mf0.C24362h.m61211f(r3, r5)
            lh0.u0 r3 = lh0.C24299r0.m60978j(r3, r4)
            r6.add(r3)
            r3 = 1
            goto L_0x00a2
        L_0x00bc:
            if (r3 != 0) goto L_0x00bf
            goto L_0x00db
        L_0x00bf:
            lh0.v r1 = r0.f61333a
            if (r1 != 0) goto L_0x00c4
            goto L_0x00c8
        L_0x00c4:
            lh0.u0 r2 = lh0.C24299r0.m60978j(r1, r4)
        L_0x00c8:
            r6.isEmpty()
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>(r6)
            r1.hashCode()
            kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor r3 = new kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor
            r3.<init>(r1)
            r3.f61333a = r2
            r2 = r3
        L_0x00db:
            if (r2 != 0) goto L_0x00de
            goto L_0x00df
        L_0x00de:
            r0 = r2
        L_0x00df:
            lh0.z r0 = r0.mo60233a()
            return r0
        L_0x00e4:
            return r16
        L_0x00e5:
            zg0.n r0 = (zg0.C25506n) r0
            r0.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            cf0.C21136j.m49436X(r2, r5)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator.m60505k(lh0.z):lh0.z");
    }

    /* renamed from: j */
    public final C24306u0 mo58949d(C24617f fVar) {
        C24306u0 u0Var;
        C24307v vVar;
        C24362h.m61211f(fVar, "type");
        if (fVar instanceof C24307v) {
            C24306u0 R0 = ((C24307v) fVar).mo60450R0();
            if (R0 instanceof C24312z) {
                u0Var = m60505k((C24312z) R0);
            } else if (R0 instanceof C24298r) {
                C24298r rVar = (C24298r) R0;
                C24312z k = m60505k(rVar.f61594c);
                C24312z k2 = m60505k(rVar.f61595d);
                if (k == rVar.f61594c && k2 == rVar.f61595d) {
                    u0Var = R0;
                } else {
                    u0Var = KotlinTypeFactory.m60474c(k, k2);
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
            KotlinTypePreparator$prepareType$1 kotlinTypePreparator$prepareType$1 = new KotlinTypePreparator$prepareType$1(this);
            C24362h.m61211f(u0Var, "<this>");
            C24362h.m61211f(R0, AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
            C24307v S = C17885a.m44422S(R0);
            if (S == null) {
                vVar = null;
            } else {
                vVar = (C24307v) kotlinTypePreparator$prepareType$1.invoke(S);
            }
            return C17885a.m44395D0(u0Var, vVar);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
