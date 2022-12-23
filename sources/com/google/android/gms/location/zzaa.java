package com.google.android.gms.location;

import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.internal.location.zzbf;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

public final /* synthetic */ class zzaa implements RemoteCall {
    public final /* synthetic */ FusedLocationProviderClient zza;
    public final /* synthetic */ zzbf zzb;
    public final /* synthetic */ CancellationToken zzc;

    public /* synthetic */ zzaa(FusedLocationProviderClient fusedLocationProviderClient, zzbf zzbf, CancellationToken cancellationToken) {
        this.zza = fusedLocationProviderClient;
        this.zzb = zzbf;
        this.zzc = cancellationToken;
    }

    public final void accept(Object obj, Object obj2) {
        FusedLocationProviderClient fusedLocationProviderClient = this.zza;
        zzbf zzbf = this.zzb;
        CancellationToken cancellationToken = this.zzc;
        zzbe zzbe = (zzbe) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        CurrentLocationRequest.Builder builder = new CurrentLocationRequest.Builder();
        builder.setPriority(zzbf.zzb().getPriority());
        long j = Long.MAX_VALUE;
        if (zzbf.zzb().getExpirationTime() != Long.MAX_VALUE) {
            j = zzbf.zzb().getExpirationTime() - SystemClock.elapsedRealtime();
        }
        builder.setDurationMillis(j);
        builder.setMaxUpdateAgeMillis(zzbf.zza());
        builder.zza(zzbf.zzg());
        List<ClientIdentity> zzf = zzbf.zzf();
        WorkSource workSource = new WorkSource();
        for (ClientIdentity clientIdentity : zzf) {
            WorkSourceUtil.add(workSource, clientIdentity.uid, clientIdentity.packageName);
        }
        builder.zzb(workSource);
        zzbe.zzt(builder.build(), cancellationToken, new zzap(fusedLocationProviderClient, taskCompletionSource));
    }
}
