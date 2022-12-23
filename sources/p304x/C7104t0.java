package p304x;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: x.t0 */
public final class C7104t0 extends CameraDevice.StateCallback {

    /* renamed from: a */
    public final ArrayList f22090a = new ArrayList();

    public C7104t0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CameraDevice.StateCallback stateCallback = (CameraDevice.StateCallback) it.next();
            if (!(stateCallback instanceof C7107u0)) {
                this.f22090a.add(stateCallback);
            }
        }
    }

    public final void onClosed(CameraDevice cameraDevice) {
        Iterator it = this.f22090a.iterator();
        while (it.hasNext()) {
            ((CameraDevice.StateCallback) it.next()).onClosed(cameraDevice);
        }
    }

    public final void onDisconnected(CameraDevice cameraDevice) {
        Iterator it = this.f22090a.iterator();
        while (it.hasNext()) {
            ((CameraDevice.StateCallback) it.next()).onDisconnected(cameraDevice);
        }
    }

    public final void onError(CameraDevice cameraDevice, int i) {
        Iterator it = this.f22090a.iterator();
        while (it.hasNext()) {
            ((CameraDevice.StateCallback) it.next()).onError(cameraDevice, i);
        }
    }

    public final void onOpened(CameraDevice cameraDevice) {
        Iterator it = this.f22090a.iterator();
        while (it.hasNext()) {
            ((CameraDevice.StateCallback) it.next()).onOpened(cameraDevice);
        }
    }
}
