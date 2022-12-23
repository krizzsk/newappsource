package p725pj;

import java.util.Objects;

/* renamed from: pj.a */
public class C18926a {

    /* renamed from: a */
    public final String f48169a;

    /* renamed from: b */
    public final Integer f48170b;

    /* renamed from: c */
    public final String f48171c;

    /* renamed from: d */
    public final C18926a f48172d;

    public C18926a() {
        throw null;
    }

    public C18926a(String str, Integer num, String str2, C18926a aVar) {
        this.f48169a = str;
        this.f48170b = num;
        this.f48171c = str2;
        this.f48172d = aVar;
    }

    /* renamed from: a */
    public final boolean mo51438a(int i, String str) {
        C18926a aVar;
        if ((!this.f48169a.equals(str) || this.f48170b.intValue() != i) && ((aVar = this.f48172d) == null || !aVar.mo51438a(i, str))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final String mo51439b() {
        String str;
        StringBuilder sb = new StringBuilder();
        for (C18926a aVar = this; aVar != null; aVar = aVar.f48172d) {
            if (sb.length() > 0) {
                sb.append(", caused by ");
            }
            String str2 = aVar.f48171c;
            if (str2 == null) {
                str = String.format("{%s[%s]}", new Object[]{aVar.f48169a, aVar.f48170b});
            } else {
                str = String.format("{%s[%s]: %s}", new Object[]{aVar.f48169a, aVar.f48170b, str2});
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C18926a aVar = (C18926a) obj;
        if (!this.f48169a.equals(aVar.f48169a) || !this.f48170b.equals(aVar.f48170b) || !Objects.equals(this.f48171c, aVar.f48171c) || !Objects.equals(this.f48172d, aVar.f48172d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f48169a, this.f48170b, this.f48171c, this.f48172d});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{domain='");
        C25541a.m63890u(sb, this.f48169a, '\'', ", code=");
        sb.append(this.f48170b);
        sb.append(", description='");
        C25541a.m63890u(sb, this.f48171c, '\'', ", underlyingError=");
        sb.append(this.f48172d);
        sb.append('}');
        return sb.toString();
    }
}
