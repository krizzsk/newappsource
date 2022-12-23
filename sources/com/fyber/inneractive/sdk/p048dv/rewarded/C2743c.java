package com.fyber.inneractive.sdk.p048dv.rewarded;

import android.app.Activity;
import com.fyber.inneractive.sdk.C2527a;
import com.fyber.inneractive.sdk.cache.session.enums.C2607a;
import com.fyber.inneractive.sdk.cache.session.enums.C2608b;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.C2776j;
import com.fyber.inneractive.sdk.flow.C2790s;
import com.fyber.inneractive.sdk.interfaces.C2812c;
import com.fyber.inneractive.sdk.p048dv.C2720f;
import com.fyber.inneractive.sdk.p048dv.interstitial.C2728a;
import com.fyber.inneractive.sdk.response.C3648e;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.dv.rewarded.c */
public class C2743c extends C2790s implements C2728a {

    /* renamed from: w */
    public C2812c.C2814b f9474w;

    /* renamed from: x */
    public boolean f9475x = false;

    /* renamed from: E */
    public boolean mo13345E() {
        return false;
    }

    /* renamed from: G */
    public int mo13346G() {
        return 0;
    }

    /* renamed from: H */
    public int mo13347H() {
        return 0;
    }

    /* renamed from: I */
    public long mo13348I() {
        return 0;
    }

    /* renamed from: J */
    public boolean mo13349J() {
        return false;
    }

    /* renamed from: a */
    public long mo13350a(long j) {
        return 0;
    }

    /* renamed from: a */
    public void mo13351a(C2812c.C2813a aVar, Activity activity) throws InneractiveUnitController.AdDisplayError {
        super.mo13351a(aVar, activity);
        if (activity != null) {
            AdContent adcontent = this.f9598b;
            if (adcontent != null) {
                C2527a aVar2 = (C2527a) adcontent;
                if (aVar2.f9433i != null) {
                    aVar2.mo12757a(this, activity);
                    return;
                }
            }
            IAlog.m9906e("%sad content is null aborting", IAlog.m9899a((Object) this));
            throw new InneractiveUnitController.AdDisplayError("Ad content is null");
        }
        IAlog.m9906e("%sYou must pass activity in order to show rewarded", IAlog.m9899a((Object) this));
        throw new InneractiveUnitController.AdDisplayError("No activity context");
    }

    /* renamed from: b */
    public void mo13353b() {
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo13354b(C2776j jVar) {
        C2527a aVar = (C2527a) jVar;
        return false;
    }

    /* renamed from: d */
    public void mo13334d() {
        AdContent adcontent = this.f9598b;
        if (adcontent != null) {
            T t = ((C2527a) adcontent).f9591b;
            if (((C2720f) t) != null) {
                mo13551a((C3648e) (C2720f) t);
            }
        }
        mo13549a(C2607a.CLICK, C2608b.REWARDED_VIDEO);
        mo13558z();
    }

    /* renamed from: i */
    public void mo13335i() {
        EventsListener eventslistener;
        if (!this.f9475x && (eventslistener = this.f9599c) != null) {
            this.f9475x = true;
            ((InneractiveFullscreenAdEventsListener) eventslistener).onAdDismissed(this.f9597a);
        }
    }

    /* renamed from: m */
    public void mo13355m() {
    }

    public void onReward() {
        C2812c.C2814b bVar = this.f9474w;
        if (bVar != null) {
            ((InneractiveFullscreenUnitController.C2748a) bVar).mo13474a();
            mo13547D();
        }
        mo13549a(C2607a.COMPLETION, C2608b.REWARDED_VIDEO);
    }

    /* renamed from: u */
    public boolean mo13356u() {
        return false;
    }

    /* renamed from: v */
    public void mo13337v() {
        AdContent adcontent = this.f9598b;
        if (adcontent != null) {
            mo13553b((C3648e) (C2720f) ((C2527a) adcontent).f9591b);
        }
        mo13549a(C2607a.IMPRESSION, C2608b.REWARDED_VIDEO);
        mo13544A();
    }

    /* renamed from: a */
    public void mo13352a(C2812c.C2814b bVar) {
        this.f9474w = bVar;
    }
}
