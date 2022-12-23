package p113hb;

import android.net.Uri;
import java.util.Arrays;
import p277ub.C6774a0;

/* renamed from: hb.a */
public final class C5213a {

    /* renamed from: g */
    public static final C5213a f17301g = new C5213a(new long[0]);

    /* renamed from: a */
    public final Object f17302a = null;

    /* renamed from: b */
    public final int f17303b;

    /* renamed from: c */
    public final long[] f17304c;

    /* renamed from: d */
    public final C5214a[] f17305d;

    /* renamed from: e */
    public final long f17306e;

    /* renamed from: f */
    public final long f17307f;

    /* renamed from: hb.a$a */
    public static final class C5214a {

        /* renamed from: a */
        public final int f17308a = -1;

        /* renamed from: b */
        public final Uri[] f17309b = new Uri[0];

        /* renamed from: c */
        public final int[] f17310c = new int[0];

        /* renamed from: d */
        public final long[] f17311d = new long[0];

        /* renamed from: a */
        public final int mo20993a(int i) {
            int i2;
            int i3 = i + 1;
            while (true) {
                int[] iArr = this.f17310c;
                if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                    return i3;
                }
                i3++;
            }
            return i3;
        }

        /* renamed from: b */
        public final boolean mo20994b() {
            if (this.f17308a == -1 || mo20993a(-1) < this.f17308a) {
                return true;
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C5214a.class != obj.getClass()) {
                return false;
            }
            C5214a aVar = (C5214a) obj;
            if (this.f17308a != aVar.f17308a || !Arrays.equals(this.f17309b, aVar.f17309b) || !Arrays.equals(this.f17310c, aVar.f17310c) || !Arrays.equals(this.f17311d, aVar.f17311d)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int hashCode = Arrays.hashCode(this.f17310c);
            return Arrays.hashCode(this.f17311d) + ((hashCode + (((this.f17308a * 31) + Arrays.hashCode(this.f17309b)) * 31)) * 31);
        }
    }

    public C5213a(long[] jArr) {
        this.f17304c = jArr;
        this.f17306e = 0;
        this.f17307f = -9223372036854775807L;
        int length = jArr.length;
        this.f17303b = length;
        C5214a[] aVarArr = new C5214a[length];
        for (int i = 0; i < this.f17303b; i++) {
            aVarArr[i] = new C5214a();
        }
        this.f17305d = aVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5213a.class != obj.getClass()) {
            return false;
        }
        C5213a aVar = (C5213a) obj;
        if (!C6774a0.m15941a(this.f17302a, aVar.f17302a) || this.f17303b != aVar.f17303b || this.f17306e != aVar.f17306e || this.f17307f != aVar.f17307f || !Arrays.equals(this.f17304c, aVar.f17304c) || !Arrays.equals(this.f17305d, aVar.f17305d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2 = this.f17303b * 31;
        Object obj = this.f17302a;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        int hashCode = Arrays.hashCode(this.f17304c);
        return Arrays.hashCode(this.f17305d) + ((hashCode + ((((((i2 + i) * 31) + ((int) this.f17306e)) * 31) + ((int) this.f17307f)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("AdPlaybackState(adsId=");
        k.append(this.f17302a);
        k.append(", adResumePositionUs=");
        k.append(this.f17306e);
        k.append(", adGroups=[");
        for (int i = 0; i < this.f17305d.length; i++) {
            k.append("adGroup(timeUs=");
            k.append(this.f17304c[i]);
            k.append(", ads=[");
            for (int i2 = 0; i2 < this.f17305d[i].f17310c.length; i2++) {
                k.append("ad(state=");
                int i3 = this.f17305d[i].f17310c[i2];
                if (i3 == 0) {
                    k.append('_');
                } else if (i3 == 1) {
                    k.append('R');
                } else if (i3 == 2) {
                    k.append('S');
                } else if (i3 == 3) {
                    k.append('P');
                } else if (i3 != 4) {
                    k.append('?');
                } else {
                    k.append('!');
                }
                k.append(", durationUs=");
                k.append(this.f17305d[i].f17311d[i2]);
                k.append(')');
                if (i2 < this.f17305d[i].f17310c.length - 1) {
                    k.append(", ");
                }
            }
            k.append("])");
            if (i < this.f17305d.length - 1) {
                k.append(", ");
            }
        }
        k.append("])");
        return k.toString();
    }
}
