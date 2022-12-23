package com.veriff.sdk.camera.camera2.internal;

import androidx.lifecycle.C1043v;
import androidx.lifecycle.LiveData;
import com.veriff.sdk.camera.core.CameraState;
import com.veriff.sdk.camera.core.Logger;
import com.veriff.sdk.camera.core.impl.CameraInternal;
import com.veriff.sdk.camera.core.impl.CameraStateRegistry;
import java.util.Objects;

class CameraStateMachine {
    private final CameraStateRegistry mCameraStateRegistry;
    private final C1043v<CameraState> mCameraStates;

    /* renamed from: com.veriff.sdk.camera.camera2.internal.CameraStateMachine$1 */
    public static /* synthetic */ class C124131 {
        public static final /* synthetic */ int[] $SwitchMap$com$veriff$sdk$camera$core$impl$CameraInternal$State;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.veriff.sdk.camera.core.impl.CameraInternal$State[] r0 = com.veriff.sdk.camera.core.impl.CameraInternal.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$veriff$sdk$camera$core$impl$CameraInternal$State = r0
                com.veriff.sdk.camera.core.impl.CameraInternal$State r1 = com.veriff.sdk.camera.core.impl.CameraInternal.State.PENDING_OPEN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$veriff$sdk$camera$core$impl$CameraInternal$State     // Catch:{ NoSuchFieldError -> 0x001d }
                com.veriff.sdk.camera.core.impl.CameraInternal$State r1 = com.veriff.sdk.camera.core.impl.CameraInternal.State.OPENING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$veriff$sdk$camera$core$impl$CameraInternal$State     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.veriff.sdk.camera.core.impl.CameraInternal$State r1 = com.veriff.sdk.camera.core.impl.CameraInternal.State.OPEN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$veriff$sdk$camera$core$impl$CameraInternal$State     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.veriff.sdk.camera.core.impl.CameraInternal$State r1 = com.veriff.sdk.camera.core.impl.CameraInternal.State.CLOSING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$veriff$sdk$camera$core$impl$CameraInternal$State     // Catch:{ NoSuchFieldError -> 0x003e }
                com.veriff.sdk.camera.core.impl.CameraInternal$State r1 = com.veriff.sdk.camera.core.impl.CameraInternal.State.RELEASING     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$veriff$sdk$camera$core$impl$CameraInternal$State     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.veriff.sdk.camera.core.impl.CameraInternal$State r1 = com.veriff.sdk.camera.core.impl.CameraInternal.State.CLOSED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$com$veriff$sdk$camera$core$impl$CameraInternal$State     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.veriff.sdk.camera.core.impl.CameraInternal$State r1 = com.veriff.sdk.camera.core.impl.CameraInternal.State.RELEASED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.camera.camera2.internal.CameraStateMachine.C124131.<clinit>():void");
        }
    }

    public CameraStateMachine(CameraStateRegistry cameraStateRegistry) {
        this.mCameraStateRegistry = cameraStateRegistry;
        C1043v<CameraState> vVar = new C1043v<>();
        this.mCameraStates = vVar;
        vVar.postValue(CameraState.create(CameraState.Type.CLOSED));
    }

    private CameraState onCameraPendingOpen() {
        if (this.mCameraStateRegistry.isCameraClosing()) {
            return CameraState.create(CameraState.Type.OPENING);
        }
        return CameraState.create(CameraState.Type.PENDING_OPEN);
    }

    public LiveData<CameraState> getStateLiveData() {
        return this.mCameraStates;
    }

    public void updateState(CameraInternal.State state, CameraState.StateError stateError) {
        CameraState cameraState;
        switch (C124131.$SwitchMap$com$veriff$sdk$camera$core$impl$CameraInternal$State[state.ordinal()]) {
            case 1:
                cameraState = onCameraPendingOpen();
                break;
            case 2:
                cameraState = CameraState.create(CameraState.Type.OPENING, stateError);
                break;
            case 3:
                cameraState = CameraState.create(CameraState.Type.OPEN, stateError);
                break;
            case 4:
            case 5:
                cameraState = CameraState.create(CameraState.Type.CLOSING, stateError);
                break;
            case 6:
            case 7:
                cameraState = CameraState.create(CameraState.Type.CLOSED, stateError);
                break;
            default:
                throw new IllegalStateException("Unknown internal camera state: " + state);
        }
        Logger.m32239d("CameraStateMachine", "New public camera state " + cameraState + " from " + state + " and " + stateError);
        if (!Objects.equals(this.mCameraStates.getValue(), cameraState)) {
            Logger.m32239d("CameraStateMachine", "Publishing new public camera state " + cameraState);
            this.mCameraStates.postValue(cameraState);
        }
    }
}
