package p321y4;

import android.graphics.LinearGradient;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import com.airbnb.lottie.C1876l;
import com.airbnb.lottie.C1903q;
import com.airbnb.lottie.model.content.C1893a;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.C1894a;
import p059d5.C4371c;
import p120i5.C5282c;
import p241s0.C6305e;
import p332z4.C7456a;
import p332z4.C7466e;
import p332z4.C7472k;
import p332z4.C7478q;

/* renamed from: y4.h */
public final class C7320h extends C7312a {

    /* renamed from: A */
    public final C7472k f22487A;

    /* renamed from: B */
    public C7478q f22488B;

    /* renamed from: r */
    public final String f22489r;

    /* renamed from: s */
    public final boolean f22490s;

    /* renamed from: t */
    public final C6305e<LinearGradient> f22491t = new C6305e<>();

    /* renamed from: u */
    public final C6305e<RadialGradient> f22492u = new C6305e<>();

    /* renamed from: v */
    public final RectF f22493v = new RectF();

    /* renamed from: w */
    public final GradientType f22494w;

    /* renamed from: x */
    public final int f22495x;

    /* renamed from: y */
    public final C7466e f22496y;

    /* renamed from: z */
    public final C7472k f22497z;

    public C7320h(C1876l lVar, C1894a aVar, C1893a aVar2) {
        super(lVar, aVar, aVar2.f6579h.toPaintCap(), aVar2.f6580i.toPaintJoin(), aVar2.f6581j, aVar2.f6575d, aVar2.f6578g, aVar2.f6582k, aVar2.f6583l);
        this.f22489r = aVar2.f6572a;
        this.f22494w = aVar2.f6573b;
        this.f22490s = aVar2.f6584m;
        this.f22495x = (int) (lVar.f6482c.mo6756b() / 32.0f);
        C7456a<C4371c, C4371c> i = aVar2.f6574c.mo6602i();
        this.f22496y = (C7466e) i;
        i.mo23712a(this);
        aVar.mo6806e(i);
        C7456a<PointF, PointF> i2 = aVar2.f6576e.mo6602i();
        this.f22497z = (C7472k) i2;
        i2.mo23712a(this);
        aVar.mo6806e(i2);
        C7456a<PointF, PointF> i3 = aVar2.f6577f.mo6602i();
        this.f22487A = (C7472k) i3;
        i3.mo23712a(this);
        aVar.mo6806e(i3);
    }

