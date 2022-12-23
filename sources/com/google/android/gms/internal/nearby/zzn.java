package com.google.android.gms.internal.nearby;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.nearby.Nearby;
import com.google.android.gms.nearby.zza;

public final class zzn extends GmsClient {
    public zzn(Context context, Looper looper, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, ClientSettings clientSettings) {
        super(context, looper, 236, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.exposurenotification.internal.INearbyExposureNotificationService");
        if (queryLocalInterface instanceof zzdr) {
            return (zzdr) queryLocalInterface;
        }
        return new zzdq(iBinder);
    }

    public final Feature[] getApiFeatures() {
        return new Feature[]{zza.zzh, zza.zzi, zza.zzj, zza.zzk, zza.zzl, zza.zzn, zza.zzm, zza.zzo, zza.zzp, zza.zzq, zza.zzr};
    }

    public final int getMinApkVersion() {
        return 201516000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.nearby.exposurenotification.internal.INearbyExposureNotificationService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.nearby.exposurenotification.START";
    }

    public final boolean getUseDynamicLookup() {
        return true;
    }

    public final boolean requiresGooglePlayServices() {
        return Nearby.zza(getContext());
    }
}
