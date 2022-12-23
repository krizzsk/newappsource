package p304x;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.view.Surface;
import androidx.camera.core.impl.C0572a;
import androidx.camera.core.impl.C0578e;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p032c0.C1755e;
import p054d0.C4289j0;
import p066e0.C4428g;
import p358af.C13437d;

/* renamed from: x.n0 */
public final class C7079n0 {

    /* renamed from: x.n0$a */
    public static class C7080a {
        /* renamed from: a */
        public static CaptureRequest.Builder m16607a(CameraDevice cameraDevice, TotalCaptureResult totalCaptureResult) throws CameraAccessException {
            return cameraDevice.createReprocessCaptureRequest(totalCaptureResult);
        }
    }

    /* renamed from: a */
    public static void m16605a(CaptureRequest.Builder builder, Config config) {
        C1755e a = C1755e.C1756a.m5005b(config).mo6514a();
        for (Config.C0564a aVar : C13437d.m33698c(a)) {
            CaptureRequest.Key key = (CaptureRequest.Key) aVar.mo2448c();
            try {
                builder.set(key, C13437d.m33699d(a, aVar));
            } catch (IllegalArgumentException unused) {
                Objects.toString(key);
                C4289j0.m11435b("CaptureRequestBuilder");
            }
        }
    }

    /* renamed from: b */
    public static CaptureRequest m16606b(C0578e eVar, CameraDevice cameraDevice, HashMap hashMap) throws CameraAccessException {
        CaptureRequest.Builder builder;
        if (cameraDevice == null) {
            return null;
        }
        List<DeferrableSurface> a = eVar.mo2478a();
        ArrayList arrayList = new ArrayList();
        for (DeferrableSurface deferrableSurface : a) {
            Surface surface = (Surface) hashMap.get(deferrableSurface);
            if (surface != null) {
                arrayList.add(surface);
            } else {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        C4428g gVar = eVar.f1976g;
        if (Build.VERSION.SDK_INT < 23 || eVar.f1972c != 5 || gVar == null || !(gVar.mo19950b() instanceof TotalCaptureResult)) {
            builder = cameraDevice.createCaptureRequest(eVar.f1972c);
        } else {
            builder = C7080a.m16607a(cameraDevice, (TotalCaptureResult) gVar.mo19950b());
        }
        m16605a(builder, eVar.f1971b);
        Config config = eVar.f1971b;
        C0572a aVar = C0578e.f1968h;
        if (config.mo2425e(aVar)) {
            builder.set(CaptureRequest.JPEG_ORIENTATION, (Integer) eVar.f1971b.mo2422a(aVar));
        }
        Config config2 = eVar.f1971b;
        C0572a aVar2 = C0578e.f1969i;
        if (config2.mo2425e(aVar2)) {
            builder.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) eVar.f1971b.mo2422a(aVar2)).byteValue()));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            builder.addTarget((Surface) it.next());
        }
        builder.setTag(eVar.f1975f);
        return builder.build();
    }
}
