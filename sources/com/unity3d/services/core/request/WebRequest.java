package com.unity3d.services.core.request;

import com.braze.models.BrazeGeofence;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.unity3d.services.core.log.DeviceLog;
import com.usebutton.sdk.internal.util.UrlPrivacyValidator;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

public class WebRequest {
    private ByteArrayOutputStream _baos;
    private byte[] _body;
    private boolean _canceled;
    private int _connectTimeout;
    private long _contentLength;
    private Map<String, List<String>> _headers;
    private IWebRequestProgressListener _progressListener;
    private int _readTimeout;
    private String _requestType;
    private int _responseCode;
    private Map<String, List<String>> _responseHeaders;
    private URL _url;

    public enum RequestType {
        POST,
        GET,
        HEAD
    }

    public WebRequest(String str, String str2) throws MalformedURLException {
        this(str, str2, (Map<String, List<String>>) null);
    }

    private HttpURLConnection getHttpUrlConnectionWithHeaders() throws NetworkIOException, IllegalArgumentException {
        HttpURLConnection httpURLConnection;
        if (getUrl().toString().startsWith(UrlPrivacyValidator.HTTPS_SCHEME)) {
            try {
                httpURLConnection = (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(getUrl().openConnection()));
            } catch (IOException e) {
                StringBuilder k = C13555b.m33972k("Open HTTPS connection: ");
                k.append(e.getMessage());
                throw new NetworkIOException(k.toString());
            }
        } else if (getUrl().toString().startsWith(UrlPrivacyValidator.HTTP_SCHEME)) {
            try {
                httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(getUrl().openConnection()));
            } catch (IOException e2) {
                StringBuilder k2 = C13555b.m33972k("Open HTTP connection: ");
                k2.append(e2.getMessage());
                throw new NetworkIOException(k2.toString());
            }
        } else {
            StringBuilder k3 = C13555b.m33972k("Invalid url-protocol in url: ");
            k3.append(getUrl().toString());
            throw new IllegalArgumentException(k3.toString());
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setConnectTimeout(getConnectTimeout());
        httpURLConnection.setReadTimeout(getReadTimeout());
        try {
            httpURLConnection.setRequestMethod(getRequestType());
            if (getHeaders() != null && getHeaders().size() > 0) {
                for (String next : getHeaders().keySet()) {
                    for (String str : getHeaders().get(next)) {
                        DeviceLog.debug("Setting header: " + next + "=" + str);
                        httpURLConnection.setRequestProperty(next, str);
                    }
                }
            }
            return httpURLConnection;
        } catch (ProtocolException e3) {
            StringBuilder k4 = C13555b.m33972k("Set Request Method: ");
            k4.append(getRequestType());
            k4.append(", ");
            k4.append(e3.getMessage());
            throw new NetworkIOException(k4.toString());
        }
    }

    public void cancel() {
        this._canceled = true;
    }

    public byte[] getBody() {
        return this._body;
    }

    public int getConnectTimeout() {
        return this._connectTimeout;
    }

    public long getContentLength() {
        return this._contentLength;
    }

    public Map<String, List<String>> getHeaders() {
        return this._headers;
    }

    public String getQuery() {
        URL url = this._url;
        if (url != null) {
            return url.getQuery();
        }
        return null;
    }

    public int getReadTimeout() {
        return this._readTimeout;
    }

    public String getRequestType() {
        return this._requestType;
    }

    public int getResponseCode() {
        return this._responseCode;
    }

    public Map<String, List<String>> getResponseHeaders() {
        return this._responseHeaders;
    }

    public URL getUrl() {
        return this._url;
    }

    public boolean isCanceled() {
        return this._canceled;
    }

