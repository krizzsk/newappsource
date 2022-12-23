package androidx.media;

import p022b3.C1462b;

public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(C1462b bVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        Object obj = audioAttributesCompat.f4013a;
        if (bVar.mo5799h(1)) {
            obj = bVar.mo5805n();
        }
        audioAttributesCompat.f4013a = (AudioAttributesImpl) obj;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, C1462b bVar) {
        bVar.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f4013a;
        bVar.mo5806o(1);
        bVar.mo5814w(audioAttributesImpl);
    }
}
