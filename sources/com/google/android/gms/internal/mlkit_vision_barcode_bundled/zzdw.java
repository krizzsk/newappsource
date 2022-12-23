package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdw;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;

public class zzdw<MessageType extends zzec<MessageType, BuilderType>, BuilderType extends zzdw<MessageType, BuilderType>> extends zzcj<MessageType, BuilderType> {
    public zzec zza;
    public boolean zzb = false;
    private final zzec zzc;

    public zzdw(MessageType messagetype) {
        this.zzc = messagetype;
        this.zza = (zzec) messagetype.zzg(4, (Object) null, (Object) null);
    }

    private static final void zza(zzec zzec, zzec zzec2) {
        zzfu.zza().zzb(zzec.getClass()).zzg(zzec, zzec2);
    }

    public final /* synthetic */ zzfl zzX() {
        return this.zzc;
    }

    public final boolean zzY() {
        return zzec.zzT(this.zza, false);
    }

    public final /* synthetic */ zzcj zzf(zzck zzck) {
        zzi((zzec) zzck);
        return this;
    }

    /* renamed from: zzh */
    public final zzdw zze() {
        zzdw zzdw = (zzdw) this.zzc.zzg(5, (Object) null, (Object) null);
        zzdw.zzi(zzm());
        return zzdw;
    }

    public final zzdw zzi(zzec zzec) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        zza(this.zza, zzec);
        return this;
    }

    /* renamed from: zzj */
    public final MessageType zzl() {
        MessageType zzk = zzm();
        if (zzk.zzY()) {
            return zzk;
        }
        throw new zzgo(zzk);
    }

    /* renamed from: zzk */
    public MessageType zzm() {
        if (this.zzb) {
            return this.zza;
        }
        zzec zzec = this.zza;
        zzfu.zza().zzb(zzec.getClass()).zzf(zzec);
        this.zzb = true;
        return this.zza;
    }

    public void zzo() {
        zzec zzec = (zzec) this.zza.zzg(4, (Object) null, (Object) null);
        zza(zzec, this.zza);
        this.zza = zzec;
    }
}
