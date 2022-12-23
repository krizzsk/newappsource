package p668my;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.moovit.app.useraccount.manager.accesstoken.AccessTokenResult;
import com.moovit.app.useraccount.providers.ConnectProvider;
import com.tranzmate.R;
import p501fw.C17102a;
import p621ky.C18157a;
import p977zz.C20964s0;

/* renamed from: my.c */
public class C18479c extends C18157a<AccessTokenResult> {

    /* renamed from: d */
    public static final /* synthetic */ int f47082d = 0;

    /* renamed from: c */
    public AccessTokenResult f47083c;

    /* renamed from: H1 */
    public final ConnectProvider mo46649H1() {
        return ConnectProvider.MOOVIT;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        AccessTokenResult accessTokenResult;
        super.onActivityResult(i, i2, intent);
        if (i == 1001) {
            if (intent == null) {
                accessTokenResult = new AccessTokenResult();
            } else {
                String stringExtra = intent.getStringExtra("extra_access_token");
                accessTokenResult = new AccessTokenResult(true ^ C20964s0.m49090h(stringExtra), intent.getBooleanExtra("is_new_access_token", true), stringExtra);
            }
            this.f47083c = accessTokenResult;
            if (accessTokenResult.f40588b) {
                mo50583I1("", accessTokenResult.f40589c);
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.moovit_connect_fragment, viewGroup, false);
        inflate.findViewById(R.id.moovit_connect).setOnClickListener(new C17102a(this, 10));
        if (bundle != null) {
            this.f47083c = (AccessTokenResult) bundle.getParcelable("accessTokenResult");
        }
        return inflate;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("accessTokenResult", this.f47083c);
    }
}
