package p382be;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;

/* renamed from: be.p */
public final class C13608p {

    /* renamed from: a */
    public final SharedPreferences f33575a;

    /* renamed from: b */
    public final Logger f33576b = new Logger("StorageHelpers", new String[0]);

    public C13608p(Context context, String str) {
        Preconditions.checkNotNull(context);
        String checkNotEmpty = Preconditions.checkNotEmpty(str);
        this.f33575a = context.getApplicationContext().getSharedPreferences(String.format("com.google.firebase.auth.api.Store.%s", new Object[]{checkNotEmpty}), 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0129, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c5 A[SYNTHETIC, Splitter:B:33:0x00c5] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0129 A[ExcHandler: zzpz | ArrayIndexOutOfBoundsException | IllegalArgumentException (e java.lang.Throwable), Splitter:B:1:0x000a] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.firebase.auth.internal.zzx mo40505a(org.json.JSONObject r26) {
        /*
            r25 = this;
            r0 = r26
            java.lang.String r1 = "enrollmentTimestamp"
            java.lang.String r2 = "userMultiFactorInfo"
            java.lang.String r3 = "userMetadata"
            java.lang.String r5 = "cachedTokenState"
            java.lang.String r5 = r0.getString(r5)     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            java.lang.String r6 = "applicationName"
            java.lang.String r6 = r0.getString(r6)     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            java.lang.String r7 = "anonymous"
            boolean r7 = r0.getBoolean(r7)     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            java.lang.String r8 = "2"
            java.lang.String r9 = "version"
            java.lang.String r9 = r0.getString(r9)     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            if (r9 == 0) goto L_0x0025
            r8 = r9
        L_0x0025:
            java.lang.String r9 = "userInfos"
            org.json.JSONArray r9 = r0.getJSONArray(r9)     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            int r10 = r9.length()     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            r11.<init>(r10)     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            r13 = 0
        L_0x0035:
            java.lang.String r14 = "displayName"
            java.lang.String r15 = "phoneNumber"
            if (r13 >= r10) goto L_0x0084
            java.lang.String r12 = r9.getString(r13)     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x007d, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            r4.<init>(r12)     // Catch:{ JSONException -> 0x007d, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            java.lang.String r12 = "userId"
            java.lang.String r17 = r4.optString(r12)     // Catch:{ JSONException -> 0x007d, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            java.lang.String r12 = "providerId"
            java.lang.String r18 = r4.optString(r12)     // Catch:{ JSONException -> 0x007d, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            java.lang.String r12 = "email"
            java.lang.String r19 = r4.optString(r12)     // Catch:{ JSONException -> 0x007d, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            java.lang.String r20 = r4.optString(r15)     // Catch:{ JSONException -> 0x007d, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            java.lang.String r21 = r4.optString(r14)     // Catch:{ JSONException -> 0x007d, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            java.lang.String r12 = "photoUrl"
            java.lang.String r22 = r4.optString(r12)     // Catch:{ JSONException -> 0x007d, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            java.lang.String r12 = "isEmailVerified"
            boolean r23 = r4.optBoolean(r12)     // Catch:{ JSONException -> 0x007d, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            java.lang.String r12 = "rawUserInfo"
            java.lang.String r24 = r4.optString(r12)     // Catch:{ JSONException -> 0x007d, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            com.google.firebase.auth.internal.zzt r4 = new com.google.firebase.auth.internal.zzt     // Catch:{ JSONException -> 0x007d, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            r16 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ JSONException -> 0x007d, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            r11.add(r4)     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            int r13 = r13 + 1
            goto L_0x0035
        L_0x007d:
            r0 = move-exception
            com.google.android.gms.internal.firebase-auth-api.zzpz r1 = new com.google.android.gms.internal.firebase-auth-api.zzpz     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            throw r1     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
        L_0x0084:
            qd.d r4 = p743qd.C19107d.m46266e(r6)     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            com.google.firebase.auth.internal.zzx r6 = new com.google.firebase.auth.internal.zzx     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            r6.<init>(r4, r11)     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            if (r4 != 0) goto L_0x009a
            com.google.android.gms.internal.firebase-auth-api.zzza r4 = com.google.android.gms.internal.p986firebaseauthapi.zzza.zzd(r5)     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            r6.mo43288r2(r4)     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
        L_0x009a:
            if (r7 != 0) goto L_0x00a0
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            r6.f36457i = r4     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
        L_0x00a0:
            r6.f36456h = r8     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            boolean r4 = r0.has(r3)     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            if (r4 == 0) goto L_0x00c7
            org.json.JSONObject r3 = r0.getJSONObject(r3)     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            if (r3 != 0) goto L_0x00af
            goto L_0x00c2
        L_0x00af:
            java.lang.String r4 = "lastSignInTimestamp"
            long r4 = r3.getLong(r4)     // Catch:{ JSONException -> 0x00c1, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            java.lang.String r7 = "creationTimestamp"
            long r7 = r3.getLong(r7)     // Catch:{ JSONException -> 0x00c1, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            com.google.firebase.auth.internal.zzz r3 = new com.google.firebase.auth.internal.zzz     // Catch:{ JSONException -> 0x00c1, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            r3.<init>(r4, r7)     // Catch:{ JSONException -> 0x00c1, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            goto L_0x00c3
        L_0x00c1:
        L_0x00c2:
            r3 = 0
        L_0x00c3:
            if (r3 == 0) goto L_0x00c7
            r6.f36458j = r3     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
        L_0x00c7:
            boolean r3 = r0.has(r2)     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            if (r3 == 0) goto L_0x0128
            org.json.JSONArray r0 = r0.getJSONArray(r2)     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            if (r0 == 0) goto L_0x0128
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            r2.<init>()     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            r12 = 0
        L_0x00d9:
            int r3 = r0.length()     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            if (r12 >= r3) goto L_0x0125
            java.lang.String r3 = r0.getString(r12)     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            r4.<init>(r3)     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            java.lang.String r3 = "phone"
            java.lang.String r5 = "factorIdKey"
            java.lang.String r5 = r4.optString(r5)     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            boolean r3 = r3.equals(r5)     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            if (r3 == 0) goto L_0x011e
            boolean r3 = r4.has(r1)     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            if (r3 == 0) goto L_0x0116
            java.lang.String r3 = "uid"
            java.lang.String r17 = r4.optString(r3)     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            java.lang.String r18 = r4.optString(r14)     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            long r19 = r4.optLong(r1)     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            java.lang.String r21 = r4.optString(r15)     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            com.google.firebase.auth.PhoneMultiFactorInfo r3 = new com.google.firebase.auth.PhoneMultiFactorInfo     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            r16 = r3
            r16.<init>(r17, r18, r19, r21)     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            goto L_0x011f
        L_0x0116:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            java.lang.String r1 = "An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance."
            r0.<init>(r1)     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            throw r0     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
        L_0x011e:
            r3 = 0
        L_0x011f:
            r2.add(r3)     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
            int r12 = r12 + 1
            goto L_0x00d9
        L_0x0125:
            r6.mo43289s2(r2)     // Catch:{ JSONException -> 0x012f, ArrayIndexOutOfBoundsException -> 0x012d, IllegalArgumentException -> 0x012b, zzpz -> 0x0129 }
        L_0x0128:
            return r6
        L_0x0129:
            r0 = move-exception
            goto L_0x0130
        L_0x012b:
            r0 = move-exception
            goto L_0x0130
        L_0x012d:
            r0 = move-exception
            goto L_0x0130
        L_0x012f:
            r0 = move-exception
        L_0x0130:
            r1 = r25
            com.google.android.gms.common.logging.Logger r2 = r1.f33576b
            r2.wtf(r0)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p382be.C13608p.mo40505a(org.json.JSONObject):com.google.firebase.auth.internal.zzx");
    }
}
