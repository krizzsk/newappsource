package p001a0;

import android.os.Build;
import android.util.Size;
import androidx.camera.core.impl.SurfaceConfig;
import com.appsflyer.internal.referrer.Payload;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p066e0.C4433i0;

/* renamed from: a0.o */
public final class C0024o implements C4433i0 {

    /* renamed from: a */
    public static final List<String> f9a = Arrays.asList(new String[]{"SM-T580", "SM-J710MN", "SM-A320FL", "SM-G570M", "SM-G610F", "SM-G610M"});

    /* renamed from: a0.o$a */
    public static /* synthetic */ class C0025a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.camera.core.impl.SurfaceConfig$ConfigType[] r0 = androidx.camera.core.impl.SurfaceConfig.ConfigType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10a = r0
                androidx.camera.core.impl.SurfaceConfig$ConfigType r1 = androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.core.impl.SurfaceConfig$ConfigType r1 = androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.camera.core.impl.SurfaceConfig$ConfigType r1 = androidx.camera.core.impl.SurfaceConfig.ConfigType.JPEG     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p001a0.C0024o.C0025a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static Size m94a(SurfaceConfig.ConfigType configType) {
        if (!m95b()) {
            return null;
        }
        int i = C0025a.f10a[configType.ordinal()];
        if (i == 1) {
            return new Size(1920, 1080);
        }
        if (i == 2) {
            return new Size(1280, 720);
        }
        if (i != 3) {
            return null;
        }
        return new Size(3264, 1836);
    }

    /* renamed from: b */
    public static boolean m95b() {
        if (!Payload.SOURCE_SAMSUNG.equalsIgnoreCase(Build.BRAND) || !f9a.contains(Build.MODEL.toUpperCase(Locale.US))) {
            return false;
        }
        return true;
    }
}
