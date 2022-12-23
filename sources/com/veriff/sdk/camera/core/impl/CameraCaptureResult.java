package com.veriff.sdk.camera.core.impl;

import com.veriff.sdk.camera.core.impl.utils.ExifData;
import fd0.C12680a;

public interface CameraCaptureResult {

    public static final class EmptyCameraCaptureResult implements CameraCaptureResult {
        public static CameraCaptureResult create() {
            return new EmptyCameraCaptureResult();
        }

        public CameraCaptureMetaData$AeState getAeState() {
            return CameraCaptureMetaData$AeState.UNKNOWN;
        }

        public CameraCaptureMetaData$AfMode getAfMode() {
            return CameraCaptureMetaData$AfMode.UNKNOWN;
        }

        public CameraCaptureMetaData$AfState getAfState() {
            return CameraCaptureMetaData$AfState.UNKNOWN;
        }

        public CameraCaptureMetaData$AwbState getAwbState() {
            return CameraCaptureMetaData$AwbState.UNKNOWN;
        }

        public CameraCaptureMetaData$FlashState getFlashState() {
            return CameraCaptureMetaData$FlashState.UNKNOWN;
        }

        public TagBundle getTagBundle() {
            return TagBundle.emptyBundle();
        }

        public long getTimestamp() {
            return -1;
        }

        public final /* synthetic */ void populateExifData(ExifData.Builder builder) {
            C12680a.m32403a(this, builder);
        }
    }

    CameraCaptureMetaData$AeState getAeState();

    CameraCaptureMetaData$AfMode getAfMode();

    CameraCaptureMetaData$AfState getAfState();

    CameraCaptureMetaData$AwbState getAwbState();

    CameraCaptureMetaData$FlashState getFlashState();

    TagBundle getTagBundle();

    long getTimestamp();

    void populateExifData(ExifData.Builder builder);
}
