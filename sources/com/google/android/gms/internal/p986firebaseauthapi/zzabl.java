package com.google.android.gms.internal.p986firebaseauthapi;

import androidx.recyclerview.widget.RecyclerView;
import com.appboy.support.ValidationUtils;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabl */
final class zzabl extends zzabp {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    public zzabl(byte[] bArr, int i, int i2) {
        super((zzabo) null);
        if (bArr != null) {
            int length = bArr.length;
            if (((length - i2) | i2) >= 0) {
                this.zza = bArr;
                this.zzc = 0;
                this.zzb = i2;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i2)}));
        }
        throw new NullPointerException("buffer");
    }

    public final void zzN() {
    }

    public final void zzO(byte b) throws IOException {
        try {
            byte[] bArr = this.zza;
            int i = this.zzc;
            this.zzc = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzabm(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1}), e);
        }
    }

    public final void zzP(int i, boolean z) throws IOException {
        zzs(i << 3);
        zzO(z ? (byte) 1 : 0);
    }

    public final void zzQ(int i, zzabe zzabe) throws IOException {
        zzs((i << 3) | 2);
        zzs(zzabe.zzd());
        zzabe.zzj(this);
    }

    public final void zza(byte[] bArr, int i, int i2) throws IOException {
        zze(bArr, 0, i2);
    }

    public final int zzb() {
        return this.zzb - this.zzc;
    }

    public final void zze(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.zza, this.zzc, i2);
            this.zzc += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzabm(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), Integer.valueOf(i2)}), e);
        }
    }

    public final void zzh(int i, int i2) throws IOException {
        zzs((i << 3) | 5);
        zzi(i2);
    }

    public final void zzi(int i) throws IOException {
        try {
            byte[] bArr = this.zza;
            int i2 = this.zzc;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (i & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i >> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            this.zzc = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        } catch (IndexOutOfBoundsException e) {
            throw new zzabm(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1}), e);
        }
    }

    public final void zzj(int i, long j) throws IOException {
        zzs((i << 3) | 1);
        zzk(j);
    }

    public final void zzk(long j) throws IOException {
        try {
            byte[] bArr = this.zza;
            int i = this.zzc;
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
            this.zzc = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        } catch (IndexOutOfBoundsException e) {
            throw new zzabm(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1}), e);
        }
    }

    public final void zzl(int i, int i2) throws IOException {
        zzs(i << 3);
        zzm(i2);
    }

    public final void zzm(int i) throws IOException {
        if (i >= 0) {
            zzs(i);
        } else {
            zzu((long) i);
        }
    }

    public final void zzn(int i, zzadm zzadm, zzady zzady) throws IOException {
        zzs((i << 3) | 2);
        zzaao zzaao = (zzaao) zzadm;
        int zzn = zzaao.zzn();
        if (zzn == -1) {
            zzn = zzady.zza(zzaao);
            zzaao.zzp(zzn);
        }
        zzs(zzn);
        zzady.zzn(zzadm, this.zze);
    }

    public final void zzo(int i, String str) throws IOException {
        zzs((i << 3) | 2);
        zzp(str);
    }

    public final void zzp(String str) throws IOException {
        int i = this.zzc;
        try {
            int zzE = zzabp.zzE(str.length() * 3);
            int zzE2 = zzabp.zzE(str.length());
            if (zzE2 == zzE) {
                int i2 = i + zzE2;
                this.zzc = i2;
                int zzb2 = zzafe.zzb(str, this.zza, i2, this.zzb - i2);
                this.zzc = i;
                zzs((zzb2 - i) - zzE2);
                this.zzc = zzb2;
                return;
            }
            zzs(zzafe.zzc(str));
            byte[] bArr = this.zza;
            int i3 = this.zzc;
            this.zzc = zzafe.zzb(str, bArr, i3, this.zzb - i3);
        } catch (zzafd e) {
            this.zzc = i;
            zzJ(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzabm(e2);
        }
    }

    public final void zzq(int i, int i2) throws IOException {
        zzs((i << 3) | i2);
    }

    public final void zzr(int i, int i2) throws IOException {
        zzs(i << 3);
        zzs(i2);
    }

    public final void zzs(int i) throws IOException {
        while ((i & -128) != 0) {
            byte[] bArr = this.zza;
            int i2 = this.zzc;
            this.zzc = i2 + 1;
            bArr[i2] = (byte) ((i & 127) | RecyclerView.C1119a0.FLAG_IGNORE);
            i >>>= 7;
        }
        try {
            byte[] bArr2 = this.zza;
            int i3 = this.zzc;
            this.zzc = i3 + 1;
            bArr2[i3] = (byte) i;
        } catch (IndexOutOfBoundsException e) {
            throw new zzabm(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1}), e);
        }
    }

    public final void zzt(int i, long j) throws IOException {
        zzs(i << 3);
        zzu(j);
    }

    public final void zzu(long j) throws IOException {
        if (!zzabp.zzb || this.zzb - this.zzc < 10) {
            while ((j & -128) != 0) {
                byte[] bArr = this.zza;
                int i = this.zzc;
                this.zzc = i + 1;
                bArr[i] = (byte) ((((int) j) & 127) | RecyclerView.C1119a0.FLAG_IGNORE);
                j >>>= 7;
            }
            try {
                byte[] bArr2 = this.zza;
                int i2 = this.zzc;
                this.zzc = i2 + 1;
                bArr2[i2] = (byte) ((int) j);
            } catch (IndexOutOfBoundsException e) {
                throw new zzabm(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1}), e);
            }
        } else {
            while ((j & -128) != 0) {
                byte[] bArr3 = this.zza;
                int i3 = this.zzc;
                this.zzc = i3 + 1;
                zzaez.zzn(bArr3, (long) i3, (byte) ((((int) j) & 127) | RecyclerView.C1119a0.FLAG_IGNORE));
                j >>>= 7;
            }
            byte[] bArr4 = this.zza;
            int i4 = this.zzc;
            this.zzc = i4 + 1;
            zzaez.zzn(bArr4, (long) i4, (byte) ((int) j));
        }
    }
}
