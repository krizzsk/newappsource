package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import com.google.android.material.circularreveal.C13948b;

/* renamed from: com.google.android.material.circularreveal.c */
public interface C13950c extends C13948b.C13949a {

    /* renamed from: com.google.android.material.circularreveal.c$a */
    public static class C13951a implements TypeEvaluator<C13954d> {

        /* renamed from: b */
        public static final C13951a f34612b = new C13951a();

        /* renamed from: a */
        public final C13954d f34613a = new C13954d();

        public final Object evaluate(float f, Object obj, Object obj2) {
            C13954d dVar = (C13954d) obj;
            C13954d dVar2 = (C13954d) obj2;
            C13954d dVar3 = this.f34613a;
            float f2 = dVar.f34616a;
            float f3 = 1.0f - f;
            float f4 = (dVar2.f34616a * f) + (f2 * f3);
            float f5 = dVar.f34617b;
            float f6 = dVar2.f34617b * f;
            float f7 = dVar.f34618c;
            float f8 = f * dVar2.f34618c;
            dVar3.f34616a = f4;
            dVar3.f34617b = f6 + (f5 * f3);
            dVar3.f34618c = f8 + (f3 * f7);
            return dVar3;
        }
    }

    /* renamed from: com.google.android.material.circularreveal.c$b */
    public static class C13952b extends Property<C13950c, C13954d> {

        /* renamed from: a */
        public static final C13952b f34614a = new C13952b();

        public C13952b() {
            super(C13954d.class, "circularReveal");
        }

        public final Object get(Object obj) {
            return ((C13950c) obj).getRevealInfo();
        }

        public final void set(Object obj, Object obj2) {
            ((C13950c) obj).setRevealInfo((C13954d) obj2);
        }
    }

    /* renamed from: com.google.android.material.circularreveal.c$c */
    public static class C13953c extends Property<C13950c, Integer> {

        /* renamed from: a */
        public static final C13953c f34615a = new C13953c();

        public C13953c() {
            super(Integer.class, "circularRevealScrimColor");
        }

        public final Object get(Object obj) {
            return Integer.valueOf(((C13950c) obj).getCircularRevealScrimColor());
        }

        public final void set(Object obj, Object obj2) {
            ((C13950c) obj).setCircularRevealScrimColor(((Integer) obj2).intValue());
        }
    }

    /* renamed from: com.google.android.material.circularreveal.c$d */
    public static class C13954d {

        /* renamed from: a */
        public float f34616a;

        /* renamed from: b */
        public float f34617b;

        /* renamed from: c */
        public float f34618c;

        public C13954d() {
        }

        public C13954d(float f, float f2, float f3) {
            this.f34616a = f;
            this.f34617b = f2;
            this.f34618c = f3;
        }

        public C13954d(C13954d dVar) {
            this(dVar.f34616a, dVar.f34617b, dVar.f34618c);
        }
    }

    /* renamed from: a */
    void mo41445a();

    /* renamed from: b */
    void mo41446b();

    int getCircularRevealScrimColor();

    C13954d getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(C13954d dVar);
}
