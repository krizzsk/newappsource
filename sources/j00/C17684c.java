package j00;

import android.view.View;
import android.view.animation.Animation;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.map.CompassView;

/* renamed from: j00.c */
public final class C17684c implements Animation.AnimationListener {

    /* renamed from: b */
    public final /* synthetic */ View f45434b;

    /* renamed from: c */
    public final /* synthetic */ int f45435c = 8;

    public C17684c(CompassView compassView) {
        this.f45434b = compassView;
    }

    public final void onAnimationEnd(Animation animation) {
        if (this.f45434b.getAlpha() == BitmapDescriptorFactory.HUE_RED) {
            this.f45434b.setVisibility(this.f45435c);
        }
        this.f45434b.setAlpha(1.0f);
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
