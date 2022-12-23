package p835uc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* renamed from: uc.f */
public final class C19883f extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f50497a;

    public C19883f(BaseTransientBottomBar baseTransientBottomBar) {
        this.f50497a = baseTransientBottomBar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f50497a.mo42230g();
    }
}
