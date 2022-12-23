package com.usebutton.sdk.internal.api;

import android.text.TextUtils;
import com.amazonaws.http.HttpHeader;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.usebutton.sdk.internal.core.Response;
import com.usebutton.sdk.internal.functional.Pair;
import com.usebutton.sdk.internal.util.ButtonLog;
import com.usebutton.sdk.internal.util.ButtonUtil;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public class Http {
    private static final String CONTENT_TYPE_JPEG = "image/jpeg";
    private static final String CONTENT_TYPE_JS = "application/javascript";
    private static final String CONTENT_TYPE_JSON = "application/json";
    private static final String CONTENT_TYPE_PNG = "image/png";
    private static final int HTTP_STATUS_BAD_REQUEST = 400;
    private static final int SO_CONNECT_TIMEOUT;
    private static final int SO_READ_TIMEOUT;
    private static final String TAG = "Http";
    private String mUserAgent;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SO_CONNECT_TIMEOUT = (int) timeUnit.toMillis(5);
        SO_READ_TIMEOUT = (int) timeUnit.toMillis(15);
    }

    public Http(String str) {
        this.mUserAgent = str;
    }

    private HttpURLConnection connect(Request request, String str) throws IOException {
        ButtonLog.infoFormat(TAG, "Will request: %s", request.toString());
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(request.url().toString()).openConnection()));
        httpURLConnection.setConnectTimeout(SO_CONNECT_TIMEOUT);
        httpURLConnection.setReadTimeout(SO_READ_TIMEOUT);
        httpURLConnection.setRequestProperty(HttpHeader.USER_AGENT, this.mUserAgent);
        httpURLConnection.setRequestProperty(HttpHeader.ACCEPT, str);
        for (Pair pair : request.headers()) {
            httpURLConnection.setRequestProperty((String) pair.first(), (String) pair.second());
        }
        httpURLConnection.setRequestMethod(request.method());
        String body = request.body();
        if (!TextUtils.isEmpty(body)) {
            ButtonUtil.writeStringToStream(httpURLConnection.getOutputStream(), body);
            ButtonLog.infoFormat(TAG, "POST'ed: %s", body);
        }
        return httpURLConnection;
    }

    private boolean isSupportedImage(String str) {
        return CONTENT_TYPE_PNG.equals(str) || CONTENT_TYPE_JPEG.equals(str);
    }

    private static String limitResetSeconds(HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderField(SessionRateLimiter.RATE_LIMIT_RESET_HEADER);
    }

    private static String requestId(HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderField(Response.HEADER_REQUEST_ID);
    }

    private HttpResponse requestJson(Request request) throws ButtonNetworkException {
        String requestId;
        HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnection = connect(request, CONTENT_TYPE_JSON);
            String streamToString = ButtonUtil.streamToString(streamForConnection(httpURLConnection));
            requestId = requestId(httpURLConnection);
            ButtonLog.infoFormat(TAG, "Response (id=%s) for: %s\n%s", requestId, httpURLConnection.getURL(), streamToString);
            HttpResponse httpResponse = new HttpResponse(httpURLConnection.getResponseCode(), httpURLConnection.getHeaderFields(), new JSONObject(streamToString));
            httpURLConnection.disconnect();
            return httpResponse;
        } catch (JSONException e) {
            throw new ButtonNetworkException("Couldn't parse response body to JSON", requestId, e);
        } catch (IOException e2) {
            String requestId2 = requestId(httpURLConnection);
            ButtonLog.visibleFormat("Network request failed (Request ID: %s)", requestId2);
            throw new ButtonNetworkException("Exception while requesting: " + request.toString(), requestId2, e2);
        } catch (ButtonHttpStatusException e3) {
            try {
                e3.setLimitResetSeconds(limitResetSeconds(httpURLConnection));
                throw e3;
            } catch (Throwable th) {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        }
    }

    private InputStream streamForConnection(HttpURLConnection httpURLConnection) throws IOException, ButtonNetworkException {
        int responseCode = httpURLConnection.getResponseCode();
        ButtonLog.infoFormat(TAG, "%d response for %s", Integer.valueOf(responseCode), httpURLConnection.getURL());
        if (responseCode < HTTP_STATUS_BAD_REQUEST) {
            return httpURLConnection.getInputStream();
        }
        throw new ButtonHttpStatusException(responseCode, httpURLConnection.getURL(), requestId(httpURLConnection));
    }

    public HttpResponse executeRequest(Request request) throws ButtonNetworkException {
        return requestJson(request);
    }

    public String getUserAgent() {
        return this.mUserAgent;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] requestBitmapData(com.usebutton.sdk.internal.api.Request r6) throws com.usebutton.sdk.internal.api.ButtonNetworkException {
        /*
            r5 = this;
            r0 = 0
            java.lang.String r1 = "image/png"
            java.net.HttpURLConnection r6 = r5.connect(r6, r1)     // Catch:{ IOException -> 0x0031, all -> 0x002c }
            java.lang.String r1 = r6.getContentType()     // Catch:{ IOException -> 0x002a }
            boolean r1 = r5.isSupportedImage(r1)     // Catch:{ IOException -> 0x002a }
            if (r1 != 0) goto L_0x0015
            r6.disconnect()
            return r0
        L_0x0015:
            java.io.InputStream r0 = r5.streamForConnection(r6)     // Catch:{ IOException -> 0x002a }
            int r1 = r6.getContentLength()     // Catch:{ IOException -> 0x002a }
            byte[] r1 = com.usebutton.sdk.internal.util.ButtonUtil.streamToByteArray(r0, r1)     // Catch:{ IOException -> 0x002a }
            if (r0 == 0) goto L_0x0026
            r0.close()     // Catch:{ IOException -> 0x002a }
        L_0x0026:
            r6.disconnect()
            return r1
        L_0x002a:
            r0 = move-exception
            goto L_0x0035
        L_0x002c:
            r6 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
            goto L_0x0042
        L_0x0031:
            r6 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
        L_0x0035:
            com.usebutton.sdk.internal.api.ButtonNetworkException r1 = new com.usebutton.sdk.internal.api.ButtonNetworkException     // Catch:{ all -> 0x0041 }
            java.lang.String r2 = "Exception while GET'ing bitmap"
            java.lang.String r3 = requestId(r6)     // Catch:{ all -> 0x0041 }
            r1.<init>(r2, r3, r0)     // Catch:{ all -> 0x0041 }
            throw r1     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r0 = move-exception
        L_0x0042:
            if (r6 == 0) goto L_0x0047
            r6.disconnect()
        L_0x0047:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usebutton.sdk.internal.api.Http.requestBitmapData(com.usebutton.sdk.internal.api.Request):byte[]");
    }

    public byte[] requestJs(Request request) throws ButtonNetworkException {
        HttpURLConnection httpURLConnection = null;
        try {
            HttpURLConnection connect = connect(request, CONTENT_TYPE_JS);
            InputStream streamForConnection = streamForConnection(connect);
            byte[] streamToByteArray = ButtonUtil.streamToByteArray(streamForConnection, connect.getContentLength());
            if (streamForConnection != null) {
                streamForConnection.close();
            }
            connect.disconnect();
            return streamToByteArray;
        } catch (IOException e) {
            throw new ButtonNetworkException("Exception while GET'ing javascript", requestId(httpURLConnection), e);
        } catch (Throwable th) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    public void setUserAgent(String str) {
        this.mUserAgent = str;
    }
}
