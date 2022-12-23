package p066e0;

import android.view.Surface;
import androidx.camera.core.C0627p;
import java.util.concurrent.Executor;

/* renamed from: e0.z */
public interface C4462z {

    /* renamed from: e0.z$a */
    public interface C4463a {
        /* renamed from: c */
        void mo2538c(C4462z zVar);
    }

    /* renamed from: a */
    void mo2556a(C4463a aVar, Executor executor);

    C0627p acquireLatestImage();

    C0627p acquireNextImage();

    void clearOnImageAvailableListener();

    void close();

    int getHeight();

    int getImageFormat();

    int getMaxImages();

    Surface getSurface();

    int getWidth();
}
