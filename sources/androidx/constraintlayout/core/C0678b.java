package androidx.constraintlayout.core;

import androidx.constraintlayout.core.C0680c;
import androidx.constraintlayout.core.SolverVariable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import p267u0.C6674a;

/* renamed from: androidx.constraintlayout.core.b */
public class C0678b implements C0680c.C0681a {

    /* renamed from: a */
    public SolverVariable f2346a = null;

    /* renamed from: b */
    public float f2347b = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: c */
    public ArrayList<SolverVariable> f2348c = new ArrayList<>();

    /* renamed from: d */
    public C0679a f2349d;

    /* renamed from: e */
    public boolean f2350e = false;

    /* renamed from: androidx.constraintlayout.core.b$a */
    public interface C0679a {
        /* renamed from: a */
        boolean mo2714a(SolverVariable solverVariable);

        /* renamed from: b */
        SolverVariable mo2715b(int i);

        /* renamed from: c */
        void mo2716c(SolverVariable solverVariable, float f, boolean z);

        void clear();

        /* renamed from: d */
        void mo2718d();

        /* renamed from: e */
        float mo2719e(SolverVariable solverVariable, boolean z);

        /* renamed from: f */
        int mo2720f();

        /* renamed from: g */
        float mo2721g(C0678b bVar, boolean z);

        /* renamed from: h */
        void mo2722h(SolverVariable solverVariable, float f);

        /* renamed from: i */
        float mo2723i(int i);

        /* renamed from: j */
        float mo2724j(SolverVariable solverVariable);

        /* renamed from: k */
        void mo2725k(float f);
    }

    public C0678b() {
    }

    /* renamed from: a */
    public SolverVariable mo2727a(boolean[] zArr) {
        return mo2732f(zArr, (SolverVariable) null);
    }

    /* renamed from: b */
    public final void mo2728b(C0680c cVar, int i) {
        this.f2349d.mo2722h(cVar.mo2746j(i), 1.0f);
        this.f2349d.mo2722h(cVar.mo2746j(i), -1.0f);
    }

