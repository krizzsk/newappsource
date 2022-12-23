package fd0;

import com.veriff.sdk.camera.core.CameraSelector;
import com.veriff.sdk.camera.core.UseCase;
import com.veriff.sdk.camera.core.impl.CaptureConfig;
import com.veriff.sdk.camera.core.impl.SessionConfig;
import com.veriff.sdk.camera.core.impl.UseCaseConfig;
import p229r1.C6231a;

/* renamed from: fd0.l */
public final /* synthetic */ class C12691l<T extends UseCase> {
    /* renamed from: a */
    public static C6231a m32426a(UseCaseConfig useCaseConfig, C6231a aVar) {
        return (C6231a) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_ATTACHED_USE_CASES_UPDATE_LISTENER, aVar);
    }

    /* renamed from: b */
    public static CameraSelector m32427b(UseCaseConfig useCaseConfig, CameraSelector cameraSelector) {
        return (CameraSelector) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_CAMERA_SELECTOR, cameraSelector);
    }

    /* renamed from: c */
    public static CaptureConfig.OptionUnpacker m32428c(UseCaseConfig useCaseConfig, CaptureConfig.OptionUnpacker optionUnpacker) {
        return (CaptureConfig.OptionUnpacker) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER, optionUnpacker);
    }

    /* renamed from: d */
    public static CaptureConfig m32429d(UseCaseConfig useCaseConfig, CaptureConfig captureConfig) {
        return (CaptureConfig) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG, captureConfig);
    }

    /* renamed from: e */
    public static SessionConfig m32430e(UseCaseConfig useCaseConfig, SessionConfig sessionConfig) {
        return (SessionConfig) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG, sessionConfig);
    }

    /* renamed from: f */
    public static SessionConfig.OptionUnpacker m32431f(UseCaseConfig useCaseConfig, SessionConfig.OptionUnpacker optionUnpacker) {
        return (SessionConfig.OptionUnpacker) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, optionUnpacker);
    }

    /* renamed from: g */
    public static int m32432g(UseCaseConfig useCaseConfig, int i) {
        return ((Integer) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, Integer.valueOf(i))).intValue();
    }
}
