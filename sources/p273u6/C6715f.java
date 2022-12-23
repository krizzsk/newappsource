package p273u6;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import p285v6.C6869d;

/* renamed from: u6.f */
public abstract class C6715f<Z> extends C6721k<ImageView, Z> implements C6869d.C6870a {

    /* renamed from: f */
    public Animatable f20807f;

    public C6715f(ImageView imageView) {
        super(imageView);
    }

    /* renamed from: b */
    public final void mo22743b(Drawable drawable) {
        mo22874f((Object) null);
        this.f20807f = null;
        ((ImageView) this.f20813c).setImageDrawable(drawable);
    }

    /* renamed from: d */
    public final void mo22005d(Drawable drawable) {
        super.mo22005d(drawable);
        Animatable animatable = this.f20807f;
        if (animatable != null) {
            animatable.stop();
        }
        mo22874f((Object) null);
        this.f20807f = null;
        ((ImageView) this.f20813c).setImageDrawable(drawable);
    }

    /* renamed from: f */
    public abstract void mo22874f(Z z);

    /* renamed from: h */
    public final void mo10887h(Z z, C6869d<? super Z> dVar) {
        if (dVar == null || !dVar.mo23124a(z, this)) {
            mo22874f(z);
            if (z instanceof Animatable) {
                Animatable animatable = (Animatable) z;
                this.f20807f = animatable;
                animatable.start();
                return;
            }
            this.f20807f = null;
        } else if (z instanceof Animatable) {
            Animatable animatable2 = (Animatable) z;
            this.f20807f = animatable2;
            animatable2.start();
        } else {
            this.f20807f = null;
        }
    }

    /* renamed from: i */
    public final void mo10888i(Drawable drawable) {
        mo22874f((Object) null);
        this.f20807f = null;
        ((ImageView) this.f20813c).setImageDrawable(drawable);
    }

    public final void onStart() {
        Animatable animatable = this.f20807f;
        if (animatable != null) {
            animatable.start();
        }
    }

    public final void onStop() {
        Animatable animatable = this.f20807f;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
