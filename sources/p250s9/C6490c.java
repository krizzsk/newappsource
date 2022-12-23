package p250s9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.appsflyer.ServerParameters;
import com.google.android.datatransport.cct.internal.C3856a;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.usebutton.sdk.internal.events.Events;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import p075ea.C4614a;
import p263t9.C6614g;
import p275u9.C6735h;
import p275u9.C6743n;
import p288v9.C6885k;
import p337z9.C7506a;
import p837ue.C19895d;
import p837ue.C19896e;

/* renamed from: s9.c */
public final class C6490c implements C6885k {

    /* renamed from: a */
    public final C19895d f20237a;

    /* renamed from: b */
    public final ConnectivityManager f20238b;

    /* renamed from: c */
    public final Context f20239c;

    /* renamed from: d */
    public final URL f20240d = m15379c(C6488a.f20230c);

    /* renamed from: e */
    public final C4614a f20241e;

    /* renamed from: f */
    public final C4614a f20242f;

    /* renamed from: g */
    public final int f20243g;

    /* renamed from: s9.c$a */
    public static final class C6491a {

        /* renamed from: a */
        public final URL f20244a;

        /* renamed from: b */
        public final C6614g f20245b;

        /* renamed from: c */
        public final String f20246c;

        public C6491a(URL url, C6614g gVar, String str) {
            this.f20244a = url;
            this.f20245b = gVar;
            this.f20246c = str;
        }
    }

    /* renamed from: s9.c$b */
    public static final class C6492b {

        /* renamed from: a */
        public final int f20247a;

        /* renamed from: b */
        public final URL f20248b;

        /* renamed from: c */
        public final long f20249c;

        public C6492b(int i, URL url, long j) {
            this.f20247a = i;
            this.f20248b = url;
            this.f20249c = j;
        }
    }

    public C6490c(Context context, C4614a aVar, C4614a aVar2) {
        C19896e eVar = new C19896e();
        C3856a.f13343a.configure(eVar);
        eVar.f50526d = true;
        this.f20237a = new C19895d(eVar);
        this.f20239c = context;
        this.f20238b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f20241e = aVar2;
        this.f20242f = aVar;
        this.f20243g = 130000;
    }

