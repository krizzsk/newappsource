package com.veriff.sdk.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import com.google.android.gms.search.SearchAuth;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CameraAccessExceptionCompat extends Exception {
    public static final Set<Integer> PLATFORM_ERRORS = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{4, 5, 1, 2, 3})));
    private final CameraAccessException mCameraAccessException;
    private final int mReason;

    static {
        Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{Integer.valueOf(SearchAuth.StatusCodes.AUTH_THROTTLED), 10002})));
    }

    public CameraAccessExceptionCompat(int i, Throwable th) {
        super(getDefaultMessage(i), th);
        this.mReason = i;
        this.mCameraAccessException = PLATFORM_ERRORS.contains(Integer.valueOf(i)) ? new CameraAccessException(i, (String) null, th) : null;
    }

    private static String getDefaultMessage(int i) {
        if (i == 1) {
            return "The camera is disabled due to a device policy, and cannot be opened.";
        }
        if (i == 2) {
            return "The camera device is removable and has been disconnected from the Android device, or the camera service has shut down the connection due to a higher-priority access request for the camera device.";
        }
        if (i == 3) {
            return "The camera device is currently in the error state; no further calls to it will succeed.";
        }
        if (i == 4) {
            return "The camera device is in use already";
        }
        if (i == 5) {
            return "The system-wide limit for number of open cameras has been reached, and more camera devices cannot be opened until previous instances are closed.";
        }
        if (i == 10001) {
            return "Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.";
        }
        if (i != 10002) {
            return null;
        }
        return "Failed to create CameraCharacteristics.";
    }

    public static CameraAccessExceptionCompat toCameraAccessExceptionCompat(CameraAccessException cameraAccessException) {
        if (cameraAccessException != null) {
            return new CameraAccessExceptionCompat(cameraAccessException);
        }
        throw new NullPointerException("cameraAccessException should not be null");
    }

    public final int getReason() {
        return this.mReason;
    }

    private CameraAccessExceptionCompat(CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.mReason = cameraAccessException.getReason();
        this.mCameraAccessException = cameraAccessException;
    }
}
