package com.google.android.gms.internal.p986firebaseauthapi;

import com.google.android.gms.internal.p986firebaseauthapi.zzaan;
import com.google.android.gms.internal.p986firebaseauthapi.zzaao;
import java.io.IOException;
import java.io.OutputStream;
import p358af.C13437d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaao */
public abstract class zzaao<MessageType extends zzaao<MessageType, BuilderType>, BuilderType extends zzaan<MessageType, BuilderType>> implements zzadm {
    public int zza = 0;

    public int zzn() {
        throw null;
    }

    public final zzabe zzo() {
        try {
            int zzs = zzs();
            zzabe zzabe = zzabe.zzb;
            byte[] bArr = new byte[zzs];
            zzabp zzG = zzabp.zzG(bArr);
            zzF(zzG);
            zzG.zzI();
            return new zzabb(bArr);
        } catch (IOException e) {
            throw new RuntimeException(C13437d.m33706k("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e);
        }
    }

    /* access modifiers changed from: package-private */
    public void zzp(int i) {
        throw null;
    }

    public final void zzq(OutputStream outputStream) throws IOException {
        zzabp zzH = zzabp.zzH(outputStream, zzabp.zzB(zzs()));
        zzF(zzH);
        zzH.zzN();
    }

    public final byte[] zzr() {
        try {
            byte[] bArr = new byte[zzs()];
            zzabp zzG = zzabp.zzG(bArr);
            zzF(zzG);
            zzG.zzI();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(C13437d.m33706k("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
        }
    }
}
