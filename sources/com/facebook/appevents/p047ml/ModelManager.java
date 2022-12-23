package com.facebook.appevents.p047ml;

import android.os.Bundle;
import android.text.TextUtils;
import cf0.C21136j;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import mf0.C24362h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p135j8.C5401f;
import p148k8.C5521a;
import p148k8.C5523b;
import p148k8.C5524c;
import p148k8.C5526e;
import p262t8.C6606a;
import p583jk.C17875h;
import p584jl.C17885a;
import p988j$.util.concurrent.ConcurrentHashMap;
import rf0.C24805g;
import rf0.C24806h;
import uh0.C25081h;

/* renamed from: com.facebook.appevents.ml.ModelManager */
public final class ModelManager {

    /* renamed from: a */
    public static final ModelManager f8546a = new ModelManager();

    /* renamed from: b */
    public static final ConcurrentHashMap f8547b = new ConcurrentHashMap();

    /* renamed from: c */
    public static final List<String> f8548c = C17875h.m44281E(InneractiveMediationNameConsts.OTHER, "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout");

    /* renamed from: d */
    public static final List<String> f8549d = C17875h.m44281E("none", "address", "health");

    @Metadata(mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, mo59060d2 = {"Lcom/facebook/appevents/ml/ModelManager$Task;", "", "(Ljava/lang/String;I)V", "toKey", "", "toUseCase", "MTML_INTEGRITY_DETECT", "MTML_APP_EVENT_PREDICTION", "facebook-core_release"}, mo59061k = 1, mo59062mv = {1, 5, 1}, mo59064xi = 48)
    /* renamed from: com.facebook.appevents.ml.ModelManager$Task */
    public enum Task {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        /* renamed from: com.facebook.appevents.ml.ModelManager$Task$a */
        public /* synthetic */ class C2344a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f8550a = null;

            static {
                int[] iArr = new int[Task.values().length];
                iArr[Task.MTML_INTEGRITY_DETECT.ordinal()] = 1;
                iArr[Task.MTML_APP_EVENT_PREDICTION.ordinal()] = 2;
                f8550a = iArr;
            }
        }

        public final String toKey() {
            int i = C2344a.f8550a[ordinal()];
            if (i == 1) {
                return "integrity_detect";
            }
            if (i == 2) {
                return "app_event_pred";
            }
            throw new NoWhenBranchMatchedException();
        }

