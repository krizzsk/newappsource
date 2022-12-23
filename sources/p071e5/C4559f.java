package p071e5;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C1867f;
import com.airbnb.lottie.C1876l;
import com.airbnb.lottie.C1903q;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.model.layer.C1894a;
import com.airbnb.lottie.model.layer.Layer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;
import java.util.List;
import p037c5.C1780a;
import p037c5.C1781b;
import p037c5.C1790k;
import p120i5.C5282c;
import p241s0.C6305e;
import p332z4.C7456a;
import p332z4.C7462b;
import p332z4.C7465d;
import p332z4.C7476o;
import p332z4.C7478q;

/* renamed from: e5.f */
public final class C4559f extends C1894a {

    /* renamed from: A */
    public final StringBuilder f15708A = new StringBuilder(2);

    /* renamed from: B */
    public final RectF f15709B = new RectF();

    /* renamed from: C */
    public final Matrix f15710C = new Matrix();

    /* renamed from: D */
    public final C4560a f15711D = new C4560a();

    /* renamed from: E */
    public final C4561b f15712E = new C4561b();

    /* renamed from: F */
    public final HashMap f15713F = new HashMap();

    /* renamed from: G */
    public final C6305e<String> f15714G = new C6305e<>();

    /* renamed from: H */
    public final C7476o f15715H;

    /* renamed from: I */
    public final C1876l f15716I;

    /* renamed from: J */
    public final C1867f f15717J;

    /* renamed from: K */
    public C7462b f15718K;

    /* renamed from: L */
    public C7478q f15719L;

    /* renamed from: M */
    public C7462b f15720M;

    /* renamed from: N */
    public C7478q f15721N;

    /* renamed from: O */
    public C7465d f15722O;

    /* renamed from: P */
    public C7478q f15723P;

    /* renamed from: Q */
    public C7465d f15724Q;

    /* renamed from: R */
    public C7478q f15725R;

    /* renamed from: S */
    public C7478q f15726S;

    /* renamed from: T */
    public C7478q f15727T;

    /* renamed from: e5.f$a */
    public class C4560a extends Paint {
        public C4560a() {
            super(1);
            setStyle(Paint.Style.FILL);
        }
    }

    /* renamed from: e5.f$b */
    public class C4561b extends Paint {
        public C4561b() {
            super(1);
            setStyle(Paint.Style.STROKE);
        }
    }

