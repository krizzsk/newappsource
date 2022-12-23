package com.veriff.sdk.camera.camera2.interop;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.veriff.sdk.camera.camera2.impl.Camera2ImplConfig;
import com.veriff.sdk.camera.camera2.internal.Camera2CameraControlImpl;
import com.veriff.sdk.camera.core.CameraControl;
import com.veriff.sdk.camera.core.impl.Config;
import com.veriff.sdk.camera.core.impl.utils.futures.Futures;
import ed0.C12633a;
import i20.C17555q;
import java.util.concurrent.Executor;
import p054d0.C4314v;
import p304x.C7041e;
import p304x.C7078n;
import p373au.C13533e;
import p695od.C18728c;

public final class Camera2CameraControl {
    private Camera2ImplConfig.Builder mBuilder = new Camera2ImplConfig.Builder();
    private final Camera2CameraControlImpl mCamera2CameraControlImpl;
    private final Camera2CameraControlImpl.CaptureResultListener mCaptureResultListener = new C12633a(this);
    public CallbackToFutureAdapter.C0673a<Void> mCompleter;
    public final Executor mExecutor;
    private boolean mIsActive = false;
    public final Object mLock = new Object();
    private boolean mPendingUpdate = false;

    public Camera2CameraControl(Camera2CameraControlImpl camera2CameraControlImpl, Executor executor) {
        this.mCamera2CameraControlImpl = camera2CameraControlImpl;
        this.mExecutor = executor;
    }

    private void addCaptureRequestOptionsInternal(CaptureRequestOptions captureRequestOptions) {
        synchronized (this.mLock) {
            for (Config.Option option : captureRequestOptions.listOptions()) {
                this.mBuilder.getMutableConfig().insertOption(option, captureRequestOptions.retrieveOption(option));
            }
        }
    }

    private void clearCaptureRequestOptionsInternal() {
        synchronized (this.mLock) {
            this.mBuilder = new Camera2ImplConfig.Builder();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$addCaptureRequestOptions$4(CallbackToFutureAdapter.C0673a aVar) throws Exception {
        this.mExecutor.execute(new C7078n(14, this, aVar));
        return "addCaptureRequestOptions";
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$clearCaptureRequestOptions$6(CallbackToFutureAdapter.C0673a aVar) throws Exception {
        this.mExecutor.execute(new C7041e(18, this, aVar));
        return "clearCaptureRequestOptions";
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ boolean lambda$new$0(android.hardware.camera2.TotalCaptureResult r3) {
        /*
            r2 = this;
            androidx.concurrent.futures.CallbackToFutureAdapter$a<java.lang.Void> r0 = r2.mCompleter
            r1 = 0
            if (r0 == 0) goto L_0x0032
            android.hardware.camera2.CaptureRequest r3 = r3.getRequest()
            java.lang.Object r3 = r3.getTag()
            boolean r0 = r3 instanceof com.veriff.sdk.camera.core.impl.TagBundle
            if (r0 == 0) goto L_0x0032
            com.veriff.sdk.camera.core.impl.TagBundle r3 = (com.veriff.sdk.camera.core.impl.TagBundle) r3
            java.lang.String r0 = "Camera2CameraControl"
            java.lang.Object r3 = r3.getTag(r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L_0x0032
            androidx.concurrent.futures.CallbackToFutureAdapter$a<java.lang.Void> r0 = r2.mCompleter
            int r0 = r0.hashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0032
            androidx.concurrent.futures.CallbackToFutureAdapter$a<java.lang.Void> r3 = r2.mCompleter
            r2.mCompleter = r1
            goto L_0x0033
        L_0x0032:
            r3 = r1
        L_0x0033:
            if (r3 == 0) goto L_0x0038
            r3.mo2697b(r1)
        L_0x0038:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.camera.camera2.interop.Camera2CameraControl.lambda$new$0(android.hardware.camera2.TotalCaptureResult):boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: setActiveInternal */
    public void lambda$setActive$7(boolean z) {
        if (this.mIsActive != z) {
            this.mIsActive = z;
            if (!z) {
                clearCaptureRequestOptionsInternal();
                CallbackToFutureAdapter.C0673a<Void> aVar = this.mCompleter;
                if (aVar != null) {
                    aVar.mo2698c(new CameraControl.OperationCanceledException("The camera control has became inactive."));
                    this.mCompleter = null;
                }
            } else if (this.mPendingUpdate) {
                updateSession();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: updateConfig */
    public void lambda$clearCaptureRequestOptions$5(CallbackToFutureAdapter.C0673a<Void> aVar) {
        this.mPendingUpdate = true;
        CallbackToFutureAdapter.C0673a<Void> aVar2 = this.mCompleter;
        if (aVar2 == null) {
            aVar2 = null;
        }
        this.mCompleter = aVar;
        if (this.mIsActive) {
            updateSession();
        }
        if (aVar2 != null) {
            aVar2.mo2698c(new CameraControl.OperationCanceledException("Camera2CameraControl was updated with new options."));
        }
    }

    private void updateSession() {
        this.mCamera2CameraControlImpl.updateSessionConfig();
        this.mPendingUpdate = false;
    }

    public C18728c<Void> addCaptureRequestOptions(CaptureRequestOptions captureRequestOptions) {
        addCaptureRequestOptionsInternal(captureRequestOptions);
        return Futures.nonCancellationPropagating(CallbackToFutureAdapter.m1884a(new C4314v(this, 22)));
    }

    public C18728c<Void> clearCaptureRequestOptions() {
        clearCaptureRequestOptionsInternal();
        return Futures.nonCancellationPropagating(CallbackToFutureAdapter.m1884a(new C13533e(this, 17)));
    }

    public Camera2ImplConfig getCamera2ImplConfig() {
        Camera2ImplConfig build;
        synchronized (this.mLock) {
            if (this.mCompleter != null) {
                this.mBuilder.getMutableConfig().insertOption(Camera2ImplConfig.CAPTURE_REQUEST_TAG_OPTION, Integer.valueOf(this.mCompleter.hashCode()));
            }
            build = this.mBuilder.build();
        }
        return build;
    }

    public Camera2CameraControlImpl.CaptureResultListener getCaptureRequestListener() {
        return this.mCaptureResultListener;
    }

    public void setActive(boolean z) {
        this.mExecutor.execute(new C17555q(1, this, z));
    }
}
