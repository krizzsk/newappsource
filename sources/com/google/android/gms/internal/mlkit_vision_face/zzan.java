package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

class zzan extends zzal implements List {
    public final /* synthetic */ zzao zzf;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzan(@NullableDecl zzao zzao, Object obj, @NullableDecl List list, zzal zzal) {
        super(zzao, obj, list, zzal);
        this.zzf = zzao;
    }

    public final void add(int i, Object obj) {
        zza();
        boolean isEmpty = this.zzb.isEmpty();
        ((List) this.zzb).add(i, obj);
        zzao.zzl(this.zzf);
        if (isEmpty) {
            zzc();
        }
    }

    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.zzb).addAll(i, collection);
        if (!addAll) {
            return addAll;
        }
        zzao.zzm(this.zzf, this.zzb.size() - size);
        if (size != 0) {
            return addAll;
        }
        zzc();
        return true;
    }

    public final Object get(int i) {
        zza();
        return ((List) this.zzb).get(i);
    }

    public final int indexOf(Object obj) {
        zza();
        return ((List) this.zzb).indexOf(obj);
    }

    public final int lastIndexOf(Object obj) {
        zza();
        return ((List) this.zzb).lastIndexOf(obj);
    }

    public final ListIterator listIterator() {
        zza();
        return new zzam(this);
    }

    public final Object remove(int i) {
        zza();
        Object remove = ((List) this.zzb).remove(i);
        zzao.zzk(this.zzf);
        zzb();
        return remove;
    }

    public final Object set(int i, Object obj) {
        zza();
        return ((List) this.zzb).set(i, obj);
    }

    public final List subList(int i, int i2) {
        zza();
        zzao zzao = this.zzf;
        Object obj = this.zza;
        List subList = ((List) this.zzb).subList(i, i2);
        zzal zzal = this.zzc;
        if (zzal == null) {
            zzal = this;
        }
        return zzao.zzg(obj, subList, zzal);
    }

    public final ListIterator listIterator(int i) {
        zza();
        return new zzam(this, i);
    }
}
