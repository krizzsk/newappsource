package com.facebook.login;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.activity.result.C0207b;
import androidx.fragment.app.Fragment;
import bf0.C21050d;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.internal.C2393d0;
import com.facebook.internal.C2397f0;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginMethodHandler;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C23825c;
import mf0.C24362h;
import p009a8.C0115o;
import p583jk.C17875h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/facebook/login/NativeAppLoginMethodHandler;", "Lcom/facebook/login/LoginMethodHandler;", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public abstract class NativeAppLoginMethodHandler extends LoginMethodHandler {

    /* renamed from: d */
    public final AccessTokenSource f8826d = AccessTokenSource.FACEBOOK_APPLICATION_WEB;

    public NativeAppLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* renamed from: l */
    public final boolean mo12610l(int i, int i2, Intent intent) {
        String str;
        String str2;
        String str3;
        Object obj;
        LoginClient.Request request = mo12682f().f8792h;
        if (intent == null) {
            mo12686q(new LoginClient.Result(request, LoginClient.Result.Code.CANCEL, (AccessToken) null, "Operation canceled", (String) null));
        } else {
            String str4 = null;
            if (i2 == 0) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    str = null;
                } else {
                    str = extras.getString("error");
                }
                if (str == null) {
                    if (extras == null) {
                        str = null;
                    } else {
                        str = extras.getString("error_type");
                    }
                }
                if (extras == null || (obj = extras.get("error_code")) == null) {
                    str2 = null;
                } else {
                    str2 = obj.toString();
                }
                int i3 = C2393d0.f8626a;
                if (C24362h.m61206a("CONNECTION_FAILURE", str2)) {
                    if (extras == null) {
                        str3 = null;
                    } else {
                        str3 = extras.getString("error_message");
                    }
                    if (str3 != null) {
                        str4 = str3;
                    } else if (extras != null) {
                        str4 = extras.getString("error_description");
                    }
                    ArrayList arrayList = new ArrayList();
                    if (str != null) {
                        arrayList.add(str);
                    }
                    if (str4 != null) {
                        arrayList.add(str4);
                    }
                    mo12686q(new LoginClient.Result(request, LoginClient.Result.Code.ERROR, (AccessToken) null, TextUtils.join(": ", arrayList), str2));
                } else {
                    mo12686q(new LoginClient.Result(request, LoginClient.Result.Code.CANCEL, (AccessToken) null, str, (String) null));
                }
            } else if (i2 != -1) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add("Unexpected resultCode from authorization.");
                mo12686q(new LoginClient.Result(request, LoginClient.Result.Code.ERROR, (AccessToken) null, TextUtils.join(": ", arrayList2), (String) null));
            } else {
                Bundle extras2 = intent.getExtras();
                if (extras2 == null) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add("Unexpected null from returned authorization data.");
                    mo12686q(new LoginClient.Result(request, LoginClient.Result.Code.ERROR, (AccessToken) null, TextUtils.join(": ", arrayList3), (String) null));
                    return true;
                }
                String string = extras2.getString("error");
                if (string == null) {
                    string = extras2.getString("error_type");
                }
                Object obj2 = extras2.get("error_code");
                if (obj2 != null) {
                    str4 = obj2.toString();
                }
                String string2 = extras2.getString("error_message");
                if (string2 == null) {
                    string2 = extras2.getString("error_description");
                }
                String string3 = extras2.getString("e2e");
                if (!C2397f0.m6292A(string3)) {
                    mo12683k(string3);
                }
                if (string != null || str4 != null || string2 != null || request == null) {
                    mo12687s(request, string, string2, str4);
                } else if (!extras2.containsKey("code") || C2397f0.m6292A(extras2.getString("code"))) {
                    mo12688t(extras2, request);
                } else {
                    C0115o.m212c().execute(new C2487o(this, request, extras2));
                }
            }
        }
        return true;
    }

    /* renamed from: q */
    public final void mo12686q(LoginClient.Result result) {
        if (result != null) {
            mo12682f().mo12658f(result);
        } else {
            mo12682f().mo12664n();
        }
    }

    /* renamed from: r */
    public AccessTokenSource mo12641r() {
        return this.f8826d;
    }

    /* renamed from: s */
    public final void mo12687s(LoginClient.Request request, String str, String str2, String str3) {
        if (str == null || !C24362h.m61206a(str, "logged_out")) {
            int i = C2393d0.f8626a;
            if (C23825c.m58507d0(C17875h.m44281E("service_disabled", "AndroidAuthKillSwitchException"), str)) {
                mo12686q((LoginClient.Result) null);
            } else if (C23825c.m58507d0(C17875h.m44281E("access_denied", "OAuthAccessDeniedException"), str)) {
                mo12686q(new LoginClient.Result(request, LoginClient.Result.Code.CANCEL, (AccessToken) null, (String) null, (String) null));
            } else {
                ArrayList arrayList = new ArrayList();
                if (str != null) {
                    arrayList.add(str);
                }
                if (str2 != null) {
                    arrayList.add(str2);
                }
                LoginClient.Request request2 = request;
                mo12686q(new LoginClient.Result(request2, LoginClient.Result.Code.ERROR, (AccessToken) null, TextUtils.join(": ", arrayList), str3));
            }
        } else {
            CustomTabLoginMethodHandler.f8751j = true;
            mo12686q((LoginClient.Result) null);
        }
    }

    /* renamed from: t */
    public final void mo12688t(Bundle bundle, LoginClient.Request request) {
        try {
            LoginClient.Request request2 = request;
            mo12686q(new LoginClient.Result(request2, LoginClient.Result.Code.SUCCESS, LoginMethodHandler.C2463a.m6488b(request.f8799c, bundle, mo12641r(), request.f8801e), LoginMethodHandler.C2463a.m6489c(bundle, request.f8812p), (String) null, (String) null));
        } catch (FacebookException e) {
            String message = e.getMessage();
            ArrayList arrayList = new ArrayList();
            if (message != null) {
                arrayList.add(message);
            }
            LoginClient.Request request3 = request;
            mo12686q(new LoginClient.Result(request3, LoginClient.Result.Code.ERROR, (AccessToken) null, TextUtils.join(": ", arrayList), (String) null));
        }
    }

    /* renamed from: u */
    public final boolean mo12689u(Intent intent) {
        C2477i iVar;
        if (intent != null) {
            List<ResolveInfo> queryIntentActivities = C0115o.m210a().getPackageManager().queryIntentActivities(intent, SQLiteDatabase.OPEN_FULLMUTEX);
            C24362h.m61210e(queryIntentActivities, "FacebookSdk.getApplicationContext()\n            .packageManager\n            .queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
            if (!queryIntentActivities.isEmpty()) {
                Fragment fragment = mo12682f().f8788d;
                C21050d dVar = null;
                if (fragment instanceof C2477i) {
                    iVar = (C2477i) fragment;
                } else {
                    iVar = null;
                }
                if (iVar != null) {
                    C0207b<Intent> bVar = iVar.f8866e;
                    if (bVar != null) {
                        bVar.mo772a(intent);
                        dVar = C21050d.f52856a;
                    } else {
                        C24362h.m61217l("launcher");
                        throw null;
                    }
                }
                if (dVar == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NativeAppLoginMethodHandler(Parcel parcel) {
        super(parcel);
        C24362h.m61211f(parcel, "source");
    }
}
