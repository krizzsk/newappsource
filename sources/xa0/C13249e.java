package xa0;

import android.view.MotionEvent;

/* renamed from: xa0.e */
public final class C13249e implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ MotionEvent f32875b;

    /* renamed from: c */
    public final /* synthetic */ C13250f f32876c;

    public C13249e(C13250f fVar, MotionEvent motionEvent) {
        this.f32876c = fVar;
        this.f32875b = motionEvent;
    }

    public final void run() {
        this.f32876c.f32878b.dispatchTouchEvent(this.f32875b);
        this.f32875b.recycle();
    }
}
