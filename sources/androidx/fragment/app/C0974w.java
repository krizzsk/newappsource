package androidx.fragment.app;

import android.content.res.Configuration;
import p229r1.C6231a;

/* renamed from: androidx.fragment.app.w */
public final /* synthetic */ class C0974w implements C6231a {

    /* renamed from: a */
    public final /* synthetic */ FragmentManager f3864a;

    public /* synthetic */ C0974w(FragmentManager fragmentManager) {
        this.f3864a = fragmentManager;
    }

    public final void accept(Object obj) {
        FragmentManager fragmentManager = this.f3864a;
        Configuration configuration = (Configuration) obj;
        if (fragmentManager.mo3932L()) {
            for (Fragment next : fragmentManager.f3624c.mo4104f()) {
                if (next != null) {
                    next.performConfigurationChanged(configuration);
                }
            }
        }
    }
}
