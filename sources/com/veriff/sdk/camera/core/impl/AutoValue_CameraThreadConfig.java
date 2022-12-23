package com.veriff.sdk.camera.core.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

final class AutoValue_CameraThreadConfig extends CameraThreadConfig {
    private final Executor cameraExecutor;
    private final Handler schedulerHandler;

    public AutoValue_CameraThreadConfig(Executor executor, Handler handler) {
        if (executor != null) {
            this.cameraExecutor = executor;
            if (handler != null) {
                this.schedulerHandler = handler;
                return;
            }
            throw new NullPointerException("Null schedulerHandler");
        }
        throw new NullPointerException("Null cameraExecutor");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CameraThreadConfig)) {
            return false;
        }
        CameraThreadConfig cameraThreadConfig = (CameraThreadConfig) obj;
        if (!this.cameraExecutor.equals(cameraThreadConfig.getCameraExecutor()) || !this.schedulerHandler.equals(cameraThreadConfig.getSchedulerHandler())) {
            return false;
        }
        return true;
    }

    public Executor getCameraExecutor() {
        return this.cameraExecutor;
    }

    public Handler getSchedulerHandler() {
        return this.schedulerHandler;
    }

    public int hashCode() {
        return ((this.cameraExecutor.hashCode() ^ 1000003) * 1000003) ^ this.schedulerHandler.hashCode();
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("CameraThreadConfig{cameraExecutor=");
        k.append(this.cameraExecutor);
        k.append(", schedulerHandler=");
        k.append(this.schedulerHandler);
        k.append("}");
        return k.toString();
    }
}
