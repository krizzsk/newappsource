package p054d0;

import androidx.activity.result.C0206a;
import androidx.camera.core.C0612l;
import androidx.camera.core.C0636s;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import b50.C25553j;
import c00.C13723g;
import c70.C13752e;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.carpool.ridedetails.C14838d;
import com.moovit.app.home.lines.favorites.FavoriteLinesFragment;
import com.moovit.app.mot.purchase.model.MotQrCodeLinePrediction;
import com.moovit.app.mot.purchase.model.MotQrCodeTrip;
import com.moovit.app.tod.center.TodRidesCenterActivity;
import com.moovit.app.tod.model.TodRideVehicleAC;
import com.moovit.app.tod.model.TodRideVehicleAction;
import com.moovit.carpool.FutureCarpoolRide;
import com.moovit.gallery.EmbeddedGalleryFragment;
import com.moovit.location.C16202a;
import com.moovit.location.LocationSettingsFixer;
import com.moovit.micromobility.purchase.step.MicroMobilityPurchaseStep;
import com.moovit.payment.account.deposit.DepositInstructions;
import com.moovit.payment.gateway.C16328a;
import com.moovit.payment.gateway.PaymentGateway;
import com.moovit.payment.gateway.PaymentGatewayFragment;
import com.moovit.payment.gateway.PaymentGatewayType;
import com.moovit.transit.TransitLine;
import com.veriff.sdk.camera.camera2.internal.Camera2CameraControlImpl;
import h60.C17335m0;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;
import p394br.C13661g;
import p400bx.C13705a;
import p543hq.C17474b;
import p589jq.C17917i;
import p739px.C19039c;
import p805su.C19560p;
import p977zz.C20944i0;
import p977zz.C20949l;
import u30.C6689c;
import w40.C25761d;
import w50.C20277a;
import w50.C20283g;

