package p141k1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: k1.g */
public final class C5459g extends Drawable.ConstantState {

    /* renamed from: a */
    public int f17977a;

    /* renamed from: b */
    public Drawable.ConstantState f17978b;

    /* renamed from: c */
    public ColorStateList f17979c = null;

    /* renamed from: d */
    public PorterDuff.Mode f17980d = C5457e.f17969h;

    public C5459g(C5459g gVar) {
        if (gVar != null) {
            this.f17977a = gVar.f17977a;
            this.f17978b = gVar.f17978b;
            this.f17979c = gVar.f17979c;
            this.f17980d = gVar.f17980d;
        }
    }

    public final int getChangingConfigurations() {
        int i;
        int i2 = this.f17977a;
        Drawable.ConstantState constantState = this.f17978b;
        if (constantState != null) {
            i = constantState.getChangingConfigurations();
        } else {
            i = 0;
        }
        return i2 | i;
    }

    public final Drawable newDrawable() {
        return new C5458f(this, (Resources) null);
    }

    public final Drawable newDrawable(Resources resources) {
        return new C5458f(this, resources);
    }
}
