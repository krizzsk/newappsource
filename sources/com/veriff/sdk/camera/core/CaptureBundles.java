package com.veriff.sdk.camera.core;

import com.veriff.sdk.camera.core.impl.CaptureBundle;
import com.veriff.sdk.camera.core.impl.CaptureStage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class CaptureBundles {

    public static final class CaptureBundleImpl implements CaptureBundle {
        public final List<CaptureStage> mCaptureStageList;

        public CaptureBundleImpl(List<CaptureStage> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
            }
            this.mCaptureStageList = Collections.unmodifiableList(new ArrayList(list));
        }

        public List<CaptureStage> getCaptureStages() {
            return this.mCaptureStageList;
        }
    }

    public static CaptureBundle createCaptureBundle(CaptureStage... captureStageArr) {
        return new CaptureBundleImpl(Arrays.asList(captureStageArr));
    }

    public static CaptureBundle singleDefaultCaptureBundle() {
        return createCaptureBundle(new CaptureStage.DefaultCaptureStage());
    }

    public static CaptureBundle createCaptureBundle(List<CaptureStage> list) {
        return new CaptureBundleImpl(list);
    }
}
