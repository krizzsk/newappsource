package com.google.android.gms.nearby.messages.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.nearby.zznm;
import com.google.android.gms.internal.nearby.zzno;
import com.google.android.gms.internal.nearby.zznr;
import com.google.android.gms.internal.nearby.zzns;
import com.google.android.gms.nearby.Nearby;
import com.google.android.gms.nearby.messages.MessagesOptions;
import com.google.android.gms.nearby.messages.PublishOptions;
import com.google.android.gms.nearby.messages.SubscribeOptions;

public final class zzai extends GmsClient {
    private final zzns zze = new zzns();
    private final ClientAppContext zzf;
    private final int zzg;

    @TargetApi(14)
    public zzai(Context context, Looper looper, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, ClientSettings clientSettings, MessagesOptions messagesOptions) {
        super(context, looper, 62, clientSettings, connectionCallbacks, onConnectionFailedListener);
        String realClientPackageName = clientSettings.getRealClientPackageName();
        int zzp = zzp(context);
        if (messagesOptions != null) {
            this.zzf = new ClientAppContext(1, realClientPackageName, (String) null, false, zzp, (String) null);
            this.zzg = messagesOptions.zzc;
        } else {
            this.zzf = new ClientAppContext(1, realClientPackageName, (String) null, false, zzp, (String) null);
            this.zzg = -1;
        }
        if (zzp == 1 && PlatformVersion.isAtLeastIceCreamSandwich()) {
            Activity activity = (Activity) context;
            if (Log.isLoggable("NearbyMessagesClient", 2)) {
                String.format("Registering ClientLifecycleSafetyNet's ActivityLifecycleCallbacks for %s", new Object[]{activity.getPackageName()});
            }
            activity.getApplication().registerActivityLifecycleCallbacks(new zzah(activity, this, (zzag) null));
        }
    }

    public static int zzp(Context context) {
        if (context instanceof Activity) {
            return 1;
        }
        if (context instanceof Application) {
            return 2;
        }
        if (context instanceof Service) {
            return 3;
        }
        return 0;
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
        if (queryLocalInterface instanceof zzs) {
            return (zzs) queryLocalInterface;
        }
        return new zzs(iBinder);
    }