    /* renamed from: e */
    public final int[] mo23554e(int[] iArr) {
        C7478q qVar = this.f22488B;
        if (qVar != null) {
            Integer[] numArr = (Integer[]) qVar.mo23717f();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [android.graphics.Shader] */
    /* JADX WARNING: type inference failed for: r2v21 */
    /* JADX WARNING: type inference failed for: r8v2, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: type inference failed for: r2v22 */
    /* JADX WARNING: type inference failed for: r8v3, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6807f(android.graphics.Canvas r17, android.graphics.Matrix r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r0.f22490s
            if (r2 == 0) goto L_0x0009
            return
        L_0x0009:
            android.graphics.RectF r2 = r0.f22493v
            r3 = 0
            r0.mo6805d(r2, r1, r3)
            com.airbnb.lottie.model.content.GradientType r2 = r0.f22494w
            com.airbnb.lottie.model.content.GradientType r3 = com.airbnb.lottie.model.content.GradientType.LINEAR
            r4 = 0
            if (r2 != r3) goto L_0x005d
            int r2 = r16.mo23555h()
            s0.e<android.graphics.LinearGradient> r3 = r0.f22491t
            long r5 = (long) r2
            java.lang.Object r2 = r3.mo22329i(r5, r4)
            android.graphics.LinearGradient r2 = (android.graphics.LinearGradient) r2
            if (r2 == 0) goto L_0x0027
            goto L_0x00ab
        L_0x0027:
            z4.k r2 = r0.f22497z
            java.lang.Object r2 = r2.mo23717f()
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            z4.k r3 = r0.f22487A
            java.lang.Object r3 = r3.mo23717f()
            android.graphics.PointF r3 = (android.graphics.PointF) r3
            z4.e r4 = r0.f22496y
            java.lang.Object r4 = r4.mo23717f()
            d5.c r4 = (p059d5.C4371c) r4
            int[] r7 = r4.f15373b
            int[] r13 = r0.mo23554e(r7)
            float[] r14 = r4.f15372a
            float r9 = r2.x
            float r10 = r2.y
            float r11 = r3.x
            float r12 = r3.y
            android.graphics.LinearGradient r2 = new android.graphics.LinearGradient
            android.graphics.Shader$TileMode r15 = android.graphics.Shader.TileMode.CLAMP
            r8 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            s0.e<android.graphics.LinearGradient> r3 = r0.f22491t
            r3.mo22331k(r5, r2)
            goto L_0x00ab
        L_0x005d:
            int r2 = r16.mo23555h()
            s0.e<android.graphics.RadialGradient> r3 = r0.f22492u
            long r5 = (long) r2
            java.lang.Object r2 = r3.mo22329i(r5, r4)
            android.graphics.RadialGradient r2 = (android.graphics.RadialGradient) r2
            if (r2 == 0) goto L_0x006d
            goto L_0x00ab
        L_0x006d:
            z4.k r2 = r0.f22497z
            java.lang.Object r2 = r2.mo23717f()
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            z4.k r3 = r0.f22487A
            java.lang.Object r3 = r3.mo23717f()
            android.graphics.PointF r3 = (android.graphics.PointF) r3
            z4.e r4 = r0.f22496y
            java.lang.Object r4 = r4.mo23717f()
            d5.c r4 = (p059d5.C4371c) r4
            int[] r7 = r4.f15373b
            int[] r12 = r0.mo23554e(r7)
            float[] r13 = r4.f15372a
            float r9 = r2.x
            float r10 = r2.y
            float r2 = r3.x
            float r3 = r3.y
            float r2 = r2 - r9
            double r7 = (double) r2
            float r3 = r3 - r10
            double r2 = (double) r3
            double r2 = java.lang.Math.hypot(r7, r2)
            float r11 = (float) r2
            android.graphics.RadialGradient r2 = new android.graphics.RadialGradient
            android.graphics.Shader$TileMode r14 = android.graphics.Shader.TileMode.CLAMP
            r8 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14)
            s0.e<android.graphics.RadialGradient> r3 = r0.f22492u
            r3.mo22331k(r5, r2)
        L_0x00ab:
            r2.setLocalMatrix(r1)
            x4.a r3 = r0.f22423i
            r3.setShader(r2)
            super.mo6807f(r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p321y4.C7320h.mo6807f(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    /* renamed from: g */
    public final void mo5840g(C5282c cVar, Object obj) {
        super.mo5840g(cVar, obj);
        if (obj == C1903q.f6674L) {
            C7478q qVar = this.f22488B;
            if (qVar != null) {
                this.f22420f.mo6816o(qVar);
            }
            if (cVar == null) {
                this.f22488B = null;
                return;
            }
            C7478q qVar2 = new C7478q(cVar, null);
            this.f22488B = qVar2;
            qVar2.mo23712a(this);
            this.f22420f.mo6806e(this.f22488B);
        }
    }

    public final String getName() {
        return this.f22489r;
    }

    /* renamed from: h */
    public final int mo23555h() {
        int i;
        int round = Math.round(this.f22497z.f22880d * ((float) this.f22495x));
        int round2 = Math.round(this.f22487A.f22880d * ((float) this.f22495x));
        int round3 = Math.round(this.f22496y.f22880d * ((float) this.f22495x));
        if (round != 0) {
            i = round * 527;
        } else {
            i = 17;
        }
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        if (round3 != 0) {
            return i * 31 * round3;
        }
        return i;
    }
}
