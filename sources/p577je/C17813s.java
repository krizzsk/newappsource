package p577je;

import p577je.C17746a0;

/* renamed from: je.s */
public final class C17813s extends C17746a0.C17753e.C17759d.C17774c {

    /* renamed from: a */
    public final Double f45745a;

    /* renamed from: b */
    public final int f45746b;

    /* renamed from: c */
    public final boolean f45747c;

    /* renamed from: d */
    public final int f45748d;

    /* renamed from: e */
    public final long f45749e;

    /* renamed from: f */
    public final long f45750f;

    /* renamed from: je.s$a */
    public static final class C17814a extends C17746a0.C17753e.C17759d.C17774c.C17775a {

        /* renamed from: a */
        public Double f45751a;

        /* renamed from: b */
        public Integer f45752b;

        /* renamed from: c */
        public Boolean f45753c;

        /* renamed from: d */
        public Integer f45754d;

        /* renamed from: e */
        public Long f45755e;

        /* renamed from: f */
        public Long f45756f;

        /* renamed from: a */
        public final C17813s mo50381a() {
            String str;
            if (this.f45752b == null) {
                str = " batteryVelocity";
            } else {
                str = "";
            }
            if (this.f45753c == null) {
                str = C25541a.m63881k(str, " proximityOn");
            }
            if (this.f45754d == null) {
                str = C25541a.m63881k(str, " orientation");
            }
            if (this.f45755e == null) {
                str = C25541a.m63881k(str, " ramUsed");
            }
            if (this.f45756f == null) {
                str = C25541a.m63881k(str, " diskUsed");
            }
            if (str.isEmpty()) {
                return new C17813s(this.f45751a, this.f45752b.intValue(), this.f45753c.booleanValue(), this.f45754d.intValue(), this.f45755e.longValue(), this.f45756f.longValue());
            }
            throw new IllegalStateException(C25541a.m63881k("Missing required properties:", str));
        }
    }

    public C17813s(Double d, int i, boolean z, int i2, long j, long j2) {
        this.f45745a = d;
        this.f45746b = i;
        this.f45747c = z;
        this.f45748d = i2;
        this.f45749e = j;
        this.f45750f = j2;
    }

    /* renamed from: a */
    public final Double mo50258a() {
        return this.f45745a;
    }

    /* renamed from: b */
    public final int mo50259b() {
        return this.f45746b;
    }

    /* renamed from: c */
    public final long mo50260c() {
        return this.f45750f;
    }

    /* renamed from: d */
    public final int mo50261d() {
        return this.f45748d;
    }

    /* renamed from: e */
    public final long mo50262e() {
        return this.f45749e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17746a0.C17753e.C17759d.C17774c)) {
            return false;
        }
        C17746a0.C17753e.C17759d.C17774c cVar = (C17746a0.C17753e.C17759d.C17774c) obj;
        Double d = this.f45745a;
        if (d != null ? d.equals(cVar.mo50258a()) : cVar.mo50258a() == null) {
            if (this.f45746b == cVar.mo50259b() && this.f45747c == cVar.mo50263f() && this.f45748d == cVar.mo50261d() && this.f45749e == cVar.mo50262e() && this.f45750f == cVar.mo50260c()) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo50263f() {
        return this.f45747c;
    }

    public final int hashCode() {
        int i;
        int i2;
        Double d = this.f45745a;
        if (d == null) {
            i = 0;
        } else {
            i = d.hashCode();
        }
        int i3 = (((i ^ 1000003) * 1000003) ^ this.f45746b) * 1000003;
        if (this.f45747c) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        long j = this.f45749e;
        long j2 = this.f45750f;
        return ((((((i3 ^ i2) * 1000003) ^ this.f45748d) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Device{batteryLevel=");
        k.append(this.f45745a);
        k.append(", batteryVelocity=");
        k.append(this.f45746b);
        k.append(", proximityOn=");
        k.append(this.f45747c);
        k.append(", orientation=");
        k.append(this.f45748d);
        k.append(", ramUsed=");
        k.append(this.f45749e);
        k.append(", diskUsed=");
        return C25541a.m63884o(k, this.f45750f, "}");
    }
}
