package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.ads.zzd;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.VisibleForTesting;

public final class zzbcw extends zzc {
    public zzbcw(Context context, Looper looper, BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        super(zzcai.zza(context), looper, 123, baseConnectionCallbacks, baseOnConnectionFailedListener, (String) null);
    }

    @VisibleForTesting
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        if (queryLocalInterface instanceof zzbcz) {
            return (zzbcz) queryLocalInterface;
        }
        return new zzbcz(iBinder);
    }

    public final Feature[] getApiFeatures() {
        return zzd.zzb;
    }

    @VisibleForTesting
    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    @VisibleForTesting
    public final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    public final boolean zzp() {
        Feature[] availableFeatures = getAvailableFeatures();
        if (!((Boolean) zzay.zzc().zzb(zzbhy.zzbB)).booleanValue() || !ArrayUtils.contains((T[]) availableFeatures, zzd.zza)) {
            return false;
        }
        return true;
    }

    public final zzbcz zzq() throws DeadObjectException {
        return (zzbcz) super.getService();
    }
}
