package p077f;

import p077f.C4628f;

/* renamed from: f.i */
public final class C4632i extends C4628f {

    /* renamed from: a */
    public final String f15851a;

    /* renamed from: b */
    public final String f15852b;

    /* renamed from: c */
    public final boolean f15853c;

    /* renamed from: f.i$a */
    public static final class C4633a extends C4628f.C4629a {

        /* renamed from: a */
        public String f15854a;

        /* renamed from: b */
        public String f15855b;

        /* renamed from: c */
        public Boolean f15856c;

        /* renamed from: a */
        public final C4632i mo20155a() {
            String str;
            if (this.f15854a == null) {
                str = " id";
            } else {
                str = "";
            }
            if (this.f15855b == null) {
                str = C25541a.m63881k(str, " providerPackageName");
            }
            if (this.f15856c == null) {
                str = C25541a.m63881k(str, " limitAdTrackingEnabled");
            }
            if (str.isEmpty()) {
                return new C4632i(this.f15854a, this.f15855b, this.f15856c.booleanValue());
            }
            throw new IllegalStateException(C25541a.m63881k("Missing required properties:", str));
        }
    }

    public C4632i(String str, String str2, boolean z) {
        this.f15851a = str;
        this.f15852b = str2;
        this.f15853c = z;
    }

    /* renamed from: a */
    public final String mo20146a() {
        return this.f15851a;
    }

    /* renamed from: b */
    public final String mo20147b() {
        return this.f15852b;
    }

    /* renamed from: c */
    public final boolean mo20148c() {
        return this.f15853c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4628f)) {
            return false;
        }
        C4628f fVar = (C4628f) obj;
        if (!this.f15851a.equals(fVar.mo20146a()) || !this.f15852b.equals(fVar.mo20147b()) || this.f15853c != fVar.mo20148c()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.f15851a.hashCode() ^ 1000003) * 1000003) ^ this.f15852b.hashCode()) * 1000003;
        if (this.f15853c) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("AdvertisingIdInfo{id=");
        k.append(this.f15851a);
        k.append(", providerPackageName=");
        k.append(this.f15852b);
        k.append(", limitAdTrackingEnabled=");
        return C25541a.m63885p(k, this.f15853c, "}");
    }
}
