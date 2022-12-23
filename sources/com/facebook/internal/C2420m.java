package com.facebook.internal;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Message;
import androidx.fragment.app.C0942l;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.login.LoginTargetApp;
import com.usebutton.sdk.internal.events.Events;
import java.util.Date;
import kotlin.Metadata;
import mf0.C24362h;
import p009a8.C0115o;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo59060d2 = {"Lcom/facebook/internal/m;", "Landroidx/fragment/app/l;", "<init>", "()V", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
/* renamed from: com.facebook.internal.m */
public final class C2420m extends C0942l {

    /* renamed from: c */
    public static final /* synthetic */ int f8689c = 0;

    /* renamed from: b */
    public Dialog f8690b;

    /* renamed from: H1 */
    public final void mo12590H1(Bundle bundle, FacebookException facebookException) {
        int i;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C2440z zVar = C2440z.f8743a;
            Intent intent = activity.getIntent();
            C24362h.m61210e(intent, "fragmentActivity.intent");
            Intent f = C2440z.m6401f(intent, bundle, facebookException);
            if (facebookException == null) {
                i = -1;
            } else {
                i = 0;
            }
            activity.setResult(i, f);
            activity.finish();
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        C24362h.m61211f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        if ((this.f8690b instanceof C2410j0) && isResumed()) {
            Dialog dialog = this.f8690b;
            if (dialog != null) {
                ((C2410j0) dialog).mo12567c();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
        }
    }

    public final void onCreate(Bundle bundle) {
        FragmentActivity activity;
        boolean z;
        C2410j0 j0Var;
        String str;
        Bundle bundle2;
        String str2;
        super.onCreate(bundle);
        if (this.f8690b == null && (activity = getActivity()) != null) {
            Intent intent = activity.getIntent();
            C2440z zVar = C2440z.f8743a;
            C24362h.m61210e(intent, "intent");
            Bundle m = C2440z.m6406m(intent);
            if (m == null) {
                z = false;
            } else {
                z = m.getBoolean("is_fallback", false);
            }
            String str3 = null;
            if (!z) {
                if (m == null) {
                    str = null;
                } else {
                    str = m.getString(Events.PROPERTY_ACTION);
                }
                if (m == null) {
                    bundle2 = null;
                } else {
                    bundle2 = m.getBundle("params");
                }
                if (C2397f0.m6292A(str)) {
                    C0115o oVar = C0115o.f331a;
                    activity.finish();
                    return;
                } else if (str != null) {
                    Date date = AccessToken.f8348m;
                    AccessToken b = AccessToken.C2266c.m6110b();
                    if (!AccessToken.C2266c.m6111c()) {
                        str2 = C2397f0.m6323q(activity);
                    } else {
                        str2 = null;
                    }
                    if (bundle2 == null) {
                        bundle2 = new Bundle();
                    }
                    C2417k kVar = new C2417k(this);
                    if (b != null) {
                        bundle2.putString("app_id", b.f8358i);
                        if (b != null) {
                            str3 = b.f8355f;
                        }
                        bundle2.putString("access_token", str3);
                    } else {
                        bundle2.putString("app_id", str2);
                    }
                    int i = C2410j0.f8659n;
                    C2410j0.m6361a(activity);
                    j0Var = new C2410j0(activity, str, bundle2, LoginTargetApp.FACEBOOK, kVar);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else {
                if (m != null) {
                    str3 = m.getString("url");
                }
                if (C2397f0.m6292A(str3)) {
                    C0115o oVar2 = C0115o.f331a;
                    activity.finish();
                    return;
                }
                String j = C13555b.m33971j(new Object[]{C0115o.m211b()}, 1, "fb%s://bridge/", "java.lang.String.format(format, *args)");
                int i2 = C2425p.f8698q;
                if (str3 != null) {
                    C2410j0.m6361a(activity);
                    j0Var = new C2425p(activity, str3, j);
                    j0Var.f8663d = new C2419l(this);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            }
            this.f8690b = j0Var;
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f8690b;
        if (dialog == null) {
            mo12590H1((Bundle) null, (FacebookException) null);
            setShowsDialog(false);
            Dialog onCreateDialog = super.onCreateDialog(bundle);
            C24362h.m61210e(onCreateDialog, "super.onCreateDialog(savedInstanceState)");
            return onCreateDialog;
        } else if (dialog != null) {
            return dialog;
        } else {
            throw new NullPointerException("null cannot be cast to non-null type android.app.Dialog");
        }
    }

    public final void onDestroyView() {
        Dialog dialog = getDialog();
        if (dialog != null && getRetainInstance()) {
            dialog.setDismissMessage((Message) null);
        }
        super.onDestroyView();
    }

    public final void onResume() {
        super.onResume();
        Dialog dialog = this.f8690b;
        if (!(dialog instanceof C2410j0)) {
            return;
        }
        if (dialog != null) {
            ((C2410j0) dialog).mo12567c();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
    }
}
