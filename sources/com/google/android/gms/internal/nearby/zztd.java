package com.google.android.gms.internal.nearby;

import com.appboy.support.ValidationUtils;
import java.io.IOException;

final class zztd extends zztg {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zztd(java.lang.String r2, java.lang.String r3, java.lang.Character r4) {
        /*
            r1 = this;
            com.google.android.gms.internal.nearby.zztb r0 = new com.google.android.gms.internal.nearby.zztb
            char[] r3 = r3.toCharArray()
            r0.<init>(r2, r3)
            r1.<init>(r0, r4)
            char[] r2 = r0.zzf
            int r2 = r2.length
            r3 = 64
            if (r2 != r3) goto L_0x0017
            r2 = 1
            goto L_0x0018
        L_0x0017:
            r2 = 0
        L_0x0018:
            com.google.android.gms.internal.nearby.zzsg.zzd(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nearby.zztd.<init>(java.lang.String, java.lang.String, java.lang.Character):void");
    }

    public final int zza(byte[] bArr, CharSequence charSequence) throws zzte {
        bArr.getClass();
        CharSequence zzf = zzf(charSequence);
        if (this.zzb.zzc(zzf.length())) {
            int i = 0;
            int i2 = 0;
            while (i < zzf.length()) {
                int i3 = i + 1;
                int i4 = i3 + 1;
                int zzb = (this.zzb.zzb(zzf.charAt(i)) << 18) | (this.zzb.zzb(zzf.charAt(i3)) << 12);
                int i5 = i2 + 1;
                bArr[i2] = (byte) (zzb >>> 16);
                if (i4 < zzf.length()) {
                    int i6 = i4 + 1;
                    int zzb2 = zzb | (this.zzb.zzb(zzf.charAt(i4)) << 6);
                    int i7 = i5 + 1;
                    bArr[i5] = (byte) ((zzb2 >>> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                    if (i6 < zzf.length()) {
                        bArr[i7] = (byte) ((zzb2 | this.zzb.zzb(zzf.charAt(i6))) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                        i = i6 + 1;
                        i2 = i7 + 1;
                    } else {
                        i = i6;
                        i2 = i7;
                    }
                } else {
                    i2 = i5;
                    i = i4;
                }
            }
            return i2;
        }
        StringBuilder k = C13555b.m33972k("Invalid input length ");
        k.append(zzf.length());
        throw new zzte(k.toString());
    }

    public final void zzb(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        appendable.getClass();
        int i3 = 0;
        zzsg.zzg(0, i2, bArr.length);
        int i4 = i2;
        while (i4 >= 3) {
            int i5 = i3 + 1;
            int i6 = i5 + 1;
            byte b = ((bArr[i3] & 255) << 16) | ((bArr[i5] & 255) << 8) | (bArr[i6] & 255);
            appendable.append(this.zzb.zza(b >>> 18));
            appendable.append(this.zzb.zza((b >>> 12) & 63));
            appendable.append(this.zzb.zza((b >>> 6) & 63));
            appendable.append(this.zzb.zza(b & 63));
            i4 -= 3;
            i3 = i6 + 1;
        }
        if (i3 < i2) {
            zzg(appendable, bArr, i3, i2 - i3);
        }
    }
}
