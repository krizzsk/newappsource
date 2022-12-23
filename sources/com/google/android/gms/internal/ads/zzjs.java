package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

final class zzjs extends zzgd {
    private final int zzc;
    private final int zzd;
    private final int[] zze;
    private final int[] zzf;
    private final zzci[] zzg;
    private final Object[] zzh;
    private final HashMap zzi = new HashMap();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzjs(Collection collection, zztu zztu, byte[] bArr) {
        super(false, zztu, (byte[]) null);
        int i = 0;
        int size = collection.size();
        this.zze = new int[size];
        this.zzf = new int[size];
        this.zzg = new zzci[size];
        this.zzh = new Object[size];
        Iterator it = collection.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            zzjh zzjh = (zzjh) it.next();
            this.zzg[i3] = zzjh.zza();
            this.zzf[i3] = i;
            this.zze[i3] = i2;
            i += this.zzg[i3].zzc();
            i2 += this.zzg[i3].zzb();
            this.zzh[i3] = zzjh.zzb();
            this.zzi.put(this.zzh[i3], Integer.valueOf(i3));
            i3++;
        }
        this.zzc = i;
        this.zzd = i2;
    }

    public final int zzb() {
        return this.zzd;
    }

    public final int zzc() {
        return this.zzc;
    }

    public final int zzp(Object obj) {
        Integer num = (Integer) this.zzi.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public final int zzq(int i) {
        return zzeg.zzc(this.zze, i + 1, false, false);
    }

    public final int zzr(int i) {
        return zzeg.zzc(this.zzf, i + 1, false, false);
    }

    public final int zzs(int i) {
        return this.zze[i];
    }

    public final int zzt(int i) {
        return this.zzf[i];
    }

    public final zzci zzu(int i) {
        return this.zzg[i];
    }

    public final Object zzv(int i) {
        return this.zzh[i];
    }

    public final List zzw() {
        return Arrays.asList(this.zzg);
    }
}
