package com.fyber.inneractive.sdk.player;

import android.view.View;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C2666s;
import com.fyber.inneractive.sdk.config.global.features.C2649j;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveError;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.external.InneractiveVideoError;
import com.fyber.inneractive.sdk.flow.C2769g;
import com.fyber.inneractive.sdk.flow.C2775i;
import com.fyber.inneractive.sdk.flow.C2807y;
import com.fyber.inneractive.sdk.model.vast.C2835b;
import com.fyber.inneractive.sdk.model.vast.C2846m;
import com.fyber.inneractive.sdk.model.vast.C2850q;
import com.fyber.inneractive.sdk.network.C2909j0;
import com.fyber.inneractive.sdk.network.C2922o;
import com.fyber.inneractive.sdk.network.C2926q;
import com.fyber.inneractive.sdk.p051ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.player.C2945a;
import com.fyber.inneractive.sdk.player.controller.C2990c;
import com.fyber.inneractive.sdk.player.controller.C2997g;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.response.C3650g;
import com.fyber.inneractive.sdk.util.C3705k;
import com.fyber.inneractive.sdk.util.C3714n;
import com.fyber.inneractive.sdk.util.C3722q;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C3762c;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.player.i */
public class C3430i implements C3429h {

    /* renamed from: a */
    public C2945a f12247a;

    /* renamed from: b */
    public InneractiveAdRequest f12248b;

    /* renamed from: c */
    public C3650g f12249c;

    /* renamed from: d */
    public C3432b f12250d;

    /* renamed from: e */
    public C2846m f12251e;

    /* renamed from: f */
    public C2945a.C2946a f12252f;

    /* renamed from: g */
    public boolean f12253g = false;

    /* renamed from: h */
    public C2666s f12254h;

    /* renamed from: com.fyber.inneractive.sdk.player.i$a */
    public static /* synthetic */ class C3431a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12255a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.fyber.inneractive.sdk.external.InneractiveVideoError$Error[] r0 = com.fyber.inneractive.sdk.external.InneractiveVideoError.Error.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12255a = r0
                com.fyber.inneractive.sdk.external.InneractiveVideoError$Error r1 = com.fyber.inneractive.sdk.external.InneractiveVideoError.Error.ERROR_NO_MEDIA_FILES     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12255a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fyber.inneractive.sdk.external.InneractiveVideoError$Error r1 = com.fyber.inneractive.sdk.external.InneractiveVideoError.Error.ERROR_FAILED_PLAYING_MEDIA_FILE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12255a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fyber.inneractive.sdk.external.InneractiveVideoError$Error r1 = com.fyber.inneractive.sdk.external.InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f12255a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fyber.inneractive.sdk.external.InneractiveVideoError$Error r1 = com.fyber.inneractive.sdk.external.InneractiveVideoError.Error.ERROR_PRE_BUFFER_TIMEOUT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f12255a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.fyber.inneractive.sdk.external.InneractiveVideoError$Error r1 = com.fyber.inneractive.sdk.external.InneractiveVideoError.Error.ERROR_BUFFER_TIMEOUT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.C3430i.C3431a.<clinit>():void");
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.i$b */
    public interface C3432b {
    }

    public C3430i(C3650g gVar, InneractiveAdRequest inneractiveAdRequest, C2807y yVar, C3432b bVar) {
        this.f12248b = inneractiveAdRequest;
        this.f12249c = gVar;
        this.f12250d = bVar;
        this.f12254h = yVar.mo13542b();
        this.f12247a = new C2945a(yVar);
    }

    /* renamed from: a */
    public final C2922o mo14625a(InneractiveVideoError.Error error) {
        int i = C3431a.f12255a[error.ordinal()];
        if (i == 1) {
            return C2922o.VAST_ERROR_NO_MEDIA_FILES;
        }
        if (i == 2) {
            return C2922o.VAST_ERROR_FAILED_PLAYING_MEDIA_FILE;
        }
        if (i == 3) {
            return C2922o.VAST_ERROR_FAILED_PLAYING_ALL_MEDIA_FILES;
        }
        if (i == 4) {
            return C2922o.VAST_ERROR_PRE_BUFFER_TIMEOUT;
        }
        if (i == 5) {
            return C2922o.VAST_ERROR_BUFFER_TIMEOUT;
        }
        StringBuilder k = C13555b.m33972k("IAReportError, Does not know player error ");
        k.append(error.getErrorString());
        IAlog.m9902a(k.toString(), new Object[0]);
        return C2922o.VAST_UNKNOWN_PLAYER_ERROR;
    }

