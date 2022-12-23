package com.facebook.login;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import bf0.C21050d;
import com.facebook.FacebookException;
import com.facebook.internal.C2394e;
import com.facebook.internal.C2400g0;
import com.facebook.login.C2479j;
import com.facebook.login.LoginClient;
import com.usebutton.sdk.internal.util.DiskLruCache;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import mf0.C24362h;
import org.json.JSONException;
import org.json.JSONObject;
import p009a8.C0115o;
import p253t.C6509a;
import p253t.C6516g;
import p262t8.C6606a;
import p316y.C7229u;
import p583jk.C17884p;
import uh0.C25081h;

/* renamed from: com.facebook.login.m */
public final class C2483m {

    /* renamed from: f */
    public static final C2484a f8876f = new C2484a();

    /* renamed from: g */
    public static final Set<String> f8877g = C17884p.m44349T("ads_management", "create_event", "rsvp_event");

    /* renamed from: h */
    public static volatile C2483m f8878h;

    /* renamed from: a */
    public LoginBehavior f8879a = LoginBehavior.NATIVE_WITH_FALLBACK;

    /* renamed from: b */
    public DefaultAudience f8880b = DefaultAudience.FRIENDS;

    /* renamed from: c */
    public final SharedPreferences f8881c;

    /* renamed from: d */
    public String f8882d = "rerequest";

    /* renamed from: e */
    public LoginTargetApp f8883e = LoginTargetApp.FACEBOOK;

