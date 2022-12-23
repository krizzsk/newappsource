package com.veriff.sdk.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;
import mf0.C24361g;

class OutputConfigurationCompatApi26Impl extends OutputConfigurationCompatApi24Impl {

    public static final class OutputConfigurationParamsApi26 {
        public final OutputConfiguration mOutputConfiguration;

        public OutputConfigurationParamsApi26(OutputConfiguration outputConfiguration) {
            this.mOutputConfiguration = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof OutputConfigurationParamsApi26)) {
                return false;
            }
            OutputConfigurationParamsApi26 outputConfigurationParamsApi26 = (OutputConfigurationParamsApi26) obj;
            if (!Objects.equals(this.mOutputConfiguration, outputConfigurationParamsApi26.mOutputConfiguration)) {
                return false;
            }
            outputConfigurationParamsApi26.getClass();
            if (Objects.equals((Object) null, (Object) null)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.mOutputConfiguration.hashCode() ^ 31;
            return 0 ^ ((hashCode << 5) - hashCode);
        }
    }

    public OutputConfigurationCompatApi26Impl(Surface surface) {
        this((Object) new OutputConfigurationParamsApi26(new OutputConfiguration(surface)));
    }

    public static OutputConfigurationCompatApi26Impl wrap(OutputConfiguration outputConfiguration) {
        return new OutputConfigurationCompatApi26Impl((Object) new OutputConfigurationParamsApi26(outputConfiguration));
    }

    public Object getOutputConfiguration() {
        C24361g.m61175n(this.mObject instanceof OutputConfigurationParamsApi26);
        return ((OutputConfigurationParamsApi26) this.mObject).mOutputConfiguration;
    }

    public String getPhysicalCameraId() {
        ((OutputConfigurationParamsApi26) this.mObject).getClass();
        return null;
    }

    public OutputConfigurationCompatApi26Impl(Object obj) {
        super(obj);
    }
}
