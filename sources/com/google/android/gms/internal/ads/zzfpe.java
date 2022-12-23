package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class zzfpe {
    /* access modifiers changed from: private */
    public final zzfof zza;
    private final zzfpd zzb;

    private zzfpe(zzfpd zzfpd) {
        zzfoe zzfoe = zzfoe.zza;
        this.zzb = zzfpd;
        this.zza = zzfoe;
    }

    public static zzfpe zzb(int i) {
        return new zzfpe(new zzfpa(4000));
    }

    public static zzfpe zzc(zzfof zzfof) {
        return new zzfpe(new zzfoy(zzfof));
    }

    /* access modifiers changed from: private */
    public final Iterator zzg(CharSequence charSequence) {
        return this.zzb.zza(this, charSequence);
    }

    public final Iterable zzd(CharSequence charSequence) {
        charSequence.getClass();
        return new zzfpb(this, charSequence);
    }

    public final List zzf(CharSequence charSequence) {
        Iterator zzg = zzg(charSequence);
        ArrayList arrayList = new ArrayList();
        while (zzg.hasNext()) {
            arrayList.add((String) zzg.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
