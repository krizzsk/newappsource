package com.veriff.sdk.internal;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p001a0.C0017h;

/* renamed from: com.veriff.sdk.internal.yn */
public final class C22742yn {

    /* renamed from: a */
    private static final Pattern f57540a = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: b */
    private static final Pattern f57541b = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: c */
    private final String f57542c;

    /* renamed from: d */
    private final String f57543d;

    /* renamed from: f */
    private final String f57544f;

    private C22742yn(String str, String str2, String str3, String str4) {
        this.f57542c = str;
        this.f57543d = str2;
        this.f57544f = str4;
    }

    /* renamed from: a */
    public static C22742yn m55639a(String str) {
        Matcher matcher = f57540a.matcher(str);
        if (matcher.lookingAt()) {
            String group = matcher.group(1);
            Locale locale = Locale.US;
            String lowerCase = group.toLowerCase(locale);
            String lowerCase2 = matcher.group(2).toLowerCase(locale);
            String str2 = null;
            Matcher matcher2 = f57541b.matcher(str);
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
            return new C22742yn(str, lowerCase, lowerCase2, str2);
        }
        throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
    }

    /* renamed from: b */
    public static C22742yn m55640b(String str) {
        try {
            return m55639a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C22742yn) && ((C22742yn) obj).f57542c.equals(this.f57542c);
    }

    public int hashCode() {
        return this.f57542c.hashCode();
    }

    public String toString() {
        return this.f57542c;
    }

    /* renamed from: b */
    public Charset mo57331b() {
        return mo57330a((Charset) null);
    }

    /* renamed from: a */
    public String mo57329a() {
        return this.f57543d;
    }

    /* renamed from: a */
    public Charset mo57330a(Charset charset) {
        try {
            String str = this.f57544f;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }
}
