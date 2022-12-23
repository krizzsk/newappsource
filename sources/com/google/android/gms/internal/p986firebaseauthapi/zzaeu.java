package com.google.android.gms.internal.p986firebaseauthapi;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaeu */
public final class zzaeu extends AbstractList implements RandomAccess, zzacu {
    /* access modifiers changed from: private */
    public final zzacu zza;

    public zzaeu(zzacu zzacu) {
        this.zza = zzacu;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((zzact) this.zza).get(i);
    }

    public final Iterator iterator() {
        return new zzaet(this);
    }

    public final ListIterator listIterator(int i) {
        return new zzaes(this, i);
    }

    public final int size() {
        return this.zza.size();
    }

    public final zzacu zze() {
        return this;
    }

    public final Object zzf(int i) {
        return this.zza.zzf(i);
    }

    public final List zzh() {
        return this.zza.zzh();
    }

    public final void zzi(zzabe zzabe) {
        throw new UnsupportedOperationException();
    }
}
