package p169m6;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import p060d6.C4393i;
import p060d6.C4397l;
import p195o6.C5998c;
import p584jl.C17885a;

/* renamed from: m6.c */
public abstract class C5709c<T extends Drawable> implements C4397l<T>, C4393i {

    /* renamed from: b */
    public final T f18515b;

    public C5709c(T t) {
        C17885a.m44458r(t);
        this.f18515b = t;
    }

    public final Object get() {
        Drawable.ConstantState constantState = this.f18515b.getConstantState();
        if (constantState == null) {
            return this.f18515b;
        }
        return constantState.newDrawable();
    }

    public void initialize() {
        T t = this.f18515b;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof C5998c) {
            ((C5998c) t).f19162b.f19172a.f19185l.prepareToDraw();
        }
    }
}
