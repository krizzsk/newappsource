package com.nutiteq;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.animation.Interpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.commons.view.GLTextureView;
import com.moovit.map.MapFragment;
import com.nutiteq.components.MapPos;
import la0.C12854a;
import na0.C12922a;
import na0.C12925d;
import na0.C12927e;
import na0.C12932j;
import na0.C12934k;
import p028ba.C1512f;
import pa0.C12999b;
import sa0.C13096e;
import sa0.C13097f;
import v20.C20092c;
import ya0.C13275b;

@SuppressLint({"Override"})
public class MapView extends GLTextureView {

    /* renamed from: q */
    public static final String[] f24162q = {"primou", "primoc", "saga", "spade", "ace", "magnids", "vision", "vivow", "mahimahi"};

    /* renamed from: o */
    public C12925d f24163o;

    /* renamed from: p */
    public boolean f24164p = true;

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private Rect getSizeWithFallback() {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        int width = getWidth();
        if (width == 0) {
            width = displayMetrics.widthPixels;
        }
        int height = getHeight();
        if (height == 0) {
            height = displayMetrics.heightPixels;
        }
        return new Rect(0, 0, width, height);
    }

    /* renamed from: d */
    public final MapPos mo24884d(double d, double d2) {
        MapPos n = ((C13096e) getMapRenderer()).mo39977n(d, d2);
        return this.f24163o.f32009g.mo39887d().mo39928a(n.f24175b, n.f24176c);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001c  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24885e(oa0.C12974i r4) {
        /*
            r3 = this;
            sa0.f r0 = r3.getMapRenderer()
            sa0.e r0 = (sa0.C13096e) r0
            if (r4 == 0) goto L_0x0012
            r0.getClass()
            za0.f<?> r1 = r4.f32123c
            if (r1 == 0) goto L_0x0012
            boolean r1 = r1.f32171b
            goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            r2 = 0
            if (r1 != 0) goto L_0x001c
            r0.f32452n0 = r2
            r0.mo39976m()
            goto L_0x002c
        L_0x001c:
            r0.f32452n0 = r4
            r1 = 1
            r0.f32458q0 = r1
            r0.f32460r0 = r1
            com.nutiteq.components.MapPos r4 = r4.mo39839a(r2)
            r0.f32428P = r4
            r0.mo39976m()
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nutiteq.MapView.mo24885e(oa0.i):void");
    }

    /* renamed from: f */
    public final void mo24886f(C12922a aVar, Rect rect, C1512f fVar) {
        boolean z;
        C12922a aVar2 = aVar;
        Rect rect2 = rect;
        C1512f fVar2 = fVar;
        Rect sizeWithFallback = getSizeWithFallback();
        int width = rect.width();
        int height = rect.height();
        if (width > 0 && height > 0) {
            MapPos g = mo24887g(aVar2.f31984a, aVar2.f31986c);
            MapPos g2 = mo24887g(aVar2.f31985b, aVar2.f31987d);
            double abs = Math.abs(g2.f24175b - g.f24175b);
            double abs2 = Math.abs(g2.f24176c - g.f24176c);
            double d = g.f24175b;
            double d2 = ((double) rect2.left) * abs;
            double d3 = abs;
            double d4 = (double) width;
            double d5 = d - (d2 / d4);
            double d6 = (double) height;
            double d7 = g.f24176c - ((((double) rect2.top) * abs2) / d6);
            double d8 = g2.f24175b;
            double d9 = g2.f24176c;
            MapPos d11 = mo24884d(d5, d7);
            MapPos d12 = mo24884d(((((double) (sizeWithFallback.width() - rect2.right)) * d3) / d4) + d8, ((abs2 * ((double) (sizeWithFallback.height() - rect2.bottom))) / d6) + d9);
            double d13 = d11.f24175b;
            double d14 = d11.f24176c;
            double d15 = d12.f24175b;
            double d16 = d12.f24176c;
            Rect sizeWithFallback2 = getSizeWithFallback();
            int height2 = sizeWithFallback2.height();
            int width2 = sizeWithFallback2.width();
            MapPos c = this.f24163o.f32009g.mo39887d().mo39930c(d13, d16);
            MapPos c2 = this.f24163o.f32009g.mo39887d().mo39930c(d15, d14);
            double abs3 = Math.abs(c2.f24175b - c.f24175b);
            double abs4 = Math.abs(c2.f24176c - c.f24176c);
            double d17 = (double) height2;
            double d18 = (double) width2;
            if (abs3 * d17 > d18 * abs4) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                d17 = d18;
            }
            if (!z) {
                abs3 = abs4;
            }
            float f = C13275b.f32936c;
            double log = Math.log(((d17 * 500000.0d) / ((double) (((float) this.f24163o.f32011i.f32044k) * f))) / ((abs3 / 2.0d) / ((double) f))) / Math.log(2.0d);
            C12934k kVar = getConstraints().f32016a;
            double max = Math.max((double) kVar.f32057a, Math.min((double) kVar.f32058b, log));
            double d19 = (c.f24175b + c2.f24175b) / 2.0d;
            double d21 = (c.f24176c + c2.f24176c) / 2.0d;
            float f2 = (float) max;
            C1512f fVar3 = fVar;
            C20092c cVar = (C20092c) fVar3.f5435c;
            cVar.getClass();
            int b = ((MapFragment.C16223e) fVar3.f5436d).mo48673b(cVar.mo52343J(getFocusPoint()), cVar.mo52343J(new MapPos(d19, d21)), getZoom(), f2);
            C13096e eVar = (C13096e) getMapRenderer();
            eVar.mo39988x();
            eVar.mo39989y();
            if (b > 0) {
                eVar.f32417I.mo39951a(3, b, 90.0f, (Interpolator) null);
            } else {
                eVar.f32417I.mo39953c(3);
                eVar.mo39961C(90.0f);
            }
            eVar.mo39988x();
            eVar.mo39989y();
            if (b > 0) {
                eVar.f32417I.mo39951a(1, b, BitmapDescriptorFactory.HUE_RED, (Interpolator) null);
            } else {
                eVar.f32417I.mo39953c(1);
                eVar.mo39960B(BitmapDescriptorFactory.HUE_RED);
            }
            eVar.mo39986t(f2, b, (Interpolator) null);
            eVar.mo39982p(d19, d21, b, (Interpolator) null);
        }
    }

    /* renamed from: g */
    public final MapPos mo24887g(double d, double d2) {
        MapPos c = getLayers().mo39887d().mo39930c(d, d2);
        return ((C13096e) getMapRenderer()).mo39963E(c.f24175b, c.f24176c, 0.0d);
    }

    public MapPos getCameraPos() {
        MapPos d = ((C13096e) getMapRenderer()).mo39967d();
        return this.f24163o.f32009g.mo39887d().mo39928a(d.f24175b, d.f24176c);
    }

    public C12925d getComponents() {
        return this.f24163o;
    }

    public C12927e getConstraints() {
        return this.f24163o.f32010h;
    }

    public MapPos getFocusPoint() {
        MapPos g = ((C13096e) getMapRenderer()).mo39970g();
        return this.f24163o.f32009g.mo39887d().mo39928a(g.f24175b, g.f24176c);
    }

    public C12999b getLayers() {
        return this.f24163o.f32009g;
    }

    public C13097f getMapRenderer() {
        return this.f24163o.f32012j;
    }

    public C12932j getOptions() {
        return this.f24163o.f32011i;
    }

    public float getRotation() {
        return getRotationCompat();
    }

    public float getRotationCompat() {
        return ((((C13096e) getMapRenderer()).f32469w % 360.0f) + 360.0f) % 360.0f;
    }

    public Bitmap getScreenCapture() {
        ((C13096e) getMapRenderer()).getClass();
        return null;
    }

    public float getTilt() {
        return 90.0f - ((C13096e) getMapRenderer()).f32471x;
    }

    public float getZoom() {
        return ((C13096e) getMapRenderer()).f32473y;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("superState"));
        float f = bundle.getFloat("zoom");
        float f2 = bundle.getFloat("rotation");
        setFocusPoint((MapPos) bundle.getParcelable("focusPoint"));
        setZoom(f);
        setRotationCompat(f2);
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superState", super.onSaveInstanceState());
        bundle.putParcelable("focusPoint", getFocusPoint());
        bundle.putFloat("zoom", getZoom());
        bundle.putFloat("rotation", getRotationCompat());
        return bundle;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x006a  */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r30) {
        /*
            r29 = this;
            r1 = r29
            na0.d r0 = r1.f24163o
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x03aa
            sa0.e r0 = r0.f32012j
            oa0.i r4 = r0.f32452n0
            r5 = 2
            r6 = 0
            if (r4 == 0) goto L_0x006f
            com.nutiteq.components.MapPos r7 = r0.f32468v0
            if (r7 == 0) goto L_0x006f
            xa0.a r4 = r4.f32121a
            if (r4 == 0) goto L_0x006f
            xa0.f r4 = (xa0.C13250f) r4
            boolean r7 = r4.f32891o
            if (r7 != 0) goto L_0x001f
            goto L_0x0067
        L_0x001f:
            android.graphics.Matrix r7 = r4.f32892p
            if (r7 != 0) goto L_0x0024
            goto L_0x0067
        L_0x0024:
            float[] r8 = new float[r5]
            float r9 = r30.getX()
            r8[r2] = r9
            float r9 = r30.getY()
            r8[r3] = r9
            r7.mapPoints(r8)
            r7 = r8[r2]
            int r9 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r9 < 0) goto L_0x0067
            r9 = r8[r3]
            int r10 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r10 < 0) goto L_0x0067
            int r10 = r4.f32883g
            float r10 = (float) r10
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x0067
            int r7 = r4.f32884h
            float r7 = (float) r7
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r7 < 0) goto L_0x0050
            goto L_0x0067
        L_0x0050:
            android.view.MotionEvent r7 = android.view.MotionEvent.obtain(r30)
            r9 = r8[r2]
            r8 = r8[r3]
            r7.setLocation(r9, r8)
            android.os.Handler r8 = r4.f32879c
            xa0.e r9 = new xa0.e
            r9.<init>(r4, r7)
            r8.post(r9)
            r4 = 1
            goto L_0x0068
        L_0x0067:
            r4 = 0
        L_0x0068:
            if (r4 == 0) goto L_0x006f
            r0.mo39976m()
            goto L_0x03a5
        L_0x006f:
            r0.mo39976m()
            wa0.b r4 = r0.f32412F0
            monitor-enter(r4)
            float r0 = r30.getX()     // Catch:{ all -> 0x03a7 }
            float r7 = r30.getY()     // Catch:{ all -> 0x03a7 }
            na0.j r8 = r4.f32822d     // Catch:{ all -> 0x03a7 }
            boolean r8 = r8.f32050q     // Catch:{ all -> 0x03a7 }
            r9 = 6
            if (r8 != 0) goto L_0x008b
            int r8 = r4.f32819a     // Catch:{ all -> 0x03a7 }
            if (r8 != r9) goto L_0x008b
            monitor-exit(r4)
            goto L_0x03aa
        L_0x008b:
            int r8 = r30.getAction()     // Catch:{ all -> 0x03a7 }
            if (r8 == 0) goto L_0x0319
            if (r8 == r3) goto L_0x0270
            if (r8 == r5) goto L_0x01fa
            r10 = 3
            if (r8 == r10) goto L_0x0190
            r11 = 5
            if (r8 == r11) goto L_0x0319
            if (r8 == r9) goto L_0x0270
            r5 = 261(0x105, float:3.66E-43)
            if (r8 == r5) goto L_0x0101
            r5 = 262(0x106, float:3.67E-43)
            if (r8 == r5) goto L_0x00a7
            goto L_0x03a4
        L_0x00a7:
            int r5 = r4.f32819a     // Catch:{ all -> 0x03a7 }
            switch(r5) {
                case 1: goto L_0x00d9;
                case 2: goto L_0x00d9;
                case 3: goto L_0x00d9;
                case 4: goto L_0x00d9;
                case 5: goto L_0x00be;
                case 6: goto L_0x00ae;
                default: goto L_0x00ac;
            }     // Catch:{ all -> 0x03a7 }
        L_0x00ac:
            goto L_0x03a4
        L_0x00ae:
            wa0.a r0 = r4.f32836r     // Catch:{ all -> 0x03a7 }
            boolean r0 = r0.f32818q     // Catch:{ all -> 0x03a7 }
            if (r0 == 0) goto L_0x03a4
            wa0.a r0 = r4.f32836r     // Catch:{ all -> 0x03a7 }
            int r2 = r0.f32810i     // Catch:{ all -> 0x03a7 }
            int r2 = r2 + -1
            r0.f32810i = r2     // Catch:{ all -> 0x03a7 }
            goto L_0x03a4
        L_0x00be:
            na0.i r5 = r4.f32833o     // Catch:{ all -> 0x03a7 }
            double r8 = (double) r0     // Catch:{ all -> 0x03a7 }
            double r6 = (double) r7     // Catch:{ all -> 0x03a7 }
            r5.f32031a = r8     // Catch:{ all -> 0x03a7 }
            r5.f32032b = r6     // Catch:{ all -> 0x03a7 }
            r4.f32819a = r2     // Catch:{ all -> 0x03a7 }
            na0.j r0 = r4.f32822d     // Catch:{ all -> 0x03a7 }
            boolean r0 = r0.f32049p     // Catch:{ all -> 0x03a7 }
            if (r0 == 0) goto L_0x03a4
            sa0.f r0 = r4.f32820b     // Catch:{ all -> 0x03a7 }
            sa0.e r0 = (sa0.C13096e) r0     // Catch:{ all -> 0x03a7 }
            r0.f32413G = r3     // Catch:{ all -> 0x03a7 }
            r0.mo39976m()     // Catch:{ all -> 0x03a7 }
            goto L_0x03a4
        L_0x00d9:
            na0.i r5 = r4.f32833o     // Catch:{ all -> 0x03a7 }
            double r8 = (double) r0     // Catch:{ all -> 0x03a7 }
            double r6 = (double) r7     // Catch:{ all -> 0x03a7 }
            r5.f32031a = r8     // Catch:{ all -> 0x03a7 }
            r5.f32032b = r6     // Catch:{ all -> 0x03a7 }
            na0.h r0 = r4.f32823e     // Catch:{ all -> 0x03a7 }
            sa0.f r5 = r4.f32820b     // Catch:{ all -> 0x03a7 }
            sa0.e r5 = (sa0.C13096e) r5     // Catch:{ all -> 0x03a7 }
            com.nutiteq.components.MapPos r5 = r5.mo39978o(r8, r6)     // Catch:{ all -> 0x03a7 }
            r0.mo39799c(r5)     // Catch:{ all -> 0x03a7 }
            r4.f32819a = r2     // Catch:{ all -> 0x03a7 }
            na0.j r0 = r4.f32822d     // Catch:{ all -> 0x03a7 }
            boolean r0 = r0.f32049p     // Catch:{ all -> 0x03a7 }
            if (r0 == 0) goto L_0x03a4
            sa0.f r0 = r4.f32820b     // Catch:{ all -> 0x03a7 }
            sa0.e r0 = (sa0.C13096e) r0     // Catch:{ all -> 0x03a7 }
            r0.f32413G = r3     // Catch:{ all -> 0x03a7 }
            r0.mo39976m()     // Catch:{ all -> 0x03a7 }
            goto L_0x03a4
        L_0x0101:
            float r5 = p584jl.C17885a.m44431b0(r30)     // Catch:{ all -> 0x03a7 }
            float r6 = p584jl.C17885a.m44432c0(r30)     // Catch:{ all -> 0x03a7 }
            sa0.f r8 = r4.f32820b     // Catch:{ all -> 0x03a7 }
            sa0.e r8 = (sa0.C13096e) r8     // Catch:{ all -> 0x03a7 }
            na0.h r11 = r8.f32427O     // Catch:{ all -> 0x03a7 }
            double r13 = (double) r5     // Catch:{ all -> 0x03a7 }
            float r12 = r8.f32431S     // Catch:{ all -> 0x03a7 }
            float r12 = r12 - r6
            double r9 = (double) r12     // Catch:{ all -> 0x03a7 }
            r11.f32028a = r13     // Catch:{ all -> 0x03a7 }
            r11.f32029b = r9     // Catch:{ all -> 0x03a7 }
            r8.f32423L = r3     // Catch:{ all -> 0x03a7 }
            r8.mo39976m()     // Catch:{ all -> 0x03a7 }
            r4.f32835q = r2     // Catch:{ all -> 0x03a7 }
            sa0.f r2 = r4.f32820b     // Catch:{ all -> 0x03a7 }
            sa0.e r2 = (sa0.C13096e) r2     // Catch:{ all -> 0x03a7 }
            r2.mo39989y()     // Catch:{ all -> 0x03a7 }
            int r2 = r4.f32819a     // Catch:{ all -> 0x03a7 }
            if (r2 == 0) goto L_0x015e
            r8 = 6
            if (r2 == r8) goto L_0x012f
            goto L_0x03a4
        L_0x012f:
            wa0.a r2 = r4.f32836r     // Catch:{ all -> 0x03a7 }
            boolean r2 = r2.f32818q     // Catch:{ all -> 0x03a7 }
            if (r2 == 0) goto L_0x0159
            wa0.a r0 = r4.f32836r     // Catch:{ all -> 0x03a7 }
            int r2 = r0.f32810i     // Catch:{ all -> 0x03a7 }
            int r2 = r2 + r3
            r0.f32810i = r2     // Catch:{ all -> 0x03a7 }
            boolean r2 = r0.f32816o     // Catch:{ all -> 0x03a7 }
            if (r2 == 0) goto L_0x0142
            goto L_0x03a4
        L_0x0142:
            r0.f32814m = r5     // Catch:{ all -> 0x03a7 }
            r0.f32815n = r6     // Catch:{ all -> 0x03a7 }
            r2 = 3
            r0.f32803b = r2     // Catch:{ all -> 0x03a7 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x03a7 }
            long r7 = r0.f32808g     // Catch:{ all -> 0x03a7 }
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x03a4
            r0.f32816o = r3     // Catch:{ all -> 0x03a7 }
            r0.f32817p = r3     // Catch:{ all -> 0x03a7 }
            goto L_0x03a4
        L_0x0159:
            r4.mo40101c(r0, r7, r5, r6)     // Catch:{ all -> 0x03a7 }
            goto L_0x03a4
        L_0x015e:
            na0.i r15 = r4.f32831m     // Catch:{ all -> 0x03a7 }
            r16 = 0
            r18 = 0
            r20 = 0
            r15.mo39810f(r16, r18, r20)     // Catch:{ all -> 0x03a7 }
            na0.i r2 = r4.f32832n     // Catch:{ all -> 0x03a7 }
            r23 = 0
            r25 = 0
            r27 = 0
            r22 = r2
            r22.mo39810f(r23, r25, r27)     // Catch:{ all -> 0x03a7 }
            na0.h r15 = r4.f32823e     // Catch:{ all -> 0x03a7 }
            double r8 = (double) r0     // Catch:{ all -> 0x03a7 }
            double r10 = (double) r7     // Catch:{ all -> 0x03a7 }
            r20 = 0
            r16 = r8
            r18 = r10
            r15.mo39798b(r16, r18, r20)     // Catch:{ all -> 0x03a7 }
            na0.h r12 = r4.f32824f     // Catch:{ all -> 0x03a7 }
            double r5 = (double) r6     // Catch:{ all -> 0x03a7 }
            r17 = 0
            r15 = r5
            r12.mo39798b(r13, r15, r17)     // Catch:{ all -> 0x03a7 }
            r4.f32819a = r3     // Catch:{ all -> 0x03a7 }
            goto L_0x03a4
        L_0x0190:
            sa0.f r0 = r4.f32820b     // Catch:{ all -> 0x03a7 }
            sa0.e r0 = (sa0.C13096e) r0     // Catch:{ all -> 0x03a7 }
            r0.f32426N = r3     // Catch:{ all -> 0x03a7 }
            r0.mo39976m()     // Catch:{ all -> 0x03a7 }
            int r0 = r4.f32819a     // Catch:{ all -> 0x03a7 }
            switch(r0) {
                case 0: goto L_0x01d9;
                case 1: goto L_0x01be;
                case 2: goto L_0x01be;
                case 3: goto L_0x01be;
                case 4: goto L_0x01be;
                case 5: goto L_0x01ad;
                case 6: goto L_0x01a0;
                default: goto L_0x019e;
            }     // Catch:{ all -> 0x03a7 }
        L_0x019e:
            goto L_0x03a4
        L_0x01a0:
            wa0.a r0 = r4.f32836r     // Catch:{ all -> 0x03a7 }
            boolean r0 = r0.f32818q     // Catch:{ all -> 0x03a7 }
            if (r0 == 0) goto L_0x03a4
            wa0.a r0 = r4.f32836r     // Catch:{ all -> 0x03a7 }
            r0.mo40097c()     // Catch:{ all -> 0x03a7 }
            goto L_0x03a4
        L_0x01ad:
            na0.h r5 = r4.f32823e     // Catch:{ all -> 0x03a7 }
            na0.h r0 = r4.f32824f     // Catch:{ all -> 0x03a7 }
            double r6 = r0.f32028a     // Catch:{ all -> 0x03a7 }
            double r8 = r0.f32029b     // Catch:{ all -> 0x03a7 }
            r10 = 0
            r5.mo39798b(r6, r8, r10)     // Catch:{ all -> 0x03a7 }
            r4.f32819a = r2     // Catch:{ all -> 0x03a7 }
            goto L_0x03a4
        L_0x01be:
            float r0 = p584jl.C17885a.m44431b0(r30)     // Catch:{ all -> 0x03a7 }
            float r5 = p584jl.C17885a.m44432c0(r30)     // Catch:{ all -> 0x03a7 }
            na0.h r6 = r4.f32823e     // Catch:{ all -> 0x03a7 }
            sa0.f r7 = r4.f32820b     // Catch:{ all -> 0x03a7 }
            double r8 = (double) r0     // Catch:{ all -> 0x03a7 }
            double r10 = (double) r5     // Catch:{ all -> 0x03a7 }
            sa0.e r7 = (sa0.C13096e) r7     // Catch:{ all -> 0x03a7 }
            com.nutiteq.components.MapPos r0 = r7.mo39978o(r8, r10)     // Catch:{ all -> 0x03a7 }
            r6.mo39799c(r0)     // Catch:{ all -> 0x03a7 }
            r4.f32819a = r2     // Catch:{ all -> 0x03a7 }
            goto L_0x03a4
        L_0x01d9:
            r0 = 6
            r4.f32819a = r0     // Catch:{ all -> 0x03a7 }
            na0.j r0 = r4.f32822d     // Catch:{ all -> 0x03a7 }
            boolean r0 = r0.f32049p     // Catch:{ all -> 0x03a7 }
            if (r0 == 0) goto L_0x01f1
            boolean r0 = r4.f32835q     // Catch:{ all -> 0x03a7 }
            if (r0 == 0) goto L_0x01f1
            sa0.f r0 = r4.f32820b     // Catch:{ all -> 0x03a7 }
            sa0.e r0 = (sa0.C13096e) r0     // Catch:{ all -> 0x03a7 }
            r0.f32409E = r3     // Catch:{ all -> 0x03a7 }
            r0.mo39976m()     // Catch:{ all -> 0x03a7 }
            goto L_0x03a4
        L_0x01f1:
            sa0.f r0 = r4.f32820b     // Catch:{ all -> 0x03a7 }
            sa0.e r0 = (sa0.C13096e) r0     // Catch:{ all -> 0x03a7 }
            r0.mo39966c(r2)     // Catch:{ all -> 0x03a7 }
            goto L_0x03a4
        L_0x01fa:
            int r2 = r4.f32819a     // Catch:{ all -> 0x03a7 }
            switch(r2) {
                case 0: goto L_0x0265;
                case 1: goto L_0x0252;
                case 2: goto L_0x0247;
                case 3: goto L_0x0234;
                case 4: goto L_0x0221;
                case 5: goto L_0x020e;
                case 6: goto L_0x0201;
                default: goto L_0x01ff;
            }     // Catch:{ all -> 0x03a7 }
        L_0x01ff:
            goto L_0x03a4
        L_0x0201:
            wa0.a r2 = r4.f32836r     // Catch:{ all -> 0x03a7 }
            boolean r2 = r2.f32818q     // Catch:{ all -> 0x03a7 }
            if (r2 == 0) goto L_0x03a4
            wa0.a r2 = r4.f32836r     // Catch:{ all -> 0x03a7 }
            r2.mo40096b(r0, r7)     // Catch:{ all -> 0x03a7 }
            goto L_0x03a4
        L_0x020e:
            float r2 = p584jl.C17885a.m44431b0(r30)     // Catch:{ all -> 0x03a7 }
            float r5 = p584jl.C17885a.m44432c0(r30)     // Catch:{ all -> 0x03a7 }
            na0.j r6 = r4.f32822d     // Catch:{ all -> 0x03a7 }
            boolean r6 = r6.f32049p     // Catch:{ all -> 0x03a7 }
            if (r6 == 0) goto L_0x03a4
            r4.mo40103e(r0, r7, r2, r5)     // Catch:{ all -> 0x03a7 }
            goto L_0x03a4
        L_0x0221:
            float r2 = p584jl.C17885a.m44431b0(r30)     // Catch:{ all -> 0x03a7 }
            float r5 = p584jl.C17885a.m44432c0(r30)     // Catch:{ all -> 0x03a7 }
            na0.j r6 = r4.f32822d     // Catch:{ all -> 0x03a7 }
            boolean r6 = r6.f32049p     // Catch:{ all -> 0x03a7 }
            if (r6 == 0) goto L_0x03a4
            r4.mo40106h(r0, r7, r2, r5)     // Catch:{ all -> 0x03a7 }
            goto L_0x03a4
        L_0x0234:
            float r2 = p584jl.C17885a.m44431b0(r30)     // Catch:{ all -> 0x03a7 }
            float r5 = p584jl.C17885a.m44432c0(r30)     // Catch:{ all -> 0x03a7 }
            na0.j r6 = r4.f32822d     // Catch:{ all -> 0x03a7 }
            boolean r6 = r6.f32049p     // Catch:{ all -> 0x03a7 }
            if (r6 == 0) goto L_0x03a4
            r4.mo40105g(r0, r7, r2, r5)     // Catch:{ all -> 0x03a7 }
            goto L_0x03a4
        L_0x0247:
            na0.j r2 = r4.f32822d     // Catch:{ all -> 0x03a7 }
            boolean r2 = r2.f32049p     // Catch:{ all -> 0x03a7 }
            if (r2 == 0) goto L_0x03a4
            r4.mo40107i(r0, r7)     // Catch:{ all -> 0x03a7 }
            goto L_0x03a4
        L_0x0252:
            float r2 = p584jl.C17885a.m44431b0(r30)     // Catch:{ all -> 0x03a7 }
            float r5 = p584jl.C17885a.m44432c0(r30)     // Catch:{ all -> 0x03a7 }
            na0.j r6 = r4.f32822d     // Catch:{ all -> 0x03a7 }
            boolean r6 = r6.f32049p     // Catch:{ all -> 0x03a7 }
            if (r6 == 0) goto L_0x03a4
            r4.mo40104f(r0, r7, r2, r5)     // Catch:{ all -> 0x03a7 }
            goto L_0x03a4
        L_0x0265:
            na0.j r2 = r4.f32822d     // Catch:{ all -> 0x03a7 }
            boolean r2 = r2.f32049p     // Catch:{ all -> 0x03a7 }
            if (r2 == 0) goto L_0x03a4
            r4.mo40108j(r0, r7)     // Catch:{ all -> 0x03a7 }
            goto L_0x03a4
        L_0x0270:
            sa0.f r5 = r4.f32820b     // Catch:{ all -> 0x03a7 }
            sa0.e r5 = (sa0.C13096e) r5     // Catch:{ all -> 0x03a7 }
            na0.h r6 = r5.f32427O     // Catch:{ all -> 0x03a7 }
            double r8 = (double) r0     // Catch:{ all -> 0x03a7 }
            float r0 = r5.f32431S     // Catch:{ all -> 0x03a7 }
            float r0 = r0 - r7
            double r10 = (double) r0     // Catch:{ all -> 0x03a7 }
            r6.f32028a = r8     // Catch:{ all -> 0x03a7 }
            r6.f32029b = r10     // Catch:{ all -> 0x03a7 }
            r5.f32425M = r3     // Catch:{ all -> 0x03a7 }
            r5.mo39976m()     // Catch:{ all -> 0x03a7 }
            int r0 = r4.f32819a     // Catch:{ all -> 0x03a7 }
            switch(r0) {
                case 0: goto L_0x02f8;
                case 1: goto L_0x02c8;
                case 2: goto L_0x02c8;
                case 3: goto L_0x02c8;
                case 4: goto L_0x02c8;
                case 5: goto L_0x0298;
                case 6: goto L_0x028b;
                default: goto L_0x0289;
            }     // Catch:{ all -> 0x03a7 }
        L_0x0289:
            goto L_0x03a4
        L_0x028b:
            wa0.a r0 = r4.f32836r     // Catch:{ all -> 0x03a7 }
            boolean r0 = r0.f32818q     // Catch:{ all -> 0x03a7 }
            if (r0 == 0) goto L_0x03a4
            wa0.a r0 = r4.f32836r     // Catch:{ all -> 0x03a7 }
            r0.mo40097c()     // Catch:{ all -> 0x03a7 }
            goto L_0x03a4
        L_0x0298:
            float r0 = p584jl.C17885a.m44431b0(r30)     // Catch:{ all -> 0x03a7 }
            float r5 = p584jl.C17885a.m44432c0(r30)     // Catch:{ all -> 0x03a7 }
            na0.i r6 = r4.f32833o     // Catch:{ all -> 0x03a7 }
            double r7 = (double) r0     // Catch:{ all -> 0x03a7 }
            double r9 = (double) r5     // Catch:{ all -> 0x03a7 }
            r6.f32031a = r7     // Catch:{ all -> 0x03a7 }
            r6.f32032b = r9     // Catch:{ all -> 0x03a7 }
            na0.h r11 = r4.f32823e     // Catch:{ all -> 0x03a7 }
            na0.h r0 = r4.f32824f     // Catch:{ all -> 0x03a7 }
            double r12 = r0.f32028a     // Catch:{ all -> 0x03a7 }
            double r14 = r0.f32029b     // Catch:{ all -> 0x03a7 }
            r16 = 0
            r11.mo39798b(r12, r14, r16)     // Catch:{ all -> 0x03a7 }
            r4.f32819a = r2     // Catch:{ all -> 0x03a7 }
            na0.j r0 = r4.f32822d     // Catch:{ all -> 0x03a7 }
            boolean r0 = r0.f32049p     // Catch:{ all -> 0x03a7 }
            if (r0 == 0) goto L_0x03a4
            sa0.f r0 = r4.f32820b     // Catch:{ all -> 0x03a7 }
            sa0.e r0 = (sa0.C13096e) r0     // Catch:{ all -> 0x03a7 }
            r0.f32413G = r3     // Catch:{ all -> 0x03a7 }
            r0.mo39976m()     // Catch:{ all -> 0x03a7 }
            goto L_0x03a4
        L_0x02c8:
            float r0 = p584jl.C17885a.m44431b0(r30)     // Catch:{ all -> 0x03a7 }
            float r5 = p584jl.C17885a.m44432c0(r30)     // Catch:{ all -> 0x03a7 }
            na0.i r6 = r4.f32833o     // Catch:{ all -> 0x03a7 }
            double r7 = (double) r0     // Catch:{ all -> 0x03a7 }
            double r9 = (double) r5     // Catch:{ all -> 0x03a7 }
            r6.f32031a = r7     // Catch:{ all -> 0x03a7 }
            r6.f32032b = r9     // Catch:{ all -> 0x03a7 }
            na0.h r0 = r4.f32823e     // Catch:{ all -> 0x03a7 }
            sa0.f r5 = r4.f32820b     // Catch:{ all -> 0x03a7 }
            sa0.e r5 = (sa0.C13096e) r5     // Catch:{ all -> 0x03a7 }
            com.nutiteq.components.MapPos r5 = r5.mo39978o(r7, r9)     // Catch:{ all -> 0x03a7 }
            r0.mo39799c(r5)     // Catch:{ all -> 0x03a7 }
            r4.f32819a = r2     // Catch:{ all -> 0x03a7 }
            na0.j r0 = r4.f32822d     // Catch:{ all -> 0x03a7 }
            boolean r0 = r0.f32049p     // Catch:{ all -> 0x03a7 }
            if (r0 == 0) goto L_0x03a4
            sa0.f r0 = r4.f32820b     // Catch:{ all -> 0x03a7 }
            sa0.e r0 = (sa0.C13096e) r0     // Catch:{ all -> 0x03a7 }
            r0.f32413G = r3     // Catch:{ all -> 0x03a7 }
            r0.mo39976m()     // Catch:{ all -> 0x03a7 }
            goto L_0x03a4
        L_0x02f8:
            r0 = 6
            r4.f32819a = r0     // Catch:{ all -> 0x03a7 }
            na0.j r0 = r4.f32822d     // Catch:{ all -> 0x03a7 }
            boolean r0 = r0.f32049p     // Catch:{ all -> 0x03a7 }
            if (r0 == 0) goto L_0x0310
            boolean r0 = r4.f32835q     // Catch:{ all -> 0x03a7 }
            if (r0 == 0) goto L_0x0310
            sa0.f r0 = r4.f32820b     // Catch:{ all -> 0x03a7 }
            sa0.e r0 = (sa0.C13096e) r0     // Catch:{ all -> 0x03a7 }
            r0.f32409E = r3     // Catch:{ all -> 0x03a7 }
            r0.mo39976m()     // Catch:{ all -> 0x03a7 }
            goto L_0x03a4
        L_0x0310:
            sa0.f r0 = r4.f32820b     // Catch:{ all -> 0x03a7 }
            sa0.e r0 = (sa0.C13096e) r0     // Catch:{ all -> 0x03a7 }
            r0.mo39966c(r2)     // Catch:{ all -> 0x03a7 }
            goto L_0x03a4
        L_0x0319:
            sa0.f r8 = r4.f32820b     // Catch:{ all -> 0x03a7 }
            sa0.e r8 = (sa0.C13096e) r8     // Catch:{ all -> 0x03a7 }
            na0.h r9 = r8.f32427O     // Catch:{ all -> 0x03a7 }
            double r10 = (double) r0     // Catch:{ all -> 0x03a7 }
            float r12 = r8.f32431S     // Catch:{ all -> 0x03a7 }
            float r12 = r12 - r7
            double r12 = (double) r12     // Catch:{ all -> 0x03a7 }
            r9.f32028a = r10     // Catch:{ all -> 0x03a7 }
            r9.f32029b = r12     // Catch:{ all -> 0x03a7 }
            r8.f32423L = r3     // Catch:{ all -> 0x03a7 }
            r8.mo39976m()     // Catch:{ all -> 0x03a7 }
            na0.i r8 = r4.f32833o     // Catch:{ all -> 0x03a7 }
            double r12 = (double) r7     // Catch:{ all -> 0x03a7 }
            r8.f32031a = r10     // Catch:{ all -> 0x03a7 }
            r8.f32032b = r12     // Catch:{ all -> 0x03a7 }
            r4.f32834p = r2     // Catch:{ all -> 0x03a7 }
            int r8 = r4.f32819a     // Catch:{ all -> 0x03a7 }
            if (r8 == 0) goto L_0x0372
            r9 = 6
            if (r8 == r9) goto L_0x033e
            goto L_0x03a4
        L_0x033e:
            r4.f32835q = r3     // Catch:{ all -> 0x03a7 }
            sa0.f r6 = r4.f32820b     // Catch:{ all -> 0x03a7 }
            sa0.e r6 = (sa0.C13096e) r6     // Catch:{ all -> 0x03a7 }
            r6.mo39988x()     // Catch:{ all -> 0x03a7 }
            sa0.f r6 = r4.f32820b     // Catch:{ all -> 0x03a7 }
            sa0.e r6 = (sa0.C13096e) r6     // Catch:{ all -> 0x03a7 }
            r6.mo39989y()     // Catch:{ all -> 0x03a7 }
            sa0.f r6 = r4.f32820b     // Catch:{ all -> 0x03a7 }
            sa0.e r6 = (sa0.C13096e) r6     // Catch:{ all -> 0x03a7 }
            r6.mo39966c(r2)     // Catch:{ all -> 0x03a7 }
            wa0.a r2 = r4.f32836r     // Catch:{ all -> 0x03a7 }
            boolean r2 = r2.f32818q     // Catch:{ all -> 0x03a7 }
            if (r2 != 0) goto L_0x0360
            wa0.a r2 = r4.f32836r     // Catch:{ all -> 0x03a7 }
            r2.mo40095a()     // Catch:{ all -> 0x03a7 }
        L_0x0360:
            wa0.a r2 = r4.f32836r     // Catch:{ all -> 0x03a7 }
            int r6 = r2.f32810i     // Catch:{ all -> 0x03a7 }
            int r6 = r6 + r3
            r2.f32810i = r6     // Catch:{ all -> 0x03a7 }
            r2.f32811j = r0     // Catch:{ all -> 0x03a7 }
            r2.f32812k = r7     // Catch:{ all -> 0x03a7 }
            int r0 = r2.f32803b     // Catch:{ all -> 0x03a7 }
            if (r0 != r5) goto L_0x03a4
            r2.f32816o = r3     // Catch:{ all -> 0x03a7 }
            goto L_0x03a4
        L_0x0372:
            na0.i r14 = r4.f32831m     // Catch:{ all -> 0x03a7 }
            r15 = 0
            r17 = 0
            r19 = 0
            r14.mo39810f(r15, r17, r19)     // Catch:{ all -> 0x03a7 }
            na0.i r0 = r4.f32832n     // Catch:{ all -> 0x03a7 }
            r22 = 0
            r24 = 0
            r26 = 0
            r21 = r0
            r21.mo39810f(r22, r24, r26)     // Catch:{ all -> 0x03a7 }
            na0.h r0 = r4.f32823e     // Catch:{ all -> 0x03a7 }
            r21 = 0
            r16 = r0
            r17 = r10
            r19 = r12
            r16.mo39798b(r17, r19, r21)     // Catch:{ all -> 0x03a7 }
            na0.h r14 = r4.f32824f     // Catch:{ all -> 0x03a7 }
            double r5 = (double) r6     // Catch:{ all -> 0x03a7 }
            r19 = 0
            r15 = r5
            r17 = r5
            r14.mo39798b(r15, r17, r19)     // Catch:{ all -> 0x03a7 }
            r4.f32819a = r3     // Catch:{ all -> 0x03a7 }
        L_0x03a4:
            monitor-exit(r4)
        L_0x03a5:
            r2 = 1
            goto L_0x03aa
        L_0x03a7:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x03aa:
            if (r2 == 0) goto L_0x03b7
            boolean r0 = r1.f24164p
            if (r0 == 0) goto L_0x03b7
            android.view.ViewParent r0 = r29.getParent()
            r0.requestDisallowInterceptTouchEvent(r3)
        L_0x03b7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nutiteq.MapView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setComponents(C12925d dVar) {
        C12925d dVar2 = this.f24163o;
        if (dVar2 != null) {
            dVar2.f32012j.f32445j = null;
        }
        this.f24163o = dVar;
        if (dVar != null) {
            setFocusable(true);
            setEGLConfigChooser((GLSurfaceView.EGLConfigChooser) new C12854a());
            C13097f mapRenderer = getMapRenderer();
            ((C13096e) mapRenderer).f32445j = this;
            setRenderer(mapRenderer);
            setRenderMode(0);
        }
    }

    public void setFocusPoint(MapPos mapPos) {
        MapPos c = this.f24163o.f32009g.mo39887d().mo39930c(mapPos.f24175b, mapPos.f24176c);
        ((C13096e) getMapRenderer()).mo39982p(c.f24175b, c.f24176c, 0, (Interpolator) null);
    }

    public void setRequestDisallowInterceptTouchEvent(boolean z) {
        this.f24164p = z;
    }

    public void setRotation(float f) {
        setRotationCompat(f);
    }

    public void setRotationCompat(float f) {
        C13096e eVar = (C13096e) getMapRenderer();
        eVar.mo39988x();
        eVar.mo39989y();
        eVar.f32417I.mo39953c(1);
        eVar.mo39960B(f);
    }

    public void setTilt(float f) {
        C13096e eVar = (C13096e) getMapRenderer();
        eVar.mo39988x();
        eVar.mo39989y();
        eVar.f32417I.mo39953c(3);
        eVar.mo39961C(f);
    }

    public void setZoom(float f) {
        ((C13096e) getMapRenderer()).mo39986t(f, 0, (Interpolator) null);
    }
}
