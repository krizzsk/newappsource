package p304x;

import android.content.Intent;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0206a;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import b40.C1472a;
import c00.C13723g;
import c70.C13752e;
import com.facebook.FacebookException;
import com.facebook.internal.FeatureManager;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.MoovitExecutors;
import com.moovit.app.mot.purchase.C15161a;
import com.moovit.app.suggestedroutes.SuggestRoutesActivity;
import com.moovit.app.tod.model.TodOrderConfig;
import com.moovit.app.tod.order.C15529a;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.location.C16202a;
import com.moovit.location.LocationSettingsFixer;
import com.moovit.micromobility.ride.MicroMobilityRide;
import com.moovit.network.model.ServerId;
import com.moovit.payment.account.creditcard.PaymentCreditCardActivity;
import com.moovit.payment.account.paymentmethod.PaymentMethod;
import com.moovit.payment.gateway.PaymentGatewayFragment;
import com.moovit.payment.gateway.PaymentGatewayType;
import com.moovit.payment.gateway.paymentmethod.PaymentMethodGateway;
import com.moovit.transit.LocationDescriptor;
import com.moovit.view.dialogs.BottomSheetMenuDialogFragment;
import h60.C17320h0;
import hi0.C23550n;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import l30.C5577i;
import l50.C18173c;
import l50.C18175e;
import m80.C12887v;
import n60.C18527a;
import p019b0.C1438o;
import p032c0.C1753c;
import p203p1.C6031d;
import p274u8.C6724a;
import p304x.C7045f0;
import p495fq.C17059d;
import p584jl.C17885a;
import p687nt.C18589b;
import p732pq.C18948i;
import p750ql.C19138d;
import p910xf.C20482k;
import p910xf.C20485l;
import p910xf.C20488n;
import p977zz.C20944i0;
import p977zz.C20949l;
import r60.C19243h;
import t30.C6561c;
import t60.C19630a;
import v40.C25754i;
import w40.C25761d;
import w50.C20283g;
import y80.C13264c;

