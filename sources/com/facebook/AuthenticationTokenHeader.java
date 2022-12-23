package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.C2400g0;
import kotlin.Metadata;
import mf0.C24362h;
import org.json.JSONObject;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/facebook/AuthenticationTokenHeader;", "Landroid/os/Parcelable;", "facebook-core_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public final class AuthenticationTokenHeader implements Parcelable {
    public static final Parcelable.Creator<AuthenticationTokenHeader> CREATOR = new C2273a();

    /* renamed from: b */
    public final String f8389b;

    /* renamed from: c */
    public final String f8390c;

    /* renamed from: d */
    public final String f8391d;

    /* renamed from: com.facebook.AuthenticationTokenHeader$a */
    public static final class C2273a implements Parcelable.Creator<AuthenticationTokenHeader> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "source");
            return new AuthenticationTokenHeader(parcel);
        }

        public final Object[] newArray(int i) {
            return new AuthenticationTokenHeader[i];
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006e, code lost:
        if (r7 != false) goto L_0x0072;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AuthenticationTokenHeader(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.String r0 = "typ"
            java.lang.String r1 = "kid"
            java.lang.String r2 = "alg"
            java.lang.String r3 = "encodedHeaderString"
            mf0.C24362h.m61211f(r11, r3)
            r10.<init>()
            com.facebook.internal.C2400g0.m6339d(r11, r3)
            r3 = 0
            byte[] r4 = android.util.Base64.decode(r11, r3)
            java.lang.String r5 = "decodedBytes"
            mf0.C24362h.m61210e(r4, r5)
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r7 = uh0.C25072a.f63272a
            r6.<init>(r4, r7)
            r4 = 1
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0071 }
            r7.<init>(r6)     // Catch:{ JSONException -> 0x0071 }
            java.lang.String r6 = r7.optString(r2)     // Catch:{ JSONException -> 0x0071 }
            mf0.C24362h.m61210e(r6, r2)     // Catch:{ JSONException -> 0x0071 }
            int r8 = r6.length()     // Catch:{ JSONException -> 0x0071 }
            if (r8 <= 0) goto L_0x0038
            r8 = 1
            goto L_0x0039
        L_0x0038:
            r8 = 0
        L_0x0039:
            if (r8 == 0) goto L_0x0045
            java.lang.String r8 = "RS256"
            boolean r6 = mf0.C24362h.m61206a(r6, r8)     // Catch:{ JSONException -> 0x0071 }
            if (r6 == 0) goto L_0x0045
            r6 = 1
            goto L_0x0046
        L_0x0045:
            r6 = 0
        L_0x0046:
            java.lang.String r8 = r7.optString(r1)     // Catch:{ JSONException -> 0x0071 }
            java.lang.String r9 = "jsonObj.optString(\"kid\")"
            mf0.C24362h.m61210e(r8, r9)     // Catch:{ JSONException -> 0x0071 }
            int r8 = r8.length()     // Catch:{ JSONException -> 0x0071 }
            if (r8 <= 0) goto L_0x0057
            r8 = 1
            goto L_0x0058
        L_0x0057:
            r8 = 0
        L_0x0058:
            java.lang.String r7 = r7.optString(r0)     // Catch:{ JSONException -> 0x0071 }
            java.lang.String r9 = "jsonObj.optString(\"typ\")"
            mf0.C24362h.m61210e(r7, r9)     // Catch:{ JSONException -> 0x0071 }
            int r7 = r7.length()     // Catch:{ JSONException -> 0x0071 }
            if (r7 <= 0) goto L_0x0069
            r7 = 1
            goto L_0x006a
        L_0x0069:
            r7 = 0
        L_0x006a:
            if (r6 == 0) goto L_0x0071
            if (r8 == 0) goto L_0x0071
            if (r7 == 0) goto L_0x0071
            goto L_0x0072
        L_0x0071:
            r4 = 0
        L_0x0072:
            if (r4 == 0) goto L_0x00a9
            byte[] r11 = android.util.Base64.decode(r11, r3)
            mf0.C24362h.m61210e(r11, r5)
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = uh0.C25072a.f63272a
            r3.<init>(r11, r4)
            org.json.JSONObject r11 = new org.json.JSONObject
            r11.<init>(r3)
            java.lang.String r2 = r11.getString(r2)
            java.lang.String r3 = "jsonObj.getString(\"alg\")"
            mf0.C24362h.m61210e(r2, r3)
            r10.f8389b = r2
            java.lang.String r0 = r11.getString(r0)
            java.lang.String r2 = "jsonObj.getString(\"typ\")"
            mf0.C24362h.m61210e(r0, r2)
            r10.f8390c = r0
            java.lang.String r11 = r11.getString(r1)
            java.lang.String r0 = "jsonObj.getString(\"kid\")"
            mf0.C24362h.m61210e(r11, r0)
            r10.f8391d = r11
            return
        L_0x00a9:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid Header"
            java.lang.String r0 = r0.toString()
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.AuthenticationTokenHeader.<init>(java.lang.String):void");
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticationTokenHeader)) {
            return false;
        }
        AuthenticationTokenHeader authenticationTokenHeader = (AuthenticationTokenHeader) obj;
        if (!C24362h.m61206a(this.f8389b, authenticationTokenHeader.f8389b) || !C24362h.m61206a(this.f8390c, authenticationTokenHeader.f8390c) || !C24362h.m61206a(this.f8391d, authenticationTokenHeader.f8391d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f8391d.hashCode() + C13715c.m34238d(this.f8390c, C13715c.m34238d(this.f8389b, 527, 31), 31);
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", this.f8389b);
        jSONObject.put("typ", this.f8390c);
        jSONObject.put("kid", this.f8391d);
        String jSONObject2 = jSONObject.toString();
        C24362h.m61210e(jSONObject2, "headerJsonObject.toString()");
        return jSONObject2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "dest");
        parcel.writeString(this.f8389b);
        parcel.writeString(this.f8390c);
        parcel.writeString(this.f8391d);
    }

    public AuthenticationTokenHeader(Parcel parcel) {
        C24362h.m61211f(parcel, "parcel");
        String readString = parcel.readString();
        C2400g0.m6341f(readString, "alg");
        this.f8389b = readString;
        String readString2 = parcel.readString();
        C2400g0.m6341f(readString2, "typ");
        this.f8390c = readString2;
        String readString3 = parcel.readString();
        C2400g0.m6341f(readString3, "kid");
        this.f8391d = readString3;
    }
}
