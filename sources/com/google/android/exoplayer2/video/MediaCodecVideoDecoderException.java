package com.google.android.exoplayer2.video;

import android.view.Surface;
import com.google.android.exoplayer2.mediacodec.C3941c;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;

public class MediaCodecVideoDecoderException extends MediaCodecDecoderException {
    public final boolean isSurfaceValid;
    public final int surfaceIdentityHashCode;

    public MediaCodecVideoDecoderException(IllegalStateException illegalStateException, C3941c cVar, Surface surface) {
        super(illegalStateException, cVar);
        boolean z;
        this.surfaceIdentityHashCode = System.identityHashCode(surface);
        if (surface == null || surface.isValid()) {
            z = true;
        } else {
            z = false;
        }
        this.isSurfaceValid = z;
    }
}
