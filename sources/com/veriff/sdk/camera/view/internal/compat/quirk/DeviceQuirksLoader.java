package com.veriff.sdk.camera.view.internal.compat.quirk;

import com.veriff.sdk.camera.core.impl.Quirk;
import java.util.ArrayList;
import java.util.List;

public class DeviceQuirksLoader {
    public static List<Quirk> loadQuirks() {
        ArrayList arrayList = new ArrayList();
        if (PreviewOneThirdWiderQuirk.load()) {
            arrayList.add(new PreviewOneThirdWiderQuirk());
        }
        if (SurfaceViewStretchedQuirk.load()) {
            arrayList.add(new SurfaceViewStretchedQuirk());
        }
        return arrayList;
    }
}
