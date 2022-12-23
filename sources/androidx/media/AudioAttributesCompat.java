package androidx.media;

import android.util.SparseIntArray;
import p022b3.C1464d;

public class AudioAttributesCompat implements C1464d {

    /* renamed from: b */
    public static final /* synthetic */ int f4012b = 0;

    /* renamed from: a */
    public AudioAttributesImpl f4013a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f4013a;
        if (audioAttributesImpl != null) {
            return audioAttributesImpl.equals(audioAttributesCompat.f4013a);
        }
        if (audioAttributesCompat.f4013a == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4013a.hashCode();
    }

    public final String toString() {
        return this.f4013a.toString();
    }
}
