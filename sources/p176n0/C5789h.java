package p176n0;

import androidx.camera.camera2.internal.C0509c;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.view.C0655a;
import androidx.camera.view.C0658c;
import androidx.camera.view.PreviewView;
import b50.C25544a;
import c70.C13752e;
import com.cubic.umo.pass.model.AgencyInformation;
import com.cubic.umo.pass.model.BillingAddress;
import com.cubic.umo.pass.model.CreditCard;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.appupdate.C14226d;
import com.moovit.MoovitExecutors;
import com.moovit.payment.account.deposit.DepositInstructions;
import com.moovit.payment.account.paymentmethod.PaymentMethod;
import com.moovit.payment.clearance.PaymentMethodToken;
import java.util.concurrent.atomic.AtomicReference;
import p066e0.C4421d0;
import p102h0.C5019d;
import w90.C13222b;
import w90.C13226d;

/* renamed from: n0.h */
public final /* synthetic */ class C5789h implements C0658c.C0659a, SuccessContinuation {

    /* renamed from: b */
    public final /* synthetic */ int f18735b;

    /* renamed from: c */
    public final /* synthetic */ Object f18736c;

    /* renamed from: d */
    public final /* synthetic */ Object f18737d;

    /* renamed from: e */
    public final /* synthetic */ Object f18738e;

    public /* synthetic */ C5789h(int i, Object obj, Object obj2, Object obj3) {
        this.f18735b = i;
        this.f18736c = obj;
        this.f18737d = obj2;
        this.f18738e = obj3;
    }

    /* renamed from: a */
    public final void mo21664a() {
        boolean z;
        C0655a aVar = (C0655a) this.f18737d;
        CameraInternal cameraInternal = (CameraInternal) this.f18738e;
        AtomicReference<C0655a> atomicReference = PreviewView.this.f2240g;
        while (true) {
            if (!atomicReference.compareAndSet(aVar, (Object) null)) {
                if (atomicReference.get() != aVar) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        if (z) {
            aVar.mo2635a(PreviewView.StreamState.IDLE);
        }
        C5019d dVar = aVar.f2255e;
        if (dVar != null) {
            dVar.cancel(false);
            aVar.f2255e = null;
        }
        C4421d0 cameraState = cameraInternal.getCameraState();
        synchronized (cameraState.f15491b) {
            C4421d0.C4422a aVar2 = (C4421d0.C4422a) cameraState.f15491b.remove(aVar);
            if (aVar2 != null) {
                aVar2.f15492a.set(false);
                C14226d.m35358z0().execute(new C0509c(2, cameraState, aVar2));
            }
        }
    }

    public final Task then(Object obj) {
        switch (this.f18735b) {
            case 1:
                C13752e eVar = (C13752e) obj;
                return Tasks.call(MoovitExecutors.f37327IO, new C25544a(eVar, ((DepositInstructions) this.f18736c).f63958b, ((PaymentMethod) this.f18737d).f64052b, (PaymentMethodToken) this.f18738e));
            default:
                C13222b bVar = (C13222b) this.f18736c;
                AgencyInformation agencyInformation = (AgencyInformation) obj;
                C13222b bVar2 = C13222b.f32795d;
                bVar.getClass();
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                bVar.f32798c.mo11667c((CreditCard) this.f18737d, (BillingAddress) this.f18738e, new C13226d(taskCompletionSource));
                return taskCompletionSource.getTask();
        }
    }
}
