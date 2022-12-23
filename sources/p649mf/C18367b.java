package p649mf;

import com.google.firebase.perf.p414v1.NetworkRequestMetric;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import hi0.C23558r;
import java.lang.ref.WeakReference;
import java.util.List;
import p556if.C17595b;
import p626lf.C18200a;
import p721pf.C18921a;
import p766rf.C19260d;

/* renamed from: mf.b */
public final class C18367b extends C17595b implements C18921a {

    /* renamed from: i */
    public static final C18200a f46829i = C18200a.m44901d();

    /* renamed from: b */
    public final List<PerfSession> f46830b;

    /* renamed from: c */
    public final GaugeManager f46831c;

    /* renamed from: d */
    public final C19260d f46832d;

    /* renamed from: e */
    public final NetworkRequestMetric.C14496b f46833e = NetworkRequestMetric.m36100Z();

    /* renamed from: f */
    public final WeakReference<C18921a> f46834f = new WeakReference<>(this);

    /* renamed from: g */
    public String f46835g;

    /* renamed from: h */
    public boolean f46836h;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C18367b(p766rf.C19260d r3) {
        /*
            r2 = this;
            if.a r0 = p556if.C17592a.m43719a()
            com.google.firebase.perf.session.gauges.GaugeManager r1 = com.google.firebase.perf.session.gauges.GaugeManager.getInstance()
            r2.<init>(r0)
            com.google.firebase.perf.v1.NetworkRequestMetric$b r0 = com.google.firebase.perf.p414v1.NetworkRequestMetric.m36100Z()
            r2.f46833e = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r2.f46834f = r0
            r2.f46832d = r3
            r2.f46831c = r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r3 = java.util.Collections.synchronizedList(r3)
            r2.f46830b = r3
            r2.registerForAppState()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p649mf.C18367b.<init>(rf.d):void");
    }

    /* renamed from: d */
    public static C18367b m45221d(C19260d dVar) {
        return new C18367b(dVar);
    }

    /* renamed from: b */
    public final void mo43467b(PerfSession perfSession) {
        if (perfSession == null) {
            f46829i.mo50614f();
        } else if (((NetworkRequestMetric) this.f46833e.f36809c).mo43538R() && !((NetworkRequestMetric) this.f46833e.f36809c).mo43544X()) {
            this.f46830b.add(perfSession);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006e  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo50831c() {
        /*
            r7 = this;
            com.google.firebase.perf.session.SessionManager r0 = com.google.firebase.perf.session.SessionManager.getInstance()
            java.lang.ref.WeakReference<pf.a> r1 = r7.f46834f
            r0.unregisterForSessionUpdates(r1)
            r7.unregisterForAppState()
            java.util.List<com.google.firebase.perf.session.PerfSession> r0 = r7.f46830b
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0086 }
            r1.<init>()     // Catch:{ all -> 0x0086 }
            java.util.List<com.google.firebase.perf.session.PerfSession> r2 = r7.f46830b     // Catch:{ all -> 0x0086 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0086 }
        L_0x001a:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0086 }
            if (r3 == 0) goto L_0x002c
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0086 }
            com.google.firebase.perf.session.PerfSession r3 = (com.google.firebase.perf.session.PerfSession) r3     // Catch:{ all -> 0x0086 }
            if (r3 == 0) goto L_0x001a
            r1.add(r3)     // Catch:{ all -> 0x0086 }
            goto L_0x001a
        L_0x002c:
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)     // Catch:{ all -> 0x0086 }
            monitor-exit(r0)     // Catch:{ all -> 0x0086 }
            com.google.firebase.perf.v1.h[] r0 = com.google.firebase.perf.session.PerfSession.m36080c(r1)
            if (r0 == 0) goto L_0x0047
            com.google.firebase.perf.v1.NetworkRequestMetric$b r1 = r7.f46833e
            java.util.List r0 = java.util.Arrays.asList(r0)
            r1.mo43956p()
            MessageType r1 = r1.f36809c
            com.google.firebase.perf.v1.NetworkRequestMetric r1 = (com.google.firebase.perf.p414v1.NetworkRequestMetric) r1
            com.google.firebase.perf.p414v1.NetworkRequestMetric.m36095C(r1, r0)
        L_0x0047:
            com.google.firebase.perf.v1.NetworkRequestMetric$b r0 = r7.f46833e
            com.google.protobuf.GeneratedMessageLite r0 = r0.mo43954m()
            com.google.firebase.perf.v1.NetworkRequestMetric r0 = (com.google.firebase.perf.p414v1.NetworkRequestMetric) r0
            java.lang.String r1 = r7.f46835g
            r2 = 1
            if (r1 == 0) goto L_0x0063
            java.util.regex.Pattern r3 = p697of.C18746h.f47685a
            java.util.regex.Matcher r1 = r3.matcher(r1)
            boolean r1 = r1.matches()
            if (r1 != 0) goto L_0x0061
            goto L_0x0065
        L_0x0061:
            r1 = 0
            goto L_0x0066
        L_0x0063:
            java.util.regex.Pattern r1 = p697of.C18746h.f47685a
        L_0x0065:
            r1 = 1
        L_0x0066:
            if (r1 != 0) goto L_0x006e
            lf.a r0 = f46829i
            r0.mo50610a()
            return
        L_0x006e:
            boolean r1 = r7.f46836h
            if (r1 != 0) goto L_0x0085
            rf.d r1 = r7.f46832d
            com.google.firebase.perf.v1.ApplicationProcessState r3 = r7.getAppState()
            java.util.concurrent.ThreadPoolExecutor r4 = r1.f48943j
            androidx.emoji2.text.g r5 = new androidx.emoji2.text.g
            r6 = 6
            r5.<init>(r6, r1, r0, r3)
            r4.execute(r5)
            r7.f46836h = r2
        L_0x0085:
            return
        L_0x0086:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0086 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p649mf.C18367b.mo50831c():void");
    }

    /* renamed from: f */
    public final void mo50832f(String str) {
        NetworkRequestMetric.HttpMethod httpMethod;
        if (str != null) {
            NetworkRequestMetric.HttpMethod httpMethod2 = NetworkRequestMetric.HttpMethod.HTTP_METHOD_UNKNOWN;
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            char c = 65535;
            switch (upperCase.hashCode()) {
                case -531492226:
                    if (upperCase.equals("OPTIONS")) {
                        c = 0;
                        break;
                    }
                    break;
                case 70454:
                    if (upperCase.equals("GET")) {
                        c = 1;
                        break;
                    }
                    break;
                case 79599:
                    if (upperCase.equals("PUT")) {
                        c = 2;
                        break;
                    }
                    break;
                case 2213344:
                    if (upperCase.equals("HEAD")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2461856:
                    if (upperCase.equals("POST")) {
                        c = 4;
                        break;
                    }
                    break;
                case 75900968:
                    if (upperCase.equals("PATCH")) {
                        c = 5;
                        break;
                    }
                    break;
                case 80083237:
                    if (upperCase.equals("TRACE")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1669334218:
                    if (upperCase.equals("CONNECT")) {
                        c = 7;
                        break;
                    }
                    break;
                case 2012838315:
                    if (upperCase.equals("DELETE")) {
                        c = 8;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    httpMethod = NetworkRequestMetric.HttpMethod.OPTIONS;
                    break;
                case 1:
                    httpMethod = NetworkRequestMetric.HttpMethod.GET;
                    break;
                case 2:
                    httpMethod = NetworkRequestMetric.HttpMethod.PUT;
                    break;
                case 3:
                    httpMethod = NetworkRequestMetric.HttpMethod.HEAD;
                    break;
                case 4:
                    httpMethod = NetworkRequestMetric.HttpMethod.POST;
                    break;
                case 5:
                    httpMethod = NetworkRequestMetric.HttpMethod.PATCH;
                    break;
                case 6:
                    httpMethod = NetworkRequestMetric.HttpMethod.TRACE;
                    break;
                case 7:
                    httpMethod = NetworkRequestMetric.HttpMethod.CONNECT;
                    break;
                case 8:
                    httpMethod = NetworkRequestMetric.HttpMethod.DELETE;
                    break;
                default:
                    httpMethod = NetworkRequestMetric.HttpMethod.HTTP_METHOD_UNKNOWN;
                    break;
            }
            NetworkRequestMetric.C14496b bVar = this.f46833e;
            bVar.mo43956p();
            NetworkRequestMetric.m36096D((NetworkRequestMetric) bVar.f36809c, httpMethod);
        }
    }

    /* renamed from: g */
    public final void mo50833g(int i) {
        NetworkRequestMetric.C14496b bVar = this.f46833e;
        bVar.mo43956p();
        NetworkRequestMetric.m36104v((NetworkRequestMetric) bVar.f36809c, i);
    }

    /* renamed from: j */
    public final void mo50834j(long j) {
        NetworkRequestMetric.C14496b bVar = this.f46833e;
        bVar.mo43956p();
        NetworkRequestMetric.m36097E((NetworkRequestMetric) bVar.f36809c, j);
    }

    /* renamed from: k */
    public final void mo50835k(long j) {
        PerfSession perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f46834f);
        NetworkRequestMetric.C14496b bVar = this.f46833e;
        bVar.mo43956p();
        NetworkRequestMetric.m36107y((NetworkRequestMetric) bVar.f36809c, j);
        mo43467b(perfSession);
        if (perfSession.f36652d) {
            this.f46831c.collectGaugeMetricOnce(perfSession.f36651c);
        }
    }

    /* renamed from: l */
    public final void mo50836l(String str) {
        if (str == null) {
            NetworkRequestMetric.C14496b bVar = this.f46833e;
            bVar.mo43956p();
            NetworkRequestMetric.m36106x((NetworkRequestMetric) bVar.f36809c);
            return;
        }
        boolean z = false;
        if (str.length() <= 128) {
            int i = 0;
            while (true) {
                if (i >= str.length()) {
                    z = true;
                    break;
                }
                char charAt = str.charAt(i);
                if (charAt <= 31 || charAt > 127) {
                    break;
                }
                i++;
            }
        }
        if (z) {
            NetworkRequestMetric.C14496b bVar2 = this.f46833e;
            bVar2.mo43956p();
            NetworkRequestMetric.m36105w((NetworkRequestMetric) bVar2.f36809c, str);
            return;
        }
        f46829i.mo50614f();
    }

    /* renamed from: m */
    public final void mo50837m(long j) {
        NetworkRequestMetric.C14496b bVar = this.f46833e;
        bVar.mo43956p();
        NetworkRequestMetric.m36098F((NetworkRequestMetric) bVar.f36809c, j);
    }

    /* renamed from: n */
    public final void mo50838n(long j) {
        NetworkRequestMetric.C14496b bVar = this.f46833e;
        bVar.mo43956p();
        NetworkRequestMetric.m36094B((NetworkRequestMetric) bVar.f36809c, j);
        if (SessionManager.getInstance().perfSession().f36652d) {
            this.f46831c.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().f36651c);
        }
    }

    /* renamed from: o */
    public final void mo50839o(String str) {
        int lastIndexOf;
        if (str != null) {
            C23558r m = C23558r.m57727m(str);
            if (m != null) {
                C23558r.C23559a l = m.mo58703l();
                l.f59544b = C23558r.m57722b("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                l.f59545c = C23558r.m57722b("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                l.f59549g = null;
                l.f59550h = null;
                str = l.toString();
            }
            NetworkRequestMetric.C14496b bVar = this.f46833e;
            if (str.length() > 2000) {
                if (str.charAt(2000) == '/') {
                    str = str.substring(0, 2000);
                } else {
                    C23558r m2 = C23558r.m57727m(str);
                    if (m2 == null) {
                        str = str.substring(0, 2000);
                    } else if (m2.mo58698f().lastIndexOf(47) < 0 || (lastIndexOf = str.lastIndexOf(47, 1999)) < 0) {
                        str = str.substring(0, 2000);
                    } else {
                        str = str.substring(0, lastIndexOf);
                    }
                }
            }
            bVar.mo43956p();
            NetworkRequestMetric.m36102t((NetworkRequestMetric) bVar.f36809c, str);
        }
    }
}
