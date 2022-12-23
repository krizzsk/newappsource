package p074e8;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.view.View;
import com.appsflyer.ServerParameters;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.LoggingBehavior;
import com.facebook.internal.C2436x;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import mf0.C24362h;
import org.json.JSONException;
import org.json.JSONObject;
import p009a8.C0115o;
import p009a8.C0124u;
import p135j8.C5398d;
import p262t8.C6606a;
import p304x.C7097r;

/* renamed from: e8.f */
public final class C4608f {

    /* renamed from: e */
    public static final String f15828e;

    /* renamed from: a */
    public final Handler f15829a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public final WeakReference<Activity> f15830b;

    /* renamed from: c */
    public Timer f15831c;

    /* renamed from: d */
    public String f15832d = null;

    /* renamed from: e8.f$a */
    public static final class C4609a {
        /* renamed from: a */
        public static GraphRequest m11928a(String str, AccessToken accessToken, String str2) {
            String str3;
            String str4 = GraphRequest.f8425j;
            String format = String.format(Locale.US, "%s/app_indexing", Arrays.copyOf(new Object[]{str2}, 1));
            C24362h.m61210e(format, "java.lang.String.format(locale, format, *args)");
            GraphRequest h = GraphRequest.C2281c.m6138h(accessToken, format, (JSONObject) null, (GraphRequest.C2280b) null);
            Bundle bundle = h.f8431d;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("tree", str);
            int i = C5398d.f17731a;
            Context a = C0115o.m210a();
            try {
                str3 = a.getPackageManager().getPackageInfo(a.getPackageName(), 0).versionName;
                C24362h.m61210e(str3, "{\n      val packageInfo = context.packageManager.getPackageInfo(context.packageName, 0)\n      packageInfo.versionName\n    }");
            } catch (PackageManager.NameNotFoundException unused) {
                str3 = "";
            }
            bundle.putString("app_version", str3);
            bundle.putString(ServerParameters.PLATFORM, MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
            bundle.putString("request_type", "app_indexing");
            if (C24362h.m61206a("app_indexing", "app_indexing")) {
                bundle.putString("device_session_id", C4599b.m11911a());
            }
            h.f8431d = bundle;
            h.mo11909j(new C4607e());
            return h;
        }
    }

    /* renamed from: e8.f$b */
    public static final class C4610b implements Callable<String> {

        /* renamed from: b */
        public final WeakReference<View> f15833b;

        public C4610b(View view) {
            this.f15833b = new WeakReference<>(view);
        }

        public final Object call() {
            View view = this.f15833b.get();
            if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                return "";
            }
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            view.draw(new Canvas(createBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
            String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            C24362h.m61210e(encodeToString, "encodeToString(outputStream.toByteArray(), Base64.NO_WRAP)");
            return encodeToString;
        }
    }

    /* renamed from: e8.f$c */
    public static final class C4611c extends TimerTask {

        /* renamed from: b */
        public final /* synthetic */ C4608f f15834b;

