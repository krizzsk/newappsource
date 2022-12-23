package p054d0;

import android.content.Context;
import android.os.SystemClock;
import android.view.MenuItem;
import android.view.Surface;
import androidx.appcompat.widget.C0475w0;
import androidx.camera.core.C0550f;
import androidx.camera.core.CameraX;
import androidx.camera.view.C0663e;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.android.play.core.appupdate.C14226d;
import com.moovit.payment.account.bank.BankPaymentMethod;
import com.moovit.payment.account.paymentmethod.PaymentAccountPaymentMethodsFragment;
import com.moovit.payment.account.paymentmethod.PaymentMethod;
import com.moovit.payment.clearance.ClearanceProvider;
import com.moovit.payment.clearance.ClearanceProviderType;
import java.util.concurrent.Executor;
import p028ba.C1515i;
import p063da.C4407a;
import p176n0.C5795n;
import p275u9.C6751s;
import p977zz.C20949l;
import q50.C19080b;
import v40.C25750e;

/* renamed from: d0.m */
public final /* synthetic */ class C4294m implements CallbackToFutureAdapter.C0674b, C4407a.C4408a, C0475w0.C0476a, C20949l {

    /* renamed from: b */
    public final /* synthetic */ int f15216b;

    /* renamed from: c */
    public final /* synthetic */ Object f15217c;

    /* renamed from: d */
    public final /* synthetic */ Object f15218d;

    public /* synthetic */ C4294m(int i, Object obj, Object obj2) {
        this.f15216b = i;
        this.f15217c = obj;
        this.f15218d = obj2;
    }

    /* renamed from: C */
    public final Object mo309C() {
        return Boolean.valueOf(((C1515i) this.f15217c).f5444c.mo6648J((C6751s) this.f15218d));
    }

    public final Object attachCompleter(CallbackToFutureAdapter.C0673a aVar) {
        switch (this.f15216b) {
            case 0:
                CameraX cameraX = (CameraX) this.f15217c;
                Executor executor = cameraX.f1831d;
                executor.execute(new C0550f(cameraX, (Context) this.f15218d, executor, aVar, SystemClock.elapsedRealtime()));
                return "CameraX initInternal";
            case 1:
                C0663e eVar = (C0663e) this.f15217c;
                Surface surface = (Surface) this.f15218d;
                eVar.getClass();
                C4289j0.m11435b("TextureViewImpl");
                eVar.f2280h.mo2359a(surface, C14226d.m35352s0(), new C5795n(aVar, 0));
                return "provideSurface[request=" + eVar.f2280h + " surface=" + surface + "]";
            default:
                return ((com.veriff.sdk.camera.core.CameraX) this.f15217c).lambda$initInternal$7((Context) this.f15218d, aVar);
        }
    }

    public final boolean invoke(Object obj) {
        int i = C19080b.f48501o;
        ((ClearanceProvider.C16293a) obj).mo48834o1((ClearanceProviderType) this.f15217c, (PaymentMethod) this.f15218d);
        return true;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        PaymentAccountPaymentMethodsFragment.C25687c cVar = (PaymentAccountPaymentMethodsFragment.C25687c) this.f15217c;
        BankPaymentMethod bankPaymentMethod = (BankPaymentMethod) this.f15218d;
        cVar.getClass();
        if (menuItem.getItemId() != C25750e.action_delete) {
            return false;
        }
        PaymentAccountPaymentMethodsFragment.m64194n2(PaymentAccountPaymentMethodsFragment.this, bankPaymentMethod.f64052b);
        return false;
    }
}
