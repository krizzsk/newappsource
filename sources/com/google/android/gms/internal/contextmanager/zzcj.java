package com.google.android.gms.internal.contextmanager;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import com.google.android.gms.awareness.AwarenessOptions;
import com.google.android.gms.awareness.fence.FenceQueryResult;
import com.google.android.gms.awareness.fence.zza;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.util.ClientLibraryUtils;
import java.util.ArrayList;

public final class zzcj extends GmsClient<zzcs> {
    private static final zzf zze = zzf.zza;
    private final Looper zzf;
    private final zzck zzg;
    private zzl<zza, zzbg> zzh;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzcj(Context context, Looper looper, ClientSettings clientSettings, AwarenessOptions awarenessOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 47, clientSettings, connectionCallbacks, onConnectionFailedListener);
        String str;
        this.zzf = looper;
        Account account = clientSettings.getAccount();
        if (account == null) {
            str = "@@ContextManagerNullAccount@@";
        } else {
            str = account.name;
        }
        Parcelable.Creator<zzck> creator = zzck.CREATOR;
        Account zzc = awarenessOptions.zzc();
        this.zzg = new zzck(zzc != null ? zzc.name : str, context.getPackageName(), Process.myUid(), awarenessOptions.zzf(), ClientLibraryUtils.getClientVersion(context, context.getPackageName()), awarenessOptions.zza(), awarenessOptions.zzh(), awarenessOptions.zzg(), awarenessOptions.zzb(), Process.myPid(), awarenessOptions.zze());
    }

    public final /* bridge */ /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.contextmanager.internal.IContextManagerService");
        if (queryLocalInterface instanceof zzcs) {
            return (zzcs) queryLocalInterface;
        }
        return new zzcs(iBinder);
    }

    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putByteArray("com.google.android.contextmanager.service.args", SafeParcelableSerializer.serializeToBytes(this.zzg));
        return bundle;
    }

    public final int getMinApkVersion() {
        return GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.contextmanager.internal.IContextManagerService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.contextmanager.service.ContextManagerService.START";
    }

    public final boolean requiresAccount() {
        return false;
    }

    public final boolean usesClientTelemetry() {
        return true;
    }

    public final void zzp(BaseImplementation.ResultHolder<zzaq> resultHolder, zzao zzao) throws RemoteException {
        checkConnected();
        zzcp zzc = zzcp.zzc(resultHolder);
        zzck zzck = this.zzg;
        ((zzcs) getService()).zzc(zzc, zzck.zzb, zzck.zza, zzck.zzd, zzao);
    }

    public final void zzq(BaseImplementation.ResultHolder<FenceQueryResult> resultHolder, zzbm zzbm) throws RemoteException {
        checkConnected();
        zzcp zzb = zzcp.zzb(resultHolder);
        zzck zzck = this.zzg;
        ((zzcs) getService()).zzd(zzb, zzck.zzb, zzck.zza, zzck.zzd, zzbm);
    }

    public final void zzr(BaseImplementation.ResultHolder<Status> resultHolder, zzbs zzbs) throws RemoteException {
        checkConnected();
        if (this.zzh == null) {
            this.zzh = new zzl<>(this.zzf, zzbg.zza);
        }
        ArrayList<zzcc> arrayList = zzbs.zza;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zzbw zzbw = arrayList.get(i).zzc;
        }
        zzcp zzd = zzcp.zzd(resultHolder, (zzco) null);
        zzck zzck = this.zzg;
        ((zzcs) getService()).zze(zzd, zzck.zzb, zzck.zza, zzck.zzd, zzbs);
    }
}
