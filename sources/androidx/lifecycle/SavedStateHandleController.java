package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

final class SavedStateHandleController implements C1025n {

    /* renamed from: b */
    public final String f3894b;

    /* renamed from: c */
    public boolean f3895c = false;

    /* renamed from: d */
    public final C1001d0 f3896d;

    public SavedStateHandleController(C1001d0 d0Var, String str) {
        this.f3894b = str;
        this.f3896d = d0Var;
    }

    /* renamed from: f */
    public final void mo740f(C1033p pVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.f3895c = false;
            pVar.getLifecycle().mo4226c(this);
        }
    }
}
