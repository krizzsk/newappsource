package p099ga;

import android.net.Uri;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p277ub.C6774a0;

/* renamed from: ga.j0 */
public final class C4901j0 {

    /* renamed from: a */
    public final String f16536a;

    /* renamed from: b */
    public final C4907f f16537b;

    /* renamed from: c */
    public final C4906e f16538c;

    /* renamed from: d */
    public final C4910k0 f16539d;

    /* renamed from: e */
    public final C4904c f16540e;

    /* renamed from: ga.j0$a */
    public static final class C4902a {
        public final int hashCode() {
            throw null;
        }
    }

    /* renamed from: ga.j0$b */
    public static final class C4903b {

        /* renamed from: a */
        public String f16541a;

        /* renamed from: b */
        public Uri f16542b;

        /* renamed from: c */
        public Map<String, String> f16543c = Collections.emptyMap();

        /* renamed from: d */
        public List<Integer> f16544d = Collections.emptyList();

        /* renamed from: e */
        public List<StreamKey> f16545e = Collections.emptyList();

        /* renamed from: f */
        public List<Object> f16546f = Collections.emptyList();

        /* renamed from: g */
        public long f16547g = -9223372036854775807L;

        /* renamed from: h */
        public long f16548h = -9223372036854775807L;

        /* renamed from: i */
        public long f16549i = -9223372036854775807L;

        /* renamed from: j */
        public float f16550j = -3.4028235E38f;

        /* renamed from: k */
        public float f16551k = -3.4028235E38f;

        /* renamed from: a */
        public final C4901j0 mo20542a() {
            C4907f fVar;
            Uri uri = this.f16542b;
            if (uri != null) {
                fVar = new C4907f(uri, (String) null, (C4905d) null, (C4902a) null, this.f16545e, (String) null, this.f16546f, (Object) null);
            } else {
                fVar = null;
            }
            String str = this.f16541a;
            if (str == null) {
                str = "";
            }
            return new C4901j0(str, new C4904c(0, Long.MIN_VALUE, false, false, false), fVar, new C4906e(this.f16547g, this.f16548h, this.f16549i, this.f16550j, this.f16551k), C4910k0.f16574q);
        }
    }

    /* renamed from: ga.j0$c */
    public static final class C4904c {

        /* renamed from: a */
        public final long f16552a;

        /* renamed from: b */
        public final long f16553b;

        /* renamed from: c */
        public final boolean f16554c;

        /* renamed from: d */
        public final boolean f16555d;

        /* renamed from: e */
        public final boolean f16556e;

