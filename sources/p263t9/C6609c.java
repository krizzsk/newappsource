package p263t9;

import java.util.ArrayList;
import java.util.List;

/* renamed from: t9.c */
public final class C6609c extends C6614g {

    /* renamed from: a */
    public final List<C6617i> f20465a;

    public C6609c(ArrayList arrayList) {
        this.f20465a = arrayList;
    }

    /* renamed from: a */
    public final List<C6617i> mo22771a() {
        return this.f20465a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6614g) {
            return this.f20465a.equals(((C6614g) obj).mo22771a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f20465a.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("BatchedLogRequest{logRequests=");
        k.append(this.f20465a);
        k.append("}");
        return k.toString();
    }
}
