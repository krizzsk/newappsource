package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.C2400g0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import mf0.C24361g;
import mf0.C24362h;
import mf0.C24368m;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, mo59060d2 = {"Lcom/facebook/AuthenticationTokenClaims;", "Landroid/os/Parcelable;", "b", "facebook-core_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public final class AuthenticationTokenClaims implements Parcelable {
    public static final Parcelable.Creator<AuthenticationTokenClaims> CREATOR = new C2271a();

    /* renamed from: b */
    public final String f8369b;

    /* renamed from: c */
    public final String f8370c;

    /* renamed from: d */
    public final String f8371d;

    /* renamed from: e */
    public final String f8372e;

    /* renamed from: f */
    public final long f8373f;

    /* renamed from: g */
    public final long f8374g;

    /* renamed from: h */
    public final String f8375h;

    /* renamed from: i */
    public final String f8376i;

    /* renamed from: j */
    public final String f8377j;

    /* renamed from: k */
    public final String f8378k;

    /* renamed from: l */
    public final String f8379l;

    /* renamed from: m */
    public final String f8380m;

    /* renamed from: n */
    public final String f8381n;

    /* renamed from: o */
    public final Set<String> f8382o;

    /* renamed from: p */
    public final String f8383p;

    /* renamed from: q */
    public final Map<String, Integer> f8384q;

    /* renamed from: r */
    public final Map<String, String> f8385r;

    /* renamed from: s */
    public final Map<String, String> f8386s;

    /* renamed from: t */
    public final String f8387t;

    /* renamed from: u */
    public final String f8388u;

    /* renamed from: com.facebook.AuthenticationTokenClaims$a */
    public static final class C2271a implements Parcelable.Creator<AuthenticationTokenClaims> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "source");
            return new AuthenticationTokenClaims(parcel);
        }

        public final Object[] newArray(int i) {
            return new AuthenticationTokenClaims[i];
        }
    }

    /* renamed from: com.facebook.AuthenticationTokenClaims$b */
    public static final class C2272b {
        /* renamed from: a */
        public static String m6115a(String str, JSONObject jSONObject) {
            if (jSONObject.has(str)) {
                return jSONObject.getString(str);
            }
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x020a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AuthenticationTokenClaims(java.lang.String r17, java.lang.String r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            java.lang.String r3 = "encodedClaims"
            mf0.C24362h.m61211f(r1, r3)
            java.lang.String r4 = "expectedNonce"
            mf0.C24362h.m61211f(r2, r4)
            r16.<init>()
            com.facebook.internal.C2400g0.m6339d(r1, r3)
            r3 = 8
            byte[] r1 = android.util.Base64.decode(r1, r3)
            java.lang.String r3 = "decodedBytes"
            mf0.C24362h.m61210e(r1, r3)
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = uh0.C25072a.f63272a
            r3.<init>(r1, r4)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r3)
            java.lang.String r3 = "jti"
            java.lang.String r4 = r1.optString(r3)
            mf0.C24362h.m61210e(r4, r3)
            int r4 = r4.length()
            if (r4 != 0) goto L_0x003e
            r4 = 1
            goto L_0x003f
        L_0x003e:
            r4 = 0
        L_0x003f:
            java.lang.String r7 = "nonce"
            java.lang.String r8 = "sub"
            java.lang.String r9 = "iat"
            java.lang.String r10 = "exp"
            java.lang.String r11 = "aud"
            java.lang.String r12 = "iss"
            if (r4 == 0) goto L_0x004f
            goto L_0x0107
        L_0x004f:
            java.lang.String r4 = r1.optString(r12)     // Catch:{ MalformedURLException -> 0x0106 }
            mf0.C24362h.m61210e(r4, r12)     // Catch:{ MalformedURLException -> 0x0106 }
            int r13 = r4.length()     // Catch:{ MalformedURLException -> 0x0106 }
            if (r13 != 0) goto L_0x005e
            r13 = 1
            goto L_0x005f
        L_0x005e:
            r13 = 0
        L_0x005f:
            if (r13 != 0) goto L_0x0107
            java.net.URL r13 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0106 }
            r13.<init>(r4)     // Catch:{ MalformedURLException -> 0x0106 }
            java.lang.String r13 = r13.getHost()     // Catch:{ MalformedURLException -> 0x0106 }
            java.lang.String r14 = "facebook.com"
            boolean r13 = mf0.C24362h.m61206a(r13, r14)     // Catch:{ MalformedURLException -> 0x0106 }
            if (r13 != 0) goto L_0x0086
            java.net.URL r13 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0106 }
            r13.<init>(r4)     // Catch:{ MalformedURLException -> 0x0106 }
            java.lang.String r4 = r13.getHost()     // Catch:{ MalformedURLException -> 0x0106 }
            java.lang.String r13 = "www.facebook.com"
            boolean r4 = mf0.C24362h.m61206a(r4, r13)     // Catch:{ MalformedURLException -> 0x0106 }
            if (r4 != 0) goto L_0x0086
            goto L_0x0107
        L_0x0086:
            java.lang.String r4 = r1.optString(r11)
            mf0.C24362h.m61210e(r4, r11)
            int r13 = r4.length()
            if (r13 != 0) goto L_0x0095
            r13 = 1
            goto L_0x0096
        L_0x0095:
            r13 = 0
        L_0x0096:
            if (r13 != 0) goto L_0x0107
            java.lang.String r13 = p009a8.C0115o.m211b()
            boolean r4 = mf0.C24362h.m61206a(r4, r13)
            if (r4 != 0) goto L_0x00a3
            goto L_0x0107
        L_0x00a3:
            java.util.Date r4 = new java.util.Date
            long r13 = r1.optLong(r10)
            r15 = 1000(0x3e8, float:1.401E-42)
            long r5 = (long) r15
            long r13 = r13 * r5
            r4.<init>(r13)
            java.util.Date r13 = new java.util.Date
            r13.<init>()
            boolean r4 = r13.after(r4)
            if (r4 == 0) goto L_0x00bd
            goto L_0x0107
        L_0x00bd:
            long r13 = r1.optLong(r9)
            java.util.Date r4 = new java.util.Date
            long r13 = r13 * r5
            r5 = 600000(0x927c0, double:2.964394E-318)
            long r13 = r13 + r5
            r4.<init>(r13)
            java.util.Date r5 = new java.util.Date
            r5.<init>()
            boolean r4 = r5.after(r4)
            if (r4 == 0) goto L_0x00d8
            goto L_0x0107
        L_0x00d8:
            java.lang.String r4 = r1.optString(r8)
            mf0.C24362h.m61210e(r4, r8)
            int r4 = r4.length()
            if (r4 != 0) goto L_0x00e7
            r4 = 1
            goto L_0x00e8
        L_0x00e7:
            r4 = 0
        L_0x00e8:
            if (r4 == 0) goto L_0x00eb
            goto L_0x0107
        L_0x00eb:
            java.lang.String r4 = r1.optString(r7)
            mf0.C24362h.m61210e(r4, r7)
            int r5 = r4.length()
            if (r5 != 0) goto L_0x00fa
            r5 = 1
            goto L_0x00fb
        L_0x00fa:
            r5 = 0
        L_0x00fb:
            if (r5 != 0) goto L_0x0107
            boolean r2 = mf0.C24362h.m61206a(r4, r2)
            if (r2 != 0) goto L_0x0104
            goto L_0x0107
        L_0x0104:
            r5 = 1
            goto L_0x0108
        L_0x0106:
        L_0x0107:
            r5 = 0
        L_0x0108:
            if (r5 == 0) goto L_0x020a
            java.lang.String r2 = r1.getString(r3)
            java.lang.String r3 = "jsonObj.getString(JSON_KEY_JIT)"
            mf0.C24362h.m61210e(r2, r3)
            r0.f8369b = r2
            java.lang.String r2 = r1.getString(r12)
            java.lang.String r3 = "jsonObj.getString(JSON_KEY_ISS)"
            mf0.C24362h.m61210e(r2, r3)
            r0.f8370c = r2
            java.lang.String r2 = r1.getString(r11)
            java.lang.String r3 = "jsonObj.getString(JSON_KEY_AUD)"
            mf0.C24362h.m61210e(r2, r3)
            r0.f8371d = r2
            java.lang.String r2 = r1.getString(r7)
            java.lang.String r3 = "jsonObj.getString(JSON_KEY_NONCE)"
            mf0.C24362h.m61210e(r2, r3)
            r0.f8372e = r2
            long r2 = r1.getLong(r10)
            r0.f8373f = r2
            long r2 = r1.getLong(r9)
            r0.f8374g = r2
            java.lang.String r2 = r1.getString(r8)
            java.lang.String r3 = "jsonObj.getString(JSON_KEY_SUB)"
            mf0.C24362h.m61210e(r2, r3)
            r0.f8375h = r2
            java.lang.String r2 = "name"
            java.lang.String r2 = com.facebook.AuthenticationTokenClaims.C2272b.m6115a(r2, r1)
            r0.f8376i = r2
            java.lang.String r2 = "given_name"
            java.lang.String r2 = com.facebook.AuthenticationTokenClaims.C2272b.m6115a(r2, r1)
            r0.f8377j = r2
            java.lang.String r2 = "middle_name"
            java.lang.String r2 = com.facebook.AuthenticationTokenClaims.C2272b.m6115a(r2, r1)
            r0.f8378k = r2
            java.lang.String r2 = "family_name"
            java.lang.String r2 = com.facebook.AuthenticationTokenClaims.C2272b.m6115a(r2, r1)
            r0.f8379l = r2
            java.lang.String r2 = "email"
            java.lang.String r2 = com.facebook.AuthenticationTokenClaims.C2272b.m6115a(r2, r1)
            r0.f8380m = r2
            java.lang.String r2 = "picture"
            java.lang.String r2 = com.facebook.AuthenticationTokenClaims.C2272b.m6115a(r2, r1)
            r0.f8381n = r2
            java.lang.String r2 = "user_friends"
            org.json.JSONArray r2 = r1.optJSONArray(r2)
            r3 = 0
            if (r2 != 0) goto L_0x0189
            r2 = r3
            goto L_0x01ae
        L_0x0189:
            com.facebook.internal.f0 r4 = com.facebook.internal.C2397f0.f8630a
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            int r5 = r2.length()
            if (r5 <= 0) goto L_0x01aa
            r6 = 0
        L_0x0197:
            int r7 = r6 + 1
            java.lang.String r6 = r2.getString(r6)
            java.lang.String r8 = "jsonArray.getString(i)"
            mf0.C24362h.m61210e(r6, r8)
            r4.add(r6)
            if (r7 < r5) goto L_0x01a8
            goto L_0x01aa
        L_0x01a8:
            r6 = r7
            goto L_0x0197
        L_0x01aa:
            java.util.Set r2 = java.util.Collections.unmodifiableSet(r4)
        L_0x01ae:
            r0.f8382o = r2
            java.lang.String r2 = "user_birthday"
            java.lang.String r2 = com.facebook.AuthenticationTokenClaims.C2272b.m6115a(r2, r1)
            r0.f8383p = r2
            java.lang.String r2 = "user_age_range"
            org.json.JSONObject r2 = r1.optJSONObject(r2)
            if (r2 != 0) goto L_0x01c4
            r2 = r3
            goto L_0x01cc
        L_0x01c4:
            java.util.HashMap r2 = com.facebook.internal.C2397f0.m6314h(r2)
            java.util.Map r2 = java.util.Collections.unmodifiableMap(r2)
        L_0x01cc:
            r0.f8384q = r2
            java.lang.String r2 = "user_hometown"
            org.json.JSONObject r2 = r1.optJSONObject(r2)
            if (r2 != 0) goto L_0x01d9
            r2 = r3
            goto L_0x01e1
        L_0x01d9:
            java.util.HashMap r2 = com.facebook.internal.C2397f0.m6315i(r2)
            java.util.Map r2 = java.util.Collections.unmodifiableMap(r2)
        L_0x01e1:
            r0.f8385r = r2
            java.lang.String r2 = "user_location"
            org.json.JSONObject r2 = r1.optJSONObject(r2)
            if (r2 != 0) goto L_0x01ed
            goto L_0x01f5
        L_0x01ed:
            java.util.HashMap r2 = com.facebook.internal.C2397f0.m6315i(r2)
            java.util.Map r3 = java.util.Collections.unmodifiableMap(r2)
        L_0x01f5:
            r0.f8386s = r3
            java.lang.String r2 = "user_gender"
            java.lang.String r2 = com.facebook.AuthenticationTokenClaims.C2272b.m6115a(r2, r1)
            r0.f8387t = r2
            java.lang.String r2 = "user_link"
            java.lang.String r1 = com.facebook.AuthenticationTokenClaims.C2272b.m6115a(r2, r1)
            r0.f8388u = r1
            return
        L_0x020a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Invalid claims"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.AuthenticationTokenClaims.<init>(java.lang.String, java.lang.String):void");
    }

    /* renamed from: b */
    public final JSONObject mo11859b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jti", this.f8369b);
        jSONObject.put("iss", this.f8370c);
        jSONObject.put("aud", this.f8371d);
        jSONObject.put("nonce", this.f8372e);
        jSONObject.put("exp", this.f8373f);
        jSONObject.put("iat", this.f8374g);
        String str = this.f8375h;
        if (str != null) {
            jSONObject.put("sub", str);
        }
        String str2 = this.f8376i;
        if (str2 != null) {
            jSONObject.put("name", str2);
        }
        String str3 = this.f8377j;
        if (str3 != null) {
            jSONObject.put("given_name", str3);
        }
        String str4 = this.f8378k;
        if (str4 != null) {
            jSONObject.put("middle_name", str4);
        }
        String str5 = this.f8379l;
        if (str5 != null) {
            jSONObject.put("family_name", str5);
        }
        String str6 = this.f8380m;
        if (str6 != null) {
            jSONObject.put("email", str6);
        }
        String str7 = this.f8381n;
        if (str7 != null) {
            jSONObject.put("picture", str7);
        }
        if (this.f8382o != null) {
            jSONObject.put("user_friends", new JSONArray(this.f8382o));
        }
        String str8 = this.f8383p;
        if (str8 != null) {
            jSONObject.put("user_birthday", str8);
        }
        if (this.f8384q != null) {
            jSONObject.put("user_age_range", new JSONObject(this.f8384q));
        }
        if (this.f8385r != null) {
            jSONObject.put("user_hometown", new JSONObject(this.f8385r));
        }
        if (this.f8386s != null) {
            jSONObject.put("user_location", new JSONObject(this.f8386s));
        }
        String str9 = this.f8387t;
        if (str9 != null) {
            jSONObject.put("user_gender", str9);
        }
        String str10 = this.f8388u;
        if (str10 != null) {
            jSONObject.put("user_link", str10);
        }
        return jSONObject;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticationTokenClaims)) {
            return false;
        }
        AuthenticationTokenClaims authenticationTokenClaims = (AuthenticationTokenClaims) obj;
        if (!C24362h.m61206a(this.f8369b, authenticationTokenClaims.f8369b) || !C24362h.m61206a(this.f8370c, authenticationTokenClaims.f8370c) || !C24362h.m61206a(this.f8371d, authenticationTokenClaims.f8371d) || !C24362h.m61206a(this.f8372e, authenticationTokenClaims.f8372e) || this.f8373f != authenticationTokenClaims.f8373f || this.f8374g != authenticationTokenClaims.f8374g || !C24362h.m61206a(this.f8375h, authenticationTokenClaims.f8375h) || !C24362h.m61206a(this.f8376i, authenticationTokenClaims.f8376i) || !C24362h.m61206a(this.f8377j, authenticationTokenClaims.f8377j) || !C24362h.m61206a(this.f8378k, authenticationTokenClaims.f8378k) || !C24362h.m61206a(this.f8379l, authenticationTokenClaims.f8379l) || !C24362h.m61206a(this.f8380m, authenticationTokenClaims.f8380m) || !C24362h.m61206a(this.f8381n, authenticationTokenClaims.f8381n) || !C24362h.m61206a(this.f8382o, authenticationTokenClaims.f8382o) || !C24362h.m61206a(this.f8383p, authenticationTokenClaims.f8383p) || !C24362h.m61206a(this.f8384q, authenticationTokenClaims.f8384q) || !C24362h.m61206a(this.f8385r, authenticationTokenClaims.f8385r) || !C24362h.m61206a(this.f8386s, authenticationTokenClaims.f8386s) || !C24362h.m61206a(this.f8387t, authenticationTokenClaims.f8387t) || !C24362h.m61206a(this.f8388u, authenticationTokenClaims.f8388u)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i11;
        int i12;
        int i13;
        int d = C13715c.m34238d(this.f8372e, C13715c.m34238d(this.f8371d, C13715c.m34238d(this.f8370c, C13715c.m34238d(this.f8369b, 527, 31), 31), 31), 31);
        long j = this.f8373f;
        long j2 = this.f8374g;
        int d2 = C13715c.m34238d(this.f8375h, (((d + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31);
        String str = this.f8376i;
        int i14 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i15 = (d2 + i) * 31;
        String str2 = this.f8377j;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i16 = (i15 + i2) * 31;
        String str3 = this.f8378k;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        int i17 = (i16 + i3) * 31;
        String str4 = this.f8379l;
        if (str4 == null) {
            i4 = 0;
        } else {
            i4 = str4.hashCode();
        }
        int i18 = (i17 + i4) * 31;
        String str5 = this.f8380m;
        if (str5 == null) {
            i5 = 0;
        } else {
            i5 = str5.hashCode();
        }
        int i19 = (i18 + i5) * 31;
        String str6 = this.f8381n;
        if (str6 == null) {
            i6 = 0;
        } else {
            i6 = str6.hashCode();
        }
        int i21 = (i19 + i6) * 31;
        Set<String> set = this.f8382o;
        if (set == null) {
            i7 = 0;
        } else {
            i7 = set.hashCode();
        }
        int i22 = (i21 + i7) * 31;
        String str7 = this.f8383p;
        if (str7 == null) {
            i8 = 0;
        } else {
            i8 = str7.hashCode();
        }
        int i23 = (i22 + i8) * 31;
        Map<String, Integer> map = this.f8384q;
        if (map == null) {
            i9 = 0;
        } else {
            i9 = map.hashCode();
        }
        int i24 = (i23 + i9) * 31;
        Map<String, String> map2 = this.f8385r;
        if (map2 == null) {
            i11 = 0;
        } else {
            i11 = map2.hashCode();
        }
        int i25 = (i24 + i11) * 31;
        Map<String, String> map3 = this.f8386s;
        if (map3 == null) {
            i12 = 0;
        } else {
            i12 = map3.hashCode();
        }
        int i26 = (i25 + i12) * 31;
        String str8 = this.f8387t;
        if (str8 == null) {
            i13 = 0;
        } else {
            i13 = str8.hashCode();
        }
        int i27 = (i26 + i13) * 31;
        String str9 = this.f8388u;
        if (str9 != null) {
            i14 = str9.hashCode();
        }
        return i27 + i14;
    }

    public final String toString() {
        String jSONObject = mo11859b().toString();
        C24362h.m61210e(jSONObject, "claimsJsonObject.toString()");
        return jSONObject;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "dest");
        parcel.writeString(this.f8369b);
        parcel.writeString(this.f8370c);
        parcel.writeString(this.f8371d);
        parcel.writeString(this.f8372e);
        parcel.writeLong(this.f8373f);
        parcel.writeLong(this.f8374g);
        parcel.writeString(this.f8375h);
        parcel.writeString(this.f8376i);
        parcel.writeString(this.f8377j);
        parcel.writeString(this.f8378k);
        parcel.writeString(this.f8379l);
        parcel.writeString(this.f8380m);
        parcel.writeString(this.f8381n);
        if (this.f8382o == null) {
            parcel.writeStringList((List) null);
        } else {
            parcel.writeStringList(new ArrayList(this.f8382o));
        }
        parcel.writeString(this.f8383p);
        parcel.writeMap(this.f8384q);
        parcel.writeMap(this.f8385r);
        parcel.writeMap(this.f8386s);
        parcel.writeString(this.f8387t);
        parcel.writeString(this.f8388u);
    }

    public AuthenticationTokenClaims(Parcel parcel) {
        Class<C24368m> cls = C24368m.class;
        C24362h.m61211f(parcel, "parcel");
        String readString = parcel.readString();
        C2400g0.m6341f(readString, "jti");
        this.f8369b = readString;
        String readString2 = parcel.readString();
        C2400g0.m6341f(readString2, "iss");
        this.f8370c = readString2;
        String readString3 = parcel.readString();
        C2400g0.m6341f(readString3, "aud");
        this.f8371d = readString3;
        String readString4 = parcel.readString();
        C2400g0.m6341f(readString4, "nonce");
        this.f8372e = readString4;
        this.f8373f = parcel.readLong();
        this.f8374g = parcel.readLong();
        String readString5 = parcel.readString();
        C2400g0.m6341f(readString5, "sub");
        this.f8375h = readString5;
        this.f8376i = parcel.readString();
        this.f8377j = parcel.readString();
        this.f8378k = parcel.readString();
        this.f8379l = parcel.readString();
        this.f8380m = parcel.readString();
        this.f8381n = parcel.readString();
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        Map<String, String> map = null;
        this.f8382o = createStringArrayList != null ? Collections.unmodifiableSet(new HashSet(createStringArrayList)) : null;
        this.f8383p = parcel.readString();
        HashMap readHashMap = parcel.readHashMap(C24361g.class.getClassLoader());
        readHashMap = !(readHashMap instanceof HashMap) ? null : readHashMap;
        this.f8384q = readHashMap != null ? Collections.unmodifiableMap(readHashMap) : null;
        HashMap readHashMap2 = parcel.readHashMap(cls.getClassLoader());
        readHashMap2 = !(readHashMap2 instanceof HashMap) ? null : readHashMap2;
        this.f8385r = readHashMap2 != null ? Collections.unmodifiableMap(readHashMap2) : null;
        HashMap readHashMap3 = parcel.readHashMap(cls.getClassLoader());
        readHashMap3 = !(readHashMap3 instanceof HashMap) ? null : readHashMap3;
        this.f8386s = readHashMap3 != null ? Collections.unmodifiableMap(readHashMap3) : map;
        this.f8387t = parcel.readString();
        this.f8388u = parcel.readString();
    }
}
