package p645ly;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.moovit.app.useraccount.providers.ConnectProvider;
import com.tranzmate.R;
import p621ky.C18157a;
import p644lx.C18284b;
import p664mu.C18461p;

/* renamed from: ly.a */
public class C18298a extends C18157a<GoogleSignInAccount> {

    /* renamed from: d */
    public static final /* synthetic */ int f46661d = 0;

    /* renamed from: c */
    public GoogleSignInClient f46662c;

    /* renamed from: H1 */
    public final ConnectProvider mo46649H1() {
        return ConnectProvider.GOOGLE;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 8568) {
            GoogleSignIn.getSignedInAccountFromIntent(intent).addOnCompleteListener((Activity) requireActivity(), new C18461p(this, 1));
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f46662c = GoogleSignIn.getClient(requireContext(), new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestIdToken(getString(R.string.default_web_client_id)).requestEmail().build());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.google_connect_fragment, viewGroup, false);
        inflate.findViewById(R.id.google_connect).setOnClickListener(new C18284b(this, 2));
        return inflate;
    }
}
