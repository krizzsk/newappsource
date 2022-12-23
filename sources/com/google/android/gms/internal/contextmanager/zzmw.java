package com.google.android.gms.internal.contextmanager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class zzmw extends zzko<String> implements RandomAccess, zzmx {
    public static final zzmx zza;
    private static final zzmw zzb;
    private final List<Object> zzc;

    static {
        zzmw zzmw = new zzmw(10);
        zzb = zzmw;
        zzmw.zzb();
        zza = zzmw;
    }

    public zzmw() {
        this(10);
    }

    private static String zzi(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzld) {
            return ((zzld) obj).zzp(zzmn.zza);
        }
        return zzmn.zzh((byte[]) obj);
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        zza();
        this.zzc.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        zza();
        if (collection instanceof zzmx) {
            collection = ((zzmx) collection).zzh();
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

    public final /* bridge */ /* synthetic */ zzmm zzd(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.zzc);
            return new zzmw((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final zzmx zze() {
        return zzc() ? new zzos(this) : this;
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
        if (obj instanceof zzld) {
            zzld zzld = (zzld) obj;
            String zzp = zzld.zzp(zzmn.zza);
            if (zzld.zzj()) {
                this.zzc.set(i, zzp);
            }
            return zzp;
        }
        byte[] bArr = (byte[]) obj;
        String zzh = zzmn.zzh(bArr);
        if (zzmn.zzj(bArr)) {
            this.zzc.set(i, zzh);
        }
        return zzh;
    }

    public final List<?> zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    public zzmw(int i) {
        this.zzc = new ArrayList(i);
    }

    private zzmw(ArrayList<Object> arrayList) {
        this.zzc = arrayList;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }
}
