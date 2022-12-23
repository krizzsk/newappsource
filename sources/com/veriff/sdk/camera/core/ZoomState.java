package com.veriff.sdk.camera.core;

public interface ZoomState {
    float getLinearZoom();

    float getMaxZoomRatio();

    float getMinZoomRatio();

    float getZoomRatio();
}
