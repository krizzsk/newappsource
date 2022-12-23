package com.veriff.sdk.camera.core.internal.compat.workaround;

import com.veriff.sdk.camera.core.ImageProxy;
import com.veriff.sdk.camera.core.impl.CaptureConfig;
import com.veriff.sdk.camera.core.internal.compat.quirk.DeviceQuirks;
import com.veriff.sdk.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;

public class ExifRotationAvailability {
    public boolean isRotationOptionSupported() {
        ImageCaptureRotationOptionQuirk imageCaptureRotationOptionQuirk = (ImageCaptureRotationOptionQuirk) DeviceQuirks.get(ImageCaptureRotationOptionQuirk.class);
        if (imageCaptureRotationOptionQuirk != null) {
            return imageCaptureRotationOptionQuirk.isSupported(CaptureConfig.OPTION_ROTATION);
        }
        return true;
    }

    public boolean shouldUseExifOrientation(ImageProxy imageProxy) {
        ImageCaptureRotationOptionQuirk imageCaptureRotationOptionQuirk = (ImageCaptureRotationOptionQuirk) DeviceQuirks.get(ImageCaptureRotationOptionQuirk.class);
        if ((imageCaptureRotationOptionQuirk == null || imageCaptureRotationOptionQuirk.isSupported(CaptureConfig.OPTION_ROTATION)) && imageProxy.getFormat() == 256) {
            return true;
        }
        return false;
    }
}
