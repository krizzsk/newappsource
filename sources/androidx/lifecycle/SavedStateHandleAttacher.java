package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Landroidx/lifecycle/SavedStateHandleAttacher;", "Landroidx/lifecycle/n;", "lifecycle-viewmodel-savedstate_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class SavedStateHandleAttacher implements C1025n {

    /* renamed from: b */
    public final SavedStateHandlesProvider f3893b;

    public SavedStateHandleAttacher(SavedStateHandlesProvider savedStateHandlesProvider) {
        this.f3893b = savedStateHandlesProvider;
    }

    /* renamed from: f */
    public final void mo740f(C1033p pVar, Lifecycle.Event event) {
        boolean z;
        if (event == Lifecycle.Event.ON_CREATE) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            pVar.getLifecycle().mo4226c(this);
            SavedStateHandlesProvider savedStateHandlesProvider = this.f3893b;
            if (!savedStateHandlesProvider.f3902b) {
                savedStateHandlesProvider.f3903c = savedStateHandlesProvider.f3901a.mo22663a("androidx.lifecycle.internal.SavedStateHandlesProvider");
                savedStateHandlesProvider.f3902b = true;
                C1005e0 e0Var = (C1005e0) savedStateHandlesProvider.f3904d.getValue();
                return;
            }
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
    }
}
