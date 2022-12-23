package p474et;

import java.util.ArrayList;
import java.util.List;
import mf0.C24362h;

/* renamed from: et.g */
public final class C16875g {

    /* renamed from: a */
    public final List<C16872d> f43891a;

    public C16875g(ArrayList arrayList) {
        this.f43891a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16875g) && C24362h.m61206a(this.f43891a, ((C16875g) obj).f43891a);
    }

    public final int hashCode() {
        return this.f43891a.hashCode();
    }

    public final String toString() {
        return C13555b.m33970i(C13555b.m33972k("SuggestionCardsResult(cards="), this.f43891a, ')');
    }
}
