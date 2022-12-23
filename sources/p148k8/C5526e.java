package p148k8;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.nio.charset.Charset;
import kotlin.text.Regex;
import mf0.C24362h;
import p009a8.C0115o;
import p262t8.C6606a;

/* renamed from: k8.e */
public final class C5526e {

    /* renamed from: a */
    public static final C5526e f18104a = new C5526e();

    /* renamed from: a */
    public static final File m13744a() {
        Class<C5526e> cls = C5526e.class;
        if (C6606a.m15601b(cls)) {
            return null;
        }
        try {
            File file = new File(C0115o.m210a().getFilesDir(), "facebook_ml/");
            if (file.exists() || file.mkdirs()) {
                return file;
            }
            return null;
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return null;
        }
    }

    /* renamed from: b */
    public final String mo21391b(String str) {
        int i;
        boolean z;
        if (C6606a.m15601b(this)) {
            return null;
        }
        try {
            C24362h.m61211f(str, "str");
            int length = str.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (true) {
                if (i2 > length) {
                    break;
                }
                if (!z2) {
                    i = i2;
                } else {
                    i = length;
                }
                if (C24362h.m61213h(str.charAt(i), 32) <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z2) {
                    if (!z) {
                        z2 = true;
                    } else {
                        i2++;
                    }
                } else if (!z) {
                    break;
                } else {
                    length--;
                }
            }
            Object[] array = new Regex("\\s+").mo60285d(str.subSequence(i2, length + 1).toString()).toArray(new String[0]);
            if (array != null) {
                String join = TextUtils.join(" ", (String[]) array);
                C24362h.m61210e(join, "join(\" \", strArray)");
                return join;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return null;
        }
    }

    /* renamed from: c */
    public final int[] mo21392c(String str) {
        if (C6606a.m15601b(this)) {
            return null;
        }
        try {
            C24362h.m61211f(str, "texts");
            int[] iArr = new int[RecyclerView.C1119a0.FLAG_IGNORE];
            String b = mo21391b(str);
            Charset forName = Charset.forName("UTF-8");
            C24362h.m61210e(forName, "forName(\"UTF-8\")");
            if (b != null) {
                byte[] bytes = b.getBytes(forName);
                C24362h.m61210e(bytes, "(this as java.lang.String).getBytes(charset)");
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    if (i < bytes.length) {
                        iArr[i] = bytes[i] & 255;
                    } else {
                        iArr[i] = 0;
                    }
                    if (i2 >= 128) {
                        return iArr;
                    }
                    i = i2;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return null;
        }
    }
}
