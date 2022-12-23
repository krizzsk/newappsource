package com.google.android.gms.internal.p986firebaseauthapi;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwu */
final class zzwu extends LifecycleCallback {
    private final List zza;

    private zzwu(LifecycleFragment lifecycleFragment, List list) {
        super(lifecycleFragment);
        this.mLifecycleFragment.addCallback("PhoneAuthActivityStopCallback", this);
        this.zza = list;
    }

    public static void zza(Activity activity, List list) {
        LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
        if (((zzwu) fragment.getCallbackOrNull("PhoneAuthActivityStopCallback", zzwu.class)) == null) {
            new zzwu(fragment, list);
        }
    }

    public final void onStop() {
        synchronized (this.zza) {
            this.zza.clear();
        }
    }
}
