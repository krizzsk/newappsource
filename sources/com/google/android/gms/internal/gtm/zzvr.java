package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class zzvr extends zzsj<String> implements RandomAccess, zzvs {
    public static final zzvs zza;
    private static final zzvr zzb;
    private final List<Object> zzc;

    static {
        zzvr zzvr = new zzvr(10);
        zzb = zzvr;
        zzvr.zzb();
        zza = zzvr;
    }

    public zzvr() {
        this(10);
    }

    private static String zzj(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zztd) {
            return ((zztd) obj).zzr(zzvi.zza);
        }
        return zzvi.zzh((byte[]) obj);
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        zza();
        this.zzc.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        zza();
        if (collection instanceof zzvs) {
            collection = ((zzvs) collection).zzh();
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
        return zzj(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        zza();
        return zzj(this.zzc.set(i, (String) obj));
    }

    public final int size() {
        return this.zzc.size();
    }

    public final /* bridge */ /* synthetic */ zzvh zzd(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.zzc);
            return new zzvr((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final zzvs zze() {
        return zzc() ? new zzxt(this) : this;
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
        if (obj instanceof zztd) {
            zztd zztd = (zztd) obj;
            String zzr = zztd.zzr(zzvi.zza);
            if (zztd.zzj()) {
                this.zzc.set(i, zzr);
            }
            return zzr;
        }
        byte[] bArr = (byte[]) obj;
        String zzh = zzvi.zzh(bArr);
        if (zzvi.zzj(bArr)) {
            this.zzc.set(i, zzh);
        }
        return zzh;
    }

    public final List<?> zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    public final void zzi(zztd zztd) {
        zza();
        this.zzc.add(zztd);
        this.modCount++;
    }

    public zzvr(int i) {
        this.zzc = new ArrayList(i);
    }

    private zzvr(ArrayList<Object> arrayList) {
        this.zzc = arrayList;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }
}
