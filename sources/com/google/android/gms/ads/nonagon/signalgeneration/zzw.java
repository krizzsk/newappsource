package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbyj;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzfhq;
import com.google.android.gms.internal.ads.zzfuw;
import com.usebutton.sdk.internal.util.DiskLruCache;
import java.util.ArrayList;
import java.util.Iterator;

final class zzw implements zzfuw {
    public final /* synthetic */ zzbyj zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ zzz zzc;

    public zzw(zzz zzz, zzbyj zzbyj, boolean z) {
        this.zzc = zzz;
        this.zza = zzbyj;
        this.zzb = z;
    }

    public final void zza(Throwable th) {
        try {
            zzbyj zzbyj = this.zza;
            String message = th.getMessage();
            zzbyj.zze("Internal error: " + message);
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        try {
            this.zza.zzf(arrayList);
            if (this.zzc.zzt || this.zzb) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Uri uri = (Uri) it.next();
                    if (this.zzc.zzN(uri)) {
                        zzz zzz = this.zzc;
                        this.zzc.zzs.zzc(zzz.zzV(uri, zzz.zzC, DiskLruCache.VERSION_1).toString(), (zzfhq) null);
                    } else {
                        if (((Boolean) zzay.zzc().zzb(zzbhy.zzgt)).booleanValue()) {
                            this.zzc.zzs.zzc(uri.toString(), (zzfhq) null);
                        }
                    }
                }
            }
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
        }
    }
}
