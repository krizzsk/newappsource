package p304x;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.camera2.internal.CaptureSession;
import androidx.camera.core.impl.DeferrableSurface;
import com.google.android.play.core.appupdate.C14226d;
import java.util.ArrayList;
import java.util.Arrays;
import p030bo.app.C1600i0;
import p030bo.app.C1729y;
import p102h0.C5035n;
import p316y.C7208f;
import p695od.C18728c;

/* renamed from: x.x */
public final /* synthetic */ class C7116x implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f22117b;

    /* renamed from: c */
    public final /* synthetic */ Object f22118c;

    /* renamed from: d */
    public final /* synthetic */ Object f22119d;

    /* renamed from: e */
    public final /* synthetic */ Object f22120e;

    /* renamed from: f */
    public final /* synthetic */ Object f22121f;

    public /* synthetic */ C7116x(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f22117b = i;
        this.f22118c = obj;
        this.f22119d = obj2;
        this.f22120e = obj3;
        this.f22121f = obj4;
    }

    public final void run() {
        switch (this.f22117b) {
            case 0:
                Camera2CameraImpl camera2CameraImpl = (Camera2CameraImpl) this.f22118c;
                CaptureSession captureSession = (CaptureSession) this.f22119d;
                DeferrableSurface deferrableSurface = (DeferrableSurface) this.f22120e;
                camera2CameraImpl.f1701r.remove(captureSession);
                C18728c r = camera2CameraImpl.mo2257r(captureSession);
                deferrableSurface.mo2450a();
                new C5035n(new ArrayList(Arrays.asList(new C18728c[]{r, deferrableSurface.mo2453d()})), false, C14226d.m35352s0()).addListener((Runnable) this.f22121f, C14226d.m35352s0());
                return;
            case 1:
                ((C7208f.C7210b) this.f22118c).f22334a.onCaptureFailed((CameraCaptureSession) this.f22119d, (CaptureRequest) this.f22120e, (CaptureFailure) this.f22121f);
                return;
            default:
                ((C1729y.C1731b) this.f22118c).m4937a((Intent) this.f22119d, (C1600i0) this.f22120e, (BroadcastReceiver.PendingResult) this.f22121f);
                return;
        }
    }
}
