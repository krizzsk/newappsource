package y10;

import android.graphics.drawable.Drawable;
import android.view.View;
import ce0.C21100e;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.moovit.image.C16062n;
import p260t6.C6598d;
import p273u6.C6719i;
import p273u6.C6720j;

/* renamed from: y10.c */
public abstract class C20688c<T extends View, Z> implements C6720j<Z> {

    /* renamed from: c */
    public static final int f52259c = C16062n.glide_custom_view_target_tag;

    /* renamed from: b */
    public final T f52260b;

    public C20688c(T t) {
        C21100e.m49373x(t, Promotion.ACTION_VIEW);
        this.f52260b = t;
    }

    /* renamed from: a */
    public final void mo22742a(C6719i iVar) {
        iVar.mo11025b(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* renamed from: b */
    public final void mo22743b(Drawable drawable) {
        mo52840g(drawable);
    }

    /* renamed from: c */
    public final C6598d mo22744c() {
        Object tag = this.f52260b.getTag(f52259c);
        if (tag == null) {
            return null;
        }
        if (tag instanceof C6598d) {
            return (C6598d) tag;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    /* renamed from: d */
    public final void mo22005d(Drawable drawable) {
        mo52839f(drawable);
    }

    /* renamed from: e */
    public final void mo22746e(C6598d dVar) {
        this.f52260b.setTag(f52259c, dVar);
    }

    /* renamed from: f */
    public abstract void mo52839f(Drawable drawable);

    /* renamed from: g */
    public abstract void mo52840g(Drawable drawable);

    /* renamed from: j */
    public final void mo22753j(C6719i iVar) {
    }

    public final void onDestroy() {
    }

    public final void onStart() {
    }

    public final void onStop() {
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Target for: ");
        k.append(this.f52260b);
        return k.toString();
    }
}
