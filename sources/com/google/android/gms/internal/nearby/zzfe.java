package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.OnFailureListener;

final class zzfe implements OnFailureListener {
    public final /* synthetic */ GoogleApi zza;
    public final /* synthetic */ ListenerHolder.ListenerKey zzb;
    public final /* synthetic */ boolean zzc;
    public final /* synthetic */ zzfg zzd;

    public zzfe(zzfg zzfg, GoogleApi googleApi, ListenerHolder.ListenerKey listenerKey, boolean z) {
        this.zzd = zzfg;
        this.zza = googleApi;
        this.zzb = listenerKey;
        this.zzc = z;
    }

    public final void onFailure(Exception exc) {
        synchronized (this.zzd) {
            if (exc instanceof ApiException) {
                int statusCode = ((ApiException) exc).getStatusCode();
                if (statusCode == 8001 || statusCode == 8002) {
                    if (this.zzc) {
                        this.zzd.zzc.remove(this.zzb);
                    }
                }
            }
            this.zzd.zzg(this.zza, this.zzb);
        }
    }
}
