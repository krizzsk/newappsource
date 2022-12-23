package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgio;
import com.google.android.gms.internal.ads.zzgip;

public abstract class zzgio<MessageType extends zzgip<MessageType, BuilderType>, BuilderType extends zzgio<MessageType, BuilderType>> implements zzglx {
    /* renamed from: zzad */
    public abstract zzgio clone();

    public abstract zzgio zzae(zzgip zzgip);

    public final /* bridge */ /* synthetic */ zzglx zzaf(zzgly zzgly) {
        if (zzbh().getClass().isInstance(zzgly)) {
            return zzae((zzgip) zzgly);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
