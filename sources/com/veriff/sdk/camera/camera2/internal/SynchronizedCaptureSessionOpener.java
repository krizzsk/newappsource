package com.veriff.sdk.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import com.veriff.sdk.camera.camera2.internal.SynchronizedCaptureSession;
import com.veriff.sdk.camera.camera2.internal.compat.params.OutputConfigurationCompat;
import com.veriff.sdk.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import com.veriff.sdk.camera.core.impl.DeferrableSurface;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p695od.C18728c;

final class SynchronizedCaptureSessionOpener {
    private final OpenerImpl mImpl;

    public static class Builder {
        private final CaptureSessionRepository mCaptureSessionRepository;
        private final Handler mCompatHandler;
        private final Set<String> mEnableFeature;
        private final Executor mExecutor;
        private final ScheduledExecutorService mScheduledExecutorService;

        public Builder(Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler, CaptureSessionRepository captureSessionRepository, int i) {
            HashSet hashSet = new HashSet();
            this.mEnableFeature = hashSet;
            this.mExecutor = executor;
            this.mScheduledExecutorService = scheduledExecutorService;
            this.mCompatHandler = handler;
            this.mCaptureSessionRepository = captureSessionRepository;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 23) {
                hashSet.add("force_close");
            }
            if (i == 2 || i2 <= 23) {
                hashSet.add("deferrableSurface_close");
            }
            if (i == 2) {
                hashSet.add("wait_for_request");
            }
        }

        public SynchronizedCaptureSessionOpener build() {
            if (this.mEnableFeature.isEmpty()) {
                return new SynchronizedCaptureSessionOpener(new SynchronizedCaptureSessionBaseImpl(this.mCaptureSessionRepository, this.mExecutor, this.mScheduledExecutorService, this.mCompatHandler));
            }
            return new SynchronizedCaptureSessionOpener(new SynchronizedCaptureSessionImpl(this.mEnableFeature, this.mCaptureSessionRepository, this.mExecutor, this.mScheduledExecutorService, this.mCompatHandler));
        }
    }

    public interface OpenerImpl {
        SessionConfigurationCompat createSessionConfigurationCompat(int i, List<OutputConfigurationCompat> list, SynchronizedCaptureSession.StateCallback stateCallback);

        Executor getExecutor();

        C18728c<Void> openCaptureSession(CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat, List<DeferrableSurface> list);

        C18728c<List<Surface>> startWithDeferrableSurface(List<DeferrableSurface> list, long j);

        boolean stop();
    }

    public SynchronizedCaptureSessionOpener(OpenerImpl openerImpl) {
        this.mImpl = openerImpl;
    }

    public SessionConfigurationCompat createSessionConfigurationCompat(int i, List<OutputConfigurationCompat> list, SynchronizedCaptureSession.StateCallback stateCallback) {
        return this.mImpl.createSessionConfigurationCompat(i, list, stateCallback);
    }

    public Executor getExecutor() {
        return this.mImpl.getExecutor();
    }

    public C18728c<Void> openCaptureSession(CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat, List<DeferrableSurface> list) {
        return this.mImpl.openCaptureSession(cameraDevice, sessionConfigurationCompat, list);
    }

    public C18728c<List<Surface>> startWithDeferrableSurface(List<DeferrableSurface> list, long j) {
        return this.mImpl.startWithDeferrableSurface(list, j);
    }

    public boolean stop() {
        return this.mImpl.stop();
    }
}
