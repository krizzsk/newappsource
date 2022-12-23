package androidx.camera.core;

import android.annotation.SuppressLint;
import android.media.Image;
import p054d0.C4282g0;

/* renamed from: androidx.camera.core.p */
public interface C0627p extends AutoCloseable {

    /* renamed from: androidx.camera.core.p$a */
    public interface C0628a {
    }

    void close();

    int getFormat();

    int getHeight();

    Image getImage();

    C4282g0 getImageInfo();

    @SuppressLint({"ArrayReturn"})
    C0628a[] getPlanes();

    int getWidth();
}
