package p314xa;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import p277ub.C6783h;

/* renamed from: xa.f */
public final class C7188f extends MediaCodec.Callback {

    /* renamed from: a */
    public final Object f22299a = new Object();

    /* renamed from: b */
    public final HandlerThread f22300b;

    /* renamed from: c */
    public Handler f22301c;

    /* renamed from: d */
    public final C6783h f22302d;

    /* renamed from: e */
    public final C6783h f22303e;

    /* renamed from: f */
    public final ArrayDeque<MediaCodec.BufferInfo> f22304f;

    /* renamed from: g */
    public final ArrayDeque<MediaFormat> f22305g;

    /* renamed from: h */
    public MediaFormat f22306h;

    /* renamed from: i */
    public MediaFormat f22307i;

    /* renamed from: j */
    public MediaCodec.CodecException f22308j;

    /* renamed from: k */
    public long f22309k;

    /* renamed from: l */
    public boolean f22310l;

    /* renamed from: m */
    public IllegalStateException f22311m;

    public C7188f(HandlerThread handlerThread) {
        this.f22300b = handlerThread;
        this.f22302d = new C6783h();
        this.f22303e = new C6783h();
        this.f22304f = new ArrayDeque<>();
        this.f22305g = new ArrayDeque<>();
    }

    /* renamed from: a */
    public final void mo23490a() {
        if (!this.f22305g.isEmpty()) {
            this.f22307i = this.f22305g.getLast();
        }
        C6783h hVar = this.f22302d;
        hVar.f20981a = 0;
        hVar.f20982b = -1;
        hVar.f20983c = 0;
        C6783h hVar2 = this.f22303e;
        hVar2.f20981a = 0;
        hVar2.f20982b = -1;
        hVar2.f20983c = 0;
        this.f22304f.clear();
        this.f22305g.clear();
        this.f22308j = null;
    }

    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f22299a) {
            this.f22308j = codecException;
        }
    }

    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.f22299a) {
            this.f22302d.mo22955a(i);
        }
    }

    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f22299a) {
            MediaFormat mediaFormat = this.f22307i;
            if (mediaFormat != null) {
                this.f22303e.mo22955a(-2);
                this.f22305g.add(mediaFormat);
                this.f22307i = null;
            }
            this.f22303e.mo22955a(i);
            this.f22304f.add(bufferInfo);
        }
    }

    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f22299a) {
            this.f22303e.mo22955a(-2);
            this.f22305g.add(mediaFormat);
            this.f22307i = null;
        }
    }
}
