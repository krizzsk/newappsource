package com.google.android.gms.internal.p984authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.api.phone.SmsRetrieverClient;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzab */
public final class zzab extends SmsRetrieverClient {
    public zzab(Activity activity) {
        super(activity);
    }

    public final Task<Void> startSmsRetriever() {
        return doWrite(TaskApiCall.builder().run(new zzx(this)).setFeatures(zzac.zzc).setMethodKey(1567).build());
    }

    public final Task<Void> startSmsUserConsent(String str) {
        return doWrite(TaskApiCall.builder().run(new zzy(this, str)).setFeatures(zzac.zzd).setMethodKey(1568).build());
    }

    public zzab(Context context) {
        super(context);
    }
}
