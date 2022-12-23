package android.hardware.camera2.params;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.os.Parcelable;
import android.util.Size;
import android.view.Surface;

public final /* synthetic */ class OutputConfiguration implements Parcelable {
    static {
        throw new NoClassDefFoundError();
    }

    public /* synthetic */ <T> OutputConfiguration(@NonNull Size size, @NonNull Class<T> cls) {
    }

    public /* synthetic */ OutputConfiguration(@NonNull Surface surface) {
    }

    @Nullable
    public native /* synthetic */ Surface getSurface();

    public native /* synthetic */ int hashCode();
}
