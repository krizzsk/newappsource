package com.veriff.sdk.camera.core.impl;

public interface CameraConfig extends ReadableConfig {
    Identifier getCompatibilityId();

    int getUseCaseCombinationRequiredRule();

    UseCaseConfigFactory getUseCaseConfigFactory();
}
