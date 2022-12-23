package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

public class AssetPackExtractionService extends Service {

    /* renamed from: b */
    public C14326v f35787b;

    public final IBinder onBind(Intent intent) {
        return this.f35787b;
    }

    public final void onCreate() {
        C14295n0 n0Var;
        super.onCreate();
        Context applicationContext = getApplicationContext();
        synchronized (C14256d1.class) {
            if (C14256d1.f35822a == null) {
                Context applicationContext2 = applicationContext.getApplicationContext();
                if (applicationContext2 != null) {
                    applicationContext = applicationContext2;
                }
                C14256d1.f35822a = new C14295n0(new C14329v2(applicationContext));
            }
            n0Var = C14256d1.f35822a;
        }
        this.f35787b = (C14326v) n0Var.f35953a.zza();
    }
}
