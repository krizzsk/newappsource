package com.veriff.sdk.internal;

import com.amazonaws.http.HttpHeader;
import com.veriff.sdk.internal.C22740ym;
import com.veriff.sdk.internal.C22752ys;
import com.veriff.sdk.internal.C22757yu;
import java.io.IOException;
import java.util.List;

/* renamed from: com.veriff.sdk.internal.zs */
public final class C22797zs implements C22740ym {

    /* renamed from: a */
    private final C22726ye f57851a;

    public C22797zs(C22726ye yeVar) {
        this.f57851a = yeVar;
    }

    /* renamed from: a */
    public C22757yu mo53658a(C22740ym.C22741a aVar) throws IOException {
        C22752ys a = aVar.mo57322a();
        C22752ys.C22753a e = a.mo57397e();
        C22754yt d = a.mo57396d();
        if (d != null) {
            C22742yn a2 = d.mo54065a();
            if (a2 != null) {
                e.mo57408a(HttpHeader.CONTENT_TYPE, a2.toString());
            }
            long b = d.mo54067b();
            if (b != -1) {
                e.mo57408a(HttpHeader.CONTENT_LENGTH, Long.toString(b));
                e.mo57410b("Transfer-Encoding");
            } else {
                e.mo57408a("Transfer-Encoding", "chunked");
                e.mo57410b(HttpHeader.CONTENT_LENGTH);
            }
        }
        boolean z = false;
        if (a.mo57392a(HttpHeader.HOST) == null) {
            e.mo57408a(HttpHeader.HOST, C22766za.m55821a(a.mo57390a(), false));
        }
        if (a.mo57392a("Connection") == null) {
            e.mo57408a("Connection", "Keep-Alive");
        }
        if (a.mo57392a("Accept-Encoding") == null && a.mo57392a("Range") == null) {
            z = true;
            e.mo57408a("Accept-Encoding", "gzip");
        }
        List<C22725yd> a3 = this.f57851a.mo57225a(a.mo57390a());
        if (!a3.isEmpty()) {
            e.mo57408a("Cookie", m56007a(a3));
        }
        if (a.mo57392a(HttpHeader.USER_AGENT) == null) {
            e.mo57408a(HttpHeader.USER_AGENT, C22767zb.m55853a());
        }
        C22757yu a4 = aVar.mo57323a(e.mo57409a());
        C22802zw.m56028a(this.f57851a, a.mo57390a(), a4.mo57423g());
        C22757yu.C22758a a5 = a4.mo57425i().mo57438a(a);
        if (z && "gzip".equalsIgnoreCase(a4.mo57415a("Content-Encoding")) && C22802zw.m56035d(a4)) {
            abp abp = new abp(a4.mo57424h().mo54033c());
            a5.mo57436a(a4.mo57423g().mo57268b().mo57278b("Content-Encoding").mo57278b(HttpHeader.CONTENT_LENGTH).mo57277a());
            a5.mo57440a((C22759yv) new C22805zz(a4.mo57415a(HttpHeader.CONTENT_TYPE), -1, abr.m50508a((aca) abp)));
        }
        return a5.mo57443a();
    }

    /* renamed from: a */
    private String m56007a(List<C22725yd> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append("; ");
            }
            C22725yd ydVar = list.get(i);
            sb.append(ydVar.mo57219a());
            sb.append('=');
            sb.append(ydVar.mo57221b());
        }
        return sb.toString();
    }
}
