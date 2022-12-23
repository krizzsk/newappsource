package p043ch;

import java.nio.charset.Charset;

/* renamed from: ch.f */
public final class C13835f {

    /* renamed from: a */
    public static final String f34045a;

    /* renamed from: b */
    public static final boolean f34046b;

    static {
        boolean z;
        String name = Charset.defaultCharset().name();
        f34045a = name;
        if ("SJIS".equalsIgnoreCase(name) || "EUC_JP".equalsIgnoreCase(name)) {
            z = true;
        } else {
            z = false;
        }
        f34046b = z;
    }
}
