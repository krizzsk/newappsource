package com.google.android.gms.internal.p986firebaseauthapi;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzne */
public final class zzne extends zzacd implements zzadn {
    private zzne() {
        super(zznh.zzb);
    }

    public final int zza() {
        return ((zznh) this.zza).zza();
    }

    public final zzne zzb(zzng zzng) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        zznh.zzi((zznh) this.zza, zzng);
        return this;
    }

    public final zzne zzc(int i) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zznh) this.zza).zze = i;
        return this;
    }

    public final zzng zzd(int i) {
        return ((zznh) this.zza).zzd(i);
    }

    public final List zze() {
        return Collections.unmodifiableList(((zznh) this.zza).zzg());
    }

    public /* synthetic */ zzne(zznd zznd) {
        super(zznh.zzb);
    }
}
