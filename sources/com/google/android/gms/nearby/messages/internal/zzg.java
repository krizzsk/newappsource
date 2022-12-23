package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.internal.Preconditions;
import p358af.C13437d;

public final class zzg extends zzc {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzg(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = this;
            byte[] r8 = com.google.android.gms.nearby.messages.internal.zzc.zzd(r8)
            byte[] r9 = com.google.android.gms.nearby.messages.internal.zzc.zzd(r9)
            r0 = 2
            byte[][] r0 = new byte[r0][]
            int r1 = r8.length
            r2 = 1
            r3 = 0
            r4 = 10
            if (r1 != r4) goto L_0x0014
            r4 = 1
            goto L_0x0015
        L_0x0014:
            r4 = 0
        L_0x0015:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Namespace length("
            r5.append(r6)
            r5.append(r1)
            java.lang.String r1 = " bytes) must be 10 bytes."
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            com.google.android.gms.common.internal.Preconditions.checkArgument(r4, r1)
            r0[r3] = r8
            int r8 = r9.length
            r1 = 6
            if (r8 != r1) goto L_0x0035
            r3 = 1
        L_0x0035:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "Instance length("
            r1.append(r4)
            r1.append(r8)
            java.lang.String r8 = " bytes) must be 6 bytes."
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            com.google.android.gms.common.internal.Preconditions.checkArgument(r3, r8)
            r0[r2] = r9
            byte[] r8 = com.google.android.gms.common.util.ArrayUtils.concatByteArrays(r0)
            zze(r8)
            r7.<init>(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.messages.internal.zzg.<init>(java.lang.String, java.lang.String):void");
    }

    private static byte[] zze(byte[] bArr) {
        int length = bArr.length;
        boolean z = true;
        if (!(length == 10 || length == 16)) {
            z = false;
        }
        Preconditions.checkArgument(z, "Bytes must be a namespace (10 bytes), or a namespace plus instance (16 bytes).");
        return bArr;
    }

    public final String toString() {
        return C13437d.m33706k("EddystoneUidPrefix{bytes=", zza(), "}");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzg(byte[] bArr) {
        super(bArr);
        zze(bArr);
    }
}
