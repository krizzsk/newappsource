package p718pc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import p004a3.C0050b;

/* renamed from: pc.j */
public final class C18903j extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C18904k f48114a;

    public C18903j(C18904k kVar) {
        this.f48114a = kVar;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        C18903j.super.setVisible(false, false);
        C18904k kVar = this.f48114a;
        ArrayList arrayList = kVar.f48121g;
        if (arrayList != null && !kVar.f48122h) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C0050b) it.next()).mo26a();
            }
        }
    }
}
