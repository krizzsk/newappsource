package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookException;
import com.facebook.common.C2362e;
import com.facebook.internal.C2397f0;
import com.facebook.internal.C2400g0;
import com.facebook.login.C2479j;
import com.facebook.login.C2483m;
import com.usebutton.sdk.internal.util.DiskLruCache;
import h60.C17327j1;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import mf0.C24362h;
import org.json.JSONObject;
import p262t8.C6606a;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, mo59060d2 = {"Lcom/facebook/login/LoginClient;", "Landroid/os/Parcelable;", "a", "c", "Request", "Result", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public class LoginClient implements Parcelable {
    public static final Parcelable.Creator<LoginClient> CREATOR = new C2461b();

    /* renamed from: b */
    public LoginMethodHandler[] f8786b;

    /* renamed from: c */
    public int f8787c = -1;

    /* renamed from: d */
    public Fragment f8788d;

    /* renamed from: e */
    public C2462c f8789e;

    /* renamed from: f */
    public C2460a f8790f;

    /* renamed from: g */
    public boolean f8791g;

    /* renamed from: h */
    public Request f8792h;

    /* renamed from: i */
    public Map<String, String> f8793i;

    /* renamed from: j */
    public LinkedHashMap f8794j;

    /* renamed from: k */
    public C2479j f8795k;

    /* renamed from: l */
    public int f8796l;

    /* renamed from: m */
    public int f8797m;

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, mo59060d2 = {"Lcom/facebook/login/LoginClient$Result;", "Landroid/os/Parcelable;", "Code", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
    public static final class Result implements Parcelable {
        public static final Parcelable.Creator<Result> CREATOR = new C2459a();

        /* renamed from: b */
        public final Code f8816b;

        /* renamed from: c */
        public final AccessToken f8817c;

        /* renamed from: d */
        public final AuthenticationToken f8818d;

        /* renamed from: e */
        public final String f8819e;

        /* renamed from: f */
        public final String f8820f;

        /* renamed from: g */
        public final Request f8821g;

        /* renamed from: h */
        public Map<String, String> f8822h;

        /* renamed from: i */
        public HashMap f8823i;

        @Metadata(mo59059d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, mo59060d2 = {"Lcom/facebook/login/LoginClient$Result$Code;", "", "loggingValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getLoggingValue", "()Ljava/lang/String;", "SUCCESS", "CANCEL", "ERROR", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1}, mo59064xi = 48)
        public enum Code {
            SUCCESS(WidgetMessageParser.KEY_SUCCESS),
            CANCEL("cancel"),
            ERROR("error");
            
            private final String loggingValue;

            private Code(String str) {
                this.loggingValue = str;
            }

            public final String getLoggingValue() {
                return this.loggingValue;
            }
        }

        /* renamed from: com.facebook.login.LoginClient$Result$a */
        public static final class C2459a implements Parcelable.Creator<Result> {
            public final Object createFromParcel(Parcel parcel) {
                C24362h.m61211f(parcel, "source");
                return new Result(parcel);
            }

            public final Object[] newArray(int i) {
                return new Result[i];
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Result(Request request, Code code, AccessToken accessToken, String str, String str2) {
            this(request, code, accessToken, (AuthenticationToken) null, str, str2);
            C24362h.m61211f(code, "code");
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C24362h.m61211f(parcel, "dest");
            parcel.writeString(this.f8816b.name());
            parcel.writeParcelable(this.f8817c, i);
            parcel.writeParcelable(this.f8818d, i);
            parcel.writeString(this.f8819e);
            parcel.writeString(this.f8820f);
            parcel.writeParcelable(this.f8821g, i);
            C2397f0 f0Var = C2397f0.f8630a;
            C2397f0.m6306O(parcel, this.f8822h);
            C2397f0.m6306O(parcel, this.f8823i);
        }

        public Result(Request request, Code code, AccessToken accessToken, AuthenticationToken authenticationToken, String str, String str2) {
            C24362h.m61211f(code, "code");
            this.f8821g = request;
            this.f8817c = accessToken;
            this.f8818d = authenticationToken;
            this.f8819e = str;
            this.f8816b = code;
            this.f8820f = str2;
        }

        public Result(Parcel parcel) {
            String readString = parcel.readString();
            this.f8816b = Code.valueOf(readString == null ? "error" : readString);
            this.f8817c = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
            this.f8818d = (AuthenticationToken) parcel.readParcelable(AuthenticationToken.class.getClassLoader());
            this.f8819e = parcel.readString();
            this.f8820f = parcel.readString();
            this.f8821g = (Request) parcel.readParcelable(Request.class.getClassLoader());
            this.f8822h = C2397f0.m6302K(parcel);
            this.f8823i = C2397f0.m6302K(parcel);
        }
    }

    /* renamed from: com.facebook.login.LoginClient$a */
    public interface C2460a {
        /* renamed from: a */
        void mo12676a();

        /* renamed from: b */
        void mo12677b();
    }

    /* renamed from: com.facebook.login.LoginClient$b */
    public static final class C2461b implements Parcelable.Creator<LoginClient> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "source");
            return new LoginClient(parcel);
        }

        public final Object[] newArray(int i) {
            return new LoginClient[i];
        }
    }

    /* renamed from: com.facebook.login.LoginClient$c */
    public interface C2462c {
    }

    public LoginClient(Fragment fragment) {
        C24362h.m61211f(fragment, "fragment");
        if (this.f8788d == null) {
            this.f8788d = fragment;
            return;
        }
        throw new FacebookException("Can't set fragment once it is already set.");
    }

    /* renamed from: b */
    public final void mo12654b(String str, String str2, boolean z) {
        Map<String, String> map = this.f8793i;
        if (map == null) {
            map = new HashMap<>();
        }
        if (this.f8793i == null) {
            this.f8793i = map;
        }
        if (map.containsKey(str) && z) {
            str2 = map.get(str) + ',' + str2;
        }
        map.put(str, str2);
    }

    /* renamed from: c */
    public final boolean mo12655c() {
        int i;
        String str;
        if (this.f8791g) {
            return true;
        }
        FragmentActivity g = mo12659g();
        if (g == null) {
            i = -1;
        } else {
            i = g.checkCallingOrSelfPermission("android.permission.INTERNET");
        }
        if (i != 0) {
            FragmentActivity g2 = mo12659g();
            String str2 = null;
            if (g2 == null) {
                str = null;
            } else {
                str = g2.getString(C2362e.com_facebook_internet_permission_error_title);
            }
            if (g2 != null) {
                str2 = g2.getString(C2362e.com_facebook_internet_permission_error_message);
            }
            Request request = this.f8792h;
            ArrayList arrayList = new ArrayList();
            if (str != null) {
                arrayList.add(str);
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            mo12656d(new Result(request, Result.Code.ERROR, (AccessToken) null, TextUtils.join(": ", arrayList), (String) null));
            return false;
        }
        this.f8791g = true;
        return true;
    }

    /* renamed from: d */
    public final void mo12656d(Result result) {
        C24362h.m61211f(result, "outcome");
        LoginMethodHandler j = mo12660j();
        if (j != null) {
            mo12662l(j.mo12608g(), result.f8816b.getLoggingValue(), result.f8819e, result.f8820f, j.f8824b);
        }
        Map<String, String> map = this.f8793i;
        if (map != null) {
            result.f8822h = map;
        }
        LinkedHashMap linkedHashMap = this.f8794j;
        if (linkedHashMap != null) {
            result.f8823i = linkedHashMap;
        }
        this.f8786b = null;
        int i = -1;
        this.f8787c = -1;
        this.f8792h = null;
        this.f8793i = null;
        this.f8796l = 0;
        this.f8797m = 0;
        C2462c cVar = this.f8789e;
        if (cVar != null) {
            C2477i iVar = (C2477i) ((C17327j1) cVar).f44716c;
            int i2 = C2477i.f8862g;
            C24362h.m61211f(iVar, "this$0");
            iVar.f8864c = null;
            if (result.f8816b == Result.Code.CANCEL) {
                i = 0;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("com.facebook.LoginFragment:Result", result);
            Intent intent = new Intent();
            intent.putExtras(bundle);
            FragmentActivity activity = iVar.getActivity();
            if (iVar.isAdded() && activity != null) {
                activity.setResult(i, intent);
                activity.finish();
            }
        }
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: f */
    public final void mo12658f(Result result) {
        Result result2;
        C24362h.m61211f(result, "outcome");
        if (result.f8817c != null) {
            Date date = AccessToken.f8348m;
            if (AccessToken.C2266c.m6111c()) {
                if (result.f8817c != null) {
                    AccessToken b = AccessToken.C2266c.m6110b();
                    AccessToken accessToken = result.f8817c;
                    if (b != null) {
                        try {
                            if (C24362h.m61206a(b.f8359j, accessToken.f8359j)) {
                                result2 = new Result(this.f8792h, Result.Code.SUCCESS, result.f8817c, result.f8818d, (String) null, (String) null);
                                mo12656d(result2);
                                return;
                            }
                        } catch (Exception e) {
                            Request request = this.f8792h;
                            String message = e.getMessage();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add("Caught exception");
                            if (message != null) {
                                arrayList.add(message);
                            }
                            mo12656d(new Result(request, Result.Code.ERROR, (AccessToken) null, TextUtils.join(": ", arrayList), (String) null));
                            return;
                        }
                    }
                    Request request2 = this.f8792h;
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add("User logged in as different Facebook user.");
                    result2 = new Result(request2, Result.Code.ERROR, (AccessToken) null, TextUtils.join(": ", arrayList2), (String) null);
                    mo12656d(result2);
                    return;
                }
                throw new FacebookException("Can't validate without a token");
            }
        }
        mo12656d(result);
    }

    /* renamed from: g */
    public final FragmentActivity mo12659g() {
        Fragment fragment = this.f8788d;
        if (fragment == null) {
            return null;
        }
        return fragment.getActivity();
    }

    /* renamed from: j */
    public final LoginMethodHandler mo12660j() {
        LoginMethodHandler[] loginMethodHandlerArr;
        int i = this.f8787c;
        if (i < 0 || (loginMethodHandlerArr = this.f8786b) == null) {
            return null;
        }
        return loginMethodHandlerArr[i];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        if (mf0.C24362h.m61206a(r1, r2) != false) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001a  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebook.login.C2479j mo12661k() {
        /*
            r4 = this;
            com.facebook.login.j r0 = r4.f8795k
            if (r0 == 0) goto L_0x0022
            boolean r1 = p262t8.C6606a.m15601b(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000d
        L_0x000b:
            r1 = r2
            goto L_0x0015
        L_0x000d:
            java.lang.String r1 = r0.f8870a     // Catch:{ all -> 0x0010 }
            goto L_0x0015
        L_0x0010:
            r1 = move-exception
            p262t8.C6606a.m15600a(r0, r1)
            goto L_0x000b
        L_0x0015:
            com.facebook.login.LoginClient$Request r3 = r4.f8792h
            if (r3 != 0) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            java.lang.String r2 = r3.f8801e
        L_0x001c:
            boolean r1 = mf0.C24362h.m61206a(r1, r2)
            if (r1 != 0) goto L_0x003e
        L_0x0022:
            com.facebook.login.j r0 = new com.facebook.login.j
            androidx.fragment.app.FragmentActivity r1 = r4.mo12659g()
            if (r1 != 0) goto L_0x002e
            android.content.Context r1 = p009a8.C0115o.m210a()
        L_0x002e:
            com.facebook.login.LoginClient$Request r2 = r4.f8792h
            if (r2 != 0) goto L_0x0037
            java.lang.String r2 = p009a8.C0115o.m211b()
            goto L_0x0039
        L_0x0037:
            java.lang.String r2 = r2.f8801e
        L_0x0039:
            r0.<init>(r1, r2)
            r4.f8795k = r0
        L_0x003e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.LoginClient.mo12661k():com.facebook.login.j");
    }

    /* renamed from: l */
    public final void mo12662l(String str, String str2, String str3, String str4, HashMap hashMap) {
        boolean z;
        Request request = this.f8792h;
        String str5 = "fb_mobile_login_method_complete";
        if (request == null) {
            mo12661k().mo12701a(str5, str);
            return;
        }
        C2479j k = mo12661k();
        String str6 = request.f8802f;
        if (request.f8810n) {
            str5 = "foa_mobile_login_method_complete";
        }
        if (!C6606a.m15601b(k)) {
            try {
                ScheduledExecutorService scheduledExecutorService = C2479j.f8869d;
                Bundle a = C2479j.C2480a.m6514a(str6);
                if (str2 != null) {
                    a.putString("2_result", str2);
                }
                if (str3 != null) {
                    a.putString("5_error_message", str3);
                }
                if (str4 != null) {
                    a.putString("4_error_code", str4);
                }
                if (hashMap != null && (!hashMap.isEmpty())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : hashMap.entrySet()) {
                        if (((String) entry.getKey()) != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    a.putString("6_extras", new JSONObject(linkedHashMap).toString());
                }
                a.putString("3_method", str);
                k.f8871b.mo12509a(a, str5);
            } catch (Throwable th) {
                C6606a.m15600a(k, th);
            }
        }
    }

    /* renamed from: m */
    public final void mo12663m(int i, int i2, Intent intent) {
        this.f8796l++;
        if (this.f8792h == null) {
            return;
        }
        if (intent == null || !intent.getBooleanExtra(CustomTabMainActivity.f8407j, false)) {
            LoginMethodHandler j = mo12660j();
            if (j == null) {
                return;
            }
            if (!(j instanceof KatanaProxyLoginMethodHandler) || intent != null || this.f8796l >= this.f8797m) {
                j.mo12610l(i, i2, intent);
                return;
            }
            return;
        }
        mo12664n();
    }

    /* renamed from: n */
    public final void mo12664n() {
        String str;
        String str2;
        LoginMethodHandler j = mo12660j();
        if (j != null) {
            mo12662l(j.mo12608g(), "skipped", (String) null, (String) null, j.f8824b);
        }
        LoginMethodHandler[] loginMethodHandlerArr = this.f8786b;
        while (loginMethodHandlerArr != null) {
            int i = this.f8787c;
            boolean z = true;
            if (i >= loginMethodHandlerArr.length - 1) {
                break;
            }
            this.f8787c = i + 1;
            LoginMethodHandler j2 = mo12660j();
            boolean z2 = false;
            if (j2 != null) {
                if (!(j2 instanceof WebViewLoginMethodHandler) || mo12655c()) {
                    Request request = this.f8792h;
                    if (request == null) {
                        continue;
                    } else {
                        int o = j2.mo12612o(request);
                        this.f8796l = 0;
                        if (o > 0) {
                            C2479j k = mo12661k();
                            String str3 = request.f8802f;
                            String g = j2.mo12608g();
                            if (request.f8810n) {
                                str2 = "foa_mobile_login_method_start";
                            } else {
                                str2 = "fb_mobile_login_method_start";
                            }
                            if (!C6606a.m15601b(k)) {
                                try {
                                    ScheduledExecutorService scheduledExecutorService = C2479j.f8869d;
                                    Bundle a = C2479j.C2480a.m6514a(str3);
                                    a.putString("3_method", g);
                                    k.f8871b.mo12509a(a, str2);
                                } catch (Throwable th) {
                                    C6606a.m15600a(k, th);
                                }
                            }
                            this.f8797m = o;
                        } else {
                            C2479j k2 = mo12661k();
                            String str4 = request.f8802f;
                            String g2 = j2.mo12608g();
                            if (request.f8810n) {
                                str = "foa_mobile_login_method_not_tried";
                            } else {
                                str = "fb_mobile_login_method_not_tried";
                            }
                            if (!C6606a.m15601b(k2)) {
                                try {
                                    ScheduledExecutorService scheduledExecutorService2 = C2479j.f8869d;
                                    Bundle a2 = C2479j.C2480a.m6514a(str4);
                                    a2.putString("3_method", g2);
                                    k2.f8871b.mo12509a(a2, str);
                                } catch (Throwable th2) {
                                    C6606a.m15600a(k2, th2);
                                }
                            }
                            mo12654b("not_tried", j2.mo12608g(), true);
                        }
                        if (o <= 0) {
                            z = false;
                        }
                        z2 = z;
                        continue;
                    }
                } else {
                    mo12654b("no_internet_permission", DiskLruCache.VERSION_1, false);
                    continue;
                }
            }
            if (z2) {
                return;
            }
        }
        Request request2 = this.f8792h;
        if (request2 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("Login attempt failed.");
            mo12656d(new Result(request2, Result.Code.ERROR, (AccessToken) null, TextUtils.join(": ", arrayList), (String) null));
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "dest");
        parcel.writeParcelableArray((Parcelable[]) this.f8786b, i);
        parcel.writeInt(this.f8787c);
        parcel.writeParcelable(this.f8792h, i);
        C2397f0 f0Var = C2397f0.f8630a;
        C2397f0.m6306O(parcel, this.f8793i);
        C2397f0.m6306O(parcel, this.f8794j);
    }

    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [java.util.LinkedHashMap] */
    /* JADX WARNING: type inference failed for: r5v3, types: [java.lang.Object, com.facebook.login.LoginMethodHandler] */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LoginClient(android.os.Parcel r9) {
        /*
            r8 = this;
            java.lang.String r0 = "source"
            mf0.C24362h.m61211f(r9, r0)
            r8.<init>()
            r0 = -1
            r8.f8787c = r0
            java.lang.Class<com.facebook.login.LoginMethodHandler> r0 = com.facebook.login.LoginMethodHandler.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable[] r0 = r9.readParcelableArray(r0)
            r1 = 0
            if (r0 != 0) goto L_0x001a
            android.os.Parcelable[] r0 = new android.os.Parcelable[r1]
        L_0x001a:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r0.length
            r4 = 0
        L_0x0021:
            r5 = 0
            if (r4 >= r3) goto L_0x003a
            r6 = r0[r4]
            boolean r7 = r6 instanceof com.facebook.login.LoginMethodHandler
            if (r7 == 0) goto L_0x002d
            r5 = r6
            com.facebook.login.LoginMethodHandler r5 = (com.facebook.login.LoginMethodHandler) r5
        L_0x002d:
            if (r5 != 0) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            r5.f8825c = r8
        L_0x0032:
            if (r5 == 0) goto L_0x0037
            r2.add(r5)
        L_0x0037:
            int r4 = r4 + 1
            goto L_0x0021
        L_0x003a:
            com.facebook.login.LoginMethodHandler[] r0 = new com.facebook.login.LoginMethodHandler[r1]
            java.lang.Object[] r0 = r2.toArray(r0)
            if (r0 == 0) goto L_0x0076
            com.facebook.login.LoginMethodHandler[] r0 = (com.facebook.login.LoginMethodHandler[]) r0
            r8.f8786b = r0
            int r0 = r9.readInt()
            r8.f8787c = r0
            java.lang.Class<com.facebook.login.LoginClient$Request> r0 = com.facebook.login.LoginClient.Request.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r9.readParcelable(r0)
            com.facebook.login.LoginClient$Request r0 = (com.facebook.login.LoginClient.Request) r0
            r8.f8792h = r0
            java.util.HashMap r0 = com.facebook.internal.C2397f0.m6302K(r9)
            if (r0 != 0) goto L_0x0062
            r0 = r5
            goto L_0x0066
        L_0x0062:
            java.util.LinkedHashMap r0 = kotlin.collections.C23826d.m58538c0(r0)
        L_0x0066:
            r8.f8793i = r0
            java.util.HashMap r9 = com.facebook.internal.C2397f0.m6302K(r9)
            if (r9 != 0) goto L_0x006f
            goto L_0x0073
        L_0x006f:
            java.util.LinkedHashMap r5 = kotlin.collections.C23826d.m58538c0(r9)
        L_0x0073:
            r8.f8794j = r5
            return
        L_0x0076:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T>"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.LoginClient.<init>(android.os.Parcel):void");
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/facebook/login/LoginClient$Request;", "Landroid/os/Parcelable;", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
    public static final class Request implements Parcelable {
        public static final Parcelable.Creator<Request> CREATOR = new C2458a();

        /* renamed from: b */
        public final LoginBehavior f8798b;

        /* renamed from: c */
        public Set<String> f8799c;

        /* renamed from: d */
        public final DefaultAudience f8800d;

        /* renamed from: e */
        public final String f8801e;

        /* renamed from: f */
        public String f8802f;

        /* renamed from: g */
        public boolean f8803g;

        /* renamed from: h */
        public String f8804h;

        /* renamed from: i */
        public String f8805i;

        /* renamed from: j */
        public String f8806j;

        /* renamed from: k */
        public String f8807k;

        /* renamed from: l */
        public boolean f8808l;

        /* renamed from: m */
        public final LoginTargetApp f8809m;

        /* renamed from: n */
        public boolean f8810n;

        /* renamed from: o */
        public boolean f8811o;

        /* renamed from: p */
        public final String f8812p;

        /* renamed from: q */
        public final String f8813q;

        /* renamed from: r */
        public final String f8814r;

        /* renamed from: s */
        public final CodeChallengeMethod f8815s;

        /* renamed from: com.facebook.login.LoginClient$Request$a */
        public static final class C2458a implements Parcelable.Creator<Request> {
            public final Object createFromParcel(Parcel parcel) {
                C24362h.m61211f(parcel, "source");
                return new Request(parcel);
            }

            public final Object[] newArray(int i) {
                return new Request[i];
            }
        }

        public Request(LoginBehavior loginBehavior, Set<String> set, DefaultAudience defaultAudience, String str, String str2, String str3, LoginTargetApp loginTargetApp, String str4, String str5, String str6, CodeChallengeMethod codeChallengeMethod) {
            C24362h.m61211f(loginBehavior, "loginBehavior");
            C24362h.m61211f(defaultAudience, "defaultAudience");
            C24362h.m61211f(str, "authType");
            this.f8798b = loginBehavior;
            this.f8799c = set == null ? new HashSet<>() : set;
            this.f8800d = defaultAudience;
            this.f8805i = str;
            this.f8801e = str2;
            this.f8802f = str3;
            this.f8809m = loginTargetApp == null ? LoginTargetApp.FACEBOOK : loginTargetApp;
            if (str4 != null) {
                if (!(str4.length() == 0)) {
                    this.f8812p = str4;
                    this.f8813q = str5;
                    this.f8814r = str6;
                    this.f8815s = codeChallengeMethod;
                }
            }
            String uuid = UUID.randomUUID().toString();
            C24362h.m61210e(uuid, "randomUUID().toString()");
            this.f8812p = uuid;
            this.f8813q = str5;
            this.f8814r = str6;
            this.f8815s = codeChallengeMethod;
        }

        /* renamed from: b */
        public final boolean mo12666b() {
            for (String a : this.f8799c) {
                C2483m.C2484a aVar = C2483m.f8876f;
                if (C2483m.C2484a.m6520a(a)) {
                    return true;
                }
            }
            return false;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            String str;
            C24362h.m61211f(parcel, "dest");
            parcel.writeString(this.f8798b.name());
            parcel.writeStringList(new ArrayList(this.f8799c));
            parcel.writeString(this.f8800d.name());
            parcel.writeString(this.f8801e);
            parcel.writeString(this.f8802f);
            parcel.writeByte(this.f8803g ? (byte) 1 : 0);
            parcel.writeString(this.f8804h);
            parcel.writeString(this.f8805i);
            parcel.writeString(this.f8806j);
            parcel.writeString(this.f8807k);
            parcel.writeByte(this.f8808l ? (byte) 1 : 0);
            parcel.writeString(this.f8809m.name());
            parcel.writeByte(this.f8810n ? (byte) 1 : 0);
            parcel.writeByte(this.f8811o ? (byte) 1 : 0);
            parcel.writeString(this.f8812p);
            parcel.writeString(this.f8813q);
            parcel.writeString(this.f8814r);
            CodeChallengeMethod codeChallengeMethod = this.f8815s;
            if (codeChallengeMethod == null) {
                str = null;
            } else {
                str = codeChallengeMethod.name();
            }
            parcel.writeString(str);
        }

        public Request(Parcel parcel) {
            DefaultAudience defaultAudience;
            LoginTargetApp loginTargetApp;
            CodeChallengeMethod codeChallengeMethod;
            int i = C2400g0.f8641a;
            String readString = parcel.readString();
            C2400g0.m6341f(readString, "loginBehavior");
            this.f8798b = LoginBehavior.valueOf(readString);
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.f8799c = new HashSet(arrayList);
            String readString2 = parcel.readString();
            if (readString2 != null) {
                defaultAudience = DefaultAudience.valueOf(readString2);
            } else {
                defaultAudience = DefaultAudience.NONE;
            }
            this.f8800d = defaultAudience;
            String readString3 = parcel.readString();
            C2400g0.m6341f(readString3, "applicationId");
            this.f8801e = readString3;
            String readString4 = parcel.readString();
            C2400g0.m6341f(readString4, "authId");
            this.f8802f = readString4;
            boolean z = true;
            this.f8803g = parcel.readByte() != 0;
            this.f8804h = parcel.readString();
            String readString5 = parcel.readString();
            C2400g0.m6341f(readString5, "authType");
            this.f8805i = readString5;
            this.f8806j = parcel.readString();
            this.f8807k = parcel.readString();
            this.f8808l = parcel.readByte() != 0;
            String readString6 = parcel.readString();
            if (readString6 != null) {
                loginTargetApp = LoginTargetApp.valueOf(readString6);
            } else {
                loginTargetApp = LoginTargetApp.FACEBOOK;
            }
            this.f8809m = loginTargetApp;
            this.f8810n = parcel.readByte() != 0;
            this.f8811o = parcel.readByte() == 0 ? false : z;
            String readString7 = parcel.readString();
            C2400g0.m6341f(readString7, "nonce");
            this.f8812p = readString7;
            this.f8813q = parcel.readString();
            this.f8814r = parcel.readString();
            String readString8 = parcel.readString();
            if (readString8 == null) {
                codeChallengeMethod = null;
            } else {
                codeChallengeMethod = CodeChallengeMethod.valueOf(readString8);
            }
            this.f8815s = codeChallengeMethod;
        }
    }
}
