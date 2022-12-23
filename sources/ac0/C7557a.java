package ac0;

import com.cubic.umo.p045ad.ext.types.UMOAdKitLogLevel;
import mf0.C24362h;
import nj0.C24541b;
import nj0.C24542c;
import p043ch.qos.logback.classic.Level;
import p043ch.qos.logback.classic.Logger;
import wb0.C13231a;

/* renamed from: ac0.a */
public final class C7557a {

    /* renamed from: a */
    public static Logger f23040a;

    /* renamed from: ac0.a$a */
    public /* synthetic */ class C7558a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23041a;

        static {
            int[] iArr = new int[UMOAdKitLogLevel.values().length];
            iArr[UMOAdKitLogLevel.NONE.ordinal()] = 1;
            iArr[UMOAdKitLogLevel.ERROR.ordinal()] = 2;
            iArr[UMOAdKitLogLevel.WARNING.ordinal()] = 3;
            iArr[UMOAdKitLogLevel.INFO.ordinal()] = 4;
            iArr[UMOAdKitLogLevel.DEBUG.ordinal()] = 5;
            iArr[UMOAdKitLogLevel.VERBOSE.ordinal()] = 6;
            iArr[UMOAdKitLogLevel.ALL.ordinal()] = 7;
            f23041a = iArr;
        }
    }

    static {
        C24541b b = C24542c.m61718b("UMOAdKit");
        if (b != null) {
            f23040a = (Logger) b;
            m17297a(C13231a.f32837a);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type ch.qos.logback.classic.Logger");
    }

    /* renamed from: a */
    public static void m17297a(UMOAdKitLogLevel uMOAdKitLogLevel) {
        C24362h.m61211f(uMOAdKitLogLevel, "level");
        switch (C7558a.f23041a[uMOAdKitLogLevel.ordinal()]) {
            case 1:
                f23040a.mo6674k(Level.f6369b);
                break;
            case 2:
                f23040a.mo6674k(Level.f6370c);
                break;
            case 3:
                f23040a.mo6674k(Level.f6371d);
                break;
            case 4:
                f23040a.mo6674k(Level.f6372e);
                break;
            case 5:
                f23040a.mo6674k(Level.f6373f);
                break;
            case 6:
                f23040a.mo6674k(Level.f6374g);
                break;
            case 7:
                f23040a.mo6674k(Level.f6375h);
                break;
        }
        f23040a.mo6667d(C24362h.m61216k(uMOAdKitLogLevel.name(), "Log Level Set to: "));
    }
}
