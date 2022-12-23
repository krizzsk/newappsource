package com.veriff.sdk.internal;

import com.amazonaws.http.HttpHeader;
import com.veriff.sdk.internal.C22740ym;
import com.veriff.sdk.internal.C22757yu;
import java.io.IOException;
import java.net.ProtocolException;

/* renamed from: com.veriff.sdk.internal.zt */
public final class C22798zt implements C22740ym {

    /* renamed from: a */
    private final boolean f57852a;

    public C22798zt(boolean z) {
        this.f57852a = z;
    }

    /* renamed from: a */
    public C22757yu mo53658a(C22740ym.C22741a aVar) throws IOException {
        boolean z;
        C22757yu yuVar;
        C22804zy zyVar = (C22804zy) aVar;
        C22784zk f = zyVar.mo57558f();
        C22752ys a = zyVar.mo57322a();
        long currentTimeMillis = System.currentTimeMillis();
        f.mo57493a(a);
        C22757yu.C22758a aVar2 = null;
        if (!C22803zx.m56039c(a.mo57393b()) || a.mo57396d() == null) {
            f.mo57504i();
            z = false;
        } else {
            if ("100-continue".equalsIgnoreCase(a.mo57392a(HttpHeader.EXPECT))) {
                f.mo57498c();
                f.mo57500e();
                aVar2 = f.mo57490a(true);
                z = true;
            } else {
                z = false;
            }
            if (aVar2 != null) {
                f.mo57504i();
                if (!f.mo57491a().mo57522f()) {
                    f.mo57501f();
                }
            } else if (a.mo57396d().mo57412c()) {
                f.mo57498c();
                a.mo57396d().mo54066a(abr.m50507a(f.mo57489a(a, true)));
            } else {
                abj a2 = abr.m50507a(f.mo57489a(a, false));
                a.mo57396d().mo54066a(a2);
                a2.close();
            }
        }
        if (a.mo57396d() == null || !a.mo57396d().mo57412c()) {
            f.mo57499d();
        }
        if (!z) {
            f.mo57500e();
        }
        if (aVar2 == null) {
            aVar2 = f.mo57490a(false);
        }
        C22757yu a3 = aVar2.mo57438a(a).mo57435a(f.mo57491a().mo57521e()).mo57434a(currentTimeMillis).mo57445b(System.currentTimeMillis()).mo57443a();
        int c = a3.mo57418c();
        if (c == 100) {
            a3 = f.mo57490a(false).mo57438a(a).mo57435a(f.mo57491a().mo57521e()).mo57434a(currentTimeMillis).mo57445b(System.currentTimeMillis()).mo57443a();
            c = a3.mo57418c();
        }
        f.mo57494a(a3);
        if (!this.f57852a || c != 101) {
            yuVar = a3.mo57425i().mo57440a(f.mo57496b(a3)).mo57443a();
        } else {
            yuVar = a3.mo57425i().mo57440a(C22766za.f57697d).mo57443a();
        }
        if ("close".equalsIgnoreCase(yuVar.mo57414a().mo57392a("Connection")) || "close".equalsIgnoreCase(yuVar.mo57415a("Connection"))) {
            f.mo57501f();
        }
        if ((c != 204 && c != 205) || yuVar.mo57424h().mo54032b() <= 0) {
            return yuVar;
        }
        StringBuilder r = C25541a.m63887r("HTTP ", c, " had non-zero Content-Length: ");
        r.append(yuVar.mo57424h().mo54032b());
        throw new ProtocolException(r.toString());
    }
}