        public C4611c(C4608f fVar) {
            this.f15834b = fVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
            p074e8.C4608f.m11925a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x00dc, code lost:
            p074e8.C4608f.m11925a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
            return;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x007f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x00a4 */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0020 A[Catch:{ Exception -> 0x00dc }] */
        /* JADX WARNING: Removed duplicated region for block: B:67:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r8 = this;
                java.lang.Class<e8.f> r0 = p074e8.C4608f.class
                e8.f r1 = r8.f15834b     // Catch:{ Exception -> 0x00dc }
                boolean r2 = p262t8.C6606a.m15601b(r0)     // Catch:{ Exception -> 0x00dc }
                r3 = 0
                if (r2 == 0) goto L_0x000c
                goto L_0x0013
            L_0x000c:
                java.lang.ref.WeakReference<android.app.Activity> r1 = r1.f15830b     // Catch:{ all -> 0x000f }
                goto L_0x0014
            L_0x000f:
                r1 = move-exception
                p262t8.C6606a.m15600a(r0, r1)     // Catch:{ Exception -> 0x00dc }
            L_0x0013:
                r1 = r3
            L_0x0014:
                java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x00dc }
                android.app.Activity r1 = (android.app.Activity) r1     // Catch:{ Exception -> 0x00dc }
                android.view.View r2 = p135j8.C5398d.m13501b(r1)     // Catch:{ Exception -> 0x00dc }
                if (r1 == 0) goto L_0x00db
                if (r2 != 0) goto L_0x0024
                goto L_0x00db
            L_0x0024:
                java.lang.Class r1 = r1.getClass()     // Catch:{ Exception -> 0x00dc }
                java.lang.String r1 = r1.getSimpleName()     // Catch:{ Exception -> 0x00dc }
                e8.b r4 = p074e8.C4599b.f15801a     // Catch:{ Exception -> 0x00dc }
                java.lang.Class<e8.b> r4 = p074e8.C4599b.class
                boolean r5 = p262t8.C6606a.m15601b(r4)     // Catch:{ Exception -> 0x00dc }
                r6 = 0
                if (r5 == 0) goto L_0x0038
                goto L_0x0043
            L_0x0038:
                java.util.concurrent.atomic.AtomicBoolean r5 = p074e8.C4599b.f15807g     // Catch:{ all -> 0x003f }
                boolean r6 = r5.get()     // Catch:{ all -> 0x003f }
                goto L_0x0043
            L_0x003f:
                r5 = move-exception
                p262t8.C6606a.m15600a(r4, r5)     // Catch:{ Exception -> 0x00dc }
            L_0x0043:
                if (r6 != 0) goto L_0x0046
                return
            L_0x0046:
                java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x00dc }
                boolean r4 = mf0.C24362h.m61206a(r3, r4)     // Catch:{ Exception -> 0x00dc }
                java.lang.String r5 = ""
                if (r4 == 0) goto L_0x0056
                java.lang.String r0 = "CaptureViewHierarchy"
                p085f8.C4713c.m12011a(r0, r5)     // Catch:{ Exception -> 0x00dc }
                return
            L_0x0056:
                java.util.concurrent.FutureTask r4 = new java.util.concurrent.FutureTask     // Catch:{ Exception -> 0x00dc }
                e8.f$b r6 = new e8.f$b     // Catch:{ Exception -> 0x00dc }
                r6.<init>(r2)     // Catch:{ Exception -> 0x00dc }
                r4.<init>(r6)     // Catch:{ Exception -> 0x00dc }
                e8.f r6 = r8.f15834b     // Catch:{ Exception -> 0x00dc }
                boolean r7 = p262t8.C6606a.m15601b(r0)     // Catch:{ Exception -> 0x00dc }
                if (r7 == 0) goto L_0x0069
                goto L_0x0070
            L_0x0069:
                android.os.Handler r3 = r6.f15829a     // Catch:{ all -> 0x006c }
                goto L_0x0070
            L_0x006c:
                r6 = move-exception
                p262t8.C6606a.m15600a(r0, r6)     // Catch:{ Exception -> 0x00dc }
            L_0x0070:
                r3.post(r4)     // Catch:{ Exception -> 0x00dc }
                r6 = 1
                java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ Exception -> 0x007f }
                java.lang.Object r3 = r4.get(r6, r3)     // Catch:{ Exception -> 0x007f }
                java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x007f }
                r5 = r3
                goto L_0x0082
            L_0x007f:
                p074e8.C4608f.m11925a()     // Catch:{ Exception -> 0x00dc }
            L_0x0082:
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x00dc }
                r3.<init>()     // Catch:{ Exception -> 0x00dc }
                java.lang.String r4 = "screenname"
                r3.put(r4, r1)     // Catch:{ JSONException -> 0x00a4 }
                java.lang.String r1 = "screenshot"
                r3.put(r1, r5)     // Catch:{ JSONException -> 0x00a4 }
                org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00a4 }
                r1.<init>()     // Catch:{ JSONException -> 0x00a4 }
                org.json.JSONObject r2 = p085f8.C4714d.m12014c(r2)     // Catch:{ JSONException -> 0x00a4 }
                r1.put(r2)     // Catch:{ JSONException -> 0x00a4 }
                java.lang.String r2 = "view"
                r3.put(r2, r1)     // Catch:{ JSONException -> 0x00a4 }
                goto L_0x00a7
            L_0x00a4:
                p074e8.C4608f.m11925a()     // Catch:{ Exception -> 0x00dc }
            L_0x00a7:
                java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x00dc }
                java.lang.String r2 = "viewTree.toString()"
                mf0.C24362h.m61210e(r1, r2)     // Catch:{ Exception -> 0x00dc }
                e8.f r2 = r8.f15834b     // Catch:{ Exception -> 0x00dc }
                boolean r3 = p262t8.C6606a.m15601b(r0)     // Catch:{ Exception -> 0x00dc }
                if (r3 == 0) goto L_0x00ba
                goto L_0x00df
            L_0x00ba:
                r2.getClass()     // Catch:{ all -> 0x00d6 }
                boolean r3 = p262t8.C6606a.m15601b(r2)     // Catch:{ all -> 0x00d6 }
                if (r3 == 0) goto L_0x00c4
                goto L_0x00df
            L_0x00c4:
                java.util.concurrent.Executor r3 = p009a8.C0115o.m212c()     // Catch:{ all -> 0x00d1 }
                x.t r4 = new x.t     // Catch:{ all -> 0x00d1 }
                r4.<init>(r2, r1)     // Catch:{ all -> 0x00d1 }
                r3.execute(r4)     // Catch:{ all -> 0x00d1 }
                goto L_0x00df
            L_0x00d1:
                r1 = move-exception
                p262t8.C6606a.m15600a(r2, r1)     // Catch:{ all -> 0x00d6 }
                goto L_0x00df
            L_0x00d6:
                r1 = move-exception
                p262t8.C6606a.m15600a(r0, r1)     // Catch:{ Exception -> 0x00dc }
                goto L_0x00df
            L_0x00db:
                return
            L_0x00dc:
                p074e8.C4608f.m11925a()
            L_0x00df:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p074e8.C4608f.C4611c.run():void");
        }
    }

    static {
        String canonicalName = C4608f.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        f15828e = canonicalName;
    }

    public C4608f(Activity activity) {
        C24362h.m61211f(activity, "activity");
        this.f15830b = new WeakReference<>(activity);
    }

    /* renamed from: a */
    public static final /* synthetic */ String m11925a() {
        Class<C4608f> cls = C4608f.class;
        if (C6606a.m15601b(cls)) {
            return null;
        }
        try {
            return f15828e;
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return null;
        }
    }

    /* renamed from: b */
    public final void mo20133b(GraphRequest graphRequest, String str) {
        if (!C6606a.m15601b(this) && graphRequest != null) {
            try {
                C0124u c = graphRequest.mo11903c();
                try {
                    JSONObject jSONObject = c.f365b;
                    if (jSONObject != null) {
                        if (C24362h.m61206a(InneractiveMediationDefs.SHOW_HOUSE_AD_YES, jSONObject.optString(WidgetMessageParser.KEY_SUCCESS))) {
                            C2436x.C2437a aVar = C2436x.f8729d;
                            C2436x.C2437a.m6389a(LoggingBehavior.APP_EVENTS, f15828e, "Successfully send UI component tree to server");
                            this.f15832d = str;
                        }
                        if (jSONObject.has("is_app_indexing_enabled")) {
                            boolean z = jSONObject.getBoolean("is_app_indexing_enabled");
                            C4599b bVar = C4599b.f15801a;
                            Class<C4599b> cls = C4599b.class;
                            if (!C6606a.m15601b(cls)) {
                                try {
                                    C4599b.f15807g.set(z);
                                } catch (Throwable th) {
                                    C6606a.m15600a(cls, th);
                                }
                            }
                        }
                    } else {
                        C24362h.m61216k(c.f366c, "Error sending UI component tree to Facebook: ");
                    }
                } catch (JSONException unused) {
                }
            } catch (Throwable th2) {
                C6606a.m15600a(this, th2);
            }
        }
    }

    /* renamed from: c */
    public final void mo20134c() {
        if (!C6606a.m15601b(this)) {
            try {
                try {
                    C0115o.m212c().execute(new C7097r(10, this, new C4611c(this)));
                } catch (RejectedExecutionException unused) {
                }
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }
}
