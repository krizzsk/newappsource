package com.fyber.inneractive.sdk.flow;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.C2524R;
import com.fyber.inneractive.sdk.config.C2703z;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C2666s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.model.vast.C2835b;
import com.fyber.inneractive.sdk.model.vast.C2836c;
import com.fyber.inneractive.sdk.model.vast.C2840g;
import com.fyber.inneractive.sdk.model.vast.C2841h;
import com.fyber.inneractive.sdk.network.C2888b;
import com.fyber.inneractive.sdk.network.C2909j0;
import com.fyber.inneractive.sdk.network.C2922o;
import com.fyber.inneractive.sdk.network.C2924p;
import com.fyber.inneractive.sdk.network.C2926q;
import com.fyber.inneractive.sdk.network.C2936u;
import com.fyber.inneractive.sdk.player.controller.C2990c;
import com.fyber.inneractive.sdk.response.C3648e;
import com.fyber.inneractive.sdk.response.C3650g;
import com.fyber.inneractive.sdk.util.C3739v0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C3753a;
import java.net.UnknownHostException;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.flow.g */
public class C2769g {

    /* renamed from: a */
    public int f9564a = 2;

    /* renamed from: b */
    public final InneractiveAdRequest f9565b;

    /* renamed from: c */
    public final C3650g f9566c;

    /* renamed from: d */
    public C2666s f9567d;

    /* renamed from: e */
    public C2835b f9568e;

    /* renamed from: f */
    public boolean f9569f = false;

    /* renamed from: g */
    public View f9570g = null;

    /* renamed from: h */
    public Context f9571h;

    /* renamed from: i */
    public C2990c f9572i;

    /* renamed from: j */
    public boolean f9573j;

    /* renamed from: k */
    public C2909j0 f9574k;

    /* renamed from: l */
    public UnitDisplayType f9575l;

    /* renamed from: m */
    public boolean f9576m;

    /* renamed from: n */
    public int f9577n;

    /* renamed from: o */
    public int f9578o;

    /* renamed from: p */
    public C2703z f9579p;

    /* renamed from: q */
    public int f9580q;

    /* renamed from: com.fyber.inneractive.sdk.flow.g$a */
    public class C2770a implements C3753a.C3759f {

        /* renamed from: a */
        public final /* synthetic */ C2836c f9581a;

        public C2770a(C2836c cVar) {
            this.f9581a = cVar;
        }

