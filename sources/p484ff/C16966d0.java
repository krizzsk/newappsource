package p484ff;

import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;
import p358af.C13437d;

/* renamed from: ff.d0 */
public final class C16966d0 {

    /* renamed from: d */
    public static final Pattern f44034d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a */
    public final String f44035a;

    /* renamed from: b */
    public final String f44036b;

    /* renamed from: c */
    public final String f44037c;

    public C16966d0(String str, String str2) {
        String str3;
        if (str2 == null || !str2.startsWith("/topics/")) {
            str3 = str2;
        } else {
            String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", new Object[]{str});
            str3 = str2.substring(8);
        }
        if (str3 == null || !f44034d.matcher(str3).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", new Object[]{str3, "[a-zA-Z0-9-_.~%]{1,900}"}));
        }
        this.f44035a = str3;
        this.f44036b = str;
        this.f44037c = C13437d.m33706k(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16966d0)) {
            return false;
        }
        C16966d0 d0Var = (C16966d0) obj;
        if (!this.f44035a.equals(d0Var.f44035a) || !this.f44036b.equals(d0Var.f44036b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f44036b, this.f44035a);
    }
}
