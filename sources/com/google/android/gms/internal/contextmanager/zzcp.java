package com.google.android.gms.internal.contextmanager;

import android.os.RemoteException;
import com.google.android.gms.awareness.fence.FenceQueryResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.util.VisibleForTesting;

public final class zzcp extends zzcq {
    private BaseImplementation.ResultHolder<Status> zza;
    private BaseImplementation.ResultHolder<zzaq> zzb;
    private BaseImplementation.ResultHolder<FenceQueryResult> zzc;

    @VisibleForTesting
    public zzcp() {
    }

    public static zzcp zzb(BaseImplementation.ResultHolder<FenceQueryResult> resultHolder) {
        return new zzcp((BaseImplementation.ResultHolder<Status>) null, (BaseImplementation.ResultHolder) null, (BaseImplementation.ResultHolder) null, (BaseImplementation.ResultHolder) null, (BaseImplementation.ResultHolder<zzaq>) null, resultHolder, (BaseImplementation.ResultHolder) null, (zzco) null);
    }

    public static zzcp zzc(BaseImplementation.ResultHolder<zzaq> resultHolder) {
        return new zzcp((BaseImplementation.ResultHolder<Status>) null, (BaseImplementation.ResultHolder) null, (BaseImplementation.ResultHolder) null, (BaseImplementation.ResultHolder) null, resultHolder, (BaseImplementation.ResultHolder<FenceQueryResult>) null, (BaseImplementation.ResultHolder) null, (zzco) null);
    }

    public static zzcp zzd(BaseImplementation.ResultHolder<Status> resultHolder, zzco zzco) {
        return new zzcp(resultHolder, (BaseImplementation.ResultHolder) null, (BaseImplementation.ResultHolder) null, (BaseImplementation.ResultHolder) null, (BaseImplementation.ResultHolder<zzaq>) null, (BaseImplementation.ResultHolder<FenceQueryResult>) null, (BaseImplementation.ResultHolder) null, (zzco) null);
    }

    public final void zze(Status status, DataHolder dataHolder) throws RemoteException {
        zzj.zza("ContextManagerPendingResult", "Unexpected callback to onStateResult");
    }

    public final void zzf(Status status, zzbo zzbo) {
        zzj.zza("ContextManagerPendingResult", "Unexpected callback to onFenceEvaluateResult");
    }

    public final void zzg(Status status, zzbq zzbq) {
        BaseImplementation.ResultHolder<FenceQueryResult> resultHolder = this.zzc;
        if (resultHolder == null) {
            zzj.zza("ContextManagerPendingResult", "Unexpected callback to onFenceQueryResult");
            return;
        }
        resultHolder.setResult(new zzcn(this, zzbq, status));
        this.zzc = null;
    }

    public final void zzh(Status status, DataHolder dataHolder, DataHolder dataHolder2) throws RemoteException {
        zzj.zza("ContextManagerPendingResult", "Unexpected callback to onReadResult.");
    }

    public final void zzi(Status status, zzz zzz) throws RemoteException {
        BaseImplementation.ResultHolder<zzaq> resultHolder = this.zzb;
        if (resultHolder == null) {
            zzj.zza("ContextManagerPendingResult", "Unexpected callback to onSnapshotResult");
            return;
        }
        resultHolder.setResult(new zzcm(this, status, zzz));
        this.zzb = null;
    }

    public final void zzj(Status status) throws RemoteException {
        BaseImplementation.ResultHolder<Status> resultHolder = this.zza;
        if (resultHolder == null) {
            zzj.zza("ContextManagerPendingResult", "Unexpected callback to onStatusResult.");
            return;
        }
        resultHolder.setResult(status);
        this.zza = null;
    }

    public final void zzk(Status status, zzct zzct) throws RemoteException {
        zzj.zza("ContextManagerPendingResult", "Unexpected callback to onWriteBatchResult");
    }

    private zzcp(BaseImplementation.ResultHolder<Status> resultHolder, BaseImplementation.ResultHolder resultHolder2, BaseImplementation.ResultHolder resultHolder3, BaseImplementation.ResultHolder resultHolder4, BaseImplementation.ResultHolder<zzaq> resultHolder5, BaseImplementation.ResultHolder<FenceQueryResult> resultHolder6, BaseImplementation.ResultHolder resultHolder7, zzco zzco) {
        this.zza = resultHolder;
        this.zzb = resultHolder5;
        this.zzc = resultHolder6;
    }
}
