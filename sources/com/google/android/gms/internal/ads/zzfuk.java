package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

abstract class zzfuk extends zzfua {
    private List zza;

    public zzfuk(zzfrc zzfrc, boolean z) {
        super(zzfrc, true, true);
        List list;
        if (zzfrc.isEmpty()) {
            list = Collections.emptyList();
        } else {
            list = zzfrv.zza(zzfrc.size());
        }
        for (int i = 0; i < zzfrc.size(); i++) {
            list.add((Object) null);
        }
        this.zza = list;
    }

    public abstract Object zzG(List list);

    public final void zzg(int i, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i, new zzfuj(obj));
        }
    }

    public final void zzv() {
        List list = this.zza;
        if (list != null) {
            zzd(zzG(list));
        }
    }

    public final void zzz(int i) {
        super.zzz(i);
        this.zza = null;
    }
}
