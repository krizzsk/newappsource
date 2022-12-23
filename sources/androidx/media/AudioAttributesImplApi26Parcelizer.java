package androidx.media;

import android.media.AudioAttributes;
import p022b3.C1462b;

public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(C1462b bVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f4014a = (AudioAttributes) bVar.mo5803l(audioAttributesImplApi26.f4014a, 1);
        audioAttributesImplApi26.f4015b = bVar.mo5801j(audioAttributesImplApi26.f4015b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, C1462b bVar) {
        bVar.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi26.f4014a;
        bVar.mo5806o(1);
        bVar.mo5812u(audioAttributes);
        bVar.mo5811t(audioAttributesImplApi26.f4015b, 2);
    }
}
