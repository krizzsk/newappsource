package kotlin;

import java.io.Serializable;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\u00060\u0004j\u0002`\u0005R\u0017\u0010\u0006\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u0017\u0010\f\u001a\u00028\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\t¨\u0006\u000e"}, mo59060d2 = {"Lkotlin/Triple;", "A", "B", "C", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "first", "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "second", "e", "third", "f", "kotlin-stdlib"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class Triple<A, B, C> implements Serializable {
    private final A first;
    private final B second;
    private final C third;

    public Triple(A a, B b, C c) {
        this.first = a;
        this.second = b;
        this.third = c;
    }

    /* renamed from: a */
    public final A mo59082a() {
        return this.first;
    }

    /* renamed from: b */
    public final B mo59083b() {
        return this.second;
    }

    /* renamed from: c */
    public final C mo59084c() {
        return this.third;
    }

    /* renamed from: d */
    public final A mo59085d() {
        return this.first;
    }

    /* renamed from: e */
    public final B mo59086e() {
        return this.second;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Triple)) {
            return false;
        }
        Triple triple = (Triple) obj;
        return C24362h.m61206a(this.first, triple.first) && C24362h.m61206a(this.second, triple.second) && C24362h.m61206a(this.third, triple.third);
    }

    /* renamed from: f */
    public final C mo59088f() {
        return this.third;
    }

    public final int hashCode() {
        A a = this.first;
        int i = 0;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.second;
        int hashCode2 = (hashCode + (b == null ? 0 : b.hashCode())) * 31;
        C c = this.third;
        if (c != null) {
            i = c.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder q = C25541a.m63886q('(');
        q.append(this.first);
        q.append(", ");
        q.append(this.second);
        q.append(", ");
        q.append(this.third);
        q.append(')');
        return q.toString();
    }
}
