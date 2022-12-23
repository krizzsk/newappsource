package p385bh;

import android.hardware.Camera;
import com.google.zxing.client.android.camera.open.CameraFacing;
import java.util.Objects;

/* renamed from: bh.b */
public final class C13626b {
    /* renamed from: a */
    public static C13625a m34031a(int i) {
        boolean z;
        Camera.CameraInfo cameraInfo;
        Camera camera;
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            return null;
        }
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = 0;
            while (true) {
                if (i >= numberOfCameras) {
                    cameraInfo = null;
                    break;
                }
                cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                if (CameraFacing.values()[cameraInfo.facing] == CameraFacing.BACK) {
                    break;
                }
                i++;
            }
        } else {
            cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(i, cameraInfo);
        }
        if (i < numberOfCameras) {
            camera = Camera.open(i);
        } else if (z) {
            camera = null;
        } else {
            Objects.toString(CameraFacing.BACK);
            camera = Camera.open(0);
            cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(0, cameraInfo);
        }
        if (camera == null) {
            return null;
        }
        return new C13625a(i, camera, CameraFacing.values()[cameraInfo.facing], cameraInfo.orientation);
    }
}
