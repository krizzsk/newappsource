package com.veriff.sdk.camera.camera2.internal;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import com.veriff.sdk.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import com.veriff.sdk.camera.core.CameraSelector;
import com.veriff.sdk.camera.core.Logger;
import com.veriff.sdk.camera.core.UseCase;
import com.veriff.sdk.camera.core.impl.CaptureConfig;
import com.veriff.sdk.camera.core.impl.Config;
import com.veriff.sdk.camera.core.impl.DeferrableSurface;
import com.veriff.sdk.camera.core.impl.ImmediateSurface;
import com.veriff.sdk.camera.core.impl.MutableOptionsBundle;
import com.veriff.sdk.camera.core.impl.SessionConfig;
import com.veriff.sdk.camera.core.impl.UseCaseConfig;
import com.veriff.sdk.camera.core.impl.utils.executor.CameraXExecutors;
import com.veriff.sdk.camera.core.impl.utils.futures.FutureCallback;
import com.veriff.sdk.camera.core.impl.utils.futures.Futures;
import fd0.C12688i;
import fd0.C12690k;
import fd0.C12691l;
import gd0.C12732b;
import gd0.C12734d;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import p229r1.C6231a;

class MeteringRepeatingSession {
    private DeferrableSurface mDeferrableSurface;
    private final SessionConfig mSessionConfig;

    public static class MeteringRepeatingConfig implements UseCaseConfig<UseCase> {
        private final Config mConfig;

        public MeteringRepeatingConfig() {
            MutableOptionsBundle create = MutableOptionsBundle.create();
            create.insertOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, new Camera2SessionOptionUnpacker());
            this.mConfig = create;
        }

        public final /* synthetic */ boolean containsOption(Config.Option option) {
            return C12690k.m32418a(this, option);
        }

        public final /* synthetic */ void findOptions(String str, Config.OptionMatcher optionMatcher) {
            C12690k.m32419b(this, str, optionMatcher);
        }

        public final /* synthetic */ C6231a getAttachedUseCasesUpdateListener(C6231a aVar) {
            return C12691l.m32426a(this, aVar);
        }

        public final /* synthetic */ CameraSelector getCameraSelector(CameraSelector cameraSelector) {
            return C12691l.m32427b(this, cameraSelector);
        }

        public final /* synthetic */ CaptureConfig.OptionUnpacker getCaptureOptionUnpacker(CaptureConfig.OptionUnpacker optionUnpacker) {
            return C12691l.m32428c(this, optionUnpacker);
        }

        public Config getConfig() {
            return this.mConfig;
        }

        public final /* synthetic */ CaptureConfig getDefaultCaptureConfig(CaptureConfig captureConfig) {
            return C12691l.m32429d(this, captureConfig);
        }

        public final /* synthetic */ SessionConfig getDefaultSessionConfig(SessionConfig sessionConfig) {
            return C12691l.m32430e(this, sessionConfig);
        }

        public final /* synthetic */ int getInputFormat() {
            return C12688i.m32410a(this);
        }

        public final /* synthetic */ Config.OptionPriority getOptionPriority(Config.Option option) {
            return C12690k.m32420c(this, option);
        }

        public final /* synthetic */ Set getPriorities(Config.Option option) {
            return C12690k.m32421d(this, option);
        }

        public final /* synthetic */ SessionConfig.OptionUnpacker getSessionOptionUnpacker(SessionConfig.OptionUnpacker optionUnpacker) {
            return C12691l.m32431f(this, optionUnpacker);
        }

        public final /* synthetic */ int getSurfaceOccupancyPriority(int i) {
            return C12691l.m32432g(this, i);
        }

        public final /* synthetic */ String getTargetName(String str) {
            return C12732b.m32502a(this, str);
        }

        public final /* synthetic */ UseCase.EventCallback getUseCaseEventCallback(UseCase.EventCallback eventCallback) {
            return C12734d.m32504a(this, eventCallback);
        }

        public final /* synthetic */ Set listOptions() {
            return C12690k.m32422e(this);
        }

        public final /* synthetic */ Object retrieveOption(Config.Option option) {
            return C12690k.m32423f(this, option);
        }

        public final /* synthetic */ Object retrieveOption(Config.Option option, Object obj) {
            return C12690k.m32424g(this, option, obj);
        }

        public final /* synthetic */ Object retrieveOptionWithPriority(Config.Option option, Config.OptionPriority optionPriority) {
            return C12690k.m32425h(this, option, optionPriority);
        }
    }

    public MeteringRepeatingSession(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        MeteringRepeatingConfig meteringRepeatingConfig = new MeteringRepeatingConfig();
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        Size minimumPreviewSize = getMinimumPreviewSize(cameraCharacteristicsCompat);
        Logger.m32239d("MeteringRepeating", "MerteringSession SurfaceTexture size: " + minimumPreviewSize);
        surfaceTexture.setDefaultBufferSize(minimumPreviewSize.getWidth(), minimumPreviewSize.getHeight());
        final Surface surface = new Surface(surfaceTexture);
        SessionConfig.Builder createFrom = SessionConfig.Builder.createFrom(meteringRepeatingConfig);
        createFrom.setTemplateType(1);
        ImmediateSurface immediateSurface = new ImmediateSurface(surface);
        this.mDeferrableSurface = immediateSurface;
        Futures.addCallback(immediateSurface.getTerminationFuture(), new FutureCallback<Void>(this) {
            public void onFailure(Throwable th) {
                throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
            }

            public void onSuccess(Void voidR) {
                surface.release();
                surfaceTexture.release();
            }
        }, CameraXExecutors.directExecutor());
        createFrom.addSurface(this.mDeferrableSurface);
        this.mSessionConfig = createFrom.build();
    }

    private Size getMinimumPreviewSize(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        Size[] sizeArr;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristicsCompat.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            Logger.m32241e("MeteringRepeating", "Can not retrieve SCALER_STREAM_CONFIGURATION_MAP.");
            return new Size(0, 0);
        }
        if (Build.VERSION.SDK_INT < 23) {
            sizeArr = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
        } else {
            sizeArr = streamConfigurationMap.getOutputSizes(34);
        }
        if (sizeArr != null) {
            return (Size) Collections.min(Arrays.asList(sizeArr), new C12427a0());
        }
        Logger.m32241e("MeteringRepeating", "Can not get output size list.");
        return new Size(0, 0);
    }

    public void clear() {
        Logger.m32239d("MeteringRepeating", "MeteringRepeating clear!");
        DeferrableSurface deferrableSurface = this.mDeferrableSurface;
        if (deferrableSurface != null) {
            deferrableSurface.close();
        }
        this.mDeferrableSurface = null;
    }

    public String getName() {
        return "MeteringRepeating";
    }

    public SessionConfig getSessionConfig() {
        return this.mSessionConfig;
    }
}
