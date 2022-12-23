package com.veriff.sdk.camera.core;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.util.Size;
import com.veriff.sdk.camera.core.impl.CameraControlInternal;
import com.veriff.sdk.camera.core.impl.CameraInfoInternal;
import com.veriff.sdk.camera.core.impl.CameraInternal;
import com.veriff.sdk.camera.core.impl.Config;
import com.veriff.sdk.camera.core.impl.ImageOutputConfig;
import com.veriff.sdk.camera.core.impl.MutableOptionsBundle;
import com.veriff.sdk.camera.core.impl.SessionConfig;
import com.veriff.sdk.camera.core.impl.UseCaseConfig;
import com.veriff.sdk.camera.core.impl.UseCaseConfigFactory;
import com.veriff.sdk.camera.core.internal.TargetConfig;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import mf0.C24361g;

public abstract class UseCase {
    private Size mAttachedResolution;
    private SessionConfig mAttachedSessionConfig = SessionConfig.defaultEmptySessionConfig();
    private CameraInternal mCamera;
    private UseCaseConfig<?> mCameraConfig;
    private final Object mCameraLock = new Object();
    private UseCaseConfig<?> mCurrentConfig;
    private UseCaseConfig<?> mExtendedConfig;
    private State mState = State.INACTIVE;
    private final Set<StateChangeCallback> mStateChangeCallbacks = new HashSet();
    private UseCaseConfig<?> mUseCaseConfig;
    private Rect mViewPortCropRect;

