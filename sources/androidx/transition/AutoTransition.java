package androidx.transition;

import android.content.Context;
import android.util.AttributeSet;

public class AutoTransition extends TransitionSet {
    public AutoTransition() {
        mo5354N();
    }

    /* renamed from: N */
    public final void mo5354N() {
        mo5436M(1);
        mo5433J(new Fade(2));
        mo5433J(new ChangeBounds());
        mo5433J(new Fade(1));
    }

    public AutoTransition(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo5354N();
    }
}
