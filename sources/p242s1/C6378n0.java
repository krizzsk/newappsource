package p242s1;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.appcompat.app.C0274w;

/* renamed from: s1.n0 */
public final /* synthetic */ class C6378n0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C6388r0 f20031a;

    /* renamed from: b */
    public final /* synthetic */ View f20032b;

    public /* synthetic */ C6378n0(C0274w.C0277c cVar, View view) {
        this.f20031a = cVar;
        this.f20032b = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((View) C0274w.this.f799d.getParent()).invalidate();
    }
}
