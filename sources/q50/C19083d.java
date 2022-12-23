package q50;

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
import p372at.C13515b;
import p805su.C19543e;
import p977zz.C20930c;
import p977zz.C20944i0;
import p977zz.C20955o;
import p977zz.C20964s0;
import v40.C25750e;
import v40.C25751f;

/* renamed from: q50.d */
public abstract class C19083d<T extends PaymentMethodToken> extends C19080b<Uri, T> {

    /* renamed from: t */
    public static final /* synthetic */ int f48510t = 0;

    /* renamed from: p */
    public WebInstruction f48511p;

    /* renamed from: q */
    public C19084a f48512q;

    /* renamed from: r */
    public WebView f48513r;

    /* renamed from: s */
    public ProgressBar f48514s;

    /* renamed from: q50.d$a */
    public class C19084a extends BroadcastReceiver {
        public C19084a() {
        }

        public final void onReceive(Context context, Intent intent) {
            Uri uri = (Uri) intent.getParcelableExtra("result");
            if (uri != null) {
                C19083d dVar = C19083d.this;
                C19083d.m46214r2(dVar, dVar.f48511p, uri.toString());
            }
        }
    }

    /* renamed from: r2 */
    public static boolean m46214r2(C19083d dVar, WebInstruction webInstruction, String str) {
        if (dVar.getActivity() == null) {
            return true;
        }
        if (str.startsWith(webInstruction.f42777b)) {
            if (!C20964s0.m49090h(str)) {
                dVar.mo51515p2(Uri.parse(str));
                return true;
            }
            throw new BadResponseException("Redirect url is can't be null");
        } else if (str.startsWith(webInstruction.f42778c)) {
            dVar.mo50780v2();
            return true;
        } else if (str.startsWith(webInstruction.f42779d)) {
            dVar.mo50782x2();
            return true;
        } else if (!str.startsWith(webInstruction.f42780e)) {
            return dVar.mo50781w2(str);
        } else {
            dVar.mo50779u2();
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
            this.f48511p = WebInstruction.m41734b(WidgetMessageParser.KEY_CALLBACK, "payment");
            return;
        }
        this.f48511p = mo50777s2(string, string2, string3);
        this.f48512q = new C19084a();
        C5367a.m13473a(requireContext()).mo21146b(this.f48512q, WebInstruction.m41736d(requireContext()));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C25751f.credit_card_webview_fragment, viewGroup, false);
        this.f48514s = (ProgressBar) inflate.findViewById(C25750e.progress_bar);
        WebView webView = (WebView) inflate.findViewById(C25750e.webView);
        this.f48513r = webView;
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        C12824c.m32626a(settings);
        return inflate;
    }

    public final void onDestroy() {
        super.onDestroy();
        if (this.f48512q != null) {
            C5367a.m13473a(requireContext()).mo21148d(this.f48512q);
        }
    }

    public final void onPause() {
        super.onPause();
        this.f48513r.onPause();
        C20955o.m49070a();
    }

    public final void onResume() {
        super.onResume();
        C20955o.m49071b();
        this.f48513r.onResume();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo50778t2().addOnSuccessListener((Activity) requireActivity(), new C13515b(this, 10)).addOnFailureListener(new C19543e(this, 5));
    }

    /* renamed from: s2 */
    public WebInstruction mo50777s2(String str, String str2, String str3) {
        return WebInstruction.m41734b(str2, str3);
    }

    /* renamed from: t2 */
    public abstract Task<C20944i0<String, WebInstruction>> mo50778t2();

    /* renamed from: u2 */
    public void mo50779u2() {
    }

    /* renamed from: v2 */
    public void mo50780v2() {
    }

    /* renamed from: w2 */
    public boolean mo50781w2(String str) {
        return false;
    }

    /* renamed from: x2 */
    public void mo50782x2() {
    }
}
