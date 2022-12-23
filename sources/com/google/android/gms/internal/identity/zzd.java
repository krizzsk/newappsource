package com.google.android.gms.internal.identity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;

public final class zzd extends zzf {
    private final int zza;
    /* access modifiers changed from: private */
    public Activity zzb;

    public zzd(int i, Activity activity) {
        this.zza = i;
        this.zzb = activity;
    }

    public final void zzc(int i, Bundle bundle) {
        PendingIntent pendingIntent;
        PendingIntent createPendingResult;
        if (i == 1) {
            Intent intent = new Intent();
            intent.putExtras(bundle);
            Activity activity = this.zzb;
            if (activity != null && (createPendingResult = activity.createPendingResult(this.zza, intent, 1073741824)) != null) {
                try {
                    createPendingResult.send(1);
                } catch (PendingIntent.CanceledException unused) {
                }
            }
        } else {
            if (bundle != null) {
                pendingIntent = (PendingIntent) bundle.getParcelable("com.google.android.gms.identity.intents.EXTRA_PENDING_INTENT");
            } else {
                pendingIntent = null;
            }
            ConnectionResult connectionResult = new ConnectionResult(i, pendingIntent);
            if (connectionResult.hasResolution()) {
                try {
                    connectionResult.startResolutionForResult((Activity) Preconditions.checkNotNull(this.zzb), this.zza);
                } catch (IntentSender.SendIntentException unused2) {
                }
            } else {
                try {
                    PendingIntent createPendingResult2 = ((Activity) Preconditions.checkNotNull(this.zzb)).createPendingResult(this.zza, new Intent(), 1073741824);
                    if (createPendingResult2 != null) {
                        createPendingResult2.send(1);
                    }
                } catch (PendingIntent.CanceledException unused3) {
                }
            }
        }
    }
}
