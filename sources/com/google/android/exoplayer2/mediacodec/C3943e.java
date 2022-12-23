package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.mediacodec.C3937b;
import java.io.IOException;
import java.nio.ByteBuffer;
import p137ja.C5410b;
import p277ub.C6774a0;
import p314xa.C7192j;
import p583jk.C17884p;

/* renamed from: com.google.android.exoplayer2.mediacodec.e */
public final class C3943e implements C3937b {

    /* renamed from: a */
    public final MediaCodec f13861a;

    /* renamed from: b */
    public ByteBuffer[] f13862b;

    /* renamed from: c */
    public ByteBuffer[] f13863c;

    /* renamed from: com.google.android.exoplayer2.mediacodec.e$a */
    public static class C3944a implements C3937b.C3939b {
        /* renamed from: b */
        public static MediaCodec m10608b(C3937b.C3938a aVar) throws IOException {
            String str;
            aVar.f13848a.getClass();
            String str2 = aVar.f13848a.f13853a;
            String valueOf = String.valueOf(str2);
            if (valueOf.length() != 0) {
                str = "createCodec:".concat(valueOf);
            } else {
                str = new String("createCodec:");
            }
            C17884p.m44368g(str);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str2);
            C17884p.m44382v();
            return createByCodecName;
        }

        /* renamed from: a */
        public final C3937b mo16076a(C3937b.C3938a aVar) throws IOException {
            MediaCodec mediaCodec = null;
            try {
                mediaCodec = m10608b(aVar);
                C17884p.m44368g("configureCodec");
                mediaCodec.configure(aVar.f13849b, aVar.f13850c, aVar.f13851d, 0);
                C17884p.m44382v();
                C17884p.m44368g("startCodec");
                mediaCodec.start();
                C17884p.m44382v();
                return new C3943e(mediaCodec);
            } catch (IOException | RuntimeException e) {
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        }
    }

    public C3943e(MediaCodec mediaCodec) {
        this.f13861a = mediaCodec;
        if (C6774a0.f20959a < 21) {
            this.f13862b = mediaCodec.getInputBuffers();
            this.f13863c = mediaCodec.getOutputBuffers();
        }
    }

    /* renamed from: a */
    public final MediaFormat mo16060a() {
        return this.f13861a.getOutputFormat();
    }

    /* renamed from: b */
    public final void mo16061b(int i, C5410b bVar, long j) {
        this.f13861a.queueSecureInputBuffer(i, 0, bVar.f17766i, j, 0);
    }

    /* renamed from: c */
    public final void mo16062c(C3937b.C3940c cVar, Handler handler) {
        this.f13861a.setOnFrameRenderedListener(new C7192j(this, cVar), handler);
    }

    /* renamed from: d */
    public final void mo16063d(int i) {
        this.f13861a.setVideoScalingMode(i);
    }

    /* renamed from: e */
    public final ByteBuffer mo16064e(int i) {
        if (C6774a0.f20959a >= 21) {
            return this.f13861a.getInputBuffer(i);
        }
        return this.f13862b[i];
    }

    /* renamed from: f */
    public final void mo16065f(Surface surface) {
        this.f13861a.setOutputSurface(surface);
    }

    public final void flush() {
        this.f13861a.flush();
    }

    /* renamed from: g */
    public final void mo16067g(Bundle bundle) {
        this.f13861a.setParameters(bundle);
    }

    /* renamed from: h */
    public final void mo16068h(int i, long j) {
        this.f13861a.releaseOutputBuffer(i, j);
    }

    /* renamed from: i */
    public final int mo16069i() {
        return this.f13861a.dequeueInputBuffer(0);
    }

    /* renamed from: j */
    public final int mo16070j(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f13861a.dequeueOutputBuffer(bufferInfo, 0);
            if (dequeueOutputBuffer == -3 && C6774a0.f20959a < 21) {
                this.f13863c = this.f13861a.getOutputBuffers();
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    /* renamed from: k */
    public final void mo16071k(int i, int i2, int i3, long j) {
        this.f13861a.queueInputBuffer(i, 0, i2, j, i3);
    }

    /* renamed from: l */
    public final void mo16072l(int i, boolean z) {
        this.f13861a.releaseOutputBuffer(i, z);
    }

    /* renamed from: m */
    public final ByteBuffer mo16073m(int i) {
        if (C6774a0.f20959a >= 21) {
            return this.f13861a.getOutputBuffer(i);
        }
        return this.f13863c[i];
    }

    public final void release() {
        this.f13862b = null;
        this.f13863c = null;
        this.f13861a.release();
    }
}
