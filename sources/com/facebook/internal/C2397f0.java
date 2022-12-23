package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.view.autofill.AutofillManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.appboy.support.StringUtils;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.HttpMethod;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.usebutton.sdk.context.Identifiers;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.text.C24179b;
import kotlin.text.Regex;
import mf0.C24362h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import p009a8.C0115o;
import p009a8.C0118q;
import p262t8.C6606a;
import p988j$.util.concurrent.ConcurrentHashMap;
import uh0.C25072a;
import uh0.C25081h;

/* renamed from: com.facebook.internal.f0 */
public final class C2397f0 {

    /* renamed from: a */
    public static final C2397f0 f8630a = new C2397f0();

    /* renamed from: b */
    public static int f8631b;

    /* renamed from: c */
    public static long f8632c = -1;

    /* renamed from: d */
    public static long f8633d = -1;

    /* renamed from: e */
    public static long f8634e = -1;

    /* renamed from: f */
    public static String f8635f = "";

    /* renamed from: g */
    public static String f8636g = "";

    /* renamed from: h */
    public static String f8637h = "NoCarrier";

    /* renamed from: com.facebook.internal.f0$a */
    public interface C2398a {
        /* renamed from: a */
        void mo11931a(JSONObject jSONObject);

        /* renamed from: b */
        void mo11932b(FacebookException facebookException);
    }

    /* renamed from: A */
    public static final boolean m6292A(String str) {
        if (str != null) {
            return str.length() == 0;
        }
    }

    /* renamed from: B */
    public static final boolean m6293B(Uri uri) {
        if (uri == null || (!C25081h.m62830A("http", uri.getScheme(), true) && !C25081h.m62830A("https", uri.getScheme(), true) && !C25081h.m62830A("fbstaging", uri.getScheme(), true))) {
            return false;
        }
        return true;
    }

    /* renamed from: C */
    public static final ArrayList m6294C(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                arrayList.add(jSONArray.getString(i));
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return arrayList;
    }

