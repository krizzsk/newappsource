package com.veriff.sdk.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;
import mf0.C24361g;

class OutputConfigurationCompatApi24Impl extends OutputConfigurationCompatBaseImpl {

    public static final class OutputConfigurationParamsApi24 {
        public final OutputConfiguration mOutputConfiguration;

        public OutputConfigurationParamsApi24(OutputConfiguration outputConfiguration) {
            this.mOutputConfiguration = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof OutputConfigurationParamsApi24)) {
                return false;
            }
            OutputConfigurationParamsApi24 outputConfigurationParamsApi24 = (OutputConfigurationParamsApi24) obj;
            if (!Objects.equals(this.mOutputConfiguration, outputConfigurationParamsApi24.mOutputConfiguration)) {
                return false;
            }
            outputConfigurationParamsApi24.getClass();
            outputConfigurationParamsApi24.getClass();
            if (Objects.equals((Object) null, (Object) null)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.mOutputConfiguration.hashCode() ^ 31;
            int i = 0 ^ ((hashCode << 5) - hashCode);
            return 0 ^ ((i << 5) - i);
        }
    }

    public OutputConfigurationCompatApi24Impl(Surface surface) {
        this((Object) new OutputConfigurationParamsApi24(new OutputConfiguration(surface)));
    }

    public static OutputConfigurationCompatApi24Impl wrap(OutputConfiguration outputConfiguration) {
        return new OutputConfigurationCompatApi24Impl((Object) new OutputConfigurationParamsApi24(outputConfiguration));
    }

    public Object getOutputConfiguration() {
        C24361g.m61175n(this.mObject instanceof OutputConfigurationParamsApi24);
        return ((OutputConfigurationParamsApi24) this.mObject).mOutputConfiguration;
    }

    public String getPhysicalCameraId() {
        ((OutputConfigurationParamsApi24) this.mObject).getClass();
        return null;
    }

    public Surface getSurface() {
        return ((OutputConfiguration) getOutputConfiguration()).getSurface();
    }

    public OutputConfigurationCompatApi24Impl(Object obj) {
        super(obj);
    }
}
