package p598jz;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import ci0.C21211f;
import ga0.C12709i;
import p551hy.C17517b;
import p598jz.C17983c;
import p824tp.C19740r;
import p906wz.C20431c;
import p906wz.C20436g;

/* renamed from: jz.b */
public final class C17982b extends C21211f {

    /* renamed from: b */
    public final /* synthetic */ C17983c f46067b;

    public C17982b(C17983c cVar) {
        this.f46067b = cVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo313a(C20431c cVar, boolean z) {
        C17985d dVar = (C17985d) cVar;
    }

    /* renamed from: k */
    public final void mo21408k(C20431c cVar, C20436g gVar) {
        C17985d dVar = (C17985d) cVar;
        C17986e eVar = (C17986e) gVar;
        if (this.f46067b.isResumed()) {
            C17983c cVar2 = this.f46067b;
            C17517b bVar = eVar.f46071m;
            int i = C17983c.f46068i;
            C12709i iVar = (C12709i) cVar2.getDialog();
            String str = (String) bVar.f45095c;
            cVar2.f46069h = str;
            iVar.setTitle((CharSequence) str);
            WebView webView = (WebView) iVar.findViewById(C19740r.commercial_content);
            webView.setWebViewClient(new C17983c.C17984a());
            webView.setWebChromeClient(new WebChromeClient());
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadDataWithBaseURL("", (String) bVar.f45096d, "text/html", "UTF-8", (String) null);
        }
    }
}
