package p245s4;

import com.google.android.gms.location.places.Place;
import java.util.ArrayList;
import java.util.List;
import p001a0.C0016g;

/* renamed from: s4.g */
public final class C6461g {

    /* renamed from: d */
    public static C6461g f20178d = new C6461g(41, (ArrayList) null, (String) null);

    /* renamed from: e */
    public static C6461g f20179e = new C6461g(1005, (ArrayList) null, "BARE");

    /* renamed from: f */
    public static C6461g f20180f = new C6461g(37, (ArrayList) null, (String) null);

    /* renamed from: a */
    public final int f20181a;

    /* renamed from: b */
    public final String f20182b;

    /* renamed from: c */
    public final List<String> f20183c;

    public C6461g() {
        throw null;
    }

    public C6461g(int i, ArrayList arrayList, String str) {
        this.f20181a = i;
        this.f20182b = str;
        this.f20183c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6461g)) {
            return false;
        }
        C6461g gVar = (C6461g) obj;
        if (this.f20181a != gVar.f20181a) {
            return false;
        }
        String str = this.f20182b;
        String str2 = gVar.f20182b;
        return str == null ? str2 == null : str.equals(str2);
    }

    public final int hashCode() {
        int i = this.f20181a * 29;
        String str = this.f20182b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb;
        int i = this.f20181a;
        if (i == 37) {
            str = "%";
        } else if (i == 41) {
            str = "RIGHT_PARENTHESIS";
        } else if (i == 1000) {
            str = "LITERAL";
        } else if (i != 1002) {
            switch (i) {
                case 1004:
                    str = "SIMPLE_KEYWORD";
                    break;
                case 1005:
                    str = "COMPOSITE_KEYWORD";
                    break;
                case Place.TYPE_FLOOR /*1006*/:
                    str = "OPTION";
                    break;
                default:
                    str = "UNKNOWN";
                    break;
            }
        } else {
            str = "FormatModifier";
        }
        if (this.f20182b == null) {
            sb = C0016g.m36t("Token(", str);
            str2 = ")";
        } else {
            sb = C13555b.m33973l("Token(", str, ", \"");
            sb.append(this.f20182b);
            str2 = "\")";
        }
        sb.append(str2);
        return sb.toString();
    }
}
