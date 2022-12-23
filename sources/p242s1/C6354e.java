package p242s1;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: s1.e */
public final class C6354e {

    /* renamed from: a */
    public final C6355a f20010a;

    /* renamed from: s1.e$a */
    public static class C6355a {

        /* renamed from: a */
        public final GestureDetector f20011a;

        public C6355a(Context context, GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
            this.f20011a = new GestureDetector(context, simpleOnGestureListener, (Handler) null);
        }
    }

    public C6354e(Context context, GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
        this.f20010a = new C6355a(context, simpleOnGestureListener);
    }

    /* renamed from: a */
    public final boolean mo22474a(MotionEvent motionEvent) {
        return this.f20010a.f20011a.onTouchEvent(motionEvent);
    }
}
