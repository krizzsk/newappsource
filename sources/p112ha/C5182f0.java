package p112ha;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import c00.C13723g;
import c70.C13752e;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.app.mot.purchase.model.MotQrCodeScanResult;
import com.moovit.image.C16017c;
import com.moovit.network.model.ServerId;
import com.moovit.ticketing.configuration.TicketingAgencyCapability;
import com.moovit.ticketing.purchase.PurchaseIntent;
import com.moovit.ticketing.ticket.Ticket;
import com.veriff.sdk.camera.core.CameraX;
import j90.C12789b;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;
import k90.C12819a;
import k90.C12820b;
import m80.C12887v;
import p112ha.C5199n0;
import p277ub.C6780f;
import p277ub.C6786k;
import p394br.C13661g;
import p523gu.C17230b;
import p572iw.C17661d;
import p664mu.C18436b;
import p664mu.C18437c;
import p785ry.C19384d;
import p80.C12991b;
import p805su.C19554k;
import p977zz.C20949l;
import q80.C13020i;
import s90.C13076d;

/* renamed from: ha.f0 */
public final /* synthetic */ class C5182f0 implements C6786k.C6788b, SuccessContinuation, C20949l, CallbackToFutureAdapter.C0674b {

    /* renamed from: b */
    public final /* synthetic */ int f17259b;

    /* renamed from: c */
    public final /* synthetic */ Object f17260c;

    /* renamed from: d */
    public final /* synthetic */ Object f17261d;

    public /* synthetic */ C5182f0(int i, Object obj, Object obj2) {
        this.f17259b = i;
        this.f17260c = obj;
        this.f17261d = obj2;
    }

    /* renamed from: a */
    public final void mo6655a(Object obj, C6780f fVar) {
        C5199n0 n0Var = (C5199n0) obj;
        SparseArray<C5199n0.C5200a> sparseArray = ((C5196m0) this.f17260c).f17274e;
        SparseArray sparseArray2 = new SparseArray(fVar.mo22950b());
        for (int i = 0; i < fVar.mo22950b(); i++) {
            int a = fVar.mo22949a(i);
            C5199n0.C5200a aVar = sparseArray.get(a);
            aVar.getClass();
            sparseArray2.append(a, aVar);
        }
        n0Var.mo20987z();
    }

    public final Object attachCompleter(CallbackToFutureAdapter.C0673a aVar) {
        return CameraX.lambda$initializeInstanceLocked$3((CameraX) this.f17260c, (Context) this.f17261d, aVar);
    }

    public final boolean invoke(Object obj) {
        Bundle bundle = (Bundle) this.f17261d;
        int i = C16017c.f41713p;
        ((C16017c.C16018a) obj).mo21528j0(bundle, (Exception) this.f17260c);
        return true;
    }

    public final Task then(Object obj) {
        switch (this.f17259b) {
            case 1:
                C19554k kVar = (C19554k) this.f17260c;
                Set set = (Set) obj;
                int i = C19554k.f49700n;
                kVar.getClass();
                ServerId c = ((MotQrCodeScanResult) this.f17261d).mo45611c();
                if (c != null) {
                    set.add(c);
                }
                C18437c cVar = C18437c.f47002b;
                Context requireContext = kVar.requireContext();
                cVar.getClass();
                if (C13717b.m34258e(set)) {
                    return Tasks.forResult(Collections.emptyList());
                }
                return Tasks.call(MoovitExecutors.SINGLE, new C18436b(0, cVar, requireContext, set));
            case 3:
                C13752e eVar = (C13752e) obj;
                ThreadPoolExecutor threadPoolExecutor = C12887v.f31893d;
                return Tasks.call(MoovitExecutors.f37327IO, new C13020i(eVar, (C12991b) this.f17260c, (PurchaseIntent) this.f17261d));
            default:
                C12991b bVar = (C12991b) this.f17260c;
                ServerId serverId = (ServerId) this.f17261d;
                C13076d dVar = (C13076d) obj;
                int i2 = C12820b.f31687v;
                C12789b bVar2 = (C12789b) C13723g.m34286g(dVar.f32348c, new C19384d(2, serverId));
                C12819a aVar = null;
                if (bVar2 != null) {
                    aVar = new C12819a(bVar2, C13720d.m34273c(bVar.f32159a.get(serverId), (C13722f) null, new C17230b(dVar, 2)), C13723g.m34281b(dVar.mo39943a(Ticket.Status.ACTIVE), new C17661d(serverId, 3)), C13723g.m34281b(dVar.mo39944b(C13076d.f32344g, Arrays.asList(new Ticket.Status[0])), new C13661g(serverId, 4)), bVar.mo39881b(TicketingAgencyCapability.STORED_VALUE));
                }
                return Tasks.forResult(aVar);
        }
    }
}
