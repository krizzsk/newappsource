package w10;

import android.graphics.Bitmap;
import android.graphics.drawable.NinePatchDrawable;
import p060d6.C4397l;
import p072e6.C4566d;
import p311x6.C7176l;

/* renamed from: w10.f */
public final class C20273f implements C4397l<NinePatchDrawable> {

    /* renamed from: b */
    public final NinePatchDrawable f51405b;

    /* renamed from: c */
    public final Bitmap f51406c;

    /* renamed from: d */
    public final C4566d f51407d;

    public C20273f(NinePatchDrawable ninePatchDrawable, Bitmap bitmap, C4566d dVar) {
        this.f51405b = ninePatchDrawable;
        this.f51406c = bitmap;
        this.f51407d = dVar;
    }

    /* renamed from: a */
    public final void mo10979a() {
        C4566d dVar;
        Bitmap bitmap = this.f51406c;
        if (bitmap != null && (dVar = this.f51407d) != null) {
            dVar.mo20086d(bitmap);
        }
    }

    /* renamed from: b */
    public final Class<NinePatchDrawable> mo10980b() {
        return NinePatchDrawable.class;
    }

    /* renamed from: e */
    public final int mo10983e() {
        Bitmap bitmap = this.f51406c;
        if (bitmap != null) {
            return C7176l.m16783c(bitmap);
        }
        NinePatchDrawable ninePatchDrawable = this.f51405b;
        return Math.max(1, ninePatchDrawable.getIntrinsicHeight() * ninePatchDrawable.getIntrinsicWidth() * 4);
    }

    public final Object get() {
        return this.f51405b;
    }
}
