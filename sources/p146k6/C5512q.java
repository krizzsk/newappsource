package p146k6;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import p060d6.C4393i;
import p060d6.C4397l;
import p584jl.C17885a;

/* renamed from: k6.q */
public final class C5512q implements C4397l<BitmapDrawable>, C4393i {

    /* renamed from: b */
    public final Resources f18065b;

    /* renamed from: c */
    public final C4397l<Bitmap> f18066c;

    public C5512q(Resources resources, C4397l<Bitmap> lVar) {
        C17885a.m44458r(resources);
        this.f18065b = resources;
        C17885a.m44458r(lVar);
        this.f18066c = lVar;
    }

    /* renamed from: a */
    public final void mo10979a() {
        this.f18066c.mo10979a();
    }

    /* renamed from: b */
    public final Class<BitmapDrawable> mo10980b() {
        return BitmapDrawable.class;
    }

    /* renamed from: e */
    public final int mo10983e() {
        return this.f18066c.mo10983e();
    }

    public final Object get() {
        return new BitmapDrawable(this.f18065b, this.f18066c.get());
    }

    public final void initialize() {
        C4397l<Bitmap> lVar = this.f18066c;
        if (lVar instanceof C4393i) {
            ((C4393i) lVar).initialize();
        }
    }
}
