package p321y4;

import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import com.airbnb.lottie.C1876l;
import com.airbnb.lottie.C1903q;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.C1894a;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import p024b5.C1482d;
import p037c5.C1781b;
import p059d5.C4371c;
import p059d5.C4372d;
import p107h5.C5058f;
import p120i5.C5282c;
import p241s0.C6305e;
import p309x4.C7155a;
import p332z4.C7456a;
import p332z4.C7463c;
import p332z4.C7466e;
import p332z4.C7467f;
import p332z4.C7472k;
import p332z4.C7478q;

/* renamed from: y4.g */
public final class C7319g implements C7316d, C7456a.C7457a, C7322j {

    /* renamed from: a */
    public final String f22466a;

    /* renamed from: b */
    public final boolean f22467b;

    /* renamed from: c */
    public final C1894a f22468c;

    /* renamed from: d */
    public final C6305e<LinearGradient> f22469d = new C6305e<>();

    /* renamed from: e */
    public final C6305e<RadialGradient> f22470e = new C6305e<>();

    /* renamed from: f */
    public final Path f22471f;

    /* renamed from: g */
    public final C7155a f22472g;

    /* renamed from: h */
    public final RectF f22473h;

    /* renamed from: i */
    public final ArrayList f22474i;

    /* renamed from: j */
    public final GradientType f22475j;

    /* renamed from: k */
    public final C7466e f22476k;

    /* renamed from: l */
    public final C7467f f22477l;

    /* renamed from: m */
    public final C7472k f22478m;

    /* renamed from: n */
    public final C7472k f22479n;

    /* renamed from: o */
    public C7478q f22480o;

    /* renamed from: p */
    public C7478q f22481p;

    /* renamed from: q */
    public final C1876l f22482q;

    /* renamed from: r */
    public final int f22483r;

    /* renamed from: s */
    public C7456a<Float, Float> f22484s;

    /* renamed from: t */
    public float f22485t;

    /* renamed from: u */
    public C7463c f22486u;

    public C7319g(C1876l lVar, C1894a aVar, C4372d dVar) {
        Path path = new Path();
        this.f22471f = path;
        this.f22472g = new C7155a(1);
        this.f22473h = new RectF();
        this.f22474i = new ArrayList();
        this.f22485t = BitmapDescriptorFactory.HUE_RED;
        this.f22468c = aVar;
        this.f22466a = dVar.f15380g;
        this.f22467b = dVar.f15381h;
        this.f22482q = lVar;
        this.f22475j = dVar.f15374a;
        path.setFillType(dVar.f15375b);
        this.f22483r = (int) (lVar.f6482c.mo6756b() / 32.0f);
        C7456a<C4371c, C4371c> i = dVar.f15376c.mo6602i();
        this.f22476k = (C7466e) i;
        i.mo23712a(this);
        aVar.mo6806e(i);
        C7456a<Integer, Integer> i2 = dVar.f15377d.mo6602i();
        this.f22477l = (C7467f) i2;
        i2.mo23712a(this);
        aVar.mo6806e(i2);
        C7456a<PointF, PointF> i3 = dVar.f15378e.mo6602i();
        this.f22478m = (C7472k) i3;
        i3.mo23712a(this);
        aVar.mo6806e(i3);
        C7456a<PointF, PointF> i4 = dVar.f15379f.mo6602i();
        this.f22479n = (C7472k) i4;
        i4.mo23712a(this);
        aVar.mo6806e(i4);
        if (aVar.mo6812k() != null) {
            C7456a<Float, Float> i5 = ((C1781b) aVar.mo6812k().f761c).mo6602i();
            this.f22484s = i5;
            i5.mo23712a(this);
            aVar.mo6806e(this.f22484s);
        }
        if (aVar.mo6813l() != null) {
            this.f22486u = new C7463c(this, aVar, aVar.mo6813l());
        }
    }

    /* renamed from: a */
    public final void mo6803a() {
        this.f22482q.invalidateSelf();
    }

    /* renamed from: b */
    public final void mo6804b(List<C7314b> list, List<C7314b> list2) {
        for (int i = 0; i < list2.size(); i++) {
            C7314b bVar = list2.get(i);
            if (bVar instanceof C7325l) {
                this.f22474i.add((C7325l) bVar);
            }
        }
    }

    /* renamed from: c */
    public final void mo5839c(C1482d dVar, int i, ArrayList arrayList, C1482d dVar2) {
        C5058f.m12907d(dVar, i, arrayList, dVar2, this);
    }

