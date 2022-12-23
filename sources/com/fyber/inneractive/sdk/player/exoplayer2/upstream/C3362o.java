package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import com.amazonaws.http.HttpHeader;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3395m;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.o */
public class C3362o implements C3353g {

    /* renamed from: q */
    public static final Pattern f12034q = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: r */
    public static final AtomicReference<byte[]> f12035r = new AtomicReference<>();

    /* renamed from: a */
    public final boolean f12036a;

    /* renamed from: b */
    public final int f12037b;

    /* renamed from: c */
    public final int f12038c;

    /* renamed from: d */
    public final String f12039d;

    /* renamed from: e */
    public final C3395m<String> f12040e = null;

    /* renamed from: f */
    public final C3371w f12041f;

    /* renamed from: g */
    public final C3371w f12042g;

    /* renamed from: h */
    public final C3327a0<? super C3362o> f12043h;

    /* renamed from: i */
    public C3357j f12044i;

    /* renamed from: j */
    public HttpURLConnection f12045j;

    /* renamed from: k */
    public InputStream f12046k;

    /* renamed from: l */
    public boolean f12047l;

    /* renamed from: m */
    public long f12048m;

    /* renamed from: n */
    public long f12049n;

    /* renamed from: o */
    public long f12050o;

    /* renamed from: p */
    public long f12051p;

    public C3362o(String str, C3395m<String> mVar, C3327a0<? super C3362o> a0Var, int i, int i2, boolean z, C3371w wVar) {
        this.f12039d = C3380a.m8504a(str);
        this.f12043h = a0Var;
        this.f12042g = new C3371w();
        this.f12037b = i;
        this.f12038c = i2;
        this.f12036a = z;
        this.f12041f = wVar;
    }

    /* renamed from: a */
    public Uri mo13781a() {
        HttpURLConnection httpURLConnection = this.f12045j;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* renamed from: b */
    public final HttpURLConnection mo14511b(C3357j jVar) throws IOException {
        HttpURLConnection a;
        C3357j jVar2 = jVar;
        URL url = new URL(jVar2.f12004a.toString());
        byte[] bArr = jVar2.f12005b;
        long j = jVar2.f12007d;
        long j2 = jVar2.f12008e;
        boolean a2 = jVar2.mo14502a(1);
        if (!this.f12036a) {
            return mo14509a(url, bArr, j, j2, a2, true);
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i <= 20) {
                long j3 = j;
                int i3 = i2;
                a = mo14509a(url, bArr, j, j2, a2, false);
                int responseCode = a.getResponseCode();
                if (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || (bArr == null && (responseCode == 307 || responseCode == 308))) {
                    bArr = null;
                    String headerField = a.getHeaderField(HttpHeader.LOCATION);
                    a.disconnect();
                    if (headerField != null) {
                        URL url2 = new URL(url, headerField);
                        String protocol = url2.getProtocol();
                        if ("https".equals(protocol) || "http".equals(protocol)) {
                            url = url2;
                            i = i3;
                            j = j3;
                        } else {
                            throw new ProtocolException(C25541a.m63881k("Unsupported protocol redirect: ", protocol));
                        }
                    } else {
                        throw new ProtocolException("Null location redirect");
                    }
                }
            } else {
                throw new NoRouteToHostException(C16759e.m42349e("Too many redirects: ", i2));
            }
        }
        return a;
    }

