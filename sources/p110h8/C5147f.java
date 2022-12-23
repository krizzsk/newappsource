package p110h8;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.C24179b;
import mf0.C24362h;
import org.json.JSONException;
import org.json.JSONObject;
import p009a8.C0115o;
import p262t8.C6606a;

/* renamed from: h8.f */
public final class C5147f {

    /* renamed from: a */
    public static final C5147f f17185a = new C5147f();

    /* renamed from: b */
    public static final HashMap<String, Method> f17186b = new HashMap<>();

    /* renamed from: c */
    public static final HashMap<String, Class<?>> f17187c = new HashMap<>();

    /* renamed from: d */
    public static final String f17188d = C0115o.m210a().getPackageName();

    /* renamed from: e */
    public static final SharedPreferences f17189e = C0115o.m210a().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);

    /* renamed from: f */
    public static final SharedPreferences f17190f = C0115o.m210a().getSharedPreferences("com.facebook.internal.PURCHASE", 0);

    /* renamed from: f */
    public static final ArrayList<String> m13044f(Context context, Object obj) {
        Class<C5147f> cls = C5147f.class;
        if (C6606a.m15601b(cls)) {
            return null;
        }
        try {
            C5147f fVar = f17185a;
            return fVar.mo20868a(fVar.mo20872e(context, obj, "inapp"));
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return null;
        }
    }

    /* renamed from: a */
    public final ArrayList<String> mo20868a(ArrayList<String> arrayList) {
        if (C6606a.m15601b(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList2 = new ArrayList<>();
            SharedPreferences.Editor edit = f17190f.edit();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                try {
                    JSONObject jSONObject = new JSONObject(next);
                    String string = jSONObject.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                    long j = jSONObject.getLong("purchaseTime");
                    String string2 = jSONObject.getString("purchaseToken");
                    if (currentTimeMillis - (j / 1000) <= 86400) {
                        if (!C24362h.m61206a(f17190f.getString(string, ""), string2)) {
                            edit.putString(string, string2);
                            arrayList2.add(next);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
            edit.apply();
            return arrayList2;
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0030 A[Catch:{ ClassNotFoundException -> 0x002c, all -> 0x0027, all -> 0x0036 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Class<?> mo20869b(android.content.Context r4, java.lang.String r5) {
        /*
            r3 = this;
            boolean r0 = p262t8.C6606a.m15601b(r3)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.util.HashMap<java.lang.String, java.lang.Class<?>> r0 = f17187c     // Catch:{ all -> 0x0036 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0036 }
            java.lang.Class r0 = (java.lang.Class) r0     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0013
            return r0
        L_0x0013:
            int r0 = p110h8.C5151j.f17205a     // Catch:{ all -> 0x0036 }
            java.lang.Class<h8.j> r0 = p110h8.C5151j.class
            boolean r2 = p262t8.C6606a.m15601b(r0)     // Catch:{ all -> 0x0036 }
            if (r2 == 0) goto L_0x001e
            goto L_0x002d
        L_0x001e:
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x002c, all -> 0x0027 }
            java.lang.Class r4 = r4.loadClass(r5)     // Catch:{ ClassNotFoundException -> 0x002c, all -> 0x0027 }
            goto L_0x002e
        L_0x0027:
            r4 = move-exception
            p262t8.C6606a.m15600a(r0, r4)     // Catch:{ all -> 0x0036 }
            goto L_0x002d
        L_0x002c:
        L_0x002d:
            r4 = r1
        L_0x002e:
            if (r4 == 0) goto L_0x0035
            java.util.HashMap<java.lang.String, java.lang.Class<?>> r0 = f17187c     // Catch:{ all -> 0x0036 }
            r0.put(r5, r4)     // Catch:{ all -> 0x0036 }
        L_0x0035:
            return r4
        L_0x0036:
            r4 = move-exception
            p262t8.C6606a.m15600a(r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p110h8.C5147f.mo20869b(android.content.Context, java.lang.String):java.lang.Class");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.reflect.Method mo20870c(java.lang.Class<?> r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r1 = p262t8.C6606a.m15601b(r11)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            java.util.HashMap<java.lang.String, java.lang.reflect.Method> r1 = f17186b     // Catch:{ all -> 0x00be }
            java.lang.Object r3 = r1.get(r13)     // Catch:{ all -> 0x00be }
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch:{ all -> 0x00be }
            if (r3 == 0) goto L_0x0015
            return r3
        L_0x0015:
            int r3 = r13.hashCode()     // Catch:{ all -> 0x00be }
            r4 = 4
            r5 = 2
            java.lang.String r6 = "TYPE"
            r7 = 3
            r8 = 0
            r9 = 1
            switch(r3) {
                case -1801122596: goto L_0x0086;
                case -1450694211: goto L_0x006f;
                case -1123215065: goto L_0x005f;
                case -594356707: goto L_0x0041;
                case -573310373: goto L_0x0025;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x009f
        L_0x0025:
            java.lang.String r3 = "getSkuDetails"
            boolean r3 = r13.equals(r3)     // Catch:{ all -> 0x00be }
            if (r3 != 0) goto L_0x002f
            goto L_0x009f
        L_0x002f:
            java.lang.Class[] r3 = new java.lang.Class[r4]     // Catch:{ all -> 0x00be }
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00be }
            mf0.C24362h.m61210e(r4, r6)     // Catch:{ all -> 0x00be }
            r3[r8] = r4     // Catch:{ all -> 0x00be }
            r3[r9] = r0     // Catch:{ all -> 0x00be }
            r3[r5] = r0     // Catch:{ all -> 0x00be }
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            r3[r7] = r0     // Catch:{ all -> 0x00be }
            goto L_0x00a0
        L_0x0041:
            java.lang.String r3 = "getPurchaseHistory"
            boolean r3 = r13.equals(r3)     // Catch:{ all -> 0x00be }
            if (r3 != 0) goto L_0x004a
            goto L_0x009f
        L_0x004a:
            r3 = 5
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch:{ all -> 0x00be }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00be }
            mf0.C24362h.m61210e(r10, r6)     // Catch:{ all -> 0x00be }
            r3[r8] = r10     // Catch:{ all -> 0x00be }
            r3[r9] = r0     // Catch:{ all -> 0x00be }
            r3[r5] = r0     // Catch:{ all -> 0x00be }
            r3[r7] = r0     // Catch:{ all -> 0x00be }
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            r3[r4] = r0     // Catch:{ all -> 0x00be }
            goto L_0x00a0
        L_0x005f:
            java.lang.String r0 = "asInterface"
            boolean r0 = r13.equals(r0)     // Catch:{ all -> 0x00be }
            if (r0 != 0) goto L_0x0068
            goto L_0x009f
        L_0x0068:
            java.lang.Class[] r3 = new java.lang.Class[r9]     // Catch:{ all -> 0x00be }
            java.lang.Class<android.os.IBinder> r0 = android.os.IBinder.class
            r3[r8] = r0     // Catch:{ all -> 0x00be }
            goto L_0x00a0
        L_0x006f:
            java.lang.String r3 = "isBillingSupported"
            boolean r3 = r13.equals(r3)     // Catch:{ all -> 0x00be }
            if (r3 != 0) goto L_0x0078
            goto L_0x009f
        L_0x0078:
            java.lang.Class[] r3 = new java.lang.Class[r7]     // Catch:{ all -> 0x00be }
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00be }
            mf0.C24362h.m61210e(r4, r6)     // Catch:{ all -> 0x00be }
            r3[r8] = r4     // Catch:{ all -> 0x00be }
            r3[r9] = r0     // Catch:{ all -> 0x00be }
            r3[r5] = r0     // Catch:{ all -> 0x00be }
            goto L_0x00a0
        L_0x0086:
            java.lang.String r3 = "getPurchases"
            boolean r3 = r13.equals(r3)     // Catch:{ all -> 0x00be }
            if (r3 != 0) goto L_0x008f
            goto L_0x009f
        L_0x008f:
            java.lang.Class[] r3 = new java.lang.Class[r4]     // Catch:{ all -> 0x00be }
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00be }
            mf0.C24362h.m61210e(r4, r6)     // Catch:{ all -> 0x00be }
            r3[r8] = r4     // Catch:{ all -> 0x00be }
            r3[r9] = r0     // Catch:{ all -> 0x00be }
            r3[r5] = r0     // Catch:{ all -> 0x00be }
            r3[r7] = r0     // Catch:{ all -> 0x00be }
            goto L_0x00a0
        L_0x009f:
            r3 = r2
        L_0x00a0:
            if (r3 != 0) goto L_0x00ab
            java.lang.Class[] r0 = new java.lang.Class[r9]     // Catch:{ all -> 0x00be }
            r0[r8] = r2     // Catch:{ all -> 0x00be }
            java.lang.reflect.Method r12 = p110h8.C5151j.m13065b(r12, r13, r0)     // Catch:{ all -> 0x00be }
            goto L_0x00b8
        L_0x00ab:
            int r0 = p110h8.C5151j.f17205a     // Catch:{ all -> 0x00be }
            int r0 = r3.length     // Catch:{ all -> 0x00be }
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r3, r0)     // Catch:{ all -> 0x00be }
            java.lang.Class[] r0 = (java.lang.Class[]) r0     // Catch:{ all -> 0x00be }
            java.lang.reflect.Method r12 = p110h8.C5151j.m13065b(r12, r13, r0)     // Catch:{ all -> 0x00be }
        L_0x00b8:
            if (r12 == 0) goto L_0x00bd
            r1.put(r13, r12)     // Catch:{ all -> 0x00be }
        L_0x00bd:
            return r12
        L_0x00be:
            r12 = move-exception
            p262t8.C6606a.m15600a(r11, r12)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p110h8.C5147f.mo20870c(java.lang.Class, java.lang.String):java.lang.reflect.Method");
    }

    /* renamed from: d */
    public final ArrayList mo20871d(Context context, Object obj) {
        if (C6606a.m15601b(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (mo20875i(context, obj, "inapp")) {
                char c = 0;
                String str = null;
                int i = 0;
                boolean z = false;
                while (true) {
                    Object[] objArr = new Object[5];
                    objArr[c] = 6;
                    objArr[1] = f17188d;
                    objArr[2] = "inapp";
                    objArr[3] = str;
                    objArr[4] = new Bundle();
                    Object h = mo20874h(context, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj, objArr);
                    if (h != null) {
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        Bundle bundle = (Bundle) h;
                        if (bundle.getInt("RESPONSE_CODE") == 0) {
                            ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                            if (stringArrayList != null) {
                                Iterator<String> it = stringArrayList.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    String next = it.next();
                                    try {
                                        if (currentTimeMillis - (new JSONObject(next).getLong("purchaseTime") / 1000) > 1200) {
                                            z = true;
                                            break;
                                        }
                                        arrayList.add(next);
                                        i++;
                                    } catch (JSONException unused) {
                                    }
                                }
                                str = bundle.getString("INAPP_CONTINUATION_TOKEN");
                                if (i >= 30 || str == null || z) {
                                    break;
                                }
                                c = 0;
                            }
                        }
                    }
                    str = null;
                    c = 0;
                }
            }
            return arrayList;
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0062 A[EDGE_INSN: B:27:0x0062->B:21:0x0062 ?: BREAK  , SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList<java.lang.String> mo20872e(android.content.Context r13, java.lang.Object r14, java.lang.String r15) {
        /*
            r12 = this;
            boolean r0 = p262t8.C6606a.m15601b(r12)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0063 }
            r0.<init>()     // Catch:{ all -> 0x0063 }
            if (r14 != 0) goto L_0x0010
            return r0
        L_0x0010:
            boolean r2 = r12.mo20875i(r13, r14, r15)     // Catch:{ all -> 0x0063 }
            if (r2 == 0) goto L_0x0062
            r2 = 0
            r3 = r1
            r4 = 0
        L_0x0019:
            r5 = 4
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ all -> 0x0063 }
            r5 = 3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0063 }
            r11[r2] = r6     // Catch:{ all -> 0x0063 }
            r6 = 1
            java.lang.String r7 = f17188d     // Catch:{ all -> 0x0063 }
            r11[r6] = r7     // Catch:{ all -> 0x0063 }
            r6 = 2
            r11[r6] = r15     // Catch:{ all -> 0x0063 }
            r11[r5] = r3     // Catch:{ all -> 0x0063 }
            java.lang.String r8 = "com.android.vending.billing.IInAppBillingService"
            java.lang.String r9 = "getPurchases"
            r6 = r12
            r7 = r13
            r10 = r14
            java.lang.Object r3 = r6.mo20874h(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0063 }
            if (r3 == 0) goto L_0x005b
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch:{ all -> 0x0063 }
            java.lang.String r5 = "RESPONSE_CODE"
            int r5 = r3.getInt(r5)     // Catch:{ all -> 0x0063 }
            if (r5 != 0) goto L_0x005b
            java.lang.String r5 = "INAPP_PURCHASE_DATA_LIST"
            java.util.ArrayList r5 = r3.getStringArrayList(r5)     // Catch:{ all -> 0x0063 }
            if (r5 == 0) goto L_0x0062
            int r6 = r5.size()     // Catch:{ all -> 0x0063 }
            int r4 = r4 + r6
            r0.addAll(r5)     // Catch:{ all -> 0x0063 }
            java.lang.String r5 = "INAPP_CONTINUATION_TOKEN"
            java.lang.String r3 = r3.getString(r5)     // Catch:{ all -> 0x0063 }
            goto L_0x005c
        L_0x005b:
            r3 = r1
        L_0x005c:
            r5 = 30
            if (r4 >= r5) goto L_0x0062
            if (r3 != 0) goto L_0x0019
        L_0x0062:
            return r0
        L_0x0063:
            r13 = move-exception
            p262t8.C6606a.m15600a(r12, r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p110h8.C5147f.mo20872e(android.content.Context, java.lang.Object, java.lang.String):java.util.ArrayList");
    }

    /* renamed from: g */
    public final LinkedHashMap mo20873g(Context context, ArrayList arrayList, Object obj, boolean z) {
        String str;
        int size;
        if (C6606a.m15601b(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (obj != null) {
                if (!arrayList.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
                    Object[] objArr = new Object[4];
                    int i = 0;
                    objArr[0] = 3;
                    objArr[1] = f17188d;
                    if (z) {
                        str = "subs";
                    } else {
                        str = "inapp";
                    }
                    objArr[2] = str;
                    objArr[3] = bundle;
                    Object h = mo20874h(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, objArr);
                    if (h != null) {
                        Bundle bundle2 = (Bundle) h;
                        if (bundle2.getInt("RESPONSE_CODE") == 0) {
                            ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                            if (stringArrayList != null && arrayList.size() == stringArrayList.size() && arrayList.size() - 1 >= 0) {
                                while (true) {
                                    int i2 = i + 1;
                                    Object obj2 = arrayList.get(i);
                                    C24362h.m61210e(obj2, "skuList[i]");
                                    String str2 = stringArrayList.get(i);
                                    C24362h.m61210e(str2, "skuDetailsList[i]");
                                    linkedHashMap.put(obj2, str2);
                                    if (i2 > size) {
                                        break;
                                    }
                                    i = i2;
                                }
                            }
                            mo20877k(linkedHashMap);
                        }
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return null;
        }
    }

    /* renamed from: h */
    public final Object mo20874h(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method c;
        if (C6606a.m15601b(this)) {
            return null;
        }
        try {
            Class<?> b = mo20869b(context, str);
            if (b == null || (c = mo20870c(b, str2)) == null) {
                return null;
            }
            int i = C5151j.f17205a;
            return C5151j.m13067d(c, b, obj, Arrays.copyOf(objArr, objArr.length));
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return null;
        }
    }

    /* renamed from: i */
    public final boolean mo20875i(Context context, Object obj, String str) {
        if (C6606a.m15601b(this) || obj == null) {
            return false;
        }
        try {
            Object h = mo20874h(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{3, f17188d, str});
            if (h == null || ((Integer) h).intValue() != 0) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return false;
        }
    }

    /* renamed from: j */
    public final LinkedHashMap mo20876j(ArrayList arrayList) {
        if (C6606a.m15601b(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                String string = f17189e.getString(str, (String) null);
                if (string != null) {
                    List Y = C24179b.m60577Y(string, new String[]{";"}, 2, 2);
                    if (currentTimeMillis - Long.parseLong((String) Y.get(0)) < 43200) {
                        C24362h.m61210e(str, "sku");
                        linkedHashMap.put(str, Y.get(1));
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return null;
        }
    }

    /* renamed from: k */
    public final void mo20877k(LinkedHashMap linkedHashMap) {
        if (!C6606a.m15601b(this)) {
            try {
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                SharedPreferences.Editor edit = f17189e.edit();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    edit.putString((String) entry.getKey(), currentTimeMillis + ';' + ((String) entry.getValue()));
                }
                edit.apply();
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }
}
