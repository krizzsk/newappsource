package v70;

import android.content.SharedPreferences;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import f00.C16919g;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import p906wz.C20431c;
import p906wz.C20436g;
import v70.C13180p;

/* renamed from: v70.p */
public abstract class C13180p<RS extends C13180p<RS>> extends C20436g<C13179o<RS>, RS> {

    /* renamed from: f */
    public SharedPreferences f32723f;

    /* renamed from: g */
    public C16919g<Long> f32724g = null;

    /* renamed from: h */
    public boolean f32725h = false;

    /* renamed from: c */
    public final void mo40052c(C20431c cVar, HttpURLConnection httpURLConnection, BufferedInputStream bufferedInputStream) throws IOException, BadResponseException, ServerException {
        C16919g<Long> gVar;
        C13179o oVar = (C13179o) cVar;
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 304) {
            this.f32725h = true;
            return;
        }
        String headerField = httpURLConnection.getHeaderField("x-amz-meta-max_revision");
        if (headerField != null) {
            Long.parseLong(headerField);
        }
        mo40055d(httpURLConnection, bufferedInputStream);
        if (responseCode == 200 && (gVar = this.f32724g) != null) {
            gVar.mo49545d(this.f32723f, Long.valueOf(httpURLConnection.getLastModified()));
        }
    }

    /* renamed from: d */
    public abstract void mo40055d(HttpURLConnection httpURLConnection, BufferedInputStream bufferedInputStream) throws IOException, BadResponseException, ServerException;
}
