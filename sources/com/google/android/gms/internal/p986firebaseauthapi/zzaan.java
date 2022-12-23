package com.google.android.gms.internal.p986firebaseauthapi;

import com.google.android.gms.internal.p986firebaseauthapi.zzaan;
import com.google.android.gms.internal.p986firebaseauthapi.zzaao;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaan */
public abstract class zzaan<MessageType extends zzaao<MessageType, BuilderType>, BuilderType extends zzaan<MessageType, BuilderType>> implements zzadl {
    /* renamed from: zzf */
    public abstract zzaan clone();

    public abstract zzaan zzg(zzaao zzaao);

    public final /* bridge */ /* synthetic */ zzadl zzh(zzadm zzadm) {
        if (zzH().getClass().isInstance(zzadm)) {
            return zzg((zzaao) zzadm);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
