package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.exoplayer2.audio.d */
public final class C3881d extends C3880c {

    /* renamed from: i */
    public int[] f13520i;

    /* renamed from: j */
    public int[] f13521j;

    /* renamed from: a */
    public final AudioProcessor.C3874a mo15889a(AudioProcessor.C3874a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        boolean z;
        boolean z2;
        int[] iArr = this.f13520i;
        if (iArr == null) {
            return AudioProcessor.C3874a.f13474e;
        }
        if (aVar.f13477c == 2) {
            if (aVar.f13476b != iArr.length) {
                z = true;
            } else {
                z = false;
            }
            int i = 0;
            while (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 < aVar.f13476b) {
                    if (i2 != i) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z |= z2;
                    i++;
                } else {
                    throw new AudioProcessor.UnhandledAudioFormatException(aVar);
                }
            }
            if (z) {
                return new AudioProcessor.C3874a(aVar.f13475a, iArr.length, 2);
            }
            return AudioProcessor.C3874a.f13474e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    /* renamed from: b */
    public final void mo15890b() {
        this.f13521j = this.f13520i;
    }

    /* renamed from: f */
    public final void mo15840f(ByteBuffer byteBuffer) {
        int[] iArr = this.f13521j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer j = mo15893j(((limit - position) / this.f13513b.f13478d) * this.f13514c.f13478d);
        while (position < limit) {
            for (int i : iArr) {
                j.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.f13513b.f13478d;
        }
        byteBuffer.position(limit);
        j.flip();
    }

    /* renamed from: i */
    public final void mo15892i() {
        this.f13521j = null;
        this.f13520i = null;
    }
}
