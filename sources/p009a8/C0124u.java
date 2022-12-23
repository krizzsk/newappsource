package p009a8;

import cf0.C21136j;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import mf0.C24362h;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: a8.u */
public final class C0124u {

    /* renamed from: e */
    public static final /* synthetic */ int f363e = 0;

    /* renamed from: a */
    public final HttpURLConnection f364a;

    /* renamed from: b */
    public final JSONObject f365b;

    /* renamed from: c */
    public final FacebookRequestError f366c;

    /* renamed from: d */
    public final JSONObject f367d;

    /* renamed from: a8.u$a */
    public static final class C0125a {
        /* renamed from: a */
        public static ArrayList m230a(List list, HttpURLConnection httpURLConnection, FacebookException facebookException) {
            C24362h.m61211f(list, "requests");
            ArrayList arrayList = new ArrayList(C21136j.m49436X(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C0124u((GraphRequest) it.next(), httpURLConnection, new FacebookRequestError(facebookException)));
            }
            return arrayList;
        }

        /* JADX WARNING: Removed duplicated region for block: B:51:0x00e0 A[Catch:{ JSONException -> 0x011e }] */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x0122  */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x01b5  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static p009a8.C0124u m231b(com.facebook.GraphRequest r23, java.net.HttpURLConnection r24, java.lang.Object r25, java.lang.Object r26) throws org.json.JSONException {
            /*
                r1 = r23
                r2 = r24
                r0 = r25
                java.lang.String r3 = "body"
                java.lang.String r4 = "FACEBOOK_NON_JSON_RESULT"
                boolean r5 = r0 instanceof org.json.JSONObject
                r6 = 0
                if (r5 == 0) goto L_0x01f2
                org.json.JSONObject r0 = (org.json.JSONObject) r0
                java.lang.String r5 = "error_code"
                java.lang.String r7 = "error"
                java.lang.String r8 = "code"
                r10 = 0
                boolean r11 = r0.has(r8)     // Catch:{ JSONException -> 0x011e }
                if (r11 == 0) goto L_0x011f
                int r13 = r0.getInt(r8)     // Catch:{ JSONException -> 0x011e }
                java.lang.Object r11 = com.facebook.internal.C2397f0.m6326t(r3, r4, r0)     // Catch:{ JSONException -> 0x011e }
                if (r11 == 0) goto L_0x00ed
                boolean r12 = r11 instanceof org.json.JSONObject     // Catch:{ JSONException -> 0x011e }
                if (r12 == 0) goto L_0x00ed
                r12 = r11
                org.json.JSONObject r12 = (org.json.JSONObject) r12     // Catch:{ JSONException -> 0x011e }
                boolean r12 = r12.has(r7)     // Catch:{ JSONException -> 0x011e }
                java.lang.String r14 = "error_subcode"
                r15 = -1
                if (r12 == 0) goto L_0x0084
                r5 = r11
                org.json.JSONObject r5 = (org.json.JSONObject) r5     // Catch:{ JSONException -> 0x011e }
                java.lang.Object r5 = com.facebook.internal.C2397f0.m6326t(r7, r6, r5)     // Catch:{ JSONException -> 0x011e }
                org.json.JSONObject r5 = (org.json.JSONObject) r5     // Catch:{ JSONException -> 0x011e }
                if (r5 != 0) goto L_0x0045
                r7 = r6
                goto L_0x004c
            L_0x0045:
                java.lang.String r7 = "type"
                java.lang.String r7 = r5.optString(r7, r6)     // Catch:{ JSONException -> 0x011e }
            L_0x004c:
                if (r5 != 0) goto L_0x0050
                r12 = r6
                goto L_0x0056
            L_0x0050:
                java.lang.String r12 = "message"
                java.lang.String r12 = r5.optString(r12, r6)     // Catch:{ JSONException -> 0x011e }
            L_0x0056:
                if (r5 != 0) goto L_0x005a
                r8 = -1
                goto L_0x005e
            L_0x005a:
                int r8 = r5.optInt(r8, r15)     // Catch:{ JSONException -> 0x011e }
            L_0x005e:
                if (r5 != 0) goto L_0x0061
                goto L_0x0065
            L_0x0061:
                int r15 = r5.optInt(r14, r15)     // Catch:{ JSONException -> 0x011e }
            L_0x0065:
                if (r5 != 0) goto L_0x0069
                r14 = r6
                goto L_0x006f
            L_0x0069:
                java.lang.String r14 = "error_user_msg"
                java.lang.String r14 = r5.optString(r14, r6)     // Catch:{ JSONException -> 0x011e }
            L_0x006f:
                if (r5 != 0) goto L_0x0073
                r9 = r6
                goto L_0x0079
            L_0x0073:
                java.lang.String r9 = "error_user_title"
                java.lang.String r9 = r5.optString(r9, r6)     // Catch:{ JSONException -> 0x011e }
            L_0x0079:
                if (r5 != 0) goto L_0x007d
                r5 = 0
                goto L_0x00d2
            L_0x007d:
                java.lang.String r6 = "is_transient"
                boolean r5 = r5.optBoolean(r6, r10)     // Catch:{ JSONException -> 0x011e }
                goto L_0x00d2
            L_0x0084:
                r6 = r11
                org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch:{ JSONException -> 0x011e }
                boolean r6 = r6.has(r5)     // Catch:{ JSONException -> 0x011e }
                java.lang.String r7 = "error_msg"
                java.lang.String r8 = "error_reason"
                if (r6 != 0) goto L_0x00b1
                r6 = r11
                org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch:{ JSONException -> 0x011e }
                boolean r6 = r6.has(r7)     // Catch:{ JSONException -> 0x011e }
                if (r6 != 0) goto L_0x00b1
                r6 = r11
                org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch:{ JSONException -> 0x011e }
                boolean r6 = r6.has(r8)     // Catch:{ JSONException -> 0x011e }
                if (r6 == 0) goto L_0x00a4
                goto L_0x00b1
            L_0x00a4:
                r5 = 0
                r14 = -1
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r22 = 0
                goto L_0x00de
            L_0x00b1:
                r6 = r11
                org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch:{ JSONException -> 0x011e }
                r9 = 0
                java.lang.String r6 = r6.optString(r8, r9)     // Catch:{ JSONException -> 0x011e }
                r8 = r11
                org.json.JSONObject r8 = (org.json.JSONObject) r8     // Catch:{ JSONException -> 0x011e }
                java.lang.String r12 = r8.optString(r7, r9)     // Catch:{ JSONException -> 0x011e }
                r7 = r11
                org.json.JSONObject r7 = (org.json.JSONObject) r7     // Catch:{ JSONException -> 0x011e }
                int r8 = r7.optInt(r5, r15)     // Catch:{ JSONException -> 0x011e }
                r5 = r11
                org.json.JSONObject r5 = (org.json.JSONObject) r5     // Catch:{ JSONException -> 0x011e }
                int r15 = r5.optInt(r14, r15)     // Catch:{ JSONException -> 0x011e }
                r7 = r6
                r5 = 0
                r9 = 0
                r14 = 0
            L_0x00d2:
                r22 = r5
                r16 = r7
                r18 = r9
                r17 = r12
                r19 = r14
                r5 = 1
                r14 = r8
            L_0x00de:
                if (r5 == 0) goto L_0x00ed
                com.facebook.FacebookRequestError r5 = new com.facebook.FacebookRequestError     // Catch:{ JSONException -> 0x011e }
                org.json.JSONObject r11 = (org.json.JSONObject) r11     // Catch:{ JSONException -> 0x011e }
                r21 = 0
                r12 = r5
                r20 = r26
                r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ JSONException -> 0x011e }
                goto L_0x011c
            L_0x00ed:
                r5 = 200(0xc8, float:2.8E-43)
                r6 = 299(0x12b, float:4.19E-43)
                if (r13 > r6) goto L_0x00f7
                if (r5 > r13) goto L_0x00f7
                r5 = 1
                goto L_0x00f8
            L_0x00f7:
                r5 = 0
            L_0x00f8:
                if (r5 != 0) goto L_0x011f
                com.facebook.FacebookRequestError r5 = new com.facebook.FacebookRequestError     // Catch:{ JSONException -> 0x011e }
                r14 = -1
                r15 = -1
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                boolean r6 = r0.has(r3)     // Catch:{ JSONException -> 0x011e }
                if (r6 == 0) goto L_0x0112
                java.lang.Object r6 = com.facebook.internal.C2397f0.m6326t(r3, r4, r0)     // Catch:{ JSONException -> 0x011e }
                org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch:{ JSONException -> 0x011e }
            L_0x0112:
                r21 = 0
                r22 = 0
                r12 = r5
                r20 = r26
                r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ JSONException -> 0x011e }
            L_0x011c:
                r9 = r5
                goto L_0x0120
            L_0x011e:
            L_0x011f:
                r9 = 0
            L_0x0120:
                if (r9 == 0) goto L_0x01b5
                int r0 = p009a8.C0124u.f363e
                r9.toString()
                int r0 = r9.f8417c
                r3 = 190(0xbe, float:2.66E-43)
                if (r0 != r3) goto L_0x01af
                com.facebook.internal.f0 r0 = com.facebook.internal.C2397f0.f8630a
                com.facebook.AccessToken r0 = r1.f8428a
                if (r0 == 0) goto L_0x0140
                java.util.Date r3 = com.facebook.AccessToken.f8348m
                com.facebook.AccessToken r3 = com.facebook.AccessToken.C2266c.m6110b()
                boolean r0 = mf0.C24362h.m61206a(r0, r3)
                if (r0 == 0) goto L_0x0140
                r10 = 1
            L_0x0140:
                if (r10 == 0) goto L_0x01af
                int r0 = r9.f8418d
                r3 = 493(0x1ed, float:6.91E-43)
                if (r0 == r3) goto L_0x0156
                java.util.Date r0 = com.facebook.AccessToken.f8348m
                a8.e$a r0 = p009a8.C0100e.f304f
                a8.e r0 = r0.mo216a()
                r3 = 1
                r4 = 0
                r0.mo215c(r4, r3)
                goto L_0x01af
            L_0x0156:
                java.util.Date r0 = com.facebook.AccessToken.f8348m
                com.facebook.AccessToken r0 = com.facebook.AccessToken.C2266c.m6110b()
                if (r0 != 0) goto L_0x0160
                r6 = 0
                goto L_0x016f
            L_0x0160:
                java.util.Date r3 = new java.util.Date
                r3.<init>()
                java.util.Date r0 = r0.f8351b
                boolean r0 = r3.after(r0)
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            L_0x016f:
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                boolean r0 = mf0.C24362h.m61206a(r6, r0)
                if (r0 == 0) goto L_0x01af
                a8.e$a r0 = p009a8.C0100e.f304f
                a8.e r3 = r0.mo216a()
                com.facebook.AccessToken r3 = r3.f308c
                if (r3 == 0) goto L_0x01af
                com.facebook.AccessToken r4 = new com.facebook.AccessToken
                java.lang.String r11 = r3.f8355f
                java.lang.String r12 = r3.f8358i
                java.lang.String r13 = r3.f8359j
                java.util.Set<java.lang.String> r14 = r3.f8352c
                java.util.Set<java.lang.String> r15 = r3.f8353d
                java.util.Set<java.lang.String> r5 = r3.f8354e
                com.facebook.AccessTokenSource r6 = r3.f8356g
                java.util.Date r18 = new java.util.Date
                r18.<init>()
                java.util.Date r19 = new java.util.Date
                r19.<init>()
                java.util.Date r3 = r3.f8360k
                r10 = r4
                r16 = r5
                r17 = r6
                r20 = r3
                r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                a8.e r0 = r0.mo216a()
                r3 = 1
                r0.mo215c(r4, r3)
            L_0x01af:
                a8.u r0 = new a8.u
                r0.<init>(r1, r2, r9)
                return r0
            L_0x01b5:
                java.lang.Object r0 = com.facebook.internal.C2397f0.m6326t(r3, r4, r0)
                boolean r3 = r0 instanceof org.json.JSONObject
                if (r3 == 0) goto L_0x01c9
                a8.u r3 = new a8.u
                org.json.JSONObject r0 = (org.json.JSONObject) r0
                java.lang.String r4 = r0.toString()
                r3.<init>(r1, r2, r4, r0)
                return r3
            L_0x01c9:
                boolean r3 = r0 instanceof org.json.JSONArray
                if (r3 == 0) goto L_0x01eb
                a8.u r6 = new a8.u
                r4 = r0
                org.json.JSONArray r4 = (org.json.JSONArray) r4
                java.lang.String r0 = r4.toString()
                java.lang.String r3 = "request"
                mf0.C24362h.m61211f(r1, r3)
                java.lang.String r3 = "rawResponse"
                mf0.C24362h.m61211f(r0, r3)
                r3 = 0
                r5 = 0
                r0 = r6
                r1 = r23
                r2 = r24
                r0.<init>(r1, r2, r3, r4, r5)
                return r6
            L_0x01eb:
                java.lang.Object r0 = org.json.JSONObject.NULL
                java.lang.String r3 = "NULL"
                mf0.C24362h.m61210e(r0, r3)
            L_0x01f2:
                java.lang.Object r3 = org.json.JSONObject.NULL
                if (r0 != r3) goto L_0x0201
                a8.u r3 = new a8.u
                java.lang.String r0 = r0.toString()
                r4 = 0
                r3.<init>(r1, r2, r0, r4)
                return r3
            L_0x0201:
                com.facebook.FacebookException r1 = new com.facebook.FacebookException
                java.lang.Class r0 = r0.getClass()
                java.lang.String r0 = r0.getSimpleName()
                java.lang.String r2 = "Got unexpected object type in response, class: "
                java.lang.String r0 = mf0.C24362h.m61216k(r0, r2)
                r1.<init>((java.lang.String) r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p009a8.C0124u.C0125a.m231b(com.facebook.GraphRequest, java.net.HttpURLConnection, java.lang.Object, java.lang.Object):a8.u");
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0087  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.util.ArrayList m232c(java.io.InputStream r13, java.net.HttpURLConnection r14, p009a8.C0121t r15) throws com.facebook.FacebookException, org.json.JSONException, java.io.IOException {
            /*
                java.lang.String r0 = "requests"
                mf0.C24362h.m61211f(r15, r0)
                java.lang.String r13 = com.facebook.internal.C2397f0.m6303L(r13)
                com.facebook.internal.x$a r0 = com.facebook.internal.C2436x.f8729d
                com.facebook.LoggingBehavior r0 = com.facebook.LoggingBehavior.INCLUDE_RAW_RESPONSES
                r1 = 2
                java.lang.Object[] r2 = new java.lang.Object[r1]
                int r3 = r13.length()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r4 = 0
                r2[r4] = r3
                r3 = 1
                r2[r3] = r13
                java.lang.String r5 = "Response"
                java.lang.String r6 = "Response (raw)\n  Size: %d\n  Response:\n%s\n"
                com.facebook.internal.C2436x.C2437a.m6390b(r0, r5, r6, r2)
                org.json.JSONTokener r0 = new org.json.JSONTokener
                r0.<init>(r13)
                java.lang.Object r0 = r0.nextValue()
                java.lang.String r2 = "resultObject"
                mf0.C24362h.m61210e(r0, r2)
                int r2 = r15.size()
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>(r2)
                if (r2 != r3) goto L_0x0082
                java.lang.Object r7 = r15.get(r4)
                com.facebook.GraphRequest r7 = (com.facebook.GraphRequest) r7
                org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0074, IOException -> 0x0065 }
                r8.<init>()     // Catch:{ JSONException -> 0x0074, IOException -> 0x0065 }
                java.lang.String r9 = "body"
                r8.put(r9, r0)     // Catch:{ JSONException -> 0x0074, IOException -> 0x0065 }
                if (r14 != 0) goto L_0x0053
                r9 = 200(0xc8, float:2.8E-43)
                goto L_0x0057
            L_0x0053:
                int r9 = r14.getResponseCode()     // Catch:{ JSONException -> 0x0074, IOException -> 0x0065 }
            L_0x0057:
                java.lang.String r10 = "code"
                r8.put(r10, r9)     // Catch:{ JSONException -> 0x0074, IOException -> 0x0065 }
                org.json.JSONArray r9 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0074, IOException -> 0x0065 }
                r9.<init>()     // Catch:{ JSONException -> 0x0074, IOException -> 0x0065 }
                r9.put(r8)     // Catch:{ JSONException -> 0x0074, IOException -> 0x0065 }
                goto L_0x0083
            L_0x0065:
                r8 = move-exception
                a8.u r9 = new a8.u
                com.facebook.FacebookRequestError r10 = new com.facebook.FacebookRequestError
                r10.<init>(r8)
                r9.<init>(r7, r14, r10)
                r6.add(r9)
                goto L_0x0082
            L_0x0074:
                r8 = move-exception
                a8.u r9 = new a8.u
                com.facebook.FacebookRequestError r10 = new com.facebook.FacebookRequestError
                r10.<init>(r8)
                r9.<init>(r7, r14, r10)
                r6.add(r9)
            L_0x0082:
                r9 = r0
            L_0x0083:
                boolean r7 = r9 instanceof org.json.JSONArray
                if (r7 == 0) goto L_0x00f4
                r7 = r9
                org.json.JSONArray r7 = (org.json.JSONArray) r7
                int r8 = r7.length()
                if (r8 != r2) goto L_0x00f4
                int r2 = r7.length()
                if (r2 <= 0) goto L_0x00d7
                r7 = 0
            L_0x0097:
                int r8 = r7 + 1
                java.lang.Object r10 = r15.get(r7)
                com.facebook.GraphRequest r10 = (com.facebook.GraphRequest) r10
                r11 = r9
                org.json.JSONArray r11 = (org.json.JSONArray) r11     // Catch:{ JSONException -> 0x00b5, FacebookException -> 0x00b3 }
                java.lang.Object r7 = r11.get(r7)     // Catch:{ JSONException -> 0x00b5, FacebookException -> 0x00b3 }
                java.lang.String r11 = "obj"
                mf0.C24362h.m61210e(r7, r11)     // Catch:{ JSONException -> 0x00b5, FacebookException -> 0x00b3 }
                a8.u r7 = m231b(r10, r14, r7, r0)     // Catch:{ JSONException -> 0x00b5, FacebookException -> 0x00b3 }
                r6.add(r7)     // Catch:{ JSONException -> 0x00b5, FacebookException -> 0x00b3 }
                goto L_0x00d2
            L_0x00b3:
                r7 = move-exception
                goto L_0x00b7
            L_0x00b5:
                r7 = move-exception
                goto L_0x00c5
            L_0x00b7:
                a8.u r11 = new a8.u
                com.facebook.FacebookRequestError r12 = new com.facebook.FacebookRequestError
                r12.<init>(r7)
                r11.<init>(r10, r14, r12)
                r6.add(r11)
                goto L_0x00d2
            L_0x00c5:
                a8.u r11 = new a8.u
                com.facebook.FacebookRequestError r12 = new com.facebook.FacebookRequestError
                r12.<init>(r7)
                r11.<init>(r10, r14, r12)
                r6.add(r11)
            L_0x00d2:
                if (r8 < r2) goto L_0x00d5
                goto L_0x00d7
            L_0x00d5:
                r7 = r8
                goto L_0x0097
            L_0x00d7:
                com.facebook.internal.x$a r14 = com.facebook.internal.C2436x.f8729d
                com.facebook.LoggingBehavior r14 = com.facebook.LoggingBehavior.REQUESTS
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r15 = r15.f360c
                r0[r4] = r15
                int r13 = r13.length()
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                r0[r3] = r13
                r0[r1] = r6
                java.lang.String r13 = "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n"
                com.facebook.internal.C2436x.C2437a.m6390b(r14, r5, r13, r0)
                return r6
            L_0x00f4:
                com.facebook.FacebookException r13 = new com.facebook.FacebookException
                java.lang.String r14 = "Unexpected number of results"
                r13.<init>((java.lang.String) r14)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: p009a8.C0124u.C0125a.m232c(java.io.InputStream, java.net.HttpURLConnection, a8.t):java.util.ArrayList");
        }
    }

    public C0124u(GraphRequest graphRequest, HttpURLConnection httpURLConnection, JSONObject jSONObject, JSONArray jSONArray, FacebookRequestError facebookRequestError) {
        C24362h.m61211f(graphRequest, "request");
        this.f364a = httpURLConnection;
        this.f365b = jSONObject;
        this.f366c = facebookRequestError;
        this.f367d = jSONObject;
    }

    public final String toString() {
        String str;
        int i;
        try {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            HttpURLConnection httpURLConnection = this.f364a;
            if (httpURLConnection == null) {
                i = 200;
            } else {
                i = httpURLConnection.getResponseCode();
            }
            objArr[0] = Integer.valueOf(i);
            str = String.format(locale, "%d", Arrays.copyOf(objArr, 1));
            C24362h.m61210e(str, "java.lang.String.format(locale, format, *args)");
        } catch (IOException unused) {
            str = "unknown";
        }
        String str2 = "{Response: " + " responseCode: " + str + ", graphObject: " + this.f365b + ", error: " + this.f366c + "}";
        C24362h.m61210e(str2, "StringBuilder()\n        .append(\"{Response: \")\n        .append(\" responseCode: \")\n        .append(responseCode)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", error: \")\n        .append(error)\n        .append(\"}\")\n        .toString()");
        return str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0124u(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject) {
        this(graphRequest, httpURLConnection, jSONObject, (JSONArray) null, (FacebookRequestError) null);
        C24362h.m61211f(graphRequest, "request");
        C24362h.m61211f(str, "rawResponse");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0124u(GraphRequest graphRequest, HttpURLConnection httpURLConnection, FacebookRequestError facebookRequestError) {
        this(graphRequest, httpURLConnection, (JSONObject) null, (JSONArray) null, facebookRequestError);
        C24362h.m61211f(graphRequest, "request");
    }
}
