package p792sh;

import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import ce0.C21100e;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: sh.a */
public final class C19461a {

    /* renamed from: a */
    public static WindowManager f49487a;

    /* renamed from: b */
    public static String[] f49488b = {"x", "y", "width", "height"};

    /* renamed from: c */
    public static float f49489c = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: a */
    public static JSONObject m46859a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) (((float) i) / f49489c));
            jSONObject.put("y", (double) (((float) i2) / f49489c));
            jSONObject.put("width", (double) (((float) i3) / f49489c));
            jSONObject.put("height", (double) (((float) i4) / f49489c));
        } catch (JSONException unused) {
            C21100e.m49340g("Error with creating viewStateObject");
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static void m46860b(JSONObject jSONObject) {
        float f;
        WindowManager windowManager = f49487a;
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (windowManager != null) {
            Point point = new Point(0, 0);
            f49487a.getDefaultDisplay().getRealSize(point);
            float f3 = f49489c;
            f2 = ((float) point.x) / f3;
            f = ((float) point.y) / f3;
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        try {
            jSONObject.put("width", (double) f2);
            jSONObject.put("height", (double) f);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public static void m46861c(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException unused) {
            C21100e.m49340g("JSONException during JSONObject.put for name [" + str + "]");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m46862d(org.json.JSONObject r9, org.json.JSONObject r10) {
        /*
            r0 = 1
            if (r9 != 0) goto L_0x0006
            if (r10 != 0) goto L_0x0006
            return r0
        L_0x0006:
            r1 = 0
            if (r9 == 0) goto L_0x00e2
            if (r10 != 0) goto L_0x000d
            goto L_0x00e2
        L_0x000d:
            java.lang.String[] r2 = f49488b
            r3 = 0
        L_0x0010:
            r4 = 4
            if (r3 >= r4) goto L_0x0026
            r4 = r2[r3]
            double r5 = r9.optDouble(r4)
            double r7 = r10.optDouble(r4)
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0023
            r2 = 0
            goto L_0x0027
        L_0x0023:
            int r3 = r3 + 1
            goto L_0x0010
        L_0x0026:
            r2 = 1
        L_0x0027:
            if (r2 == 0) goto L_0x00e0
            java.lang.String r2 = "adSessionId"
            java.lang.String r3 = ""
            java.lang.String r4 = r9.optString(r2, r3)
            java.lang.String r2 = r10.optString(r2, r3)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x00e0
            java.lang.String r2 = "hasWindowFocus"
            boolean r4 = r9.optBoolean(r2)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r2 = r10.optBoolean(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x00e0
            java.lang.String r2 = "isFriendlyObstructionFor"
            org.json.JSONArray r4 = r9.optJSONArray(r2)
            org.json.JSONArray r2 = r10.optJSONArray(r2)
            if (r4 != 0) goto L_0x0062
            if (r2 != 0) goto L_0x0062
            goto L_0x0096
        L_0x0062:
            if (r4 != 0) goto L_0x0067
            if (r2 != 0) goto L_0x0067
            goto L_0x0076
        L_0x0067:
            if (r4 == 0) goto L_0x0078
            if (r2 != 0) goto L_0x006c
            goto L_0x0078
        L_0x006c:
            int r5 = r4.length()
            int r6 = r2.length()
            if (r5 != r6) goto L_0x0078
        L_0x0076:
            r5 = 1
            goto L_0x0079
        L_0x0078:
            r5 = 0
        L_0x0079:
            if (r5 != 0) goto L_0x007c
            goto L_0x0091
        L_0x007c:
            r5 = 0
        L_0x007d:
            int r6 = r4.length()
            if (r5 >= r6) goto L_0x0096
            java.lang.String r6 = r4.optString(r5, r3)
            java.lang.String r7 = r2.optString(r5, r3)
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0093
        L_0x0091:
            r2 = 0
            goto L_0x0097
        L_0x0093:
            int r5 = r5 + 1
            goto L_0x007d
        L_0x0096:
            r2 = 1
        L_0x0097:
            if (r2 == 0) goto L_0x00e0
            java.lang.String r2 = "childViews"
            org.json.JSONArray r9 = r9.optJSONArray(r2)
            org.json.JSONArray r10 = r10.optJSONArray(r2)
            if (r9 != 0) goto L_0x00a8
            if (r10 != 0) goto L_0x00a8
            goto L_0x00dc
        L_0x00a8:
            if (r9 != 0) goto L_0x00ad
            if (r10 != 0) goto L_0x00ad
            goto L_0x00bc
        L_0x00ad:
            if (r9 == 0) goto L_0x00be
            if (r10 != 0) goto L_0x00b2
            goto L_0x00be
        L_0x00b2:
            int r2 = r9.length()
            int r3 = r10.length()
            if (r2 != r3) goto L_0x00be
        L_0x00bc:
            r2 = 1
            goto L_0x00bf
        L_0x00be:
            r2 = 0
        L_0x00bf:
            if (r2 != 0) goto L_0x00c2
            goto L_0x00d7
        L_0x00c2:
            r2 = 0
        L_0x00c3:
            int r3 = r9.length()
            if (r2 >= r3) goto L_0x00dc
            org.json.JSONObject r3 = r9.optJSONObject(r2)
            org.json.JSONObject r4 = r10.optJSONObject(r2)
            boolean r3 = m46862d(r3, r4)
            if (r3 != 0) goto L_0x00d9
        L_0x00d7:
            r9 = 0
            goto L_0x00dd
        L_0x00d9:
            int r2 = r2 + 1
            goto L_0x00c3
        L_0x00dc:
            r9 = 1
        L_0x00dd:
            if (r9 == 0) goto L_0x00e0
            goto L_0x00e1
        L_0x00e0:
            r0 = 0
        L_0x00e1:
            return r0
        L_0x00e2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p792sh.C19461a.m46862d(org.json.JSONObject, org.json.JSONObject):boolean");
    }
}
