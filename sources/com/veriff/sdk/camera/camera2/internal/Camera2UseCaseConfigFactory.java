package com.veriff.sdk.camera.camera2.internal;

import android.content.Context;
import android.graphics.Point;
import android.util.Size;
import android.view.WindowManager;
import com.veriff.sdk.camera.camera2.internal.compat.workaround.PreviewPixelHDRnet;
import com.veriff.sdk.camera.core.impl.CaptureConfig;
import com.veriff.sdk.camera.core.impl.Config;
import com.veriff.sdk.camera.core.impl.ImageOutputConfig;
import com.veriff.sdk.camera.core.impl.MutableOptionsBundle;
import com.veriff.sdk.camera.core.impl.OptionsBundle;
import com.veriff.sdk.camera.core.impl.SessionConfig;
import com.veriff.sdk.camera.core.impl.UseCaseConfig;
import com.veriff.sdk.camera.core.impl.UseCaseConfigFactory;

public final class Camera2UseCaseConfigFactory implements UseCaseConfigFactory {
    private static final Size MAX_PREVIEW_SIZE = new Size(1920, 1080);
    public final WindowManager mWindowManager;

    /* renamed from: com.veriff.sdk.camera.camera2.internal.Camera2UseCaseConfigFactory$1 */
    public static /* synthetic */ class C124121 {

        /* renamed from: $SwitchMap$com$veriff$sdk$camera$core$impl$UseCaseConfigFactory$CaptureType */
        public static final /* synthetic */ int[] f30939x91f5f5e6;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.veriff.sdk.camera.core.impl.UseCaseConfigFactory$CaptureType[] r0 = com.veriff.sdk.camera.core.impl.UseCaseConfigFactory.CaptureType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f30939x91f5f5e6 = r0
                com.veriff.sdk.camera.core.impl.UseCaseConfigFactory$CaptureType r1 = com.veriff.sdk.camera.core.impl.UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30939x91f5f5e6     // Catch:{ NoSuchFieldError -> 0x001d }
                com.veriff.sdk.camera.core.impl.UseCaseConfigFactory$CaptureType r1 = com.veriff.sdk.camera.core.impl.UseCaseConfigFactory.CaptureType.PREVIEW     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f30939x91f5f5e6     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.veriff.sdk.camera.core.impl.UseCaseConfigFactory$CaptureType r1 = com.veriff.sdk.camera.core.impl.UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f30939x91f5f5e6     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.veriff.sdk.camera.core.impl.UseCaseConfigFactory$CaptureType r1 = com.veriff.sdk.camera.core.impl.UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.camera.camera2.internal.Camera2UseCaseConfigFactory.C124121.<clinit>():void");
        }
    }

    public Camera2UseCaseConfigFactory(Context context) {
        this.mWindowManager = (WindowManager) context.getSystemService("window");
    }

    private Size getPreviewSize() {
        Size size;
        Point point = new Point();
        this.mWindowManager.getDefaultDisplay().getRealSize(point);
        if (point.x > point.y) {
            size = new Size(point.x, point.y);
        } else {
            size = new Size(point.y, point.x);
        }
        int height = size.getHeight() * size.getWidth();
        Size size2 = MAX_PREVIEW_SIZE;
        if (height > size2.getHeight() * size2.getWidth()) {
            return size2;
        }
        return size;
    }

    public Config getConfig(UseCaseConfigFactory.CaptureType captureType) {
        Object obj;
        MutableOptionsBundle create = MutableOptionsBundle.create();
        SessionConfig.Builder builder = new SessionConfig.Builder();
        int[] iArr = C124121.f30939x91f5f5e6;
        int i = iArr[captureType.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            builder.setTemplateType(1);
        } else if (i == 4) {
            builder.setTemplateType(3);
        }
        UseCaseConfigFactory.CaptureType captureType2 = UseCaseConfigFactory.CaptureType.PREVIEW;
        if (captureType == captureType2) {
            PreviewPixelHDRnet.setHDRnet(builder);
        }
        create.insertOption(UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG, builder.build());
        create.insertOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, Camera2SessionOptionUnpacker.INSTANCE);
        CaptureConfig.Builder builder2 = new CaptureConfig.Builder();
        int i2 = iArr[captureType.ordinal()];
        if (i2 == 1) {
            builder2.setTemplateType(2);
        } else if (i2 == 2 || i2 == 3) {
            builder2.setTemplateType(1);
        } else if (i2 == 4) {
            builder2.setTemplateType(3);
        }
        create.insertOption(UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG, builder2.build());
        Config.Option<CaptureConfig.OptionUnpacker> option = UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER;
        if (captureType == UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE) {
            obj = ImageCaptureOptionUnpacker.INSTANCE;
        } else {
            obj = Camera2CaptureOptionUnpacker.INSTANCE;
        }
        create.insertOption(option, obj);
        if (captureType == captureType2) {
            create.insertOption(ImageOutputConfig.OPTION_MAX_RESOLUTION, getPreviewSize());
        }
        create.insertOption(ImageOutputConfig.OPTION_TARGET_ROTATION, Integer.valueOf(this.mWindowManager.getDefaultDisplay().getRotation()));
        return OptionsBundle.from(create);
    }
}
