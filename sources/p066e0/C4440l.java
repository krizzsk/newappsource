package p066e0;

import android.content.Context;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import java.util.LinkedHashSet;
import p054d0.C4292l;
import p304x.C7100s;
import p316y.C7197a0;

/* renamed from: e0.l */
public interface C4440l {

    /* renamed from: e0.l$a */
    public interface C4441a {
        /* renamed from: a */
        C7100s mo19975a(Context context, C4414a aVar, C4292l lVar) throws InitializationException;
    }

    /* renamed from: a */
    C7197a0 mo19972a();

    LinkedHashSet getAvailableCameraIds();

    Camera2CameraImpl getCamera(String str) throws CameraUnavailableException;
}
