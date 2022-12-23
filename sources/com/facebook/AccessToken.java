package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.internal.C2397f0;
import com.facebook.internal.C2400g0;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.unity3d.ads.metadata.MediationMetaData;
import com.usebutton.sdk.context.Identifiers;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import mf0.C24362h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001a0.C0016g;
import p009a8.C0100e;
import p009a8.C0115o;
import p358af.C13437d;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, mo59060d2 = {"Lcom/facebook/AccessToken;", "Landroid/os/Parcelable;", "a", "c", "facebook-core_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public final class AccessToken implements Parcelable {
    public static final Parcelable.Creator<AccessToken> CREATOR = new C2265b();

    /* renamed from: m */
    public static final Date f8348m = new Date(Long.MAX_VALUE);

    /* renamed from: n */
    public static final Date f8349n = new Date();

    /* renamed from: o */
    public static final AccessTokenSource f8350o = AccessTokenSource.FACEBOOK_APPLICATION_WEB;

    /* renamed from: b */
    public final Date f8351b;

    /* renamed from: c */
    public final Set<String> f8352c;

    /* renamed from: d */
    public final Set<String> f8353d;

    /* renamed from: e */
    public final Set<String> f8354e;

    /* renamed from: f */
    public final String f8355f;

    /* renamed from: g */
    public final AccessTokenSource f8356g;

    /* renamed from: h */
    public final Date f8357h;

    /* renamed from: i */
    public final String f8358i;

    /* renamed from: j */
    public final String f8359j;

    /* renamed from: k */
    public final Date f8360k;

    /* renamed from: l */
    public final String f8361l;

    /* renamed from: com.facebook.AccessToken$a */
    public interface C2264a {
        /* renamed from: a */
        void mo11846a();

        /* renamed from: b */
        void mo11847b();
    }

    /* renamed from: com.facebook.AccessToken$b */
    public static final class C2265b implements Parcelable.Creator<AccessToken> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "source");
            return new AccessToken(parcel);
        }

        public final Object[] newArray(int i) {
            return new AccessToken[i];
        }
    }

    /* renamed from: com.facebook.AccessToken$c */
    public static final class C2266c {
        /* renamed from: a */
        public static AccessToken m6109a(JSONObject jSONObject) throws JSONException {
            ArrayList arrayList;
            if (jSONObject.getInt(MediationMetaData.KEY_VERSION) <= 1) {
                String string = jSONObject.getString(FirebaseMessagingService.EXTRA_TOKEN);
                Date date = new Date(jSONObject.getLong("expires_at"));
                JSONArray jSONArray = jSONObject.getJSONArray("permissions");
                JSONArray jSONArray2 = jSONObject.getJSONArray("declined_permissions");
                JSONArray optJSONArray = jSONObject.optJSONArray("expired_permissions");
                Date date2 = new Date(jSONObject.getLong("last_refresh"));
                String string2 = jSONObject.getString("source");
                C24362h.m61210e(string2, "jsonObject.getString(SOURCE_KEY)");
                AccessTokenSource valueOf = AccessTokenSource.valueOf(string2);
                String string3 = jSONObject.getString("application_id");
                String string4 = jSONObject.getString("user_id");
                Date date3 = new Date(jSONObject.optLong("data_access_expiration_time", 0));
                String optString = jSONObject.optString("graph_domain", (String) null);
                C24362h.m61210e(string, FirebaseMessagingService.EXTRA_TOKEN);
                C24362h.m61210e(string3, "applicationId");
                C24362h.m61210e(string4, "userId");
                C2397f0 f0Var = C2397f0.f8630a;
                C24362h.m61210e(jSONArray, "permissionsArray");
                ArrayList C = C2397f0.m6294C(jSONArray);
                C24362h.m61210e(jSONArray2, "declinedPermissionsArray");
                ArrayList C2 = C2397f0.m6294C(jSONArray2);
                if (optJSONArray == null) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = C2397f0.m6294C(optJSONArray);
                }
                return new AccessToken(string, string3, string4, C, C2, arrayList, valueOf, date, date2, date3, optString);
            }
            throw new FacebookException("Unknown AccessToken serialization format.");
        }

        /* renamed from: b */
        public static AccessToken m6110b() {
            return C0100e.f304f.mo216a().f308c;
        }

        /* renamed from: c */
        public static boolean m6111c() {
            AccessToken accessToken = C0100e.f304f.mo216a().f308c;
            if (accessToken == null || new Date().after(accessToken.f8351b)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.facebook.AccessToken$d */
    public /* synthetic */ class C2267d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8362a;

        static {
            int[] iArr = new int[AccessTokenSource.values().length];
            iArr[AccessTokenSource.FACEBOOK_APPLICATION_WEB.ordinal()] = 1;
            iArr[AccessTokenSource.CHROME_CUSTOM_TAB.ordinal()] = 2;
            iArr[AccessTokenSource.WEB_VIEW.ordinal()] = 3;
            f8362a = iArr;
        }
    }

    public AccessToken(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, AccessTokenSource accessTokenSource, Date date, Date date2, Date date3, String str4) {
        HashSet hashSet;
        HashSet hashSet2;
        HashSet hashSet3;
        Date date4;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        Collection<String> collection4 = collection;
        Collection<String> collection5 = collection2;
        Collection<String> collection6 = collection3;
        String str8 = str4;
        C13437d.m33711q(str, "accessToken", str2, "applicationId", str3, "userId");
        C2400g0.m6339d(str5, "accessToken");
        C2400g0.m6339d(str6, "applicationId");
        C2400g0.m6339d(str7, "userId");
        this.f8351b = date == null ? f8348m : date;
        if (collection4 == null) {
            hashSet = new HashSet();
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        C24362h.m61210e(unmodifiableSet, "unmodifiableSet(if (permissions != null) HashSet(permissions) else HashSet())");
        this.f8352c = unmodifiableSet;
        if (collection5 == null) {
            hashSet2 = new HashSet();
        }
        Set<String> unmodifiableSet2 = Collections.unmodifiableSet(hashSet2);
        C24362h.m61210e(unmodifiableSet2, "unmodifiableSet(\n            if (declinedPermissions != null) HashSet(declinedPermissions) else HashSet())");
        this.f8353d = unmodifiableSet2;
        if (collection6 == null) {
            hashSet3 = new HashSet();
        }
        Set<String> unmodifiableSet3 = Collections.unmodifiableSet(hashSet3);
        C24362h.m61210e(unmodifiableSet3, "unmodifiableSet(\n            if (expiredPermissions != null) HashSet(expiredPermissions) else HashSet())");
        this.f8354e = unmodifiableSet3;
        this.f8355f = str5;
        AccessTokenSource accessTokenSource2 = accessTokenSource == null ? f8350o : accessTokenSource;
        if (str8 != null && str8.equals("instagram")) {
            int i = C2267d.f8362a[accessTokenSource2.ordinal()];
            if (i == 1) {
                accessTokenSource2 = AccessTokenSource.INSTAGRAM_APPLICATION_WEB;
            } else if (i == 2) {
                accessTokenSource2 = AccessTokenSource.INSTAGRAM_CUSTOM_CHROME_TAB;
            } else if (i == 3) {
                accessTokenSource2 = AccessTokenSource.INSTAGRAM_WEB_VIEW;
            }
        }
        this.f8356g = accessTokenSource2;
        this.f8357h = date2 == null ? f8349n : date2;
        this.f8358i = str6;
        this.f8359j = str7;
        if (date3 == null || date3.getTime() == 0) {
            date4 = f8348m;
        } else {
            date4 = date3;
        }
        this.f8360k = date4;
        this.f8361l = str8 == null ? Identifiers.IDENTIFIER_FACEBOOK : str8;
    }

    /* renamed from: b */
    public final JSONObject mo11840b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(MediationMetaData.KEY_VERSION, 1);
        jSONObject.put(FirebaseMessagingService.EXTRA_TOKEN, this.f8355f);
        jSONObject.put("expires_at", this.f8351b.getTime());
        jSONObject.put("permissions", new JSONArray(this.f8352c));
        jSONObject.put("declined_permissions", new JSONArray(this.f8353d));
        jSONObject.put("expired_permissions", new JSONArray(this.f8354e));
        jSONObject.put("last_refresh", this.f8357h.getTime());
        jSONObject.put("source", this.f8356g.name());
        jSONObject.put("application_id", this.f8358i);
        jSONObject.put("user_id", this.f8359j);
        jSONObject.put("data_access_expiration_time", this.f8360k.getTime());
        String str = this.f8361l;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) obj;
        if (C24362h.m61206a(this.f8351b, accessToken.f8351b) && C24362h.m61206a(this.f8352c, accessToken.f8352c) && C24362h.m61206a(this.f8353d, accessToken.f8353d) && C24362h.m61206a(this.f8354e, accessToken.f8354e) && C24362h.m61206a(this.f8355f, accessToken.f8355f) && this.f8356g == accessToken.f8356g && C24362h.m61206a(this.f8357h, accessToken.f8357h) && C24362h.m61206a(this.f8358i, accessToken.f8358i) && C24362h.m61206a(this.f8359j, accessToken.f8359j) && C24362h.m61206a(this.f8360k, accessToken.f8360k)) {
            String str = this.f8361l;
            String str2 = accessToken.f8361l;
            if (str != null) {
                z = C24362h.m61206a(str, str2);
            } else if (str2 == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f8352c.hashCode();
        int hashCode2 = this.f8353d.hashCode();
        int hashCode3 = this.f8354e.hashCode();
        int d = C13715c.m34238d(this.f8355f, (hashCode3 + ((hashCode2 + ((hashCode + ((this.f8351b.hashCode() + 527) * 31)) * 31)) * 31)) * 31, 31);
        int hashCode4 = this.f8357h.hashCode();
        int hashCode5 = (this.f8360k.hashCode() + C13715c.m34238d(this.f8359j, C13715c.m34238d(this.f8358i, (hashCode4 + ((this.f8356g.hashCode() + d) * 31)) * 31, 31), 31)) * 31;
        String str = this.f8361l;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        StringBuilder t = C0016g.m36t("{AccessToken", " token:");
        C0115o oVar = C0115o.f331a;
        C0115o.m218i(LoggingBehavior.INCLUDE_ACCESS_TOKENS);
        t.append("ACCESS_TOKEN_REMOVED");
        t.append(" permissions:");
        t.append("[");
        t.append(TextUtils.join(", ", this.f8352c));
        t.append("]");
        t.append("}");
        String sb = t.toString();
        C24362h.m61210e(sb, "builder.toString()");
        return sb;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "dest");
        parcel.writeLong(this.f8351b.getTime());
        parcel.writeStringList(new ArrayList(this.f8352c));
        parcel.writeStringList(new ArrayList(this.f8353d));
        parcel.writeStringList(new ArrayList(this.f8354e));
        parcel.writeString(this.f8355f);
        parcel.writeString(this.f8356g.name());
        parcel.writeLong(this.f8357h.getTime());
        parcel.writeString(this.f8358i);
        parcel.writeString(this.f8359j);
        parcel.writeLong(this.f8360k.getTime());
        parcel.writeString(this.f8361l);
    }

    public /* synthetic */ AccessToken(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, AccessTokenSource accessTokenSource, Date date, Date date2, Date date3) {
        this(str, str2, str3, collection, collection2, collection3, accessTokenSource, date, date2, date3, Identifiers.IDENTIFIER_FACEBOOK);
    }

    public AccessToken(Parcel parcel) {
        AccessTokenSource accessTokenSource;
        C24362h.m61211f(parcel, "parcel");
        this.f8351b = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        C24362h.m61210e(unmodifiableSet, "unmodifiableSet(HashSet(permissionsList))");
        this.f8352c = unmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        C24362h.m61210e(unmodifiableSet2, "unmodifiableSet(HashSet(permissionsList))");
        this.f8353d = unmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        C24362h.m61210e(unmodifiableSet3, "unmodifiableSet(HashSet(permissionsList))");
        this.f8354e = unmodifiableSet3;
        String readString = parcel.readString();
        C2400g0.m6341f(readString, FirebaseMessagingService.EXTRA_TOKEN);
        this.f8355f = readString;
        String readString2 = parcel.readString();
        if (readString2 != null) {
            accessTokenSource = AccessTokenSource.valueOf(readString2);
        } else {
            accessTokenSource = f8350o;
        }
        this.f8356g = accessTokenSource;
        this.f8357h = new Date(parcel.readLong());
        String readString3 = parcel.readString();
        C2400g0.m6341f(readString3, "applicationId");
        this.f8358i = readString3;
        String readString4 = parcel.readString();
        C2400g0.m6341f(readString4, "userId");
        this.f8359j = readString4;
        this.f8360k = new Date(parcel.readLong());
        this.f8361l = parcel.readString();
    }
}
