package p265tb;

import android.net.Uri;
import com.amazonaws.http.HttpHeader;
import com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import p277ub.C6774a0;
import p277ub.C6776b0;
import p624ld.C18192e;

/* renamed from: tb.o */
public final class C6664o extends C6651d {

    /* renamed from: e */
    public final boolean f20726e = false;

    /* renamed from: f */
    public final int f20727f;

    /* renamed from: g */
    public final int f20728g;

    /* renamed from: h */
    public final String f20729h;

    /* renamed from: i */
    public final C6667q f20730i;

    /* renamed from: j */
    public final C6667q f20731j;

    /* renamed from: k */
    public C18192e<String> f20732k;

    /* renamed from: l */
    public C6657i f20733l;

    /* renamed from: m */
    public HttpURLConnection f20734m;

    /* renamed from: n */
    public InputStream f20735n;

    /* renamed from: o */
    public boolean f20736o;

    /* renamed from: p */
    public int f20737p;

    /* renamed from: q */
    public long f20738q;

    /* renamed from: r */
    public long f20739r;

    /* renamed from: tb.o$a */
    public static final class C6665a implements C6666p {

        /* renamed from: a */
        public final C6667q f20740a = new C6667q();

        /* renamed from: b */
        public String f20741b;

        /* renamed from: c */
        public int f20742c = ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED;

        /* renamed from: d */
        public int f20743d = ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED;

        /* renamed from: a */
        public final C6654g mo22825a() {
            return new C6664o(this.f20741b, this.f20742c, this.f20743d, this.f20740a);
        }
    }

    public C6664o(String str, int i, int i2, C6667q qVar) {
        super(true);
        this.f20729h = str;
        this.f20727f = i;
        this.f20728g = i2;
        this.f20730i = qVar;
        this.f20732k = null;
        this.f20731j = new C6667q();
    }

    /* renamed from: p */
    public static URL m15737p(URL url, String str) throws IOException {
        String str2;
        if (str != null) {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if ("https".equals(protocol) || "http".equals(protocol)) {
                return url2;
            }
            String valueOf = String.valueOf(protocol);
            if (valueOf.length() != 0) {
                str2 = "Unsupported protocol redirect: ".concat(valueOf);
            } else {
                str2 = new String("Unsupported protocol redirect: ");
            }
            throw new ProtocolException(str2);
        }
        throw new ProtocolException("Null location redirect");
    }

