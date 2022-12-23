package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.mediacodec.C3943e;
import java.io.IOException;
import java.nio.ByteBuffer;
import p137ja.C5410b;

/* renamed from: com.google.android.exoplayer2.mediacodec.b */
public interface C3937b {

    /* renamed from: com.google.android.exoplayer2.mediacodec.b$a */
    public static final class C3938a {

        /* renamed from: a */
        public final C3941c f13848a;

        /* renamed from: b */
        public final MediaFormat f13849b;

        /* renamed from: c */
        public final Surface f13850c;

        /* renamed from: d */
        public final MediaCrypto f13851d;

        public C3938a(C3941c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
            this.f13848a = cVar;
            this.f13849b = mediaFormat;
            this.f13850c = surface;
            this.f13851d = mediaCrypto;
        }
    }

    /* renamed from: com.google.android.exoplayer2.mediacodec.b$b */
    public interface C3939b {

        /* renamed from: a */
        public static final C3943e.C3944a f13852a = new C3943e.C3944a();

        /* renamed from: a */
        C3937b mo16076a(C3938a aVar) throws IOException;
    }

    /* renamed from: com.google.android.exoplayer2.mediacodec.b$c */
    public interface C3940c {
    }

    /* renamed from: a */
    MediaFormat mo16060a();

    /* renamed from: b */
    void mo16061b(int i, C5410b bVar, long j);

    /* renamed from: c */
    void mo16062c(C3940c cVar, Handler handler);

    /* renamed from: d */
    void mo16063d(int i);

    /* renamed from: e */
    ByteBuffer mo16064e(int i);

    /* renamed from: f */
    void mo16065f(Surface surface);

    void flush();

    /* renamed from: g */
    void mo16067g(Bundle bundle);

    /* renamed from: h */
    void mo16068h(int i, long j);

    /* renamed from: i */
    int mo16069i();

    /* renamed from: j */
    int mo16070j(MediaCodec.BufferInfo bufferInfo);

    /* renamed from: k */
    void mo16071k(int i, int i2, int i3, long j);

    /* renamed from: l */
    void mo16072l(int i, boolean z);

    /* renamed from: m */
    ByteBuffer mo16073m(int i);

    void release();
}
