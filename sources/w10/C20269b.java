package w10;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import p060d6.C4397l;

/* renamed from: w10.b */
public final class C20269b implements C4397l<C20268a> {

    /* renamed from: b */
    public final C20268a f51399b;

    public C20269b(C20268a aVar) {
        this.f51399b = aVar;
    }

    /* renamed from: a */
    public final void mo10979a() {
    }

    /* renamed from: b */
    public final Class<C20268a> mo10980b() {
        return C20268a.class;
    }

    /* renamed from: e */
    public final int mo10983e() {
        int i;
        Drawable drawable = (Drawable) this.f51399b.f51397b;
        int max = Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
        if (((PointF) this.f51399b.f51398c) != null) {
            i = 8;
        } else {
            i = 0;
        }
        return max + i;
    }

    public final Object get() {
        Drawable.ConstantState constantState = ((Drawable) this.f51399b.f51397b).getConstantState();
        if (constantState != null) {
            return new C20268a(constantState.newDrawable(), (PointF) this.f51399b.f51398c);
        }
        return this.f51399b;
    }
}
