package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcj;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzck;

public abstract class zzcj<MessageType extends zzck<MessageType, BuilderType>, BuilderType extends zzcj<MessageType, BuilderType>> implements zzfk {
    /* renamed from: zze */
    public abstract zzcj clone();

    public abstract zzcj zzf(zzck zzck);

    public final /* bridge */ /* synthetic */ zzfk zzg(zzfl zzfl) {
        if (zzX().getClass().isInstance(zzfl)) {
            return zzf((zzck) zzfl);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
