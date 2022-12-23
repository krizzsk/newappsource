package p054d0;

import android.content.Intent;
import android.view.Display;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0206a;
import androidx.camera.core.C0556i;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.C1043v;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import b50.C25548e;
import b50.C25549f;
import c00.C13721e;
import com.facebook.appevents.C2341k;
import com.google.android.exoplayer2.drm.C3912b;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.linedetail.p416ui.C15101a;
import com.moovit.app.tod.model.TodRideVehicleAction;
import com.moovit.app.tod.model.TodRideVehicleColorBar;
import com.moovit.app.wondo.tickets.model.WondoCampaign;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.commons.utils.Color;
import com.moovit.design.view.NumericStepperView;
import com.moovit.location.C16202a;
import com.moovit.location.LocationSettingsFixer;
import com.moovit.network.model.ServerId;
import com.moovit.payment.account.creditcard.PaymentCreditCardActivity;
import com.moovit.payment.account.deposit.C25643a;
import com.moovit.payment.account.deposit.DepositActivity;
import com.moovit.payment.account.deposit.DepositInstructions;
import com.moovit.payment.account.paymentmethod.PaymentMethod;
import com.moovit.payment.confirmation.options.PaymentOptions;
import com.moovit.payment.gateway.PaymentGatewayFragment;
import com.moovit.ticketing.purchase.PurchaseStep;
import com.moovit.ticketing.ticket.Ticket;
import com.moovit.ticketing.ticket.TicketId;
import com.moovit.transit.LocationDescriptor;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitStop;
import com.moovit.tripplanner.TripPlannerTransportType;
import com.moovit.util.ServerIdMap;
import com.moovit.view.ScheduleView;
import com.moovit.view.TransitLineListItemView;
import com.veriff.sdk.camera.camera2.interop.Camera2CameraControl;
import d90.C12608b;
import i60.C17559a;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.regex.Pattern;
import k90.C12820b;
import l50.C18171b;
import m80.C12887v;
import p009a8.C0112l;
import p028ba.C1517k;
import p063da.C4407a;
import p115i0.C5235k;
import p275u9.C6751s;
import p277ub.C6777c;
import p290vb.C6942h;
import p400bx.C13705a;
import p543hq.C17474b;
import p550hx.C17513c;
import p572iw.C17666h;
import p687nt.C18589b;
import p688nu.C18632d;
import p785ry.C19381a;
import p785ry.C19385e;
import p808sx.C19572h;
import p927xw.C20647n;
import p950yw.C20777d;
import p977zz.C20949l;
import r60.C19234e;
import r60.C19243h;
import s90.C13076d;
import v80.C13186d;
import w50.C20283g;
import x50.C20450a;

