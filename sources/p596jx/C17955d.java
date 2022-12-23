package p596jx;

import c70.C13746a;
import c70.C13747b;
import com.moovit.app.tod.TodRidesProvider;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import p906wz.C20431c;

/* renamed from: jx.d */
public final class C17955d extends C13747b<C17954c, C17955d> {
    /* renamed from: c */
    public final void mo40052c(C20431c cVar, HttpURLConnection httpURLConnection, BufferedInputStream bufferedInputStream) throws IOException, BadResponseException, ServerException {
        C17954c cVar2 = (C17954c) cVar;
        super.mo40052c(cVar2, httpURLConnection, bufferedInputStream);
        boolean z = true;
        if (httpURLConnection.getResponseCode() / 200 != 1) {
            z = false;
        }
        if (z) {
            TodRidesProvider.m39562d(cVar2.f51759b, "com.moovit.tod_rides_provider.action.cancel_ride");
        }
    }

    /* renamed from: f */
    public final void mo40672f(C13746a aVar, HttpURLConnection httpURLConnection, BufferedInputStream bufferedInputStream) throws IOException, BadResponseException, ServerException {
        C17954c cVar = (C17954c) aVar;
        super.mo40052c(cVar, httpURLConnection, bufferedInputStream);
        boolean z = true;
        if (httpURLConnection.getResponseCode() / 200 != 1) {
            z = false;
        }
        if (z) {
            TodRidesProvider.m39562d(cVar.f51759b, "com.moovit.tod_rides_provider.action.cancel_ride");
        }
    }
}
