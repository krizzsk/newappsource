package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
import p277ub.C6774a0;

/* renamed from: com.google.android.exoplayer2.audio.i */
public final class C3896i extends C3880c {

    /* renamed from: i */
    public final long f13612i = 150000;

    /* renamed from: j */
    public final long f13613j = 20000;

    /* renamed from: k */
    public final short f13614k = 1024;

    /* renamed from: l */
    public int f13615l;

    /* renamed from: m */
    public boolean f13616m;

    /* renamed from: n */
    public byte[] f13617n;

    /* renamed from: o */
    public byte[] f13618o;

    /* renamed from: p */
    public int f13619p;

    /* renamed from: q */
    public int f13620q;

    /* renamed from: r */
    public int f13621r;

    /* renamed from: s */
    public boolean f13622s;

    /* renamed from: t */
    public long f13623t;

    public C3896i() {
        byte[] bArr = C6774a0.f20964f;
        this.f13617n = bArr;
        this.f13618o = bArr;
    }

    /* renamed from: a */
    public final AudioProcessor.C3874a mo15889a(AudioProcessor.C3874a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f13477c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        } else if (this.f13616m) {
            return aVar;
        } else {
            return AudioProcessor.C3874a.f13474e;
        }
    }

    /* renamed from: b */
    public final void mo15890b() {
        if (this.f13616m) {
            AudioProcessor.C3874a aVar = this.f13513b;
            int i = aVar.f13478d;
            this.f13615l = i;
            long j = this.f13612i;
            int i2 = aVar.f13475a;
            int i3 = ((int) ((j * ((long) i2)) / 1000000)) * i;
            if (this.f13617n.length != i3) {
                this.f13617n = new byte[i3];
            }
            int i4 = ((int) ((this.f13613j * ((long) i2)) / 1000000)) * i;
            this.f13621r = i4;
            if (this.f13618o.length != i4) {
                this.f13618o = new byte[i4];
            }
        }
        this.f13619p = 0;
        this.f13623t = 0;
        this.f13620q = 0;
        this.f13622s = false;
    }

    /* renamed from: c */
    public final void mo15891c() {
        int i = this.f13620q;
        if (i > 0) {
            mo15946l(i, this.f13617n);
        }
        if (!this.f13622s) {
            this.f13623t += (long) (this.f13621r / this.f13615l);
        }
    }

    /* renamed from: f */
    public final void mo15840f(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !this.f13518g.hasRemaining()) {
            int i = this.f13619p;
            if (i == 0) {
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f13617n.length));
                int limit2 = byteBuffer.limit();
                while (true) {
                    limit2 -= 2;
                    if (limit2 >= byteBuffer.position()) {
                        if (Math.abs(byteBuffer.getShort(limit2)) > this.f13614k) {
                            int i2 = this.f13615l;
                            position = ((limit2 / i2) * i2) + i2;
                            break;
                        }
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.f13619p = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    mo15893j(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.f13622s = true;
                    }
                }
                byteBuffer.limit(limit);
            } else if (i == 1) {
                int limit3 = byteBuffer.limit();
                int k = mo15945k(byteBuffer);
                int position2 = k - byteBuffer.position();
                byte[] bArr = this.f13617n;
                int length = bArr.length;
                int i3 = this.f13620q;
                int i4 = length - i3;
                if (k >= limit3 || position2 >= i4) {
                    int min = Math.min(position2, i4);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.f13617n, this.f13620q, min);
                    int i5 = this.f13620q + min;
                    this.f13620q = i5;
                    byte[] bArr2 = this.f13617n;
                    if (i5 == bArr2.length) {
                        if (this.f13622s) {
                            mo15946l(this.f13621r, bArr2);
                            this.f13623t += (long) ((this.f13620q - (this.f13621r * 2)) / this.f13615l);
                        } else {
                            this.f13623t += (long) ((i5 - this.f13621r) / this.f13615l);
                        }
                        mo15947m(byteBuffer, this.f13617n, this.f13620q);
                        this.f13620q = 0;
                        this.f13619p = 2;
                    }
                    byteBuffer.limit(limit3);
                } else {
                    mo15946l(i3, bArr);
                    this.f13620q = 0;
                    this.f13619p = 0;
                }
            } else if (i == 2) {
                int limit4 = byteBuffer.limit();
                int k2 = mo15945k(byteBuffer);
                byteBuffer.limit(k2);
                this.f13623t += (long) (byteBuffer.remaining() / this.f13615l);
                mo15947m(byteBuffer, this.f13618o, this.f13621r);
                if (k2 < limit4) {
                    mo15946l(this.f13621r, this.f13618o);
                    this.f13619p = 0;
                    byteBuffer.limit(limit4);
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: i */
    public final void mo15892i() {
        this.f13616m = false;
        this.f13621r = 0;
        byte[] bArr = C6774a0.f20964f;
        this.f13617n = bArr;
        this.f13618o = bArr;
    }

    public final boolean isActive() {
        return this.f13616m;
    }

    /* renamed from: k */
    public final int mo15945k(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs(byteBuffer.getShort(position)) > this.f13614k) {
                int i = this.f13615l;
                return (position / i) * i;
            }
        }
        return byteBuffer.limit();
    }

    /* renamed from: l */
    public final void mo15946l(int i, byte[] bArr) {
        mo15893j(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.f13622s = true;
        }
    }

    /* renamed from: m */
    public final void mo15947m(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.f13621r);
        int i2 = this.f13621r - min;
        System.arraycopy(bArr, i - i2, this.f13618o, 0, i2);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f13618o, i2, min);
    }
}