        public final String toUseCase() {
            int i = C2344a.f8550a[ordinal()];
            if (i == 1) {
                return "MTML_INTEGRITY_DETECT";
            }
            if (i == 2) {
                return "MTML_APP_EVENT_PRED";
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: com.facebook.appevents.ml.ModelManager$a */
    public static final class C2345a {

        /* renamed from: a */
        public String f8551a;

        /* renamed from: b */
        public String f8552b;

        /* renamed from: c */
        public String f8553c;

        /* renamed from: d */
        public int f8554d;

        /* renamed from: e */
        public float[] f8555e;

        /* renamed from: f */
        public File f8556f;

        /* renamed from: g */
        public C5523b f8557g;

        /* renamed from: h */
        public Runnable f8558h;

        /* renamed from: com.facebook.appevents.ml.ModelManager$a$a */
        public static final class C2346a {
            /* renamed from: a */
            public static C2345a m6234a(JSONObject jSONObject) {
                float[] fArr;
                if (jSONObject == null) {
                    return null;
                }
                try {
                    String string = jSONObject.getString("use_case");
                    String string2 = jSONObject.getString("asset_uri");
                    String optString = jSONObject.optString("rules_uri", (String) null);
                    int i = jSONObject.getInt("version_id");
                    ModelManager modelManager = ModelManager.f8546a;
                    JSONArray jSONArray = jSONObject.getJSONArray("thresholds");
                    Class<ModelManager> cls = ModelManager.class;
                    if (!C6606a.m15601b(cls)) {
                        try {
                            modelManager.getClass();
                            if (!C6606a.m15601b(modelManager) && jSONArray != null) {
                                fArr = new float[jSONArray.length()];
                                int i2 = 0;
                                int length = jSONArray.length();
                                if (length > 0) {
                                    while (true) {
                                        int i3 = i2 + 1;
                                        try {
                                            String string3 = jSONArray.getString(i2);
                                            C24362h.m61210e(string3, "jsonArray.getString(i)");
                                            fArr[i2] = Float.parseFloat(string3);
                                        } catch (JSONException unused) {
                                        }
                                        if (i3 >= length) {
                                            break;
                                        }
                                        i2 = i3;
                                    }
                                }
                                C24362h.m61210e(string, "useCase");
                                C24362h.m61210e(string2, "assetUri");
                                return new C2345a(string, string2, optString, i, fArr);
                            }
                        } catch (Throwable th) {
                            C6606a.m15600a(cls, th);
                        }
                    }
                    fArr = null;
                    C24362h.m61210e(string, "useCase");
                    C24362h.m61210e(string2, "assetUri");
                    return new C2345a(string, string2, optString, i, fArr);
                } catch (Exception unused2) {
                    return null;
                }
            }

            /* renamed from: b */
            public static void m6235b(String str, String str2, C5401f.C5402a aVar) {
                File file = new File(C5526e.m13744a(), str2);
                if (str == null || file.exists()) {
                    aVar.mo19838a(file);
                } else {
                    new C5401f(str, file, aVar).execute(new String[0]);
                }
            }

            /* renamed from: c */
            public static void m6236c(C2345a aVar, ArrayList arrayList) {
                File[] listFiles;
                boolean z;
                String str = aVar.f8551a;
                int i = aVar.f8554d;
                File a = C5526e.m13744a();
                if (!(a == null || (listFiles = a.listFiles()) == null)) {
                    int i2 = 0;
                    if (listFiles.length == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        String str2 = str + '_' + i;
                        int length = listFiles.length;
                        while (i2 < length) {
                            File file = listFiles[i2];
                            i2++;
                            String name = file.getName();
                            C24362h.m61210e(name, "name");
                            if (C25081h.m62835F(name, str) && !C25081h.m62835F(name, str2)) {
                                file.delete();
                            }
                        }
                    }
                }
                m6235b(aVar.f8552b, aVar.f8551a + '_' + aVar.f8554d, new C5524c(arrayList));
            }
        }

        public C2345a(String str, String str2, String str3, int i, float[] fArr) {
            this.f8551a = str;
            this.f8552b = str2;
            this.f8553c = str3;
            this.f8554d = i;
            this.f8555e = fArr;
        }
    }

    /* renamed from: com.facebook.appevents.ml.ModelManager$b */
    public /* synthetic */ class C2347b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8559a;

        static {
            int[] iArr = new int[Task.values().length];
            iArr[Task.MTML_APP_EVENT_PREDICTION.ordinal()] = 1;
            iArr[Task.MTML_INTEGRITY_DETECT.ordinal()] = 2;
            f8559a = iArr;
        }
    }

    /* renamed from: d */
    public static final File m6226d(Task task) {
        Class<ModelManager> cls = ModelManager.class;
        if (C6606a.m15601b(cls)) {
            return null;
        }
        try {
            C24362h.m61211f(task, "task");
            C2345a aVar = (C2345a) f8547b.get(task.toUseCase());
            if (aVar == null) {
                return null;
            }
            return aVar.f8556f;
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return null;
        }
    }

    /* renamed from: f */
    public static final String[] m6227f(Task task, float[][] fArr, String[] strArr) {
        C5523b bVar;
        boolean z;
        String[] strArr2 = strArr;
        Class<ModelManager> cls = ModelManager.class;
        if (C6606a.m15601b(cls)) {
            return null;
        }
        try {
            C24362h.m61211f(task, "task");
            C2345a aVar = (C2345a) f8547b.get(task.toUseCase());
            if (aVar == null) {
                bVar = null;
            } else {
                bVar = aVar.f8557g;
            }
            if (bVar == null) {
                return null;
            }
            float[] fArr2 = aVar.f8555e;
            int length = strArr2.length;
            boolean z2 = false;
            int length2 = fArr[0].length;
            C5521a aVar2 = new C5521a(new int[]{length, length2});
            if (length > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    System.arraycopy(fArr[i], 0, aVar2.f18088c, i * length2, length2);
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
            C5521a a = bVar.mo21390a(aVar2, strArr2, task.toKey());
            if (a == null || fArr2 == null) {
                return null;
            }
            if (a.f18088c.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
            if (fArr2.length == 0) {
                z2 = true;
            }
            if (z2) {
                return null;
            }
            int i3 = C2347b.f8559a[task.ordinal()];
            if (i3 == 1) {
                return f8546a.mo12498h(a, fArr2);
            }
            if (i3 == 2) {
                return f8546a.mo12497g(a, fArr2);
            }
            throw new NoWhenBranchMatchedException();
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo12493a(JSONObject jSONObject) {
        if (!C6606a.m15601b(this)) {
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    try {
                        C2345a a = C2345a.C2346a.m6234a(jSONObject.getJSONObject(keys.next()));
                        if (a != null) {
                            f8547b.put(a.f8551a, a);
                        }
                    } catch (JSONException unused) {
                        return;
                    }
                }
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007c, code lost:
        if (kotlin.text.C24179b.m60559G(r7, "en", false) != false) goto L_0x007e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0086 A[Catch:{ all -> 0x0068, all -> 0x00d4 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12494b() {
        /*
            r10 = this;
            boolean r0 = p262t8.C6606a.m15601b(r10)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x00d4 }
            r0.<init>()     // Catch:{ all -> 0x00d4 }
            j$.util.concurrent.ConcurrentHashMap r1 = f8547b     // Catch:{ all -> 0x00d4 }
            java.util.Set r1 = r1.entrySet()     // Catch:{ all -> 0x00d4 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00d4 }
            r2 = 0
            r3 = 0
            r6 = r2
            r8 = 0
        L_0x001a:
            boolean r4 = r1.hasNext()     // Catch:{ all -> 0x00d4 }
            if (r4 == 0) goto L_0x00bc
            java.lang.Object r4 = r1.next()     // Catch:{ all -> 0x00d4 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ all -> 0x00d4 }
            java.lang.Object r5 = r4.getKey()     // Catch:{ all -> 0x00d4 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x00d4 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x00d4 }
            com.facebook.appevents.ml.ModelManager$a r4 = (com.facebook.appevents.p047ml.ModelManager.C2345a) r4     // Catch:{ all -> 0x00d4 }
            com.facebook.appevents.ml.ModelManager$Task r7 = com.facebook.appevents.p047ml.ModelManager.Task.MTML_APP_EVENT_PREDICTION     // Catch:{ all -> 0x00d4 }
            java.lang.String r7 = r7.toUseCase()     // Catch:{ all -> 0x00d4 }
            boolean r7 = mf0.C24362h.m61206a(r5, r7)     // Catch:{ all -> 0x00d4 }
            if (r7 == 0) goto L_0x0091
            java.lang.String r6 = r4.f8552b     // Catch:{ all -> 0x00d4 }
            int r7 = r4.f8554d     // Catch:{ all -> 0x00d4 }
            int r8 = java.lang.Math.max(r8, r7)     // Catch:{ all -> 0x00d4 }
            com.facebook.internal.FeatureManager r7 = com.facebook.internal.FeatureManager.f8588a     // Catch:{ all -> 0x00d4 }
            com.facebook.internal.FeatureManager$Feature r7 = com.facebook.internal.FeatureManager.Feature.SuggestedEvents     // Catch:{ all -> 0x00d4 }
            boolean r7 = com.facebook.internal.FeatureManager.m6257c(r7)     // Catch:{ all -> 0x00d4 }
            if (r7 == 0) goto L_0x0091
            boolean r7 = p262t8.C6606a.m15601b(r10)     // Catch:{ all -> 0x00d4 }
            if (r7 == 0) goto L_0x0057
            goto L_0x0083
        L_0x0057:
            com.facebook.internal.f0 r7 = com.facebook.internal.C2397f0.f8630a     // Catch:{ all -> 0x0068 }
            android.content.Context r7 = p009a8.C0115o.m210a()     // Catch:{ Exception -> 0x006a }
            android.content.res.Resources r7 = r7.getResources()     // Catch:{ Exception -> 0x006a }
            android.content.res.Configuration r7 = r7.getConfiguration()     // Catch:{ Exception -> 0x006a }
            java.util.Locale r7 = r7.locale     // Catch:{ Exception -> 0x006a }
            goto L_0x006b
        L_0x0068:
            r7 = move-exception
            goto L_0x0080
        L_0x006a:
            r7 = r2
        L_0x006b:
            if (r7 == 0) goto L_0x007e
            java.lang.String r7 = r7.getLanguage()     // Catch:{ all -> 0x0068 }
            java.lang.String r9 = "locale.language"
            mf0.C24362h.m61210e(r7, r9)     // Catch:{ all -> 0x0068 }
            java.lang.String r9 = "en"
            boolean r7 = kotlin.text.C24179b.m60559G(r7, r9, r3)     // Catch:{ all -> 0x0068 }
            if (r7 == 0) goto L_0x0083
        L_0x007e:
            r7 = 1
            goto L_0x0084
        L_0x0080:
            p262t8.C6606a.m15600a(r10, r7)     // Catch:{ all -> 0x00d4 }
        L_0x0083:
            r7 = 0
        L_0x0084:
            if (r7 == 0) goto L_0x0091
            com.facebook.appevents.i r7 = new com.facebook.appevents.i     // Catch:{ all -> 0x00d4 }
            r9 = 2
            r7.<init>(r9)     // Catch:{ all -> 0x00d4 }
            r4.f8558h = r7     // Catch:{ all -> 0x00d4 }
            r0.add(r4)     // Catch:{ all -> 0x00d4 }
        L_0x0091:
            com.facebook.appevents.ml.ModelManager$Task r7 = com.facebook.appevents.p047ml.ModelManager.Task.MTML_INTEGRITY_DETECT     // Catch:{ all -> 0x00d4 }
            java.lang.String r7 = r7.toUseCase()     // Catch:{ all -> 0x00d4 }
            boolean r5 = mf0.C24362h.m61206a(r5, r7)     // Catch:{ all -> 0x00d4 }
            if (r5 == 0) goto L_0x001a
            java.lang.String r6 = r4.f8552b     // Catch:{ all -> 0x00d4 }
            int r5 = r4.f8554d     // Catch:{ all -> 0x00d4 }
            int r8 = java.lang.Math.max(r8, r5)     // Catch:{ all -> 0x00d4 }
            com.facebook.internal.FeatureManager r5 = com.facebook.internal.FeatureManager.f8588a     // Catch:{ all -> 0x00d4 }
            com.facebook.internal.FeatureManager$Feature r5 = com.facebook.internal.FeatureManager.Feature.IntelligentIntegrity     // Catch:{ all -> 0x00d4 }
            boolean r5 = com.facebook.internal.FeatureManager.m6257c(r5)     // Catch:{ all -> 0x00d4 }
            if (r5 == 0) goto L_0x001a
            x.k r5 = new x.k     // Catch:{ all -> 0x00d4 }
            r7 = 3
            r5.<init>(r7)     // Catch:{ all -> 0x00d4 }
            r4.f8558h = r5     // Catch:{ all -> 0x00d4 }
            r0.add(r4)     // Catch:{ all -> 0x00d4 }
            goto L_0x001a
        L_0x00bc:
            if (r6 == 0) goto L_0x00d3
            if (r8 <= 0) goto L_0x00d3
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x00d4 }
            if (r1 != 0) goto L_0x00d3
            com.facebook.appevents.ml.ModelManager$a r1 = new com.facebook.appevents.ml.ModelManager$a     // Catch:{ all -> 0x00d4 }
            java.lang.String r5 = "MTML"
            r7 = 0
            r9 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00d4 }
            com.facebook.appevents.p047ml.ModelManager.C2345a.C2346a.m6236c(r1, r0)     // Catch:{ all -> 0x00d4 }
        L_0x00d3:
            return
        L_0x00d4:
            r0 = move-exception
            p262t8.C6606a.m15600a(r10, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.p047ml.ModelManager.mo12494b():void");
    }

    /* renamed from: c */
    public final JSONObject mo12495c() {
        if (C6606a.m15601b(this)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("fields", TextUtils.join(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
            String str = GraphRequest.f8425j;
            GraphRequest g = GraphRequest.C2281c.m6137g((AccessToken) null, "app/model_asset", (GraphRequest.C2280b) null);
            g.f8431d = bundle;
            JSONObject jSONObject = g.mo11903c().f365b;
            if (jSONObject == null) {
                return null;
            }
            return mo12496e(jSONObject);
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:15|16|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return new org.json.JSONObject();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0067 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject mo12496e(org.json.JSONObject r13) {
        /*
            r12 = this;
            java.lang.String r0 = "asset_uri"
            java.lang.String r1 = "thresholds"
            java.lang.String r2 = "version_id"
            java.lang.String r3 = "rules_uri"
            java.lang.String r4 = "use_case"
            boolean r5 = p262t8.C6606a.m15601b(r12)
            r6 = 0
            if (r5 == 0) goto L_0x0015
            return r6
        L_0x0015:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x006d }
            r5.<init>()     // Catch:{ all -> 0x006d }
            java.lang.String r7 = "data"
            org.json.JSONArray r13 = r13.getJSONArray(r7)     // Catch:{ JSONException -> 0x0067 }
            r7 = 0
            int r8 = r13.length()     // Catch:{ JSONException -> 0x0067 }
            if (r8 <= 0) goto L_0x006c
        L_0x0027:
            int r9 = r7 + 1
            org.json.JSONObject r7 = r13.getJSONObject(r7)     // Catch:{ JSONException -> 0x0067 }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0067 }
            r10.<init>()     // Catch:{ JSONException -> 0x0067 }
            java.lang.String r11 = r7.getString(r2)     // Catch:{ JSONException -> 0x0067 }
            r10.put(r2, r11)     // Catch:{ JSONException -> 0x0067 }
            java.lang.String r11 = r7.getString(r4)     // Catch:{ JSONException -> 0x0067 }
            r10.put(r4, r11)     // Catch:{ JSONException -> 0x0067 }
            org.json.JSONArray r11 = r7.getJSONArray(r1)     // Catch:{ JSONException -> 0x0067 }
            r10.put(r1, r11)     // Catch:{ JSONException -> 0x0067 }
            java.lang.String r11 = r7.getString(r0)     // Catch:{ JSONException -> 0x0067 }
            r10.put(r0, r11)     // Catch:{ JSONException -> 0x0067 }
            boolean r11 = r7.has(r3)     // Catch:{ JSONException -> 0x0067 }
            if (r11 == 0) goto L_0x005b
            java.lang.String r11 = r7.getString(r3)     // Catch:{ JSONException -> 0x0067 }
            r10.put(r3, r11)     // Catch:{ JSONException -> 0x0067 }
        L_0x005b:
            java.lang.String r7 = r7.getString(r4)     // Catch:{ JSONException -> 0x0067 }
            r5.put(r7, r10)     // Catch:{ JSONException -> 0x0067 }
            if (r9 < r8) goto L_0x0065
            goto L_0x006c
        L_0x0065:
            r7 = r9
            goto L_0x0027
        L_0x0067:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x006d }
            r5.<init>()     // Catch:{ all -> 0x006d }
        L_0x006c:
            return r5
        L_0x006d:
            r13 = move-exception
            p262t8.C6606a.m15600a(r12, r13)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.p047ml.ModelManager.mo12496e(org.json.JSONObject):org.json.JSONObject");
    }

    /* renamed from: g */
    public final String[] mo12497g(C5521a aVar, float[] fArr) {
        if (C6606a.m15601b(this)) {
            return null;
        }
        try {
            int[] iArr = aVar.f18086a;
            int i = iArr[0];
            int i2 = iArr[1];
            float[] fArr2 = aVar.f18088c;
            if (i2 != fArr.length) {
                return null;
            }
            C24806h C0 = C17885a.m44393C0(0, i);
            ArrayList arrayList = new ArrayList(C21136j.m49436X(C0, 10));
            C24805g p = C0.iterator();
            while (p.f62733d) {
                int nextInt = p.nextInt();
                String str = "none";
                int length = fArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    int i5 = i4 + 1;
                    if (fArr2[(nextInt * i2) + i4] >= fArr[i3]) {
                        str = f8549d.get(i4);
                    }
                    i3++;
                    i4 = i5;
                }
                arrayList.add(str);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return null;
        }
    }

    /* renamed from: h */
    public final String[] mo12498h(C5521a aVar, float[] fArr) {
        if (C6606a.m15601b(this)) {
            return null;
        }
        try {
            int[] iArr = aVar.f18086a;
            int i = iArr[0];
            int i2 = iArr[1];
            float[] fArr2 = aVar.f18088c;
            if (i2 != fArr.length) {
                return null;
            }
            C24806h C0 = C17885a.m44393C0(0, i);
            ArrayList arrayList = new ArrayList(C21136j.m49436X(C0, 10));
            C24805g p = C0.iterator();
            while (p.f62733d) {
                int nextInt = p.nextInt();
                String str = InneractiveMediationNameConsts.OTHER;
                int length = fArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    int i5 = i4 + 1;
                    if (fArr2[(nextInt * i2) + i4] >= fArr[i3]) {
                        str = f8548c.get(i4);
                    }
                    i3++;
                    i4 = i5;
                }
                arrayList.add(str);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return null;
        }
    }
}
