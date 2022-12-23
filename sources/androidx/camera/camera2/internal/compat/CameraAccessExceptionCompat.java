package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import com.google.android.gms.search.SearchAuth;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CameraAccessExceptionCompat extends Exception {

    /* renamed from: b */
    public static final Set<Integer> f1774b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{4, 5, 1, 2, 3})));
    private final CameraAccessException mCameraAccessException;
    private final int mReason;

    static {
        Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{Integer.valueOf(SearchAuth.StatusCodes.AUTH_THROTTLED), 10002})));
    }

    public CameraAccessExceptionCompat(RuntimeException runtimeException) {
        super("Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.", runtimeException);
        this.mReason = SearchAuth.StatusCodes.AUTH_THROTTLED;
        this.mCameraAccessException = f1774b.contains(Integer.valueOf(SearchAuth.StatusCodes.AUTH_THROTTLED)) ? new CameraAccessException(SearchAuth.StatusCodes.AUTH_THROTTLED, (String) null, runtimeException) : null;
    }

    /* renamed from: b */
    public static CameraAccessExceptionCompat m1432b(CameraAccessException cameraAccessException) {
        return new CameraAccessExceptionCompat(cameraAccessException);
    }

    /* renamed from: a */
    public final int mo2308a() {
        return this.mReason;
    }

    public CameraAccessExceptionCompat(CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.mReason = cameraAccessException.getReason();
        this.mCameraAccessException = cameraAccessException;
    }

    public CameraAccessExceptionCompat(String str, AssertionError assertionError) {
        super(String.format("%s (%d): %s", new Object[]{"CAMERA_CHARACTERISTICS_CREATION_ERROR", 10002, str}), assertionError);
        this.mReason = 10002;
        this.mCameraAccessException = f1774b.contains(10002) ? new CameraAccessException(10002, str, assertionError) : null;
    }
}