    /* renamed from: com.veriff.sdk.camera.core.UseCase$1 */
    public static /* synthetic */ class C125071 {
        public static final /* synthetic */ int[] $SwitchMap$com$veriff$sdk$camera$core$UseCase$State;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.veriff.sdk.camera.core.UseCase$State[] r0 = com.veriff.sdk.camera.core.UseCase.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$veriff$sdk$camera$core$UseCase$State = r0
                com.veriff.sdk.camera.core.UseCase$State r1 = com.veriff.sdk.camera.core.UseCase.State.INACTIVE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$veriff$sdk$camera$core$UseCase$State     // Catch:{ NoSuchFieldError -> 0x001d }
                com.veriff.sdk.camera.core.UseCase$State r1 = com.veriff.sdk.camera.core.UseCase.State.ACTIVE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.camera.core.UseCase.C125071.<clinit>():void");
        }
    }

    public interface EventCallback {
        void onAttach(CameraInfo cameraInfo);

        void onDetach();
    }

    public enum State {
        ACTIVE,
        INACTIVE
    }

    public interface StateChangeCallback {
        void onUseCaseActive(UseCase useCase);

        void onUseCaseInactive(UseCase useCase);

        void onUseCaseReset(UseCase useCase);

        void onUseCaseUpdated(UseCase useCase);
    }

    public UseCase(UseCaseConfig<?> useCaseConfig) {
        this.mUseCaseConfig = useCaseConfig;
        this.mCurrentConfig = useCaseConfig;
    }

    private void addStateChangeCallback(StateChangeCallback stateChangeCallback) {
        this.mStateChangeCallbacks.add(stateChangeCallback);
    }

    private void removeStateChangeCallback(StateChangeCallback stateChangeCallback) {
        this.mStateChangeCallbacks.remove(stateChangeCallback);
    }

    public Size getAttachedSurfaceResolution() {
        return this.mAttachedResolution;
    }

    public CameraInternal getCamera() {
        CameraInternal cameraInternal;
        synchronized (this.mCameraLock) {
            cameraInternal = this.mCamera;
        }
        return cameraInternal;
    }

    public CameraControlInternal getCameraControl() {
        synchronized (this.mCameraLock) {
            CameraInternal cameraInternal = this.mCamera;
            if (cameraInternal == null) {
                CameraControlInternal cameraControlInternal = CameraControlInternal.DEFAULT_EMPTY_INSTANCE;
                return cameraControlInternal;
            }
            CameraControlInternal cameraControlInternal2 = cameraInternal.getCameraControlInternal();
            return cameraControlInternal2;
        }
    }

    public String getCameraId() {
        CameraInternal camera = getCamera();
        C24361g.m61185s(camera, "No camera attached to use case: " + this);
        return camera.getCameraInfoInternal().getCameraId();
    }

    public UseCaseConfig<?> getCurrentConfig() {
        return this.mCurrentConfig;
    }

    public abstract UseCaseConfig<?> getDefaultConfig(boolean z, UseCaseConfigFactory useCaseConfigFactory);

    public int getImageFormat() {
        return this.mCurrentConfig.getInputFormat();
    }

    public String getName() {
        UseCaseConfig<?> useCaseConfig = this.mCurrentConfig;
        StringBuilder k = C13555b.m33972k("<UnknownUseCase-");
        k.append(hashCode());
        k.append(">");
        return useCaseConfig.getTargetName(k.toString());
    }

    public int getRelativeRotation(CameraInternal cameraInternal) {
        return cameraInternal.getCameraInfoInternal().getSensorRotationDegrees(getTargetRotationInternal());
    }

    public SessionConfig getSessionConfig() {
        return this.mAttachedSessionConfig;
    }

    @SuppressLint({"WrongConstant"})
    public int getTargetRotationInternal() {
        return ((ImageOutputConfig) this.mCurrentConfig).getTargetRotation(0);
    }

    public abstract UseCaseConfig.Builder<?, ?, ?> getUseCaseConfigBuilder(Config config);

    public Rect getViewPortCropRect() {
        return this.mViewPortCropRect;
    }

    public boolean isCurrentCamera(String str) {
        if (getCamera() == null) {
            return false;
        }
        return Objects.equals(str, getCameraId());
    }

    public UseCaseConfig<?> mergeConfigs(CameraInfoInternal cameraInfoInternal, UseCaseConfig<?> useCaseConfig, UseCaseConfig<?> useCaseConfig2) {
        MutableOptionsBundle mutableOptionsBundle;
        if (useCaseConfig2 != null) {
            mutableOptionsBundle = MutableOptionsBundle.from(useCaseConfig2);
            mutableOptionsBundle.removeOption(TargetConfig.OPTION_TARGET_NAME);
        } else {
            mutableOptionsBundle = MutableOptionsBundle.create();
        }
        for (Config.Option next : this.mUseCaseConfig.listOptions()) {
            mutableOptionsBundle.insertOption(next, this.mUseCaseConfig.getOptionPriority(next), this.mUseCaseConfig.retrieveOption(next));
        }
        if (useCaseConfig != null) {
            for (Config.Option next2 : useCaseConfig.listOptions()) {
                if (!next2.getId().equals(TargetConfig.OPTION_TARGET_NAME.getId())) {
                    mutableOptionsBundle.insertOption(next2, useCaseConfig.getOptionPriority(next2), useCaseConfig.retrieveOption(next2));
                }
            }
        }
        if (mutableOptionsBundle.containsOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION)) {
            Config.Option<Integer> option = ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO;
            if (mutableOptionsBundle.containsOption(option)) {
                mutableOptionsBundle.removeOption(option);
            }
        }
        return onMergeConfig(cameraInfoInternal, getUseCaseConfigBuilder(mutableOptionsBundle));
    }

    public final void notifyActive() {
        this.mState = State.ACTIVE;
        notifyState();
    }

    public final void notifyInactive() {
        this.mState = State.INACTIVE;
        notifyState();
    }

    public final void notifyReset() {
        for (StateChangeCallback onUseCaseReset : this.mStateChangeCallbacks) {
            onUseCaseReset.onUseCaseReset(this);
        }
    }

    public final void notifyState() {
        int i = C125071.$SwitchMap$com$veriff$sdk$camera$core$UseCase$State[this.mState.ordinal()];
        if (i == 1) {
            for (StateChangeCallback onUseCaseInactive : this.mStateChangeCallbacks) {
                onUseCaseInactive.onUseCaseInactive(this);
            }
        } else if (i == 2) {
            for (StateChangeCallback onUseCaseActive : this.mStateChangeCallbacks) {
                onUseCaseActive.onUseCaseActive(this);
            }
        }
    }

    public final void notifyUpdated() {
        for (StateChangeCallback onUseCaseUpdated : this.mStateChangeCallbacks) {
            onUseCaseUpdated.onUseCaseUpdated(this);
        }
    }

    @SuppressLint({"WrongConstant"})
    public void onAttach(CameraInternal cameraInternal, UseCaseConfig<?> useCaseConfig, UseCaseConfig<?> useCaseConfig2) {
        synchronized (this.mCameraLock) {
            this.mCamera = cameraInternal;
            addStateChangeCallback(cameraInternal);
        }
        this.mExtendedConfig = useCaseConfig;
        this.mCameraConfig = useCaseConfig2;
        UseCaseConfig<?> mergeConfigs = mergeConfigs(cameraInternal.getCameraInfoInternal(), this.mExtendedConfig, this.mCameraConfig);
        this.mCurrentConfig = mergeConfigs;
        EventCallback useCaseEventCallback = mergeConfigs.getUseCaseEventCallback((EventCallback) null);
        if (useCaseEventCallback != null) {
            useCaseEventCallback.onAttach(cameraInternal.getCameraInfoInternal());
        }
        onAttached();
    }

    public void onAttached() {
    }

    public void onCameraControlReady() {
    }

    public void onDetach(CameraInternal cameraInternal) {
        boolean z;
        onDetached();
        EventCallback useCaseEventCallback = this.mCurrentConfig.getUseCaseEventCallback((EventCallback) null);
        if (useCaseEventCallback != null) {
            useCaseEventCallback.onDetach();
        }
        synchronized (this.mCameraLock) {
            if (cameraInternal == this.mCamera) {
                z = true;
            } else {
                z = false;
            }
            C24361g.m61175n(z);
            removeStateChangeCallback(this.mCamera);
            this.mCamera = null;
        }
        this.mAttachedResolution = null;
        this.mViewPortCropRect = null;
        this.mCurrentConfig = this.mUseCaseConfig;
        this.mExtendedConfig = null;
        this.mCameraConfig = null;
    }

    public void onDetached() {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.veriff.sdk.camera.core.impl.UseCaseConfig$Builder<?, ?, ?>, com.veriff.sdk.camera.core.impl.UseCaseConfig$Builder] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.veriff.sdk.camera.core.impl.UseCaseConfig<?> onMergeConfig(com.veriff.sdk.camera.core.impl.CameraInfoInternal r1, com.veriff.sdk.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> r2) {
        /*
            r0 = this;
            com.veriff.sdk.camera.core.impl.UseCaseConfig r1 = r2.getUseCaseConfig()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.camera.core.UseCase.onMergeConfig(com.veriff.sdk.camera.core.impl.CameraInfoInternal, com.veriff.sdk.camera.core.impl.UseCaseConfig$Builder):com.veriff.sdk.camera.core.impl.UseCaseConfig");
    }

    public void onStateAttached() {
        onCameraControlReady();
    }

    public void onStateDetached() {
    }

    public abstract Size onSuggestedResolutionUpdated(Size size);

    public void setViewPortCropRect(Rect rect) {
        this.mViewPortCropRect = rect;
    }

    public void updateSessionConfig(SessionConfig sessionConfig) {
        this.mAttachedSessionConfig = sessionConfig;
    }

    public void updateSuggestedResolution(Size size) {
        this.mAttachedResolution = onSuggestedResolutionUpdated(size);
    }
}
