package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.C2618a;
import com.fyber.inneractive.sdk.config.C2671j;
import com.fyber.inneractive.sdk.config.C2684r;
import com.fyber.inneractive.sdk.config.C2701x;
import com.fyber.inneractive.sdk.config.C2702y;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C2666s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.C2780m;
import com.fyber.inneractive.sdk.interfaces.C2809a;
import com.fyber.inneractive.sdk.metrics.C2828b;
import com.fyber.inneractive.sdk.metrics.C2830c;
import com.fyber.inneractive.sdk.network.C2917n;
import com.fyber.inneractive.sdk.response.C3648e;
import com.fyber.inneractive.sdk.util.C3714n;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.TimeUnit;

/* renamed from: com.fyber.inneractive.sdk.flow.e */
public abstract class C2765e implements C2917n.C2920c, C2809a.C2810a {

    /* renamed from: a */
    public final Runnable f9554a = new C2766a();

    /* renamed from: b */
    public long f9555b = 0;

    /* renamed from: c */
    public C2809a f9556c;

    /* renamed from: d */
    public C2767b f9557d;

    /* renamed from: e */
    public InneractiveAdRequest f9558e;

    /* renamed from: f */
    public C2666s f9559f;

    /* renamed from: g */
    public C2917n f9560g;

    /* renamed from: com.fyber.inneractive.sdk.flow.e$a */
    public class C2766a implements Runnable {
        public C2766a() {
        }

