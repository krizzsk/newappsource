package com.google.android.gms.internal.mlkit_vision_face;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class zzaw extends AbstractSet<Map.Entry> {
    public final /* synthetic */ zzbb zza;

    public zzaw(zzbb zzbb) {
        this.zza = zzbb;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final boolean contains(@NullableDecl Object obj) {
        Map zzc = this.zza.zzc();
        if (zzc != null) {
            return zzc.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int zzk = this.zza.zzr(entry.getKey());
            if (zzk == -1 || !zzw.zza(this.zza.zzc[zzk], entry.getValue())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final Iterator<Map.Entry> iterator() {
        zzbb zzbb = this.zza;
        Map zzc = zzbb.zzc();
        if (zzc != null) {
            return zzc.entrySet().iterator();
        }
        return new zzau(zzbb);
    }

    public final boolean remove(@NullableDecl Object obj) {
        Map zzc = this.zza.zzc();
        if (zzc != null) {
            return zzc.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (this.zza.zzb()) {
            return false;
        }
        int zzl = this.zza.zzp();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object zzm = this.zza.zze;
        zzbb zzbb = this.zza;
        int zze = zzbc.zze(key, value, zzl, zzm, zzbb.zza, zzbb.zzb, zzbb.zzc);
        if (zze == -1) {
            return false;
        }
        this.zza.zze(zze, zzl);
        zzbb.zzn(this.zza);
        this.zza.zzd();
        return true;
    }

    public final int size() {
        return this.zza.size();
    }
}
