package com.google.android.gms.internal.nearby;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.nearby.Nearby;
import com.google.android.gms.nearby.uwb.zze;
import com.google.android.gms.nearby.zza;

public final class zzqs extends GmsClient {
    private final zze zze;
    private Long zzf;

    public zzqs(Context context, Looper looper, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, ClientSettings clientSettings, zze zze2) {
        super(context, looper, 298, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.zze = zze2;
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.INearbyUwbService");
        if (queryLocalInterface instanceof zzos) {
            return (zzos) queryLocalInterface;
        }
        return new zzos(iBinder);
    }

    public final void disconnect() {
        if (isConnected()) {
            try {
                ((zzos) getService()).zze(new zzob());
            } catch (RemoteException unused) {
            }
        }
        super.disconnect();
    }

    public final Feature[] getApiFeatures() {
        return new Feature[]{zza.zzI, zza.zzJ, zza.zzK};
    }

    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        if (this.zzf == null) {
            this.zzf = Long.valueOf((long) hashCode());
        }
        bundle.putLong("clientId", this.zzf.longValue());
        zze zze2 = this.zze;
        if (zze2 != null) {
            bundle.putInt("deviceType", zze2.zza());
            bundle.putBoolean("isTestOnly", false);
        }
        return bundle;
    }

    public final int getMinApkVersion() {
        return 211600000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.nearby.uwb.internal.INearbyUwbService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.nearby.uwb.service.START";
    }

    public final boolean getUseDynamicLookup() {
        return true;
    }

    public final boolean requiresGooglePlayServices() {
        return Nearby.zza(getContext());
    }
}
