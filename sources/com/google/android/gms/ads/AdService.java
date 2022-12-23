package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbtw;
import com.google.android.gms.internal.ads.zzcfi;

@KeepForSdk
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    public final void onHandleIntent(Intent intent) {
        try {
            zzaw.zza().zzl(this, new zzbtw()).zze(intent);
        } catch (RemoteException e) {
            zzcfi.zzg("RemoteException calling handleNotificationIntent: ".concat(e.toString()));
        }
    }
}
