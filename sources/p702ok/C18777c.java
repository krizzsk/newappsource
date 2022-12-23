package p702ok;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Objects;
import p634ln.C18247a;

/* renamed from: ok.c */
public final class C18777c {

    /* renamed from: a */
    public final Integer f47792a;

    /* renamed from: b */
    public final String f47793b;

    /* renamed from: c */
    public final String f47794c;

    /* renamed from: d */
    public final String f47795d;

    /* renamed from: e */
    public final String f47796e;

    /* renamed from: f */
    public final String f47797f;

    /* renamed from: g */
    public final BigDecimal f47798g;

    /* renamed from: h */
    public final BigDecimal f47799h;

    /* renamed from: i */
    public final boolean f47800i;

    /* renamed from: j */
    public final boolean f47801j;

    /* renamed from: k */
    public final Map<String, String> f47802k;

    public C18777c(Integer num, String str, String str2, String str3, String str4, String str5, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, boolean z2, Map<String, String> map) {
        this.f47792a = num;
        this.f47793b = str;
        this.f47794c = str2;
        this.f47795d = str3;
        this.f47796e = str4;
        this.f47797f = str5;
        this.f47798g = bigDecimal;
        this.f47799h = bigDecimal2;
        this.f47800i = z;
        this.f47801j = z2;
        this.f47802k = map;
    }

    /* renamed from: a */
    public final C18247a mo51257a() {
        return new C18247a(this.f47792a, this.f47793b, this.f47794c, this.f47795d, this.f47796e, this.f47797f, this.f47798g, this.f47799h, this.f47800i, this.f47801j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18777c.class != obj.getClass()) {
            return false;
        }
        C18777c cVar = (C18777c) obj;
        if (this.f47800i != cVar.f47800i || this.f47801j != cVar.f47801j || !Objects.equals(this.f47792a, cVar.f47792a) || !Objects.equals(this.f47793b, cVar.f47793b) || !Objects.equals(this.f47794c, cVar.f47794c) || !Objects.equals(this.f47795d, cVar.f47795d) || !Objects.equals(this.f47796e, cVar.f47796e) || !Objects.equals(this.f47797f, cVar.f47797f) || !Objects.equals(this.f47798g, cVar.f47798g) || !Objects.equals(this.f47799h, cVar.f47799h) || !Objects.equals(this.f47802k, cVar.f47802k)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f47792a, this.f47793b, this.f47794c, this.f47795d, this.f47796e, this.f47797f, this.f47798g, this.f47799h, Boolean.valueOf(this.f47800i), Boolean.valueOf(this.f47801j), this.f47802k});
    }
}
