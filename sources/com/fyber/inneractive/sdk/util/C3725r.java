package com.fyber.inneractive.sdk.util;

import android.annotation.TargetApi;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.amazonaws.http.HttpHeader;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;

/* renamed from: com.fyber.inneractive.sdk.util.r */
public class C3725r {
    @TargetApi(23)
    /* renamed from: a */
    public static boolean m9983a() {
        if (Build.VERSION.SDK_INT >= 23) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m9984b(HttpURLConnection httpURLConnection) throws Exception {
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 200) {
            return true;
        }
        IAlog.m9902a("isResponseValid: found invalid response status: %s", Integer.toString(responseCode));
        return false;
    }

    /* renamed from: a */
    public static String m9981a(String str, int i, int i2, int i3) throws Exception {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.connect();
            InputStream a = m9980a((URLConnection) httpURLConnection);
            String a2 = m9982a(httpURLConnection);
            if (TextUtils.isEmpty(a2)) {
                String stringBuffer = m9984b(httpURLConnection) ? C3727s.m9991a(a, false).toString() : null;
                httpURLConnection.disconnect();
                return stringBuffer;
            } else if (i3 >= 0) {
                httpURLConnection.disconnect();
                return m9981a(a2, i2, i, i3);
            } else {
                throw new Exception("AdServer returned HTTP redirect response more than " + i3 + " times! aborting");
            }
        } catch (Exception e) {
            IAlog.m9901a("getBodyFromUrl failed with exception", e, new Object[0]);
            throw e;
        } catch (Throwable th) {
            IAlog.m9901a("getBodyFromUrl failed with error", th, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public static InputStream m9980a(URLConnection uRLConnection) {
        try {
            InputStream inputStream = uRLConnection.getInputStream();
            if (TextUtils.equals("gzip", uRLConnection.getContentEncoding())) {
                return new GZIPInputStream(inputStream);
            }
            return new BufferedInputStream(inputStream);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m9982a(HttpURLConnection httpURLConnection) throws Exception {
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode != 302 && responseCode != 303 && responseCode != 307) {
            return null;
        }
        IAlog.m9902a("getRedirectUrl: received redirect code %s", Integer.toString(responseCode));
        String headerField = httpURLConnection.getHeaderField(HttpHeader.LOCATION);
        if (!TextUtils.isEmpty(headerField)) {
            IAlog.m9902a("getRedirectUrl: redirecting target url: %s", headerField);
            return headerField;
        }
        StringBuilder k = C13555b.m33972k("Server returned HTTP ");
        k.append(Integer.toString(responseCode));
        k.append(" with empty location header!");
        throw new Exception(k.toString());
    }
}
