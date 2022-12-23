package com.veriff.sdk.camera.core.impl;

import com.veriff.sdk.camera.core.impl.CaptureConfig;

public interface CaptureStage {

    public static final class DefaultCaptureStage implements CaptureStage {
        private final CaptureConfig mCaptureConfig = new CaptureConfig.Builder().build();

        public CaptureConfig getCaptureConfig() {
            return this.mCaptureConfig;
        }

        public int getId() {
            return 0;
        }
    }

    CaptureConfig getCaptureConfig();

    int getId();
}
