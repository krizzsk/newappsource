package p845um;

import bf0.C21050d;
import ce0.C21100e;
import cf0.C21136j;
import com.appboy.Constants;
import com.google.gson.internal.LinkedTreeMap;
import ff0.C23349c;
import ff0.C23350d;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kh0.C23789e;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlinx.coroutines.flow.C24206b;
import lf0.C24236l;
import lh0.C24253a;
import lh0.C24272i;
import lh0.C24274i0;
import lh0.C24299r0;
import lh0.C24306u0;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24362h;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import p069e3.C4543f;
import p389bl.C13637c;
import p404ce.C13791f;
import p404ce.C13806s;
import p406cg.C13821j;
import p627lg.C18208g;
import p863vg.C20127d;
import sf0.C24866j;
import wh0.C25157b0;
import wh0.C25171e0;
import wh0.C25192l;
import zh0.C25522c;

/* renamed from: um.a */
public class C19958a implements C13821j, C4543f, C13791f {

    /* renamed from: b */
    public static final String[] f50750b = new String[0];

    /* renamed from: c */
    public static final C19958a f50751c = new C19958a();

    /* renamed from: d */
    public static final double[] f50752d = new double[64];

    /* renamed from: a */
    public static final void m47428a(Appendable appendable, Object obj, C24236l lVar) {
        boolean z;
        C24362h.m61211f(appendable, "<this>");
        if (lVar != null) {
            appendable.append((CharSequence) lVar.invoke(obj));
            return;
        }
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof CharSequence;
        }
        if (z) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(String.valueOf(obj));
        }
    }

    /* renamed from: b */
    public static void m47429b(double[] dArr, double[]... dArr2) {
        int i;
        int i2 = 0;
        if (dArr2.length == 0) {
            for (int i3 = 0; i3 < 16; i3++) {
                int i4 = i3 + 0;
                if (i3 % 4 == i3 / 4) {
                    i = 1;
                } else {
                    i = 0;
                }
                dArr[i4] = (double) i;
            }
            return;
        }
        double[] dArr3 = f50752d;
        synchronized (dArr3) {
            m47430c(dArr3, dArr2[0], 0);
            for (int i5 = 1; i5 < dArr2.length; i5++) {
                i2 = 16 - i2;
                m47438n(dArr3, i2, dArr3, 16 - i2, dArr2[i5]);
            }
            m47430c(dArr, dArr3, i2);
        }
    }

    /* renamed from: c */
    public static void m47430c(double[] dArr, double[] dArr2, int i) {
        for (int i2 = 0; i2 < 16; i2++) {
            dArr[i2 + 0] = dArr2[i2 + i];
        }
    }

    /* renamed from: e */
    public static final Object m47431e(long j, C23349c cVar) {
        C25171e0 e0Var;
        if (j <= 0) {
            return C21050d.f52856a;
        }
        C25192l lVar = new C25192l(1, C21100e.m49351l0(cVar));
        lVar.mo61835t();
        if (j < Long.MAX_VALUE) {
            CoroutineContext.C23827a c = lVar.f63467f.mo53081c(C23350d.C23351a.f59126b);
            if (c instanceof C25171e0) {
                e0Var = (C25171e0) c;
            } else {
                e0Var = null;
            }
            if (e0Var == null) {
                e0Var = C25157b0.f63434a;
            }
            e0Var.mo53203f(j, lVar);
        }
        Object s = lVar.mo61834s();
        if (s == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return s;
        }
        return C21050d.f52856a;
    }

    /* renamed from: f */
    public static void m47432f(double[] dArr, float[] fArr) {
        for (int i = 0; i < 16; i++) {
            int i2 = i + 0;
            fArr[i2] = (float) dArr[i2];
        }
    }

    /* renamed from: h */
    public static void m47433h(int i, double[] dArr, float[] fArr) {
        for (int i2 = 0; i2 < 16; i2++) {
            dArr[i2 + i] = (double) fArr[i2 + 0];
        }
    }

    /* renamed from: i */
    public static void m47434i(float[] fArr, double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = 1.0d / (d2 - d);
        double d8 = 1.0d / (d4 - d3);
        double d9 = 1.0d / (d5 - d6);
        fArr[0] = (float) (d5 * d7 * 2.0d);
        fArr[5] = (float) (d5 * d8 * 2.0d);
        fArr[8] = (float) ((d2 + d) * d7 * 2.0d);
        fArr[9] = (float) ((d4 + d3) * d8);
        fArr[10] = (float) ((d6 + d5) * d9);
        fArr[14] = (float) (d6 * d5 * d9 * 2.0d);
    }

    /* renamed from: j */
    public static final Object m47435j(C23789e eVar, C24866j jVar) {
        C24362h.m61211f(eVar, "<this>");
        C24362h.m61211f(jVar, Constants.APPBOY_PUSH_PRIORITY_KEY);
        return eVar.invoke();
    }

    /* renamed from: k */
    public static final C24306u0 m47436k(C24306u0 u0Var, boolean z) {
        C24362h.m61211f(u0Var, "<this>");
        C24272i a = C24272i.C24273a.m60845a(u0Var, z);
        if (a != null) {
            return a;
        }
        C24312z l = m47437l(u0Var);
        if (l == null) {
            return u0Var.mo59559S0(false);
        }
        return l;
    }

    /* renamed from: l */
    public static final C24312z m47437l(C24307v vVar) {
        IntersectionTypeConstructor intersectionTypeConstructor;
        IntersectionTypeConstructor intersectionTypeConstructor2;
        C24274i0 O0 = vVar.mo60411O0();
        if (O0 instanceof IntersectionTypeConstructor) {
            intersectionTypeConstructor = (IntersectionTypeConstructor) O0;
        } else {
            intersectionTypeConstructor = null;
        }
        if (intersectionTypeConstructor == null) {
            return null;
        }
        LinkedHashSet<C24307v> linkedHashSet = intersectionTypeConstructor.f61334b;
        ArrayList arrayList = new ArrayList(C21136j.m49436X(linkedHashSet, 10));
        boolean z = false;
        for (C24307v next : linkedHashSet) {
            if (C24299r0.m60975g(next)) {
                next = m47436k(next.mo60450R0(), false);
                z = true;
            }
            arrayList.add(next);
        }
        if (!z) {
            intersectionTypeConstructor2 = null;
        } else {
            C24307v vVar2 = intersectionTypeConstructor.f61333a;
            if (vVar2 == null) {
                vVar2 = null;
            } else if (C24299r0.m60975g(vVar2)) {
                vVar2 = m47436k(vVar2.mo60450R0(), false);
            }
            arrayList.isEmpty();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList);
            linkedHashSet2.hashCode();
            intersectionTypeConstructor2 = new IntersectionTypeConstructor(linkedHashSet2);
            intersectionTypeConstructor2.f61333a = vVar2;
        }
        if (intersectionTypeConstructor2 == null) {
            return null;
        }
        return intersectionTypeConstructor2.mo60233a();
    }

    /* renamed from: n */
    public static void m47438n(double[] dArr, int i, double[] dArr2, int i2, double[] dArr3) {
        for (int i3 = 0; i3 < 4; i3++) {
            for (int i4 = 0; i4 < 4; i4++) {
                double d = 0.0d;
                for (int i5 = 0; i5 < 4; i5++) {
                    d += dArr2[C16530d.m42021o(i5, 4, i3, i2)] * dArr3[C16530d.m42021o(i4, 4, i5, 0)];
                }
                dArr[C16530d.m42021o(i4, 4, i3, i)] = d;
            }
        }
    }

    /* renamed from: o */
    public static void m47439o(double[] dArr, int i, double[] dArr2, double[] dArr3, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            double d = 0.0d;
            for (int i4 = 0; i4 < 4; i4++) {
                d += dArr2[C16530d.m42021o(i4, 4, i3, 0)] * dArr3[i4 + i2];
            }
            dArr[i3 + i] = d;
        }
    }

    /* renamed from: p */
    public static void m47440p(float[] fArr, double d, double d2) {
        double d3 = 1.0d / (d - 0.0d);
        double d4 = 1.0d / (d2 - 0.0d);
        fArr[0] = (float) (d3 * 2.0d);
        fArr[5] = (float) (2.0d * d4);
        fArr[10] = (float) -0.20202020205060944d;
        fArr[12] = (float) ((-(d + 0.0d)) * d3);
        fArr[13] = (float) ((-(d2 + 0.0d)) * d4);
        fArr[14] = (float) -1.0202020205060944d;
        fArr[15] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[11] = 0.0f;
    }

    /* renamed from: q */
    public static void m47441q(double d, double d2, double d3, double[] dArr, float[] fArr, int[] iArr, double[] dArr2) {
        double[] dArr3 = f50752d;
        synchronized (dArr3) {
            m47433h(32, dArr3, fArr);
            m47438n(dArr3, 0, dArr3, 32, dArr);
            dArr3[16] = d;
            dArr3[17] = d2;
            dArr3[18] = d3;
            dArr3[19] = 1.0d;
            m47439o(dArr3, 20, dArr3, dArr3, 16);
            double d4 = dArr3[23];
            if (d4 != 0.0d) {
                double d5 = 1.0d / d4;
                double d6 = (double) iArr[1];
                dArr2[0] = (((dArr3[20] * d5) + 1.0d) * ((double) iArr[2]) * 0.5d) + d6;
                dArr2[1] = (((dArr3[21] * d5) + 1.0d) * ((double) iArr[3]) * 0.5d) + d6;
                dArr2[2] = ((dArr3[22] * d5) + 1.0d) * 0.5d;
            }
        }
    }

    /* renamed from: r */
    public static void m47442r(double[] dArr, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        double d9 = d4 - d;
        double d11 = d5 - d2;
        double d12 = 0.0d - d3;
        double sqrt = 1.0d / Math.sqrt((d12 * d12) + ((d11 * d11) + (d9 * d9)));
        double d13 = d9 * sqrt;
        double d14 = d11 * sqrt;
        double d15 = d12 * sqrt;
        double d16 = (d14 * d8) - (d15 * d7);
        double d17 = (d15 * d6) - (d13 * d8);
        double d18 = (d13 * d7) - (d14 * d6);
        double sqrt2 = 1.0d / Math.sqrt((d18 * d18) + ((d17 * d17) + (d16 * d16)));
        double d19 = d16 * sqrt2;
        double d21 = d17 * sqrt2;
        double d22 = d18 * sqrt2;
        double d23 = (d21 * d15) - (d22 * d14);
        double d24 = (d22 * d13) - (d19 * d15);
        double d25 = (d19 * d14) - (d21 * d13);
        dArr[0] = d19;
        dArr[1] = d23;
        double d26 = -d13;
        dArr[2] = d26;
        dArr[3] = 0.0d;
        dArr[4] = d21;
        dArr[5] = d24;
        double d27 = -d14;
        dArr[6] = d27;
        dArr[7] = 0.0d;
        dArr[8] = d22;
        dArr[9] = d25;
        double d28 = -d15;
        dArr[10] = d28;
        dArr[11] = 0.0d;
        dArr[12] = (((-d19) * d) - (d21 * d2)) - (d22 * d3);
        dArr[13] = (((-d23) * d) - (d24 * d2)) - (d25 * d3);
        dArr[14] = (((-d26) * d) - (d27 * d2)) - (d28 * d3);
        dArr[15] = 1.0d;
    }

    /* renamed from: s */
    public static void m47443s(double[] dArr, double d, double d2, double d3) {
        double d4 = (0.01745329238474369d * d3) / 2.0d;
        double sin = Math.sin(d4);
        double cos = Math.cos(d4);
        double d5 = d * sin;
        double d6 = 0.0d * sin;
        double d7 = sin * d2;
        double d8 = d5 * 2.0d;
        double d9 = d5 * d8;
        double d11 = d6 * 2.0d;
        double d12 = d11 * d6;
        double d13 = 2.0d * d7;
        double d14 = d13 * d7;
        double d15 = d6 * d8;
        double d16 = d13 * cos;
        double d17 = d8 * d7;
        double d18 = d11 * cos;
        double d19 = d11 * d7;
        double d21 = d8 * cos;
        dArr[0] = (1.0d - d12) - d14;
        dArr[1] = d15 - d16;
        dArr[2] = d17 + d18;
        dArr[3] = 0.0d;
        dArr[4] = d15 + d16;
        double d22 = 1.0d - d9;
        dArr[5] = d22 - d14;
        dArr[6] = d19 - d21;
        dArr[7] = 0.0d;
        dArr[8] = d17 - d18;
        dArr[9] = d19 + d21;
        dArr[10] = d22 - d12;
        dArr[11] = 0.0d;
        dArr[14] = 0.0d;
        dArr[13] = 0.0d;
        dArr[12] = 0.0d;
        dArr[15] = 1.0d;
    }

    /* renamed from: t */
    public static void m47444t(double d, double d2, double d3, double[] dArr) {
        dArr[0] = 1.0d;
        dArr[1] = 0.0d;
        dArr[2] = 0.0d;
        dArr[3] = 0.0d;
        dArr[4] = 0.0d;
        dArr[5] = 1.0d;
        dArr[6] = 0.0d;
        dArr[7] = 0.0d;
        dArr[8] = 0.0d;
        dArr[9] = 0.0d;
        dArr[10] = 1.0d;
        dArr[11] = 0.0d;
        dArr[12] = d;
        dArr[13] = d2;
        dArr[14] = d3;
        dArr[15] = 1.0d;
    }

    /* renamed from: u */
    public static Object m47445u(C25522c cVar, C23349c cVar2) {
        return C24206b.m60673a(cVar, new ArrayList(), cVar2);
    }

    /* renamed from: v */
    public static final C24312z m47446v(C24312z zVar, C24312z zVar2) {
        C24362h.m61211f(zVar, "<this>");
        C24362h.m61211f(zVar2, "abbreviatedType");
        if (C13637c.m34082y(zVar)) {
            return zVar;
        }
        return new C24253a(zVar, zVar2);
    }

    /* renamed from: d */
    public String[] mo20045d() {
        return f50750b;
    }

    /* renamed from: g */
    public Object mo40737g() {
        return new LinkedTreeMap();
    }

    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    /* renamed from: m */
    public Object mo15m(C13806s sVar) {
        return new C20127d((C18208g) sVar.mo314b(C18208g.class));
    }
}
