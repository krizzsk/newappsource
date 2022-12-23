package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

public final class zzdms extends zzbkw {
    private final zzdng zza;
    private IObjectWrapper zzb;

    public zzdms(zzdng zzdng) {
        this.zza = zzdng;
    }

    private static float zzb(IObjectWrapper iObjectWrapper) {
        Drawable drawable;
        if (iObjectWrapper == null || (drawable = (Drawable) ObjectWrapper.unwrap(iObjectWrapper)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return ((float) drawable.getIntrinsicWidth()) / ((float) drawable.getIntrinsicHeight());
    }

    public final float zze() throws RemoteException {
        float f;
        if (!((Boolean) zzay.zzc().zzb(zzbhy.zzfi)).booleanValue()) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (this.zza.zzb() != BitmapDescriptorFactory.HUE_RED) {
            return this.zza.zzb();
        }
        if (this.zza.zzj() != null) {
            try {
                return this.zza.zzj().zze();
            } catch (RemoteException e) {
                zzcfi.zzh("Remote exception getting video controller aspect ratio.", e);
                return BitmapDescriptorFactory.HUE_RED;
            }
        } else {
            IObjectWrapper iObjectWrapper = this.zzb;
            if (iObjectWrapper != null) {
                return zzb(iObjectWrapper);
            }
            zzbla zzm = this.zza.zzm();
            if (zzm == null) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            if (zzm.zzd() == -1 || zzm.zzc() == -1) {
                f = BitmapDescriptorFactory.HUE_RED;
            } else {
                f = ((float) zzm.zzd()) / ((float) zzm.zzc());
            }
            if (f == BitmapDescriptorFactory.HUE_RED) {
                return zzb(zzm.zzf());
            }
            return f;
        }
    }

    public final float zzf() throws RemoteException {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzfj)).booleanValue() && this.zza.zzj() != null) {
            return this.zza.zzj().zzf();
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public final float zzg() throws RemoteException {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzfj)).booleanValue() && this.zza.zzj() != null) {
            return this.zza.zzj().zzg();
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public final zzdk zzh() throws RemoteException {
        if (!((Boolean) zzay.zzc().zzb(zzbhy.zzfj)).booleanValue()) {
            return null;
        }
        return this.zza.zzj();
    }

    public final IObjectWrapper zzi() throws RemoteException {
        IObjectWrapper iObjectWrapper = this.zzb;
        if (iObjectWrapper != null) {
            return iObjectWrapper;
        }
        zzbla zzm = this.zza.zzm();
        if (zzm == null) {
            return null;
        }
        return zzm.zzf();
    }

    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zzb = iObjectWrapper;
    }

    public final boolean zzk() throws RemoteException {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzfj)).booleanValue() && this.zza.zzj() != null) {
            return true;
        }
        return false;
    }

    public final void zzl(zzbmi zzbmi) {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzfj)).booleanValue() && (this.zza.zzj() instanceof zzcme)) {
            ((zzcme) this.zza.zzj()).zzv(zzbmi);
        }
    }
}
