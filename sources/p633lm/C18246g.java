package p633lm;

import ce0.C21100e;
import com.masabi.justride.sdk.exception.helpers.LuhnAlgorithmException;
import p364al.C13487h;
import p388bk.C13634a;
import p583jk.C17878k;
import p705on.C18799g;
import p725pj.C18926a;

/* renamed from: lm.g */
public final class C18246g {

    /* renamed from: a */
    public final C17878k f46551a;

    public C18246g(C17878k kVar) {
        this.f46551a = kVar;
    }

    /* renamed from: a */
    public static C13487h m44979a(Integer num, String str) {
        return new C13487h(null, new C13634a((C18926a) null, num, str));
    }

    /* renamed from: c */
    public static C13487h m44980c(String str) {
        if (C21100e.m49352m0(str)) {
            return m44979a(C13634a.f33627u, "See the 'Handling Errors from the SDK' page (https://masabi.atlassian.net/wiki/x/JrNsAw) for information about this error.");
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < length) {
                int numericValue = Character.getNumericValue(charArray[i]);
                if (numericValue < 0 || numericValue > 9) {
                    break;
                }
                i++;
            } else {
                z = true;
                break;
            }
        }
        if (!z) {
            return m44979a(C13634a.f33626t, "See the 'Handling Errors from the SDK' page (https://masabi.atlassian.net/wiki/x/JrNsAw) for information about this error.");
        }
        if (str.length() < 3 || str.length() > 4) {
            return m44979a(C13634a.f33625s, "See the 'Handling Errors from the SDK' page (https://masabi.atlassian.net/wiki/x/JrNsAw) for information about this error.");
        }
        return new C13487h(null, (C18926a) null);
    }

    /* renamed from: b */
    public final C13487h mo50658b(C18799g gVar) {
        if (C21100e.m49352m0(gVar.f47861a)) {
            return m44979a(C13634a.f33632z, "Cardholder name is required");
        }
        C13487h c = m44980c(gVar.f47864d);
        if (c.mo40399a()) {
            return c;
        }
        if (C21100e.m49352m0(gVar.f47863c)) {
            return m44979a(C13634a.f33629w, "Card expiry date is required");
        }
        char[] charArray = gVar.f47863c.toCharArray();
        int length = charArray.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < length) {
                int numericValue = Character.getNumericValue(charArray[i]);
                if (numericValue < 0 || numericValue > 9) {
                    break;
                }
                i++;
            } else {
                z = true;
                break;
            }
        }
        if (!z) {
            return m44979a(C13634a.f33630x, "Card expiry date must consist of digits only in MMYY format");
        }
        if (C21100e.m49352m0(gVar.f47865e)) {
            return m44979a(C13634a.f33631y, "Postal Code is required");
        }
        try {
            C17878k kVar = this.f46551a;
            String str = gVar.f47862b;
            kVar.getClass();
            if (!C17878k.m44326a(str)) {
                return m44979a(C13634a.f33623q, "The supplied PAN is invalid.");
            }
            return new C13487h(null, (C18926a) null);
        } catch (LuhnAlgorithmException e) {
            return m44979a(C13634a.f33623q, e.getMessage());
        }
    }
}
