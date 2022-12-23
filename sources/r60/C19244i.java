package r60;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import c70.C13751d;
import com.moovit.C15682c;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.payment.registration.PaymentRegistrationActivity;
import com.moovit.payment.registration.alternative.AlternativeWebAuthProvider;
import com.moovit.request.RequestOptions;
import h60.C17316g;
import h60.C17319h;
import i60.C17559a;
import j60.C17711b;
import p304x.C7070l;
import p543hq.C17474b;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import v40.C25750e;
import v40.C25751f;

/* renamed from: r60.i */
public class C19244i extends C15682c<PaymentRegistrationActivity> {

    /* renamed from: q */
    public static final /* synthetic */ int f48871q = 0;

    /* renamed from: n */
    public final C19245a f48872n = new C19245a();

    /* renamed from: o */
    public String f48873o;

    /* renamed from: p */
    public AlternativeWebAuthProvider f48874p;

    /* renamed from: r60.i$a */
    public class C19245a extends C20438i<C17316g, C17319h> {
        public C19245a() {
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C17316g gVar2 = (C17316g) cVar;
            C19244i iVar = C19244i.this;
            int i = C19244i.f48871q;
            iVar.getClass();
            C17559a aVar = ((C17319h) gVar).f44705m;
            C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.WEB_AUTH_VERIFIED);
            aVar2.mo49939g(AnalyticsAttributeKey.ID, aVar.f45166b);
            aVar2.mo49941i(AnalyticsAttributeKey.IS_MIGRATED_USER, aVar.f45167c);
            iVar.mo46797j2(aVar2.mo49933a());
            iVar.mo46786U1(C19243h.class, new C7070l(aVar, 20));
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C17316g gVar = (C17316g) cVar;
            C19244i iVar = C19244i.this;
            int i = C19244i.f48871q;
            iVar.mo46795h2(C13751d.m34341b(iVar.requireContext(), (String) null, exc));
            return true;
        }
    }

    /* renamed from: r60.i$b */
    public class C19246b extends WebViewClient {

        /* renamed from: a */
        public final /* synthetic */ ProgressBar f48876a;

        public C19246b(ProgressBar progressBar) {
            this.f48876a = progressBar;
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            this.f48876a.setVisibility(8);
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!str.startsWith(C19244i.this.f48874p.f42771c)) {
                return false;
            }
            C19244i iVar = C19244i.this;
            iVar.getClass();
            C17316g gVar = new C17316g(iVar.mo46783R1(), iVar.f48873o, new C17711b(str));
            StringBuilder sb = new StringBuilder();
            C13715c.m34249o(C17316g.class, sb, "#");
            sb.append(gVar.f44702x.hashCode());
            String sb2 = sb.toString();
            RequestOptions L1 = iVar.mo46777L1();
            L1.f42909f = true;
            iVar.mo46793f2(sb2, gVar, L1, iVar.f48872n);
            return true;
        }
    }

    public C19244i() {
        super(PaymentRegistrationActivity.class);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle Q1 = mo46782Q1();
        this.f48873o = Q1.getString("paymentContext");
        AlternativeWebAuthProvider alternativeWebAuthProvider = (AlternativeWebAuthProvider) Q1.getParcelable("provider");
        this.f48874p = alternativeWebAuthProvider;
        if (this.f48873o == null || alternativeWebAuthProvider == null) {
            throw new IllegalStateException("Did you use PaymentRegistrationWebVerificationFragment.newInstance(...)?");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C25751f.payment_registration_step_web_validation_fragment, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        WebView webView = (WebView) mo46799l2(C25750e.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(new C19246b((ProgressBar) mo46799l2(C25750e.progress_bar)));
        webView.loadUrl(this.f48874p.f42770b);
    }
}
