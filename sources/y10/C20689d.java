package y10;

import android.graphics.drawable.Drawable;
import ce0.C21100e;
import com.google.android.material.textfield.TextInputLayout;
import com.moovit.commons.utils.UiUtils;
import p285v6.C6869d;

/* renamed from: y10.d */
public final class C20689d extends C20688c<TextInputLayout, Drawable> {

    /* renamed from: d */
    public final UiUtils.Edge f52261d;

    public C20689d(TextInputLayout textInputLayout, UiUtils.Edge edge) {
        super(textInputLayout);
        C21100e.m49373x(edge, "edge");
        this.f52261d = edge;
    }

    /* renamed from: f */
    public final void mo52839f(Drawable drawable) {
        mo52842k(drawable);
    }

    /* renamed from: g */
    public final void mo52840g(Drawable drawable) {
        mo52842k(drawable);
    }

    /* renamed from: h */
    public final void mo10887h(Object obj, C6869d dVar) {
        mo52842k((Drawable) obj);
    }

    /* renamed from: i */
    public final void mo10888i(Drawable drawable) {
        mo52842k(drawable);
    }

    /* renamed from: k */
    public final void mo52842k(Drawable drawable) {
        UiUtils.Edge edge = this.f52261d;
        if (edge == UiUtils.Edge.LEFT) {
            ((TextInputLayout) this.f52260b).setStartIconDrawable(drawable);
        } else if (edge == UiUtils.Edge.RIGHT) {
            ((TextInputLayout) this.f52260b).setEndIconDrawable(drawable);
        }
    }
}
