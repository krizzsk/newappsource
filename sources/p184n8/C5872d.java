package p184n8;

import android.app.Activity;
import com.facebook.appevents.p047ml.ModelManager;
import com.facebook.internal.C2429s;
import com.facebook.internal.FetchedAppSettingsManager;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import mf0.C24362h;
import p009a8.C0115o;
import p135j8.C5396c;
import p184n8.C5873e;
import p262t8.C6606a;

/* renamed from: n8.d */
public final class C5872d {

    /* renamed from: a */
    public static final C5872d f18869a = new C5872d();

    /* renamed from: b */
    public static final AtomicBoolean f18870b = new AtomicBoolean(false);

    /* renamed from: c */
    public static final LinkedHashSet f18871c = new LinkedHashSet();

    /* renamed from: d */
    public static final LinkedHashSet f18872d = new LinkedHashSet();

    /* renamed from: c */
    public static final void m14323c(Activity activity) {
        Class<C5872d> cls = C5872d.class;
        if (!C6606a.m15601b(cls)) {
            try {
                C24362h.m61211f(activity, "activity");
                try {
                    if (f18870b.get()) {
                        C5869a aVar = C5869a.f18857a;
                        Class<C5869a> cls2 = C5869a.class;
                        boolean z = false;
                        if (!C6606a.m15601b(cls2)) {
                            try {
                                z = C5869a.f18862f;
                            } catch (Throwable th) {
                                C6606a.m15600a(cls2, th);
                            }
                        }
                        if (z && (!f18871c.isEmpty() || !f18872d.isEmpty())) {
                            HashMap hashMap = C5873e.f18873e;
                            C5873e.C5874a.m14327a(activity);
                            return;
                        }
                    }
                    HashMap hashMap2 = C5873e.f18873e;
                    C5873e.C5874a.m14328b(activity);
                } catch (Exception unused) {
                }
            } catch (Throwable th2) {
                C6606a.m15600a(cls, th2);
            }
        }
    }

    /* renamed from: a */
    public final void mo21747a() {
        String str;
        if (!C6606a.m15601b(this)) {
            try {
                FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f8592a;
                C2429s f = FetchedAppSettingsManager.m6264f(C0115o.m211b(), false);
                if (f != null && (str = f.f8719l) != null) {
                    mo21748b(str);
                    if ((!f18871c.isEmpty()) || (!f18872d.isEmpty())) {
                        ModelManager modelManager = ModelManager.f8546a;
                        File d = ModelManager.m6226d(ModelManager.Task.MTML_APP_EVENT_PREDICTION);
                        if (d != null) {
                            C5869a.m14305d(d);
                            WeakReference<Activity> weakReference = C5396c.f17730l;
                            Activity activity = null;
                            if (weakReference != null) {
                                activity = weakReference.get();
                            }
                            if (activity != null) {
                                m14323c(activity);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        r9 = r2.getJSONArray("eligible_for_prediction_events");
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21748b(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "eligible_for_prediction_events"
            java.lang.String r1 = "production_events"
            boolean r2 = p262t8.C6606a.m15601b(r8)
            if (r2 == 0) goto L_0x000b
            return
        L_0x000b:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x005e, all -> 0x005a }
            r2.<init>(r9)     // Catch:{ Exception -> 0x005e, all -> 0x005a }
            boolean r9 = r2.has(r1)     // Catch:{ Exception -> 0x005e, all -> 0x005a }
            java.lang.String r3 = "jsonArray.getString(i)"
            r4 = 0
            if (r9 == 0) goto L_0x0037
            org.json.JSONArray r9 = r2.getJSONArray(r1)     // Catch:{ Exception -> 0x005e, all -> 0x005a }
            int r1 = r9.length()     // Catch:{ Exception -> 0x005e, all -> 0x005a }
            if (r1 <= 0) goto L_0x0037
            r5 = 0
        L_0x0024:
            int r6 = r5 + 1
            java.util.LinkedHashSet r7 = f18871c     // Catch:{ Exception -> 0x005e, all -> 0x005a }
            java.lang.String r5 = r9.getString(r5)     // Catch:{ Exception -> 0x005e, all -> 0x005a }
            mf0.C24362h.m61210e(r5, r3)     // Catch:{ Exception -> 0x005e, all -> 0x005a }
            r7.add(r5)     // Catch:{ Exception -> 0x005e, all -> 0x005a }
            if (r6 < r1) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r5 = r6
            goto L_0x0024
        L_0x0037:
            boolean r9 = r2.has(r0)     // Catch:{ Exception -> 0x005e, all -> 0x005a }
            if (r9 == 0) goto L_0x005e
            org.json.JSONArray r9 = r2.getJSONArray(r0)     // Catch:{ Exception -> 0x005e, all -> 0x005a }
            int r0 = r9.length()     // Catch:{ Exception -> 0x005e, all -> 0x005a }
            if (r0 <= 0) goto L_0x005e
        L_0x0047:
            int r1 = r4 + 1
            java.util.LinkedHashSet r2 = f18872d     // Catch:{ Exception -> 0x005e, all -> 0x005a }
            java.lang.String r4 = r9.getString(r4)     // Catch:{ Exception -> 0x005e, all -> 0x005a }
            mf0.C24362h.m61210e(r4, r3)     // Catch:{ Exception -> 0x005e, all -> 0x005a }
            r2.add(r4)     // Catch:{ Exception -> 0x005e, all -> 0x005a }
            if (r1 < r0) goto L_0x0058
            goto L_0x005e
        L_0x0058:
            r4 = r1
            goto L_0x0047
        L_0x005a:
            r9 = move-exception
            p262t8.C6606a.m15600a(r8, r9)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p184n8.C5872d.mo21748b(java.lang.String):void");
    }
}
