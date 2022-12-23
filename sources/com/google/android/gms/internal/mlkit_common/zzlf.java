package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public final class zzlf implements zzlk {
    public final List zza;

    public zzlf(Context context, zzle zzle) {
        ArrayList arrayList = new ArrayList();
        this.zza = arrayList;
        if (zzle.zzc()) {
            arrayList.add(new zzlt(context, zzle));
        }
    }

    public final void zza(zzlc zzlc) {
        for (zzlk zza2 : this.zza) {
            zza2.zza(zzlc);
        }
    }
}
