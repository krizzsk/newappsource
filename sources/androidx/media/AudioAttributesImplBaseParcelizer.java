package androidx.media;

import p022b3.C1462b;

public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(C1462b bVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f4016a = bVar.mo5801j(audioAttributesImplBase.f4016a, 1);
        audioAttributesImplBase.f4017b = bVar.mo5801j(audioAttributesImplBase.f4017b, 2);
        audioAttributesImplBase.f4018c = bVar.mo5801j(audioAttributesImplBase.f4018c, 3);
        audioAttributesImplBase.f4019d = bVar.mo5801j(audioAttributesImplBase.f4019d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, C1462b bVar) {
        bVar.getClass();
        bVar.mo5811t(audioAttributesImplBase.f4016a, 1);
        bVar.mo5811t(audioAttributesImplBase.f4017b, 2);
        bVar.mo5811t(audioAttributesImplBase.f4018c, 3);
        bVar.mo5811t(audioAttributesImplBase.f4019d, 4);
    }
}
