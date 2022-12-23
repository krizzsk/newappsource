package p718pc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import p004a3.C0050b;

/* renamed from: pc.i */
public final class C18902i extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C18904k f48113a;

    public C18902i(C18904k kVar) {
        this.f48113a = kVar;
    }

    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        C18904k kVar = this.f48113a;
        ArrayList arrayList = kVar.f48121g;
        if (arrayList != null && !kVar.f48122h) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C0050b) it.next()).getClass();
            }
        }
    }
}
