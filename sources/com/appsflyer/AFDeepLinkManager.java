package com.appsflyer;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.amazonaws.http.HttpHeader;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.internal.referrer.Payload;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public class AFDeepLinkManager {
    public static final int $$a = ((int) TimeUnit.SECONDS.toMillis(2));
    public static String[] AFDateFormat = null;
    public static final String DDL_SENT = "ddl_sent";
    public static AFDeepLinkManager instance;
    public static Intent trampolineIntent;
    public static volatile boolean valueOf;
    public static String[] values;
    public String contains;
    public DeepLinkListener deepLinkListener;
    public List<List<String>> deepLinkSearchPaths = new ArrayList();
    public Map<String, String> parameters;

    /* access modifiers changed from: private */
    public static boolean $$a(String str) {
        if (AFDateFormat == null || str.contains("af_tranid=")) {
            return false;
        }
        StringBuilder sb = new StringBuilder("Validate if link ");
        sb.append(str);
        sb.append(" belongs to ESP domains: ");
        sb.append(Arrays.asList(AFDateFormat));
        AFLogger.afRDLog(sb.toString());
        try {
            return Arrays.asList(AFDateFormat).contains(new URL(str).getHost());
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    public static AFDeepLinkManager getInstance() {
        if (instance == null) {
            instance = new AFDeepLinkManager();
        }
        return instance;
    }

    public void collectIntentsFromActivities(Intent intent) {
        Uri uri;
        if (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) {
            uri = null;
        } else {
            uri = intent.getData();
        }
        if (uri != null && intent != trampolineIntent) {
            trampolineIntent = intent;
        }
    }

    public final void AFDateFormat(final Context context, final Map<String, Object> map, final Uri uri) {
        if ($$a(uri.toString())) {
            valueOf = true;
            AFExecutor instance2 = AFExecutor.getInstance();
            if (instance2.AFDateFormat == null) {
                instance2.AFDateFormat = Executors.newSingleThreadScheduledExecutor(instance2.valueOf);
            }
            instance2.AFDateFormat.execute(new Runnable() {
                private static Map<String, Object> valueOf(Uri uri) {
                    HashMap hashMap = new HashMap();
                    try {
                        StringBuilder sb = new StringBuilder("ESP deeplink resolving is started: ");
                        sb.append(uri.toString());
                        AFLogger.afDebugLog(sb.toString());
                        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(uri.toString()).openConnection()));
                        httpURLConnection.setInstanceFollowRedirects(false);
                        int i = AFDeepLinkManager.$$a;
                        httpURLConnection.setReadTimeout(i);
                        httpURLConnection.setConnectTimeout(i);
                        httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
                        httpURLConnection.setRequestProperty("af-esp", "6.1.4");
                        int responseCode = httpURLConnection.getResponseCode();
                        hashMap.put(ServerParameters.STATUS, Integer.valueOf(responseCode));
                        if (300 <= responseCode && responseCode <= 305) {
                            hashMap.put("res", httpURLConnection.getHeaderField(HttpHeader.LOCATION));
                        }
                        httpURLConnection.disconnect();
                        AFLogger.afDebugLog("ESP deeplink resolving is finished");
                    } catch (Throwable th) {
                        hashMap.put("error", th.getLocalizedMessage());
                        AFLogger.afErrorLog(th.getMessage(), th);
                    }
                    return hashMap;
                }

                public final void run() {
                    String str;
                    int i;
                    Uri uri;
                    String str2;
                    Integer num;
                    String str3;
                    long currentTimeMillis = System.currentTimeMillis();
                    String obj = uri.toString();
                    ArrayList arrayList = new ArrayList();
                    Integer num2 = null;
                    String str4 = null;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= 5) {
                            break;
                        }
                        Map<String, Object> valueOf2 = valueOf(Uri.parse(obj));
                        str2 = (String) valueOf2.get("res");
                        num = (Integer) valueOf2.get(ServerParameters.STATUS);
                        str3 = (String) valueOf2.get("error");
                        if (str2 == null || !AFDeepLinkManager.$$a(str2)) {
                            Integer num3 = num;
                            str4 = str3;
                            obj = str2;
                            num2 = num3;
                        } else {
                            if (i2 < 4) {
                                arrayList.add(str2);
                            }
                            i2++;
                            Integer num4 = num;
                            str4 = str3;
                            obj = str2;
                            num2 = num4;
                        }
                    }
                    Integer num32 = num;
                    str4 = str3;
                    obj = str2;
                    num2 = num32;
                    HashMap hashMap = new HashMap();
                    if (obj != null) {
                        str = obj;
                    } else {
                        str = "";
                    }
                    hashMap.put("res", str);
                    if (num2 != null) {
                        i = num2.intValue();
                    } else {
                        i = -1;
                    }
                    hashMap.put(ServerParameters.STATUS, Integer.valueOf(i));
                    if (str4 != null) {
                        hashMap.put("error", str4);
                    }
                    if (!arrayList.isEmpty()) {
                        hashMap.put("redirects", arrayList);
                    }
                    hashMap.put(Payload.LATENCY, Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    synchronized (map) {
                        map.put(ServerParameters.DEEP_LINK_RESOLVED, hashMap);
                        map.put(ServerParameters.DEEP_LINK, uri.toString());
                    }
                    AppsFlyerLibCore instance = AppsFlyerLibCore.getInstance();
                    Context context = context;
                    Map map = map;
                    if (obj != null) {
                        uri = Uri.parse(obj);
                    } else {
                        uri = uri;
                    }
                    instance.handleDeepLinkCallback(context, map, uri);
                    AFDeepLinkManager.valueOf = false;
                }
            });
        } else {
            AppsFlyerLibCore.getInstance().handleDeepLinkCallback(context, map, uri);
        }
        trampolineIntent = null;
    }

    private Uri AFDateFormat(Object obj, Iterator<String> it) {
        while (obj != JSONObject.NULL) {
            if (!it.hasNext()) {
                Uri parse = Uri.parse(obj.toString());
                if (parse == null || parse.getScheme() == null || parse.getHost() == null) {
                    return null;
                }
                return parse;
            }
            try {
                obj = new JSONObject(obj.toString()).get(it.next());
            } catch (JSONException unused) {
                return null;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x006e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean AFDateFormat(android.content.Intent r9, android.content.Context r10, java.util.Map<java.lang.String, java.lang.Object> r11) {
        /*
            r8 = this;
            java.lang.String r0 = "android.intent.action.VIEW"
            r1 = 0
            if (r9 == 0) goto L_0x0014
            java.lang.String r2 = r9.getAction()
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0014
            android.net.Uri r2 = r9.getData()
            goto L_0x0015
        L_0x0014:
            r2 = r1
        L_0x0015:
            android.content.Intent r3 = trampolineIntent
            if (r3 == 0) goto L_0x0028
            java.lang.String r4 = r3.getAction()
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0028
            android.net.Uri r0 = r3.getData()
            goto L_0x0029
        L_0x0028:
            r0 = r1
        L_0x0029:
            android.os.Bundle r3 = r9.getExtras()
            java.util.List<java.util.List<java.lang.String>> r4 = r8.deepLinkSearchPaths
            if (r4 == 0) goto L_0x008f
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x008f
            if (r3 != 0) goto L_0x003a
            goto L_0x008f
        L_0x003a:
            java.util.List<java.util.List<java.lang.String>> r4 = r8.deepLinkSearchPaths
            java.util.Iterator r4 = r4.iterator()
        L_0x0040:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x008f
            java.lang.Object r5 = r4.next()
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto L_0x0050
        L_0x004e:
            r6 = r1
            goto L_0x006c
        L_0x0050:
            java.util.Iterator r6 = r5.iterator()
            boolean r7 = r6.hasNext()
            if (r7 != 0) goto L_0x005b
            goto L_0x004e
        L_0x005b:
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r7 = r3.getString(r7)
            if (r7 != 0) goto L_0x0068
            goto L_0x004e
        L_0x0068:
            android.net.Uri r6 = r8.AFDateFormat(r7, r6)
        L_0x006c:
            if (r6 == 0) goto L_0x0040
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Found deeplink in push payload at "
            r1.<init>(r3)
            java.lang.String r3 = r5.toString()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.appsflyer.AFLogger.afDebugLog(r1)
            java.util.Map r1 = com.appsflyer.AppsFlyerLibCore.values((java.util.Map<java.lang.String, java.lang.Object>) r11)
            java.util.List<java.util.List<java.lang.String>> r3 = r8.deepLinkSearchPaths
            java.lang.String r4 = "payloadKey"
            r1.put(r4, r3)
            r1 = r6
        L_0x008f:
            r3 = 1
            java.lang.String r4 = " w/af_consumed"
            r5 = 0
            java.lang.String r6 = "af_consumed"
            if (r2 == 0) goto L_0x00c1
            boolean r0 = r9.hasExtra(r6)
            if (r0 != 0) goto L_0x00a8
            long r0 = java.lang.System.currentTimeMillis()
            r9.putExtra(r6, r0)
            r8.AFDateFormat((android.content.Context) r10, (java.util.Map<java.lang.String, java.lang.Object>) r11, (android.net.Uri) r2)
            return r3
        L_0x00a8:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "skipping re-use of previously consumed deep link: "
            r9.<init>(r10)
            java.lang.String r10 = r2.toString()
            r9.append(r10)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            com.appsflyer.AFLogger.afInfoLog(r9)
            return r5
        L_0x00c1:
            if (r0 == 0) goto L_0x00f1
            android.content.Intent r9 = trampolineIntent
            boolean r9 = r9.hasExtra(r6)
            if (r9 != 0) goto L_0x00d8
            android.content.Intent r9 = trampolineIntent
            long r1 = java.lang.System.currentTimeMillis()
            r9.putExtra(r6, r1)
            r8.AFDateFormat((android.content.Context) r10, (java.util.Map<java.lang.String, java.lang.Object>) r11, (android.net.Uri) r0)
            return r3
        L_0x00d8:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "skipping re-use of previously consumed trampoline deep link: "
            r9.<init>(r10)
            java.lang.String r10 = r0.toString()
            r9.append(r10)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            com.appsflyer.AFLogger.afInfoLog(r9)
            return r5
        L_0x00f1:
            if (r1 == 0) goto L_0x011d
            boolean r0 = r9.hasExtra(r6)
            if (r0 != 0) goto L_0x0104
            long r4 = java.lang.System.currentTimeMillis()
            r9.putExtra(r6, r4)
            r8.AFDateFormat((android.content.Context) r10, (java.util.Map<java.lang.String, java.lang.Object>) r11, (android.net.Uri) r1)
            return r3
        L_0x0104:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "skipping re-use of previously consumed deep link from push: "
            r9.<init>(r10)
            java.lang.String r10 = r1.toString()
            r9.append(r10)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            com.appsflyer.AFLogger.afInfoLog(r9)
            return r5
        L_0x011d:
            java.lang.String r9 = "No deep link detected"
            com.appsflyer.AFLogger.afDebugLog(r9)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AFDeepLinkManager.AFDateFormat(android.content.Intent, android.content.Context, java.util.Map):boolean");
    }
}
