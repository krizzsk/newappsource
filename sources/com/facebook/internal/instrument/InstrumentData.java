package com.facebook.internal.instrument;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.facebook.internal.C2397f0;
import java.io.File;
import kotlin.Metadata;
import mf0.C24362h;
import org.json.JSONArray;
import org.json.JSONObject;
import p001a0.C0016g;
import p009a8.C0115o;
import p584jl.C17885a;
import uh0.C25081h;

public final class InstrumentData {

    /* renamed from: a */
    public String f8643a;

    /* renamed from: b */
    public Type f8644b;

    /* renamed from: c */
    public JSONArray f8645c;

    /* renamed from: d */
    public String f8646d;

    /* renamed from: e */
    public String f8647e;

    /* renamed from: f */
    public String f8648f;

    /* renamed from: g */
    public Long f8649g;

    @Metadata(mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0016R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, mo59060d2 = {"Lcom/facebook/internal/instrument/InstrumentData$Type;", "", "(Ljava/lang/String;I)V", "logPrefix", "", "getLogPrefix", "()Ljava/lang/String;", "toString", "Unknown", "Analysis", "AnrReport", "CrashReport", "CrashShield", "ThreadCheck", "facebook-core_release"}, mo59061k = 1, mo59062mv = {1, 5, 1}, mo59064xi = 48)
    public enum Type {
        Unknown,
        Analysis,
        AnrReport,
        CrashReport,
        CrashShield,
        ThreadCheck;

        /* renamed from: com.facebook.internal.instrument.InstrumentData$Type$a */
        public /* synthetic */ class C2406a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f8650a = null;

            static {
                int[] iArr = new int[Type.values().length];
                iArr[Type.Analysis.ordinal()] = 1;
                iArr[Type.AnrReport.ordinal()] = 2;
                iArr[Type.CrashReport.ordinal()] = 3;
                iArr[Type.CrashShield.ordinal()] = 4;
                iArr[Type.ThreadCheck.ordinal()] = 5;
                f8650a = iArr;
            }
        }

        public final String getLogPrefix() {
            int i = C2406a.f8650a[ordinal()];
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown" : "thread_check_log_" : "shield_log_" : "crash_log_" : "anr_log_" : "analysis_log_";
        }

