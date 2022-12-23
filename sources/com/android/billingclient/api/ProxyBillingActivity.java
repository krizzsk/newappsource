package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.zza;

public class ProxyBillingActivity extends Activity {

    /* renamed from: b */
    public ResultReceiver f6724b;

    /* renamed from: c */
    public boolean f6725c;

    /* renamed from: a */
    public final Intent mo9542a() {
        Intent intent = new Intent("com.android.vending.billing.PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
            r5 = this;
            super.onActivityResult(r6, r7, r8)
            r0 = 0
            java.lang.String r1 = "ProxyBillingActivity"
            r2 = 100
            if (r6 != r2) goto L_0x0060
            com.android.billingclient.api.f r6 = com.google.android.gms.internal.play_billing.zza.zzg(r8, r1)
            int r6 = r6.f6770a
            r2 = -1
            if (r7 != r2) goto L_0x0019
            if (r6 == 0) goto L_0x0017
            r7 = -1
            goto L_0x0019
        L_0x0017:
            r6 = 0
            goto L_0x0026
        L_0x0019:
            r2 = 85
            java.lang.String r3 = "Activity finished with resultCode "
            java.lang.String r4 = " and billing's responseCode: "
            java.lang.String r7 = p379.C13715c.m34243i(r2, r3, r7, r4, r6)
            com.google.android.gms.internal.play_billing.zza.zzk(r1, r7)
        L_0x0026:
            android.os.ResultReceiver r7 = r5.f6724b
            if (r7 == 0) goto L_0x0036
            if (r8 != 0) goto L_0x002e
            r8 = 0
            goto L_0x0032
        L_0x002e:
            android.os.Bundle r8 = r8.getExtras()
        L_0x0032:
            r7.send(r6, r8)
            goto L_0x007b
        L_0x0036:
            android.content.Intent r6 = r5.mo9542a()
            if (r8 == 0) goto L_0x005c
            android.os.Bundle r7 = r8.getExtras()
            if (r7 == 0) goto L_0x004a
            android.os.Bundle r7 = r8.getExtras()
            r6.putExtras(r7)
            goto L_0x005c
        L_0x004a:
            java.lang.String r7 = "Got null bundle!"
            com.google.android.gms.internal.play_billing.zza.zzk(r1, r7)
            r7 = 6
            java.lang.String r8 = "RESPONSE_CODE"
            r6.putExtra(r8, r7)
            java.lang.String r7 = "DEBUG_MESSAGE"
            java.lang.String r8 = "An internal error occurred."
            r6.putExtra(r7, r8)
        L_0x005c:
            r5.sendBroadcast(r6)
            goto L_0x007b
        L_0x0060:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r8 = 69
            r7.<init>(r8)
            java.lang.String r8 = "Got onActivityResult with wrong requestCode: "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = "; skipping..."
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.google.android.gms.internal.play_billing.zza.zzk(r1, r6)
        L_0x007b:
            r5.f6725c = r0
            r5.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    public final void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle == null) {
            zza.zzj("ProxyBillingActivity", "Launching Play Store billing flow");
            if (getIntent().hasExtra("BUY_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
                this.f6724b = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            } else {
                pendingIntent = null;
            }
            try {
                this.f6725c = true;
                startIntentSenderForResult(pendingIntent.getIntentSender(), 100, new Intent(), 0, 0, 0);
            } catch (IntentSender.SendIntentException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(valueOf.length() + 53);
                sb.append("Got exception while trying to start a purchase flow: ");
                sb.append(valueOf);
                zza.zzk("ProxyBillingActivity", sb.toString());
                ResultReceiver resultReceiver = this.f6724b;
                if (resultReceiver != null) {
                    resultReceiver.send(6, (Bundle) null);
                } else {
                    Intent a = mo9542a();
                    a.putExtra("RESPONSE_CODE", 6);
                    a.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    sendBroadcast(a);
                }
                this.f6725c = false;
                finish();
            }
        } else {
            zza.zzj("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f6725c = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("result_receiver")) {
                this.f6724b = (ResultReceiver) bundle.getParcelable("result_receiver");
            }
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f6725c) {
            Intent a = mo9542a();
            a.putExtra("RESPONSE_CODE", 1);
            a.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            sendBroadcast(a);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        ResultReceiver resultReceiver = this.f6724b;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f6725c);
    }
}
