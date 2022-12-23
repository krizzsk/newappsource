package p067e1;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window$OnFrameMetricsAvailableListener;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: e1.k */
public class C4497k {

    /* renamed from: a */
    public final C4500b f15576a;

    /* renamed from: e1.k$a */
    public static class C4498a extends C4500b {

        /* renamed from: e */
        public static HandlerThread f15577e;

        /* renamed from: f */
        public static Handler f15578f;

        /* renamed from: a */
        public int f15579a = 1;

        /* renamed from: b */
        public SparseIntArray[] f15580b = new SparseIntArray[9];

        /* renamed from: c */
        public final ArrayList<WeakReference<Activity>> f15581c = new ArrayList<>();

        /* renamed from: d */
        public C4499a f15582d = new C4499a();

        /* renamed from: e1.k$a$a */
        public class C4499a implements Window$OnFrameMetricsAvailableListener {
            public C4499a() {
            }

            public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                C4498a aVar = C4498a.this;
                if ((aVar.f15579a & 1) != 0) {
                    C4498a.m11724e(aVar.f15580b[0], frameMetrics.getMetric(8));
                }
                C4498a aVar2 = C4498a.this;
                if ((aVar2.f15579a & 2) != 0) {
                    C4498a.m11724e(aVar2.f15580b[1], frameMetrics.getMetric(1));
                }
                C4498a aVar3 = C4498a.this;
                if ((aVar3.f15579a & 4) != 0) {
                    C4498a.m11724e(aVar3.f15580b[2], frameMetrics.getMetric(3));
                }
                C4498a aVar4 = C4498a.this;
                if ((aVar4.f15579a & 8) != 0) {
                    C4498a.m11724e(aVar4.f15580b[3], frameMetrics.getMetric(4));
                }
                C4498a aVar5 = C4498a.this;
                if ((aVar5.f15579a & 16) != 0) {
                    C4498a.m11724e(aVar5.f15580b[4], frameMetrics.getMetric(5));
                }
                C4498a aVar6 = C4498a.this;
                if ((aVar6.f15579a & 64) != 0) {
                    C4498a.m11724e(aVar6.f15580b[6], frameMetrics.getMetric(7));
                }
                C4498a aVar7 = C4498a.this;
                if ((aVar7.f15579a & 32) != 0) {
                    C4498a.m11724e(aVar7.f15580b[5], frameMetrics.getMetric(6));
                }
                C4498a aVar8 = C4498a.this;
                if ((aVar8.f15579a & RecyclerView.C1119a0.FLAG_IGNORE) != 0) {
                    C4498a.m11724e(aVar8.f15580b[7], frameMetrics.getMetric(0));
                }
                C4498a aVar9 = C4498a.this;
                if ((aVar9.f15579a & 256) != 0) {
                    C4498a.m11724e(aVar9.f15580b[8], frameMetrics.getMetric(2));
                }
            }
        }

        /* renamed from: e */
        public static void m11724e(SparseIntArray sparseIntArray, long j) {
            if (sparseIntArray != null) {
                int i = (int) ((500000 + j) / 1000000);
                if (j >= 0) {
                    sparseIntArray.put(i, sparseIntArray.get(i) + 1);
                }
            }
        }

        /* renamed from: a */
        public final void mo20016a(Activity activity) {
            if (f15577e == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f15577e = handlerThread;
                handlerThread.start();
                f15578f = new Handler(f15577e.getLooper());
            }
            for (int i = 0; i <= 8; i++) {
                SparseIntArray[] sparseIntArrayArr = this.f15580b;
                if (sparseIntArrayArr[i] == null && (this.f15579a & (1 << i)) != 0) {
                    sparseIntArrayArr[i] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f15582d, f15578f);
            this.f15581c.add(new WeakReference(activity));
        }

        /* renamed from: b */
        public final SparseIntArray[] mo20017b() {
            return this.f15580b;
        }

        /* renamed from: c */
        public final SparseIntArray[] mo20018c(Activity activity) {
            Iterator<WeakReference<Activity>> it = this.f15581c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference next = it.next();
                if (next.get() == activity) {
                    this.f15581c.remove(next);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f15582d);
            return this.f15580b;
        }

        /* renamed from: d */
        public final SparseIntArray[] mo20019d() {
            SparseIntArray[] sparseIntArrayArr = this.f15580b;
            this.f15580b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }
    }

    /* renamed from: e1.k$b */
    public static class C4500b {
        /* renamed from: a */
        public void mo20016a(Activity activity) {
        }

        /* renamed from: b */
        public SparseIntArray[] mo20017b() {
            return null;
        }

        /* renamed from: c */
        public SparseIntArray[] mo20018c(Activity activity) {
            return null;
        }

        /* renamed from: d */
        public SparseIntArray[] mo20019d() {
            return null;
        }
    }

    public C4497k() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f15576a = new C4498a();
        } else {
            this.f15576a = new C4500b();
        }
    }
}
