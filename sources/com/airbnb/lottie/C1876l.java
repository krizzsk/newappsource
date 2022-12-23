package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Choreographer;
import android.view.View;
import androidx.appcompat.app.C0262r;
import com.airbnb.lottie.model.layer.C1896b;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.appboy.support.ValidationUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p006a5.C0080a;
import p006a5.C0081b;
import p024b5.C1482d;
import p024b5.C1483e;
import p024b5.C1485g;
import p037c5.C1781b;
import p037c5.C1789j;
import p037c5.C1790k;
import p037c5.C1791l;
import p094g5.C4811j;
import p094g5.C4826v;
import p107h5.C5055c;
import p107h5.C5056d;
import p107h5.C5058f;
import p120i5.C5282c;
import p358af.C13437d;
import p584jl.C17885a;

/* renamed from: com.airbnb.lottie.l */
public final class C1876l extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: b */
    public final Matrix f6481b = new Matrix();

    /* renamed from: c */
    public C1867f f6482c;

    /* renamed from: d */
    public final C5056d f6483d;

    /* renamed from: e */
    public float f6484e;

    /* renamed from: f */
    public boolean f6485f;

    /* renamed from: g */
    public boolean f6486g;

    /* renamed from: h */
    public boolean f6487h;

    /* renamed from: i */
    public final ArrayList<C1890n> f6488i;

    /* renamed from: j */
    public C0081b f6489j;

    /* renamed from: k */
    public String f6490k;

    /* renamed from: l */
    public C0080a f6491l;

    /* renamed from: m */
    public boolean f6492m;

    /* renamed from: n */
    public C1896b f6493n;

    /* renamed from: o */
    public int f6494o;

    /* renamed from: p */
    public boolean f6495p;

    /* renamed from: q */
    public boolean f6496q;

    /* renamed from: r */
    public boolean f6497r;

    /* renamed from: s */
    public boolean f6498s;

    /* renamed from: t */
    public boolean f6499t;

    /* renamed from: com.airbnb.lottie.l$a */
    public class C1877a implements C1890n {

        /* renamed from: a */
        public final /* synthetic */ String f6500a;

        public C1877a(String str) {
            this.f6500a = str;
        }

        public final void run() {
            C1876l.this.mo6783l(this.f6500a);
        }
    }

    /* renamed from: com.airbnb.lottie.l$b */
    public class C1878b implements C1890n {

        /* renamed from: a */
        public final /* synthetic */ int f6502a;

        public C1878b(int i) {
            this.f6502a = i;
        }

        public final void run() {
            C1876l.this.mo6776h(this.f6502a);
        }
    }

    /* renamed from: com.airbnb.lottie.l$c */
    public class C1879c implements C1890n {

        /* renamed from: a */
        public final /* synthetic */ float f6504a;

        public C1879c(float f) {
            this.f6504a = f;
        }

        public final void run() {
            C1876l.this.mo6787p(this.f6504a);
        }
    }

    /* renamed from: com.airbnb.lottie.l$d */
    public class C1880d implements C1890n {

        /* renamed from: a */
        public final /* synthetic */ C1482d f6506a;

        /* renamed from: b */
        public final /* synthetic */ Object f6507b;

        /* renamed from: c */
        public final /* synthetic */ C5282c f6508c;

        public C1880d(C1482d dVar, Object obj, C5282c cVar) {
            this.f6506a = dVar;
            this.f6507b = obj;
            this.f6508c = cVar;
        }

        public final void run() {
            C1876l.this.mo6764a(this.f6506a, this.f6507b, this.f6508c);
        }
    }

    /* renamed from: com.airbnb.lottie.l$e */
    public class C1881e implements ValueAnimator.AnimatorUpdateListener {
        public C1881e() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f;
            C1876l lVar = C1876l.this;
            C1896b bVar = lVar.f6493n;
            if (bVar != null) {
                C5056d dVar = lVar.f6483d;
                C1867f fVar = dVar.f17053k;
                if (fVar == null) {
                    f = BitmapDescriptorFactory.HUE_RED;
                } else {
                    float f2 = dVar.f17049g;
                    float f3 = fVar.f6459k;
                    f = (f2 - f3) / (fVar.f6460l - f3);
                }
                bVar.mo6819s(f);
            }
        }
    }

    /* renamed from: com.airbnb.lottie.l$f */
    public class C1882f implements C1890n {
        public C1882f() {
        }

        public final void run() {
            C1876l.this.mo6770f();
        }
    }

    /* renamed from: com.airbnb.lottie.l$g */
    public class C1883g implements C1890n {
        public C1883g() {
        }

        public final void run() {
            C1876l.this.mo6771g();
        }
    }

    /* renamed from: com.airbnb.lottie.l$h */
    public class C1884h implements C1890n {

        /* renamed from: a */
        public final /* synthetic */ int f6513a;

        public C1884h(int i) {
            this.f6513a = i;
        }

        public final void run() {
            C1876l.this.mo6784m(this.f6513a);
        }
    }

    /* renamed from: com.airbnb.lottie.l$i */
    public class C1885i implements C1890n {

        /* renamed from: a */
        public final /* synthetic */ float f6515a;

        public C1885i(float f) {
            this.f6515a = f;
        }

        public final void run() {
            C1876l.this.mo6786o(this.f6515a);
        }
    }

    /* renamed from: com.airbnb.lottie.l$j */
    public class C1886j implements C1890n {

        /* renamed from: a */
        public final /* synthetic */ int f6517a;

        public C1886j(int i) {
            this.f6517a = i;
        }

        public final void run() {
            C1876l.this.mo6777i(this.f6517a);
        }
    }

    /* renamed from: com.airbnb.lottie.l$k */
    public class C1887k implements C1890n {

        /* renamed from: a */
        public final /* synthetic */ float f6519a;

        public C1887k(float f) {
            this.f6519a = f;
        }

        public final void run() {
            C1876l.this.mo6782k(this.f6519a);
        }
    }

    /* renamed from: com.airbnb.lottie.l$l */
    public class C1888l implements C1890n {

        /* renamed from: a */
        public final /* synthetic */ String f6521a;

        public C1888l(String str) {
            this.f6521a = str;
        }

        public final void run() {
            C1876l.this.mo6785n(this.f6521a);
        }
    }

    /* renamed from: com.airbnb.lottie.l$m */
    public class C1889m implements C1890n {

        /* renamed from: a */
        public final /* synthetic */ String f6523a;

        public C1889m(String str) {
            this.f6523a = str;
        }

        public final void run() {
            C1876l.this.mo6781j(this.f6523a);
        }
    }

    /* renamed from: com.airbnb.lottie.l$n */
    public interface C1890n {
        void run();
    }

    public C1876l() {
        C5056d dVar = new C5056d();
        this.f6483d = dVar;
        this.f6484e = 1.0f;
        this.f6485f = true;
        this.f6486g = false;
        this.f6487h = false;
        this.f6488i = new ArrayList<>();
        C1881e eVar = new C1881e();
        this.f6494o = ValidationUtils.APPBOY_STRING_MAX_LENGTH;
        this.f6498s = true;
        this.f6499t = false;
        dVar.addUpdateListener(eVar);
    }

    /* renamed from: a */
    public final <T> void mo6764a(C1482d dVar, T t, C5282c cVar) {
        float f;
        C1896b bVar = this.f6493n;
        if (bVar == null) {
            this.f6488i.add(new C1880d(dVar, t, cVar));
            return;
        }
        boolean z = true;
        if (dVar == C1482d.f5381c) {
            bVar.mo5840g(cVar, t);
        } else {
            C1483e eVar = dVar.f5383b;
            if (eVar != null) {
                eVar.mo5840g(cVar, t);
            } else {
                ArrayList arrayList = new ArrayList();
                this.f6493n.mo5839c(dVar, 0, arrayList, new C1482d(new String[0]));
                for (int i = 0; i < arrayList.size(); i++) {
                    ((C1482d) arrayList.get(i)).f5383b.mo5840g(cVar, t);
                }
                z = true ^ arrayList.isEmpty();
            }
        }
        if (z) {
            invalidateSelf();
            if (t == C1903q.f6667E) {
                C5056d dVar2 = this.f6483d;
                C1867f fVar = dVar2.f17053k;
                if (fVar == null) {
                    f = BitmapDescriptorFactory.HUE_RED;
                } else {
                    float f2 = dVar2.f17049g;
                    float f3 = fVar.f6459k;
                    f = (f2 - f3) / (fVar.f6460l - f3);
                }
                mo6787p(f);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo6765b() {
        return this.f6485f || this.f6486g;
    }

    /* renamed from: c */
    public final void mo6766c() {
        C1867f fVar = this.f6482c;
        JsonReader.C1901a aVar = C4826v.f16239a;
        Rect rect = fVar.f6458j;
        List emptyList = Collections.emptyList();
        Layer.LayerType layerType = Layer.LayerType.PRE_COMP;
        List emptyList2 = Collections.emptyList();
        C1791l lVar = r14;
        C1791l lVar2 = new C1791l();
        Layer layer = r2;
        Layer layer2 = new Layer(emptyList, fVar, "__container", -1, layerType, -1, (String) null, emptyList2, lVar, 0, 0, 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, rect.width(), rect.height(), (C1789j) null, (C1790k) null, Collections.emptyList(), Layer.MatteType.NONE, (C1781b) null, false, (C0262r) null, (C4811j) null);
        C1867f fVar2 = this.f6482c;
        C1896b bVar = new C1896b(this, layer, fVar2.f6457i, fVar2);
        this.f6493n = bVar;
        if (this.f6496q) {
            bVar.mo6818r(true);
        }
    }

    /* renamed from: d */
    public final void mo6767d() {
        C5056d dVar = this.f6483d;
        if (dVar.f17054l) {
            dVar.cancel();
        }
        this.f6482c = null;
        this.f6493n = null;
        this.f6489j = null;
        C5056d dVar2 = this.f6483d;
        dVar2.f17053k = null;
        dVar2.f17051i = -2.14748365E9f;
        dVar2.f17052j = 2.14748365E9f;
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        this.f6499t = false;
        if (this.f6487h) {
            try {
                mo6769e(canvas);
            } catch (Throwable unused) {
                C5055c.f17045a.getClass();
            }
        } else {
            mo6769e(canvas);
        }
        C17885a.m44412M();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ad  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6769e(android.graphics.Canvas r10) {
        /*
            r9 = this;
            com.airbnb.lottie.f r0 = r9.f6482c
            if (r0 == 0) goto L_0x0032
            android.graphics.Rect r1 = r9.getBounds()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x000f
            goto L_0x0032
        L_0x000f:
            android.graphics.Rect r1 = r9.getBounds()
            int r2 = r1.width()
            float r2 = (float) r2
            int r1 = r1.height()
            float r1 = (float) r1
            float r2 = r2 / r1
            android.graphics.Rect r0 = r0.f6458j
            int r1 = r0.width()
            float r1 = (float) r1
            int r0 = r0.height()
            float r0 = (float) r0
            float r1 = r1 / r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            r0 = 0
            goto L_0x0033
        L_0x0032:
            r0 = 1
        L_0x0033:
            r1 = 1073741824(0x40000000, float:2.0)
            r2 = -1
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L_0x00ad
            com.airbnb.lottie.model.layer.b r0 = r9.f6493n
            com.airbnb.lottie.f r4 = r9.f6482c
            if (r0 == 0) goto L_0x0121
            if (r4 != 0) goto L_0x0044
            goto L_0x0121
        L_0x0044:
            android.graphics.Rect r5 = r9.getBounds()
            int r6 = r5.width()
            float r6 = (float) r6
            android.graphics.Rect r7 = r4.f6458j
            int r7 = r7.width()
            float r7 = (float) r7
            float r6 = r6 / r7
            int r7 = r5.height()
            float r7 = (float) r7
            android.graphics.Rect r4 = r4.f6458j
            int r4 = r4.height()
            float r4 = (float) r4
            float r7 = r7 / r4
            boolean r4 = r9.f6498s
            if (r4 == 0) goto L_0x0095
            float r4 = java.lang.Math.min(r6, r7)
            int r8 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r8 >= 0) goto L_0x0073
            float r8 = r3 / r4
            float r6 = r6 / r8
            float r7 = r7 / r8
            goto L_0x0075
        L_0x0073:
            r8 = 1065353216(0x3f800000, float:1.0)
        L_0x0075:
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0095
            int r2 = r10.save()
            int r3 = r5.width()
            float r3 = (float) r3
            float r3 = r3 / r1
            int r5 = r5.height()
            float r5 = (float) r5
            float r5 = r5 / r1
            float r1 = r3 * r4
            float r4 = r4 * r5
            float r3 = r3 - r1
            float r5 = r5 - r4
            r10.translate(r3, r5)
            r10.scale(r8, r8, r1, r4)
        L_0x0095:
            android.graphics.Matrix r1 = r9.f6481b
            r1.reset()
            android.graphics.Matrix r1 = r9.f6481b
            r1.preScale(r6, r7)
            android.graphics.Matrix r1 = r9.f6481b
            int r3 = r9.f6494o
            r0.mo6807f(r10, r1, r3)
            if (r2 <= 0) goto L_0x0121
            r10.restoreToCount(r2)
            goto L_0x0121
        L_0x00ad:
            com.airbnb.lottie.model.layer.b r0 = r9.f6493n
            com.airbnb.lottie.f r4 = r9.f6482c
            if (r0 == 0) goto L_0x0121
            if (r4 != 0) goto L_0x00b6
            goto L_0x0121
        L_0x00b6:
            float r5 = r9.f6484e
            int r6 = r10.getWidth()
            float r6 = (float) r6
            android.graphics.Rect r7 = r4.f6458j
            int r7 = r7.width()
            float r7 = (float) r7
            float r6 = r6 / r7
            int r7 = r10.getHeight()
            float r7 = (float) r7
            android.graphics.Rect r8 = r4.f6458j
            int r8 = r8.height()
            float r8 = (float) r8
            float r7 = r7 / r8
            float r6 = java.lang.Math.min(r6, r7)
            int r7 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r7 <= 0) goto L_0x00de
            float r5 = r9.f6484e
            float r5 = r5 / r6
            goto L_0x00e1
        L_0x00de:
            r6 = r5
            r5 = 1065353216(0x3f800000, float:1.0)
        L_0x00e1:
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x010b
            int r2 = r10.save()
            android.graphics.Rect r3 = r4.f6458j
            int r3 = r3.width()
            float r3 = (float) r3
            float r3 = r3 / r1
            android.graphics.Rect r4 = r4.f6458j
            int r4 = r4.height()
            float r4 = (float) r4
            float r4 = r4 / r1
            float r1 = r3 * r6
            float r7 = r4 * r6
            float r8 = r9.f6484e
            float r3 = r3 * r8
            float r3 = r3 - r1
            float r8 = r8 * r4
            float r8 = r8 - r7
            r10.translate(r3, r8)
            r10.scale(r5, r5, r1, r7)
        L_0x010b:
            android.graphics.Matrix r1 = r9.f6481b
            r1.reset()
            android.graphics.Matrix r1 = r9.f6481b
            r1.preScale(r6, r6)
            android.graphics.Matrix r1 = r9.f6481b
            int r3 = r9.f6494o
            r0.mo6807f(r10, r1, r3)
            if (r2 <= 0) goto L_0x0121
            r10.restoreToCount(r2)
        L_0x0121:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.C1876l.mo6769e(android.graphics.Canvas):void");
    }

    /* renamed from: f */
    public final void mo6770f() {
        float f;
        float f2;
        if (this.f6493n == null) {
            this.f6488i.add(new C1882f());
            return;
        }
        if (mo6765b() || this.f6483d.getRepeatCount() == 0) {
            C5056d dVar = this.f6483d;
            dVar.f17054l = true;
            boolean i = dVar.mo20805i();
            Iterator it = dVar.f17043c.iterator();
            while (it.hasNext()) {
                Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) it.next();
                if (Build.VERSION.SDK_INT >= 26) {
                    animatorListener.onAnimationStart(dVar, i);
                } else {
                    animatorListener.onAnimationStart(dVar);
                }
            }
            if (dVar.mo20805i()) {
                f2 = dVar.mo20800g();
            } else {
                f2 = dVar.mo20804h();
            }
            dVar.mo20808k((float) ((int) f2));
            dVar.f17048f = 0;
            dVar.f17050h = 0;
            if (dVar.f17054l) {
                dVar.mo20807j(false);
                Choreographer.getInstance().postFrameCallback(dVar);
            }
        }
        if (!mo6765b()) {
            C5056d dVar2 = this.f6483d;
            if (dVar2.f17046d < BitmapDescriptorFactory.HUE_RED) {
                f = dVar2.mo20804h();
            } else {
                f = dVar2.mo20800g();
            }
            mo6776h((int) f);
            C5056d dVar3 = this.f6483d;
            dVar3.mo20807j(true);
            dVar3.mo20786a(dVar3.mo20805i());
        }
    }

    /* renamed from: g */
    public final void mo6771g() {
        float f;
        if (this.f6493n == null) {
            this.f6488i.add(new C1883g());
            return;
        }
        if (mo6765b() || this.f6483d.getRepeatCount() == 0) {
            C5056d dVar = this.f6483d;
            dVar.f17054l = true;
            dVar.mo20807j(false);
            Choreographer.getInstance().postFrameCallback(dVar);
            dVar.f17048f = 0;
            if (dVar.mo20805i() && dVar.f17049g == dVar.mo20804h()) {
                dVar.f17049g = dVar.mo20800g();
            } else if (!dVar.mo20805i() && dVar.f17049g == dVar.mo20800g()) {
                dVar.f17049g = dVar.mo20804h();
            }
        }
        if (!mo6765b()) {
            C5056d dVar2 = this.f6483d;
            if (dVar2.f17046d < BitmapDescriptorFactory.HUE_RED) {
                f = dVar2.mo20804h();
            } else {
                f = dVar2.mo20800g();
            }
            mo6776h((int) f);
            C5056d dVar3 = this.f6483d;
            dVar3.mo20807j(true);
            dVar3.mo20786a(dVar3.mo20805i());
        }
    }

    public final int getAlpha() {
        return this.f6494o;
    }

    public final int getIntrinsicHeight() {
        C1867f fVar = this.f6482c;
        if (fVar == null) {
            return -1;
        }
        return (int) (((float) fVar.f6458j.height()) * this.f6484e);
    }

    public final int getIntrinsicWidth() {
        C1867f fVar = this.f6482c;
        if (fVar == null) {
            return -1;
        }
        return (int) (((float) fVar.f6458j.width()) * this.f6484e);
    }

    public final int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public final void mo6776h(int i) {
        if (this.f6482c == null) {
            this.f6488i.add(new C1878b(i));
        } else {
            this.f6483d.mo20808k((float) i);
        }
    }

    /* renamed from: i */
    public final void mo6777i(int i) {
        if (this.f6482c == null) {
            this.f6488i.add(new C1886j(i));
            return;
        }
        C5056d dVar = this.f6483d;
        dVar.mo20809l(dVar.f17051i, ((float) i) + 0.99f);
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public final void invalidateSelf() {
        if (!this.f6499t) {
            this.f6499t = true;
            Drawable.Callback callback = getCallback();
            if (callback != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    public final boolean isRunning() {
        C5056d dVar = this.f6483d;
        if (dVar == null) {
            return false;
        }
        return dVar.f17054l;
    }

    /* renamed from: j */
    public final void mo6781j(String str) {
        C1867f fVar = this.f6482c;
        if (fVar == null) {
            this.f6488i.add(new C1889m(str));
            return;
        }
        C1485g c = fVar.mo6757c(str);
        if (c != null) {
            mo6777i((int) (c.f5387b + c.f5388c));
            return;
        }
        throw new IllegalArgumentException(C13437d.m33706k("Cannot find marker with name ", str, "."));
    }

    /* renamed from: k */
    public final void mo6782k(float f) {
        C1867f fVar = this.f6482c;
        if (fVar == null) {
            this.f6488i.add(new C1887k(f));
            return;
        }
        float f2 = fVar.f6459k;
        float f3 = fVar.f6460l;
        PointF pointF = C5058f.f17056a;
        mo6777i((int) C16759e.m42347c(f3, f2, f, f2));
    }

    /* renamed from: l */
    public final void mo6783l(String str) {
        C1867f fVar = this.f6482c;
        if (fVar == null) {
            this.f6488i.add(new C1877a(str));
            return;
        }
        C1485g c = fVar.mo6757c(str);
        if (c != null) {
            int i = (int) c.f5387b;
            int i2 = ((int) c.f5388c) + i;
            if (this.f6482c == null) {
                this.f6488i.add(new C1891m(this, i, i2));
            } else {
                this.f6483d.mo20809l((float) i, ((float) i2) + 0.99f);
            }
        } else {
            throw new IllegalArgumentException(C13437d.m33706k("Cannot find marker with name ", str, "."));
        }
    }

    /* renamed from: m */
    public final void mo6784m(int i) {
        if (this.f6482c == null) {
            this.f6488i.add(new C1884h(i));
            return;
        }
        C5056d dVar = this.f6483d;
        dVar.mo20809l((float) i, (float) ((int) dVar.f17052j));
    }

    /* renamed from: n */
    public final void mo6785n(String str) {
        C1867f fVar = this.f6482c;
        if (fVar == null) {
            this.f6488i.add(new C1888l(str));
            return;
        }
        C1485g c = fVar.mo6757c(str);
        if (c != null) {
            mo6784m((int) c.f5387b);
            return;
        }
        throw new IllegalArgumentException(C13437d.m33706k("Cannot find marker with name ", str, "."));
    }

    /* renamed from: o */
    public final void mo6786o(float f) {
        C1867f fVar = this.f6482c;
        if (fVar == null) {
            this.f6488i.add(new C1885i(f));
            return;
        }
        float f2 = fVar.f6459k;
        float f3 = fVar.f6460l;
        PointF pointF = C5058f.f17056a;
        mo6784m((int) C16759e.m42347c(f3, f2, f, f2));
    }

    /* renamed from: p */
    public final void mo6787p(float f) {
        C1867f fVar = this.f6482c;
        if (fVar == null) {
            this.f6488i.add(new C1879c(f));
            return;
        }
        C5056d dVar = this.f6483d;
        float f2 = fVar.f6459k;
        float f3 = fVar.f6460l;
        PointF pointF = C5058f.f17056a;
        dVar.mo20808k(((f3 - f2) * f) + f2);
        C17885a.m44412M();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public final void setAlpha(int i) {
        this.f6494o = i;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        C5055c.m12896b("Use addColorFilter instead.");
    }

    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && !((View) callback).isInEditMode()) {
            mo6770f();
        }
    }

    public final void stop() {
        this.f6488i.clear();
        C5056d dVar = this.f6483d;
        dVar.mo20807j(true);
        dVar.mo20786a(dVar.mo20805i());
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
