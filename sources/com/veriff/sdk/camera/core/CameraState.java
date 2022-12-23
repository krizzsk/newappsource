package com.veriff.sdk.camera.core;

public abstract class CameraState {

    public static abstract class StateError {
        public static StateError create(int i) {
            return create(i, (Throwable) null);
        }

        public abstract Throwable getCause();

        public abstract int getCode();

        public static StateError create(int i, Throwable th) {
            return new AutoValue_CameraState_StateError(i, th);
        }
    }

    public enum Type {
        PENDING_OPEN,
        OPENING,
        OPEN,
        CLOSING,
        CLOSED
    }

    public static CameraState create(Type type) {
        return create(type, (StateError) null);
    }

    public abstract StateError getError();

    public abstract Type getType();

    public static CameraState create(Type type, StateError stateError) {
        return new AutoValue_CameraState(type, stateError);
    }
}
