package p190o1;

import android.util.Base64;
import java.util.List;
import p001a0.C0016g;

/* renamed from: o1.f */
public final class C5912f {

    /* renamed from: a */
    public final String f18986a;

    /* renamed from: b */
    public final String f18987b;

    /* renamed from: c */
    public final String f18988c;

    /* renamed from: d */
    public final List<List<byte[]>> f18989d;

    /* renamed from: e */
    public final String f18990e;

    public C5912f(String str, String str2, String str3, List<List<byte[]>> list) {
        str.getClass();
        this.f18986a = str;
        str2.getClass();
        this.f18987b = str2;
        this.f18988c = str3;
        list.getClass();
        this.f18989d = list;
        this.f18990e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder k = C13555b.m33972k("FontRequest {mProviderAuthority: ");
        k.append(this.f18986a);
        k.append(", mProviderPackage: ");
        k.append(this.f18987b);
        k.append(", mQuery: ");
        k.append(this.f18988c);
        k.append(", mCertificates:");
        sb.append(k.toString());
        for (int i = 0; i < this.f18989d.size(); i++) {
            sb.append(" [");
            List list = this.f18989d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        return C0016g.m31o(sb, "}", "mCertificatesArray: 0");
    }
}
