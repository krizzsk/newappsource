package l50;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.payment.clearance.CreditCardToken;
import com.moovit.payment.registration.steps.p419cc.WebInstruction;
import ka0.C12824c;
import p977zz.C20955o;
import v40.C25750e;
import v40.C25751f;
import v40.C25755j;

/* renamed from: l50.b */
public class C18171b extends C15676b<MoovitActivity> {

    /* renamed from: h */
    public String f46404h;

    /* renamed from: i */
    public CreditCardToken f46405i;

    /* renamed from: j */
    public WebInstruction f46406j;

    /* renamed from: k */
    public String f46407k;

    /* renamed from: l */
    public WebView f46408l;

    /* renamed from: m */
    public ProgressBar f46409m;

    /* renamed from: l50.b$a */
    public interface C18172a {
        /* renamed from: V */
        void mo50589V(CreditCardToken creditCardToken, String str);
    }

    public C18171b() {
        super(MoovitActivity.class);
        setStyle(0, C25755j.ThemeOverlay_Moovit_Dialog_FullScreen);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle K1 = mo46752K1();
        this.f46404h = K1.getString("url");
        this.f46405i = (CreditCardToken) K1.getParcelable(FirebaseMessagingService.EXTRA_TOKEN);
        this.f46406j = (WebInstruction) K1.getParcelable("instruction");
        this.f46407k = K1.getString("paymentToken");
        if (this.f46404h == null || this.f46405i == null || this.f46406j == null) {
            throw new ApplicationBugException("Did you use CreditCard3DSVerificationFragment.newInstance(...)?");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C25751f.payment_3ds_verification_webview_fragment, viewGroup, false);
        this.f46409m = (ProgressBar) inflate.findViewById(C25750e.progress_bar);
        WebView webView = (WebView) inflate.findViewById(C25750e.webView);
        this.f46408l = webView;
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        C12824c.m32626a(settings);
        return inflate;
    }

    public final void onPause() {
        super.onPause();
        this.f46408l.onPause();
        C20955o.m49070a();
    }

    public final void onResume() {
        super.onResume();
        C20955o.m49071b();
        this.f46408l.onResume();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        WebView webView = this.f46408l;
        if (webView != null) {
            webView.setWebChromeClient(new WebChromeClient());
            this.f46408l.setWebViewClient(new C18170a(this));
            this.f46408l.loadUrl(this.f46404h);
        }
    }
}
