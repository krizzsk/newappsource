package com.google.android.gms.nearby.exposurenotification;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;

public class WakeUpService extends Service {
    public final IBinder onBind(Intent intent) {
        return new Messenger(new zzr((zzq) null)).getBinder();
    }
}
