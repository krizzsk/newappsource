package com.fyber.inneractive.sdk.network;

import android.text.TextUtils;
import com.amazonaws.http.HttpHeader;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.network.i */
public class C2905i extends C2903h implements C2901g {

    /* renamed from: com.fyber.inneractive.sdk.network.i$a */
    public static class C2906a extends C2908j {

        /* renamed from: f */
        public final HttpURLConnection f9918f;

        public C2906a(HttpURLConnection httpURLConnection, int i, InputStream inputStream, Map<String, List<String>> map, String str) {
            this.f9918f = httpURLConnection;
            mo13706a(i);
            mo13707a(inputStream);
            mo13709a(map);
            mo13708a(str);
        }

        /* renamed from: a */
        public void mo13704a() throws IOException {
            try {
                HttpURLConnection httpURLConnection = this.f9918f;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable unused) {
            }
            InputStream inputStream = this.f9922c;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    /* renamed from: a */
    public <T> C2908j mo13697a(C2889b0<T> b0Var, String str, String str2) throws Exception {
        InputStream inputStream;
        IAlog.m9902a("%s hurl network stack is in use", "HttpExecutorImpl");
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(b0Var.mo13664a()).openConnection()));
            C2923o0 i = b0Var.mo13674i();
            httpURLConnection.setConnectTimeout(i.f10010a);
            httpURLConnection.setReadTimeout(i.f10011b);
            mo13702a(httpURLConnection, HttpHeader.USER_AGENT, str);
            mo13702a(httpURLConnection, "If-Modified-Since", str2);
            mo13702a(httpURLConnection, "Accept-Encoding", "gzip");
            mo13701a(httpURLConnection, b0Var);
            if (b0Var.mo13679n() != C2943y.POST) {
                if (b0Var.mo13679n() != C2943y.PUT) {
                    httpURLConnection.connect();
                    inputStream = mo13700a(httpURLConnection.getInputStream(), TextUtils.equals("gzip", httpURLConnection.getContentEncoding()));
                    C2908j a = mo13699a(inputStream, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), httpURLConnection.getHeaderFields(), httpURLConnection.getHeaderField("Last-Modified"));
                    return new C2906a(httpURLConnection, a.f9920a, a.f9922c, a.f9923d, a.f9924e);
                }
            }
            mo13703b(httpURLConnection, b0Var);
            try {
                inputStream = mo13700a(httpURLConnection.getInputStream(), TextUtils.equals("gzip", httpURLConnection.getContentEncoding()));
            } catch (Exception unused) {
                inputStream = null;
            }
            try {
                C2908j a2 = mo13699a(inputStream, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), httpURLConnection.getHeaderFields(), httpURLConnection.getHeaderField("Last-Modified"));
                return new C2906a(httpURLConnection, a2.f9920a, a2.f9922c, a2.f9923d, a2.f9924e);
            } catch (IOException e) {
                IAlog.m9901a("failed reading network response", e, new Object[0]);
                throw new C2930q0(e);
            }
        } catch (MalformedURLException e2) {
            IAlog.m9901a("failed creating request URL", e2, new Object[0]);
            throw e2;
        } catch (Exception e3) {
            IAlog.m9901a("failed executing network request", e3, new Object[0]);
            throw new C2888b((Throwable) e3);
        }
    }

    /* renamed from: b */
    public void mo13698b() {
    }

    /* renamed from: b */
    public final void mo13703b(HttpURLConnection httpURLConnection, C2889b0 b0Var) throws Exception {
        int i;
        httpURLConnection.setRequestMethod(b0Var.mo13679n().f10077a);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        byte[] k = b0Var.mo13676k();
        if (k != null) {
            i = k.length;
        } else {
            i = 0;
        }
        httpURLConnection.setRequestProperty(HttpHeader.CONTENT_LENGTH, "" + i);
        httpURLConnection.setRequestProperty(HttpHeader.CONTENT_TYPE, b0Var.mo13678m());
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(k);
        try {
            outputStream.close();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final <T> void mo13701a(HttpURLConnection httpURLConnection, C2889b0<T> b0Var) {
        Map<String, String> q = b0Var.mo13681q();
        if (q != null) {
            for (String next : q.keySet()) {
                mo13702a(httpURLConnection, next, q.get(next));
            }
        }
    }

    /* renamed from: a */
    public final void mo13702a(HttpURLConnection httpURLConnection, String str, String str2) {
        if (httpURLConnection != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            IAlog.m9900a(1, (Exception) null, "%s %s : %s", "REQUEST_HEADER", str, str2);
            httpURLConnection.addRequestProperty(str, str2);
        }
    }
}
