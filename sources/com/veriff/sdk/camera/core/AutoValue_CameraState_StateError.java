package com.veriff.sdk.camera.core;

import com.veriff.sdk.camera.core.CameraState;

final class AutoValue_CameraState_StateError extends CameraState.StateError {
    private final Throwable cause;
    private final int code;

    public AutoValue_CameraState_StateError(int i, Throwable th) {
        this.code = i;
        this.cause = th;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CameraState.StateError)) {
            return false;
        }
        CameraState.StateError stateError = (CameraState.StateError) obj;
        if (this.code == stateError.getCode()) {
            Throwable th = this.cause;
            if (th == null) {
                if (stateError.getCause() == null) {
                    return true;
                }
            } else if (th.equals(stateError.getCause())) {
                return true;
            }
        }
        return false;
    }

    public Throwable getCause() {
        return this.cause;
    }

    public int getCode() {
        return this.code;
    }

    public int hashCode() {
        int i;
        int i2 = (this.code ^ 1000003) * 1000003;
        Throwable th = this.cause;
        if (th == null) {
            i = 0;
        } else {
            i = th.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("StateError{code=");
        k.append(this.code);
        k.append(", cause=");
        k.append(this.cause);
        k.append("}");
        return k.toString();
    }
}
