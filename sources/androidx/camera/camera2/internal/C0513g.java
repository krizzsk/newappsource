package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.camera2.internal.CaptureSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p304x.C7070l;
import p316y.C7202c;

/* renamed from: androidx.camera.camera2.internal.g */
public final class C0513g extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a */
    public final HashMap f1782a = new HashMap();

    /* renamed from: b */
    public C0514a f1783b = null;

    /* renamed from: androidx.camera.camera2.internal.g$a */
    public interface C0514a {
    }

    /* renamed from: a */
    public final void mo2310a(CaptureRequest captureRequest, ArrayList arrayList) {
        List list = (List) this.f1782a.get(captureRequest);
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(list.size() + arrayList.size());
            arrayList2.addAll(arrayList);
            arrayList2.addAll(list);
            this.f1782a.put(captureRequest, arrayList2);
            return;
        }
        this.f1782a.put(captureRequest, arrayList);
    }

    /* renamed from: b */
    public final List<CameraCaptureSession.CaptureCallback> mo2311b(CaptureRequest captureRequest) {
        List<CameraCaptureSession.CaptureCallback> list = (List) this.f1782a.get(captureRequest);
        if (list != null) {
            return list;
        }
        return Collections.emptyList();
    }

    public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        for (CameraCaptureSession.CaptureCallback a : mo2311b(captureRequest)) {
            C7202c.m16810a(a, cameraCaptureSession, captureRequest, surface, j);
        }
    }

    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        for (CameraCaptureSession.CaptureCallback onCaptureCompleted : mo2311b(captureRequest)) {
            onCaptureCompleted.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }
    }

    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        for (CameraCaptureSession.CaptureCallback onCaptureFailed : mo2311b(captureRequest)) {
            onCaptureFailed.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }
    }

    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        for (CameraCaptureSession.CaptureCallback onCaptureProgressed : mo2311b(captureRequest)) {
            onCaptureProgressed.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }
    }

    public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        for (List<CameraCaptureSession.CaptureCallback> it : this.f1782a.values()) {
            for (CameraCaptureSession.CaptureCallback onCaptureSequenceAborted : it) {
                onCaptureSequenceAborted.onCaptureSequenceAborted(cameraCaptureSession, i);
            }
        }
        C0514a aVar = this.f1783b;
        if (aVar != null) {
            CaptureSession captureSession = (CaptureSession) ((C7070l) aVar).f21984c;
            synchronized (captureSession.f1727a) {
                if (captureSession.f1738l == CaptureSession.State.OPENED) {
                    captureSession.mo2294k(captureSession.f1733g);
                }
            }
        }
    }

    public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        for (List<CameraCaptureSession.CaptureCallback> it : this.f1782a.values()) {
            for (CameraCaptureSession.CaptureCallback onCaptureSequenceCompleted : it) {
                onCaptureSequenceCompleted.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
            }
        }
        C0514a aVar = this.f1783b;
        if (aVar != null) {
            CaptureSession captureSession = (CaptureSession) ((C7070l) aVar).f21984c;
            synchronized (captureSession.f1727a) {
                if (captureSession.f1738l == CaptureSession.State.OPENED) {
                    captureSession.mo2294k(captureSession.f1733g);
                }
            }
        }
    }

    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        for (CameraCaptureSession.CaptureCallback onCaptureStarted : mo2311b(captureRequest)) {
            onCaptureStarted.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        }
    }
}
