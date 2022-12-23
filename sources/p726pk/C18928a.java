package p726pk;

import ce0.C21100e;
import com.masabi.justride.sdk.exception.config.SdkConfigurationException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: pk.a */
public final class C18928a {

    /* renamed from: a */
    public final String f48174a;

    /* renamed from: b */
    public final String f48175b;

    /* renamed from: c */
    public final String f48176c;

    /* renamed from: d */
    public final List<String> f48177d;

    /* renamed from: e */
    public final String f48178e;

    /* renamed from: f */
    public final String f48179f;

    /* renamed from: g */
    public final List<String> f48180g;

    /* renamed from: h */
    public final List<String> f48181h;

    /* renamed from: i */
    public final String f48182i;

    /* renamed from: j */
    public final String f48183j;

    /* renamed from: k */
    public final String f48184k;

    /* renamed from: l */
    public final String f48185l;

    /* renamed from: m */
    public final String f48186m;

    /* renamed from: n */
    public final boolean f48187n;

    /* renamed from: o */
    public final String f48188o;

    /* renamed from: p */
    public final String f48189p;

    /* renamed from: q */
    public final String f48190q;

    /* renamed from: r */
    public final boolean f48191r;

    /* renamed from: pk.a$a */
    public static class C18929a {

        /* renamed from: a */
        public String f48192a;

        /* renamed from: b */
        public String f48193b;

        /* renamed from: c */
        public String f48194c;

        /* renamed from: d */
        public List<String> f48195d;

        /* renamed from: e */
        public String f48196e;

        /* renamed from: f */
        public String f48197f;

        /* renamed from: g */
        public List<String> f48198g;

        /* renamed from: h */
        public List<String> f48199h;

        /* renamed from: i */
        public String f48200i;

        /* renamed from: j */
        public String f48201j;

        /* renamed from: k */
        public String f48202k;

        /* renamed from: l */
        public String f48203l;

        /* renamed from: m */
        public String f48204m;

        /* renamed from: n */
        public boolean f48205n = false;

        /* renamed from: o */
        public String f48206o;

        /* renamed from: p */
        public String f48207p;

        /* renamed from: q */
        public String f48208q;

        /* renamed from: r */
        public boolean f48209r = false;

        /* renamed from: a */
        public final C18928a mo51445a() throws SdkConfigurationException {
            if (C21100e.m49352m0(this.f48192a)) {
                throw new SdkConfigurationException("brand id value cannot be null or empty");
            } else if (C21100e.m49352m0(this.f48193b)) {
                throw new SdkConfigurationException("environment value cannot be null or empty");
            } else if (C21100e.m49352m0(this.f48194c)) {
                throw new SdkConfigurationException("hostname value cannot be null or empty");
            } else if (this.f48195d != null) {
                if (this.f48206o == null) {
                    this.f48206o = this.f48192a;
                }
                if (this.f48198g == null) {
                    this.f48198g = Collections.emptyList();
                }
                if (this.f48199h == null) {
                    this.f48199h = Collections.emptyList();
                }
                if (C21100e.m49352m0(this.f48201j)) {
                    throw new SdkConfigurationException("time zone cannot be null or empty");
                } else if (!C21100e.m49352m0(this.f48200i)) {
                    C18928a aVar = r2;
                    C18928a aVar2 = new C18928a(this.f48192a, this.f48193b, this.f48194c, this.f48195d, this.f48196e, this.f48197f, this.f48198g, this.f48199h, this.f48200i, this.f48201j, this.f48202k, this.f48203l, this.f48204m, this.f48205n, this.f48206o, this.f48207p, this.f48208q, this.f48209r);
                    return aVar;
                } else {
                    throw new SdkConfigurationException("network key cannot be null or empty");
                }
            } else {
                throw new SdkConfigurationException("certificate pins value cannot be null");
            }
        }
    }

    public C18928a() {
        throw null;
    }

    public C18928a(String str, String str2, String str3, List list, String str4, String str5, List list2, List list3, String str6, String str7, String str8, String str9, String str10, boolean z, String str11, String str12, String str13, boolean z2) {
        this.f48174a = str;
        this.f48175b = str2;
        this.f48176c = str3;
        this.f48177d = list;
        this.f48178e = str4;
        this.f48179f = str5;
        this.f48180g = list2;
        this.f48181h = list3;
        this.f48182i = str6;
        this.f48183j = str7;
        this.f48184k = str8;
        this.f48185l = str9;
        this.f48186m = str10;
        this.f48187n = z;
        this.f48188o = str11;
        this.f48189p = str12;
        this.f48190q = str13;
        this.f48191r = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18928a.class != obj.getClass()) {
            return false;
        }
        C18928a aVar = (C18928a) obj;
        if (this.f48187n != aVar.f48187n || this.f48191r != aVar.f48191r || !this.f48174a.equals(aVar.f48174a) || !this.f48175b.equals(aVar.f48175b) || !this.f48176c.equals(aVar.f48176c) || !this.f48177d.equals(aVar.f48177d) || !Objects.equals(this.f48178e, aVar.f48178e) || !Objects.equals(this.f48179f, aVar.f48179f) || !this.f48180g.equals(aVar.f48180g) || !this.f48181h.equals(aVar.f48181h) || !this.f48182i.equals(aVar.f48182i) || !this.f48183j.equals(aVar.f48183j) || !Objects.equals(this.f48184k, aVar.f48184k) || !Objects.equals(this.f48185l, aVar.f48185l) || !Objects.equals(this.f48186m, aVar.f48186m) || !this.f48188o.equals(aVar.f48188o) || !Objects.equals(this.f48189p, aVar.f48189p) || !Objects.equals(this.f48190q, aVar.f48190q)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f48174a, this.f48175b, this.f48176c, this.f48177d, this.f48178e, this.f48179f, this.f48180g, this.f48181h, this.f48182i, this.f48183j, this.f48184k, this.f48185l, this.f48186m, Boolean.valueOf(this.f48187n), this.f48188o, this.f48189p, this.f48190q, Boolean.valueOf(this.f48191r)});
    }
}
