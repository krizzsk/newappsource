package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class zzcb<E> extends zzbm<E> {
    public static final zzcb<Object> zza = new zzcb(new Object[0], 0, (Object[]) null, 0, 0);
    public final transient Object[] zzb;
    public final transient Object[] zzc;
    private final transient int zzd;
    private final transient int zze;
    private final transient int zzf;

    public zzcb(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.zzb = objArr;
        this.zzc = objArr2;
        this.zzd = i2;
        this.zze = i;
        this.zzf = i3;
    }

    public final boolean contains(@NullableDecl Object obj) {
        Object[] objArr = this.zzc;
        if (obj == null || objArr == null) {
            return false;
        }
        int zzb2 = zzbd.zzb(obj);
        while (true) {
            int i = zzb2 & this.zzd;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            zzb2 = i + 1;
        }
    }

    public final int hashCode() {
        return this.zze;
    }

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return zzi().listIterator(0);
    }

    public final int size() {
        return this.zzf;
    }

    public final zzcg<E> zza() {
        return zzi().listIterator(0);
    }

    public final Object[] zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return 0;
    }

    public final int zzd() {
        return this.zzf;
    }

    public final int zze(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzf);
        return this.zzf;
    }

    public final boolean zzh() {
        return true;
    }

    public final zzbl<E> zzj() {
        return zzbl.zzi(this.zzb, this.zzf);
    }
}
