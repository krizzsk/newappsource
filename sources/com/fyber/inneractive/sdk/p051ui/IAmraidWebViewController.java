package com.fyber.inneractive.sdk.p051ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import com.appboy.models.InAppMessageBase;
import com.fyber.inneractive.sdk.C2524R;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.C2776j;
import com.fyber.inneractive.sdk.measurement.C2816a;
import com.fyber.inneractive.sdk.measurement.C2820d;
import com.fyber.inneractive.sdk.measurement.C2822f;
import com.fyber.inneractive.sdk.mraid.C2858a;
import com.fyber.inneractive.sdk.mraid.C2859a0;
import com.fyber.inneractive.sdk.mraid.C2860b;
import com.fyber.inneractive.sdk.mraid.C2861b0;
import com.fyber.inneractive.sdk.mraid.C2862c;
import com.fyber.inneractive.sdk.mraid.C2863d;
import com.fyber.inneractive.sdk.mraid.C2864e;
import com.fyber.inneractive.sdk.mraid.C2865f;
import com.fyber.inneractive.sdk.mraid.C2866g;
import com.fyber.inneractive.sdk.mraid.C2867h;
import com.fyber.inneractive.sdk.mraid.C2868i;
import com.fyber.inneractive.sdk.mraid.C2869j;
import com.fyber.inneractive.sdk.mraid.C2870k;
import com.fyber.inneractive.sdk.mraid.C2871l;
import com.fyber.inneractive.sdk.mraid.C2872m;
import com.fyber.inneractive.sdk.mraid.C2873n;
import com.fyber.inneractive.sdk.mraid.C2874o;
import com.fyber.inneractive.sdk.mraid.C2875p;
import com.fyber.inneractive.sdk.mraid.C2876q;
import com.fyber.inneractive.sdk.mraid.C2877r;
import com.fyber.inneractive.sdk.mraid.C2879t;
import com.fyber.inneractive.sdk.mraid.C2880u;
import com.fyber.inneractive.sdk.mraid.C2881v;
import com.fyber.inneractive.sdk.mraid.C2882w;
import com.fyber.inneractive.sdk.mraid.C2883x;
import com.fyber.inneractive.sdk.mraid.C2884y;
import com.fyber.inneractive.sdk.mraid.C2885z;
import com.fyber.inneractive.sdk.network.C2922o;
import com.fyber.inneractive.sdk.network.C2924p;
import com.fyber.inneractive.sdk.network.C2926q;
import com.fyber.inneractive.sdk.response.C3648e;
import com.fyber.inneractive.sdk.util.C3705k;
import com.fyber.inneractive.sdk.util.C3707l;
import com.fyber.inneractive.sdk.util.C3714n;
import com.fyber.inneractive.sdk.util.C3721p0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C3753a;
import com.fyber.inneractive.sdk.web.C3762c;
import com.fyber.inneractive.sdk.web.C3764d;
import com.google.android.play.core.appupdate.C14226d;
import com.iab.omid.library.fyber.adsession.AdSessionContextType;
import com.iab.omid.library.fyber.adsession.CreativeType;
import com.iab.omid.library.fyber.adsession.ImpressionType;
import com.iab.omid.library.fyber.adsession.Owner;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import p389bl.C13637c;
import p699oh.C18748a;
import p699oh.C18749b;
import p699oh.C18750c;
import p699oh.C18751d;
import p699oh.C18752e;
import p699oh.C18754g;

/* renamed from: com.fyber.inneractive.sdk.ui.IAmraidWebViewController */
public class IAmraidWebViewController extends C3764d<C3764d.C3770f> {

    /* renamed from: Y */
    public boolean f12795Y;

    /* renamed from: Z */
    public boolean f12796Z = false;

    /* renamed from: a0 */
    public boolean f12797a0 = false;

    /* renamed from: b0 */
    public boolean f12798b0 = false;

    /* renamed from: c0 */
    public boolean f12799c0 = true;

