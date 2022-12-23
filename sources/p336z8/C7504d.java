package p336z8;

import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.appevents.C2338j;
import com.facebook.internal.C2373a;
import com.facebook.login.C2486n;
import com.moovit.app.useraccount.providers.facebook.FacebookConnectProviderFragment;
import p009a8.C0098d0;
import p009a8.C0109i;
import p009a8.C0115o;
import p011aa.C0141e;
import p019b0.C1426c;
import uh0.C25081h;

/* renamed from: z8.d */
public final class C7504d extends C0141e {

    /* renamed from: b */
    public final /* synthetic */ C0109i<C1426c> f22979b = null;

    /* renamed from: p */
    public final void mo23769p(C2373a aVar) {
        C0109i<C1426c> iVar = this.f22979b;
        C7505e.m17224c("cancelled", (String) null);
        if (iVar != null) {
            FacebookConnectProviderFragment facebookConnectProviderFragment = FacebookConnectProviderFragment.this;
            String[] strArr = FacebookConnectProviderFragment.f40648f;
            facebookConnectProviderFragment.getClass();
        }
    }

    /* renamed from: q */
    public final void mo23770q(C2373a aVar, FacebookException facebookException) {
        C0109i<C1426c> iVar = this.f22979b;
        C7505e.m17224c("error", facebookException.getMessage());
        if (iVar != null) {
            ((FacebookConnectProviderFragment.C15637a) iVar).mo46650a(facebookException);
        }
    }

    /* renamed from: r */
    public final void mo23771r(C2373a aVar, Bundle bundle) {
        String str;
        String str2;
        if (bundle != null) {
            if (bundle.containsKey("completionGesture")) {
                str = bundle.getString("completionGesture");
            } else {
                str = bundle.getString("com.facebook.platform.extra.COMPLETION_GESTURE");
            }
            if (str == null || C25081h.m62830A("post", str, true)) {
                C0109i<C1426c> iVar = this.f22979b;
                if (bundle.containsKey("postId")) {
                    str2 = bundle.getString("postId");
                } else if (bundle.containsKey("com.facebook.platform.extra.POST_ID")) {
                    str2 = bundle.getString("com.facebook.platform.extra.POST_ID");
                } else {
                    str2 = bundle.getString("post_id");
                }
                C2338j jVar = new C2338j(C0115o.m210a(), (String) null);
                Bundle b = C25541a.m63872b("fb_share_dialog_outcome", "succeeded");
                if (C0098d0.m169b()) {
                    jVar.mo12486f("fb_share_dialog_result", b);
                }
                if (iVar != null) {
                    FacebookConnectProviderFragment facebookConnectProviderFragment = FacebookConnectProviderFragment.this;
                    String[] strArr = FacebookConnectProviderFragment.f40648f;
                    facebookConnectProviderFragment.getClass();
                    AccessToken accessToken = ((C2486n) new C1426c(str2, 3)).f8886a;
                    facebookConnectProviderFragment.mo50583I1(accessToken.f8359j, accessToken.f8355f);
                }
            } else if (C25081h.m62830A("cancel", str, true)) {
                C0109i<C1426c> iVar2 = this.f22979b;
                C7505e.m17224c("cancelled", (String) null);
                if (iVar2 != null) {
                    FacebookConnectProviderFragment facebookConnectProviderFragment2 = FacebookConnectProviderFragment.this;
                    String[] strArr2 = FacebookConnectProviderFragment.f40648f;
                    facebookConnectProviderFragment2.getClass();
                }
            } else {
                C0109i<C1426c> iVar3 = this.f22979b;
                FacebookException facebookException = new FacebookException("UnknownError");
                C7505e.m17224c("error", facebookException.getMessage());
                if (iVar3 != null) {
                    ((FacebookConnectProviderFragment.C15637a) iVar3).mo46650a(facebookException);
                }
            }
        }
    }
}
