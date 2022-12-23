package y50;

import ce0.C21100e;
import com.moovit.util.CurrencyAmount;
import java.util.ArrayList;
import java.util.List;
import p583jk.C17884p;

/* renamed from: y50.b */
public final class C20704b {

    /* renamed from: a */
    public final String f52286a;

    /* renamed from: b */
    public final List<String> f52287b;

    /* renamed from: c */
    public final boolean f52288c;

    /* renamed from: d */
    public final String f52289d;

    /* renamed from: e */
    public final CurrencyAmount f52290e;

    public C20704b(String str, ArrayList arrayList, boolean z, String str2, CurrencyAmount currencyAmount) {
        C21100e.m49373x(str, "discountContextId");
        this.f52286a = str;
        this.f52287b = arrayList;
        this.f52288c = z;
        C21100e.m49373x(str2, "label");
        this.f52289d = str2;
        this.f52290e = currencyAmount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20704b)) {
            return false;
        }
        C20704b bVar = (C20704b) obj;
        if (!this.f52286a.equals(bVar.f52286a) || !this.f52287b.equals(bVar.f52287b) || this.f52288c != bVar.f52288c || !this.f52289d.equals(bVar.f52289d) || !this.f52290e.equals(bVar.f52290e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f52286a), C17884p.m44335F(this.f52287b), this.f52288c, C17884p.m44335F(this.f52289d), C17884p.m44335F(this.f52290e));
    }
}
