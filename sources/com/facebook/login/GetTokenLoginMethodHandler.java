package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookException;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginMethodHandler;
import java.util.ArrayList;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/facebook/login/GetTokenLoginMethodHandler;", "Lcom/facebook/login/LoginMethodHandler;", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public final class GetTokenLoginMethodHandler extends LoginMethodHandler {
    public static final Parcelable.Creator<GetTokenLoginMethodHandler> CREATOR = new C2455a();

    /* renamed from: d */
    public C2474f f8781d;

    /* renamed from: e */
    public final String f8782e = "get_token";

    /* renamed from: com.facebook.login.GetTokenLoginMethodHandler$a */
    public static final class C2455a implements Parcelable.Creator<GetTokenLoginMethodHandler> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "source");
            return new GetTokenLoginMethodHandler(parcel);
        }

        public final Object[] newArray(int i) {
            return new GetTokenLoginMethodHandler[i];
        }
    }

    public GetTokenLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* renamed from: c */
    public final void mo12635c() {
        C2474f fVar = this.f8781d;
        if (fVar != null) {
            fVar.f8616e = false;
            fVar.f8615d = null;
            this.f8781d = null;
        }
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: g */
    public final String mo12608g() {
        return this.f8782e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0042 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0045 A[SYNTHETIC, Splitter:B:23:0x0045] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo12612o(com.facebook.login.LoginClient.Request r9) {
        /*
            r8 = this;
            com.facebook.login.f r0 = new com.facebook.login.f
            com.facebook.login.LoginClient r1 = r8.mo12682f()
            androidx.fragment.app.FragmentActivity r1 = r1.mo12659g()
            if (r1 != 0) goto L_0x0010
            android.content.Context r1 = p009a8.C0115o.m210a()
        L_0x0010:
            r0.<init>(r1, r9)
            r8.f8781d = r0
            monitor-enter(r0)
            boolean r1 = r0.f8616e     // Catch:{ all -> 0x0081 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001e
            monitor-exit(r0)
            goto L_0x0043
        L_0x001e:
            com.facebook.internal.z r1 = com.facebook.internal.C2440z.f8743a     // Catch:{ all -> 0x0081 }
            int r1 = r0.f8621j     // Catch:{ all -> 0x0081 }
            java.lang.Class<com.facebook.internal.z> r4 = com.facebook.internal.C2440z.class
            boolean r5 = p262t8.C6606a.m15601b(r4)     // Catch:{ all -> 0x0081 }
            if (r5 == 0) goto L_0x002b
            goto L_0x003e
        L_0x002b:
            com.facebook.internal.z r5 = com.facebook.internal.C2440z.f8743a     // Catch:{ all -> 0x003a }
            java.util.ArrayList r6 = com.facebook.internal.C2440z.f8744b     // Catch:{ all -> 0x003a }
            int[] r7 = new int[r2]     // Catch:{ all -> 0x003a }
            r7[r3] = r1     // Catch:{ all -> 0x003a }
            com.facebook.internal.z$f r1 = r5.mo12601k(r6, r7)     // Catch:{ all -> 0x003a }
            int r1 = r1.f8750b     // Catch:{ all -> 0x003a }
            goto L_0x003f
        L_0x003a:
            r1 = move-exception
            p262t8.C6606a.m15600a(r4, r1)     // Catch:{ all -> 0x0081 }
        L_0x003e:
            r1 = 0
        L_0x003f:
            r4 = -1
            if (r1 != r4) goto L_0x0045
            monitor-exit(r0)
        L_0x0043:
            r1 = 0
            goto L_0x005a
        L_0x0045:
            com.facebook.internal.z r1 = com.facebook.internal.C2440z.f8743a     // Catch:{ all -> 0x0081 }
            android.content.Context r1 = r0.f8613b     // Catch:{ all -> 0x0081 }
            android.content.Intent r1 = com.facebook.internal.C2440z.m6400e(r1)     // Catch:{ all -> 0x0081 }
            if (r1 != 0) goto L_0x0051
            r1 = 0
            goto L_0x0059
        L_0x0051:
            r0.f8616e = r2     // Catch:{ all -> 0x0081 }
            android.content.Context r4 = r0.f8613b     // Catch:{ all -> 0x0081 }
            r4.bindService(r1, r0, r2)     // Catch:{ all -> 0x0081 }
            r1 = 1
        L_0x0059:
            monitor-exit(r0)
        L_0x005a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r0 = mf0.C24362h.m61206a(r0, r1)
            if (r0 == 0) goto L_0x0067
            return r3
        L_0x0067:
            com.facebook.login.LoginClient r0 = r8.mo12682f()
            com.facebook.login.LoginClient$a r0 = r0.f8790f
            if (r0 != 0) goto L_0x0070
            goto L_0x0073
        L_0x0070:
            r0.mo12676a()
        L_0x0073:
            d0.x0 r0 = new d0.x0
            r1 = 3
            r0.<init>(r1, r8, r9)
            com.facebook.login.f r9 = r8.f8781d
            if (r9 != 0) goto L_0x007e
            goto L_0x0080
        L_0x007e:
            r9.f8615d = r0
        L_0x0080:
            return r2
        L_0x0081:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.GetTokenLoginMethodHandler.mo12612o(com.facebook.login.LoginClient$Request):int");
    }

    /* renamed from: q */
    public final void mo12637q(Bundle bundle, LoginClient.Request request) {
        LoginClient.Result result;
        AuthenticationToken authenticationToken;
        boolean z;
        C24362h.m61211f(request, "request");
        C24362h.m61211f(bundle, "result");
        try {
            AccessToken a = LoginMethodHandler.C2463a.m6487a(bundle, AccessTokenSource.FACEBOOK_APPLICATION_SERVICE, request.f8801e);
            String str = request.f8812p;
            String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
            if (string != null) {
                boolean z2 = true;
                if (string.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && str != null) {
                    if (str.length() != 0) {
                        z2 = false;
                    }
                    if (!z2) {
                        authenticationToken = new AuthenticationToken(string, str);
                        result = new LoginClient.Result(request, LoginClient.Result.Code.SUCCESS, a, authenticationToken, (String) null, (String) null);
                        mo12682f().mo12658f(result);
                    }
                }
            }
            authenticationToken = null;
            result = new LoginClient.Result(request, LoginClient.Result.Code.SUCCESS, a, authenticationToken, (String) null, (String) null);
        } catch (Exception e) {
            throw new FacebookException(e.getMessage());
        } catch (FacebookException e2) {
            LoginClient.Request request2 = mo12682f().f8792h;
            String message = e2.getMessage();
            ArrayList arrayList = new ArrayList();
            if (message != null) {
                arrayList.add(message);
            }
            result = new LoginClient.Result(request2, LoginClient.Result.Code.ERROR, (AccessToken) null, TextUtils.join(": ", arrayList), (String) null);
        }
        mo12682f().mo12658f(result);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetTokenLoginMethodHandler(Parcel parcel) {
        super(parcel);
        C24362h.m61211f(parcel, "source");
    }
}
