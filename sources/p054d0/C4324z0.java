package p054d0;

import android.media.MediaCodec;

/* renamed from: d0.z0 */
public final /* synthetic */ class C4324z0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ boolean f15302b;

    /* renamed from: c */
    public final /* synthetic */ MediaCodec f15303c;

    public /* synthetic */ C4324z0(boolean z, MediaCodec mediaCodec) {
        this.f15302b = z;
        this.f15303c = mediaCodec;
    }

    public final void run() {
        boolean z = this.f15302b;
        MediaCodec mediaCodec = this.f15303c;
        if (z && mediaCodec != null) {
            mediaCodec.release();
        }
    }
}
