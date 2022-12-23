package p326ya;

import com.google.android.exoplayer2.Format;
import p011aa.C0141e;
import p012ab.C0144a;
import p029bb.C1520a;
import p042cb.C1843a;
import p064db.C4409a;
import p338za.C7507a;

/* renamed from: ya.b */
public interface C7355b {

    /* renamed from: a */
    public static final C7356a f22585a = new C7356a();

    /* renamed from: ya.b$a */
    public class C7356a implements C7355b {
        /* renamed from: a */
        public final C0141e mo23564a(Format format) {
            String str;
            String str2 = format.f13418m;
            if (str2 != null) {
                char c = 65535;
                switch (str2.hashCode()) {
                    case -1354451219:
                        if (str2.equals("application/vnd.dvb.ait")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1348231605:
                        if (str2.equals("application/x-icy")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1248341703:
                        if (str2.equals("application/id3")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1154383568:
                        if (str2.equals("application/x-emsg")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1652648887:
                        if (str2.equals("application/x-scte35")) {
                            c = 4;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        return new C7507a();
                    case 1:
                        return new C1520a();
                    case 2:
                        return new C1843a((C1843a.C1844a) null);
                    case 3:
                        return new C0144a();
                    case 4:
                        return new C4409a();
                }
            }
            String valueOf = String.valueOf(str2);
            if (valueOf.length() != 0) {
                str = "Attempted to create decoder for unsupported MIME type: ".concat(valueOf);
            } else {
                str = new String("Attempted to create decoder for unsupported MIME type: ");
            }
            throw new IllegalArgumentException(str);
        }

        /* renamed from: c */
        public final boolean mo23565c(Format format) {
            String str = format.f13418m;
            if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    C0141e mo23564a(Format format);

    /* renamed from: c */
    boolean mo23565c(Format format);
}
