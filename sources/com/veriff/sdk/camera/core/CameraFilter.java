package com.veriff.sdk.camera.core;

import com.veriff.sdk.camera.core.impl.Identifier;
import java.util.List;

public interface CameraFilter {
    public static final Identifier DEFAULT_ID = Identifier.create(new Object());

    List<CameraInfo> filter(List<CameraInfo> list);

    Identifier getIdentifier();
}
