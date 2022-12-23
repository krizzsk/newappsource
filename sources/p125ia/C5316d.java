package p125ia;

import android.media.AudioAttributes;
import p277ub.C6774a0;

/* renamed from: ia.d */
public final class C5316d {

    /* renamed from: f */
    public static final C5316d f17511f = new C5316d();

    /* renamed from: a */
    public final int f17512a = 0;

    /* renamed from: b */
    public final int f17513b = 0;

    /* renamed from: c */
    public final int f17514c = 1;

    /* renamed from: d */
    public final int f17515d = 1;

    /* renamed from: e */
    public AudioAttributes f17516e;

    /* renamed from: a */
    public final AudioAttributes mo21095a() {
        if (this.f17516e == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f17512a).setFlags(this.f17513b).setUsage(this.f17514c);
            if (C6774a0.f20959a >= 29) {
                usage.setAllowedCapturePolicy(this.f17515d);
            }
            this.f17516e = usage.build();
        }
        return this.f17516e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5316d.class != obj.getClass()) {
            return false;
        }
        C5316d dVar = (C5316d) obj;
        if (this.f17512a == dVar.f17512a && this.f17513b == dVar.f17513b && this.f17514c == dVar.f17514c && this.f17515d == dVar.f17515d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((527 + this.f17512a) * 31) + this.f17513b) * 31) + this.f17514c) * 31) + this.f17515d;
    }
}
