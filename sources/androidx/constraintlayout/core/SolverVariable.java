package androidx.constraintlayout.core;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

public final class SolverVariable implements Comparable<SolverVariable> {

    /* renamed from: b */
    public boolean f2324b;

    /* renamed from: c */
    public int f2325c = -1;

    /* renamed from: d */
    public int f2326d = -1;

    /* renamed from: e */
    public int f2327e = 0;

    /* renamed from: f */
    public float f2328f;

    /* renamed from: g */
    public boolean f2329g = false;

    /* renamed from: h */
    public float[] f2330h = new float[9];

    /* renamed from: i */
    public float[] f2331i = new float[9];

    /* renamed from: j */
    public Type f2332j;

    /* renamed from: k */
    public C0678b[] f2333k = new C0678b[16];

    /* renamed from: l */
    public int f2334l = 0;

    /* renamed from: m */
    public int f2335m = 0;

    public enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public SolverVariable(Type type) {
        this.f2332j = type;
    }

    /* renamed from: a */
    public final void mo2707a(C0678b bVar) {
        int i = 0;
        while (true) {
            int i2 = this.f2334l;
            if (i >= i2) {
                C0678b[] bVarArr = this.f2333k;
                if (i2 >= bVarArr.length) {
                    this.f2333k = (C0678b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                C0678b[] bVarArr2 = this.f2333k;
                int i3 = this.f2334l;
                bVarArr2[i3] = bVar;
                this.f2334l = i3 + 1;
                return;
            } else if (this.f2333k[i] != bVar) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo2708b(C0678b bVar) {
        int i = this.f2334l;
        int i2 = 0;
        while (i2 < i) {
            if (this.f2333k[i2] == bVar) {
                while (i2 < i - 1) {
                    C0678b[] bVarArr = this.f2333k;
                    int i3 = i2 + 1;
                    bVarArr[i2] = bVarArr[i3];
                    i2 = i3;
                }
                this.f2334l--;
                return;
            }
            i2++;
        }
    }

    public final int compareTo(Object obj) {
        return this.f2325c - ((SolverVariable) obj).f2325c;
    }

    /* renamed from: f */
    public final void mo2710f() {
        this.f2332j = Type.UNKNOWN;
        this.f2327e = 0;
        this.f2325c = -1;
        this.f2326d = -1;
        this.f2328f = BitmapDescriptorFactory.HUE_RED;
        this.f2329g = false;
        int i = this.f2334l;
        for (int i2 = 0; i2 < i; i2++) {
            this.f2333k[i2] = null;
        }
        this.f2334l = 0;
        this.f2335m = 0;
        this.f2324b = false;
        Arrays.fill(this.f2331i, BitmapDescriptorFactory.HUE_RED);
    }

    /* renamed from: g */
    public final void mo2711g(C0680c cVar, float f) {
        this.f2328f = f;
        this.f2329g = true;
        int i = this.f2334l;
        this.f2326d = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f2333k[i2].mo2734h(cVar, this, false);
        }
        this.f2334l = 0;
    }

    /* renamed from: h */
    public final void mo2712h(C0680c cVar, C0678b bVar) {
        int i = this.f2334l;
        for (int i2 = 0; i2 < i; i2++) {
            this.f2333k[i2].mo2735i(cVar, bVar, false);
        }
        this.f2334l = 0;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("");
        k.append(this.f2325c);
        return k.toString();
    }
}
