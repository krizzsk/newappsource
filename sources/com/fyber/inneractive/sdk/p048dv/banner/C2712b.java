package com.fyber.inneractive.sdk.p048dv.banner;

import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.cache.session.enums.C2607a;
import com.fyber.inneractive.sdk.cache.session.enums.C2608b;
import com.fyber.inneractive.sdk.config.C2702y;
import com.fyber.inneractive.sdk.config.C2703z;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.flow.C2776j;
import com.fyber.inneractive.sdk.flow.C2778l;
import com.fyber.inneractive.sdk.interfaces.C2811b;
import com.fyber.inneractive.sdk.p048dv.C2707a;
import com.fyber.inneractive.sdk.p048dv.C2720f;
import com.fyber.inneractive.sdk.response.C3648e;
import com.fyber.inneractive.sdk.util.C3707l;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.gms.ads.AdView;

/* renamed from: com.fyber.inneractive.sdk.dv.banner.b */
public class C2712b extends C2778l<C2710a, InneractiveAdViewEventsListener> implements C2811b {

    /* renamed from: k */
    public ViewGroup f9440k;

    /* renamed from: a */
    public void mo13304a() {
    }

    /* renamed from: a */
    public void mo13305a(int i) {
    }

    /* renamed from: a */
    public void mo13306a(ViewGroup viewGroup) {
        AdContent adcontent;
        if (this.f9597a == null) {
            IAlog.m9906e("%sYou must set the spot to render before calling renderAd", IAlog.m9899a((Object) this));
        } else if (viewGroup != null && (adcontent = this.f9598b) != null) {
            C2710a aVar = (C2710a) adcontent;
            if (aVar.f9433i != null) {
                aVar.f9432h = this;
                if (aVar.f9436j) {
                    mo13315v();
                    aVar.f9436j = false;
                }
                this.f9440k = viewGroup;
                viewGroup.addView((View) ((C2710a) this.f9598b).f9433i);
            }
        }
    }

    public void destroy() {
        AdContent adcontent = this.f9598b;
        if (adcontent != null) {
            T t = ((C2710a) adcontent).f9433i;
            if (t != null) {
                ((AdView) t).destroy();
            }
            ((C2710a) this.f9598b).mo13291a();
        }
        ViewGroup viewGroup = this.f9440k;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f9440k = null;
        }
        super.destroy();
    }

    /* renamed from: f */
    public int mo13310f() {
        T t;
        AdContent adcontent = this.f9598b;
        if (adcontent == null || (t = ((C2710a) adcontent).f9433i) == null || ((AdView) t).getAdSize() == null) {
            return 0;
        }
        return C3707l.m9963b(((AdView) ((C2710a) this.f9598b).f9433i).getAdSize().getWidth());
    }

    /* renamed from: n */
    public void mo13311n() {
    }

    /* renamed from: p */
    public int mo13312p() {
        T t;
        AdContent adcontent = this.f9598b;
        if (adcontent == null || (t = ((C2710a) adcontent).f9433i) == null || ((AdView) t).getAdSize() == null) {
            return 0;
        }
        return C3707l.m9963b(((AdView) ((C2710a) this.f9598b).f9433i).getAdSize().getHeight());
    }

    /* renamed from: q */
    public void mo13313q() {
    }

    /* renamed from: t */
    public void mo13314t() {
        ViewGroup viewGroup = this.f9440k;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f9440k = null;
        }
    }

    /* renamed from: v */
    public void mo13315v() {
        C2608b bVar;
        mo13544A();
        AdContent adcontent = this.f9598b;
        if (adcontent != null) {
            T t = ((C2710a) adcontent).f9591b;
            if (((C2720f) t) != null) {
                mo13553b((C3648e) (C2720f) t);
                C2703z zVar = ((C2710a) this.f9598b).f9593d;
                if (zVar != null && ((C2702y) zVar).f9424c != null) {
                    C2607a aVar = C2607a.IMPRESSION;
                    if (((C2702y) zVar).f9424c.f9368b == UnitDisplayType.MRECT) {
                        bVar = C2608b.RECTANGLE_DISPLAY;
                    } else {
                        bVar = C2608b.BANNER_DISPLAY;
                    }
                    mo13549a(aVar, bVar);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo13308a(C2776j jVar) {
        return jVar instanceof C2707a;
    }

    /* renamed from: a */
    public boolean mo13307a(View view) {
        ViewGroup viewGroup = this.f9440k;
        return viewGroup != null && viewGroup.equals(view);
    }
}
