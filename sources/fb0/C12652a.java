package fb0;

import android.animation.Animator;
import android.animation.ValueAnimator;
import cb0.C7583b;

/* renamed from: fb0.a */
public abstract class C12652a<T extends Animator> {

    /* renamed from: a */
    public long f31270a = 350;

    /* renamed from: b */
    public C7583b.C7584a f31271b;

    /* renamed from: c */
    public T f31272c;

    public C12652a(C7583b.C7584a aVar) {
        this.f31271b = aVar;
        this.f31272c = mo24976a();
    }

    /* renamed from: a */
    public abstract T mo24976a();

    /* renamed from: b */
    public final void mo39432b(long j) {
        this.f31270a = j;
        T t = this.f31272c;
        if (t instanceof ValueAnimator) {
            t.setDuration(j);
        }
    }

    /* renamed from: c */
    public final void mo39433c() {
        T t = this.f31272c;
        if (t != null && !t.isRunning()) {
            this.f31272c.start();
        }
    }
}
