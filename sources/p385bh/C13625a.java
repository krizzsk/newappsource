package p385bh;

import android.hardware.Camera;
import com.google.zxing.client.android.camera.open.CameraFacing;

/* renamed from: bh.a */
public final class C13625a {

    /* renamed from: a */
    public final int f33591a;

    /* renamed from: b */
    public final Camera f33592b;

    /* renamed from: c */
    public final CameraFacing f33593c;

    /* renamed from: d */
    public final int f33594d;

    public C13625a(int i, Camera camera, CameraFacing cameraFacing, int i2) {
        this.f33591a = i;
        this.f33592b = camera;
        this.f33593c = cameraFacing;
        this.f33594d = i2;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Camera #");
        k.append(this.f33591a);
        k.append(" : ");
        k.append(this.f33593c);
        k.append(',');
        k.append(this.f33594d);
        return k.toString();
    }
}
