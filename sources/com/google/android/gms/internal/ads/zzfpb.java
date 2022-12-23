package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;

final class zzfpb implements Iterable {
    public final /* synthetic */ CharSequence zza;
    public final /* synthetic */ zzfpe zzb;

    public zzfpb(zzfpe zzfpe, CharSequence charSequence) {
        this.zzb = zzfpe;
        this.zza = charSequence;
    }

    public final Iterator iterator() {
        return this.zzb.zzg(this.zza);
    }

    public final String toString() {
        StringBuilder q = C25541a.m63886q('[');
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                q.append(zzfoj.zza(it.next(), ", "));
                while (it.hasNext()) {
                    q.append(", ");
                    q.append(zzfoj.zza(it.next(), ", "));
                }
            }
            q.append(']');
            return q.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
