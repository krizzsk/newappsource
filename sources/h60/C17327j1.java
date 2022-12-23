package h60;

import android.database.Cursor;
import androidx.activity.result.C0206a;
import androidx.camera.camera2.internal.CaptureSession;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import b40.C1476d;
import c00.C13719c;
import c00.C13721e;
import c00.C13723g;
import c70.C13752e;
import com.facebook.login.LoginClient;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.mediacodec.C3941c;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.tabs.C14151e;
import com.google.firebase.messaging.FirebaseMessaging;
import com.moovit.MoovitExecutors;
import com.moovit.app.carpool.ridedetails.C14838d;
import com.moovit.app.mot.purchase.model.MotQrCodeTrip;
import com.moovit.app.ridesharing.C15241a;
import com.moovit.app.suggestedroutes.C15374a;
import com.moovit.app.tod.shuttle.booking.passengersselection.TodAdditionalPassengersSelectionDialogFragment;
import com.moovit.app.tripplanner.C15578a;
import com.moovit.carpool.FutureCarpoolRide;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.database.DbEntityRef;
import com.moovit.design.view.NumericStepperView;
import com.moovit.itinerary.C16080a;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.micromobility.purchase.intent.MicroMobilityPurchaseIntent;
import com.moovit.micromobility.purchase.step.MicroMobilityPurchaseStep;
import com.moovit.micromobility.ride.MicroMobilityRide;
import com.moovit.network.model.ServerId;
import com.moovit.payment.account.model.PaymentAccount;
import com.moovit.payment.account.model.PaymentAccountContextStatus;
import com.moovit.payment.confirmation.options.PaymentOptions;
import com.moovit.payment.confirmation.summary.PaymentSummaryInfo;
import com.moovit.payment.registration.steps.profile.certificate.ProfileCertificateData;
import com.moovit.ticketing.ticket.C7758e;
import com.moovit.transit.C7841a;
import com.moovit.transit.ShapeSegment;
import com.tranzmate.moovit.protocol.payments.MVProfileRequiredInfoValue;
import com.tranzmate.moovit.protocol.share.MVGetShareEntityLinkRequest;
import com.tranzmate.moovit.protocol.share.MVShareEntityType;
import com.veriff.sdk.camera.core.impl.utils.executor.CameraXExecutors;
import com.veriff.sdk.camera.core.impl.utils.futures.Futures;
import h90.C12740b;
import i30.C5268d;
import java.math.BigDecimal;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;
import l30.C5577i;
import m50.C18337j;
import mf0.C24361g;
import mf0.C24362h;
import n50.C18524c;
import p041ca.C1813c;
import p041ca.C1835u;
import p063da.C4407a;
import p100gb.C4999w;
import p237r9.C6269b;
import p373au.C13521a;
import p459ee.C16810a;
import p459ee.C16812c;
import p484ff.C16973g0;
import p620kx.C18156b;
import p695od.C18728c;
import p732pq.C18949j;
import p732pq.C18951l;
import p829tu.C19779j;
import p829tu.C19780k;
import p886wf.C20295a;
import p956ze.C20837a;
import p956ze.C20839b;
import p973zv.C20911a;
import p977zz.C20944i0;
import p977zz.C20949l;
import t30.C6573m;
import u30.C6689c;
import w50.C20283g;

