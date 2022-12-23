package p977zz;

import ce0.C21100e;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: zz.m */
public final class C20951m {

    /* renamed from: a */
    public final String f52697a;

    /* renamed from: b */
    public final String f52698b;

    /* renamed from: c */
    public final ArrayList f52699c = new ArrayList();

    public C20951m(String str, String str2) {
        C21100e.m49373x(str, "mainType");
        this.f52697a = str;
        C21100e.m49373x(str2, "subType");
        this.f52698b = str2;
    }

    /* renamed from: c */
    public static C20951m m49061c(String str) throws ParseException {
        String str2;
        String str3;
        String str4;
        String str5;
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(59);
        if (indexOf == -1) {
            str2 = str;
            str3 = "";
        } else {
            str2 = str.substring(0, indexOf);
            str3 = str.substring(indexOf + 1);
        }
        String trim = str2.trim();
        int indexOf2 = trim.indexOf(47);
        if (indexOf2 != -1) {
            C20951m mVar = new C20951m(trim.substring(0, indexOf2), trim.substring(indexOf2 + 1));
            String trim2 = str3.trim();
            while (trim2.length() > 0) {
                int indexOf3 = trim2.indexOf(61);
                if (indexOf3 != -1) {
                    String substring = trim2.substring(0, indexOf3);
                    int i = indexOf3 + 1;
                    if (i == trim2.length()) {
                        str5 = "";
                        str4 = str5;
                    } else if (trim2.charAt(i) == '\"') {
                        int i2 = indexOf3 + 2;
                        int indexOf4 = trim2.indexOf(34, i2);
                        if (indexOf4 != -1) {
                            str4 = trim2.substring(i2, indexOf4);
                            str5 = trim2.substring(indexOf4 + 1).trim();
                        } else {
                            throw new ParseException(C25541a.m63881k("Missing closing quote in ", str), 0);
                        }
                    } else {
                        int indexOf5 = trim2.indexOf(59);
                        if (indexOf5 == -1) {
                            indexOf5 = trim2.length();
                        }
                        String trim3 = trim2.substring(i, indexOf5).trim();
                        str5 = trim2.substring(indexOf5).trim();
                        str4 = trim3;
                    }
                    if (str5.startsWith(";")) {
                        str5 = str5.substring(1);
                    }
                    mVar.f52699c.add(new C20944i0(substring, str4));
                    trim2 = str5.trim();
                } else {
                    throw new ParseException(C25541a.m63881k("Missing '=' in ", str), 0);
                }
            }
            return mVar;
        }
        throw new ParseException(C25541a.m63881k("Missing '/' in ", str), 0);
    }

    /* renamed from: a */
    public final String mo53024a() {
        Iterator it = this.f52699c.iterator();
        while (it.hasNext()) {
            C20944i0 i0Var = (C20944i0) it.next();
            if ("charset".equalsIgnoreCase((String) i0Var.f52692a)) {
                return (String) i0Var.f52693b;
            }
        }
        return "utf-8";
    }

    /* renamed from: b */
    public final boolean mo53025b(String str) {
        return (this.f52697a + "/" + this.f52698b).equalsIgnoreCase(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f52697a);
        sb.append('/');
        sb.append(this.f52698b);
        Iterator it = this.f52699c.iterator();
        while (it.hasNext()) {
            C20944i0 i0Var = (C20944i0) it.next();
            sb.append("; ");
            sb.append((String) i0Var.f52692a);
            sb.append('=');
            sb.append('\"');
            sb.append((String) i0Var.f52693b);
            sb.append('\"');
        }
        return sb.toString();
    }
}
