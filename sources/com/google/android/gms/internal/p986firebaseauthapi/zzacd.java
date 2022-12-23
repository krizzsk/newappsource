package com.google.android.gms.internal.p986firebaseauthapi;

import com.google.android.gms.internal.p986firebaseauthapi.zzacd;
import com.google.android.gms.internal.p986firebaseauthapi.zzach;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacd */
public class zzacd<MessageType extends zzach<MessageType, BuilderType>, BuilderType extends zzacd<MessageType, BuilderType>> extends zzaan<MessageType, BuilderType> {
    public zzach zza;
    public boolean zzb = false;
    private final zzach zzc;

    public zzacd(MessageType messagetype) {
        this.zzc = messagetype;
        this.zza = (zzach) messagetype.zzj(4, (Object) null, (Object) null);
    }

    private static final void zza(zzach zzach, zzach zzach2) {
        zzadu.zza().zzb(zzach.getClass()).zzg(zzach, zzach2);
    }

    public final /* synthetic */ zzadm zzH() {
        return this.zzc;
    }

    public final /* synthetic */ zzaan zzg(zzaao zzaao) {
        zzj((zzach) zzaao);
        return this;
    }

    /* renamed from: zzi */
    public final zzacd zzf() {
        zzacd zzacd = (zzacd) this.zzc.zzj(5, (Object) null, (Object) null);
        zzacd.zzj(zzm());
        return zzacd;
    }

    public final zzacd zzj(zzach zzach) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        zza(this.zza, zzach);
        return this;
    }

    public final MessageType zzk() {
        MessageType zzl = zzm();
        if (zzl.zzG()) {
            return zzl;
        }
        throw new zzaeo(zzl);
    }

    /* renamed from: zzl */
    public MessageType zzm() {
        if (this.zzb) {
            return this.zza;
        }
        zzach zzach = this.zza;
        zzadu.zza().zzb(zzach.getClass()).zzf(zzach);
        this.zzb = true;
        return this.zza;
    }

    public void zzo() {
        zzach zzach = (zzach) this.zza.zzj(4, (Object) null, (Object) null);
        zza(zzach, this.zza);
        this.zza = zzach;
    }
}
