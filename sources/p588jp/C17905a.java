package p588jp;

import android.graphics.Paint;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C1019k0;
import androidx.lifecycle.C1026n0;
import androidx.lifecycle.C1044w;
import com.braze.support.WebContentUtils;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.nearby.messages.Strategy;
import com.masabi.justride.sdk.exception.MissingArgumentException;
import com.masabi.justride.sdk.exception.MissingSDKException;
import com.masabi.justride.sdk.internal.models.ticket.TicketDisplayConfiguration;
import com.masabi.justride.sdk.p415ui.features.universalticket.UniversalTicketScreenConfiguration;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import mf0.C24362h;
import p389bl.C13641g;
import p565io.C17624a;
import p584jl.C17885a;
import p605ki.C18061o;
import p605ki.C18063q;
import p605ki.C18066t;
import p658mo.C18407a;
import p701oj.C18770n;
import p752qn.C19150h;
import p871vo.C20193i;
import p891wk.C20364s;
import uh0.C25081h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo59060d2 = {"Ljp/a;", "Lio/a;", "<init>", "()V", "Android_release"}, mo59061k = 1, mo59062mv = {1, 4, 1})
/* renamed from: jp.a */
public final class C17905a extends C17624a {

    /* renamed from: e */
    public static final /* synthetic */ int f45944e = 0;

    /* renamed from: c */
    public C18770n f45945c;

    /* renamed from: d */
    public boolean f45946d;

    /* renamed from: jp.a$a */
    public static final class C17906a<T> implements C1044w<C20364s> {

        /* renamed from: a */
        public final /* synthetic */ C17905a f45947a;

        public C17906a(C17905a aVar) {
            this.f45947a = aVar;
        }

