package com.google.android.gms.internal.mlkit_vision_face;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public final class zzkh implements zzkn {
    public final List<zzkn> zza;

    public zzkh(Context context, zzkg zzkg) {
        ArrayList arrayList = new ArrayList();
        this.zza = arrayList;
        if (zzkg.zzc()) {
            arrayList.add(new zzkw(context, zzkg));
        }
        if (zzkg.zzb()) {
            arrayList.add(new zzkq(context));
        }
    }

    public final void zza(zzkp zzkp) {
        for (zzkn zza2 : this.zza) {
            zza2.zza(zzkp);
        }
    }
}
