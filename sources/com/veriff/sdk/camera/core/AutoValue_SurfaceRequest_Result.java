package com.veriff.sdk.camera.core;

import android.view.Surface;
import com.veriff.sdk.camera.core.SurfaceRequest;

final class AutoValue_SurfaceRequest_Result extends SurfaceRequest.Result {
    private final int resultCode;
    private final Surface surface;

    public AutoValue_SurfaceRequest_Result(int i, Surface surface2) {
        this.resultCode = i;
        if (surface2 != null) {
            this.surface = surface2;
            return;
        }
        throw new NullPointerException("Null surface");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceRequest.Result)) {
            return false;
        }
        SurfaceRequest.Result result = (SurfaceRequest.Result) obj;
        if (this.resultCode != result.getResultCode() || !this.surface.equals(result.getSurface())) {
            return false;
        }
        return true;
    }

    public int getResultCode() {
        return this.resultCode;
    }

    public Surface getSurface() {
        return this.surface;
    }

    public int hashCode() {
        return ((this.resultCode ^ 1000003) * 1000003) ^ this.surface.hashCode();
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("Result{resultCode=");
        k.append(this.resultCode);
        k.append(", surface=");
        k.append(this.surface);
        k.append("}");
        return k.toString();
    }
}