    /* renamed from: D */
    public static final HashMap m6295D(String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new HashMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                C24362h.m61210e(next, LinksConfiguration.KEY_KEY);
                String string = jSONObject.getString(next);
                C24362h.m61210e(string, "jsonObject.getString(key)");
                hashMap.put(next, string);
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    /* renamed from: E */
    public static final String m6296E(Map<String, String> map) {
        C24362h.m61211f(map, "map");
        String str = "";
        if (!map.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry next : map.entrySet()) {
                    jSONObject.put((String) next.getKey(), (String) next.getValue());
                }
                str = jSONObject.toString();
            } catch (JSONException unused) {
            }
            C24362h.m61210e(str, "{\n      try {\n        val jsonObject = JSONObject()\n        for ((key, value) in map) {\n          jsonObject.put(key, value)\n        }\n        jsonObject.toString()\n      } catch (_e: JSONException) {\n        \"\"\n      }\n    }");
        }
        return str;
    }

    /* renamed from: F */
    public static final boolean m6297F(Context context) {
        AutofillManager autofillManager;
        if (Build.VERSION.SDK_INT >= 26 && (autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class)) != null && autofillManager.isAutofillSupported() && autofillManager.isEnabled()) {
            return true;
        }
        return false;
    }

    /* renamed from: G */
    public static final Bundle m6298G(String str) {
        Bundle bundle = new Bundle();
        if (!m6292A(str)) {
            if (str != null) {
                Object[] array = C24179b.m60577Y(str, new String[]{"&"}, 0, 6).toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    int length = strArr.length;
                    int i = 0;
                    while (i < length) {
                        String str2 = strArr[i];
                        i++;
                        Object[] array2 = C24179b.m60577Y(str2, new String[]{"="}, 0, 6).toArray(new String[0]);
                        if (array2 != null) {
                            String[] strArr2 = (String[]) array2;
                            try {
                                if (strArr2.length == 2) {
                                    bundle.putString(URLDecoder.decode(strArr2[0], "UTF-8"), URLDecoder.decode(strArr2[1], "UTF-8"));
                                } else if (strArr2.length == 1) {
                                    bundle.putString(URLDecoder.decode(strArr2[0], "UTF-8"), "");
                                }
                            } catch (UnsupportedEncodingException unused) {
                                C0115o oVar = C0115o.f331a;
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        return bundle;
    }

    /* renamed from: H */
    public static final void m6299H(Bundle bundle, JSONArray jSONArray) {
        C24362h.m61211f(bundle, "bundle");
        if (jSONArray instanceof Boolean) {
            bundle.putBoolean("media", ((Boolean) jSONArray).booleanValue());
        } else if (jSONArray instanceof boolean[]) {
            bundle.putBooleanArray("media", (boolean[]) jSONArray);
        } else if (jSONArray instanceof Double) {
            bundle.putDouble("media", ((Number) jSONArray).doubleValue());
        } else if (jSONArray instanceof double[]) {
            bundle.putDoubleArray("media", (double[]) jSONArray);
        } else if (jSONArray instanceof Integer) {
            bundle.putInt("media", ((Number) jSONArray).intValue());
        } else if (jSONArray instanceof int[]) {
            bundle.putIntArray("media", (int[]) jSONArray);
        } else if (jSONArray instanceof Long) {
            bundle.putLong("media", ((Number) jSONArray).longValue());
        } else if (jSONArray instanceof long[]) {
            bundle.putLongArray("media", (long[]) jSONArray);
        } else if (jSONArray instanceof String) {
            bundle.putString("media", (String) jSONArray);
        } else {
            bundle.putString("media", jSONArray.toString());
        }
    }

    /* renamed from: I */
    public static final void m6300I(Bundle bundle, String str, String str2) {
        if (!m6292A(str2)) {
            bundle.putString(str, str2);
        }
    }

    /* renamed from: J */
    public static final void m6301J(Bundle bundle, String str, Uri uri) {
        if (uri != null) {
            m6300I(bundle, str, uri.toString());
        }
    }

    /* renamed from: K */
    public static final HashMap m6302K(Parcel parcel) {
        C24362h.m61211f(parcel, "parcel");
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        int i = 0;
        if (readInt > 0) {
            do {
                i++;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (!(readString == null || readString2 == null)) {
                    hashMap.put(readString, readString2);
                    continue;
                }
            } while (i < readInt);
        }
        return hashMap;
    }

    /* renamed from: L */
    public static final String m6303L(InputStream inputStream) throws IOException {
        InputStreamReader inputStreamReader;
        BufferedInputStream bufferedInputStream;
        Throwable th;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
                try {
                    StringBuilder sb = new StringBuilder();
                    char[] cArr = new char[2048];
                    while (true) {
                        int read = inputStreamReader.read(cArr);
                        if (read != -1) {
                            sb.append(cArr, 0, read);
                        } else {
                            String sb2 = sb.toString();
                            C24362h.m61210e(sb2, "{\n      bufferedInputStream = BufferedInputStream(inputStream)\n      reader = InputStreamReader(bufferedInputStream)\n      val stringBuilder = StringBuilder()\n      val bufferSize = 1024 * 2\n      val buffer = CharArray(bufferSize)\n      var n = 0\n      while (reader.read(buffer).also { n = it } != -1) {\n        stringBuilder.append(buffer, 0, n)\n      }\n      stringBuilder.toString()\n    }");
                            m6311e(bufferedInputStream);
                            m6311e(inputStreamReader);
                            return sb2;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    m6311e(bufferedInputStream);
                    m6311e(inputStreamReader);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader = null;
                m6311e(bufferedInputStream);
                m6311e(inputStreamReader);
                throw th;
            }
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th = th4;
            inputStreamReader = null;
            m6311e(bufferedInputStream);
            m6311e(inputStreamReader);
            throw th;
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x00af */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b9 A[Catch:{ Exception -> 0x00de }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x018c  */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m6304M(android.content.Context r10, org.json.JSONObject r11) throws org.json.JSONException {
        /*
            java.lang.String r0 = "mounted"
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.lang.String r2 = "a2"
            r1.put(r2)
            com.facebook.internal.f0 r2 = f8630a
            r2.getClass()
            long r2 = f8632c
            r4 = 0
            r5 = -1
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0028
            long r2 = java.lang.System.currentTimeMillis()
            long r5 = f8632c
            long r2 = r2 - r5
            r5 = 1800000(0x1b7740, double:8.89318E-318)
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x00de
        L_0x0028:
            long r2 = java.lang.System.currentTimeMillis()
            f8632c = r2
            java.util.TimeZone r2 = java.util.TimeZone.getDefault()     // Catch:{ AssertionError | Exception -> 0x0054 }
            java.util.Date r3 = new java.util.Date     // Catch:{ AssertionError | Exception -> 0x0054 }
            r3.<init>()     // Catch:{ AssertionError | Exception -> 0x0054 }
            boolean r3 = r2.inDaylightTime(r3)     // Catch:{ AssertionError | Exception -> 0x0054 }
            java.lang.String r3 = r2.getDisplayName(r3, r4)     // Catch:{ AssertionError | Exception -> 0x0054 }
            java.lang.String r5 = "tz.getDisplayName(tz.inDaylightTime(Date()), TimeZone.SHORT)"
            mf0.C24362h.m61210e(r3, r5)     // Catch:{ AssertionError | Exception -> 0x0054 }
            f8635f = r3     // Catch:{ AssertionError | Exception -> 0x0054 }
            java.lang.String r2 = r2.getID()     // Catch:{ AssertionError | Exception -> 0x0054 }
            java.lang.String r3 = "tz.id"
            mf0.C24362h.m61210e(r2, r3)     // Catch:{ AssertionError | Exception -> 0x0054 }
            f8636g = r2     // Catch:{ AssertionError | Exception -> 0x0054 }
            goto L_0x0055
        L_0x0054:
        L_0x0055:
            java.lang.String r2 = f8637h
            java.lang.String r3 = "NoCarrier"
            boolean r2 = mf0.C24362h.m61206a(r2, r3)
            if (r2 == 0) goto L_0x007e
            java.lang.String r2 = "phone"
            java.lang.Object r2 = r10.getSystemService(r2)     // Catch:{ Exception -> 0x007e }
            if (r2 == 0) goto L_0x0076
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2     // Catch:{ Exception -> 0x007e }
            java.lang.String r2 = r2.getNetworkOperatorName()     // Catch:{ Exception -> 0x007e }
            java.lang.String r3 = "telephonyManager.networkOperatorName"
            mf0.C24362h.m61210e(r2, r3)     // Catch:{ Exception -> 0x007e }
            f8637h = r2     // Catch:{ Exception -> 0x007e }
            goto L_0x007e
        L_0x0076:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x007e }
            java.lang.String r3 = "null cannot be cast to non-null type android.telephony.TelephonyManager"
            r2.<init>(r3)     // Catch:{ Exception -> 0x007e }
            throw r2     // Catch:{ Exception -> 0x007e }
        L_0x007e:
            r2 = 4742290407621132288(0x41d0000000000000, double:1.073741824E9)
            java.lang.String r5 = android.os.Environment.getExternalStorageState()     // Catch:{ Exception -> 0x00af }
            boolean r5 = mf0.C24362h.m61206a(r0, r5)     // Catch:{ Exception -> 0x00af }
            if (r5 == 0) goto L_0x00a5
            java.io.File r5 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x00af }
            android.os.StatFs r6 = new android.os.StatFs     // Catch:{ Exception -> 0x00af }
            java.lang.String r5 = r5.getPath()     // Catch:{ Exception -> 0x00af }
            r6.<init>(r5)     // Catch:{ Exception -> 0x00af }
            int r5 = r6.getBlockCount()     // Catch:{ Exception -> 0x00af }
            long r7 = (long) r5     // Catch:{ Exception -> 0x00af }
            int r5 = r6.getBlockSize()     // Catch:{ Exception -> 0x00af }
            long r5 = (long) r5     // Catch:{ Exception -> 0x00af }
            long r7 = r7 * r5
            f8633d = r7     // Catch:{ Exception -> 0x00af }
        L_0x00a5:
            long r5 = f8633d     // Catch:{ Exception -> 0x00af }
            double r5 = (double) r5     // Catch:{ Exception -> 0x00af }
            double r5 = r5 / r2
            long r5 = java.lang.Math.round(r5)     // Catch:{ Exception -> 0x00af }
            f8633d = r5     // Catch:{ Exception -> 0x00af }
        L_0x00af:
            java.lang.String r5 = android.os.Environment.getExternalStorageState()     // Catch:{ Exception -> 0x00de }
            boolean r0 = mf0.C24362h.m61206a(r0, r5)     // Catch:{ Exception -> 0x00de }
            if (r0 == 0) goto L_0x00d4
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x00de }
            android.os.StatFs r5 = new android.os.StatFs     // Catch:{ Exception -> 0x00de }
            java.lang.String r0 = r0.getPath()     // Catch:{ Exception -> 0x00de }
            r5.<init>(r0)     // Catch:{ Exception -> 0x00de }
            int r0 = r5.getAvailableBlocks()     // Catch:{ Exception -> 0x00de }
            long r6 = (long) r0     // Catch:{ Exception -> 0x00de }
            int r0 = r5.getBlockSize()     // Catch:{ Exception -> 0x00de }
            long r8 = (long) r0     // Catch:{ Exception -> 0x00de }
            long r6 = r6 * r8
            f8634e = r6     // Catch:{ Exception -> 0x00de }
        L_0x00d4:
            long r5 = f8634e     // Catch:{ Exception -> 0x00de }
            double r5 = (double) r5     // Catch:{ Exception -> 0x00de }
            double r5 = r5 / r2
            long r2 = java.lang.Math.round(r5)     // Catch:{ Exception -> 0x00de }
            f8634e = r2     // Catch:{ Exception -> 0x00de }
        L_0x00de:
            java.lang.String r0 = r10.getPackageName()
            r2 = -1
            android.content.pm.PackageManager r3 = r10.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00f3 }
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r0, r4)     // Catch:{ NameNotFoundException -> 0x00f3 }
            if (r3 != 0) goto L_0x00ee
            return
        L_0x00ee:
            int r2 = r3.versionCode     // Catch:{ NameNotFoundException -> 0x00f3 }
            java.lang.String r3 = r3.versionName     // Catch:{ NameNotFoundException -> 0x00f3 }
            goto L_0x00f5
        L_0x00f3:
            java.lang.String r3 = ""
        L_0x00f5:
            r1.put(r0)
            r1.put(r2)
            r1.put(r3)
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            r1.put(r0)
            java.lang.String r0 = android.os.Build.MODEL
            r1.put(r0)
            android.content.res.Resources r0 = r10.getResources()     // Catch:{ Exception -> 0x0113 }
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch:{ Exception -> 0x0113 }
            java.util.Locale r0 = r0.locale     // Catch:{ Exception -> 0x0113 }
            goto L_0x0117
        L_0x0113:
            java.util.Locale r0 = java.util.Locale.getDefault()
        L_0x0117:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r0.getLanguage()
            r2.append(r3)
            r3 = 95
            r2.append(r3)
            java.lang.String r0 = r0.getCountry()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.put(r0)
            java.lang.String r0 = f8635f
            r1.put(r0)
            java.lang.String r0 = f8637h
            r1.put(r0)
            r2 = 0
            java.lang.String r0 = "display"
            java.lang.Object r10 = r10.getSystemService(r0)     // Catch:{ Exception -> 0x016c }
            boolean r0 = r10 instanceof android.hardware.display.DisplayManager     // Catch:{ Exception -> 0x016c }
            r5 = 0
            if (r0 == 0) goto L_0x0150
            android.hardware.display.DisplayManager r10 = (android.hardware.display.DisplayManager) r10     // Catch:{ Exception -> 0x016c }
            goto L_0x0151
        L_0x0150:
            r10 = r5
        L_0x0151:
            if (r10 != 0) goto L_0x0154
            goto L_0x0158
        L_0x0154:
            android.view.Display r5 = r10.getDisplay(r4)     // Catch:{ Exception -> 0x016c }
        L_0x0158:
            if (r5 == 0) goto L_0x016d
            android.util.DisplayMetrics r10 = new android.util.DisplayMetrics     // Catch:{ Exception -> 0x016c }
            r10.<init>()     // Catch:{ Exception -> 0x016c }
            r5.getMetrics(r10)     // Catch:{ Exception -> 0x016c }
            int r0 = r10.widthPixels     // Catch:{ Exception -> 0x016c }
            int r4 = r10.heightPixels     // Catch:{ Exception -> 0x016a }
            float r10 = r10.density     // Catch:{ Exception -> 0x016a }
            double r2 = (double) r10
            goto L_0x016e
        L_0x016a:
            goto L_0x016e
        L_0x016c:
        L_0x016d:
            r0 = 0
        L_0x016e:
            r1.put(r0)
            r1.put(r4)
            java.text.DecimalFormat r10 = new java.text.DecimalFormat
            java.lang.String r0 = "#.##"
            r10.<init>(r0)
            java.lang.String r10 = r10.format(r2)
            r1.put(r10)
            com.facebook.internal.f0 r10 = f8630a
            r10.getClass()
            int r10 = f8631b
            if (r10 <= 0) goto L_0x018c
            goto L_0x01b8
        L_0x018c:
            r10 = 1
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x01a3 }
            java.lang.String r2 = "/sys/devices/system/cpu/"
            r0.<init>(r2)     // Catch:{ Exception -> 0x01a3 }
            k5.m r2 = new k5.m     // Catch:{ Exception -> 0x01a3 }
            r2.<init>(r10)     // Catch:{ Exception -> 0x01a3 }
            java.io.File[] r0 = r0.listFiles(r2)     // Catch:{ Exception -> 0x01a3 }
            if (r0 == 0) goto L_0x01a4
            int r0 = r0.length     // Catch:{ Exception -> 0x01a3 }
            f8631b = r0     // Catch:{ Exception -> 0x01a3 }
            goto L_0x01a4
        L_0x01a3:
        L_0x01a4:
            int r0 = f8631b
            if (r0 > 0) goto L_0x01b6
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            int r10 = java.lang.Math.max(r0, r10)
            f8631b = r10
        L_0x01b6:
            int r10 = f8631b
        L_0x01b8:
            r1.put(r10)
            long r2 = f8633d
            r1.put(r2)
            long r2 = f8634e
            r1.put(r2)
            java.lang.String r10 = f8636g
            r1.put(r10)
            java.lang.String r10 = r1.toString()
            java.lang.String r0 = "extinfo"
            r11.put(r0, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C2397f0.m6304M(android.content.Context, org.json.JSONObject):void");
    }

    /* renamed from: N */
    public static final String m6305N(String str) {
        if (str == null) {
            return null;
        }
        f8630a.getClass();
        byte[] bytes = str.getBytes(C25072a.f63272a);
        C24362h.m61210e(bytes, "(this as java.lang.String).getBytes(charset)");
        return m6327u("SHA-256", bytes);
    }

    /* renamed from: O */
    public static final void m6306O(Parcel parcel, Map<String, String> map) {
        C24362h.m61211f(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry next : map.entrySet()) {
            parcel.writeString((String) next.getKey());
            parcel.writeString((String) next.getValue());
        }
    }

    /* renamed from: a */
    public static final <T> boolean m6307a(T t, T t2) {
        return t == null ? t2 == null : C24362h.m61206a(t, t2);
    }

    /* renamed from: b */
    public static final Uri m6308b(Bundle bundle, String str, String str2) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String next : bundle.keySet()) {
                Object obj = bundle.get(next);
                if (obj instanceof String) {
                    builder.appendQueryParameter(next, (String) obj);
                }
            }
        }
        Uri build = builder.build();
        C24362h.m61210e(build, "builder.build()");
        return build;
    }

    /* renamed from: c */
    public static void m6309c(Context context, String str) {
        int i;
        boolean z;
        CookieSyncManager.createInstance(context).sync();
        CookieManager instance = CookieManager.getInstance();
        String cookie = instance.getCookie(str);
        if (cookie != null) {
            Object[] array = C24179b.m60577Y(cookie, new String[]{";"}, 0, 6).toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                int length = strArr.length;
                int i2 = 0;
                while (i2 < length) {
                    String str2 = strArr[i2];
                    i2++;
                    Object[] array2 = C24179b.m60577Y(str2, new String[]{"="}, 0, 6).toArray(new String[0]);
                    if (array2 != null) {
                        String[] strArr2 = (String[]) array2;
                        if (strArr2.length > 0) {
                            String str3 = strArr2[0];
                            int length2 = str3.length() - 1;
                            int i3 = 0;
                            boolean z2 = false;
                            while (i3 <= length2) {
                                if (!z2) {
                                    i = i3;
                                } else {
                                    i = length2;
                                }
                                if (C24362h.m61213h(str3.charAt(i), 32) <= 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (!z2) {
                                    if (!z) {
                                        z2 = true;
                                    } else {
                                        i3++;
                                    }
                                } else if (!z) {
                                    break;
                                } else {
                                    length2--;
                                }
                            }
                            instance.setCookie(str, C24362h.m61216k("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;", str3.subSequence(i3, length2 + 1).toString()));
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
                instance.removeExpiredCookie();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    /* renamed from: d */
    public static final void m6310d(Context context) {
        try {
            f8630a.getClass();
            m6309c(context, "facebook.com");
            m6309c(context, ".facebook.com");
            m6309c(context, "https://facebook.com");
            m6309c(context, "https://.facebook.com");
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    public static final void m6311e(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: f */
    public static final String m6312f(String str) {
        return m6292A(str) ? "" : str;
    }

    /* renamed from: g */
    public static final ArrayList m6313g(JSONArray jSONArray) {
        try {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            int length = jSONArray.length();
            if (length <= 0) {
                return arrayList;
            }
            while (true) {
                int i2 = i + 1;
                String string = jSONArray.getString(i);
                C24362h.m61210e(string, "jsonArray.getString(i)");
                arrayList.add(string);
                if (i2 >= length) {
                    return arrayList;
                }
                i = i2;
            }
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    /* renamed from: h */
    public static final HashMap m6314h(JSONObject jSONObject) {
        C24362h.m61211f(jSONObject, "jsonObject");
        HashMap hashMap = new HashMap();
        JSONArray names = jSONObject.names();
        if (names == null) {
            return hashMap;
        }
        int i = 0;
        int length = names.length();
        if (length > 0) {
            while (true) {
                int i2 = i + 1;
                try {
                    String string = names.getString(i);
                    C24362h.m61210e(string, "keys.getString(i)");
                    Object obj = jSONObject.get(string);
                    if (obj instanceof JSONObject) {
                        obj = m6314h((JSONObject) obj);
                    }
                    C24362h.m61210e(obj, "value");
                    hashMap.put(string, obj);
                } catch (JSONException unused) {
                }
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return hashMap;
    }

    /* renamed from: i */
    public static final HashMap m6315i(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject.optString(next);
            if (optString != null) {
                C24362h.m61210e(next, LinksConfiguration.KEY_KEY);
                hashMap.put(next, optString);
            }
        }
        return hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0034  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int m6316j(java.io.InputStream r6, java.io.OutputStream r7) throws java.io.IOException {
        /*
            java.lang.String r0 = "outputStream"
            mf0.C24362h.m61211f(r7, r0)
            r0 = 0
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ all -> 0x002a }
            r1.<init>(r6)     // Catch:{ all -> 0x002a }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0027 }
            r2 = 0
            r3 = 0
        L_0x0011:
            int r4 = r1.read(r0)     // Catch:{ all -> 0x0027 }
            r5 = -1
            if (r4 == r5) goto L_0x001d
            r7.write(r0, r2, r4)     // Catch:{ all -> 0x0027 }
            int r3 = r3 + r4
            goto L_0x0011
        L_0x001d:
            r1.close()
            if (r6 != 0) goto L_0x0023
            goto L_0x0026
        L_0x0023:
            r6.close()
        L_0x0026:
            return r3
        L_0x0027:
            r7 = move-exception
            r0 = r1
            goto L_0x002b
        L_0x002a:
            r7 = move-exception
        L_0x002b:
            if (r0 != 0) goto L_0x002e
            goto L_0x0031
        L_0x002e:
            r0.close()
        L_0x0031:
            if (r6 != 0) goto L_0x0034
            goto L_0x0037
        L_0x0034:
            r6.close()
        L_0x0037:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C2397f0.m6316j(java.io.InputStream, java.io.OutputStream):int");
    }

    /* renamed from: k */
    public static final void m6317k(URLConnection uRLConnection) {
        if (uRLConnection != null && (uRLConnection instanceof HttpURLConnection)) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    /* renamed from: l */
    public static final String m6318l(Context context) {
        if (context == null) {
            return StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
        }
        if (context == context.getApplicationContext()) {
            return "unknown";
        }
        return context.getClass().getSimpleName();
    }

    /* renamed from: m */
    public static final String m6319m(Context context) {
        try {
            C0115o oVar = C0115o.f331a;
            C2400g0.m6342g();
            String str = C0115o.f335e;
            if (str != null) {
                return str;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i = applicationInfo.labelRes;
            if (i == 0) {
                return applicationInfo.nonLocalizedLabel.toString();
            }
            String string = context.getString(i);
            C24362h.m61210e(string, "context.getString(stringId)");
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: n */
    public static final Date m6320n(Bundle bundle, String str, Date date) {
        long j;
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (obj instanceof Long) {
            j = ((Number) obj).longValue();
        } else {
            if (obj instanceof String) {
                try {
                    j = Long.parseLong((String) obj);
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        if (j == 0) {
            return new Date(Long.MAX_VALUE);
        }
        return new Date((j * 1000) + date.getTime());
    }

    /* renamed from: o */
    public static final JSONObject m6321o() {
        Class<C2397f0> cls = C2397f0.class;
        if (C6606a.m15601b(cls)) {
            return null;
        }
        try {
            String string = C0115o.m210a().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", (String) null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return null;
        }
    }

    /* renamed from: p */
    public static final void m6322p(C2398a aVar, String str) {
        String str2;
        String str3;
        C24362h.m61211f(str, "accessToken");
        ConcurrentHashMap<String, JSONObject> concurrentHashMap = C2391c0.f8624a;
        JSONObject jSONObject = C2391c0.f8624a.get(str);
        if (jSONObject != null) {
            aVar.mo11931a(jSONObject);
            return;
        }
        C2395e0 e0Var = new C2395e0(aVar, str);
        f8630a.getClass();
        Bundle bundle = new Bundle();
        Date date = AccessToken.f8348m;
        AccessToken b = AccessToken.C2266c.m6110b();
        if (b == null || (str2 = b.f8361l) == null) {
            str2 = Identifiers.IDENTIFIER_FACEBOOK;
        }
        if (C24362h.m61206a(str2, "instagram")) {
            str3 = "id,name,profile_picture";
        } else {
            str3 = "id,name,first_name,middle_name,last_name";
        }
        bundle.putString("fields", str3);
        bundle.putString("access_token", str);
        GraphRequest graphRequest = new GraphRequest((AccessToken) null, "me", (Bundle) null, (HttpMethod) null, new C0118q((List) null, 0), 32);
        graphRequest.f8431d = bundle;
        graphRequest.mo11910k(HttpMethod.GET);
        graphRequest.mo11909j(e0Var);
        graphRequest.mo11904d();
    }

    /* renamed from: q */
    public static final String m6323q(Context context) {
        int i = C2400g0.f8641a;
        return C0115o.m211b();
    }

    /* renamed from: r */
    public static final Method m6324r(Class<?> cls, String str, Class<?>... clsArr) {
        C24362h.m61211f(clsArr, "parameterTypes");
        try {
            return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: s */
    public static final Method m6325s(String str, String str2, Class<?>... clsArr) {
        try {
            return m6324r(Class.forName(str), str2, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: t */
    public static final Object m6326t(String str, String str2, JSONObject jSONObject) throws JSONException {
        Object opt = jSONObject.opt(str);
        if (opt != null && (opt instanceof String)) {
            opt = new JSONTokener((String) opt).nextValue();
        }
        if (opt == null || (opt instanceof JSONObject) || (opt instanceof JSONArray)) {
            return opt;
        }
        if (str2 != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt(str2, opt);
            return jSONObject2;
        }
        throw new FacebookException("Got an unexpected non-JSON object.");
    }

    /* renamed from: u */
    public static String m6327u(String str, byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            C24362h.m61210e(instance, "hash");
            instance.update(bArr);
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            C24362h.m61210e(digest, "digest");
            int length = digest.length;
            int i = 0;
            while (i < length) {
                byte b = digest[i];
                i++;
                sb.append(Integer.toHexString((b >> 4) & 15));
                sb.append(Integer.toHexString((b >> 0) & 15));
            }
            String sb2 = sb.toString();
            C24362h.m61210e(sb2, "builder.toString()");
            return sb2;
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: v */
    public static final Object m6328v(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: w */
    public static final boolean m6329w() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            String format = String.format("fb%s://applinks", Arrays.copyOf(new Object[]{C0115o.m211b()}, 1));
            C24362h.m61210e(format, "java.lang.String.format(format, *args)");
            intent.setData(Uri.parse(format));
            Context a = C0115o.m210a();
            PackageManager packageManager = a.getPackageManager();
            String packageName = a.getPackageName();
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, SQLiteDatabase.OPEN_FULLMUTEX);
            C24362h.m61210e(queryIntentActivities, "packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                if (C24362h.m61206a(packageName, resolveInfo.activityInfo.packageName)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: x */
    public static final boolean m6330x(Context context) {
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String str = Build.DEVICE;
        if (str == null || !new Regex(".+_cheets|cheets_.+").mo60283b(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    public static final boolean m6331y() {
        Class<C2397f0> cls = C2397f0.class;
        if (C6606a.m15601b(cls)) {
            return false;
        }
        try {
            JSONObject o = m6321o();
            if (o == null) {
                return false;
            }
            try {
                JSONArray jSONArray = o.getJSONArray("data_processing_options");
                int length = jSONArray.length();
                if (length > 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        String string = jSONArray.getString(i);
                        C24362h.m61210e(string, "options.getString(i)");
                        String lowerCase = string.toLowerCase();
                        C24362h.m61210e(lowerCase, "(this as java.lang.String).toLowerCase()");
                        if (C24362h.m61206a(lowerCase, "ldu")) {
                            return true;
                        }
                        if (i2 >= length) {
                            break;
                        }
                        i = i2;
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return false;
        }
    }

    /* renamed from: z */
    public static boolean m6332z(Context context) {
        Method s = m6325s("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (s == null) {
            return false;
        }
        Object v = m6328v((Object) null, s, context);
        if (!(v instanceof Integer) || !C24362h.m61206a(v, 0)) {
            return false;
        }
        return true;
    }
}
