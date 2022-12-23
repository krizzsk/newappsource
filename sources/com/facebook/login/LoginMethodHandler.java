package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.GraphRequest;
import com.facebook.HttpMethod;
import com.facebook.appevents.C2338j;
import com.facebook.internal.C2397f0;
import com.facebook.login.LoginClient;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C23826d;
import mf0.C24362h;
import org.json.JSONException;
import org.json.JSONObject;
import p009a8.C0098d0;
import p009a8.C0115o;
import p009a8.C0124u;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, mo59060d2 = {"Lcom/facebook/login/LoginMethodHandler;", "Landroid/os/Parcelable;", "a", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public abstract class LoginMethodHandler implements Parcelable {

    /* renamed from: b */
    public HashMap f8824b;

    /* renamed from: c */
    public LoginClient f8825c;

    /* renamed from: com.facebook.login.LoginMethodHandler$a */
    public static final class C2463a {
        /* renamed from: a */
        public static AccessToken m6487a(Bundle bundle, AccessTokenSource accessTokenSource, String str) {
            boolean z;
            String string;
            Bundle bundle2 = bundle;
            C24362h.m61211f(bundle, "bundle");
            C24362h.m61211f(str, "applicationId");
            C2397f0 f0Var = C2397f0.f8630a;
            Date n = C2397f0.m6320n(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0));
            ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            String string2 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
            Date n2 = C2397f0.m6320n(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0));
            if (string2 == null) {
                return null;
            }
            boolean z2 = false;
            if (string2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z || (string = bundle.getString("com.facebook.platform.extra.USER_ID")) == null) {
                return null;
            }
            if (string.length() == 0) {
                z2 = true;
            }
            if (z2) {
                return null;
            }
            return new AccessToken(string2, str, string, stringArrayList, (Collection<String>) null, (Collection<String>) null, accessTokenSource, n, new Date(), n2, bundle.getString("graph_domain"));
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0079  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00b0  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00e5 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00e6  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.facebook.AccessToken m6488b(java.util.Set r16, android.os.Bundle r17, com.facebook.AccessTokenSource r18, java.lang.String r19) throws com.facebook.FacebookException {
            /*
                r0 = r17
                java.lang.String r1 = "bundle"
                mf0.C24362h.m61211f(r0, r1)
                java.lang.String r1 = "applicationId"
                r4 = r19
                mf0.C24362h.m61211f(r4, r1)
                com.facebook.internal.f0 r1 = com.facebook.internal.C2397f0.f8630a
                java.util.Date r1 = new java.util.Date
                r1.<init>()
                java.lang.String r2 = "expires_in"
                java.util.Date r10 = com.facebook.internal.C2397f0.m6320n(r0, r2, r1)
                java.lang.String r1 = "access_token"
                java.lang.String r3 = r0.getString(r1)
                r1 = 0
                if (r3 != 0) goto L_0x0025
                return r1
            L_0x0025:
                java.util.Date r2 = new java.util.Date
                r5 = 0
                r2.<init>(r5)
                java.lang.String r5 = "data_access_expiration_time"
                java.util.Date r12 = com.facebook.internal.C2397f0.m6320n(r0, r5, r2)
                java.lang.String r2 = "granted_scopes"
                java.lang.String r2 = r0.getString(r2)
                java.lang.String r5 = ","
                java.lang.String r6 = "null cannot be cast to non-null type kotlin.Array<T>"
                r7 = 6
                r8 = 1
                r9 = 0
                if (r2 == 0) goto L_0x006f
                int r11 = r2.length()
                if (r11 <= 0) goto L_0x0049
                r11 = 1
                goto L_0x004a
            L_0x0049:
                r11 = 0
            L_0x004a:
                if (r11 == 0) goto L_0x006f
                java.lang.String[] r11 = new java.lang.String[]{r5}
                java.util.List r2 = kotlin.text.C24179b.m60577Y(r2, r11, r9, r7)
                java.lang.String[] r11 = new java.lang.String[r9]
                java.lang.Object[] r2 = r2.toArray(r11)
                if (r2 == 0) goto L_0x0069
                java.lang.String[] r2 = (java.lang.String[]) r2
                int r11 = r2.length
                java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r11)
                java.util.ArrayList r2 = p583jk.C17875h.m44299h(r2)
                r11 = r2
                goto L_0x0071
            L_0x0069:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                r0.<init>(r6)
                throw r0
            L_0x006f:
                r11 = r16
            L_0x0071:
                java.lang.String r2 = "denied_scopes"
                java.lang.String r2 = r0.getString(r2)
                if (r2 == 0) goto L_0x00a7
                int r13 = r2.length()
                if (r13 <= 0) goto L_0x0081
                r13 = 1
                goto L_0x0082
            L_0x0081:
                r13 = 0
            L_0x0082:
                if (r13 == 0) goto L_0x00a7
                java.lang.String[] r13 = new java.lang.String[]{r5}
                java.util.List r2 = kotlin.text.C24179b.m60577Y(r2, r13, r9, r7)
                java.lang.String[] r13 = new java.lang.String[r9]
                java.lang.Object[] r2 = r2.toArray(r13)
                if (r2 == 0) goto L_0x00a1
                java.lang.String[] r2 = (java.lang.String[]) r2
                int r13 = r2.length
                java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r13)
                java.util.ArrayList r2 = p583jk.C17875h.m44299h(r2)
                r13 = r2
                goto L_0x00a8
            L_0x00a1:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                r0.<init>(r6)
                throw r0
            L_0x00a7:
                r13 = r1
            L_0x00a8:
                java.lang.String r2 = "expired_scopes"
                java.lang.String r2 = r0.getString(r2)
                if (r2 == 0) goto L_0x00de
                int r14 = r2.length()
                if (r14 <= 0) goto L_0x00b8
                r14 = 1
                goto L_0x00b9
            L_0x00b8:
                r14 = 0
            L_0x00b9:
                if (r14 == 0) goto L_0x00de
                java.lang.String[] r5 = new java.lang.String[]{r5}
                java.util.List r2 = kotlin.text.C24179b.m60577Y(r2, r5, r9, r7)
                java.lang.String[] r5 = new java.lang.String[r9]
                java.lang.Object[] r2 = r2.toArray(r5)
                if (r2 == 0) goto L_0x00d8
                java.lang.String[] r2 = (java.lang.String[]) r2
                int r5 = r2.length
                java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r5)
                java.util.ArrayList r2 = p583jk.C17875h.m44299h(r2)
                r14 = r2
                goto L_0x00df
            L_0x00d8:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                r0.<init>(r6)
                throw r0
            L_0x00de:
                r14 = r1
            L_0x00df:
                boolean r2 = com.facebook.internal.C2397f0.m6292A(r3)
                if (r2 == 0) goto L_0x00e6
                return r1
            L_0x00e6:
                java.lang.String r1 = "graph_domain"
                java.lang.String r1 = r0.getString(r1)
                java.lang.String r2 = "signed_request"
                java.lang.String r0 = r0.getString(r2)
                if (r0 == 0) goto L_0x015d
                int r2 = r0.length()
                if (r2 != 0) goto L_0x00fc
                r2 = 1
                goto L_0x00fd
            L_0x00fc:
                r2 = 0
            L_0x00fd:
                if (r2 != 0) goto L_0x015d
                java.lang.String r2 = "."
                java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0155 }
                java.util.List r0 = kotlin.text.C24179b.m60577Y(r0, r2, r9, r7)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0155 }
                java.lang.String[] r2 = new java.lang.String[r9]     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0155 }
                java.lang.Object[] r0 = r0.toArray(r2)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0155 }
                if (r0 == 0) goto L_0x014f
                java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0155 }
                int r2 = r0.length     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0155 }
                r5 = 2
                if (r2 != r5) goto L_0x0155
                r0 = r0[r8]     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0155 }
                byte[] r0 = android.util.Base64.decode(r0, r9)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0155 }
                java.lang.String r2 = "data"
                mf0.C24362h.m61210e(r0, r2)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0155 }
                java.nio.charset.Charset r2 = uh0.C25072a.f63272a     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0155 }
                java.lang.String r5 = new java.lang.String     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0155 }
                r5.<init>(r0, r2)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0155 }
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0155 }
                r0.<init>(r5)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0155 }
                java.lang.String r2 = "user_id"
                java.lang.String r5 = r0.getString(r2)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0155 }
                java.lang.String r0 = "jsonObject.getString(\"user_id\")"
                mf0.C24362h.m61210e(r5, r0)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0155 }
                com.facebook.AccessToken r0 = new com.facebook.AccessToken
                java.util.Date r15 = new java.util.Date
                r15.<init>()
                r2 = r0
                r4 = r19
                r6 = r11
                r7 = r13
                r8 = r14
                r9 = r18
                r11 = r15
                r13 = r1
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return r0
            L_0x014f:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0155 }
                r0.<init>(r6)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0155 }
                throw r0     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0155 }
            L_0x0155:
                com.facebook.FacebookException r0 = new com.facebook.FacebookException
                java.lang.String r1 = "Failed to retrieve user_id from signed_request"
                r0.<init>((java.lang.String) r1)
                throw r0
            L_0x015d:
                com.facebook.FacebookException r0 = new com.facebook.FacebookException
                java.lang.String r1 = "Authorization response does not contain the signed_request"
                r0.<init>((java.lang.String) r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.LoginMethodHandler.C2463a.m6488b(java.util.Set, android.os.Bundle, com.facebook.AccessTokenSource, java.lang.String):com.facebook.AccessToken");
        }

        /* renamed from: c */
        public static AuthenticationToken m6489c(Bundle bundle, String str) throws FacebookException {
            boolean z;
            C24362h.m61211f(bundle, "bundle");
            String string = bundle.getString("id_token");
            if (string != null) {
                boolean z2 = false;
                if (string.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && str != null) {
                    if (str.length() == 0) {
                        z2 = true;
                    }
                    if (!z2) {
                        try {
                            return new AuthenticationToken(string, str);
                        } catch (Exception e) {
                            throw new FacebookException(e.getMessage(), e);
                        }
                    }
                }
            }
            return null;
        }
    }

    public LoginMethodHandler(LoginClient loginClient) {
        this.f8825c = loginClient;
    }

    /* renamed from: b */
    public final void mo12680b(String str, String str2) {
        String str3;
        if (this.f8824b == null) {
            this.f8824b = new HashMap();
        }
        HashMap hashMap = this.f8824b;
        if (hashMap != null) {
            if (str == null) {
                str3 = null;
            } else {
                str3 = str.toString();
            }
            String str4 = (String) hashMap.put(str2, str3);
        }
    }

    /* renamed from: c */
    public void mo12635c() {
    }

    /* renamed from: d */
    public final String mo12681d(String str) {
        C24362h.m61211f(str, "authId");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", str);
            jSONObject.put("3_method", mo12608g());
            mo12611n(jSONObject);
        } catch (JSONException e) {
            C24362h.m61216k(e.getMessage(), "Error creating client state json: ");
        }
        String jSONObject2 = jSONObject.toString();
        C24362h.m61210e(jSONObject2, "param.toString()");
        return jSONObject2;
    }

    /* renamed from: f */
    public final LoginClient mo12682f() {
        LoginClient loginClient = this.f8825c;
        if (loginClient != null) {
            return loginClient;
        }
        C24362h.m61217l("loginClient");
        throw null;
    }

    /* renamed from: g */
    public abstract String mo12608g();

    /* renamed from: j */
    public String mo12609j() {
        StringBuilder k = C13555b.m33972k("fb");
        k.append(C0115o.m211b());
        k.append("://authorize/");
        return k.toString();
    }

    /* renamed from: k */
    public final void mo12683k(String str) {
        String str2;
        LoginClient.Request request = mo12682f().f8792h;
        if (request == null) {
            str2 = null;
        } else {
            str2 = request.f8801e;
        }
        if (str2 == null) {
            str2 = C0115o.m211b();
        }
        C2338j jVar = new C2338j((Context) mo12682f().mo12659g(), str2);
        Bundle b = C25541a.m63872b("fb_web_login_e2e", str);
        b.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        b.putString("app_id", str2);
        C0115o oVar = C0115o.f331a;
        if (C0098d0.m169b()) {
            jVar.mo12486f("fb_dialogs_web_login_dialog_complete", b);
        }
    }

    /* renamed from: l */
    public boolean mo12610l(int i, int i2, Intent intent) {
        return false;
    }

    /* renamed from: m */
    public final void mo12684m(Bundle bundle, LoginClient.Request request) throws FacebookException {
        GraphRequest graphRequest;
        String string = bundle.getString("code");
        if (!C2397f0.m6292A(string)) {
            String str = null;
            if (string == null) {
                graphRequest = null;
            } else {
                String j = mo12609j();
                String str2 = request.f8813q;
                if (str2 == null) {
                    str2 = "";
                }
                C24362h.m61211f(j, "redirectUri");
                Bundle bundle2 = new Bundle();
                bundle2.putString("code", string);
                bundle2.putString("client_id", C0115o.m211b());
                bundle2.putString("redirect_uri", j);
                bundle2.putString("code_verifier", str2);
                String str3 = GraphRequest.f8425j;
                graphRequest = GraphRequest.C2281c.m6137g((AccessToken) null, "oauth/access_token", (GraphRequest.C2280b) null);
                graphRequest.mo11910k(HttpMethod.GET);
                graphRequest.f8431d = bundle2;
            }
            if (graphRequest != null) {
                C0124u c = graphRequest.mo11903c();
                FacebookRequestError facebookRequestError = c.f366c;
                if (facebookRequestError == null) {
                    try {
                        JSONObject jSONObject = c.f365b;
                        if (jSONObject != null) {
                            str = jSONObject.getString("access_token");
                        }
                        if (jSONObject == null || C2397f0.m6292A(str)) {
                            throw new FacebookException("No access token found from result");
                        }
                        bundle.putString("access_token", str);
                        if (jSONObject.has("id_token")) {
                            bundle.putString("id_token", jSONObject.getString("id_token"));
                        }
                    } catch (JSONException e) {
                        throw new FacebookException(C24362h.m61216k(e.getMessage(), "Fail to process code exchange response: "));
                    }
                } else {
                    throw new FacebookServiceException(facebookRequestError, facebookRequestError.mo11894b());
                }
            } else {
                throw new FacebookException("Failed to create code exchange request");
            }
        } else {
            throw new FacebookException("No code param found from the request");
        }
    }

    /* renamed from: n */
    public void mo12611n(JSONObject jSONObject) throws JSONException {
    }

    /* renamed from: o */
    public abstract int mo12612o(LoginClient.Request request);

    public void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "dest");
        C2397f0 f0Var = C2397f0.f8630a;
        HashMap hashMap = this.f8824b;
        if (hashMap == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(hashMap.size());
        for (Map.Entry entry : hashMap.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }

    public LoginMethodHandler(Parcel parcel) {
        HashMap hashMap;
        C24362h.m61211f(parcel, "source");
        C2397f0 f0Var = C2397f0.f8630a;
        int readInt = parcel.readInt();
        LinkedHashMap linkedHashMap = null;
        if (readInt < 0) {
            hashMap = null;
        } else {
            hashMap = new HashMap();
            int i = 0;
            if (readInt > 0) {
                do {
                    i++;
                    hashMap.put(parcel.readString(), parcel.readString());
                } while (i < readInt);
            }
        }
        this.f8824b = hashMap != null ? C23826d.m58538c0(hashMap) : linkedHashMap;
    }
}
