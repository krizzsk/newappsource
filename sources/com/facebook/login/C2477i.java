package com.facebook.login;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.C0207b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.common.C2360c;
import com.facebook.common.C2361d;
import com.facebook.login.LoginClient;
import h60.C17327j1;
import java.util.ArrayList;
import java.util.Date;
import kotlin.Metadata;
import mf0.C24362h;
import p009a8.C0115o;
import p019b0.C1436m;
import p065e.C4413c;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo59060d2 = {"Lcom/facebook/login/i;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
/* renamed from: com.facebook.login.i */
public class C2477i extends Fragment {

    /* renamed from: g */
    public static final /* synthetic */ int f8862g = 0;

    /* renamed from: b */
    public String f8863b;

    /* renamed from: c */
    public LoginClient.Request f8864c;

    /* renamed from: d */
    public LoginClient f8865d;

    /* renamed from: e */
    public C0207b<Intent> f8866e;

    /* renamed from: f */
    public View f8867f;

    /* renamed from: com.facebook.login.i$a */
    public static final class C2478a implements LoginClient.C2460a {

        /* renamed from: a */
        public final /* synthetic */ C2477i f8868a;

        public C2478a(C2477i iVar) {
            this.f8868a = iVar;
        }

        /* renamed from: a */
        public final void mo12676a() {
            View view = this.f8868a.f8867f;
            if (view != null) {
                view.setVisibility(0);
            } else {
                C24362h.m61217l("progressBar");
                throw null;
            }
        }

        /* renamed from: b */
        public final void mo12677b() {
            View view = this.f8868a.f8867f;
            if (view != null) {
                view.setVisibility(8);
            } else {
                C24362h.m61217l("progressBar");
                throw null;
            }
        }
    }

    /* renamed from: H1 */
    public final LoginClient mo12700H1() {
        LoginClient loginClient = this.f8865d;
        if (loginClient != null) {
            return loginClient;
        }
        C24362h.m61217l("loginClient");
        throw null;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        mo12700H1().mo12663m(i, i2, intent);
    }

    public final void onCreate(Bundle bundle) {
        LoginClient loginClient;
        Bundle bundleExtra;
        super.onCreate(bundle);
        if (bundle == null) {
            loginClient = null;
        } else {
            loginClient = (LoginClient) bundle.getParcelable("loginClient");
        }
        if (loginClient == null) {
            loginClient = new LoginClient((Fragment) this);
        } else if (loginClient.f8788d == null) {
            loginClient.f8788d = this;
        } else {
            throw new FacebookException("Can't set fragment once it is already set.");
        }
        this.f8865d = loginClient;
        mo12700H1().f8789e = new C17327j1(this, 1);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ComponentName callingActivity = activity.getCallingActivity();
            if (callingActivity != null) {
                this.f8863b = callingActivity.getPackageName();
            }
            Intent intent = activity.getIntent();
            if (!(intent == null || (bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request")) == null)) {
                this.f8864c = (LoginClient.Request) bundleExtra.getParcelable("request");
            }
            C0207b<Intent> registerForActivityResult = registerForActivityResult(new C4413c(), new C1436m(new LoginFragment$getLoginMethodHandlerCallback$1(this, activity), 3));
            C24362h.m61210e(registerForActivityResult, "registerForActivityResult(\n            ActivityResultContracts.StartActivityForResult(),\n            getLoginMethodHandlerCallback(activity))");
            this.f8866e = registerForActivityResult;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C24362h.m61211f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C2361d.com_facebook_login_fragment, viewGroup, false);
        View findViewById = inflate.findViewById(C2360c.com_facebook_login_fragment_progress_bar);
        C24362h.m61210e(findViewById, "view.findViewById<View>(R.id.com_facebook_login_fragment_progress_bar)");
        this.f8867f = findViewById;
        mo12700H1().f8790f = new C2478a(this);
        return inflate;
    }

    public final void onDestroy() {
        LoginMethodHandler j = mo12700H1().mo12660j();
        if (j != null) {
            j.mo12635c();
        }
        super.onDestroy();
    }

    public final void onPause() {
        View view;
        super.onPause();
        View view2 = getView();
        if (view2 == null) {
            view = null;
        } else {
            view = view2.findViewById(C2360c.com_facebook_login_fragment_progress_bar);
        }
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public final void onResume() {
        boolean z;
        boolean z2;
        super.onResume();
        if (this.f8863b == null) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        LoginClient H1 = mo12700H1();
        LoginClient.Request request = this.f8864c;
        LoginClient.Request request2 = H1.f8792h;
        boolean z3 = true;
        if (request2 == null || H1.f8787c < 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z && request != null) {
            if (request2 == null) {
                Date date = AccessToken.f8348m;
                if (!AccessToken.C2266c.m6111c() || H1.mo12655c()) {
                    H1.f8792h = request;
                    ArrayList arrayList = new ArrayList();
                    LoginBehavior loginBehavior = request.f8798b;
                    LoginTargetApp loginTargetApp = request.f8809m;
                    LoginTargetApp loginTargetApp2 = LoginTargetApp.INSTAGRAM;
                    if (loginTargetApp == loginTargetApp2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        if (loginBehavior.allowsGetTokenAuth()) {
                            arrayList.add(new GetTokenLoginMethodHandler(H1));
                        }
                        if (!C0115o.f345o && loginBehavior.allowsKatanaAuth()) {
                            arrayList.add(new KatanaProxyLoginMethodHandler(H1));
                        }
                    } else if (!C0115o.f345o && loginBehavior.allowsInstagramAppAuth()) {
                        arrayList.add(new InstagramAppLoginMethodHandler(H1));
                    }
                    if (loginBehavior.allowsCustomTabAuth()) {
                        arrayList.add(new CustomTabLoginMethodHandler(H1));
                    }
                    if (loginBehavior.allowsWebViewAuth()) {
                        arrayList.add(new WebViewLoginMethodHandler(H1));
                    }
                    if (request.f8809m != loginTargetApp2) {
                        z3 = false;
                    }
                    if (!z3 && loginBehavior.allowsDeviceAuth()) {
                        arrayList.add(new DeviceAuthMethodHandler(H1));
                    }
                    Object[] array = arrayList.toArray(new LoginMethodHandler[0]);
                    if (array != null) {
                        H1.f8786b = (LoginMethodHandler[]) array;
                        H1.mo12664n();
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                return;
            }
            throw new FacebookException("Attempted to authorize while a request is pending.");
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        C24362h.m61211f(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("loginClient", mo12700H1());
    }
}
