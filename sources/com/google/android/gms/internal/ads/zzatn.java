package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class zzatn extends zzati {
    public final zzatl zza = new zzatl();
    public ByteBuffer zzb;
    public long zzc;

    public zzatn(int i) {
    }

    private final ByteBuffer zzj(int i) {
        int i2;
        ByteBuffer byteBuffer = this.zzb;
        if (byteBuffer == null) {
            i2 = 0;
        } else {
            i2 = byteBuffer.capacity();
        }
        throw new IllegalStateException("Buffer too small (" + i2 + " < " + i + ")");
    }

    public final void zzb() {
        super.zzb();
        ByteBuffer byteBuffer = this.zzb;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final void zzh(int i) throws IllegalStateException {
        ByteBuffer byteBuffer = this.zzb;
        if (byteBuffer == null) {
            this.zzb = zzj(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.zzb.position();
        int i2 = i + position;
        if (capacity < i2) {
            ByteBuffer zzj = zzj(i2);
            if (position > 0) {
                this.zzb.position(0);
                this.zzb.limit(position);
                zzj.put(this.zzb);
            }
            this.zzb = zzj;
        }
    }

    public final boolean zzi() {
        return zzd(1073741824);
    }
}
