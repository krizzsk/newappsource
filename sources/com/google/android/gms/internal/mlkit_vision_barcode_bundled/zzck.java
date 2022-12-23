package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcj;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzck;
import java.io.IOException;

public abstract class zzck<MessageType extends zzck<MessageType, BuilderType>, BuilderType extends zzcj<MessageType, BuilderType>> implements zzfl {
    public int zzb = 0;

    /* access modifiers changed from: package-private */
    public int zzB() {
        throw null;
    }

    public final zzdb zzC() {
        try {
            int zzE = zzE();
            zzdb zzdb = zzdb.zzb;
            byte[] bArr = new byte[zzE];
            zzdi zzF = zzdi.zzF(bArr);
            zzW(zzF);
            zzF.zzG();
            return new zzcz(bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException(C13715c.m34245k(new StringBuilder(name.length() + 72), "Serializing ", name, " to a ByteString threw an IOException (should never happen)."), e);
        }
    }

    /* access modifiers changed from: package-private */
    public void zzD(int i) {
        throw null;
    }
}
