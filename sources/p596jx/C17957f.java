package p596jx;

import c70.C13747b;
import com.moovit.app.tod.TodRidesProvider;
import java.io.BufferedInputStream;
import java.net.HttpURLConnection;
import mf0.C24362h;
import p906wz.C20434f;

/* renamed from: jx.f */
public final class C17957f extends C13747b<C17956e, C17957f> {
    /* renamed from: g */
    public final void mo40672f(C17956e eVar, HttpURLConnection httpURLConnection, BufferedInputStream bufferedInputStream) {
        boolean z;
        C24362h.m61211f(eVar, "request");
        C24362h.m61211f(httpURLConnection, "connection");
        C24362h.m61211f(bufferedInputStream, "bis");
        super.mo40052c(eVar, httpURLConnection, bufferedInputStream);
        int i = this.f51774c;
        C20434f.C20435a aVar = C20434f.f51772a;
        if (i == -1 || i / 100 != 2) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            TodRidesProvider.m39562d(eVar.f51759b, "com.moovit.tod_rides_provider.action.cancel_subscription");
        }
    }
}
