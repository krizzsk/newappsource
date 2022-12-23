package p988j$.time;

import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import p988j$.time.temporal.C25830a;
import p988j$.time.temporal.C25841l;
import p988j$.time.temporal.C25842m;
import p988j$.time.temporal.C25844o;
import p988j$.time.temporal.C25845p;
import p988j$.time.temporal.C25847r;
import p988j$.time.temporal.C25848s;
import p988j$.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.time.ZoneOffset */
public final class ZoneOffset extends C25826n implements C25841l, Comparable<ZoneOffset> {
    public static final ZoneOffset UTC = m64398k(0);

    /* renamed from: c */
    private static final ConcurrentHashMap f64323c = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: d */
    private static final ConcurrentHashMap f64324d = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: e */
    public static final ZoneOffset f64325e = m64398k(-64800);

    /* renamed from: f */
    public static final ZoneOffset f64326f = m64398k(64800);

    /* renamed from: a */
    private final int f64327a;

    /* renamed from: b */
    private final transient String f64328b;

    private ZoneOffset(int i) {
        String str;
        this.f64327a = i;
        if (i == 0) {
            str = "Z";
        } else {
            int abs = Math.abs(i);
            StringBuilder sb = new StringBuilder();
            int i2 = abs / 3600;
            int i3 = (abs / 60) % 60;
            sb.append(i < 0 ? "-" : "+");
            sb.append(i2 < 10 ? "0" : "");
            sb.append(i2);
            String str2 = ":0";
            sb.append(i3 < 10 ? str2 : ":");
            sb.append(i3);
            int i4 = abs % 60;
            if (i4 != 0) {
                sb.append(i4 >= 10 ? ":" : str2);
                sb.append(i4);
            }
            str = sb.toString();
        }
        this.f64328b = str;
    }

    /* renamed from: k */
    public static ZoneOffset m64398k(int i) {
        if (i < -64800 || i > 64800) {
            throw new C25784c("Zone offset not in valid range: -18:00 to +18:00");
        } else if (i % STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS != 0) {
            return new ZoneOffset(i);
        } else {
            Integer valueOf = Integer.valueOf(i);
            ConcurrentHashMap concurrentHashMap = f64323c;
            ZoneOffset zoneOffset = (ZoneOffset) concurrentHashMap.get(valueOf);
            if (zoneOffset != null) {
                return zoneOffset;
            }
            concurrentHashMap.putIfAbsent(valueOf, new ZoneOffset(i));
            ZoneOffset zoneOffset2 = (ZoneOffset) concurrentHashMap.get(valueOf);
            f64324d.putIfAbsent(zoneOffset2.f64328b, zoneOffset2);
            return zoneOffset2;
        }
    }

    /* renamed from: b */
    public final int mo83601b(C25842m mVar) {
        if (mVar == C25830a.OFFSET_SECONDS) {
            return this.f64327a;
        }
        if (!(mVar instanceof C25830a)) {
            return C25782a.m64409d(this, mVar).mo83788a(mo83604g(mVar), mVar);
        }
        throw new C25847r("Unsupported field: " + mVar);
    }

    public final int compareTo(Object obj) {
        return ((ZoneOffset) obj).f64327a - this.f64327a;
    }

    /* renamed from: d */
    public final C25848s mo83602d(C25842m mVar) {
        return C25782a.m64409d(this, mVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZoneOffset) && this.f64327a == ((ZoneOffset) obj).f64327a;
    }

    /* renamed from: f */
    public final boolean mo83603f(C25842m mVar) {
        return mVar instanceof C25830a ? mVar == C25830a.OFFSET_SECONDS : mVar != null && mVar.mo83770a(this);
    }

    /* renamed from: g */
    public final long mo83604g(C25842m mVar) {
        if (mVar == C25830a.OFFSET_SECONDS) {
            return (long) this.f64327a;
        }
        if (!(mVar instanceof C25830a)) {
            return mVar.mo83773d(this);
        }
        throw new C25847r("Unsupported field: " + mVar);
    }

    /* renamed from: h */
    public final Object mo83606h(C25845p pVar) {
        return (pVar == C25844o.m64622d() || pVar == C25844o.m64624f()) ? this : C25782a.m64408c(this, pVar);
    }

    public final int hashCode() {
        return this.f64327a;
    }

    /* renamed from: i */
    public final String mo83653i() {
        return this.f64328b;
    }

    /* renamed from: j */
    public final int mo83654j() {
        return this.f64327a;
    }

    public final String toString() {
        return this.f64328b;
    }
}
