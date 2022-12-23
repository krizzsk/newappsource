package com.veriff.sdk.camera.core.impl;

import com.veriff.sdk.camera.core.Camera;
import com.veriff.sdk.camera.core.CameraInfo;
import com.veriff.sdk.camera.core.UseCase;
import java.util.Collection;
import p695od.C18728c;

public interface CameraInternal extends Camera, UseCase.StateChangeCallback {

    public enum State {
        PENDING_OPEN(false),
        OPENING(true),
        OPEN(true),
        CLOSING(true),
        CLOSED(false),
        RELEASING(true),
        RELEASED(false);
        
        private final boolean mHoldsCameraSlot;

        private State(boolean z) {
            this.mHoldsCameraSlot = z;
        }

        public boolean holdsCameraSlot() {
            return this.mHoldsCameraSlot;
        }
    }

    void attachUseCases(Collection<UseCase> collection);

    void detachUseCases(Collection<UseCase> collection);

    CameraControlInternal getCameraControlInternal();

    CameraInfo getCameraInfo();

    CameraInfoInternal getCameraInfoInternal();

    Observable<State> getCameraState();

    C18728c<Void> release();
}
