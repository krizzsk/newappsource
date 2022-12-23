package k10;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.gcm.popup.RemotePopup;
import java.io.ByteArrayInputStream;
import java.util.zip.GZIPInputStream;
import ka0.C12823b;
import p435de.C16596f;
import p480ez.C16910b;
import p543hq.C17474b;
import p786rz.C19387a;
import p824tp.C19731i;
import p824tp.C19740r;
import p824tp.C19742t;
import p977zz.C20964s0;

/* renamed from: k10.b */
public class C17996b extends C15676b<MoovitActivity> {

    /* renamed from: i */
    public static final /* synthetic */ int f46078i = 0;

    /* renamed from: h */
    public RemotePopup f46079h;

    public C17996b() {
        super(MoovitActivity.class);
    }

    /* renamed from: R1 */
    public final void mo22564R1(C17474b bVar) {
        C19731i.m47197a(requireContext()).f50173c.mo22850h(AnalyticsFlowKey.POPUP, bVar);
    }

    /* renamed from: S1 */
    public final RemotePopup mo50496S1() {
        if (this.f46079h == null) {
            this.f46079h = (RemotePopup) mo46752K1().getParcelable("remote_popup");
        }
        return this.f46079h;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C19742t.remote_popup_layout, viewGroup, false);
    }

    public final void onPause() {
        super.onPause();
        Dialog dialog = getDialog();
        if (dialog != null) {
            ((WebView) dialog.findViewById(C19740r.remoteWebView)).onPause();
        }
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CLOSE_POPUP);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "popup_html_type");
        mo22564R1(aVar.mo49933a());
        Context requireContext = requireContext();
        C19731i.m47197a(requireContext).f50173c.mo22847b(requireContext, AnalyticsFlowKey.POPUP, true);
    }

    public final void onResume() {
        super.onResume();
        Dialog dialog = getDialog();
        if (dialog != null) {
            ((WebView) dialog.findViewById(C19740r.remoteWebView)).onResume();
        }
        Context requireContext = requireContext();
        C19731i.m47197a(requireContext).f50173c.mo22849g(requireContext, AnalyticsFlowKey.POPUP);
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.OPEN_POPUP);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "popup_html_type");
        aVar.mo49939g(AnalyticsAttributeKey.PUSH_ID, mo50496S1().f41609c.f41546b);
        mo22564R1(aVar.mo49933a());
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        RemotePopup S1 = mo50496S1();
        int i = (int) (((double) getResources().getDisplayMetrics().heightPixels) * 0.7d);
        WebView webView = (WebView) view.findViewById(C19740r.remoteWebView);
        try {
            str = new String(C19387a.m46672d(new GZIPInputStream(new ByteArrayInputStream(Base64.decode(S1.f41615e, 0)))), C20964s0.f52719b);
        } catch (Exception e) {
            C16596f.m42113a().mo49364c(e);
            str = "";
        }
        webView.loadDataWithBaseURL((String) null, str, "text/html", (String) null, (String) null);
        webView.setLayoutParams(new LinearLayout.LayoutParams(-1, i));
        webView.setWebViewClient(new C12823b(getActivity()));
        webView.setWebChromeClient(new WebChromeClient());
        webView.getSettings().setJavaScriptEnabled(true);
        Button button = (Button) view.findViewById(C19740r.actionButton);
        button.setText(S1.f41616f);
        button.setOnClickListener(new C16910b(this, 2));
    }
}
