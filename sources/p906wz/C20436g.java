package p906wz;

import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ResponseSource;
import com.moovit.commons.request.ServerException;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import p906wz.C20431c;
import p906wz.C20434f;
import p906wz.C20436g;

/* renamed from: wz.g */
public abstract class C20436g<RQ extends C20431c<RQ, RS>, RS extends C20436g<RQ, RS>> {

    /* renamed from: b */
    public RQ f51773b;

    /* renamed from: c */
    public int f51774c = -1;

    /* renamed from: d */
    public ResponseSource f51775d;

    /* renamed from: e */
    public long f51776e = -1;

    /* renamed from: a */
    public final boolean mo52635a() {
        boolean z;
        ResponseSource responseSource;
        int i = this.f51774c;
        C20434f.C20435a aVar = C20434f.f51772a;
        if (i == -1 || i / 100 != 2) {
            z = false;
        } else {
            z = true;
        }
        if (!z || ((responseSource = this.f51775d) != null && !ResponseSource.NETWORK.equals(responseSource))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo5817b(RQ rq, HttpURLConnection httpURLConnection, BufferedInputStream bufferedInputStream) throws IOException, BadResponseException, ServerException {
    }

    /* renamed from: c */
    public void mo40052c(RQ rq, HttpURLConnection httpURLConnection, BufferedInputStream bufferedInputStream) throws IOException, BadResponseException, ServerException {
        this.f51774c = httpURLConnection.getResponseCode();
        this.f51775d = ResponseSource.parseResponseSourceHeader(httpURLConnection);
        this.f51776e = httpURLConnection.getLastModified();
        httpURLConnection.getHeaderField("ETag");
        int i = this.f51774c;
        if (i == 200 || i == 201) {
            mo5817b(rq, httpURLConnection, bufferedInputStream);
        } else if (i != 204) {
            throw new IOException(httpURLConnection.getURL() + " returned response code " + this.f51774c);
        }
    }

    public String toString() {
        return "";
    }
}
