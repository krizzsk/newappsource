package p528gz;

import android.app.Activity;
import com.appboy.AppboyLifecycleCallbackListener;
import com.appboy.p044ui.inappmessage.AppboyInAppMessageManager;
import com.moovit.MoovitActivity;
import java.util.HashSet;
import java.util.Set;

/* renamed from: gz.c */
public final class C17268c extends AppboyLifecycleCallbackListener {

    /* renamed from: b */
    public final HashSet f44635b = new HashSet();

    public C17268c() {
        super(true, false, (Set<Class<?>>) null, (Set<Class<?>>) null);
    }

    public final void onActivityPaused(Activity activity) {
        boolean z;
        super.onActivityPaused(activity);
        if (!(activity instanceof MoovitActivity) || this.f44635b.contains(activity.getClass())) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            AppboyInAppMessageManager.getInstance().unregisterInAppMessageManager(activity);
        }
    }

    public final void onActivityResumed(Activity activity) {
        boolean z;
        super.onActivityResumed(activity);
        if (!(activity instanceof MoovitActivity) || this.f44635b.contains(activity.getClass())) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            AppboyInAppMessageManager.getInstance().registerInAppMessageManager(activity);
        }
    }
}
