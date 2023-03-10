package com.google.android.gms.internal.measurement;

import java.util.List;
import p001a0.C0016g;

public final class zzbc extends zzaw {
    public zzbc() {
        this.zza.add(zzbl.AND);
        this.zza.add(zzbl.NOT);
        this.zza.add(zzbl.OR);
    }

    public final zzap zza(String str, zzg zzg, List list) {
        zzbl zzbl = zzbl.ADD;
        int ordinal = zzh.zze(str).ordinal();
        if (ordinal == 1) {
            zzap zzb = zzg.zzb((zzap) C0016g.m26i(zzbl.AND, 2, list, 0));
            if (!zzb.zzg().booleanValue()) {
                return zzb;
            }
            return zzg.zzb((zzap) list.get(1));
        } else if (ordinal == 47) {
            return new zzaf(Boolean.valueOf(!zzg.zzb((zzap) C0016g.m26i(zzbl.NOT, 1, list, 0)).zzg().booleanValue()));
        } else {
            if (ordinal != 50) {
                return super.zzb(str);
            }
            zzap zzb2 = zzg.zzb((zzap) C0016g.m26i(zzbl.OR, 2, list, 0));
            if (zzb2.zzg().booleanValue()) {
                return zzb2;
            }
            return zzg.zzb((zzap) list.get(1));
        }
    }
}
