package androidx.constraintlayout.core;

import androidx.constraintlayout.core.C0678b;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.Comparator;
import p001a0.C0016g;
import p267u0.C6674a;

/* renamed from: androidx.constraintlayout.core.d */
public final class C0682d extends C0678b {

    /* renamed from: f */
    public SolverVariable[] f2368f = new SolverVariable[RecyclerView.C1119a0.FLAG_IGNORE];

    /* renamed from: g */
    public SolverVariable[] f2369g = new SolverVariable[RecyclerView.C1119a0.FLAG_IGNORE];

    /* renamed from: h */
    public int f2370h = 0;

    /* renamed from: i */
    public C0684b f2371i = new C0684b();

    /* renamed from: androidx.constraintlayout.core.d$a */
    public class C0683a implements Comparator<SolverVariable> {
        public final int compare(Object obj, Object obj2) {
            return ((SolverVariable) obj).f2325c - ((SolverVariable) obj2).f2325c;
        }
    }

    /* renamed from: androidx.constraintlayout.core.d$b */
    public class C0684b {

        /* renamed from: a */
        public SolverVariable f2372a;

        public C0684b() {
        }

        public final String toString() {
            String str = "[ ";
            if (this.f2372a != null) {
                for (int i = 0; i < 9; i++) {
                    StringBuilder k = C13555b.m33972k(str);
                    k.append(this.f2372a.f2331i[i]);
                    k.append(" ");
                    str = k.toString();
                }
            }
            StringBuilder t = C0016g.m36t(str, "] ");
            t.append(this.f2372a);
            return t.toString();
        }
    }

