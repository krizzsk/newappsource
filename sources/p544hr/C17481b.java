package p544hr;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.transition.Transition;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.app.carpool.driver.CarpoolDriverProfileActivity;
import j00.C17683b;
import java.util.HashSet;

/* renamed from: hr.b */
public final class C17481b extends C17683b {

    /* renamed from: a */
    public final /* synthetic */ CarpoolDriverProfileActivity f45018a;

    public C17481b(CarpoolDriverProfileActivity carpoolDriverProfileActivity) {
        this.f45018a = carpoolDriverProfileActivity;
    }

    @SuppressLint({"NewApi"})
    public final void onTransitionEnd(Transition transition) {
        this.f45018a.getWindow().getSharedElementEnterTransition().removeListener(this.f45018a.f37712m0);
        CarpoolDriverProfileActivity carpoolDriverProfileActivity = this.f45018a;
        carpoolDriverProfileActivity.getClass();
        HashSet hashSet = new HashSet();
        hashSet.add(ObjectAnimator.ofFloat(carpoolDriverProfileActivity.f37708X, View.ALPHA, new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f}));
        hashSet.add(ObjectAnimator.ofFloat(carpoolDriverProfileActivity.f37707U, View.ALPHA, new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f}));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(hashSet);
        animatorSet.setDuration(300);
        animatorSet.setupEndValues();
        animatorSet.addListener(new C17482c(carpoolDriverProfileActivity));
        carpoolDriverProfileActivity.f37707U.setVisibility(0);
        carpoolDriverProfileActivity.f37708X.setVisibility(0);
        animatorSet.start();
    }
}
