package ua0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import java.util.WeakHashMap;
import na0.C12935l;
import ua0.C13142a;

/* renamed from: ua0.d */
public final class C13148d extends C13142a {

    /* renamed from: h */
    public static final WeakHashMap<Point, Bitmap> f32684h = new WeakHashMap<>();

    /* renamed from: f */
    public final C12935l f32685f;

    /* renamed from: g */
    public final C12935l f32686g;

    /* renamed from: ua0.d$a */
    public static class C13149a<T extends C13149a<T>> extends C13142a.C13143a<T> {

        /* renamed from: j */
        public static final Bitmap f32687j = BitmapFactory.decodeByteArray(new byte[0], 0, 0);

        /* renamed from: g */
        public Bitmap f32688g = f32687j;

        /* renamed from: h */
        public float f32689h = 0.5f;

        /* renamed from: i */
        public Float f32690i = null;

        public C13149a() {
            this.f32694a = -1;
        }
    }

    public C13148d(C13149a<?> aVar) {
        super(aVar);
        float f;
        this.f32685f = C12935l.m32749a(aVar.f32688g, aVar.f32689h);
        int width = aVar.f32688g.getWidth();
        int height = aVar.f32688g.getHeight();
        Point point = new Point(width, height);
        WeakHashMap<Point, Bitmap> weakHashMap = f32684h;
        Bitmap bitmap = weakHashMap.get(point);
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            bitmap.eraseColor(-1);
            weakHashMap.put(point, bitmap);
        }
        Float f2 = aVar.f32690i;
        if (f2 != null) {
            f = f2.floatValue();
        } else {
            f = aVar.f32689h;
        }
        this.f32686g = C12935l.m32749a(bitmap, f);
    }

    /* renamed from: a */
    public final int mo40046a() {
        return this.f32686g.mo39815b() + this.f32685f.mo39815b() + 61 + 4;
    }
}
