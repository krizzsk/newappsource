package com.airbnb.lottie.model.layer;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import androidx.appcompat.app.C0262r;
import com.airbnb.lottie.C1876l;
import com.airbnb.lottie.C1908u;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.layer.Layer;
import com.appboy.support.ValidationUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p001a0.C0016g;
import p024b5.C1482d;
import p024b5.C1483e;
import p037c5.C1791l;
import p071e5.C4554a;
import p094g5.C4811j;
import p107h5.C5057e;
import p107h5.C5059g;
import p120i5.C5282c;
import p120i5.C5283d;
import p241s0.C6307g;
import p309x4.C7155a;
import p321y4.C7314b;
import p321y4.C7316d;
import p332z4.C7456a;
import p332z4.C7465d;
import p332z4.C7469h;
import p332z4.C7477p;
import p584jl.C17885a;

/* renamed from: com.airbnb.lottie.model.layer.a */
public abstract class C1894a implements C7316d, C7456a.C7457a, C1483e {

    /* renamed from: a */
    public final Path f6609a = new Path();

    /* renamed from: b */
    public final Matrix f6610b = new Matrix();

    /* renamed from: c */
    public final C7155a f6611c;

    /* renamed from: d */
    public final C7155a f6612d;

    /* renamed from: e */
    public final C7155a f6613e;

    /* renamed from: f */
    public final C7155a f6614f;

    /* renamed from: g */
    public final C7155a f6615g;

    /* renamed from: h */
    public final RectF f6616h;

    /* renamed from: i */
    public final RectF f6617i;

    /* renamed from: j */
    public final RectF f6618j;

    /* renamed from: k */
    public final RectF f6619k;

    /* renamed from: l */
    public final Matrix f6620l;

    /* renamed from: m */
    public final C1876l f6621m;

    /* renamed from: n */
    public final Layer f6622n;

    /* renamed from: o */
    public C7469h f6623o;

    /* renamed from: p */
    public C7465d f6624p;

    /* renamed from: q */
    public C1894a f6625q;

    /* renamed from: r */
    public C1894a f6626r;

    /* renamed from: s */
    public List<C1894a> f6627s;

    /* renamed from: t */
    public final ArrayList f6628t;

    /* renamed from: u */
    public final C7477p f6629u;

    /* renamed from: v */
    public boolean f6630v;

    /* renamed from: w */
    public boolean f6631w;

    /* renamed from: x */
    public C7155a f6632x;

    /* renamed from: y */
    public float f6633y;

    /* renamed from: z */
    public BlurMaskFilter f6634z;

