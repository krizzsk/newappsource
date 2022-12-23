package p081f3;

import android.os.Build;
import androidx.work.NetworkType;

/* renamed from: f3.b */
public final class C4648b {

    /* renamed from: i */
    public static final C4648b f15876i = new C4648b(new C4649a());

    /* renamed from: a */
    public NetworkType f15877a = NetworkType.NOT_REQUIRED;

    /* renamed from: b */
    public boolean f15878b;

    /* renamed from: c */
    public boolean f15879c;

    /* renamed from: d */
    public boolean f15880d;

    /* renamed from: e */
    public boolean f15881e;

    /* renamed from: f */
    public long f15882f = -1;

    /* renamed from: g */
    public long f15883g = -1;

    /* renamed from: h */
    public C4650c f15884h = new C4650c();

    /* renamed from: f3.b$a */
    public static final class C4649a {

        /* renamed from: a */
        public boolean f15885a = false;

        /* renamed from: b */
        public boolean f15886b = false;

        /* renamed from: c */
        public NetworkType f15887c = NetworkType.NOT_REQUIRED;

        /* renamed from: d */
        public boolean f15888d = false;

        /* renamed from: e */
        public long f15889e = -1;

        /* renamed from: f */
        public long f15890f = -1;

        /* renamed from: g */
        public C4650c f15891g = new C4650c();
    }

    public C4648b() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4648b.class != obj.getClass()) {
            return false;
        }
        C4648b bVar = (C4648b) obj;
        if (this.f15878b == bVar.f15878b && this.f15879c == bVar.f15879c && this.f15880d == bVar.f15880d && this.f15881e == bVar.f15881e && this.f15882f == bVar.f15882f && this.f15883g == bVar.f15883g && this.f15877a == bVar.f15877a) {
            return this.f15884h.equals(bVar.f15884h);
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f15882f;
        long j2 = this.f15883g;
        return this.f15884h.hashCode() + (((((((((((((this.f15877a.hashCode() * 31) + (this.f15878b ? 1 : 0)) * 31) + (this.f15879c ? 1 : 0)) * 31) + (this.f15880d ? 1 : 0)) * 31) + (this.f15881e ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public C4648b(C4649a aVar) {
        this.f15878b = aVar.f15885a;
        int i = Build.VERSION.SDK_INT;
        this.f15879c = i >= 23 && aVar.f15886b;
        this.f15877a = aVar.f15887c;
        this.f15880d = false;
        this.f15881e = aVar.f15888d;
        if (i >= 24) {
            this.f15884h = aVar.f15891g;
            this.f15882f = aVar.f15889e;
            this.f15883g = aVar.f15890f;
        }
    }

    public C4648b(C4648b bVar) {
        this.f15878b = bVar.f15878b;
        this.f15879c = bVar.f15879c;
        this.f15877a = bVar.f15877a;
        this.f15880d = bVar.f15880d;
        this.f15881e = bVar.f15881e;
        this.f15884h = bVar.f15884h;
    }
}
