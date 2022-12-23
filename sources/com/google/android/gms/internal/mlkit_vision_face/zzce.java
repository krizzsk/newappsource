package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Iterator;

final class zzce<E> extends zzbm<E> {
    public final transient E zza;
    private transient int zzb;

    public zzce(E e) {
        e.getClass();
        this.zza = e;
    }

    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    public final int hashCode() {
        int i = this.zzb;
        if (i != 0) {
            return i;
        }
        int hashCode = this.zza.hashCode();
        this.zzb = hashCode;
        return hashCode;
    }

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new zzbn(this.zza);
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        String obj = this.zza.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }

    public final zzcg<E> zza() {
        return new zzbn(this.zza);
    }

    public final int zze(Object[] objArr, int i) {
        objArr[0] = this.zza;
        return 1;
    }

    public final boolean zzh() {
        return this.zzb != 0;
    }

    public final zzbl<E> zzj() {
        return zzbl.zzg(this.zza);
    }

    public zzce(E e, int i) {
        this.zza = e;
        this.zzb = i;
    }
}
