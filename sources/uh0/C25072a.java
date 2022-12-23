package uh0;

import java.nio.charset.Charset;
import mf0.C24362h;

/* renamed from: uh0.a */
public final class C25072a {

    /* renamed from: a */
    public static final Charset f63272a;

    /* renamed from: b */
    public static final Charset f63273b;

    static {
        Charset forName = Charset.forName("UTF-8");
        C24362h.m61210e(forName, "forName(\"UTF-8\")");
        f63272a = forName;
        C24362h.m61210e(Charset.forName("UTF-16"), "forName(\"UTF-16\")");
        C24362h.m61210e(Charset.forName("UTF-16BE"), "forName(\"UTF-16BE\")");
        C24362h.m61210e(Charset.forName("UTF-16LE"), "forName(\"UTF-16LE\")");
        Charset forName2 = Charset.forName("US-ASCII");
        C24362h.m61210e(forName2, "forName(\"US-ASCII\")");
        f63273b = forName2;
        C24362h.m61210e(Charset.forName("ISO-8859-1"), "forName(\"ISO-8859-1\")");
    }
}
