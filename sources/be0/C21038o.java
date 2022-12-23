package be0;

import android.view.MotionEvent;
import android.view.View;
import be0.C21033n;

/* renamed from: be0.o */
public final class C21038o implements View.OnTouchListener {

    /* renamed from: b */
    public final /* synthetic */ C21033n f52828b;

    public C21038o(C21033n nVar) {
        this.f52828b = nVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C21033n nVar = this.f52828b;
        C21033n.C21034a aVar = nVar.f52823j;
        if (aVar == null) {
            return nVar.onTouchEvent(motionEvent);
        }
        aVar.mo53144a(motionEvent);
        return false;
    }
}
