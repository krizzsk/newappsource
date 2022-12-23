package com.veriff.sdk.camera.camera2.internal.compat.params;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

public final class SessionConfigurationCompat {
    private final SessionConfigurationCompatImpl mImpl;

    public static final class SessionConfigurationCompatBaseImpl implements SessionConfigurationCompatImpl {
        private final Executor mExecutor;
        private InputConfigurationCompat mInputConfig = null;
        private final List<OutputConfigurationCompat> mOutputConfigurations;
        private int mSessionType;
        private final CameraCaptureSession.StateCallback mStateCallback;

        public SessionConfigurationCompatBaseImpl(int i, List<OutputConfigurationCompat> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.mSessionType = i;
            this.mOutputConfigurations = Collections.unmodifiableList(new ArrayList(list));
            this.mStateCallback = stateCallback;
            this.mExecutor = executor;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SessionConfigurationCompatBaseImpl) {
                SessionConfigurationCompatBaseImpl sessionConfigurationCompatBaseImpl = (SessionConfigurationCompatBaseImpl) obj;
                if (Objects.equals(this.mInputConfig, sessionConfigurationCompatBaseImpl.mInputConfig) && this.mSessionType == sessionConfigurationCompatBaseImpl.mSessionType && this.mOutputConfigurations.size() == sessionConfigurationCompatBaseImpl.mOutputConfigurations.size()) {
                    for (int i = 0; i < this.mOutputConfigurations.size(); i++) {
                        if (!this.mOutputConfigurations.get(i).equals(sessionConfigurationCompatBaseImpl.mOutputConfigurations.get(i))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        public Executor getExecutor() {
            return this.mExecutor;
        }

        public InputConfigurationCompat getInputConfiguration() {
            return this.mInputConfig;
        }

        public List<OutputConfigurationCompat> getOutputConfigurations() {
            return this.mOutputConfigurations;
        }

        public Object getSessionConfiguration() {
            return null;
        }

        public int getSessionType() {
            return this.mSessionType;
        }

        public CameraCaptureSession.StateCallback getStateCallback() {
            return this.mStateCallback;
        }

        public int hashCode() {
            int i;
            int hashCode = this.mOutputConfigurations.hashCode() ^ 31;
            int i2 = (hashCode << 5) - hashCode;
            InputConfigurationCompat inputConfigurationCompat = this.mInputConfig;
            if (inputConfigurationCompat == null) {
                i = 0;
            } else {
                i = inputConfigurationCompat.hashCode();
            }
            int i3 = i ^ i2;
            return this.mSessionType ^ ((i3 << 5) - i3);
        }

        public void setSessionParameters(CaptureRequest captureRequest) {
        }
    }

    public interface SessionConfigurationCompatImpl {
        Executor getExecutor();

        InputConfigurationCompat getInputConfiguration();

        List<OutputConfigurationCompat> getOutputConfigurations();

        Object getSessionConfiguration();

        int getSessionType();

        CameraCaptureSession.StateCallback getStateCallback();

        void setSessionParameters(CaptureRequest captureRequest);
    }

    public SessionConfigurationCompat(int i, List<OutputConfigurationCompat> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        if (Build.VERSION.SDK_INT < 28) {
            this.mImpl = new SessionConfigurationCompatBaseImpl(i, list, executor, stateCallback);
        } else {
            this.mImpl = new SessionConfigurationCompatApi28Impl(i, list, executor, stateCallback);
        }
    }

    public static List<OutputConfiguration> transformFromCompat(List<OutputConfigurationCompat> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (OutputConfigurationCompat unwrap : list) {
            arrayList.add((OutputConfiguration) unwrap.unwrap());
        }
        return arrayList;
    }

    public static List<OutputConfigurationCompat> transformToCompat(List<OutputConfiguration> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (OutputConfiguration wrap : list) {
            arrayList.add(OutputConfigurationCompat.wrap(wrap));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SessionConfigurationCompat)) {
            return false;
        }
        return this.mImpl.equals(((SessionConfigurationCompat) obj).mImpl);
    }

    public Executor getExecutor() {
        return this.mImpl.getExecutor();
    }

    public InputConfigurationCompat getInputConfiguration() {
        return this.mImpl.getInputConfiguration();
    }

    public List<OutputConfigurationCompat> getOutputConfigurations() {
        return this.mImpl.getOutputConfigurations();
    }

    public int getSessionType() {
        return this.mImpl.getSessionType();
    }

    public CameraCaptureSession.StateCallback getStateCallback() {
        return this.mImpl.getStateCallback();
    }

    public int hashCode() {
        return this.mImpl.hashCode();
    }

    public void setSessionParameters(CaptureRequest captureRequest) {
        this.mImpl.setSessionParameters(captureRequest);
    }

    public Object unwrap() {
        return this.mImpl.getSessionConfiguration();
    }

    public static final class SessionConfigurationCompatApi28Impl implements SessionConfigurationCompatImpl {
        private final SessionConfiguration mObject;
        private final List<OutputConfigurationCompat> mOutputConfigurations;

        public SessionConfigurationCompatApi28Impl(Object obj) {
            SessionConfiguration sessionConfiguration = (SessionConfiguration) obj;
            this.mObject = sessionConfiguration;
            this.mOutputConfigurations = Collections.unmodifiableList(SessionConfigurationCompat.transformToCompat(sessionConfiguration.getOutputConfigurations()));
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof SessionConfigurationCompatApi28Impl)) {
                return false;
            }
            return Objects.equals(this.mObject, ((SessionConfigurationCompatApi28Impl) obj).mObject);
        }

        public Executor getExecutor() {
            return this.mObject.getExecutor();
        }

        public InputConfigurationCompat getInputConfiguration() {
            return InputConfigurationCompat.wrap(this.mObject.getInputConfiguration());
        }

        public List<OutputConfigurationCompat> getOutputConfigurations() {
            return this.mOutputConfigurations;
        }

        public Object getSessionConfiguration() {
            return this.mObject;
        }

        public int getSessionType() {
            return this.mObject.getSessionType();
        }

        public CameraCaptureSession.StateCallback getStateCallback() {
            return this.mObject.getStateCallback();
        }

        public int hashCode() {
            return this.mObject.hashCode();
        }

        public void setSessionParameters(CaptureRequest captureRequest) {
            this.mObject.setSessionParameters(captureRequest);
        }

        public SessionConfigurationCompatApi28Impl(int i, List<OutputConfigurationCompat> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this(new SessionConfiguration(i, SessionConfigurationCompat.transformFromCompat(list), executor, stateCallback));
        }
    }
}
