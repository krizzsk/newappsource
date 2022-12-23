package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import p330z2.C7441q;

public class ChangeScroll extends Transition {

    /* renamed from: z */
    public static final String[] f4900z = {"android:changeScroll:x", "android:changeScroll:y"};

    public ChangeScroll() {
    }

    /* renamed from: J */
    public final void mo5384J(C7441q qVar) {
        qVar.f22854a.put("android:changeScroll:x", Integer.valueOf(qVar.f22855b.getScrollX()));
        qVar.f22854a.put("android:changeScroll:y", Integer.valueOf(qVar.f22855b.getScrollY()));
    }

    /* renamed from: d */
    public final void mo5356d(C7441q qVar) {
        mo5384J(qVar);
    }

    /* renamed from: g */
    public final void mo5357g(C7441q qVar) {
        mo5384J(qVar);
    }

    /* renamed from: k */
    public final Animator mo5358k(ViewGroup viewGroup, C7441q qVar, C7441q qVar2) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = null;
        if (qVar == null || qVar2 == null) {
            return null;
        }
        View view = qVar2.f22855b;
        int intValue = ((Integer) qVar.f22854a.get("android:changeScroll:x")).intValue();
        int intValue2 = ((Integer) qVar2.f22854a.get("android:changeScroll:x")).intValue();
        int intValue3 = ((Integer) qVar.f22854a.get("android:changeScroll:y")).intValue();
        int intValue4 = ((Integer) qVar2.f22854a.get("android:changeScroll:y")).intValue();
        if (intValue != intValue2) {
            view.setScrollX(intValue);
            objectAnimator = ObjectAnimator.ofInt(view, "scrollX", new int[]{intValue, intValue2});
        } else {
            objectAnimator = null;
        }
        if (intValue3 != intValue4) {
            view.setScrollY(intValue3);
            objectAnimator2 = ObjectAnimator.ofInt(view, "scrollY", new int[]{intValue3, intValue4});
        }
        boolean z = C1331h.f5016a;
        if (objectAnimator == null) {
            return objectAnimator2;
        }
        if (objectAnimator2 == null) {
            return objectAnimator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{objectAnimator, objectAnimator2});
        return animatorSet;
    }

    /* renamed from: q */
    public final String[] mo5359q() {
        return f4900z;
    }

    public ChangeScroll(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
