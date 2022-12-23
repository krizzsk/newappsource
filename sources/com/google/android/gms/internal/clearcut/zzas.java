package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzas;
import com.google.android.gms.internal.clearcut.zzat;
import java.io.IOException;
import p001a0.C0017h;

public abstract class zzas<MessageType extends zzas<MessageType, BuilderType>, BuilderType extends zzat<MessageType, BuilderType>> implements zzdo {
    private static boolean zzey = false;
    public int zzex = 0;

    /* access modifiers changed from: package-private */
    public void zzf(int i) {
        throw new UnsupportedOperationException();
    }

    public final zzbb zzr() {
        try {
            zzbg zzk = zzbb.zzk(zzas());
            zzb(zzk.zzae());
            return zzk.zzad();
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder O = C0017h.m58O("ByteString".length() + name.length() + 62, "Serializing ", name, " to a ", "ByteString");
            O.append(" threw an IOException (should never happen).");
            throw new RuntimeException(O.toString(), e);
        }
    }

    /* access modifiers changed from: package-private */
    public int zzs() {
        throw new UnsupportedOperationException();
    }
}
