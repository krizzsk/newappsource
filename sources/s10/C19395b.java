package s10;

import android.text.TextUtils;
import ce0.C21100e;
import com.appboy.models.InAppMessageBase;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.C2142d;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import p108h6.C5091f;
import p311x6.C7164c;
import p786rz.C19387a;
import zendesk.support.Constants;

/* renamed from: s10.b */
public final class C19395b implements C2142d<InputStream> {

    /* renamed from: b */
    public final C5091f f49344b;

    /* renamed from: c */
    public HttpURLConnection f49345c = null;

    /* renamed from: d */
    public InputStream f49346d = null;

    /* renamed from: e */
    public volatile boolean f49347e = false;

    public C19395b(C5091f fVar) {
        C21100e.m49373x(fVar, "glideUrl");
        this.f49344b = fVar;
    }

    /* renamed from: a */
    public final Class<InputStream> mo6607a() {
        return InputStream.class;
    }

    /* renamed from: b */
    public final void mo6608b() {
        C19387a.m46677i(this.f49346d);
        HttpURLConnection httpURLConnection = this.f49345c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.f49345c = null;
        }
    }

    public final void cancel() {
        this.f49347e = true;
    }

    /* renamed from: d */
    public final DataSource mo6610d() {
        return DataSource.REMOTE;
    }

    /* renamed from: e */
    public final void mo6611e(Priority priority, C2142d.C2143a<? super InputStream> aVar) {
        InputStream inputStream;
        InputStream inputStream2;
        try {
            URL d = this.f49344b.mo20826d();
            d.toExternalForm();
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(d.openConnection()));
            this.f49345c = httpURLConnection;
            httpURLConnection.setConnectTimeout(2500);
            this.f49345c.setReadTimeout(InAppMessageBase.INAPP_MESSAGE_DURATION_DEFAULT_MILLIS);
            boolean z = true;
            this.f49345c.setUseCaches(true);
            this.f49345c.setDoInput(true);
            this.f49345c.setDoOutput(false);
            int responseCode = this.f49345c.getResponseCode();
            if (responseCode / 100 != 2) {
                z = false;
            }
            if (z) {
                this.f49345c.getResponseMessage();
                this.f49345c.getHeaderField("X-Android-Response-Source");
                this.f49345c.getHeaderField(Constants.STANDARD_CACHING_HEADER);
                HttpURLConnection httpURLConnection2 = this.f49345c;
                if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                    inputStream = new C7164c(httpURLConnection2.getInputStream(), (long) httpURLConnection2.getContentLength());
                } else {
                    inputStream = httpURLConnection2.getInputStream();
                }
                this.f49346d = inputStream;
                if (this.f49347e) {
                    inputStream2 = null;
                } else {
                    inputStream2 = this.f49346d;
                }
                aVar.mo10914f(inputStream2);
                return;
            }
            throw new HttpException(responseCode);
        } catch (IOException e) {
            aVar.mo10913c(e);
        }
    }
}
