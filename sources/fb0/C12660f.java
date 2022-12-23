package fb0;

import android.animation.ValueAnimator;
import cb0.C7583b;
import com.p341rd.C7981a;
import eb0.C12628e;

/* renamed from: fb0.f */
public final class C12660f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C12661g f31285a;

    public C12660f(C12661g gVar) {
        this.f31285a = gVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C12661g gVar = this.f31285a;
        gVar.getClass();
        int intValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE")).intValue();
        C12628e eVar = gVar.f31286d;
        eVar.f31222a = intValue;
        C7583b.C7584a aVar = gVar.f31271b;
        if (aVar != null) {
            ((C7981a) aVar).mo24975b(eVar);
        }
    }
}
