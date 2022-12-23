package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;

class zzfra extends zzfrb {
    public Object[] zza;
    public int zzb = 0;
    public boolean zzc;

    public zzfra(int i) {
        this.zza = new Object[i];
    }

    private final void zze(int i) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length < i) {
            this.zza = Arrays.copyOf(objArr, zzfrb.zzd(length, i));
            this.zzc = false;
        } else if (this.zzc) {
            this.zza = (Object[]) objArr.clone();
            this.zzc = false;
        }
    }

    public final zzfra zza(Object obj) {
        obj.getClass();
        zze(this.zzb + 1);
        Object[] objArr = this.zza;
        int i = this.zzb;
        this.zzb = i + 1;
        objArr[i] = obj;
        return this;
    }

    public /* bridge */ /* synthetic */ zzfrb zzb(Object obj) {
        throw null;
    }

    public final zzfrb zzc(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            zze(collection.size() + this.zzb);
            if (collection instanceof zzfrc) {
                this.zzb = ((zzfrc) collection).zza(this.zza, this.zzb);
                return this;
            }
        }
        for (Object zzb2 : iterable) {
            zzb(zzb2);
        }
        return this;
    }
}
