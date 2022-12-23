package p428cv;

import k40.C5478b;

/* renamed from: cv.h */
public final class C16507h extends C5478b<C16506g, C16507h> {

    /* renamed from: f */
    public String f43107f = null;

    /* renamed from: g */
    public String f43108g = null;

    /* renamed from: h */
    public String f43109h = null;

    /* renamed from: i */
    public String f43110i = null;

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007f  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21363d(p906wz.C20431c r3, org.json.JSONObject r4) throws org.json.JSONException, java.io.IOException, com.moovit.commons.request.BadResponseException {
        /*
            r2 = this;
            cv.g r3 = (p428cv.C16506g) r3
            r4.toString()
            java.lang.String r3 = "responseObject"
            boolean r0 = r4.has(r3)
            r1 = 0
            if (r0 == 0) goto L_0x0013
            org.json.JSONObject r3 = r4.getJSONObject(r3)
            goto L_0x0014
        L_0x0013:
            r3 = r1
        L_0x0014:
            if (r3 != 0) goto L_0x0018
            goto L_0x008f
        L_0x0018:
            java.lang.String r4 = "paymentMethodToken"
            boolean r0 = r3.has(r4)
            if (r0 == 0) goto L_0x0026
            java.lang.String r4 = r3.getString(r4)
            r2.f43107f = r4
        L_0x0026:
            java.lang.String r4 = "lastFourDigits"
            boolean r0 = r3.has(r4)
            if (r0 == 0) goto L_0x0034
            java.lang.String r4 = r3.getString(r4)
            r2.f43108g = r4
        L_0x0034:
            java.lang.String r4 = "expirationMonth"
            boolean r0 = r3.has(r4)
            if (r0 == 0) goto L_0x0042
            java.lang.String r4 = r3.getString(r4)
            r2.f43109h = r4
        L_0x0042:
            java.lang.String r4 = "expirationYear"
            boolean r0 = r3.has(r4)
            if (r0 == 0) goto L_0x0050
            java.lang.String r4 = r3.getString(r4)
            r2.f43110i = r4
        L_0x0050:
            boolean r4 = r2.mo49299e()
            if (r4 != 0) goto L_0x008f
            java.lang.String r4 = "errorMessage"
            java.lang.String r4 = r3.getString(r4)     // Catch:{ JSONException -> 0x0065 }
            java.lang.String r0 = "responseErrorCode"
            java.lang.String r1 = r3.getString(r0)     // Catch:{ JSONException -> 0x0063 }
            goto L_0x006a
        L_0x0063:
            r3 = move-exception
            goto L_0x0067
        L_0x0065:
            r3 = move-exception
            r4 = r1
        L_0x0067:
            r3.printStackTrace()
        L_0x006a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            if (r4 == 0) goto L_0x0072
            goto L_0x0074
        L_0x0072:
            java.lang.String r4 = "failed add credit card."
        L_0x0074:
            r3.append(r4)
            java.lang.String r4 = " responseErrorCode: "
            r3.append(r4)
            if (r1 == 0) goto L_0x007f
            goto L_0x0081
        L_0x007f:
            java.lang.String r1 = "unknown"
        L_0x0081:
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            de.f r4 = p435de.C16596f.m42113a()
            r4.mo49363b(r3)
        L_0x008f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p428cv.C16507h.mo21363d(wz.c, org.json.JSONObject):void");
    }

    /* renamed from: e */
    public final boolean mo49299e() {
        return (this.f43107f == null || this.f43108g == null || this.f43109h == null || this.f43110i == null) ? false : true;
    }
}
