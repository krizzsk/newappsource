package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.amazonaws.http.HttpHeader;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.C2142d;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import p108h6.C5091f;
import p311x6.C7164c;
import p311x6.C7171h;

/* renamed from: com.bumptech.glide.load.data.j */
public final class C2152j implements C2142d<InputStream> {

    /* renamed from: b */
    public final C5091f f6969b;

    /* renamed from: c */
    public final int f6970c;

    /* renamed from: d */
    public HttpURLConnection f6971d;

    /* renamed from: e */
    public InputStream f6972e;

    /* renamed from: f */
    public volatile boolean f6973f;

    /* renamed from: com.bumptech.glide.load.data.j$a */
    public static class C2153a {
    }

    static {
        new C2153a();
    }

    public C2152j(C5091f fVar, int i) {
        this.f6969b = fVar;
        this.f6970c = i;
    }

    /* renamed from: a */
    public final Class<InputStream> mo6607a() {
        return InputStream.class;
    }

    /* renamed from: b */
    public final void mo6608b() {
        InputStream inputStream = this.f6972e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f6971d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f6971d = null;
    }

    /* renamed from: c */
    public final InputStream mo10921c(URL url, int i, URL url2, Map<String, String> map) throws HttpException {
        int i2;
        boolean z;
        int i3 = -1;
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new HttpException(-1, "In re-direct loop", (IOException) null);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            boolean z2 = false;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
                for (Map.Entry next : map.entrySet()) {
                    httpURLConnection.addRequestProperty((String) next.getKey(), (String) next.getValue());
                }
                httpURLConnection.setConnectTimeout(this.f6970c);
                httpURLConnection.setReadTimeout(this.f6970c);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                this.f6971d = httpURLConnection;
                try {
                    httpURLConnection.connect();
                    this.f6972e = this.f6971d.getInputStream();
                    if (this.f6973f) {
                        return null;
                    }
                    try {
                        i2 = this.f6971d.getResponseCode();
                    } catch (IOException unused2) {
                        i2 = -1;
                    }
                    int i4 = i2 / 100;
                    if (i4 == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        HttpURLConnection httpURLConnection2 = this.f6971d;
                        try {
                            if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                                this.f6972e = new C7164c(httpURLConnection2.getInputStream(), (long) httpURLConnection2.getContentLength());
                            } else {
                                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                    httpURLConnection2.getContentEncoding();
                                }
                                this.f6972e = httpURLConnection2.getInputStream();
                            }
                            return this.f6972e;
                        } catch (IOException e) {
                            try {
                                i3 = httpURLConnection2.getResponseCode();
                            } catch (IOException unused3) {
                            }
                            throw new HttpException(i3, "Failed to obtain InputStream", e);
                        }
                    } else {
                        if (i4 == 3) {
                            z2 = true;
                        }
                        if (z2) {
                            String headerField = this.f6971d.getHeaderField(HttpHeader.LOCATION);
                            if (!TextUtils.isEmpty(headerField)) {
                                try {
                                    URL url3 = new URL(url, headerField);
                                    mo6608b();
                                    return mo10921c(url3, i + 1, url, map);
                                } catch (MalformedURLException e2) {
                                    throw new HttpException(i2, C25541a.m63881k("Bad redirect url: ", headerField), e2);
                                }
                            } else {
                                throw new HttpException(i2, "Received empty or null redirect url", (IOException) null);
                            }
                        } else if (i2 == -1) {
                            throw new HttpException(i2);
                        } else {
                            try {
                                throw new HttpException(i2, this.f6971d.getResponseMessage(), (IOException) null);
                            } catch (IOException e3) {
                                throw new HttpException(i2, "Failed to get a response message", e3);
                            }
                        }
                    }
                } catch (IOException e4) {
                    try {
                        i3 = this.f6971d.getResponseCode();
                    } catch (IOException unused4) {
                    }
                    throw new HttpException(i3, "Failed to connect or obtain data", e4);
                }
            } catch (IOException e5) {
                throw new HttpException(0, "URL.openConnection threw", e5);
            }
        } else {
            throw new HttpException(-1, "Too many (> 5) redirects!", (IOException) null);
        }
    }

    public final void cancel() {
        this.f6973f = true;
    }

    /* renamed from: d */
    public final DataSource mo6610d() {
        return DataSource.REMOTE;
    }

    /* renamed from: e */
    public final void mo6611e(Priority priority, C2142d.C2143a<? super InputStream> aVar) {
        int i = C7171h.f22255a;
        SystemClock.elapsedRealtimeNanos();
        try {
            aVar.mo10914f(mo10921c(this.f6969b.mo20826d(), 0, (URL) null, this.f6969b.f17081b.getHeaders()));
            if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                return;
            }
        } catch (IOException e) {
            aVar.mo10913c(e);
            if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                return;
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
            throw th;
        }
        SystemClock.elapsedRealtimeNanos();
    }
}
