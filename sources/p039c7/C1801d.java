package p039c7;

import com.cubic.umo.p045ad.ext.types.UMOAdKitBannerAdEvent;
import com.cubic.umo.p045ad.ext.types.UMOAdKitError;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.C3876a;
import com.google.common.collect.ImmutableList;
import com.google.firebase.perf.p414v1.ApplicationProcessState;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.moovit.umo.ads.UmoAds;
import mf0.C24362h;
import p099ga.C4918n0;
import p099ga.C4936u0;
import p100gb.C4987o;
import p112ha.C5196m0;
import p137ja.C5414e;
import p277ub.C6774a0;

/* renamed from: c7.d */
public final /* synthetic */ class C1801d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f6287b;

    /* renamed from: c */
    public final /* synthetic */ Object f6288c;

    /* renamed from: d */
    public final /* synthetic */ Object f6289d;

    /* renamed from: e */
    public final /* synthetic */ Object f6290e;

    public /* synthetic */ C1801d(int i, Object obj, Object obj2, Object obj3) {
        this.f6287b = i;
        this.f6288c = obj;
        this.f6289d = obj2;
        this.f6290e = obj3;
    }

    public final void run() {
        switch (this.f6287b) {
            case 0:
                C1798a aVar = (C1798a) this.f6288c;
                UMOAdKitError uMOAdKitError = (UMOAdKitError) this.f6290e;
                C24362h.m61211f(aVar, "$it");
                C24362h.m61211f(uMOAdKitError, "$akError");
                ((UmoAds.C7867b) aVar).mo24509a(UMOAdKitBannerAdEvent.BANNER_ERROR, uMOAdKitError);
                return;
            case 1:
                C4987o.C4988a aVar2 = (C4987o.C4988a) this.f6290e;
                C5196m0 m0Var = ((C4918n0) this.f6288c).f16634c;
                ImmutableList c = ((ImmutableList.C14367a) this.f6289d).mo43129c();
                C5196m0.C5197a aVar3 = m0Var.f17273d;
                C4936u0 u0Var = m0Var.f17276g;
                u0Var.getClass();
                aVar3.getClass();
                aVar3.f17279b = ImmutableList.m35691z(c);
                if (!c.isEmpty()) {
                    aVar3.f17282e = (C4987o.C4988a) c.get(0);
                    aVar2.getClass();
                    aVar3.f17283f = aVar2;
                }
                if (aVar3.f17281d == null) {
                    aVar3.f17281d = C5196m0.C5197a.m13153b(u0Var, aVar3.f17279b, aVar3.f17282e, aVar3.f17278a);
                }
                aVar3.mo20920d(u0Var.mo20400s());
                return;
            case 2:
                C3876a.C3877a aVar4 = (C3876a.C3877a) this.f6288c;
                C3876a aVar5 = aVar4.f13480b;
                int i = C6774a0.f20959a;
                aVar5.mo15875e();
                aVar4.f13480b.mo15872W((Format) this.f6289d, (C5414e) this.f6290e);
                return;
            default:
                ((GaugeManager) this.f6288c).lambda$stopCollectingGauges$4((String) this.f6289d, (ApplicationProcessState) this.f6290e);
                return;
        }
    }
}
