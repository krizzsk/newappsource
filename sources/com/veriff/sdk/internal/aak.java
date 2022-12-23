package com.veriff.sdk.internal;

import com.amazonaws.http.HttpHeader;
import com.veriff.sdk.internal.C22736yk;
import com.veriff.sdk.internal.C22740ym;
import com.veriff.sdk.internal.C22757yu;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class aak implements C22799zu {

    /* renamed from: a */
    private static final List<String> f53438a = C22766za.m55829a((T[]) new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});

    /* renamed from: b */
    private static final List<String> f53439b = C22766za.m55829a((T[]) new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});

    /* renamed from: c */
    private final C22740ym.C22741a f53440c;

    /* renamed from: d */
    private final C22788zm f53441d;

    /* renamed from: e */
    private final aaj f53442e;

    /* renamed from: f */
    private volatile aam f53443f;

    /* renamed from: g */
    private final C22749yq f53444g;

    /* renamed from: h */
    private volatile boolean f53445h;

    public aak(C22746yp ypVar, C22788zm zmVar, C22740ym.C22741a aVar, aaj aaj) {
        this.f53441d = zmVar;
        this.f53440c = aVar;
        this.f53442e = aaj;
        List<C22749yq> w = ypVar.mo57363w();
        C22749yq yqVar = C22749yq.H2_PRIOR_KNOWLEDGE;
        this.f53444g = !w.contains(yqVar) ? C22749yq.HTTP_2 : yqVar;
    }

    /* renamed from: a */
    public C22788zm mo53663a() {
        return this.f53441d;
    }

    /* renamed from: b */
    public void mo53667b() throws IOException {
        this.f53442e.mo53706b();
    }

    /* renamed from: c */
    public void mo53668c() throws IOException {
        this.f53443f.mo53748h().close();
    }

    /* renamed from: d */
    public void mo53670d() {
        this.f53445h = true;
        if (this.f53443f != null) {
            this.f53443f.mo53737a(aaf.CANCEL);
        }
    }

    /* renamed from: b */
    public static List<aag> m50117b(C22752ys ysVar) {
        C22736yk c = ysVar.mo57395c();
        ArrayList arrayList = new ArrayList(c.mo57265a() + 4);
        arrayList.add(new aag(aag.f53338c, ysVar.mo57393b()));
        arrayList.add(new aag(aag.f53339d, aaa.m49966a(ysVar.mo57390a())));
        String a = ysVar.mo57392a(HttpHeader.HOST);
        if (a != null) {
            arrayList.add(new aag(aag.f53341f, a));
        }
        arrayList.add(new aag(aag.f53340e, ysVar.mo57390a().mo57284b()));
        int a2 = c.mo57265a();
        for (int i = 0; i < a2; i++) {
            String lowerCase = c.mo57266a(i).toLowerCase(Locale.US);
            if (!f53438a.contains(lowerCase) || (lowerCase.equals("te") && c.mo57269b(i).equals("trailers"))) {
                arrayList.add(new aag(lowerCase, c.mo57269b(i)));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public abz mo53661a(C22752ys ysVar, long j) {
        return this.f53443f.mo53748h();
    }

    /* renamed from: a */
    public void mo53665a(C22752ys ysVar) throws IOException {
        if (this.f53443f == null) {
            this.f53443f = this.f53442e.mo53692a(m50117b(ysVar), ysVar.mo57396d() != null);
            if (!this.f53445h) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                this.f53443f.mo53745e().mo53957a((long) this.f53440c.mo57326c(), timeUnit);
                this.f53443f.mo53746f().mo53957a((long) this.f53440c.mo57328d(), timeUnit);
                return;
            }
            this.f53443f.mo53737a(aaf.CANCEL);
            throw new IOException("Canceled");
        }
    }

    /* renamed from: a */
    public C22757yu.C22758a mo53662a(boolean z) throws IOException {
        C22757yu.C22758a a = m50116a(this.f53443f.mo53744d(), this.f53444g);
        if (!z || C22763yy.f57691a.mo57367a(a) != 100) {
            return a;
        }
        return null;
    }

    /* renamed from: b */
    public aca mo53666b(C22757yu yuVar) {
        return this.f53443f.mo53747g();
    }

    /* renamed from: a */
    public static C22757yu.C22758a m50116a(C22736yk ykVar, C22749yq yqVar) throws IOException {
        C22736yk.C22737a aVar = new C22736yk.C22737a();
        int a = ykVar.mo57265a();
        aac aac = null;
        for (int i = 0; i < a; i++) {
            String a2 = ykVar.mo57266a(i);
            String b = ykVar.mo57269b(i);
            if (a2.equals(":status")) {
                aac = aac.m49975a("HTTP/1.1 " + b);
            } else if (!f53439b.contains(a2)) {
                C22763yy.f57691a.mo57372a(aVar, a2, b);
            }
        }
        if (aac != null) {
            return new C22757yu.C22758a().mo57437a(yqVar).mo57433a(aac.f53298b).mo57441a(aac.f53299c).mo57436a(aVar.mo57277a());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    /* renamed from: a */
    public long mo53660a(C22757yu yuVar) {
        return C22802zw.m56025a(yuVar);
    }
}
