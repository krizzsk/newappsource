package com.facebook;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Pair;
import com.amazonaws.http.HttpHeader;
import com.appboy.support.StringUtils;
import com.facebook.internal.C2393d0;
import com.facebook.internal.C2397f0;
import com.facebook.internal.C2400g0;
import com.facebook.internal.C2436x;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.C23816b;
import mf0.C24362h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001a0.C0016g;
import p009a8.C0115o;
import p009a8.C0120s;
import p009a8.C0121t;
import p009a8.C0124u;
import p009a8.C0129x;
import p009a8.C0131z;
import p304x.C7097r;
import uh0.C25072a;
import uh0.C25081h;

public final class GraphRequest {

    /* renamed from: j */
    public static final String f8425j;

    /* renamed from: k */
    public static final Pattern f8426k = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");

    /* renamed from: l */
    public static volatile String f8427l;

    /* renamed from: a */
    public AccessToken f8428a;

    /* renamed from: b */
    public String f8429b;

    /* renamed from: c */
    public JSONObject f8430c;

    /* renamed from: d */
    public Bundle f8431d;

    /* renamed from: e */
    public Object f8432e;

    /* renamed from: f */
    public String f8433f;

    /* renamed from: g */
    public C2280b f8434g;

    /* renamed from: h */
    public HttpMethod f8435h;

    /* renamed from: i */
    public boolean f8436i;

    /* renamed from: com.facebook.GraphRequest$a */
    public static final class C2279a {

        /* renamed from: a */
        public final GraphRequest f8439a;

        /* renamed from: b */
        public final Object f8440b;

        public C2279a(GraphRequest graphRequest, Object obj) {
            this.f8439a = graphRequest;
            this.f8440b = obj;
        }
    }

    /* renamed from: com.facebook.GraphRequest$b */
    public interface C2280b {
        /* renamed from: b */
        void mo200b(C0124u uVar);
    }

    /* renamed from: com.facebook.GraphRequest$c */
    public static final class C2281c {
        /* renamed from: a */
        public static final String m6131a(Object obj) {
            String str = GraphRequest.f8425j;
            if (obj instanceof String) {
                return (String) obj;
            }
            if ((obj instanceof Boolean) || (obj instanceof Number)) {
                return obj.toString();
            }
            if (obj instanceof Date) {
                String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                C24362h.m61210e(format, "iso8601DateFormat.format(value)");
                return format;
            }
            throw new IllegalArgumentException("Unsupported parameter type.");
        }

        /* renamed from: b */
        public static HttpURLConnection m6132b(URL url) throws IOException {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
            if (uRLConnection != null) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
                if (GraphRequest.f8427l == null) {
                    GraphRequest.f8427l = C13555b.m33971j(new Object[]{"FBAndroidSDK", "15.1.0"}, 2, "%s.%s", "java.lang.String.format(format, *args)");
                    if (!C2397f0.m6292A((String) null)) {
                        String format = String.format(Locale.ROOT, "%s/%s", Arrays.copyOf(new Object[]{GraphRequest.f8427l, null}, 2));
                        C24362h.m61210e(format, "java.lang.String.format(locale, format, *args)");
                        GraphRequest.f8427l = format;
                    }
                }
                httpURLConnection.setRequestProperty(HttpHeader.USER_AGENT, GraphRequest.f8427l);
                httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
                httpURLConnection.setChunkedStreamingMode(0);
                return httpURLConnection;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }

