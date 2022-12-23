package fd0;

import android.util.Size;
import com.veriff.sdk.camera.core.impl.ImageOutputConfig;
import java.util.List;

/* renamed from: fd0.j */
public final /* synthetic */ class C12689j {
    /* renamed from: a */
    public static Size m32411a(ImageOutputConfig imageOutputConfig, Size size) {
        return (Size) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_DEFAULT_RESOLUTION, size);
    }

    /* renamed from: b */
    public static Size m32412b(ImageOutputConfig imageOutputConfig, Size size) {
        return (Size) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_MAX_RESOLUTION, size);
    }

    /* renamed from: c */
    public static List m32413c(ImageOutputConfig imageOutputConfig, List list) {
        return (List) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS, list);
    }

    /* renamed from: d */
    public static int m32414d(ImageOutputConfig imageOutputConfig) {
        return ((Integer) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO)).intValue();
    }

    /* renamed from: e */
    public static Size m32415e(ImageOutputConfig imageOutputConfig, Size size) {
        return (Size) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION, size);
    }

    /* renamed from: f */
    public static int m32416f(ImageOutputConfig imageOutputConfig, int i) {
        return ((Integer) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_TARGET_ROTATION, Integer.valueOf(i))).intValue();
    }

    /* renamed from: g */
    public static boolean m32417g(ImageOutputConfig imageOutputConfig) {
        return imageOutputConfig.containsOption(ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO);
    }
}
