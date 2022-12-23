package p395bs;

import android.animation.Animator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.app.editing.entity.AbstractEditEntityActivity;
import j00.C17682a;

/* renamed from: bs.d */
public final class C13678d extends C17682a {

    /* renamed from: a */
    public final /* synthetic */ AbstractEditEntityActivity f33711a;

    public C13678d(AbstractEditEntityActivity abstractEditEntityActivity) {
        this.f33711a = abstractEditEntityActivity;
    }

    public final void onAnimationStart(Animator animator) {
        this.f33711a.f37961m0.setVisibility(0);
        this.f33711a.f37961m0.setAlpha(BitmapDescriptorFactory.HUE_RED);
        this.f33711a.f37960l0.smoothScrollTo(0, 0);
    }
}
