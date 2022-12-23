package p030bo.app;

import com.appboy.enums.DeviceKey;
import com.appboy.models.IPutIntoJson;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import com.braze.configuration.BrazeConfigurationProvider;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.o2 */
public class C1651o2 implements IPutIntoJson<JSONObject>, C1610j2 {

    /* renamed from: l */
    public static final String f5877l = AppboyLogger.getBrazeLogTag(C1651o2.class);

    /* renamed from: a */
    public final String f5878a;

    /* renamed from: b */
    public final String f5879b;

    /* renamed from: c */
    public final String f5880c;

    /* renamed from: d */
    public final String f5881d;

    /* renamed from: e */
    public final String f5882e;

    /* renamed from: f */
    public final String f5883f;

    /* renamed from: g */
    public final Boolean f5884g;

    /* renamed from: h */
    public final Boolean f5885h;

    /* renamed from: i */
    public final String f5886i;

    /* renamed from: j */
    public final Boolean f5887j;

    /* renamed from: k */
    public final BrazeConfigurationProvider f5888k;

    /* renamed from: bo.app.o2$a */
    public static /* synthetic */ class C1652a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5889a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.appboy.enums.DeviceKey[] r0 = com.appboy.enums.DeviceKey.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5889a = r0
                com.appboy.enums.DeviceKey r1 = com.appboy.enums.DeviceKey.TIMEZONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5889a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.appboy.enums.DeviceKey r1 = com.appboy.enums.DeviceKey.CARRIER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f5889a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.appboy.enums.DeviceKey r1 = com.appboy.enums.DeviceKey.ANDROID_VERSION     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f5889a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.appboy.enums.DeviceKey r1 = com.appboy.enums.DeviceKey.RESOLUTION     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f5889a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.appboy.enums.DeviceKey r1 = com.appboy.enums.DeviceKey.LOCALE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f5889a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.appboy.enums.DeviceKey r1 = com.appboy.enums.DeviceKey.MODEL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f5889a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.appboy.enums.DeviceKey r1 = com.appboy.enums.DeviceKey.NOTIFICATIONS_ENABLED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f5889a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.appboy.enums.DeviceKey r1 = com.appboy.enums.DeviceKey.IS_BACKGROUND_RESTRICTED     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f5889a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.appboy.enums.DeviceKey r1 = com.appboy.enums.DeviceKey.GOOGLE_ADVERTISING_ID     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f5889a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.appboy.enums.DeviceKey r1 = com.appboy.enums.DeviceKey.AD_TRACKING_ENABLED     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C1651o2.C1652a.<clinit>():void");
        }
    }

    /* renamed from: bo.app.o2$b */
    public static class C1653b {

        /* renamed from: a */
        public final BrazeConfigurationProvider f5890a;

        /* renamed from: b */
        public String f5891b;

        /* renamed from: c */
        public String f5892c;

        /* renamed from: d */
        public String f5893d;

        /* renamed from: e */
        public String f5894e;

        /* renamed from: f */
        public String f5895f;

        /* renamed from: g */
        public String f5896g;

        /* renamed from: h */
        public Boolean f5897h;

        /* renamed from: i */
        public Boolean f5898i;

        /* renamed from: j */
        public String f5899j;

        /* renamed from: k */
        public Boolean f5900k;

        public C1653b(BrazeConfigurationProvider brazeConfigurationProvider) {
            this.f5890a = brazeConfigurationProvider;
        }

        /* renamed from: a */
        public C1653b mo6267a(String str) {
            this.f5891b = str;
            return this;
        }

        /* renamed from: b */
        public C1653b mo6270b(String str) {
            this.f5892c = str;
            return this;
        }

        /* renamed from: c */
        public C1653b mo6271c(Boolean bool) {
            this.f5897h = bool;
            return this;
        }

        /* renamed from: d */
        public C1653b mo6273d(String str) {
            this.f5894e = str;
            return this;
        }

        /* renamed from: e */
        public C1653b mo6274e(String str) {
            this.f5893d = str;
            return this;
        }

        /* renamed from: f */
        public C1653b mo6275f(String str) {
            this.f5896g = str;
            return this;
        }

        /* renamed from: g */
        public C1653b mo6276g(String str) {
            this.f5895f = str;
            return this;
        }

        /* renamed from: a */
        public C1653b mo6266a(Boolean bool) {
            this.f5900k = bool;
            return this;
        }

        /* renamed from: b */
        public C1653b mo6269b(Boolean bool) {
            this.f5898i = bool;
            return this;
        }

        /* renamed from: c */
        public C1653b mo6272c(String str) {
            this.f5899j = str;
            return this;
        }

        /* renamed from: a */
        public C1651o2 mo6268a() {
            return new C1651o2(this.f5890a, this.f5891b, this.f5892c, this.f5893d, this.f5894e, this.f5895f, this.f5896g, this.f5897h, this.f5898i, this.f5899j, this.f5900k);
        }
    }

    public C1651o2(BrazeConfigurationProvider brazeConfigurationProvider, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, String str7, Boolean bool3) {
        this.f5888k = brazeConfigurationProvider;
        this.f5878a = str;
        this.f5879b = str2;
        this.f5880c = str3;
        this.f5881d = str4;
        this.f5883f = str5;
        this.f5882e = str6;
        this.f5884g = bool;
        this.f5885h = bool2;
        this.f5886i = str7;
        this.f5887j = bool3;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0089, code lost:
        r17 = r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p030bo.app.C1651o2 m4543a(com.braze.configuration.BrazeConfigurationProvider r19, org.json.JSONObject r20) {
        /*
            r0 = r20
            com.appboy.enums.DeviceKey[] r1 = com.appboy.enums.DeviceKey.values()
            int r2 = r1.length
            r4 = 0
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = 0
        L_0x0012:
            if (r14 >= r2) goto L_0x00e1
            r15 = r1[r14]
            java.lang.String r3 = r15.getKey()
            int[] r17 = p030bo.app.C1651o2.C1652a.f5889a
            int r18 = r15.ordinal()
            r17 = r17[r18]
            switch(r17) {
                case 1: goto L_0x00cd;
                case 2: goto L_0x00c0;
                case 3: goto L_0x00b3;
                case 4: goto L_0x00a6;
                case 5: goto L_0x0099;
                case 6: goto L_0x008c;
                case 7: goto L_0x0075;
                case 8: goto L_0x0061;
                case 9: goto L_0x0052;
                case 10: goto L_0x003f;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.String r3 = f5877l
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r17 = r1
            java.lang.String r1 = "Unknown key encountered in Device createFromJson "
            r0.append(r1)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            com.appboy.support.AppboyLogger.m5459w((java.lang.String) r3, (java.lang.String) r0)
            goto L_0x00d9
        L_0x003f:
            boolean r15 = r0.has(r3)
            if (r15 == 0) goto L_0x0089
            boolean r3 = r0.optBoolean(r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r17 = r1
            r13 = r3
            goto L_0x00d9
        L_0x0052:
            boolean r15 = r0.has(r3)
            if (r15 == 0) goto L_0x0089
            java.lang.String r3 = r0.optString(r3)
            r17 = r1
            r12 = r3
            goto L_0x00d9
        L_0x0061:
            boolean r15 = r0.has(r3)
            if (r15 == 0) goto L_0x0089
            r15 = 0
            boolean r3 = r0.optBoolean(r3, r15)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r17 = r1
            r11 = r3
            goto L_0x00d9
        L_0x0075:
            r15 = 0
            boolean r16 = r0.has(r3)
            if (r16 == 0) goto L_0x0089
            r10 = 1
            boolean r3 = r0.optBoolean(r3, r10)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r17 = r1
            r10 = r3
            goto L_0x00d9
        L_0x0089:
            r17 = r1
            goto L_0x00d9
        L_0x008c:
            r15 = 0
            java.lang.String r3 = r0.optString(r3)
            java.lang.String r3 = com.appboy.support.StringUtils.emptyToNull(r3)
            r17 = r1
            r6 = r3
            goto L_0x00d9
        L_0x0099:
            r15 = 0
            java.lang.String r3 = r0.optString(r3)
            java.lang.String r3 = com.appboy.support.StringUtils.emptyToNull(r3)
            r17 = r1
            r7 = r3
            goto L_0x00d9
        L_0x00a6:
            r15 = 0
            java.lang.String r3 = r0.optString(r3)
            java.lang.String r3 = com.appboy.support.StringUtils.emptyToNull(r3)
            r17 = r1
            r9 = r3
            goto L_0x00d9
        L_0x00b3:
            r15 = 0
            java.lang.String r3 = r0.optString(r3)
            java.lang.String r3 = com.appboy.support.StringUtils.emptyToNull(r3)
            r17 = r1
            r4 = r3
            goto L_0x00d9
        L_0x00c0:
            r15 = 0
            java.lang.String r3 = r0.optString(r3)
            java.lang.String r3 = com.appboy.support.StringUtils.emptyToNull(r3)
            r17 = r1
            r5 = r3
            goto L_0x00d9
        L_0x00cd:
            r15 = 0
            java.lang.String r3 = r0.optString(r3)
            java.lang.String r3 = com.appboy.support.StringUtils.emptyToNull(r3)
            r17 = r1
            r8 = r3
        L_0x00d9:
            int r14 = r14 + 1
            r0 = r20
            r1 = r17
            goto L_0x0012
        L_0x00e1:
            bo.app.o2$b r0 = new bo.app.o2$b
            r1 = r19
            r0.<init>(r1)
            bo.app.o2$b r0 = r0.mo6267a((java.lang.String) r4)
            bo.app.o2$b r0 = r0.mo6270b((java.lang.String) r5)
            bo.app.o2$b r0 = r0.mo6274e(r6)
            bo.app.o2$b r0 = r0.mo6273d(r7)
            bo.app.o2$b r0 = r0.mo6276g(r8)
            bo.app.o2$b r0 = r0.mo6275f(r9)
            bo.app.o2$b r0 = r0.mo6271c((java.lang.Boolean) r10)
            bo.app.o2$b r0 = r0.mo6269b((java.lang.Boolean) r11)
            bo.app.o2$b r0 = r0.mo6272c((java.lang.String) r12)
            bo.app.o2$b r0 = r0.mo6266a((java.lang.Boolean) r13)
            bo.app.o2 r0 = r0.mo6268a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C1651o2.m4543a(com.braze.configuration.BrazeConfigurationProvider, org.json.JSONObject):bo.app.o2");
    }

    /* renamed from: e */
    public boolean mo5991e() {
        return forJsonPut().length() == 0;
    }

    /* renamed from: v */
    public boolean mo6264v() {
        return forJsonPut().has(DeviceKey.NOTIFICATIONS_ENABLED.getKey());
    }

    /* renamed from: w */
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            m4544a(this.f5888k, jSONObject, DeviceKey.ANDROID_VERSION, this.f5878a);
            m4544a(this.f5888k, jSONObject, DeviceKey.CARRIER, this.f5879b);
            m4544a(this.f5888k, jSONObject, DeviceKey.MODEL, this.f5880c);
            m4544a(this.f5888k, jSONObject, DeviceKey.RESOLUTION, this.f5882e);
            m4544a(this.f5888k, jSONObject, DeviceKey.LOCALE, this.f5881d);
            m4544a(this.f5888k, jSONObject, DeviceKey.NOTIFICATIONS_ENABLED, this.f5884g);
            m4544a(this.f5888k, jSONObject, DeviceKey.IS_BACKGROUND_RESTRICTED, this.f5885h);
            if (!StringUtils.isNullOrBlank(this.f5886i)) {
                m4544a(this.f5888k, jSONObject, DeviceKey.GOOGLE_ADVERTISING_ID, this.f5886i);
            }
            Boolean bool = this.f5887j;
            if (bool != null) {
                m4544a(this.f5888k, jSONObject, DeviceKey.AD_TRACKING_ENABLED, bool);
            }
            if (!StringUtils.isNullOrBlank(this.f5883f)) {
                m4544a(this.f5888k, jSONObject, DeviceKey.TIMEZONE, this.f5883f);
            }
        } catch (JSONException e) {
            AppboyLogger.m5452e(f5877l, "Caught exception creating device Json.", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m4544a(BrazeConfigurationProvider brazeConfigurationProvider, JSONObject jSONObject, DeviceKey deviceKey, Object obj) {
        if (!brazeConfigurationProvider.getIsDeviceObjectAllowlistEnabled() || brazeConfigurationProvider.getDeviceObjectAllowlist().contains(deviceKey)) {
            jSONObject.putOpt(deviceKey.getKey(), obj);
            return;
        }
        String str = f5877l;
        AppboyLogger.m5457v(str, "Not adding device key <" + deviceKey + "> to export due to allowlist restrictions.");
    }
}
