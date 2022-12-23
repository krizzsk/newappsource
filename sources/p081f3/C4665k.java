package p081f3;

import android.os.Build;
import androidx.work.ListenableWorker;
import com.moovit.sdk.profilers.wifiscan.WifiScanWorker;
import java.util.concurrent.TimeUnit;
import p081f3.C4670o;
import p192o3.C5956p;

/* renamed from: f3.k */
public final class C4665k extends C4670o {
    public C4665k(C4666a aVar) {
        super(aVar.f15908b, aVar.f15909c, aVar.f15910d);
    }

    /* renamed from: f3.k$a */
    public static final class C4666a extends C4670o.C4671a<C4666a, C4665k> {
        public C4666a(long j, TimeUnit timeUnit) {
            super(WifiScanWorker.class);
            C5956p pVar = this.f15909c;
            long millis = timeUnit.toMillis(j);
            if (millis < 900000) {
                pVar.getClass();
                C4656h c = C4656h.m11960c();
                int i = C5956p.f19081s;
                String.format("Interval duration lesser than minimum allowed value; Changed to %s", new Object[]{900000L});
                c.mo20179f(new Throwable[0]);
                millis = 900000;
            }
            pVar.mo21937d(millis, millis);
        }

        /* renamed from: c */
        public final C4670o mo20180c() {
            if (this.f15907a && Build.VERSION.SDK_INT >= 23 && this.f15909c.f19091j.f15879c) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            } else if (!this.f15909c.f19098q) {
                return new C4665k(this);
            } else {
                throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
            }
        }

        /* renamed from: d */
        public final C4670o.C4671a mo20181d() {
            return this;
        }

        public C4666a(Class<? extends ListenableWorker> cls, long j, TimeUnit timeUnit, long j2, TimeUnit timeUnit2) {
            super(cls);
            this.f15909c.mo21937d(timeUnit.toMillis(j), timeUnit2.toMillis(j2));
        }
    }
}
