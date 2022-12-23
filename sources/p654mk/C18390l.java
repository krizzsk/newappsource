package p654mk;

import java.util.Date;
import java.util.Objects;

/* renamed from: mk.l */
public final class C18390l {

    /* renamed from: a */
    public final Integer f46873a;

    /* renamed from: b */
    public final String f46874b;

    /* renamed from: c */
    public final String f46875c;

    /* renamed from: d */
    public final Date f46876d;

    /* renamed from: e */
    public final Date f46877e;

    /* renamed from: f */
    public final boolean f46878f;

    /* renamed from: g */
    public final String f46879g;

    /* renamed from: h */
    public final Integer f46880h;

    /* renamed from: i */
    public final String f46881i;

    /* renamed from: j */
    public final String f46882j;

    /* renamed from: k */
    public final String f46883k;

    /* renamed from: l */
    public final String f46884l;

    public C18390l(Integer num, String str, String str2, Date date, Date date2, boolean z, String str3, Integer num2, String str4, String str5, String str6, String str7) {
        this.f46873a = num;
        this.f46874b = str;
        this.f46875c = str2;
        this.f46876d = date;
        this.f46877e = date2;
        this.f46878f = z;
        this.f46879g = str3;
        this.f46880h = num2;
        this.f46881i = str4;
        this.f46882j = str5;
        this.f46883k = str6;
        this.f46884l = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18390l.class != obj.getClass()) {
            return false;
        }
        C18390l lVar = (C18390l) obj;
        if (this.f46878f != lVar.f46878f || !this.f46873a.equals(lVar.f46873a) || !this.f46874b.equals(lVar.f46874b) || !Objects.equals(this.f46875c, lVar.f46875c) || !Objects.equals(this.f46876d, lVar.f46876d) || !Objects.equals(this.f46877e, lVar.f46877e) || !this.f46879g.equals(lVar.f46879g) || !Objects.equals(this.f46880h, lVar.f46880h) || !Objects.equals(this.f46881i, lVar.f46881i) || !Objects.equals(this.f46882j, lVar.f46882j) || !Objects.equals(this.f46883k, lVar.f46883k) || !Objects.equals(this.f46884l, lVar.f46884l)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f46873a, this.f46874b, this.f46875c, this.f46876d, this.f46877e, Boolean.valueOf(this.f46878f), this.f46879g, this.f46880h, this.f46881i, this.f46882j, this.f46883k, this.f46884l});
    }
}
