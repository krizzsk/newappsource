package p316y;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p054d0.C4289j0;
import p316y.C7208f;
import p316y.C7226t;
import p327z.C7363b;
import p327z.C7372g;

/* renamed from: y.z */
public class C7234z implements C7226t.C7227a {

    /* renamed from: a */
    public final CameraDevice f22385a;

    /* renamed from: b */
    public final Object f22386b;

    /* renamed from: y.z$a */
    public static class C7235a {

        /* renamed from: a */
        public final Handler f22387a;

        public C7235a(Handler handler) {
            this.f22387a = handler;
        }
    }

    public C7234z(CameraDevice cameraDevice, C7235a aVar) {
        cameraDevice.getClass();
        this.f22385a = cameraDevice;
        this.f22386b = aVar;
    }

    /* renamed from: b */
    public static void m16827b(CameraDevice cameraDevice, C7372g gVar) {
        cameraDevice.getClass();
        gVar.getClass();
        gVar.f22600a.getStateCallback().getClass();
        List<C7363b> outputConfigurations = gVar.f22600a.getOutputConfigurations();
        if (outputConfigurations == null) {
            throw new IllegalArgumentException("Invalid output configurations");
        } else if (gVar.f22600a.getExecutor() != null) {
            cameraDevice.getId();
            for (C7363b bVar : outputConfigurations) {
                String physicalCameraId = bVar.f22589a.getPhysicalCameraId();
                if (physicalCameraId != null && !physicalCameraId.isEmpty()) {
                    C4289j0.m11435b("CameraDeviceCompat");
                }
            }
        } else {
            throw new IllegalArgumentException("Invalid executor");
        }
    }

    /* renamed from: c */
    public static ArrayList m16828c(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C7363b) it.next()).f22589a.getSurface());
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo23533a(C7372g gVar) throws CameraAccessExceptionCompat {
        m16827b(this.f22385a, gVar);
        if (gVar.f22600a.getInputConfiguration() != null) {
            throw new IllegalArgumentException("Reprocessing sessions not supported until API 23");
        } else if (gVar.f22600a.getSessionType() != 1) {
            C7208f.C7211c cVar = new C7208f.C7211c(gVar.f22600a.getExecutor(), gVar.f22600a.getStateCallback());
            try {
                this.f22385a.createCaptureSession(m16828c(gVar.f22600a.getOutputConfigurations()), cVar, ((C7235a) this.f22386b).f22387a);
            } catch (CameraAccessException e) {
                throw new CameraAccessExceptionCompat(e);
            }
        } else {
            throw new IllegalArgumentException("High speed capture sessions not supported until API 23");
        }
    }
}
