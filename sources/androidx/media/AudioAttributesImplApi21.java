package androidx.media;

import android.media.AudioAttributes;

public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a */
    public AudioAttributes f4014a;

    /* renamed from: b */
    public int f4015b = -1;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f4014a.equals(((AudioAttributesImplApi21) obj).f4014a);
    }

    public final int hashCode() {
        return this.f4014a.hashCode();
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("AudioAttributesCompat: audioattributes=");
        k.append(this.f4014a);
        return k.toString();
    }
}
