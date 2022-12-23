package androidx.camera.core.impl;

import android.content.Context;
import androidx.camera.core.InitializationException;
import p304x.C7094q0;

public interface UseCaseConfigFactory {

    /* renamed from: a */
    public static final C0570a f1950a = new C0570a();

    public enum CaptureType {
        IMAGE_CAPTURE,
        PREVIEW,
        IMAGE_ANALYSIS,
        VIDEO_CAPTURE
    }

    /* renamed from: androidx.camera.core.impl.UseCaseConfigFactory$a */
    public class C0570a implements UseCaseConfigFactory {
        /* renamed from: a */
        public final Config mo2468a(CaptureType captureType, int i) {
            return null;
        }
    }

    /* renamed from: androidx.camera.core.impl.UseCaseConfigFactory$b */
    public interface C0571b {
        C7094q0 newInstance(Context context) throws InitializationException;
    }

    /* renamed from: a */
    Config mo2468a(CaptureType captureType, int i);
}
