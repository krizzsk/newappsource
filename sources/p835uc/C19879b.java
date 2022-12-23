package p835uc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* renamed from: uc.b */
public final class C19879b extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f50492a;

    public C19879b(BaseTransientBottomBar baseTransientBottomBar) {
        this.f50492a = baseTransientBottomBar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f50492a.mo42230g();
    }

    public final void onAnimationStart(Animator animator) {
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) this.f50492a.f35311d;
        snackbarContentLayout.f35341b.setAlpha(BitmapDescriptorFactory.HUE_RED);
        long j = (long) 180;
        long j2 = (long) 70;
        snackbarContentLayout.f35341b.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        if (snackbarContentLayout.f35342c.getVisibility() == 0) {
            snackbarContentLayout.f35342c.setAlpha(BitmapDescriptorFactory.HUE_RED);
            snackbarContentLayout.f35342c.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        }
    }
}