/* renamed from: x.l0 */
public final /* synthetic */ class C7071l0 implements CallbackToFutureAdapter.C0674b, C1438o.C1440b, FeatureManager.C2369a, C20488n.C20489a, C6031d, C16202a.C16205c, C20949l, C0206a, SuccessContinuation, C23550n.C23552b {

    /* renamed from: b */
    public final /* synthetic */ int f21985b;

    /* renamed from: c */
    public final /* synthetic */ Object f21986c;

    public /* synthetic */ C7071l0(Object obj, int i) {
        this.f21985b = i;
        this.f21986c = obj;
    }

    /* renamed from: a */
    public final boolean mo19808a() {
        return !((MoovitActivity) this.f21986c).f37299H;
    }

    public final Object attachCompleter(CallbackToFutureAdapter.C0673a aVar) {
        switch (this.f21985b) {
            case 0:
                ((C7045f0.C7051e) this.f21986c).f21933a = aVar;
                return "waitFor3AResult";
            default:
                C1753c cVar = (C1753c) this.f21986c;
                cVar.f6148d.execute(new C7109v(2, cVar, aVar));
                return "clearCaptureRequestOptions";
        }
    }

    /* renamed from: b */
    public final void mo771b(Object obj) {
        PaymentMethod paymentMethod;
        switch (this.f21985b) {
            case 9:
                ActivityResult activityResult = (ActivityResult) obj;
                ((SuggestRoutesActivity) this.f21986c).f39798r0 = false;
                return;
            default:
                PaymentGatewayFragment paymentGatewayFragment = (PaymentGatewayFragment) this.f21986c;
                ActivityResult activityResult2 = (ActivityResult) obj;
                int i = PaymentGatewayFragment.f42661y;
                paymentGatewayFragment.getClass();
                if (activityResult2.f528b == -1) {
                    Toast.makeText(paymentGatewayFragment.requireContext(), C25754i.payment_change_card_success, 0).show();
                    Intent intent = activityResult2.f529c;
                    int i2 = PaymentCreditCardActivity.f63944Y;
                    PaymentMethodGateway paymentMethodGateway = null;
                    if (intent != null) {
                        paymentMethod = (PaymentMethod) intent.getParcelableExtra("paymentMethod");
                    } else {
                        paymentMethod = null;
                    }
                    if (paymentMethod != null) {
                        paymentMethodGateway = new PaymentMethodGateway(paymentMethod);
                    }
                    C20283g gVar = paymentGatewayFragment.f42664p;
                    PaymentGatewayType paymentGatewayType = PaymentGatewayType.PAYMENT_METHOD;
                    gVar.getClass();
                    C25761d.m64299a().mo83593i(paymentGatewayType, paymentMethodGateway);
                    gVar.f51440n.setValue(paymentMethodGateway);
                    return;
                }
                return;
        }
    }

    /* renamed from: e */
    public final void mo19991e(Object obj, C20482k.C20483a aVar) {
        C20482k kVar = (C20482k) this.f21986c;
        HashMap<Integer, HashSet<Integer>> hashMap = C20482k.f51856j;
        kVar.getClass();
        C20485l.f51866c.mo52681a(kVar);
        ((OnSuccessListener) obj).onSuccess(aVar);
    }

    /* renamed from: h */
    public final void mo5770h(int i, Object obj) {
        switch (this.f21985b) {
            case 6:
                C17059d dVar = (C17059d) this.f21986c;
                MoovitActivity moovitActivity = (MoovitActivity) obj;
                dVar.mo49522q(dVar.mo49514i());
                return;
            default:
                LocationSettingsFixer locationSettingsFixer = (LocationSettingsFixer) this.f21986c;
                C15682c cVar = (C15682c) obj;
                locationSettingsFixer.getClass();
                locationSettingsFixer.mo48523d(cVar.f40822c, cVar, i, true);
                return;
        }
    }

    /* renamed from: i */
    public final void mo246i(boolean z) {
        boolean z2;
        String str = (String) this.f21986c;
        int i = FacebookException.f8414b;
        if (z) {
            try {
                C6724a aVar = new C6724a(str);
                if (aVar.f20821b == null || aVar.f20822c == null) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    C17885a.m44399F0(aVar.f20820a, aVar.toString());
                }
            } catch (Exception unused) {
            }
        }
    }

    public final boolean invoke(Object obj) {
        switch (this.f21985b) {
            case 7:
                int i = C18589b.f47322n;
                ((C18589b.C18590a) obj).mo50985r1((LocationDescriptor) this.f21986c);
                return false;
            case 8:
                LatLonE6 latLonE6 = (LatLonE6) this.f21986c;
                C15161a.C15162a aVar = (C15161a.C15162a) obj;
                int i2 = C15161a.f39052i;
                if (latLonE6 != null) {
                    aVar.mo45596j(latLonE6);
                }
                return true;
            case 10:
                int i3 = C15529a.f40366i;
                ((C15529a.C15530a) obj).mo46393C0((TodOrderConfig) this.f21986c);
                return true;
            case 16:
                int i4 = C18527a.f47157A;
                ((C19243h) obj).mo50504u2(((C17320h0) this.f21986c).f44706m);
                return true;
            case 17:
                int i5 = C19630a.f49807u;
                ((C19630a.C19631a) obj).mo51845l((List) this.f21986c);
                return true;
            default:
                int i6 = BottomSheetMenuDialogFragment.f24110i;
                ((BottomSheetMenuDialogFragment.C7965a) obj).mo24850l0((BottomSheetMenuDialogFragment.MenuItem) this.f21986c);
                return false;
        }
    }

    public final Task then(Object obj) {
        switch (this.f21985b) {
            case 12:
                ServerId serverId = (ServerId) this.f21986c;
                C5577i iVar = C5577i.f18275d;
                MicroMobilityRide microMobilityRide = (MicroMobilityRide) C13723g.m34286g(((C1472a) obj).f5348a, new C18948i(serverId, 1));
                if (microMobilityRide != null) {
                    return Tasks.forResult(microMobilityRide);
                }
                return Tasks.forException(new ApplicationBugException("Couldn't find ride history with id: " + serverId));
            case 13:
                MicroMobilityRide microMobilityRide2 = (MicroMobilityRide) obj;
                C5577i iVar2 = C5577i.f18275d;
                return Tasks.call(MoovitExecutors.f37327IO, new C6561c((C13752e) this.f21986c, microMobilityRide2.f14984b, microMobilityRide2.f14985c, microMobilityRide2.f14986d));
            case 14:
                C18173c cVar = (C18173c) this.f21986c;
                C18175e eVar = (C18175e) obj;
                int i = C18173c.f46410v;
                cVar.getClass();
                cVar.f46411u = eVar.f46413m;
                return Tasks.forResult(new C20944i0(eVar.f46414n, eVar.f46415o));
            default:
                ThreadPoolExecutor threadPoolExecutor = C12887v.f31893d;
                return Tasks.call(MoovitExecutors.f37327IO, new C13264c((C19138d) this.f21986c, (C13752e) obj));
        }
    }
}
