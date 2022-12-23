package p977zz;

import c00.C13717b;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collection;

/* renamed from: zz.p */
public final class C20957p {
    /* renamed from: a */
    public static String m49075a(Collection collection) {
        StringWriter stringWriter = new StringWriter();
        try {
            m49076b(stringWriter, collection);
        } catch (Exception unused) {
        }
        return stringWriter.toString();
    }

    /* renamed from: b */
    public static void m49076b(StringWriter stringWriter, Collection collection) throws IOException {
        boolean z;
        boolean z2;
        if (!C13717b.m34258e(collection)) {
            for (Object next : collection) {
                if (next != null) {
                    String valueOf = String.valueOf(next);
                    int length = valueOf.length();
                    int i = 0;
                    while (true) {
                        z = true;
                        if (i >= length) {
                            z = false;
                            break;
                        }
                        char charAt = valueOf.charAt(i);
                        if (charAt == ',' || charAt == '\"' || charAt == 10 || charAt == 13) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            break;
                        }
                        i++;
                    }
                    if (z) {
                        stringWriter.append('\"');
                        int length2 = valueOf.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            char charAt2 = valueOf.charAt(i2);
                            if (charAt2 == '\"') {
                                stringWriter.append('\"');
                            }
                            stringWriter.append(charAt2);
                        }
                        stringWriter.append('\"');
                    } else {
                        stringWriter.write(valueOf);
                    }
                }
                stringWriter.append(',');
            }
            stringWriter.append(C20964s0.f52718a);
        }
    }
}
