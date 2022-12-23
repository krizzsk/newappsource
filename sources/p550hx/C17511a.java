package p550hx;

import android.animation.Animator;
import com.moovit.app.tod.order.TodOrderActivity;
import j00.C17682a;

/* renamed from: hx.a */
public final class C17511a extends C17682a {

    /* renamed from: a */
    public final /* synthetic */ TodOrderActivity f45079a;

    public C17511a(TodOrderActivity todOrderActivity) {
        this.f45079a = todOrderActivity;
    }

    public final void onAnimationCancel(Animator animator) {
        animator.removeListener(this);
    }

    public final void onAnimationEnd(Animator animator) {
        TodOrderActivity todOrderActivity = this.f45079a;
        int i = TodOrderActivity.f40331D0;
        todOrderActivity.mo46399I2();
        TodOrderActivity todOrderActivity2 = this.f45079a;
        todOrderActivity2.mo46399I2();
        todOrderActivity2.mo46397G2();
    }
}