        /* renamed from: a */
        public void mo13538a(C3753a aVar) {
            boolean unused = C2769g.this.f9569f = true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0061  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo13539a(com.fyber.inneractive.sdk.web.C3753a r7, com.fyber.inneractive.sdk.external.InneractiveErrorCode r8) {
            /*
                r6 = this;
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                com.fyber.inneractive.sdk.flow.g r8 = com.fyber.inneractive.sdk.flow.C2769g.this
                java.lang.String r8 = com.fyber.inneractive.sdk.util.IAlog.m9899a((java.lang.Object) r8)
                r7.append(r8)
                java.lang.String r8 = " Fetching companion html failed!"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 0
                java.lang.Object[] r0 = new java.lang.Object[r8]
                com.fyber.inneractive.sdk.util.IAlog.m9902a(r7, r0)
                com.fyber.inneractive.sdk.flow.g r7 = com.fyber.inneractive.sdk.flow.C2769g.this
                boolean unused = r7.f9569f = r8
                com.fyber.inneractive.sdk.model.vast.h r7 = com.fyber.inneractive.sdk.model.vast.C2841h.Gif
                com.fyber.inneractive.sdk.model.vast.c r0 = r6.f9581a
                com.fyber.inneractive.sdk.model.vast.h r0 = r0.f9747b
                boolean r7 = r7.equals(r0)
                r0 = 1
                if (r7 == 0) goto L_0x003e
                com.fyber.inneractive.sdk.model.vast.c r7 = r6.f9581a
                java.lang.String r1 = r7.f9751f
                com.fyber.inneractive.sdk.model.vast.h r7 = r7.f9747b
                boolean r7 = com.fyber.inneractive.sdk.util.C3739v0.m10004a(r1, r7)
                if (r7 == 0) goto L_0x003c
                goto L_0x003e
            L_0x003c:
                r7 = 0
                goto L_0x003f
            L_0x003e:
                r7 = 1
            L_0x003f:
                com.fyber.inneractive.sdk.flow.g r1 = com.fyber.inneractive.sdk.flow.C2769g.this
                int r2 = r1.f9580q
                int r3 = r1.f9564a
                if (r2 > r3) goto L_0x005e
                if (r7 == 0) goto L_0x005e
                java.lang.Object[] r7 = new java.lang.Object[r0]
                java.lang.String r0 = com.fyber.inneractive.sdk.util.IAlog.m9899a((java.lang.Object) r6)
                r7[r8] = r0
                java.lang.String r8 = "%sloadHtmlCompanion retry"
                com.fyber.inneractive.sdk.util.IAlog.m9902a(r8, r7)
                com.fyber.inneractive.sdk.flow.g r7 = com.fyber.inneractive.sdk.flow.C2769g.this
                com.fyber.inneractive.sdk.model.vast.c r8 = r6.f9581a
                r7.mo13535a(r8)
                goto L_0x00ad
            L_0x005e:
                r2 = 0
                if (r7 != 0) goto L_0x0075
                com.fyber.inneractive.sdk.network.q$a r7 = new com.fyber.inneractive.sdk.network.q$a
                com.fyber.inneractive.sdk.network.o r3 = com.fyber.inneractive.sdk.network.C2922o.VAST_COMPANION_INCOMPATIBLE_MIMETYPE
                com.fyber.inneractive.sdk.external.InneractiveAdRequest r4 = r1.f9565b
                com.fyber.inneractive.sdk.response.g r1 = r1.f9566c
                r7.<init>(r1)
                r7.f10041b = r3
                r7.f10040a = r4
                r7.f10043d = r2
                r7.mo13717a((java.lang.String) r2)
            L_0x0075:
                com.fyber.inneractive.sdk.network.q$a r7 = new com.fyber.inneractive.sdk.network.q$a
                com.fyber.inneractive.sdk.network.o r1 = com.fyber.inneractive.sdk.network.C2922o.VAST_COMPANION_FAILED_LOADING
                com.fyber.inneractive.sdk.flow.g r3 = com.fyber.inneractive.sdk.flow.C2769g.this
                com.fyber.inneractive.sdk.external.InneractiveAdRequest r4 = r3.f9565b
                com.fyber.inneractive.sdk.response.g r5 = r3.f9566c
                com.fyber.inneractive.sdk.config.global.s r3 = r3.f9567d
                org.json.JSONArray r3 = r3.mo13268c()
                r7.<init>(r5)
                r7.f10041b = r1
                r7.f10040a = r4
                r7.f10043d = r3
                r1 = 2
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.String r3 = "companion_data"
                r1[r8] = r3
                com.fyber.inneractive.sdk.model.vast.c r3 = r6.f9581a
                org.json.JSONObject r3 = r3.mo13636a()
                r1[r0] = r3
                r7.mo13716a((java.lang.Object[]) r1)
                r7.mo13717a((java.lang.String) r2)
                com.fyber.inneractive.sdk.flow.g r7 = com.fyber.inneractive.sdk.flow.C2769g.this
                boolean unused = r7.f9569f = r8
                com.fyber.inneractive.sdk.flow.g r7 = com.fyber.inneractive.sdk.flow.C2769g.this
                r7.mo13534a()
            L_0x00ad:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.C2769g.C2770a.mo13539a(com.fyber.inneractive.sdk.web.a, com.fyber.inneractive.sdk.external.InneractiveErrorCode):void");
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.flow.g$b */
    public class C2771b implements C2936u<C2909j0.C2910a> {

        /* renamed from: a */
        public final /* synthetic */ C2836c f9583a;

        public C2771b(C2836c cVar) {
            this.f9583a = cVar;
        }

        /* renamed from: a */
        public void mo13154a(Object obj, Exception exc, boolean z) {
            View view;
            C2909j0.C2910a aVar = (C2909j0.C2910a) obj;
            C2769g.this.f9570g = new ImageView(C2769g.this.f9571h);
            C2769g.this.f9570g.setId(C2524R.C2526id.inneractive_vast_endcard_static);
            C2769g.this.f9570g.setContentDescription("inneractive_vast_endcard_static");
            if (exc == null && aVar != null && aVar.f9927b == null) {
                Bitmap bitmap = aVar.f9926a;
                if (bitmap != null && (view = C2769g.this.f9570g) != null) {
                    ((ImageView) view).setImageBitmap(bitmap);
                    boolean unused = C2769g.this.f9569f = true;
                    return;
                }
                return;
            }
            IAlog.m9902a("%s Fetching companion image failed!", IAlog.m9899a((Object) C2769g.this));
            C2836c cVar = this.f9583a;
            boolean a = C3739v0.m10004a(cVar.f9751f, cVar.f9747b);
            if ((aVar == null || (aVar.f9927b != null && ((exc instanceof C2888b) || (exc instanceof UnknownHostException)))) && a) {
                C2769g gVar = C2769g.this;
                if (gVar.f9580q <= gVar.f9564a) {
                    IAlog.m9902a("%sloadStaticCompanion retry", IAlog.m9899a((Object) this));
                    C2769g.this.mo13537b(this.f9583a);
                    return;
                }
            }
            if (!a) {
                C2769g gVar2 = C2769g.this;
                gVar2.getClass();
                new C2926q.C2927a(C2922o.VAST_COMPANION_INCOMPATIBLE_MIMETYPE, gVar2.f9565b, (C3648e) gVar2.f9566c, (JSONArray) null).mo13717a((String) null);
            }
            C2922o oVar = C2922o.VAST_COMPANION_FAILED_LOADING;
            C2769g gVar3 = C2769g.this;
            C2926q.C2927a aVar2 = new C2926q.C2927a(oVar, gVar3.f9565b, (C3648e) gVar3.f9566c, (JSONArray) null);
            JSONObject jSONObject = new JSONObject();
            JSONObject a2 = this.f9583a.mo13636a();
            try {
                jSONObject.put("companion_data", a2);
            } catch (Exception unused2) {
                IAlog.m9906e("Got exception adding param to json object: %s, %s", "companion_data", a2);
            }
            if (aVar != null && !TextUtils.isEmpty(aVar.f9927b)) {
                String str = aVar.f9927b;
                try {
                    jSONObject.put("reason", str);
                } catch (Exception unused3) {
                    IAlog.m9906e("Got exception adding param to json object: %s, %s", "reason", str);
                }
            }
            aVar2.f10045f.put(jSONObject);
            aVar2.mo13717a((String) null);
            C2769g.this.mo13534a();
        }
    }

    public C2769g(Context context, C3650g gVar, InneractiveAdRequest inneractiveAdRequest, C2666s sVar) {
        this.f9568e = gVar.mo15298f();
        this.f9571h = context;
        this.f9566c = gVar;
        this.f9565b = inneractiveAdRequest;
        this.f9567d = sVar;
        this.f9564a = IAConfigManager.m6632b().mo13276a().mo13271a("companion_retry_count", 2, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x010a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13535a(com.fyber.inneractive.sdk.model.vast.C2836c r15) {
        /*
            r14 = this;
            com.fyber.inneractive.sdk.factories.b r0 = com.fyber.inneractive.sdk.factories.C2754b.C2755a.f9535a
            com.fyber.inneractive.sdk.response.a r1 = com.fyber.inneractive.sdk.response.C3644a.RETURNED_ADTYPE_HTML
            java.util.HashMap<com.fyber.inneractive.sdk.response.a, com.fyber.inneractive.sdk.factories.b$b> r0 = r0.f9534a
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            r14.mo13536b()
            int r0 = r14.f9580q
            r1 = 1
            int r0 = r0 + r1
            r14.f9580q = r0
            int r0 = com.fyber.inneractive.sdk.util.IAlog.f12814a
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "COMPANION_TYPE"
            r3 = 0
            r0[r3] = r2
            com.fyber.inneractive.sdk.model.vast.g r2 = r15.f9746a
            java.lang.String r2 = r2.name()
            r0[r1] = r2
            r2 = 0
            java.lang.String r4 = "%s: %s"
            com.fyber.inneractive.sdk.util.IAlog.m9900a(r1, r2, r4, r0)
            com.fyber.inneractive.sdk.player.controller.c r0 = new com.fyber.inneractive.sdk.player.controller.c
            android.content.Context r6 = r14.f9571h
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r7 = r14.f9575l
            boolean r8 = r14.f9576m
            int r9 = r14.f9577n
            int r10 = r14.f9578o
            com.fyber.inneractive.sdk.config.z r11 = r14.f9579p
            com.fyber.inneractive.sdk.model.vast.g r12 = r15.f9746a
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r14.f9572i = r0
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r4 = r0.f10223a
            if (r4 != 0) goto L_0x004a
            r5 = r2
            goto L_0x004c
        L_0x004a:
            com.fyber.inneractive.sdk.web.c r5 = r4.f12957b
        L_0x004c:
            r14.f9570g = r5
            com.fyber.inneractive.sdk.flow.g$a r11 = new com.fyber.inneractive.sdk.flow.g$a
            r11.<init>(r15)
            java.lang.String r5 = r15.f9751f
            com.fyber.inneractive.sdk.model.vast.g r6 = r15.f9746a
            com.fyber.inneractive.sdk.model.vast.g r7 = com.fyber.inneractive.sdk.model.vast.C2840g.Iframe
            java.lang.String r8 = "$__IMGSRC__$"
            if (r6 != r7) goto L_0x0079
            java.lang.String r1 = "fyb_iframe_endcard_tmpl.html"
            java.lang.String r1 = com.fyber.inneractive.sdk.util.C3707l.m9969c((java.lang.String) r1)
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 != 0) goto L_0x00c1
            java.lang.String r4 = r15.f9751f
            java.lang.String r1 = r1.replace(r8, r4)
            java.lang.String r15 = r15.f9751f
            java.lang.String r4 = "$__SrcIframeUrl__$"
            java.lang.String r15 = r1.replace(r4, r15)
        L_0x0077:
            r8 = r15
            goto L_0x00c2
        L_0x0079:
            com.fyber.inneractive.sdk.model.vast.g r7 = com.fyber.inneractive.sdk.model.vast.C2840g.Static
            if (r6 != r7) goto L_0x00c1
            com.fyber.inneractive.sdk.model.vast.h r6 = r15.f9747b
            com.fyber.inneractive.sdk.model.vast.h r7 = com.fyber.inneractive.sdk.model.vast.C2841h.Gif
            if (r6 != r7) goto L_0x00c1
            if (r4 == 0) goto L_0x0094
            com.fyber.inneractive.sdk.web.c r4 = r4.f12957b
            android.webkit.WebSettings r4 = r4.getSettings()
            r4.setMediaPlaybackRequiresUserGesture(r3)
            r4.setLoadWithOverviewMode(r1)
            r4.setUseWideViewPort(r1)
        L_0x0094:
            com.fyber.inneractive.sdk.player.controller.c r1 = r14.f9572i
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r1 = r1.f10223a
            if (r1 == 0) goto L_0x009c
            r1.f12795Y = r3
        L_0x009c:
            java.lang.String r1 = "fyb_static_endcard_tmpl.html"
            java.lang.String r1 = com.fyber.inneractive.sdk.util.C3707l.m9969c((java.lang.String) r1)
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 != 0) goto L_0x00ae
            java.lang.String r4 = r15.f9751f
            java.lang.String r5 = r1.replace(r8, r4)
        L_0x00ae:
            java.lang.String r15 = r15.f9752g
            if (r15 == 0) goto L_0x00c1
            java.lang.String r1 = "\""
            java.lang.String r4 = "\\\""
            java.lang.String r15 = r15.replace(r1, r4)
            java.lang.String r1 = "$__IMGHREF__$"
            java.lang.String r15 = r5.replace(r1, r15)
            goto L_0x0077
        L_0x00c1:
            r8 = r5
        L_0x00c2:
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r15 = r0.f10223a
            if (r15 == 0) goto L_0x010a
            boolean r15 = android.text.TextUtils.isEmpty(r8)
            if (r15 != 0) goto L_0x010a
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r15 = r0.f10223a
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = r0.f10225c
            boolean r1 = r1.isFullscreenUnit()
            r15.setAutoplayMRAIDVideos(r1)
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r15 = r0.f10223a
            r15.setCenteringTagsRequired(r3)
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r6 = r0.f10223a
            java.lang.String r7 = com.fyber.inneractive.sdk.config.C2618a.m6640a()
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r15 = r0.f10225c
            boolean r1 = r0.f10227e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            if (r15 == 0) goto L_0x00fa
            boolean r15 = r15.isFullscreenUnit()
            if (r15 == 0) goto L_0x00fa
            if (r1 != 0) goto L_0x00fa
            java.lang.String r15 = "<script type=\"text/javascript\">  var IaCloseBtnHelper = (function initIaCloseBtnHelper(){    var styleContent = '.celtra-close-button {display:none !important;} .close-button {display:none !important;}';    function getStyle(doc){      var style = doc.createElement('style');      style.type = 'text/css';      if (style.styleSheet){        style.styleSheet.cssText = styleContent;      } else {        style.appendChild(doc.createTextNode(styleContent));      }      return style;    }    function onDomReady(){      var iframes = window.document.getElementsByTagName('iframe'),          i = 0,          len = iframes && iframes.length || 0;      for(; i < len; ++i){        if(!iframes[i].src){          try {            iframes[i].contentDocument.body.appendChild(getStyle(iframes[i].contentDocument));          }catch(e){          }}}}    function registerWindowEvents(){      window.addEventListener('load', function onWindowLoad(){        window.removeEventListener('load', onWindowLoad);        onDomReady();      });    }    return {      init: function init(){        if(window.document.readyState != 'complete'){          registerWindowEvents();        }else{          onDomReady();        }}}})();  IaCloseBtnHelper.init();</script>"
            r2.append(r15)
        L_0x00fa:
            java.lang.String r9 = r2.toString()
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r15 = r0.f10225c
            java.lang.String r10 = com.fyber.inneractive.sdk.flow.C2772h.m6913a(r15)
            r12 = 10000(0x2710, double:4.9407E-320)
            r6.mo15409a(r7, r8, r9, r10, r11, r12)
            goto L_0x010f
        L_0x010a:
            com.fyber.inneractive.sdk.external.InneractiveErrorCode r15 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.UNSPECIFIED
            r11.mo13539a(r2, r15)
        L_0x010f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.C2769g.mo13535a(com.fyber.inneractive.sdk.model.vast.c):void");
    }

    /* renamed from: b */
    public final void mo13536b() {
        C2924p pVar = C2924p.VAST_COMPANION_LOAD_ATTEMPT;
        InneractiveAdRequest inneractiveAdRequest = this.f9565b;
        C3650g gVar = this.f9566c;
        C2666s sVar = this.f9567d;
        JSONArray c = sVar == null ? null : sVar.mo13268c();
        C2926q.C2927a aVar = new C2926q.C2927a(gVar);
        aVar.f10042c = pVar;
        aVar.f10040a = inneractiveAdRequest;
        aVar.f10043d = c;
        aVar.mo13717a((String) null);
    }

    /* renamed from: b */
    public final void mo13537b(C2836c cVar) {
        mo13536b();
        int i = IAlog.f12814a;
        IAlog.m9900a(1, (Exception) null, "%s: %s", "COMPANION_TYPE", cVar.f9746a.name());
        this.f9580q++;
        C2909j0 j0Var = new C2909j0(new C2771b(cVar), cVar.f9751f);
        this.f9574k = j0Var;
        IAConfigManager.f9202J.f9232t.mo13730c(j0Var);
    }

    /* renamed from: a */
    public void mo13534a() {
        boolean z;
        if (!this.f9569f) {
            IAlog.m9902a("%sloadNextVastCompanion called", IAlog.m9899a((Object) this));
            this.f9573j = false;
            this.f9570g = null;
            if (this.f9568e == null) {
                IAlog.m9902a("%svast data is null! Object must have already been destroyed", IAlog.m9899a((Object) this));
                z = false;
            } else {
                z = true;
            }
            if (this.f9568e.f9742f.size() == 0) {
                IAlog.m9903b("%sgetNextIAvastCompanion - No companion ads found", IAlog.m9899a((Object) this));
                z = false;
            }
            if (!z) {
                IAlog.m9902a("%sno more companion ads available.", IAlog.m9899a((Object) this));
                return;
            }
            C2835b bVar = this.f9568e;
            C2836c poll = bVar.f9742f.poll();
            bVar.f9743g = poll;
            IAlog.m9902a("%sgetNextIAvastCompanion returning: %s", IAlog.m9899a((Object) this), poll);
            this.f9580q = 0;
            if (poll == null) {
                return;
            }
            if (poll.f9746a != C2840g.Static || C2841h.Gif.equals(poll.f9747b)) {
                mo13535a(poll);
            } else {
                mo13537b(poll);
            }
        }
    }
}
