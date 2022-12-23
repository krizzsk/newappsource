package be0;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: be0.h */
public final class C21024h implements View.OnTouchListener {

    /* renamed from: b */
    public final /* synthetic */ C21012c f52802b;

    public C21024h(C21012c cVar) {
        this.f52802b = cVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C21032m mVar = this.f52802b.f52783m;
        if (mVar != null) {
            mVar.mo53144a(motionEvent);
        }
        return false;
    }
}
