package com.theartofdev.edmodo.cropper;

import android.graphics.RectF;

/* renamed from: com.theartofdev.edmodo.cropper.d */
public final class C8056d {

    /* renamed from: a */
    public final RectF f24491a = new RectF();

    /* renamed from: b */
    public final RectF f24492b = new RectF();

    /* renamed from: c */
    public float f24493c;

    /* renamed from: d */
    public float f24494d;

    /* renamed from: e */
    public float f24495e;

    /* renamed from: f */
    public float f24496f;

    /* renamed from: g */
    public float f24497g;

    /* renamed from: h */
    public float f24498h;

    /* renamed from: i */
    public float f24499i;

    /* renamed from: j */
    public float f24500j;

    /* renamed from: k */
    public float f24501k = 1.0f;

    /* renamed from: l */
    public float f24502l = 1.0f;

    /* renamed from: b */
    public static boolean m18389b(float f, float f2, float f3, float f4, float f5) {
        return Math.abs(f - f3) <= f5 && Math.abs(f2 - f4) <= f5;
    }

    /* renamed from: a */
    public final RectF mo25200a() {
        this.f24492b.set(this.f24491a);
        return this.f24492b;
    }
}
