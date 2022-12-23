package p184n8;

import android.util.Patterns;
import com.appboy.models.MessageButton;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.usebutton.sdk.internal.events.Events;
import com.usebutton.sdk.internal.util.DiskLruCache;
import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.collections.C23826d;
import kotlin.text.C24179b;
import mf0.C24362h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p262t8.C6606a;
import uh0.C25072a;

/* renamed from: n8.a */
public final class C5869a {

    /* renamed from: a */
    public static final C5869a f18857a = new C5869a();

    /* renamed from: b */
    public static Map<String, String> f18858b;

    /* renamed from: c */
    public static Map<String, String> f18859c;

    /* renamed from: d */
    public static Map<String, String> f18860d;

    /* renamed from: e */
    public static JSONObject f18861e;

    /* renamed from: f */
    public static boolean f18862f;

    /* renamed from: a */
    public static final float[] m14303a(String str, JSONObject jSONObject) {
        Class<C5869a> cls = C5869a.class;
        if (C6606a.m15601b(cls)) {
            return null;
        }
        try {
            if (!f18862f) {
                return null;
            }
            float[] fArr = new float[30];
            for (int i = 0; i < 30; i++) {
                fArr[i] = 0.0f;
            }
            try {
                String lowerCase = str.toLowerCase();
                C24362h.m61210e(lowerCase, "(this as java.lang.String).toLowerCase()");
                JSONObject jSONObject2 = new JSONObject(jSONObject.optJSONObject(Promotion.ACTION_VIEW).toString());
                String optString = jSONObject.optString("screenname");
                JSONArray jSONArray = new JSONArray();
                C5869a aVar = f18857a;
                aVar.mo21740h(jSONObject2, jSONArray);
                aVar.mo21743k(fArr, aVar.mo21739g(jSONObject2));
                JSONObject b = aVar.mo21736b(jSONObject2);
                if (b == null) {
                    return null;
                }
                C24362h.m61210e(optString, "screenName");
                String jSONObject3 = jSONObject2.toString();
                C24362h.m61210e(jSONObject3, "viewTree.toString()");
                aVar.mo21743k(fArr, aVar.mo21738f(b, jSONArray, optString, jSONObject3, lowerCase));
                return fArr;
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return null;
        }
    }

    /* renamed from: c */
    public static final String m14304c(String str, String str2, String str3) {
        Class<C5869a> cls = C5869a.class;
        if (C6606a.m15601b(cls)) {
            return null;
        }
        try {
            C24362h.m61211f(str2, "activityName");
            String str4 = str3 + " | " + str2 + ", " + str;
            if (str4 != null) {
                String lowerCase = str4.toLowerCase();
                C24362h.m61210e(lowerCase, "(this as java.lang.String).toLowerCase()");
                return lowerCase;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return null;
        }
    }

    /* renamed from: d */
    public static final void m14305d(File file) {
        Class<C5869a> cls = C5869a.class;
        if (!C6606a.m15601b(cls)) {
            try {
                f18861e = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                f18861e = new JSONObject(new String(bArr, C25072a.f63272a));
                try {
                    f18858b = C23826d.m58533X(new Pair("ENGLISH", DiskLruCache.VERSION_1), new Pair("GERMAN", "2"), new Pair("SPANISH", "3"), new Pair("JAPANESE", "4"));
                    f18859c = C23826d.m58533X(new Pair("VIEW_CONTENT", "0"), new Pair("SEARCH", DiskLruCache.VERSION_1), new Pair("ADD_TO_CART", "2"), new Pair("ADD_TO_WISHLIST", "3"), new Pair("INITIATE_CHECKOUT", "4"), new Pair("ADD_PAYMENT_INFO", "5"), new Pair("PURCHASE", "6"), new Pair("LEAD", "7"), new Pair("COMPLETE_REGISTRATION", "8"));
                    f18860d = C23826d.m58533X(new Pair("BUTTON_TEXT", DiskLruCache.VERSION_1), new Pair("PAGE_TITLE", "2"), new Pair("RESOLVED_DOCUMENT_LINK", "3"), new Pair("BUTTON_ID", "4"));
                    f18862f = true;
                } catch (Throwable th) {
                    C6606a.m15600a(cls, th);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public final JSONObject mo21736b(JSONObject jSONObject) {
        if (C6606a.m15601b(this)) {
            return null;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return jSONObject;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            if (optJSONArray == null) {
                return null;
            }
            int i = 0;
            int length = optJSONArray.length();
            if (length > 0) {
                while (true) {
                    int i2 = i + 1;
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    C24362h.m61210e(jSONObject2, "children.getJSONObject(i)");
                    JSONObject b = mo21736b(jSONObject2);
                    if (b != null) {
                        return b;
                    }
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
            return null;
        } catch (JSONException unused) {
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
        }
    }

    /* renamed from: e */
    public final boolean mo21737e(String[] strArr, String[] strArr2) {
        if (C6606a.m15601b(this)) {
            return false;
        }
        try {
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                String str = strArr[i];
                i++;
                int length2 = strArr2.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length2) {
                        String str2 = strArr2[i2];
                        i2++;
                        if (C24179b.m60559G(str2, str, false)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0063 A[Catch:{ JSONException -> 0x0071 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006d A[LOOP:1: B:18:0x003b->B:33:0x006d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0071 A[EDGE_INSN: B:95:0x0071->B:34:0x0071 ?: BREAK  , SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float[] mo21738f(org.json.JSONObject r17, org.json.JSONArray r18, java.lang.String r19, java.lang.String r20, java.lang.String r21) {
        /*
            r16 = this;
            r1 = r16
            r2 = r20
            java.lang.String r3 = "LEAD"
            java.lang.String r4 = "PURCHASE"
            java.lang.String r5 = "PAGE_TITLE"
            java.lang.String r6 = "BUTTON_TEXT"
            java.lang.String r7 = "COMPLETE_REGISTRATION"
            boolean r0 = p262t8.C6606a.m15601b(r16)
            r8 = 0
            if (r0 == 0) goto L_0x0016
            return r8
        L_0x0016:
            r0 = 30
            float[] r9 = new float[r0]     // Catch:{ all -> 0x017a }
            r10 = 0
            r11 = 0
        L_0x001c:
            r12 = 0
            if (r11 >= r0) goto L_0x0024
            r9[r11] = r12     // Catch:{ all -> 0x017a }
            int r11 = r11 + 1
            goto L_0x001c
        L_0x0024:
            int r0 = r18.length()     // Catch:{ all -> 0x017a }
            r11 = 3
            r13 = 1
            r14 = 1065353216(0x3f800000, float:1.0)
            if (r0 <= r13) goto L_0x0031
            float r0 = (float) r0     // Catch:{ all -> 0x017a }
            float r0 = r0 - r14
            goto L_0x0032
        L_0x0031:
            r0 = 0
        L_0x0032:
            r9[r11] = r0     // Catch:{ all -> 0x017a }
            int r11 = r18.length()     // Catch:{ JSONException -> 0x0071 }
            if (r11 <= 0) goto L_0x0071
            r0 = 0
        L_0x003b:
            int r15 = r0 + 1
            r12 = r18
            org.json.JSONObject r0 = r12.getJSONObject(r0)     // Catch:{ JSONException -> 0x0071 }
            java.lang.String r8 = "siblings.getJSONObject(i)"
            mf0.C24362h.m61210e(r0, r8)     // Catch:{ JSONException -> 0x0071 }
            boolean r8 = p262t8.C6606a.m15601b(r16)     // Catch:{ JSONException -> 0x0071 }
            if (r8 == 0) goto L_0x004f
            goto L_0x0060
        L_0x004f:
            java.lang.String r8 = "classtypebitmask"
            int r0 = r0.optInt(r8)     // Catch:{ all -> 0x005c }
            r0 = r0 & r13
            int r0 = r0 << 5
            if (r0 <= 0) goto L_0x0060
            r0 = 1
            goto L_0x0061
        L_0x005c:
            r0 = move-exception
            p262t8.C6606a.m15600a(r1, r0)     // Catch:{ JSONException -> 0x0071 }
        L_0x0060:
            r0 = 0
        L_0x0061:
            if (r0 == 0) goto L_0x006a
            r0 = 9
            r8 = r9[r0]     // Catch:{ JSONException -> 0x0071 }
            float r8 = r8 + r14
            r9[r0] = r8     // Catch:{ JSONException -> 0x0071 }
        L_0x006a:
            if (r15 < r11) goto L_0x006d
            goto L_0x0071
        L_0x006d:
            r0 = r15
            r8 = 0
            r12 = 0
            goto L_0x003b
        L_0x0071:
            r0 = 13
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            r9[r0] = r8     // Catch:{ all -> 0x017a }
            r0 = 14
            r9[r0] = r8     // Catch:{ all -> 0x017a }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x017a }
            r0.<init>()     // Catch:{ all -> 0x017a }
            r8 = r19
            r0.append(r8)     // Catch:{ all -> 0x017a }
            r8 = 124(0x7c, float:1.74E-43)
            r0.append(r8)     // Catch:{ all -> 0x017a }
            r8 = r21
            r0.append(r8)     // Catch:{ all -> 0x017a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x017a }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x017a }
            r8.<init>()     // Catch:{ all -> 0x017a }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x017a }
            r11.<init>()     // Catch:{ all -> 0x017a }
            r12 = r17
            r1.mo21744l(r12, r11, r8)     // Catch:{ all -> 0x017a }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x017a }
            java.lang.String r12 = "hintSB.toString()"
            mf0.C24362h.m61210e(r8, r12)     // Catch:{ all -> 0x017a }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x017a }
            java.lang.String r12 = "textSB.toString()"
            mf0.C24362h.m61210e(r11, r12)     // Catch:{ all -> 0x017a }
            r12 = 15
            boolean r13 = r1.mo21742j(r7, r6, r11)     // Catch:{ all -> 0x017a }
            if (r13 == 0) goto L_0x00c0
            r13 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00c1
        L_0x00c0:
            r13 = 0
        L_0x00c1:
            r9[r12] = r13     // Catch:{ all -> 0x017a }
            r12 = 16
            boolean r13 = r1.mo21742j(r7, r5, r0)     // Catch:{ all -> 0x017a }
            if (r13 == 0) goto L_0x00ce
            r13 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00cf
        L_0x00ce:
            r13 = 0
        L_0x00cf:
            r9[r12] = r13     // Catch:{ all -> 0x017a }
            r12 = 17
            java.lang.String r13 = "BUTTON_ID"
            boolean r7 = r1.mo21742j(r7, r13, r8)     // Catch:{ all -> 0x017a }
            if (r7 == 0) goto L_0x00de
            r7 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00df
        L_0x00de:
            r7 = 0
        L_0x00df:
            r9[r12] = r7     // Catch:{ all -> 0x017a }
            r7 = 18
            java.lang.String r8 = "password"
            boolean r8 = kotlin.text.C24179b.m60559G(r2, r8, r10)     // Catch:{ all -> 0x017a }
            if (r8 == 0) goto L_0x00ee
            r8 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00ef
        L_0x00ee:
            r8 = 0
        L_0x00ef:
            r9[r7] = r8     // Catch:{ all -> 0x017a }
            r7 = 19
            java.lang.String r8 = "(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)"
            boolean r8 = r1.mo21741i(r8, r2)     // Catch:{ all -> 0x017a }
            if (r8 == 0) goto L_0x00fe
            r8 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00ff
        L_0x00fe:
            r8 = 0
        L_0x00ff:
            r9[r7] = r8     // Catch:{ all -> 0x017a }
            r7 = 20
            java.lang.String r8 = "(?i)(sign in)|login|signIn"
            boolean r8 = r1.mo21741i(r8, r2)     // Catch:{ all -> 0x017a }
            if (r8 == 0) goto L_0x010e
            r8 = 1065353216(0x3f800000, float:1.0)
            goto L_0x010f
        L_0x010e:
            r8 = 0
        L_0x010f:
            r9[r7] = r8     // Catch:{ all -> 0x017a }
            r7 = 21
            java.lang.String r8 = "(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)"
            boolean r2 = r1.mo21741i(r8, r2)     // Catch:{ all -> 0x017a }
            if (r2 == 0) goto L_0x011e
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x011f
        L_0x011e:
            r2 = 0
        L_0x011f:
            r9[r7] = r2     // Catch:{ all -> 0x017a }
            r2 = 22
            boolean r7 = r1.mo21742j(r4, r6, r11)     // Catch:{ all -> 0x017a }
            if (r7 == 0) goto L_0x012c
            r7 = 1065353216(0x3f800000, float:1.0)
            goto L_0x012d
        L_0x012c:
            r7 = 0
        L_0x012d:
            r9[r2] = r7     // Catch:{ all -> 0x017a }
            r2 = 24
            boolean r4 = r1.mo21742j(r4, r5, r0)     // Catch:{ all -> 0x017a }
            if (r4 == 0) goto L_0x013a
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L_0x013b
        L_0x013a:
            r4 = 0
        L_0x013b:
            r9[r2] = r4     // Catch:{ all -> 0x017a }
            r2 = 25
            java.lang.String r4 = "(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart"
            boolean r4 = r1.mo21741i(r4, r11)     // Catch:{ all -> 0x017a }
            if (r4 == 0) goto L_0x014a
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L_0x014b
        L_0x014a:
            r4 = 0
        L_0x014b:
            r9[r2] = r4     // Catch:{ all -> 0x017a }
            r2 = 27
            java.lang.String r4 = "(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy"
            boolean r4 = r1.mo21741i(r4, r0)     // Catch:{ all -> 0x017a }
            if (r4 == 0) goto L_0x015a
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L_0x015b
        L_0x015a:
            r4 = 0
        L_0x015b:
            r9[r2] = r4     // Catch:{ all -> 0x017a }
            r2 = 28
            boolean r4 = r1.mo21742j(r3, r6, r11)     // Catch:{ all -> 0x017a }
            if (r4 == 0) goto L_0x0168
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0169
        L_0x0168:
            r4 = 0
        L_0x0169:
            r9[r2] = r4     // Catch:{ all -> 0x017a }
            r2 = 29
            boolean r0 = r1.mo21742j(r3, r5, r0)     // Catch:{ all -> 0x017a }
            if (r0 == 0) goto L_0x0176
            r12 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0177
        L_0x0176:
            r12 = 0
        L_0x0177:
            r9[r2] = r12     // Catch:{ all -> 0x017a }
            return r9
        L_0x017a:
            r0 = move-exception
            p262t8.C6606a.m15600a(r1, r0)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p184n8.C5869a.mo21738f(org.json.JSONObject, org.json.JSONArray, java.lang.String, java.lang.String, java.lang.String):float[]");
    }

    /* renamed from: g */
    public final float[] mo21739g(JSONObject jSONObject) {
        if (C6606a.m15601b(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            int i = 0;
            for (int i2 = 0; i2 < 30; i2++) {
                fArr[i2] = 0.0f;
            }
            String optString = jSONObject.optString(MessageButton.TEXT);
            C24362h.m61210e(optString, "node.optString(TEXT_KEY)");
            String lowerCase = optString.toLowerCase();
            C24362h.m61210e(lowerCase, "(this as java.lang.String).toLowerCase()");
            String optString2 = jSONObject.optString("hint");
            C24362h.m61210e(optString2, "node.optString(HINT_KEY)");
            String lowerCase2 = optString2.toLowerCase();
            C24362h.m61210e(lowerCase2, "(this as java.lang.String).toLowerCase()");
            String optString3 = jSONObject.optString("classname");
            C24362h.m61210e(optString3, "node.optString(CLASS_NAME_KEY)");
            String lowerCase3 = optString3.toLowerCase();
            C24362h.m61210e(lowerCase3, "(this as java.lang.String).toLowerCase()");
            int optInt = jSONObject.optInt("inputtype", -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (mo21737e(new String[]{"$", "amount", InAppPurchaseMetaData.KEY_PRICE, "total"}, strArr)) {
                fArr[0] = fArr[0] + 1.0f;
            }
            if (mo21737e(new String[]{"password", "pwd"}, strArr)) {
                fArr[1] = fArr[1] + 1.0f;
            }
            if (mo21737e(new String[]{"tel", "phone"}, strArr)) {
                fArr[2] = fArr[2] + 1.0f;
            }
            if (mo21737e(new String[]{"search"}, strArr)) {
                fArr[4] = fArr[4] + 1.0f;
            }
            if (optInt >= 0) {
                fArr[5] = fArr[5] + 1.0f;
            }
            if (optInt == 3 || optInt == 2) {
                fArr[6] = fArr[6] + 1.0f;
            }
            if (optInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                fArr[7] = fArr[7] + 1.0f;
            }
            if (C24179b.m60559G(lowerCase3, "checkbox", false)) {
                fArr[8] = fArr[8] + 1.0f;
            }
            if (mo21737e(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
                fArr[10] = fArr[10] + 1.0f;
            }
            if (C24179b.m60559G(lowerCase3, "radio", false) && C24179b.m60559G(lowerCase3, Events.VALUE_TYPE_BUTTON, false)) {
                fArr[12] = fArr[12] + 1.0f;
            }
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
                int length = optJSONArray.length();
                if (length > 0) {
                    while (true) {
                        int i3 = i + 1;
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                        C24362h.m61210e(jSONObject2, "childViews.getJSONObject(i)");
                        mo21743k(fArr, mo21739g(jSONObject2));
                        if (i3 >= length) {
                            break;
                        }
                        i = i3;
                    }
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return null;
        }
    }

    /* renamed from: h */
    public final boolean mo21740h(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z;
        boolean z2;
        if (C6606a.m15601b(this)) {
            return false;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return true;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            int length = optJSONArray.length();
            if (length > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    if (optJSONArray.getJSONObject(i).optBoolean("is_interacted")) {
                        z2 = true;
                        z = true;
                        break;
                    } else if (i2 >= length) {
                        break;
                    } else {
                        i = i2;
                    }
                }
            }
            z2 = false;
            z = false;
            JSONArray jSONArray2 = new JSONArray();
            if (z2) {
                int length2 = optJSONArray.length();
                if (length2 > 0) {
                    int i3 = 0;
                    while (true) {
                        int i4 = i3 + 1;
                        jSONArray.put(optJSONArray.getJSONObject(i3));
                        if (i4 >= length2) {
                            break;
                        }
                        i3 = i4;
                    }
                }
            } else {
                int length3 = optJSONArray.length();
                if (length3 > 0) {
                    int i5 = 0;
                    while (true) {
                        int i6 = i5 + 1;
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i5);
                        C24362h.m61210e(jSONObject2, "child");
                        if (mo21740h(jSONObject2, jSONArray)) {
                            jSONArray2.put(jSONObject2);
                            z = true;
                        }
                        if (i6 >= length3) {
                            break;
                        }
                        i5 = i6;
                    }
                }
                jSONObject.put("childviews", jSONArray2);
            }
            return z;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return false;
        }
    }

    /* renamed from: i */
    public final boolean mo21741i(String str, String str2) {
        if (C6606a.m15601b(this)) {
            return false;
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044 A[Catch:{ all -> 0x007d }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045 A[Catch:{ all -> 0x007d }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005e A[Catch:{ all -> 0x007d }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005f A[Catch:{ all -> 0x007d }] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo21742j(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r5 = this;
            java.lang.String r0 = "ENGLISH"
            boolean r1 = p262t8.C6606a.m15601b(r5)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            org.json.JSONObject r1 = f18861e     // Catch:{ all -> 0x007d }
            r3 = 0
            if (r1 == 0) goto L_0x0077
            java.lang.String r4 = "rulesForLanguage"
            org.json.JSONObject r1 = r1.optJSONObject(r4)     // Catch:{ all -> 0x007d }
            if (r1 != 0) goto L_0x0019
            r0 = r3
            goto L_0x0027
        L_0x0019:
            java.util.Map<java.lang.String, java.lang.String> r4 = f18858b     // Catch:{ all -> 0x007d }
            if (r4 == 0) goto L_0x0071
            java.lang.Object r0 = r4.get(r0)     // Catch:{ all -> 0x007d }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x007d }
            org.json.JSONObject r0 = r1.optJSONObject(r0)     // Catch:{ all -> 0x007d }
        L_0x0027:
            if (r0 != 0) goto L_0x002a
            goto L_0x0032
        L_0x002a:
            java.lang.String r1 = "rulesForEvent"
            org.json.JSONObject r0 = r0.optJSONObject(r1)     // Catch:{ all -> 0x007d }
            if (r0 != 0) goto L_0x0034
        L_0x0032:
            r6 = r3
            goto L_0x0042
        L_0x0034:
            java.util.Map<java.lang.String, java.lang.String> r1 = f18859c     // Catch:{ all -> 0x007d }
            if (r1 == 0) goto L_0x006b
            java.lang.Object r6 = r1.get(r6)     // Catch:{ all -> 0x007d }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x007d }
            org.json.JSONObject r6 = r0.optJSONObject(r6)     // Catch:{ all -> 0x007d }
        L_0x0042:
            if (r6 != 0) goto L_0x0045
            goto L_0x005c
        L_0x0045:
            java.lang.String r0 = "positiveRules"
            org.json.JSONObject r6 = r6.optJSONObject(r0)     // Catch:{ all -> 0x007d }
            if (r6 != 0) goto L_0x004e
            goto L_0x005c
        L_0x004e:
            java.util.Map<java.lang.String, java.lang.String> r0 = f18860d     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x0064
            java.lang.Object r7 = r0.get(r7)     // Catch:{ all -> 0x007d }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x007d }
            java.lang.String r3 = r6.optString(r7)     // Catch:{ all -> 0x007d }
        L_0x005c:
            if (r3 != 0) goto L_0x005f
            goto L_0x0063
        L_0x005f:
            boolean r2 = r5.mo21741i(r3, r8)     // Catch:{ all -> 0x007d }
        L_0x0063:
            return r2
        L_0x0064:
            java.lang.String r6 = "textTypeInfo"
            mf0.C24362h.m61217l(r6)     // Catch:{ all -> 0x007d }
            throw r3     // Catch:{ all -> 0x007d }
        L_0x006b:
            java.lang.String r6 = "eventInfo"
            mf0.C24362h.m61217l(r6)     // Catch:{ all -> 0x007d }
            throw r3     // Catch:{ all -> 0x007d }
        L_0x0071:
            java.lang.String r6 = "languageInfo"
            mf0.C24362h.m61217l(r6)     // Catch:{ all -> 0x007d }
            throw r3     // Catch:{ all -> 0x007d }
        L_0x0077:
            java.lang.String r6 = "rules"
            mf0.C24362h.m61217l(r6)     // Catch:{ all -> 0x007d }
            throw r3     // Catch:{ all -> 0x007d }
        L_0x007d:
            r6 = move-exception
            p262t8.C6606a.m15600a(r5, r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p184n8.C5869a.mo21742j(java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: k */
    public final void mo21743k(float[] fArr, float[] fArr2) {
        if (!C6606a.m15601b(this)) {
            int i = 0;
            try {
                int length = fArr.length - 1;
                if (length >= 0) {
                    while (true) {
                        int i2 = i + 1;
                        fArr[i] = fArr[i] + fArr2[i];
                        if (i2 <= length) {
                            i = i2;
                        } else {
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }

    /* renamed from: l */
    public final void mo21744l(JSONObject jSONObject, StringBuilder sb, StringBuilder sb2) {
        boolean z;
        int length;
        if (!C6606a.m15601b(this)) {
            try {
                String optString = jSONObject.optString(MessageButton.TEXT, "");
                C24362h.m61210e(optString, "view.optString(TEXT_KEY, \"\")");
                String lowerCase = optString.toLowerCase();
                C24362h.m61210e(lowerCase, "(this as java.lang.String).toLowerCase()");
                String optString2 = jSONObject.optString("hint", "");
                C24362h.m61210e(optString2, "view.optString(HINT_KEY, \"\")");
                String lowerCase2 = optString2.toLowerCase();
                C24362h.m61210e(lowerCase2, "(this as java.lang.String).toLowerCase()");
                int i = 0;
                boolean z2 = true;
                if (lowerCase.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    sb.append(lowerCase);
                    sb.append(" ");
                }
                if (lowerCase2.length() <= 0) {
                    z2 = false;
                }
                if (z2) {
                    sb2.append(lowerCase2);
                    sb2.append(" ");
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
                if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
                    while (true) {
                        int i2 = i + 1;
                        try {
                            JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                            C24362h.m61210e(jSONObject2, "currentChildView");
                            mo21744l(jSONObject2, sb, sb2);
                        } catch (JSONException unused) {
                        }
                        if (i2 < length) {
                            i = i2;
                        } else {
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }
}
