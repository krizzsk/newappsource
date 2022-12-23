package od0;

import java.util.UUID;

/* renamed from: od0.a */
public final class C24543a {

    /* renamed from: a */
    public final String f62167a;

    /* renamed from: b */
    public final String f62168b;

    /* renamed from: c */
    public String f62169c;

    /* renamed from: d */
    public final String f62170d;

    /* renamed from: e */
    public final String f62171e;

    /* renamed from: f */
    public int f62172f;

    /* renamed from: g */
    public int f62173g;

    /* renamed from: h */
    public long f62174h;

    /* renamed from: i */
    public int f62175i;

    /* renamed from: j */
    public int f62176j;

    public C24543a(String str, String str2, String str3) {
        this(str, str2, str3, UUID.randomUUID().toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C24543a.class != obj.getClass()) {
            return false;
        }
        C24543a aVar = (C24543a) obj;
        if (this.f62172f != aVar.f62172f || this.f62173g != aVar.f62173g || this.f62174h != aVar.f62174h || this.f62175i != aVar.f62175i || this.f62176j != aVar.f62176j) {
            return false;
        }
        String str = this.f62167a;
        if (str == null ? aVar.f62167a != null : !str.equals(aVar.f62167a)) {
            return false;
        }
        String str2 = this.f62168b;
        if (str2 == null ? aVar.f62168b != null : !str2.equals(aVar.f62168b)) {
            return false;
        }
        String str3 = this.f62169c;
        if (str3 == null ? aVar.f62169c != null : !str3.equals(aVar.f62169c)) {
            return false;
        }
        String str4 = this.f62170d;
        if (str4 == null ? aVar.f62170d != null : !str4.equals(aVar.f62170d)) {
            return false;
        }
        String str5 = this.f62171e;
        String str6 = aVar.f62171e;
        if (str5 != null) {
            return str5.equals(str6);
        }
        if (str6 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        String str = this.f62167a;
        int i5 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        String str2 = this.f62168b;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        String str3 = this.f62169c;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        String str4 = this.f62170d;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        String str5 = this.f62171e;
        if (str5 != null) {
            i5 = str5.hashCode();
        }
        long j = this.f62174h;
        return ((((((((((i9 + i5) * 31) + this.f62172f) * 31) + this.f62173g) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f62175i) * 31) + this.f62176j;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("AdAsset{identifier='");
        C25541a.m63890u(k, this.f62167a, '\'', ", adIdentifier='");
        C25541a.m63890u(k, this.f62168b, '\'', ", serverPath='");
        C25541a.m63890u(k, this.f62170d, '\'', ", localPath='");
        C25541a.m63890u(k, this.f62171e, '\'', ", status=");
        k.append(this.f62172f);
        k.append(", fileType=");
        k.append(this.f62173g);
        k.append(", fileSize=");
        k.append(this.f62174h);
        k.append(", retryCount=");
        k.append(this.f62175i);
        k.append(", retryTypeError=");
        return C16530d.m42014g(k, this.f62176j, '}');
    }

    public C24543a(String str, String str2, String str3, String str4) {
        this.f62167a = str4;
        this.f62168b = str;
        this.f62170d = str2;
        this.f62171e = str3;
        this.f62174h = -1;
        this.f62175i = 0;
        this.f62176j = 0;
    }
}
