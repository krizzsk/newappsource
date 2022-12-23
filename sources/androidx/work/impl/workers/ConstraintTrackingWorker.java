package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.utils.futures.C1420a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p081f3.C4656h;
import p092g3.C4763k;
import p143k3.C5464c;
import p143k3.C5465d;
import p192o3.C5956p;
import p192o3.C5959r;
import p218q3.C6165a;
import p231r3.C6239a;
import p695od.C18728c;

public class ConstraintTrackingWorker extends ListenableWorker implements C5464c {

    /* renamed from: g */
    public static final /* synthetic */ int f5263g = 0;

    /* renamed from: b */
    public WorkerParameters f5264b;

    /* renamed from: c */
    public final Object f5265c = new Object();

    /* renamed from: d */
    public volatile boolean f5266d = false;

    /* renamed from: e */
    public C1420a<ListenableWorker.C1379a> f5267e = new C1420a<>();

    /* renamed from: f */
    public ListenableWorker f5268f;

    /* renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$a */
    public class C1421a implements Runnable {
        public C1421a() {
        }

        public final void run() {
            ConstraintTrackingWorker constraintTrackingWorker = ConstraintTrackingWorker.this;
            String b = constraintTrackingWorker.getInputData().mo5691b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
            if (TextUtils.isEmpty(b)) {
                C4656h c = C4656h.m11960c();
                int i = ConstraintTrackingWorker.f5263g;
                c.mo20177b(new Throwable[0]);
                constraintTrackingWorker.f5267e.mo5756h(new ListenableWorker.C1379a.C1380a());
                return;
            }
            ListenableWorker a = constraintTrackingWorker.getWorkerFactory().mo20195a(constraintTrackingWorker.getApplicationContext(), b, constraintTrackingWorker.f5264b);
            constraintTrackingWorker.f5268f = a;
            if (a == null) {
                C4656h c2 = C4656h.m11960c();
                int i2 = ConstraintTrackingWorker.f5263g;
                c2.mo20176a(new Throwable[0]);
                constraintTrackingWorker.f5267e.mo5756h(new ListenableWorker.C1379a.C1380a());
                return;
            }
            C5956p i3 = ((C5959r) C4763k.m12079g(constraintTrackingWorker.getApplicationContext()).f16072c.mo5701q()).mo21951i(constraintTrackingWorker.getId().toString());
            if (i3 == null) {
                constraintTrackingWorker.f5267e.mo5756h(new ListenableWorker.C1379a.C1380a());
                return;
            }
            C5465d dVar = new C5465d(constraintTrackingWorker.getApplicationContext(), constraintTrackingWorker.getTaskExecutor(), constraintTrackingWorker);
            dVar.mo21354b(Collections.singletonList(i3));
            if (dVar.mo21353a(constraintTrackingWorker.getId().toString())) {
                C4656h c3 = C4656h.m11960c();
                int i4 = ConstraintTrackingWorker.f5263g;
                String.format("Constraints met for delegate %s", new Object[]{b});
                c3.mo20176a(new Throwable[0]);
                try {
                    C18728c<ListenableWorker.C1379a> startWork = constraintTrackingWorker.f5268f.startWork();
                    startWork.addListener(new C6239a(constraintTrackingWorker, startWork), constraintTrackingWorker.getBackgroundExecutor());
                } catch (Throwable th) {
                    C4656h c4 = C4656h.m11960c();
                    int i5 = ConstraintTrackingWorker.f5263g;
                    String.format("Delegated worker %s threw exception in startWork.", new Object[]{b});
                    c4.mo20176a(th);
                    synchronized (constraintTrackingWorker.f5265c) {
                        if (constraintTrackingWorker.f5266d) {
                            C4656h.m11960c().mo20176a(new Throwable[0]);
                            constraintTrackingWorker.f5267e.mo5756h(new ListenableWorker.C1379a.C1381b());
                        } else {
                            constraintTrackingWorker.f5267e.mo5756h(new ListenableWorker.C1379a.C1380a());
                        }
                    }
                }
            } else {
                C4656h c5 = C4656h.m11960c();
                int i6 = ConstraintTrackingWorker.f5263g;
                String.format("Constraints not met for delegate %s. Requesting retry.", new Object[]{b});
                c5.mo20176a(new Throwable[0]);
                constraintTrackingWorker.f5267e.mo5756h(new ListenableWorker.C1379a.C1381b());
            }
        }
    }

    static {
        C4656h.m11961e("ConstraintTrkngWrkr");
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f5264b = workerParameters;
    }

    /* renamed from: c */
    public final void mo5714c(ArrayList arrayList) {
        C4656h c = C4656h.m11960c();
        String.format("Constraints changed for %s", new Object[]{arrayList});
        c.mo20176a(new Throwable[0]);
        synchronized (this.f5265c) {
            this.f5266d = true;
        }
    }

    /* renamed from: f */
    public final void mo5716f(List<String> list) {
    }

    public final C6165a getTaskExecutor() {
        return C4763k.m12079g(getApplicationContext()).f16073d;
    }

    public final boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f5268f;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    public final void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f5268f;
        if (listenableWorker != null && !listenableWorker.isStopped()) {
            this.f5268f.stop();
        }
    }

    public final C18728c<ListenableWorker.C1379a> startWork() {
        getBackgroundExecutor().execute(new C1421a());
        return this.f5267e;
    }
}
