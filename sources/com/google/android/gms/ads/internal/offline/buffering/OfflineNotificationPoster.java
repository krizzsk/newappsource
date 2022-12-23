package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbtw;
import com.google.android.gms.internal.ads.zzbxk;

@KeepForSdk
public class OfflineNotificationPoster extends Worker {
    private final zzbxk zza;

    public OfflineNotificationPoster(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.zza = zzaw.zza().zzl(context, new zzbtw());
    }

    public final ListenableWorker.C1379a doWork() {
        try {
            this.zza.zzg(ObjectWrapper.wrap(getApplicationContext()), getInputData().mo5691b("uri"), getInputData().mo5691b("gws_query_id"));
            return new ListenableWorker.C1379a.C1382c();
        } catch (RemoteException unused) {
            return new ListenableWorker.C1379a.C1380a();
        }
    }
}
