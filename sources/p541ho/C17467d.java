package p541ho;

import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* renamed from: ho.d */
public final class C17467d {

    /* renamed from: a */
    public int f44973a;

    /* renamed from: b */
    public boolean f44974b;

    /* renamed from: c */
    public final WeakReference<Activity> f44975c;

    public C17467d(WeakReference<Activity> weakReference) {
        this.f44975c = weakReference;
    }

    /* renamed from: a */
    public final void mo49925a() {
        Window window;
        Integer num;
        boolean z;
        Window window2;
        WindowManager.LayoutParams attributes;
        if (this.f44973a == 0) {
            Activity activity = this.f44975c.get();
            if (activity == null || (window2 = activity.getWindow()) == null || (attributes = window2.getAttributes()) == null) {
                num = null;
            } else {
                num = Integer.valueOf(attributes.flags);
            }
            if (num == null || (num.intValue() & 8192) != 8192) {
                z = false;
            } else {
                z = true;
            }
            this.f44974b = z;
        }
        this.f44973a++;
        Activity activity2 = this.f44975c.get();
        if (activity2 != null && (window = activity2.getWindow()) != null) {
            window.setFlags(8192, 8192);
        }
    }
}
