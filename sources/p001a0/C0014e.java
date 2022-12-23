package p001a0;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Size;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p054d0.C4289j0;
import p066e0.C4433i0;
import p316y.C7225s;

/* renamed from: a0.e */
public final class C0014e implements C4433i0 {

    /* renamed from: a */
    public final List<Size> f5a;

    public C0014e(C7225s sVar) {
        List<Size> list;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) sVar.mo23532a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            C4289j0.m11435b("CamcorderProfileResolutionQuirk");
        }
        Size[] sizeArr = null;
        if (Build.VERSION.SDK_INT < 23) {
            if (streamConfigurationMap != null) {
                sizeArr = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
            }
        } else if (streamConfigurationMap != null) {
            sizeArr = streamConfigurationMap.getOutputSizes(34);
        }
        if (sizeArr != null) {
            list = Arrays.asList((Size[]) sizeArr.clone());
        } else {
            list = Collections.emptyList();
        }
        this.f5a = list;
        Objects.toString(list);
        C4289j0.m11435b("CamcorderProfileResolutionQuirk");
    }
}
