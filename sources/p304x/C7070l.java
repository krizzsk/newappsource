package p304x;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0206a;
import androidx.camera.camera2.internal.C0513g;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import c00.C13723g;
import c70.C13752e;
import com.android.billingclient.api.C1941b;
import com.appboy.p044ui.inappmessage.AppboyInAppMessageManager;
import com.appboy.p044ui.inappmessage.listeners.IWebViewClientStateListener;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.assetpacks.C14333w2;
import com.moovit.C15682c;
import com.moovit.MoovitApplication;
import com.moovit.MoovitExecutors;
import com.moovit.app.intro.onboarding.UserOnboardingActivity;
import com.moovit.app.linedetail.p416ui.C15101a;
import com.moovit.app.subscription.MoovitSubscriptionsManager;
import com.moovit.app.tod.TodRideActivity;
import com.moovit.barcode.Barcode;
import com.moovit.barcode.scan.BarcodeScannerFragment;
import com.moovit.design.dialog.AlertDialogFragment;
import com.moovit.design.view.TextPicker;
import com.moovit.location.C16202a;
import com.moovit.location.LocationSettingsFixer;
import com.moovit.micromobility.purchase.step.MicroMobilityPurchaseStepResult;
import com.moovit.payment.account.paymentmethod.C25692a;
import com.moovit.payment.clearance.CreditCardToken;
import com.moovit.payment.gateway.PaymentGatewayFragment;
import com.moovit.payment.gateway.PaymentGatewayToken;
import com.moovit.util.time.Time;
import com.moovit.view.p340cc.C7959a;
import com.moovit.view.p340cc.CreditCardPreview;
import com.tranzmate.R;
import com.veriff.sdk.internal.C22271pp;
import com.veriff.sdk.internal.C22274pq;
import f90.C12641c;
import i60.C17559a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l30.C5577i;
import l30.C5585p;
import m80.C12887v;
import mf0.C24362h;
import mobi.lab.veriff.data.C24424c;
import o20.C18709o;
import p054d0.C4305r;
import p066e0.C4436j0;
import p137ja.C5415f;
import p138jb.C5426c;
import p435de.C16591a;
import p435de.C16592b;
import p453dw.C16741p;
import p483fe.C16955c;
import p483fe.C16956d;
import p502fx.C17119d;
import p507ge.C17185a;
import p589jq.C17916h;
import p644lx.C18294i;
import p785ry.C19385e;
import p828tt.C19767h;
import p836ud.C19885a;
import p836ud.C19888b;
import p956ze.C20837a;
import p956ze.C20839b;
import p977zz.C20949l;
import q80.C13026o;
import r50.C19228d;
import r60.C19243h;
import r60.C19244i;
import t30.C6575o;
import z60.C20811b;

