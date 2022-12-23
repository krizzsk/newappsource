package com.veriff.sdk.camera.view.internal.compat.quirk;

import com.veriff.sdk.camera.core.impl.Quirk;
import com.veriff.sdk.camera.core.impl.Quirks;

public class DeviceQuirks {
    private static final Quirks QUIRKS = new Quirks(DeviceQuirksLoader.loadQuirks());

    public static <T extends Quirk> T get(Class<T> cls) {
        return QUIRKS.get(cls);
    }
}