    /* renamed from: e5.f$c */
    public static /* synthetic */ class C4562c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15728a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.airbnb.lottie.model.DocumentData$Justification[] r0 = com.airbnb.lottie.model.DocumentData.Justification.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15728a = r0
                com.airbnb.lottie.model.DocumentData$Justification r1 = com.airbnb.lottie.model.DocumentData.Justification.LEFT_ALIGN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15728a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.model.DocumentData$Justification r1 = com.airbnb.lottie.model.DocumentData.Justification.RIGHT_ALIGN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f15728a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.airbnb.lottie.model.DocumentData$Justification r1 = com.airbnb.lottie.model.DocumentData.Justification.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p071e5.C4559f.C4562c.<clinit>():void");
        }
    }

    public C4559f(C1876l lVar, Layer layer) {
        super(lVar, layer);
        C1781b bVar;
        C1781b bVar2;
        C1780a aVar;
        C1780a aVar2;
        this.f15716I = lVar;
        this.f15717J = layer.f6586b;
        C7476o oVar = new C7476o((List) layer.f6601q.f19694c);
        this.f15715H = oVar;
        oVar.mo23712a(this);
        mo6806e(oVar);
        C1790k kVar = layer.f6602r;
        if (!(kVar == null || (aVar2 = (C1780a) kVar.f6258a) == null)) {
            C7456a<Integer, Integer> i = aVar2.mo6602i();
            this.f15718K = (C7462b) i;
            i.mo23712a(this);
            mo6806e(this.f15718K);
        }
        if (!(kVar == null || (aVar = (C1780a) kVar.f6259b) == null)) {
            C7456a<Integer, Integer> i2 = aVar.mo6602i();
            this.f15720M = (C7462b) i2;
            i2.mo23712a(this);
            mo6806e(this.f15720M);
        }
        if (!(kVar == null || (bVar2 = (C1781b) kVar.f6260c) == null)) {
            C7456a<Float, Float> i3 = bVar2.mo6602i();
            this.f15722O = (C7465d) i3;
            i3.mo23712a(this);
            mo6806e(this.f15722O);
        }
        if (kVar != null && (bVar = (C1781b) kVar.f6261d) != null) {
            C7456a<Float, Float> i4 = bVar.mo6602i();
            this.f15724Q = (C7465d) i4;
            i4.mo23712a(this);
            mo6806e(this.f15724Q);
        }
    }

    /* renamed from: t */
    public static void m11837t(DocumentData.Justification justification, Canvas canvas, float f) {
        int i = C4562c.f15728a[justification.ordinal()];
        if (i == 2) {
            canvas.translate(-f, BitmapDescriptorFactory.HUE_RED);
        } else if (i == 3) {
            canvas.translate((-f) / 2.0f, BitmapDescriptorFactory.HUE_RED);
        }
    }

    /* renamed from: u */
    public static void m11838u(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != BitmapDescriptorFactory.HUE_RED) {
                canvas.drawText(str, 0, str.length(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
            }
        }
    }

    /* renamed from: v */
    public static void m11839v(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != BitmapDescriptorFactory.HUE_RED) {
                canvas.drawPath(path, paint);
            }
        }
    }

    /* renamed from: d */
    public final void mo6805d(RectF rectF, Matrix matrix, boolean z) {
        super.mo6805d(rectF, matrix, z);
        rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.f15717J.f6458j.width(), (float) this.f15717J.f6458j.height());
    }

    /* renamed from: g */
    public final void mo5840g(C5282c cVar, Object obj) {
        super.mo5840g(cVar, obj);
        if (obj == C1903q.f6677a) {
            C7478q qVar = this.f15719L;
            if (qVar != null) {
                mo6816o(qVar);
            }
            if (cVar == null) {
                this.f15719L = null;
                return;
            }
            C7478q qVar2 = new C7478q(cVar, null);
            this.f15719L = qVar2;
            qVar2.mo23712a(this);
            mo6806e(this.f15719L);
        } else if (obj == C1903q.f6678b) {
            C7478q qVar3 = this.f15721N;
            if (qVar3 != null) {
                mo6816o(qVar3);
            }
            if (cVar == null) {
                this.f15721N = null;
                return;
            }
            C7478q qVar4 = new C7478q(cVar, null);
            this.f15721N = qVar4;
            qVar4.mo23712a(this);
            mo6806e(this.f15721N);
        } else if (obj == C1903q.f6695s) {
            C7478q qVar5 = this.f15723P;
            if (qVar5 != null) {
                mo6816o(qVar5);
            }
            if (cVar == null) {
                this.f15723P = null;
                return;
            }
            C7478q qVar6 = new C7478q(cVar, null);
            this.f15723P = qVar6;
            qVar6.mo23712a(this);
            mo6806e(this.f15723P);
        } else if (obj == C1903q.f6696t) {
            C7478q qVar7 = this.f15725R;
            if (qVar7 != null) {
                mo6816o(qVar7);
            }
            if (cVar == null) {
                this.f15725R = null;
                return;
            }
            C7478q qVar8 = new C7478q(cVar, null);
            this.f15725R = qVar8;
            qVar8.mo23712a(this);
            mo6806e(this.f15725R);
        } else if (obj == C1903q.f6668F) {
            C7478q qVar9 = this.f15726S;
            if (qVar9 != null) {
                mo6816o(qVar9);
            }
            if (cVar == null) {
                this.f15726S = null;
                return;
            }
            C7478q qVar10 = new C7478q(cVar, null);
            this.f15726S = qVar10;
            qVar10.mo23712a(this);
            mo6806e(this.f15726S);
        } else if (obj == C1903q.f6675M) {
            C7478q qVar11 = this.f15727T;
            if (qVar11 != null) {
                mo6816o(qVar11);
            }
            if (cVar == null) {
                this.f15727T = null;
                return;
            }
            C7478q qVar12 = new C7478q(cVar, null);
            this.f15727T = qVar12;
            qVar12.mo23712a(this);
            mo6806e(this.f15727T);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:134:0x03ef  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6811j(android.graphics.Canvas r20, android.graphics.Matrix r21, int r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r20.save()
            com.airbnb.lottie.l r2 = r0.f15716I
            com.airbnb.lottie.f r2 = r2.f6482c
            s0.i<b5.c> r2 = r2.f6455g
            int r2 = r2.mo22436i()
            r3 = 1
            if (r2 <= 0) goto L_0x0016
            r2 = 1
            goto L_0x0017
        L_0x0016:
            r2 = 0
        L_0x0017:
            if (r2 != 0) goto L_0x001c
            r20.concat(r21)
        L_0x001c:
            z4.o r2 = r0.f15715H
            java.lang.Object r2 = r2.mo23717f()
            com.airbnb.lottie.model.DocumentData r2 = (com.airbnb.lottie.model.DocumentData) r2
            com.airbnb.lottie.f r4 = r0.f15717J
            java.util.Map<java.lang.String, b5.b> r4 = r4.f6453e
            java.lang.String r5 = r2.f6529b
            java.lang.Object r4 = r4.get(r5)
            b5.b r4 = (p024b5.C1480b) r4
            if (r4 != 0) goto L_0x0036
            r20.restore()
            return
        L_0x0036:
            z4.q r5 = r0.f15719L
            if (r5 == 0) goto L_0x004a
            e5.f$a r6 = r0.f15711D
            java.lang.Object r5 = r5.mo23717f()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6.setColor(r5)
            goto L_0x0065
        L_0x004a:
            z4.b r5 = r0.f15718K
            if (r5 == 0) goto L_0x005e
            e5.f$a r6 = r0.f15711D
            java.lang.Object r5 = r5.mo23717f()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6.setColor(r5)
            goto L_0x0065
        L_0x005e:
            e5.f$a r5 = r0.f15711D
            int r6 = r2.f6535h
            r5.setColor(r6)
        L_0x0065:
            z4.q r5 = r0.f15721N
            if (r5 == 0) goto L_0x0079
            e5.f$b r6 = r0.f15712E
            java.lang.Object r5 = r5.mo23717f()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6.setColor(r5)
            goto L_0x0094
        L_0x0079:
            z4.b r5 = r0.f15720M
            if (r5 == 0) goto L_0x008d
            e5.f$b r6 = r0.f15712E
            java.lang.Object r5 = r5.mo23717f()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6.setColor(r5)
            goto L_0x0094
        L_0x008d:
            e5.f$b r5 = r0.f15712E
            int r6 = r2.f6536i
            r5.setColor(r6)
        L_0x0094:
            z4.p r5 = r0.f6629u
            z4.a<java.lang.Integer, java.lang.Integer> r5 = r5.f22928j
            if (r5 != 0) goto L_0x009d
            r5 = 100
            goto L_0x00a7
        L_0x009d:
            java.lang.Object r5 = r5.mo23717f()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
        L_0x00a7:
            int r5 = r5 * 255
            int r5 = r5 / 100
            e5.f$a r6 = r0.f15711D
            r6.setAlpha(r5)
            e5.f$b r6 = r0.f15712E
            r6.setAlpha(r5)
            z4.q r5 = r0.f15723P
            if (r5 == 0) goto L_0x00c9
            e5.f$b r6 = r0.f15712E
            java.lang.Object r5 = r5.mo23717f()
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            r6.setStrokeWidth(r5)
            goto L_0x00f0
        L_0x00c9:
            z4.d r5 = r0.f15722O
            if (r5 == 0) goto L_0x00dd
            e5.f$b r6 = r0.f15712E
            java.lang.Object r5 = r5.mo23717f()
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            r6.setStrokeWidth(r5)
            goto L_0x00f0
        L_0x00dd:
            float r5 = p107h5.C5059g.m12911d(r21)
            e5.f$b r6 = r0.f15712E
            float r7 = r2.f6537j
            float r8 = p107h5.C5059g.m12910c()
            float r8 = r8 * r7
            float r8 = r8 * r5
            r6.setStrokeWidth(r8)
        L_0x00f0:
            com.airbnb.lottie.l r5 = r0.f15716I
            com.airbnb.lottie.f r5 = r5.f6482c
            s0.i<b5.c> r5 = r5.f6455g
            int r5 = r5.mo22436i()
            if (r5 <= 0) goto L_0x00fe
            r5 = 1
            goto L_0x00ff
        L_0x00fe:
            r5 = 0
        L_0x00ff:
            r6 = 1120403456(0x42c80000, float:100.0)
            java.lang.String r7 = "\n"
            java.lang.String r8 = "\r"
            java.lang.String r9 = "\r\n"
            r10 = 0
            if (r5 == 0) goto L_0x02c6
            z4.q r3 = r0.f15726S
            if (r3 == 0) goto L_0x0119
            java.lang.Object r3 = r3.mo23717f()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            goto L_0x011b
        L_0x0119:
            float r3 = r2.f6530c
        L_0x011b:
            float r3 = r3 / r6
            float r5 = p107h5.C5059g.m12911d(r21)
            java.lang.String r6 = r2.f6528a
            float r11 = r2.f6533f
            float r12 = p107h5.C5059g.m12910c()
            float r12 = r12 * r11
            java.lang.String r6 = r6.replaceAll(r9, r8)
            java.lang.String r6 = r6.replaceAll(r7, r8)
            java.lang.String[] r6 = r6.split(r8)
            java.util.List r6 = java.util.Arrays.asList(r6)
            int r7 = r6.size()
            r8 = 0
        L_0x013f:
            if (r8 >= r7) goto L_0x04e6
            java.lang.Object r9 = r6.get(r8)
            java.lang.String r9 = (java.lang.String) r9
            r11 = 0
            r13 = 0
        L_0x0149:
            int r14 = r9.length()
            if (r13 >= r14) goto L_0x018c
            char r14 = r9.charAt(r13)
            java.lang.String r15 = r4.f5374a
            r22 = r6
            java.lang.String r6 = r4.f5375b
            int r6 = p024b5.C1481c.m3893a(r14, r15, r6)
            com.airbnb.lottie.f r14 = r0.f15717J
            s0.i<b5.c> r14 = r14.f6455g
            java.lang.Object r6 = r14.mo22434g(r6, r10)
            b5.c r6 = (p024b5.C1481c) r6
            if (r6 != 0) goto L_0x016d
            r6 = r8
            r16 = r9
            goto L_0x0183
        L_0x016d:
            double r10 = (double) r11
            double r14 = r6.f5378c
            r6 = r8
            r16 = r9
            double r8 = (double) r3
            double r14 = r14 * r8
            float r8 = p107h5.C5059g.m12910c()
            double r8 = (double) r8
            double r14 = r14 * r8
            double r8 = (double) r5
            double r14 = r14 * r8
            double r14 = r14 + r10
            float r8 = (float) r14
            r11 = r8
        L_0x0183:
            int r13 = r13 + 1
            r10 = 0
            r8 = r6
            r9 = r16
            r6 = r22
            goto L_0x0149
        L_0x018c:
            r22 = r6
            r6 = r8
            r16 = r9
            r20.save()
            com.airbnb.lottie.model.DocumentData$Justification r8 = r2.f6531d
            m11837t(r8, r1, r11)
            int r8 = r7 + -1
            float r8 = (float) r8
            float r8 = r8 * r12
            r9 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 / r9
            float r9 = (float) r6
            float r9 = r9 * r12
            float r9 = r9 - r8
            r8 = 0
            r1.translate(r8, r9)
            r8 = 0
        L_0x01aa:
            int r9 = r16.length()
            if (r8 >= r9) goto L_0x02b8
            r9 = r16
            char r10 = r9.charAt(r8)
            java.lang.String r11 = r4.f5374a
            java.lang.String r13 = r4.f5375b
            int r10 = p024b5.C1481c.m3893a(r10, r11, r13)
            com.airbnb.lottie.f r11 = r0.f15717J
            s0.i<b5.c> r11 = r11.f6455g
            r13 = 0
            java.lang.Object r10 = r11.mo22434g(r10, r13)
            b5.c r10 = (p024b5.C1481c) r10
            if (r10 != 0) goto L_0x01d3
            r14 = r21
            r17 = r7
            r16 = r9
            goto L_0x02b2
        L_0x01d3:
            java.util.HashMap r11 = r0.f15713F
            boolean r11 = r11.containsKey(r10)
            if (r11 == 0) goto L_0x01e8
            java.util.HashMap r11 = r0.f15713F
            java.lang.Object r11 = r11.get(r10)
            java.util.List r11 = (java.util.List) r11
            r17 = r7
            r16 = r9
            goto L_0x0221
        L_0x01e8:
            java.util.List<d5.i> r11 = r10.f5376a
            int r13 = r11.size()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r13)
            r15 = 0
        L_0x01f4:
            if (r15 >= r13) goto L_0x0217
            java.lang.Object r16 = r11.get(r15)
            r17 = r7
            r7 = r16
            d5.i r7 = (p059d5.C4377i) r7
            r16 = r9
            y4.c r9 = new y4.c
            r18 = r11
            com.airbnb.lottie.l r11 = r0.f15716I
            r9.<init>(r11, r0, r7)
            r14.add(r9)
            int r15 = r15 + 1
            r9 = r16
            r7 = r17
            r11 = r18
            goto L_0x01f4
        L_0x0217:
            r17 = r7
            r16 = r9
            java.util.HashMap r7 = r0.f15713F
            r7.put(r10, r14)
            r11 = r14
        L_0x0221:
            r7 = 0
        L_0x0222:
            int r9 = r11.size()
            if (r7 >= r9) goto L_0x0278
            java.lang.Object r9 = r11.get(r7)
            y4.c r9 = (p321y4.C7315c) r9
            android.graphics.Path r9 = r9.mo23551q()
            android.graphics.RectF r13 = r0.f15709B
            r14 = 0
            r9.computeBounds(r13, r14)
            android.graphics.Matrix r13 = r0.f15710C
            r14 = r21
            r13.set(r14)
            android.graphics.Matrix r13 = r0.f15710C
            float r15 = r2.f6534g
            float r15 = -r15
            float r18 = p107h5.C5059g.m12910c()
            float r15 = r15 * r18
            r18 = r11
            r11 = 0
            r13.preTranslate(r11, r15)
            android.graphics.Matrix r11 = r0.f15710C
            r11.preScale(r3, r3)
            android.graphics.Matrix r11 = r0.f15710C
            r9.transform(r11)
            boolean r11 = r2.f6538k
            if (r11 == 0) goto L_0x0269
            e5.f$a r11 = r0.f15711D
            m11839v(r9, r11, r1)
            e5.f$b r11 = r0.f15712E
            m11839v(r9, r11, r1)
            goto L_0x0273
        L_0x0269:
            e5.f$b r11 = r0.f15712E
            m11839v(r9, r11, r1)
            e5.f$a r11 = r0.f15711D
            m11839v(r9, r11, r1)
        L_0x0273:
            int r7 = r7 + 1
            r11 = r18
            goto L_0x0222
        L_0x0278:
            r14 = r21
            double r9 = r10.f5378c
            float r7 = (float) r9
            float r7 = r7 * r3
            float r9 = p107h5.C5059g.m12910c()
            float r9 = r9 * r7
            float r9 = r9 * r5
            int r7 = r2.f6532e
            float r7 = (float) r7
            r10 = 1092616192(0x41200000, float:10.0)
            float r7 = r7 / r10
            z4.q r10 = r0.f15725R
            if (r10 == 0) goto L_0x029c
            java.lang.Object r10 = r10.mo23717f()
            java.lang.Float r10 = (java.lang.Float) r10
            float r10 = r10.floatValue()
            goto L_0x02aa
        L_0x029c:
            z4.d r10 = r0.f15724Q
            if (r10 == 0) goto L_0x02ab
            java.lang.Object r10 = r10.mo23717f()
            java.lang.Float r10 = (java.lang.Float) r10
            float r10 = r10.floatValue()
        L_0x02aa:
            float r7 = r7 + r10
        L_0x02ab:
            float r7 = r7 * r5
            float r7 = r7 + r9
            r9 = 0
            r1.translate(r7, r9)
        L_0x02b2:
            int r8 = r8 + 1
            r7 = r17
            goto L_0x01aa
        L_0x02b8:
            r14 = r21
            r17 = r7
            r20.restore()
            int r8 = r6 + 1
            r10 = 0
            r6 = r22
            goto L_0x013f
        L_0x02c6:
            z4.q r5 = r0.f15727T
            if (r5 == 0) goto L_0x02d4
            java.lang.Object r5 = r5.mo23717f()
            android.graphics.Typeface r5 = (android.graphics.Typeface) r5
            if (r5 == 0) goto L_0x02d4
            goto L_0x0361
        L_0x02d4:
            com.airbnb.lottie.l r5 = r0.f15716I
            java.lang.String r10 = r4.f5374a
            java.lang.String r4 = r4.f5375b
            android.graphics.drawable.Drawable$Callback r11 = r5.getCallback()
            if (r11 != 0) goto L_0x02e2
            r5 = 0
            goto L_0x02f3
        L_0x02e2:
            a5.a r11 = r5.f6491l
            if (r11 != 0) goto L_0x02f1
            a5.a r11 = new a5.a
            android.graphics.drawable.Drawable$Callback r12 = r5.getCallback()
            r11.<init>(r12)
            r5.f6491l = r11
        L_0x02f1:
            a5.a r5 = r5.f6491l
        L_0x02f3:
            if (r5 == 0) goto L_0x035b
            w10.a r11 = r5.f210a
            r11.f51397b = r10
            r11.f51398c = r4
            java.util.HashMap r12 = r5.f211b
            java.lang.Object r11 = r12.get(r11)
            android.graphics.Typeface r11 = (android.graphics.Typeface) r11
            if (r11 == 0) goto L_0x0306
            goto L_0x0359
        L_0x0306:
            java.util.HashMap r11 = r5.f212c
            java.lang.Object r11 = r11.get(r10)
            android.graphics.Typeface r11 = (android.graphics.Typeface) r11
            if (r11 == 0) goto L_0x0311
            goto L_0x032b
        L_0x0311:
            java.lang.String r11 = "fonts/"
            java.lang.StringBuilder r11 = p001a0.C0016g.m36t(r11, r10)
            java.lang.String r12 = r5.f214e
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            android.content.res.AssetManager r12 = r5.f213d
            android.graphics.Typeface r11 = android.graphics.Typeface.createFromAsset(r12, r11)
            java.util.HashMap r12 = r5.f212c
            r12.put(r10, r11)
        L_0x032b:
            java.lang.String r10 = "Italic"
            boolean r10 = r4.contains(r10)
            java.lang.String r12 = "Bold"
            boolean r4 = r4.contains(r12)
            if (r10 == 0) goto L_0x033d
            if (r4 == 0) goto L_0x033d
            r4 = 3
            goto L_0x0346
        L_0x033d:
            if (r10 == 0) goto L_0x0341
            r4 = 2
            goto L_0x0346
        L_0x0341:
            if (r4 == 0) goto L_0x0345
            r4 = 1
            goto L_0x0346
        L_0x0345:
            r4 = 0
        L_0x0346:
            int r10 = r11.getStyle()
            if (r10 != r4) goto L_0x034d
            goto L_0x0352
        L_0x034d:
            android.graphics.Typeface r4 = android.graphics.Typeface.create(r11, r4)
            r11 = r4
        L_0x0352:
            java.util.HashMap r4 = r5.f211b
            w10.a r5 = r5.f210a
            r4.put(r5, r11)
        L_0x0359:
            r5 = r11
            goto L_0x035d
        L_0x035b:
            r4 = 0
            r5 = r4
        L_0x035d:
            if (r5 == 0) goto L_0x0360
            goto L_0x0361
        L_0x0360:
            r5 = 0
        L_0x0361:
            if (r5 != 0) goto L_0x0365
            goto L_0x04e6
        L_0x0365:
            java.lang.String r4 = r2.f6528a
            com.airbnb.lottie.l r10 = r0.f15716I
            r10.getClass()
            e5.f$a r10 = r0.f15711D
            r10.setTypeface(r5)
            z4.q r5 = r0.f15726S
            if (r5 == 0) goto L_0x0380
            java.lang.Object r5 = r5.mo23717f()
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            goto L_0x0382
        L_0x0380:
            float r5 = r2.f6530c
        L_0x0382:
            e5.f$a r10 = r0.f15711D
            float r11 = p107h5.C5059g.m12910c()
            float r11 = r11 * r5
            r10.setTextSize(r11)
            e5.f$b r10 = r0.f15712E
            e5.f$a r11 = r0.f15711D
            android.graphics.Typeface r11 = r11.getTypeface()
            r10.setTypeface(r11)
            e5.f$b r10 = r0.f15712E
            e5.f$a r11 = r0.f15711D
            float r11 = r11.getTextSize()
            r10.setTextSize(r11)
            float r10 = r2.f6533f
            float r11 = p107h5.C5059g.m12910c()
            float r11 = r11 * r10
            int r10 = r2.f6532e
            float r10 = (float) r10
            r12 = 1092616192(0x41200000, float:10.0)
            float r10 = r10 / r12
            z4.q r12 = r0.f15725R
            if (r12 == 0) goto L_0x03c0
            java.lang.Object r12 = r12.mo23717f()
            java.lang.Float r12 = (java.lang.Float) r12
            float r12 = r12.floatValue()
            goto L_0x03ce
        L_0x03c0:
            z4.d r12 = r0.f15724Q
            if (r12 == 0) goto L_0x03cf
            java.lang.Object r12 = r12.mo23717f()
            java.lang.Float r12 = (java.lang.Float) r12
            float r12 = r12.floatValue()
        L_0x03ce:
            float r10 = r10 + r12
        L_0x03cf:
            float r12 = p107h5.C5059g.m12910c()
            float r12 = r12 * r10
            float r12 = r12 * r5
            float r12 = r12 / r6
            java.lang.String r4 = r4.replaceAll(r9, r8)
            java.lang.String r4 = r4.replaceAll(r7, r8)
            java.lang.String[] r4 = r4.split(r8)
            java.util.List r4 = java.util.Arrays.asList(r4)
            int r5 = r4.size()
            r6 = 0
        L_0x03ed:
            if (r6 >= r5) goto L_0x04e6
            java.lang.Object r7 = r4.get(r6)
            java.lang.String r7 = (java.lang.String) r7
            e5.f$b r8 = r0.f15712E
            float r8 = r8.measureText(r7)
            int r9 = r7.length()
            int r9 = r9 - r3
            float r3 = (float) r9
            float r3 = r3 * r12
            float r3 = r3 + r8
            r20.save()
            com.airbnb.lottie.model.DocumentData$Justification r8 = r2.f6531d
            m11837t(r8, r1, r3)
            int r3 = r5 + -1
            float r3 = (float) r3
            float r3 = r3 * r11
            r8 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r8
            float r8 = (float) r6
            float r8 = r8 * r11
            float r8 = r8 - r3
            r3 = 0
            r1.translate(r3, r8)
            r3 = 0
        L_0x041d:
            int r8 = r7.length()
            if (r3 >= r8) goto L_0x04de
            int r8 = r7.codePointAt(r3)
            int r9 = java.lang.Character.charCount(r8)
            int r9 = r9 + r3
        L_0x042c:
            int r10 = r7.length()
            if (r9 >= r10) goto L_0x046d
            int r10 = r7.codePointAt(r9)
            int r13 = java.lang.Character.getType(r10)
            r14 = 16
            if (r13 == r14) goto L_0x0460
            int r13 = java.lang.Character.getType(r10)
            r14 = 27
            if (r13 == r14) goto L_0x0460
            int r13 = java.lang.Character.getType(r10)
            r14 = 6
            if (r13 == r14) goto L_0x0460
            int r13 = java.lang.Character.getType(r10)
            r14 = 28
            if (r13 == r14) goto L_0x0460
            int r13 = java.lang.Character.getType(r10)
            r14 = 19
            if (r13 != r14) goto L_0x045e
            goto L_0x0460
        L_0x045e:
            r13 = 0
            goto L_0x0461
        L_0x0460:
            r13 = 1
        L_0x0461:
            if (r13 != 0) goto L_0x0464
            goto L_0x046d
        L_0x0464:
            int r13 = java.lang.Character.charCount(r10)
            int r9 = r9 + r13
            int r8 = r8 * 31
            int r8 = r8 + r10
            goto L_0x042c
        L_0x046d:
            s0.e<java.lang.String> r10 = r0.f15714G
            long r13 = (long) r8
            boolean r8 = r10.f19944b
            if (r8 == 0) goto L_0x0477
            r10.mo22328h()
        L_0x0477:
            long[] r8 = r10.f19945c
            int r10 = r10.f19947e
            int r8 = p389bl.C13637c.m34068g(r8, r10, r13)
            if (r8 < 0) goto L_0x0483
            r8 = 1
            goto L_0x0484
        L_0x0483:
            r8 = 0
        L_0x0484:
            if (r8 == 0) goto L_0x0490
            s0.e<java.lang.String> r8 = r0.f15714G
            r9 = 0
            java.lang.Object r8 = r8.mo22329i(r13, r9)
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x04b3
        L_0x0490:
            java.lang.StringBuilder r8 = r0.f15708A
            r10 = 0
            r8.setLength(r10)
            r8 = r3
        L_0x0497:
            if (r8 >= r9) goto L_0x04a8
            int r10 = r7.codePointAt(r8)
            java.lang.StringBuilder r15 = r0.f15708A
            r15.appendCodePoint(r10)
            int r10 = java.lang.Character.charCount(r10)
            int r8 = r8 + r10
            goto L_0x0497
        L_0x04a8:
            java.lang.StringBuilder r8 = r0.f15708A
            java.lang.String r8 = r8.toString()
            s0.e<java.lang.String> r9 = r0.f15714G
            r9.mo22331k(r13, r8)
        L_0x04b3:
            int r9 = r8.length()
            int r3 = r3 + r9
            boolean r9 = r2.f6538k
            if (r9 == 0) goto L_0x04c7
            e5.f$a r9 = r0.f15711D
            m11838u(r8, r9, r1)
            e5.f$b r9 = r0.f15712E
            m11838u(r8, r9, r1)
            goto L_0x04d1
        L_0x04c7:
            e5.f$b r9 = r0.f15712E
            m11838u(r8, r9, r1)
            e5.f$a r9 = r0.f15711D
            m11838u(r8, r9, r1)
        L_0x04d1:
            e5.f$a r9 = r0.f15711D
            float r8 = r9.measureText(r8)
            float r8 = r8 + r12
            r9 = 0
            r1.translate(r8, r9)
            goto L_0x041d
        L_0x04de:
            r20.restore()
            int r6 = r6 + 1
            r3 = 1
            goto L_0x03ed
        L_0x04e6:
            r20.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p071e5.C4559f.mo6811j(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }
}
