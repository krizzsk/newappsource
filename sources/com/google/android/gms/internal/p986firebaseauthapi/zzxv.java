package com.google.android.gms.internal.p986firebaseauthapi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxv */
final class zzxv extends BroadcastReceiver {
    public final /* synthetic */ zzxx zza;
    private final String zzb;

    public zzxv(zzxx zzxx, String str) {
        this.zza = zzxx;
        this.zzb = str;
    }

    public final void onReceive(Context context, Intent intent) {
        if (SmsRetriever.SMS_RETRIEVED_ACTION.equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            if (((Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS")).getStatusCode() == 0) {
                String str = (String) extras.get(SmsRetriever.EXTRA_SMS_MESSAGE);
                zzxw zzxw = (zzxw) this.zza.zzd.get(this.zzb);
                if (zzxw == null) {
                    zzxx.zza.mo65852e("Verification code received with no active retrieval session.", new Object[0]);
                } else {
                    String zzb2 = zzxx.zzb(str);
                    zzxw.zze = zzb2;
                    if (zzb2 == null) {
                        zzxx.zza.mo65852e("Unable to extract verification code.", new Object[0]);
                    } else if (!zzag.zzd(zzxw.zzd)) {
                        zzxx.zze(this.zza, this.zzb);
                    }
                }
            }
            context.getApplicationContext().unregisterReceiver(this);
        }
    }
}
