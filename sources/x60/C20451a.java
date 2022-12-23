package x60;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import c70.C13751d;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.ads.C14753n;
import com.moovit.commons.request.BadResponseException;
import com.moovit.payment.registration.steps.p419cc.WebInstruction;
import com.moovit.request.RequestOptions;
import h60.C17328k;
import h60.C17331l;
import h60.C17352s;
import i60.C17559a;
import k60.C17999a;
import ka0.C12824c;
import p130j2.C5367a;
import p543hq.C17474b;
import p688nu.C18631c;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import p977zz.C20930c;
import p977zz.C20955o;
import p977zz.C20964s0;
import v40.C25750e;
import v40.C25751f;

/* renamed from: x60.a */
public class C20451a extends C17999a {

    /* renamed from: w */
    public static final /* synthetic */ int f51799w = 0;

    /* renamed from: r */
    public final C20452a f51800r = new C20452a();

    /* renamed from: s */
    public WebInstruction f51801s;

    /* renamed from: t */
    public C20453b f51802t;

    /* renamed from: u */
    public WebView f51803u;

    /* renamed from: v */
    public ProgressBar f51804v;

    /* renamed from: x60.a$a */
    public class C20452a extends C20438i<C17328k, C17331l> {
        public C20452a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C17328k kVar = (C17328k) cVar;
            C20451a aVar = C20451a.this;
            int i = C20451a.f51799w;
            aVar.mo50501r2();
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C17328k kVar = (C17328k) cVar;
            C17559a aVar = ((C17331l) gVar).f44721m;
            if (aVar != null) {
                C20451a aVar2 = C20451a.this;
                C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.WEB_LOGIN);
                aVar3.mo49939g(AnalyticsAttributeKey.ID, aVar.f45166b);
                aVar3.mo49941i(AnalyticsAttributeKey.IS_MIGRATED_USER, aVar.f45167c);
                aVar2.mo46797j2(aVar3.mo49933a());
            }
            C20451a aVar4 = C20451a.this;
            int i = C20451a.f51799w;
            aVar4.mo50504u2(aVar);
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C20451a.this.mo46795h2(C13751d.m34341b(((C17328k) cVar).f51759b, (String) null, exc));
            return true;
        }
    }

    /* renamed from: x60.a$b */
    public class C20453b extends BroadcastReceiver {
        public C20453b() {
        }

        public final void onReceive(Context context, Intent intent) {
            Uri uri = (Uri) intent.getParcelableExtra("result");
            if (uri != null) {
                C20451a aVar = C20451a.this;
                C20451a.m48069y2(aVar, aVar.f51801s, uri.toString());
            }
        }
    }

    /* renamed from: y2 */
    public static boolean m48069y2(C20451a aVar, WebInstruction webInstruction, String str) {
        aVar.getClass();
        if (str.startsWith(webInstruction.f42777b)) {
            if (!C20964s0.m49090h(str)) {
                aVar.mo52640z2(true);
                aVar.mo50507x2();
                C17328k kVar = new C17328k(aVar.mo46783R1(), aVar.mo50500p2().f42758b, str);
                StringBuilder sb = new StringBuilder();
                C13715c.m34249o(C17328k.class, sb, "_");
                sb.append(kVar.f44717w);
                sb.append("_");
                sb.append(kVar.f44718x);
                String sb2 = sb.toString();
                RequestOptions L1 = aVar.mo46777L1();
                L1.f42909f = true;
                aVar.mo46793f2(sb2, kVar, L1, aVar.f51800r);
            } else {
                throw new BadResponseException("Redirect url is can't be null");
            }
        } else if (str.startsWith(webInstruction.f42778c)) {
            aVar.mo52640z2(false);
        } else if (str.startsWith(webInstruction.f42779d)) {
            aVar.mo52640z2(false);
        } else if (!str.startsWith(webInstruction.f42780e)) {
            return false;
        } else {
            aVar.mo52640z2(false);
        }
        return true;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle a = C20930c.m49019a(requireActivity());
        String string = a.getString("schemeName", (String) null);
        String string2 = a.getString("hostName", (String) null);
        String string3 = a.getString("source", (String) null);
        if (string2 == null || string3 == null) {
            this.f51801s = WebInstruction.m41734b(WidgetMessageParser.KEY_CALLBACK, "web_step");
            return;
        }
        this.f51801s = WebInstruction.m41735c(string, string3);
        this.f51802t = new C20453b();
        C5367a.m13473a(requireContext()).mo21146b(this.f51802t, WebInstruction.m41736d(requireContext()));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C25751f.payment_registration_web_step_fragment, viewGroup, false);
    }

    public final void onDestroy() {
        super.onDestroy();
        if (this.f51802t != null) {
            C5367a.m13473a(requireContext()).mo21148d(this.f51802t);
        }
    }

    public final void onPause() {
        super.onPause();
        this.f51803u.onPause();
        C20955o.m49070a();
    }

    public final void onResume() {
        super.onResume();
        C20955o.m49071b();
        this.f51803u.onResume();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f51804v = (ProgressBar) view.findViewById(C25750e.progress_bar);
        WebView webView = (WebView) view.findViewById(C25750e.webView);
        this.f51803u = webView;
        webView.setWebChromeClient(new WebChromeClient());
        WebSettings settings = this.f51803u.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        C12824c.m32626a(settings);
        Tasks.call(MoovitExecutors.f37327IO, new C17352s(mo46783R1(), mo50500p2().f42758b, this.f51801s)).addOnSuccessListener((Activity) requireActivity(), new C14753n(this, 8)).addOnFailureListener(new C18631c(this, 3));
    }

    /* renamed from: q2 */
    public final String mo49058q2() {
        return "step_web";
    }

    /* renamed from: s2 */
    public final boolean mo50502s2() {
        return false;
    }

    /* renamed from: w2 */
    public final boolean mo50506w2() {
        return false;
    }

    /* renamed from: z2 */
    public final void mo52640z2(boolean z) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.WEB_RESULT);
        aVar.mo49941i(AnalyticsAttributeKey.SUCCESS, z);
        mo46797j2(aVar.mo49933a());
    }
}
