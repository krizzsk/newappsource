package p484ff;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.camera.camera2.internal.C0509c;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: ff.l */
public final class C16983l implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b */
    public final Set<Intent> f44087b = Collections.newSetFromMap(new WeakHashMap());

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0020 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0012  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0014  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m42822a(android.content.Intent r5) {
        /*
            android.os.Bundle r5 = r5.getExtras()     // Catch:{ RuntimeException -> 0x000d }
            if (r5 == 0) goto L_0x000d
            java.lang.String r0 = "gcm.n.analytics_data"
            android.os.Bundle r5 = r5.getBundle(r0)     // Catch:{ RuntimeException -> 0x000d }
            goto L_0x000e
        L_0x000d:
            r5 = 0
        L_0x000e:
            java.lang.String r0 = "1"
            if (r5 != 0) goto L_0x0014
            r1 = 0
            goto L_0x001e
        L_0x0014:
            java.lang.String r1 = "google.c.a.e"
            java.lang.String r1 = r5.getString(r1)
            boolean r1 = r0.equals(r1)
        L_0x001e:
            if (r1 == 0) goto L_0x006a
            if (r5 != 0) goto L_0x0023
            goto L_0x0065
        L_0x0023:
            java.lang.String r1 = "google.c.a.tc"
            java.lang.String r1 = r5.getString(r1)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0065
            qd.d r0 = p743qd.C19107d.m46265d()
            java.lang.Class<ud.a> r1 = p836ud.C19885a.class
            java.lang.Object r0 = r0.mo51536b(r1)
            ud.a r0 = (p836ud.C19885a) r0
            if (r0 == 0) goto L_0x0065
            java.lang.String r1 = "google.c.a.c_id"
            java.lang.String r1 = r5.getString(r1)
            r0.mo52172g(r1)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "source"
            java.lang.String r4 = "Firebase"
            r2.putString(r3, r4)
            java.lang.String r3 = "medium"
            java.lang.String r4 = "notification"
            r2.putString(r3, r4)
            java.lang.String r3 = "campaign"
            r2.putString(r3, r1)
            java.lang.String r1 = "fcm"
            java.lang.String r3 = "_cmp"
            r0.mo52166a(r1, r3, r2)
        L_0x0065:
            java.lang.String r0 = "_no"
            p484ff.C16989r.m42829b(r5, r0)
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p484ff.C16983l.m42822a(android.content.Intent):void");
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intent intent = activity.getIntent();
        if (intent != null && this.f44087b.add(intent)) {
            if (Build.VERSION.SDK_INT <= 25) {
                new Handler(Looper.getMainLooper()).post(new C0509c(10, this, intent));
            } else {
                m42822a(intent);
            }
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.f44087b.remove(activity.getIntent());
        }
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
