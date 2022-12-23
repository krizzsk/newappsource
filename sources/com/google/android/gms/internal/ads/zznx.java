package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

final class zznx extends zznw {
    private int[] zzd;
    private int[] zze;

    public final void zze(ByteBuffer byteBuffer) {
        int[] iArr = this.zze;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer zzj = zzj(((limit - position) / this.zzb.zze) * this.zzc.zze);
        while (position < limit) {
            for (int i : iArr) {
                zzj.putShort(byteBuffer.getShort(i + i + position));
            }
            position += this.zzb.zze;
        }
        byteBuffer.position(limit);
        zzj.flip();
    }

    public final zzmx zzi(zzmx zzmx) throws zzmy {
        boolean z;
        boolean z2;
        int[] iArr = this.zzd;
        if (iArr == null) {
            return zzmx.zza;
        }
        if (zzmx.zzd == 2) {
            if (zzmx.zzc != iArr.length) {
                z = true;
            } else {
                z = false;
            }
            int i = 0;
            while (true) {
                int length = iArr.length;
                if (i < length) {
                    int i2 = iArr[i];
                    if (i2 < zzmx.zzc) {
                        if (i2 != i) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z |= z2;
                        i++;
                    } else {
                        throw new zzmy(zzmx);
                    }
                } else if (z) {
                    return new zzmx(zzmx.zzb, length, 2);
                } else {
                    return zzmx.zza;
                }
            }
        } else {
            throw new zzmy(zzmx);
        }
    }

    public final void zzk() {
        this.zze = this.zzd;
    }

    public final void zzm() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzo(int[] iArr) {
        this.zzd = iArr;
    }
}