    /* renamed from: com.airbnb.lottie.model.layer.a$a */
    public static /* synthetic */ class C1895a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6635a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f6636b;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|(3:29|30|32)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        static {
            /*
                com.airbnb.lottie.model.content.Mask$MaskMode[] r0 = com.airbnb.lottie.model.content.Mask.MaskMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6636b = r0
                r1 = 1
                com.airbnb.lottie.model.content.Mask$MaskMode r2 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f6636b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.model.content.Mask$MaskMode r3 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_SUBTRACT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f6636b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.airbnb.lottie.model.content.Mask$MaskMode r4 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_INTERSECT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f6636b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.airbnb.lottie.model.content.Mask$MaskMode r5 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_ADD     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.airbnb.lottie.model.layer.Layer$LayerType[] r4 = com.airbnb.lottie.model.layer.Layer.LayerType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f6635a = r4
                com.airbnb.lottie.model.layer.Layer$LayerType r5 = com.airbnb.lottie.model.layer.Layer.LayerType.SHAPE     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f6635a     // Catch:{ NoSuchFieldError -> 0x004e }
                com.airbnb.lottie.model.layer.Layer$LayerType r4 = com.airbnb.lottie.model.layer.Layer.LayerType.PRE_COMP     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f6635a     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.airbnb.lottie.model.layer.Layer$LayerType r1 = com.airbnb.lottie.model.layer.Layer.LayerType.SOLID     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f6635a     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.airbnb.lottie.model.layer.Layer$LayerType r1 = com.airbnb.lottie.model.layer.Layer.LayerType.IMAGE     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f6635a     // Catch:{ NoSuchFieldError -> 0x006d }
                com.airbnb.lottie.model.layer.Layer$LayerType r1 = com.airbnb.lottie.model.layer.Layer.LayerType.NULL     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f6635a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.airbnb.lottie.model.layer.Layer$LayerType r1 = com.airbnb.lottie.model.layer.Layer.LayerType.TEXT     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f6635a     // Catch:{ NoSuchFieldError -> 0x0083 }
                com.airbnb.lottie.model.layer.Layer$LayerType r1 = com.airbnb.lottie.model.layer.Layer.LayerType.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.C1894a.C1895a.<clinit>():void");
        }
    }

    public C1894a(C1876l lVar, Layer layer) {
        boolean z = true;
        this.f6611c = new C7155a(1);
        this.f6612d = new C7155a(PorterDuff.Mode.DST_IN, 0);
        this.f6613e = new C7155a(PorterDuff.Mode.DST_OUT, 0);
        C7155a aVar = new C7155a(1);
        this.f6614f = aVar;
        this.f6615g = new C7155a(PorterDuff.Mode.CLEAR);
        this.f6616h = new RectF();
        this.f6617i = new RectF();
        this.f6618j = new RectF();
        this.f6619k = new RectF();
        this.f6620l = new Matrix();
        this.f6628t = new ArrayList();
        this.f6630v = true;
        this.f6633y = BitmapDescriptorFactory.HUE_RED;
        this.f6621m = lVar;
        this.f6622n = layer;
        C0016g.m31o(new StringBuilder(), layer.f6587c, "#draw");
        if (layer.f6605u == Layer.MatteType.INVERT) {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        C1791l lVar2 = layer.f6593i;
        lVar2.getClass();
        C7477p pVar = new C7477p(lVar2);
        this.f6629u = pVar;
        pVar.mo23740b(this);
        List<Mask> list = layer.f6592h;
        if (list != null && !list.isEmpty()) {
            C7469h hVar = new C7469h(layer.f6592h);
            this.f6623o = hVar;
            for (C7456a a : (List) hVar.f22900a) {
                a.mo23712a(this);
            }
            for (C7456a aVar2 : (List) this.f6623o.f22901b) {
                mo6806e(aVar2);
                aVar2.mo23712a(this);
            }
        }
        if (!this.f6622n.f6604t.isEmpty()) {
            C7465d dVar = new C7465d(this.f6622n.f6604t);
            this.f6624p = dVar;
            dVar.f22878b = true;
            dVar.mo23712a(new C4554a(this));
            z = ((Float) this.f6624p.mo23717f()).floatValue() != 1.0f ? false : z;
            if (z != this.f6630v) {
                this.f6630v = z;
                this.f6621m.invalidateSelf();
            }
            mo6806e(this.f6624p);
        } else if (true != this.f6630v) {
            this.f6630v = true;
            this.f6621m.invalidateSelf();
        }
    }

    /* renamed from: a */
    public final void mo6803a() {
        this.f6621m.invalidateSelf();
    }

    /* renamed from: b */
    public final void mo6804b(List<C7314b> list, List<C7314b> list2) {
    }

    /* renamed from: c */
    public final void mo5839c(C1482d dVar, int i, ArrayList arrayList, C1482d dVar2) {
        C1894a aVar = this.f6625q;
        if (aVar != null) {
            String str = aVar.f6622n.f6587c;
            dVar2.getClass();
            C1482d dVar3 = new C1482d(dVar2);
            dVar3.f5382a.add(str);
            if (dVar.mo5834a(i, this.f6625q.f6622n.f6587c)) {
                C1894a aVar2 = this.f6625q;
                C1482d dVar4 = new C1482d(dVar3);
                dVar4.f5383b = aVar2;
                arrayList.add(dVar4);
            }
            if (dVar.mo5837d(i, this.f6622n.f6587c)) {
                this.f6625q.mo6817p(dVar, dVar.mo5835b(i, this.f6625q.f6622n.f6587c) + i, arrayList, dVar3);
            }
        }
        if (dVar.mo5836c(i, this.f6622n.f6587c)) {
            if (!"__container".equals(this.f6622n.f6587c)) {
                String str2 = this.f6622n.f6587c;
                dVar2.getClass();
                C1482d dVar5 = new C1482d(dVar2);
                dVar5.f5382a.add(str2);
                if (dVar.mo5834a(i, this.f6622n.f6587c)) {
                    C1482d dVar6 = new C1482d(dVar5);
                    dVar6.f5383b = this;
                    arrayList.add(dVar6);
                }
                dVar2 = dVar5;
            }
            if (dVar.mo5837d(i, this.f6622n.f6587c)) {
                mo6817p(dVar, dVar.mo5835b(i, this.f6622n.f6587c) + i, arrayList, dVar2);
            }
        }
    }

    /* renamed from: d */
    public void mo6805d(RectF rectF, Matrix matrix, boolean z) {
        this.f6616h.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        mo6809h();
        this.f6620l.set(matrix);
        if (z) {
            List<C1894a> list = this.f6627s;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    this.f6620l.preConcat(this.f6627s.get(size).f6629u.mo23742d());
                }
            } else {
                C1894a aVar = this.f6626r;
                if (aVar != null) {
                    this.f6620l.preConcat(aVar.f6629u.mo23742d());
                }
            }
        }
        this.f6620l.preConcat(this.f6629u.mo23742d());
    }

    /* renamed from: e */
    public final void mo6806e(C7456a<?, ?> aVar) {
        if (aVar != null) {
            this.f6628t.add(aVar);
        }
    }

    /* renamed from: f */
    public final void mo6807f(Canvas canvas, Matrix matrix, int i) {
        int i2;
        boolean z;
        boolean z2;
        float f;
        C7155a aVar;
        boolean z3;
        boolean z4;
        Canvas canvas2 = canvas;
        Matrix matrix2 = matrix;
        if (!this.f6630v || this.f6622n.f6606v) {
            C17885a.m44412M();
            return;
        }
        mo6809h();
        this.f6610b.reset();
        this.f6610b.set(matrix2);
        int i3 = 1;
        for (int size = this.f6627s.size() - 1; size >= 0; size--) {
            this.f6610b.preConcat(this.f6627s.get(size).f6629u.mo23742d());
        }
        C17885a.m44412M();
        C7456a<Integer, Integer> aVar2 = this.f6629u.f22928j;
        if (aVar2 == null) {
            i2 = 100;
        } else {
            i2 = aVar2.mo23717f().intValue();
        }
        int i4 = (int) ((((((float) i) / 255.0f) * ((float) i2)) / 100.0f) * 255.0f);
        boolean z5 = false;
        if (this.f6625q != null) {
            z = true;
        } else {
            z = false;
        }
        if (z || mo6814m()) {
            mo6805d(this.f6616h, this.f6610b, false);
            RectF rectF = this.f6616h;
            if (this.f6625q != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && this.f6622n.f6605u != Layer.MatteType.INVERT) {
                this.f6618j.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                this.f6625q.mo6805d(this.f6618j, matrix2, true);
                if (!rectF.intersect(this.f6618j)) {
                    rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                }
            }
            this.f6610b.preConcat(this.f6629u.mo23742d());
            RectF rectF2 = this.f6616h;
            Matrix matrix3 = this.f6610b;
            this.f6617i.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            int i5 = 3;
            int i6 = 4;
            if (mo6814m()) {
                int size2 = ((List) this.f6623o.f22902c).size();
                int i7 = 0;
                while (true) {
                    if (i7 < size2) {
                        Mask mask = (Mask) ((List) this.f6623o.f22902c).get(i7);
                        Path path = (Path) ((C7456a) ((List) this.f6623o.f22900a).get(i7)).mo23717f();
                        if (path != null) {
                            this.f6609a.set(path);
                            this.f6609a.transform(matrix3);
                            int i8 = C1895a.f6636b[mask.f6539a.ordinal()];
                            if (i8 == 1 || i8 == 2 || ((i8 == i5 || i8 == i6) && mask.f6542d)) {
                                break;
                            }
                            this.f6609a.computeBounds(this.f6619k, z5);
                            if (i7 == 0) {
                                this.f6617i.set(this.f6619k);
                            } else {
                                RectF rectF3 = this.f6617i;
                                rectF3.set(Math.min(rectF3.left, this.f6619k.left), Math.min(this.f6617i.top, this.f6619k.top), Math.max(this.f6617i.right, this.f6619k.right), Math.max(this.f6617i.bottom, this.f6619k.bottom));
                            }
                        }
                        i7++;
                        z5 = false;
                        i5 = 3;
                        i6 = 4;
                    } else if (!rectF2.intersect(this.f6617i)) {
                        f = BitmapDescriptorFactory.HUE_RED;
                        rectF2.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                    }
                }
            }
            f = BitmapDescriptorFactory.HUE_RED;
            if (!this.f6616h.intersect(f, f, (float) canvas.getWidth(), (float) canvas.getHeight())) {
                this.f6616h.set(f, f, f, f);
            }
            C17885a.m44412M();
            if (this.f6616h.width() >= 1.0f && this.f6616h.height() >= 1.0f) {
                this.f6611c.setAlpha(ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                C5059g.m12912e(canvas2, this.f6616h, this.f6611c, 31);
                C17885a.m44412M();
                mo6810i(canvas);
                mo6811j(canvas2, this.f6610b, i4);
                C17885a.m44412M();
                if (mo6814m()) {
                    Matrix matrix4 = this.f6610b;
                    C5059g.m12912e(canvas2, this.f6616h, this.f6612d, 19);
                    if (Build.VERSION.SDK_INT < 28) {
                        mo6810i(canvas);
                    }
                    C17885a.m44412M();
                    int i9 = 0;
                    while (i9 < ((List) this.f6623o.f22902c).size()) {
                        Mask mask2 = (Mask) ((List) this.f6623o.f22902c).get(i9);
                        C7456a aVar3 = (C7456a) ((List) this.f6623o.f22900a).get(i9);
                        C7456a aVar4 = (C7456a) ((List) this.f6623o.f22901b).get(i9);
                        int i11 = C1895a.f6636b[mask2.f6539a.ordinal()];
                        if (i11 == i3) {
                            if (!((List) this.f6623o.f22900a).isEmpty()) {
                                int i12 = 0;
                                while (true) {
                                    if (i12 >= ((List) this.f6623o.f22902c).size()) {
                                        z4 = true;
                                        break;
                                    } else if (((Mask) ((List) this.f6623o.f22902c).get(i12)).f6539a != Mask.MaskMode.MASK_MODE_NONE) {
                                        break;
                                    } else {
                                        i12++;
                                    }
                                }
                            }
                            z4 = false;
                            if (z4) {
                                this.f6611c.setAlpha(ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                                canvas2.drawRect(this.f6616h, this.f6611c);
                            }
                        } else if (i11 == 2) {
                            if (i9 == 0) {
                                this.f6611c.setColor(-16777216);
                                this.f6611c.setAlpha(ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                                canvas2.drawRect(this.f6616h, this.f6611c);
                            }
                            if (mask2.f6542d) {
                                C5059g.m12912e(canvas2, this.f6616h, this.f6613e, 31);
                                canvas2.drawRect(this.f6616h, this.f6611c);
                                this.f6613e.setAlpha((int) (((float) ((Integer) aVar4.mo23717f()).intValue()) * 2.55f));
                                this.f6609a.set((Path) aVar3.mo23717f());
                                this.f6609a.transform(matrix4);
                                canvas2.drawPath(this.f6609a, this.f6613e);
                                canvas.restore();
                            } else {
                                this.f6609a.set((Path) aVar3.mo23717f());
                                this.f6609a.transform(matrix4);
                                canvas2.drawPath(this.f6609a, this.f6613e);
                            }
                        } else if (i11 != 3) {
                            if (i11 == 4) {
                                if (mask2.f6542d) {
                                    C5059g.m12912e(canvas2, this.f6616h, this.f6611c, 31);
                                    canvas2.drawRect(this.f6616h, this.f6611c);
                                    this.f6609a.set((Path) aVar3.mo23717f());
                                    this.f6609a.transform(matrix4);
                                    this.f6611c.setAlpha((int) (((float) ((Integer) aVar4.mo23717f()).intValue()) * 2.55f));
                                    canvas2.drawPath(this.f6609a, this.f6613e);
                                    canvas.restore();
                                } else {
                                    this.f6609a.set((Path) aVar3.mo23717f());
                                    this.f6609a.transform(matrix4);
                                    this.f6611c.setAlpha((int) (((float) ((Integer) aVar4.mo23717f()).intValue()) * 2.55f));
                                    canvas2.drawPath(this.f6609a, this.f6611c);
                                }
                            }
                        } else if (mask2.f6542d) {
                            C5059g.m12912e(canvas2, this.f6616h, this.f6612d, 31);
                            canvas2.drawRect(this.f6616h, this.f6611c);
                            this.f6613e.setAlpha((int) (((float) ((Integer) aVar4.mo23717f()).intValue()) * 2.55f));
                            this.f6609a.set((Path) aVar3.mo23717f());
                            this.f6609a.transform(matrix4);
                            canvas2.drawPath(this.f6609a, this.f6613e);
                            canvas.restore();
                        } else {
                            C5059g.m12912e(canvas2, this.f6616h, this.f6612d, 31);
                            this.f6609a.set((Path) aVar3.mo23717f());
                            this.f6609a.transform(matrix4);
                            this.f6611c.setAlpha((int) (((float) ((Integer) aVar4.mo23717f()).intValue()) * 2.55f));
                            canvas2.drawPath(this.f6609a, this.f6611c);
                            canvas.restore();
                        }
                        i9++;
                        i3 = 1;
                    }
                    canvas.restore();
                    C17885a.m44412M();
                }
                if (this.f6625q != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    C5059g.m12912e(canvas2, this.f6616h, this.f6614f, 19);
                    C17885a.m44412M();
                    mo6810i(canvas);
                    this.f6625q.mo6807f(canvas2, matrix2, i4);
                    canvas.restore();
                    C17885a.m44412M();
                    C17885a.m44412M();
                }
                canvas.restore();
                C17885a.m44412M();
            }
            if (this.f6631w && (aVar = this.f6632x) != null) {
                aVar.setStyle(Paint.Style.STROKE);
                this.f6632x.setColor(-251901);
                this.f6632x.setStrokeWidth(4.0f);
                canvas2.drawRect(this.f6616h, this.f6632x);
                this.f6632x.setStyle(Paint.Style.FILL);
                this.f6632x.setColor(1357638635);
                canvas2.drawRect(this.f6616h, this.f6632x);
            }
            C17885a.m44412M();
            mo6815n();
            return;
        }
        this.f6610b.preConcat(this.f6629u.mo23742d());
        mo6811j(canvas2, this.f6610b, i4);
        C17885a.m44412M();
        C17885a.m44412M();
        mo6815n();
    }

    /* renamed from: g */
    public void mo5840g(C5282c cVar, Object obj) {
        this.f6629u.mo23741c(cVar, obj);
    }

    public final String getName() {
        return this.f6622n.f6587c;
    }

    /* renamed from: h */
    public final void mo6809h() {
        if (this.f6627s == null) {
            if (this.f6626r == null) {
                this.f6627s = Collections.emptyList();
                return;
            }
            this.f6627s = new ArrayList();
            for (C1894a aVar = this.f6626r; aVar != null; aVar = aVar.f6626r) {
                this.f6627s.add(aVar);
            }
        }
    }

    /* renamed from: i */
    public final void mo6810i(Canvas canvas) {
        RectF rectF = this.f6616h;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f6615g);
        C17885a.m44412M();
    }

    /* renamed from: j */
    public abstract void mo6811j(Canvas canvas, Matrix matrix, int i);

    /* renamed from: k */
    public C0262r mo6812k() {
        return this.f6622n.f6607w;
    }

    /* renamed from: l */
    public C4811j mo6813l() {
        return this.f6622n.f6608x;
    }

    /* renamed from: m */
    public final boolean mo6814m() {
        C7469h hVar = this.f6623o;
        if (hVar == null || ((List) hVar.f22900a).isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public final void mo6815n() {
        C1908u uVar = this.f6621m.f6482c.f6449a;
        String str = this.f6622n.f6587c;
        if (uVar.f6712a) {
            C5057e eVar = (C5057e) uVar.f6714c.get(str);
            if (eVar == null) {
                eVar = new C5057e();
                uVar.f6714c.put(str, eVar);
            }
            int i = eVar.f17055a + 1;
            eVar.f17055a = i;
            if (i == Integer.MAX_VALUE) {
                eVar.f17055a = i / 2;
            }
            if (str.equals("__container")) {
                Iterator it = uVar.f6713b.iterator();
                while (true) {
                    C6307g.C6308a aVar = (C6307g.C6308a) it;
                    if (aVar.hasNext()) {
                        ((C1908u.C1909a) aVar.next()).mo6856a();
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: o */
    public final void mo6816o(C7456a<?, ?> aVar) {
        this.f6628t.remove(aVar);
    }

    /* renamed from: p */
    public void mo6817p(C1482d dVar, int i, ArrayList arrayList, C1482d dVar2) {
    }

    /* renamed from: r */
    public void mo6818r(boolean z) {
        if (z && this.f6632x == null) {
            this.f6632x = new C7155a();
        }
        this.f6631w = z;
    }

    /* renamed from: s */
    public void mo6819s(float f) {
        C7477p pVar = this.f6629u;
        C7456a<Integer, Integer> aVar = pVar.f22928j;
        if (aVar != null) {
            aVar.mo23721j(f);
        }
        C7456a<?, Float> aVar2 = pVar.f22931m;
        if (aVar2 != null) {
            aVar2.mo23721j(f);
        }
        C7456a<?, Float> aVar3 = pVar.f22932n;
        if (aVar3 != null) {
            aVar3.mo23721j(f);
        }
        C7456a<PointF, PointF> aVar4 = pVar.f22924f;
        if (aVar4 != null) {
            aVar4.mo23721j(f);
        }
        C7456a<?, PointF> aVar5 = pVar.f22925g;
        if (aVar5 != null) {
            aVar5.mo23721j(f);
        }
        C7456a<C5283d, C5283d> aVar6 = pVar.f22926h;
        if (aVar6 != null) {
            aVar6.mo23721j(f);
        }
        C7456a<Float, Float> aVar7 = pVar.f22927i;
        if (aVar7 != null) {
            aVar7.mo23721j(f);
        }
        C7465d dVar = pVar.f22929k;
        if (dVar != null) {
            dVar.mo23721j(f);
        }
        C7465d dVar2 = pVar.f22930l;
        if (dVar2 != null) {
            dVar2.mo23721j(f);
        }
        if (this.f6623o != null) {
            for (int i = 0; i < ((List) this.f6623o.f22900a).size(); i++) {
                ((C7456a) ((List) this.f6623o.f22900a).get(i)).mo23721j(f);
            }
        }
        C7465d dVar3 = this.f6624p;
        if (dVar3 != null) {
            dVar3.mo23721j(f);
        }
        C1894a aVar8 = this.f6625q;
        if (aVar8 != null) {
            aVar8.mo6819s(f);
        }
        for (int i2 = 0; i2 < this.f6628t.size(); i2++) {
            ((C7456a) this.f6628t.get(i2)).mo23721j(f);
        }
    }
}
