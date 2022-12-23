package p275u9;

import java.util.Map;
import p275u9.C6743n;

/* renamed from: u9.h */
public final class C6735h extends C6743n {

    /* renamed from: a */
    public final String f20846a;

    /* renamed from: b */
    public final Integer f20847b;

    /* renamed from: c */
    public final C6742m f20848c;

    /* renamed from: d */
    public final long f20849d;

    /* renamed from: e */
    public final long f20850e;

    /* renamed from: f */
    public final Map<String, String> f20851f;

    /* renamed from: u9.h$a */
    public static final class C6736a extends C6743n.C6744a {

        /* renamed from: a */
        public String f20852a;

        /* renamed from: b */
        public Integer f20853b;

        /* renamed from: c */
        public C6742m f20854c;

        /* renamed from: d */
        public Long f20855d;

        /* renamed from: e */
        public Long f20856e;

        /* renamed from: f */
        public Map<String, String> f20857f;

        /* renamed from: b */
        public final C6735h mo22899b() {
            String str;
            if (this.f20852a == null) {
                str = " transportName";
            } else {
                str = "";
            }
            if (this.f20854c == null) {
                str = C25541a.m63881k(str, " encodedPayload");
            }
            if (this.f20855d == null) {
                str = C25541a.m63881k(str, " eventMillis");
            }
            if (this.f20856e == null) {
                str = C25541a.m63881k(str, " uptimeMillis");
            }
            if (this.f20857f == null) {
                str = C25541a.m63881k(str, " autoMetadata");
            }
            if (str.isEmpty()) {
                return new C6735h(this.f20852a, this.f20853b, this.f20854c, this.f20855d.longValue(), this.f20856e.longValue(), this.f20857f);
            }
            throw new IllegalStateException(C25541a.m63881k("Missing required properties:", str));
        }

        /* renamed from: c */
        public final C6736a mo22900c(C6742m mVar) {
            if (mVar != null) {
                this.f20854c = mVar;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        /* renamed from: d */
        public final C6736a mo22901d(String str) {
            if (str != null) {
                this.f20852a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }

    public C6735h(String str, Integer num, C6742m mVar, long j, long j2, Map map) {
        this.f20846a = str;
        this.f20847b = num;
        this.f20848c = mVar;
        this.f20849d = j;
        this.f20850e = j2;
        this.f20851f = map;
    }

    /* renamed from: b */
    public final Map<String, String> mo22890b() {
        return this.f20851f;
    }

    /* renamed from: c */
    public final Integer mo22891c() {
        return this.f20847b;
    }

    /* renamed from: d */
    public final C6742m mo22892d() {
        return this.f20848c;
    }

    /* renamed from: e */
    public final long mo22893e() {
        return this.f20849d;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6743n)) {
            return false;
        }
        C6743n nVar = (C6743n) obj;
        if (!this.f20846a.equals(nVar.mo22895g()) || ((num = this.f20847b) != null ? !num.equals(nVar.mo22891c()) : nVar.mo22891c() != null) || !this.f20848c.equals(nVar.mo22892d()) || this.f20849d != nVar.mo22893e() || this.f20850e != nVar.mo22896h() || !this.f20851f.equals(nVar.mo22890b())) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final String mo22895g() {
        return this.f20846a;
    }

    /* renamed from: h */
    public final long mo22896h() {
        return this.f20850e;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f20846a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f20847b;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        long j = this.f20849d;
        long j2 = this.f20850e;
        return ((((((((hashCode ^ i) * 1000003) ^ this.f20848c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f20851f.hashCode();
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("EventInternal{transportName=");
        k.append(this.f20846a);
        k.append(", code=");
        k.append(this.f20847b);
        k.append(", encodedPayload=");
        k.append(this.f20848c);
        k.append(", eventMillis=");
        k.append(this.f20849d);
        k.append(", uptimeMillis=");
        k.append(this.f20850e);
        k.append(", autoMetadata=");
        k.append(this.f20851f);
        k.append("}");
        return k.toString();
    }
}
