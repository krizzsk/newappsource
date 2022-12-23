package com.veriff.sdk.camera.camera2.internal;

import com.veriff.sdk.camera.camera2.impl.Camera2ImplConfig;
import com.veriff.sdk.camera.camera2.impl.CameraEventCallbacks;
import com.veriff.sdk.camera.core.impl.Config;
import com.veriff.sdk.camera.core.impl.MutableOptionsBundle;
import com.veriff.sdk.camera.core.impl.OptionsBundle;
import com.veriff.sdk.camera.core.impl.SessionConfig;
import com.veriff.sdk.camera.core.impl.UseCaseConfig;

final class Camera2SessionOptionUnpacker implements SessionConfig.OptionUnpacker {
    public static final Camera2SessionOptionUnpacker INSTANCE = new Camera2SessionOptionUnpacker();

    public void unpack(UseCaseConfig<?> useCaseConfig, SessionConfig.Builder builder) {
        SessionConfig defaultSessionConfig = useCaseConfig.getDefaultSessionConfig((SessionConfig) null);
        Config emptyBundle = OptionsBundle.emptyBundle();
        int templateType = SessionConfig.defaultEmptySessionConfig().getTemplateType();
        if (defaultSessionConfig != null) {
            templateType = defaultSessionConfig.getTemplateType();
            builder.addAllDeviceStateCallbacks(defaultSessionConfig.getDeviceStateCallbacks());
            builder.addAllSessionStateCallbacks(defaultSessionConfig.getSessionStateCallbacks());
            builder.addAllRepeatingCameraCaptureCallbacks(defaultSessionConfig.getRepeatingCameraCaptureCallbacks());
            emptyBundle = defaultSessionConfig.getImplementationOptions();
        }
        builder.setImplementationOptions(emptyBundle);
        Camera2ImplConfig camera2ImplConfig = new Camera2ImplConfig(useCaseConfig);
        builder.setTemplateType(camera2ImplConfig.getCaptureRequestTemplate(templateType));
        builder.addDeviceStateCallback(camera2ImplConfig.getDeviceStateCallback(CameraDeviceStateCallbacks.createNoOpCallback()));
        builder.addSessionStateCallback(camera2ImplConfig.getSessionStateCallback(CameraCaptureSessionStateCallbacks.createNoOpCallback()));
        builder.addCameraCaptureCallback(CaptureCallbackContainer.create(camera2ImplConfig.getSessionCaptureCallback(Camera2CaptureCallbacks.createNoOpCallback())));
        MutableOptionsBundle create = MutableOptionsBundle.create();
        create.insertOption(Camera2ImplConfig.CAMERA_EVENT_CALLBACK_OPTION, camera2ImplConfig.getCameraEventCallback(CameraEventCallbacks.createEmptyCallback()));
        builder.addImplementationOptions(create);
        builder.addImplementationOptions(camera2ImplConfig.getCaptureRequestOptions());
    }
}
