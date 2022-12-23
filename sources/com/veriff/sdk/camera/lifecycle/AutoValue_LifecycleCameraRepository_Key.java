package com.veriff.sdk.camera.lifecycle;

import androidx.lifecycle.C1033p;
import com.veriff.sdk.camera.core.internal.CameraUseCaseAdapter;
import com.veriff.sdk.camera.lifecycle.LifecycleCameraRepository;

final class AutoValue_LifecycleCameraRepository_Key extends LifecycleCameraRepository.Key {
    private final CameraUseCaseAdapter.CameraId cameraId;
    private final C1033p lifecycleOwner;

    public AutoValue_LifecycleCameraRepository_Key(C1033p pVar, CameraUseCaseAdapter.CameraId cameraId2) {
        if (pVar != null) {
            this.lifecycleOwner = pVar;
            if (cameraId2 != null) {
                this.cameraId = cameraId2;
                return;
            }
            throw new NullPointerException("Null cameraId");
        }
        throw new NullPointerException("Null lifecycleOwner");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LifecycleCameraRepository.Key)) {
            return false;
        }
        LifecycleCameraRepository.Key key = (LifecycleCameraRepository.Key) obj;
        if (!this.lifecycleOwner.equals(key.getLifecycleOwner()) || !this.cameraId.equals(key.getCameraId())) {
            return false;
        }
        return true;
    }

    public CameraUseCaseAdapter.CameraId getCameraId() {
        return this.cameraId;
    }

    public C1033p getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public int hashCode() {
        return ((this.lifecycleOwner.hashCode() ^ 1000003) * 1000003) ^ this.cameraId.hashCode();
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("Key{lifecycleOwner=");
        k.append(this.lifecycleOwner);
        k.append(", cameraId=");
        k.append(this.cameraId);
        k.append("}");
        return k.toString();
    }
}
