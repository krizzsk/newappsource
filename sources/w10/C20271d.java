package w10;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import p060d6.C4397l;
import p072e6.C4566d;
import p311x6.C7176l;

/* renamed from: w10.d */
public final class C20271d implements C4397l<C20268a> {

    /* renamed from: b */
    public final C20268a f51401b;

    /* renamed from: c */
    public final Bitmap f51402c;

    /* renamed from: d */
    public final C4566d f51403d;

    public C20271d(C20268a aVar, Bitmap bitmap, C4566d dVar) {
        this.f51401b = aVar;
        this.f51402c = bitmap;
        this.f51403d = dVar;
    }

    /* renamed from: a */
    public final void mo10979a() {
        C4566d dVar;
        Bitmap bitmap = this.f51402c;
        if (bitmap != null && (dVar = this.f51403d) != null) {
            dVar.mo20086d(bitmap);
        }
    }

    /* renamed from: b */
    public final Class<C20268a> mo10980b() {
        return C20268a.class;
    }

    /* renamed from: e */
    public final int mo10983e() {
        int i;
        int i2;
        Drawable drawable = (Drawable) this.f51401b.f51397b;
        Bitmap bitmap = this.f51402c;
        if (bitmap != null) {
            i = C7176l.m16783c(bitmap);
        } else {
            i = Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
        }
        if (((PointF) this.f51401b.f51398c) != null) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        return i + i2;
    }

    public final Object get() {
        return this.f51401b;
    }
}
