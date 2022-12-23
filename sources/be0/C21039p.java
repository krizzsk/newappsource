package be0;

import android.annotation.TargetApi;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import be0.C21044r;
import ce0.C21120u;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.facebook.ads.BuildConfig;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.iab.omid.library.vungle.adsession.AdSessionContextType;
import com.iab.omid.library.vungle.adsession.CreativeType;
import com.iab.omid.library.vungle.adsession.ImpressionType;
import com.iab.omid.library.vungle.adsession.Owner;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import com.vungle.warren.VungleLogger;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import od0.C24545c;
import od0.C24566m;
import p247s6.C6478c;
import p358af.C13437d;
import p359ag.C13452i;
import p626lf.C18201b;
import p912xh.C20525a;
import p959zh.C20848a;
import p959zh.C20849b;
import p959zh.C20851d;
import sd0.C24850c;
import sd0.C24852d;
import zd0.C25337d;

/* renamed from: be0.p */
public final class C21039p extends WebViewClient implements C21044r {

    /* renamed from: p */
    public static final /* synthetic */ int f52829p = 0;

    /* renamed from: b */
    public ExecutorService f52830b;

    /* renamed from: c */
    public C24545c f52831c;

    /* renamed from: d */
    public C24566m f52832d;

    /* renamed from: e */
    public C21044r.C21045a f52833e;

    /* renamed from: f */
    public boolean f52834f;

    /* renamed from: g */
    public WebView f52835g;

    /* renamed from: h */
    public boolean f52836h;

    /* renamed from: i */
    public String f52837i;

    /* renamed from: j */
    public String f52838j;

    /* renamed from: k */
    public String f52839k;

    /* renamed from: l */
    public String f52840l;

    /* renamed from: m */
    public Boolean f52841m;

    /* renamed from: n */
    public C21044r.C21046b f52842n;

    /* renamed from: o */
    public C24852d f52843o;

    /* renamed from: be0.p$a */
    public class C21040a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ String f52844b;

        /* renamed from: c */
        public final /* synthetic */ C13452i f52845c;

        /* renamed from: d */
        public final /* synthetic */ Handler f52846d;

        /* renamed from: e */
        public final /* synthetic */ WebView f52847e;

        /* renamed from: be0.p$a$a */
        public class C21041a implements Runnable {
            public C21041a() {
            }

            public final void run() {
                C21040a aVar = C21040a.this;
                C21039p pVar = C21039p.this;
                WebView webView = aVar.f52847e;
                int i = C21039p.f52829p;
                pVar.getClass();
                webView.evaluateJavascript("window.vungle.mraidBridge.notifyCommandComplete()", (ValueCallback) null);
            }
        }

        public C21040a(String str, C13452i iVar, Handler handler, WebView webView) {
            this.f52844b = str;
            this.f52845c = iVar;
            this.f52846d = handler;
            this.f52847e = webView;
        }

