package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class zzaks extends zzgpb {
    public ByteBuffer zza;

    public zzaks(String str) {
        super(str);
    }

    public final void zzf(ByteBuffer byteBuffer) {
        this.zza = byteBuffer;
        byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
    }
}