    /* renamed from: d0 */
    public boolean f12800d0 = false;

    /* renamed from: e0 */
    public C3764d.C3771g f12801e0;

    /* renamed from: f0 */
    public final Runnable f12802f0 = new C3660a();

    /* renamed from: g0 */
    public final Runnable f12803g0 = new C3663b();

    /* renamed from: com.fyber.inneractive.sdk.ui.IAmraidWebViewController$MraidVideoFailedToDisplayError */
    public static class MraidVideoFailedToDisplayError extends InneractiveUnitController.AdDisplayError {
        public MraidVideoFailedToDisplayError(String str) {
            super(str);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.ui.IAmraidWebViewController$a */
    public class C3660a implements Runnable {

        /* renamed from: com.fyber.inneractive.sdk.ui.IAmraidWebViewController$a$a */
        public class C3661a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: com.fyber.inneractive.sdk.ui.IAmraidWebViewController$a$a$a */
            public class C3662a implements Runnable {
                public C3662a() {
                }

                public void run() {
                    C2816a.C2817a aVar;
                    C18748a aVar2;
                    IAmraidWebViewController iAmraidWebViewController = IAmraidWebViewController.this;
                    if (iAmraidWebViewController.f13020w != null && (aVar = iAmraidWebViewController.f13021x) != null) {
                        C2822f fVar = (C2822f) aVar;
                        if (!fVar.f9687d && fVar.f9685b != null && (aVar2 = fVar.f9686c) != null) {
                            fVar.f9687d = true;
                            try {
                                aVar2.mo51247b();
                            } catch (Throwable th) {
                                fVar.mo13610a(th);
                            }
                        }
                    }
                }
            }

            public C3661a() {
            }

            public boolean onPreDraw() {
                int i;
                int i2;
                boolean z;
                C3762c cVar;
                C3762c cVar2 = IAmraidWebViewController.this.f12957b;
                if (cVar2 != null) {
                    cVar2.getViewTreeObserver().removeOnPreDrawListener(this);
                    IAmraidWebViewController iAmraidWebViewController = IAmraidWebViewController.this;
                    iAmraidWebViewController.getClass();
                    ArrayList arrayList = new ArrayList();
                    if (iAmraidWebViewController.f12957b.getScaleX() == 1.0f || iAmraidWebViewController.f12957b.getScaleY() == 1.0f) {
                        arrayList.add(new C2883x(iAmraidWebViewController.f13007K, iAmraidWebViewController.f13008L));
                        arrayList.add(new C2881v(iAmraidWebViewController.f13009M, iAmraidWebViewController.f13010N));
                    } else {
                        arrayList.add(new C2883x(iAmraidWebViewController.f12957b.getWidthDp(), iAmraidWebViewController.f12957b.getHeightDp()));
                        arrayList.add(new C2881v(iAmraidWebViewController.f12957b.getWidthDp(), iAmraidWebViewController.f12957b.getHeightDp()));
                    }
                    C3762c cVar3 = iAmraidWebViewController.f12957b;
                    if (cVar3 != null) {
                        i = cVar3.getWidth();
                    } else {
                        i = iAmraidWebViewController.f13009M;
                    }
                    int c = C3707l.m9968c(i);
                    C3762c cVar4 = iAmraidWebViewController.f12957b;
                    if (cVar4 != null) {
                        i2 = cVar4.getHeight();
                    } else {
                        i2 = iAmraidWebViewController.f13010N;
                    }
                    arrayList.add(new C2880u(0, 0, c, C3707l.m9968c(i2)));
                    if (iAmraidWebViewController.f12957b != null) {
                        String obj = arrayList.toString();
                        if (obj.length() >= 2) {
                            StringBuilder k = C13555b.m33972k("{");
                            k.append(obj.substring(1, obj.length() - 1));
                            k.append("}");
                            String sb = k.toString();
                            C3762c cVar5 = iAmraidWebViewController.f12957b;
                            cVar5.mo15429a("window.mraidbridge.fireChangeEvent(" + sb + ");");
                            IAlog.m9905d("Fire changes: %s", sb);
                        }
                    }
                    C2859a0 a0Var = C2859a0.DEFAULT;
                    iAmraidWebViewController.f13022y = a0Var;
                    iAmraidWebViewController.mo15452a((C2879t) new C2884y(a0Var));
                    C3762c cVar6 = iAmraidWebViewController.f12957b;
                    if (cVar6 == null || cVar6.getContext() == null) {
                        z = false;
                    } else {
                        z = C3705k.m9944a(new Intent(iAmraidWebViewController.f12957b.getContext(), InneractiveRichMediaVideoPlayerActivityCore.class));
                    }
                    C2885z zVar = new C2885z();
                    Intent intent = new Intent("android.intent.action.DIAL");
                    intent.setData(Uri.parse("tel:"));
                    zVar.f9868b = C3705k.m9944a(intent);
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.setData(Uri.parse("sms:"));
                    zVar.f9867a = C3705k.m9944a(intent2);
                    zVar.f9869c = C3705k.m9944a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.item/event"));
                    zVar.f9871e = z;
                    zVar.f9870d = C3705k.m9952n();
                    iAmraidWebViewController.mo15452a((C2879t) zVar);
                    IAmraidWebViewController iAmraidWebViewController2 = IAmraidWebViewController.this;
                    iAmraidWebViewController2.mo15452a((C2879t) new C2882w(iAmraidWebViewController2.f12801e0));
                    IAmraidWebViewController iAmraidWebViewController3 = IAmraidWebViewController.this;
                    if (iAmraidWebViewController3.f12801e0 == C3764d.C3771g.INTERSTITIAL && (cVar = iAmraidWebViewController3.f12957b) != null) {
                        cVar.mo15429a("showInterstitial();");
                    }
                    C3762c cVar7 = IAmraidWebViewController.this.f12957b;
                    if (cVar7 != null) {
                        cVar7.mo15429a("window.mraidbridge.fireReadyEvent();");
                    }
                    IAmraidWebViewController iAmraidWebViewController4 = IAmraidWebViewController.this;
                    iAmraidWebViewController4.mo15450a(iAmraidWebViewController4.mo15460g(), true);
                    IAmraidWebViewController.this.mo15327n();
                    C3714n.f12902b.postDelayed(new C3662a(), 100);
                }
                return false;
            }
        }

        public C3660a() {
        }

        public void run() {
            C3762c cVar = IAmraidWebViewController.this.f12957b;
            if (cVar != null) {
                cVar.getViewTreeObserver().addOnPreDrawListener(new C3661a());
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.ui.IAmraidWebViewController$b */
    public class C3663b implements Runnable {
        public C3663b() {
        }

        public void run() {
            C3762c cVar = IAmraidWebViewController.this.f12957b;
            if (cVar != null) {
                cVar.mo15429a("if (FyMraidVideo.getCurrentTime() < 0.2) { var ifr = document.createElement('iframe'); var container = document.body || document.documentElement; container.appendChild(ifr); ifr.setAttribute('sandbox', ''); ifr.setAttribute('style', 'position: fixed; bottom: -20px; border: none; visibility: hidden; height: 20px; z-index: -99999'); ifr.setAttribute('src','FyMraidVideo://fyMraidVideoAdPlaybackFailure'); console.log('dispatched closure event'); } else { console.log('video has progressed'); };");
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.ui.IAmraidWebViewController$c */
    public class C3664c implements Runnable {
        public C3664c() {
        }

        public void run() {
            C3762c cVar = IAmraidWebViewController.this.f12957b;
            if (cVar != null) {
                try {
                    cVar.invalidate();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public IAmraidWebViewController(Context context, boolean z, C3764d.C3771g gVar, C3764d.C3768d dVar, C3764d.C3772h hVar, boolean z2, C2816a aVar) {
        super(context, z, false, gVar, dVar, hVar, aVar);
        this.f12795Y = z2;
        this.f12957b.setId(C2524R.C2526id.inneractive_webview_mraid);
        this.f12801e0 = gVar;
    }

    /* renamed from: a */
    public final void mo15321a(long j) {
        C3714n.f12902b.postDelayed(new C3664c(), j);
    }

    /* renamed from: e */
    public void mo15324e(boolean z) {
        C3762c cVar;
        String str;
        mo15452a((C2879t) new C2861b0(z));
        IAlog.m9902a("%sonWebViewVisibilityChanged called with: %s", IAlog.m9899a((Object) this), Boolean.valueOf(z));
        L l = this.f12962g;
        if (l != null) {
            l.mo15267a(z);
        }
        if (this.f12797a0 && this.f12796Z && this.f12798b0 && (cVar = this.f12957b) != null) {
            StringBuilder k = C13555b.m33972k("FyMraidVideo.");
            if (z) {
                str = "play";
            } else {
                str = "pause";
            }
            k.append(str);
            k.append("();");
            cVar.mo15429a(k.toString());
        }
        if (this.f12957b != null && z) {
            mo15321a(1);
            mo15321a(100);
            mo15321a(250);
            mo15321a(1000);
        }
    }

    /* renamed from: l */
    public void mo15325l() {
        mo15410a(false);
        Handler handler = C3714n.f12902b;
        handler.removeCallbacks(this.f12803g0);
        handler.removeCallbacks(this.f12802f0);
    }

    /* renamed from: m */
    public void mo15326m() {
        C3762c cVar = this.f12957b;
        if (cVar != null) {
            this.f12796Z = true;
            if (this.f12798b0) {
                cVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
            }
            C3714n.f12902b.postDelayed(this.f12802f0, 0);
        }
    }

    /* renamed from: n */
    public final void mo15327n() {
        C3762c cVar;
        if (this.f12796Z && this.f12797a0 && this.f12798b0 && (cVar = this.f12957b) != null) {
            cVar.mo15429a("FyMraidVideo.play()");
            Runnable runnable = this.f12803g0;
            if (runnable != null) {
                C3714n.f12902b.postDelayed(runnable, InstallSheetPresenter.LOADING_TIMER_DELAY_IN_MILLIS);
            }
            if (this.f12800d0) {
                this.f12957b.mo15429a("FyMraidVideo.mute(true)");
            }
        }
    }

    public void setAutoplayMRAIDVideos(boolean z) {
        this.f12798b0 = z;
    }

    public void setCenteringTagsRequired(boolean z) {
        this.f12799c0 = z;
    }

    public void setMuteMraidVideo(boolean z) {
        this.f12800d0 = z;
    }

    /* renamed from: a */
    public boolean mo15323a(String str, C3721p0 p0Var) {
        C2865f fVar;
        C3762c cVar;
        C2822f fVar2;
        C18750c cVar2;
        C18751d dVar;
        Uri parse = Uri.parse(str);
        String uri = parse.toString();
        parse.getScheme();
        C2860b bVar = null;
        if (uri.startsWith("iaadfinishedloading")) {
            if (uri.endsWith(WidgetMessageParser.KEY_SUCCESS)) {
                IAlog.m9905d("received iaadfinishedloading success", new Object[0]);
                if (!(this.f12956a || this.f12961f == null || (cVar = this.f12957b) == null)) {
                    cVar.mo15430a();
                    this.f12956a = true;
                    C2816a aVar = this.f13020w;
                    if (aVar != null) {
                        C3762c cVar3 = this.f12957b;
                        C2776j jVar = this.f12977v;
                        IAlog.m9902a("omsdk initMraidSession", new Object[0]);
                        C18752e eVar = ((C2820d) aVar).f9682c;
                        if (eVar == null) {
                            IAlog.m9902a("omsdk partner is null", new Object[0]);
                            fVar2 = null;
                        } else {
                            fVar2 = new C2822f(eVar, cVar3, jVar);
                            try {
                                cVar2 = C18750c.m45764a(CreativeType.HTML_DISPLAY, ImpressionType.UNSPECIFIED, Owner.NATIVE, Owner.NONE);
                            } catch (Throwable th) {
                                fVar2.mo13610a(th);
                            }
                            try {
                                C18752e eVar2 = fVar2.f9684a;
                                C14226d.m35346l0(eVar2, "Partner is null");
                                C14226d.m35346l0(cVar3, "WebView is null");
                                dVar = new C18751d(eVar2, cVar3, (String) null, (List) null, AdSessionContextType.HTML);
                            } catch (Throwable th2) {
                                fVar2.mo13610a(th2);
                                dVar = null;
                            }
                            C18754g b = C18749b.m45759b(cVar2, dVar);
                            fVar2.f9685b = b;
                            b.mo51251d(cVar3);
                            fVar2.f9685b.mo51252e();
                            C18748a a = C18748a.m45756a(fVar2.f9685b);
                            fVar2.f9686c = a;
                            C14226d.m35351r0(a.f47691a);
                            C14226d.m35354u0(a.f47691a);
                            C18754g gVar = a.f47691a;
                            if (!gVar.f47719j) {
                                C13637c.m34066c(gVar.f47714e.mo44193h(), "publishLoadedEvent", new Object[0]);
                                gVar.f47719j = true;
                            } else {
                                throw new IllegalStateException("Loaded event can only be sent once");
                            }
                        }
                        this.f13021x = fVar2;
                    }
                    IAlog.m9902a("%sIAWebViewController: onWebviewLoaded - load took %d msec", IAlog.m9899a((Object) this), Long.valueOf(System.currentTimeMillis() - this.f12972q));
                    Runnable runnable = this.f12970o;
                    if (runnable != null) {
                        C3714n.f12902b.removeCallbacks(runnable);
                        this.f12970o = null;
                    }
                    C3753a.C3759f fVar3 = this.f12961f;
                    if (fVar3 != null) {
                        fVar3.mo13538a(this);
                    }
                }
            }
            return true;
        } else if (!"mraid".equals(Uri.parse(str).getScheme())) {
            return false;
        } else {
            URI create = URI.create(str);
            String host = create.getHost();
            try {
                Map<String, String> a2 = mo15448a(create);
                C2865f[] values = C2865f.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        fVar = C2865f.UNSPECIFIED;
                        break;
                    }
                    fVar = values[i];
                    if (fVar.f9854a.equals(host)) {
                        break;
                    }
                    i++;
                }
                switch (fVar.ordinal()) {
                    case 0:
                        bVar = new C2862c(a2, this, p0Var);
                        break;
                    case 1:
                        bVar = new C2864e(a2, this, p0Var);
                        break;
                    case 2:
                        bVar = new C2877r(a2, this, p0Var);
                        break;
                    case 3:
                        bVar = new C2871l(a2, this, p0Var);
                        break;
                    case 4:
                        bVar = new C2873n(a2, this, p0Var);
                        break;
                    case 5:
                        bVar = new C2869j(a2, this, p0Var);
                        break;
                    case 6:
                        bVar = new C2875p(a2, this, p0Var);
                        break;
                    case 7:
                        bVar = new C2874o(a2, this, p0Var);
                        break;
                    case 8:
                        bVar = new C2872m(a2, this, p0Var);
                        break;
                    case 9:
                        bVar = new C2876q(a2, this, p0Var);
                        break;
                    case 10:
                        bVar = new C2866g(a2, this, p0Var);
                        break;
                    case 11:
                        bVar = new C2867h(a2, this, p0Var);
                        break;
                    case 12:
                        bVar = new C2868i(a2, this, p0Var);
                        break;
                    case 13:
                        bVar = new C2870k(a2, this, p0Var);
                        break;
                    case 14:
                        bVar = new C2863d(a2, this, p0Var);
                        break;
                }
                if (bVar == null || ((bVar instanceof C2864e) && this.f12998B == C3764d.C3771g.INTERSTITIAL)) {
                    mo15454b(host);
                    return true;
                }
                bVar.f9839a = host;
                IAlog.m9905d("Processing MRaid command: %s", host);
                if (bVar instanceof C2858a) {
                    mo15411a((C3753a.C3758e) new C3764d.C3774j(this, (C2858a) bVar, p0Var));
                } else {
                    if (bVar.mo13655b()) {
                        mo15414d();
                    }
                    bVar.mo13659a();
                }
                mo15454b(host);
                return true;
            } catch (Exception unused) {
                return true;
            }
        }
    }

    /* renamed from: a */
    public boolean mo15322a(WebView webView, String str) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        IAlog.m9902a("IAmraidWebViewController: handleUrl = %s", str);
        if (this.f12957b == null) {
            IAlog.m9902a("handleUrl: web view already destroyed. Cannot handle url", new Object[0]);
            return false;
        } else if (str == null || !str.toLowerCase().startsWith("FyMraidVideo".toLowerCase())) {
            return super.mo15322a(webView, str);
        } else {
            if (str.toLowerCase().endsWith("fyMraidVideoAd".toLowerCase())) {
                IAlog.m9905d("Dispatching MRAID Video detection event", new Object[0]);
                C2924p pVar = C2924p.MRAID_VIDEO_DETECTED;
                InneractiveAdRequest inneractiveAdRequest = this.f12976u;
                C2776j jVar = this.f12977v;
                C3648e c = jVar == null ? null : jVar.mo13293c();
                C2776j jVar2 = this.f12977v;
                if (jVar2 == null) {
                    jSONArray2 = null;
                } else {
                    jSONArray2 = jVar2.f9592c.mo13268c();
                }
                C2926q.C2927a aVar = new C2926q.C2927a(c);
                aVar.f10042c = pVar;
                aVar.f10040a = inneractiveAdRequest;
                aVar.f10043d = jSONArray2;
                aVar.mo13717a((String) null);
                this.f12797a0 = true;
                mo15327n();
            } else if (str.toLowerCase().endsWith("fyMraidVideoAdPlaybackFailure".toLowerCase())) {
                IAlog.m9903b("MRAID Video has not started in a timely fashion, showing close button", new Object[0]);
                if (this.f12962g != null) {
                    mo15455b(false);
                    C2922o oVar = C2922o.MRAID_VIDEO_HAS_NOT_STARTED_PLAYING_IN_A_TIMELY_FASHION;
                    InneractiveAdRequest inneractiveAdRequest2 = this.f12976u;
                    C2776j jVar3 = this.f12977v;
                    C3648e c2 = jVar3 == null ? null : jVar3.mo13293c();
                    C2776j jVar4 = this.f12977v;
                    if (jVar4 == null) {
                        jSONArray = null;
                    } else {
                        jSONArray = jVar4.f9592c.mo13268c();
                    }
                    C2926q.C2927a aVar2 = new C2926q.C2927a(c2);
                    aVar2.f10041b = oVar;
                    aVar2.f10040a = inneractiveAdRequest2;
                    aVar2.f10043d = jSONArray;
                    aVar2.mo13716a("video_timeout_in_msecs", String.valueOf(InAppMessageBase.INAPP_MESSAGE_DURATION_DEFAULT_MILLIS)).mo13717a((String) null);
                }
                L l = this.f12962g;
                if (l != null) {
                    ((C3764d.C3770f) l).mo13912a((InneractiveUnitController.AdDisplayError) new MraidVideoFailedToDisplayError("an MRAID video has not started playing in a timely fashion"));
                }
            }
            return true;
        }
    }
}
