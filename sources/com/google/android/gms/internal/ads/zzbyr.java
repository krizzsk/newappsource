package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public final class zzbyr {
    private final View zza;
    private final Map zzb;
    private final zzcdz zzc;

    public zzbyr(zzbyq zzbyq) {
        View zza2 = zzbyq.zza;
        this.zza = zza2;
        Map zzd = zzbyq.zzb;
        this.zzb = zzd;
        zzcdz zza3 = zzbyl.zza(zzbyq.zza.getContext());
        this.zzc = zza3;
        if (zza3 != null && !zzd.isEmpty()) {
            try {
                zza3.zzf(new zzbys(ObjectWrapper.wrap(zza2).asBinder(), ObjectWrapper.wrap(zzd).asBinder()));
            } catch (RemoteException unused) {
                zzcfi.zzg("Failed to call remote method.");
            }
        }
    }

    public final void zza(List list) {
        if (list == null || list.isEmpty()) {
            zzcfi.zzj("No click urls were passed to recordClick");
            return;
        }
        if (this.zzc == null) {
            zzcfi.zzj("Failed to get internal reporting info generator in recordClick.");
        }
        try {
            this.zzc.zzg(list, ObjectWrapper.wrap(this.zza), new zzbyp(this, list));
        } catch (RemoteException e) {
            zzcfi.zzg("RemoteException recording click: ".concat(e.toString()));
        }
    }

    public final void zzb(List list) {
        if (list == null || list.isEmpty()) {
            zzcfi.zzj("No impression urls were passed to recordImpression");
            return;
        }
        zzcdz zzcdz = this.zzc;
        if (zzcdz != null) {
            try {
                zzcdz.zzh(list, ObjectWrapper.wrap(this.zza), new zzbyo(this, list));
            } catch (RemoteException e) {
                zzcfi.zzg("RemoteException recording impression urls: ".concat(e.toString()));
            }
        } else {
            zzcfi.zzj("Failed to get internal reporting info generator from recordImpression.");
        }
    }

    public final void zzc(MotionEvent motionEvent) {
        zzcdz zzcdz = this.zzc;
        if (zzcdz != null) {
            try {
                zzcdz.zzj(ObjectWrapper.wrap(motionEvent));
            } catch (RemoteException unused) {
                zzcfi.zzg("Failed to call remote method.");
            }
        } else {
            zzcfi.zze("Failed to get internal reporting info generator.");
        }
    }

    public final void zzd(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        if (this.zzc == null) {
            updateClickUrlCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzc.zzk(new ArrayList(Arrays.asList(new Uri[]{uri})), ObjectWrapper.wrap(this.zza), new zzbyn(this, updateClickUrlCallback));
        } catch (RemoteException e) {
            updateClickUrlCallback.onFailure("Internal error: ".concat(e.toString()));
        }
    }

    public final void zze(List list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        if (this.zzc == null) {
            updateImpressionUrlsCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzc.zzl(list, ObjectWrapper.wrap(this.zza), new zzbym(this, updateImpressionUrlsCallback));
        } catch (RemoteException e) {
            updateImpressionUrlsCallback.onFailure("Internal error: ".concat(e.toString()));
        }
    }
}
