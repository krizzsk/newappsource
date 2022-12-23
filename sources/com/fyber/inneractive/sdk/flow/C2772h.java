package com.fyber.inneractive.sdk.flow;

import android.app.Application;
import com.fyber.inneractive.sdk.config.C2618a;
import com.fyber.inneractive.sdk.config.C2702y;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.features.C2647h;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveError;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.measurement.C2816a;
import com.fyber.inneractive.sdk.network.C2922o;
import com.fyber.inneractive.sdk.network.C2924p;
import com.fyber.inneractive.sdk.network.C2926q;
import com.fyber.inneractive.sdk.p051ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.response.C3649f;
import com.fyber.inneractive.sdk.util.C3691g;
import com.fyber.inneractive.sdk.util.C3707l;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C3753a;
import com.fyber.inneractive.sdk.web.C3764d;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.flow.h */
public class C2772h extends C2763c<C3649f, C2794u> {

    /* renamed from: h */
    public IAmraidWebViewController f9585h;

    /* renamed from: i */
    public C3753a.C3759f f9586i = new C2773a();

    /* renamed from: com.fyber.inneractive.sdk.flow.h$b */
    public static /* synthetic */ class C2774b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9588a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType[] r0 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9588a = r0
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9588a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.C2772h.C2774b.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo13515a() {
        IAmraidWebViewController iAmraidWebViewController;
        if (!(this.f9549c == null || (iAmraidWebViewController = this.f9585h) == null)) {
            iAmraidWebViewController.mo15464k();
            this.f9585h.mo15325l();
            this.f9585h = null;
        }
        super.mo13515a();
    }

    /* renamed from: b */
    public String mo13296b() {
        return "send_failed_display_creatives";
    }

