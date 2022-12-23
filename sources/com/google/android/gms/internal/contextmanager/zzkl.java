package com.google.android.gms.internal.contextmanager;

import com.google.android.gms.internal.contextmanager.zzkl;
import com.google.android.gms.internal.contextmanager.zzkm;

public abstract class zzkl<MessageType extends zzkm<MessageType, BuilderType>, BuilderType extends zzkl<MessageType, BuilderType>> implements zznm {
    /* renamed from: zzl */
    public abstract BuilderType clone();

    public abstract BuilderType zzm(MessageType messagetype);

    public final /* bridge */ /* synthetic */ zznm zzn(zznn zznn) {
        if (zzu().getClass().isInstance(zznn)) {
            return zzm((zzkm) zznn);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
