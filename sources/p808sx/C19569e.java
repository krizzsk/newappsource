package p808sx;

import android.animation.Animator;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.app.tripplanner.C15578a;
import j00.C17682a;
import java.util.Arrays;

/* renamed from: sx.e */
public final class C19569e extends C17682a {

    /* renamed from: a */
    public final /* synthetic */ C15578a f49744a;

    public C19569e(C15578a aVar) {
        this.f49744a = aVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f49744a.f40522n.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        this.f49744a.f40523o.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        C15578a aVar = this.f49744a;
        for (View clickable : Arrays.asList(new View[]{aVar.f40524p, aVar.f40525q, aVar.f40527s})) {
            clickable.setClickable(true);
        }
        this.f49744a.mo46530A2();
        this.f49744a.mo46539z2();
        this.f49744a.mo46535v2();
    }
}
