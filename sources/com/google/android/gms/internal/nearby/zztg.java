package com.google.android.gms.internal.nearby;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;

class zztg extends zzth {
    public final zztb zzb;
    public final Character zzc;

    public zztg(zztb zztb, Character ch) {
        this.zzb = zztb;
        boolean z = true;
        if (ch != null && zztb.zzd(ch.charValue())) {
            z = false;
        }
        zzsg.zzf(z, "Padding character %s was already in alphabet", ch);
        this.zzc = ch;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zztg) {
            zztg zztg = (zztg) obj;
            if (!this.zzb.equals(zztg.zzb) || !zzsb.zza(this.zzc, zztg.zzc)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() ^ Arrays.hashCode(new Object[]{this.zzc});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.zzb.toString());
        if (8 % this.zzb.zzb != 0) {
            if (this.zzc == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.zzc);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public int zza(byte[] bArr, CharSequence charSequence) throws zzte {
        zztb zztb;
        bArr.getClass();
        CharSequence zzf = zzf(charSequence);
        if (this.zzb.zzc(zzf.length())) {
            int i = 0;
            int i2 = 0;
            while (i < zzf.length()) {
                long j = 0;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    zztb = this.zzb;
                    if (i3 >= zztb.zzc) {
                        break;
                    }
                    j <<= zztb.zzb;
                    if (i + i3 < zzf.length()) {
                        j |= (long) this.zzb.zzb(zzf.charAt(i4 + i));
                        i4++;
                    }
                    i3++;
                }
                int i5 = zztb.zzd;
                int i6 = (i5 * 8) - (i4 * zztb.zzb);
                int i7 = (i5 - 1) * 8;
                while (i7 >= i6) {
                    bArr[i2] = (byte) ((int) ((j >>> i7) & 255));
                    i7 -= 8;
                    i2++;
                }
                i += this.zzb.zzc;
            }
            return i2;
        }
        StringBuilder k = C13555b.m33972k("Invalid input length ");
        k.append(zzf.length());
        throw new zzte(k.toString());
    }

    public void zzb(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        appendable.getClass();
        int i3 = 0;
        zzsg.zzg(0, i2, bArr.length);
        while (i3 < i2) {
            zzg(appendable, bArr, i3, Math.min(this.zzb.zzd, i2 - i3));
            i3 += this.zzb.zzd;
        }
    }

    public final int zzc(int i) {
        return (int) (((((long) this.zzb.zzb) * ((long) i)) + 7) / 8);
    }

    public final int zzd(int i) {
        zztb zztb = this.zzb;
        return zztj.zza(i, zztb.zzd, RoundingMode.CEILING) * zztb.zzc;
    }

    public final zzth zze(String str, int i) {
        boolean z = false;
        for (int i2 = 0; i2 <= 0; i2++) {
            zzsg.zzf(true ^ this.zzb.zzd(":".charAt(i2)), "Separator (%s) cannot contain alphabet characters", ":");
        }
        Character ch = this.zzc;
        if (ch != null) {
            if (":".indexOf(ch.charValue()) < 0) {
                z = true;
            }
            zzsg.zzf(z, "Separator (%s) cannot contain padding character", ":");
        }
        return new zztf(this, ":", 2);
    }

    public final CharSequence zzf(CharSequence charSequence) {
        charSequence.getClass();
        Character ch = this.zzc;
        if (ch == null) {
            return charSequence;
        }
        char charValue = ch.charValue();
        int length = charSequence.length();
        do {
            length--;
            if (length < 0 || charSequence.charAt(length) != charValue) {
            }
            length--;
            break;
        } while (charSequence.charAt(length) != charValue);
        return charSequence.subSequence(0, length + 1);
    }

    public final void zzg(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        boolean z;
        zzsg.zzg(i, i + i2, bArr.length);
        int i3 = 0;
        if (i2 <= this.zzb.zzd) {
            z = true;
        } else {
            z = false;
        }
        zzsg.zzd(z);
        long j = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            j = (j | ((long) (bArr[i + i4] & 255))) << 8;
        }
        int i5 = ((i2 + 1) * 8) - this.zzb.zzb;
        while (i3 < i2 * 8) {
            zztb zztb = this.zzb;
            appendable.append(zztb.zza(((int) (j >>> (i5 - i3))) & zztb.zza));
            i3 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i3 < this.zzb.zzd * 8) {
                appendable.append(this.zzc.charValue());
                i3 += this.zzb.zzb;
            }
        }
    }

    public zztg(String str, String str2, Character ch) {
        this(new zztb(str, str2.toCharArray()), ch);
    }
}
