package com.moovit.app.useraccount.providers.facebook;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookException;
import com.facebook.Profile;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.login.C2481k;
import com.facebook.login.C2483m;
import com.facebook.login.C2486n;
import com.moovit.app.useraccount.providers.ConnectProvider;
import com.moovit.commons.utils.ApplicationBugException;
import com.tranzmate.R;
import java.util.Date;
import p009a8.C0100e;
import p009a8.C0109i;
import p009a8.C0115o;
import p009a8.C0127w;
import p572iw.C17662e;
import p621ky.C18157a;

public class FacebookConnectProviderFragment extends C18157a<AccessToken> {

    /* renamed from: f */
    public static final String[] f40648f = {"public_profile", "email"};

    /* renamed from: c */
    public CallbackManagerImpl f40649c;

    /* renamed from: d */
    public String[] f40650d;

    /* renamed from: e */
    public final C15637a f40651e = new C15637a();

    /* renamed from: com.moovit.app.useraccount.providers.facebook.FacebookConnectProviderFragment$a */
    public class C15637a implements C0109i<C2486n> {
        public C15637a() {
        }

        /* renamed from: a */
        public final void mo46650a(FacebookException facebookException) {
            FacebookConnectProviderFragment facebookConnectProviderFragment = FacebookConnectProviderFragment.this;
            String[] strArr = FacebookConnectProviderFragment.f40648f;
            facebookConnectProviderFragment.getClass();
            if (facebookException instanceof FacebookAuthorizationException) {
                Date date = AccessToken.f8348m;
                if (AccessToken.C2266c.m6110b() != null) {
                    C2483m a = C2483m.m6517a();
                    C0100e.f304f.mo216a().mo215c((AccessToken) null, true);
                    AuthenticationToken.C2270b.m6113a((AuthenticationToken) null);
                    Parcelable.Creator<Profile> creator = Profile.CREATOR;
                    C0127w.f369d.mo282a().mo281a((Profile) null, true);
                    SharedPreferences.Editor edit = a.f8881c.edit();
                    edit.putBoolean("express_login_allowed", false);
                    edit.apply();
                }
            }
            facebookConnectProviderFragment.mo50585K1(0, facebookException.getLocalizedMessage());
        }
    }

    /* renamed from: H1 */
    public final ConnectProvider mo46649H1() {
        return ConnectProvider.FACEBOOK;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (!this.f40649c.onActivityResult(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (C0115o.m217h()) {
            this.f40649c = new CallbackManagerImpl();
            C2483m a = C2483m.m6517a();
            CallbackManagerImpl callbackManagerImpl = this.f40649c;
            C15637a aVar = this.f40651e;
            if (callbackManagerImpl instanceof CallbackManagerImpl) {
                int requestCode = CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
                C2481k kVar = new C2481k(a, aVar);
                callbackManagerImpl.getClass();
                callbackManagerImpl.f8587a.put(Integer.valueOf(requestCode), kVar);
                return;
            }
            throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
        }
        StringBuilder k = C13555b.m33972k("Attempting to use ");
        k.append(getClass().getSimpleName());
        k.append(", but Facebook is not supported");
        throw new ApplicationBugException(k.toString());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (this.f46393b == 0) {
            i = R.layout.facebook_connect_cell_fragment;
        } else {
            i = R.layout.facebook_connect_button_fragment;
        }
        return layoutInflater.inflate(i, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.findViewById(R.id.facebook_connect).setOnClickListener(new C17662e(this, 5));
    }
}