    /* renamed from: c */
    public static URL m15379c(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(C25541a.m63881k("Invalid url: ", str), e);
        }
    }

    /* renamed from: a */
    public final C6735h mo22594a(C6743n nVar) {
        int i;
        int i2;
        NetworkInfo activeNetworkInfo = this.f20238b.getActiveNetworkInfo();
        C6735h.C6736a i3 = nVar.mo22923i();
        int i4 = Build.VERSION.SDK_INT;
        Map<String, String> map = i3.f20857f;
        if (map != null) {
            map.put("sdk-version", String.valueOf(i4));
            i3.mo22924a(ServerParameters.MODEL, Build.MODEL);
            i3.mo22924a("hardware", Build.HARDWARE);
            i3.mo22924a(ServerParameters.DEVICE_KEY, Build.DEVICE);
            i3.mo22924a("product", Build.PRODUCT);
            i3.mo22924a("os-uild", Build.ID);
            i3.mo22924a("manufacturer", Build.MANUFACTURER);
            i3.mo22924a(Events.PROPERTY_FINGERPRINT, Build.FINGERPRINT);
            Calendar.getInstance();
            long offset = (long) (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000);
            Map<String, String> map2 = i3.f20857f;
            if (map2 != null) {
                map2.put("tz-offset", String.valueOf(offset));
                if (activeNetworkInfo == null) {
                    i = NetworkConnectionInfo.NetworkType.NONE.getValue();
                } else {
                    i = activeNetworkInfo.getType();
                }
                Map<String, String> map3 = i3.f20857f;
                if (map3 != null) {
                    map3.put("net-type", String.valueOf(i));
                    int i5 = -1;
                    if (activeNetworkInfo == null) {
                        i2 = NetworkConnectionInfo.MobileSubtype.UNKNOWN_MOBILE_SUBTYPE.getValue();
                    } else {
                        i2 = activeNetworkInfo.getSubtype();
                        if (i2 == -1) {
                            i2 = NetworkConnectionInfo.MobileSubtype.COMBINED.getValue();
                        } else if (NetworkConnectionInfo.MobileSubtype.forNumber(i2) == null) {
                            i2 = 0;
                        }
                    }
                    Map<String, String> map4 = i3.f20857f;
                    if (map4 != null) {
                        map4.put("mobile-subtype", String.valueOf(i2));
                        i3.mo22924a(ServerParameters.COUNTRY, Locale.getDefault().getCountry());
                        i3.mo22924a("locale", Locale.getDefault().getLanguage());
                        i3.mo22924a("mcc_mnc", ((TelephonyManager) this.f20239c.getSystemService("phone")).getSimOperator());
                        Context context = this.f20239c;
                        try {
                            i5 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                        } catch (PackageManager.NameNotFoundException unused) {
                            C7506a.m17227b("CctTransportBackend");
                        }
                        i3.mo22924a("application_build", Integer.toString(i5));
                        return i3.mo22899b();
                    }
                    throw new IllegalStateException("Property \"autoMetadata\" has not been set");
                }
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:165:0x03de */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0350 A[Catch:{ all -> 0x03aa, IOException -> 0x0452 }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0351 A[Catch:{ all -> 0x03aa, IOException -> 0x0452 }] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x03ff A[Catch:{ all -> 0x03aa, IOException -> 0x0452 }] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0411 A[Catch:{ all -> 0x03aa, IOException -> 0x0452 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0299 A[Catch:{ all -> 0x03aa, IOException -> 0x0452 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02ec A[Catch:{ all -> 0x03aa, IOException -> 0x0452 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0312 A[SYNTHETIC, Splitter:B:94:0x0312] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0327 A[Catch:{ all -> 0x03aa, IOException -> 0x0452 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.datatransport.runtime.backends.C3865a mo22595b(p288v9.C6874a r31) {
        /*
            r30 = this;
            r1 = r30
            r0 = r31
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.Iterable<u9.n> r3 = r0.f21229a
            java.util.Iterator r3 = r3.iterator()
        L_0x000f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x003b
            java.lang.Object r4 = r3.next()
            u9.n r4 = (p275u9.C6743n) r4
            java.lang.String r5 = r4.mo22895g()
            boolean r6 = r2.containsKey(r5)
            if (r6 != 0) goto L_0x0031
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r6.add(r4)
            r2.put(r5, r6)
            goto L_0x000f
        L_0x0031:
            java.lang.Object r5 = r2.get(r5)
            java.util.List r5 = (java.util.List) r5
            r5.add(r4)
            goto L_0x000f
        L_0x003b:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0048:
            boolean r4 = r2.hasNext()
            java.lang.String r5 = "CctTransportBackend"
            r6 = 0
            if (r4 == 0) goto L_0x025b
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r7 = r4.getValue()
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r6 = r7.get(r6)
            u9.n r6 = (p275u9.C6743n) r6
            com.google.android.datatransport.cct.internal.QosTier r16 = com.google.android.datatransport.cct.internal.QosTier.DEFAULT
            ea.a r7 = r1.f20242f
            long r7 = r7.mo20139V()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            ea.a r8 = r1.f20241e
            long r8 = r8.mo20139V()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            com.google.android.datatransport.cct.internal.ClientInfo$ClientType r9 = com.google.android.datatransport.cct.internal.ClientInfo.ClientType.ANDROID_FIREBASE
            java.lang.String r10 = "sdk-version"
            int r10 = r6.mo22922f(r10)
            java.lang.Integer r18 = java.lang.Integer.valueOf(r10)
            java.lang.String r10 = "model"
            java.lang.String r19 = r6.mo22921a(r10)
            java.lang.String r10 = "hardware"
            java.lang.String r20 = r6.mo22921a(r10)
            java.lang.String r10 = "device"
            java.lang.String r21 = r6.mo22921a(r10)
            java.lang.String r10 = "product"
            java.lang.String r22 = r6.mo22921a(r10)
            java.lang.String r10 = "os-uild"
            java.lang.String r23 = r6.mo22921a(r10)
            java.lang.String r10 = "manufacturer"
            java.lang.String r24 = r6.mo22921a(r10)
            java.lang.String r10 = "fingerprint"
            java.lang.String r25 = r6.mo22921a(r10)
            java.lang.String r10 = "country"
            java.lang.String r27 = r6.mo22921a(r10)
            java.lang.String r10 = "locale"
            java.lang.String r26 = r6.mo22921a(r10)
            java.lang.String r10 = "mcc_mnc"
            java.lang.String r28 = r6.mo22921a(r10)
            java.lang.String r10 = "application_build"
            java.lang.String r29 = r6.mo22921a(r10)
            t9.b r6 = new t9.b
            r17 = r6
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            com.google.android.datatransport.cct.internal.b r12 = new com.google.android.datatransport.cct.internal.b
            r12.<init>(r9, r6)
            java.lang.Object r6 = r4.getKey()     // Catch:{ NumberFormatException -> 0x00e5 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ NumberFormatException -> 0x00e5 }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x00e5 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ NumberFormatException -> 0x00e5 }
            r9 = 0
            r13 = r6
            r14 = r9
            goto L_0x00ee
        L_0x00e5:
            java.lang.Object r6 = r4.getKey()
            java.lang.String r6 = (java.lang.String) r6
            r9 = 0
            r14 = r6
            r13 = r9
        L_0x00ee:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.lang.Object r4 = r4.getValue()
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x00fd:
            boolean r6 = r4.hasNext()
            java.lang.String r9 = "Missing required properties:"
            java.lang.String r10 = ""
            if (r6 == 0) goto L_0x0222
            java.lang.Object r6 = r4.next()
            u9.n r6 = (p275u9.C6743n) r6
            u9.m r11 = r6.mo22892d()
            r17 = r2
            r9.b r2 = r11.f20874a
            r18 = r4
            r9.b r4 = new r9.b
            r19 = r10
            java.lang.String r10 = "proto"
            r4.<init>(r10)
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x0130
            byte[] r2 = r11.f20875b
            t9.d$a r4 = new t9.d$a
            r4.<init>()
            r4.f20476d = r2
            goto L_0x0151
        L_0x0130:
            r9.b r4 = new r9.b
            java.lang.String r10 = "json"
            r4.<init>(r10)
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x0206
            java.lang.String r2 = new java.lang.String
            byte[] r4 = r11.f20875b
            java.lang.String r10 = "UTF-8"
            java.nio.charset.Charset r10 = java.nio.charset.Charset.forName(r10)
            r2.<init>(r4, r10)
            t9.d$a r4 = new t9.d$a
            r4.<init>()
            r4.f20477e = r2
        L_0x0151:
            long r10 = r6.mo22893e()
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            r4.f20473a = r2
            long r10 = r6.mo22896h()
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            r4.f20475c = r2
            java.util.Map r2 = r6.mo22890b()
            java.lang.String r10 = "tz-offset"
            java.lang.Object r2 = r2.get(r10)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x0177
            r10 = 0
            goto L_0x017f
        L_0x0177:
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r10 = r2.longValue()
        L_0x017f:
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            r4.f20478f = r2
            java.lang.String r2 = "net-type"
            int r2 = r6.mo22922f(r2)
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType r2 = com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType.forNumber(r2)
            java.lang.String r10 = "mobile-subtype"
            int r10 = r6.mo22922f(r10)
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype r10 = com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype.forNumber(r10)
            com.google.android.datatransport.cct.internal.c r11 = new com.google.android.datatransport.cct.internal.c
            r11.<init>(r2, r10)
            r4.f20479g = r11
            java.lang.Integer r2 = r6.mo22891c()
            if (r2 == 0) goto L_0x01ac
            java.lang.Integer r2 = r6.mo22891c()
            r4.f20474b = r2
        L_0x01ac:
            java.lang.Long r2 = r4.f20473a
            if (r2 != 0) goto L_0x01b3
            java.lang.String r10 = " eventTimeMs"
            goto L_0x01b5
        L_0x01b3:
            r10 = r19
        L_0x01b5:
            java.lang.Long r2 = r4.f20475c
            if (r2 != 0) goto L_0x01bf
            java.lang.String r2 = " eventUptimeMs"
            java.lang.String r10 = p379.C25541a.m63881k(r10, r2)
        L_0x01bf:
            java.lang.Long r2 = r4.f20478f
            if (r2 != 0) goto L_0x01c9
            java.lang.String r2 = " timezoneOffsetSeconds"
            java.lang.String r10 = p379.C25541a.m63881k(r10, r2)
        L_0x01c9:
            boolean r2 = r10.isEmpty()
            if (r2 == 0) goto L_0x01fc
            t9.d r2 = new t9.d
            java.lang.Long r6 = r4.f20473a
            long r20 = r6.longValue()
            java.lang.Integer r6 = r4.f20474b
            java.lang.Long r9 = r4.f20475c
            long r23 = r9.longValue()
            byte[] r9 = r4.f20476d
            java.lang.String r10 = r4.f20477e
            java.lang.Long r11 = r4.f20478f
            long r27 = r11.longValue()
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo r4 = r4.f20479g
            r19 = r2
            r22 = r6
            r25 = r9
            r26 = r10
            r29 = r4
            r19.<init>(r20, r22, r23, r25, r26, r27, r29)
            r15.add(r2)
            goto L_0x021c
        L_0x01fc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = p379.C25541a.m63881k(r9, r10)
            r0.<init>(r2)
            throw r0
        L_0x0206:
            java.lang.String r4 = p337z9.C7506a.m17227b(r5)
            r6 = 5
            boolean r4 = android.util.Log.isLoggable(r4, r6)
            if (r4 == 0) goto L_0x021c
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r6 = 0
            r4[r6] = r2
            java.lang.String r2 = "Received event of unsupported encoding %s. Skipping..."
            java.lang.String.format(r2, r4)
        L_0x021c:
            r2 = r17
            r4 = r18
            goto L_0x00fd
        L_0x0222:
            r17 = r2
            r19 = r10
            if (r7 != 0) goto L_0x022b
            java.lang.String r10 = " requestTimeMs"
            goto L_0x022d
        L_0x022b:
            r10 = r19
        L_0x022d:
            if (r8 != 0) goto L_0x0235
            java.lang.String r2 = " requestUptimeMs"
            java.lang.String r10 = p379.C25541a.m63881k(r10, r2)
        L_0x0235:
            boolean r2 = r10.isEmpty()
            if (r2 == 0) goto L_0x0251
            t9.e r2 = new t9.e
            long r4 = r7.longValue()
            long r10 = r8.longValue()
            r7 = r2
            r8 = r4
            r7.<init>(r8, r10, r12, r13, r14, r15, r16)
            r3.add(r2)
            r2 = r17
            goto L_0x0048
        L_0x0251:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = p379.C25541a.m63881k(r9, r10)
            r0.<init>(r2)
            throw r0
        L_0x025b:
            r2 = 5
            t9.c r4 = new t9.c
            r4.<init>(r3)
            java.net.URL r3 = r1.f20240d
            byte[] r0 = r0.f21230b
            r6 = -1
            if (r0 == 0) goto L_0x0284
            s9.a r0 = p250s9.C6488a.m15373a(r0)     // Catch:{ IllegalArgumentException -> 0x027c }
            java.lang.String r8 = r0.f20235b     // Catch:{ IllegalArgumentException -> 0x027c }
            if (r8 == 0) goto L_0x0272
            goto L_0x0273
        L_0x0272:
            r8 = 0
        L_0x0273:
            java.lang.String r0 = r0.f20234a     // Catch:{ IllegalArgumentException -> 0x027c }
            if (r0 == 0) goto L_0x0285
            java.net.URL r3 = m15379c(r0)     // Catch:{ IllegalArgumentException -> 0x027c }
            goto L_0x0285
        L_0x027c:
            com.google.android.datatransport.runtime.backends.a r0 = new com.google.android.datatransport.runtime.backends.a
            com.google.android.datatransport.runtime.backends.BackendResponse$Status r2 = com.google.android.datatransport.runtime.backends.BackendResponse.Status.FATAL_ERROR
            r0.<init>(r2, r6)
            return r0
        L_0x0284:
            r8 = 0
        L_0x0285:
            s9.c$a r0 = new s9.c$a     // Catch:{ IOException -> 0x0452 }
            r0.<init>(r3, r4, r8)     // Catch:{ IOException -> 0x0452 }
            r2 = r0
            r3 = 5
        L_0x028c:
            java.net.URL r0 = r2.f20244a     // Catch:{ IOException -> 0x0452 }
            java.lang.String r4 = p337z9.C7506a.m17227b(r5)     // Catch:{ IOException -> 0x0452 }
            r6 = 4
            boolean r4 = android.util.Log.isLoggable(r4, r6)     // Catch:{ IOException -> 0x0452 }
            if (r4 == 0) goto L_0x02a4
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x0452 }
            r7 = 0
            r4[r7] = r0     // Catch:{ IOException -> 0x0452 }
            java.lang.String r0 = "Making request to: %s"
            java.lang.String.format(r0, r4)     // Catch:{ IOException -> 0x0452 }
        L_0x02a4:
            java.net.URL r0 = r2.f20244a     // Catch:{ IOException -> 0x0452 }
            java.net.URLConnection r0 = r0.openConnection()     // Catch:{ IOException -> 0x0452 }
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ IOException -> 0x0452 }
            r4 = 30000(0x7530, float:4.2039E-41)
            r0.setConnectTimeout(r4)     // Catch:{ IOException -> 0x0452 }
            int r4 = r1.f20243g     // Catch:{ IOException -> 0x0452 }
            r0.setReadTimeout(r4)     // Catch:{ IOException -> 0x0452 }
            r4 = 1
            r0.setDoOutput(r4)     // Catch:{ IOException -> 0x0452 }
            r7 = 0
            r0.setInstanceFollowRedirects(r7)     // Catch:{ IOException -> 0x0452 }
            java.lang.String r7 = "POST"
            r0.setRequestMethod(r7)     // Catch:{ IOException -> 0x0452 }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x0452 }
            java.lang.String r7 = "3.1.7"
            r8 = 0
            r4[r8] = r7     // Catch:{ IOException -> 0x0452 }
            java.lang.String r7 = "datatransport/%s android/"
            java.lang.String r4 = java.lang.String.format(r7, r4)     // Catch:{ IOException -> 0x0452 }
            java.lang.String r7 = "User-Agent"
            r0.setRequestProperty(r7, r4)     // Catch:{ IOException -> 0x0452 }
            java.lang.String r4 = "Content-Encoding"
            java.lang.String r7 = "gzip"
            r0.setRequestProperty(r4, r7)     // Catch:{ IOException -> 0x0452 }
            java.lang.String r8 = "Content-Type"
            java.lang.String r9 = "application/json"
            r0.setRequestProperty(r8, r9)     // Catch:{ IOException -> 0x0452 }
            java.lang.String r9 = "Accept-Encoding"
            r0.setRequestProperty(r9, r7)     // Catch:{ IOException -> 0x0452 }
            java.lang.String r9 = r2.f20246c     // Catch:{ IOException -> 0x0452 }
            if (r9 == 0) goto L_0x02f1
            java.lang.String r10 = "X-Goog-Api-Key"
            r0.setRequestProperty(r10, r9)     // Catch:{ IOException -> 0x0452 }
        L_0x02f1:
            r9 = 200(0xc8, float:2.8E-43)
            java.io.OutputStream r10 = r0.getOutputStream()     // Catch:{ ConnectException | UnknownHostException -> 0x03ed, EncodingException | IOException -> 0x03de }
            java.util.zip.GZIPOutputStream r11 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x03d0 }
            r11.<init>(r10)     // Catch:{ all -> 0x03d0 }
            ue.d r12 = r1.f20237a     // Catch:{ all -> 0x03c4 }
            t9.g r13 = r2.f20245b     // Catch:{ all -> 0x03c4 }
            java.io.BufferedWriter r14 = new java.io.BufferedWriter     // Catch:{ all -> 0x03c4 }
            java.io.OutputStreamWriter r15 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x03c4 }
            r15.<init>(r11)     // Catch:{ all -> 0x03c4 }
            r14.<init>(r15)     // Catch:{ all -> 0x03c4 }
            r12.mo52175a(r14, r13)     // Catch:{ all -> 0x03c4 }
            r11.close()     // Catch:{ all -> 0x03d0 }
            if (r10 == 0) goto L_0x0315
            r10.close()     // Catch:{ ConnectException | UnknownHostException -> 0x03ed, EncodingException | IOException -> 0x03de }
        L_0x0315:
            int r10 = r0.getResponseCode()     // Catch:{ IOException -> 0x0452 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)     // Catch:{ IOException -> 0x0452 }
            java.lang.String r12 = p337z9.C7506a.m17227b(r5)     // Catch:{ IOException -> 0x0452 }
            boolean r6 = android.util.Log.isLoggable(r12, r6)     // Catch:{ IOException -> 0x0452 }
            if (r6 == 0) goto L_0x0332
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ IOException -> 0x0452 }
            r12 = 0
            r6[r12] = r11     // Catch:{ IOException -> 0x0452 }
            java.lang.String r11 = "Status Code: %d"
            java.lang.String.format(r11, r6)     // Catch:{ IOException -> 0x0452 }
        L_0x0332:
            java.lang.String r6 = r0.getHeaderField(r8)     // Catch:{ IOException -> 0x0452 }
            java.lang.String r8 = "Content-Type: %s"
            p337z9.C7506a.m17226a(r5, r8, r6)     // Catch:{ IOException -> 0x0452 }
            java.lang.String r6 = r0.getHeaderField(r4)     // Catch:{ IOException -> 0x0452 }
            java.lang.String r8 = "Content-Encoding: %s"
            p337z9.C7506a.m17226a(r5, r8, r6)     // Catch:{ IOException -> 0x0452 }
            r6 = 302(0x12e, float:4.23E-43)
            if (r10 == r6) goto L_0x03b0
            r6 = 301(0x12d, float:4.22E-43)
            if (r10 == r6) goto L_0x03b0
            r6 = 307(0x133, float:4.3E-43)
            if (r10 != r6) goto L_0x0351
            goto L_0x03b0
        L_0x0351:
            if (r10 == r9) goto L_0x035d
            s9.c$b r0 = new s9.c$b     // Catch:{ IOException -> 0x0452 }
            r4 = 0
            r6 = 0
            r0.<init>(r10, r4, r6)     // Catch:{ IOException -> 0x0452 }
            goto L_0x03eb
        L_0x035d:
            java.io.InputStream r6 = r0.getInputStream()     // Catch:{ IOException -> 0x0452 }
            java.lang.String r0 = r0.getHeaderField(r4)     // Catch:{ all -> 0x03a2 }
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x03a2 }
            if (r0 == 0) goto L_0x0372
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x03a2 }
            r0.<init>(r6)     // Catch:{ all -> 0x03a2 }
            r4 = r0
            goto L_0x0373
        L_0x0372:
            r4 = r6
        L_0x0373:
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ all -> 0x0394 }
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ all -> 0x0394 }
            r7.<init>(r4)     // Catch:{ all -> 0x0394 }
            r0.<init>(r7)     // Catch:{ all -> 0x0394 }
            t9.f r0 = p263t9.C6618j.m15657a(r0)     // Catch:{ all -> 0x0394 }
            long r7 = r0.f20487a     // Catch:{ all -> 0x0394 }
            s9.c$b r0 = new s9.c$b     // Catch:{ all -> 0x0394 }
            r11 = 0
            r0.<init>(r10, r11, r7)     // Catch:{ all -> 0x0394 }
            if (r4 == 0) goto L_0x038e
            r4.close()     // Catch:{ all -> 0x03a2 }
        L_0x038e:
            if (r6 == 0) goto L_0x03eb
            r6.close()     // Catch:{ IOException -> 0x0452 }
            goto L_0x03eb
        L_0x0394:
            r0 = move-exception
            r2 = r0
            if (r4 == 0) goto L_0x03a1
            r4.close()     // Catch:{ all -> 0x039c }
            goto L_0x03a1
        L_0x039c:
            r0 = move-exception
            r3 = r0
            r2.addSuppressed(r3)     // Catch:{ all -> 0x03a2 }
        L_0x03a1:
            throw r2     // Catch:{ all -> 0x03a2 }
        L_0x03a2:
            r0 = move-exception
            r2 = r0
            if (r6 == 0) goto L_0x03af
            r6.close()     // Catch:{ all -> 0x03aa }
            goto L_0x03af
        L_0x03aa:
            r0 = move-exception
            r3 = r0
            r2.addSuppressed(r3)     // Catch:{ IOException -> 0x0452 }
        L_0x03af:
            throw r2     // Catch:{ IOException -> 0x0452 }
        L_0x03b0:
            java.lang.String r4 = "Location"
            java.lang.String r0 = r0.getHeaderField(r4)     // Catch:{ IOException -> 0x0452 }
            s9.c$b r4 = new s9.c$b     // Catch:{ IOException -> 0x0452 }
            java.net.URL r6 = new java.net.URL     // Catch:{ IOException -> 0x0452 }
            r6.<init>(r0)     // Catch:{ IOException -> 0x0452 }
            r7 = 0
            r4.<init>(r10, r6, r7)     // Catch:{ IOException -> 0x0452 }
            r0 = r4
            goto L_0x03eb
        L_0x03c4:
            r0 = move-exception
            r4 = r0
            r11.close()     // Catch:{ all -> 0x03ca }
            goto L_0x03cf
        L_0x03ca:
            r0 = move-exception
            r6 = r0
            r4.addSuppressed(r6)     // Catch:{ all -> 0x03d0 }
        L_0x03cf:
            throw r4     // Catch:{ all -> 0x03d0 }
        L_0x03d0:
            r0 = move-exception
            r4 = r0
            if (r10 == 0) goto L_0x03dd
            r10.close()     // Catch:{ all -> 0x03d8 }
            goto L_0x03dd
        L_0x03d8:
            r0 = move-exception
            r6 = r0
            r4.addSuppressed(r6)     // Catch:{ ConnectException | UnknownHostException -> 0x03ed, EncodingException | IOException -> 0x03de }
        L_0x03dd:
            throw r4     // Catch:{ ConnectException | UnknownHostException -> 0x03ed, EncodingException | IOException -> 0x03de }
        L_0x03de:
            p337z9.C7506a.m17227b(r5)     // Catch:{ IOException -> 0x0452 }
            s9.c$b r0 = new s9.c$b     // Catch:{ IOException -> 0x0452 }
            r4 = 400(0x190, float:5.6E-43)
            r6 = 0
            r7 = 0
            r0.<init>(r4, r6, r7)     // Catch:{ IOException -> 0x0452 }
        L_0x03eb:
            r4 = 0
            goto L_0x03fb
        L_0x03ed:
            p337z9.C7506a.m17227b(r5)     // Catch:{ IOException -> 0x0452 }
            s9.c$b r0 = new s9.c$b     // Catch:{ IOException -> 0x0452 }
            r4 = 500(0x1f4, float:7.0E-43)
            r6 = 0
            r7 = 0
            r0.<init>(r4, r6, r7)     // Catch:{ IOException -> 0x0452 }
            r4 = r6
        L_0x03fb:
            java.net.URL r6 = r0.f20248b     // Catch:{ IOException -> 0x0452 }
            if (r6 == 0) goto L_0x0411
            java.lang.String r4 = "Following redirect to: %s"
            p337z9.C7506a.m17226a(r5, r4, r6)     // Catch:{ IOException -> 0x0452 }
            java.net.URL r4 = r0.f20248b     // Catch:{ IOException -> 0x0452 }
            s9.c$a r6 = new s9.c$a     // Catch:{ IOException -> 0x0452 }
            t9.g r7 = r2.f20245b     // Catch:{ IOException -> 0x0452 }
            java.lang.String r2 = r2.f20246c     // Catch:{ IOException -> 0x0452 }
            r6.<init>(r4, r7, r2)     // Catch:{ IOException -> 0x0452 }
            r2 = r6
            goto L_0x0412
        L_0x0411:
            r2 = r4
        L_0x0412:
            if (r2 == 0) goto L_0x0419
            int r3 = r3 + -1
            r4 = 1
            if (r3 >= r4) goto L_0x028c
        L_0x0419:
            int r2 = r0.f20247a     // Catch:{ IOException -> 0x0452 }
            if (r2 != r9) goto L_0x0427
            long r2 = r0.f20249c     // Catch:{ IOException -> 0x0452 }
            com.google.android.datatransport.runtime.backends.a r0 = new com.google.android.datatransport.runtime.backends.a     // Catch:{ IOException -> 0x0452 }
            com.google.android.datatransport.runtime.backends.BackendResponse$Status r4 = com.google.android.datatransport.runtime.backends.BackendResponse.Status.OK     // Catch:{ IOException -> 0x0452 }
            r0.<init>(r4, r2)     // Catch:{ IOException -> 0x0452 }
            return r0
        L_0x0427:
            r0 = 500(0x1f4, float:7.0E-43)
            if (r2 >= r0) goto L_0x0448
            r0 = 404(0x194, float:5.66E-43)
            if (r2 != r0) goto L_0x0430
            goto L_0x0448
        L_0x0430:
            r0 = 400(0x190, float:5.6E-43)
            if (r2 != r0) goto L_0x043e
            com.google.android.datatransport.runtime.backends.a r0 = new com.google.android.datatransport.runtime.backends.a     // Catch:{ IOException -> 0x0452 }
            com.google.android.datatransport.runtime.backends.BackendResponse$Status r2 = com.google.android.datatransport.runtime.backends.BackendResponse.Status.INVALID_PAYLOAD     // Catch:{ IOException -> 0x0452 }
            r3 = -1
            r0.<init>(r2, r3)     // Catch:{ IOException -> 0x0452 }
            return r0
        L_0x043e:
            r2 = -1
            com.google.android.datatransport.runtime.backends.a r0 = new com.google.android.datatransport.runtime.backends.a     // Catch:{ IOException -> 0x0452 }
            com.google.android.datatransport.runtime.backends.BackendResponse$Status r4 = com.google.android.datatransport.runtime.backends.BackendResponse.Status.FATAL_ERROR     // Catch:{ IOException -> 0x0452 }
            r0.<init>(r4, r2)     // Catch:{ IOException -> 0x0452 }
            return r0
        L_0x0448:
            com.google.android.datatransport.runtime.backends.a r0 = new com.google.android.datatransport.runtime.backends.a     // Catch:{ IOException -> 0x0452 }
            com.google.android.datatransport.runtime.backends.BackendResponse$Status r2 = com.google.android.datatransport.runtime.backends.BackendResponse.Status.TRANSIENT_ERROR     // Catch:{ IOException -> 0x0452 }
            r3 = -1
            r0.<init>(r2, r3)     // Catch:{ IOException -> 0x0452 }
            return r0
        L_0x0452:
            p337z9.C7506a.m17227b(r5)
            com.google.android.datatransport.runtime.backends.a r0 = new com.google.android.datatransport.runtime.backends.a
            com.google.android.datatransport.runtime.backends.BackendResponse$Status r2 = com.google.android.datatransport.runtime.backends.BackendResponse.Status.TRANSIENT_ERROR
            r3 = -1
            r0.<init>(r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p250s9.C6490c.mo22595b(v9.a):com.google.android.datatransport.runtime.backends.a");
    }
}
