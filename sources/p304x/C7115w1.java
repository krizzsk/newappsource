package p304x;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.utils.executor.SequentialExecutor;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.C1043v;
import java.nio.BufferUnderflowException;
import java.util.concurrent.Executor;
import p001a0.C0022m;
import p001a0.C0027q;
import p054d0.C4289j0;
import p316y.C7225s;
import p583jk.C17884p;

/* renamed from: x.w1 */
public final class C7115w1 {

    /* renamed from: a */
    public final C7090q f22110a;

    /* renamed from: b */
    public final C1043v<Integer> f22111b;

    /* renamed from: c */
    public final boolean f22112c;

    /* renamed from: d */
    public final Executor f22113d;

    /* renamed from: e */
    public boolean f22114e;

    /* renamed from: f */
    public CallbackToFutureAdapter.C0673a<Void> f22115f;

    /* renamed from: g */
    public boolean f22116g;

    public C7115w1(C7090q qVar, C7225s sVar, SequentialExecutor sequentialExecutor) {
        boolean z;
        this.f22110a = qVar;
        this.f22113d = sequentialExecutor;
        if (C0022m.m93a(C0027q.class) != null) {
            C4289j0.m11435b("FlashAvailability");
            try {
                Boolean bool = (Boolean) sVar.mo23532a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
                if (bool == null) {
                    C4289j0.m11435b("FlashAvailability");
                }
                if (bool != null) {
                    z = bool.booleanValue();
                    this.f22112c = z;
                    this.f22111b = new C1043v<>(0);
                    this.f22110a.mo23326c(new C7108u1(this));
                }
            } catch (BufferUnderflowException unused) {
            }
        } else {
            Boolean bool2 = (Boolean) sVar.mo23532a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
            if (bool2 == null) {
                C4289j0.m11435b("FlashAvailability");
            }
            if (bool2 != null) {
                z = bool2.booleanValue();
                this.f22112c = z;
                this.f22111b = new C1043v<>(0);
                this.f22110a.mo23326c(new C7108u1(this));
            }
        }
        z = false;
        this.f22112c = z;
        this.f22111b = new C1043v<>(0);
        this.f22110a.mo23326c(new C7108u1(this));
    }

    /* renamed from: b */
    public static void m16651b(C1043v vVar, Integer num) {
        if (C17884p.m44340K()) {
            vVar.setValue(num);
        } else {
            vVar.postValue(num);
        }
    }

    /* renamed from: a */
    public final void mo23370a(CallbackToFutureAdapter.C0673a<Void> aVar, boolean z) {
        if (!this.f22112c) {
            if (aVar != null) {
                aVar.mo2698c(new IllegalStateException("No flash unit"));
            }
        } else if (!this.f22114e) {
            m16651b(this.f22111b, 0);
            if (aVar != null) {
                aVar.mo2698c(new CameraControl.OperationCanceledException("Camera is not active."));
            }
        } else {
            this.f22116g = z;
            this.f22110a.mo23330g(z);
            m16651b(this.f22111b, Integer.valueOf(z ? 1 : 0));
            CallbackToFutureAdapter.C0673a<Void> aVar2 = this.f22115f;
            if (aVar2 != null) {
                aVar2.mo2698c(new CameraControl.OperationCanceledException("There is a new enableTorch being set"));
            }
            this.f22115f = aVar;
        }
    }
}
