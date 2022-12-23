package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;
import p358af.C13437d;

final class zzfov implements Serializable, zzfot {
    private final List zza;

    public /* synthetic */ zzfov(List list, zzfou zzfou) {
        this.zza = list;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfov) {
            return this.zza.equals(((zzfov) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 306654252;
    }

    public final String toString() {
        List list = this.zza;
        StringBuilder n = C13437d.m33708n("Predicates.", "and(");
        boolean z = true;
        for (Object next : list) {
            if (!z) {
                n.append(',');
            }
            n.append(next);
            z = false;
        }
        n.append(')');
        return n.toString();
    }

    public final boolean zza(Object obj) {
        for (int i = 0; i < this.zza.size(); i++) {
            if (!((zzfot) this.zza.get(i)).zza(obj)) {
                return false;
            }
        }
        return true;
    }
}
