package com.google.android.gms.internal.contextmanager;

import com.google.android.gms.internal.contextmanager.zzma;
import com.google.android.gms.internal.contextmanager.zzmb;

public class zzma<MessageType extends zzmb<MessageType, BuilderType>, BuilderType extends zzma<MessageType, BuilderType>> extends zzlz<MessageType, BuilderType> implements zzno {
    public zzma(MessageType messagetype) {
        super(messagetype);
    }

    /* renamed from: zza */
    public final MessageType zzt() {
        if (this.zzb) {
            return (zzmb) this.zza;
        }
        ((zzmb) this.zza).zza.zzg();
        return (zzmb) super.zzt();
    }

    public final void zzv() {
        super.zzv();
        zzmb zzmb = (zzmb) this.zza;
        zzmb.zza = zzmb.zza.clone();
    }
}
