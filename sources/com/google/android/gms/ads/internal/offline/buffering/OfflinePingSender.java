package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbtw;
import com.google.android.gms.internal.ads.zzbxk;

@KeepForSdk
public class OfflinePingSender extends Worker {
    private final zzbxk zza;

    public OfflinePingSender(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.zza = zzaw.zza().zzl(context, new zzbtw());
    }

    public final ListenableWorker.C1379a doWork() {
        try {
            this.zza.zzf();
            return new ListenableWorker.C1379a.C1382c();
        } catch (RemoteException unused) {
            return new ListenableWorker.C1379a.C1380a();
        }
    }
}
