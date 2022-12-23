package androidx.fragment.app;

import p067e1.C4502l;
import p229r1.C6231a;

/* renamed from: androidx.fragment.app.y */
public final /* synthetic */ class C0976y implements C6231a {

    /* renamed from: a */
    public final /* synthetic */ FragmentManager f3866a;

    public /* synthetic */ C0976y(FragmentManager fragmentManager) {
        this.f3866a = fragmentManager;
    }

    public final void accept(Object obj) {
        FragmentManager fragmentManager = this.f3866a;
        C4502l lVar = (C4502l) obj;
        if (fragmentManager.mo3932L()) {
            boolean z = lVar.f15584a;
            for (Fragment next : fragmentManager.f3624c.mo4104f()) {
                if (next != null) {
                    next.performMultiWindowModeChanged(z);
                }
            }
        }
    }
}
