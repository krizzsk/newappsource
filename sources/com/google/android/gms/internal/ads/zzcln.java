package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Map;

final class zzcln implements zzfuw {
    public final /* synthetic */ List zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ Uri zzc;
    public final /* synthetic */ zzclp zzd;

    public zzcln(zzclp zzclp, List list, String str, Uri uri) {
        this.zzd = zzclp;
        this.zza = list;
        this.zzb = str;
        this.zzc = uri;
    }

    public final void zza(Throwable th) {
        zzcfi.zzj("Failed to parse gmsg params for: ".concat(String.valueOf(this.zzc)));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzd.zzO((Map) obj, this.zza, this.zzb);
    }
}
