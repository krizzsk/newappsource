package p054d0;

import android.content.Context;
import android.database.Cursor;
import android.util.SparseArray;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0206a;
import androidx.camera.view.C0663e;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import c00.C13720d;
import c00.C13721e;
import c70.C13752e;
import com.android.billingclient.api.C1949f;
import com.android.billingclient.api.C1956l;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.Wallet;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.ads.C14748l;
import com.moovit.app.ads.MobileAdsManager;
import com.moovit.app.mot.model.MotActivationRegion;
import com.moovit.app.mot.model.MotActivationRegionFare;
import com.moovit.app.subscription.MoovitSubscriptionsManager;
import com.moovit.app.suggestedroutes.C15374a;
import com.moovit.design.view.NumericStepperView;
import com.moovit.network.model.ServerId;
import com.moovit.p421qr.QRCodeImageView;
import com.moovit.payment.account.personalinfo.PaymentAccountEditDetailsActivity;
import com.moovit.ticketing.activation.BaseTicketActivationActivity;
import com.moovit.ticketing.activation.C7632a;
import com.moovit.ticketing.purchase.PurchaseStep;
import com.moovit.ticketing.purchase.fare.TicketFare;
import com.moovit.ticketing.ticket.Ticket;
import com.moovit.ticketing.ticket.TicketDetailsActivity;
import com.moovit.transit.LocationDescriptor;
import com.moovit.view.ScheduleView;
import com.moovit.view.TransitLineListItemView;
import com.moovit.view.address.AddressInputView;
import com.tranzmate.moovit.protocol.ptb.activations.MVPTBRegionPrice;
import com.veriff.sdk.internal.C22713xw;
import com.veriff.sdk.internal.C22730yh;
import i30.C5268d;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import ka0.C12822a;
import m80.C12887v;
import p041ca.C1815d;
import p041ca.C1835u;
import p063da.C4407a;
import p066e0.C4462z;
import p203p1.C6031d;
import p237r9.C6269b;
import p304x.C7045f0;
import p531he.C17397e0;
import p531he.C17421w;
import p543hq.C17474b;
import p550hx.C17512b;
import p552hz.C17520c;
import p638lr.C18262i;
import p684nq.C18583d;
import p687nt.C18589b;
import p736pu.C19000i;
import p862vf.C20118b;
import p977zz.C20949l;
import p977zz.C20960q0;
import p977zz.C20961r;
import q80.C13024m;
import v80.C13186d;

