package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.internal.ads.zzbiu;
import com.google.android.gms.internal.ads.zzbiw;
import com.google.android.gms.internal.ads.zzgqi;
import p253t.C6517h;

final class zzn implements zzbiu {
    public final /* synthetic */ zzbiw zza;
    public final /* synthetic */ Context zzb;
    public final /* synthetic */ Uri zzc;

    public zzn(zzs zzs, zzbiw zzbiw, Context context, Uri uri) {
        this.zza = zzbiw;
        this.zzb = context;
        this.zzc = uri;
    }

    public final void zza() {
        C6517h a = new C6517h.C6518a(this.zza.zza()).mo22621a();
        a.f20317a.setPackage(zzgqi.zza(this.zzb));
        a.mo22620a(this.zzb, this.zzc);
        this.zza.zzf((Activity) this.zzb);
    }
}
