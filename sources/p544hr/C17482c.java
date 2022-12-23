package p544hr;

import android.animation.Animator;
import android.view.ViewAnimationUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.app.carpool.driver.CarpoolDriverProfileActivity;
import j00.C17682a;

/* renamed from: hr.c */
public final class C17482c extends C17682a {

    /* renamed from: a */
    public final /* synthetic */ CarpoolDriverProfileActivity f45019a;

    public C17482c(CarpoolDriverProfileActivity carpoolDriverProfileActivity) {
        this.f45019a = carpoolDriverProfileActivity;
    }

    public final void onAnimationEnd(Animator animator) {
        CarpoolDriverProfileActivity carpoolDriverProfileActivity = this.f45019a;
        int width = carpoolDriverProfileActivity.f37709Y.getWidth() / 2;
        int height = carpoolDriverProfileActivity.f37709Y.getHeight() / 2;
        float hypot = (float) Math.hypot((double) width, (double) height);
        if (carpoolDriverProfileActivity.f37709Y.isAttachedToWindow()) {
            ViewAnimationUtils.createCircularReveal(carpoolDriverProfileActivity.f37709Y, width, height, BitmapDescriptorFactory.HUE_RED, hypot).start();
        }
        carpoolDriverProfileActivity.f37709Y.setVisibility(0);
    }
}
