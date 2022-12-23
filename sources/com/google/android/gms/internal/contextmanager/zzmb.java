package com.google.android.gms.internal.contextmanager;

import com.google.android.gms.internal.contextmanager.zzma;
import com.google.android.gms.internal.contextmanager.zzmb;

public abstract class zzmb<MessageType extends zzmb<MessageType, BuilderType>, BuilderType extends zzma<MessageType, BuilderType>> extends zzmf<MessageType, BuilderType> implements zzno {
    public zzlu<zzmc> zza = zzlu.zzd();

    public final zzlu<zzmc> zzc() {
        if (this.zza.zzj()) {
            this.zza = this.zza.clone();
        }
        return this.zza;
    }
}
