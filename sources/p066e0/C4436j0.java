package p066e0;

import a30.C0072d;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ld0.C24220a;
import p283v4.C6859d;
import p359ag.C13452i;
import p483fe.C16953a;
import p836ud.C19885a;
import p988j$.util.DesugarCollections;
import ud0.C25017a;
import ud0.C25024h;

/* renamed from: e0.j0 */
public final class C4436j0 implements C16953a, C24220a {

    /* renamed from: b */
    public Object f15501b;

    public /* synthetic */ C4436j0(Object obj) {
        this.f15501b = obj;
    }

    /* renamed from: f */
    public static ArrayList m11622f(long j, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C6859d dVar = (C6859d) it.next();
            if (dVar.mo23111a().longValue() >= j) {
                arrayList2.add(dVar);
            }
        }
        return arrayList2;
    }

    /* renamed from: a */
    public final String[] mo19955a() {
        ((C25024h) this.f15501b).mo58356b(C25017a.m62725b((String) null, 2, 1, (String[]) null));
        return new String[0];
    }

    /* renamed from: b */
    public final String[] mo19956b(String[] strArr) {
        ((C25024h) this.f15501b).mo58356b(C25017a.m62725b((String) null, 3, 0, strArr));
        ((C25024h) this.f15501b).mo58356b(C25017a.m62725b((String) null, 1, 1, strArr));
        return new String[0];
    }

    /* renamed from: c */
    public final void mo19957c(C13452i iVar) {
        ((C25024h) this.f15501b).mo58356b(C25017a.m62725b(iVar.toString(), 0, 1, (String[]) null));
    }

    /* renamed from: d */
    public final void mo19958d(String[] strArr) {
    }

    /* renamed from: e */
    public final boolean mo19959e(Class cls) {
        for (C4433i0 i0Var : (List) this.f15501b) {
            if (cls.isAssignableFrom(i0Var.getClass())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final C4433i0 mo19960g(Class cls) {
        for (C4433i0 i0Var : (List) this.f15501b) {
            if (i0Var.getClass() == cls) {
                return i0Var;
            }
        }
        return null;
    }

    /* renamed from: h */
    public final float mo19961h(String str, Object obj) {
        HashMap hashMap;
        float[] fArr;
        if (((HashMap) this.f15501b).containsKey(obj) && (hashMap = (HashMap) ((HashMap) this.f15501b).get(obj)) != null && hashMap.containsKey(str) && (fArr = (float[]) hashMap.get(str)) != null && fArr.length > 0) {
            return fArr[0];
        }
        return Float.NaN;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v19, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v22, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v25, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v32, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v35, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v28, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v31, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v34, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v37, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v41, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v44, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v47, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v50, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v53, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v40, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v43, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v46, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v49, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v59, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v62, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v65, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v68, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v71, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v75, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v79, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v38, resolved type: double[][]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19962i() {
        /*
            r17 = this;
            r0 = r17
            java.lang.Object r1 = r0.f15501b
            r2 = r1
            double[][] r2 = (double[][]) r2
            r3 = 0
            r2 = r2[r3]
            r4 = r2[r3]
            r2 = r1
            double[][] r2 = (double[][]) r2
            r2 = r2[r3]
            r6 = r2[r3]
            double r4 = r4 * r6
            r2 = r1
            double[][] r2 = (double[][]) r2
            r2 = r2[r3]
            r6 = 1
            r7 = r2[r6]
            r2 = r1
            double[][] r2 = (double[][]) r2
            r2 = r2[r3]
            r9 = r2[r6]
            double r7 = r7 * r9
            double r7 = r7 + r4
            r2 = r1
            double[][] r2 = (double[][]) r2
            r2 = r2[r3]
            r4 = 2
            r9 = r2[r4]
            double[][] r1 = (double[][]) r1
            r1 = r1[r3]
            r11 = r1[r4]
            double r9 = r9 * r11
            double r9 = r9 + r7
            double r1 = java.lang.Math.sqrt(r9)
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r1 = r7 / r1
            java.lang.Object r5 = r0.f15501b
            r9 = r5
            double[][] r9 = (double[][]) r9
            r9 = r9[r3]
            r10 = r9[r3]
            double r10 = r10 * r1
            r9[r3] = r10
            r9 = r5
            double[][] r9 = (double[][]) r9
            r9 = r9[r3]
            r10 = r9[r6]
            double r10 = r10 * r1
            r9[r6] = r10
            r9 = r5
            double[][] r9 = (double[][]) r9
            r9 = r9[r3]
            r10 = r9[r4]
            double r10 = r10 * r1
            r9[r4] = r10
            r9 = r5
            double[][] r9 = (double[][]) r9
            r9 = r9[r3]
            r10 = 3
            r11 = r9[r10]
            double r11 = r11 * r1
            r9[r10] = r11
            r1 = r5
            double[][] r1 = (double[][]) r1
            r1 = r1[r6]
            r11 = r1[r3]
            r1 = r5
            double[][] r1 = (double[][]) r1
            r1 = r1[r6]
            r13 = r1[r3]
            double r11 = r11 * r13
            r1 = r5
            double[][] r1 = (double[][]) r1
            r1 = r1[r6]
            r13 = r1[r6]
            r1 = r5
            double[][] r1 = (double[][]) r1
            r1 = r1[r6]
            r15 = r1[r6]
            double r13 = r13 * r15
            double r13 = r13 + r11
            r1 = r5
            double[][] r1 = (double[][]) r1
            r1 = r1[r6]
            r11 = r1[r4]
            double[][] r5 = (double[][]) r5
            r1 = r5[r6]
            r15 = r1[r4]
            double r11 = r11 * r15
            double r11 = r11 + r13
            double r1 = java.lang.Math.sqrt(r11)
            double r1 = r7 / r1
            java.lang.Object r5 = r0.f15501b
            r9 = r5
            double[][] r9 = (double[][]) r9
            r9 = r9[r6]
            r11 = r9[r3]
            double r11 = r11 * r1
            r9[r3] = r11
            r9 = r5
            double[][] r9 = (double[][]) r9
            r9 = r9[r6]
            r11 = r9[r6]
            double r11 = r11 * r1
            r9[r6] = r11
            r9 = r5
            double[][] r9 = (double[][]) r9
            r9 = r9[r6]
            r11 = r9[r4]
            double r11 = r11 * r1
            r9[r4] = r11
            r9 = r5
            double[][] r9 = (double[][]) r9
            r9 = r9[r6]
            r11 = r9[r10]
            double r11 = r11 * r1
            r9[r10] = r11
            r1 = r5
            double[][] r1 = (double[][]) r1
            r1 = r1[r4]
            r11 = r1[r3]
            r1 = r5
            double[][] r1 = (double[][]) r1
            r1 = r1[r4]
            r13 = r1[r3]
            double r11 = r11 * r13
            r1 = r5
            double[][] r1 = (double[][]) r1
            r1 = r1[r4]
            r13 = r1[r6]
            r1 = r5
            double[][] r1 = (double[][]) r1
            r1 = r1[r4]
            r15 = r1[r6]
            double r13 = r13 * r15
            double r13 = r13 + r11
            r1 = r5
            double[][] r1 = (double[][]) r1
            r1 = r1[r4]
            r11 = r1[r4]
            double[][] r5 = (double[][]) r5
            r1 = r5[r4]
            r15 = r1[r4]
            double r11 = r11 * r15
            double r11 = r11 + r13
            double r1 = java.lang.Math.sqrt(r11)
            double r1 = r7 / r1
            java.lang.Object r5 = r0.f15501b
            r9 = r5
            double[][] r9 = (double[][]) r9
            r9 = r9[r4]
            r11 = r9[r3]
            double r11 = r11 * r1
            r9[r3] = r11
            r9 = r5
            double[][] r9 = (double[][]) r9
            r9 = r9[r4]
            r11 = r9[r6]
            double r11 = r11 * r1
            r9[r6] = r11
            r9 = r5
            double[][] r9 = (double[][]) r9
            r9 = r9[r4]
            r11 = r9[r4]
            double r11 = r11 * r1
            r9[r4] = r11
            r9 = r5
            double[][] r9 = (double[][]) r9
            r9 = r9[r4]
            r11 = r9[r10]
            double r11 = r11 * r1
            r9[r10] = r11
            r1 = r5
            double[][] r1 = (double[][]) r1
            r1 = r1[r10]
            r11 = r1[r3]
            r1 = r5
            double[][] r1 = (double[][]) r1
            r1 = r1[r10]
            r13 = r1[r3]
            double r11 = r11 * r13
            r1 = r5
            double[][] r1 = (double[][]) r1
            r1 = r1[r10]
            r13 = r1[r6]
            r1 = r5
            double[][] r1 = (double[][]) r1
            r1 = r1[r10]
            r15 = r1[r6]
            double r13 = r13 * r15
            double r13 = r13 + r11
            r1 = r5
            double[][] r1 = (double[][]) r1
            r1 = r1[r10]
            r11 = r1[r4]
            double[][] r5 = (double[][]) r5
            r1 = r5[r10]
            r15 = r1[r4]
            double r11 = r11 * r15
            double r11 = r11 + r13
            double r1 = java.lang.Math.sqrt(r11)
            double r1 = r7 / r1
            java.lang.Object r5 = r0.f15501b
            r9 = r5
            double[][] r9 = (double[][]) r9
            r9 = r9[r10]
            r11 = r9[r3]
            double r11 = r11 * r1
            r9[r3] = r11
            r9 = r5
            double[][] r9 = (double[][]) r9
            r9 = r9[r10]
            r11 = r9[r6]
            double r11 = r11 * r1
            r9[r6] = r11
            r9 = r5
            double[][] r9 = (double[][]) r9
            r9 = r9[r10]
            r11 = r9[r4]
            double r11 = r11 * r1
            r9[r4] = r11
            r9 = r5
            double[][] r9 = (double[][]) r9
            r9 = r9[r10]
            r11 = r9[r10]
            double r11 = r11 * r1
            r9[r10] = r11
            r1 = r5
            double[][] r1 = (double[][]) r1
            r2 = 4
            r1 = r1[r2]
            r11 = r1[r3]
            r1 = r5
            double[][] r1 = (double[][]) r1
            r1 = r1[r2]
            r13 = r1[r3]
            double r11 = r11 * r13
            r1 = r5
            double[][] r1 = (double[][]) r1
            r1 = r1[r2]
            r13 = r1[r6]
            r1 = r5
            double[][] r1 = (double[][]) r1
            r1 = r1[r2]
            r15 = r1[r6]
            double r13 = r13 * r15
            double r13 = r13 + r11
            r1 = r5
            double[][] r1 = (double[][]) r1
            r1 = r1[r2]
            r11 = r1[r4]
            double[][] r5 = (double[][]) r5
            r1 = r5[r2]
            r15 = r1[r4]
            double r11 = r11 * r15
            double r11 = r11 + r13
            double r11 = java.lang.Math.sqrt(r11)
            double r11 = r7 / r11
            java.lang.Object r1 = r0.f15501b
            r5 = r1
            double[][] r5 = (double[][]) r5
            r5 = r5[r2]
            r13 = r5[r3]
            double r13 = r13 * r11
            r5[r3] = r13
            r5 = r1
            double[][] r5 = (double[][]) r5
            r5 = r5[r2]
            r13 = r5[r6]
            double r13 = r13 * r11
            r5[r6] = r13
            r5 = r1
            double[][] r5 = (double[][]) r5
            r5 = r5[r2]
            r13 = r5[r4]
            double r13 = r13 * r11
            r5[r4] = r13
            r5 = r1
            double[][] r5 = (double[][]) r5
            r2 = r5[r2]
            r13 = r2[r10]
            double r13 = r13 * r11
            r2[r10] = r13
            r2 = r1
            double[][] r2 = (double[][]) r2
            r5 = 5
            r2 = r2[r5]
            r11 = r2[r3]
            r2 = r1
            double[][] r2 = (double[][]) r2
            r2 = r2[r5]
            r13 = r2[r3]
            double r11 = r11 * r13
            r2 = r1
            double[][] r2 = (double[][]) r2
            r2 = r2[r5]
            r13 = r2[r6]
            r2 = r1
            double[][] r2 = (double[][]) r2
            r2 = r2[r5]
            r15 = r2[r6]
            double r13 = r13 * r15
            double r13 = r13 + r11
            r2 = r1
            double[][] r2 = (double[][]) r2
            r2 = r2[r5]
            r11 = r2[r4]
            double[][] r1 = (double[][]) r1
            r1 = r1[r5]
            r15 = r1[r4]
            double r11 = r11 * r15
            double r11 = r11 + r13
            double r1 = java.lang.Math.sqrt(r11)
            double r7 = r7 / r1
            java.lang.Object r1 = r0.f15501b
            r2 = r1
            double[][] r2 = (double[][]) r2
            r2 = r2[r5]
            r11 = r2[r3]
            double r11 = r11 * r7
            r2[r3] = r11
            r2 = r1
            double[][] r2 = (double[][]) r2
            r2 = r2[r5]
            r11 = r2[r6]
            double r11 = r11 * r7
            r2[r6] = r11
            r2 = r1
            double[][] r2 = (double[][]) r2
            r2 = r2[r5]
            r11 = r2[r4]
            double r11 = r11 * r7
            r2[r4] = r11
            double[][] r1 = (double[][]) r1
            r1 = r1[r5]
            r2 = r1[r10]
            double r2 = r2 * r7
            r1[r10] = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p066e0.C4436j0.mo19962i():void");
    }

    /* renamed from: j */
    public final boolean mo19963j(float f, float f2, float f3, float f4) {
        int i;
        for (int i2 = 0; i2 < 6; i2++) {
            Object obj = this.f15501b;
            double d = ((double[][]) obj)[i2][0];
            double d2 = (double) f;
            double d3 = (double) f2;
            if ((((double[][]) obj)[i2][1] * d3) + (d * d2) + ((double[][]) obj)[i2][3] > 0.0d) {
                i = 1;
            } else {
                i = 0;
            }
            double d4 = ((double[][]) obj)[i2][0];
            double d5 = d2;
            double d6 = (double) f3;
            if ((((double[][]) obj)[i2][1] * d3) + (d4 * d6) + ((double[][]) obj)[i2][3] > 0.0d) {
                i++;
            }
            double d7 = (double) f4;
            if ((((double[][]) obj)[i2][1] * d7) + (((double[][]) obj)[i2][0] * d5) + ((double[][]) obj)[i2][3] > 0.0d) {
                i++;
            }
            if ((((double[][]) obj)[i2][1] * d7) + (((double[][]) obj)[i2][0] * d6) + ((double[][]) obj)[i2][3] > 0.0d) {
                i++;
            }
            if ((((double[][]) obj)[i2][1] * d3) + (((double[][]) obj)[i2][0] * d5) + ((double[][]) obj)[i2][3] > 0.0d) {
                i++;
            }
            if ((((double[][]) obj)[i2][1] * d3) + (((double[][]) obj)[i2][0] * d6) + ((double[][]) obj)[i2][3] > 0.0d) {
                i++;
            }
            if ((((double[][]) obj)[i2][1] * d7) + (((double[][]) obj)[i2][0] * d5) + ((double[][]) obj)[i2][3] > 0.0d) {
                i++;
            }
            if ((((double[][]) obj)[i2][1] * d7) + (((double[][]) obj)[i2][0] * d6) + ((double[][]) obj)[i2][3] > 0.0d) {
                i++;
            }
            if (i == 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    public final void mo5859n(Bundle bundle) {
        ((C19885a) this.f15501b).mo52166a("clx", "_ae", bundle);
    }

    public C4436j0(int i) {
        if (i != 7) {
            this.f15501b = new HashMap();
        } else {
            this.f15501b = DesugarCollections.synchronizedMap(new HashMap());
        }
    }

    public /* synthetic */ C4436j0(C0072d dVar) {
        this.f15501b = dVar;
    }

    public /* synthetic */ C4436j0(ArrayList arrayList) {
        this.f15501b = new ArrayList(arrayList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x03e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C4436j0(float[] r53, double[] r54) {
        /*
            r52 = this;
            r1 = r52
            r2 = r53
            r3 = r54
            r52.<init>()
            r0 = 2
            int[] r0 = new int[r0]
            r0 = {6, 4} // fill-array
            java.lang.Class r4 = java.lang.Double.TYPE
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r4, r0)
            double[][] r0 = (double[][]) r0
            r1.f15501b = r0
            r4 = 16
            r5 = 0
            double[] r4 = new double[r4]     // Catch:{ Exception -> 0x03b4 }
            r6 = r3[r5]     // Catch:{ Exception -> 0x03b4 }
            r8 = r2[r5]     // Catch:{ Exception -> 0x03b4 }
            double r9 = (double) r8     // Catch:{ Exception -> 0x03b4 }
            double r6 = r6 * r9
            r9 = 1
            r10 = r3[r9]     // Catch:{ Exception -> 0x03b4 }
            r12 = 4
            r12 = r2[r12]     // Catch:{ Exception -> 0x03b4 }
            double r13 = (double) r12     // Catch:{ Exception -> 0x03b4 }
            double r13 = r13 * r10
            double r13 = r13 + r6
            r6 = 2
            r6 = r3[r6]     // Catch:{ Exception -> 0x03b4 }
            r15 = 8
            r15 = r2[r15]     // Catch:{ Exception -> 0x03b4 }
            r17 = r10
            double r9 = (double) r15     // Catch:{ Exception -> 0x03b4 }
            double r9 = r9 * r6
            double r9 = r9 + r13
            r11 = 3
            r13 = r3[r11]     // Catch:{ Exception -> 0x03b4 }
            r11 = 12
            r11 = r2[r11]     // Catch:{ Exception -> 0x03b4 }
            r20 = r6
            double r5 = (double) r11     // Catch:{ Exception -> 0x03b4 }
            double r5 = r5 * r13
            double r5 = r5 + r9
            r7 = 0
            r4[r7] = r5     // Catch:{ Exception -> 0x03b4 }
            r9 = r3[r7]     // Catch:{ Exception -> 0x03b4 }
            r7 = 1
            r7 = r2[r7]     // Catch:{ Exception -> 0x03b4 }
            r22 = r5
            double r5 = (double) r7     // Catch:{ Exception -> 0x03b4 }
            double r5 = r5 * r9
            r16 = 5
            r1 = r2[r16]     // Catch:{ Exception -> 0x03b4 }
            r24 = r11
            r19 = r12
            double r11 = (double) r1     // Catch:{ Exception -> 0x03b4 }
            double r11 = r11 * r17
            double r11 = r11 + r5
            r5 = 9
            r5 = r2[r5]     // Catch:{ Exception -> 0x03b4 }
            r6 = r0
            r17 = r1
            double r0 = (double) r5     // Catch:{ Exception -> 0x03b4 }
            double r0 = r0 * r20
            double r0 = r0 + r11
            r11 = 13
            r11 = r2[r11]     // Catch:{ Exception -> 0x03b4 }
            r12 = r5
            r18 = r6
            double r5 = (double) r11     // Catch:{ Exception -> 0x03b4 }
            double r5 = r5 * r13
            double r5 = r5 + r0
            r0 = 1
            r4[r0] = r5     // Catch:{ Exception -> 0x03b4 }
            r1 = 2
            r1 = r2[r1]     // Catch:{ Exception -> 0x03b4 }
            double r5 = (double) r1     // Catch:{ Exception -> 0x03b4 }
            double r5 = r5 * r9
            r25 = r3[r0]     // Catch:{ Exception -> 0x03b4 }
            r0 = 6
            r0 = r2[r0]     // Catch:{ Exception -> 0x03b4 }
            r27 = r11
            r28 = r12
            double r11 = (double) r0     // Catch:{ Exception -> 0x03b4 }
            double r11 = r11 * r25
            double r11 = r11 + r5
            r5 = 10
            r5 = r2[r5]     // Catch:{ Exception -> 0x03b4 }
            r29 = r0
            r6 = r1
            double r0 = (double) r5     // Catch:{ Exception -> 0x03b4 }
            double r0 = r0 * r20
            double r0 = r0 + r11
            r11 = 14
            r11 = r2[r11]     // Catch:{ Exception -> 0x03b4 }
            r12 = r5
            r20 = r6
            double r5 = (double) r11     // Catch:{ Exception -> 0x03b4 }
            double r5 = r5 * r13
            double r5 = r5 + r0
            r0 = 2
            r4[r0] = r5     // Catch:{ Exception -> 0x03b4 }
            r0 = 3
            r0 = r2[r0]     // Catch:{ Exception -> 0x03b4 }
            double r5 = (double) r0     // Catch:{ Exception -> 0x03b4 }
            double r9 = r9 * r5
            r1 = 7
            r1 = r2[r1]     // Catch:{ Exception -> 0x03b4 }
            double r5 = (double) r1     // Catch:{ Exception -> 0x03b4 }
            double r25 = r25 * r5
            double r25 = r25 + r9
            r5 = 2
            r5 = r3[r5]     // Catch:{ Exception -> 0x03b4 }
            r9 = 11
            r9 = r2[r9]     // Catch:{ Exception -> 0x03b4 }
            r10 = r0
            r21 = r1
            double r0 = (double) r9     // Catch:{ Exception -> 0x03b4 }
            double r5 = r5 * r0
            double r5 = r5 + r25
            r0 = 15
            r0 = r2[r0]     // Catch:{ Exception -> 0x03b4 }
            double r1 = (double) r0     // Catch:{ Exception -> 0x03b4 }
            double r13 = r13 * r1
            double r13 = r13 + r5
            r1 = 3
            r4[r1] = r13     // Catch:{ Exception -> 0x03b4 }
            r1 = 4
            r1 = r3[r1]     // Catch:{ Exception -> 0x03b4 }
            double r5 = (double) r8     // Catch:{ Exception -> 0x03b4 }
            double r1 = r1 * r5
            r5 = r3[r16]     // Catch:{ Exception -> 0x03b4 }
            r25 = r13
            r13 = r19
            r14 = r8
            r19 = r9
            double r8 = (double) r13     // Catch:{ Exception -> 0x03b4 }
            double r8 = r8 * r5
            double r8 = r8 + r1
            r1 = 6
            r1 = r3[r1]     // Catch:{ Exception -> 0x03b4 }
            r30 = r13
            r31 = r14
            double r13 = (double) r15     // Catch:{ Exception -> 0x03b4 }
            double r13 = r13 * r1
            double r13 = r13 + r8
            r8 = 7
            r8 = r3[r8]     // Catch:{ Exception -> 0x03b4 }
            r33 = r10
            r32 = r15
            r15 = r24
            r24 = r11
            double r10 = (double) r15     // Catch:{ Exception -> 0x03b4 }
            double r10 = r10 * r8
            double r10 = r10 + r13
            r13 = 4
            r4[r13] = r10     // Catch:{ Exception -> 0x03b4 }
            r13 = r3[r13]     // Catch:{ Exception -> 0x03b4 }
            r34 = r10
            double r10 = (double) r7     // Catch:{ Exception -> 0x03b4 }
            double r10 = r10 * r13
            r36 = r7
            r37 = r13
            r7 = r17
            r17 = r12
            double r12 = (double) r7     // Catch:{ Exception -> 0x03b4 }
            double r5 = r5 * r12
            double r5 = r5 + r10
            r10 = r28
            double r11 = (double) r10     // Catch:{ Exception -> 0x03b4 }
            double r11 = r11 * r1
            double r11 = r11 + r5
            r5 = r27
            double r13 = (double) r5     // Catch:{ Exception -> 0x03b4 }
            double r13 = r13 * r8
            double r13 = r13 + r11
            r4[r16] = r13     // Catch:{ Exception -> 0x03b4 }
            r6 = r20
            double r11 = (double) r6     // Catch:{ Exception -> 0x03b4 }
            double r11 = r11 * r37
            r27 = r3[r16]     // Catch:{ Exception -> 0x03b4 }
            r20 = r6
            r39 = r13
            r13 = r29
            r14 = r5
            double r5 = (double) r13     // Catch:{ Exception -> 0x03b4 }
            double r5 = r5 * r27
            double r5 = r5 + r11
            r29 = r13
            r11 = r17
            double r12 = (double) r11     // Catch:{ Exception -> 0x03b4 }
            double r1 = r1 * r12
            double r1 = r1 + r5
            r5 = r24
            double r12 = (double) r5     // Catch:{ Exception -> 0x03b4 }
            double r12 = r12 * r8
            double r12 = r12 + r1
            r1 = 6
            r4[r1] = r12     // Catch:{ Exception -> 0x03b4 }
            r41 = r12
            r1 = r33
            double r12 = (double) r1     // Catch:{ Exception -> 0x03b4 }
            double r12 = r12 * r37
            r24 = r5
            r2 = r21
            double r5 = (double) r2     // Catch:{ Exception -> 0x03b4 }
            double r27 = r27 * r5
            double r27 = r27 + r12
            r5 = 6
            r5 = r3[r5]     // Catch:{ Exception -> 0x03b4 }
            r17 = r14
            r12 = r19
            double r13 = (double) r12     // Catch:{ Exception -> 0x03b4 }
            double r5 = r5 * r13
            double r5 = r5 + r27
            double r13 = (double) r0     // Catch:{ Exception -> 0x03b4 }
            double r8 = r8 * r13
            double r8 = r8 + r5
            r5 = 7
            r4[r5] = r8     // Catch:{ Exception -> 0x03b4 }
            r5 = 8
            r5 = r3[r5]     // Catch:{ Exception -> 0x03b4 }
            r27 = r8
            r13 = r31
            double r8 = (double) r13     // Catch:{ Exception -> 0x03b4 }
            double r5 = r5 * r8
            r8 = 9
            r8 = r3[r8]     // Catch:{ Exception -> 0x03b4 }
            r19 = r12
            r31 = r13
            r14 = r30
            double r12 = (double) r14     // Catch:{ Exception -> 0x03b4 }
            double r12 = r12 * r8
            double r12 = r12 + r5
            r5 = 10
            r5 = r3[r5]     // Catch:{ Exception -> 0x03b4 }
            r21 = r0
            r33 = r1
            r30 = r14
            r14 = r32
            double r0 = (double) r14     // Catch:{ Exception -> 0x03b4 }
            double r0 = r0 * r5
            double r0 = r0 + r12
            r12 = 11
            r12 = r3[r12]     // Catch:{ Exception -> 0x03b4 }
            r37 = r5
            double r5 = (double) r15     // Catch:{ Exception -> 0x03b4 }
            double r5 = r5 * r12
            double r5 = r5 + r0
            r0 = 8
            r4[r0] = r5     // Catch:{ Exception -> 0x03b4 }
            r0 = r3[r0]     // Catch:{ Exception -> 0x03b4 }
            r43 = r5
            r32 = r14
            r6 = r15
            r5 = r36
            double r14 = (double) r5     // Catch:{ Exception -> 0x03b4 }
            double r14 = r14 * r0
            r36 = r5
            r45 = r6
            double r5 = (double) r7     // Catch:{ Exception -> 0x03b4 }
            double r8 = r8 * r5
            double r8 = r8 + r14
            double r5 = (double) r10     // Catch:{ Exception -> 0x03b4 }
            double r5 = r5 * r37
            double r5 = r5 + r8
            r8 = r17
            double r14 = (double) r8     // Catch:{ Exception -> 0x03b4 }
            double r14 = r14 * r12
            double r14 = r14 + r5
            r5 = 9
            r4[r5] = r14     // Catch:{ Exception -> 0x03b4 }
            r46 = r14
            r6 = r20
            double r14 = (double) r6     // Catch:{ Exception -> 0x03b4 }
            double r14 = r14 * r0
            r48 = r3[r5]     // Catch:{ Exception -> 0x03b4 }
            r17 = r8
            r5 = r29
            double r8 = (double) r5     // Catch:{ Exception -> 0x03b4 }
            double r8 = r8 * r48
            double r8 = r8 + r14
            double r14 = (double) r11     // Catch:{ Exception -> 0x03b4 }
            double r14 = r14 * r37
            double r14 = r14 + r8
            r29 = r5
            r20 = r6
            r8 = r24
            double r5 = (double) r8     // Catch:{ Exception -> 0x03b4 }
            double r5 = r5 * r12
            double r5 = r5 + r14
            r9 = 10
            r4[r9] = r5     // Catch:{ Exception -> 0x03b4 }
            r9 = r33
            double r14 = (double) r9     // Catch:{ Exception -> 0x03b4 }
            double r0 = r0 * r14
            double r14 = (double) r2     // Catch:{ Exception -> 0x03b4 }
            double r48 = r48 * r14
            double r48 = r48 + r0
            r0 = 10
            r0 = r3[r0]     // Catch:{ Exception -> 0x03b4 }
            r37 = r5
            r14 = r19
            double r5 = (double) r14     // Catch:{ Exception -> 0x03b4 }
            double r0 = r0 * r5
            double r0 = r0 + r48
            r19 = r14
            r5 = r21
            double r14 = (double) r5     // Catch:{ Exception -> 0x03b4 }
            double r12 = r12 * r14
            double r12 = r12 + r0
            r0 = 11
            r4[r0] = r12     // Catch:{ Exception -> 0x03b4 }
            r0 = 12
            r0 = r3[r0]     // Catch:{ Exception -> 0x03b4 }
            r6 = r31
            double r14 = (double) r6     // Catch:{ Exception -> 0x03b4 }
            double r0 = r0 * r14
            r6 = 13
            r14 = r3[r6]     // Catch:{ Exception -> 0x03b4 }
            r6 = r30
            r30 = r12
            double r12 = (double) r6     // Catch:{ Exception -> 0x03b4 }
            double r12 = r12 * r14
            double r12 = r12 + r0
            r0 = 14
            r0 = r3[r0]     // Catch:{ Exception -> 0x03b4 }
            r21 = r5
            r6 = r32
            double r5 = (double) r6     // Catch:{ Exception -> 0x03b4 }
            double r5 = r5 * r0
            double r5 = r5 + r12
            r12 = 15
            r12 = r3[r12]     // Catch:{ Exception -> 0x03b4 }
            r24 = r2
            r32 = r8
            r33 = r9
            r2 = r45
            double r8 = (double) r2     // Catch:{ Exception -> 0x03b4 }
            double r8 = r8 * r12
            double r8 = r8 + r5
            r2 = 12
            r4[r2] = r8     // Catch:{ Exception -> 0x03b4 }
            r5 = r3[r2]     // Catch:{ Exception -> 0x03b4 }
            r48 = r8
            r2 = r36
            double r8 = (double) r2
            double r8 = r8 * r5
            double r2 = (double) r7
            double r14 = r14 * r2
            double r14 = r14 + r8
            double r2 = (double) r10
            double r2 = r2 * r0
            double r2 = r2 + r14
            r7 = r17
            double r7 = (double) r7
            double r7 = r7 * r12
            double r7 = r7 + r2
            r2 = 13
            r4[r2] = r7     // Catch:{ Exception -> 0x03b6 }
            r3 = r20
            double r9 = (double) r3
            double r9 = r9 * r5
            r3 = r54
            r14 = r3[r2]     // Catch:{ Exception -> 0x03b4 }
            r50 = r7
            r2 = r29
            double r7 = (double) r2     // Catch:{ Exception -> 0x03b4 }
            double r7 = r7 * r14
            double r7 = r7 + r9
            double r9 = (double) r11     // Catch:{ Exception -> 0x03b4 }
            double r0 = r0 * r9
            double r0 = r0 + r7
            r2 = r32
            double r7 = (double) r2     // Catch:{ Exception -> 0x03b4 }
            double r7 = r7 * r12
            double r7 = r7 + r0
            r0 = 14
            r4[r0] = r7     // Catch:{ Exception -> 0x03b4 }
            r0 = r33
            double r0 = (double) r0     // Catch:{ Exception -> 0x03b4 }
            double r5 = r5 * r0
            r0 = r24
            double r0 = (double) r0     // Catch:{ Exception -> 0x03b4 }
            double r14 = r14 * r0
            double r14 = r14 + r5
            r0 = 14
            r0 = r3[r0]     // Catch:{ Exception -> 0x03b4 }
            r2 = r19
            double r5 = (double) r2     // Catch:{ Exception -> 0x03b4 }
            double r0 = r0 * r5
            double r0 = r0 + r14
            r2 = r21
            double r5 = (double) r2     // Catch:{ Exception -> 0x03b4 }
            double r12 = r12 * r5
            double r12 = r12 + r0
            r0 = 15
            r4[r0] = r12     // Catch:{ Exception -> 0x03b4 }
            r0 = r18
            double[][] r0 = (double[][]) r0     // Catch:{ Exception -> 0x03b4 }
            r1 = 0
            r0 = r0[r1]     // Catch:{ Exception -> 0x03b4 }
            double r5 = r25 - r22
            r0[r1] = r5     // Catch:{ Exception -> 0x03b4 }
            r0 = r18
            double[][] r0 = (double[][]) r0     // Catch:{ Exception -> 0x03b4 }
            r0 = r0[r1]     // Catch:{ Exception -> 0x03b4 }
            double r5 = r27 - r34
            r2 = 1
            r0[r2] = r5     // Catch:{ Exception -> 0x03b4 }
            r0 = r18
            double[][] r0 = (double[][]) r0     // Catch:{ Exception -> 0x03b4 }
            r0 = r0[r1]     // Catch:{ Exception -> 0x03b4 }
            double r5 = r30 - r43
            r2 = 2
            r0[r2] = r5     // Catch:{ Exception -> 0x03b4 }
            r0 = r18
            double[][] r0 = (double[][]) r0     // Catch:{ Exception -> 0x03b4 }
            r0 = r0[r1]     // Catch:{ Exception -> 0x03b4 }
            double r1 = r12 - r48
            r5 = 3
            r0[r5] = r1     // Catch:{ Exception -> 0x03b4 }
            r0 = r18
            double[][] r0 = (double[][]) r0     // Catch:{ Exception -> 0x03b4 }
            r1 = 1
            r0 = r0[r1]     // Catch:{ Exception -> 0x03b4 }
            r1 = r4[r5]     // Catch:{ Exception -> 0x03b4 }
            r5 = 0
            r9 = r4[r5]     // Catch:{ Exception -> 0x03b4 }
            double r1 = r1 + r9
            r0[r5] = r1     // Catch:{ Exception -> 0x03b4 }
            r0 = r18
            double[][] r0 = (double[][]) r0     // Catch:{ Exception -> 0x03b4 }
            r1 = 1
            r0 = r0[r1]     // Catch:{ Exception -> 0x03b4 }
            double r5 = r27 + r34
            r0[r1] = r5     // Catch:{ Exception -> 0x03b4 }
            r0 = r18
            double[][] r0 = (double[][]) r0     // Catch:{ Exception -> 0x03b4 }
            r0 = r0[r1]     // Catch:{ Exception -> 0x03b4 }
            double r5 = r30 + r43
            r2 = 2
            r0[r2] = r5     // Catch:{ Exception -> 0x03b4 }
            r0 = r18
            double[][] r0 = (double[][]) r0     // Catch:{ Exception -> 0x03b4 }
            r0 = r0[r1]     // Catch:{ Exception -> 0x03b4 }
            double r1 = r12 + r48
            r5 = 3
            r0[r5] = r1     // Catch:{ Exception -> 0x03b4 }
            r0 = r18
            double[][] r0 = (double[][]) r0     // Catch:{ Exception -> 0x03b4 }
            r1 = 2
            r0 = r0[r1]     // Catch:{ Exception -> 0x03b4 }
            r1 = r4[r5]     // Catch:{ Exception -> 0x03b4 }
            r5 = 1
            r5 = r4[r5]     // Catch:{ Exception -> 0x03b4 }
            double r1 = r1 + r5
            r5 = 0
            r0[r5] = r1     // Catch:{ Exception -> 0x03b4 }
            r0 = r18
            double[][] r0 = (double[][]) r0     // Catch:{ Exception -> 0x03b4 }
            r1 = 2
            r0 = r0[r1]     // Catch:{ Exception -> 0x03b4 }
            double r5 = r27 + r39
            r2 = 1
            r0[r2] = r5     // Catch:{ Exception -> 0x03b4 }
            r0 = r18
            double[][] r0 = (double[][]) r0     // Catch:{ Exception -> 0x03b4 }
            r0 = r0[r1]     // Catch:{ Exception -> 0x03b4 }
            double r5 = r30 + r46
            r0[r1] = r5     // Catch:{ Exception -> 0x03b4 }
            r0 = r18
            double[][] r0 = (double[][]) r0     // Catch:{ Exception -> 0x03b4 }
            r0 = r0[r1]     // Catch:{ Exception -> 0x03b4 }
            double r1 = r12 + r50
            r5 = 3
            r0[r5] = r1     // Catch:{ Exception -> 0x03b4 }
            r0 = r18
            double[][] r0 = (double[][]) r0     // Catch:{ Exception -> 0x03b4 }
            r0 = r0[r5]     // Catch:{ Exception -> 0x03b4 }
            r1 = r4[r5]     // Catch:{ Exception -> 0x03b4 }
            r6 = 1
            r9 = r4[r6]     // Catch:{ Exception -> 0x03b4 }
            double r1 = r1 - r9
            r6 = 0
            r0[r6] = r1     // Catch:{ Exception -> 0x03b4 }
            r0 = r18
            double[][] r0 = (double[][]) r0     // Catch:{ Exception -> 0x03b4 }
            r0 = r0[r5]     // Catch:{ Exception -> 0x03b4 }
            double r1 = r27 - r39
            r6 = 1
            r0[r6] = r1     // Catch:{ Exception -> 0x03b4 }
            r0 = r18
            double[][] r0 = (double[][]) r0     // Catch:{ Exception -> 0x03b4 }
            r0 = r0[r5]     // Catch:{ Exception -> 0x03b4 }
            double r1 = r30 - r46
            r6 = 2
            r0[r6] = r1     // Catch:{ Exception -> 0x03b4 }
            r0 = r18
            double[][] r0 = (double[][]) r0     // Catch:{ Exception -> 0x03b4 }
            r0 = r0[r5]     // Catch:{ Exception -> 0x03b4 }
            double r1 = r12 - r50
            r0[r5] = r1     // Catch:{ Exception -> 0x03b4 }
            r0 = r18
            double[][] r0 = (double[][]) r0     // Catch:{ Exception -> 0x03b4 }
            r1 = 4
            r0 = r0[r1]     // Catch:{ Exception -> 0x03b4 }
            r1 = r4[r5]     // Catch:{ Exception -> 0x03b4 }
            r5 = 2
            r5 = r4[r5]     // Catch:{ Exception -> 0x03b4 }
            double r1 = r1 - r5
            r5 = 0
            r0[r5] = r1     // Catch:{ Exception -> 0x03b4 }
            r0 = r18
            double[][] r0 = (double[][]) r0     // Catch:{ Exception -> 0x03b4 }
            r1 = 4
            r0 = r0[r1]     // Catch:{ Exception -> 0x03b4 }
            double r5 = r27 - r41
            r2 = 1
            r0[r2] = r5     // Catch:{ Exception -> 0x03b4 }
            r0 = r18
            double[][] r0 = (double[][]) r0     // Catch:{ Exception -> 0x03b4 }
            r0 = r0[r1]     // Catch:{ Exception -> 0x03b4 }
            double r5 = r30 - r37
            r2 = 2
            r0[r2] = r5     // Catch:{ Exception -> 0x03b4 }
            r0 = r18
            double[][] r0 = (double[][]) r0     // Catch:{ Exception -> 0x03b4 }
            r0 = r0[r1]     // Catch:{ Exception -> 0x03b4 }
            double r1 = r12 - r7
            r5 = 3
            r0[r5] = r1     // Catch:{ Exception -> 0x03b4 }
            r0 = r18
            double[][] r0 = (double[][]) r0     // Catch:{ Exception -> 0x03b4 }
            r0 = r0[r16]     // Catch:{ Exception -> 0x03b4 }
            r1 = r4[r5]     // Catch:{ Exception -> 0x03b4 }
            r5 = 2
            r5 = r4[r5]     // Catch:{ Exception -> 0x03b4 }
            double r1 = r1 + r5
            r4 = 0
            r0[r4] = r1     // Catch:{ Exception -> 0x03b4 }
            r0 = r18
            double[][] r0 = (double[][]) r0     // Catch:{ Exception -> 0x03b4 }
            r0 = r0[r16]     // Catch:{ Exception -> 0x03b4 }
            double r1 = r27 + r41
            r4 = 1
            r0[r4] = r1     // Catch:{ Exception -> 0x03b4 }
            r0 = r18
            double[][] r0 = (double[][]) r0     // Catch:{ Exception -> 0x03b4 }
            r0 = r0[r16]     // Catch:{ Exception -> 0x03b4 }
            double r1 = r30 + r37
            r4 = 2
            r0[r4] = r1     // Catch:{ Exception -> 0x03b4 }
            r0 = r18
            double[][] r0 = (double[][]) r0     // Catch:{ Exception -> 0x03b4 }
            r0 = r0[r16]     // Catch:{ Exception -> 0x03b4 }
            double r12 = r12 + r7
            r1 = 3
            r0[r1] = r12     // Catch:{ Exception -> 0x03b4 }
            r52.mo19962i()     // Catch:{ Exception -> 0x03b4 }
            return
        L_0x03b4:
            r0 = move-exception
            goto L_0x03b9
        L_0x03b6:
            r0 = move-exception
            r3 = r54
        L_0x03b9:
            java.lang.String r1 = "modl.length = "
            java.lang.StringBuilder r1 = p379.C13555b.m33972k(r1)
            int r2 = r3.length
            r1.append(r2)
            java.lang.String r2 = "\nproj.length = "
            r1.append(r2)
            r2 = r53
            int r2 = r2.length
            r1.append(r2)
            java.lang.String r2 = "\nfrustum.length = "
            r1.append(r2)
            r2 = r52
            java.lang.Object r3 = r2.f15501b
            double[][] r3 = (double[][]) r3
            int r3 = r3.length
            r1.append(r3)
            r3 = 0
        L_0x03de:
            java.lang.Object r4 = r2.f15501b
            double[][] r4 = (double[][]) r4
            int r4 = r4.length
            if (r3 >= r4) goto L_0x0419
            java.lang.String r4 = "\n\tfrustum[ "
            r1.append(r4)     // Catch:{ Exception -> 0x040c }
            r1.append(r3)     // Catch:{ Exception -> 0x040c }
            java.lang.String r4 = " ].length = "
            r1.append(r4)     // Catch:{ Exception -> 0x040c }
            java.lang.Object r4 = r2.f15501b     // Catch:{ Exception -> 0x040c }
            r5 = r4
            double[][] r5 = (double[][]) r5     // Catch:{ Exception -> 0x040c }
            r5 = r5[r3]     // Catch:{ Exception -> 0x040c }
            if (r5 == 0) goto L_0x0404
            double[][] r4 = (double[][]) r4     // Catch:{ Exception -> 0x040c }
            r4 = r4[r3]     // Catch:{ Exception -> 0x040c }
            int r4 = r4.length     // Catch:{ Exception -> 0x040c }
            r1.append(r4)     // Catch:{ Exception -> 0x040c }
            goto L_0x0409
        L_0x0404:
            java.lang.String r4 = "null"
            r1.append(r4)     // Catch:{ Exception -> 0x040c }
        L_0x0409:
            int r3 = r3 + 1
            goto L_0x03de
        L_0x040c:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r4 = "Sweet jesus what is going on here? Exception on index "
            java.lang.String r3 = p379.C16759e.m42349e(r4, r3)
            r1.<init>(r3, r0)
            throw r1
        L_0x0419:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r1 = r1.toString()
            r3.<init>(r1, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p066e0.C4436j0.<init>(float[], double[]):void");
    }
}
