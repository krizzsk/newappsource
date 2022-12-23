package p373au;

import a00.C13382a;
import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0206a;
import androidx.appcompat.widget.C0475w0;
import androidx.camera.camera2.internal.C0522m;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import c00.C13733n;
import c70.C13752e;
import com.android.billingclient.api.C1949f;
import com.android.billingclient.api.C1953i;
import com.appboy.p044ui.inappmessage.DefaultInAppMessageViewWrapper;
import com.cubic.umo.pass.model.AgencyInformation;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.home.dashboard.C14940f;
import com.moovit.app.itinerary.view.NextArrivalsView;
import com.moovit.app.subscription.MoovitSubscriptionsManager;
import com.moovit.app.wondo.tickets.model.WondoOffer;
import com.moovit.app.wondo.tickets.offers.WondoOfferDetailsActivity;
import com.moovit.design.view.NumericStepperView;
import com.moovit.itinerary.C16080a;
import com.moovit.itinerary.model.leg.WaitToTransitLineLeg;
import com.moovit.location.C16202a;
import com.moovit.location.LocationSettingsFixer;
import com.moovit.network.model.ServerId;
import com.moovit.payment.account.external.C25651a;
import com.moovit.payment.account.external.ExternalPaymentAccountHelper;
import com.moovit.payment.clearance.model.Bank;
import com.moovit.payment.clearance.tokenization.TokenizeStatusObserver;
import com.moovit.transit.Schedule;
import com.moovit.util.time.Time;
import com.tranzmate.R;
import com.veriff.sdk.camera.camera2.interop.Camera2CameraControl;
import com.veriff.sdk.camera.core.CameraX;
import com.veriff.sdk.camera.core.impl.CameraRepository;
import i30.C5268d;
import java.io.IOException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import l50.C18175e;
import m50.C18323a;
import m50.C18330f;
import p032c0.C1753c;
import p099ga.C4936u0;
import p242s1.C6391t;
import p242s1.C6396v0;
import p277ub.C6780f;
import p277ub.C6786k;
import p304x.C7045f0;
import p316y.C7219n;
import p484ff.C16973g0;
import p543hq.C17474b;
import p757qu.C19181d;
import p798sn.C19494b;
import p80.C12995d;
import p805su.C19550h;
import p810sz.C19617r;
import p910xf.C20482k;
import p910xf.C20485l;
import p910xf.C20488n;
import p977zz.C20936e0;
import p977zz.C20944i0;
import p977zz.C20949l;
import p977zz.C20960q0;
import p977zz.C20961r;
import p988j$.util.DesugarTimeZone;
import q00.C19047a;
import s80.C13065d;
import t60.C19630a;
import w90.C13222b;
import w90.C13227e;

