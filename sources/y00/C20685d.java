package y00;

import android.animation.Animator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.design.view.TextAnimationView;
import j00.C17682a;

/* renamed from: y00.d */
public final class C20685d extends C17682a {

    /* renamed from: a */
    public final /* synthetic */ TextAnimationView f52257a;

    public C20685d(TextAnimationView textAnimationView) {
        this.f52257a = textAnimationView;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f52257a.setText("");
        this.f52257a.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        this.f52257a.setAlpha(1.0f);
    }
}
