package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;

/* renamed from: androidx.fragment.app.j0 */
public final class C0937j0 extends Transition.EpicenterCallback {

    /* renamed from: a */
    public final /* synthetic */ Rect f3803a;

    public C0937j0(Rect rect) {
        this.f3803a = rect;
    }

    public final Rect onGetEpicenter(Transition transition) {
        return this.f3803a;
    }
}
