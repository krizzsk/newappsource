package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import p484ff.C16981k;
import p484ff.C16989r;

public final class FirebaseInstanceIdReceiver extends CloudMessagingReceiver {
    public final int onMessageReceive(Context context, CloudMessage cloudMessage) {
        try {
            return ((Integer) Tasks.await(new C16981k(context).mo49610b(cloudMessage.getIntent()))).intValue();
        } catch (InterruptedException | ExecutionException unused) {
            return 500;
        }
    }

    public final void onNotificationDismissed(Context context, Bundle bundle) {
        Intent putExtras = new Intent(CloudMessagingReceiver.IntentActionKeys.NOTIFICATION_DISMISS).putExtras(bundle);
        if (C16989r.m42830c(putExtras)) {
            C16989r.m42829b(putExtras.getExtras(), "_nd");
        }
    }
}
