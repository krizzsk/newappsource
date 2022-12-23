package fb0;

import android.animation.ValueAnimator;
import cb0.C7583b;
import com.p341rd.C7981a;
import eb0.C12629f;

/* renamed from: fb0.h */
public final class C12662h implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C12663i f31289a;

    public C12662h(C12663i iVar) {
        this.f31289a = iVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C12663i iVar = this.f31289a;
        iVar.getClass();
        int intValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE")).intValue();
        int intValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE_REVERSE")).intValue();
        C12629f fVar = iVar.f31292f;
        fVar.f31223a = intValue;
        fVar.f31224b = intValue2;
        C7583b.C7584a aVar = iVar.f31271b;
        if (aVar != null) {
            ((C7981a) aVar).mo24975b(fVar);
        }
    }
}
