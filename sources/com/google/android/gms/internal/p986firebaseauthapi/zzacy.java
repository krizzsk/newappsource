package com.google.android.gms.internal.p986firebaseauthapi;

import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacy */
final class zzacy extends zzada {
    private zzacy() {
        super((zzacz) null);
    }

    public /* synthetic */ zzacy(zzacx zzacx) {
        super((zzacz) null);
    }

    public final List zza(Object obj, long j) {
        int i;
        zzacm zzacm = (zzacm) zzaez.zzf(obj, j);
        if (zzacm.zzc()) {
            return zzacm;
        }
        int size = zzacm.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        zzacm zzd = zzacm.zzd(i);
        zzaez.zzs(obj, j, zzd);
        return zzd;
    }

    public final void zzb(Object obj, long j) {
        ((zzacm) zzaez.zzf(obj, j)).zzb();
    }

    public final void zzc(Object obj, Object obj2, long j) {
        zzacm zzacm = (zzacm) zzaez.zzf(obj, j);
        zzacm zzacm2 = (zzacm) zzaez.zzf(obj2, j);
        int size = zzacm.size();
        int size2 = zzacm2.size();
        if (size > 0 && size2 > 0) {
            if (!zzacm.zzc()) {
                zzacm = zzacm.zzd(size2 + size);
            }
            zzacm.addAll(zzacm2);
        }
        if (size > 0) {
            zzacm2 = zzacm;
        }
        zzaez.zzs(obj, j, zzacm2);
    }
}
