package com.google.android.gms.internal.common;

import java.io.IOException;
import java.util.Iterator;

final class zzv implements Iterable {
    public final /* synthetic */ CharSequence zza;
    public final /* synthetic */ zzx zzb;

    public zzv(zzx zzx, CharSequence charSequence) {
        this.zzb = zzx;
        this.zza = charSequence;
    }

    public final Iterator iterator() {
        return this.zzb.zzh(this.zza);
    }

    public final String toString() {
        StringBuilder q = C25541a.m63886q('[');
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                q.append(zzq.zza(it.next(), ", "));
                while (it.hasNext()) {
                    q.append(", ");
                    q.append(zzq.zza(it.next(), ", "));
                }
            }
            q.append(']');
            return q.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
