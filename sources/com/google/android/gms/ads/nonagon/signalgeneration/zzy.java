package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzfuw;

final class zzy implements zzfuw {
    public final /* synthetic */ zzz zza;

    public zzy(zzz zzz) {
        this.zza = zzz;
    }

    public final void zza(Throwable th) {
        zzt.zzo().zzt(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        zzz zzz = this.zza;
        zzf.zzc(zzz.zzr, zzz.zzj, "sgf", new Pair("sgf_reason", th.getMessage()));
        zzcfi.zzh("Failed to initialize webview for loading SDKCore. ", th);
    }

    public final /* synthetic */ void zzb(Object obj) {
        zzal zzal = (zzal) obj;
        zzcfi.zze("Initialized webview successfully for SDKCore.");
    }
}
