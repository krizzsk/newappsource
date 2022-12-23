package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p256t2.C6552c;
import p256t2.C6556e;

/* renamed from: androidx.lifecycle.i */
public final class C1013i {

    /* renamed from: androidx.lifecycle.i$a */
    public static final class C1014a implements C6552c.C6553a {
        /* renamed from: a */
        public final void mo4305a(C6556e eVar) {
            boolean z;
            if (eVar instanceof C1037q0) {
                C1034p0 viewModelStore = ((C1037q0) eVar).getViewModelStore();
                C6552c savedStateRegistry = eVar.getSavedStateRegistry();
                viewModelStore.getClass();
                Iterator it = new HashSet(viewModelStore.f3969a.keySet()).iterator();
                while (it.hasNext()) {
                    HashMap<String, C1019k0> hashMap = viewModelStore.f3969a;
                    Lifecycle lifecycle = eVar.getLifecycle();
                    SavedStateHandleController savedStateHandleController = (SavedStateHandleController) hashMap.get((String) it.next()).getTag("androidx.lifecycle.savedstate.vm.tag");
                    if (savedStateHandleController != null && !(z = savedStateHandleController.f3895c)) {
                        if (!z) {
                            savedStateHandleController.f3895c = true;
                            lifecycle.mo4224a(savedStateHandleController);
                            savedStateRegistry.mo22665c(savedStateHandleController.f3894b, savedStateHandleController.f3896d.f3928e);
                            C1013i.m2880a(lifecycle, savedStateRegistry);
                        } else {
                            throw new IllegalStateException("Already attached to lifecycleOwner");
                        }
                    }
                }
                if (!new HashSet(viewModelStore.f3969a.keySet()).isEmpty()) {
                    savedStateRegistry.mo22666d();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
        }
    }

    /* renamed from: a */
    public static void m2880a(Lifecycle lifecycle, C6552c cVar) {
        Lifecycle.State b = lifecycle.mo4225b();
        if (b == Lifecycle.State.INITIALIZED || b.isAtLeast(Lifecycle.State.STARTED)) {
            cVar.mo22666d();
        } else {
            lifecycle.mo4224a(new LegacySavedStateHandleController$1(lifecycle, cVar));
        }
    }
}
