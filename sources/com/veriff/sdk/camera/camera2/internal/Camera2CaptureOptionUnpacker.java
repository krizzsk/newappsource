package com.veriff.sdk.camera.camera2.internal;

import com.veriff.sdk.camera.camera2.impl.Camera2ImplConfig;
import com.veriff.sdk.camera.core.impl.CaptureConfig;
import com.veriff.sdk.camera.core.impl.Config;
import com.veriff.sdk.camera.core.impl.OptionsBundle;
import com.veriff.sdk.camera.core.impl.UseCaseConfig;

class Camera2CaptureOptionUnpacker implements CaptureConfig.OptionUnpacker {
    public static final Camera2CaptureOptionUnpacker INSTANCE = new Camera2CaptureOptionUnpacker();

    public void unpack(UseCaseConfig<?> useCaseConfig, CaptureConfig.Builder builder) {
        CaptureConfig defaultCaptureConfig = useCaseConfig.getDefaultCaptureConfig((CaptureConfig) null);
        Config emptyBundle = OptionsBundle.emptyBundle();
        int templateType = CaptureConfig.defaultEmptyCaptureConfig().getTemplateType();
        if (defaultCaptureConfig != null) {
            templateType = defaultCaptureConfig.getTemplateType();
            builder.addAllCameraCaptureCallbacks(defaultCaptureConfig.getCameraCaptureCallbacks());
            emptyBundle = defaultCaptureConfig.getImplementationOptions();
        }
        builder.setImplementationOptions(emptyBundle);
        Camera2ImplConfig camera2ImplConfig = new Camera2ImplConfig(useCaseConfig);
        builder.setTemplateType(camera2ImplConfig.getCaptureRequestTemplate(templateType));
        builder.addCameraCaptureCallback(CaptureCallbackContainer.create(camera2ImplConfig.getSessionCaptureCallback(Camera2CaptureCallbacks.createNoOpCallback())));
        builder.addImplementationOptions(camera2ImplConfig.getCaptureRequestOptions());
    }
}
