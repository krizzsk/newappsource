package com.google.android.gms.wallet.callback;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.wallet.zzg;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

abstract class zzd extends Service {
    @VisibleForTesting
    public ExecutorService zza;
    private Messenger zzb = new Messenger(new zza(this, Looper.getMainLooper()));

    public IBinder onBind(Intent intent) {
        return this.zzb.getBinder();
    }

    public void onCreate() {
        super.onCreate();
        this.zzb = new Messenger(new zza(this, Looper.getMainLooper()));
        zzg.zza();
        this.zza = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
    }

    public abstract void onRunTask(String str, CallbackInput callbackInput, OnCompleteListener<CallbackOutput> onCompleteListener);
}
