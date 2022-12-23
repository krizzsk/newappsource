package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class zzfui extends zzfuk {
    public zzfui(zzfrc zzfrc, boolean z) {
        super(zzfrc, true);
        zzw();
    }

    public final /* bridge */ /* synthetic */ Object zzG(List list) {
        Object obj;
        ArrayList zza = zzfrv.zza(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfuj zzfuj = (zzfuj) it.next();
            if (zzfuj != null) {
                obj = zzfuj.zza;
            } else {
                obj = null;
            }
            zza.add(obj);
        }
        return Collections.unmodifiableList(zza);
    }
}
