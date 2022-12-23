package com.google.android.gms.internal.p986firebaseauthapi;

import androidx.recyclerview.widget.RecyclerView;
import com.appboy.support.ValidationUtils;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabk */
abstract class zzabk extends zzabp {
    public final byte[] zza;
    public final int zzb;
    public int zzc;
    public int zzd;

    public zzabk(int i) {
        super((zzabo) null);
        if (i >= 0) {
            byte[] bArr = new byte[Math.max(i, 20)];
            this.zza = bArr;
            this.zzb = bArr.length;
            return;
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    public final int zzb() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    public final void zzc(byte b) {
        byte[] bArr = this.zza;
        int i = this.zzc;
        this.zzc = i + 1;
        bArr[i] = b;
        this.zzd++;
    }

    public final void zzd(int i) {
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
        this.zzd += 4;
    }

    public final void zze(long j) {
        byte[] bArr = this.zza;
        int i = this.zzc;
        int i2 = i + 1;
        bArr[i] = (byte) ((int) (j & 255));
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((int) ((j >> 8) & 255));
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((int) ((j >> 16) & 255));
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((int) (255 & (j >> 24)));
        int i6 = i5 + 1;
        bArr[i5] = (byte) (((int) (j >> 32)) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        int i7 = i6 + 1;
        bArr[i6] = (byte) (((int) (j >> 40)) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        int i8 = i7 + 1;
        bArr[i7] = (byte) (((int) (j >> 48)) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        this.zzc = i8 + 1;
        bArr[i8] = (byte) (((int) (j >> 56)) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        this.zzd += 8;
    }

    public final void zzf(int i) {
        if (zzabp.zzb) {
            long j = (long) this.zzc;
            while ((i & -128) != 0) {
                byte[] bArr = this.zza;
                int i2 = this.zzc;
                this.zzc = i2 + 1;
                zzaez.zzn(bArr, (long) i2, (byte) ((i & 127) | RecyclerView.C1119a0.FLAG_IGNORE));
                i >>>= 7;
            }
            byte[] bArr2 = this.zza;
            int i3 = this.zzc;
            this.zzc = i3 + 1;
            zzaez.zzn(bArr2, (long) i3, (byte) i);
            this.zzd += (int) (((long) this.zzc) - j);
            return;
        }
        while ((i & -128) != 0) {
            byte[] bArr3 = this.zza;
            int i4 = this.zzc;
            this.zzc = i4 + 1;
            bArr3[i4] = (byte) ((i & 127) | RecyclerView.C1119a0.FLAG_IGNORE);
            this.zzd++;
            i >>>= 7;
        }
        byte[] bArr4 = this.zza;
        int i5 = this.zzc;
        this.zzc = i5 + 1;
        bArr4[i5] = (byte) i;
        this.zzd++;
    }

    public final void zzg(long j) {
        if (zzabp.zzb) {
            long j2 = (long) this.zzc;
            while ((j & -128) != 0) {
                byte[] bArr = this.zza;
                int i = this.zzc;
                this.zzc = i + 1;
                zzaez.zzn(bArr, (long) i, (byte) ((((int) j) & 127) | RecyclerView.C1119a0.FLAG_IGNORE));
                j >>>= 7;
            }
            byte[] bArr2 = this.zza;
            int i2 = this.zzc;
            this.zzc = i2 + 1;
            zzaez.zzn(bArr2, (long) i2, (byte) ((int) j));
            this.zzd += (int) (((long) this.zzc) - j2);
            return;
        }
        while ((j & -128) != 0) {
            byte[] bArr3 = this.zza;
            int i3 = this.zzc;
            this.zzc = i3 + 1;
            bArr3[i3] = (byte) ((((int) j) & 127) | RecyclerView.C1119a0.FLAG_IGNORE);
            this.zzd++;
            j >>>= 7;
        }
        byte[] bArr4 = this.zza;
        int i4 = this.zzc;
        this.zzc = i4 + 1;
        bArr4[i4] = (byte) ((int) j);
        this.zzd++;
    }
}
