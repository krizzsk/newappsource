package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import androidx.swiperefreshlayout.widget.C1278d;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: androidx.swiperefreshlayout.widget.c */
public final class C1277c implements Animator.AnimatorListener {

    /* renamed from: a */
    public final /* synthetic */ C1278d.C1279a f4828a;

    /* renamed from: b */
    public final /* synthetic */ C1278d f4829b;

    public C1277c(C1278d dVar, C1278d.C1279a aVar) {
        this.f4829b = dVar;
        this.f4828a = aVar;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
        this.f4829b.mo5338a(1.0f, this.f4828a, true);
        C1278d.C1279a aVar = this.f4828a;
        aVar.f4849k = aVar.f4843e;
        aVar.f4850l = aVar.f4844f;
        aVar.f4851m = aVar.f4845g;
        aVar.mo5349a((aVar.f4848j + 1) % aVar.f4847i.length);
        C1278d dVar = this.f4829b;
        if (dVar.f4838g) {
            dVar.f4838g = false;
            animator.cancel();
            animator.setDuration(1332);
            animator.start();
            C1278d.C1279a aVar2 = this.f4828a;
            if (aVar2.f4852n) {
                aVar2.f4852n = false;
                return;
            }
            return;
        }
        dVar.f4837f += 1.0f;
    }

    public final void onAnimationStart(Animator animator) {
        this.f4829b.f4837f = BitmapDescriptorFactory.HUE_RED;
    }
}
