package com.veriff.sdk.camera.core.internal;

import com.veriff.sdk.camera.core.ZoomState;

public abstract class ImmutableZoomState implements ZoomState {
    public static ZoomState create(ZoomState zoomState) {
        return new AutoValue_ImmutableZoomState(zoomState.getZoomRatio(), zoomState.getMaxZoomRatio(), zoomState.getMinZoomRatio(), zoomState.getLinearZoom());
    }

    public abstract float getLinearZoom();

    public abstract float getMaxZoomRatio();

    public abstract float getMinZoomRatio();

    public abstract float getZoomRatio();
}
