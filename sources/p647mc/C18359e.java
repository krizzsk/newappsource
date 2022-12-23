package p647mc;

import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.C14026d;

/* renamed from: mc.e */
public final class C18359e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b */
    public final /* synthetic */ C14026d f46811b;

    public C18359e(C14026d dVar) {
        this.f46811b = dVar;
    }

    public final boolean onPreDraw() {
        C14026d dVar = this.f46811b;
        float rotation = dVar.f34882v.getRotation();
        if (dVar.f34875o == rotation) {
            return true;
        }
        dVar.f34875o = rotation;
        dVar.mo41748p();
        return true;
    }
}
