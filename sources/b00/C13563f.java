package b00;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;

/* renamed from: b00.f */
public abstract class C13563f<Params, Progress, Result> extends C13557b<Params, Progress, Result> {

    /* renamed from: d */
    public static final Handler f33510d = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public final long f33511b = 2000;

    /* renamed from: c */
    public final C13564a f33512c = new C13564a();

    /* renamed from: b00.f$a */
    public class C13564a implements Runnable {
        public C13564a() {
        }

        public final void run() {
            if (!C13563f.this.isCancelled()) {
                C13563f.this.cancel(true);
                if (!AsyncTask.Status.FINISHED.equals(C13563f.this.getStatus())) {
                    C13563f.this.getClass();
                }
            }
        }
    }

    public final void onCancelled() {
        f33510d.removeCallbacks(this.f33512c);
    }

    public final void onPreExecute() {
        super.onPreExecute();
        if (!isCancelled()) {
            long j = this.f33511b;
            if (j > -1) {
                f33510d.postDelayed(this.f33512c, j);
            }
        }
    }
}
