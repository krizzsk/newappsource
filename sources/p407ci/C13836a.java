package p407ci;

import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.play.core.appupdate.C14226d;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ci.a */
public final class C13836a {

    /* renamed from: a */
    public static WindowManager f34047a;

    /* renamed from: b */
    public static String[] f34048b = {"x", "y", "width", "height"};

    /* renamed from: c */
    public static float f34049c = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: a */
    public static JSONObject m34518a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) (((float) i) / f34049c));
            jSONObject.put("y", (double) (((float) i2) / f34049c));
            jSONObject.put("width", (double) (((float) i3) / f34049c));
            jSONObject.put("height", (double) (((float) i4) / f34049c));
        } catch (JSONException unused) {
            C14226d.m35347m0("Error with creating viewStateObject");
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static void m34519b(JSONObject jSONObject) {
        float f;
        WindowManager windowManager = f34047a;
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (windowManager != null) {
            Point point = new Point(0, 0);
            f34047a.getDefaultDisplay().getRealSize(point);
            float f3 = f34049c;
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
    public static void m34520c(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException unused) {
            C14226d.m35347m0("JSONException during JSONObject.put for name [" + str + "]");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m34521d(org.json.JSONObject r9, org.json.JSONObject r10) {
        /*
            r0 = 1
            if (r9 != 0) goto L_0x0006
            if (r10 != 0) goto L_0x0006
            return r0
        L_0x0006:
            r1 = 0
            if (r9 == 0) goto L_0x00ca
            if (r10 != 0) goto L_0x000d
            goto L_0x00ca
        L_0x000d:
            java.lang.String[] r2 = f34048b
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
            if (r2 == 0) goto L_0x00c8
            java.lang.String r2 = "adSessionId"
            java.lang.String r3 = ""
            java.lang.String r4 = r9.optString(r2, r3)
            java.lang.String r2 = r10.optString(r2, r3)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x00c8
            java.lang.String r2 = "isFriendlyObstructionFor"
            org.json.JSONArray r4 = r9.optJSONArray(r2)
            org.json.JSONArray r2 = r10.optJSONArray(r2)
            if (r4 != 0) goto L_0x004a
            if (r2 != 0) goto L_0x004a
            goto L_0x007e
        L_0x004a:
            if (r4 != 0) goto L_0x004f
            if (r2 != 0) goto L_0x004f
            goto L_0x005e
        L_0x004f:
            if (r4 == 0) goto L_0x0060
            if (r2 != 0) goto L_0x0054
            goto L_0x0060
        L_0x0054:
            int r5 = r4.length()
            int r6 = r2.length()
            if (r5 != r6) goto L_0x0060
        L_0x005e:
            r5 = 1
            goto L_0x0061
        L_0x0060:
            r5 = 0
        L_0x0061:
            if (r5 != 0) goto L_0x0064
            goto L_0x0079
        L_0x0064:
            r5 = 0
        L_0x0065:
            int r6 = r4.length()
            if (r5 >= r6) goto L_0x007e
            java.lang.String r6 = r4.optString(r5, r3)
            java.lang.String r7 = r2.optString(r5, r3)
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x007b
        L_0x0079:
            r2 = 0
            goto L_0x007f
        L_0x007b:
            int r5 = r5 + 1
            goto L_0x0065
        L_0x007e:
            r2 = 1
        L_0x007f:
            if (r2 == 0) goto L_0x00c8
            java.lang.String r2 = "childViews"
            org.json.JSONArray r9 = r9.optJSONArray(r2)
            org.json.JSONArray r10 = r10.optJSONArray(r2)
            if (r9 != 0) goto L_0x0090
            if (r10 != 0) goto L_0x0090
            goto L_0x00c4
        L_0x0090:
            if (r9 != 0) goto L_0x0095
            if (r10 != 0) goto L_0x0095
            goto L_0x00a4
        L_0x0095:
            if (r9 == 0) goto L_0x00a6
            if (r10 != 0) goto L_0x009a
            goto L_0x00a6
        L_0x009a:
            int r2 = r9.length()
            int r3 = r10.length()
            if (r2 != r3) goto L_0x00a6
        L_0x00a4:
            r2 = 1
            goto L_0x00a7
        L_0x00a6:
            r2 = 0
        L_0x00a7:
            if (r2 != 0) goto L_0x00aa
            goto L_0x00bf
        L_0x00aa:
            r2 = 0
        L_0x00ab:
            int r3 = r9.length()
            if (r2 >= r3) goto L_0x00c4
            org.json.JSONObject r3 = r9.optJSONObject(r2)
            org.json.JSONObject r4 = r10.optJSONObject(r2)
            boolean r3 = m34521d(r3, r4)
            if (r3 != 0) goto L_0x00c1
        L_0x00bf:
            r9 = 0
            goto L_0x00c5
        L_0x00c1:
            int r2 = r2 + 1
            goto L_0x00ab
        L_0x00c4:
            r9 = 1
        L_0x00c5:
            if (r9 == 0) goto L_0x00c8
            goto L_0x00c9
        L_0x00c8:
            r0 = 0
        L_0x00c9:
            return r0
        L_0x00ca:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p407ci.C13836a.m34521d(org.json.JSONObject, org.json.JSONObject):boolean");
    }
}
