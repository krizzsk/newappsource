package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

public final class zzah {
    private String zza;
    private Uri zzb;
    private final zzaj zzc = new zzaj();
    private final zzap zzd = new zzap((zzao) null);
    private final List zze = Collections.emptyList();
    private final zzfrh zzf = zzfrh.zzo();
    private final zzas zzg = new zzas();

    public final zzah zza(String str) {
        this.zza = str;
        return this;
    }

    public final zzah zzb(Uri uri) {
        this.zzb = uri;
        return this;
    }

    public final zzbb zzc() {
        zzay zzay;
        Uri uri = this.zzb;
        if (uri != null) {
            zzay = new zzay(uri, (String) null, (zzaq) null, (zzag) null, this.zze, (String) null, this.zzf, (Object) null, (zzax) null);
        } else {
            zzay = null;
        }
        String str = this.zza;
        if (str == null) {
            str = "";
        }
        return new zzbb(str, new zzan(this.zzc, (zzam) null), zzay, new zzau(this.zzg), zzbh.zza, (zzba) null);
    }
}
