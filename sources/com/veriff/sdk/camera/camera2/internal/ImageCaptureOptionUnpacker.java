package com.veriff.sdk.camera.camera2.internal;

import com.veriff.sdk.camera.camera2.impl.Camera2ImplConfig;
import com.veriff.sdk.camera.camera2.internal.compat.workaround.ImageCapturePixelHDRPlus;
import com.veriff.sdk.camera.core.impl.CaptureConfig;
import com.veriff.sdk.camera.core.impl.ImageCaptureConfig;
import com.veriff.sdk.camera.core.impl.UseCaseConfig;

final class ImageCaptureOptionUnpacker extends Camera2CaptureOptionUnpacker {
    public static final ImageCaptureOptionUnpacker INSTANCE = new ImageCaptureOptionUnpacker(new ImageCapturePixelHDRPlus());
    private final ImageCapturePixelHDRPlus mImageCapturePixelHDRPlus;

    private ImageCaptureOptionUnpacker(ImageCapturePixelHDRPlus imageCapturePixelHDRPlus) {
        this.mImageCapturePixelHDRPlus = imageCapturePixelHDRPlus;
    }

    public void unpack(UseCaseConfig<?> useCaseConfig, CaptureConfig.Builder builder) {
        super.unpack(useCaseConfig, builder);
        if (useCaseConfig instanceof ImageCaptureConfig) {
            ImageCaptureConfig imageCaptureConfig = (ImageCaptureConfig) useCaseConfig;
            Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
            if (imageCaptureConfig.hasCaptureMode()) {
                this.mImageCapturePixelHDRPlus.toggleHDRPlus(imageCaptureConfig.getCaptureMode(), builder2);
            }
            builder.addImplementationOptions(builder2.build());
            return;
        }
        throw new IllegalArgumentException("config is not ImageCaptureConfig");
    }
}
