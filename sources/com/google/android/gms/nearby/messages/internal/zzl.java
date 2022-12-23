package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.nio.ByteBuffer;
import java.util.UUID;

public final class zzl extends zzc {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzl(java.util.UUID r5, java.lang.Short r6, java.lang.Short r7) {
        /*
            r4 = this;
            r0 = 0
            r1 = 2
            if (r6 != 0) goto L_0x0006
            r2 = 0
            goto L_0x0007
        L_0x0006:
            r2 = 2
        L_0x0007:
            int r2 = r2 + 16
            if (r7 != 0) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r0 = 2
        L_0x000d:
            int r2 = r2 + r0
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r2)
            long r1 = r5.getMostSignificantBits()
            java.nio.ByteBuffer r1 = r0.putLong(r1)
            long r2 = r5.getLeastSignificantBits()
            r1.putLong(r2)
            if (r6 == 0) goto L_0x002a
            short r5 = r6.shortValue()
            r0.putShort(r5)
        L_0x002a:
            if (r7 == 0) goto L_0x0033
            short r5 = r7.shortValue()
            r0.putShort(r5)
        L_0x0033:
            byte[] r5 = r0.array()
            zzh(r5)
            r4.<init>(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.messages.internal.zzl.<init>(java.util.UUID, java.lang.Short, java.lang.Short):void");
    }

    private static byte[] zzh(byte[] bArr) {
        int length = bArr.length;
        boolean z = true;
        if (!(length == 16 || length == 18 || length == 20)) {
            z = false;
        }
        Preconditions.checkArgument(z, "Prefix must be a UUID, a UUID and a major, or a UUID, a major, and a minor.");
        return bArr;
    }

    public final String toString() {
        String obj = zzg().toString();
        Short zze = zze();
        Short zzf = zzf();
        return "IBeaconIdPrefix{proximityUuid=" + obj + ", major=" + zze + ", minor=" + zzf + "}";
    }

    public final Short zze() {
        byte[] zzc = zzc();
        if (zzc.length >= 18) {
            return Short.valueOf(ByteBuffer.wrap(zzc).getShort(16));
        }
        return null;
    }

    public final Short zzf() {
        byte[] zzc = zzc();
        if (zzc.length == 20) {
            return Short.valueOf(ByteBuffer.wrap(zzc).getShort(18));
        }
        return null;
    }

    public final UUID zzg() {
        ByteBuffer wrap = ByteBuffer.wrap(zzc());
        return new UUID(wrap.getLong(), wrap.getLong());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzl(byte[] bArr) {
        super(bArr);
        zzh(bArr);
    }
}
