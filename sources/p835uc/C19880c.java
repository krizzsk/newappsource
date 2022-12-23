package p835uc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* renamed from: uc.c */
public final class C19880c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f50493a;

    /* renamed from: b */
    public final /* synthetic */ BaseTransientBottomBar f50494b;

    public C19880c(BaseTransientBottomBar baseTransientBottomBar, int i) {
        this.f50494b = baseTransientBottomBar;
        this.f50493a = i;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f50494b.mo42229f(this.f50493a);
    }

    public final void onAnimationStart(Animator animator) {
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) this.f50494b.f35311d;
        snackbarContentLayout.f35341b.setAlpha(1.0f);
        long j = (long) 180;
        long j2 = (long) 0;
        snackbarContentLayout.f35341b.animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(j).setStartDelay(j2).start();
        if (snackbarContentLayout.f35342c.getVisibility() == 0) {
            snackbarContentLayout.f35342c.setAlpha(1.0f);
            snackbarContentLayout.f35342c.animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(j).setStartDelay(j2).start();
        }
    }
}
