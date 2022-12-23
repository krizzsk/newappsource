package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class zzeu extends zzcm implements RandomAccess, zzev {
    public static final zzev zza;
    private static final zzeu zzb;
    private final List zzc;

    static {
        zzeu zzeu = new zzeu(10);
        zzb = zzeu;
        zzeu.zzb();
        zza = zzeu;
    }

    public zzeu() {
        this(10);
    }

    private static String zzi(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzdb) {
            return ((zzdb) obj).zzu(zzel.zzb);
        }
        return zzel.zzh((byte[]) obj);
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        zza();
        this.zzc.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection collection) {
        zza();
        if (collection instanceof zzev) {
            collection = ((zzev) collection).zzh();
        }
        boolean addAll = this.zzc.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        zza();
        this.zzc.clear();
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
        Object remove = this.zzc.remove(i);
        this.modCount++;
        return zzi(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        zza();
        return zzi(this.zzc.set(i, (String) obj));
    }

    public final int size() {
        return this.zzc.size();
    }

    public final /* bridge */ /* synthetic */ zzek zzd(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.zzc);
            return new zzeu(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final zzev zze() {
        return zzc() ? new zzgu(this) : this;
    }

    public final Object zzf(int i) {
        return this.zzc.get(i);
    }

    /* renamed from: zzg */
    public final String get(int i) {
        Object obj = this.zzc.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzdb) {
            zzdb zzdb = (zzdb) obj;
            String zzu = zzdb.zzu(zzel.zzb);
            if (zzdb.zzn()) {
                this.zzc.set(i, zzu);
            }
            return zzu;
        }
        byte[] bArr = (byte[]) obj;
        String zzh = zzel.zzh(bArr);
        if (zzel.zzj(bArr)) {
            this.zzc.set(i, zzh);
        }
        return zzh;
    }

    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    public zzeu(int i) {
        this.zzc = new ArrayList(i);
    }

    private zzeu(ArrayList arrayList) {
        this.zzc = arrayList;
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
