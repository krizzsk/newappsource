package com.google.android.gms.internal.ads;

import java.util.Iterator;

final class zzftd extends zzfrm {
    public final transient Object zza;

    public zzftd(Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final /* synthetic */ Iterator iterator() {
        return new zzfrp(this.zza);
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

    public final int zza(Object[] objArr, int i) {
        objArr[i] = this.zza;
        return i + 1;
    }

    public final zzfrh zzd() {
        return zzfrh.zzp(this.zza);
    }

    public final zzftg zze() {
        return new zzfrp(this.zza);
    }

    public final boolean zzf() {
        throw null;
    }
}
