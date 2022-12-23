package p923xs;

import android.content.UriMatcher;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.moovit.app.help.helpcenter.HelpCenterActivity;

/* renamed from: xs.c */
public final class C20567c extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ View f52022a;

    /* renamed from: b */
    public final /* synthetic */ C20568d f52023b;

    public C20567c(C20568d dVar, View view) {
        this.f52023b = dVar;
        this.f52022a = view;
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f52022a.setVisibility(0);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        HelpCenterActivity helpCenterActivity;
        String lastPathSegment;
        C20568d dVar = this.f52023b;
        UriMatcher uriMatcher = C20568d.f52024u;
        dVar.getClass();
        Uri parse = Uri.parse(str);
        if (!(C20568d.f52024u.match(parse) != 1 || (helpCenterActivity = (HelpCenterActivity) dVar.f40822c) == null || (lastPathSegment = parse.getLastPathSegment()) == null)) {
            long m2 = C20568d.m48318m2(lastPathSegment);
            if (m2 != -1) {
                String str2 = dVar.f52026o;
                Bundle bundle = new Bundle();
                bundle.putLong("articleId", m2);
                bundle.putString("ownerSectionName", str2);
                C20568d dVar2 = new C20568d();
                dVar2.setArguments(bundle);
                helpCenterActivity.mo45063z2(dVar2, true);
            }
        }
        return true;
    }
}
