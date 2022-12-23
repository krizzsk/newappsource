package p316y;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.HashMap;

/* renamed from: y.s */
public final class C7225s {

    /* renamed from: a */
    public final HashMap f22374a = new HashMap();

    /* renamed from: b */
    public final C7224r f22375b;

    public C7225s(CameraCharacteristics cameraCharacteristics) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f22375b = new C7223q(cameraCharacteristics);
        } else {
            this.f22375b = new C7224r(cameraCharacteristics);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        return r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T mo23532a(android.hardware.camera2.CameraCharacteristics.Key<T> r3) {
        /*
            r2 = this;
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0011
            y.r r0 = r2.f22375b
            android.hardware.camera2.CameraCharacteristics r0 = r0.f22373a
            java.lang.Object r3 = r0.get(r3)
            return r3
        L_0x0011:
            monitor-enter(r2)
            java.util.HashMap r0 = r2.f22374a     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x001c
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            return r0
        L_0x001c:
            y.r r0 = r2.f22375b     // Catch:{ all -> 0x002d }
            android.hardware.camera2.CameraCharacteristics r0 = r0.f22373a     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x002b
            java.util.HashMap r1 = r2.f22374a     // Catch:{ all -> 0x002d }
            r1.put(r3, r0)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            return r0
        L_0x002d:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p316y.C7225s.mo23532a(android.hardware.camera2.CameraCharacteristics$Key):java.lang.Object");
    }
}
