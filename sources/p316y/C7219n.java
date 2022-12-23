package p316y;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.hardware.camera2.CameraCaptureSession;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.appboy.Appboy;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.audio.C3876a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.perf.p414v1.C14507b;
import com.google.firebase.perf.util.Timer;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.wondo.tickets.model.WondoOffer;
import com.moovit.app.wondo.tickets.offers.WondoOfferDetailsActivity;
import com.moovit.network.model.ServerId;
import com.moovit.web.WebViewActivity;
import com.tranzmate.R;
import java.util.HashMap;
import kc0.C12844i;
import lc0.C12860c;
import mc0.C12912d;
import mf0.C24362h;
import p032c0.C1753c;
import p040c8.C1806d;
import p099ga.C4887g0;
import p099ga.C4943v0;
import p137ja.C5413d;
import p262t8.C6606a;
import p277ub.C6774a0;
import p277ub.C6776b0;
import p277ub.C6798p;
import p290vb.C6953n;
import p316y.C7208f;
import p453dw.C16738n;
import p453dw.C16741p;
import p543hq.C17474b;
import p626lf.C18200a;
import p687nt.C18589b;
import p744qf.C19118e;
import p910xf.C20488n;
import p934yf.C20714a;
import yb0.C13295d;

/* renamed from: y.n */
public final /* synthetic */ class C7219n implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f22367b;

    /* renamed from: c */
    public final /* synthetic */ Object f22368c;

    /* renamed from: d */
    public final /* synthetic */ Object f22369d;

    public /* synthetic */ C7219n(int i, Object obj, Object obj2) {
        this.f22367b = i;
        this.f22368c = obj;
        this.f22369d = obj2;
    }

    public final void run() {
        int i;
        switch (this.f22367b) {
            case 0:
                ((C7208f.C7211c) this.f22368c).f22336a.onConfigureFailed((CameraCaptureSession) this.f22369d);
                return;
            case 1:
                ((C1753c) this.f22368c).mo6513b((CallbackToFutureAdapter.C0673a) this.f22369d);
                return;
            case 2:
                ((Appboy) this.f22368c).m5384a((Intent) this.f22369d);
                return;
            case 3:
                ((Appboy) this.f22368c).m5407c((String) this.f22369d);
                return;
            case 4:
                View view = (View) this.f22368c;
                C1806d dVar = (C1806d) this.f22369d;
                HashMap hashMap = C1806d.f6298f;
                if (!C6606a.m15601b(C1806d.class)) {
                    try {
                        C24362h.m61211f(view, "$view");
                        C24362h.m61211f(dVar, "this$0");
                        if (view instanceof EditText) {
                            dVar.mo6620b(view);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        C6606a.m15600a(C1806d.class, th);
                        return;
                    }
                } else {
                    return;
                }
            case 5:
                C4943v0 v0Var = (C4943v0) this.f22369d;
                ((C4887g0) this.f22368c).getClass();
                try {
                    synchronized (v0Var) {
                    }
                    v0Var.f16714a.mo15819j(v0Var.f16717d, v0Var.f16718e);
                    v0Var.mo20612b(true);
                    return;
                } catch (ExoPlaybackException e) {
                    C6776b0.m15968a("Unexpected error delivering message on external thread.", e);
                    throw new RuntimeException(e);
                } catch (Throwable th2) {
                    v0Var.mo20612b(true);
                    throw th2;
                }
            case 6:
                C3876a aVar = ((C3876a.C3877a) this.f22368c).f13480b;
                int i2 = C6774a0.f20959a;
                aVar.mo15873a0((Exception) this.f22369d);
                return;
            case 7:
                C6798p pVar = (C6798p) this.f22368c;
                C6798p.C6799a aVar2 = (C6798p.C6799a) this.f22369d;
                synchronized (pVar.f21030c) {
                    i = pVar.f21031d;
                }
                aVar2.mo22833a(i);
                return;
            case 8:
                C6953n nVar = ((C6953n.C6954a) this.f22368c).f21703b;
                int i3 = C6774a0.f20959a;
                nVar.mo20424q((C5413d) this.f22369d);
                return;
            case 9:
                ((FirebaseMessaging) this.f22368c).lambda$deleteToken$5((TaskCompletionSource) this.f22369d);
                return;
            case 10:
                C19118e eVar = (C19118e) this.f22368c;
                C18200a aVar3 = C19118e.f48601f;
                C14507b b = eVar.mo51552b((Timer) this.f22369d);
                if (b != null) {
                    eVar.f48603b.add(b);
                    return;
                }
                return;
            case 11:
                C20488n nVar2 = (C20488n) this.f22368c;
                Object obj = this.f22369d;
                nVar2.getClass();
                Preconditions.checkNotNull(obj);
                synchronized (nVar2.f51878c.f51857a) {
                    nVar2.f51877b.remove(obj);
                    nVar2.f51876a.remove(obj);
                    C20714a.f52305c.mo52860a(obj);
                }
                return;
            case 12:
                C18589b bVar = (C18589b) this.f22368c;
                ColorStateList colorStateList = (ColorStateList) this.f22369d;
                bVar.f47327l.getTitleView().setTextColor(colorStateList);
                bVar.f47325j.getTitleView().setTextColor(colorStateList);
                bVar.f47326k.getTitleView().setTextColor(colorStateList);
                return;
            case 13:
                C16738n nVar3 = (C16738n) this.f22368c;
                int i4 = C16738n.f43588t;
                nVar3.getClass();
                String str = C16741p.f43600j;
                Bundle bundle = new Bundle();
                bundle.putParcelable("stopId", (ServerId) this.f22369d);
                C16741p pVar2 = new C16741p();
                pVar2.setArguments(bundle);
                pVar2.show(nVar3.getChildFragmentManager(), C16741p.f43600j);
                return;
            case 14:
                WondoOfferDetailsActivity wondoOfferDetailsActivity = (WondoOfferDetailsActivity) this.f22368c;
                int i5 = WondoOfferDetailsActivity.f40747Y;
                wondoOfferDetailsActivity.getClass();
                C17474b.C17475a aVar4 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar4.mo49939g(AnalyticsAttributeKey.TYPE, "wondo_offer_terms_clicked");
                wondoOfferDetailsActivity.mo44545v2(aVar4.mo49933a());
                wondoOfferDetailsActivity.startActivity(WebViewActivity.m18168y2(wondoOfferDetailsActivity, ((WondoOffer) this.f22369d).f40718e.f40728h.toString(), wondoOfferDetailsActivity.getString(R.string.wondo_offer_details_terms_and_conditions_title)));
                return;
            case 15:
                C12912d dVar2 = (C12912d) this.f22369d;
                C24362h.m61211f((C13295d) this.f22368c, "this$0");
                C24362h.m61211f(dVar2, "$bannerInfo");
                C13295d.m33443m0(dVar2);
                return;
            case 16:
                C12844i iVar = (C12844i) this.f22368c;
                String str2 = (String) this.f22369d;
                int i6 = C12844i.f31735I;
                C24362h.m61211f(iVar, "this$0");
                C24362h.m61211f(str2, "$playVideoContent");
                iVar.mo39681e(str2, false);
                return;
            default:
                String str3 = (String) this.f22368c;
                C12860c cVar = (C12860c) this.f22369d;
                int i7 = C12860c.f31801i;
                C24362h.m61211f(str3, "$script");
                C24362h.m61211f(cVar, "this$0");
                cVar.loadUrl(C24362h.m61216k(str3, "javascript:"));
                return;
        }
    }
}