        public C4904c(long j, long j2, boolean z, boolean z2, boolean z3) {
            this.f16552a = j;
            this.f16553b = j2;
            this.f16554c = z;
            this.f16555d = z2;
            this.f16556e = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C4904c)) {
                return false;
            }
            C4904c cVar = (C4904c) obj;
            if (this.f16552a == cVar.f16552a && this.f16553b == cVar.f16553b && this.f16554c == cVar.f16554c && this.f16555d == cVar.f16555d && this.f16556e == cVar.f16556e) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            long j = this.f16552a;
            long j2 = this.f16553b;
            return (((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f16554c ? 1 : 0)) * 31) + (this.f16555d ? 1 : 0)) * 31) + (this.f16556e ? 1 : 0);
        }
    }

    /* renamed from: ga.j0$d */
    public static final class C4905d {
        public final int hashCode() {
            throw null;
        }
    }

    /* renamed from: ga.j0$e */
    public static final class C4906e {

        /* renamed from: a */
        public final long f16557a;

        /* renamed from: b */
        public final long f16558b;

        /* renamed from: c */
        public final long f16559c;

        /* renamed from: d */
        public final float f16560d;

        /* renamed from: e */
        public final float f16561e;

        public C4906e(long j, long j2, long j3, float f, float f2) {
            this.f16557a = j;
            this.f16558b = j2;
            this.f16559c = j3;
            this.f16560d = f;
            this.f16561e = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C4906e)) {
                return false;
            }
            C4906e eVar = (C4906e) obj;
            if (this.f16557a == eVar.f16557a && this.f16558b == eVar.f16558b && this.f16559c == eVar.f16559c && this.f16560d == eVar.f16560d && this.f16561e == eVar.f16561e) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i;
            long j = this.f16557a;
            long j2 = this.f16558b;
            long j3 = this.f16559c;
            int i2 = ((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            float f = this.f16560d;
            int i3 = 0;
            if (f != BitmapDescriptorFactory.HUE_RED) {
                i = Float.floatToIntBits(f);
            } else {
                i = 0;
            }
            int i4 = (i2 + i) * 31;
            float f2 = this.f16561e;
            if (f2 != BitmapDescriptorFactory.HUE_RED) {
                i3 = Float.floatToIntBits(f2);
            }
            return i4 + i3;
        }
    }

    /* renamed from: ga.j0$f */
    public static final class C4907f {

        /* renamed from: a */
        public final Uri f16562a;

        /* renamed from: b */
        public final String f16563b;

        /* renamed from: c */
        public final List<StreamKey> f16564c;

        /* renamed from: d */
        public final String f16565d;

        /* renamed from: e */
        public final List<Object> f16566e;

        /* renamed from: f */
        public final Object f16567f;

        public C4907f() {
            throw null;
        }

        public C4907f(Uri uri, String str, C4905d dVar, C4902a aVar, List list, String str2, List list2, Object obj) {
            this.f16562a = uri;
            this.f16563b = str;
            this.f16564c = list;
            this.f16565d = str2;
            this.f16566e = list2;
            this.f16567f = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C4907f)) {
                return false;
            }
            C4907f fVar = (C4907f) obj;
            if (this.f16562a.equals(fVar.f16562a) && C6774a0.m15941a(this.f16563b, fVar.f16563b)) {
                fVar.getClass();
                if (C6774a0.m15941a((Object) null, (Object) null)) {
                    fVar.getClass();
                    if (!C6774a0.m15941a((Object) null, (Object) null) || !this.f16564c.equals(fVar.f16564c) || !C6774a0.m15941a(this.f16565d, fVar.f16565d) || !this.f16566e.equals(fVar.f16566e) || !C6774a0.m15941a(this.f16567f, fVar.f16567f)) {
                        return false;
                    }
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i;
            int i2;
            int hashCode = this.f16562a.hashCode() * 31;
            String str = this.f16563b;
            int i3 = 0;
            if (str == null) {
                i = 0;
            } else {
                i = str.hashCode();
            }
            int hashCode2 = (this.f16564c.hashCode() + ((((((hashCode + i) * 31) + 0) * 31) + 0) * 31)) * 31;
            String str2 = this.f16565d;
            if (str2 == null) {
                i2 = 0;
            } else {
                i2 = str2.hashCode();
            }
            int hashCode3 = (this.f16566e.hashCode() + ((hashCode2 + i2) * 31)) * 31;
            Object obj = this.f16567f;
            if (obj != null) {
                i3 = obj.hashCode();
            }
            return hashCode3 + i3;
        }
    }

    public C4901j0(String str, C4904c cVar, C4907f fVar, C4906e eVar, C4910k0 k0Var) {
        this.f16536a = str;
        this.f16537b = fVar;
        this.f16538c = eVar;
        this.f16539d = k0Var;
        this.f16540e = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4901j0)) {
            return false;
        }
        C4901j0 j0Var = (C4901j0) obj;
        if (!C6774a0.m15941a(this.f16536a, j0Var.f16536a) || !this.f16540e.equals(j0Var.f16540e) || !C6774a0.m15941a(this.f16537b, j0Var.f16537b) || !C6774a0.m15941a(this.f16538c, j0Var.f16538c) || !C6774a0.m15941a(this.f16539d, j0Var.f16539d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f16536a.hashCode() * 31;
        C4907f fVar = this.f16537b;
        if (fVar != null) {
            i = fVar.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = this.f16538c.hashCode();
        int hashCode3 = this.f16540e.hashCode();
        return this.f16539d.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + i) * 31)) * 31)) * 31);
    }
}
