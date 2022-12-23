package p252sb;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.trackselection.C3997b;
import java.util.Arrays;
import p583jk.C17875h;

/* renamed from: sb.b */
public abstract class C6502b implements C3997b {

    /* renamed from: a */
    public final TrackGroup f20289a;

    /* renamed from: b */
    public final int f20290b;

    /* renamed from: c */
    public final int[] f20291c;

    /* renamed from: d */
    public final Format[] f20292d;

    /* renamed from: e */
    public int f20293e;

    public C6502b(TrackGroup trackGroup, int[] iArr) {
        boolean z;
        if (iArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44304o(z);
        trackGroup.getClass();
        this.f20289a = trackGroup;
        int length = iArr.length;
        this.f20290b = length;
        this.f20292d = new Format[length];
        for (int i = 0; i < iArr.length; i++) {
            this.f20292d[i] = trackGroup.f14009c[iArr[i]];
        }
        Arrays.sort(this.f20292d, new C6501a(0));
        this.f20291c = new int[this.f20290b];
        int i2 = 0;
        while (true) {
            int i3 = this.f20290b;
            if (i2 < i3) {
                int[] iArr2 = this.f20291c;
                Format format = this.f20292d[i2];
                int i4 = 0;
                while (true) {
                    Format[] formatArr = trackGroup.f14009c;
                    if (i4 >= formatArr.length) {
                        i4 = -1;
                        break;
                    } else if (format == formatArr[i4]) {
                        break;
                    } else {
                        i4++;
                    }
                }
                iArr2[i2] = i4;
                i2++;
            } else {
                long[] jArr = new long[i3];
                return;
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo16337a() {
    }

    /* renamed from: b */
    public final Format mo22603b(int i) {
        return this.f20292d[i];
    }

    /* renamed from: c */
    public final int mo22604c(int i) {
        return this.f20291c[i];
    }

    /* renamed from: d */
    public final TrackGroup mo22605d() {
        return this.f20289a;
    }

    /* renamed from: e */
    public void mo16331e() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C6502b bVar = (C6502b) obj;
        if (this.f20289a != bVar.f20289a || !Arrays.equals(this.f20291c, bVar.f20291c)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public void mo16333g() {
    }

    /* renamed from: h */
    public final /* synthetic */ void mo16338h() {
    }

    public final int hashCode() {
        if (this.f20293e == 0) {
            this.f20293e = Arrays.hashCode(this.f20291c) + (System.identityHashCode(this.f20289a) * 31);
        }
        return this.f20293e;
    }

    /* renamed from: i */
    public void mo16334i() {
    }

    /* renamed from: j */
    public final int mo22608j(Format format) {
        for (int i = 0; i < this.f20290b; i++) {
            if (this.f20292d[i] == format) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final Format mo16339k() {
        Format[] formatArr = this.f20292d;
        mo16332f();
        return formatArr[0];
    }

    /* renamed from: l */
    public final /* synthetic */ void mo16340l() {
    }

    public final int length() {
        return this.f20291c.length;
    }
}