        /* renamed from: c */
        public static ArrayList m6133c(C0121t tVar) {
            Exception exc;
            HttpURLConnection httpURLConnection;
            ArrayList arrayList;
            C2400g0.m6340e(tVar);
            HttpURLConnection httpURLConnection2 = null;
            try {
                httpURLConnection = m6146p(tVar);
                exc = null;
            } catch (Exception e) {
                exc = e;
                httpURLConnection = null;
            } catch (Throwable th) {
                th = th;
                C2397f0.m6317k(httpURLConnection2);
                throw th;
            }
            if (httpURLConnection != null) {
                try {
                    arrayList = m6134d(tVar, httpURLConnection);
                } catch (Throwable th2) {
                    th = th2;
                    httpURLConnection2 = httpURLConnection;
                    C2397f0.m6317k(httpURLConnection2);
                    throw th;
                }
            } else {
                int i = C0124u.f363e;
                ArrayList a = C0124u.C0125a.m230a(tVar.f361d, (HttpURLConnection) null, new FacebookException((Throwable) exc));
                m6143m(tVar, a);
                arrayList = a;
            }
            C2397f0.m6317k(httpURLConnection);
            return arrayList;
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x007b  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00e0  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.util.ArrayList m6134d(p009a8.C0121t r11, java.net.HttpURLConnection r12) {
            /*
                java.lang.String r0 = "connection"
                mf0.C24362h.m61211f(r12, r0)
                java.lang.String r0 = "requests"
                mf0.C24362h.m61211f(r11, r0)
                int r0 = p009a8.C0124u.f363e
                java.lang.String r0 = "Response <Error>: %s"
                java.lang.String r1 = "Response"
                r2 = 0
                r3 = 0
                r4 = 1
                boolean r5 = p009a8.C0115o.m216g()     // Catch:{ FacebookException -> 0x0059, Exception -> 0x0041, all -> 0x003e }
                if (r5 == 0) goto L_0x0036
                int r5 = r12.getResponseCode()     // Catch:{ FacebookException -> 0x0059, Exception -> 0x0041, all -> 0x003e }
                r6 = 400(0x190, float:5.6E-43)
                if (r5 < r6) goto L_0x0026
                java.io.InputStream r5 = r12.getErrorStream()     // Catch:{ FacebookException -> 0x0059, Exception -> 0x0041, all -> 0x003e }
                goto L_0x002a
            L_0x0026:
                java.io.InputStream r5 = r12.getInputStream()     // Catch:{ FacebookException -> 0x0059, Exception -> 0x0041, all -> 0x003e }
            L_0x002a:
                java.util.ArrayList r0 = p009a8.C0124u.C0125a.m232c(r5, r12, r11)     // Catch:{ FacebookException -> 0x0034, Exception -> 0x0032 }
                goto L_0x006b
            L_0x002f:
                r3 = r5
                goto L_0x010d
            L_0x0032:
                r6 = move-exception
                goto L_0x0044
            L_0x0034:
                r6 = move-exception
                goto L_0x005c
            L_0x0036:
                java.lang.String r5 = "GraphRequest can't be used when Facebook SDK isn't fully initialized"
                com.facebook.FacebookException r6 = new com.facebook.FacebookException     // Catch:{ FacebookException -> 0x0059, Exception -> 0x0041, all -> 0x003e }
                r6.<init>((java.lang.String) r5)     // Catch:{ FacebookException -> 0x0059, Exception -> 0x0041, all -> 0x003e }
                throw r6     // Catch:{ FacebookException -> 0x0059, Exception -> 0x0041, all -> 0x003e }
            L_0x003e:
                r11 = move-exception
                goto L_0x010d
            L_0x0041:
                r5 = move-exception
                r6 = r5
                r5 = r3
            L_0x0044:
                com.facebook.internal.x$a r7 = com.facebook.internal.C2436x.f8729d     // Catch:{ all -> 0x010a }
                com.facebook.LoggingBehavior r7 = com.facebook.LoggingBehavior.REQUESTS     // Catch:{ all -> 0x010a }
                java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ all -> 0x010a }
                r8[r2] = r6     // Catch:{ all -> 0x010a }
                com.facebook.internal.C2436x.C2437a.m6390b(r7, r1, r0, r8)     // Catch:{ all -> 0x010a }
                com.facebook.FacebookException r0 = new com.facebook.FacebookException     // Catch:{ all -> 0x010a }
                r0.<init>((java.lang.Throwable) r6)     // Catch:{ all -> 0x010a }
                java.util.ArrayList r0 = p009a8.C0124u.C0125a.m230a(r11, r12, r0)     // Catch:{ all -> 0x010a }
                goto L_0x006b
            L_0x0059:
                r5 = move-exception
                r6 = r5
                r5 = r3
            L_0x005c:
                com.facebook.internal.x$a r7 = com.facebook.internal.C2436x.f8729d     // Catch:{ all -> 0x010a }
                com.facebook.LoggingBehavior r7 = com.facebook.LoggingBehavior.REQUESTS     // Catch:{ all -> 0x010a }
                java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ all -> 0x010a }
                r8[r2] = r6     // Catch:{ all -> 0x010a }
                com.facebook.internal.C2436x.C2437a.m6390b(r7, r1, r0, r8)     // Catch:{ all -> 0x010a }
                java.util.ArrayList r0 = p009a8.C0124u.C0125a.m230a(r11, r12, r6)     // Catch:{ all -> 0x010a }
            L_0x006b:
                com.facebook.internal.C2397f0.m6311e(r5)
                com.facebook.internal.C2397f0.m6317k(r12)
                int r12 = r11.size()
                int r1 = r0.size()
                if (r12 != r1) goto L_0x00e0
                m6143m(r11, r0)
                a8.e$a r11 = p009a8.C0100e.f304f
                a8.e r11 = r11.mo216a()
                com.facebook.AccessToken r12 = r11.f308c
                if (r12 != 0) goto L_0x0089
                goto L_0x00b8
            L_0x0089:
                java.util.Date r1 = new java.util.Date
                r1.<init>()
                long r5 = r1.getTime()
                com.facebook.AccessTokenSource r1 = r12.f8356g
                boolean r1 = r1.canExtendToken()
                if (r1 == 0) goto L_0x00b8
                java.util.Date r1 = r11.f310e
                long r7 = r1.getTime()
                long r7 = r5 - r7
                r9 = 3600000(0x36ee80, double:1.7786363E-317)
                int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r1 <= 0) goto L_0x00b8
                java.util.Date r12 = r12.f8357h
                long r7 = r12.getTime()
                long r5 = r5 - r7
                r7 = 86400000(0x5265c00, double:4.2687272E-316)
                int r12 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r12 <= 0) goto L_0x00b8
                r2 = 1
            L_0x00b8:
                if (r2 != 0) goto L_0x00bb
                goto L_0x00df
            L_0x00bb:
                android.os.Looper r12 = android.os.Looper.getMainLooper()
                android.os.Looper r1 = android.os.Looper.myLooper()
                boolean r12 = mf0.C24362h.m61206a(r12, r1)
                if (r12 == 0) goto L_0x00cd
                r11.mo213a(r3)
                goto L_0x00df
            L_0x00cd:
                android.os.Handler r12 = new android.os.Handler
                android.os.Looper r1 = android.os.Looper.getMainLooper()
                r12.<init>(r1)
                x.v r1 = new x.v
                r2 = 6
                r1.<init>(r2, r11, r3)
                r12.post(r1)
            L_0x00df:
                return r0
            L_0x00e0:
                com.facebook.FacebookException r11 = new com.facebook.FacebookException
                java.util.Locale r1 = java.util.Locale.US
                r3 = 2
                java.lang.Object[] r5 = new java.lang.Object[r3]
                int r0 = r0.size()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r5[r2] = r0
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                r5[r4] = r12
                java.lang.Object[] r12 = java.util.Arrays.copyOf(r5, r3)
                java.lang.String r0 = "Received %d responses while expecting %d"
                java.lang.String r12 = java.lang.String.format(r1, r0, r12)
                java.lang.String r0 = "java.lang.String.format(locale, format, *args)"
                mf0.C24362h.m61210e(r12, r0)
                r11.<init>((java.lang.String) r12)
                throw r11
            L_0x010a:
                r11 = move-exception
                goto L_0x002f
            L_0x010d:
                com.facebook.internal.C2397f0.m6311e(r3)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.C2281c.m6134d(a8.t, java.net.HttpURLConnection):java.util.ArrayList");
        }

        /* renamed from: e */
        public static boolean m6135e(Object obj) {
            if ((obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof ParcelableResourceWithMimeType)) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public static boolean m6136f(Object obj) {
            return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
        }

        /* renamed from: g */
        public static GraphRequest m6137g(AccessToken accessToken, String str, C2280b bVar) {
            return new GraphRequest(accessToken, str, (Bundle) null, (HttpMethod) null, bVar, 32);
        }

        /* renamed from: h */
        public static GraphRequest m6138h(AccessToken accessToken, String str, JSONObject jSONObject, C2280b bVar) {
            GraphRequest graphRequest = new GraphRequest(accessToken, str, (Bundle) null, HttpMethod.POST, bVar, 32);
            graphRequest.f8430c = jSONObject;
            return graphRequest;
        }

        /* renamed from: i */
        public static GraphRequest m6139i(String str, Bundle bundle, C2280b bVar) {
            return new GraphRequest((AccessToken) null, str, bundle, HttpMethod.POST, bVar, 32);
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0051  */
        /* renamed from: j */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void m6140j(org.json.JSONObject r7, java.lang.String r8, com.facebook.GraphRequest.C2283e r9) {
            /*
                java.util.regex.Pattern r0 = com.facebook.GraphRequest.f8426k
                java.util.regex.Matcher r0 = r0.matcher(r8)
                boolean r1 = r0.matches()
                r2 = 1
                if (r1 == 0) goto L_0x0017
                java.lang.String r0 = r0.group(r2)
                java.lang.String r1 = "matcher.group(1)"
                mf0.C24362h.m61210e(r0, r1)
                goto L_0x0018
            L_0x0017:
                r0 = r8
            L_0x0018:
                java.lang.String r1 = "me/"
                boolean r1 = uh0.C25081h.m62835F(r0, r1)
                r3 = 0
                if (r1 != 0) goto L_0x002c
                java.lang.String r1 = "/me/"
                boolean r0 = uh0.C25081h.m62835F(r0, r1)
                if (r0 == 0) goto L_0x002a
                goto L_0x002c
            L_0x002a:
                r0 = 0
                goto L_0x002d
            L_0x002c:
                r0 = 1
            L_0x002d:
                if (r0 == 0) goto L_0x0046
                r0 = 6
                java.lang.String r1 = ":"
                int r1 = kotlin.text.C24179b.m60565M(r8, r1, r3, r3, r0)
                java.lang.String r4 = "?"
                int r8 = kotlin.text.C24179b.m60565M(r8, r4, r3, r3, r0)
                r0 = 3
                if (r1 <= r0) goto L_0x0046
                r0 = -1
                if (r8 == r0) goto L_0x0044
                if (r1 >= r8) goto L_0x0046
            L_0x0044:
                r8 = 1
                goto L_0x0047
            L_0x0046:
                r8 = 0
            L_0x0047:
                java.util.Iterator r0 = r7.keys()
            L_0x004b:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0077
                java.lang.Object r1 = r0.next()
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r4 = r7.opt(r1)
                if (r8 == 0) goto L_0x0067
                java.lang.String r5 = "image"
                boolean r5 = uh0.C25081h.m62830A(r1, r5, r2)
                if (r5 == 0) goto L_0x0067
                r5 = 1
                goto L_0x0068
            L_0x0067:
                r5 = 0
            L_0x0068:
                java.lang.String r6 = "key"
                mf0.C24362h.m61210e(r1, r6)
                java.lang.String r6 = "value"
                mf0.C24362h.m61210e(r4, r6)
                m6141k(r1, r4, r9, r5)
                goto L_0x004b
            L_0x0077:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.C2281c.m6140j(org.json.JSONObject, java.lang.String, com.facebook.GraphRequest$e):void");
        }

        /* renamed from: k */
        public static void m6141k(String str, Object obj, C2283e eVar, boolean z) {
            Class<?> cls = obj.getClass();
            if (JSONObject.class.isAssignableFrom(cls)) {
                JSONObject jSONObject = (JSONObject) obj;
                if (z) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String j = C13555b.m33971j(new Object[]{str, next}, 2, "%s[%s]", "java.lang.String.format(format, *args)");
                        Object opt = jSONObject.opt(next);
                        C24362h.m61210e(opt, "jsonObject.opt(propertyName)");
                        m6141k(j, opt, eVar, z);
                    }
                } else if (jSONObject.has("id")) {
                    String optString = jSONObject.optString("id");
                    C24362h.m61210e(optString, "jsonObject.optString(\"id\")");
                    m6141k(str, optString, eVar, z);
                } else if (jSONObject.has("url")) {
                    String optString2 = jSONObject.optString("url");
                    C24362h.m61210e(optString2, "jsonObject.optString(\"url\")");
                    m6141k(str, optString2, eVar, z);
                } else if (jSONObject.has("fbsdk:create_object")) {
                    String jSONObject2 = jSONObject.toString();
                    C24362h.m61210e(jSONObject2, "jsonObject.toString()");
                    m6141k(str, jSONObject2, eVar, z);
                }
            } else if (JSONArray.class.isAssignableFrom(cls)) {
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                if (length > 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        String format = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i)}, 2));
                        C24362h.m61210e(format, "java.lang.String.format(locale, format, *args)");
                        Object opt2 = jSONArray.opt(i);
                        C24362h.m61210e(opt2, "jsonArray.opt(i)");
                        m6141k(format, opt2, eVar, z);
                        if (i2 < length) {
                            i = i2;
                        } else {
                            return;
                        }
                    }
                }
            } else if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
                eVar.mo261a(str, obj.toString());
            } else if (Date.class.isAssignableFrom(cls)) {
                String format2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                C24362h.m61210e(format2, "iso8601DateFormat.format(date)");
                eVar.mo261a(str, format2);
            } else {
                C2397f0 f0Var = C2397f0.f8630a;
                String str2 = GraphRequest.f8425j;
                C0115o oVar = C0115o.f331a;
            }
        }

        /* JADX WARNING: type inference failed for: r3v1 */
        /* JADX WARNING: type inference failed for: r3v7 */
        /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r3v2, types: [int, boolean] */
        /* renamed from: l */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void m6142l(p009a8.C0121t r18, com.facebook.internal.C2436x r19, int r20, java.net.URL r21, java.io.OutputStream r22, boolean r23) {
            /*
                r0 = r19
                com.facebook.GraphRequest$g r1 = new com.facebook.GraphRequest$g
                r2 = r22
                r3 = r23
                r1.<init>(r2, r0, r3)
                r2 = 0
                r3 = 1
                r4 = r20
                if (r4 != r3) goto L_0x0099
                r4 = r18
                java.util.ArrayList r3 = r4.f361d
                java.lang.Object r2 = r3.get(r2)
                com.facebook.GraphRequest r2 = (com.facebook.GraphRequest) r2
                java.util.HashMap r3 = new java.util.HashMap
                r3.<init>()
                android.os.Bundle r4 = r2.f8431d
                java.util.Set r4 = r4.keySet()
                java.util.Iterator r4 = r4.iterator()
            L_0x002a:
                boolean r5 = r4.hasNext()
                java.lang.String r6 = "key"
                if (r5 == 0) goto L_0x0050
                java.lang.Object r5 = r4.next()
                java.lang.String r5 = (java.lang.String) r5
                android.os.Bundle r7 = r2.f8431d
                java.lang.Object r7 = r7.get(r5)
                boolean r8 = m6135e(r7)
                if (r8 == 0) goto L_0x002a
                mf0.C24362h.m61210e(r5, r6)
                com.facebook.GraphRequest$a r6 = new com.facebook.GraphRequest$a
                r6.<init>(r2, r7)
                r3.put(r5, r6)
                goto L_0x002a
            L_0x0050:
                if (r0 != 0) goto L_0x0053
                goto L_0x0056
            L_0x0053:
                r19.mo12596c()
            L_0x0056:
                android.os.Bundle r4 = r2.f8431d
                java.util.Set r5 = r4.keySet()
                java.util.Iterator r5 = r5.iterator()
            L_0x0060:
                boolean r7 = r5.hasNext()
                if (r7 == 0) goto L_0x007d
                java.lang.Object r7 = r5.next()
                java.lang.String r7 = (java.lang.String) r7
                java.lang.Object r8 = r4.get(r7)
                boolean r9 = m6136f(r8)
                if (r9 == 0) goto L_0x0060
                mf0.C24362h.m61210e(r7, r6)
                r1.mo11923g(r7, r8, r2)
                goto L_0x0060
            L_0x007d:
                if (r0 != 0) goto L_0x0080
                goto L_0x0083
            L_0x0080:
                r19.mo12596c()
            L_0x0083:
                m6144n(r3, r1)
                org.json.JSONObject r0 = r2.f8430c
                if (r0 == 0) goto L_0x0256
                java.lang.String r2 = r21.getPath()
                java.lang.String r3 = "url.path"
                mf0.C24362h.m61210e(r2, r3)
                m6140j(r0, r2, r1)
                goto L_0x0256
            L_0x0099:
                r4 = r18
                java.util.Iterator r5 = r18.iterator()
            L_0x009f:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L_0x00b2
                java.lang.Object r6 = r5.next()
                com.facebook.GraphRequest r6 = (com.facebook.GraphRequest) r6
                com.facebook.AccessToken r6 = r6.f8428a
                if (r6 == 0) goto L_0x009f
                java.lang.String r5 = r6.f8358i
                goto L_0x00b8
            L_0x00b2:
                java.lang.String r5 = com.facebook.GraphRequest.f8425j
                java.lang.String r5 = p009a8.C0115o.m211b()
            L_0x00b8:
                int r6 = r5.length()
                if (r6 != 0) goto L_0x00c0
                r6 = 1
                goto L_0x00c1
            L_0x00c0:
                r6 = 0
            L_0x00c1:
                if (r6 != 0) goto L_0x0257
                java.lang.String r6 = "batch_app_id"
                r1.mo261a(r6, r5)
                java.util.HashMap r5 = new java.util.HashMap
                r5.<init>()
                org.json.JSONArray r6 = new org.json.JSONArray
                r6.<init>()
                java.util.Iterator r7 = r18.iterator()
            L_0x00d6:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto L_0x01d4
                java.lang.Object r8 = r7.next()
                com.facebook.GraphRequest r8 = (com.facebook.GraphRequest) r8
                r8.getClass()
                org.json.JSONObject r9 = new org.json.JSONObject
                r9.<init>()
                int r10 = com.facebook.internal.C2393d0.f8626a
                java.lang.Object[] r10 = new java.lang.Object[r3]
                java.lang.String r11 = p009a8.C0115o.m214e()
                r10[r2] = r11
                java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r3)
                java.lang.String r11 = "https://graph.%s"
                java.lang.String r10 = java.lang.String.format(r11, r10)
                java.lang.String r11 = "java.lang.String.format(format, *args)"
                mf0.C24362h.m61210e(r10, r11)
                java.lang.String r10 = r8.mo11907h(r10)
                r8.mo11901a()
                java.lang.String r10 = r8.mo11902b(r10, r3)
                android.net.Uri r10 = android.net.Uri.parse(r10)
                r12 = 2
                java.lang.Object[] r13 = new java.lang.Object[r12]
                java.lang.String r14 = r10.getPath()
                r13[r2] = r14
                java.lang.String r10 = r10.getQuery()
                r13[r3] = r10
                java.lang.Object[] r10 = java.util.Arrays.copyOf(r13, r12)
                java.lang.String r13 = "%s?%s"
                java.lang.String r10 = java.lang.String.format(r13, r10)
                mf0.C24362h.m61210e(r10, r11)
                java.lang.String r11 = "relative_url"
                r9.put(r11, r10)
                com.facebook.HttpMethod r11 = r8.f8435h
                java.lang.String r13 = "method"
                r9.put(r13, r11)
                com.facebook.AccessToken r11 = r8.f8428a
                if (r11 == 0) goto L_0x0145
                java.lang.String r11 = r11.f8355f
                com.facebook.internal.x$a r13 = com.facebook.internal.C2436x.f8729d
                r13.mo12597d(r11)
            L_0x0145:
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                android.os.Bundle r13 = r8.f8431d
                java.util.Set r13 = r13.keySet()
                java.util.Iterator r13 = r13.iterator()
            L_0x0154:
                boolean r14 = r13.hasNext()
                if (r14 == 0) goto L_0x019f
                java.lang.Object r14 = r13.next()
                java.lang.String r14 = (java.lang.String) r14
                android.os.Bundle r15 = r8.f8431d
                java.lang.Object r14 = r15.get(r14)
                java.lang.String r15 = com.facebook.GraphRequest.f8425j
                boolean r15 = m6135e(r14)
                if (r15 == 0) goto L_0x0154
                java.util.Locale r15 = java.util.Locale.ROOT
                java.lang.Object[] r3 = new java.lang.Object[r12]
                java.lang.String r16 = "file"
                r3[r2] = r16
                int r16 = r5.size()
                java.lang.Integer r16 = java.lang.Integer.valueOf(r16)
                r17 = 1
                r3[r17] = r16
                java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r12)
                java.lang.String r12 = "%s%d"
                java.lang.String r3 = java.lang.String.format(r15, r12, r3)
                java.lang.String r12 = "java.lang.String.format(locale, format, *args)"
                mf0.C24362h.m61210e(r3, r12)
                r11.add(r3)
                com.facebook.GraphRequest$a r12 = new com.facebook.GraphRequest$a
                r12.<init>(r8, r14)
                r5.put(r3, r12)
                r3 = 1
                r12 = 2
                goto L_0x0154
            L_0x019f:
                boolean r3 = r11.isEmpty()
                if (r3 != 0) goto L_0x01b0
                java.lang.String r3 = ","
                java.lang.String r3 = android.text.TextUtils.join(r3, r11)
                java.lang.String r11 = "attached_files"
                r9.put(r11, r3)
            L_0x01b0:
                org.json.JSONObject r3 = r8.f8430c
                if (r3 == 0) goto L_0x01ce
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                java.lang.String r11 = com.facebook.GraphRequest.f8425j
                a8.r r11 = new a8.r
                r11.<init>(r8)
                m6140j(r3, r10, r11)
                java.lang.String r3 = "&"
                java.lang.String r3 = android.text.TextUtils.join(r3, r8)
                java.lang.String r8 = "body"
                r9.put(r8, r3)
            L_0x01ce:
                r6.put(r9)
                r3 = 1
                goto L_0x00d6
            L_0x01d4:
                java.lang.String r3 = "batch"
                java.io.OutputStream r7 = r1.f8441a
                boolean r8 = r7 instanceof p009a8.C0131z
                java.lang.String r9 = "requestJsonArray.toString()"
                if (r8 != 0) goto L_0x01e9
                java.lang.String r2 = r6.toString()
                mf0.C24362h.m61210e(r2, r9)
                r1.mo261a(r3, r2)
                goto L_0x024d
            L_0x01e9:
                a8.z r7 = (p009a8.C0131z) r7
                r8 = 0
                r1.mo11919c(r3, r8, r8)
                java.lang.Object[] r8 = new java.lang.Object[r2]
                java.lang.String r10 = "["
                r1.mo11918b(r10, r8)
                java.util.Iterator r4 = r18.iterator()
                r8 = 0
            L_0x01fb:
                boolean r10 = r4.hasNext()
                if (r10 == 0) goto L_0x0231
                int r10 = r8 + 1
                java.lang.Object r11 = r4.next()
                com.facebook.GraphRequest r11 = (com.facebook.GraphRequest) r11
                org.json.JSONObject r12 = r6.getJSONObject(r8)
                r7.mo283a(r11)
                if (r8 <= 0) goto L_0x0221
                r8 = 1
                java.lang.Object[] r11 = new java.lang.Object[r8]
                java.lang.String r12 = r12.toString()
                r11[r2] = r12
                java.lang.String r12 = ",%s"
                r1.mo11918b(r12, r11)
                goto L_0x022f
            L_0x0221:
                r8 = 1
                java.lang.Object[] r11 = new java.lang.Object[r8]
                java.lang.String r12 = r12.toString()
                r11[r2] = r12
                java.lang.String r12 = "%s"
                r1.mo11918b(r12, r11)
            L_0x022f:
                r8 = r10
                goto L_0x01fb
            L_0x0231:
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r4 = "]"
                r1.mo11918b(r4, r2)
                com.facebook.internal.x r2 = r1.f8442b
                if (r2 != 0) goto L_0x023d
                goto L_0x024d
            L_0x023d:
                java.lang.String r4 = "    "
                java.lang.String r3 = mf0.C24362h.m61216k(r3, r4)
                java.lang.String r4 = r6.toString()
                mf0.C24362h.m61210e(r4, r9)
                r2.mo12594a(r4, r3)
            L_0x024d:
                if (r0 != 0) goto L_0x0250
                goto L_0x0253
            L_0x0250:
                r19.mo12596c()
            L_0x0253:
                m6144n(r5, r1)
            L_0x0256:
                return
            L_0x0257:
                com.facebook.FacebookException r0 = new com.facebook.FacebookException
                java.lang.String r1 = "App ID was not specified at the request or Settings."
                r0.<init>((java.lang.String) r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.C2281c.m6142l(a8.t, com.facebook.internal.x, int, java.net.URL, java.io.OutputStream, boolean):void");
        }

        /* renamed from: m */
        public static void m6143m(C0121t tVar, ArrayList arrayList) {
            Boolean bool;
            C24362h.m61211f(tVar, "requests");
            int size = tVar.size();
            ArrayList arrayList2 = new ArrayList();
            if (size > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    GraphRequest graphRequest = (GraphRequest) tVar.f361d.get(i);
                    if (graphRequest.f8434g != null) {
                        arrayList2.add(new Pair(graphRequest.f8434g, arrayList.get(i)));
                    }
                    if (i2 >= size) {
                        break;
                    }
                    i = i2;
                }
            }
            if (arrayList2.size() > 0) {
                C7097r rVar = new C7097r(9, arrayList2, tVar);
                Handler handler = tVar.f359b;
                if (handler == null) {
                    bool = null;
                } else {
                    bool = Boolean.valueOf(handler.post(rVar));
                }
                if (bool == null) {
                    rVar.run();
                }
            }
        }

        /* renamed from: n */
        public static void m6144n(HashMap hashMap, C2285g gVar) {
            for (Map.Entry entry : hashMap.entrySet()) {
                String str = GraphRequest.f8425j;
                if (m6135e(((C2279a) entry.getValue()).f8440b)) {
                    gVar.mo11923g((String) entry.getKey(), ((C2279a) entry.getValue()).f8440b, ((C2279a) entry.getValue()).f8439a);
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.io.FilterOutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.io.FilterOutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.io.FilterOutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: a8.y} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.io.FilterOutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.io.FilterOutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: a8.y} */
        /* JADX WARNING: type inference failed for: r15v5, types: [java.io.OutputStream] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x0158  */
        /* renamed from: o */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void m6145o(p009a8.C0121t r14, java.net.HttpURLConnection r15) throws java.io.IOException, org.json.JSONException {
            /*
                com.facebook.internal.x r6 = new com.facebook.internal.x
                com.facebook.LoggingBehavior r0 = com.facebook.LoggingBehavior.REQUESTS
                r6.<init>(r0)
                int r2 = r14.size()
                java.util.Iterator r0 = r14.iterator()
            L_0x000f:
                boolean r1 = r0.hasNext()
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L_0x0041
                java.lang.Object r1 = r0.next()
                com.facebook.GraphRequest r1 = (com.facebook.GraphRequest) r1
                android.os.Bundle r5 = r1.f8431d
                java.util.Set r5 = r5.keySet()
                java.util.Iterator r5 = r5.iterator()
            L_0x0027:
                boolean r7 = r5.hasNext()
                if (r7 == 0) goto L_0x000f
                java.lang.Object r7 = r5.next()
                java.lang.String r7 = (java.lang.String) r7
                android.os.Bundle r8 = r1.f8431d
                java.lang.Object r7 = r8.get(r7)
                boolean r7 = m6135e(r7)
                if (r7 == 0) goto L_0x0027
                r5 = 0
                goto L_0x0042
            L_0x0041:
                r5 = 1
            L_0x0042:
                r0 = 0
                if (r2 != r3) goto L_0x0050
                java.util.ArrayList r1 = r14.f361d
                java.lang.Object r1 = r1.get(r4)
                com.facebook.GraphRequest r1 = (com.facebook.GraphRequest) r1
                com.facebook.HttpMethod r1 = r1.f8435h
                goto L_0x0051
            L_0x0050:
                r1 = r0
            L_0x0051:
                if (r1 != 0) goto L_0x0055
                com.facebook.HttpMethod r1 = com.facebook.HttpMethod.POST
            L_0x0055:
                java.lang.String r7 = r1.name()
                r15.setRequestMethod(r7)
                java.lang.String r7 = "Content-Type"
                if (r5 == 0) goto L_0x006d
                java.lang.String r8 = "application/x-www-form-urlencoded"
                r15.setRequestProperty(r7, r8)
                java.lang.String r8 = "Content-Encoding"
                java.lang.String r9 = "gzip"
                r15.setRequestProperty(r8, r9)
                goto L_0x0085
            L_0x006d:
                java.lang.Object[] r8 = new java.lang.Object[r3]
                java.lang.String r9 = com.facebook.GraphRequest.f8425j
                r8[r4] = r9
                java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r3)
                java.lang.String r9 = "multipart/form-data; boundary=%s"
                java.lang.String r8 = java.lang.String.format(r9, r8)
                java.lang.String r9 = "java.lang.String.format(format, *args)"
                mf0.C24362h.m61210e(r8, r9)
                r15.setRequestProperty(r7, r8)
            L_0x0085:
                java.net.URL r13 = r15.getURL()
                r6.mo12596c()
                java.lang.String r8 = r14.f360c
                java.lang.String r9 = "Id"
                r6.mo12594a(r8, r9)
                java.lang.String r8 = "url"
                mf0.C24362h.m61210e(r13, r8)
                java.lang.String r8 = "URL"
                r6.mo12594a(r13, r8)
                java.lang.String r8 = r15.getRequestMethod()
                java.lang.String r9 = "connection.requestMethod"
                mf0.C24362h.m61210e(r8, r9)
                java.lang.String r9 = "Method"
                r6.mo12594a(r8, r9)
                java.lang.String r8 = "User-Agent"
                java.lang.String r9 = r15.getRequestProperty(r8)
                java.lang.String r10 = "connection.getRequestProperty(\"User-Agent\")"
                mf0.C24362h.m61210e(r9, r10)
                r6.mo12594a(r9, r8)
                java.lang.String r8 = r15.getRequestProperty(r7)
                java.lang.String r9 = "connection.getRequestProperty(\"Content-Type\")"
                mf0.C24362h.m61210e(r8, r9)
                r6.mo12594a(r8, r7)
                r15.setConnectTimeout(r4)
                r15.setReadTimeout(r4)
                com.facebook.HttpMethod r7 = com.facebook.HttpMethod.POST
                if (r1 != r7) goto L_0x00d2
                r1 = 1
                goto L_0x00d3
            L_0x00d2:
                r1 = 0
            L_0x00d3:
                if (r1 != 0) goto L_0x00d9
                r6.mo12595b()
                return
            L_0x00d9:
                r15.setDoOutput(r3)
                java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0153 }
                java.io.OutputStream r15 = r15.getOutputStream()     // Catch:{ all -> 0x0153 }
                r1.<init>(r15)     // Catch:{ all -> 0x0153 }
                if (r5 == 0) goto L_0x00f1
                java.util.zip.GZIPOutputStream r15 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x00ee }
                r15.<init>(r1)     // Catch:{ all -> 0x00ee }
                r0 = r15
                goto L_0x00f2
            L_0x00ee:
                r14 = move-exception
                goto L_0x0155
            L_0x00f1:
                r0 = r1
            L_0x00f2:
                java.util.ArrayList r15 = r14.f362e     // Catch:{ all -> 0x0153 }
                java.util.Iterator r15 = r15.iterator()     // Catch:{ all -> 0x0153 }
            L_0x00f8:
                boolean r1 = r15.hasNext()     // Catch:{ all -> 0x0153 }
                if (r1 == 0) goto L_0x0109
                java.lang.Object r1 = r15.next()     // Catch:{ all -> 0x0153 }
                a8.t$a r1 = (p009a8.C0121t.C0122a) r1     // Catch:{ all -> 0x0153 }
                boolean r1 = r1 instanceof p009a8.C0121t.C0123b     // Catch:{ all -> 0x0153 }
                if (r1 == 0) goto L_0x00f8
                goto L_0x0121
            L_0x0109:
                java.util.Iterator r15 = r14.iterator()     // Catch:{ all -> 0x0153 }
            L_0x010d:
                boolean r1 = r15.hasNext()     // Catch:{ all -> 0x0153 }
                if (r1 == 0) goto L_0x0120
                java.lang.Object r1 = r15.next()     // Catch:{ all -> 0x0153 }
                com.facebook.GraphRequest r1 = (com.facebook.GraphRequest) r1     // Catch:{ all -> 0x0153 }
                com.facebook.GraphRequest$b r1 = r1.f8434g     // Catch:{ all -> 0x0153 }
                boolean r1 = r1 instanceof com.facebook.GraphRequest.C2284f     // Catch:{ all -> 0x0153 }
                if (r1 == 0) goto L_0x010d
                goto L_0x0121
            L_0x0120:
                r3 = 0
            L_0x0121:
                if (r3 == 0) goto L_0x0141
                a8.x r15 = new a8.x     // Catch:{ all -> 0x0153 }
                android.os.Handler r1 = r14.f359b     // Catch:{ all -> 0x0153 }
                r15.<init>(r1)     // Catch:{ all -> 0x0153 }
                r8 = 0
                r7 = r14
                r9 = r2
                r10 = r13
                r11 = r15
                r12 = r5
                m6142l(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0153 }
                int r1 = r15.f378f     // Catch:{ all -> 0x0153 }
                java.util.HashMap r10 = r15.f375c     // Catch:{ all -> 0x0153 }
                a8.y r15 = new a8.y     // Catch:{ all -> 0x0153 }
                long r11 = (long) r1     // Catch:{ all -> 0x0153 }
                r7 = r15
                r8 = r0
                r9 = r14
                r7.<init>(r8, r9, r10, r11)     // Catch:{ all -> 0x0153 }
                goto L_0x0142
            L_0x0141:
                r15 = r0
            L_0x0142:
                r0 = r14
                r1 = r6
                r3 = r13
                r4 = r15
                m6142l(r0, r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0150 }
                r15.close()
                r6.mo12595b()
                return
            L_0x0150:
                r14 = move-exception
                r1 = r15
                goto L_0x0155
            L_0x0153:
                r14 = move-exception
                r1 = r0
            L_0x0155:
                if (r1 != 0) goto L_0x0158
                goto L_0x015b
            L_0x0158:
                r1.close()
            L_0x015b:
                throw r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.C2281c.m6145o(a8.t, java.net.HttpURLConnection):void");
        }

        /* renamed from: p */
        public static HttpURLConnection m6146p(C0121t tVar) {
            URL url;
            Iterator it = tVar.iterator();
            while (it.hasNext()) {
                GraphRequest graphRequest = (GraphRequest) it.next();
                if (HttpMethod.GET == graphRequest.f8435h) {
                    C2397f0 f0Var = C2397f0.f8630a;
                    if (C2397f0.m6292A(graphRequest.f8431d.getString("fields"))) {
                        C2436x.C2437a aVar = C2436x.f8729d;
                        LoggingBehavior loggingBehavior = LoggingBehavior.DEVELOPER_ERRORS;
                        StringBuilder k = C13555b.m33972k("GET requests for /");
                        String str = graphRequest.f8429b;
                        if (str == null) {
                            str = "";
                        }
                        k.append(str);
                        k.append(" should contain an explicit \"fields\" parameter.");
                        C2436x.C2437a.m6391c(loggingBehavior, "Request", k.toString());
                    }
                }
            }
            try {
                if (tVar.size() == 1) {
                    url = new URL(((GraphRequest) tVar.f361d.get(0)).mo11906g());
                } else {
                    int i = C2393d0.f8626a;
                    String format = String.format("https://graph.%s", Arrays.copyOf(new Object[]{C0115o.m214e()}, 1));
                    C24362h.m61210e(format, "java.lang.String.format(format, *args)");
                    url = new URL(format);
                }
                HttpURLConnection httpURLConnection = null;
                try {
                    httpURLConnection = m6132b(url);
                    m6145o(tVar, httpURLConnection);
                    return httpURLConnection;
                } catch (IOException e) {
                    C2397f0.m6317k(httpURLConnection);
                    throw new FacebookException("could not construct request body", e);
                } catch (JSONException e2) {
                    C2397f0.m6317k(httpURLConnection);
                    throw new FacebookException("could not construct request body", e2);
                }
            } catch (MalformedURLException e3) {
                throw new FacebookException("could not construct URL for request", e3);
            }
        }
    }

    /* renamed from: com.facebook.GraphRequest$d */
    public interface C2282d {
        void onCompleted();
    }

    /* renamed from: com.facebook.GraphRequest$e */
    public interface C2283e {
        /* renamed from: a */
        void mo261a(String str, String str2);
    }

    /* renamed from: com.facebook.GraphRequest$f */
    public interface C2284f extends C2280b {
        /* renamed from: a */
        void mo11917a();
    }

    /* renamed from: com.facebook.GraphRequest$g */
    public static final class C2285g implements C2283e {

        /* renamed from: a */
        public final OutputStream f8441a;

        /* renamed from: b */
        public final C2436x f8442b;

        /* renamed from: c */
        public boolean f8443c = true;

        /* renamed from: d */
        public final boolean f8444d;

        public C2285g(OutputStream outputStream, C2436x xVar, boolean z) {
            this.f8441a = outputStream;
            this.f8442b = xVar;
            this.f8444d = z;
        }

        /* renamed from: a */
        public final void mo261a(String str, String str2) {
            C24362h.m61211f(str, LinksConfiguration.KEY_KEY);
            C24362h.m61211f(str2, "value");
            mo11919c(str, (String) null, (String) null);
            mo11922f("%s", str2);
            mo11924h();
            C2436x xVar = this.f8442b;
            if (xVar != null) {
                xVar.mo12594a(str2, C24362h.m61216k(str, "    "));
            }
        }

        /* renamed from: b */
        public final void mo11918b(String str, Object... objArr) {
            C24362h.m61211f(objArr, "args");
            if (!this.f8444d) {
                if (this.f8443c) {
                    OutputStream outputStream = this.f8441a;
                    Charset charset = C25072a.f63272a;
                    byte[] bytes = "--".getBytes(charset);
                    C24362h.m61210e(bytes, "(this as java.lang.String).getBytes(charset)");
                    outputStream.write(bytes);
                    OutputStream outputStream2 = this.f8441a;
                    String str2 = GraphRequest.f8425j;
                    if (str2 != null) {
                        byte[] bytes2 = str2.getBytes(charset);
                        C24362h.m61210e(bytes2, "(this as java.lang.String).getBytes(charset)");
                        outputStream2.write(bytes2);
                        OutputStream outputStream3 = this.f8441a;
                        byte[] bytes3 = "\r\n".getBytes(charset);
                        C24362h.m61210e(bytes3, "(this as java.lang.String).getBytes(charset)");
                        outputStream3.write(bytes3);
                        this.f8443c = false;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                OutputStream outputStream4 = this.f8441a;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                byte[] bytes4 = C13555b.m33971j(copyOf, copyOf.length, str, "java.lang.String.format(format, *args)").getBytes(C25072a.f63272a);
                C24362h.m61210e(bytes4, "(this as java.lang.String).getBytes(charset)");
                outputStream4.write(bytes4);
                return;
            }
            OutputStream outputStream5 = this.f8441a;
            Locale locale = Locale.US;
            Object[] copyOf2 = Arrays.copyOf(objArr, objArr.length);
            String format = String.format(locale, str, Arrays.copyOf(copyOf2, copyOf2.length));
            C24362h.m61210e(format, "java.lang.String.format(locale, format, *args)");
            String encode = URLEncoder.encode(format, "UTF-8");
            C24362h.m61210e(encode, "encode(String.format(Locale.US, format, *args), \"UTF-8\")");
            byte[] bytes5 = encode.getBytes(C25072a.f63272a);
            C24362h.m61210e(bytes5, "(this as java.lang.String).getBytes(charset)");
            outputStream5.write(bytes5);
        }

        /* renamed from: c */
        public final void mo11919c(String str, String str2, String str3) {
            if (!this.f8444d) {
                mo11918b("Content-Disposition: form-data; name=\"%s\"", str);
                if (str2 != null) {
                    mo11918b("; filename=\"%s\"", str2);
                }
                mo11922f("", new Object[0]);
                if (str3 != null) {
                    mo11922f("%s: %s", HttpHeader.CONTENT_TYPE, str3);
                }
                mo11922f("", new Object[0]);
                return;
            }
            OutputStream outputStream = this.f8441a;
            byte[] bytes = C13555b.m33971j(new Object[]{str}, 1, "%s=", "java.lang.String.format(format, *args)").getBytes(C25072a.f63272a);
            C24362h.m61210e(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        /* renamed from: d */
        public final void mo11920d(Uri uri, String str, String str2) {
            int i;
            long j;
            C24362h.m61211f(str, LinksConfiguration.KEY_KEY);
            C24362h.m61211f(uri, "contentUri");
            if (str2 == null) {
                str2 = "content/unknown";
            }
            mo11919c(str, str, str2);
            if (this.f8441a instanceof C0129x) {
                C2397f0 f0Var = C2397f0.f8630a;
                Cursor cursor = null;
                try {
                    Cursor query = C0115o.m210a().getContentResolver().query(uri, (String[]) null, (String) null, (String[]) null, (String) null);
                    if (query == null) {
                        j = 0;
                    } else {
                        int columnIndex = query.getColumnIndex("_size");
                        query.moveToFirst();
                        j = query.getLong(columnIndex);
                        query.close();
                    }
                    ((C0129x) this.f8441a).mo284c(j);
                    i = 0;
                } catch (Throwable th) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } else {
                InputStream openInputStream = C0115o.m210a().getContentResolver().openInputStream(uri);
                C2397f0 f0Var2 = C2397f0.f8630a;
                i = C2397f0.m6316j(openInputStream, this.f8441a) + 0;
            }
            mo11922f("", new Object[0]);
            mo11924h();
            C2436x xVar = this.f8442b;
            if (xVar != null) {
                String k = C24362h.m61216k(str, "    ");
                String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
                C24362h.m61210e(format, "java.lang.String.format(locale, format, *args)");
                xVar.mo12594a(format, k);
            }
        }

        /* renamed from: e */
        public final void mo11921e(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) {
            int i;
            C24362h.m61211f(str, LinksConfiguration.KEY_KEY);
            C24362h.m61211f(parcelFileDescriptor, "descriptor");
            if (str2 == null) {
                str2 = "content/unknown";
            }
            mo11919c(str, str, str2);
            OutputStream outputStream = this.f8441a;
            if (outputStream instanceof C0129x) {
                ((C0129x) outputStream).mo284c(parcelFileDescriptor.getStatSize());
                i = 0;
            } else {
                ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
                C2397f0 f0Var = C2397f0.f8630a;
                i = C2397f0.m6316j(autoCloseInputStream, this.f8441a) + 0;
            }
            mo11922f("", new Object[0]);
            mo11924h();
            C2436x xVar = this.f8442b;
            if (xVar != null) {
                String k = C24362h.m61216k(str, "    ");
                String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
                C24362h.m61210e(format, "java.lang.String.format(locale, format, *args)");
                xVar.mo12594a(format, k);
            }
        }

        /* renamed from: f */
        public final void mo11922f(String str, Object... objArr) {
            mo11918b(str, Arrays.copyOf(objArr, objArr.length));
            if (!this.f8444d) {
                mo11918b("\r\n", new Object[0]);
            }
        }

        /* renamed from: g */
        public final void mo11923g(String str, Object obj, GraphRequest graphRequest) {
            C24362h.m61211f(str, LinksConfiguration.KEY_KEY);
            OutputStream outputStream = this.f8441a;
            if (outputStream instanceof C0131z) {
                ((C0131z) outputStream).mo283a(graphRequest);
            }
            String str2 = GraphRequest.f8425j;
            if (C2281c.m6136f(obj)) {
                mo261a(str, C2281c.m6131a(obj));
            } else if (obj instanceof Bitmap) {
                Bitmap bitmap = (Bitmap) obj;
                C24362h.m61211f(bitmap, "bitmap");
                mo11919c(str, str, "image/png");
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.f8441a);
                mo11922f("", new Object[0]);
                mo11924h();
                C2436x xVar = this.f8442b;
                if (xVar != null) {
                    xVar.mo12594a("<Image>", C24362h.m61216k(str, "    "));
                }
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                C24362h.m61211f(bArr, "bytes");
                mo11919c(str, str, "content/unknown");
                this.f8441a.write(bArr);
                mo11922f("", new Object[0]);
                mo11924h();
                C2436x xVar2 = this.f8442b;
                if (xVar2 != null) {
                    String k = C24362h.m61216k(str, "    ");
                    String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bArr.length)}, 1));
                    C24362h.m61210e(format, "java.lang.String.format(locale, format, *args)");
                    xVar2.mo12594a(format, k);
                }
            } else if (obj instanceof Uri) {
                mo11920d((Uri) obj, str, (String) null);
            } else if (obj instanceof ParcelFileDescriptor) {
                mo11921e(str, (ParcelFileDescriptor) obj, (String) null);
            } else if (obj instanceof ParcelableResourceWithMimeType) {
                ParcelableResourceWithMimeType parcelableResourceWithMimeType = (ParcelableResourceWithMimeType) obj;
                RESOURCE resource = parcelableResourceWithMimeType.f8438c;
                String str3 = parcelableResourceWithMimeType.f8437b;
                if (resource instanceof ParcelFileDescriptor) {
                    mo11921e(str, (ParcelFileDescriptor) resource, str3);
                } else if (resource instanceof Uri) {
                    mo11920d((Uri) resource, str, str3);
                } else {
                    throw new IllegalArgumentException("value is not a supported type.");
                }
            } else {
                throw new IllegalArgumentException("value is not a supported type.");
            }
        }

        /* renamed from: h */
        public final void mo11924h() {
            if (!this.f8444d) {
                mo11922f("--%s", GraphRequest.f8425j);
                return;
            }
            OutputStream outputStream = this.f8441a;
            byte[] bytes = "&".getBytes(C25072a.f63272a);
            C24362h.m61210e(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }
    }

    static {
        new C2281c();
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        C24362h.m61210e(charArray, "(this as java.lang.String).toCharArray()");
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt(11) + 30;
        if (nextInt > 0) {
            int i = 0;
            do {
                i++;
                sb.append(charArray[secureRandom.nextInt(charArray.length)]);
            } while (i < nextInt);
        }
        String sb2 = sb.toString();
        C24362h.m61210e(sb2, "buffer.toString()");
        f8425j = sb2;
    }

    public GraphRequest() {
        this((AccessToken) null, (String) null, (Bundle) null, (HttpMethod) null, (C2280b) null, 63);
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, HttpMethod httpMethod, C2280b bVar, int i) {
        accessToken = (i & 1) != 0 ? null : accessToken;
        str = (i & 2) != 0 ? null : str;
        bundle = (i & 4) != 0 ? null : bundle;
        httpMethod = (i & 8) != 0 ? null : httpMethod;
        bVar = (i & 16) != 0 ? null : bVar;
        this.f8428a = accessToken;
        this.f8429b = str;
        this.f8433f = null;
        mo11909j(bVar);
        mo11910k(httpMethod);
        if (bundle != null) {
            this.f8431d = new Bundle(bundle);
        } else {
            this.f8431d = new Bundle();
        }
        if (this.f8433f == null) {
            this.f8433f = C0115o.m213d();
        }
    }

    /* renamed from: f */
    public static String m6119f() {
        boolean z;
        String b = C0115o.m211b();
        C2400g0.m6342g();
        String str = C0115o.f336f;
        if (str != null) {
            boolean z2 = false;
            if (b.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (str.length() > 0) {
                    z2 = true;
                }
                if (z2) {
                    return b + '|' + str;
                }
            }
            C2397f0 f0Var = C2397f0.f8630a;
            return null;
        }
        throw new FacebookException("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
        if (r3 == false) goto L_0x0042;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11901a() {
        /*
            r6 = this;
            android.os.Bundle r0 = r6.f8431d
            java.lang.String r1 = r6.mo11905e()
            r2 = 0
            if (r1 != 0) goto L_0x000b
            r3 = 0
            goto L_0x0012
        L_0x000b:
            java.lang.String r3 = "|"
            boolean r3 = kotlin.text.C24179b.m60559G(r1, r3, r2)
        L_0x0012:
            r4 = 1
            if (r1 == 0) goto L_0x0021
            java.lang.String r5 = "IG"
            boolean r1 = uh0.C25081h.m62835F(r1, r5)
            if (r1 == 0) goto L_0x0021
            if (r3 != 0) goto L_0x0021
            r1 = 1
            goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            if (r1 == 0) goto L_0x002b
            boolean r1 = r6.mo11908i()
            if (r1 == 0) goto L_0x002b
            goto L_0x0042
        L_0x002b:
            java.lang.String r1 = p009a8.C0115o.m214e()
            java.lang.String r5 = "instagram.com"
            boolean r1 = mf0.C24362h.m61206a(r1, r5)
            if (r1 != 0) goto L_0x0039
            r1 = 1
            goto L_0x003e
        L_0x0039:
            boolean r1 = r6.mo11908i()
            r1 = r1 ^ r4
        L_0x003e:
            if (r1 != 0) goto L_0x0043
            if (r3 != 0) goto L_0x0043
        L_0x0042:
            r2 = 1
        L_0x0043:
            java.lang.String r1 = "access_token"
            if (r2 == 0) goto L_0x004f
            java.lang.String r2 = m6119f()
            r0.putString(r1, r2)
            goto L_0x0058
        L_0x004f:
            java.lang.String r2 = r6.mo11905e()
            if (r2 == 0) goto L_0x0058
            r0.putString(r1, r2)
        L_0x0058:
            boolean r1 = r0.containsKey(r1)
            if (r1 != 0) goto L_0x0072
            com.facebook.internal.f0 r1 = com.facebook.internal.C2397f0.f8630a
            a8.o r1 = p009a8.C0115o.f331a
            com.facebook.internal.C2400g0.m6342g()
            java.lang.String r1 = p009a8.C0115o.f336f
            if (r1 == 0) goto L_0x006a
            goto L_0x0072
        L_0x006a:
            com.facebook.FacebookException r0 = new com.facebook.FacebookException
            java.lang.String r1 = "A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0072:
            java.lang.String r1 = "sdk"
            java.lang.String r2 = "android"
            r0.putString(r1, r2)
            java.lang.String r1 = "format"
            java.lang.String r2 = "json"
            r0.putString(r1, r2)
            a8.o r0 = p009a8.C0115o.f331a
            com.facebook.LoggingBehavior r0 = com.facebook.LoggingBehavior.GRAPH_API_DEBUG_INFO
            p009a8.C0115o.m218i(r0)
            com.facebook.LoggingBehavior r0 = com.facebook.LoggingBehavior.GRAPH_API_DEBUG_WARNING
            p009a8.C0115o.m218i(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.mo11901a():void");
    }

    /* renamed from: b */
    public final String mo11902b(String str, boolean z) {
        if (!z && this.f8435h == HttpMethod.POST) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String next : this.f8431d.keySet()) {
            Object obj = this.f8431d.get(next);
            if (obj == null) {
                obj = "";
            }
            if (C2281c.m6136f(obj)) {
                buildUpon.appendQueryParameter(next, C2281c.m6131a(obj).toString());
            } else if (this.f8435h != HttpMethod.GET) {
                String format = String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1));
                C24362h.m61210e(format, "java.lang.String.format(locale, format, *args)");
                throw new IllegalArgumentException(format);
            }
        }
        String builder = buildUpon.toString();
        C24362h.m61210e(builder, "uriBuilder.toString()");
        return builder;
    }

    /* renamed from: c */
    public final C0124u mo11903c() {
        List h1 = C23816b.m58452h1(new GraphRequest[]{this});
        C24362h.m61211f(h1, "requests");
        ArrayList c = C2281c.m6133c(new C0121t(h1));
        if (c.size() == 1) {
            return (C0124u) c.get(0);
        }
        throw new FacebookException("invalid state: expected a single response");
    }

    /* renamed from: d */
    public final C0120s mo11904d() {
        List h1 = C23816b.m58452h1(new GraphRequest[]{this});
        C24362h.m61211f(h1, "requests");
        C0121t tVar = new C0121t(h1);
        C2400g0.m6340e(tVar);
        C0120s sVar = new C0120s(tVar);
        sVar.executeOnExecutor(C0115o.m212c(), new Void[0]);
        return sVar;
    }

    /* renamed from: e */
    public final String mo11905e() {
        AccessToken accessToken = this.f8428a;
        if (accessToken != null) {
            if (!this.f8431d.containsKey("access_token")) {
                String str = accessToken.f8355f;
                C2436x.f8729d.mo12597d(str);
                return str;
            }
        } else if (!this.f8431d.containsKey("access_token")) {
            return m6119f();
        }
        return this.f8431d.getString("access_token");
    }

    /* renamed from: g */
    public final String mo11906g() {
        String str;
        String str2 = this.f8429b;
        if (this.f8435h != HttpMethod.POST || str2 == null || !C25081h.m62836z(str2, "/videos", false)) {
            int i = C2393d0.f8626a;
            String e = C0115o.m214e();
            C24362h.m61211f(e, LinksConfiguration.KEY_SUBDOMAIN);
            str = C13555b.m33971j(new Object[]{e}, 1, "https://graph.%s", "java.lang.String.format(format, *args)");
        } else {
            int i2 = C2393d0.f8626a;
            str = C13555b.m33971j(new Object[]{C0115o.m214e()}, 1, "https://graph-video.%s", "java.lang.String.format(format, *args)");
        }
        String h = mo11907h(str);
        mo11901a();
        return mo11902b(h, false);
    }

    /* renamed from: h */
    public final String mo11907h(String str) {
        boolean z;
        String str2;
        if (!C24362h.m61206a(C0115o.m214e(), "instagram.com")) {
            z = true;
        } else {
            z = !mo11908i();
        }
        if (!z) {
            int i = C2393d0.f8626a;
            str = C13555b.m33971j(new Object[]{C0115o.f348r}, 1, "https://graph.%s", "java.lang.String.format(format, *args)");
        }
        Object[] objArr = new Object[2];
        objArr[0] = str;
        if (f8426k.matcher(this.f8429b).matches()) {
            str2 = this.f8429b;
        } else {
            str2 = C13555b.m33971j(new Object[]{this.f8433f, this.f8429b}, 2, "%s/%s", "java.lang.String.format(format, *args)");
        }
        objArr[1] = str2;
        return C13555b.m33971j(objArr, 2, "%s/%s", "java.lang.String.format(format, *args)");
    }

    /* renamed from: i */
    public final boolean mo11908i() {
        if (this.f8429b == null) {
            return false;
        }
        StringBuilder k = C13555b.m33972k("^/?");
        k.append(C0115o.m211b());
        k.append("/?.*");
        String sb = k.toString();
        if (this.f8436i || Pattern.matches(sb, this.f8429b) || Pattern.matches("^/?app/?.*", this.f8429b)) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void mo11909j(C2280b bVar) {
        C0115o oVar = C0115o.f331a;
        C0115o.m218i(LoggingBehavior.GRAPH_API_DEBUG_INFO);
        C0115o.m218i(LoggingBehavior.GRAPH_API_DEBUG_WARNING);
        this.f8434g = bVar;
    }

    /* renamed from: k */
    public final void mo11910k(HttpMethod httpMethod) {
        if (httpMethod == null) {
            httpMethod = HttpMethod.GET;
        }
        this.f8435h = httpMethod;
    }

    public final String toString() {
        StringBuilder t = C0016g.m36t("{Request: ", " accessToken: ");
        Object obj = this.f8428a;
        if (obj == null) {
            obj = StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
        }
        t.append(obj);
        t.append(", graphPath: ");
        t.append(this.f8429b);
        t.append(", graphObject: ");
        t.append(this.f8430c);
        t.append(", httpMethod: ");
        t.append(this.f8435h);
        t.append(", parameters: ");
        t.append(this.f8431d);
        t.append("}");
        String sb = t.toString();
        C24362h.m61210e(sb, "StringBuilder()\n        .append(\"{Request: \")\n        .append(\" accessToken: \")\n        .append(if (accessToken == null) \"null\" else accessToken)\n        .append(\", graphPath: \")\n        .append(graphPath)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", httpMethod: \")\n        .append(httpMethod)\n        .append(\", parameters: \")\n        .append(parameters)\n        .append(\"}\")\n        .toString()");
        return sb;
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u0001¨\u0006\u0003"}, mo59060d2 = {"Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;", "Landroid/os/Parcelable;", "RESOURCE", "facebook-core_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
    public static final class ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {
        public static final Parcelable.Creator<ParcelableResourceWithMimeType<?>> CREATOR = new C2278a();

        /* renamed from: b */
        public final String f8437b;

        /* renamed from: c */
        public final RESOURCE f8438c;

        /* renamed from: com.facebook.GraphRequest$ParcelableResourceWithMimeType$a */
        public static final class C2278a implements Parcelable.Creator<ParcelableResourceWithMimeType<?>> {
            public final Object createFromParcel(Parcel parcel) {
                C24362h.m61211f(parcel, "source");
                return new ParcelableResourceWithMimeType(parcel);
            }

            public final Object[] newArray(int i) {
                return new ParcelableResourceWithMimeType[i];
            }
        }

        public ParcelableResourceWithMimeType(Parcelable parcelable) {
            this.f8437b = "image/png";
            this.f8438c = parcelable;
        }

        public final int describeContents() {
            return 1;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C24362h.m61211f(parcel, "out");
            parcel.writeString(this.f8437b);
            parcel.writeParcelable(this.f8438c, i);
        }

        public ParcelableResourceWithMimeType(Parcel parcel) {
            this.f8437b = parcel.readString();
            this.f8438c = parcel.readParcelable(C0115o.m210a().getClassLoader());
        }
    }
}