        public void run() {
            C2765e.this.mo13524e();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.flow.e$b */
    public interface C2767b {
    }

    /* renamed from: a */
    public void mo13528a(InneractiveAdRequest inneractiveAdRequest, C3648e eVar, InneractiveErrorCode inneractiveErrorCode) {
        mo13530b();
        if (IAlog.f12814a <= 3) {
            Thread.dumpStack();
        }
        IAlog.m9905d("%sgot onAdRequestFailed! with: %s", mo13523d(), inneractiveErrorCode);
        if (this.f9557d != null) {
            InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(inneractiveErrorCode);
            if (!(eVar == null || eVar.f12751i == null)) {
                inneractiveInfrastructureError.setCause(new Exception(eVar.f12751i + ": " + eVar.f12752j));
            }
            ((C2784n) this.f9557d).mo13567a(inneractiveAdRequest, eVar, inneractiveInfrastructureError);
        }
    }

    /* renamed from: b */
    public void mo13530b() {
        if (this.f9555b > 0) {
            IAlog.m9902a("%scancel in flight timeout after %d millis", mo13523d(), Long.valueOf(System.currentTimeMillis() - this.f9555b));
            C3714n.f12902b.removeCallbacks(this.f9554a);
            this.f9555b = 0;
        }
    }

    /* renamed from: c */
    public C3648e mo13531c() {
        Content content;
        C2809a aVar = this.f9556c;
        if (aVar == null || (content = ((C2763c) aVar).f9549c) == null) {
            return null;
        }
        return content.mo13293c();
    }

    /* renamed from: d */
    public String mo13523d() {
        return IAlog.m9899a((Object) this);
    }

    /* renamed from: e */
    public void mo13524e() {
        IAlog.m9902a("%sin flight timeout reached after %d millis", mo13523d(), Long.valueOf(System.currentTimeMillis() - this.f9555b));
        C2809a aVar = this.f9556c;
        if (aVar != null) {
            aVar.mo13515a();
            this.f9556c = null;
        }
    }

    /* renamed from: f */
    public void mo13532f() {
        int i;
        C2701x a;
        mo13530b();
        InneractiveAdRequest inneractiveAdRequest = this.f9558e;
        if (inneractiveAdRequest instanceof C2761a0) {
            inneractiveAdRequest.getClass();
        }
        UnitDisplayType unitDisplayType = null;
        InneractiveAdRequest inneractiveAdRequest2 = this.f9558e;
        if (!(inneractiveAdRequest2 == null || (a = C2618a.m6639a(inneractiveAdRequest2.getSpotId())) == null)) {
            for (C2702y yVar : a.f9420a) {
                C2684r rVar = yVar.f9424c;
                if (rVar != null) {
                    unitDisplayType = rVar.f9368b;
                }
            }
        }
        C2671j jVar = IAConfigManager.f9202J.f9235w;
        jVar.getClass();
        if (unitDisplayType == UnitDisplayType.BANNER) {
            i = jVar.f9342a.f9337b.mo13271a("in_flight_banner_timeout_sec", 10, 3);
        } else {
            i = jVar.f9342a.f9337b.mo13271a("in_flight_interstitial_timeout_sec", 25, 3);
        }
        C3714n.f12902b.postDelayed(this.f9554a, TimeUnit.SECONDS.toMillis((long) i));
        this.f9555b = System.currentTimeMillis();
        IAlog.m9902a("%sstart in flight timeout", mo13523d());
    }

    /* renamed from: a */
    public void mo13527a() {
        T t;
        C2806x xVar;
        mo13530b();
        IAlog.m9905d("%sgot onAdLoaded!", mo13523d());
        C2809a aVar = this.f9556c;
        if (aVar != null) {
            C2767b bVar = this.f9557d;
            if (bVar != null) {
                InneractiveAdRequest inneractiveAdRequest = this.f9558e;
                Content content = ((C2763c) aVar).f9549c;
                C2784n nVar = (C2784n) bVar;
                C2780m mVar = nVar.f9625a;
                if (mVar.f9618j || (xVar = mVar.f9614f) == null || !xVar.supportsRefresh()) {
                    boolean unused = nVar.f9625a.f9618j = false;
                    C2780m mVar2 = nVar.f9625a;
                    mVar2.f9613e = content;
                    content.f9590a = inneractiveAdRequest;
                    if (!mVar2.mo13564d()) {
                        C2780m mVar3 = nVar.f9625a;
                        mVar3.getClass();
                        IAlog.m9902a("%sCannot find appropriate unit controller for unit: %s", IAlog.m9899a((Object) mVar3), nVar.f9625a.f9613e.f9593d);
                        C2764d dVar = nVar.f9625a.f9616h;
                        C3648e c = dVar != null ? dVar.mo13531c() : null;
                        InneractiveErrorCode inneractiveErrorCode = InneractiveErrorCode.INVALID_INPUT;
                        StringBuilder k = C13555b.m33972k("Cannot find appropriate unit controller for unit: ");
                        k.append(nVar.f9625a.f9613e.f9593d);
                        nVar.mo13567a(inneractiveAdRequest, c, new InneractiveInfrastructureError(inneractiveErrorCode, new Exception(k.toString())));
                        nVar.f9625a.f9613e = null;
                    } else {
                        C2780m mVar4 = nVar.f9625a;
                        InneractiveAdSpot.RequestListener requestListener = mVar4.f9610b;
                        if (requestListener != null) {
                            requestListener.onInneractiveSuccessfulAdRequest(mVar4);
                        }
                    }
                } else if (nVar.f9625a.f9614f.canRefreshAd()) {
                    C2780m mVar5 = nVar.f9625a;
                    mVar5.f9613e = content;
                    content.f9590a = inneractiveAdRequest;
                    C2780m.C2783c cVar = mVar5.f9617i;
                    if (cVar != null) {
                        cVar.onAdRefreshed(mVar5);
                    } else {
                        C2806x xVar2 = mVar5.f9614f;
                        if (xVar2 instanceof InneractiveAdViewUnitController) {
                            ((InneractiveAdViewUnitController) xVar2).onAdRefreshed(mVar5);
                        }
                    }
                } else {
                    C2780m mVar6 = nVar.f9625a;
                    mVar6.getClass();
                    IAlog.m9902a("%sad loaded successfully, but the selected unit controller has rejected the refresh!", IAlog.m9899a((Object) mVar6));
                    C2780m mVar7 = nVar.f9625a;
                    mVar7.f9617i.onAdRefreshFailed(mVar7, InneractiveErrorCode.CANCELLED);
                }
                String str = nVar.f9625a.f9609a;
                C2830c cVar2 = C2830c.f9722c;
                cVar2.mo13620a(str).mo13625e();
                cVar2.mo13620a(str).mo13622b();
                C2780m mVar8 = nVar.f9625a;
                C2776j jVar = mVar8.f9613e;
                if (!(jVar == null || (t = jVar.f9591b) == null || t.f12756n == null)) {
                    C2776j jVar2 = mVar8.f9613e;
                    T t2 = jVar2.f9591b;
                    new C2828b(t2, mVar8.f9611c, mVar8.f9609a, t2.f12756n, jVar2.f9592c.mo13268c()).mo13618a();
                }
            }
            this.f9556c = null;
        }
    }

    /* renamed from: a */
    public void mo13529a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        mo13530b();
        IAlog.m9905d("%sgot onFailedLoading! with: %s", mo13523d(), inneractiveInfrastructureError);
        C2767b bVar = this.f9557d;
        if (bVar != null) {
            ((C2784n) bVar).mo13567a(this.f9558e, mo13531c(), inneractiveInfrastructureError);
        }
    }
}