/* renamed from: x.l */
public final /* synthetic */ class C7070l implements CallbackToFutureAdapter.C0674b, C0513g.C0514a, IWebViewClientStateListener, C5415f.C5416a, C20837a.C20838a, C0206a, C20949l, SuccessContinuation, TextPicker.C15867a, C16202a.C16205c, SwipeRefreshLayout.C1274f, C22271pp.C22273b {

    /* renamed from: b */
    public final /* synthetic */ int f21983b;

    /* renamed from: c */
    public final /* synthetic */ Object f21984c;

    public /* synthetic */ C7070l(Object obj, int i) {
        this.f21983b = i;
        this.f21984c = obj;
    }

    /* renamed from: a */
    public final void mo20737a(C5415f fVar) {
        C5426c cVar = (C5426c) this.f21984c;
        C5426c.C5428b bVar = (C5426c.C5428b) fVar;
        cVar.getClass();
        bVar.f17757b = 0;
        bVar.f17626d = null;
        cVar.f17877b.add(bVar);
    }

    public final Object attachCompleter(CallbackToFutureAdapter.C0673a aVar) {
        switch (this.f21983b) {
            case 0:
                C7090q qVar = (C7090q) this.f21984c;
                qVar.f22036c.execute(new C7078n(0, qVar, aVar));
                return "updateSessionConfigAsync";
            default:
                C4305r rVar = (C4305r) this.f21984c;
                synchronized (rVar.f15248h) {
                    rVar.f15251k = aVar;
                }
                return "CaptureProcessorPipeline-close";
        }
    }

    /* renamed from: b */
    public final void mo771b(Object obj) {
        switch (this.f21983b) {
            case 6:
                C19767h hVar = (C19767h) this.f21984c;
                int i = C19767h.f50254p;
                UserOnboardingActivity userOnboardingActivity = (UserOnboardingActivity) hVar.f40822c;
                if (((ActivityResult) obj).f528b == -1) {
                    Toast.makeText(userOnboardingActivity.getBaseContext(), R.string.favorite_location_added, 1).show();
                    ((UserOnboardingActivity) hVar.f40822c).mo45265y2();
                    return;
                }
                return;
            default:
                TodRideActivity todRideActivity = (TodRideActivity) this.f21984c;
                ActivityResult activityResult = (ActivityResult) obj;
                int i2 = TodRideActivity.f39996t0;
                todRideActivity.getClass();
                Intent intent = activityResult.f529c;
                int i3 = activityResult.f528b;
                if (i3 == -1 && intent != null) {
                    todRideActivity.mo46177D2(new C14333w2(3, new C17119d(((Barcode) intent.getParcelableExtra("barcode")).f40798b, 0), (Object) null), intent.getStringExtra("actionId"));
                    return;
                } else if (i3 != 0 && intent == null) {
                    AlertDialogFragment.C15856a aVar = new AlertDialogFragment.C15856a((Context) todRideActivity);
                    aVar.mo47676e(R.drawable.img_cancel_warning, false);
                    aVar.mo47683l(R.string.general_error_title).mo47681j(R.string.retry_connect).mo47673b().show(todRideActivity.getSupportFragmentManager(), "");
                    return;
                } else {
                    return;
                }
        }
    }

    /* renamed from: c */
    public final void mo310c(int i) {
        int i2 = C18294i.f46648v;
        ((C18294i) this.f21984c).mo50687s2(i);
    }

    /* renamed from: d */
    public final void mo5856d(C20839b bVar) {
        C16591a aVar = (C16591a) this.f21984c;
        aVar.getClass();
        C19885a aVar2 = (C19885a) bVar.get();
        C4436j0 j0Var = new C4436j0((Object) aVar2);
        C16592b bVar2 = new C16592b();
        C19888b f = aVar2.mo52171f("clx", bVar2);
        if (f == null) {
            f = aVar2.mo52171f(AppMeasurement.CRASH_ORIGIN, bVar2);
        }
        if (f != null) {
            C16956d dVar = new C16956d();
            C16955c cVar = new C16955c(j0Var, TimeUnit.MILLISECONDS);
            synchronized (aVar) {
                Iterator it = aVar.f43237c.iterator();
                while (it.hasNext()) {
                    dVar.f43997b = (C17185a) it.next();
                }
                bVar2.f43239b = dVar;
                bVar2.f43238a = cVar;
                aVar.f43236b = dVar;
                aVar.f43235a = cVar;
            }
        }
    }

    /* renamed from: e */
    public final void mo23311e(C24424c cVar) {
        ((C22274pq) this.f21984c).m54271b(cVar);
    }

    /* renamed from: f */
    public final void mo23312f() {
        ((AppboyInAppMessageManager) this.f21984c).lambda$displayInAppMessage$0();
    }

    /* renamed from: h */
    public final void mo5770h(int i, Object obj) {
        LocationSettingsFixer locationSettingsFixer = (LocationSettingsFixer) this.f21984c;
        C15682c cVar = (C15682c) obj;
        locationSettingsFixer.getClass();
        locationSettingsFixer.mo48520a(cVar.f40822c, cVar, i, true);
    }

    public final boolean invoke(Object obj) {
        switch (this.f21983b) {
            case 7:
                int i = C15101a.f38810T;
                ((C15101a.C15108g) obj).mo45421k0((Time) this.f21984c);
                return false;
            case 8:
                ((C16741p.C16742a) obj).mo49421O0(((C16741p) this.f21984c).f43601h);
                return false;
            case 13:
                Barcode barcode = (Barcode) this.f21984c;
                String str = BarcodeScannerFragment.f40811n;
                C24362h.m61211f(barcode, "$barcode");
                ((BarcodeScannerFragment.C15681a) obj).mo23711w(barcode);
                return false;
            case 17:
                int i2 = C25692a.f64059i;
                ((C25692a.C25693a) obj).mo83442x0(((C25692a.C25694b) this.f21984c).f64062b);
                return false;
            case 19:
                int i3 = PaymentGatewayFragment.f42661y;
                ((PaymentGatewayFragment.C16322a) obj).mo23108c0((PaymentGatewayToken) this.f21984c);
                return true;
            default:
                int i4 = C19244i.f48871q;
                ((C19243h) obj).mo50504u2((C17559a) this.f21984c);
                return true;
        }
    }

    public final void onRefresh() {
        int i = C20811b.f52529u;
        ((C20811b) this.f21984c).mo52945n2(true);
    }

    public final Task then(Object obj) {
        switch (this.f21983b) {
            case 9:
                MoovitSubscriptionsManager moovitSubscriptionsManager = (MoovitSubscriptionsManager) this.f21984c;
                HashSet hashSet = MoovitSubscriptionsManager.f39757g;
                moovitSubscriptionsManager.getClass();
                ExecutorService executorService = MoovitExecutors.f37327IO;
                MoovitApplication<?, ?, ?> moovitApplication = moovitSubscriptionsManager.f39760b;
                return Tasks.call(executorService, new MoovitSubscriptionsManager.C15362e(moovitApplication, (C1941b) obj, (Set) MoovitSubscriptionsManager.f39758h.mo19759a(moovitApplication.getSharedPreferences("subscriptions_manager", 0))));
            case 12:
                C19385e eVar = C19385e.f49315c;
                return Tasks.forResult(C13723g.m34282c((List) obj, new C17916h((String) this.f21984c, 2)));
            case 15:
                C5577i iVar = C5577i.f18275d;
                return Tasks.call(MoovitExecutors.f37327IO, new C6575o((MicroMobilityPurchaseStepResult) this.f21984c, (C13752e) obj));
            case 16:
                Context context = ((C5585p) this.f21984c).f18302a;
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                new C18709o(context, (List) obj, taskCompletionSource).mo48196g();
                return taskCompletionSource.getTask();
            case 18:
                C7959a aVar = (C7959a) this.f21984c;
                int i = C19228d.f48828u;
                return Tasks.forResult(new CreditCardToken((String) obj, new CreditCardPreview(aVar.f24092a, aVar.mo24845a(), aVar.f24094c, aVar.f24095d)));
            default:
                C13752e eVar2 = (C13752e) obj;
                ThreadPoolExecutor threadPoolExecutor = C12887v.f31893d;
                return Tasks.call(MoovitExecutors.f37327IO, new C13026o(eVar2, (C12641c) this.f21984c));
        }
    }
}
