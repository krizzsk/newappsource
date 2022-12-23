package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
import p277ub.C6774a0;

/* renamed from: com.google.android.exoplayer2.audio.k */
public final class C3898k extends C3880c {

    /* renamed from: i */
    public int f13639i;

    /* renamed from: j */
    public int f13640j;

    /* renamed from: k */
    public boolean f13641k;

    /* renamed from: l */
    public int f13642l;

    /* renamed from: m */
    public byte[] f13643m = C6774a0.f20964f;

    /* renamed from: n */
    public int f13644n;

    /* renamed from: o */
    public long f13645o;

    /* renamed from: a */
    public final AudioProcessor.C3874a mo15889a(AudioProcessor.C3874a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f13477c == 2) {
            this.f13641k = true;
            if (this.f13639i == 0 && this.f13640j == 0) {
                return AudioProcessor.C3874a.f13474e;
            }
            return aVar;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    /* renamed from: b */
    public final void mo15890b() {
        if (this.f13641k) {
            this.f13641k = false;
            int i = this.f13640j;
            int i2 = this.f13513b.f13478d;
            this.f13643m = new byte[(i * i2)];
            this.f13642l = this.f13639i * i2;
        }
        this.f13644n = 0;
    }

    /* renamed from: c */
    public final void mo15891c() {
        if (this.f13641k) {
            int i = this.f13644n;
            if (i > 0) {
                this.f13645o += (long) (i / this.f13513b.f13478d);
            }
            this.f13644n = 0;
        }
    }

    /* renamed from: d */
    public final boolean mo15838d() {
        return super.mo15838d() && this.f13644n == 0;
    }

    /* renamed from: e */
    public final ByteBuffer mo15839e() {
        int i;
        if (super.mo15838d() && (i = this.f13644n) > 0) {
            mo15893j(i).put(this.f13643m, 0, this.f13644n).flip();
            this.f13644n = 0;
        }
        return super.mo15839e();
    }

    /* renamed from: f */
    public final void mo15840f(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i != 0) {
            int min = Math.min(i, this.f13642l);
            this.f13645o += (long) (min / this.f13513b.f13478d);
            this.f13642l -= min;
            byteBuffer.position(position + min);
            if (this.f13642l <= 0) {
                int i2 = i - min;
                int length = (this.f13644n + i2) - this.f13643m.length;
                ByteBuffer j = mo15893j(length);
                int g = C6774a0.m15947g(length, 0, this.f13644n);
                j.put(this.f13643m, 0, g);
                int g2 = C6774a0.m15947g(length - g, 0, i2);
                byteBuffer.limit(byteBuffer.position() + g2);
                j.put(byteBuffer);
                byteBuffer.limit(limit);
                int i3 = i2 - g2;
                int i4 = this.f13644n - g;
                this.f13644n = i4;
                byte[] bArr = this.f13643m;
                System.arraycopy(bArr, g, bArr, 0, i4);
                byteBuffer.get(this.f13643m, this.f13644n, i3);
                this.f13644n += i3;
                j.flip();
            }
        }
    }

    /* renamed from: i */
    public final void mo15892i() {
        this.f13643m = C6774a0.f20964f;
    }
}
