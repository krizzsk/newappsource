package com.google.android.gms.internal.places;

import com.google.android.gms.internal.places.zzm;
import com.google.android.gms.internal.places.zzo;
import java.io.IOException;
import p001a0.C0017h;

public abstract class zzm<MessageType extends zzm<MessageType, BuilderType>, BuilderType extends zzo<MessageType, BuilderType>> implements zzck {
    private static boolean zzdu = false;
    public int zzdt = 0;

    /* access modifiers changed from: package-private */
    public void zze(int i) {
        throw new UnsupportedOperationException();
    }

    public final zzw zzv() {
        try {
            zzae zzk = zzw.zzk(zzbh());
            zzc(zzk.zzai());
            return zzk.zzah();
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder O = C0017h.m58O("ByteString".length() + name.length() + 62, "Serializing ", name, " to a ", "ByteString");
            O.append(" threw an IOException (should never happen).");
            throw new RuntimeException(O.toString(), e);
        }
    }

    /* access modifiers changed from: package-private */
    public int zzw() {
        throw new UnsupportedOperationException();
    }
}
