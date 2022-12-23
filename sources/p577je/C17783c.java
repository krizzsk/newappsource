package p577je;

import p001a0.C0016g;
import p577je.C17746a0;

/* renamed from: je.c */
public final class C17783c extends C17746a0.C17747a {

    /* renamed from: a */
    public final int f45611a;

    /* renamed from: b */
    public final String f45612b;

    /* renamed from: c */
    public final int f45613c;

    /* renamed from: d */
    public final int f45614d;

    /* renamed from: e */
    public final long f45615e;

    /* renamed from: f */
    public final long f45616f;

    /* renamed from: g */
    public final long f45617g;

    /* renamed from: h */
    public final String f45618h;

    /* renamed from: je.c$a */
    public static final class C17784a extends C17746a0.C17747a.C17748a {

        /* renamed from: a */
        public Integer f45619a;

        /* renamed from: b */
        public String f45620b;

        /* renamed from: c */
        public Integer f45621c;

        /* renamed from: d */
        public Integer f45622d;

        /* renamed from: e */
        public Long f45623e;

        /* renamed from: f */
        public Long f45624f;

        /* renamed from: g */
        public Long f45625g;

        /* renamed from: h */
        public String f45626h;

        /* renamed from: a */
        public final C17783c mo50302a() {
            String str;
            if (this.f45619a == null) {
                str = " pid";
            } else {
                str = "";
            }
            if (this.f45620b == null) {
                str = C25541a.m63881k(str, " processName");
            }
            if (this.f45621c == null) {
                str = C25541a.m63881k(str, " reasonCode");
            }
            if (this.f45622d == null) {
                str = C25541a.m63881k(str, " importance");
            }
            if (this.f45623e == null) {
                str = C25541a.m63881k(str, " pss");
            }
            if (this.f45624f == null) {
                str = C25541a.m63881k(str, " rss");
            }
            if (this.f45625g == null) {
                str = C25541a.m63881k(str, " timestamp");
            }
            if (str.isEmpty()) {
                return new C17783c(this.f45619a.intValue(), this.f45620b, this.f45621c.intValue(), this.f45622d.intValue(), this.f45623e.longValue(), this.f45624f.longValue(), this.f45625g.longValue(), this.f45626h);
            }
            throw new IllegalStateException(C25541a.m63881k("Missing required properties:", str));
        }
    }

    public C17783c(int i, String str, int i2, int i3, long j, long j2, long j3, String str2) {
        this.f45611a = i;
        this.f45612b = str;
        this.f45613c = i2;
        this.f45614d = i3;
        this.f45615e = j;
        this.f45616f = j2;
        this.f45617g = j3;
        this.f45618h = str2;
    }

    /* renamed from: a */
    public final int mo50179a() {
        return this.f45614d;
    }

    /* renamed from: b */
    public final int mo50180b() {
        return this.f45611a;
    }

    /* renamed from: c */
    public final String mo50181c() {
        return this.f45612b;
    }

    /* renamed from: d */
    public final long mo50182d() {
        return this.f45615e;
    }

    /* renamed from: e */
    public final int mo50183e() {
        return this.f45613c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17746a0.C17747a)) {
            return false;
        }
        C17746a0.C17747a aVar = (C17746a0.C17747a) obj;
        if (this.f45611a == aVar.mo50180b() && this.f45612b.equals(aVar.mo50181c()) && this.f45613c == aVar.mo50183e() && this.f45614d == aVar.mo50179a() && this.f45615e == aVar.mo50182d() && this.f45616f == aVar.mo50184f() && this.f45617g == aVar.mo50185g()) {
            String str = this.f45618h;
            if (str == null) {
                if (aVar.mo50186h() == null) {
                    return true;
                }
            } else if (str.equals(aVar.mo50186h())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final long mo50184f() {
        return this.f45616f;
    }

    /* renamed from: g */
    public final long mo50185g() {
        return this.f45617g;
    }

    /* renamed from: h */
    public final String mo50186h() {
        return this.f45618h;
    }

    public final int hashCode() {
        int i;
        long j = this.f45615e;
        long j2 = this.f45616f;
        long j3 = this.f45617g;
        int hashCode = (((((((((((((this.f45611a ^ 1000003) * 1000003) ^ this.f45612b.hashCode()) * 1000003) ^ this.f45613c) * 1000003) ^ this.f45614d) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str = this.f45618h;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("ApplicationExitInfo{pid=");
        k.append(this.f45611a);
        k.append(", processName=");
        k.append(this.f45612b);
        k.append(", reasonCode=");
        k.append(this.f45613c);
        k.append(", importance=");
        k.append(this.f45614d);
        k.append(", pss=");
        k.append(this.f45615e);
        k.append(", rss=");
        k.append(this.f45616f);
        k.append(", timestamp=");
        k.append(this.f45617g);
        k.append(", traceFile=");
        return C0016g.m31o(k, this.f45618h, "}");
    }
}