/* renamed from: d0.v */
public final /* synthetic */ class C4314v implements C0556i.C0557a, CallbackToFutureAdapter.C0674b, C4407a.C4408a, C6777c, C6942h.C6943a.C6944a, C20949l, NumericStepperView.C15863a, SuccessContinuation, C16202a.C16205c, C0206a, SwipeRefreshLayout.C1274f, ScheduleView.C7929c, C13721e {

    /* renamed from: b */
    public final /* synthetic */ int f15275b;

    /* renamed from: c */
    public final /* synthetic */ Object f15276c;

    public /* synthetic */ C4314v(Object obj, int i) {
        this.f15275b = i;
        this.f15276c = obj;
    }

    /* renamed from: C */
    public Object mo309C() {
        C1517k kVar = (C1517k) this.f15276c;
        for (C6751s a : kVar.f5461b.mo6649L()) {
            kVar.f5462c.mo5853a(a, 1);
        }
        return null;
    }

    /* renamed from: a */
    public /* synthetic */ void mo2441a() {
    }

    public void accept(Object obj) {
        ((C3912b.C3913a) obj).mo16005e((Exception) this.f15276c);
    }

    public Object attachCompleter(CallbackToFutureAdapter.C0673a aVar) {
        switch (this.f15275b) {
            case 1:
                C5235k kVar = (C5235k) this.f15276c;
                synchronized (kVar.f17329b) {
                    kVar.f17336i = aVar;
                }
                return "YuvToJpegProcessor-close";
            default:
                return ((Camera2CameraControl) this.f15276c).lambda$addCaptureRequestOptions$4(aVar);
        }
    }

    /* renamed from: b */
    public void mo771b(Object obj) {
        PaymentMethod paymentMethod;
        switch (this.f15275b) {
            case 13:
                DepositActivity depositActivity = (DepositActivity) this.f15276c;
                int i = DepositActivity.f63947m0;
                depositActivity.getClass();
                Intent intent = ((ActivityResult) obj).f529c;
                int i2 = PaymentCreditCardActivity.f63944Y;
                if (intent != null) {
                    paymentMethod = (PaymentMethod) intent.getParcelableExtra("paymentMethod");
                } else {
                    paymentMethod = null;
                }
                if (paymentMethod != null) {
                    C25643a aVar = depositActivity.f63949X;
                    aVar.getClass();
                    C1043v vVar = new C1043v();
                    DepositInstructions value = aVar.f63965e.getValue();
                    if (value == null) {
                        vVar.setValue(Boolean.FALSE);
                    } else {
                        Task call = Tasks.call(MoovitExecutors.f37327IO, new C25549f(aVar, 0));
                        ExecutorService executorService = MoovitExecutors.COMPUTATION;
                        call.onSuccessTask(executorService, new C4267a0(value, 13)).onSuccessTask(executorService, new C2341k(8)).addOnCompleteListener((Executor) executorService, new C18632d(vVar, 2)).addOnSuccessListener(MoovitExecutors.MAIN_THREAD, new C20777d(2, aVar, paymentMethod));
                    }
                    vVar.observe(depositActivity, new C25548e(depositActivity, vVar));
                    return;
                }
                return;
            default:
                PaymentGatewayFragment paymentGatewayFragment = (PaymentGatewayFragment) this.f15276c;
                int i3 = PaymentGatewayFragment.f42661y;
                paymentGatewayFragment.getClass();
                if (((ActivityResult) obj).f528b == -1) {
                    paymentGatewayFragment.f42672x = true;
                    paymentGatewayFragment.mo46786U1(PaymentGatewayFragment.C16322a.class, new C0112l(16));
                    return;
                }
                return;
        }
    }

    /* renamed from: c */
    public void mo2442c(C4310t0 t0Var) {
        ((C0556i.C0557a) this.f15276c).mo2442c(t0Var);
    }

    public Object convert(Object obj) {
        switch (this.f15275b) {
            case 0:
                return (TransitStop) ((ServerIdMap) this.f15276c).get((ServerId) obj);
            default:
                return ((C12608b.C12609a) this.f15276c).f31162g.get(((Integer) obj).intValue()).f23379b;
        }
    }

    /* renamed from: d */
    public void mo19809d(List list) {
        TransitLineListItemView.m18058u((TransitLineListItemView) this.f15276c, list);
    }

    /* renamed from: e */
    public void mo19836e(Display display) {
        C6942h hVar = (C6942h) this.f15276c;
        if (display != null) {
            hVar.getClass();
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            hVar.f21673j = refreshRate;
            hVar.f21674k = (refreshRate * 80) / 100;
            return;
        }
        hVar.f21673j = -9223372036854775807L;
        hVar.f21674k = -9223372036854775807L;
    }

    /* renamed from: g */
    public void mo19812g(NumericStepperView numericStepperView, int i) {
        switch (this.f15275b) {
            case 10:
                int i2 = C17513c.f45083k;
                ((C17513c) this.f15276c).mo46413V1();
                return;
            default:
                C20283g gVar = ((C20450a) this.f15276c).f51796n;
                gVar.getClass();
                gVar.f51434h.postValue(new PaymentOptions(i));
                return;
        }
    }

    /* renamed from: h */
    public void mo5770h(int i, Object obj) {
        ((LocationSettingsFixer) this.f15276c).mo48521b((MoovitActivity) obj, (C15682c<?>) null, i);
    }

    public boolean invoke(Object obj) {
        switch (this.f15275b) {
            case 6:
                int i = C18589b.f47322n;
                ((C18589b.C18590a) obj).mo50984f1((LocationDescriptor) this.f15276c);
                return false;
            case 7:
                int i2 = C15101a.f38810T;
                ((C15101a.C15108g) obj).mo45422l1((TransitLine) this.f15276c);
                return false;
            case 8:
                C17666h hVar = (C17666h) this.f15276c;
                int i3 = C17666h.f45402O;
                hVar.getClass();
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.MESSAGE_BAR_TAPPED);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "search_filters_off");
                hVar.mo46797j2(aVar.mo49933a());
                ((C19572h.C19573a) obj).mo45960c(EnumSet.allOf(TripPlannerTransportType.class));
                return false;
            case 9:
                String str = C20647n.f52214k;
                ((C13705a) obj).mo40573z(TodRideVehicleAction.COLOR_BAR, new TodRideVehicleColorBar((Color) this.f15276c));
                return false;
            case 14:
                C18171b bVar = (C18171b) this.f15276c;
                ((C18171b.C18172a) obj).mo50589V(bVar.f46405i, bVar.f46407k);
                return false;
            default:
                Pattern pattern = C19234e.f48842G;
                ((C19243h) obj).mo50504u2((C17559a) this.f15276c);
                return true;
        }
    }

    public void onRefresh() {
        int i = C12820b.f31687v;
        ((C12820b) this.f15276c).mo39649n2(true);
    }

    public Task then(Object obj) {
        T t = null;
        switch (this.f15275b) {
            case 11:
                String str = (String) this.f15276c;
                C19381a aVar = (C19381a) obj;
                C19385e eVar = C19385e.f49315c;
                if (aVar != null) {
                    t = (WondoCampaign) aVar.f49307e.get(str);
                }
                return Tasks.forResult(t);
            case 18:
                TicketId ticketId = (TicketId) this.f15276c;
                ThreadPoolExecutor threadPoolExecutor = C12887v.f31893d;
                List<Ticket> list = ((C13076d) obj).f32346a;
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            T next = it.next();
                            if (ticketId.equals(((Ticket) next).f23473b)) {
                                t = next;
                            }
                        }
                    }
                }
                Ticket ticket = (Ticket) t;
                if (ticket != null) {
                    return Tasks.forResult(ticket);
                }
                return Tasks.forException(new ApplicationBugException("Couldn't find user wallet ticket with id: " + ticketId));
            default:
                C13186d dVar = (C13186d) this.f15276c;
                dVar.getClass();
                String uuid = UUID.randomUUID().toString();
                dVar.f32739b.mo4295e((PurchaseStep) obj, uuid);
                return Tasks.forResult(uuid);
        }
    }
}