/* renamed from: au.e */
public final /* synthetic */ class C13533e implements C13733n, Continuation, CallbackToFutureAdapter.C0674b, C6391t, C6786k.C6788b, SuccessContinuation, C20488n.C20489a, C0475w0.C0476a, NumericStepperView.C15863a, C1953i, C16202a.C16205c, C0206a, C20949l {

    /* renamed from: b */
    public final /* synthetic */ int f33453b;

    /* renamed from: c */
    public final /* synthetic */ Object f33454c;

    public /* synthetic */ C13533e(Object obj, int i) {
        this.f33453b = i;
        this.f33454c = obj;
    }

    /* renamed from: a */
    public void mo6655a(Object obj, C6780f fVar) {
        ((C4936u0.C4938b) obj).mo16437d0(new C4936u0.C4939c(fVar));
    }

    public Object attachCompleter(CallbackToFutureAdapter.C0673a aVar) {
        switch (this.f33453b) {
            case 0:
                ((C7045f0.C7053f) this.f33454c).f21938a.f22043j.mo23370a(aVar, true);
                return "TorchOn";
            case 2:
                C1753c cVar = (C1753c) this.f33454c;
                cVar.f6148d.execute(new C7219n(1, cVar, aVar));
                return "addCaptureRequestOptions";
            case 17:
                return ((Camera2CameraControl) this.f33454c).lambda$clearCaptureRequestOptions$6(aVar);
            case 18:
                return ((CameraX) this.f33454c).lambda$shutdownInternal$11(aVar);
            default:
                return ((CameraRepository) this.f33454c).lambda$deinit$0(aVar);
        }
    }

    /* renamed from: b */
    public void mo771b(Object obj) {
        ExternalPaymentAccountHelper externalPaymentAccountHelper;
        C25651a aVar = (C25651a) this.f33454c;
        ActivityResult activityResult = (ActivityResult) obj;
        int i = C25651a.f63987s;
        aVar.getClass();
        Intent intent = activityResult.f529c;
        if (activityResult.f528b == -1 && intent != null && (externalPaymentAccountHelper = aVar.f63991q) != null) {
            externalPaymentAccountHelper.mo44689R(aVar.requireContext());
        }
    }

    /* renamed from: c */
    public void mo9575c(C1949f fVar, List list) {
        C20960q0 q0Var = (C20960q0) this.f33454c;
        HashSet hashSet = MoovitSubscriptionsManager.f39757g;
        if (fVar.f6770a == 0) {
            q0Var.invoke(new C20961r(list));
            return;
        }
        StringBuilder k = C13555b.m33972k("Billing response code error: ");
        k.append(fVar.f6770a);
        q0Var.invoke(new C20961r((Exception) new IOException(k.toString())));
    }

    public Object convert(Object obj) {
        int i;
        switch (this.f33453b) {
            case 0:
                int i2 = NextArrivalsView.f38657g;
                return new C20944i0((WaitToTransitLineLeg) ((C20944i0) this.f33454c).f52692a, Schedule.m17783E((Time) obj));
            case 1:
                C19617r rVar = C16080a.f41870a;
                return ((C5268d) this.f33454c).mo21064c(new ServerId(((Integer) obj).intValue()));
            default:
                C19494b bVar = (C19494b) obj;
                ServerId serverId = C13065d.f32318d;
                Context context = ((C13752e) this.f33454c).f33852a;
                C19047a.C19048a aVar = C19047a.f48441d;
                C19047a aVar2 = (C19047a) context.getSystemService("user_configuration");
                if (aVar2 != null) {
                    i = C20936e0.m49036b(0, Integer.MAX_VALUE, ((Integer) aVar2.mo51505b(C12995d.f32167c)).intValue());
                } else {
                    i = Integer.MAX_VALUE;
                }
                long j = 0;
                if (i > 0 && i < Integer.MAX_VALUE) {
                    Calendar instance = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
                    instance.set(11, 0);
                    instance.set(12, 0);
                    instance.set(13, 0);
                    instance.set(14, 0);
                    instance.add(5, -i);
                    j = instance.getTimeInMillis();
                }
                return new C13065d.C13066a(bVar.f49585d, j);
        }
    }

    /* renamed from: d */
    public void mo40420d(C0522m mVar) {
        C13533e.super.mo2299i(mVar);
    }

    /* renamed from: e */
    public void mo19991e(Object obj, C20482k.C20483a aVar) {
        C20482k kVar = (C20482k) this.f33454c;
        HashMap<Integer, HashSet<Integer>> hashMap = C20482k.f51856j;
        kVar.getClass();
        C20485l.f51866c.mo52681a(kVar);
        ((OnFailureListener) obj).onFailure(aVar.mo52680a());
    }

    /* renamed from: g */
    public void mo19812g(NumericStepperView numericStepperView, int i) {
        C19550h hVar = (C19550h) this.f33454c;
        int i2 = C19550h.f49679y;
        hVar.mo51906q2();
        NumericStepperView numericStepperView2 = hVar.f49685s;
        C13382a.m33665a(numericStepperView2, numericStepperView2.getResources().getString(R.string.voiceover_passenger_total, new Object[]{Integer.valueOf(i)}));
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "tickets_counter_changed");
        aVar.mo49937e(AnalyticsAttributeKey.ID, hVar.f49688v.f39055b.f39016b);
        aVar.mo49937e(AnalyticsAttributeKey.ITEM_ID, hVar.f49688v.f39056c.f39013b.f39009b);
        aVar.mo49935c(AnalyticsAttributeKey.COUNT, i);
        hVar.mo46797j2(aVar.mo49933a());
    }

    /* renamed from: h */
    public void mo5770h(int i, Object obj) {
        ((LocationSettingsFixer) this.f33454c).mo48523d((MoovitActivity) obj, (C15682c<?>) null, i, true);
    }

    public boolean invoke(Object obj) {
        switch (this.f33453b) {
            case 13:
                int i = C18323a.f46730q;
                ((C18323a.C18325b) obj).mo50775h0((Bank) this.f33454c);
                return true;
            default:
                int i2 = C19630a.f49807u;
                ((C19630a.C19631a) obj).mo51846p0((List) this.f33454c);
                return true;
        }
    }

    public C6396v0 onApplyWindowInsets(View view, C6396v0 v0Var) {
        return DefaultInAppMessageViewWrapper.lambda$addInAppMessageViewToViewGroup$0((View) this.f33454c, view, v0Var);
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        C14940f fVar = (C14940f) this.f33454c;
        int i = C14940f.f38219G;
        fVar.getClass();
        if (menuItem.getItemId() == R.id.menu_edit) {
            fVar.mo45120u2(fVar.mo45116p2(fVar.f38235x));
            return true;
        } else if (menuItem.getItemId() != R.id.menu_reset) {
            return true;
        } else {
            fVar.mo45121v2(fVar.f38235x);
            return true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: s90.d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object then(com.google.android.gms.tasks.Task r4) {
        /*
            r3 = this;
            int r0 = r3.f33453b
            r1 = 0
            switch(r0) {
                case 0: goto L_0x0007;
                default: goto L_0x0006;
            }
        L_0x0006:
            goto L_0x0024
        L_0x0007:
            java.lang.Object r0 = r3.f33454c
            com.google.android.gms.tasks.TaskCompletionSource r0 = (com.google.android.gms.tasks.TaskCompletionSource) r0
            boolean r2 = r4.isSuccessful()
            if (r2 == 0) goto L_0x0019
            java.lang.Object r4 = r4.getResult()
            r0.trySetResult(r4)
            goto L_0x0023
        L_0x0019:
            java.lang.Exception r4 = r4.getException()
            java.util.Objects.requireNonNull(r4)
            r0.trySetException(r4)
        L_0x0023:
            return r1
        L_0x0024:
            java.lang.Object r0 = r3.f33454c
            p80.b r0 = (p80.C12991b) r0
            java.util.HashSet r2 = com.moovit.ticketing.wallet.UserWalletActivity.f23612m0
            boolean r2 = r4.isSuccessful()
            if (r2 == 0) goto L_0x0037
            java.lang.Object r4 = r4.getResult()
            r1 = r4
            s90.d r1 = (s90.C13076d) r1
        L_0x0037:
            java.util.HashSet r4 = com.moovit.ticketing.wallet.UserWalletActivity.f23612m0
            java.util.ArrayList r4 = m80.C12875k.m32663c(r0, r4, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p373au.C13533e.then(com.google.android.gms.tasks.Task):java.lang.Object");
    }

    public Task then(Object obj) {
        switch (this.f33453b) {
            case 5:
                return FirebaseMessaging.lambda$subscribeToTopic$7((String) this.f33454c, (C16973g0) obj);
            case 10:
                ServerId serverId = (ServerId) this.f33454c;
                WondoOffer wondoOffer = (WondoOffer) obj;
                int i = WondoOfferDetailsActivity.f40747Y;
                if (wondoOffer != null) {
                    return Tasks.forResult(wondoOffer);
                }
                throw new IllegalStateException("Unable to find offer with id: " + serverId);
            case 14:
                C18330f fVar = (C18330f) this.f33454c;
                C18175e eVar = (C18175e) obj;
                int i2 = C18330f.f46743w;
                fVar.getClass();
                fVar.f46744u = eVar.f46413m;
                String str = eVar.f46416p;
                fVar.f46745v = str;
                if (str != null) {
                    TokenizeStatusObserver.m41610a(fVar, fVar.mo46783R1(), fVar.f46745v, new C19181d(fVar, 3));
                }
                return Tasks.forResult(new C20944i0(eVar.f46414n, eVar.f46415o));
            default:
                C13222b bVar = (C13222b) this.f33454c;
                AgencyInformation agencyInformation = (AgencyInformation) obj;
                C13222b bVar2 = C13222b.f32795d;
                bVar.getClass();
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                bVar.f32798c.mo11672n(new C13227e(taskCompletionSource));
                return taskCompletionSource.getTask();
        }
    }
}
