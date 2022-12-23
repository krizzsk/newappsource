package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.decoder.DecoderException;

public class MediaCodecDecoderException extends DecoderException {
    public final C3941c codecInfo;
    public final String diagnosticInfo;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MediaCodecDecoderException(java.lang.IllegalStateException r5, com.google.android.exoplayer2.mediacodec.C3941c r6) {
        /*
            r4 = this;
            r0 = 0
            if (r6 != 0) goto L_0x0005
            r1 = r0
            goto L_0x0007
        L_0x0005:
            java.lang.String r1 = r6.f13853a
        L_0x0007:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r1.length()
            java.lang.String r3 = "Decoder failed: "
            if (r2 == 0) goto L_0x0018
            java.lang.String r1 = r3.concat(r1)
            goto L_0x001d
        L_0x0018:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3)
        L_0x001d:
            r4.<init>(r1, r5)
            r4.codecInfo = r6
            int r6 = p277ub.C6774a0.f20959a
            r1 = 21
            if (r6 < r1) goto L_0x0032
            boolean r6 = r5 instanceof android.media.MediaCodec.CodecException
            if (r6 == 0) goto L_0x0032
            android.media.MediaCodec$CodecException r5 = (android.media.MediaCodec.CodecException) r5
            java.lang.String r0 = r5.getDiagnosticInfo()
        L_0x0032:
            r4.diagnosticInfo = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException.<init>(java.lang.IllegalStateException, com.google.android.exoplayer2.mediacodec.c):void");
    }
}
