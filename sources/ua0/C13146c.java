package ua0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import na0.C12935l;
import ua0.C13153g;
import ya0.C13288j;

/* renamed from: ua0.c */
public final class C13146c extends C13153g {

    /* renamed from: b */
    public final C12935l f32672b;

    /* renamed from: c */
    public final float f32673c;

    /* renamed from: d */
    public final int f32674d;

    /* renamed from: e */
    public boolean f32675e;

    /* renamed from: f */
    public float f32676f;

    /* renamed from: ua0.c$a */
    public static class C13147a<T extends C13147a<T>> extends C13153g.C13154a<T> {

        /* renamed from: i */
        public static Bitmap f32677i = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);

        /* renamed from: c */
        public Bitmap f32678c = f32677i;

        /* renamed from: d */
        public float f32679d = 0.1f;

        /* renamed from: e */
        public float f32680e = 1.0f;

        /* renamed from: f */
        public int f32681f = 1;

        /* renamed from: g */
        public Bitmap f32682g = null;

        /* renamed from: h */
        public float f32683h = BitmapDescriptorFactory.HUE_RED;

        static {
            for (int i = 0; i < 1; i++) {
                f32677i.setPixel(i, 0, -1);
            }
        }

        public C13147a() {
            this.f32694a = -1;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13146c(C13147a<?> aVar) {
        super(aVar);
        boolean z;
        float f;
        C13147a<?> aVar2 = aVar;
        Bitmap bitmap = aVar2.f32682g;
        if (bitmap != null) {
            z = true;
        } else {
            z = false;
        }
        this.f32675e = z;
        if (z) {
            this.f32672b = C12935l.m32749a(bitmap, aVar2.f32679d);
        } else {
            Bitmap bitmap2 = aVar2.f32678c;
            float f2 = aVar2.f32679d;
            float f3 = aVar2.f32680e;
            int width = bitmap2.getWidth();
            int height = bitmap2.getHeight();
            int c = C13288j.m33428c(width);
            int c2 = C13288j.m33428c(height);
            float f4 = ((float) width) / ((float) c);
            float f5 = 1.0f / f3;
            float[] fArr = {0.0f, f5, f4, f5, 0.0f, 0.0f, f4, 0.0f};
            Bitmap createBitmap = Bitmap.createBitmap(c, c2, Bitmap.Config.ARGB_8888);
            createBitmap.setDensity(bitmap2.getDensity());
            new Canvas(createBitmap).drawBitmap(bitmap2, new Rect(0, 0, width, height), new Rect(0, 0, width, c2), (Paint) null);
            if (f2 < BitmapDescriptorFactory.HUE_RED) {
                f2 = (-f2) * 0.0079f;
                f = ((float) height) * 0.0079f;
            } else {
                f = (float) height;
            }
            this.f32672b = new C12935l(createBitmap, fArr, f2 * 500000.0f, f * 500000.0f, 0, 1);
        }
        this.f32673c = aVar2.f32679d * 5.0f * 500000.0f;
        this.f32674d = aVar2.f32681f;
        this.f32676f = aVar2.f32683h;
    }

    /* renamed from: a */
    public final int mo40046a() {
        return this.f32672b.mo39815b() + 32 + 4 + 0 + 4 + 4 + 1 + 4;
    }
}
