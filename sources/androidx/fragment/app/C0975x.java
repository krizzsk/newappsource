package androidx.fragment.app;

import p229r1.C6231a;

/* renamed from: androidx.fragment.app.x */
public final /* synthetic */ class C0975x implements C6231a {

    /* renamed from: a */
    public final /* synthetic */ FragmentManager f3865a;

    public /* synthetic */ C0975x(FragmentManager fragmentManager) {
        this.f3865a = fragmentManager;
    }

    public final void accept(Object obj) {
        FragmentManager fragmentManager = this.f3865a;
        Integer num = (Integer) obj;
        if (fragmentManager.mo3932L() && num.intValue() == 80) {
            for (Fragment next : fragmentManager.f3624c.mo4104f()) {
                if (next != null) {
                    next.performLowMemory();
                }
            }
        }
    }
}
