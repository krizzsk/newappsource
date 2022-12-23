package p835uc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* renamed from: uc.a */
public final class C19878a extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f50490a;

    /* renamed from: b */
    public final /* synthetic */ BaseTransientBottomBar f50491b;

    public C19878a(BaseTransientBottomBar baseTransientBottomBar, int i) {
        this.f50491b = baseTransientBottomBar;
        this.f50490a = i;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f50491b.mo42229f(this.f50490a);
    }
}