/* renamed from: d0.a0 */
public final /* synthetic */ class C4267a0 implements C0612l.C0620h.C0622b, CallbackToFutureAdapter.C0674b, C20949l, SwipeRefreshLayout.C1274f, C0206a, SuccessContinuation, C16202a.C16205c {

    /* renamed from: b */
    public final /* synthetic */ int f15172b;

    /* renamed from: c */
    public final /* synthetic */ Object f15173c;

    public /* synthetic */ C4267a0(Object obj, int i) {
        this.f15172b = i;
        this.f15173c = obj;
    }

    public final Object attachCompleter(CallbackToFutureAdapter.C0673a aVar) {
        switch (this.f15172b) {
            case 1:
                C0636s sVar = (C0636s) this.f15173c;
                synchronized (sVar.f2175a) {
                    sVar.f2185k = aVar;
                }
                return "ProcessingImageReader-close";
            default:
                return ((Camera2CameraControlImpl) this.f15173c).lambda$triggerAf$4(aVar);
        }
    }

    /* JADX WARNING: type inference failed for: r6v13, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo771b(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.f15172b
            r1 = 0
            java.lang.String r2 = "search_result"
            r3 = -1
            switch(r0) {
                case 4: goto L_0x002a;
                case 7: goto L_0x000a;
                default: goto L_0x0009;
            }
        L_0x0009:
            goto L_0x0051
        L_0x000a:
            java.lang.Object r0 = r5.f15173c
            ax.b r0 = (p376ax.C13540b) r0
            androidx.activity.result.ActivityResult r6 = (androidx.activity.result.ActivityResult) r6
            int r4 = p376ax.C13540b.f33467q
            r0.getClass()
            int r4 = r6.f528b
            if (r4 != r3) goto L_0x0029
            android.content.Intent r6 = r6.f529c
            if (r6 == 0) goto L_0x0024
            android.os.Parcelable r6 = r6.getParcelableExtra(r2)
            r1 = r6
            com.moovit.transit.LocationDescriptor r1 = (com.moovit.transit.LocationDescriptor) r1
        L_0x0024:
            if (r1 == 0) goto L_0x0029
            r0.mo40430x2(r1)
        L_0x0029:
            return
        L_0x002a:
            java.lang.Object r0 = r5.f15173c
            tt.h r0 = (p828tt.C19767h) r0
            androidx.activity.result.ActivityResult r6 = (androidx.activity.result.ActivityResult) r6
            int r1 = p828tt.C19767h.f50254p
            r0.getClass()
            android.content.Intent r1 = r6.f529c
            int r6 = r6.f528b
            if (r6 != r3) goto L_0x0050
            if (r1 == 0) goto L_0x0050
            android.os.Parcelable r6 = r1.getParcelableExtra(r2)
            com.moovit.transit.LocationDescriptor r6 = (com.moovit.transit.LocationDescriptor) r6
            android.content.Context r1 = r0.requireContext()
            android.content.Intent r6 = com.moovit.app.home.dashboard.FavoriteLocationEditorActivity.m37662A2(r1, r6)
            androidx.activity.result.b<android.content.Intent> r0 = r0.f50255n
            r0.mo772a(r6)
        L_0x0050:
            return
        L_0x0051:
            java.lang.Object r0 = r5.f15173c
            com.moovit.payment.account.external.ExternalPaymentAccountsFragment r0 = (com.moovit.payment.account.external.ExternalPaymentAccountsFragment) r0
            androidx.activity.result.ActivityResult r6 = (androidx.activity.result.ActivityResult) r6
            s0.b r2 = com.moovit.payment.account.external.ExternalPaymentAccountsFragment.f63974r
            r0.getClass()
            android.content.Intent r2 = r6.f529c
            int r6 = r6.f528b
            if (r6 != r3) goto L_0x0079
            if (r2 == 0) goto L_0x0079
            java.lang.String r6 = com.moovit.payment.registration.PaymentRegistrationActivity.m41718B2(r2)
            s0.b r2 = com.moovit.payment.account.external.ExternalPaymentAccountsFragment.f63974r
            java.lang.Object r6 = r2.getOrDefault(r6, r1)
            com.moovit.payment.account.external.ExternalPaymentAccountHelper r6 = (com.moovit.payment.account.external.ExternalPaymentAccountHelper) r6
            if (r6 == 0) goto L_0x0079
            android.content.Context r0 = r0.requireContext()
            r6.mo44689R(r0)
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p054d0.C4267a0.mo771b(java.lang.Object):void");
    }

    /* renamed from: h */
    public final void mo5770h(int i, Object obj) {
        ((LocationSettingsFixer) this.f15173c).mo48520a((MoovitActivity) obj, (C15682c<?>) null, i, true);
    }

    public final boolean invoke(Object obj) {
        switch (this.f15172b) {
            case 2:
                FutureCarpoolRide futureCarpoolRide = ((C14838d) this.f15173c).f37891h;
                ((C14838d.C14839a) obj).mo44905R();
                return true;
            case 9:
                String[] strArr = C19039c.f48415s;
                ((C13705a) obj).mo40573z(TodRideVehicleAction.AC, (TodRideVehicleAC) this.f15173c);
                return true;
            case 10:
                int i = EmbeddedGalleryFragment.f41475r;
                ((EmbeddedGalleryFragment.C15875a) obj).mo19478O();
                return false;
            default:
                PaymentGateway paymentGateway = (PaymentGateway) this.f15173c;
                PaymentGatewayFragment paymentGatewayFragment = (PaymentGatewayFragment) obj;
                int i2 = C16328a.f42681h;
                paymentGatewayFragment.getClass();
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "payment_method_clicked");
                aVar.mo49939g(AnalyticsAttributeKey.SELECTED_TYPE, paymentGateway.getType().analyticsName);
                paymentGatewayFragment.mo46797j2(aVar.mo49933a());
                C20283g gVar = paymentGatewayFragment.f42664p;
                PaymentGatewayType type = paymentGateway.getType();
                gVar.getClass();
                C25761d.m64299a().mo83593i(type, paymentGateway);
                gVar.f51440n.setValue(paymentGateway);
                if (paymentGateway.getType().capabilities.contains(2)) {
                    paymentGatewayFragment.mo48926n2(false);
                }
                return false;
        }
    }

    public final void onRefresh() {
        switch (this.f15172b) {
            case 3:
                FavoriteLinesFragment favoriteLinesFragment = (FavoriteLinesFragment) this.f15173c;
                int i = FavoriteLinesFragment.f38373E;
                favoriteLinesFragment.mo45207o2();
                favoriteLinesFragment.mo45208p2();
                return;
            default:
                ((TodRidesCenterActivity) this.f15173c).f40205Z.mo46288b(true);
                return;
        }
    }

    public final Task then(Object obj) {
        switch (this.f15172b) {
            case 5:
                int i = C19560p.f49719q;
                return Tasks.forResult((MotQrCodeTrip) C13723g.m34286g((List) obj, new C17917i((MotQrCodeLinePrediction) this.f15173c, 1)));
            case 6:
                MotQrCodeTrip motQrCodeTrip = (MotQrCodeTrip) C13723g.m34286g((List) obj, new C13661g((TransitLine) this.f15173c, 1));
                if (motQrCodeTrip != null) {
                    return Tasks.forResult(motQrCodeTrip);
                }
                return Tasks.forCanceled();
            case 12:
                C6689c cVar = (C6689c) this.f15173c;
                cVar.getClass();
                String uuid = UUID.randomUUID().toString();
                cVar.f20768b.mo4295e((MicroMobilityPurchaseStep) obj, uuid);
                return Tasks.forResult(uuid);
            case 13:
                DepositInstructions depositInstructions = (DepositInstructions) this.f15173c;
                return Tasks.call(MoovitExecutors.f37327IO, new C25553j((C13752e) obj, depositInstructions.f63958b, depositInstructions.f63959c));
            case 15:
                BigDecimal bigDecimal = C20283g.f51427r;
                return Tasks.call(MoovitExecutors.f37327IO, new C17335m0((C20277a) this.f15173c, (C13752e) obj));
            default:
                return Tasks.forResult(new C20944i0((Calendar) this.f15173c, (List) obj));
        }
    }
}