    /* renamed from: s */
    public static void m15738s(HttpURLConnection httpURLConnection, long j) {
        int i;
        if (httpURLConnection != null && (i = C6774a0.f20959a) >= 19 && i <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                    superclass.getClass();
                    Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public final Map<String, List<String>> mo20679b() {
        HttpURLConnection httpURLConnection = this.f20734m;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    public final void close() throws HttpDataSource$HttpDataSourceException {
        try {
            InputStream inputStream = this.f20735n;
            if (inputStream != null) {
                long j = this.f20738q;
                long j2 = -1;
                if (j != -1) {
                    j2 = j - this.f20739r;
                }
                m15738s(this.f20734m, j2);
                inputStream.close();
            }
            this.f20735n = null;
            mo22841o();
            if (this.f20736o) {
                this.f20736o = false;
                mo22822l();
            }
        } catch (IOException e) {
            C6657i iVar = this.f20733l;
            int i = C6774a0.f20959a;
            throw new HttpDataSource$HttpDataSourceException(e, iVar, 3);
        } catch (Throwable th) {
            this.f20735n = null;
            mo22841o();
            if (this.f20736o) {
                this.f20736o = false;
                mo22822l();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:72:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0155 A[SYNTHETIC, Splitter:B:74:0x0155] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01aa  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo16699e(p265tb.C6657i r14) throws com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException {
        /*
            r13 = this;
            java.lang.String r0 = "Unable to connect"
            r13.f20733l = r14
            r1 = 0
            r13.f20739r = r1
            r13.f20738q = r1
            r13.mo22823m(r14)
            java.net.HttpURLConnection r3 = r13.mo22843r(r14)     // Catch:{ IOException -> 0x0205 }
            r13.f20734m = r3     // Catch:{ IOException -> 0x0205 }
            int r4 = r3.getResponseCode()     // Catch:{ IOException -> 0x01fb }
            r13.f20737p = r4     // Catch:{ IOException -> 0x01fb }
            java.lang.String r7 = r3.getResponseMessage()     // Catch:{ IOException -> 0x01fb }
            int r0 = r13.f20737p
            java.lang.String r4 = "Content-Range"
            r5 = 200(0xc8, float:2.8E-43)
            r8 = -1
            r6 = 1
            if (r0 < r5) goto L_0x0171
            r10 = 299(0x12b, float:4.19E-43)
            if (r0 <= r10) goto L_0x002e
            goto L_0x0171
        L_0x002e:
            java.lang.String r0 = r3.getContentType()
            ld.e<java.lang.String> r7 = r13.f20732k
            if (r7 == 0) goto L_0x0046
            boolean r7 = r7.apply(r0)
            if (r7 == 0) goto L_0x003d
            goto L_0x0046
        L_0x003d:
            r13.mo22841o()
            com.google.android.exoplayer2.upstream.HttpDataSource$InvalidContentTypeException r1 = new com.google.android.exoplayer2.upstream.HttpDataSource$InvalidContentTypeException
            r1.<init>(r0, r14)
            throw r1
        L_0x0046:
            int r0 = r13.f20737p
            if (r0 != r5) goto L_0x0051
            long r10 = r14.f20673f
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0051
            r1 = r10
        L_0x0051:
            java.lang.String r0 = "Content-Encoding"
            java.lang.String r0 = r3.getHeaderField(r0)
            java.lang.String r5 = "gzip"
            boolean r0 = r5.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x00f9
            long r10 = r14.f20674g
            int r5 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r5 == 0) goto L_0x0069
            r13.f20738q = r10
            goto L_0x00fd
        L_0x0069:
            java.lang.String r5 = "Content-Length"
            java.lang.String r5 = r3.getHeaderField(r5)
            java.lang.String r4 = r3.getHeaderField(r4)
            java.util.regex.Pattern r7 = p265tb.C6668r.f20746a
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            if (r7 != 0) goto L_0x008b
            long r8 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x0080 }
            goto L_0x008b
        L_0x0080:
            r7 = 28
            int r7 = p001a0.C0016g.m25h(r5, r7)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r7)
        L_0x008b:
            boolean r7 = android.text.TextUtils.isEmpty(r4)
            if (r7 != 0) goto L_0x00ec
            java.util.regex.Pattern r7 = p265tb.C6668r.f20746a
            java.util.regex.Matcher r7 = r7.matcher(r4)
            boolean r10 = r7.matches()
            if (r10 == 0) goto L_0x00ec
            r10 = 2
            java.lang.String r10 = r7.group(r10)     // Catch:{ NumberFormatException -> 0x00e1 }
            r10.getClass()     // Catch:{ NumberFormatException -> 0x00e1 }
            long r10 = java.lang.Long.parseLong(r10)     // Catch:{ NumberFormatException -> 0x00e1 }
            java.lang.String r6 = r7.group(r6)     // Catch:{ NumberFormatException -> 0x00e1 }
            r6.getClass()     // Catch:{ NumberFormatException -> 0x00e1 }
            long r6 = java.lang.Long.parseLong(r6)     // Catch:{ NumberFormatException -> 0x00e1 }
            long r10 = r10 - r6
            r6 = 1
            long r10 = r10 + r6
            r6 = 0
            int r12 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r12 >= 0) goto L_0x00c0
            r8 = r10
            goto L_0x00ec
        L_0x00c0:
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x00ec
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ NumberFormatException -> 0x00e1 }
            int r5 = r5.length()     // Catch:{ NumberFormatException -> 0x00e1 }
            int r5 = r5 + 26
            java.lang.String r6 = java.lang.String.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00e1 }
            int r6 = r6.length()     // Catch:{ NumberFormatException -> 0x00e1 }
            int r5 = r5 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x00e1 }
            r6.<init>(r5)     // Catch:{ NumberFormatException -> 0x00e1 }
            long r8 = java.lang.Math.max(r8, r10)     // Catch:{ NumberFormatException -> 0x00e1 }
            goto L_0x00ec
        L_0x00e1:
            r5 = 27
            int r4 = p001a0.C0016g.m25h(r4, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
        L_0x00ec:
            r4 = -1
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x00f4
            long r8 = r8 - r1
            goto L_0x00f6
        L_0x00f4:
            r8 = -1
        L_0x00f6:
            r13.f20738q = r8
            goto L_0x00fd
        L_0x00f9:
            long r4 = r14.f20674g
            r13.f20738q = r4
        L_0x00fd:
            java.io.InputStream r3 = r3.getInputStream()     // Catch:{ IOException -> 0x0166 }
            r13.f20735n = r3     // Catch:{ IOException -> 0x0166 }
            if (r0 == 0) goto L_0x010e
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x0166 }
            java.io.InputStream r3 = r13.f20735n     // Catch:{ IOException -> 0x0166 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x0166 }
            r13.f20735n = r0     // Catch:{ IOException -> 0x0166 }
        L_0x010e:
            r0 = 1
            r13.f20736o = r0
            r13.mo22824n(r14)
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x011b
            goto L_0x014f
        L_0x011b:
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r5 = new byte[r0]     // Catch:{ IOException -> 0x015b }
        L_0x011f:
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 <= 0) goto L_0x014f
            long r6 = (long) r0     // Catch:{ IOException -> 0x015b }
            long r6 = java.lang.Math.min(r1, r6)     // Catch:{ IOException -> 0x015b }
            int r0 = (int) r6     // Catch:{ IOException -> 0x015b }
            java.io.InputStream r6 = r13.f20735n     // Catch:{ IOException -> 0x015b }
            int r7 = p277ub.C6774a0.f20959a     // Catch:{ IOException -> 0x015b }
            r7 = 0
            int r0 = r6.read(r5, r7, r0)     // Catch:{ IOException -> 0x015b }
            java.lang.Thread r6 = java.lang.Thread.currentThread()     // Catch:{ IOException -> 0x015b }
            boolean r6 = r6.isInterrupted()     // Catch:{ IOException -> 0x015b }
            if (r6 != 0) goto L_0x0149
            r6 = -1
            if (r0 != r6) goto L_0x0141
            r0 = 0
            goto L_0x0150
        L_0x0141:
            long r6 = (long) r0     // Catch:{ IOException -> 0x015b }
            long r1 = r1 - r6
            r13.mo22821k(r0)     // Catch:{ IOException -> 0x015b }
            r0 = 4096(0x1000, float:5.74E-42)
            goto L_0x011f
        L_0x0149:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch:{ IOException -> 0x015b }
            r0.<init>()     // Catch:{ IOException -> 0x015b }
            throw r0     // Catch:{ IOException -> 0x015b }
        L_0x014f:
            r0 = 1
        L_0x0150:
            if (r0 == 0) goto L_0x0155
            long r0 = r13.f20738q
            return r0
        L_0x0155:
            com.google.android.exoplayer2.upstream.DataSourceException r0 = new com.google.android.exoplayer2.upstream.DataSourceException     // Catch:{ IOException -> 0x015b }
            r0.<init>()     // Catch:{ IOException -> 0x015b }
            throw r0     // Catch:{ IOException -> 0x015b }
        L_0x015b:
            r0 = move-exception
            r13.mo22841o()
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r1 = new com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException
            r2 = 1
            r1.<init>((java.io.IOException) r0, (p265tb.C6657i) r14, (int) r2)
            throw r1
        L_0x0166:
            r0 = move-exception
            r1 = 1
            r13.mo22841o()
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r2 = new com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException
            r2.<init>((java.io.IOException) r0, (p265tb.C6657i) r14, (int) r1)
            throw r2
        L_0x0171:
            java.util.Map r8 = r3.getHeaderFields()
            int r0 = r13.f20737p
            r11 = 416(0x1a0, float:5.83E-43)
            if (r0 != r11) goto L_0x01b9
            java.lang.String r0 = r3.getHeaderField(r4)
            java.util.regex.Pattern r4 = p265tb.C6668r.f20746a
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 == 0) goto L_0x0188
            goto L_0x01a1
        L_0x0188:
            java.util.regex.Pattern r4 = p265tb.C6668r.f20747b
            java.util.regex.Matcher r0 = r4.matcher(r0)
            boolean r4 = r0.matches()
            if (r4 == 0) goto L_0x01a1
            r4 = 1
            java.lang.String r0 = r0.group(r4)
            r0.getClass()
            long r5 = java.lang.Long.parseLong(r0)
            goto L_0x01a4
        L_0x01a1:
            r4 = 1
            r5 = -1
        L_0x01a4:
            long r9 = r14.f20673f
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x01b9
            r13.f20736o = r4
            r13.mo22824n(r14)
            long r3 = r14.f20674g
            r5 = -1
            int r14 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r14 == 0) goto L_0x01b8
            r1 = r3
        L_0x01b8:
            return r1
        L_0x01b9:
            java.io.InputStream r0 = r3.getErrorStream()
            if (r0 == 0) goto L_0x01db
            int r1 = p277ub.C6774a0.f20959a     // Catch:{ IOException -> 0x01df }
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = new byte[r1]     // Catch:{ IOException -> 0x01df }
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x01df }
            r2.<init>()     // Catch:{ IOException -> 0x01df }
        L_0x01ca:
            int r3 = r0.read(r1)     // Catch:{ IOException -> 0x01df }
            r4 = -1
            if (r3 == r4) goto L_0x01d6
            r4 = 0
            r2.write(r1, r4, r3)     // Catch:{ IOException -> 0x01df }
            goto L_0x01ca
        L_0x01d6:
            byte[] r0 = r2.toByteArray()     // Catch:{ IOException -> 0x01df }
            goto L_0x01dd
        L_0x01db:
            byte[] r0 = p277ub.C6774a0.f20964f     // Catch:{ IOException -> 0x01df }
        L_0x01dd:
            r10 = r0
            goto L_0x01e2
        L_0x01df:
            byte[] r0 = p277ub.C6774a0.f20964f
            goto L_0x01dd
        L_0x01e2:
            r13.mo22841o()
            com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException r0 = new com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException
            int r6 = r13.f20737p
            r5 = r0
            r9 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            int r14 = r13.f20737p
            if (r14 != r11) goto L_0x01fa
            com.google.android.exoplayer2.upstream.DataSourceException r14 = new com.google.android.exoplayer2.upstream.DataSourceException
            r14.<init>()
            r0.initCause(r14)
        L_0x01fa:
            throw r0
        L_0x01fb:
            r1 = move-exception
            r13.mo22841o()
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r2 = new com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException
            r2.<init>((java.lang.String) r0, (java.io.IOException) r1, (p265tb.C6657i) r14)
            throw r2
        L_0x0205:
            r1 = move-exception
            java.lang.String r2 = r1.getMessage()
            if (r2 == 0) goto L_0x021e
            java.lang.String r2 = com.google.android.play.core.appupdate.C14226d.m35341H0(r2)
            java.lang.String r3 = "cleartext http traffic.*not permitted.*"
            boolean r2 = r2.matches(r3)
            if (r2 == 0) goto L_0x021e
            com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException r0 = new com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException
            r0.<init>(r1, r14)
            throw r0
        L_0x021e:
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r2 = new com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException
            r2.<init>((java.lang.String) r0, (java.io.IOException) r1, (p265tb.C6657i) r14)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p265tb.C6664o.mo16699e(tb.i):long");
    }

    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.f20734m;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* renamed from: o */
    public final void mo22841o() {
        HttpURLConnection httpURLConnection = this.f20734m;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                C6776b0.m15968a("Unexpected error while disconnecting", e);
            }
            this.f20734m = null;
        }
    }

    /* renamed from: q */
    public final HttpURLConnection mo22842q(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map<String, String> map) throws IOException {
        Map<String, String> map2;
        String str;
        String str2;
        boolean z3;
        String str3;
        Map<String, String> map3;
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        httpURLConnection.setConnectTimeout(this.f20727f);
        httpURLConnection.setReadTimeout(this.f20728g);
        HashMap hashMap = new HashMap();
        C6667q qVar = this.f20730i;
        if (qVar != null) {
            synchronized (qVar) {
                if (qVar.f20745b == null) {
                    qVar.f20745b = Collections.unmodifiableMap(new HashMap(qVar.f20744a));
                }
                map3 = qVar.f20745b;
            }
            hashMap.putAll(map3);
        }
        C6667q qVar2 = this.f20731j;
        synchronized (qVar2) {
            if (qVar2.f20745b == null) {
                qVar2.f20745b = Collections.unmodifiableMap(new HashMap(qVar2.f20744a));
            }
            map2 = qVar2.f20745b;
        }
        hashMap.putAll(map2);
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = C6668r.f20746a;
        if (j == 0 && j2 == -1) {
            str = null;
        } else {
            StringBuilder g = C16759e.m42351g("bytes=", j, "-");
            if (j2 != -1) {
                g.append((j + j2) - 1);
            }
            str = g.toString();
        }
        if (str != null) {
            httpURLConnection.setRequestProperty("Range", str);
        }
        String str4 = this.f20729h;
        if (str4 != null) {
            httpURLConnection.setRequestProperty(HttpHeader.USER_AGENT, str4);
        }
        if (z) {
            str2 = "gzip";
        } else {
            str2 = "identity";
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", str2);
        httpURLConnection.setInstanceFollowRedirects(z2);
        if (bArr != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        httpURLConnection.setDoOutput(z3);
        if (i == 1) {
            str3 = "GET";
        } else if (i == 2) {
            str3 = "POST";
        } else if (i == 3) {
            str3 = "HEAD";
        } else {
            throw new IllegalStateException();
        }
        httpURLConnection.setRequestMethod(str3);
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    /* renamed from: r */
    public final HttpURLConnection mo22843r(C6657i iVar) throws IOException {
        boolean z;
        HttpURLConnection q;
        C6657i iVar2 = iVar;
        URL url = new URL(iVar2.f20668a.toString());
        int i = iVar2.f20670c;
        byte[] bArr = iVar2.f20671d;
        long j = iVar2.f20673f;
        long j2 = iVar2.f20674g;
        int i2 = 0;
        if ((iVar2.f20676i & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!this.f20726e) {
            return mo22842q(url, i, bArr, j, j2, z, true, iVar2.f20672e);
        }
        while (true) {
            int i3 = i2 + 1;
            if (i2 <= 20) {
                int i4 = i3;
                long j3 = j2;
                long j4 = j;
                q = mo22842q(url, i, bArr, j, j2, z, false, iVar2.f20672e);
                int responseCode = q.getResponseCode();
                String headerField = q.getHeaderField(HttpHeader.LOCATION);
                if ((i == 1 || i == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                    q.disconnect();
                    url = m15737p(url, headerField);
                } else if (i != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return q;
                } else {
                    q.disconnect();
                    url = m15737p(url, headerField);
                    i = 1;
                    bArr = null;
                }
                iVar2 = iVar;
                i2 = i4;
                j2 = j3;
                j = j4;
            } else {
                throw new NoRouteToHostException(C13715c.m34241g(31, "Too many redirects: ", i3));
            }
        }
        return q;
    }

    public final int read(byte[] bArr, int i, int i2) throws HttpDataSource$HttpDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.f20738q;
            if (j != -1) {
                long j2 = j - this.f20739r;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min((long) i2, j2);
            }
            InputStream inputStream = this.f20735n;
            int i3 = C6774a0.f20959a;
            int read = inputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            this.f20739r += (long) read;
            mo22821k(read);
            return read;
        } catch (IOException e) {
            C6657i iVar = this.f20733l;
            int i4 = C6774a0.f20959a;
            throw new HttpDataSource$HttpDataSourceException(e, iVar, 2);
        }
    }
}
