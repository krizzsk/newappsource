package p541ho;

import android.app.Activity;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import bf0.C21050d;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: ho.c */
public final class C17466c {

    /* renamed from: a */
    public final WeakHashMap<Activity, C17467d> f44972a = new WeakHashMap<>();

    /* renamed from: a */
    public final void mo49923a(FragmentActivity fragmentActivity) {
        synchronized (this) {
            if (!this.f44972a.containsKey(fragmentActivity)) {
                this.f44972a.put(fragmentActivity, new C17467d(new WeakReference(fragmentActivity)));
            }
            C17467d dVar = this.f44972a.get(fragmentActivity);
            if (dVar != null) {
                dVar.mo49925a();
                C21050d dVar2 = C21050d.f52856a;
            }
        }
    }

    /* renamed from: b */
    public final void mo49924b(FragmentActivity fragmentActivity) {
        boolean z;
        Activity activity;
        Window window;
        synchronized (this) {
            C17467d dVar = this.f44972a.get(fragmentActivity);
            if (dVar != null) {
                int i = dVar.f44973a - 1;
                dVar.f44973a = i;
                if (i == 0 && !dVar.f44974b && (activity = dVar.f44975c.get()) != null && (window = activity.getWindow()) != null) {
                    window.clearFlags(8192);
                }
                if (dVar.f44973a == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.f44972a.remove(fragmentActivity);
                }
            }
        }
    }
}
