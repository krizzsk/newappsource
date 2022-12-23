package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import androidx.recyclerview.widget.RecyclerView;
import com.appboy.support.ValidationUtils;
import java.io.IOException;

final class zzdg extends zzdi {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    public zzdg(byte[] bArr, int i, int i2) {
        super((zzdf) null);
        if (bArr != null) {
            int length = bArr.length;
            if (((length - i2) | i2) >= 0) {
                this.zzb = bArr;
                this.zzd = 0;
                this.zzc = i2;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i2)}));
        }
        throw new NullPointerException("buffer");
    }

    public final int zza() {
        return this.zzc - this.zzd;
    }

    public final void zzb(byte b) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i = this.zzd;
            this.zzd = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzdh(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1}), e);
        }
    }

    public final void zzc(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, i, this.zzb, this.zzd, i2);
            this.zzd += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzdh(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i2)}), e);
        }
    }

    public final void zzd(int i, boolean z) throws IOException {
        zzq(i << 3);
        zzb(z ? (byte) 1 : 0);
    }

    public final void zze(int i, zzdb zzdb) throws IOException {
        zzq((i << 3) | 2);
        zzq(zzdb.zzd());
        zzdb.zzm(this);
    }

    public final void zzf(int i, int i2) throws IOException {
        zzq((i << 3) | 5);
        zzg(i2);
    }

    public final void zzg(int i) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i2 = this.zzd;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (i & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i >> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            this.zzd = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        } catch (IndexOutOfBoundsException e) {
            throw new zzdh(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1}), e);
        }
    }

    public final void zzh(int i, long j) throws IOException {
        zzq((i << 3) | 1);
        zzi(j);
    }

    public final void zzi(long j) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i = this.zzd;
            int i2 = i + 1;
            bArr[i] = (byte) (((int) j) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            int i3 = i2 + 1;
            bArr[i2] = (byte) (((int) (j >> 8)) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            int i4 = i3 + 1;
            bArr[i3] = (byte) (((int) (j >> 16)) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            int i5 = i4 + 1;
            bArr[i4] = (byte) (((int) (j >> 24)) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            int i6 = i5 + 1;
            bArr[i5] = (byte) (((int) (j >> 32)) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            int i7 = i6 + 1;
            bArr[i6] = (byte) (((int) (j >> 40)) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            int i8 = i7 + 1;
            bArr[i7] = (byte) (((int) (j >> 48)) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            this.zzd = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        } catch (IndexOutOfBoundsException e) {
            throw new zzdh(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1}), e);
        }
    }

    public final void zzj(int i, int i2) throws IOException {
        zzq(i << 3);
        zzk(i2);
    }

    public final void zzk(int i) throws IOException {
        if (i >= 0) {
            zzq(i);
        } else {
            zzs((long) i);
        }
    }

    public final void zzl(byte[] bArr, int i, int i2) throws IOException {
        zzc(bArr, 0, i2);
    }

    public final void zzm(int i, String str) throws IOException {
        zzq((i << 3) | 2);
        zzn(str);
    }

    public final void zzn(String str) throws IOException {
        int i = this.zzd;
        try {
            int zzD = zzdi.zzD(str.length() * 3);
            int zzD2 = zzdi.zzD(str.length());
            if (zzD2 == zzD) {
                int i2 = i + zzD2;
                this.zzd = i2;
                int zzd2 = zzhe.zzd(str, this.zzb, i2, this.zzc - i2);
                this.zzd = i;
                zzq((zzd2 - i) - zzD2);
                this.zzd = zzd2;
                return;
            }
            zzq(zzhe.zze(str));
            byte[] bArr = this.zzb;
            int i3 = this.zzd;
            this.zzd = zzhe.zzd(str, bArr, i3, this.zzc - i3);
        } catch (zzhd e) {
            this.zzd = i;
            zzH(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzdh(e2);
        }
    }

    public final void zzo(int i, int i2) throws IOException {
        zzq((i << 3) | i2);
    }

    public final void zzp(int i, int i2) throws IOException {
        zzq(i << 3);
        zzq(i2);
    }

    public final void zzq(int i) throws IOException {
        if (zzdi.zzc) {
            int i2 = zzcn.zza;
        }
        while ((i & -128) != 0) {
            byte[] bArr = this.zzb;
            int i3 = this.zzd;
            this.zzd = i3 + 1;
            bArr[i3] = (byte) ((i & 127) | RecyclerView.C1119a0.FLAG_IGNORE);
            i >>>= 7;
        }
        try {
            byte[] bArr2 = this.zzb;
            int i4 = this.zzd;
            this.zzd = i4 + 1;
            bArr2[i4] = (byte) i;
        } catch (IndexOutOfBoundsException e) {
            throw new zzdh(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1}), e);
        }
    }

    public final void zzr(int i, long j) throws IOException {
        zzq(i << 3);
        zzs(j);
    }

    public final void zzs(long j) throws IOException {
        if (!zzdi.zzc || this.zzc - this.zzd < 10) {
            while ((j & -128) != 0) {
                byte[] bArr = this.zzb;
                int i = this.zzd;
                this.zzd = i + 1;
                bArr[i] = (byte) ((((int) j) & 127) | RecyclerView.C1119a0.FLAG_IGNORE);
                j >>>= 7;
            }
            try {
                byte[] bArr2 = this.zzb;
                int i2 = this.zzd;
                this.zzd = i2 + 1;
                bArr2[i2] = (byte) ((int) j);
            } catch (IndexOutOfBoundsException e) {
                throw new zzdh(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1}), e);
            }
        } else {
            while ((j & -128) != 0) {
                byte[] bArr3 = this.zzb;
                int i3 = this.zzd;
                this.zzd = i3 + 1;
                zzgz.zzn(bArr3, (long) i3, (byte) ((((int) j) & 127) | RecyclerView.C1119a0.FLAG_IGNORE));
                j >>>= 7;
            }
            byte[] bArr4 = this.zzb;
            int i4 = this.zzd;
            this.zzd = i4 + 1;
            zzgz.zzn(bArr4, (long) i4, (byte) ((int) j));
        }
    }
}
