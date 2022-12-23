package com.google.android.gms.internal.mlkit_vision_barcode;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public final class zznf implements zznl {
    public final List zza;

    public zznf(Context context, zzne zzne) {
        ArrayList arrayList = new ArrayList();
        this.zza = arrayList;
        if (zzne.zzc()) {
            arrayList.add(new zznu(context, zzne));
        }
    }

    public final void zza(zznp zznp) {
        for (zznl zza2 : this.zza) {
            zza2.zza(zznp);
        }
    }
}
