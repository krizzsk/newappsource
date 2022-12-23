package com.veriff.sdk.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import java.util.Objects;

public final class InputConfigurationCompat {
    private final InputConfigurationCompatImpl mImpl;

    public static final class InputConfigurationCompatApi23Impl implements InputConfigurationCompatImpl {
        private final InputConfiguration mObject;

        public InputConfigurationCompatApi23Impl(Object obj) {
            this.mObject = (InputConfiguration) obj;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof InputConfigurationCompatImpl)) {
                return false;
            }
            return Objects.equals(this.mObject, ((InputConfigurationCompatImpl) obj).getInputConfiguration());
        }

        public Object getInputConfiguration() {
            return this.mObject;
        }

        public int hashCode() {
            return this.mObject.hashCode();
        }

        public String toString() {
            return this.mObject.toString();
        }
    }

    public interface InputConfigurationCompatImpl {
        Object getInputConfiguration();
    }

    private InputConfigurationCompat(InputConfigurationCompatImpl inputConfigurationCompatImpl) {
        this.mImpl = inputConfigurationCompatImpl;
    }

    public static InputConfigurationCompat wrap(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 23) {
            return new InputConfigurationCompat(new InputConfigurationCompatApi23Impl(obj));
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof InputConfigurationCompat)) {
            return false;
        }
        return this.mImpl.equals(((InputConfigurationCompat) obj).mImpl);
    }

    public int hashCode() {
        return this.mImpl.hashCode();
    }

    public String toString() {
        return this.mImpl.toString();
    }

    public Object unwrap() {
        return this.mImpl.getInputConfiguration();
    }
}