    /* renamed from: b */
    public final void mo14629b() {
        C2922o a = mo14625a(new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES).getPlayerError());
        InneractiveAdRequest inneractiveAdRequest = this.f12248b;
        C3650g gVar = this.f12249c;
        JSONArray c = this.f12254h.mo13268c();
        C2926q.C2927a aVar = new C2926q.C2927a(gVar);
        aVar.f10041b = a;
        aVar.f10040a = inneractiveAdRequest;
        aVar.f10043d = c;
        aVar.mo13717a((String) null);
    }

    /* renamed from: c */
    public C2945a.C2946a mo14630c() {
        return this.f12252f;
    }

    /* renamed from: d */
    public final void mo14631d() {
        Class cls = C2649j.class;
        C2945a.C2946a aVar = this.f12252f;
        if (aVar != null) {
            C2846m mVar = this.f12251e;
            C3423f fVar = (C3423f) aVar;
            fVar.f10101t = this;
            if (mVar != null) {
                String str = mVar.f9794g;
                fVar.f10103v = mVar;
                fVar.f10100s++;
                fVar.f10096o = false;
                fVar.f10098q = false;
                fVar.f10084c = str;
                IAlog.m9902a("IAMediaPlayerFlowManager: playNextMediaFile - loading video url: %s", str);
                C3722q qVar = fVar.f10094m;
                if (qVar != null) {
                    qVar.cancel(true);
                    qVar.f12911b = null;
                    fVar.f10095n = null;
                }
                if (fVar.f10095n == null) {
                    fVar.f10095n = new C3021d(fVar);
                }
                IAlog.m9902a("IAMediaPlayerFlowManager: start - start fetching video frame", new Object[0]);
                if (!fVar.f10083b.mo13810a()) {
                    C3722q qVar2 = new C3722q(fVar.f10082a, fVar.f10095n, fVar.f10084c, (String) null, 81920);
                    fVar.f10094m = qVar2;
                    qVar2.executeOnExecutor(C3714n.f12901a, new Void[0]);
                }
                if (!fVar.f10097p) {
                    fVar.f10083b.mo13808a(str, fVar.f10102u);
                }
                int i = 10;
                if (C3705k.m9951m()) {
                    C2666s sVar = fVar.f10085d;
                    int a = IAConfigManager.f9202J.f9234v.f9337b.mo13271a("VASTLoadTimeoutWiFi", 10, 1);
                    if (sVar != null) {
                        Integer b = ((C2649j) sVar.mo13264a(cls)).mo13240b("load_timeout_wifi");
                        if (b != null) {
                            i = b.intValue();
                        }
                    } else {
                        i = a;
                    }
                } else {
                    C2666s sVar2 = fVar.f10085d;
                    i = IAConfigManager.f9202J.f9234v.f9337b.mo13271a("VASTLoadTimeout3G", 30, 1);
                    if (sVar2 != null) {
                        Integer b2 = ((C2649j) sVar2.mo13264a(cls)).mo13240b("load_timeout_3g");
                        if (b2 != null) {
                            i = b2.intValue();
                        } else {
                            i = 30;
                        }
                    }
                }
                fVar.mo13737a((long) (i * 1000));
                fVar.f12238B.mo13534a();
                return;
            }
            return;
        }
        C3432b bVar = this.f12250d;
        InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR);
        C2775i iVar = (C2775i) bVar;
        iVar.mo13517a((InneractiveError) inneractiveInfrastructureError);
        iVar.mo13518a(inneractiveInfrastructureError);
    }

    /* renamed from: e */
    public final void mo14632e() {
        try {
            this.f12252f = this.f12247a.mo13735a();
        } catch (Throwable th) {
            C3432b bVar = this.f12250d;
            InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, th);
            C2775i iVar = (C2775i) bVar;
            iVar.mo13517a((InneractiveError) inneractiveInfrastructureError);
            iVar.mo13518a(inneractiveInfrastructureError);
        }
    }

    /* renamed from: a */
    public void mo14626a() {
        C2990c cVar;
        IAmraidWebViewController iAmraidWebViewController;
        C2945a.C2946a aVar = this.f12247a.f10079b;
        if (aVar != null) {
            C3423f fVar = (C3423f) aVar;
            fVar.f10097p = true;
            IAlog.m9902a("IAMediaPlayerFlowManager: destroy", new Object[0]);
            View c = fVar.mo13745c();
            if (c != null && (c instanceof C3762c)) {
                ((C3762c) c).destroy();
            }
            C3722q qVar = fVar.f10094m;
            if (qVar != null) {
                qVar.cancel(true);
                qVar.f12911b = null;
                fVar.f10095n = null;
            }
            fVar.mo13736a();
            C2997g gVar = fVar.f10083b;
            if (gVar != null) {
                gVar.mo13811b();
                fVar.f10083b = null;
            }
            fVar.f10093l = null;
            fVar.f10101t = null;
            Runnable runnable = fVar.f10086e;
            if (runnable != null) {
                C3714n.f12902b.removeCallbacks(runnable);
            }
            C2769g gVar2 = fVar.f12238B;
            if (gVar2 != null) {
                gVar2.f9569f = false;
                View view = gVar2.f9570g;
                if (!(view == null || !(view instanceof C3762c) || (cVar = gVar2.f9572i) == null || (iAmraidWebViewController = cVar.f10223a) == null)) {
                    iAmraidWebViewController.mo15325l();
                    cVar.f10223a = null;
                }
                C2909j0 j0Var = gVar2.f9574k;
                if (j0Var != null) {
                    j0Var.f9900a = true;
                }
                gVar2.f9572i = null;
            }
            fVar.f12238B = null;
        }
    }

    /* renamed from: a */
    public void mo14627a(InneractiveVideoError inneractiveVideoError, InneractiveErrorCode inneractiveErrorCode, JSONObject jSONObject, boolean z) {
        C2835b bVar;
        C2922o a = mo14625a(inneractiveVideoError.getPlayerError());
        InneractiveAdRequest inneractiveAdRequest = this.f12248b;
        C3650g gVar = this.f12249c;
        JSONArray c = this.f12254h.mo13268c();
        C2926q.C2927a aVar = new C2926q.C2927a(gVar);
        aVar.f10041b = a;
        aVar.f10040a = inneractiveAdRequest;
        aVar.f10043d = c;
        if (jSONObject != null) {
            try {
                aVar.f10045f.put(new JSONObject(jSONObject.toString()));
            } catch (Exception unused) {
            }
        }
        aVar.mo13717a((String) null);
        IAlog.m9902a("got onMediaPlayerLoadError with: " + inneractiveVideoError.getPlayerError(), new Object[0]);
        InneractiveErrorCode inneractiveErrorCode2 = z ? InneractiveErrorCode.LOAD_TIMEOUT : null;
        StringBuilder k = C13555b.m33972k("got onMediaPlayerLoadError with: ");
        k.append(inneractiveVideoError.description());
        IAlog.m9902a(k.toString(), new Object[0]);
        if (inneractiveVideoError.getPlayerError().isFatal()) {
            inneractiveErrorCode2 = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
        }
        if (inneractiveErrorCode2 == null) {
            inneractiveErrorCode2 = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
        }
        if (InneractiveErrorCode.NON_SECURE_CONTENT_DETECTED == null) {
            C2922o oVar = C2922o.VPAID_ERROR_UNSECURE_CONTENT;
            InneractiveAdRequest inneractiveAdRequest2 = this.f12248b;
            C3650g gVar2 = this.f12249c;
            JSONArray c2 = this.f12254h.mo13268c();
            C2926q.C2927a aVar2 = new C2926q.C2927a(gVar2);
            aVar2.f10041b = oVar;
            aVar2.f10040a = inneractiveAdRequest2;
            aVar2.f10043d = c2;
            aVar2.mo13717a((String) null);
        }
        this.f12251e = null;
        C3650g gVar3 = this.f12249c;
        if (!(gVar3 == null || (bVar = gVar3.f12771C) == null)) {
            this.f12251e = bVar.f9740d.poll();
        }
        if (this.f12251e == null) {
            mo14629b();
            C3432b bVar2 = this.f12250d;
            if (bVar2 != null) {
                InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(inneractiveErrorCode2, inneractiveVideoError.getCause());
                C2775i iVar = (C2775i) bVar2;
                iVar.mo13517a((InneractiveError) inneractiveInfrastructureError);
                iVar.mo13518a(inneractiveInfrastructureError);
                mo14626a();
            }
        } else if (!this.f12253g) {
            mo14632e();
            mo14631d();
        }
    }

    /* renamed from: a */
    public void mo14628a(String str, String... strArr) {
        C2945a.C2946a aVar = this.f12252f;
        if (aVar != null) {
            C3423f fVar = (C3423f) aVar;
            if ("TRACKING_COMPLETED".equalsIgnoreCase(str)) {
                fVar.f12242z = true;
            } else if ("EVENT_TRACKING".equalsIgnoreCase(str)) {
                for (String a : strArr) {
                    fVar.mo13740a(fVar.f12240x, VideoClickOrigin.InvalidOrigin, C2850q.m7073a(a));
                }
            }
        }
    }
}
