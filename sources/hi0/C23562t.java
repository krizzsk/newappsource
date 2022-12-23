package hi0;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p001a0.C0017h;

/* renamed from: hi0.t */
public final class C23562t {

    /* renamed from: d */
    public static final Pattern f59551d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: e */
    public static final Pattern f59552e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a */
    public final String f59553a;

    /* renamed from: b */
    public final String f59554b;

    /* renamed from: c */
    public final String f59555c;

    public C23562t(String str, String str2, String str3) {
        this.f59553a = str;
        this.f59554b = str2;
        this.f59555c = str3;
    }

    /* renamed from: b */
    public static C23562t m57742b(String str) {
        Matcher matcher = f59551d.matcher(str);
        if (matcher.lookingAt()) {
            String group = matcher.group(1);
            Locale locale = Locale.US;
            String lowerCase = group.toLowerCase(locale);
            matcher.group(2).toLowerCase(locale);
            String str2 = null;
            Matcher matcher2 = f59552e.matcher(str);
            int end = matcher.end();
            while (end < str.length()) {
                matcher2.region(end, str.length());
                if (matcher2.lookingAt()) {
                    String group2 = matcher2.group(1);
                    if (group2 != null && group2.equalsIgnoreCase("charset")) {
                        String group3 = matcher2.group(2);
                        if (group3 == null) {
                            group3 = matcher2.group(3);
                        } else if (group3.startsWith("'") && group3.endsWith("'") && group3.length() > 2) {
                            group3 = group3.substring(1, group3.length() - 1);
                        }
                        if (str2 == null || group3.equalsIgnoreCase(str2)) {
                            str2 = group3;
                        } else {
                            throw new IllegalArgumentException(C0017h.m57N(C16759e.m42352h("Multiple charsets defined: \"", str2, "\" and: \"", group3, "\" for: \""), str, '\"'));
                        }
                    }
                    end = matcher2.end();
                } else {
                    StringBuilder k = C13555b.m33972k("Parameter is not formatted correctly: \"");
                    k.append(str.substring(end));
                    k.append("\" for: \"");
                    k.append(str);
                    k.append('\"');
                    throw new IllegalArgumentException(k.toString());
                }
            }
            return new C23562t(str, lowerCase, str2);
        }
        throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
    }

    /* renamed from: c */
    public static C23562t m57743c(String str) {
        try {
            return m57742b(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final Charset mo58710a(Charset charset) {
        try {
            String str = this.f59555c;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C23562t) && ((C23562t) obj).f59553a.equals(this.f59553a);
    }

    public final int hashCode() {
        return this.f59553a.hashCode();
    }

    public final String toString() {
        return this.f59553a;
    }
}