    public C0682d(C6674a aVar) {
        super(aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        if (r9 < r8) goto L_0x0051;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.constraintlayout.core.SolverVariable mo2727a(boolean[] r12) {
        /*
            r11 = this;
            r0 = 0
            r1 = -1
            r2 = 0
            r3 = -1
        L_0x0004:
            int r4 = r11.f2370h
            if (r2 >= r4) goto L_0x0057
            androidx.constraintlayout.core.SolverVariable[] r4 = r11.f2368f
            r5 = r4[r2]
            int r6 = r5.f2325c
            boolean r6 = r12[r6]
            if (r6 == 0) goto L_0x0013
            goto L_0x0054
        L_0x0013:
            androidx.constraintlayout.core.d$b r6 = r11.f2371i
            r6.f2372a = r5
            r5 = 8
            r7 = 1
            if (r3 != r1) goto L_0x0036
        L_0x001c:
            if (r5 < 0) goto L_0x0032
            androidx.constraintlayout.core.SolverVariable r4 = r6.f2372a
            float[] r4 = r4.f2331i
            r4 = r4[r5]
            r8 = 0
            int r9 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r9 <= 0) goto L_0x002a
            goto L_0x0032
        L_0x002a:
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x002f
            goto L_0x0033
        L_0x002f:
            int r5 = r5 + -1
            goto L_0x001c
        L_0x0032:
            r7 = 0
        L_0x0033:
            if (r7 == 0) goto L_0x0054
            goto L_0x0053
        L_0x0036:
            r4 = r4[r3]
        L_0x0038:
            if (r5 < 0) goto L_0x0050
            float[] r8 = r4.f2331i
            r8 = r8[r5]
            androidx.constraintlayout.core.SolverVariable r9 = r6.f2372a
            float[] r9 = r9.f2331i
            r9 = r9[r5]
            int r10 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x004b
            int r5 = r5 + -1
            goto L_0x0038
        L_0x004b:
            int r4 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x0050
            goto L_0x0051
        L_0x0050:
            r7 = 0
        L_0x0051:
            if (r7 == 0) goto L_0x0054
        L_0x0053:
            r3 = r2
        L_0x0054:
            int r2 = r2 + 1
            goto L_0x0004
        L_0x0057:
            if (r3 != r1) goto L_0x005b
            r12 = 0
            return r12
        L_0x005b:
            androidx.constraintlayout.core.SolverVariable[] r12 = r11.f2368f
            r12 = r12[r3]
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.C0682d.mo2727a(boolean[]):androidx.constraintlayout.core.SolverVariable");
    }

    /* renamed from: e */
    public final boolean mo2731e() {
        return this.f2370h == 0;
    }

    /* renamed from: i */
    public final void mo2735i(C0680c cVar, C0678b bVar, boolean z) {
        C0678b bVar2 = bVar;
        SolverVariable solverVariable = bVar2.f2346a;
        if (solverVariable != null) {
            C0678b.C0679a aVar = bVar2.f2349d;
            int f = aVar.mo2720f();
            for (int i = 0; i < f; i++) {
                SolverVariable b = aVar.mo2715b(i);
                float i2 = aVar.mo2723i(i);
                C0684b bVar3 = this.f2371i;
                bVar3.f2372a = b;
                boolean z2 = true;
                if (b.f2324b) {
                    for (int i3 = 0; i3 < 9; i3++) {
                        float[] fArr = bVar3.f2372a.f2331i;
                        float f2 = (solverVariable.f2331i[i3] * i2) + fArr[i3];
                        fArr[i3] = f2;
                        if (Math.abs(f2) < 1.0E-4f) {
                            bVar3.f2372a.f2331i[i3] = 0.0f;
                        } else {
                            z2 = false;
                        }
                    }
                    if (z2) {
                        C0682d.this.mo2757k(bVar3.f2372a);
                    }
                    z2 = false;
                } else {
                    for (int i4 = 0; i4 < 9; i4++) {
                        float f3 = solverVariable.f2331i[i4];
                        if (f3 != BitmapDescriptorFactory.HUE_RED) {
                            float f4 = f3 * i2;
                            if (Math.abs(f4) < 1.0E-4f) {
                                f4 = BitmapDescriptorFactory.HUE_RED;
                            }
                            bVar3.f2372a.f2331i[i4] = f4;
                        } else {
                            bVar3.f2372a.f2331i[i4] = 0.0f;
                        }
                    }
                }
                if (z2) {
                    mo2756j(b);
                }
                this.f2347b = (bVar2.f2347b * i2) + this.f2347b;
            }
            mo2757k(solverVariable);
        }
    }

    /* renamed from: j */
    public final void mo2756j(SolverVariable solverVariable) {
        int i;
        int i2 = this.f2370h + 1;
        SolverVariable[] solverVariableArr = this.f2368f;
        if (i2 > solverVariableArr.length) {
            SolverVariable[] solverVariableArr2 = (SolverVariable[]) Arrays.copyOf(solverVariableArr, solverVariableArr.length * 2);
            this.f2368f = solverVariableArr2;
            this.f2369g = (SolverVariable[]) Arrays.copyOf(solverVariableArr2, solverVariableArr2.length * 2);
        }
        SolverVariable[] solverVariableArr3 = this.f2368f;
        int i3 = this.f2370h;
        solverVariableArr3[i3] = solverVariable;
        int i4 = i3 + 1;
        this.f2370h = i4;
        if (i4 > 1 && solverVariableArr3[i4 - 1].f2325c > solverVariable.f2325c) {
            int i5 = 0;
            while (true) {
                i = this.f2370h;
                if (i5 >= i) {
                    break;
                }
                this.f2369g[i5] = this.f2368f[i5];
                i5++;
            }
            Arrays.sort(this.f2369g, 0, i, new C0683a());
            for (int i6 = 0; i6 < this.f2370h; i6++) {
                this.f2368f[i6] = this.f2369g[i6];
            }
        }
        solverVariable.f2324b = true;
        solverVariable.mo2707a(this);
    }

    /* renamed from: k */
    public final void mo2757k(SolverVariable solverVariable) {
        int i = 0;
        while (i < this.f2370h) {
            if (this.f2368f[i] == solverVariable) {
                while (true) {
                    int i2 = this.f2370h;
                    if (i < i2 - 1) {
                        SolverVariable[] solverVariableArr = this.f2368f;
                        int i3 = i + 1;
                        solverVariableArr[i] = solverVariableArr[i3];
                        i = i3;
                    } else {
                        this.f2370h = i2 - 1;
                        solverVariable.f2324b = false;
                        return;
                    }
                }
            } else {
                i++;
            }
        }
    }

    public final String toString() {
        StringBuilder t = C0016g.m36t("", " goal -> (");
        t.append(this.f2347b);
        t.append(") : ");
        String sb = t.toString();
        for (int i = 0; i < this.f2370h; i++) {
            this.f2371i.f2372a = this.f2368f[i];
            StringBuilder k = C13555b.m33972k(sb);
            k.append(this.f2371i);
            k.append(" ");
            sb = k.toString();
        }
        return sb;
    }
}
