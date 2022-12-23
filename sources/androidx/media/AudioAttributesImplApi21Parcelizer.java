package androidx.media;

import android.media.AudioAttributes;
import p022b3.C1462b;

public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(C1462b bVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f4014a = (AudioAttributes) bVar.mo5803l(audioAttributesImplApi21.f4014a, 1);
        audioAttributesImplApi21.f4015b = bVar.mo5801j(audioAttributesImplApi21.f4015b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, C1462b bVar) {
        bVar.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi21.f4014a;
        bVar.mo5806o(1);
        bVar.mo5812u(audioAttributes);
        bVar.mo5811t(audioAttributesImplApi21.f4015b, 2);
    }
}
