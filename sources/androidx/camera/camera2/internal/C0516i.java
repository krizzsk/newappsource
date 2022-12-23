package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import androidx.camera.core.impl.utils.executor.SequentialExecutor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import p304x.C7029b1;

/* renamed from: androidx.camera.camera2.internal.i */
public final class C0516i {

    /* renamed from: a */
    public final Executor f1787a;

    /* renamed from: b */
    public final Object f1788b = new Object();

    /* renamed from: c */
    public final LinkedHashSet f1789c = new LinkedHashSet();

    /* renamed from: d */
    public final LinkedHashSet f1790d = new LinkedHashSet();

    /* renamed from: e */
    public final LinkedHashSet f1791e = new LinkedHashSet();

    /* renamed from: f */
    public final C0517a f1792f = new C0517a();

    /* renamed from: androidx.camera.camera2.internal.i$a */
    public class C0517a extends CameraDevice.StateCallback {
        public C0517a() {
        }

        /* renamed from: a */
        public final void mo2321a() {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            synchronized (C0516i.this.f1788b) {
                C0516i iVar = C0516i.this;
                synchronized (iVar.f1788b) {
                    arrayList = new ArrayList();
                    synchronized (iVar.f1788b) {
                        arrayList2 = new ArrayList(iVar.f1789c);
                    }
                    arrayList.addAll(arrayList2);
                    synchronized (iVar.f1788b) {
                        arrayList3 = new ArrayList(iVar.f1791e);
                    }
                    arrayList.addAll(arrayList3);
                }
                C0516i.this.f1791e.clear();
                C0516i.this.f1789c.clear();
                C0516i.this.f1790d.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C0520l) it.next()).finishClose();
            }
        }

        /* renamed from: b */
        public final void mo2322b() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (C0516i.this.f1788b) {
                linkedHashSet.addAll(C0516i.this.f1791e);
                linkedHashSet.addAll(C0516i.this.f1789c);
            }
            C0516i.this.f1787a.execute(new C7029b1(linkedHashSet, 0));
        }

        public final void onClosed(CameraDevice cameraDevice) {
            mo2321a();
        }

        public final void onDisconnected(CameraDevice cameraDevice) {
            mo2322b();
            mo2321a();
        }

        public final void onError(CameraDevice cameraDevice, int i) {
            mo2322b();
            mo2321a();
        }

        public final void onOpened(CameraDevice cameraDevice) {
        }
    }

    public C0516i(SequentialExecutor sequentialExecutor) {
        this.f1787a = sequentialExecutor;
    }

    /* renamed from: a */
    public final void mo2320a(C0520l lVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        C0520l lVar2;
        synchronized (this.f1788b) {
            arrayList = new ArrayList();
            synchronized (this.f1788b) {
                arrayList2 = new ArrayList(this.f1789c);
            }
            arrayList.addAll(arrayList2);
            synchronized (this.f1788b) {
                arrayList3 = new ArrayList(this.f1791e);
            }
            arrayList.addAll(arrayList3);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext() && (lVar2 = (C0520l) it.next()) != lVar) {
            lVar2.finishClose();
        }
    }
}
