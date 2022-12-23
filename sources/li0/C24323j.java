package li0;

import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.Protocol;

/* renamed from: li0.j */
public final class C24323j {

    /* renamed from: a */
    public final Protocol f61628a;

    /* renamed from: b */
    public final int f61629b;

    /* renamed from: c */
    public final String f61630c;

    public C24323j(Protocol protocol, int i, String str) {
        this.f61628a = protocol;
        this.f61629b = i;
        this.f61630c = str;
    }

    /* renamed from: a */
    public static C24323j m61070a(String str) throws IOException {
        Protocol protocol;
        String str2;
        int i = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException(C25541a.m63881k("Unexpected status line: ", str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                protocol = Protocol.HTTP_1_0;
            } else if (charAt == 1) {
                protocol = Protocol.HTTP_1_1;
            } else {
                throw new ProtocolException(C25541a.m63881k("Unexpected status line: ", str));
            }
        } else if (str.startsWith("ICY ")) {
            protocol = Protocol.HTTP_1_0;
            i = 4;
        } else {
            throw new ProtocolException(C25541a.m63881k("Unexpected status line: ", str));
        }
        int i2 = i + 3;
        if (str.length() >= i2) {
            try {
                int parseInt = Integer.parseInt(str.substring(i, i2));
                if (str.length() <= i2) {
                    str2 = "";
                } else if (str.charAt(i2) == ' ') {
                    str2 = str.substring(i + 4);
                } else {
                    throw new ProtocolException(C25541a.m63881k("Unexpected status line: ", str));
                }
                return new C24323j(protocol, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(C25541a.m63881k("Unexpected status line: ", str));
            }
        } else {
            throw new ProtocolException(C25541a.m63881k("Unexpected status line: ", str));
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f61628a == Protocol.HTTP_1_0) {
            str = "HTTP/1.0";
        } else {
            str = "HTTP/1.1";
        }
        sb.append(str);
        sb.append(' ');
        sb.append(this.f61629b);
        if (this.f61630c != null) {
            sb.append(' ');
            sb.append(this.f61630c);
        }
        return sb.toString();
    }
}
