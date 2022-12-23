package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.exoplayer2.audio.f */
public final class C3892f extends C3880c {

    /* renamed from: i */
    public static final int f13599i = Float.floatToIntBits(Float.NaN);

    /* renamed from: a */
    public final AudioProcessor.C3874a mo15889a(AudioProcessor.C3874a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        boolean z;
        int i = aVar.f13477c;
        if (i == 536870912 || i == 805306368 || i == 4) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        } else if (i != 4) {
            return new AudioProcessor.C3874a(aVar.f13475a, aVar.f13476b, 4);
        } else {
            return AudioProcessor.C3874a.f13474e;
        }
    }

    /* renamed from: f */
    public final void mo15840f(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.f13513b.f13477c;
        if (i2 == 536870912) {
            byteBuffer2 = mo15893j((i / 3) * 4);
            while (position < limit) {
                int floatToIntBits = Float.floatToIntBits((float) (((double) (((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24))) * 4.656612875245797E-10d));
                if (floatToIntBits == f13599i) {
                    floatToIntBits = Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED);
                }
                byteBuffer2.putInt(floatToIntBits);
                position += 3;
            }
        } else if (i2 == 805306368) {
            byteBuffer2 = mo15893j(i);
            while (position < limit) {
                int floatToIntBits2 = Float.floatToIntBits((float) (((double) ((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24))) * 4.656612875245797E-10d));
                if (floatToIntBits2 == f13599i) {
                    floatToIntBits2 = Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED);
                }
                byteBuffer2.putInt(floatToIntBits2);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }
}