/* renamed from: d0.k0 */
public final /* synthetic */ class C4291k0 implements C4462z.C4463a, Continuation, C13721e, C7045f0.C7051e.C7052a, CallbackToFutureAdapter.C0674b, C4407a.C4408a, C1835u.C1836a, SuccessContinuation, C20949l, QRCodeImageView.C16414a, C1956l, NumericStepperView.C15863a, C6031d, AddressInputView.C7937d, SwipeRefreshLayout.C1274f, ScheduleView.C7929c, C0206a, C22730yh.C22732a {

    /* renamed from: b */
    public final /* synthetic */ int f15211b;

    /* renamed from: c */
    public final /* synthetic */ Object f15212c;

    public /* synthetic */ C4291k0(Object obj, int i) {
        this.f15211b = i;
        this.f15212c = obj;
    }

    /* renamed from: C */
    public Object mo309C() {
        return Integer.valueOf(((C1815d) this.f15212c).mo6645F());
    }

    /* renamed from: a */
    public boolean mo19808a() {
        return ((AtomicBoolean) this.f15212c).get();
    }

    public Object apply(Object obj) {
        Map map = (Map) this.f15212c;
        Cursor cursor = (Cursor) obj;
        C6269b bVar = C1835u.f6351g;
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j), set);
            }
            set.add(new C1835u.C1837b(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    public Object attachCompleter(CallbackToFutureAdapter.C0673a aVar) {
        ((C0663e) this.f15212c).f2283k.set(aVar);
        return "textureViewImpl_waitForNextFrame";
    }

    /* renamed from: b */
    public void mo771b(Object obj) {
        ActivityResult activityResult = (ActivityResult) obj;
        ValueCallback andSet = ((C12822a) this.f15212c).f31701d.getAndSet((Object) null);
        if (andSet != null) {
            andSet.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(activityResult.f528b, activityResult.f529c));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2538c(p066e0.C4462z r8) {
        /*
            r7 = this;
            int r0 = r7.f15211b
            switch(r0) {
                case 0: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x0043
        L_0x0006:
            java.lang.Object r0 = r7.f15212c
            androidx.camera.core.q r0 = (androidx.camera.core.C0629q) r0
            java.lang.Object r1 = r0.f2150a
            monitor-enter(r1)
            boolean r2 = r0.f2153d     // Catch:{ all -> 0x0040 }
            if (r2 == 0) goto L_0x0013
            monitor-exit(r1)     // Catch:{ all -> 0x0040 }
            goto L_0x003e
        L_0x0013:
            r2 = 0
        L_0x0014:
            r3 = 0
            androidx.camera.core.p r3 = r8.acquireNextImage()     // Catch:{ IllegalStateException -> 0x0030 }
            if (r3 == 0) goto L_0x0035
            int r2 = r2 + 1
            android.util.LongSparseArray<androidx.camera.core.p> r4 = r0.f2158i     // Catch:{ all -> 0x0040 }
            d0.g0 r5 = r3.getImageInfo()     // Catch:{ all -> 0x0040 }
            long r5 = r5.getTimestamp()     // Catch:{ all -> 0x0040 }
            r4.put(r5, r3)     // Catch:{ all -> 0x0040 }
            r0.mo2563e()     // Catch:{ all -> 0x0040 }
            goto L_0x0035
        L_0x002e:
            r8 = move-exception
            goto L_0x003f
        L_0x0030:
            java.lang.String r4 = "MetadataImageReader"
            p054d0.C4289j0.m11435b(r4)     // Catch:{ all -> 0x002e }
        L_0x0035:
            if (r3 == 0) goto L_0x003d
            int r3 = r8.getMaxImages()     // Catch:{ all -> 0x0040 }
            if (r2 < r3) goto L_0x0014
        L_0x003d:
            monitor-exit(r1)     // Catch:{ all -> 0x0040 }
        L_0x003e:
            return
        L_0x003f:
            throw r8     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0040 }
            throw r8
        L_0x0043:
            java.lang.Object r0 = r7.f15212c
            d0.q0 r0 = (p054d0.C4304q0) r0
            java.lang.Object r1 = r0.f15232m
            monitor-enter(r1)
            r0.mo19821h(r8)     // Catch:{ all -> 0x004f }
            monitor-exit(r1)     // Catch:{ all -> 0x004f }
            return
        L_0x004f:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x004f }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p054d0.C4291k0.mo2538c(e0.z):void");
    }

    public Object convert(Object obj) {
        switch (this.f15211b) {
            case 0:
                MVPTBRegionPrice mVPTBRegionPrice = (MVPTBRegionPrice) obj;
                return new MotActivationRegionFare((MotActivationRegion) ((SparseArray) this.f15212c).get(mVPTBRegionPrice.regionId), C19000i.m46111b(mVPTBRegionPrice.activationPrice));
            default:
                return ((C5268d) this.f15212c).mo21064c((ServerId) obj);
        }
    }

    /* renamed from: d */
    public void mo19809d(List list) {
        TransitLineListItemView.m18058u((TransitLineListItemView) this.f15212c, list);
    }

    /* renamed from: e */
    public C22730yh mo19810e(C22713xw xwVar) {
        return C22730yh.m55514a((C22730yh) this.f15212c, xwVar);
    }

    /* renamed from: f */
    public void mo19811f(boolean z) {
        PaymentAccountEditDetailsActivity paymentAccountEditDetailsActivity = (PaymentAccountEditDetailsActivity) this.f15212c;
        int i = PaymentAccountEditDetailsActivity.f64077s0;
        if (z) {
            paymentAccountEditDetailsActivity.mo83543A2();
        } else {
            paymentAccountEditDetailsActivity.getClass();
        }
    }

    /* renamed from: g */
    public void mo19812g(NumericStepperView numericStepperView, int i) {
        int i2 = C17512b.f45080l;
        ((C17512b) this.f15212c).mo46413V1();
    }

    /* renamed from: h */
    public void mo19813h(C1949f fVar, ArrayList arrayList) {
        C20960q0 q0Var = (C20960q0) this.f15212c;
        HashSet hashSet = MoovitSubscriptionsManager.f39757g;
        if (fVar.f6770a == 0) {
            q0Var.invoke(new C20961r(arrayList));
            return;
        }
        StringBuilder k = C13555b.m33972k("Billing response code error: ");
        k.append(fVar.f6770a);
        q0Var.invoke(new C20961r((Exception) new IOException(k.toString())));
    }

    public boolean invoke(Object obj) {
        switch (this.f15211b) {
            case 7:
                int i = C18589b.f47322n;
                ((C18589b.C18590a) obj).mo50982N0((LocationDescriptor) this.f15212c);
                return false;
            case 10:
                String str = ((C15374a) this.f15212c).f39823h;
                ((C15374a.C15375a) obj).mo45972J();
                return true;
            case 12:
                int i2 = C17520c.f45103w;
                ((C17520c.C17521a) obj).mo49973a();
                return true;
            default:
                int i3 = C7632a.f23237h;
                ((C7632a.C7633a) obj).mo23973k((Ticket) this.f15212c);
                return true;
        }
    }

    public void onRefresh() {
        TicketDetailsActivity ticketDetailsActivity = (TicketDetailsActivity) this.f15212c;
        int i = TicketDetailsActivity.f23504m0;
        ticketDetailsActivity.getClass();
        ticketDetailsActivity.mo44545v2(new C17474b.C17475a(AnalyticsEventKey.PULL_TO_REFRESH).mo49933a());
        ticketDetailsActivity.f23506Z.mo23803d();
        ticketDetailsActivity.mo23966C2(true);
    }

    public Object then(Task task) {
        boolean z;
        switch (this.f15211b) {
            case 0:
                ((C17397e0) this.f15212c).getClass();
                if (task.isSuccessful()) {
                    C17421w wVar = (C17421w) task.getResult();
                    wVar.mo49859c();
                    File b = wVar.mo49858b();
                    if (b.delete()) {
                        b.getPath();
                    } else {
                        b.getPath();
                    }
                    z = true;
                } else {
                    task.getException();
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                int i = BaseTicketActivationActivity.f23235X;
                C18583d dVar = new C18583d(8);
                C18262i iVar = new C18262i(24);
                ArrayList arrayList = new ArrayList();
                C13720d.m34276f((List) this.f15212c, dVar, iVar, arrayList);
                return arrayList;
        }
    }

    public Task then(Object obj) {
        switch (this.f15211b) {
            case 5:
                Void voidR = (Void) obj;
                return ((C20118b) this.f15212c).mo52354a();
            case 6:
                ((MobileAdsManager) this.f15212c).f37473o.set(C14748l.m37128a());
                return Tasks.forResult((Boolean) obj);
            case 15:
                Wallet.WalletOptions.Builder builder = new Wallet.WalletOptions.Builder();
                builder.setEnvironment(1);
                return Wallet.getPaymentsClient((Context) this.f15212c, builder.build()).isReadyToPay((IsReadyToPayRequest) obj);
            case 16:
                C13752e eVar = (C13752e) obj;
                ThreadPoolExecutor threadPoolExecutor = C12887v.f31893d;
                return Tasks.call(MoovitExecutors.f37327IO, new C13024m(eVar, (TicketFare) this.f15212c));
            default:
                C13186d dVar = (C13186d) this.f15212c;
                dVar.getClass();
                String uuid = UUID.randomUUID().toString();
                dVar.f32739b.mo4295e((PurchaseStep) obj, uuid);
                return Tasks.forResult(uuid);
        }
    }
}
