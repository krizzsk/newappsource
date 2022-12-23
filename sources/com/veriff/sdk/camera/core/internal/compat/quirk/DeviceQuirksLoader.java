package com.veriff.sdk.camera.core.internal.compat.quirk;

import com.veriff.sdk.camera.core.impl.Quirk;
import java.util.ArrayList;
import java.util.List;

public class DeviceQuirksLoader {
    public static List<Quirk> loadQuirks() {
        ArrayList arrayList = new ArrayList();
        if (ImageCaptureRotationOptionQuirk.load()) {
            arrayList.add(new ImageCaptureRotationOptionQuirk());
        }
        if (ImageCaptureWashedOutImageQuirk.load()) {
            arrayList.add(new ImageCaptureWashedOutImageQuirk());
        }
        return arrayList;
    }
}
