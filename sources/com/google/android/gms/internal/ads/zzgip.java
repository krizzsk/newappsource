package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgio;
import com.google.android.gms.internal.ads.zzgip;
import java.io.IOException;
import java.io.OutputStream;
import p358af.C13437d;

public abstract class zzgip<MessageType extends zzgip<MessageType, BuilderType>, BuilderType extends zzgio<MessageType, BuilderType>> implements zzgly {
    public int zza = 0;

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Collection, java.lang.Object, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void zzar(java.lang.Iterable r3, java.util.List r4) {
        /*
            com.google.android.gms.internal.ads.zzgky.zze(r3)
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
            if (r1 == 0) goto L_0x0057
            java.lang.Object r1 = r3.next()
            if (r1 != 0) goto L_0x0053
            int r3 = r4.size()
            java.lang.String r1 = "Element at index "
            java.lang.StringBuilder r1 = p379.C13555b.m33972k(r1)
            int r3 = r3 - r0
            r1.append(r3)
            java.lang.String r3 = " is null."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            int r1 = r4.size()
        L_0x0045:
            int r1 = r1 + -1
            if (r1 < r0) goto L_0x004d
            r4.remove(r1)
            goto L_0x0045
        L_0x004d:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            r4.<init>(r3)
            throw r4
        L_0x0053:
            r4.add(r1)
            goto L_0x001e
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgip.zzar(java.lang.Iterable, java.util.List):void");
    }

    public int zzap() {
        throw null;
    }

    public final zzgjg zzaq() {
        try {
            int zzav = zzav();
            zzgjg zzgjg = zzgjg.zzb;
            byte[] bArr = new byte[zzav];
            zzgjv zzG = zzgjv.zzG(bArr);
            zzaO(zzG);
            zzG.zzI();
            return new zzgjc(bArr);
        } catch (IOException e) {
            throw new RuntimeException(C13437d.m33706k("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e);
        }
    }

    public void zzas(int i) {
        throw null;
    }

    public final void zzat(OutputStream outputStream) throws IOException {
        zzgjv zzH = zzgjv.zzH(outputStream, zzgjv.zzB(zzav()));
        zzaO(zzH);
        zzH.zzN();
    }

    public final byte[] zzau() {
        try {
            byte[] bArr = new byte[zzav()];
            zzgjv zzG = zzgjv.zzG(bArr);
            zzaO(zzG);
            zzG.zzI();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(C13437d.m33706k("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
        }
    }
}
