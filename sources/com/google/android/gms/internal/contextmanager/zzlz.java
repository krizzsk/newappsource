package com.google.android.gms.internal.contextmanager;

import com.google.android.gms.internal.contextmanager.zzlz;
import com.google.android.gms.internal.contextmanager.zzmf;

public class zzlz<MessageType extends zzmf<MessageType, BuilderType>, BuilderType extends zzlz<MessageType, BuilderType>> extends zzkl<MessageType, BuilderType> {
    public MessageType zza;
    public boolean zzb = false;
    private final MessageType zzc;

    public zzlz(MessageType messagetype) {
        this.zzc = messagetype;
        this.zza = (zzmf) messagetype.zzf(4, (Object) null, (Object) null);
    }

    private static final void zza(MessageType messagetype, MessageType messagetype2) {
        zznw.zza().zzb(messagetype.getClass()).zzg(messagetype, messagetype2);
    }

    public final /* bridge */ /* synthetic */ zzkl zzm(zzkm zzkm) {
        zzp((zzmf) zzkm);
        return this;
    }

    /* renamed from: zzo */
    public final BuilderType zzl() {
        BuilderType buildertype = (zzlz) this.zzc.zzf(5, (Object) null, (Object) null);
        buildertype.zzp(zzt());
        return buildertype;
    }

    public final BuilderType zzp(MessageType messagetype) {
        if (this.zzb) {
            zzv();
            this.zzb = false;
        }
        zza(this.zza, messagetype);
        return this;
    }

    /* renamed from: zzq */
    public final MessageType zzs() {
        MessageType zzr = zzt();
        if (zzr.zzw()) {
            return zzr;
        }
        throw new zzom(zzr);
    }

    /* renamed from: zzr */
    public MessageType zzt() {
        if (this.zzb) {
            return this.zza;
        }
        MessageType messagetype = this.zza;
        zznw.zza().zzb(messagetype.getClass()).zzf(messagetype);
        this.zzb = true;
        return this.zza;
    }

    public final /* bridge */ /* synthetic */ zznn zzu() {
        return this.zzc;
    }

    public void zzv() {
        MessageType messagetype = (zzmf) this.zza.zzf(4, (Object) null, (Object) null);
        zza(messagetype, this.zza);
        this.zza = messagetype;
    }

    public final boolean zzw() {
        throw null;
    }
}