    public final void disconnect() {
        try {
            zzq(2);
        } catch (RemoteException e) {
            if (Log.isLoggable("NearbyMessagesClient", 2)) {
                String.format("Failed to emit CLIENT_DISCONNECTED from override of GmsClient#disconnect(): %s", new Object[]{e});
            }
        }
        this.zze.zzb();
        super.disconnect();
    }

    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle getServiceRequestExtraArgs = super.getGetServiceRequestExtraArgs();
        getServiceRequestExtraArgs.putInt("NearbyPermissions", this.zzg);
        getServiceRequestExtraArgs.putParcelable("ClientAppContext", this.zzf);
        return getServiceRequestExtraArgs;
    }

    public final int getMinApkVersion() {
        return GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.nearby.messages.internal.INearbyMessagesService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.nearby.messages.service.NearbyMessagesService.START";
    }

    public final boolean requiresGooglePlayServices() {
        return Nearby.zza(getContext());
    }

    public final boolean usesClientTelemetry() {
        return true;
    }

    public final void zzA(ListenerHolder listenerHolder, PendingIntent pendingIntent) throws RemoteException {
        ((zzs) getService()).zzj(new zzcg((IBinder) null, new zzno(listenerHolder), pendingIntent));
    }

    public final void zzB(ListenerHolder listenerHolder, ListenerHolder listenerHolder2) throws RemoteException {
        ListenerHolder.ListenerKey listenerKey = listenerHolder2.getListenerKey();
        if (listenerKey != null) {
            zzno zzno = new zzno(listenerHolder);
            if (!this.zze.zze(listenerKey)) {
                zzno.zzd(new Status(0));
                return;
            }
            ((zzs) getService()).zzj(new zzcg((IBinder) this.zze.zza(listenerKey), zzno, (PendingIntent) null));
            this.zze.zzd(listenerKey);
        }
    }

    public final void zzq(int i) throws RemoteException {
        String str;
        if (i != 1) {
            str = "CLIENT_DISCONNECTED";
        } else {
            str = "ACTIVITY_STOPPED";
        }
        if (isConnected()) {
            zzj zzj = new zzj(1, (ClientAppContext) null, i);
            if (Log.isLoggable("NearbyMessagesClient", 3)) {
                String.format("Emitting client lifecycle event %s", new Object[]{str});
            }
            ((zzs) getService()).zze(zzj);
        } else if (Log.isLoggable("NearbyMessagesClient", 3)) {
            String.format("Failed to emit client lifecycle event %s due to GmsClient being disconnected", new Object[]{str});
        }
    }

    @Deprecated
    public final void zzr(ListenerHolder listenerHolder, zzae zzae, zzu zzu, PublishOptions publishOptions) throws RemoteException {
        zzs(listenerHolder, zzae, zzu, publishOptions, this.zzf.zze);
    }

    public final void zzs(ListenerHolder listenerHolder, zzae zzae, zzu zzu, PublishOptions publishOptions, int i) throws RemoteException {
        ListenerHolder listenerHolder2 = listenerHolder;
        ((zzs) getService()).zzf(new zzbz(2, zzae, publishOptions.getStrategy(), new zzno(listenerHolder), (String) null, (String) null, false, zzu, false, (ClientAppContext) null, i));
    }

    public final void zzt(ListenerHolder listenerHolder, ListenerHolder listenerHolder2) throws RemoteException {
        ListenerHolder.ListenerKey listenerKey = listenerHolder2.getListenerKey();
        if (listenerKey != null) {
            if (!this.zze.zze(listenerKey)) {
                this.zze.zzc(listenerKey, new zznr(listenerHolder2));
            }
            zzcb zzcb = new zzcb(new zzno(listenerHolder), (IBinder) this.zze.zza(listenerKey));
            zzcb.zzd = true;
            ((zzs) getService()).zzg(zzcb);
        }
    }

    @Deprecated
    public final void zzu(ListenerHolder listenerHolder, PendingIntent pendingIntent, zzaa zzaa, SubscribeOptions subscribeOptions) throws RemoteException {
        zzv(listenerHolder, pendingIntent, zzaa, subscribeOptions, this.zzf.zze);
    }

    public final void zzv(ListenerHolder listenerHolder, PendingIntent pendingIntent, zzaa zzaa, SubscribeOptions subscribeOptions, int i) throws RemoteException {
        ListenerHolder listenerHolder2 = listenerHolder;
        ((zzs) getService()).zzh(new SubscribeRequest((IBinder) null, subscribeOptions.getStrategy(), new zzno(listenerHolder), subscribeOptions.getFilter(), pendingIntent, (byte[]) null, zzaa, false, 0, this.zzf.zze));
    }

    @Deprecated
    public final void zzw(ListenerHolder listenerHolder, ListenerHolder listenerHolder2, zzaa zzaa, SubscribeOptions subscribeOptions, byte[] bArr) throws RemoteException {
        zzx(listenerHolder, listenerHolder2, zzaa, subscribeOptions, (byte[]) null, this.zzf.zze);
    }

    public final void zzx(ListenerHolder listenerHolder, ListenerHolder listenerHolder2, zzaa zzaa, SubscribeOptions subscribeOptions, byte[] bArr, int i) throws RemoteException {
        ListenerHolder.ListenerKey listenerKey = listenerHolder2.getListenerKey();
        if (listenerKey != null) {
            if (!this.zze.zze(listenerKey)) {
                this.zze.zzc(listenerKey, new zznm(listenerHolder2));
            }
            ((zzs) getService()).zzh(new SubscribeRequest((IBinder) this.zze.zza(listenerKey), subscribeOptions.getStrategy(), new zzno(listenerHolder), subscribeOptions.getFilter(), (PendingIntent) null, (byte[]) null, zzaa, false, 0, i));
        }
    }

    public final void zzy(ListenerHolder listenerHolder, zzae zzae) throws RemoteException {
        ((zzs) getService()).zzi(new zzce(1, zzae, new zzno(listenerHolder), (String) null, (String) null, false, (ClientAppContext) null));
    }

    public final void zzz(ListenerHolder listenerHolder, ListenerHolder listenerHolder2) throws RemoteException {
        ListenerHolder.ListenerKey listenerKey = listenerHolder2.getListenerKey();
        if (listenerKey != null) {
            zzno zzno = new zzno(listenerHolder);
            if (!this.zze.zze(listenerKey)) {
                zzno.zzd(new Status(0));
                return;
            }
            zzcb zzcb = new zzcb(zzno, (IBinder) this.zze.zza(listenerKey));
            zzcb.zzd = false;
            ((zzs) getService()).zzg(zzcb);
            this.zze.zzd(listenerKey);
        }
    }
}
