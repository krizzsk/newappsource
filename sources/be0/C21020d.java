package be0;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: be0.d */
public final class C21020d implements View.OnTouchListener {

    /* renamed from: b */
    public final /* synthetic */ C21012c f52798b;

    public C21020d(C21012c cVar) {
        this.f52798b = cVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.f52798b.f52788r.onTouchEvent(motionEvent);
        return true;
    }
}