        public final void run() {
            if (((C25337d) C21039p.this.f52833e).mo61926q(this.f52844b, this.f52845c)) {
                this.f52846d.post(new C21041a());
            }
        }
    }

    /* renamed from: be0.p$b */
    public static class C21042b extends WebViewRenderProcessClient {

        /* renamed from: a */
        public C21044r.C21046b f52850a;

        public C21042b(C21044r.C21046b bVar) {
            this.f52850a = bVar;
        }

        public final void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        }

        public final void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            int i = C21039p.f52829p;
            webView.getTitle();
            webView.getOriginalUrl();
            C21044r.C21046b bVar = this.f52850a;
            if (bVar != null) {
                bVar.mo53169h();
            }
        }
    }

    static {
        Class<C21039p> cls = C21039p.class;
    }

    public C21039p(C24545c cVar, C24566m mVar, C21120u uVar) {
        this.f52831c = cVar;
        this.f52832d = mVar;
        this.f52830b = uVar;
    }

    /* renamed from: a */
    public final void mo53156a(String str, String str2) {
        boolean z;
        C24545c cVar;
        if (TextUtils.isEmpty(str2) || (cVar = this.f52831c) == null) {
            z = false;
        } else {
            z = cVar.mo60810h().containsValue(str2);
        }
        String k = C13437d.m33706k(str2, " ", str);
        C21044r.C21046b bVar = this.f52842n;
        if (bVar != null) {
            bVar.mo53168c(k, z);
        }
    }

    /* renamed from: b */
    public final void mo53157b(boolean z) {
        int i;
        if (this.f52835g != null) {
            C13452i iVar = new C13452i();
            C13452i iVar2 = new C13452i();
            iVar2.mo40348E("width", Integer.valueOf(this.f52835g.getWidth()));
            iVar2.mo40348E("height", Integer.valueOf(this.f52835g.getHeight()));
            C13452i iVar3 = new C13452i();
            boolean z2 = false;
            iVar3.mo40348E("x", 0);
            iVar3.mo40348E("y", 0);
            iVar3.mo40348E("width", Integer.valueOf(this.f52835g.getWidth()));
            iVar3.mo40348E("height", Integer.valueOf(this.f52835g.getHeight()));
            C13452i iVar4 = new C13452i();
            Boolean bool = Boolean.FALSE;
            iVar4.mo40347D("sms", bool);
            iVar4.mo40347D("tel", bool);
            iVar4.mo40347D("calendar", bool);
            iVar4.mo40347D("storePicture", bool);
            iVar4.mo40347D("inlineVideo", bool);
            iVar.mo40346C(iVar2, "maxSize");
            iVar.mo40346C(iVar2, "screenSize");
            iVar.mo40346C(iVar3, "defaultPosition");
            iVar.mo40346C(iVar3, "currentPosition");
            iVar.mo40346C(iVar4, "supports");
            iVar.mo40349F("placementType", this.f52831c.f62185G);
            Boolean bool2 = this.f52841m;
            if (bool2 != null) {
                iVar.mo40347D("isViewable", bool2);
            }
            iVar.mo40349F("os", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
            iVar.mo40349F("osVersion", Integer.toString(Build.VERSION.SDK_INT));
            iVar.mo40347D("incentivized", Boolean.valueOf(this.f52832d.f62259c));
            C24545c cVar = this.f52831c;
            if (this.f52832d.f62259c) {
                i = cVar.f62213l;
            } else {
                i = cVar.f62212k;
            }
            if (i * 1000 == 0) {
                z2 = true;
            }
            iVar.mo40347D("enableBackImmediately", Boolean.valueOf(z2));
            iVar.mo40349F(MediationMetaData.KEY_VERSION, "1.0");
            if (this.f52834f) {
                iVar.mo40347D("consentRequired", Boolean.TRUE);
                iVar.mo40349F("consentTitleText", this.f52837i);
                iVar.mo40349F("consentBodyText", this.f52838j);
                iVar.mo40349F("consentAcceptButtonText", this.f52839k);
                iVar.mo40349F("consentDenyButtonText", this.f52840l);
            } else {
                iVar.mo40347D("consentRequired", bool);
            }
            iVar.mo40349F("sdkVersion", BuildConfig.VERSION_NAME);
            iVar.toString();
            this.f52835g.evaluateJavascript("window.vungle.mraidBridge.notifyPropertiesChange(" + iVar + AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR + z + ")", (ValueCallback) null);
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        int i = this.f52831c.f62204c;
        if (i == 0) {
            webView.evaluateJavascript("function actionClicked(action){Android.performAction(action);};", (ValueCallback) null);
        } else if (i == 1) {
            this.f52835g = webView;
            webView.setVisibility(0);
            mo53157b(true);
        } else {
            throw new IllegalArgumentException("Unknown Client Type!");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            webView.setWebViewRenderProcessClient(new C21042b(this.f52842n));
        }
        C24852d dVar = this.f52843o;
        if (dVar != null) {
            C24850c cVar = (C24850c) dVar;
            if (cVar.f62848b && cVar.f62849c == null) {
                CreativeType creativeType = CreativeType.DEFINED_BY_JAVASCRIPT;
                ImpressionType impressionType = ImpressionType.DEFINED_BY_JAVASCRIPT;
                Owner owner = Owner.JAVASCRIPT;
                C18201b.m44912h(creativeType, "CreativeType is null");
                C18201b.m44912h(impressionType, "ImpressionType is null");
                C18201b.m44912h(owner, "Impression owner is null");
                if (owner != Owner.NONE) {
                    Owner owner2 = Owner.NATIVE;
                    if (owner == owner2) {
                        throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
                    } else if (owner != owner2) {
                        C20848a aVar = new C20848a(creativeType, impressionType, owner, owner);
                        if (TextUtils.isEmpty("Vungle")) {
                            throw new IllegalArgumentException("Name is null or empty");
                        } else if (!TextUtils.isEmpty(BuildConfig.VERSION_NAME)) {
                            C6478c cVar2 = new C6478c("Vungle", BuildConfig.VERSION_NAME);
                            C18201b.m44912h(webView, "WebView is null");
                            C20849b bVar = new C20849b(cVar2, webView, AdSessionContextType.HTML);
                            if (C20525a.f51915a.f51917a) {
                                C20851d dVar2 = new C20851d(aVar, bVar);
                                cVar.f62849c = dVar2;
                                dVar2.mo52976x(webView);
                                cVar.f62849c.mo52977y();
                                return;
                            }
                            throw new IllegalStateException("Method called before OM SDK activation");
                        } else {
                            throw new IllegalArgumentException("Version is null or empty");
                        }
                    } else {
                        throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
                    }
                } else {
                    throw new IllegalArgumentException("Impression owner is none");
                }
            }
        }
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        if (Build.VERSION.SDK_INT < 23) {
            mo53156a(str, str2);
        }
    }

    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        webResourceResponse.getStatusCode();
        webResourceRequest.getUrl().toString();
        mo53156a(String.valueOf(webResourceResponse.getStatusCode()), webResourceRequest.getUrl().toString());
    }

    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        webView.getUrl();
        renderProcessGoneDetail.didCrash();
        this.f52835g = null;
        C21044r.C21046b bVar = this.f52842n;
        if (bVar == null) {
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        renderProcessGoneDetail.didCrash();
        bVar.mo53170j();
        return true;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (parse.getScheme() != null) {
            String scheme = parse.getScheme();
            if (scheme.equals("mraid")) {
                String host = parse.getHost();
                if (host == null) {
                    return false;
                }
                if ("propertiesChangeCompleted".equals(host) && !this.f52836h) {
                    C24545c cVar = this.f52831c;
                    if (cVar.f62180B != null) {
                        HashMap hashMap = new HashMap(cVar.f62180B);
                        for (Map.Entry next : cVar.f62182D.entrySet()) {
                            hashMap.put(next.getKey(), ((Pair) next.getValue()).first);
                        }
                        if (!cVar.f62181C.isEmpty()) {
                            hashMap.putAll(cVar.f62181C);
                        }
                        if (!cVar.f62183E.isEmpty()) {
                            hashMap.putAll(cVar.f62183E);
                        }
                        String str2 = InneractiveMediationDefs.SHOW_HOUSE_AD_YES;
                        if (!str2.equalsIgnoreCase((String) hashMap.get("START_MUTED"))) {
                            if ((cVar.f62224w.f58858a & 1) == 0) {
                                str2 = "false";
                            }
                            hashMap.put("START_MUTED", str2);
                        }
                        C13452i iVar = new C13452i();
                        for (Map.Entry entry : hashMap.entrySet()) {
                            iVar.mo40349F((String) entry.getKey(), (String) entry.getValue());
                        }
                        VungleLogger.m57031d("mraid_args", iVar.toString());
                        webView.evaluateJavascript("window.vungle.mraidBridge.notifyReadyEvent(" + iVar + ")", (ValueCallback) null);
                        this.f52836h = true;
                    } else {
                        throw new IllegalArgumentException("Advertisement does not have MRAID Arguments!");
                    }
                } else if (this.f52833e != null) {
                    C13452i iVar2 = new C13452i();
                    for (String next2 : parse.getQueryParameterNames()) {
                        iVar2.mo40349F(next2, parse.getQueryParameter(next2));
                    }
                    this.f52830b.submit(new C21040a(host, iVar2, new Handler(), webView));
                }
                return true;
            } else if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                if (this.f52833e != null) {
                    C13452i iVar3 = new C13452i();
                    iVar3.mo40349F("url", str);
                    ((C25337d) this.f52833e).mo61926q("openNonMraid", iVar3);
                }
                return true;
            }
        }
        return false;
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (Build.VERSION.SDK_INT >= 23) {
            webResourceError.getDescription().toString();
            webResourceRequest.getUrl().toString();
            mo53156a(webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
        }
    }
}
