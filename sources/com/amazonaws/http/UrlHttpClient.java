package com.amazonaws.http;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

public class UrlHttpClient implements HttpClient {
    private static final int BUFFER_SIZE_MULTIPLIER = 8;
    private static final int DEFAULT_BUFFER_SIZE = 1024;
    private static final String TAG = "amazonaws";
    private static final Log log = LogFactory.getLog((Class<?>) UrlHttpClient.class);
    private final ClientConfiguration config;

    /* renamed from: sc */
    private SSLContext f6720sc = null;

    public final class CurlBuilder {
        private String content = null;
        private boolean contentOverflow = false;
        private final HashMap<String, String> headers = new HashMap<>();
        private String method = null;
        private final URL url;

        public CurlBuilder(URL url2) {
            if (url2 != null) {
                this.url = url2;
                return;
            }
            throw new IllegalArgumentException("Must have a valid url");
        }

        public String build() {
            if (isValid()) {
                StringBuilder sb = new StringBuilder("curl");
                if (this.method != null) {
                    sb.append(" -X ");
                    sb.append(this.method);
                }
                for (Map.Entry next : this.headers.entrySet()) {
                    sb.append(" -H \"");
                    sb.append((String) next.getKey());
                    sb.append(":");
                    sb.append((String) next.getValue());
                    sb.append("\"");
                }
                if (this.content != null) {
                    sb.append(" -d '");
                    sb.append(this.content);
                    sb.append("'");
                }
                sb.append(" ");
                sb.append(this.url.toString());
                return sb.toString();
            }
            throw new IllegalStateException("Invalid state, cannot create curl command");
        }

        public boolean isValid() {
            return !this.contentOverflow;
        }

        public CurlBuilder setContent(String str) {
            this.content = str;
            return this;
        }

        public CurlBuilder setContentOverflow(boolean z) {
            this.contentOverflow = z;
            return this;
        }

        public CurlBuilder setHeaders(Map<String, String> map) {
            this.headers.clear();
            this.headers.putAll(map);
            return this;
        }

        public CurlBuilder setMethod(String str) {
            this.method = str;
            return this;
        }
    }

    public UrlHttpClient(ClientConfiguration clientConfiguration) {
        this.config = clientConfiguration;
    }

    private void enableCustomTrustManager(HttpsURLConnection httpsURLConnection) {
        if (this.f6720sc == null) {
            TrustManager[] trustManagerArr = {this.config.getTrustManager()};
            try {
                SSLContext instance = SSLContext.getInstance("TLS");
                this.f6720sc = instance;
                instance.init((KeyManager[]) null, trustManagerArr, (SecureRandom) null);
            } catch (GeneralSecurityException e) {
                throw new RuntimeException(e);
            }
        }
        httpsURLConnection.setSSLSocketFactory(this.f6720sc.getSocketFactory());
    }

    private void write(InputStream inputStream, OutputStream outputStream, CurlBuilder curlBuilder, ByteBuffer byteBuffer) throws IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                if (byteBuffer != null) {
                    try {
                        byteBuffer.put(bArr, 0, read);
                    } catch (BufferOverflowException unused) {
                        curlBuilder.setContentOverflow(true);
                    }
                }
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public HttpURLConnection applyHeadersAndMethod(HttpRequest httpRequest, HttpURLConnection httpURLConnection) throws ProtocolException {
        return applyHeadersAndMethod(httpRequest, httpURLConnection, (CurlBuilder) null);
    }

    public void configureConnection(HttpRequest httpRequest, HttpURLConnection httpURLConnection) {
        httpURLConnection.setConnectTimeout(this.config.getConnectionTimeout());
        httpURLConnection.setReadTimeout(this.config.getSocketTimeout());
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setUseCaches(false);
        if (httpRequest.isStreaming()) {
            httpURLConnection.setChunkedStreamingMode(0);
        }
        if (httpURLConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            if (this.config.getTrustManager() != null) {
                enableCustomTrustManager(httpsURLConnection);
            }
        }
    }