    /* renamed from: e */
    public void mo13297e() {
        C3764d.C3768d dVar;
        boolean z;
        String str;
        String str2;
        boolean z2;
        boolean z3;
        Content uVar = new C2794u(mo13519c(), this.f9552f);
        this.f9549c = uVar;
        C3649f fVar = this.f9548b;
        uVar.f9591b = fVar;
        uVar.f9595f = this.f9553g;
        UnitDisplayType unitDisplayType = fVar.f12756n;
        C3764d.C3771g gVar = C3764d.C3771g.INLINE;
        C2816a aVar = null;
        if (unitDisplayType == null) {
            this.f9586i.mo13539a((C3753a) null, InneractiveErrorCode.SDK_INTERNAL_ERROR);
            return;
        }
        int i = C2774b.f9588a[unitDisplayType.ordinal()];
        boolean z4 = false;
        if (i == 1 || i == 2) {
            dVar = C3764d.C3768d.ENABLED;
            InneractiveAdRequest inneractiveAdRequest = this.f9547a;
            if (inneractiveAdRequest == null || inneractiveAdRequest.getAllowFullscreen()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                gVar = C3764d.C3771g.INTERSTITIAL;
            }
        } else {
            dVar = C3764d.C3768d.ENABLED;
        }
        C3764d.C3771g gVar2 = gVar;
        C3764d.C3768d dVar2 = dVar;
        boolean z5 = !((C3649f) this.f9548b).f12769B.contains("iaNotifyLoadFinished");
        IAConfigManager iAConfigManager = IAConfigManager.f9202J;
        boolean a = C3691g.m9936a(unitDisplayType, iAConfigManager.f9234v.f9337b);
        try {
            Application application = C3707l.f12893a;
            C3764d.C3772h hVar = C3764d.C3772h.AD_CONTROLLED;
            if (((C2647h) this.f9552f.mo13264a(C2647h.class)).mo13244c()) {
                aVar = iAConfigManager.f9212I;
            }
            IAmraidWebViewController iAmraidWebViewController = new IAmraidWebViewController(application, a, gVar2, dVar2, hVar, z5, aVar);
            this.f9585h = iAmraidWebViewController;
            iAmraidWebViewController.setAdContent(this.f9549c);
            this.f9585h.setAdRequest(this.f9547a);
            InneractiveAdRequest inneractiveAdRequest2 = this.f9547a;
            if (!(inneractiveAdRequest2 == null || inneractiveAdRequest2.getSelectedUnitConfig() == null || ((C2702y) this.f9547a.getSelectedUnitConfig()).f9424c == null)) {
                IAmraidWebViewController iAmraidWebViewController2 = this.f9585h;
                C2794u uVar2 = (C2794u) this.f9549c;
                uVar2.getClass();
                if (iAConfigManager.f9224l || uVar2.f9595f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2 || ((C2702y) this.f9547a.getSelectedUnitConfig()).f9424c.f9368b == UnitDisplayType.REWARDED) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                iAmraidWebViewController2.setMuteMraidVideo(z3);
            }
            ((C2794u) this.f9549c).f9648g = this.f9585h;
            Response response = this.f9548b;
            if (response != null) {
                UnitDisplayType unitDisplayType2 = ((C3649f) response).f12756n;
                InneractiveAdRequest inneractiveAdRequest3 = this.f9547a;
                if (inneractiveAdRequest3 == null || inneractiveAdRequest3.getAllowFullscreen()) {
                    z4 = true;
                }
                StringBuilder sb = new StringBuilder();
                if (unitDisplayType2 != null && unitDisplayType2.isFullscreenUnit() && !z4) {
                    sb.append("<script type=\"text/javascript\">  var IaCloseBtnHelper = (function initIaCloseBtnHelper(){    var styleContent = '.celtra-close-button {display:none !important;} .close-button {display:none !important;}';    function getStyle(doc){      var style = doc.createElement('style');      style.type = 'text/css';      if (style.styleSheet){        style.styleSheet.cssText = styleContent;      } else {        style.appendChild(doc.createTextNode(styleContent));      }      return style;    }    function onDomReady(){      var iframes = window.document.getElementsByTagName('iframe'),          i = 0,          len = iframes && iframes.length || 0;      for(; i < len; ++i){        if(!iframes[i].src){          try {            iframes[i].contentDocument.body.appendChild(getStyle(iframes[i].contentDocument));          }catch(e){          }}}}    function registerWindowEvents(){      window.addEventListener('load', function onWindowLoad(){        window.removeEventListener('load', onWindowLoad);        onDomReady();      });    }    return {      init: function init(){        if(window.document.readyState != 'complete'){          registerWindowEvents();        }else{          onDomReady();        }}}})();  IaCloseBtnHelper.init();</script>");
                }
                String sb2 = sb.toString();
                str = m6913a(unitDisplayType2);
                str2 = sb2;
            } else {
                str2 = "";
                str = str2;
            }
            this.f9585h.setAutoplayMRAIDVideos(unitDisplayType.isFullscreenUnit());
            IAmraidWebViewController iAmraidWebViewController3 = this.f9585h;
            String a2 = C2618a.m6640a();
            StringBuilder k = C13555b.m33972k("");
            k.append(((C3649f) this.f9548b).f12769B);
            iAmraidWebViewController3.mo15409a(a2, k.toString(), str2, str, this.f9586i, TimeUnit.SECONDS.toMillis((long) iAConfigManager.f9235w.f9342a.f9337b.mo13271a("DisplayAdLoadTimeOutInSeconds", 10, 3)));
        } catch (Throwable th) {
            mo13518a(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, th));
        }
    }

    /* renamed from: a */
    public static String m6913a(UnitDisplayType unitDisplayType) {
        StringBuilder sb = new StringBuilder();
        if (unitDisplayType != null && !unitDisplayType.isFullscreenUnit()) {
            if (unitDisplayType == UnitDisplayType.BANNER) {
                sb.append(" body {display: flex;} #iawrapper { position:unset !important; display: unset !important; } ");
            } else {
                sb.append(" #iawrapper { position:unset !important; display: unset !important; }");
            }
        }
        return sb.toString();
    }

    /* renamed from: com.fyber.inneractive.sdk.flow.h$a */
    public class C2773a implements C3753a.C3759f {
        public C2773a() {
        }

        /* renamed from: a */
        public void mo13538a(C3753a aVar) {
            C2772h hVar = C2772h.this;
            hVar.getClass();
            IAlog.m9902a("%sweb view returned onReady!", IAlog.m9899a((Object) hVar));
            Response response = C2772h.this.f9548b;
            UnitDisplayType unitDisplayType = response != null ? ((C3649f) response).f12756n : null;
            if (unitDisplayType != null && unitDisplayType.isFullscreenUnit()) {
                C2772h hVar2 = C2772h.this;
                hVar2.getClass();
                try {
                    C2924p pVar = C2924p.EVENT_READY_ON_CLIENT;
                    InneractiveAdRequest inneractiveAdRequest = hVar2.f9547a;
                    Content content = hVar2.f9549c;
                    C2926q.C2927a aVar2 = new C2926q.C2927a(content != null ? (C3649f) ((C2794u) content).f9591b : null);
                    aVar2.f10042c = pVar;
                    aVar2.f10040a = inneractiveAdRequest;
                    aVar2.f10043d = null;
                    aVar2.mo13717a((String) null);
                } catch (Exception unused) {
                }
            }
            C2772h.this.mo13520d();
        }

        /* renamed from: a */
        public void mo13539a(C3753a aVar, InneractiveErrorCode inneractiveErrorCode) {
            InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(inneractiveErrorCode);
            C2772h.this.mo13517a((InneractiveError) inneractiveInfrastructureError);
            C2772h hVar = C2772h.this;
            hVar.getClass();
            IAlog.m9902a("%sweb view returned onFailedLoading!", IAlog.m9899a((Object) hVar));
            C2772h.this.mo13518a(inneractiveInfrastructureError);
            if (inneractiveErrorCode == InneractiveErrorCode.NON_SECURE_CONTENT_DETECTED) {
                C2922o oVar = C2922o.MRAID_ERROR_UNSECURE_CONTENT;
                C2772h hVar2 = C2772h.this;
                InneractiveAdRequest inneractiveAdRequest = hVar2.f9547a;
                Response response = hVar2.f9548b;
                JSONArray c = hVar2.f9552f.mo13268c();
                C2926q.C2927a aVar2 = new C2926q.C2927a(response);
                aVar2.f10041b = oVar;
                aVar2.f10040a = inneractiveAdRequest;
                aVar2.f10043d = c;
                aVar2.mo13717a((String) null);
            }
        }
    }
}