    public String makeRequest() throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this._baos = byteArrayOutputStream;
        makeStreamRequest(byteArrayOutputStream);
        return this._baos.toString("UTF-8");
    }

    public long makeStreamRequest(OutputStream outputStream) throws Exception {
        InputStream inputStream;
        HttpURLConnection httpUrlConnectionWithHeaders = getHttpUrlConnectionWithHeaders();
        httpUrlConnectionWithHeaders.setDoInput(true);
        if (getRequestType().equals(RequestType.POST.name())) {
            httpUrlConnectionWithHeaders.setDoOutput(true);
            OutputStream outputStream2 = null;
            try {
                OutputStream outputStream3 = httpUrlConnectionWithHeaders.getOutputStream();
                if (getBody() == null) {
                    String query = getQuery();
                    if (query != null) {
                        outputStream3.write(query.getBytes(StandardCharsets.UTF_8));
                    }
                } else {
                    outputStream3.write(getBody());
                }
                outputStream3.flush();
                try {
                    outputStream3.close();
                } catch (Exception e) {
                    Exception exc = e;
                    DeviceLog.exception("Error closing writer", exc);
                    throw exc;
                }
            } catch (IOException e2) {
                DeviceLog.exception("Error while writing POST params", e2);
                throw new NetworkIOException("Error writing POST params: " + e2.getMessage());
            } catch (Throwable th) {
                if (outputStream2 != null) {
                    try {
                        outputStream2.close();
                    } catch (Exception e3) {
                        Exception exc2 = e3;
                        DeviceLog.exception("Error closing writer", exc2);
                        throw exc2;
                    }
                }
                throw th;
            }
        }
        try {
            this._responseCode = httpUrlConnectionWithHeaders.getResponseCode();
            long contentLength = (long) httpUrlConnectionWithHeaders.getContentLength();
            this._contentLength = contentLength;
            if (contentLength == -1) {
                this._contentLength = (long) httpUrlConnectionWithHeaders.getHeaderFieldInt("X-OrigLength", -1);
            }
            ByteArrayOutputStream byteArrayOutputStream = this._baos;
            long j = 0;
            ByteArrayOutputStream byteArrayOutputStream2 = outputStream;
            if (byteArrayOutputStream != null && byteArrayOutputStream == byteArrayOutputStream2 && this._contentLength > 0) {
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream((int) this._contentLength);
                this._baos = byteArrayOutputStream3;
                byteArrayOutputStream2 = byteArrayOutputStream3;
            }
            if (httpUrlConnectionWithHeaders.getHeaderFields() != null) {
                this._responseHeaders = httpUrlConnectionWithHeaders.getHeaderFields();
            }
            try {
                inputStream = httpUrlConnectionWithHeaders.getInputStream();
            } catch (IOException e4) {
                IOException iOException = e4;
                inputStream = httpUrlConnectionWithHeaders.getErrorStream();
                if (inputStream == null) {
                    StringBuilder k = C13555b.m33972k("Can't open error stream: ");
                    k.append(iOException.getMessage());
                    throw new NetworkIOException(k.toString());
                }
            }
            IWebRequestProgressListener iWebRequestProgressListener = this._progressListener;
            if (iWebRequestProgressListener != null) {
                iWebRequestProgressListener.onRequestStart(getUrl().toString(), this._contentLength, this._responseCode, this._responseHeaders);
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            byte[] bArr = new byte[4096];
            int i = 0;
            while (!isCanceled() && i != -1) {
                try {
                    i = bufferedInputStream.read(bArr);
                    if (i > 0) {
                        byteArrayOutputStream2.write(bArr, 0, i);
                        j += (long) i;
                        IWebRequestProgressListener iWebRequestProgressListener2 = this._progressListener;
                        if (iWebRequestProgressListener2 != null) {
                            iWebRequestProgressListener2.onRequestProgress(getUrl().toString(), j, this._contentLength);
                        }
                    }
                } catch (IOException e5) {
                    StringBuilder k2 = C13555b.m33972k("Network exception: ");
                    k2.append(e5.getMessage());
                    throw new NetworkIOException(k2.toString());
                } catch (Exception e6) {
                    StringBuilder k3 = C13555b.m33972k("Unknown Exception: ");
                    k3.append(e6.getMessage());
                    throw new Exception(k3.toString());
                }
            }
            httpUrlConnectionWithHeaders.disconnect();
            byteArrayOutputStream2.flush();
            return j;
        } catch (IOException | RuntimeException e7) {
            StringBuilder k4 = C13555b.m33972k("Response code: ");
            k4.append(e7.getMessage());
            throw new NetworkIOException(k4.toString());
        }
    }

    public void setBody(String str) {
        this._body = str.getBytes(StandardCharsets.UTF_8);
    }

    public void setConnectTimeout(int i) {
        this._connectTimeout = i;
    }

    public void setProgressListener(IWebRequestProgressListener iWebRequestProgressListener) {
        this._progressListener = iWebRequestProgressListener;
    }

    public void setReadTimeout(int i) {
        this._readTimeout = i;
    }

    public WebRequest(String str, String str2, Map<String, List<String>> map) throws MalformedURLException {
        this(str, str2, map, BrazeGeofence.DEFAULT_NOTIFICATION_RESPONSIVENESS_MS, BrazeGeofence.DEFAULT_NOTIFICATION_RESPONSIVENESS_MS);
    }

    public void setBody(byte[] bArr) {
        this._body = bArr;
    }

    public WebRequest(String str, String str2, Map<String, List<String>> map, int i, int i2) throws MalformedURLException {
        this._responseCode = -1;
        this._contentLength = -1;
        this._canceled = false;
        this._url = new URL(str);
        this._requestType = str2;
        this._headers = map;
        this._connectTimeout = i;
        this._readTimeout = i2;
    }
}
