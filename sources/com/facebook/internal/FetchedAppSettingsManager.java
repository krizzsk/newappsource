package com.facebook.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import mf0.C24362h;
import org.json.JSONObject;
import p009a8.C0115o;
import p583jk.C17875h;
import p988j$.util.concurrent.ConcurrentHashMap;

public final class FetchedAppSettingsManager {

    /* renamed from: a */
    public static final FetchedAppSettingsManager f8592a = new FetchedAppSettingsManager();

    /* renamed from: b */
    public static final List<String> f8593b = C17875h.m44281E("supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting");

    /* renamed from: c */
    public static final ConcurrentHashMap f8594c = new ConcurrentHashMap();

    /* renamed from: d */
    public static final AtomicReference<FetchAppSettingState> f8595d = new AtomicReference<>(FetchAppSettingState.NOT_LOADED);

    /* renamed from: e */
    public static final ConcurrentLinkedQueue<C2371a> f8596e = new ConcurrentLinkedQueue<>();

    /* renamed from: f */
    public static boolean f8597f;

    @Metadata(mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/facebook/internal/FetchedAppSettingsManager$FetchAppSettingState;", "", "(Ljava/lang/String;I)V", "NOT_LOADED", "LOADING", "SUCCESS", "ERROR", "facebook-core_release"}, mo59061k = 1, mo59062mv = {1, 5, 1}, mo59064xi = 48)
    public enum FetchAppSettingState {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR
    }

    /* renamed from: com.facebook.internal.FetchedAppSettingsManager$a */
    public interface C2371a {
        void onError();

        void onSuccess();
    }

    /* renamed from: a */
    public static JSONObject m6260a() {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f8593b);
        bundle.putString("fields", TextUtils.join(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, arrayList));
        String str = GraphRequest.f8425j;
        GraphRequest g = GraphRequest.C2281c.m6137g((AccessToken) null, "app", (GraphRequest.C2280b) null);
        g.f8436i = true;
        g.f8431d = bundle;
        JSONObject jSONObject = g.mo11903c().f367d;
        if (jSONObject == null) {
            return new JSONObject();
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static final C2429s m6261b(String str) {
        return (C2429s) f8594c.get(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006c  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m6262c() {
        /*
            android.content.Context r0 = p009a8.C0115o.m210a()
            java.lang.String r1 = p009a8.C0115o.m211b()
            boolean r2 = com.facebook.internal.C2397f0.m6292A(r1)
            if (r2 == 0) goto L_0x001b
            java.util.concurrent.atomic.AtomicReference<com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState> r0 = f8595d
            com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState r1 = com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.ERROR
            r0.set(r1)
            com.facebook.internal.FetchedAppSettingsManager r0 = f8592a
            r0.mo12533e()
            return
        L_0x001b:
            j$.util.concurrent.ConcurrentHashMap r2 = f8594c
            boolean r2 = r2.containsKey(r1)
            if (r2 == 0) goto L_0x0030
            java.util.concurrent.atomic.AtomicReference<com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState> r0 = f8595d
            com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState r1 = com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.SUCCESS
            r0.set(r1)
            com.facebook.internal.FetchedAppSettingsManager r0 = f8592a
            r0.mo12533e()
            return
        L_0x0030:
            java.util.concurrent.atomic.AtomicReference<com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState> r2 = f8595d
            com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState r3 = com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.NOT_LOADED
            com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState r4 = com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.LOADING
        L_0x0036:
            boolean r5 = r2.compareAndSet(r3, r4)
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x0040
            r2 = 1
            goto L_0x0047
        L_0x0040:
            java.lang.Object r5 = r2.get()
            if (r5 == r3) goto L_0x0036
            r2 = 0
        L_0x0047:
            if (r2 != 0) goto L_0x0063
            java.util.concurrent.atomic.AtomicReference<com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState> r2 = f8595d
            com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState r3 = com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.ERROR
            com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState r4 = com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.LOADING
        L_0x004f:
            boolean r5 = r2.compareAndSet(r3, r4)
            if (r5 == 0) goto L_0x0057
            r2 = 1
            goto L_0x005e
        L_0x0057:
            java.lang.Object r5 = r2.get()
            if (r5 == r3) goto L_0x004f
            r2 = 0
        L_0x005e:
            if (r2 == 0) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            r2 = 0
            goto L_0x0064
        L_0x0063:
            r2 = 1
        L_0x0064:
            if (r2 != 0) goto L_0x006c
            com.facebook.internal.FetchedAppSettingsManager r0 = f8592a
            r0.mo12533e()
            return
        L_0x006c:
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r7] = r1
            java.lang.String r3 = "com.facebook.internal.APP_SETTINGS.%s"
            java.lang.String r4 = "java.lang.String.format(format, *args)"
            java.lang.String r2 = p379.C13555b.m33971j(r2, r6, r3, r4)
            java.util.concurrent.Executor r3 = p009a8.C0115o.m212c()
            androidx.camera.camera2.internal.d r4 = new androidx.camera.camera2.internal.d
            r4.<init>(r6, r0, r2, r1)
            r3.execute(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.FetchedAppSettingsManager.m6262c():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0083 A[LOOP:0: B:6:0x0025->B:23:0x0083, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0208 A[LOOP:1: B:53:0x0134->B:94:0x0208, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0076 A[EDGE_INSN: B:97:0x0076->B:22:0x0076 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0210 A[EDGE_INSN: B:98:0x0210->B:95:0x0210 ?: BREAK  , SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.facebook.internal.C2429s m6263d(java.lang.String r33, org.json.JSONObject r34) {
        /*
            r0 = r33
            r1 = r34
            java.lang.String r2 = "applicationId"
            mf0.C24362h.m61211f(r0, r2)
            java.lang.String r2 = "android_sdk_error_categories"
            org.json.JSONArray r2 = r1.optJSONArray(r2)
            r3 = 1
            java.lang.String r6 = "name"
            if (r2 != 0) goto L_0x0018
            r2 = 1
            r5 = 0
            goto L_0x009c
        L_0x0018:
            int r7 = r2.length()
            if (r7 <= 0) goto L_0x0088
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x0025:
            int r15 = r8 + 1
            org.json.JSONObject r8 = r2.optJSONObject(r8)
            if (r8 != 0) goto L_0x002e
            goto L_0x0034
        L_0x002e:
            java.lang.String r4 = r8.optString(r6)
            if (r4 != 0) goto L_0x0036
        L_0x0034:
            r5 = 0
            goto L_0x0049
        L_0x0036:
            java.lang.String r5 = "other"
            boolean r5 = uh0.C25081h.m62830A(r4, r5, r3)
            java.lang.String r3 = "recovery_message"
            if (r5 == 0) goto L_0x004d
            r5 = 0
            java.lang.String r12 = r8.optString(r3, r5)
            java.util.HashMap r9 = com.facebook.internal.C2421n.C2422a.m6374c(r8)
        L_0x0049:
            r17 = r2
            r2 = 1
            goto L_0x0074
        L_0x004d:
            java.lang.String r5 = "transient"
            r17 = r2
            r2 = 1
            boolean r5 = uh0.C25081h.m62830A(r4, r5, r2)
            if (r5 == 0) goto L_0x0063
            r5 = 0
            java.lang.String r13 = r8.optString(r3, r5)
            java.util.HashMap r10 = com.facebook.internal.C2421n.C2422a.m6374c(r8)
            goto L_0x0074
        L_0x0063:
            java.lang.String r5 = "login_recoverable"
            boolean r4 = uh0.C25081h.m62830A(r4, r5, r2)
            if (r4 == 0) goto L_0x0074
            r4 = 0
            java.lang.String r14 = r8.optString(r3, r4)
            java.util.HashMap r11 = com.facebook.internal.C2421n.C2422a.m6374c(r8)
        L_0x0074:
            if (r15 < r7) goto L_0x0083
            r19 = r9
            r20 = r10
            r21 = r11
            r22 = r12
            r23 = r13
            r24 = r14
            goto L_0x0095
        L_0x0083:
            r8 = r15
            r2 = r17
            r3 = 1
            goto L_0x0025
        L_0x0088:
            r2 = 1
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
        L_0x0095:
            com.facebook.internal.n r5 = new com.facebook.internal.n
            r18 = r5
            r18.<init>(r19, r20, r21, r22, r23, r24)
        L_0x009c:
            if (r5 != 0) goto L_0x00a4
            com.facebook.internal.n$a r3 = com.facebook.internal.C2421n.f8691d
            com.facebook.internal.n r5 = r3.mo12591a()
        L_0x00a4:
            r23 = r5
            java.lang.String r3 = "app_events_feature_bitmask"
            r4 = 0
            int r3 = r1.optInt(r3, r4)
            r4 = r3 & 8
            if (r4 == 0) goto L_0x00b4
            r22 = 1
            goto L_0x00b6
        L_0x00b4:
            r22 = 0
        L_0x00b6:
            r4 = r3 & 16
            if (r4 == 0) goto L_0x00bd
            r26 = 1
            goto L_0x00bf
        L_0x00bd:
            r26 = 0
        L_0x00bf:
            r3 = r3 & 32
            if (r3 == 0) goto L_0x00c6
            r27 = 1
            goto L_0x00c8
        L_0x00c6:
            r27 = 0
        L_0x00c8:
            java.lang.String r2 = "auto_event_mapping_android"
            org.json.JSONArray r28 = r1.optJSONArray(r2)
            if (r28 == 0) goto L_0x00e5
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r5 = 0
            boolean r2 = mf0.C24362h.m61206a(r5, r2)
            if (r2 == 0) goto L_0x00e6
            f8.c r2 = p085f8.C4713c.f15999a
            java.lang.String r2 = r28.toString()
            java.lang.String r3 = "OnReceiveMapping"
            p085f8.C4713c.m12011a(r3, r2)
            goto L_0x00e6
        L_0x00e5:
            r5 = 0
        L_0x00e6:
            com.facebook.internal.s r2 = new com.facebook.internal.s
            java.lang.String r3 = "supports_implicit_sdk_logging"
            r4 = 0
            boolean r17 = r1.optBoolean(r3, r4)
            java.lang.String r3 = "gdpv4_nux_content"
            java.lang.String r7 = ""
            java.lang.String r3 = r1.optString(r3, r7)
            java.lang.String r7 = "settingsJSON.optString(APP_SETTING_NUX_CONTENT, \"\")"
            mf0.C24362h.m61210e(r3, r7)
            java.lang.String r7 = "gdpv4_nux_enabled"
            r1.optBoolean(r7, r4)
            r4 = 60
            java.lang.String r7 = "app_events_session_timeout"
            int r19 = r1.optInt(r7, r4)
            com.facebook.internal.SmartLoginOption$a r4 = com.facebook.internal.SmartLoginOption.Companion
            java.lang.String r7 = "seamless_login"
            long r7 = r1.optLong(r7)
            r4.getClass()
            java.util.EnumSet r20 = com.facebook.internal.SmartLoginOption.C2372a.m6266a(r7)
            java.lang.String r4 = "android_dialog_configs"
            org.json.JSONObject r4 = r1.optJSONObject(r4)
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            if (r4 == 0) goto L_0x0210
            java.lang.String r8 = "data"
            org.json.JSONArray r4 = r4.optJSONArray(r8)
            if (r4 == 0) goto L_0x0210
            int r8 = r4.length()
            if (r8 <= 0) goto L_0x0210
            r9 = 0
        L_0x0134:
            int r10 = r9 + 1
            org.json.JSONObject r9 = r4.optJSONObject(r9)
            java.lang.String r11 = "dialogConfigData.optJSONObject(i)"
            mf0.C24362h.m61210e(r9, r11)
            java.lang.String r11 = r9.optString(r6)
            boolean r12 = com.facebook.internal.C2397f0.m6292A(r11)
            if (r12 == 0) goto L_0x014f
        L_0x0149:
            r16 = r4
            r18 = r6
            goto L_0x01ea
        L_0x014f:
            java.lang.String r12 = "dialogNameWithFeature"
            mf0.C24362h.m61210e(r11, r12)
            java.lang.String r12 = "|"
            java.lang.String[] r12 = new java.lang.String[]{r12}
            r13 = 6
            r14 = 0
            java.util.List r11 = kotlin.text.C24179b.m60577Y(r11, r12, r14, r13)
            int r12 = r11.size()
            r13 = 2
            if (r12 == r13) goto L_0x0169
            goto L_0x0149
        L_0x0169:
            java.lang.Object r12 = kotlin.collections.C23825c.m58513j0(r11)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r11 = kotlin.collections.C23825c.m58522s0(r11)
            java.lang.String r11 = (java.lang.String) r11
            boolean r13 = com.facebook.internal.C2397f0.m6292A(r12)
            if (r13 != 0) goto L_0x0149
            boolean r13 = com.facebook.internal.C2397f0.m6292A(r11)
            if (r13 == 0) goto L_0x0182
            goto L_0x0149
        L_0x0182:
            java.lang.String r13 = "url"
            java.lang.String r13 = r9.optString(r13)
            boolean r15 = com.facebook.internal.C2397f0.m6292A(r13)
            if (r15 != 0) goto L_0x0192
            android.net.Uri.parse(r13)
        L_0x0192:
            java.lang.String r13 = "versions"
            org.json.JSONArray r9 = r9.optJSONArray(r13)
            if (r9 == 0) goto L_0x01de
            int r13 = r9.length()
            int[] r15 = new int[r13]
            if (r13 <= 0) goto L_0x01d8
            r5 = 0
        L_0x01a4:
            int r14 = r5 + 1
            r16 = r4
            r4 = -1
            r18 = r6
            int r6 = r9.optInt(r5, r4)
            if (r6 != r4) goto L_0x01cc
            java.lang.String r4 = r9.optString(r5)
            boolean r24 = com.facebook.internal.C2397f0.m6292A(r4)
            if (r24 != 0) goto L_0x01cc
            java.lang.String r6 = "versionString"
            mf0.C24362h.m61210e(r4, r6)     // Catch:{ NumberFormatException -> 0x01c6 }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x01c6 }
            goto L_0x01cb
        L_0x01c6:
            com.facebook.internal.f0 r4 = com.facebook.internal.C2397f0.f8630a
            a8.o r4 = p009a8.C0115o.f331a
            r4 = -1
        L_0x01cb:
            r6 = r4
        L_0x01cc:
            r15[r5] = r6
            if (r14 < r13) goto L_0x01d1
            goto L_0x01dc
        L_0x01d1:
            r5 = r14
            r4 = r16
            r6 = r18
            r14 = 0
            goto L_0x01a4
        L_0x01d8:
            r16 = r4
            r18 = r6
        L_0x01dc:
            r5 = r15
            goto L_0x01e3
        L_0x01de:
            r16 = r4
            r18 = r6
            r5 = 0
        L_0x01e3:
            com.facebook.internal.s$a r4 = new com.facebook.internal.s$a
            r4.<init>(r12, r11, r5)
            r5 = r4
            goto L_0x01eb
        L_0x01ea:
            r5 = 0
        L_0x01eb:
            if (r5 != 0) goto L_0x01ee
            goto L_0x0205
        L_0x01ee:
            java.lang.String r4 = r5.f8721a
            java.lang.Object r6 = r7.get(r4)
            java.util.Map r6 = (java.util.Map) r6
            if (r6 != 0) goto L_0x0200
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            r7.put(r4, r6)
        L_0x0200:
            java.lang.String r4 = r5.f8722b
            r6.put(r4, r5)
        L_0x0205:
            if (r10 < r8) goto L_0x0208
            goto L_0x0210
        L_0x0208:
            r9 = r10
            r4 = r16
            r6 = r18
            r5 = 0
            goto L_0x0134
        L_0x0210:
            java.lang.String r4 = "smart_login_bookmark_icon_url"
            java.lang.String r4 = r1.optString(r4)
            r24 = r4
            java.lang.String r5 = "settingsJSON.optString(SMART_LOGIN_BOOKMARK_ICON_URL)"
            mf0.C24362h.m61210e(r4, r5)
            java.lang.String r4 = "smart_login_menu_icon_url"
            java.lang.String r4 = r1.optString(r4)
            r25 = r4
            java.lang.String r5 = "settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL)"
            mf0.C24362h.m61210e(r4, r5)
            java.lang.String r4 = "sdk_update_message"
            java.lang.String r4 = r1.optString(r4)
            r29 = r4
            java.lang.String r5 = "settingsJSON.optString(SDK_UPDATE_MESSAGE)"
            mf0.C24362h.m61210e(r4, r5)
            java.lang.String r4 = "aam_rules"
            java.lang.String r30 = r1.optString(r4)
            java.lang.String r4 = "suggested_events_setting"
            java.lang.String r31 = r1.optString(r4)
            java.lang.String r4 = "restrictive_data_filter_params"
            java.lang.String r32 = r1.optString(r4)
            r16 = r2
            r18 = r3
            r21 = r7
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            j$.util.concurrent.ConcurrentHashMap r1 = f8594c
            r1.put(r0, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.FetchedAppSettingsManager.m6263d(java.lang.String, org.json.JSONObject):com.facebook.internal.s");
    }

    /* renamed from: f */
    public static final C2429s m6264f(String str, boolean z) {
        C24362h.m61211f(str, "applicationId");
        if (!z) {
            ConcurrentHashMap concurrentHashMap = f8594c;
            if (concurrentHashMap.containsKey(str)) {
                return (C2429s) concurrentHashMap.get(str);
            }
        }
        FetchedAppSettingsManager fetchedAppSettingsManager = f8592a;
        fetchedAppSettingsManager.getClass();
        C2429s d = m6263d(str, m6260a());
        if (C24362h.m61206a(str, C0115o.m211b())) {
            f8595d.set(FetchAppSettingState.SUCCESS);
            fetchedAppSettingsManager.mo12533e();
        }
        return d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0060, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo12533e() {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.concurrent.atomic.AtomicReference<com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState> r0 = f8595d     // Catch:{ all -> 0x0061 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0061 }
            com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState r0 = (com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState) r0     // Catch:{ all -> 0x0061 }
            com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState r1 = com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.NOT_LOADED     // Catch:{ all -> 0x0061 }
            if (r1 == r0) goto L_0x005f
            com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState r1 = com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.LOADING     // Catch:{ all -> 0x0061 }
            if (r1 != r0) goto L_0x0012
            goto L_0x005f
        L_0x0012:
            java.lang.String r1 = p009a8.C0115o.m211b()     // Catch:{ all -> 0x0061 }
            j$.util.concurrent.ConcurrentHashMap r2 = f8594c     // Catch:{ all -> 0x0061 }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ all -> 0x0061 }
            com.facebook.internal.s r1 = (com.facebook.internal.C2429s) r1     // Catch:{ all -> 0x0061 }
            android.os.Handler r2 = new android.os.Handler     // Catch:{ all -> 0x0061 }
            android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x0061 }
            r2.<init>(r3)     // Catch:{ all -> 0x0061 }
            com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState r3 = com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.ERROR     // Catch:{ all -> 0x0061 }
            if (r3 != r0) goto L_0x0045
        L_0x002b:
            java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.FetchedAppSettingsManager$a> r0 = f8596e     // Catch:{ all -> 0x0061 }
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x0061 }
            if (r1 != 0) goto L_0x0043
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0061 }
            com.facebook.internal.FetchedAppSettingsManager$a r0 = (com.facebook.internal.FetchedAppSettingsManager.C2371a) r0     // Catch:{ all -> 0x0061 }
            androidx.appcompat.widget.i1 r1 = new androidx.appcompat.widget.i1     // Catch:{ all -> 0x0061 }
            r3 = 7
            r1.<init>(r0, r3)     // Catch:{ all -> 0x0061 }
            r2.post(r1)     // Catch:{ all -> 0x0061 }
            goto L_0x002b
        L_0x0043:
            monitor-exit(r5)
            return
        L_0x0045:
            java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.FetchedAppSettingsManager$a> r0 = f8596e     // Catch:{ all -> 0x0061 }
            boolean r3 = r0.isEmpty()     // Catch:{ all -> 0x0061 }
            if (r3 != 0) goto L_0x005d
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0061 }
            com.facebook.internal.FetchedAppSettingsManager$a r0 = (com.facebook.internal.FetchedAppSettingsManager.C2371a) r0     // Catch:{ all -> 0x0061 }
            x.t r3 = new x.t     // Catch:{ all -> 0x0061 }
            r4 = 6
            r3.<init>(r4, r0, r1)     // Catch:{ all -> 0x0061 }
            r2.post(r3)     // Catch:{ all -> 0x0061 }
            goto L_0x0045
        L_0x005d:
            monitor-exit(r5)
            return
        L_0x005f:
            monitor-exit(r5)
            return
        L_0x0061:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.FetchedAppSettingsManager.mo12533e():void");
    }
}
