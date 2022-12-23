package p125ia;

import com.google.android.exoplayer2.ParserException;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import com.google.android.gms.safetynet.SafetyNetStatusCodes;
import p277ub.C6802q;

/* renamed from: ia.a */
public final class C5311a {

    /* renamed from: a */
    public static final int[] f17496a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, SafetyNetStatusCodes.SAFE_BROWSING_UNSUPPORTED_THREAT_TYPES, 11025, ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED, 7350};

    /* renamed from: b */
    public static final int[] f17497b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: ia.a$a */
    public static final class C5312a {

        /* renamed from: a */
        public final int f17498a;

        /* renamed from: b */
        public final int f17499b;

        /* renamed from: c */
        public final String f17500c;

        public C5312a(int i, int i2, String str) {
            this.f17498a = i;
            this.f17499b = i2;
            this.f17500c = str;
        }
    }

    /* renamed from: a */
    public static int m13350a(int i) {
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i == 42) {
            return 16;
        }
        if (i != 22) {
            return i != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    /* renamed from: b */
    public static int m13351b(C6802q qVar) throws ParserException {
        int f = qVar.mo22973f(4);
        if (f == 15) {
            return qVar.mo22973f(24);
        }
        if (f < 13) {
            return f17496a[f];
        }
        throw new ParserException();
    }

    /* renamed from: c */
    public static C5312a m13352c(C6802q qVar, boolean z) throws ParserException {
        int f = qVar.mo22973f(5);
        if (f == 31) {
            f = qVar.mo22973f(6) + 32;
        }
        int b = m13351b(qVar);
        int f2 = qVar.mo22973f(4);
        String g = C13715c.m34241g(19, "mp4a.40.", f);
        if (f == 5 || f == 29) {
            b = m13351b(qVar);
            int f3 = qVar.mo22973f(5);
            if (f3 == 31) {
                f3 = qVar.mo22973f(6) + 32;
            }
            f = f3;
            if (f == 22) {
                f2 = qVar.mo22973f(4);
            }
        }
        if (z) {
            if (!(f == 1 || f == 2 || f == 3 || f == 4 || f == 6 || f == 7 || f == 17)) {
                switch (f) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw new ParserException(C13715c.m34241g(42, "Unsupported audio object type: ", f));
                }
            }
            qVar.mo22972e();
            if (qVar.mo22972e()) {
                qVar.mo22979l(14);
            }
            boolean e = qVar.mo22972e();
            if (f2 != 0) {
                if (f == 6 || f == 20) {
                    qVar.mo22979l(3);
                }
                if (e) {
                    if (f == 22) {
                        qVar.mo22979l(16);
                    }
                    if (f == 17 || f == 19 || f == 20 || f == 23) {
                        qVar.mo22979l(3);
                    }
                    qVar.mo22979l(1);
                }
                switch (f) {
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        int f4 = qVar.mo22973f(2);
                        if (f4 == 2 || f4 == 3) {
                            throw new ParserException(C13715c.m34241g(33, "Unsupported epConfig: ", f4));
                        }
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        int i = f17497b[f2];
        if (i != -1) {
            return new C5312a(b, i, g);
        }
        throw new ParserException();
    }
}
