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

/* renamed from: jx.s */
public final class C17971s extends C13747b<C17970r, C17971s> {
    /* renamed from: c */
    public final void mo40052c(C20431c cVar, HttpURLConnection httpURLConnection, BufferedInputStream bufferedInputStream) throws IOException, BadResponseException, ServerException {
        C17970r rVar = (C17970r) cVar;
        super.mo40052c(rVar, httpURLConnection, bufferedInputStream);
        boolean z = true;
        if (httpURLConnection.getResponseCode() / 200 != 1) {
            z = false;
        }
        if (z) {
            TodRidesProvider.m39562d(rVar.f51759b, "com.moovit.tod_rides_provider.action.ride_rating");
        }
    }

    /* renamed from: f */
    public final void mo40672f(C13746a aVar, HttpURLConnection httpURLConnection, BufferedInputStream bufferedInputStream) throws IOException, BadResponseException, ServerException {
        C17970r rVar = (C17970r) aVar;
        super.mo40052c(rVar, httpURLConnection, bufferedInputStream);
        boolean z = true;
        if (httpURLConnection.getResponseCode() / 200 != 1) {
            z = false;
        }
        if (z) {
            TodRidesProvider.m39562d(rVar.f51759b, "com.moovit.tod_rides_provider.action.ride_rating");
        }
    }
}
