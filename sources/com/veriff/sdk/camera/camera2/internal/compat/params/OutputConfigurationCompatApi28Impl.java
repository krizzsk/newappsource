package com.veriff.sdk.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import mf0.C24361g;

class OutputConfigurationCompatApi28Impl extends OutputConfigurationCompatApi26Impl {
    public OutputConfigurationCompatApi28Impl(Surface surface) {
        super((Object) new OutputConfiguration(surface));
    }

    public static OutputConfigurationCompatApi28Impl wrap(OutputConfiguration outputConfiguration) {
        return new OutputConfigurationCompatApi28Impl((Object) outputConfiguration);
    }

    public Object getOutputConfiguration() {
        C24361g.m61175n(this.mObject instanceof OutputConfiguration);
        return this.mObject;
    }

    public String getPhysicalCameraId() {
        return null;
    }

    public OutputConfigurationCompatApi28Impl(Object obj) {
        super(obj);
    }
}
