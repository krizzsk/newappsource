package com.bumptech.glide.load.resource.bitmap;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.resource.bitmap.d */
public final class C2214d extends MediaDataSource {

    /* renamed from: b */
    public final /* synthetic */ ByteBuffer f7194b;

    public C2214d(ByteBuffer byteBuffer) {
        this.f7194b = byteBuffer;
    }

    public final void close() {
    }

    public final long getSize() {
        return (long) this.f7194b.limit();
    }

    public final int readAt(long j, byte[] bArr, int i, int i2) {
        if (j >= ((long) this.f7194b.limit())) {
            return -1;
        }
        this.f7194b.position((int) j);
        int min = Math.min(i2, this.f7194b.remaining());
        this.f7194b.get(bArr, i, min);
        return min;
    }
}
