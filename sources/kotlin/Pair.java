package kotlin;

import java.io.Serializable;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00060\u0003j\u0002`\u0004R\u0017\u0010\u0005\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, mo59060d2 = {"Lkotlin/Pair;", "A", "B", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "first", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "second", "d", "kotlin-stdlib"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class Pair<A, B> implements Serializable {
    private final A first;
    private final B second;

    public Pair(A a, B b) {
        this.first = a;
        this.second = b;
    }

    /* renamed from: a */
    public final A mo59066a() {
        return this.first;
    }

    /* renamed from: b */
    public final B mo59067b() {
        return this.second;
    }

    /* renamed from: c */
    public final A mo59068c() {
        return this.first;
    }

    /* renamed from: d */
    public final B mo59069d() {
        return this.second;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return C24362h.m61206a(this.first, pair.first) && C24362h.m61206a(this.second, pair.second);
    }

    public final int hashCode() {
        A a = this.first;
        int i = 0;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.second;
        if (b != null) {
            i = b.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder q = C25541a.m63886q('(');
        q.append(this.first);
        q.append(", ");
        q.append(this.second);
        q.append(')');
        return q.toString();
    }
}