/* renamed from: h60.j1 */
public final /* synthetic */ class C17327j1 implements C13721e, CallbackToFutureAdapter.C0674b, LoginClient.C2462c, C4407a.C4408a, C1835u.C1836a, MediaCodecUtil.C3934e, C4999w.C5000a, C20837a.C20838a, SuccessContinuation, C20949l, C13521a.C13522a.C13524b, C14151e.C14153b, NumericStepperView.C15863a, C0206a, SwipeRefreshLayout.C1274f {

    /* renamed from: b */
    public final /* synthetic */ int f44715b;

    /* renamed from: c */
    public final /* synthetic */ Object f44716c;

    public /* synthetic */ C17327j1(Object obj, int i) {
        this.f44715b = i;
        this.f44716c = obj;
    }

    /* renamed from: C */
    public Object mo309C() {
        return ((C1813c) this.f44716c).mo6643i();
    }

    public Object apply(Object obj) {
        C1835u uVar = (C1835u) this.f44716c;
        Cursor cursor = (Cursor) obj;
        C6269b bVar = C1835u.f6351g;
        uVar.getClass();
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            uVar.mo6644j((long) i, LogEventDropped.Reason.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    public Object attachCompleter(CallbackToFutureAdapter.C0673a aVar) {
        boolean z;
        String str;
        switch (this.f44715b) {
            case 0:
                CaptureSession captureSession = (CaptureSession) this.f44716c;
                synchronized (captureSession.f1727a) {
                    if (captureSession.f1740n == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C24361g.m61193w("Release completer expected to be null", z);
                    captureSession.f1740n = aVar;
                    str = "Release[session=" + captureSession + "]";
                }
                return str;
            default:
                return Futures.propagateTransform(false, (C18728c) this.f44716c, Futures.IDENTITY_FUNCTION, aVar, CameraXExecutors.directExecutor());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.veriff.VeriffResult} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: com.veriff.VeriffResult$Error} */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo771b(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f44716c
            k60.f r0 = (k60.C18010f) r0
            androidx.activity.result.ActivityResult r5 = (androidx.activity.result.ActivityResult) r5
            int r1 = k60.C18010f.f46121u
            r0.getClass()
            android.content.Intent r5 = r5.f529c
            r1 = 0
            if (r5 != 0) goto L_0x0011
            goto L_0x002d
        L_0x0011:
            java.lang.String r2 = mobi.lab.veriff.data.VeriffConstants.INTENT_EXTRA_STATUS
            r3 = -1
            int r5 = r5.getIntExtra(r2, r3)
            if (r5 != r3) goto L_0x001b
            goto L_0x002d
        L_0x001b:
            com.veriff.VeriffResult$Status r2 = com.veriff.sdk.internal.C22087nq.m53871a((int) r5)
            com.veriff.VeriffResult$Status r3 = com.veriff.VeriffResult.Status.ERROR
            if (r2 != r3) goto L_0x0027
            com.veriff.VeriffResult$Error r1 = com.veriff.sdk.internal.C22087nq.m53874b(r5)
        L_0x0027:
            com.veriff.VeriffResult r5 = new com.veriff.VeriffResult
            r5.<init>(r2, r1)
            r1 = r5
        L_0x002d:
            if (r1 == 0) goto L_0x0059
            int[] r5 = k60.C18010f.C18013c.f46127a
            com.veriff.VeriffResult$Status r1 = r1.f30934a
            int r1 = r1.ordinal()
            r5 = r5[r1]
            r1 = 1
            if (r5 == r1) goto L_0x003d
            goto L_0x0059
        L_0x003d:
            com.moovit.payment.registration.PaymentRegistrationInstructions r5 = r0.mo50500p2()
            java.lang.String r5 = r5.f42758b
            h60.q1 r2 = new h60.q1
            c70.e r3 = r0.mo46783R1()
            r2.<init>(r3, r5)
            com.moovit.request.RequestOptions r5 = r0.mo46777L1()
            r5.f42909f = r1
            k60.f$b r1 = r0.f46123s
            java.lang.String r3 = "veriff_step_completed"
            r0.mo46793f2(r3, r2, r5, r1)
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h60.C17327j1.mo771b(java.lang.Object):void");
    }

    public Object convert(Object obj) {
        switch (this.f44715b) {
            case 0:
                C17330k1 k1Var = (C17330k1) this.f44716c;
                k1Var.getClass();
                return (MVProfileRequiredInfoValue) ((ProfileCertificateData) obj).mo49104b(k1Var);
            default:
                C13719c cVar = C7841a.f23766a;
                ServerId serverId = new ServerId(((Integer) obj).intValue());
                DbEntityRef<ShapeSegment> newShapeSegmentRef = DbEntityRef.newShapeSegmentRef(serverId);
                ShapeSegment shapeSegment = (ShapeSegment) ((C5268d) this.f44716c).f17410g.get(serverId);
                if (shapeSegment != null) {
                    newShapeSegmentRef.resolveTo(shapeSegment);
                }
                return newShapeSegmentRef;
        }
    }

    /* renamed from: d */
    public void mo5856d(C20839b bVar) {
        ((C16812c) this.f44716c).f43774b.set((C16810a) bVar.get());
    }

    /* renamed from: g */
    public void mo19812g(NumericStepperView numericStepperView, int i) {
        TodAdditionalPassengersSelectionDialogFragment todAdditionalPassengersSelectionDialogFragment = (TodAdditionalPassengersSelectionDialogFragment) this.f44716c;
        int i2 = TodAdditionalPassengersSelectionDialogFragment.f40405i;
        C24362h.m61211f(todAdditionalPassengersSelectionDialogFragment, "this$0");
        C24362h.m61211f(numericStepperView, "<anonymous parameter 0>");
        ((C18156b) todAdditionalPassengersSelectionDialogFragment.f40406h.getValue()).f46392b.setValue(Integer.valueOf(i));
    }

    /* renamed from: h */
    public int mo256h(Object obj) {
        Format format = (Format) this.f44716c;
        C3941c cVar = (C3941c) obj;
        Pattern pattern = MediaCodecUtil.f13830a;
        try {
            return cVar.mo16079c(format) ? 1 : 0;
        } catch (MediaCodecUtil.DecoderQueryException unused) {
            return -1;
        }
    }

    public boolean invoke(Object obj) {
        switch (this.f44715b) {
            case 10:
                FutureCarpoolRide futureCarpoolRide = ((C14838d) this.f44716c).f37891h;
                ((C14838d.C14839a) obj).mo44906b();
                return true;
            case 13:
                ((C15241a.C15245d) obj).mo45733p(((C15241a) this.f44716c).f39314l);
                return false;
            case 15:
                String str = ((C15374a) this.f44716c).f39823h;
                ((C15374a.C15375a) obj).mo45971C();
                return true;
            default:
                int i = C15578a.f40521w;
                ((C15578a.C15580b) obj).mo44858D1(((C15578a) this.f44716c).mo46532s2());
                return true;
        }
    }

    public void onRefresh() {
        switch (this.f44715b) {
            case 25:
                int i = C12740b.f31473s;
                ((C12740b) this.f44716c).mo39539m2(true);
                return;
            default:
                int i2 = C7758e.f23537u;
                ((C7758e) this.f44716c).mo24250n2(true);
                return;
        }
    }

    public Task then(Object obj) {
        switch (this.f44715b) {
            case 8:
                return FirebaseMessaging.lambda$unsubscribeFromTopic$8((String) this.f44716c, (C16973g0) obj);
            case 9:
                return Tasks.forResult(Boolean.valueOf(PaymentAccount.m64175c((PaymentAccount) obj, ((C18951l) this.f44716c).f48252s, PaymentAccountContextStatus.CONNECTED)));
            case 12:
                C19779j jVar = (C19779j) this.f44716c;
                jVar.getClass();
                return Tasks.call(MoovitExecutors.f37327IO, new C19780k(jVar.f50282e, jVar.f50279b, jVar.f50280c, jVar.f50281d, (MotQrCodeTrip) obj));
            case 14:
                Itinerary itinerary = (Itinerary) this.f44716c;
                ExecutorService executorService = MoovitExecutors.f37327IO;
                int i = C20911a.f52657w;
                MVShareEntityType mVShareEntityType = MVShareEntityType.ITINERARY;
                String str = itinerary.f41894b;
                MVGetShareEntityLinkRequest mVGetShareEntityLinkRequest = new MVGetShareEntityLinkRequest();
                mVGetShareEntityLinkRequest.entityType = mVShareEntityType;
                mVGetShareEntityLinkRequest.entityId = str;
                mVGetShareEntityLinkRequest.itinerary = C16080a.m40961q(itinerary);
                return Tasks.call(executorService, new C20911a((C13752e) obj, mVGetShareEntityLinkRequest));
            case 19:
                C5577i iVar = C5577i.f18275d;
                return Tasks.call(MoovitExecutors.f37327IO, new C6573m((MicroMobilityPurchaseIntent) this.f44716c, (C13752e) obj));
            case 20:
                ServerId serverId = (ServerId) this.f44716c;
                C5577i iVar2 = C5577i.f18275d;
                MicroMobilityRide microMobilityRide = (MicroMobilityRide) C13723g.m34286g(((C1476d) obj).f5361a, new C18949j(serverId, 4));
                if (microMobilityRide != null) {
                    return Tasks.forResult(microMobilityRide);
                }
                return Tasks.forException(new ApplicationBugException("Couldn't find user wallet ride with id: " + serverId));
            case 21:
                C6689c cVar = (C6689c) this.f44716c;
                cVar.getClass();
                String uuid = UUID.randomUUID().toString();
                cVar.f20768b.mo4295e((MicroMobilityPurchaseStep) obj, uuid);
                return Tasks.forResult(uuid);
            case 22:
                C18337j jVar2 = (C18337j) this.f44716c;
                C18524c cVar2 = (C18524c) obj;
                int i2 = C18337j.f46761w;
                jVar2.getClass();
                jVar2.f46762u = cVar2.f47144m;
                return Tasks.forResult(new C20944i0(cVar2.f47145n, cVar2.f47146o));
            default:
                BigDecimal bigDecimal = C20283g.f51427r;
                return Tasks.call(MoovitExecutors.COMPUTATION, new C20295a(2, (PaymentOptions) this.f44716c, (PaymentSummaryInfo) obj));
        }
    }
}
