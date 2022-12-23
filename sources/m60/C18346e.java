package m60;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.google.android.gms.tasks.Task;
import com.moovit.commons.request.BadResponseException;
import com.moovit.payment.clearance.PaymentMethodToken;
import com.moovit.payment.registration.steps.p419cc.WebInstruction;
import ka0.C12824c;
import p130j2.C5367a;
import p578jf.C17843u;
import p578jf.C17844v;
import p977zz.C20930c;
import p977zz.C20944i0;
import p977zz.C20955o;
import p977zz.C20964s0;
import v40.C25750e;
import v40.C25751f;

/* renamed from: m60.e */
public abstract class C18346e<T extends PaymentMethodToken> extends C18341a<Uri, T> {

    /* renamed from: t */
    public static final /* synthetic */ int f46776t = 0;

    /* renamed from: p */
    public WebInstruction f46777p;

    /* renamed from: q */
    public C18347a f46778q;

    /* renamed from: r */
    public WebView f46779r;

    /* renamed from: s */
    public ProgressBar f46780s;

    /* renamed from: m60.e$a */
    public class C18347a extends BroadcastReceiver {
        public C18347a() {
        }

        public final void onReceive(Context context, Intent intent) {
            Uri uri = (Uri) intent.getParcelableExtra("result");
            if (uri != null) {
                C18346e eVar = C18346e.this;
                C18346e.m45172s2(eVar, eVar.f46777p, uri.toString());
            }
        }
    }

    /* renamed from: s2 */
    public static boolean m45172s2(C18346e eVar, WebInstruction webInstruction, String str) {
        eVar.getClass();
        if (str.startsWith(webInstruction.f42777b)) {
            if (!C20964s0.m49090h(str)) {
                eVar.mo50796p2(Uri.parse(str));
                return true;
            }
            throw new BadResponseException("Redirect url is can't be null");
        } else if (str.startsWith(webInstruction.f42778c)) {
            eVar.mo50593w2();
            return true;
        } else if (str.startsWith(webInstruction.f42779d)) {
            eVar.mo50595y2();
            return true;
        } else if (!str.startsWith(webInstruction.f42780e)) {
            return eVar.mo50594x2(str);
        } else {
            eVar.mo50592v2();
            return true;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle a = C20930c.m49019a(requireActivity());
        String string = a.getString("schemeName", (String) null);
        String string2 = a.getString("hostName", (String) null);
        String string3 = a.getString("source", (String) null);
        if (string2 == null || string3 == null) {
            this.f46777p = WebInstruction.m41734b(WidgetMessageParser.KEY_CALLBACK, "payment");
            return;
        }
        this.f46777p = mo50790t2(string, string2, string3);
        this.f46778q = new C18347a();
        C5367a.m13473a(requireContext()).mo21146b(this.f46778q, WebInstruction.m41736d(requireContext()));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C25751f.credit_card_webview_fragment, viewGroup, false);
        this.f46780s = (ProgressBar) inflate.findViewById(C25750e.progress_bar);
        WebView webView = (WebView) inflate.findViewById(C25750e.webView);
        this.f46779r = webView;
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        C12824c.m32626a(settings);
        return inflate;
    }

    public final void onDestroy() {
        super.onDestroy();
        if (this.f46778q != null) {
            C5367a.m13473a(requireContext()).mo21148d(this.f46778q);
        }
    }

    public final void onPause() {
        super.onPause();
        this.f46779r.onPause();
        C20955o.m49070a();
    }

    public final void onResume() {
        super.onResume();
        C20955o.m49071b();
        this.f46779r.onResume();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo50591u2().addOnSuccessListener((Activity) requireActivity(), new C17843u(this, 11)).addOnFailureListener(new C17844v(this, 6));
    }

    /* renamed from: t2 */
    public WebInstruction mo50790t2(String str, String str2, String str3) {
        return WebInstruction.m41734b(str2, str3);
    }

    /* renamed from: u2 */
    public abstract Task<C20944i0<String, WebInstruction>> mo50591u2();

    /* renamed from: v2 */
    public void mo50592v2() {
    }

    /* renamed from: w2 */
    public void mo50593w2() {
    }

    /* renamed from: x2 */
    public boolean mo50594x2(String str) {
        return false;
    }

    /* renamed from: y2 */
    public void mo50595y2() {
    }
}
