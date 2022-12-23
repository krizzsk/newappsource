package ua0;

import android.graphics.Paint;
import android.graphics.Typeface;

/* renamed from: ua0.b */
public final class C13144b {

    /* renamed from: l */
    public static final C13144b f32650l;

    /* renamed from: a */
    public final int f32651a;

    /* renamed from: b */
    public final int f32652b;

    /* renamed from: c */
    public final int f32653c;

    /* renamed from: d */
    public final int f32654d;

    /* renamed from: e */
    public final int f32655e;

    /* renamed from: f */
    public final float f32656f = 19.0f;

    /* renamed from: g */
    public final Typeface f32657g;

    /* renamed from: h */
    public final int f32658h;

    /* renamed from: i */
    public final int f32659i;

    /* renamed from: j */
    public final int f32660j;

    /* renamed from: k */
    public final float f32661k;

    /* renamed from: ua0.b$a */
    public static class C13145a<T extends C13145a<T>> {

        /* renamed from: i */
        public static final Typeface f32662i = Typeface.create("Arial", 1);

        /* renamed from: j */
        public static final Paint.Align f32663j = Paint.Align.CENTER;

        /* renamed from: a */
        public int f32664a = 12;

        /* renamed from: b */
        public int f32665b = 6;

        /* renamed from: c */
        public int f32666c = 2;

        /* renamed from: d */
        public int f32667d = 15;

        /* renamed from: e */
        public Typeface f32668e = f32662i;

        /* renamed from: f */
        public Paint.Align f32669f = f32663j;

        /* renamed from: g */
        public int f32670g = -1;

        /* renamed from: h */
        public int f32671h = -16777216;

        static {
            Typeface.create("Arial", 0);
        }
    }

    static {
        C13145a aVar = new C13145a();
        aVar.f32670g = 0;
        aVar.f32671h = 0;
        aVar.f32666c = 0;
        aVar.f32664a = 0;
        aVar.f32665b = 0;
        aVar.f32667d = 0;
        f32650l = new C13144b(aVar);
    }

    public C13144b(C13145a<?> aVar) {
        this.f32651a = aVar.f32664a;
        this.f32652b = aVar.f32665b;
        this.f32653c = Math.max(0, 15 - aVar.f32666c);
        this.f32654d = aVar.f32666c;
        this.f32655e = aVar.f32667d;
        this.f32657g = aVar.f32668e;
        Paint.Align align = aVar.f32669f;
        this.f32660j = -16777216;
        this.f32658h = aVar.f32670g;
        this.f32659i = aVar.f32671h;
        this.f32661k = 1.0f;
    }
}
