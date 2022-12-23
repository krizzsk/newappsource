package androidx.lifecycle;

import android.os.Bundle;
import bf0.C21049c;
import java.util.Map;
import kotlin.C23812a;
import mf0.C24362h;
import p256t2.C6552c;

public final class SavedStateHandlesProvider implements C6552c.C6554b {

    /* renamed from: a */
    public final C6552c f3901a;

    /* renamed from: b */
    public boolean f3902b;

    /* renamed from: c */
    public Bundle f3903c;

    /* renamed from: d */
    public final C21049c f3904d;

    public SavedStateHandlesProvider(C6552c cVar, C1037q0 q0Var) {
        C24362h.m61211f(cVar, "savedStateRegistry");
        C24362h.m61211f(q0Var, "viewModelStoreOwner");
        this.f3901a = cVar;
        this.f3904d = C23812a.m58432b(new SavedStateHandlesProvider$viewModel$2(q0Var));
    }

    /* renamed from: a */
    public final Bundle mo747a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f3903c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((C1005e0) this.f3904d.getValue()).f3931b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a = ((C1001d0) entry.getValue()).f3928e.mo747a();
            if (!C24362h.m61206a(a, Bundle.EMPTY)) {
                bundle.putBundle(str, a);
            }
        }
        this.f3902b = false;
        return bundle;
    }
}
