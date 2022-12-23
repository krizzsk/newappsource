package com.veriff.sdk.camera.core.internal;

import com.veriff.sdk.camera.core.ImageInfo;
import com.veriff.sdk.camera.core.impl.CameraCaptureResult;
import com.veriff.sdk.camera.core.impl.TagBundle;
import com.veriff.sdk.camera.core.impl.utils.ExifData;

public final class CameraCaptureResultImageInfo implements ImageInfo {
    private final CameraCaptureResult mCameraCaptureResult;

    public CameraCaptureResultImageInfo(CameraCaptureResult cameraCaptureResult) {
        this.mCameraCaptureResult = cameraCaptureResult;
    }

    public TagBundle getTagBundle() {
        return this.mCameraCaptureResult.getTagBundle();
    }

    public long getTimestamp() {
        return this.mCameraCaptureResult.getTimestamp();
    }

    public void populateExifData(ExifData.Builder builder) {
        this.mCameraCaptureResult.populateExifData(builder);
    }
}
