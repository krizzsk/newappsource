package p146k6;

import android.graphics.Bitmap;
import p060d6.C4393i;
import p060d6.C4397l;
import p072e6.C4566d;
import p311x6.C7176l;

/* renamed from: k6.d */
public final class C5498d implements C4397l<Bitmap>, C4393i {

    /* renamed from: b */
    public final Bitmap f18042b;

    /* renamed from: c */
    public final C4566d f18043c;

    public C5498d(Bitmap bitmap, C4566d dVar) {
        if (bitmap != null) {
            this.f18042b = bitmap;
            if (dVar != null) {
                this.f18043c = dVar;
                return;
            }
            throw new NullPointerException("BitmapPool must not be null");
        }
        throw new NullPointerException("Bitmap must not be null");
    }

    /* renamed from: c */
    public static C5498d m13681c(Bitmap bitmap, C4566d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new C5498d(bitmap, dVar);
    }

    /* renamed from: a */
    public final void mo10979a() {
        this.f18043c.mo20086d(this.f18042b);
    }

    /* renamed from: b */
    public final Class<Bitmap> mo10980b() {
        return Bitmap.class;
    }

    /* renamed from: e */
    public final int mo10983e() {
        return C7176l.m16783c(this.f18042b);
    }

    public final Object get() {
        return this.f18042b;
    }

    public final void initialize() {
        this.f18042b.prepareToDraw();
    }
}