        public String toString() {
            int i = C2406a.f8650a[ordinal()];
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown" : "ThreadCheck" : "CrashShield" : "CrashReport" : "AnrReport" : "Analysis";
        }
    }

    /* renamed from: com.facebook.internal.instrument.InstrumentData$a */
    public /* synthetic */ class C2407a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8651a;

        static {
            int[] iArr = new int[Type.values().length];
            iArr[Type.Analysis.ordinal()] = 1;
            iArr[Type.AnrReport.ordinal()] = 2;
            iArr[Type.CrashReport.ordinal()] = 3;
            iArr[Type.CrashShield.ordinal()] = 4;
            iArr[Type.ThreadCheck.ordinal()] = 5;
            f8651a = iArr;
        }
    }

    public InstrumentData(JSONArray jSONArray) {
        this.f8644b = Type.Analysis;
        this.f8649g = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        this.f8645c = jSONArray;
        StringBuffer q = C0016g.m33q("analysis_log_");
        q.append(String.valueOf(this.f8649g));
        q.append(".json");
        String stringBuffer = q.toString();
        C24362h.m61210e(stringBuffer, "StringBuffer()\n            .append(InstrumentUtility.ANALYSIS_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        this.f8643a = stringBuffer;
    }

    /* renamed from: a */
    public final int mo12557a(InstrumentData instrumentData) {
        C24362h.m61211f(instrumentData, "data");
        Long l = this.f8649g;
        if (l == null) {
            return -1;
        }
        long longValue = l.longValue();
        Long l2 = instrumentData.f8649g;
        if (l2 == null) {
            return 1;
        }
        int i = (l2.longValue() > longValue ? 1 : (l2.longValue() == longValue ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i == 0) {
            return 0;
        }
        return 1;
    }

    /* renamed from: b */
    public final boolean mo12558b() {
        int i;
        Type type = this.f8644b;
        if (type == null) {
            i = -1;
        } else {
            i = C2407a.f8651a[type.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                if ((i != 3 && i != 4 && i != 5) || this.f8648f == null || this.f8649g == null) {
                    return false;
                }
                return true;
            } else if (this.f8648f == null || this.f8647e == null || this.f8649g == null) {
                return false;
            }
        } else if (this.f8645c == null || this.f8649g == null) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final void mo12559c() {
        if (mo12558b()) {
            C17885a.m44399F0(this.f8643a, toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r5 = this;
            com.facebook.internal.instrument.InstrumentData$Type r0 = r5.f8644b
            if (r0 != 0) goto L_0x0006
            r0 = -1
            goto L_0x000e
        L_0x0006:
            int[] r1 = com.facebook.internal.instrument.InstrumentData.C2407a.f8651a
            int r0 = r0.ordinal()
            r0 = r1[r0]
        L_0x000e:
            r1 = 1
            java.lang.String r2 = "timestamp"
            r3 = 0
            if (r0 == r1) goto L_0x0062
            r1 = 2
            if (r0 == r1) goto L_0x0022
            r1 = 3
            if (r0 == r1) goto L_0x0022
            r1 = 4
            if (r0 == r1) goto L_0x0022
            r1 = 5
            if (r0 == r1) goto L_0x0022
            goto L_0x0078
        L_0x0022:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "device_os_version"
            java.lang.String r4 = android.os.Build.VERSION.RELEASE     // Catch:{ JSONException -> 0x0078 }
            r0.put(r1, r4)     // Catch:{ JSONException -> 0x0078 }
            java.lang.String r1 = "device_model"
            java.lang.String r4 = android.os.Build.MODEL     // Catch:{ JSONException -> 0x0078 }
            r0.put(r1, r4)     // Catch:{ JSONException -> 0x0078 }
            java.lang.String r1 = r5.f8646d     // Catch:{ JSONException -> 0x0078 }
            if (r1 == 0) goto L_0x003e
            java.lang.String r4 = "app_version"
            r0.put(r4, r1)     // Catch:{ JSONException -> 0x0078 }
        L_0x003e:
            java.lang.Long r1 = r5.f8649g     // Catch:{ JSONException -> 0x0078 }
            if (r1 == 0) goto L_0x0045
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x0078 }
        L_0x0045:
            java.lang.String r1 = r5.f8647e     // Catch:{ JSONException -> 0x0078 }
            if (r1 == 0) goto L_0x004e
            java.lang.String r2 = "reason"
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x0078 }
        L_0x004e:
            java.lang.String r1 = r5.f8648f     // Catch:{ JSONException -> 0x0078 }
            if (r1 == 0) goto L_0x0057
            java.lang.String r2 = "callstack"
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x0078 }
        L_0x0057:
            com.facebook.internal.instrument.InstrumentData$Type r1 = r5.f8644b     // Catch:{ JSONException -> 0x0078 }
            if (r1 == 0) goto L_0x0077
            java.lang.String r2 = "type"
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x0078 }
            goto L_0x0077
        L_0x0062:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONArray r1 = r5.f8645c     // Catch:{ JSONException -> 0x0078 }
            if (r1 == 0) goto L_0x0070
            java.lang.String r4 = "feature_names"
            r0.put(r4, r1)     // Catch:{ JSONException -> 0x0078 }
        L_0x0070:
            java.lang.Long r1 = r5.f8649g     // Catch:{ JSONException -> 0x0078 }
            if (r1 == 0) goto L_0x0077
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x0078 }
        L_0x0077:
            r3 = r0
        L_0x0078:
            if (r3 != 0) goto L_0x0089
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "JSONObject().toString()"
            mf0.C24362h.m61210e(r0, r1)
            return r0
        L_0x0089:
            java.lang.String r0 = r3.toString()
            java.lang.String r1 = "params.toString()"
            mf0.C24362h.m61210e(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.instrument.InstrumentData.toString():java.lang.String");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public InstrumentData(java.lang.Throwable r7, com.facebook.internal.instrument.InstrumentData.Type r8) {
        /*
            r6 = this;
            r6.<init>()
            r6.f8644b = r8
            com.facebook.internal.f0 r0 = com.facebook.internal.C2397f0.f8630a
            android.content.Context r0 = p009a8.C0115o.m210a()
            java.lang.String r1 = r0.getPackageName()
            r2 = 0
            r3 = 0
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x001f }
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)     // Catch:{ NameNotFoundException -> 0x001f }
            if (r0 != 0) goto L_0x001c
            goto L_0x001f
        L_0x001c:
            java.lang.String r0 = r0.versionName     // Catch:{ NameNotFoundException -> 0x001f }
            goto L_0x0020
        L_0x001f:
            r0 = r3
        L_0x0020:
            r6.f8646d = r0
            if (r7 != 0) goto L_0x0026
            r0 = r3
            goto L_0x0039
        L_0x0026:
            java.lang.Throwable r0 = r7.getCause()
            if (r0 != 0) goto L_0x0031
            java.lang.String r0 = r7.toString()
            goto L_0x0039
        L_0x0031:
            java.lang.Throwable r0 = r7.getCause()
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L_0x0039:
            r6.f8647e = r0
            if (r7 != 0) goto L_0x003e
            goto L_0x006b
        L_0x003e:
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
        L_0x0043:
            if (r7 == 0) goto L_0x0067
            if (r7 == r3) goto L_0x0067
            java.lang.StackTraceElement[] r1 = r7.getStackTrace()
            java.lang.String r3 = "t.stackTrace"
            mf0.C24362h.m61210e(r1, r3)
            int r3 = r1.length
            r4 = 0
        L_0x0052:
            if (r4 >= r3) goto L_0x0060
            r5 = r1[r4]
            int r4 = r4 + 1
            java.lang.String r5 = r5.toString()
            r0.put(r5)
            goto L_0x0052
        L_0x0060:
            java.lang.Throwable r1 = r7.getCause()
            r3 = r7
            r7 = r1
            goto L_0x0043
        L_0x0067:
            java.lang.String r3 = r0.toString()
        L_0x006b:
            r6.f8648f = r3
            long r0 = java.lang.System.currentTimeMillis()
            r7 = 1000(0x3e8, float:1.401E-42)
            long r2 = (long) r7
            long r0 = r0 / r2
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            r6.f8649g = r7
            java.lang.StringBuffer r7 = new java.lang.StringBuffer
            r7.<init>()
            java.lang.String r8 = r8.getLogPrefix()
            r7.append(r8)
            java.lang.Long r8 = r6.f8649g
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r7.append(r8)
            java.lang.String r8 = ".json"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "StringBuffer().append(t.logPrefix).append(timestamp.toString()).append(\".json\").toString()"
            mf0.C24362h.m61210e(r7, r8)
            r6.f8643a = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.instrument.InstrumentData.<init>(java.lang.Throwable, com.facebook.internal.instrument.InstrumentData$Type):void");
    }

    public InstrumentData(String str, String str2) {
        this.f8644b = Type.AnrReport;
        C2397f0 f0Var = C2397f0.f8630a;
        Context a = C0115o.m210a();
        String str3 = null;
        try {
            PackageInfo packageInfo = a.getPackageManager().getPackageInfo(a.getPackageName(), 0);
            if (packageInfo != null) {
                str3 = packageInfo.versionName;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        this.f8646d = str3;
        this.f8647e = str;
        this.f8648f = str2;
        this.f8649g = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        StringBuffer q = C0016g.m33q("anr_log_");
        q.append(String.valueOf(this.f8649g));
        q.append(".json");
        String stringBuffer = q.toString();
        C24362h.m61210e(stringBuffer, "StringBuffer()\n            .append(InstrumentUtility.ANR_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        this.f8643a = stringBuffer;
    }

    public InstrumentData(File file) {
        Type type;
        String name = file.getName();
        C24362h.m61210e(name, "file.name");
        this.f8643a = name;
        if (C25081h.m62835F(name, "crash_log_")) {
            type = Type.CrashReport;
        } else if (C25081h.m62835F(name, "shield_log_")) {
            type = Type.CrashShield;
        } else if (C25081h.m62835F(name, "thread_check_log_")) {
            type = Type.ThreadCheck;
        } else if (C25081h.m62835F(name, "analysis_log_")) {
            type = Type.Analysis;
        } else if (C25081h.m62835F(name, "anr_log_")) {
            type = Type.AnrReport;
        } else {
            type = Type.Unknown;
        }
        this.f8644b = type;
        JSONObject o0 = C17885a.m44453o0(this.f8643a);
        if (o0 != null) {
            this.f8649g = Long.valueOf(o0.optLong("timestamp", 0));
            this.f8646d = o0.optString("app_version", (String) null);
            this.f8647e = o0.optString("reason", (String) null);
            this.f8648f = o0.optString("callstack", (String) null);
            this.f8645c = o0.optJSONArray("feature_names");
        }
    }
}