    /* renamed from: c */
    public final void mo14513c() throws IOException {
        if (this.f12050o != this.f12048m) {
            byte[] andSet = f12035r.getAndSet((Object) null);
            if (andSet == null) {
                andSet = new byte[4096];
            }
            while (true) {
                long j = this.f12050o;
                long j2 = this.f12048m;
                if (j != j2) {
                    int read = this.f12046k.read(andSet, 0, (int) Math.min(j2 - j, (long) andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        long j3 = (long) read;
                        this.f12050o += j3;
                        C3327a0<? super C3362o> a0Var = this.f12043h;
                        if (a0Var != null) {
                            C3359l lVar = (C3359l) a0Var;
                            synchronized (lVar) {
                                lVar.f12022d += j3;
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                } else {
                    f12035r.set(andSet);
                    return;
                }
            }
        }
    }

    public void close() throws C3368t {
        try {
            if (this.f12046k != null) {
                HttpURLConnection httpURLConnection = this.f12045j;
                long j = this.f12049n;
                if (j != -1) {
                    j -= this.f12051p;
                }
                m8471a(httpURLConnection, j);
                this.f12046k.close();
            }
            this.f12046k = null;
            mo14512b();
            if (this.f12047l) {
                this.f12047l = false;
                C3327a0<? super C3362o> a0Var = this.f12043h;
                if (a0Var != null) {
                    ((C3359l) a0Var).mo14507a(this);
                }
            }
        } catch (IOException e) {
            throw new C3368t(e, this.f12044i, 3);
        } catch (Throwable th) {
            this.f12046k = null;
            mo14512b();
            if (this.f12047l) {
                this.f12047l = false;
                C3327a0<? super C3362o> a0Var2 = this.f12043h;
                if (a0Var2 != null) {
                    ((C3359l) a0Var2).mo14507a(this);
                }
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r4 != 0) goto L_0x0043;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ac  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo13780a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3357j r13) throws com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3368t {
        /*
            r12 = this;
            java.lang.String r0 = "Unable to connect to "
            r12.f12044i = r13
            r1 = 0
            r12.f12051p = r1
            r12.f12050o = r1
            r3 = 1
            java.net.HttpURLConnection r4 = r12.mo14511b(r13)     // Catch:{ IOException -> 0x010e }
            r12.f12045j = r4     // Catch:{ IOException -> 0x010e }
            int r0 = r4.getResponseCode()     // Catch:{ IOException -> 0x00f3 }
            r4 = 200(0xc8, float:2.8E-43)
            if (r0 < r4) goto L_0x00d7
            r5 = 299(0x12b, float:4.19E-43)
            if (r0 <= r5) goto L_0x001f
            goto L_0x00d7
        L_0x001f:
            java.net.HttpURLConnection r5 = r12.f12045j
            java.lang.String r5 = r5.getContentType()
            com.fyber.inneractive.sdk.player.exoplayer2.util.m<java.lang.String> r6 = r12.f12040e
            if (r6 == 0) goto L_0x0039
            boolean r6 = r6.mo14575a(r5)
            if (r6 == 0) goto L_0x0030
            goto L_0x0039
        L_0x0030:
            r12.mo14512b()
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.u r0 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.u
            r0.<init>(r5, r13)
            throw r0
        L_0x0039:
            if (r0 != r4) goto L_0x0042
            long r4 = r13.f12007d
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            r4 = r1
        L_0x0043:
            r12.f12048m = r4
            boolean r0 = r13.mo14502a(r3)
            if (r0 != 0) goto L_0x00b3
            long r4 = r13.f12008e
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0056
            r12.f12049n = r4
            goto L_0x00b7
        L_0x0056:
            java.net.HttpURLConnection r0 = r12.f12045j
            java.lang.String r4 = "Content-Length"
            java.lang.String r4 = r0.getHeaderField(r4)
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x006a
            long r4 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x0069 }
            goto L_0x006b
        L_0x0069:
        L_0x006a:
            r4 = r6
        L_0x006b:
            java.lang.String r8 = "Content-Range"
            java.lang.String r0 = r0.getHeaderField(r8)
            boolean r8 = android.text.TextUtils.isEmpty(r0)
            if (r8 != 0) goto L_0x00a8
            java.util.regex.Pattern r8 = f12034q
            java.util.regex.Matcher r0 = r8.matcher(r0)
            boolean r8 = r0.find()
            if (r8 == 0) goto L_0x00a8
            r8 = 2
            java.lang.String r8 = r0.group(r8)     // Catch:{ NumberFormatException -> 0x00a7 }
            long r8 = java.lang.Long.parseLong(r8)     // Catch:{ NumberFormatException -> 0x00a7 }
            java.lang.String r0 = r0.group(r3)     // Catch:{ NumberFormatException -> 0x00a7 }
            long r10 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x00a7 }
            long r8 = r8 - r10
            r10 = 1
            long r8 = r8 + r10
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x009e
            r4 = r8
            goto L_0x00a8
        L_0x009e:
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x00a8
            long r4 = java.lang.Math.max(r4, r8)     // Catch:{ NumberFormatException -> 0x00a7 }
            goto L_0x00a8
        L_0x00a7:
        L_0x00a8:
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00b0
            long r0 = r12.f12048m
            long r6 = r4 - r0
        L_0x00b0:
            r12.f12049n = r6
            goto L_0x00b7
        L_0x00b3:
            long r0 = r13.f12008e
            r12.f12049n = r0
        L_0x00b7:
            java.net.HttpURLConnection r0 = r12.f12045j     // Catch:{ IOException -> 0x00cd }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x00cd }
            r12.f12046k = r0     // Catch:{ IOException -> 0x00cd }
            r12.f12047l = r3
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.a0<? super com.fyber.inneractive.sdk.player.exoplayer2.upstream.o> r0 = r12.f12043h
            if (r0 == 0) goto L_0x00ca
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.l r0 = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3359l) r0
            r0.mo14508a(r12, r13)
        L_0x00ca:
            long r0 = r12.f12049n
            return r0
        L_0x00cd:
            r0 = move-exception
            r12.mo14512b()
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.t r1 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.t
            r1.<init>((java.io.IOException) r0, (com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3357j) r13, (int) r3)
            throw r1
        L_0x00d7:
            java.net.HttpURLConnection r1 = r12.f12045j
            java.util.Map r1 = r1.getHeaderFields()
            r12.mo14512b()
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.v r2 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.v
            r2.<init>(r0, r1, r13)
            r13 = 416(0x1a0, float:5.83E-43)
            if (r0 != r13) goto L_0x00f2
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.h r13 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
            r0 = 0
            r13.<init>(r0)
            r2.initCause(r13)
        L_0x00f2:
            throw r2
        L_0x00f3:
            r1 = move-exception
            r12.mo14512b()
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.t r2 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.t
            java.lang.StringBuilder r0 = p379.C13555b.m33972k(r0)
            android.net.Uri r4 = r13.f12004a
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0, r1, r13, r3)
            throw r2
        L_0x010e:
            r1 = move-exception
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.t r2 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.t
            java.lang.StringBuilder r0 = p379.C13555b.m33972k(r0)
            android.net.Uri r4 = r13.f12004a
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0, r1, r13, r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3362o.mo13780a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.j):long");
    }

    /* renamed from: b */
    public final int mo14510b(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f12049n;
        if (j != -1) {
            long j2 = j - this.f12051p;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min((long) i2, j2);
        }
        int read = this.f12046k.read(bArr, i, i2);
        if (read != -1) {
            long j3 = (long) read;
            this.f12051p += j3;
            C3327a0<? super C3362o> a0Var = this.f12043h;
            if (a0Var != null) {
                C3359l lVar = (C3359l) a0Var;
                synchronized (lVar) {
                    lVar.f12022d += j3;
                }
            }
            return read;
        } else if (this.f12049n == -1) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: b */
    public final void mo14512b() {
        HttpURLConnection httpURLConnection = this.f12045j;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception unused) {
            }
            this.f12045j = null;
        }
    }

    /* renamed from: a */
    public int mo13779a(byte[] bArr, int i, int i2) throws C3368t {
        try {
            mo14513c();
            return mo14510b(bArr, i, i2);
        } catch (IOException e) {
            throw new C3368t(e, this.f12044i, 2);
        }
    }

    /* renamed from: a */
    public final HttpURLConnection mo14509a(URL url, byte[] bArr, long j, long j2, boolean z, boolean z2) throws IOException {
        Map<String, String> map;
        Map<String, String> map2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        httpURLConnection.setConnectTimeout(this.f12037b);
        httpURLConnection.setReadTimeout(this.f12038c);
        C3371w wVar = this.f12041f;
        if (wVar != null) {
            synchronized (wVar) {
                if (wVar.f12065b == null) {
                    wVar.f12065b = Collections.unmodifiableMap(new HashMap(wVar.f12064a));
                }
                map2 = wVar.f12065b;
            }
            for (Map.Entry next : map2.entrySet()) {
                httpURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
            }
        }
        C3371w wVar2 = this.f12042g;
        synchronized (wVar2) {
            if (wVar2.f12065b == null) {
                wVar2.f12065b = Collections.unmodifiableMap(new HashMap(wVar2.f12064a));
            }
            map = wVar2.f12065b;
        }
        for (Map.Entry next2 : map.entrySet()) {
            httpURLConnection.setRequestProperty((String) next2.getKey(), (String) next2.getValue());
        }
        if (!(j == 0 && j2 == -1)) {
            String e = C16530d.m42012e("bytes=", j, "-");
            if (j2 != -1) {
                StringBuilder k = C13555b.m33972k(e);
                k.append((j + j2) - 1);
                e = k.toString();
            }
            httpURLConnection.setRequestProperty("Range", e);
        }
        httpURLConnection.setRequestProperty(HttpHeader.USER_AGENT, this.f12039d);
        if (!z) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod("POST");
            if (bArr.length == 0) {
                httpURLConnection.connect();
            } else {
                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                httpURLConnection.connect();
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr);
                outputStream.close();
            }
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    /* renamed from: a */
    public static void m8471a(HttpURLConnection httpURLConnection, long j) {
        int i = C3406u.f12148a;
        if (i == 19 || i == 20) {
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
                if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || name.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")) {
                    Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }
}
