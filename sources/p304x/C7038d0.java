package p304x;

import a00.C13382a;
import android.content.ClipData;
import android.database.Cursor;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0206a;
import androidx.camera.core.C0636s;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.C0578e;
import androidx.camera.core.impl.C0589m;
import androidx.camera.core.impl.C0590n;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.android.billingclient.api.C1949f;
import com.android.billingclient.api.C1952h;
import com.braze.BrazeUser;
import com.cubic.umo.pass.model.FundingSourceDTO;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.snackbar.Snackbar;
import com.moovit.C15682c;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.linedetail.p416ui.C15101a;
import com.moovit.app.mot.purchase.MotStationEntranceOnlyActivationActivity;
import com.moovit.app.ridesharing.RideSharingCenterActivity;
import com.moovit.app.search.AbstractSearchActivity;
import com.moovit.app.search.locations.C15284a;
import com.moovit.app.servicealerts.ServiceAlertFragment;
import com.moovit.app.subscription.MoovitSubscriptionsManager;
import com.moovit.app.suggestedroutes.TripPlanOptionsActivity;
import com.moovit.app.useraccount.notifications.UserNotificationsCenterActivity;
import com.moovit.barcode.Barcode;
import com.moovit.barcode.scan.BarcodeScannerFragment;
import com.moovit.barcode.scan.engines.ZxingBarcodeScannerFragment;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.view.list.FixedListView;
import com.moovit.commons.view.window.C15830a;
import com.moovit.design.view.NumericStepperView;
import com.moovit.design.view.list.ListItemView;
import com.moovit.location.C16202a;
import com.moovit.location.LocationSettingsFixer;
import com.moovit.network.model.ServerId;
import com.moovit.payment.clearance.model.Bank;
import com.moovit.payment.confirmation.options.PaymentOptions;
import com.moovit.payment.confirmation.summary.PaymentSummaryInfo;
import com.moovit.transit.LocationDescriptor;
import com.moovit.tripplanner.TripPlannerTransportTypeInfo;
import com.tranzmate.R;
import ja0.C12791b;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import m50.C18323a;
import p041ca.C1835u;
import p099ga.C4887g0;
import p237r9.C6269b;
import p242s1.C6323c;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p242s1.C6391t;
import p242s1.C6396v0;
import p280v1.C6841d;
import p280v1.C6842e;
import p291w.C6956a;
import p304x.C7045f0;
import p373au.C13533e;
import p503fy.C17125a;
import p528gz.C17272g;
import p543hq.C17474b;
import p808sx.C19572h;
import p910xf.C20482k;
import p910xf.C20485l;
import p910xf.C20488n;
import p977zz.C20949l;
import p977zz.C20960q0;
import p977zz.C20961r;
import v90.C13187a;
import w50.C20282f;
import w50.C20283g;
import w90.C13222b;
import w90.C13228f;

