package com.veriff.sdk.camera.camera2.internal.compat.quirk;

import android.os.Build;
import com.veriff.sdk.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import com.veriff.sdk.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public final class JpegHalCorruptImageQuirk implements SoftwareJpegEncodingPreferredQuirk {
    private static final Set<String> KNOWN_AFFECTED_DEVICES = new HashSet(Arrays.asList(new String[]{"heroqltevzw", "heroqltetmo"}));

    public static boolean load(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        return KNOWN_AFFECTED_DEVICES.contains(Build.DEVICE.toLowerCase(Locale.US));
    }
}
