package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import p125ia.C5331p;

/* renamed from: com.google.android.exoplayer2.audio.j */
public final class C3897j implements AudioProcessor {

    /* renamed from: b */
    public int f13624b;

    /* renamed from: c */
    public float f13625c = 1.0f;

    /* renamed from: d */
    public float f13626d = 1.0f;

    /* renamed from: e */
    public AudioProcessor.C3874a f13627e;

    /* renamed from: f */
    public AudioProcessor.C3874a f13628f;

    /* renamed from: g */
    public AudioProcessor.C3874a f13629g;

    /* renamed from: h */
    public AudioProcessor.C3874a f13630h;

    /* renamed from: i */
    public boolean f13631i;

    /* renamed from: j */
    public C5331p f13632j;

    /* renamed from: k */
    public ByteBuffer f13633k;

    /* renamed from: l */
    public ShortBuffer f13634l;

    /* renamed from: m */
    public ByteBuffer f13635m;

    /* renamed from: n */
    public long f13636n;

    /* renamed from: o */
    public long f13637o;

    /* renamed from: p */
    public boolean f13638p;

    public C3897j() {
        AudioProcessor.C3874a aVar = AudioProcessor.C3874a.f13474e;
        this.f13627e = aVar;
        this.f13628f = aVar;
        this.f13629g = aVar;
        this.f13630h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f13473a;
        this.f13633k = byteBuffer;
        this.f13634l = byteBuffer.asShortBuffer();
        this.f13635m = byteBuffer;
        this.f13624b = -1;
    }

    /* renamed from: d */
    public final boolean mo15838d() {
        C5331p pVar;
        if (!this.f13638p || ((pVar = this.f13632j) != null && pVar.f17578m * pVar.f17567b * 2 != 0)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final ByteBuffer mo15839e() {
        int i;
        C5331p pVar = this.f13632j;
        if (pVar != null && (i = pVar.f17578m * pVar.f17567b * 2) > 0) {
            if (this.f13633k.capacity() < i) {
                ByteBuffer order = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
                this.f13633k = order;
                this.f13634l = order.asShortBuffer();
            } else {
                this.f13633k.clear();
                this.f13634l.clear();
            }
            ShortBuffer shortBuffer = this.f13634l;
            int min = Math.min(shortBuffer.remaining() / pVar.f17567b, pVar.f17578m);
            shortBuffer.put(pVar.f17577l, 0, pVar.f17567b * min);
            int i2 = pVar.f17578m - min;
            pVar.f17578m = i2;
            short[] sArr = pVar.f17577l;
            int i3 = pVar.f17567b;
            System.arraycopy(sArr, min * i3, sArr, 0, i2 * i3);
            this.f13637o += (long) i;
            this.f13633k.limit(i);
            this.f13635m = this.f13633k;
        }
        ByteBuffer byteBuffer = this.f13635m;
        this.f13635m = AudioProcessor.f13473a;
        return byteBuffer;
    }

    /* renamed from: f */
    public final void mo15840f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            C5331p pVar = this.f13632j;
            pVar.getClass();
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f13636n += (long) remaining;
            int remaining2 = asShortBuffer.remaining();
            int i = pVar.f17567b;
            int i2 = remaining2 / i;
            short[] c = pVar.mo21113c(pVar.f17575j, pVar.f17576k, i2);
            pVar.f17575j = c;
            asShortBuffer.get(c, pVar.f17576k * pVar.f17567b, ((i * i2) * 2) / 2);
            pVar.f17576k += i2;
            pVar.mo21115f();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    public final void flush() {
        if (isActive()) {
            AudioProcessor.C3874a aVar = this.f13627e;
            this.f13629g = aVar;
            AudioProcessor.C3874a aVar2 = this.f13628f;
            this.f13630h = aVar2;
            if (this.f13631i) {
                this.f13632j = new C5331p(aVar.f13475a, aVar.f13476b, this.f13625c, this.f13626d, aVar2.f13475a);
            } else {
                C5331p pVar = this.f13632j;
                if (pVar != null) {
                    pVar.f17576k = 0;
                    pVar.f17578m = 0;
                    pVar.f17580o = 0;
                    pVar.f17581p = 0;
                    pVar.f17582q = 0;
                    pVar.f17583r = 0;
                    pVar.f17584s = 0;
                    pVar.f17585t = 0;
                    pVar.f17586u = 0;
                    pVar.f17587v = 0;
                }
            }
        }
        this.f13635m = AudioProcessor.f13473a;
        this.f13636n = 0;
        this.f13637o = 0;
        this.f13638p = false;
    }

    /* renamed from: g */
    public final AudioProcessor.C3874a mo15842g(AudioProcessor.C3874a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f13477c == 2) {
            int i = this.f13624b;
            if (i == -1) {
                i = aVar.f13475a;
            }
            this.f13627e = aVar;
            AudioProcessor.C3874a aVar2 = new AudioProcessor.C3874a(i, aVar.f13476b, 2);
            this.f13628f = aVar2;
            this.f13631i = true;
            return aVar2;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    /* renamed from: h */
    public final void mo15843h() {
        int i;
        C5331p pVar = this.f13632j;
        if (pVar != null) {
            int i2 = pVar.f17576k;
            float f = pVar.f17568c;
            float f2 = pVar.f17569d;
            float f3 = pVar.f17570e * f2;
            int i3 = pVar.f17578m + ((int) ((((((float) i2) / (f / f2)) + ((float) pVar.f17580o)) / f3) + 0.5f));
            pVar.f17575j = pVar.mo21113c(pVar.f17575j, i2, (pVar.f17573h * 2) + i2);
            int i4 = 0;
            while (true) {
                i = pVar.f17573h * 2;
                int i5 = pVar.f17567b;
                if (i4 >= i * i5) {
                    break;
                }
                pVar.f17575j[(i5 * i2) + i4] = 0;
                i4++;
            }
            pVar.f17576k = i + pVar.f17576k;
            pVar.mo21115f();
            if (pVar.f17578m > i3) {
                pVar.f17578m = i3;
            }
            pVar.f17576k = 0;
            pVar.f17583r = 0;
            pVar.f17580o = 0;
        }
        this.f13638p = true;
    }

    public final boolean isActive() {
        if (this.f13628f.f13475a == -1 || (Math.abs(this.f13625c - 1.0f) < 1.0E-4f && Math.abs(this.f13626d - 1.0f) < 1.0E-4f && this.f13628f.f13475a == this.f13627e.f13475a)) {
            return false;
        }
        return true;
    }

    public final void reset() {
        this.f13625c = 1.0f;
        this.f13626d = 1.0f;
        AudioProcessor.C3874a aVar = AudioProcessor.C3874a.f13474e;
        this.f13627e = aVar;
        this.f13628f = aVar;
        this.f13629g = aVar;
        this.f13630h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f13473a;
        this.f13633k = byteBuffer;
        this.f13634l = byteBuffer.asShortBuffer();
        this.f13635m = byteBuffer;
        this.f13624b = -1;
        this.f13631i = false;
        this.f13632j = null;
        this.f13636n = 0;
        this.f13637o = 0;
        this.f13638p = false;
    }
}