    /* renamed from: d */
    public final void mo6805d(RectF rectF, Matrix matrix, boolean z) {
        this.f22471f.reset();
        for (int i = 0; i < this.f22474i.size(); i++) {
            this.f22471f.addPath(((C7325l) this.f22474i.get(i)).mo23551q(), matrix);
        }
        this.f22471f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    /* renamed from: e */
    public final int[] mo23552e(int[] iArr) {
        C7478q qVar = this.f22481p;
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

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.graphics.RadialGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: android.graphics.LinearGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v35, resolved type: android.graphics.RadialGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v37, resolved type: android.graphics.RadialGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: android.graphics.RadialGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v38, resolved type: android.graphics.RadialGradient} */
    /* JADX WARNING: type inference failed for: r3v30, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6807f(android.graphics.Canvas r20, android.graphics.Matrix r21, int r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            boolean r2 = r0.f22467b
            if (r2 == 0) goto L_0x0009
            return
        L_0x0009:
            android.graphics.Path r2 = r0.f22471f
            r2.reset()
            r2 = 0
            r3 = 0
        L_0x0010:
            java.util.ArrayList r4 = r0.f22474i
            int r4 = r4.size()
            if (r3 >= r4) goto L_0x002c
            android.graphics.Path r4 = r0.f22471f
            java.util.ArrayList r5 = r0.f22474i
            java.lang.Object r5 = r5.get(r3)
            y4.l r5 = (p321y4.C7325l) r5
            android.graphics.Path r5 = r5.mo23551q()
            r4.addPath(r5, r1)
            int r3 = r3 + 1
            goto L_0x0010
        L_0x002c:
            android.graphics.Path r3 = r0.f22471f
            android.graphics.RectF r4 = r0.f22473h
            r3.computeBounds(r4, r2)
            com.airbnb.lottie.model.content.GradientType r3 = r0.f22475j
            com.airbnb.lottie.model.content.GradientType r4 = com.airbnb.lottie.model.content.GradientType.LINEAR
            r5 = 0
            r6 = 0
            if (r3 != r4) goto L_0x0085
            int r3 = r19.mo23553h()
            s0.e<android.graphics.LinearGradient> r4 = r0.f22469d
            long r7 = (long) r3
            java.lang.Object r3 = r4.mo22329i(r7, r6)
            android.graphics.LinearGradient r3 = (android.graphics.LinearGradient) r3
            if (r3 == 0) goto L_0x004c
            goto L_0x00e1
        L_0x004c:
            z4.k r3 = r0.f22478m
            java.lang.Object r3 = r3.mo23717f()
            android.graphics.PointF r3 = (android.graphics.PointF) r3
            z4.k r4 = r0.f22479n
            java.lang.Object r4 = r4.mo23717f()
            android.graphics.PointF r4 = (android.graphics.PointF) r4
            z4.e r9 = r0.f22476k
            java.lang.Object r9 = r9.mo23717f()
            d5.c r9 = (p059d5.C4371c) r9
            int[] r10 = r9.f15373b
            int[] r16 = r0.mo23552e(r10)
            float[] r9 = r9.f15372a
            android.graphics.LinearGradient r10 = new android.graphics.LinearGradient
            float r12 = r3.x
            float r13 = r3.y
            float r14 = r4.x
            float r15 = r4.y
            android.graphics.Shader$TileMode r18 = android.graphics.Shader.TileMode.CLAMP
            r11 = r10
            r17 = r9
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            s0.e<android.graphics.LinearGradient> r3 = r0.f22469d
            r3.mo22331k(r7, r10)
            r3 = r10
            goto L_0x00e1
        L_0x0085:
            int r3 = r19.mo23553h()
            s0.e<android.graphics.RadialGradient> r4 = r0.f22470e
            long r7 = (long) r3
            java.lang.Object r3 = r4.mo22329i(r7, r6)
            android.graphics.RadialGradient r3 = (android.graphics.RadialGradient) r3
            if (r3 == 0) goto L_0x0095
            goto L_0x00e1
        L_0x0095:
            z4.k r3 = r0.f22478m
            java.lang.Object r3 = r3.mo23717f()
            android.graphics.PointF r3 = (android.graphics.PointF) r3
            z4.k r4 = r0.f22479n
            java.lang.Object r4 = r4.mo23717f()
            android.graphics.PointF r4 = (android.graphics.PointF) r4
            z4.e r9 = r0.f22476k
            java.lang.Object r9 = r9.mo23717f()
            d5.c r9 = (p059d5.C4371c) r9
            int[] r10 = r9.f15373b
            int[] r15 = r0.mo23552e(r10)
            float[] r9 = r9.f15372a
            float r12 = r3.x
            float r13 = r3.y
            float r3 = r4.x
            float r4 = r4.y
            float r3 = r3 - r12
            double r10 = (double) r3
            float r4 = r4 - r13
            double r3 = (double) r4
            double r3 = java.lang.Math.hypot(r10, r3)
            float r3 = (float) r3
            int r4 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x00d1
            r3 = 981668463(0x3a83126f, float:0.001)
            r14 = 981668463(0x3a83126f, float:0.001)
            goto L_0x00d2
        L_0x00d1:
            r14 = r3
        L_0x00d2:
            android.graphics.RadialGradient r3 = new android.graphics.RadialGradient
            android.graphics.Shader$TileMode r17 = android.graphics.Shader.TileMode.CLAMP
            r11 = r3
            r16 = r9
            r11.<init>(r12, r13, r14, r15, r16, r17)
            s0.e<android.graphics.RadialGradient> r4 = r0.f22470e
            r4.mo22331k(r7, r3)
        L_0x00e1:
            r3.setLocalMatrix(r1)
            x4.a r1 = r0.f22472g
            r1.setShader(r3)
            z4.q r1 = r0.f22480o
            if (r1 == 0) goto L_0x00f8
            x4.a r3 = r0.f22472g
            java.lang.Object r1 = r1.mo23717f()
            android.graphics.ColorFilter r1 = (android.graphics.ColorFilter) r1
            r3.setColorFilter(r1)
        L_0x00f8:
            z4.a<java.lang.Float, java.lang.Float> r1 = r0.f22484s
            if (r1 == 0) goto L_0x0124
            java.lang.Object r1 = r1.mo23717f()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0110
            x4.a r3 = r0.f22472g
            r3.setMaskFilter(r6)
            goto L_0x0122
        L_0x0110:
            float r3 = r0.f22485t
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x0122
            android.graphics.BlurMaskFilter r3 = new android.graphics.BlurMaskFilter
            android.graphics.BlurMaskFilter$Blur r4 = android.graphics.BlurMaskFilter.Blur.NORMAL
            r3.<init>(r1, r4)
            x4.a r4 = r0.f22472g
            r4.setMaskFilter(r3)
        L_0x0122:
            r0.f22485t = r1
        L_0x0124:
            z4.c r1 = r0.f22486u
            if (r1 == 0) goto L_0x012d
            x4.a r3 = r0.f22472g
            r1.mo23731b(r3)
        L_0x012d:
            r1 = r22
            float r1 = (float) r1
            r3 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 / r3
            z4.f r4 = r0.f22477l
            java.lang.Object r4 = r4.mo23717f()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            float r4 = (float) r4
            float r1 = r1 * r4
            r4 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r4
            float r1 = r1 * r3
            int r1 = (int) r1
            x4.a r3 = r0.f22472g
            android.graphics.PointF r4 = p107h5.C5058f.f17056a
            r4 = 255(0xff, float:3.57E-43)
            int r1 = java.lang.Math.min(r4, r1)
            int r1 = java.lang.Math.max(r2, r1)
            r3.setAlpha(r1)
            android.graphics.Path r1 = r0.f22471f
            x4.a r2 = r0.f22472g
            r3 = r20
            r3.drawPath(r1, r2)
            p584jl.C17885a.m44412M()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p321y4.C7319g.mo6807f(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    /* renamed from: g */
    public final void mo5840g(C5282c cVar, Object obj) {
        C7463c cVar2;
        C7463c cVar3;
        C7463c cVar4;
        C7463c cVar5;
        C7463c cVar6;
        if (obj == C1903q.f6680d) {
            this.f22477l.mo23722k(cVar);
        } else if (obj == C1903q.f6673K) {
            C7478q qVar = this.f22480o;
            if (qVar != null) {
                this.f22468c.mo6816o(qVar);
            }
            if (cVar == null) {
                this.f22480o = null;
                return;
            }
            C7478q qVar2 = new C7478q(cVar, null);
            this.f22480o = qVar2;
            qVar2.mo23712a(this);
            this.f22468c.mo6806e(this.f22480o);
        } else if (obj == C1903q.f6674L) {
            C7478q qVar3 = this.f22481p;
            if (qVar3 != null) {
                this.f22468c.mo6816o(qVar3);
            }
            if (cVar == null) {
                this.f22481p = null;
                return;
            }
            this.f22469d.mo22326f();
            this.f22470e.mo22326f();
            C7478q qVar4 = new C7478q(cVar, null);
            this.f22481p = qVar4;
            qVar4.mo23712a(this);
            this.f22468c.mo6806e(this.f22481p);
        } else if (obj == C1903q.f6686j) {
            C7456a<Float, Float> aVar = this.f22484s;
            if (aVar != null) {
                aVar.mo23722k(cVar);
                return;
            }
            C7478q qVar5 = new C7478q(cVar, null);
            this.f22484s = qVar5;
            qVar5.mo23712a(this);
            this.f22468c.mo6806e(this.f22484s);
        } else if (obj == C1903q.f6681e && (cVar6 = this.f22486u) != null) {
            cVar6.f22892b.mo23722k(cVar);
        } else if (obj == C1903q.f6669G && (cVar5 = this.f22486u) != null) {
            cVar5.mo23732c(cVar);
        } else if (obj == C1903q.f6670H && (cVar4 = this.f22486u) != null) {
            cVar4.f22894d.mo23722k(cVar);
        } else if (obj == C1903q.f6671I && (cVar3 = this.f22486u) != null) {
            cVar3.f22895e.mo23722k(cVar);
        } else if (obj == C1903q.f6672J && (cVar2 = this.f22486u) != null) {
            cVar2.f22896f.mo23722k(cVar);
        }
    }

    public final String getName() {
        return this.f22466a;
    }

    /* renamed from: h */
    public final int mo23553h() {
        int i;
        int round = Math.round(this.f22478m.f22880d * ((float) this.f22483r));
        int round2 = Math.round(this.f22479n.f22880d * ((float) this.f22483r));
        int round3 = Math.round(this.f22476k.f22880d * ((float) this.f22483r));
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
