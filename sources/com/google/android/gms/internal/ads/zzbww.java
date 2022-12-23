package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

public final class zzbww extends NativeAd.AdChoicesInfo {
    private final List zza = new ArrayList();
    private String zzb;

    public zzbww(zzbks zzbks) {
        zzbla zzbla;
        try {
            this.zzb = zzbks.zzg();
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
            this.zzb = "";
        }
        try {
            for (Object next : zzbks.zzh()) {
                if (next instanceof IBinder) {
                    zzbla = zzbkz.zzg((IBinder) next);
                } else {
                    zzbla = null;
                }
                if (zzbla != null) {
                    this.zza.add(new zzbwy(zzbla));
                }
            }
        } catch (RemoteException e2) {
            zzcfi.zzh("", e2);
        }
    }

    public final List<NativeAd.Image> getImages() {
        return this.zza;
    }

    public final CharSequence getText() {
        return this.zzb;
    }
}
