package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

final class zzfqa extends zzfpy implements ListIterator {
    public final /* synthetic */ zzfqb zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzfqa(zzfqb zzfqb) {
        super(zzfqb);
        this.zzd = zzfqb;
    }

    public final void add(Object obj) {
        boolean isEmpty = this.zzd.isEmpty();
        zza();
        ((ListIterator) this.zza).add(obj);
        zzfqc.zzd(this.zzd.zzf);
        if (isEmpty) {
            this.zzd.zza();
        }
    }

    public final boolean hasPrevious() {
        zza();
        return ((ListIterator) this.zza).hasPrevious();
    }

    public final int nextIndex() {
        zza();
        return ((ListIterator) this.zza).nextIndex();
    }

    public final Object previous() {
        zza();
        return ((ListIterator) this.zza).previous();
    }

    public final int previousIndex() {
        zza();
        return ((ListIterator) this.zza).previousIndex();
    }

    public final void set(Object obj) {
        zza();
        ((ListIterator) this.zza).set(obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzfqa(zzfqb zzfqb, int i) {
        super(zzfqb, ((List) zzfqb.zzb).listIterator(i));
        this.zzd = zzfqb;
    }
}