    public HttpResponse createHttpResponse(HttpRequest httpRequest, HttpURLConnection httpURLConnection) throws IOException {
        String responseMessage = httpURLConnection.getResponseMessage();
        int responseCode = httpURLConnection.getResponseCode();
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null && !"HEAD".equals(httpRequest.getMethod())) {
            try {
                errorStream = httpURLConnection.getInputStream();
            } catch (IOException unused) {
            }
        }
        HttpResponse.Builder content = HttpResponse.builder().statusCode(responseCode).statusText(responseMessage).content(errorStream);
        for (Map.Entry next : httpURLConnection.getHeaderFields().entrySet()) {
            if (next.getKey() != null) {
                content.header((String) next.getKey(), (String) ((List) next.getValue()).get(0));
            }
        }
        return content.build();
    }

    public HttpResponse execute(HttpRequest httpRequest) throws IOException {
        CurlBuilder curlBuilder;
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(httpRequest.getUri().toURL().openConnection()));
        if (this.config.isCurlLogging()) {
            curlBuilder = new CurlBuilder(httpRequest.getUri().toURL());
        } else {
            curlBuilder = null;
        }
        configureConnection(httpRequest, httpURLConnection);
        applyHeadersAndMethod(httpRequest, httpURLConnection, curlBuilder);
        writeContentToConnection(httpRequest, httpURLConnection, curlBuilder);
        if (curlBuilder != null) {
            if (curlBuilder.isValid()) {
                printToLog(curlBuilder.build());
            } else {
                printToLog("Failed to create curl, content too long");
            }
        }
        return createHttpResponse(httpRequest, httpURLConnection);
    }

    public HttpURLConnection getUrlConnection(URL url) throws IOException {
        return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
    }

    public void printToLog(String str) {
        log.debug(str);
    }

    public void shutdown() {
    }

    public void writeContentToConnection(HttpRequest httpRequest, HttpURLConnection httpURLConnection) throws IOException {
        writeContentToConnection(httpRequest, httpURLConnection, (CurlBuilder) null);
    }

    public HttpURLConnection applyHeadersAndMethod(HttpRequest httpRequest, HttpURLConnection httpURLConnection, CurlBuilder curlBuilder) throws ProtocolException {
        if (httpRequest.getHeaders() != null && !httpRequest.getHeaders().isEmpty()) {
            if (curlBuilder != null) {
                curlBuilder.setHeaders(httpRequest.getHeaders());
            }
            for (Map.Entry next : httpRequest.getHeaders().entrySet()) {
                String str = (String) next.getKey();
                if (!str.equals(HttpHeader.CONTENT_LENGTH) && !str.equals(HttpHeader.HOST)) {
                    str.equals(HttpHeader.EXPECT);
                    httpURLConnection.setRequestProperty(str, (String) next.getValue());
                }
            }
        }
        String method = httpRequest.getMethod();
        httpURLConnection.setRequestMethod(method);
        if (curlBuilder != null) {
            curlBuilder.setMethod(method);
        }
        return httpURLConnection;
    }

    public void writeContentToConnection(HttpRequest httpRequest, HttpURLConnection httpURLConnection, CurlBuilder curlBuilder) throws IOException {
        if (httpRequest.getContent() != null && httpRequest.getContentLength() >= 0) {
            httpURLConnection.setDoOutput(true);
            if (!httpRequest.isStreaming()) {
                httpURLConnection.setFixedLengthStreamingMode((int) httpRequest.getContentLength());
            }
            OutputStream outputStream = httpURLConnection.getOutputStream();
            ByteBuffer byteBuffer = null;
            if (curlBuilder != null) {
                if (httpRequest.getContentLength() < 2147483647L) {
                    byteBuffer = ByteBuffer.allocate((int) httpRequest.getContentLength());
                } else {
                    curlBuilder.setContentOverflow(true);
                }
            }
            write(httpRequest.getContent(), outputStream, curlBuilder, byteBuffer);
            if (!(curlBuilder == null || byteBuffer == null || byteBuffer.position() == 0)) {
                curlBuilder.setContent(new String(byteBuffer.array(), "UTF-8"));
            }
            outputStream.flush();
            outputStream.close();
        }
    }
}
