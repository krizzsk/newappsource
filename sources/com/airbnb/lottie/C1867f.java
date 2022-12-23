package com.airbnb.lottie;

import android.graphics.Rect;
import com.airbnb.lottie.model.layer.Layer;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p024b5.C1480b;
import p024b5.C1481c;
import p024b5.C1485g;
import p107h5.C5055c;
import p241s0.C6305e;
import p241s0.C6314i;

/* renamed from: com.airbnb.lottie.f */
public final class C1867f {

    /* renamed from: a */
    public final C1908u f6449a = new C1908u();

    /* renamed from: b */
    public final HashSet<String> f6450b = new HashSet<>();

    /* renamed from: c */
    public Map<String, List<Layer>> f6451c;

    /* renamed from: d */
    public Map<String, C1898n> f6452d;

    /* renamed from: e */
    public Map<String, C1480b> f6453e;

    /* renamed from: f */
    public List<C1485g> f6454f;

    /* renamed from: g */
    public C6314i<C1481c> f6455g;

    /* renamed from: h */
    public C6305e<Layer> f6456h;

    /* renamed from: i */
    public List<Layer> f6457i;

    /* renamed from: j */
    public Rect f6458j;

    /* renamed from: k */
    public float f6459k;

    /* renamed from: l */
    public float f6460l;

    /* renamed from: m */
    public float f6461m;

    /* renamed from: n */
    public boolean f6462n;

    /* renamed from: o */
    public int f6463o = 0;

    /* renamed from: a */
    public final void mo6755a(String str) {
        C5055c.m12896b(str);
        this.f6450b.add(str);
    }

    /* renamed from: b */
    public final float mo6756b() {
        return (float) ((long) (((this.f6460l - this.f6459k) / this.f6461m) * 1000.0f));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0035, code lost:
        if (r4.substring(0, r4.length() - 1).equalsIgnoreCase(r8) != false) goto L_0x0039;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p024b5.C1485g mo6757c(java.lang.String r8) {
        /*
            r7 = this;
            java.util.List<b5.g> r0 = r7.f6454f
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L_0x0008:
            if (r2 >= r0) goto L_0x003f
            java.util.List<b5.g> r3 = r7.f6454f
            java.lang.Object r3 = r3.get(r2)
            b5.g r3 = (p024b5.C1485g) r3
            java.lang.String r4 = r3.f5386a
            boolean r4 = r4.equalsIgnoreCase(r8)
            r5 = 1
            if (r4 == 0) goto L_0x001c
            goto L_0x0039
        L_0x001c:
            java.lang.String r4 = r3.f5386a
            java.lang.String r6 = "\r"
            boolean r4 = r4.endsWith(r6)
            if (r4 == 0) goto L_0x0038
            java.lang.String r4 = r3.f5386a
            int r6 = r4.length()
            int r6 = r6 - r5
            java.lang.String r4 = r4.substring(r1, r6)
            boolean r4 = r4.equalsIgnoreCase(r8)
            if (r4 == 0) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r5 = 0
        L_0x0039:
            if (r5 == 0) goto L_0x003c
            return r3
        L_0x003c:
            int r2 = r2 + 1
            goto L_0x0008
        L_0x003f:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.C1867f.mo6757c(java.lang.String):b5.g");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (Layer a : this.f6457i) {
            sb.append(a.mo6801a("\t"));
        }
        return sb.toString();
    }
}
