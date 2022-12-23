package p070e4;

import java.util.regex.Matcher;
import p296w4.C6987e;

/* renamed from: e4.e */
public final class C4550e {

    /* renamed from: a */
    public static final String f15684a;

    /* renamed from: b */
    public static final String f15685b = "{";

    /* renamed from: c */
    public static final String f15686c = "}";

    static {
        Matcher matcher = C6987e.f21757a.matcher(System.getProperty("java.version", ""));
        if (matcher.find()) {
            int parseInt = Integer.parseInt(matcher.group(2));
        }
        String property = System.getProperty("line.separator");
        f15684a = property;
        property.getClass();
    }
}
