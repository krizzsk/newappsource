package com.appsflyer.deeplink;

import android.app.Application;
import android.content.Context;
import com.appsflyer.AFDeepLinkManager;
import com.appsflyer.AFLogger;
import com.appsflyer.AdvertisingIdObject;
import com.appsflyer.AppsFlyerLibCore;
import com.appsflyer.BackgroundHttpTask;
import com.appsflyer.ServerParameters;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.EventDataCollector;
import com.appsflyer.internal.model.event.BackgroundEvent;
import com.appsflyer.internal.referrer.Payload;
import com.appsflyer.internal.referrer.Referrer;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DdlEvent extends BackgroundEvent {
    public static long LISTENER_TIMEOUT = TimeUnit.SECONDS.toMillis(3);
    public static String URL = "https://%sdlsdk.%s/v1.0/android/";
    private final JSONObject AFEvent = new JSONObject();
    private int addParams;
    private int context;
    private final List<Referrer> dateFormatUTC = new ArrayList();
    private final CountDownLatch getDataFormatter = new CountDownLatch(1);
    private int getRequestListener;
    private final EventDataCollector requestListener;
    private boolean urlString;

    /* renamed from: com.appsflyer.deeplink.DdlEvent$2 */
    public static /* synthetic */ class C20562 {
        public static final /* synthetic */ int[] values;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.appsflyer.internal.referrer.Referrer$State[] r0 = com.appsflyer.internal.referrer.Referrer.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                values = r0
                com.appsflyer.internal.referrer.Referrer$State r1 = com.appsflyer.internal.referrer.Referrer.State.FINISHED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = values     // Catch:{ NoSuchFieldError -> 0x001d }
                com.appsflyer.internal.referrer.Referrer$State r1 = com.appsflyer.internal.referrer.Referrer.State.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.deeplink.DdlEvent.C20562.<clinit>():void");
        }
    }

    public static /* synthetic */ void $$a(DdlEvent ddlEvent) {
        ArrayList arrayList = new ArrayList();
        for (Referrer referrer : AppsFlyerLibCore.getInstance().getReferrers()) {
            if (!(referrer == null || referrer.getState() == Referrer.State.NOT_STARTED)) {
                arrayList.add(referrer);
            }
        }
        ddlEvent.addParams = arrayList.size();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final Referrer referrer2 = (Referrer) it.next();
            int i = C20562.values[referrer2.getState().ordinal()];
            if (i == 1) {
                StringBuilder sb = new StringBuilder("[DDL] ");
                sb.append(referrer2.map.get("source"));
                sb.append(" referrer collected earlier");
                AFLogger.afDebugLog(sb.toString());
                ddlEvent.valueOf(referrer2);
            } else if (i == 2) {
                referrer2.addObserver(new Observer() {
                    public final void update(Observable observable, Object obj) {
                        StringBuilder sb = new StringBuilder("[DDL] ");
                        sb.append(referrer2.map.get("source"));
                        sb.append(" referrer collected via observer");
                        AFLogger.afDebugLog(sb.toString());
                        DdlEvent.this.valueOf((Referrer) observable);
                    }
                });
            }
        }
    }

    public DdlEvent(Context context2, EventDataCollector eventDataCollector) {
        super((String) null, URL, Boolean.FALSE, Boolean.TRUE, (Boolean) null, context2);
        this.requestListener = eventDataCollector;
    }

    private void AFDateFormat(DeepLinkResult deepLinkResult) {
        try {
            this.AFEvent.put(ServerParameters.STATUS, deepLinkResult.getStatus().toString());
            this.AFEvent.put(ServerParameters.TIMEOUT_VALUE, LISTENER_TIMEOUT);
        } catch (JSONException unused) {
        }
        this.requestListener.set(ServerParameters.DDL_METRICS, this.AFEvent.toString());
        AppsFlyerLibCore.getSharedPreferences(context()).edit().putBoolean(AFDeepLinkManager.DDL_SENT, true).apply();
        DeepLinkCallbacks.$$b(deepLinkResult);
    }

    public static void setUrl(Map<String, String> map) {
        for (Map.Entry next : map.entrySet()) {
            if (((String) next.getKey()).equals("dlsdk")) {
                URL = (String) next.getValue();
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00da A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void valueOf(android.content.Context r8) throws java.security.NoSuchAlgorithmException, java.security.InvalidKeyException {
        /*
            r7 = this;
            int r0 = r7.context
            r1 = 1
            int r0 = r0 + r1
            r7.context = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "[DDL] Preparing request "
            r0.<init>(r2)
            int r2 = r7.context
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.appsflyer.AFLogger.afDebugLog(r0)
            int r0 = r7.context
            if (r0 != r1) goto L_0x00ab
            com.appsflyer.AppsFlyerLibCore r0 = com.appsflyer.AppsFlyerLibCore.getInstance()
            java.util.Map<java.lang.String, java.lang.Object> r1 = r7.params
            boolean r2 = r0.isAppsFlyerFirstLaunch(r8)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.String r3 = "is_first"
            r1.put(r3, r2)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r7.params
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r3 = r3.getLanguage()
            r2.append(r3)
            java.lang.String r3 = "-"
            r2.append(r3)
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r3 = r3.getCountry()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "lang"
            r1.put(r3, r2)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r7.params
            java.lang.String r2 = android.os.Build.VERSION.RELEASE
            java.lang.String r3 = "os"
            r1.put(r3, r2)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r7.params
            java.lang.String r2 = android.os.Build.MODEL
            java.lang.String r3 = "type"
            r1.put(r3, r2)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r7.params
            java.lang.String r2 = r0.getAppsFlyerUID(r8)
            java.lang.String r3 = "request_id"
            r1.put(r3, r2)
            java.lang.String[] r0 = r0.sharingFilter
            if (r0 == 0) goto L_0x0084
            java.util.Map<java.lang.String, java.lang.Object> r1 = r7.params
            java.lang.String r2 = "sharing_filter"
            r1.put(r2, r0)
        L_0x0084:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.appsflyer.AdvertisingIdObject r0 = com.appsflyer.AdvertisingIdUtil.getGaid(r8, r0)
            java.util.Map r0 = r7.values((com.appsflyer.AdvertisingIdObject) r0)
            com.appsflyer.AdvertisingIdObject r1 = com.appsflyer.AdvertisingIdUtil.getOaid(r8)
            java.util.Map r1 = r7.values((com.appsflyer.AdvertisingIdObject) r1)
            if (r0 == 0) goto L_0x00a2
            java.util.Map<java.lang.String, java.lang.Object> r2 = r7.params
            java.lang.String r3 = "gaid"
            r2.put(r3, r0)
        L_0x00a2:
            if (r1 == 0) goto L_0x00ab
            java.util.Map<java.lang.String, java.lang.Object> r0 = r7.params
            java.lang.String r2 = "oaid"
            r0.put(r2, r1)
        L_0x00ab:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r7.params
            java.lang.String r1 = "yyyy-MM-dd'T'HH:mm:ss.SSS"
            java.text.SimpleDateFormat r1 = com.appsflyer.AFDateFormat.getDataFormatter(r1)
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = com.appsflyer.AFDateFormat.dateFormatUTC(r1, r2)
            java.lang.String r2 = "timestamp"
            r0.put(r2, r1)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r7.params
            int r1 = r7.context
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "request_count"
            r0.put(r3, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<com.appsflyer.internal.referrer.Referrer> r1 = r7.dateFormatUTC
            java.util.Iterator r1 = r1.iterator()
        L_0x00da:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x011a
            java.lang.Object r3 = r1.next()
            com.appsflyer.internal.referrer.Referrer r3 = (com.appsflyer.internal.referrer.Referrer) r3
            com.appsflyer.internal.referrer.Referrer$State r4 = r3.getState()
            com.appsflyer.internal.referrer.Referrer$State r5 = com.appsflyer.internal.referrer.Referrer.State.FINISHED
            if (r4 != r5) goto L_0x0113
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Map<java.lang.String, java.lang.Object> r5 = r3.map
            java.lang.String r6 = "referrer"
            java.lang.Object r5 = r5.get(r6)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x0113
            java.util.Map<java.lang.String, java.lang.Object> r3 = r3.map
            java.lang.String r6 = "source"
            java.lang.Object r3 = r3.get(r6)
            java.lang.String r3 = (java.lang.String) r3
            r4.put(r6, r3)
            java.lang.String r3 = "value"
            r4.put(r3, r5)
            goto L_0x0114
        L_0x0113:
            r4 = 0
        L_0x0114:
            if (r4 == 0) goto L_0x00da
            r0.add(r4)
            goto L_0x00da
        L_0x011a:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0127
            java.util.Map<java.lang.String, java.lang.Object> r1 = r7.params
            java.lang.String r3 = "referrers"
            r1.put(r3, r0)
        L_0x0127:
            java.lang.String r0 = r7.urlString()
            java.lang.String r0 = com.appsflyer.ServerConfigHandler.getUrl(r0)
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.net.Uri$Builder r0 = r0.buildUpon()
            java.lang.String r8 = r8.getPackageName()
            android.net.Uri$Builder r8 = r0.appendPath(r8)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r7.params
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r2 = "AppsFlyerKey"
            java.lang.String r1 = r1.getString(r2)
            byte[] r1 = r1.getBytes()
            java.lang.String r3 = "HmacSHA256"
            javax.crypto.Mac r4 = javax.crypto.Mac.getInstance(r3)
            javax.crypto.spec.SecretKeySpec r5 = new javax.crypto.spec.SecretKeySpec
            r5.<init>(r1, r3)
            r4.init(r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = r0.getString(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            byte[] r0 = r0.getBytes()
            byte[] r0 = r4.doFinal(r0)
            java.lang.String r0 = com.appsflyer.HashUtils.bytesToHex(r0)
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = "af_sig"
            android.net.Uri$Builder r8 = r8.appendQueryParameter(r1, r0)
            java.lang.String r0 = com.appsflyer.AppsFlyerLibCore.SERVER_BUILD_NUMBER
            java.lang.String r1 = "sdk_version"
            android.net.Uri$Builder r8 = r8.appendQueryParameter(r1, r0)
            android.net.Uri r8 = r8.build()
            java.lang.String r8 = r8.toString()
            r7.urlString(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.deeplink.DdlEvent.valueOf(android.content.Context):void");
    }

    public void start() {
        DeepLinkResult.Error error;
        AFLogger.afDebugLog("[DDL] start");
        FutureTask futureTask = new FutureTask(new Callable<DeepLinkResult>() {
            public final /* synthetic */ Object call() throws Exception {
                Application $$b = DdlEvent.this.context();
                DdlEvent.$$a(DdlEvent.this);
                DdlEvent.this.valueOf((Context) $$b);
                return DdlEvent.$$a(DdlEvent.this, $$b);
            }
        });
        new Thread(futureTask).start();
        try {
            AFDateFormat((DeepLinkResult) futureTask.get(LISTENER_TIMEOUT, TimeUnit.MILLISECONDS));
        } catch (InterruptedException | ExecutionException e) {
            AFLogger.afErrorLog("[DDL] Error occurred", e, true);
            if (e.getCause() instanceof IOException) {
                error = DeepLinkResult.Error.NETWORK;
            } else {
                error = DeepLinkResult.Error.UNEXPECTED;
            }
            AFDateFormat(new DeepLinkResult((DeepLink) null, error));
        } catch (TimeoutException unused) {
            StringBuilder sb = new StringBuilder("[DDL] Timeout, didn't manage to find deferred deep link after ");
            sb.append(this.context);
            sb.append(" attempt(s) within ");
            sb.append(LISTENER_TIMEOUT);
            sb.append(" milliseconds");
            AFLogger.afDebugLog(sb.toString());
            AFDateFormat(new DeepLinkResult((DeepLink) null, DeepLinkResult.Error.TIMEOUT));
        }
    }

    private Map<String, Object> values(final AdvertisingIdObject advertisingIdObject) {
        Boolean isLimitAdTracking;
        boolean z = false;
        if (!(advertisingIdObject == null || advertisingIdObject.getAdvertisingId() == null || ((isLimitAdTracking = advertisingIdObject.isLimitAdTracking()) != null && isLimitAdTracking.booleanValue()))) {
            z = true;
        }
        if (z) {
            return new HashMap<String, Object>() {
                {
                    put("type", "unhashed");
                    put("value", AdvertisingIdObject.this.getAdvertisingId());
                }
            };
        }
        return null;
    }

    private boolean values() {
        List list = (List) this.params.get(Payload.RFRS);
        if ((list != null ? list.size() : 0) >= this.addParams || this.params.containsKey(Payload.RFRS)) {
            return false;
        }
        return true;
    }

    private static boolean values(Referrer referrer) {
        Long l = (Long) referrer.map.get(Payload.CLICK_TS);
        if (l != null && System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l.longValue()) < TimeUnit.DAYS.toMillis(1)) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ DeepLinkResult $$a(DdlEvent ddlEvent, Context context2) throws IOException, JSONException, InterruptedException, NoSuchAlgorithmException, InvalidKeyException {
        DeepLink deepLink;
        while (true) {
            long currentTimeMillis = System.currentTimeMillis();
            if (ddlEvent.context == 1) {
                ddlEvent.AFEvent.put(ServerParameters.FROM_FG, currentTimeMillis - ddlEvent.requestListener.getLong(ServerParameters.FG_TS));
            }
            HttpURLConnection doInBackground = new BackgroundHttpTask(ddlEvent).doInBackground();
            JSONArray optJSONArray = ddlEvent.AFEvent.optJSONArray(ServerParameters.NET);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            optJSONArray.put(ddlEvent.context - 1, currentTimeMillis2 - currentTimeMillis);
            ddlEvent.AFEvent.put(ServerParameters.NET, optJSONArray);
            if (doInBackground.getResponseCode() == 200) {
                JSONObject jSONObject = new JSONObject(AppsFlyerLibCore.getInstance().readServerResponse(doInBackground));
                ddlEvent.urlString = jSONObject.optBoolean("is_second_ping", true);
                if (!jSONObject.optBoolean("found")) {
                    deepLink = null;
                } else {
                    deepLink = DeepLink.valueOf(jSONObject.optJSONObject("click_event"));
                    deepLink.$$b.put("is_deferred", true);
                }
                if (deepLink != null) {
                    return new DeepLinkResult(deepLink, (DeepLinkResult.Error) null);
                }
                if (ddlEvent.context <= 1 && ddlEvent.values() && ddlEvent.urlString) {
                    AFLogger.afDebugLog("[DDL] Waiting for referrers...");
                    ddlEvent.getDataFormatter.await();
                    ddlEvent.AFEvent.put(ServerParameters.RFR_WAIT, System.currentTimeMillis() - currentTimeMillis2);
                    if (ddlEvent.getRequestListener == ddlEvent.addParams) {
                        return new DeepLinkResult((DeepLink) null, (DeepLinkResult.Error) null);
                    }
                    ddlEvent.valueOf(context2);
                }
            } else {
                StringBuilder sb = new StringBuilder("[DDL] Error occurred. Server response code = ");
                sb.append(doInBackground.getResponseCode());
                AFLogger.afDebugLog(sb.toString());
                return new DeepLinkResult((DeepLink) null, DeepLinkResult.Error.HTTP_STATUS_CODE);
            }
        }
        return new DeepLinkResult((DeepLink) null, (DeepLinkResult.Error) null);
    }

    /* access modifiers changed from: private */
    public void valueOf(Referrer referrer) {
        if (values(referrer)) {
            this.dateFormatUTC.add(referrer);
            this.getDataFormatter.countDown();
            StringBuilder sb = new StringBuilder("[DDL] Added non-organic ");
            sb.append(referrer.getClass().getSimpleName());
            AFLogger.afDebugLog(sb.toString());
            return;
        }
        int i = this.getRequestListener + 1;
        this.getRequestListener = i;
        if (i == this.addParams) {
            this.getDataFormatter.countDown();
        }
    }
}
