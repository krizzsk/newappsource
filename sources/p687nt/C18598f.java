package p687nt;

import android.content.Context;
import android.view.View;
import c70.C13756i;
import c70.C13776p;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.taxi.C15413a;
import com.moovit.app.taxi.providers.TaxiFabConfig;
import com.moovit.app.taxi.providers.TaxiProvider;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.map.MapFragment;
import com.moovit.map.MapOverlaysLayout;
import com.moovit.payment.account.model.PaymentAccount;
import java.util.Collections;
import p543hq.C17474b;
import p567iq.C17635b;
import p687nt.C18618p;
import p710os.C18827c;
import p831tw.C19787a;
import q00.C19047a;
import q00.C19053d;

/* renamed from: nt.f */
public final /* synthetic */ class C18598f implements MapFragment.C16237r {

    /* renamed from: a */
    public final /* synthetic */ C18604l f47362a;

    public /* synthetic */ C18598f(C18604l lVar) {
        this.f47362a = lVar;
    }

    /* renamed from: a */
    public final void mo21406a() {
        C19047a aVar;
        boolean z;
        C18604l lVar = this.f47362a;
        int i = C18604l.f47374T;
        if (lVar.f40822c != null && (aVar = lVar.f47403x) != null) {
            TaxiProvider taxiProvider = lVar.f47404y;
            if (taxiProvider != null && ((Boolean) aVar.mo51505b(C19053d.f48486y)).booleanValue()) {
                Context context = lVar.getContext();
                TaxiFabConfig taxiFabConfig = taxiProvider.f39979n;
                if (!(context == null || taxiFabConfig == null)) {
                    LatLonE6 j = LatLonE6.m40177j(lVar.mo46780O1());
                    if (!C18827c.f47938c.mo19759a(C18827c.m45824a(context).f47939a).booleanValue() || !C15413a.m39457b(context, taxiProvider, taxiFabConfig.f39940c, (PaymentAccount) null, j)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        if (lVar.f47388N == null) {
                            C19787a aVar2 = new C19787a(context, taxiProvider.f39967b, taxiFabConfig);
                            lVar.f47388N = aVar2;
                            aVar2.setOnClickListener(lVar.f47401v);
                            MapOverlaysLayout mapOverlaysLayout = lVar.mo50993X().f42386w;
                            C19787a aVar3 = lVar.f47388N;
                            mapOverlaysLayout.getClass();
                            mapOverlaysLayout.addView(aVar3, new MapOverlaysLayout.LayoutParams(8388693));
                        }
                    } else if (lVar.f47388N != null) {
                        lVar.mo50993X().f42386w.removeView(lVar.f47388N);
                        lVar.f47388N.setOnClickListener((View.OnClickListener) null);
                        lVar.f47388N = null;
                    }
                    if (lVar.f47388N != null) {
                        C17474b.C17475a aVar4 = new C17474b.C17475a(AnalyticsEventKey.TAXI_EXPOSED);
                        aVar4.mo49939g(AnalyticsAttributeKey.PROVIDER, taxiProvider.f39968c);
                        lVar.mo46797j2(aVar4.mo49933a());
                    }
                    C18595e eVar = lVar.f47383I;
                    eVar.f47357h = lVar.f47388N;
                    if (eVar.f47358i) {
                        eVar.mo50990b();
                    } else {
                        eVar.mo50989a();
                    }
                }
            }
            if (lVar.f47382H) {
                C18618p pVar = lVar.f47389O;
                if (pVar != null) {
                    pVar.cancel(false);
                    C13776p andSet = pVar.f47446r.getAndSet((Object) null);
                    if (andSet != null) {
                        andSet.cancel(false);
                    }
                    lVar.f47389O = null;
                }
                C18618p pVar2 = lVar.f47390P;
                if (pVar2 != null) {
                    pVar2.cancel(false);
                    C13776p andSet2 = pVar2.f47446r.getAndSet((Object) null);
                    if (andSet2 != null) {
                        andSet2.cancel(false);
                    }
                    lVar.f47390P = null;
                }
                MoovitAppActivity moovitAppActivity = (MoovitAppActivity) lVar.f40822c;
                if (moovitAppActivity != null && lVar.f47402w != null && lVar.f47403x != null && lVar.f47405z != null) {
                    MapFragment X = lVar.mo50993X();
                    MapFragment mapFragment = X;
                    C18618p pVar3 = new C18618p(lVar.f47402w, lVar.f47403x, (C13756i) moovitAppActivity.getSystemService("request_manager"), mapFragment, lVar.f47405z, lVar.f40822c.mo44551z1(), C17635b.m43779f(moovitAppActivity).f50174d, lVar);
                    pVar3.executeOnExecutor(lVar.f47391Q, new Object[]{null, new C18618p.C18623e(Collections.unmodifiableList(lVar.f47376B.f47331h), Collections.unmodifiableList(lVar.f47377C.f47331h)), X.f42368n.mo48784a(X.mo48621R2())});
                    lVar.f47389O = pVar3;
                    return;
                }
                return;
            }
            lVar.mo50996q2((Object) null);
        }
    }
}
