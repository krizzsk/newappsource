package y40;

import mf0.C24362h;
import p001a0.C0017h;

/* renamed from: y40.a */
public final class C25772a {

    /* renamed from: a */
    public final String f64287a;

    /* renamed from: b */
    public final String f64288b;

    public C25772a(String str, String str2) {
        this.f64287a = str;
        this.f64288b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25772a)) {
            return false;
        }
        C25772a aVar = (C25772a) obj;
        return C24362h.m61206a(this.f64287a, aVar.f64287a) && C24362h.m61206a(this.f64288b, aVar.f64288b);
    }

    public final int hashCode() {
        String str = this.f64287a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f64288b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("AccountFlowWizardCompleted(toastMessage=");
        k.append(this.f64287a);
        k.append(", deepLink=");
        return C0017h.m57N(k, this.f64288b, ')');
    }
}
