package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class zzaz extends zzap {
    public final /* synthetic */ zzbb zza;
    @NullableDecl
    private final Object zzb;
    private int zzc;

    public zzaz(zzbb zzbb, int i) {
        this.zza = zzbb;
        this.zzb = zzbb.zzb[i];
        this.zzc = i;
    }

    private final void zza() {
        int i = this.zzc;
        if (i == -1 || i >= this.zza.size() || !zzw.zza(this.zzb, this.zza.zzb[this.zzc])) {
            this.zzc = this.zza.zzr(this.zzb);
        }
    }

    @NullableDecl
    public final Object getKey() {
        return this.zzb;
    }

    @NullableDecl
    public final Object getValue() {
        Map zzc2 = this.zza.zzc();
        if (zzc2 != null) {
            return zzc2.get(this.zzb);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            return null;
        }
        return this.zza.zzc[i];
    }

    public final Object setValue(Object obj) {
        Map zzc2 = this.zza.zzc();
        if (zzc2 != null) {
            return zzc2.put(this.zzb, obj);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            this.zza.put(this.zzb, obj);
            return null;
        }
        Object[] objArr = this.zza.zzc;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }
}
