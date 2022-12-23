package com.google.android.gms.internal.mlkit_vision_common;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public final class zzjo implements zzjs {
    public final List zza;

    public zzjo(Context context, zzjn zzjn) {
        ArrayList arrayList = new ArrayList();
        this.zza = arrayList;
        if (zzjn.zzc()) {
            arrayList.add(new zzjz(context, zzjn));
        }
    }

    public final void zza(zzju zzju) {
        for (zzjs zza2 : this.zza) {
            zza2.zza(zzju);
        }
    }
}
