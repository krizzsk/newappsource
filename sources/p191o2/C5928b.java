package p191o2;

import android.graphics.Color;
import java.util.Arrays;
import p129j1.C5348a;

/* renamed from: o2.b */
public final class C5928b {

    /* renamed from: a */
    public static final C5929a f19038a = new C5929a();

    /* renamed from: o2.b$a */
    public static class C5929a implements C5930b {
        /* renamed from: a */
        public final boolean mo21915a(float[] fArr) {
            boolean z;
            boolean z2;
            boolean z3;
            float f = fArr[2];
            if (f >= 0.95f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return false;
            }
            if (f <= 0.05f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return false;
            }
            float f2 = fArr[0];
            if (f2 < 10.0f || f2 > 37.0f || fArr[1] > 0.82f) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!z3) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: o2.b$b */
    public interface C5930b {
        /* renamed from: a */
        boolean mo21915a(float[] fArr);
    }

    /* renamed from: o2.b$c */
    public static final class C5931c {

        /* renamed from: a */
        public final int f19039a;

        /* renamed from: b */
        public final int f19040b;

        /* renamed from: c */
        public final int f19041c;

        /* renamed from: d */
        public final int f19042d;

        /* renamed from: e */
        public final int f19043e;

        /* renamed from: f */
        public boolean f19044f;

        /* renamed from: g */
        public int f19045g;

        /* renamed from: h */
        public int f19046h;

        /* renamed from: i */
        public float[] f19047i;

        public C5931c(int i, int i2) {
            this.f19039a = Color.red(i);
            this.f19040b = Color.green(i);
            this.f19041c = Color.blue(i);
            this.f19042d = i;
            this.f19043e = i2;
        }

        /* renamed from: a */
        public final void mo21916a() {
            int i;
            int i2;
            if (!this.f19044f) {
                int g = C5348a.m13411g(4.5f, -1, this.f19042d);
                int g2 = C5348a.m13411g(3.0f, -1, this.f19042d);
                if (g == -1 || g2 == -1) {
                    int g3 = C5348a.m13411g(4.5f, -16777216, this.f19042d);
                    int g4 = C5348a.m13411g(3.0f, -16777216, this.f19042d);
                    if (g3 == -1 || g4 == -1) {
                        if (g != -1) {
                            i = C5348a.m13417m(-1, g);
                        } else {
                            i = C5348a.m13417m(-16777216, g3);
                        }
                        this.f19046h = i;
                        if (g2 != -1) {
                            i2 = C5348a.m13417m(-1, g2);
                        } else {
                            i2 = C5348a.m13417m(-16777216, g4);
                        }
                        this.f19045g = i2;
                        this.f19044f = true;
                        return;
                    }
                    this.f19046h = C5348a.m13417m(-16777216, g3);
                    this.f19045g = C5348a.m13417m(-16777216, g4);
                    this.f19044f = true;
                    return;
                }
                this.f19046h = C5348a.m13417m(-1, g);
                this.f19045g = C5348a.m13417m(-1, g2);
                this.f19044f = true;
            }
        }

        /* renamed from: b */
        public final float[] mo21917b() {
            if (this.f19047i == null) {
                this.f19047i = new float[3];
            }
            C5348a.m13406b(this.f19039a, this.f19040b, this.f19041c, this.f19047i);
            return this.f19047i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C5931c.class != obj.getClass()) {
                return false;
            }
            C5931c cVar = (C5931c) obj;
            if (this.f19043e == cVar.f19043e && this.f19042d == cVar.f19042d) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (this.f19042d * 31) + this.f19043e;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(C5931c.class.getSimpleName());
            sb.append(" [RGB: #");
            sb.append(Integer.toHexString(this.f19042d));
            sb.append(']');
            sb.append(" [HSL: ");
            sb.append(Arrays.toString(mo21917b()));
            sb.append(']');
            sb.append(" [Population: ");
            sb.append(this.f19043e);
            sb.append(']');
            sb.append(" [Title Text: #");
            mo21916a();
            sb.append(Integer.toHexString(this.f19045g));
            sb.append(']');
            sb.append(" [Body Text: #");
            mo21916a();
            sb.append(Integer.toHexString(this.f19046h));
            sb.append(']');
            return sb.toString();
        }
    }
}