        public final void onChanged(Object obj) {
            String str;
            boolean z;
            String str2;
            C20364s sVar = (C20364s) obj;
            C17905a aVar = this.f45947a;
            C18407a aVar2 = (C18407a) aVar.f45307b.f46184n.f47830c;
            int i = C17905a.f45944e;
            UniversalTicketScreenConfiguration universalTicketScreenConfiguration = aVar.mo50460J1().f51230c;
            C24362h.m61210e(sVar, "it");
            C19150h hVar = sVar.f51623a;
            C24362h.m61210e(hVar, "it.ticketDetails");
            C13641g.m34119g(hVar);
            C24362h.m61211f(universalTicketScreenConfiguration, "ticketScreenConfiguration");
            if (aVar2 != null) {
                str = aVar2.mo50862a();
            } else {
                str = universalTicketScreenConfiguration.f37221h;
            }
            if (str == null || C25081h.m62831B(str)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = "{}";
            }
            C17905a aVar3 = this.f45947a;
            String str3 = aVar3.mo50460J1().f51232e;
            String str4 = sVar.f51633k;
            C24362h.m61210e(str4, "it.brandId");
            String str5 = sVar.f51629g;
            C24362h.m61210e(str5, "it.ticketDetailsJsonString");
            String str6 = sVar.f51630h;
            C24362h.m61210e(str6, "it.ticketFaceTemplateId");
            TicketDisplayConfiguration ticketDisplayConfiguration = sVar.f51631i;
            C24362h.m61210e(ticketDisplayConfiguration, "it.ticketDisplayConfiguration");
            C24362h.m61211f(str3, "pathToJustrideDirectory");
            C24362h.m61211f(str, "customTicketDetailsJsonString");
            File file = new File(str3, C25541a.m63881k("templates/", str4));
            try {
                Integer num = ticketDisplayConfiguration.f37084a.get(str6);
                if (num == null) {
                    num = Integer.valueOf(Strategy.TTL_SECONDS_DEFAULT);
                }
                C24362h.m61210e(num, "displayConfiguration.get…ght(ticketFaceTemplateId)");
                int intValue = num.intValue();
                DisplayMetrics l = C13641g.m34124l(aVar3);
                C24362h.m61210e(l, "displayMetrics");
                float L = C17885a.m44410L(l, (float) intValue);
                C18770n nVar = aVar3.f45945c;
                C24362h.m61208c(nVar);
                RelativeLayout relativeLayout = nVar.f47772c;
                C24362h.m61210e(relativeLayout, "binding.ticketFaceWebViewContainer");
                relativeLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, C17885a.m44459r0(L)));
                str2 = C17905a.m44513K1(str, str5, file);
            } catch (IOException unused) {
                DisplayMetrics l2 = C13641g.m34124l(aVar3);
                C24362h.m61210e(l2, "displayMetrics");
                float L2 = C17885a.m44410L(l2, (float) 100);
                C18770n nVar2 = aVar3.f45945c;
                C24362h.m61208c(nVar2);
                RelativeLayout relativeLayout2 = nVar2.f47772c;
                C24362h.m61210e(relativeLayout2, "binding.ticketFaceWebViewContainer");
                relativeLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, C17885a.m44459r0(L2)));
                str2 = "\n                    <html>\n                    <head>\n                    <meta charset=\"UTF-8\">\n                    <meta name=\"viewport\" content=\"initial-scale=1, maximum-scale=1, user-scalable=no, width=device-width, height=device-height, viewport-fit=cover\" />\n                    </head>\n                    <body style=\"background-color:#E4E4E4;\">\n                    <div style=\"text-align: center; position: absolute; top: 50%; left: 50%; -moz-transform: translateX(-50%) translateY(-50%); -webkit-transform: translateX(-50%) translateY(-50%); transform: translateX(-50%) translateY(-50%);\">\n                    " + aVar3.getString(C18066t.com_masabi_justride_sdk_universal_ticket_face_load_error_message) + "</div>\n                    </body>\n                    </html>\n                ";
            }
            String str7 = str2;
            C18770n nVar3 = aVar3.f45945c;
            C24362h.m61208c(nVar3);
            nVar3.f47771b.setLayerType(1, (Paint) null);
            C18770n nVar4 = aVar3.f45945c;
            C24362h.m61208c(nVar4);
            WebView webView = nVar4.f47771b;
            C24362h.m61210e(webView, "binding.ticketFaceWebView");
            WebSettings settings = webView.getSettings();
            C24362h.m61210e(settings, "binding.ticketFaceWebView.settings");
            settings.setAllowFileAccess(true);
            C18770n nVar5 = aVar3.f45945c;
            C24362h.m61208c(nVar5);
            WebView webView2 = nVar5.f47771b;
            C24362h.m61210e(webView2, "binding.ticketFaceWebView");
            WebSettings settings2 = webView2.getSettings();
            C24362h.m61210e(settings2, "binding.ticketFaceWebView.settings");
            settings2.setJavaScriptEnabled(true);
            C18770n nVar6 = aVar3.f45945c;
            C24362h.m61208c(nVar6);
            WebView webView3 = nVar6.f47771b;
            C24362h.m61210e(webView3, "binding.ticketFaceWebView");
            webView3.setWebChromeClient(new C17907b(aVar3));
            if (!aVar3.f45946d) {
                C18770n nVar7 = aVar3.f45945c;
                C24362h.m61208c(nVar7);
                ProgressBar progressBar = nVar7.f47770a;
                C24362h.m61210e(progressBar, "binding.ticketFaceProgressSpinner");
                progressBar.setVisibility(0);
            }
            String absolutePath = file.getAbsolutePath();
            C18770n nVar8 = aVar3.f45945c;
            C24362h.m61208c(nVar8);
            nVar8.f47771b.loadDataWithBaseURL(WebContentUtils.FILE_URI_SCHEME_PREFIX + absolutePath + '/', str7, "text/html", (String) null, (String) null);
            C18770n nVar9 = aVar3.f45945c;
            C24362h.m61208c(nVar9);
            nVar9.f47771b.post(new C17908c(aVar3));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0050, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0051, code lost:
        p584jl.C17885a.m44462t(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0054, code lost:
        throw r3;
     */
    /* renamed from: K1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m44513K1(java.lang.String r2, java.lang.String r3, java.io.File r4) throws java.io.IOException {
        /*
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "index.html"
            r0.<init>(r4, r1)
            java.nio.charset.Charset r4 = uh0.C25072a.f63272a
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r0)
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            r0.<init>(r1, r4)
            boolean r4 = r0 instanceof java.io.BufferedReader
            if (r4 == 0) goto L_0x001a
            java.io.BufferedReader r0 = (java.io.BufferedReader) r0
            goto L_0x0022
        L_0x001a:
            java.io.BufferedReader r4 = new java.io.BufferedReader
            r1 = 8192(0x2000, float:1.14794E-41)
            r4.<init>(r0, r1)
            r0 = r4
        L_0x0022:
            r4 = 0
            java.lang.String r1 = p389bl.C13637c.m34048C(r0)     // Catch:{ all -> 0x004e }
            p584jl.C17885a.m44462t(r0, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "const customTicketDetails = "
            r4.append(r0)
            r4.append(r2)
            r2 = 59
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r4 = 0
            java.lang.String r0 = "const customTicketDetails = {};"
            java.lang.String r2 = uh0.C25081h.m62833D(r1, r0, r2, r4)
            java.lang.String r0 = "{{ticketDetails}}"
            java.lang.String r2 = uh0.C25081h.m62833D(r2, r0, r3, r4)
            return r2
        L_0x004e:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r3 = move-exception
            p584jl.C17885a.m44462t(r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p588jp.C17905a.m44513K1(java.lang.String, java.lang.String, java.io.File):java.lang.String");
    }

    /* renamed from: J1 */
    public final C20193i mo50460J1() {
        Bundle arguments = getArguments();
        FragmentActivity requireActivity = requireActivity();
        C24362h.m61210e(requireActivity, "requireActivity()");
        if (arguments != null) {
            String string = arguments.getString("TICKET_ID_KEY");
            if (string != null) {
                C1019k0 b = new C1026n0(requireActivity).mo4314b(C20193i.class, string);
                C24362h.m61210e(b, "ViewModelProvider(owner)…ketViewModel::class.java)");
                return (C20193i) b;
            }
            throw new MissingArgumentException("Cannot load fragment without ticket id.");
        }
        throw new MissingArgumentException("Cannot load fragment with null bundle.");
    }

    public final void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
        } catch (MissingSDKException unused) {
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C24362h.m61211f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C18063q.fragment_universal_ticket_face, viewGroup, false);
        int i = C18061o.ticketFaceProgressSpinner;
        ProgressBar progressBar = (ProgressBar) inflate.findViewById(i);
        if (progressBar != null) {
            i = C18061o.ticketFaceWebView;
            WebView webView = (WebView) inflate.findViewById(i);
            if (webView != null) {
                RelativeLayout relativeLayout = (RelativeLayout) inflate;
                this.f45945c = new C18770n(relativeLayout, progressBar, webView, relativeLayout);
                return relativeLayout;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f45945c = null;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C24362h.m61211f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        mo50460J1().f51229b.observe(getViewLifecycleOwner(), new C17906a(this));
    }
}