    /* renamed from: c */
    public final void mo2729c(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f2347b = (float) i;
        }
        if (!z) {
            this.f2349d.mo2722h(solverVariable, -1.0f);
            this.f2349d.mo2722h(solverVariable2, 1.0f);
            this.f2349d.mo2722h(solverVariable3, 1.0f);
            return;
        }
        this.f2349d.mo2722h(solverVariable, 1.0f);
        this.f2349d.mo2722h(solverVariable2, -1.0f);
        this.f2349d.mo2722h(solverVariable3, -1.0f);
    }

    /* renamed from: d */
    public final void mo2730d(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f2347b = (float) i;
        }
        if (!z) {
            this.f2349d.mo2722h(solverVariable, -1.0f);
            this.f2349d.mo2722h(solverVariable2, 1.0f);
            this.f2349d.mo2722h(solverVariable3, -1.0f);
            return;
        }
        this.f2349d.mo2722h(solverVariable, 1.0f);
        this.f2349d.mo2722h(solverVariable2, -1.0f);
        this.f2349d.mo2722h(solverVariable3, 1.0f);
    }

    /* renamed from: e */
    public boolean mo2731e() {
        return this.f2346a == null && this.f2347b == BitmapDescriptorFactory.HUE_RED && this.f2349d.mo2720f() == 0;
    }

    /* renamed from: f */
    public final SolverVariable mo2732f(boolean[] zArr, SolverVariable solverVariable) {
        SolverVariable.Type type;
        int f = this.f2349d.mo2720f();
        SolverVariable solverVariable2 = null;
        float f2 = BitmapDescriptorFactory.HUE_RED;
        for (int i = 0; i < f; i++) {
            float i2 = this.f2349d.mo2723i(i);
            if (i2 < BitmapDescriptorFactory.HUE_RED) {
                SolverVariable b = this.f2349d.mo2715b(i);
                if ((zArr == null || !zArr[b.f2325c]) && b != solverVariable && (((type = b.f2332j) == SolverVariable.Type.SLACK || type == SolverVariable.Type.ERROR) && i2 < f2)) {
                    f2 = i2;
                    solverVariable2 = b;
                }
            }
        }
        return solverVariable2;
    }

    /* renamed from: g */
    public final void mo2733g(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.f2346a;
        if (solverVariable2 != null) {
            this.f2349d.mo2722h(solverVariable2, -1.0f);
            this.f2346a.f2326d = -1;
            this.f2346a = null;
        }
        float e = this.f2349d.mo2719e(solverVariable, true) * -1.0f;
        this.f2346a = solverVariable;
        if (e != 1.0f) {
            this.f2347b /= e;
            this.f2349d.mo2725k(e);
        }
    }

    /* renamed from: h */
    public final void mo2734h(C0680c cVar, SolverVariable solverVariable, boolean z) {
        if (solverVariable != null && solverVariable.f2329g) {
            float j = this.f2349d.mo2724j(solverVariable);
            this.f2347b = (solverVariable.f2328f * j) + this.f2347b;
            this.f2349d.mo2719e(solverVariable, z);
            if (z) {
                solverVariable.mo2708b(this);
            }
            if (this.f2349d.mo2720f() == 0) {
                this.f2350e = true;
                cVar.f2353a = true;
            }
        }
    }

    /* renamed from: i */
    public void mo2735i(C0680c cVar, C0678b bVar, boolean z) {
        float g = this.f2349d.mo2721g(bVar, z);
        this.f2347b = (bVar.f2347b * g) + this.f2347b;
        if (z) {
            bVar.f2346a.mo2708b(this);
        }
        if (this.f2346a != null && this.f2349d.mo2720f() == 0) {
            this.f2350e = true;
            cVar.f2353a = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r9 = this;
            androidx.constraintlayout.core.SolverVariable r0 = r9.f2346a
            if (r0 != 0) goto L_0x0007
            java.lang.String r0 = "0"
            goto L_0x0016
        L_0x0007:
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = p379.C13555b.m33972k(r0)
            androidx.constraintlayout.core.SolverVariable r1 = r9.f2346a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0016:
            java.lang.String r1 = " = "
            java.lang.String r0 = p379.C25541a.m63881k(r0, r1)
            float r1 = r9.f2347b
            r2 = 0
            r3 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x0033
            java.lang.StringBuilder r0 = p379.C13555b.m33972k(r0)
            float r1 = r9.f2347b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 1
            goto L_0x0034
        L_0x0033:
            r1 = 0
        L_0x0034:
            androidx.constraintlayout.core.b$a r4 = r9.f2349d
            int r4 = r4.mo2720f()
        L_0x003a:
            if (r3 >= r4) goto L_0x009a
            androidx.constraintlayout.core.b$a r5 = r9.f2349d
            androidx.constraintlayout.core.SolverVariable r5 = r5.mo2715b(r3)
            if (r5 != 0) goto L_0x0045
            goto L_0x0097
        L_0x0045:
            androidx.constraintlayout.core.b$a r6 = r9.f2349d
            float r6 = r6.mo2723i(r3)
            int r7 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x0050
            goto L_0x0097
        L_0x0050:
            java.lang.String r5 = r5.toString()
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0063
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0074
            java.lang.String r1 = "- "
            java.lang.String r0 = p379.C25541a.m63881k(r0, r1)
            goto L_0x0072
        L_0x0063:
            if (r7 <= 0) goto L_0x006c
            java.lang.String r1 = " + "
            java.lang.String r0 = p379.C25541a.m63881k(r0, r1)
            goto L_0x0074
        L_0x006c:
            java.lang.String r1 = " - "
            java.lang.String r0 = p379.C25541a.m63881k(r0, r1)
        L_0x0072:
            float r6 = r6 * r8
        L_0x0074:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x007f
            java.lang.String r0 = p379.C25541a.m63881k(r0, r5)
            goto L_0x0096
        L_0x007f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
        L_0x0096:
            r1 = 1
        L_0x0097:
            int r3 = r3 + 1
            goto L_0x003a
        L_0x009a:
            if (r1 != 0) goto L_0x00a2
            java.lang.String r1 = "0.0"
            java.lang.String r0 = p379.C25541a.m63881k(r0, r1)
        L_0x00a2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.C0678b.toString():java.lang.String");
    }

    public C0678b(C6674a aVar) {
        this.f2349d = new C0677a(this, aVar);
    }
}
