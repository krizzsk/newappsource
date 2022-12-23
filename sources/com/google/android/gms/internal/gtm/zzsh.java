package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzsg;
import com.google.android.gms.internal.gtm.zzsh;
import java.io.IOException;

public abstract class zzsh<MessageType extends zzsh<MessageType, BuilderType>, BuilderType extends zzsg<MessageType, BuilderType>> implements zzwk {
    public int zzb = 0;

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Collection, java.lang.Object, java.lang.Iterable<T>, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> void zzS(java.lang.Iterable<T> r3, java.util.List<? super T> r4) {
        /*
            com.google.android.gms.internal.gtm.zzvi.zze(r3)
            boolean r0 = r4 instanceof java.util.ArrayList
            if (r0 == 0) goto L_0x0016
            r0 = r4
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r4.size()
            int r2 = r3.size()
            int r2 = r2 + r1
            r0.ensureCapacity(r2)
        L_0x0016:
            int r0 = r4.size()
            java.util.Iterator r3 = r3.iterator()
        L_0x001e:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0059
            java.lang.Object r1 = r3.next()
            if (r1 != 0) goto L_0x0055
            int r3 = r4.size()
            r1 = 37
            java.lang.String r2 = "Element at index "
            java.lang.StringBuilder r1 = p001a0.C0016g.m34r(r1, r2)
            int r3 = r3 - r0
            r1.append(r3)
            java.lang.String r3 = " is null."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            int r1 = r4.size()
        L_0x0047:
            int r1 = r1 + -1
            if (r1 < r0) goto L_0x004f
            r4.remove(r1)
            goto L_0x0047
        L_0x004f:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            r4.<init>(r3)
            throw r4
        L_0x0055:
            r4.add(r1)
            goto L_0x001e
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzsh.zzS(java.lang.Iterable, java.util.List):void");
    }

    public int zzQ() {
        throw null;
    }

    public final zztd zzR() {
        try {
            int zzX = zzX();
            zztd zztd = zztd.zzb;
            byte[] bArr = new byte[zzX];
            zzto zzF = zzto.zzF(bArr);
            zzaq(zzF);
            zzF.zzG();
            return new zzta(bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException(C13715c.m34245k(new StringBuilder(name.length() + 72), "Serializing ", name, " to a ByteString threw an IOException (should never happen)."), e);
        }
    }

    public void zzT(int i) {
        throw null;
    }
}
