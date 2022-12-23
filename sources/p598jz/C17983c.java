package p598jz;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.network.model.ServerId;
import com.moovit.web.WebViewActivity;
import ga0.C12709i;
import java.util.Locale;
import p001a0.C0016g;
import p824tp.C19740r;
import p824tp.C19742t;
import p824tp.C19746x;
import p977zz.C20927a0;
import p977zz.C20964s0;

/* renamed from: jz.c */
public class C17983c extends C15676b<MoovitActivity> {

    /* renamed from: i */
    public static final /* synthetic */ int f46068i = 0;

    /* renamed from: h */
    public String f46069h;

    /* renamed from: jz.c$a */
    public class C17984a extends WebViewClient {
        public C17984a() {
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            C17983c cVar = C17983c.this;
            int i = C17983c.f46068i;
            Dialog dialog = cVar.getDialog();
            if (dialog != null) {
                dialog.findViewById(C19740r.commercial_loading_view).setVisibility(8);
                dialog.findViewById(C19740r.commercial_content).setVisibility(0);
            }
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (str.endsWith(".pdf")) {
                C17983c cVar = C17983c.this;
                int i = C17983c.f46068i;
                cVar.getClass();
                try {
                    Intent i2 = C20927a0.m49014i(Uri.parse(str));
                    i2.addFlags(1074266112);
                    cVar.startActivity(i2);
                } catch (ActivityNotFoundException unused) {
                    try {
                        Object[] objArr = {str};
                        String str2 = C20964s0.f52718a;
                        Intent i3 = C20927a0.m49014i(Uri.parse(String.format((Locale) null, "https://docs.google.com/viewer?url=%s", objArr)));
                        i3.addFlags(1074266112);
                        cVar.startActivity(i3);
                    } catch (ActivityNotFoundException unused2) {
                    }
                }
                return true;
            } else if (str.startsWith("tel:")) {
                C17983c cVar2 = C17983c.this;
                int i4 = C17983c.f46068i;
                cVar2.getClass();
                cVar2.startActivity(C20927a0.m49011f(str));
                return true;
            } else if (!str.startsWith("http")) {
                return false;
            } else {
                C17983c cVar3 = C17983c.this;
                int i5 = C17983c.f46068i;
                cVar3.startActivity(WebViewActivity.m18168y2(cVar3.f40792c, str, (CharSequence) null));
                return true;
            }
        }
    }

    public C17983c() {
        super(MoovitActivity.class);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f40792c.mo44528l2(C0016g.m29l("getCommercialRequest", System.currentTimeMillis()), new C17985d((ServerId) mo46752K1().getParcelable("commercialIdExtra"), this.f40792c.mo44548x1()), new C17982b(this));
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        C12709i iVar = new C12709i(this.f40792c);
        iVar.mo39501b(iVar.getLayoutInflater().inflate(C19742t.commercial_dialog_fragment, (FrameLayout) iVar.findViewById(C19740r.content), false));
        iVar.setTitle((CharSequence) "");
        C12709i iVar2 = iVar;
        iVar2.mo39500a(C19740r.negative_button, -2, (CharSequence) null, C19746x.std_negative_button, C12709i.f31386b);
        C12709i iVar3 = iVar;
        iVar3.mo39500a(C19740r.positive_button, -1, getString(C19746x.navigate), C19746x.std_positive_button, new C17981a(this));
        return iVar;
    }
}
