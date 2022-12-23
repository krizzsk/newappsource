package com.veriff.sdk.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;

public final class OutputConfigurationCompat {
    private final OutputConfigurationCompatImpl mImpl;

    public interface OutputConfigurationCompatImpl {
        Object getOutputConfiguration();

        String getPhysicalCameraId();

        Surface getSurface();
    }

    public OutputConfigurationCompat(Surface surface) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.mImpl = new OutputConfigurationCompatApi28Impl(surface);
        } else if (i >= 26) {
            this.mImpl = new OutputConfigurationCompatApi26Impl(surface);
        } else if (i >= 24) {
            this.mImpl = new OutputConfigurationCompatApi24Impl(surface);
        } else {
            this.mImpl = new OutputConfigurationCompatBaseImpl(surface);
        }
    }

    public static OutputConfigurationCompat wrap(Object obj) {
        OutputConfigurationCompatImpl outputConfigurationCompatImpl;
        if (obj == null) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            outputConfigurationCompatImpl = OutputConfigurationCompatApi28Impl.wrap((OutputConfiguration) obj);
        } else if (i >= 26) {
            outputConfigurationCompatImpl = OutputConfigurationCompatApi26Impl.wrap((OutputConfiguration) obj);
        } else if (i >= 24) {
            outputConfigurationCompatImpl = OutputConfigurationCompatApi24Impl.wrap((OutputConfiguration) obj);
        } else {
            outputConfigurationCompatImpl = null;
        }
        if (outputConfigurationCompatImpl == null) {
            return null;
        }
        return new OutputConfigurationCompat(outputConfigurationCompatImpl);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof OutputConfigurationCompat)) {
            return false;
        }
        return this.mImpl.equals(((OutputConfigurationCompat) obj).mImpl);
    }

    public String getPhysicalCameraId() {
        return this.mImpl.getPhysicalCameraId();
    }

    public Surface getSurface() {
        return this.mImpl.getSurface();
    }

    public int hashCode() {
        return this.mImpl.hashCode();
    }

    public Object unwrap() {
        return this.mImpl.getOutputConfiguration();
    }

    private OutputConfigurationCompat(OutputConfigurationCompatImpl outputConfigurationCompatImpl) {
        this.mImpl = outputConfigurationCompatImpl;
    }
}
