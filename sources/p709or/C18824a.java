package p709or;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.facebook.AccessToken;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.carpool.registration.CarpoolRegistrationActivity;
import com.moovit.app.useraccount.providers.ConnectProvider;
import com.moovit.app.useraccount.providers.facebook.FacebookConnectProviderFragment;
import com.moovit.request.RequestOptions;
import com.tranzmate.R;
import java.util.Date;
import p621ky.C18157a;
import p685nr.C18586a;
import z90.C13348f;

/* renamed from: or.a */
public class C18824a extends C18586a implements C18157a.C18158a {

    /* renamed from: b */
    public static final /* synthetic */ int f47931b = 0;

    /* renamed from: H1 */
    public final int mo50979H1() {
        return R.string.carpool_registration_fb_login_title;
    }

    /* renamed from: J1 */
    public final AnalyticsEventKey mo50981J1() {
        return AnalyticsEventKey.STEP_FACEBOOK_LOGIN;
    }

    /* renamed from: U0 */
    public final void mo46546U0(ConnectProvider connectProvider, String str, String str2) {
        CarpoolRegistrationActivity I1;
        if (connectProvider == ConnectProvider.FACEBOOK && ((FacebookConnectProviderFragment) getChildFragmentManager().mo3983z(R.id.facebook_connect_fragment)) != null && (I1 = mo50980I1()) != null) {
            Date date = AccessToken.f8348m;
            AccessToken b = AccessToken.C2266c.m6110b();
            I1.mo44540t2(R.string.carpool_registration_sending_facebook_token);
            C13348f fVar = new C13348f(I1.mo44548x1(), b);
            RequestOptions requestOptions = new RequestOptions();
            requestOptions.f42909f = true;
            I1.mo44527k2("set_facebook_token", fVar, requestOptions, I1.f37820Z);
        }
    }

    /* renamed from: g0 */
    public final void mo46547g0(ConnectProvider connectProvider, int i, String str) {
        Toast.makeText(getContext(), getString(R.string.response_read_error_message), 1).show();
    }

    /* renamed from: n */
    public final void mo46548n(ConnectProvider connectProvider) {
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.carpool_registration_facebook_fragment, viewGroup, false);
        ((FacebookConnectProviderFragment) getChildFragmentManager().mo3983z(R.id.facebook_connect_fragment)).f40650d = new String[]{"public_profile", "user_friends", "email"};
        return inflate;
    }
}