    /* renamed from: com.facebook.login.m$a */
    public static final class C2484a {
        /* renamed from: a */
        public static boolean m6520a(String str) {
            if (str == null || (!C25081h.m62835F(str, "publish") && !C25081h.m62835F(str, "manage") && !C2483m.f8877g.contains(str))) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.facebook.login.m$b */
    public static final class C2485b {

        /* renamed from: a */
        public static final C2485b f8884a = new C2485b();

        /* renamed from: b */
        public static C2479j f8885b;

        /* renamed from: a */
        public final synchronized C2479j mo12703a(Activity activity) {
            Context context = activity;
            if (activity == null) {
                context = C0115o.m210a();
            }
            if (f8885b == null) {
                f8885b = new C2479j(context, C0115o.m211b());
            }
            C2479j jVar = f8885b;
            return jVar;
        }
    }

    static {
        C24362h.m61210e(C2483m.class.toString(), "LoginManager::class.java.toString()");
    }

    public C2483m() {
        C2400g0.m6342g();
        SharedPreferences sharedPreferences = C0115o.m210a().getSharedPreferences("com.facebook.loginManager", 0);
        C24362h.m61210e(sharedPreferences, "getApplicationContext().getSharedPreferences(PREFERENCE_LOGIN_MANAGER, Context.MODE_PRIVATE)");
        this.f8881c = sharedPreferences;
        if (C0115o.f343m && C2394e.m6288a() != null) {
            C6516g.m15440a(C0115o.m210a(), "com.android.chrome", new C2468a());
            Context a = C0115o.m210a();
            String packageName = C0115o.m210a().getPackageName();
            if (packageName != null) {
                Context applicationContext = a.getApplicationContext();
                try {
                    C6516g.m15440a(applicationContext, packageName, new C6509a(applicationContext));
                } catch (SecurityException unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static C2483m m6517a() {
        C2484a aVar = f8876f;
        if (f8878h == null) {
            synchronized (aVar) {
                f8878h = new C2483m();
                C21050d dVar = C21050d.f52856a;
            }
        }
        C2483m mVar = f8878h;
        if (mVar != null) {
            return mVar;
        }
        C24362h.m61217l("instance");
        throw null;
    }

    /* renamed from: b */
    public static void m6518b(Activity activity, LoginClient.Result.Code code, Map map, FacebookException facebookException, boolean z, LoginClient.Request request) {
        String str;
        String str2;
        C2479j a = C2485b.f8884a.mo12703a(activity);
        if (a != null) {
            String str3 = "fb_mobile_login_complete";
            if (request == null) {
                ScheduledExecutorService scheduledExecutorService = C2479j.f8869d;
                Class<C2479j> cls = C2479j.class;
                if (!C6606a.m15601b(cls)) {
                    try {
                        a.mo12701a(str3, "");
                    } catch (Throwable th) {
                        C6606a.m15600a(cls, th);
                    }
                }
            } else {
                HashMap hashMap = new HashMap();
                if (z) {
                    str = DiskLruCache.VERSION_1;
                } else {
                    str = "0";
                }
                hashMap.put("try_login_activity", str);
                String str4 = request.f8802f;
                if (request.f8810n) {
                    str3 = "foa_mobile_login_complete";
                }
                if (!C6606a.m15601b(a)) {
                    try {
                        ScheduledExecutorService scheduledExecutorService2 = C2479j.f8869d;
                        Bundle a2 = C2479j.C2480a.m6514a(str4);
                        if (code != null) {
                            a2.putString("2_result", code.getLoggingValue());
                        }
                        JSONObject jSONObject = null;
                        if (facebookException == null) {
                            str2 = null;
                        } else {
                            str2 = facebookException.getMessage();
                        }
                        if (str2 != null) {
                            a2.putString("5_error_message", facebookException.getMessage());
                        }
                        if (!hashMap.isEmpty()) {
                            jSONObject = new JSONObject(hashMap);
                        }
                        if (map != null) {
                            if (jSONObject == null) {
                                jSONObject = new JSONObject();
                            }
                            try {
                                for (Map.Entry entry : map.entrySet()) {
                                    String str5 = (String) entry.getKey();
                                    String str6 = (String) entry.getValue();
                                    if (str5 != null) {
                                        jSONObject.put(str5, str6);
                                    }
                                }
                            } catch (JSONException unused) {
                            }
                        }
                        if (jSONObject != null) {
                            a2.putString("6_extras", jSONObject.toString());
                        }
                        a.f8871b.mo12509a(a2, str3);
                        if (code == LoginClient.Result.Code.SUCCESS && !C6606a.m15601b(a)) {
                            ScheduledExecutorService scheduledExecutorService3 = C2479j.f8869d;
                            C2479j.f8869d.schedule(new C7229u(10, a, C2479j.C2480a.m6514a(str4)), 5, TimeUnit.SECONDS);
                        }
                    } catch (Throwable th2) {
                        C6606a.m15600a(a, th2);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0086 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12702c(int r13, android.content.Intent r14, p009a8.C0109i r15) {
        /*
            r12 = this;
            com.facebook.login.LoginClient$Result$Code r0 = com.facebook.login.LoginClient.Result.Code.ERROR
            r1 = 0
            r2 = 1
            r3 = 0
            if (r14 == 0) goto L_0x0045
            java.lang.Class<com.facebook.login.LoginClient$Result> r4 = com.facebook.login.LoginClient.Result.class
            java.lang.ClassLoader r4 = r4.getClassLoader()
            r14.setExtrasClassLoader(r4)
            java.lang.String r4 = "com.facebook.LoginFragment:Result"
            android.os.Parcelable r14 = r14.getParcelableExtra(r4)
            com.facebook.login.LoginClient$Result r14 = (com.facebook.login.LoginClient.Result) r14
            if (r14 == 0) goto L_0x0051
            com.facebook.login.LoginClient$Request r0 = r14.f8821g
            com.facebook.login.LoginClient$Result$Code r4 = r14.f8816b
            r5 = -1
            if (r13 == r5) goto L_0x002a
            if (r13 == 0) goto L_0x0025
            r13 = r3
            goto L_0x003c
        L_0x0025:
            r13 = r3
            r5 = r13
            r6 = r5
            r1 = 1
            goto L_0x003f
        L_0x002a:
            com.facebook.login.LoginClient$Result$Code r13 = com.facebook.login.LoginClient.Result.Code.SUCCESS
            if (r4 != r13) goto L_0x0035
            com.facebook.AccessToken r13 = r14.f8817c
            com.facebook.AuthenticationToken r5 = r14.f8818d
            r6 = r5
            r5 = r3
            goto L_0x003f
        L_0x0035:
            com.facebook.FacebookAuthorizationException r13 = new com.facebook.FacebookAuthorizationException
            java.lang.String r5 = r14.f8819e
            r13.<init>(r5)
        L_0x003c:
            r5 = r13
            r13 = r3
            r6 = r13
        L_0x003f:
            java.util.Map<java.lang.String, java.lang.String> r14 = r14.f8822h
            r10 = r6
            r6 = r14
            r14 = r4
            goto L_0x0057
        L_0x0045:
            if (r13 != 0) goto L_0x0051
            com.facebook.login.LoginClient$Result$Code r0 = com.facebook.login.LoginClient.Result.Code.CANCEL
            r14 = r0
            r13 = r3
            r0 = r13
            r5 = r0
            r6 = r5
            r10 = r6
            r1 = 1
            goto L_0x0057
        L_0x0051:
            r14 = r0
            r13 = r3
            r0 = r13
            r5 = r0
            r6 = r5
            r10 = r6
        L_0x0057:
            if (r5 != 0) goto L_0x0064
            if (r13 != 0) goto L_0x0064
            if (r1 != 0) goto L_0x0064
            com.facebook.FacebookException r5 = new com.facebook.FacebookException
            java.lang.String r4 = "Unexpected call to LoginManager.onActivityResult"
            r5.<init>((java.lang.String) r4)
        L_0x0064:
            r11 = r5
            r8 = 1
            r4 = 0
            r5 = r14
            r7 = r11
            r9 = r0
            m6518b(r4, r5, r6, r7, r8, r9)
            if (r13 == 0) goto L_0x007f
            java.util.Date r14 = com.facebook.AccessToken.f8348m
            a8.e$a r14 = p009a8.C0100e.f304f
            a8.e r14 = r14.mo216a()
            r14.mo215c(r13, r2)
            android.os.Parcelable$Creator<com.facebook.Profile> r14 = com.facebook.Profile.CREATOR
            com.facebook.Profile.C2287b.m6157a()
        L_0x007f:
            if (r10 == 0) goto L_0x0084
            com.facebook.AuthenticationToken.C2270b.m6113a(r10)
        L_0x0084:
            if (r15 == 0) goto L_0x00f1
            if (r13 == 0) goto L_0x00ae
            if (r0 == 0) goto L_0x00ae
            java.util.Set<java.lang.String> r14 = r0.f8799c
            java.util.Set<java.lang.String> r3 = r13.f8352c
            java.util.ArrayList r3 = kotlin.collections.C23825c.m58511h0(r3)
            java.util.Set r3 = kotlin.collections.C23825c.m58502N0(r3)
            boolean r0 = r0.f8803g
            if (r0 == 0) goto L_0x009d
            r3.retainAll(r14)
        L_0x009d:
            java.util.ArrayList r14 = kotlin.collections.C23825c.m58511h0(r14)
            java.util.Set r14 = kotlin.collections.C23825c.m58502N0(r14)
            r14.removeAll(r3)
            com.facebook.login.n r0 = new com.facebook.login.n
            r0.<init>(r13, r10, r3, r14)
            r3 = r0
        L_0x00ae:
            if (r1 != 0) goto L_0x00e8
            if (r3 == 0) goto L_0x00bb
            java.util.Set<java.lang.String> r14 = r3.f8888c
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto L_0x00bb
            goto L_0x00e8
        L_0x00bb:
            if (r11 == 0) goto L_0x00c3
            com.moovit.app.useraccount.providers.facebook.FacebookConnectProviderFragment$a r15 = (com.moovit.app.useraccount.providers.facebook.FacebookConnectProviderFragment.C15637a) r15
            r15.mo46650a(r11)
            goto L_0x00f1
        L_0x00c3:
            if (r13 == 0) goto L_0x00f1
            if (r3 == 0) goto L_0x00f1
            android.content.SharedPreferences r13 = r12.f8881c
            android.content.SharedPreferences$Editor r13 = r13.edit()
            java.lang.String r14 = "express_login_allowed"
            r13.putBoolean(r14, r2)
            r13.apply()
            com.moovit.app.useraccount.providers.facebook.FacebookConnectProviderFragment$a r15 = (com.moovit.app.useraccount.providers.facebook.FacebookConnectProviderFragment.C15637a) r15
            com.moovit.app.useraccount.providers.facebook.FacebookConnectProviderFragment r13 = com.moovit.app.useraccount.providers.facebook.FacebookConnectProviderFragment.this
            java.lang.String[] r14 = com.moovit.app.useraccount.providers.facebook.FacebookConnectProviderFragment.f40648f
            r13.getClass()
            com.facebook.AccessToken r14 = r3.f8886a
            java.lang.String r15 = r14.f8359j
            java.lang.String r14 = r14.f8355f
            r13.mo50583I1(r15, r14)
            goto L_0x00f1
        L_0x00e8:
            com.moovit.app.useraccount.providers.facebook.FacebookConnectProviderFragment$a r15 = (com.moovit.app.useraccount.providers.facebook.FacebookConnectProviderFragment.C15637a) r15
            com.moovit.app.useraccount.providers.facebook.FacebookConnectProviderFragment r13 = com.moovit.app.useraccount.providers.facebook.FacebookConnectProviderFragment.this
            java.lang.String[] r14 = com.moovit.app.useraccount.providers.facebook.FacebookConnectProviderFragment.f40648f
            r13.getClass()
        L_0x00f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.C2483m.mo12702c(int, android.content.Intent, a8.i):void");
    }
}