/* renamed from: x.d0 */
public final /* synthetic */ class C7038d0 implements CallbackToFutureAdapter.C0674b, C0636s.C0641e, C6841d, C1835u.C1836a, C4887g0.C4892e, C20488n.C20489a, C20949l, NumericStepperView.C15863a, SwipeRefreshLayout.C1274f, C16202a.C16205c, C1952h, C0206a, SuccessContinuation, C6391t, C12791b.C12792a {

    /* renamed from: b */
    public final /* synthetic */ int f21893b;

    /* renamed from: c */
    public final /* synthetic */ Object f21894c;

    public /* synthetic */ C7038d0(Object obj, int i) {
        this.f21893b = i;
        this.f21894c = obj;
    }

    /* renamed from: a */
    public final boolean mo23297a(C6842e eVar, int i, Bundle bundle) {
        C6323c.C6325b bVar;
        View view = (View) this.f21894c;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                eVar.f21184a.mo23082c();
                InputContentInfo inputContentInfo = (InputContentInfo) eVar.f21184a.mo23080a();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception unused) {
                return false;
            }
        }
        ClipData clipData = new ClipData(eVar.f21184a.getDescription(), new ClipData.Item(eVar.f21184a.mo23081b()));
        if (i2 >= 31) {
            bVar = new C6323c.C6324a(clipData, 2);
        } else {
            bVar = new C6323c.C6326c(clipData, 2);
        }
        bVar.mo22452a(eVar.f21184a.mo23083d());
        bVar.setExtras(bundle);
        if (C6333d0.m15025m(view, bVar.build()) == null) {
            return true;
        }
        return false;
    }

    public final Object apply(Object obj) {
        C1835u uVar = (C1835u) this.f21894c;
        Cursor cursor = (Cursor) obj;
        C6269b bVar = C1835u.f6351g;
        uVar.getClass();
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            uVar.mo6644j((long) i, LogEventDropped.Reason.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    public final Object attachCompleter(CallbackToFutureAdapter.C0673a aVar) {
        C7045f0.C7046a aVar2 = (C7045f0.C7046a) this.f21894c;
        C7066j1 j1Var = aVar2.f21916a.f22041h;
        if (!j1Var.f21972c) {
            aVar.mo2698c(new CameraControl.OperationCanceledException("Camera is not active."));
        } else {
            C0578e.C0579a aVar3 = new C0578e.C0579a();
            aVar3.f1979c = j1Var.f21973d;
            aVar3.f1981e = true;
            C0589m t = C0589m.m1674t();
            t.mo2503w(C6956a.m16424s(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER), 1);
            aVar3.mo2481c(new C6956a(C0590n.m1678s(t)));
            aVar3.mo2480b(new C7063i1(aVar));
            j1Var.f21970a.mo23337p(Collections.singletonList(aVar3.mo2482d()));
        }
        aVar2.f21917b.f5280b = true;
        return "AePreCapture";
    }

    /* renamed from: b */
    public final void mo771b(Object obj) {
        TripPlanOptionsActivity tripPlanOptionsActivity = (TripPlanOptionsActivity) this.f21894c;
        ActivityResult activityResult = (ActivityResult) obj;
        int i = TripPlanOptionsActivity.f39809o0;
        if (tripPlanOptionsActivity.f37297F.mo44595c("TRIP_PLANNER_CONFIGURATION")) {
            C13187a aVar = (C13187a) tripPlanOptionsActivity.mo44537r1("TRIP_PLANNER_CONFIGURATION");
            FixedListView fixedListView = (FixedListView) tripPlanOptionsActivity.findViewById(R.id.root);
            for (TripPlannerTransportTypeInfo next : aVar.f32742c) {
                ((ListItemView) fixedListView.findViewWithTag(next.f23802b)).setChecked(aVar.mo40063d().contains(next.f23802b));
            }
            tripPlanOptionsActivity.mo45969A2(aVar);
        }
    }

    /* renamed from: c */
    public final void mo23298c(C1949f fVar, List list) {
        C20960q0 q0Var = (C20960q0) this.f21894c;
        HashSet hashSet = MoovitSubscriptionsManager.f39757g;
        if (fVar.f6770a == 0) {
            q0Var.invoke(new C20961r(list));
            return;
        }
        StringBuilder k = C13555b.m33972k("Billing response code error: ");
        k.append(fVar.f6770a);
        q0Var.invoke(new C20961r((Exception) new IOException(k.toString())));
    }

    /* renamed from: e */
    public final void mo19991e(Object obj, C20482k.C20483a aVar) {
        C20482k kVar = (C20482k) this.f21894c;
        HashMap<Integer, HashSet<Integer>> hashMap = C20482k.f51856j;
        kVar.getClass();
        C20485l.f51866c.mo52681a(kVar);
        ((OnCompleteListener) obj).onComplete(kVar);
    }

    /* renamed from: f */
    public final void mo20740f(List list, Object obj, int i) {
        C18323a aVar = (C18323a) this.f21894c;
        Bank bank = (Bank) obj;
        int i2 = C18323a.f46730q;
        aVar.getClass();
        C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "payment_method_clicked");
        aVar2.mo49939g(AnalyticsAttributeKey.BANK_NAME, bank.f42601d);
        aVar.mo46797j2(aVar2.mo49933a());
        aVar.mo46786U1(C18323a.C18325b.class, new C13533e(bank, 13));
    }

    /* renamed from: g */
    public final void mo19812g(NumericStepperView numericStepperView, int i) {
        int i2;
        MotStationEntranceOnlyActivationActivity motStationEntranceOnlyActivationActivity = (MotStationEntranceOnlyActivationActivity) this.f21894c;
        View view = motStationEntranceOnlyActivationActivity.f39045l0;
        if (i > 1) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view.setVisibility(i2);
        motStationEntranceOnlyActivationActivity.mo45598D2();
        NumericStepperView numericStepperView2 = motStationEntranceOnlyActivationActivity.f39046m0;
        C13382a.m33665a(numericStepperView2, numericStepperView2.getResources().getString(R.string.voiceover_passenger_total, new Object[]{Integer.valueOf(i)}));
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "tickets_counter_changed");
        aVar.mo49935c(AnalyticsAttributeKey.COUNT, i);
        motStationEntranceOnlyActivationActivity.mo44545v2(aVar.mo49933a());
    }

    /* renamed from: h */
    public final void mo5770h(int i, Object obj) {
        switch (this.f21893b) {
            case 9:
                C15284a aVar = (C15284a) this.f21894c;
                C15682c cVar = (C15682c) obj;
                ServerId serverId = C15284a.f39471U;
                if (i != 0) {
                    String string = aVar.getString(R.string.location_services_not_permitted_message);
                    UiUtils.m40252k(aVar.f39497T);
                    Snackbar.m35158k(0, aVar.f39497T, string).mo42259p();
                    return;
                } else if (aVar.mo46780O1() != null) {
                    ((AbstractSearchActivity) aVar.f40822c).mo45804D2(LocationDescriptor.m17772m(aVar.getContext()));
                    return;
                } else {
                    return;
                }
            default:
                LocationSettingsFixer locationSettingsFixer = (LocationSettingsFixer) this.f21894c;
                C15682c cVar2 = (C15682c) obj;
                locationSettingsFixer.getClass();
                locationSettingsFixer.mo48524e(cVar2.f40822c, cVar2, i);
                return;
        }
    }

    public final boolean invoke(Object obj) {
        switch (this.f21893b) {
            case 6:
                int i = C15101a.f38810T;
                ((C15101a.C15108g) obj).mo45419c1((List) this.f21894c);
                return false;
            case 13:
                int i2 = C19572h.f49749k;
                ((C19572h.C19573a) obj).mo45960c((Set) this.f21894c);
                return false;
            default:
                BarcodeScannerFragment barcodeScannerFragment = (BarcodeScannerFragment) obj;
                int i3 = ZxingBarcodeScannerFragment.f40818p;
                Barcode barcode = new Barcode((String) this.f21894c);
                barcodeScannerFragment.getClass();
                barcodeScannerFragment.mo46786U1(BarcodeScannerFragment.C15681a.class, new C7070l(barcode, 13));
                return true;
        }
    }

    public final C6396v0 onApplyWindowInsets(View view, C6396v0 v0Var) {
        boolean z;
        C15830a aVar = (C15830a) this.f21894c;
        aVar.getClass();
        Rect rect = new Rect();
        aVar.f41320d = rect;
        rect.set(v0Var.mo22504c(), v0Var.mo22506e(), v0Var.mo22505d(), v0Var.mo22503b());
        Rect rect2 = aVar.f41320d;
        if (aVar.f41322f) {
            aVar.f41318b.setPadding(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
        ((C15830a.C15831a) aVar.f41318b).mo47376a();
        if (aVar.f41320d.isEmpty() || aVar.f41319c == null) {
            z = true;
        } else {
            z = false;
        }
        view.setWillNotDraw(z);
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        C6333d0.C6337d.m15051k(view);
        return v0Var.f20044a.mo22526c();
    }

    public final void onRefresh() {
        switch (this.f21893b) {
            case 8:
                int i = RideSharingCenterActivity.f39304Z;
                ((RideSharingCenterActivity) this.f21894c).mo45748y2();
                return;
            case 10:
                ServiceAlertFragment serviceAlertFragment = (ServiceAlertFragment) this.f21894c;
                int i2 = ServiceAlertFragment.f39556x;
                if (serviceAlertFragment.mo46775H1()) {
                    serviceAlertFragment.mo45847m2(true);
                    return;
                } else {
                    serviceAlertFragment.f39563t.setRefreshing(false);
                    return;
                }
            default:
                UserNotificationsCenterActivity userNotificationsCenterActivity = (UserNotificationsCenterActivity) this.f21894c;
                int i3 = UserNotificationsCenterActivity.f40616o0;
                userNotificationsCenterActivity.f40620Z.setRefreshing(true);
                C17125a aVar = userNotificationsCenterActivity.f40617U;
                synchronized (aVar) {
                    if (aVar.f44339e == null) {
                        C17125a.C17126a aVar2 = new C17125a.C17126a();
                        aVar.f44339e = aVar2;
                        aVar2.execute(new Void[0]);
                        return;
                    }
                    return;
                }
        }
    }

    public final Task then(Object obj) {
        switch (this.f21893b) {
            case 16:
                C17272g.C17274b bVar = C17272g.f44642b;
                return Tasks.forResult(new C17272g.C17277e(((C17272g) this.f21894c).f44658a.getSharedPreferences("com.moovit.braze.profile", 0), (BrazeUser) obj));
            case 20:
                BigDecimal bigDecimal = C20283g.f51427r;
                return Tasks.call(MoovitExecutors.COMPUTATION, new C20282f((PaymentOptions) this.f21894c, (PaymentSummaryInfo) obj));
            default:
                C13222b bVar2 = (C13222b) this.f21894c;
                C13222b bVar3 = C13222b.f32795d;
                bVar2.getClass();
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                bVar2.f32798c.mo11670k((FundingSourceDTO) obj, new C13228f(taskCompletionSource));
                return taskCompletionSource.getTask();
        }
    }
}
