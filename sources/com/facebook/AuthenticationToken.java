package com.facebook;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.appboy.models.InAppMessageImmersiveBase;
import com.facebook.AuthenticationTokenManager;
import com.facebook.internal.C2397f0;
import com.facebook.internal.C2400g0;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.io.IOException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.C24179b;
import mf0.C24362h;
import org.json.JSONException;
import org.json.JSONObject;
import p009a8.C0106f;
import p009a8.C0115o;
import p130j2.C5367a;
import p258t4.C6587a;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, mo59060d2 = {"Lcom/facebook/AuthenticationToken;", "Landroid/os/Parcelable;", "b", "facebook-core_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public final class AuthenticationToken implements Parcelable {
    public static final Parcelable.Creator<AuthenticationToken> CREATOR = new C2269a();

    /* renamed from: b */
    public final String f8364b;

    /* renamed from: c */
    public final String f8365c;

    /* renamed from: d */
    public final AuthenticationTokenHeader f8366d;

    /* renamed from: e */
    public final AuthenticationTokenClaims f8367e;

    /* renamed from: f */
    public final String f8368f;

    /* renamed from: com.facebook.AuthenticationToken$a */
    public static final class C2269a implements Parcelable.Creator<AuthenticationToken> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "source");
            return new AuthenticationToken(parcel);
        }

        public final Object[] newArray(int i) {
            return new AuthenticationToken[i];
        }
    }

    /* renamed from: com.facebook.AuthenticationToken$b */
    public static final class C2270b {
        /* renamed from: a */
        public static void m6113a(AuthenticationToken authenticationToken) {
            AuthenticationTokenManager.C2274a aVar = AuthenticationTokenManager.f8392d;
            AuthenticationTokenManager authenticationTokenManager = AuthenticationTokenManager.f8393e;
            if (authenticationTokenManager == null) {
                synchronized (aVar) {
                    authenticationTokenManager = AuthenticationTokenManager.f8393e;
                    if (authenticationTokenManager == null) {
                        C5367a a = C5367a.m13473a(C0115o.m210a());
                        C24362h.m61210e(a, "getInstance(applicationContext)");
                        AuthenticationTokenManager authenticationTokenManager2 = new AuthenticationTokenManager(a, new C0106f());
                        AuthenticationTokenManager.f8393e = authenticationTokenManager2;
                        authenticationTokenManager = authenticationTokenManager2;
                    }
                }
            }
            AuthenticationToken authenticationToken2 = authenticationTokenManager.f8396c;
            authenticationTokenManager.f8396c = authenticationToken;
            if (authenticationToken != null) {
                C0106f fVar = authenticationTokenManager.f8395b;
                fVar.getClass();
                try {
                    fVar.f316a.edit().putString("com.facebook.AuthenticationManager.CachedAuthenticationToken", authenticationToken.mo11852b().toString()).apply();
                } catch (JSONException unused) {
                }
            } else {
                authenticationTokenManager.f8395b.f316a.edit().remove("com.facebook.AuthenticationManager.CachedAuthenticationToken").apply();
                C2397f0 f0Var = C2397f0.f8630a;
                C2397f0.m6310d(C0115o.m210a());
            }
            if (!C2397f0.m6307a(authenticationToken2, authenticationToken)) {
                Intent intent = new Intent(C0115o.m210a(), AuthenticationTokenManager.CurrentAuthenticationTokenChangedBroadcastReceiver.class);
                intent.setAction("com.facebook.sdk.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED");
                intent.putExtra("com.facebook.sdk.EXTRA_OLD_AUTHENTICATION_TOKEN", authenticationToken2);
                intent.putExtra("com.facebook.sdk.EXTRA_NEW_AUTHENTICATION_TOKEN", authenticationToken);
                authenticationTokenManager.f8394a.mo21147c(intent);
            }
        }
    }

    public AuthenticationToken(String str, String str2) {
        C24362h.m61211f(str2, "expectedNonce");
        C2400g0.m6339d(str, FirebaseMessagingService.EXTRA_TOKEN);
        C2400g0.m6339d(str2, "expectedNonce");
        boolean z = false;
        List Y = C24179b.m60577Y(str, new String[]{"."}, 0, 6);
        if (Y.size() == 3) {
            String str3 = (String) Y.get(0);
            String str4 = (String) Y.get(1);
            String str5 = (String) Y.get(2);
            this.f8364b = str;
            this.f8365c = str2;
            AuthenticationTokenHeader authenticationTokenHeader = new AuthenticationTokenHeader(str3);
            this.f8366d = authenticationTokenHeader;
            this.f8367e = new AuthenticationTokenClaims(str4, str2);
            try {
                String u = C6587a.m15520u(authenticationTokenHeader.f8391d);
                if (u != null) {
                    PublicKey t = C6587a.m15519t(u);
                    z = C6587a.m15517A(t, str3 + '.' + str4, str5);
                }
            } catch (IOException | InvalidKeySpecException unused) {
            }
            if (z) {
                this.f8368f = str5;
                return;
            }
            throw new IllegalArgumentException("Invalid Signature".toString());
        }
        throw new IllegalArgumentException("Invalid IdToken string".toString());
    }

    /* renamed from: b */
    public final JSONObject mo11852b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token_string", this.f8364b);
        jSONObject.put("expected_nonce", this.f8365c);
        AuthenticationTokenHeader authenticationTokenHeader = this.f8366d;
        authenticationTokenHeader.getClass();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("alg", authenticationTokenHeader.f8389b);
        jSONObject2.put("typ", authenticationTokenHeader.f8390c);
        jSONObject2.put("kid", authenticationTokenHeader.f8391d);
        jSONObject.put(InAppMessageImmersiveBase.HEADER, jSONObject2);
        jSONObject.put("claims", this.f8367e.mo11859b());
        jSONObject.put(InAppPurchaseMetaData.KEY_SIGNATURE, this.f8368f);
        return jSONObject;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticationToken)) {
            return false;
        }
        AuthenticationToken authenticationToken = (AuthenticationToken) obj;
        if (!C24362h.m61206a(this.f8364b, authenticationToken.f8364b) || !C24362h.m61206a(this.f8365c, authenticationToken.f8365c) || !C24362h.m61206a(this.f8366d, authenticationToken.f8366d) || !C24362h.m61206a(this.f8367e, authenticationToken.f8367e) || !C24362h.m61206a(this.f8368f, authenticationToken.f8368f)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int d = C13715c.m34238d(this.f8365c, C13715c.m34238d(this.f8364b, 527, 31), 31);
        int hashCode = this.f8367e.hashCode();
        return this.f8368f.hashCode() + ((hashCode + ((this.f8366d.hashCode() + d) * 31)) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "dest");
        parcel.writeString(this.f8364b);
        parcel.writeString(this.f8365c);
        parcel.writeParcelable(this.f8366d, i);
        parcel.writeParcelable(this.f8367e, i);
        parcel.writeString(this.f8368f);
    }

    public AuthenticationToken(Parcel parcel) {
        C24362h.m61211f(parcel, "parcel");
        String readString = parcel.readString();
        C2400g0.m6341f(readString, FirebaseMessagingService.EXTRA_TOKEN);
        this.f8364b = readString;
        String readString2 = parcel.readString();
        C2400g0.m6341f(readString2, "expectedNonce");
        this.f8365c = readString2;
        Parcelable readParcelable = parcel.readParcelable(AuthenticationTokenHeader.class.getClassLoader());
        if (readParcelable != null) {
            this.f8366d = (AuthenticationTokenHeader) readParcelable;
            Parcelable readParcelable2 = parcel.readParcelable(AuthenticationTokenClaims.class.getClassLoader());
            if (readParcelable2 != null) {
                this.f8367e = (AuthenticationTokenClaims) readParcelable2;
                String readString3 = parcel.readString();
                C2400g0.m6341f(readString3, InAppPurchaseMetaData.KEY_SIGNATURE);
                this.f8368f = readString3;
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
