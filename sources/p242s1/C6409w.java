package p242s1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* renamed from: s1.w */
public final class C6409w implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b */
    public final View f20073b;

    /* renamed from: c */
    public ViewTreeObserver f20074c;

    /* renamed from: d */
    public final Runnable f20075d;

    public C6409w(ViewGroup viewGroup, Runnable runnable) {
        this.f20073b = viewGroup;
        this.f20074c = viewGroup.getViewTreeObserver();
        this.f20075d = runnable;
    }

    /* renamed from: a */
    public static void m15313a(ViewGroup viewGroup, Runnable runnable) {
        if (viewGroup == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            C6409w wVar = new C6409w(viewGroup, runnable);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(wVar);
            viewGroup.addOnAttachStateChangeListener(wVar);
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    /* renamed from: b */
    public final void mo22536b() {
        if (this.f20074c.isAlive()) {
            this.f20074c.removeOnPreDrawListener(this);
        } else {
            this.f20073b.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f20073b.removeOnAttachStateChangeListener(this);
    }

    public final boolean onPreDraw() {
        mo22536b();
        this.f20075d.run();
        return true;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f20074c = view.getViewTreeObserver();
    }

    public final void onViewDetachedFromWindow(View view) {
        mo22536b();
    }
}
