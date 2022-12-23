package com.google.android.gms.internal.p986firebaseauthapi;

import java.util.Iterator;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaet */
final class zzaet implements Iterator, p988j$.util.Iterator {
    public final Iterator zza;
    public final /* synthetic */ zzaeu zzb;

    public zzaet(zzaeu zzaeu) {
        this.zzb = zzaeu;
        this.zza = zzaeu.zza.iterator();
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
