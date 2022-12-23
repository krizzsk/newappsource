package com.veriff.sdk.camera.core;

import com.veriff.sdk.camera.core.CameraState;

final class AutoValue_CameraState extends CameraState {
    private final CameraState.StateError error;
    private final CameraState.Type type;

    public AutoValue_CameraState(CameraState.Type type2, CameraState.StateError stateError) {
        if (type2 != null) {
            this.type = type2;
            this.error = stateError;
            return;
        }
        throw new NullPointerException("Null type");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CameraState)) {
            return false;
        }
        CameraState cameraState = (CameraState) obj;
        if (this.type.equals(cameraState.getType())) {
            CameraState.StateError stateError = this.error;
            if (stateError == null) {
                if (cameraState.getError() == null) {
                    return true;
                }
            } else if (stateError.equals(cameraState.getError())) {
                return true;
            }
        }
        return false;
    }

    public CameraState.StateError getError() {
        return this.error;
    }

    public CameraState.Type getType() {
        return this.type;
    }

    public int hashCode() {
        int i;
        int hashCode = (this.type.hashCode() ^ 1000003) * 1000003;
        CameraState.StateError stateError = this.error;
        if (stateError == null) {
            i = 0;
        } else {
            i = stateError.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("CameraState{type=");
        k.append(this.type);
        k.append(", error=");
        k.append(this.error);
        k.append("}");
        return k.toString();
    }
}
