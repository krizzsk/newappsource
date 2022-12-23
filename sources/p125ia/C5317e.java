package p125ia;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import java.util.Arrays;
import p001a0.C0016g;

/* renamed from: ia.e */
public final class C5317e {

    /* renamed from: c */
    public static final C5317e f17517c = new C5317e(new int[]{2}, 8);

    /* renamed from: d */
    public static final C5317e f17518d = new C5317e(new int[]{2, 5, 6}, 8);

    /* renamed from: e */
    public static final int[] f17519e = {5, 6, 18, 17, 14, 7, 8};

    /* renamed from: a */
    public final int[] f17520a;

    /* renamed from: b */
    public final int f17521b;

    /* renamed from: ia.e$a */
    public static final class C5318a {
        /* renamed from: a */
        public static int[] m13357a() {
            int i = ImmutableList.f36196c;
            ImmutableList.C14367a aVar = new ImmutableList.C14367a();
            for (int i2 : C5317e.f17519e) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(i2).setSampleRate(48000).build(), new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build())) {
                    aVar.mo43128b(Integer.valueOf(i2));
                }
            }
            aVar.mo43128b(2);
            return Ints.m35901w(aVar.mo43129c());
        }
    }

    public C5317e(int[] iArr, int i) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f17520a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f17520a = new int[0];
        }
        this.f17521b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5317e)) {
            return false;
        }
        C5317e eVar = (C5317e) obj;
        if (!Arrays.equals(this.f17520a, eVar.f17520a) || this.f17521b != eVar.f17521b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f17520a) * 31) + this.f17521b;
    }

    public final String toString() {
        int i = this.f17521b;
        String arrays = Arrays.toString(this.f17520a);
        StringBuilder sb = new StringBuilder(C0016g.m25h(arrays, 67));
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i);
        sb.append(", supportedEncodings=");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
