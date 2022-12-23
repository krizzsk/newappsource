package com.google.android.material.circularreveal;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.circularreveal.C13950c;
import p626lf.C18201b;

/* renamed from: com.google.android.material.circularreveal.b */
public final class C13948b {

    /* renamed from: a */
    public final C13949a f34607a;

    /* renamed from: b */
    public final View f34608b;

    /* renamed from: c */
    public final Paint f34609c;

    /* renamed from: d */
    public C13950c.C13954d f34610d;

    /* renamed from: e */
    public Drawable f34611e;

    /* renamed from: com.google.android.material.circularreveal.b$a */
    public interface C13949a {
        /* renamed from: c */
        void mo41447c(Canvas canvas);

        /* renamed from: d */
        boolean mo41448d();
    }

    public C13948b(C13949a aVar) {
        this.f34607a = aVar;
        View view = (View) aVar;
        this.f34608b = view;
        view.setWillNotDraw(false);
        new Path();
        new Paint(7);
        Paint paint = new Paint(1);
        this.f34609c = paint;
        paint.setColor(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41466a(android.graphics.Canvas r10) {
        /*
            r9 = this;
            com.google.android.material.circularreveal.c$d r0 = r9.f34610d
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0017
            float r0 = r0.f34618c
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 == 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x0018
        L_0x0017:
            r0 = 1
        L_0x0018:
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x0048
            com.google.android.material.circularreveal.b$a r0 = r9.f34607a
            r0.mo41447c(r10)
            android.graphics.Paint r0 = r9.f34609c
            int r0 = r0.getColor()
            int r0 = android.graphics.Color.alpha(r0)
            if (r0 == 0) goto L_0x002e
            r0 = 1
            goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            if (r0 == 0) goto L_0x0074
            r4 = 0
            r5 = 0
            android.view.View r0 = r9.f34608b
            int r0 = r0.getWidth()
            float r6 = (float) r0
            android.view.View r0 = r9.f34608b
            int r0 = r0.getHeight()
            float r7 = (float) r0
            android.graphics.Paint r8 = r9.f34609c
            r3 = r10
            r3.drawRect(r4, r5, r6, r7, r8)
            goto L_0x0074
        L_0x0048:
            com.google.android.material.circularreveal.b$a r0 = r9.f34607a
            r0.mo41447c(r10)
            android.graphics.Paint r0 = r9.f34609c
            int r0 = r0.getColor()
            int r0 = android.graphics.Color.alpha(r0)
            if (r0 == 0) goto L_0x005b
            r0 = 1
            goto L_0x005c
        L_0x005b:
            r0 = 0
        L_0x005c:
            if (r0 == 0) goto L_0x0074
            r4 = 0
            r5 = 0
            android.view.View r0 = r9.f34608b
            int r0 = r0.getWidth()
            float r6 = (float) r0
            android.view.View r0 = r9.f34608b
            int r0 = r0.getHeight()
            float r7 = (float) r0
            android.graphics.Paint r8 = r9.f34609c
            r3 = r10
            r3.drawRect(r4, r5, r6, r7, r8)
        L_0x0074:
            android.graphics.drawable.Drawable r0 = r9.f34611e
            if (r0 == 0) goto L_0x007d
            com.google.android.material.circularreveal.c$d r3 = r9.f34610d
            if (r3 == 0) goto L_0x007d
            r1 = 1
        L_0x007d:
            if (r1 == 0) goto L_0x00a8
            android.graphics.Rect r0 = r0.getBounds()
            com.google.android.material.circularreveal.c$d r1 = r9.f34610d
            float r1 = r1.f34616a
            int r2 = r0.width()
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            float r1 = r1 - r2
            com.google.android.material.circularreveal.c$d r2 = r9.f34610d
            float r2 = r2.f34617b
            int r0 = r0.height()
            float r0 = (float) r0
            float r0 = r0 / r3
            float r2 = r2 - r0
            r10.translate(r1, r2)
            android.graphics.drawable.Drawable r0 = r9.f34611e
            r0.draw(r10)
            float r0 = -r1
            float r1 = -r2
            r10.translate(r0, r1)
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.circularreveal.C13948b.mo41466a(android.graphics.Canvas):void");
    }

    /* renamed from: b */
    public final int mo41467b() {
        return this.f34609c.getColor();
    }

    /* renamed from: c */
    public final C13950c.C13954d mo41468c() {
        boolean z;
        C13950c.C13954d dVar = this.f34610d;
        if (dVar == null) {
            return null;
        }
        C13950c.C13954d dVar2 = new C13950c.C13954d(dVar);
        if (dVar2.f34618c == Float.MAX_VALUE) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            dVar2.f34618c = C18201b.m44917n(dVar2.f34616a, dVar2.f34617b, (float) this.f34608b.getWidth(), (float) this.f34608b.getHeight());
        }
        return dVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0023 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo41469d() {
        /*
            r4 = this;
            com.google.android.material.circularreveal.b$a r0 = r4.f34607a
            boolean r0 = r0.mo41448d()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0024
            com.google.android.material.circularreveal.c$d r0 = r4.f34610d
            if (r0 == 0) goto L_0x001f
            float r0 = r0.f34618c
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0019
            r0 = 1
            goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = 0
            goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            r0 = r0 ^ r2
            if (r0 != 0) goto L_0x0024
            r1 = 1
        L_0x0024:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.circularreveal.C13948b.mo41469d():boolean");
    }

    /* renamed from: e */
    public final void mo41470e(Drawable drawable) {
        this.f34611e = drawable;
        this.f34608b.invalidate();
    }

    /* renamed from: f */
    public final void mo41471f(int i) {
        this.f34609c.setColor(i);
        this.f34608b.invalidate();
    }

    /* renamed from: g */
    public final void mo41472g(C13950c.C13954d dVar) {
        boolean z;
        if (dVar == null) {
            this.f34610d = null;
        } else {
            C13950c.C13954d dVar2 = this.f34610d;
            if (dVar2 == null) {
                this.f34610d = new C13950c.C13954d(dVar);
            } else {
                float f = dVar.f34616a;
                float f2 = dVar.f34617b;
                float f3 = dVar.f34618c;
                dVar2.f34616a = f;
                dVar2.f34617b = f2;
                dVar2.f34618c = f3;
            }
            if (dVar.f34618c + 1.0E-4f >= C18201b.m44917n(dVar.f34616a, dVar.f34617b, (float) this.f34608b.getWidth(), (float) this.f34608b.getHeight())) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f34610d.f34618c = Float.MAX_VALUE;
            }
        }
        this.f34608b.invalidate();
    }
}
