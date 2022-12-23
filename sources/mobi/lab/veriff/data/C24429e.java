package mobi.lab.veriff.data;

import com.veriff.sdk.internal.C21616ex;
import java.util.Objects;
import mobi.lab.veriff.R$drawable;

/* renamed from: mobi.lab.veriff.data.e */
public class C24429e {

    /* renamed from: a */
    private final String f61827a;

    /* renamed from: b */
    private final int f61828b;

    /* renamed from: c */
    private final int f61829c;

    public C24429e(String str) {
        this.f61827a = str;
        this.f61828b = m61443a(str);
        this.f61829c = m61444b(str);
    }

    /* renamed from: a */
    public String mo60618a() {
        return this.f61827a;
    }

    /* renamed from: b */
    public CharSequence mo60620b(C21616ex exVar) {
        if (this.f61827a.equals("ID_CARD")) {
            return exVar.mo54879p();
        }
        if (this.f61827a.equals("PASSPORT")) {
            return exVar.mo54880q();
        }
        if (this.f61827a.equals("DRIVERS_LICENSE")) {
            return exVar.mo54881r();
        }
        return exVar.mo54882s();
    }

    /* renamed from: c */
    public int mo60621c() {
        return this.f61829c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C24429e eVar = (C24429e) obj;
        if (this.f61828b == eVar.f61828b && this.f61829c == eVar.f61829c && this.f61827a.equals(eVar.f61827a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f61827a, Integer.valueOf(this.f61828b), Integer.valueOf(this.f61829c)});
    }

    /* renamed from: a */
    public CharSequence mo60617a(C21616ex exVar) {
        if (this.f61827a.equals("ID_CARD")) {
            return exVar.mo54875l();
        }
        if (this.f61827a.equals("PASSPORT")) {
            return exVar.mo54876m();
        }
        if (this.f61827a.equals("DRIVERS_LICENSE")) {
            return exVar.mo54877n();
        }
        return exVar.mo54878o();
    }

    /* renamed from: b */
    public int mo60619b() {
        return this.f61828b;
    }

    /* renamed from: a */
    private static int m61443a(String str) {
        if (str.toUpperCase().equals("ID_CARD")) {
            return R$drawable.vrff_ic_id;
        }
        if (str.toUpperCase().equals("PASSPORT")) {
            return R$drawable.vrff_ic_passport;
        }
        if (str.toUpperCase().equals("DRIVERS_LICENSE")) {
            return R$drawable.vrff_ic_driving;
        }
        return R$drawable.vrff_ic_residence;
    }

    /* renamed from: b */
    private static int m61444b(String str) {
        if (str.toUpperCase().equals("ID_CARD")) {
            return R$drawable.vrff_ic_id_large;
        }
        if (str.toUpperCase().equals("PASSPORT")) {
            return R$drawable.vrff_ic_passport_large;
        }
        if (str.toUpperCase().equals("DRIVERS_LICENSE")) {
            return R$drawable.vrff_ic_driving_large;
        }
        return R$drawable.vrff_ic_residence_large;
    }
}
