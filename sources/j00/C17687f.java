package j00;

import android.animation.Animator;
import android.graphics.drawable.Drawable;
import android.view.View;
import p977zz.C20943i;

/* renamed from: j00.f */
public final class C17687f extends C17682a {

    /* renamed from: a */
    public final /* synthetic */ View f45440a;

    /* renamed from: b */
    public final /* synthetic */ Drawable f45441b;

    public C17687f(View view, Drawable drawable) {
        this.f45440a = view;
        this.f45441b = drawable;
    }

    public final void onAnimationEnd(Animator animator) {
        C20943i.m49053f(this.f45440a, this.f45441b);
    }
}
