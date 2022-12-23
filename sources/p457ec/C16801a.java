package p457ec;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p811tc.C19648g;

/* renamed from: ec.a */
public final class C16801a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ BottomSheetBehavior f43754a;

    public C16801a(BottomSheetBehavior bottomSheetBehavior) {
        this.f43754a = bottomSheetBehavior;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C19648g gVar = this.f43754a.f34384h;
        if (gVar != null) {
            gVar.mo52006o(floatValue);
        }
    }
}
